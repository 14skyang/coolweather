package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.coolweather.android.gson.Weather;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);//先从sharedPreferences文件中读取缓存数据
        if (prefs.getString("weather",null)!=null){ //缓存数据判断，不为null则说明之前请求过了天气数据
            Intent intent=new Intent(this, WeatherActivity.class);//就没必要让用户再次选择城市，而是直接跳转到WeatherActivity即可
            startActivity(intent);
            finish();
        }
    }
}
