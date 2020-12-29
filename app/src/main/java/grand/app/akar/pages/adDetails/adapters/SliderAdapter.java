package grand.app.akar.pages.adDetails.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import grand.app.akar.R;
import grand.app.akar.base.MyApplication;
import grand.app.akar.pages.adDetails.models.SliderItem;
import grand.app.akar.utils.images.PhotoFullPopupWindow;


public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {
    public List<SliderItem> pagerList;
    private Context context;

    public SliderAdapter() {
        pagerList = new ArrayList<>();
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, null);
        context = parent.getContext();
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        SliderItem introItem = pagerList.get(position);
        if (introItem.getType() == 1) {
            viewHolder.playVideo.setVisibility(View.VISIBLE);
            viewHolder.imageViewBackground.setImageResource(R.drawable.holo);
        } else {
            viewHolder.playVideo.setVisibility(View.GONE);
            Glide.with(context).load(introItem.getMedia()).placeholder(R.drawable.splash).into(viewHolder.imageViewBackground);
        }
        viewHolder.imageViewBackground.setOnClickListener(v -> {
            if (introItem.getType() == 0)
                new PhotoFullPopupWindow(context, R.layout.popup_photo_full, viewHolder.imageViewBackground, introItem.getMedia(), null);
        });
    }

    @Override
    public int getCount() {
        return pagerList.size();
    }

    public void updateData(@Nullable List<SliderItem> data) {
        this.pagerList.clear();
        this.pagerList.addAll(data);
        notifyDataSetChanged();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {
        View itemView;
        ImageView imageViewBackground, playVideo;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            playVideo = itemView.findViewById(R.id.play);
            this.itemView = itemView;
        }
    }
}
