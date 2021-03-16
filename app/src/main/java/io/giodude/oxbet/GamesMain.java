package io.giodude.oxbet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import io.giodude.oxbet.OxView.Keno;
import io.giodude.oxbet.OxView.ShootingFish;
import io.giodude.oxbet.OxView.Slotmachine;

public class GamesMain extends Fragment {

    public static BottomNavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    boolean doubleBackToExitPressedOnce = false;

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        view = inflater.inflate(R.layout.activity_games_main, container, false);
        navigationView = view.findViewById(R.id.bottom_navigation);
        getChildFragmentManager().beginTransaction().replace(R.id.fLayout, new ShootingFish()).commit();

        declare();
        return view;
    }

    private void declare()
    {
        navigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {

                case R.id.fish:
                    selectedFragment = new ShootingFish();
                    break;

                case R.id.kenos:
                    selectedFragment = new Keno();
                    break;
                case R.id.slot:
                    selectedFragment = new Slotmachine();
                    break;

            }
            getChildFragmentManager().beginTransaction()
                    .replace(R.id.fLayout,selectedFragment)
                    .commit();

            return true;
        });
    }

}