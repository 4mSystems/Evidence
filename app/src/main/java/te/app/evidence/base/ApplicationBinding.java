package te.app.evidence.base;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;
import te.app.evidence.R;
import te.app.evidence.utils.helper.AppHelper;
import te.app.evidence.utils.images.PhotoFullPopupWindow;

public class ApplicationBinding {


    @BindingAdapter("color")
    public static void color(ImageView imageView, String color) {
        if (color != null && !color.equals("") && color.charAt(0) == '#') {
            imageView.setBackgroundColor(Color.parseColor(color));
        }
    }

    @BindingAdapter("imageMarketUrl")
    public static void loadMarketImage(ImageView imageView, Object image) {
        if (image instanceof String && !TextUtils.isEmpty((String) image)) {
            Picasso.get().load((String) image).placeholder(R.drawable.splash).into(imageView);
        }
    }

    @BindingAdapter("imageResourceUrl")
    public static void loadResourceImage(ImageView imageView, int image) {
        Log.e("loadResourceImage", "loadResourceImage: "+image );
        Glide.with(imageView.getContext()).load(image).into(imageView);
    }

    @BindingAdapter("imageShowUrl")
    public static void loadMShowImage(ImageView imageView, Object image) {
        if (image instanceof String && !TextUtils.isEmpty((String) image)) {
            Picasso.get().load((String) image).placeholder(R.drawable.splash).into(imageView);
            imageView.setOnClickListener(v -> new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, imageView, (String) image, null));
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
