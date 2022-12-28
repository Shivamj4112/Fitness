package com.healthy.fitness;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class historyAdapter extends RecyclerView.Adapter<historyAdapter.Dataholder>{

    Activity activity;
    ArrayList<historyModel>dataholder;

    public historyAdapter(Activity activity, ArrayList<historyModel> dataholder) {
        this.activity = activity;
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public Dataholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.history_layout,parent,false);
        return new Dataholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Dataholder holder, int position) {

        holder.count_lap.setText(dataholder.get(position).getCount_lap());
        holder.heading.setText(dataholder.get(position).getHeading());
        holder.complete_status.setText(dataholder.get(position).getComplete_status());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class Dataholder extends RecyclerView.ViewHolder{

        TextView count_lap,heading,complete_status;
        public Dataholder(@NonNull View itemView) {
            super(itemView);

            count_lap = itemView.findViewById(R.id.count_lap);
            heading = itemView.findViewById(R.id.heading);
            complete_status = itemView.findViewById(R.id.complete_status);

        }
    }
}
