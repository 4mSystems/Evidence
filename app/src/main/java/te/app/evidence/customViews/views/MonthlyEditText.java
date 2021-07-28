package te.app.evidence.customViews.views;

import android.content.Context;
import android.util.AttributeSet;

import com.google.android.material.textfield.TextInputEditText;
import com.whiteelephant.monthpicker.MonthPickerDialog;

import java.util.Calendar;

import te.app.evidence.R;
import te.app.evidence.utils.resources.ResourceManager;

public class MonthlyEditText extends TextInputEditText {
    MonthPickerDialog.Builder builder;
    Calendar today = Calendar.getInstance();

    public MonthlyEditText(Context context) {
        super(context);
        init();
    }

    public MonthlyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MonthlyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setText(String.valueOf(today.get(Calendar.MONTH) + 1));
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {
        builder = new MonthPickerDialog.Builder(getContext(), (selectedMonth, selectedYear) -> setText(String.valueOf(selectedMonth + 1)), today.get(Calendar.YEAR), today.get(Calendar.MONTH));
        builder.setActivatedMonth(today.get(Calendar.MONTH))
                .setTitle(ResourceManager.getString(R.string.month))
                .showMonthOnly()
                .setOnMonthChangedListener(month -> setText(String.valueOf(month + 1)))
                .build()
                .show();
    }

}
