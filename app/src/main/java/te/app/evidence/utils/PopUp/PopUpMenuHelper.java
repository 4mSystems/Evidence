package te.app.evidence.utils.PopUp;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import java.util.List;

import te.app.evidence.pages.categories.models.CategoriesData;

public class PopUpMenuHelper {


    public static PopupMenu showCategoriesPopUp(Context context, View view, List<CategoriesData> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }

    public static PopupMenu showPopUp(Context context, View view, List<String> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i));
        }
        typesPopUps.show();
        return typesPopUps;
    }


}
