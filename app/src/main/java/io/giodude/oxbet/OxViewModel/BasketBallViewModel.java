package io.giodude.oxbet.OxViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.oxbet.OxConnection.Repositories;
import io.giodude.oxbet.OxModel.BasketBallModel;

public class BasketBallViewModel extends ViewModel {

    private MutableLiveData<List<BasketBallModel.Datum>> basket;
    public Repositories repositories;

    public void init(){
        if (basket!=null){
            return;
        }
        repositories = Repositories.getInstance();
        basket = repositories.getBball();
    }

    public LiveData<List<BasketBallModel.Datum>> getBasket(){

        return basket;
    }
}
