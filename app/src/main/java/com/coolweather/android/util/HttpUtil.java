package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
/**
 * 建立HttpUtil类
 * sendOkHttpRequest方法
 * 通过参数地址对其发送请求*/

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
