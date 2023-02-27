package com.test;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class TestPostWithParam {
    public static void main(String[] args) throws Exception{
        RequestConfig defaultRequestConfig = RequestConfig.custom().setProxy(new HttpHost("127.0.0.1",8080)).build();
        CloseableHttpClient httpClient =  HttpClients.custom().setDefaultRequestConfig(defaultRequestConfig).build();

        String url = "http://127.0.0.1:9988";
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity("{\"t\":1}"));

        httpClient.execute(httpPost);
    }
}
