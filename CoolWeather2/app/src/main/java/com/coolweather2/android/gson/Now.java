package com.coolweather2.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ltt19 on 2017/12/1.
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
