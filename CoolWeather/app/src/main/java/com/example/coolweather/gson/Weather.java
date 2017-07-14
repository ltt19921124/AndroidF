package com.example.coolweather.gson;

import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Tian Lu on 2017/7/3.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecasts;
}
