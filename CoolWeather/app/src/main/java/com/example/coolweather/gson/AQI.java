package com.example.coolweather.gson;

import java.security.PublicKey;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by Tian Lu on 2017/7/3.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
