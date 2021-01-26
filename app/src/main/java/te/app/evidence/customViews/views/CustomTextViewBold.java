package te.app.evidence.customViews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;

import androidx.appcompat.widget.AppCompatTextView;

import te.app.evidence.R;


/**
 * Created by mohamedatef on 1/8/19.
 */

public class CustomTextViewBold extends AppCompatTextView {
    public CustomTextViewBold(Context context, AttributeSet attrs, int defStyle) {
        super(new ContextThemeWrapper(context, R.style.boldEditText), attrs, defStyle);
        init(context);
    }

    public CustomTextViewBold(Context context, AttributeSet attrs) {
        super(new ContextThemeWrapper(context, R.style.boldEditText), attrs);
        init(context);

    }

    public CustomTextViewBold(Context context) {
        super(new ContextThemeWrapper(context, R.style.boldEditText));
        init(context);
    }

    private void init(Context context) {
        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                "fonts/font_bold.ttf");
        setTypeface(tf);
    }

}