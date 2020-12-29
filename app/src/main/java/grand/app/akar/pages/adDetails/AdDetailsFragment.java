package grand.app.akar.pages.adDetails;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.DialogEditOptionBinding;
import grand.app.akar.databinding.FragmentAdDetailsBinding;
import grand.app.akar.databinding.HomeSortBinding;
import grand.app.akar.databinding.ReportDialogBinding;
import grand.app.akar.databinding.ReportWarningDialogBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.adDetails.models.AdDetailsResponse;
import grand.app.akar.pages.adDetails.viewModels.AdDetailsViewModel;
import grand.app.akar.pages.ads.forms.AdsAttachmentsFragment;
import grand.app.akar.pages.home.models.HomeData;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.AppHelper;
import grand.app.akar.utils.helper.MovementHelper;
import grand.app.akar.utils.session.UserHelper;


public class AdDetailsFragment extends BaseFragment {

    private Context context;
    @Inject
    AdDetailsViewModel viewModel;
    FragmentAdDetailsBinding binding;
    Dialog reportDialog;
    BottomSheetDialog sheetDialog;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ad_details, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewModel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setHomeData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), HomeData.class));
            viewModel.adDetails();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.GET_AD_DETAILS)) {
                viewModel.setupSlider(binding.coverImage);
                viewModel.setAdDetailsData((((AdDetailsResponse) mutable.object).getData()));
            } else if (mutable.message.equals(Constants.REMOVE_ADD_FAVORITE)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            } else if (mutable.message.equals(Constants.CALL)) {
                MovementHelper.openDialNumber(viewModel.getAdDetailsData().getListing().getUser().getPhone(), context);
            } else if (mutable.message.equals(Constants.SHARE_BAR)) {
                AppHelper.shareCustom((Activity) context, viewModel.title, viewModel.title);
            } else if (mutable.message.equals(Constants.REPORT)) {
                showReportWarning();
            } else if (mutable.message.equals(Constants.SEND_REPORT)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                reportDialog.dismiss();
            } else if (mutable.message.equals(Constants.UPDATE_AD_DATE)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                Constants.DATA_CHANGED = true;
            } else if (mutable.message.equals(Constants.REMOVE_AD)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                if (sheetDialog != null)
                    sheetDialog.dismiss();
                Constants.DATA_CHANGED = true;
                viewModel.goBack(context);
            } else if (mutable.message.equals(Constants.EDIT_DIALOG)) {
                DialogEditOptionBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.dialog_edit_option, null, false);
                sheetDialog = new BottomSheetDialog(context, R.style.CustomBottomSheetDialogTheme);
                sheetDialog.setContentView(sortBinding.getRoot());
                sortBinding.setViewModel(viewModel);
                sheetDialog.show();
            } else if (mutable.message.equals(Constants.DISMISS)) {
                sheetDialog.dismiss();
            } else if (mutable.message.equals(Constants.AD_UPLOAD_ATTACH)) {
                sheetDialog.dismiss();
                MovementHelper.startActivityForResultWithBundle(context, new PassingObject(viewModel.getHomeData().getId(),viewModel.getAdDetailsData().getListing().getSlider()), getString(R.string.attachment_images), AdsAttachmentsFragment.class.getName(), null);
            }
        });
    }

    private void showReportWarning() {
        Dialog warningDialog = new Dialog(context, R.style.PauseDialog);
        warningDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(warningDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        warningDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ReportWarningDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(warningDialog.getContext()), R.layout.report_warning_dialog, null, false);
        warningDialog.setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        binding.optionDone.setOnClickListener(v -> {
            showReportDialog();
            warningDialog.dismiss();
        });
        binding.optionCancel.setOnClickListener(v -> warningDialog.dismiss());
        warningDialog.show();
    }

    private void showReportDialog() {
        reportDialog = new Dialog(context, R.style.PauseDialog);
        reportDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(reportDialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        reportDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ReportDialogBinding binding = DataBindingUtil.inflate(LayoutInflater.from(reportDialog.getContext()), R.layout.report_dialog, null, false);
        reportDialog.setContentView(binding.getRoot());
        binding.setViewModel(viewModel);
        viewModel.getReportDialogReasonsAdapter().update(UserHelper.getInstance(context).getSettingsData().getReasonsItemList());
        reportDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getAdsRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }


}
