package com.example.helmyh.interfaceslide;

/**
 * Created by HelmyH on 23-Jan-18.
 */
public class UtilsApi {


    public static final String BASE_URL_API = "http://10.0.2.2/api/";


    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
