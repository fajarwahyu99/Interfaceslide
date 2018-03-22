package com.example.helmyh.interfaceslide;

/**
 * Created by HelmyH on 23-Jan-18.
 */
public class UtilsApi {


    public static final String BASE_URL_API = "http://infolabsolution.com/sandbox/undangin/websvc/user/";


    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
