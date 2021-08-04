package te.app.evidence.customViews.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import com.whiteelephant.monthpicker.MonthPickerDialog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import te.app.evidence.R;
import te.app.evidence.utils.resources.ResourceManager;

public class MonthlyEditText extends TextInputEditText {
    MonthPickerDialog.Builder builder;
    Calendar today = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("MM", Locale.ENGLISH);

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
        today.set(Calendar.MONTH, Integer.parseInt(sdf.format(new Date())));
        setText(sdf.format(today.getTime()));
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {
        builder = new MonthPickerDialog.Builder(getContext(), (selectedMonth, selectedYear) -> {
        }, today.get(Calendar.YEAR), today.get(Calendar.MONTH));
        builder.setActivatedMonth(today.get(Calendar.MONTH))
                .setTitle(ResourceManager.getString(R.string.month))
                .showMonthOnly()
                .setOnMonthChangedListener(month -> {
                    today.set(Calendar.MONTH, month);
                    setText(sdf.format(today.getTime()));
                })
                .build()
                .show();
    }

}
