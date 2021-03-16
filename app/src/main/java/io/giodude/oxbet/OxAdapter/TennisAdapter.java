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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.giodude.oxbet.OxModel.TennisModel;
import io.giodude.oxbet.R;

public class TennisAdapter extends RecyclerView.Adapter<TennisAdapter.ViewHolder> {
    Context context;
    public List<TennisModel.Datum> data;
    public TennisModel.Datum ee;
    TextView title1,hname,aname,hscore,ascore,leagues,season,date,sport;
    public TennisAdapter(Context context, List data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.tennisitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(data.get(position));
        ee = data.get(position);
        holder.home.setText(ee.getHomeTeam().getName());
        holder.away.setText(ee.getAwayTeam().getName());
        holder.status.setText(ee.getStatus());
        holder.date.setText(ee.getStartAt());

        final Dialog myDialog;
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.tennisitemdetails);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        title1 = myDialog.findViewById(R.id.tennistitles);
        hname = myDialog.findViewById(R.id.tennishomedetails);
        aname = myDialog.findViewById(R.id.tennisawaydetails);
        hscore = myDialog.findViewById(R.id.tennishomescores);
        ascore = myDialog.findViewById(R.id.tennisawayscore);
        date = myDialog.findViewById(R.id.tennisdate);
        sport = myDialog.findViewById(R.id.tennissports);
        for (int i = 0; i<data.size(); i++) {
            if(holder.home.getText()==data.get(position).getHomeTeam().getName()){
                title1.setText(data.get(position).getName());
                hname.setText(ee.getHomeTeam().getName());
                aname.setText(ee.getAwayTeam().getName());
                hscore.setText(ee.getHomeScore().getCurrent().toString());
                ascore.setText(ee.getAwayScore().getCurrent().toString());
                date.setText(ee.getStartAt());
                sport.setText(ee.getSport().getName());
            }
        }
        holder.itemView.setOnClickListener(v -> myDialog.show());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView home,away,status,date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            home = itemView.findViewById(R.id.tennishome);
            away = itemView.findViewById(R.id.tennisaway);
            status = itemView.findViewById(R.id.tennisstatus);
            date = itemView.findViewById(R.id.tennisdate);
        }
    }
}
