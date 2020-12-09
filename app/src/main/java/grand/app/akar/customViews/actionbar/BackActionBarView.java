package grand.app.akar.customViews.actionbar;

/**
 * Created by mohamedatef on 12/30/18.
 */


import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;

import grand.app.akar.R;
import grand.app.akar.databinding.LayoutActionBarBackBinding;


public class BackActionBarView extends RelativeLayout {
    public LayoutActionBarBackBinding layoutActionBarBackBinding;
    public int service_id = 0;
    public int type = 0;
    public int flag = 0;

    public BackActionBarView(Context context) {
        super(context);
        init();
    }

    public BackActionBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public BackActionBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarBackBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_back, this, true);
        setEvents();
    }

    private void setEvents() {
        layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) getContext()).finish();
            }
        });

    }

    public void setTitle(String title) {
        layoutActionBarBackBinding.tvActionBarTitle.setText(title);
    }

    public void setTitleLocation(String title) {
        layoutActionBarBackBinding.tvActionBarLocation.setText(title);
        layoutActionBarBackBinding.tvActionBarLocation.setVisibility(VISIBLE);
    }

}
