package grand.app.akar.customViews.views;

import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;

import com.whiteelephant.monthpicker.MonthPickerDialog;

import java.util.Calendar;

import grand.app.akar.R;
import grand.app.akar.utils.resources.ResourceManager;

public class DateEditText extends CustomTextViewMedium {
    MonthPickerDialog.Builder builder;
    Calendar today = Calendar.getInstance();

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
        setText(String.valueOf(today.get(Calendar.YEAR)));
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {

        builder = new MonthPickerDialog.Builder(getContext(), (selectedMonth, selectedYear) -> setText(String.valueOf(selectedYear)), today.get(Calendar.YEAR), today.get(Calendar.MONTH));
        builder.setActivatedYear(today.get(Calendar.YEAR))
                .setTitle(ResourceManager.getString(R.string.choose_building_year))
                .setYearRange(1990, today.get(Calendar.YEAR))
                .showYearOnly()
                .setOnYearChangedListener(year -> setText(String.valueOf(year)))
                .build()
                .show();
    }
}