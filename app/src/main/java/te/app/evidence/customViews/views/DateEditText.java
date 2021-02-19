package te.app.evidence.customViews.views;

import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class DateEditText extends TextInputEditText {
    DatePickerDialog datePickerDialog;

    public DateEditText(Context context) {
        super(context);
        init();
    }

    public DateEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DateEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {
        if (datePickerDialog == null) {
            Calendar mcurrentTime = Calendar.getInstance();
            mcurrentTime.add(Calendar.YEAR, 0);

            int year = mcurrentTime.get(Calendar.YEAR);
            int month = mcurrentTime.get(Calendar.MONTH) + 1;
            datePickerDialog
                    = new DatePickerDialog(getContext(), (datePicker, i, i1, i2) -> {
                String selectedDate = String.format("%02d", i) + "-" + String.format("%02d", (++i1)) + "-" + i2;

                setText(selectedDate);
            }, year, month, 0);
            datePickerDialog.getDatePicker().setMinDate(mcurrentTime.getTimeInMillis());
        }
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(8, 0, 8, 0);
//        Button button = datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE);
//        button.setBackgroundResource(ResourceManager.getColor(R.color.colorPrimaryDark));
//        button.setTextColor(ResourceManager.getColor(R.color.white));
//        button.setLayoutParams(params);
        datePickerDialog.show();

    }

    public DatePickerDialog getDatePickerDialog() {
        return datePickerDialog;
    }
}
