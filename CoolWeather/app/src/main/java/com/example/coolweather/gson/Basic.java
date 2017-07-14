package com.example.coolweather.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tian Lu on 2017/7/3.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
