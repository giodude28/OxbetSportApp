package io.giodude.oxbet.OxAdapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.giodude.oxbet.OxModel.BasketBallModel;
import io.giodude.oxbet.R;

public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.ViewHolder> {
    Context context;
    List<BasketBallModel.Datum> data;
    public BasketBallModel.Datum ee;
    TextView home,homescore,awaysscore,away,quart,stats,sea,lea,spo;
    public BasketAdapter(Context context, List data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.basketitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(data.get(position));
        ee = data.get(position);
        holder.home.setText(ee.getHomeTeam().getName());
        holder.away.setText(ee.getAwayTeam().getName());
        if (ee.getLeague() != null){
            holder.league.setText(ee.getLeague().getName());
        }else {
            holder.league.setText(" ");
        }

        final Dialog myDialog;
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.basketitemdetails);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        home = myDialog.findViewById(R.id.baskethomedetail);
        away = myDialog.findViewById(R.id.basketawaydetail);
        homescore = myDialog.findViewById(R.id.baskethomescore);
        awaysscore = myDialog.findViewById(R.id.basketawayscore);
        quart = myDialog.findViewById(R.id.quarter);
        stats = myDialog.findViewById(R.id.status);
        sea = myDialog.findViewById(R.id.season);
        lea = myDialog.findViewById(R.id.league);
        spo = myDialog.findViewById(R.id.sports);
        for (int i = 0; i<data.size(); i++) {
            if(holder.home.getText()==data.get(position).getHomeTeam().getName()){
                home.setText(data.get(position).getHomeTeam().getName());
                away.setText(ee.getAwayTeam().getName());
                homescore.setText(ee.getHomeScore().getDisplay().toString());
                awaysscore.setText(ee.getAwayScore().getDisplay().toString());
                quart.setText(ee.getStatusMore());
                stats.setText(ee.getStatus());
                    if (ee.getLeague() == null || ee.getSeason() == null){
                        sea.setText("2021");
                        lea.setText("Null");
                    }else {
                        sea.setText(ee.getSeason().getName());
                        lea.setText(ee.getLeague().getName());
                    }
                spo.setText("Basketball");
            }
        }
        holder.itemView.setOnClickListener(v -> myDialog.show());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView home,away,league;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            home = itemView.findViewById(R.id.baskethome);
            away = itemView.findViewById(R.id.basketaway);
            league = itemView.findViewById(R.id.basketleague);
        }
    }
}
