package com.neverend.paymentzookeeper.util;

import okhttp3.*;

import java.io.IOException;

/**
 * @author ZhangChengJun
 * Date 2019/10/29.
 */
public class HttpUtil {
    /**
     * 发出Http的get请求
     *
     * @Param url 请求的URL地址
     */
    public static String sendHttpGetRequest(String url) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException ex) {
            throw new RuntimeException("URL:" + url + ";ErrorMsg: ", ex);
        }
    }

    /**
     * 发出Http的Post请求
     *
     * @param url  目标的URL
     * @param json 请求体
     */
    public static String sendHttpPostRequest(String url, String json) {
        final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        //通过JSON格式构建Post的请求体
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(body).build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException ex) {
            throw new RuntimeException("URL:" + url + ";ErrorMsg: " + ex.getMessage());
        }
    }
}
