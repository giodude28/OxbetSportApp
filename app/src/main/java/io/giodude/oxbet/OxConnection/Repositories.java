package io.giodude.oxbet.OxConnection;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import io.giodude.oxbet.OxModel.BasketBallModel;
import io.giodude.oxbet.OxModel.FootballModel;
import io.giodude.oxbet.OxModel.TennisModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositories {

    private static Repositories instance;
    static ApiClient rfit = new ApiClient();


    public static Repositories getInstance(){
        if (instance==null){
            instance = new Repositories();
        }
        return instance;
    }

    public MutableLiveData<List<BasketBallModel.Datum>> getBball(){
        final MutableLiveData<List<BasketBallModel.Datum>> data = new MutableLiveData<>();
        Call<BasketBallModel> call = rfit.retrofitBuilder().getBballLive();
        call.enqueue(new Callback<BasketBallModel>() {
            @Override
            public void onResponse(Call<BasketBallModel> call, Response<BasketBallModel> response) {
                try {
                    BasketBallModel databall = response.body();
                    List<BasketBallModel.Datum> datumList = databall.getData();
                    data.setValue(datumList);
                }catch (Exception e){
                    Log.d("Data","Null List!");
                }

            }

            @Override
            public void onFailure(Call<BasketBallModel> call, Throwable t) {
                Log.d("Data","Null Liiiiiiiiiiiiiiiiiiiiiiiist!" + t.getMessage());
            }
        });
                return data;
    }

    public MutableLiveData<List<FootballModel.Datum>> getLive(){

        final MutableLiveData<List<FootballModel.Datum>> data1 = new MutableLiveData<>();
        Call<FootballModel> call = rfit.retrofitBuilder1().getFootballLive();
        call.enqueue(new Callback<FootballModel>() {
            @Override
            public void onResponse(Call<FootballModel> call, Response<FootballModel> response) {
                try
                {
                    FootballModel datalist1 = response.body();
                    List<FootballModel.Datum> datumlist1 = datalist1.getData();
                    data1.setValue(datumlist1);
                }catch (Exception e)
                {
                    Log.d("Data","Null List!");
                }

            }
            @Override
            public void onFailure(Call<FootballModel> call, Throwable t) {

            }
        });
        return data1;
    }

    public MutableLiveData<List<TennisModel.Datum>> getTennis(){

        final MutableLiveData<List<TennisModel.Datum>> data2 = new MutableLiveData<>();
        Call<TennisModel> call = rfit.retrofitBuilder2().getTennisLive();
        call.enqueue(new Callback<TennisModel>() {
            @Override
            public void onResponse(Call<TennisModel> call, Response<TennisModel> response) {
                try
                {
                    TennisModel datalist2 = response.body();
                    List<TennisModel.Datum> datumlist2 = datalist2.getData();
                    data2.setValue(datumlist2);
                }catch (Exception e)
                {
                    Log.d("Data","Null List!");
                }

            }
            @Override
            public void onFailure(Call<TennisModel> call, Throwable t) {

            }
        });
        return data2;
    }
}
