package grand.app.akar.utils.PopUp;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import java.util.List;

import grand.app.akar.pages.auth.models.carNational.CarTypesItem;
import grand.app.akar.pages.auth.models.carNational.NationalTypesItem;

public class PopUpMenuHelper {


 public static PopupMenu showPopUp(Context context, View view, List<PopUp> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }

    public static PopupMenu showNationalsPopUp(Context context, View view, List<NationalTypesItem> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }

    public static PopupMenu showCarTypePopUp(Context context, View view, List<CarTypesItem> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }

}
