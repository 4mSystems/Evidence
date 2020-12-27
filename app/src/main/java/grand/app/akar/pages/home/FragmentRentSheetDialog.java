package grand.app.akar.pages.home;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.Gson;

import javax.inject.Inject;

import grand.app.akar.R;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentAdRentDialogBinding;
import grand.app.akar.model.base.Mutable;
import grand.app.akar.pages.home.viewModels.SearchViewModel;

public class FragmentRentSheetDialog extends BottomSheetDialogFragment {
    FragmentAdRentDialogBinding rentDialogBinding;
    @Inject
    SearchViewModel searchViewModel;
    private Context context;
    private ItemClickListener mListener;

    public FragmentRentSheetDialog() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rentDialogBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_ad_rent_dialog, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        component.inject(this);
        rentDialogBinding.setViewmodel(searchViewModel);

        setEvent();
        return rentDialogBinding.getRoot();

    }

    private void setEvent() {
        searchViewModel.liveData.observe(((LifecycleOwner) context), o -> {
            switch (o.message) {

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        searchViewModel.getHomeRepository().setLiveData(searchViewModel.liveData);
    }

    public void setListner(ItemClickListener mListener) {
        this.mListener = mListener;
    }

    public interface ItemClickListener {
        void onItemClick(int quantity);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;

    }

}
