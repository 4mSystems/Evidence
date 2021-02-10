package te.app.evidence.utils.session;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import te.app.evidence.pages.auth.models.UserData;
import te.app.evidence.pages.auth.models.UserMainData;
import te.app.evidence.pages.settings.models.settings.SettingsData;

public class UserHelper {
     static UserHelper mInstance;
     Context mCtx;
    private static final String SHARED_PREF_NAME = "myshared";

    private UserHelper(Context context) {
        mCtx = context;
    }

    //
    public static synchronized UserHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new UserHelper(context);
        }
        return mInstance;
    }

    public void userLogin(UserMainData userData) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(userData);
        editor.putString("userData", json);
        editor.apply();
        editor.commit();

    }


    public String addUserData() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("userData", null);

    }

    public UserMainData getUserData() {
        Gson gson = new Gson();
        String json = addUserData();
        return gson.fromJson(json, UserMainData.class);
    }

    public void userSettings(SettingsData settingsData) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(settingsData);
        editor.putString("settingsData", json);
        editor.apply();
        editor.commit();

    }


    public String addSettingsData() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("settingsData", null);

    }

    public SettingsData getSettingsData() {
        Gson gson = new Gson();
        String json = addSettingsData();
        SettingsData obj = gson.fromJson(json, SettingsData.class);
        return obj;
    }

    public void addIsFirst(boolean isFirst) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isFirst", isFirst);
        editor.apply();

    }

    public boolean getIsFirst() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("isFirst", false);
    }

    public void addToken(String token) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("token", token);
        editor.apply();

    }

    public String getToken() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("token", null);
    }

    public boolean loggout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }

    public void addCountryId(int CountryId) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("CountryId", CountryId);
        editor.apply();

    }

    public int getCountryId() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt("CountryId", 0);
    }

    public void addJwt(String jwt) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("jwt", jwt);
        editor.apply();

    }

    public void addCountryCodes(String countryCodes) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("countryCodes", countryCodes);
        editor.apply();

    }

    public String getCountryCodes() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("countryCodes", "");
    }

    public String getJwt() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("jwt", null);
    }

    public void addCountryCurrency(String countryCurrency) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("countryCurrency", countryCurrency);
        editor.apply();

    }

    public String getCountryCurrency() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString("countryCurrency", "");
    }
}