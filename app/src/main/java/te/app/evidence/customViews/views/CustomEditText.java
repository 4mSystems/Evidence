package te.app.evidence.customViews.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.inputmethod.EditorInfo;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import te.app.evidence.R;
import te.app.evidence.utils.resources.ResourceManager;
import te.app.evidence.utils.validation.Validate;


public class CustomEditText extends TextInputLayout {
    private static int phoneExpression;
    private TextInputEditText editText;
    private int inputType, gravity = 0;
    int validator = 0;
    String text = "";
    boolean isCome = false;
    boolean isFirst = false;
    public int validatorCount = 0;
    public boolean lastCaseWrong = false, lastCaseCorrect = false, focusable = true;

    public CustomEditText(Context context) {
        super(context);
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(R.styleable.CustomEditText);
        typedArray.recycle();
        inputType(context, attrs);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(R.styleable.CustomEditText);
        validator = typedArray.getInt(R.styleable.CustomEditText_isValidate, 0);
        typedArray.recycle();
        inputType(context, attrs);
    }

    private void init() {
        setWillNotDraw(false);
        editText = new TextInputEditText(new ContextThemeWrapper(getContext(), R.style.inputEditTextLayout));
        createEditBox(editText);
    }


    private void createEditBox(TextInputEditText editText) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        editText.setInputType(inputType);
        editText.setFocusable(focusable);
        if (gravity != 0)
            editText.setGravity(gravity);
        editText.setLayoutParams(layoutParams);
        addView(editText);
    }


    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isFirst() {
        return isFirst;
    }

    private void inputType(@NonNull Context context, @Nullable AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomEditText,
                0, 0);
        // Gets you the 'value' number - 0 or 666 in your example
        int n = a.getIndexCount();
        for (int i = 0; i < n; i++) {
            int attr = a.getIndex(i);
            //note that you are accessing standard attributes using your attrs identifier
            if (attr == R.styleable.CustomEditText_android_inputType) {
                inputType = a.getInt(attr, EditorInfo.TYPE_TEXT_VARIATION_NORMAL);
            }  else if (attr == R.styleable.CustomEditText_gravity) {
                gravity = a.getInt(R.styleable.CustomEditText_gravity, 0);
            }
        }
        a.recycle();
        init();
    }

    @BindingAdapter("app:text")
    public static void getText(CustomEditText view, String text) {
        view.getEditText().setText(text);
    }

    @InverseBindingAdapter(attribute = "text")
    public static String setText(CustomEditText customEditText) {
        return customEditText.getEditText().getText().toString();
    }

    @BindingAdapter(value = "textAttrChanged")
    public static void setTextListner(final CustomEditText view, final InverseBindingListener textAttrChanged) {
        if (textAttrChanged != null) {
            view.getEditText().addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    textAttrChanged.onChange();
                }
            });


        }
    }

}