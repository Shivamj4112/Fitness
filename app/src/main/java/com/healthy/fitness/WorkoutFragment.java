package com.healthy.fitness;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkoutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkoutFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recycle;
    ArrayList<workoutModel> dataholder;
    Adapter adapter;

    public WorkoutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WorkoutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WorkoutFragment newInstance(String param1, String param2) {
        WorkoutFragment fragment = new WorkoutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_workout, container, false);
        recycle = view.findViewById(R.id.recycle);
        recycle.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

        workoutModel ob1 = new workoutModel(R.drawable.quads, "Quads & Deltoids", "7 Exercises ", "Medium Diffculty");
        dataholder.add(ob1);

        workoutModel ob2 = new workoutModel(R.drawable.workout_1, "Push up Routing", "12 Exercises ", "Medium Diffculty");
        dataholder.add(ob2);

        workoutModel ob3 = new workoutModel(R.drawable.workout_2, "Side Planks", "12 Exercises ", "Medium Diffculty");
        dataholder.add(ob3);

        workoutModel ob4 = new workoutModel(R.drawable.workout_3, "Situps", "7 Exercises ", "Medium Diffculty");
        dataholder.add(ob4);

        workoutModel ob5 = new workoutModel(R.drawable.workout_4, "Quads & Deltoids", "7 Exercises ", "Medium Diffculty");
        dataholder.add(ob5);

        recycle.setAdapter(new WorkouAdapter(getActivity(), dataholder));
        return view;
    }
}