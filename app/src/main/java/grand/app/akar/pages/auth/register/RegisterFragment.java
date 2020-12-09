package grand.app.akar.pages.auth.register;

import android.content.Context;
import android.content.Intent;
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
import grand.app.akar.pages.auth.models.carNational.CarTypesItem;
import grand.app.akar.pages.auth.models.carNational.CarsNationalResponse;
import grand.app.akar.pages.auth.models.carNational.NationalTypesItem;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;

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
              case Constants.CARS_NATIONALS:
                    viewModel.setCarsNationals(((CarsNationalResponse) ((Mutable) o).object).getData());
                    break;

            }
        });
//        binding.inputRegisterIdentityType.getEditText().setOnClickListener(v -> {
//            if (viewModel.getCarsNationals().getNationalTypes() != null && viewModel.getCarsNationals().getNationalTypes().size() > 0) {
//                showNationalsTypes(viewModel.getCarsNationals().getNationalTypes());
//            }
//        });
//        binding.inputRegisterCarType.getEditText().setOnClickListener(v -> {
//            if (viewModel.getCarsNationals().getCarTypes() != null && viewModel.getCarsNationals().getCarTypes().size() > 0) {
//                showCarTypes(viewModel.getCarsNationals().getCarTypes());
//            }
//        });
//        binding.inputRegisterCarFrontImage.getEditText().setOnClickListener(v -> pickImageDialogSelect(Constants.front_car_image_code));
//        binding.inputRegisterCarBackImage.getEditText().setOnClickListener(v -> pickImageDialogSelect(Constants.back_car_code));
//        binding.inputRegisterInsuranceImage.getEditText().setOnClickListener(v -> pickImageDialogSelect(Constants.insurance_image_code));
//        binding.inputRegisterLicenseImage.getEditText().setOnClickListener(v -> pickImageDialogSelect(Constants.license_image_code));
//        binding.inputRegisterLicenseCivilImage.getEditText().setOnClickListener(v -> pickImageDialogSelect(Constants.civil_image_code));
    }

    private void showNationalsTypes(List<NationalTypesItem> nationalTypesItems) {
//        PopUpMenuHelper.showNationalsPopUp(context, binding.inputRegisterIdentityType.getEditText(), nationalTypesItems).setOnMenuItemClickListener(item -> {
////            binding.inputRegisterIdentityType.getEditText().setText(nationalTypesItems.get(item.getItemId()).getName());
//            viewModel.getRequest().setNational_id_type(String.valueOf(nationalTypesItems.get(item.getItemId()).getId()));
//            return false;
//        });
    }

    private void showCarTypes(List<CarTypesItem> carTypesItems) {
//        PopUpMenuHelper.showCarTypePopUp(context, binding.inputRegisterCarType.getEditText(), carTypesItems).setOnMenuItemClickListener(item -> {
//            binding.inputRegisterCarType.getEditText().setText(carTypesItems.get(item.getItemId()).getName());
//            viewModel.getRequest().setCar_level(carTypesItems.get(item.getItemId()).getId());
//            return false;
//        });
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
//        if (requestCode == Constants.FILE_TYPE_IMAGE) {
//            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
//            binding.imgRegister.setImageURI(Uri.fromFile(new File(fileObject.getFilePath())));
//        } else if (requestCode == Constants.front_car_image_code) {
//            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.front_car_image, Constants.FILE_TYPE_IMAGE);
//            binding.inputRegisterCarFrontImage.getEditText().setText(getResources().getString(R.string.front_car_add));
//        } else if (requestCode == Constants.back_car_code) {
//            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.back_car_image, Constants.FILE_TYPE_IMAGE);
//            binding.inputRegisterCarBackImage.getEditText().setText(getResources().getString(R.string.back_car_add));
//        } else if (requestCode == Constants.insurance_image_code) {
//            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.insurance_image, Constants.FILE_TYPE_IMAGE);
//            binding.inputRegisterInsuranceImage.getEditText().setText(getResources().getString(R.string.insurance_car_add));
//        } else if (requestCode == Constants.license_image_code) {
//            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.license_image, Constants.FILE_TYPE_IMAGE);
//            binding.inputRegisterLicenseImage.getEditText().setText(getResources().getString(R.string.license_car_add));
//        } else if (requestCode == Constants.civil_image_code) {
//            fileObject = FileOperations.getFileObject(getActivity(), data, Constants.civil_image, Constants.FILE_TYPE_IMAGE);
//            binding.inputRegisterLicenseCivilImage.getEditText().setText(getResources().getString(R.string.civil_car_add));
//        }
        viewModel.getFileObject().add(fileObject);
        super.onActivityResult(requestCode, resultCode, data);
    }

}
