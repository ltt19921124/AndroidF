package com.example.coolweather.gson;

import android.test.MoreAsserts;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tian Lu on 2017/7/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
