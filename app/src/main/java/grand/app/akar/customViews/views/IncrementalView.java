package grand.app.akar.customViews.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import grand.app.akar.R;

public class IncrementalView extends ConstraintLayout {
    private View view;
    private TextView incrementalViewText;
    private ImageView increment, decrement;
    private static final String TAG = "IncrementalView";

    public IncrementalView(@NonNull Context context) {
        super(context);
        initView();
    }

    public IncrementalView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public IncrementalView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        view = inflate(getContext(), R.layout.incremental_view, this);
        incrementalViewText = findViewById(R.id.incrementalViewText);
        increment = findViewById(R.id.increment);
        decrement = findViewById(R.id.decrement);
        Log.e(TAG, "initView: " + incrementalViewText.getText());
        increment.setOnClickListener(v -> incrementalViewText.setText(String.valueOf(Integer.parseInt(incrementalViewText.getText().toString()) + 1)));
        decrement.setOnClickListener(v -> {
            if (incrementalViewText.getText().toString().equals("1")) {
            } else
                incrementalViewText.setText(String.valueOf(Integer.parseInt(incrementalViewText.getText().toString()) - 1));
        });
        Log.e(TAG, "initView: " + incrementalViewText.getText());

    }
}
