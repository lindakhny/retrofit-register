package com.android.register;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by lindakhny on 12/09/2017.
 */

public interface RegisterAPI {

    @FormUrlEncoded
    @POST("/insert.php")
    Call<RegisterResponse> Register(@Field("name") String name,
                                  @Field("email") String email,
                                  @Field("password") String password,
                                  @Field("repass") String repass);
    @GET("/view.php")
    Call<RegisterResponse> Login(String email, String password);
}
