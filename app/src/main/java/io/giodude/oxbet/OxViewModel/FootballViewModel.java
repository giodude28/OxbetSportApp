package io.giodude.oxbet.OxViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.oxbet.OxConnection.Repositories;
import io.giodude.oxbet.OxModel.FootballModel;

public class FootballViewModel extends ViewModel {

    private MutableLiveData<List<FootballModel.Datum>> lives;
    public Repositories repositories;

    public void init(){
        if (lives != null){
            return;
        }
        repositories = Repositories.getInstance();
        lives = repositories.getLive();
    }

    public LiveData<List<FootballModel.Datum>> getFootLives(){
        return lives;
    }
}
