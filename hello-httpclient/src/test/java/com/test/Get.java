package com.test;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Get extends Base{

    @Test
    public void getWithParameter(){
        //初始化client
        CloseableHttpClient httpClient = getHTTPClientWithProxy();

        //超时
        int timeout = 1000 * 10;
        RequestConfig config = RequestConfig.custom().
                setConnectTimeout(timeout).             //连接超时
                setConnectionRequestTimeout(timeout).   //从connect manager共享池子获取connect的超时
                setSocketTimeout(timeout).build();      //连接后，获取response超时


        //拼接get参数
        String url = "http://www.baidu.com/hello";
        URIBuilder uriBuilder = new URIBuilder(url);
        uriBuilder.addParameter("key","value");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.setConfig(config);


        //执行请求
        CloseableHttpResponse response = httpClient.execute(httpGet);


//        InputStream inputStream = response.getEntity().getContent();
//        String s = "";
//        int c;
//        while((c = inputStream.read())!=-1){
//            s+=(char)c;
//        }
//
//        System.out.println(s);

        response.close();
        //获取UTF-8结果
        String s = EntityUtils.toString(response.getEntity(),"UTF-8");
        System.out.println(s);


        System.out.println(response.getStatusLine());

    }
}
