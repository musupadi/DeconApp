package com.destiny.deconapp.API;

import com.destiny.deconapp.Model.ResponseModel;

import java.sql.Struct;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiRequest {
    @FormUrlEncoded
    @POST("Register.php")
    Call<ResponseModel> Register(@Field("nama") String nama,
                                 @Field("email") String email,
                                 @Field("nohp") String nohp,
                                 @Field("username") String username,
                                 @Field("password") String password);
}
