package grand.app.akar.pages.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

import com.github.guilhe.views.SeekBarRangedView;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;

import javax.inject.Inject;

import grand.app.akar.PassingObject;
import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentFilterBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.model.base.StatusMessage;
import grand.app.akar.pages.home.models.SearchRequest;
import grand.app.akar.pages.home.viewModels.FilterViewModel;
import grand.app.akar.utils.Constants;
import grand.app.akar.utils.helper.MovementHelper;

public class FilterFragment extends BaseFragment {
    private Context context;
    @Inject
    FilterViewModel viewModel;
    FragmentFilterBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_filter, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        setUpProgressBar();
        setEvent();
        return binding.getRoot();
    }

    private void setUpProgressBar() {
//        price bar
        binding.minPrice.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.coin)));
        binding.maxPrice.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.coin)));
        binding.rangeBar.setMinValue(100000);
        binding.rangeBar.setMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        binding.rangeBar.setOnSeekBarRangedChangeListener(new SeekBarRangedView.OnSeekBarRangedChangeListener() {
            @Override
            public void onChanged(SeekBarRangedView view, float minValue, float maxValue) {

            }

            @Override
            public void onChanging(SeekBarRangedView view, float minValue, float maxValue) {
                binding.minPrice.setText(String.format(Locale.getDefault(), "%.1f", maxValue).concat(" ").concat(getString(R.string.coin)));
                binding.maxPrice.setText(String.format(Locale.getDefault(), "%.1f", minValue).concat(" ").concat(getString(R.string.coin)));
                viewModel.getSearchRequest().setMin_price(String.valueOf(minValue));
                viewModel.getSearchRequest().setMax_price(String.valueOf(maxValue));
            }
        });
        //        Land area bar
        binding.minLandArea.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxLandArea.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarLandArea.setMinValue(100000);
        binding.rangeBarLandArea.setMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        binding.rangeBarLandArea.setOnSeekBarRangedChangeListener(new SeekBarRangedView.OnSeekBarRangedChangeListener() {
            @Override
            public void onChanged(SeekBarRangedView view, float minValue, float maxValue) {

            }

            @Override
            public void onChanging(SeekBarRangedView view, float minValue, float maxValue) {
                binding.minLandArea.setText(String.format(Locale.getDefault(), "%.1f", maxValue).concat(" ").concat(getString(R.string.meter)));
                binding.maxLandArea.setText(String.format(Locale.getDefault(), "%.1f", minValue).concat(" ").concat(getString(R.string.meter)));
                viewModel.getSearchRequest().setMin_price(String.valueOf(minValue));
                viewModel.getSearchRequest().setMax_price(String.valueOf(maxValue));
            }
        });
        //        Total area bar
        binding.minTotalArea.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxTotalArea.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarTotalArea.setMinValue(100000);
        binding.rangeBarTotalArea.setMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        binding.rangeBarTotalArea.setOnSeekBarRangedChangeListener(new SeekBarRangedView.OnSeekBarRangedChangeListener() {
            @Override
            public void onChanged(SeekBarRangedView view, float minValue, float maxValue) {

            }

            @Override
            public void onChanging(SeekBarRangedView view, float minValue, float maxValue) {
                binding.minTotalArea.setText(String.format(Locale.getDefault(), "%.1f", maxValue).concat(" ").concat(getString(R.string.meter)));
                binding.maxTotalArea.setText(String.format(Locale.getDefault(), "%.1f", minValue).concat(" ").concat(getString(R.string.meter)));
                viewModel.getSearchRequest().setMin_price(String.valueOf(minValue));
                viewModel.getSearchRequest().setMax_price(String.valueOf(maxValue));
            }
        });

        //        Land floor area
        binding.minFloorArea.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxFloorArea.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarFloorArea.setMinValue(100000);
        binding.rangeBarFloorArea.setMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        binding.rangeBarFloorArea.setOnSeekBarRangedChangeListener(new SeekBarRangedView.OnSeekBarRangedChangeListener() {
            @Override
            public void onChanged(SeekBarRangedView view, float minValue, float maxValue) {

            }

            @Override
            public void onChanging(SeekBarRangedView view, float minValue, float maxValue) {
                binding.minFloorArea.setText(String.format(Locale.getDefault(), "%.1f", maxValue).concat(" ").concat(getString(R.string.meter)));
                binding.maxFloorArea.setText(String.format(Locale.getDefault(), "%.1f", minValue).concat(" ").concat(getString(R.string.meter)));
                viewModel.getSearchRequest().setMin_price(String.valueOf(minValue));
                viewModel.getSearchRequest().setMax_price(String.valueOf(maxValue));
            }
        });

        //        Land floor area
        binding.minStreetWidth.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxStreetWidth.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarStreetWidth.setMinValue(100000);
        binding.rangeBarStreetWidth.setMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        binding.rangeBarStreetWidth.setOnSeekBarRangedChangeListener(new SeekBarRangedView.OnSeekBarRangedChangeListener() {
            @Override
            public void onChanged(SeekBarRangedView view, float minValue, float maxValue) {

            }

            @Override
            public void onChanging(SeekBarRangedView view, float minValue, float maxValue) {
                binding.minStreetWidth.setText(String.format(Locale.getDefault(), "%.1f", maxValue).concat(" ").concat(getString(R.string.meter)));
                binding.maxStreetWidth.setText(String.format(Locale.getDefault(), "%.1f", minValue).concat(" ").concat(getString(R.string.meter)));
                viewModel.getSearchRequest().setMin_price(String.valueOf(minValue));
                viewModel.getSearchRequest().setMax_price(String.valueOf(maxValue));
            }
        });

        //        Land floor area
        binding.minFactorySize.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxFactorySize.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarFactorySize.setMinValue(100000);
        binding.rangeBarFactorySize.setMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        binding.rangeBarFactorySize.setOnSeekBarRangedChangeListener(new SeekBarRangedView.OnSeekBarRangedChangeListener() {
            @Override
            public void onChanged(SeekBarRangedView view, float minValue, float maxValue) {

            }

            @Override
            public void onChanging(SeekBarRangedView view, float minValue, float maxValue) {
                binding.minFactorySize.setText(String.format(Locale.getDefault(), "%.1f", maxValue).concat(" ").concat(getString(R.string.meter)));
                binding.maxFactorySize.setText(String.format(Locale.getDefault(), "%.1f", minValue).concat(" ").concat(getString(R.string.meter)));
                viewModel.getSearchRequest().setMin_price(String.valueOf(minValue));
                viewModel.getSearchRequest().setMax_price(String.valueOf(maxValue));
            }
        });

    }

    private void setEvent() {
        viewModel.liveData.observe((LifecycleOwner) context, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (mutable.message) {
                case Constants.EMPTY_WARNING:
                    showError(getString(R.string.empty_warning));
                    break;
                case Constants.RESET:
                    viewModel.setSearchRequest(new SearchRequest());
                    viewModel.setDealingType(0);
                    viewModel.setDocType(0);
                    viewModel.setPaymentMethod(0);
                    viewModel.setPool(0);
                    viewModel.setLift(0);
                    viewModel.setGarage(0);
                    viewModel.setFurniture(0);
                    resetProgress();
                    break;
                case Constants.UPDATE_AD_DATA:
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    MovementHelper.finishWithResult(new PassingObject(), context);
                    break;
            }
        });

    }

    private void resetProgress() {
        //        price bar
        binding.minPrice.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.coin)));
        binding.maxPrice.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.coin)));
        binding.rangeBar.setSelectedMinValue(100000);
        binding.rangeBar.setSelectedMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        //        Land area bar
        binding.minLandArea.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxLandArea.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarLandArea.setSelectedMinValue(100000);
        binding.rangeBarLandArea.setSelectedMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        //        Total area bar
        binding.minTotalArea.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxTotalArea.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarTotalArea.setSelectedMinValue(100000);
        binding.rangeBarTotalArea.setSelectedMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));

        //        Land floor area
        binding.minFloorArea.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxFloorArea.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarFloorArea.setSelectedMinValue(100000);
        binding.rangeBarFloorArea.setSelectedMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));

        //        Land floor area
        binding.minStreetWidth.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxStreetWidth.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarStreetWidth.setSelectedMinValue(100000);
        binding.rangeBarStreetWidth.setSelectedMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));

        //        Land floor area
        binding.minFactorySize.setText(String.format(Locale.getDefault(), "%.1f", 100.0).concat(" ").concat(getString(R.string.meter)));
        binding.maxFactorySize.setText(String.format(Locale.getDefault(), "%.1f", 100000.0).concat(" ").concat(getString(R.string.meter)));
        binding.rangeBarFactorySize.setSelectedMinValue(100000);
        binding.rangeBarFactorySize.setSelectedMaxValue(100);
        viewModel.getSearchRequest().setMin_price(String.valueOf(100.00));
        viewModel.getSearchRequest().setMax_price(String.valueOf(100000.00));
        viewModel.notifyChange();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
