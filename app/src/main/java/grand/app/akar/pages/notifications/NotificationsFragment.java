package grand.app.akar.pages.notifications;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import org.jetbrains.annotations.NotNull;

import grand.app.akar.R;
import grand.app.akar.base.BaseFragment;
import grand.app.akar.base.IApplicationComponent;
import grand.app.akar.base.MyApplication;
import grand.app.akar.databinding.FragmentNotificationsBinding;
import grand.app.akar.pages.notifications.viewModels.NotificationsViewModels;

public class NotificationsFragment extends BaseFragment {
    FragmentNotificationsBinding notificationsBinding;
    NotificationsViewModels notificationsViewModels;
    private Context context;

    public NotificationsFragment() {
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
        notificationsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, container, false);
        IApplicationComponent component = ((MyApplication) context.getApplicationContext()).getApplicationComponent();
        notificationsViewModels = new NotificationsViewModels();
        component.inject(this);
        notificationsBinding.setNotifyViewModel(notificationsViewModels);
        return notificationsBinding.getRoot();
    }

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
