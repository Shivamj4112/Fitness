package com.healthy.fitness;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class WorkouAdapter extends RecyclerView.Adapter<WorkouAdapter.viewholder> {

    FragmentActivity activity;
    ArrayList<workoutModel> dataholder;

    public WorkouAdapter(FragmentActivity activity, ArrayList<workoutModel> dataholder) {

        this.activity = activity;
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.workout_layout, parent, false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.image.setBackgroundResource(dataholder.get(position).getImage());
        holder.heading.setText(dataholder.get(position).getHeading());
        holder.exercises.setText(dataholder.get(position).getExercises());
        holder.difficulty.setText(dataholder.get(position).getDifficulty());


        holder.workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity,ExercisesActivity.class);
                activity.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }


    public class viewholder extends RecyclerView.ViewHolder {

        CardView workout;
        LinearLayout image;
        TextView heading,exercises;
        MaterialButton difficulty;
        public viewholder(@NonNull View itemView) {
            super(itemView);

            workout = itemView.findViewById(R.id.workout);
            image = itemView.findViewById(R.id.image);
            heading = itemView.findViewById(R.id.heading);
            exercises = itemView.findViewById(R.id.exercises);
            difficulty = itemView.findViewById(R.id.difficulty);
        }
    }
}
