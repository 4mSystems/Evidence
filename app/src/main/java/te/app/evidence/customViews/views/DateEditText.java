package te.app.evidence.customViews.views;

import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import te.app.evidence.R;
import te.app.evidence.utils.resources.ResourceManager;

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
            int month = mcurrentTime.get(Calendar.MONTH);
            int day = mcurrentTime.get(Calendar.DAY_OF_MONTH);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", new Locale("en"));
            datePickerDialog
                    = new DatePickerDialog(getContext(), (datePicker, i, i1, i2) -> {
                Calendar calendar = Calendar.getInstance();
                calendar.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
                String strDate = format.format(calendar.getTime());
                setText(strDate);
            }, year, month, day);
        }
        datePickerDialog.show();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(8, 0, 8, 0);
        Button button = datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE);
        button.setBackgroundColor(ResourceManager.getColor(R.color.colorPrimaryDark));
        button.setTextColor(ResourceManager.getColor(R.color.white));
        button.setLayoutParams(params);

    }

}
