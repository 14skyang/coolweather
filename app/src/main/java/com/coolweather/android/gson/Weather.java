package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {//构建总的实例类来引用刚刚创建的各个实体类
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;//daily_forecast"包含的是一个数组，所以用List集合引用Forecast类
}
