package com.healthy.fitness;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Activity activity;


    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        MaterialButton badges = view.findViewById(R.id.badges);
        MaterialButton history = view.findViewById(R.id.history);
        MaterialButton stats = view.findViewById(R.id.stats);

        badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                badges.setTextColor(getResources().getColor(R.color.pick));
                badges.setBackgroundColor(getResources().getColor(R.color.light_pick));

                history.setTextColor(getResources().getColor(R.color.white));
                history.setBackgroundColor(getResources().getColor(R.color.edittext_background));

                stats.setTextColor(getResources().getColor(R.color.white));
                stats.setBackgroundColor(getResources().getColor(R.color.edittext_background));

                BadgesFragment fragment = new BadgesFragment();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment,fragment);
                transaction.commit();
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                badges.setTextColor(getResources().getColor(R.color.white));
                badges.setBackgroundColor(getResources().getColor(R.color.edittext_background));

                history.setTextColor(getResources().getColor(R.color.pick));
                history.setBackgroundColor(getResources().getColor(R.color.light_pick));

                stats.setTextColor(getResources().getColor(R.color.white));
                stats.setBackgroundColor(getResources().getColor(R.color.edittext_background));

                HistoryFragment fragment = new HistoryFragment();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment,fragment);
                transaction.commit();
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                badges.setTextColor(getResources().getColor(R.color.white));
                badges.setBackgroundColor(getResources().getColor(R.color.edittext_background));

                history.setTextColor(getResources().getColor(R.color.white));
                history.setBackgroundColor(getResources().getColor(R.color.edittext_background));

                stats.setTextColor(getResources().getColor(R.color.pick));
                stats.setBackgroundColor(getResources().getColor(R.color.light_pick));
            }
        });

        return view;
    }
}