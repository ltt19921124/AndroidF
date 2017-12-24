package com.coolweather2.android.gson;

/**
 * Created by ltt19 on 2017/12/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
