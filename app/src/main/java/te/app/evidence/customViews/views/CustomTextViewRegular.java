package te.app.evidence.customViews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;



public class CustomTextViewRegular extends AppCompatTextView {


    public CustomTextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public CustomTextViewRegular(Context context) {
        super(context);

        init();

    }

    private void init() {

        if (!isInEditMode()) {
            Typeface font;
            font = Typeface.createFromAsset(getContext().getAssets(), "fonts/font_regular.otf");
            setTypeface(font);
            setLineSpacing(1.4f, 1.3f);
        }

    }

}