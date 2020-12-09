package grand.app.akar.pages.chat.viewmodel;


import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;

import grand.app.akar.base.BaseViewModel;
import grand.app.akar.pages.chat.model.Chat;

public class ItemChatViewModel extends BaseViewModel {
    public Chat chat;
    public int position;
    //    public ObservableBoolean isMessage = new ObservableBoolean(false);
//    public ObservableBoolean isImage = new ObservableBoolean(false);
    private int layout;
    private static final String TAG = "ItemChatViewModel";

    //
//    public Drawable backgroundColor;
//
    public ItemChatViewModel(Chat chat, int position) {
        this.chat = chat;
        this.position = position;
//        if(chat.type == 1) {
//            layout = LayoutDirection.RTL;
//        }else {
//            layout = LayoutDirection.LTR;
//        }

//        if(!chat.message.equals(""))
//            isMessage.set(true);
//        if(!chat.image.equals(""))
//            isImage.set(true);

//        notifyChange();
    }


    public int getLayout() {
        return layout;
    }

    @BindingAdapter("layout")
    public static void setLayout(ConstraintLayout linearLayout, int layout) {
        linearLayout.setLayoutDirection(layout);
    }

}
