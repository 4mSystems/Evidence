package grand.app.akar.customViews.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;

import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

import com.google.android.material.textfield.TextInputEditText;

import grand.app.akar.R;
import grand.app.akar.utils.resources.ResourceManager;
import grand.app.akar.utils.validation.Validate;


public class CustomEditTextT extends TextInputEditText {
    int validator = 0;
    boolean isCome = false;
    boolean isFirst = false;

    public CustomEditTextT(Context context) {
        super(context);
        init();
    }

    public CustomEditTextT(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(R.styleable.CustomEditText);

        validator = typedArray.getInt(R.styleable.CustomEditText_isValidate, 0);


        typedArray.recycle();

        init();
    }

    public CustomEditTextT(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = context.obtainStyledAttributes(R.styleable.CustomEditText);

        validator = typedArray.getInt(R.styleable.CustomEditText_isValidate, 0);


        typedArray.recycle();


        init();
    }


    private void init() {


    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public int validatorCount = 0;
    public boolean lastCaseWrong = false, lastCaseCorrect = false;


    @BindingAdapter(value = "isValidateAttrChanged")
    public static void setListener(final CustomEditText view, final InverseBindingListener textAttrChanged) {
        if (textAttrChanged != null) {

            view.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    Log.e("validator", view.getInputType() + "");

                    if (Validate.isEmpty(view.getText().toString())) {
                        view.validatorCount = 0;
                        view.setError("Empty");
                    } else if (view.getInputType() == InputType.TYPE_CLASS_PHONE && !Validate.isPhone(view.getText().toString())) {
                        view.validatorCount = 0;
                        view.setError("Wrong phone");
                    } else if ((view.getInputType() == 33 || view.getInputType() == InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS) && !Validate.isMail(view.getText().toString())) {
                        view.validatorCount = 0;
                        view.setError("Wrong email");
                    } else if ((view.getInputType() == 129 || view.getInputType() == InputType.TYPE_TEXT_VARIATION_PASSWORD || view.getInputType() == InputType.TYPE_NUMBER_VARIATION_PASSWORD ||
                            view.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                            || view.getInputType() == InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD)
                            && !Validate.isAvLen(view.getText().toString(), 6, 25)) {
                        view.validatorCount = 0;
                        view.setError("wrong password");
                    } else {
                        view.validatorCount = 1;
                        view.setFirst(true);
                        view.setError(null);
                    }
                    if (view.validatorCount == 0 && !view.lastCaseWrong && view.lastCaseCorrect) {
                        view.setValidator(view.getValidator() - 1);
                        view.lastCaseWrong = true;
                        view.lastCaseCorrect = false;
                        Log.e("validator", "Wrong " + view.validatorCount + "");

                    } else if (view.validatorCount == 1 && !view.lastCaseCorrect) {
                        Log.e("validator", "Correct " + view.validatorCount + "");
                        view.setValidator(view.getValidator() + 1);
                        view.lastCaseWrong = false;
                        view.lastCaseCorrect = true;
                    }


                    textAttrChanged.onChange();
                }
            });
        }
    }


    @BindingAdapter("app:isValidate")
    public static void setError(CustomEditText view, int value) {
        if (view.isCome && Validate.isEmpty(view.getText().toString())) {
            view.setError("WRONG");
        }
        view.isCome = true;
        Log.e("ERRORAS", "OK");
        view.setValidator(value);
    }

    @InverseBindingAdapter(attribute = "isValidate")
    public static int getError(CustomEditText errorInputLayout) {
        Log.e("ERRORAS", "OK");
        return errorInputLayout.validator;
    }

    public void setValidator(int validator) {
        this.validator = validator;
    }

    public int getValidator() {
        return validator;
    }
}