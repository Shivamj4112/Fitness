package com.healthy.fitness;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class badgesAdapter extends RecyclerView.Adapter<badgesAdapter.Dataholder>{

    Activity activity;
    public static ArrayList<badgesModel> dataholder;

    public badgesAdapter(Activity activity, ArrayList<badgesModel> dataholder) {

        this.dataholder = dataholder;
        this.activity = activity;

    }

    @NonNull
    @Override
    public Dataholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.badges_layout,parent,false);
        return new Dataholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Dataholder holder, int position) {

        holder.workout_image.setImageResource(dataholder.get(position).getImage());
        holder.heading.setText(dataholder.get(position).getHeading());
        holder.complete_status.setText(dataholder.get(position).getComplete_status());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class Dataholder extends RecyclerView.ViewHolder{

        ImageView workout_image;
        TextView heading,complete_status;
        public Dataholder(@NonNull View itemView) {
            super(itemView);

            workout_image = itemView.findViewById(R.id.workout_image);
            heading = itemView.findViewById(R.id.heading);
            complete_status = itemView.findViewById(R.id.complete_status);
        }
    }
}
