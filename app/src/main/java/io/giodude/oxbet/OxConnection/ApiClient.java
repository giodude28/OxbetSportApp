package io.giodude.oxbet.OxConnection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    public static ApiInterface retrofitBuilder(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.BBallLive_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }

    public static ApiInterface retrofitBuilder1(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.Football_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }

    public static ApiInterface retrofitBuilder2(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiInterface.Tennis_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        ApiInterface apiCall = retrofit.create(ApiInterface.class);

        return apiCall;
    }
}
