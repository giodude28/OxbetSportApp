package io.giodude.oxbet.OxView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

import io.giodude.oxbet.OxAdapter.FootballAdapter;
import io.giodude.oxbet.OxModel.FootballModel;
import io.giodude.oxbet.OxViewModel.FootballViewModel;
import io.giodude.oxbet.R;

public class FootballView extends Fragment {
    private FootballViewModel footballViewModel;
    private FootballAdapter footballAdapter;
    private List<FootballModel.Datum> footmodel = new ArrayList<>();
    public static RecyclerView recyclerView;
    private RecyclerView.LayoutManager rLayout;
    LottieAnimationView lottieAnimationView;
    View root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_football_view,container,false);
        lottieAnimationView = root.findViewById(R.id.animation1);
        showfoot();
        return root;
    }


    private void getfoot(List<FootballModel.Datum> footmodels){
        recyclerView = root.findViewById(R.id.recyclerview);
        rLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(rLayout);
        footballAdapter = new FootballAdapter(getActivity(),footmodels);
        recyclerView.setAdapter(footballAdapter);
    }

    private void showfoot(){
        footballViewModel = ViewModelProviders.of(getActivity()).get(FootballViewModel.class);
        footballViewModel.init();

        footballViewModel.getFootLives().observe(this, data -> {
            getfoot(data);
            footmodel.addAll(data);
            footballAdapter.notifyDataSetChanged();
            if (footmodel.size() == 0) {
                lottieAnimationView.setVisibility(View.VISIBLE);
            } else {
                lottieAnimationView.setVisibility(View.GONE);
            }
        });
    }
}