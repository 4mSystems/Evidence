package te.app.evidence.base;

import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import te.app.evidence.R;
import te.app.evidence.utils.URLS;
import te.app.evidence.utils.helper.AppHelper;

public class ApplicationBinding {


    @BindingAdapter("color")
    public static void color(ImageView imageView, String color) {
        if (color != null && !color.equals("") && color.charAt(0) == '#') {
            imageView.setBackgroundColor(Color.parseColor(color));
        }
    }

    @BindingAdapter("imageMarketUrl")
    public static void loadMarketImage(ImageView imageView, Object image) {
        if (image instanceof String) {
            Picasso.get().load(URLS.USER_PROFILE_BASE_URL.concat((String) image)).placeholder(R.drawable.splash).into(imageView);
        }
    }

    @BindingAdapter({"app:adapter", "app:span", "app:orientation"})
    public static void getItemsV2Binding(RecyclerView recyclerView, RecyclerView.Adapter<?> itemsAdapter, String spanCount, String orientation) {
        if (orientation.equals("1"))
            AppHelper.initVerticalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        else if (orientation.equals("3"))
            AppHelper.initVerticalRVST(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        else
            AppHelper.initHorizontalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        recyclerView.setAdapter(itemsAdapter);
    }


}
