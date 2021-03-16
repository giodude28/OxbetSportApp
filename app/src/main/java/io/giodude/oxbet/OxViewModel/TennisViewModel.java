package io.giodude.oxbet.OxViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.oxbet.OxConnection.Repositories;
import io.giodude.oxbet.OxModel.TennisModel;

public class TennisViewModel extends ViewModel {


    private MutableLiveData<List<TennisModel.Datum>> ten;
    public Repositories repositories;

    public void init(){
        if (ten != null){
            return;
        }
        repositories = Repositories.getInstance();
        ten = repositories.getTennis();
    }

    public LiveData<List<TennisModel.Datum>> getTennisLives(){
        return ten;
    }
}
