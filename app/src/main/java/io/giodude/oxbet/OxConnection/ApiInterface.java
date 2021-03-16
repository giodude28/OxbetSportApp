package io.giodude.oxbet.OxConnection;

import io.giodude.oxbet.OxModel.BasketBallModel;
import io.giodude.oxbet.OxModel.FootballModel;
import io.giodude.oxbet.OxModel.TennisModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInterface {

    String BBallLive_URL = "https://sportscore1.p.rapidapi.com/sports/3/";

    @GET("events/live")
    @Headers({"x-rapidapi-host: sportscore1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    Call<BasketBallModel> getBballLive();


    String Football_URL = "https://sportscore1.p.rapidapi.com/sports/1/";

    @GET("events/live")
    @Headers({"x-rapidapi-host: sportscore1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    Call<FootballModel> getFootballLive();

    String Tennis_URL = "https://sportscore1.p.rapidapi.com/sports/2/";

    @GET("events/live")
    @Headers({"x-rapidapi-host: sportscore1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    Call<TennisModel> getTennisLive();
}
