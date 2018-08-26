package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {//因为全国省市县的数据都从服务器获取，所以进行服务器交互
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();//传入请求地址
        client.newCall(request).enqueue(callback);//注册一个回调来处理服务器响应
    }
}
