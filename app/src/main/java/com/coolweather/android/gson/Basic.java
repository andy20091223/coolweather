package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by humaomao on 2017/7/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}