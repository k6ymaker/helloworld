package com.test;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Base {
    public CloseableHttpClient getHTTPClient(){
        return HttpClients.createDefault();
    }

    public CloseableHttpClient getHTTPClientWithProxy(){
        HttpHost proxy = new HttpHost("127.0.0.1",8080);
        RequestConfig defaultRequestConfig = RequestConfig.custom().setProxy(proxy).build();
        return HttpClients.custom().setDefaultRequestConfig(defaultRequestConfig).build();
    }
}
