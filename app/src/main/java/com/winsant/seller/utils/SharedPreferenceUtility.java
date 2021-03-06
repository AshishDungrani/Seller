package com.winsant.seller.utils;

import android.app.Activity;
import android.content.SharedPreferences;

import com.winsant.seller.ui.MyApplication;

/**
 * Created by Pc-Android-1 on 10/1/2016.
 */
public class SharedPreferenceUtility {

    private static final String USER_PREFS = "Winsant_Seller_Pref";
    private SharedPreferences appSharedPrefs;
    private SharedPreferences.Editor prefsEditor;

    public SharedPreferenceUtility(MyApplication activity) {
        this.appSharedPrefs = activity.getSharedPreferences(USER_PREFS, Activity.MODE_PRIVATE);
        this.prefsEditor = appSharedPrefs.edit();
    }

    public void clearData() {
        prefsEditor.clear().commit();
    }

    public void setLogin(boolean value) {
        prefsEditor.putBoolean("isLogin", value).commit();
    }

    public boolean getLogin() {
        return appSharedPrefs.getBoolean("isLogin", false);
    }

    public void setToken(String value) {
        prefsEditor.putString("token", value).commit();
    }

    public String getToken() {
        return appSharedPrefs.getString("token", "");
    }

    public void setSellerId(String value) {
        prefsEditor.putString("seller_id", value).commit();
    }

    public String getSellerId() {
        return appSharedPrefs.getString("seller_id", "");
    }

    public void setSellerIdNo(String value) {
        prefsEditor.putString("seller_id_no", value).commit();
    }

    public String getSellerIdNo() {
        return appSharedPrefs.getString("seller_id_no", "");
    }

    public void setSellerName(String value) {
        prefsEditor.putString("s_name", value).commit();
    }

    public String getSellerName() {
        return appSharedPrefs.getString("s_name", "");
    }

    public void setFirstName(String value) {
        prefsEditor.putString("first_name", value).commit();
    }

    public String getFirstName() {
        return appSharedPrefs.getString("first_name", "");
    }

    public void setLastName(String value) {
        prefsEditor.putString("last_name", value).commit();
    }

    public String getLastName() {
        return appSharedPrefs.getString("last_name", "");
    }

    public void setCompanyName(String value) {
        prefsEditor.putString("company_name", value).commit();
    }

    public String getCompanyName() {
        return appSharedPrefs.getString("company_name", "");
    }

    public void setMobileNumber(String value) {
        prefsEditor.putString("mobile_number", value).commit();
    }

    public String getMobileNumber() {
        return appSharedPrefs.getString("mobile_number", "");
    }

    public void setEmail(String value) {
        prefsEditor.putString("email", value).commit();
    }

    public String getEmail() {
        return appSharedPrefs.getString("email", "");
    }

    public void setInt(String key, int value) {
        prefsEditor.putInt(key, value).commit();
    }

    public int getInt(String key) {
        return appSharedPrefs.getInt(key, 0);
    }

    public void setString(String key, String value) {
        prefsEditor.putString(key, value).commit();
    }

    public String getString(String key) {
        return appSharedPrefs.getString(key, "");
    }


}

// username,email,uid,first_name,last_name,phone_no,address,zip,gender,city,state,profile_url,profile_pic,pass_flag,plan_flag
