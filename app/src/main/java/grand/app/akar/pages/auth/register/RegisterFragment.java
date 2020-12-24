package grand.app.akar.pages.auth.register;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.connection.FileObject;
import grand.app.akar.databinding.FragmentRegisterBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.auth.confirmCode.ConfirmCodeFragment;
import grand.app.akar.pages.auth.models.cities.CitiesResponse;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.PopUp.PopUp;
import grand.app.akar.utils.PopUp.PopUpMenuHelper;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.upload.FileOperations;

public class RegisterFragment extends BaseFragment {
    private Context context;
    private FragmentRegisterBinding binding;
    @Inject
    RegisterViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getCities();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
                    break;
                case Constants.REGISTER:
                    toastMessage(((Mutable) o).message);
                    viewModel.goBack(context);
                    MovementHelper.startActivityWithBundle(context, new PassingObject(Constants.CHECK_CONFIRM_NAV_REGISTER, viewModel.getRequest().getPhone()), null, ConfirmCodeFragment.class.getName(), null);
                    break;
                case Constants.CITIES:
                    viewModel.setCitiesList(((CitiesResponse) ((Mutable) o).object).getCitiesList());
                    break;
                case Constants.USER_TYPES:
                    showUserTypes();
                    break;
                case Constants.SHOW_CITIES:
                    showCities();
                    break;
                case Constants.EMPTY_WARNING:
                    showError(getResources().getString(R.string.empty_warning));
                    break;
                case Constants.NOT_MATCH_PASSWORD:
                    showError(getResources().getString(R.string.password_not_match));
                    break;
            }
        });
    }

    private void showCities() {
        PopUpMenuHelper.showCitiesPopUp(context, binding.inputRegisterCity, viewModel.getCitiesList()).setOnMenuItemClickListener(item -> {
            binding.inputRegisterCity.setText(viewModel.getCitiesList().get(item.getItemId()).getName());
            viewModel.getRequest().setCity_id(String.valueOf(viewModel.getCitiesList().get(item.getItemId()).getId()));
            return false;
        });
    }

    private void showUserTypes() {
        List<PopUp> userTypeList = new ArrayList<>();
        userTypeList.add(new PopUp(getResources().getString(R.string.seeker), 0));
        userTypeList.add(new PopUp(getResources().getString(R.string.owner), 1));
        userTypeList.add(new PopUp(getResources().getString(R.string.realtor), 2));
        PopUpMenuHelper.showPopUp(context, binding.inputRegisterUserType, userTypeList).setOnMenuItemClickListener(item -> {
            binding.inputRegisterUserType.setText(userTypeList.get(item.getItemId()).getName());
            viewModel.getRequest().setType(String.valueOf(userTypeList.get(item.getItemId()).getId()));
            return false;
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        FileObject fileObject = null;
        if (requestCode == Constants.FILE_TYPE_IMAGE) {
            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
            binding.imgRegisterLogo.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
        }
        viewModel.getFileObject().add(fileObject);
        super.onActivityResult(requestCode, resultCode, data);
    }

}
