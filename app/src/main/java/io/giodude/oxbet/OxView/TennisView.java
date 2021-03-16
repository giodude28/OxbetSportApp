package io.giodude.oxbet.OxView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
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

import io.giodude.oxbet.OxAdapter.BasketAdapter;
import io.giodude.oxbet.OxAdapter.FootballAdapter;
import io.giodude.oxbet.OxAdapter.TennisAdapter;
import io.giodude.oxbet.OxModel.BasketBallModel;
import io.giodude.oxbet.OxModel.FootballModel;
import io.giodude.oxbet.OxModel.TennisModel;
import io.giodude.oxbet.OxViewModel.BasketBallViewModel;
import io.giodude.oxbet.OxViewModel.FootballViewModel;
import io.giodude.oxbet.OxViewModel.TennisViewModel;
import io.giodude.oxbet.R;

public class TennisView extends Fragment {
    private TennisViewModel tennisViewModel;
    private List<TennisModel.Datum> tennismodel = new ArrayList<>();
    private TennisAdapter tennisAdapter;
    public static RecyclerView recyclerView;
    private RecyclerView.LayoutManager rLayout;
    LottieAnimationView lottieAnimationView;

    View root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_tennis_view,container,false);
        lottieAnimationView = root.findViewById(R.id.aaa);
        showtennis();
        return root;
    }

    private void getfoot(List<TennisModel.Datum> tennismodels){
        recyclerView = root.findViewById(R.id.recyclerview);
        rLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(rLayout);
        tennisAdapter = new TennisAdapter(getActivity(),tennismodels);
        recyclerView.setAdapter(tennisAdapter);
    }

    private void showtennis(){
        tennisViewModel = ViewModelProviders.of(getActivity()).get(TennisViewModel.class);
        tennisViewModel.init();

        tennisViewModel.getTennisLives().observe(this, data -> {
            getfoot(data);
            tennismodel.addAll(data);
            tennisAdapter.notifyDataSetChanged();
            if (tennismodel.size() == 0) {
                lottieAnimationView.setVisibility(View.VISIBLE);
            } else {
                lottieAnimationView.setVisibility(View.GONE);
            }
        });
    }
}