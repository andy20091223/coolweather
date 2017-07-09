package com.coolweather.android.gson;

import android.app.Notification;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by humaomao on 2017/7/7.
 */

public class Weather {
    public String status;
    public AQI aqi;
    public Basic basic;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
