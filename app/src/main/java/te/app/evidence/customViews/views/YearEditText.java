package te.app.evidence.customViews.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import com.whiteelephant.monthpicker.MonthPickerDialog;
import java.util.Calendar;
import te.app.evidence.R;
import te.app.evidence.utils.resources.ResourceManager;

public class YearEditText extends TextInputEditText {
    MonthPickerDialog.Builder builder;
    Calendar today = Calendar.getInstance();

    public YearEditText(Context context) {
        super(context);
        init();
    }

    public YearEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public YearEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setText(String.valueOf(today.get(Calendar.YEAR)));
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {

        builder = new MonthPickerDialog.Builder(getContext(), (selectedMonth, selectedYear) -> setText(String.valueOf(selectedYear)), today.get(Calendar.YEAR), today.get(Calendar.MONTH));
        builder.setActivatedYear(today.get(Calendar.YEAR))
                .setTitle(ResourceManager.getString(R.string.year))
                .setYearRange(1990, today.get(Calendar.YEAR))
                .showYearOnly()
                .setOnYearChangedListener(year -> setText(String.valueOf(year)))
                .build()
                .show();
    }

}
