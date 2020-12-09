package grand.app.akar.pages.myAccount.models;

import com.google.gson.annotations.SerializedName;

import grand.app.akar.pages.auth.models.UserData;

public class ProfileData {

    @SerializedName("orders_count")
    private int ordersCount;

    @SerializedName("rates_count")
    private int ratesCount;

    @SerializedName("delivery_fees")
    private String deliveryFees;
    @SerializedName("cash_paid")
    private String cashPaid;

    @SerializedName("user_data")
    private UserData userData;
    @SerializedName("calculated_points")
    private CalculatedPoints calculatedPoints;

    public int getOrdersCount() {
        return ordersCount;
    }

    public int getRatesCount() {
        return ratesCount;
    }

    public UserData getUserData() {
        return userData;
    }

    public String getDeliveryFees() {
        return deliveryFees;
    }

    public String getCashPaid() {
        return cashPaid;
    }

    public CalculatedPoints getCalculatedPoints() {
        return calculatedPoints;
    }
}