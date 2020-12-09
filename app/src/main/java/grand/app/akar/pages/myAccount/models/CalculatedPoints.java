package grand.app.akar.pages.myAccount.models;

import com.google.gson.annotations.SerializedName;

public class CalculatedPoints {
    @SerializedName("points")
    private int points;
    @SerializedName("money")
    private float money;

    public int getPoints() {
        return points;
    }

    public float getMoney() {
        return money;
    }
}
