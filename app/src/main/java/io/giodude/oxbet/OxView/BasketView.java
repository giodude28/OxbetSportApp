package io.giodude.oxbet.OxView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

import io.giodude.oxbet.OxAdapter.BasketAdapter;
import io.giodude.oxbet.OxModel.BasketBallModel;
import io.giodude.oxbet.OxViewModel.BasketBallViewModel;
import io.giodude.oxbet.R;

public class BasketView extends Fragment {
private BasketBallViewModel basketBallViewModel;
private List<BasketBallModel.Datum> basketmodel = new ArrayList<>();
private BasketAdapter basketAdapter;
public static RecyclerView recyclerView;
    private RecyclerView.LayoutManager rLayout;
    LottieAnimationView lottieAnimationView;
    View root;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_basket_view,container,false);
        lottieAnimationView = root.findViewById(R.id.animation1);
        showbasket();
        return root;
    }

    private void getball(List<BasketBallModel.Datum> Basketmodel){
        recyclerView = root.findViewById(R.id.recyclerview);
        rLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(rLayout);
        basketAdapter = new BasketAdapter(getContext(), Basketmodel);
        recyclerView.setAdapter(basketAdapter);
    }


    private void showbasket(){
        basketBallViewModel = ViewModelProviders.of(getActivity()).get(BasketBallViewModel.class);
        basketBallViewModel.init();

        basketBallViewModel.getBasket().observe(this, new Observer<List<BasketBallModel.Datum>>() {
            @Override
            public void onChanged(List<BasketBallModel.Datum> data) {
                getball(data);
                basketmodel.addAll(data);
                basketAdapter.notifyDataSetChanged();
                if (basketmodel.size() == 0) {
                    lottieAnimationView.setVisibility(View.VISIBLE);
                } else {
                    lottieAnimationView.setVisibility(View.GONE);
                }

            }
        });

    }

}