package te.app.evidence.customViews.actionbar;


import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;

import te.app.evidence.R;
import te.app.evidence.databinding.LayoutActionBarBackBinding;


public class MenuActionBarView extends RelativeLayout {
    LayoutActionBarBackBinding layoutActionBarBackBinding;

    public MenuActionBarView(Context context) {
        super(context);
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarBackBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_back, this, true);
    }

}
