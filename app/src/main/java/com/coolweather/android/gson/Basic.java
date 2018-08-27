package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {//构建实体类
    @SerializedName("city") //由于JSON中一些字段不适合直接作为java字段命名，所以用@SerializedName注解的方式让JSON字段和Java字段建立映射关系
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
