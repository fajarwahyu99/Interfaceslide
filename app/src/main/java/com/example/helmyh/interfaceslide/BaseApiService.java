package com.example.helmyh.interfaceslide;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface BaseApiService {


    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> loginRequest(@Field("uemail") String email,
                                    @Field("pwd") String password);


    @FormUrlEncoded
    @POST("signupAct.php")
    Call<ResponseBody> registerRequest(@Field("fullname") String nama,
                                       @Field("uemail") String email,
                                       @Field("pwd") String password);



}

