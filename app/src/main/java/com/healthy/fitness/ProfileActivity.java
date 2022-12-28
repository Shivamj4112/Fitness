package com.healthy.fitness;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gauravk.bubblenavigation.BubbleNavigationConstraintView;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import com.google.android.material.navigation.NavigationView;

public class ProfileActivity extends AppCompatActivity {

    //    MaterialButton badges,history,stats;
//    ImageView arrow_back;
    FrameLayout linear;
    public BubbleNavigationLinearView bottom_navigation;
    ImageView arrow_back;
    TextView current_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        linear = findViewById(R.id.linear);
        bottom_navigation = findViewById(R.id.bottom_navigation);
        arrow_back = findViewById(R.id.arrow_back);
        current_activity = findViewById(R.id.current_activity);


        HomeFragment profile = new HomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.linear, profile);
        transaction.commit();

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        bottom_navigation.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {

                switch (position){

                    default:
                    case 0:
                        loadfragment(new HomeFragment());
                        current_activity.setText("Home");
                        break;

                    case 1:
                        loadfragment(new WorkoutFragment());
                        current_activity.setText("Workout");
                        break;

                    case 2:
                        loadfragment(new SettingFragment());
                        current_activity.setText("Account settings");
                        break;
                }

            }

            private void loadfragment(Fragment fragment) {

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.linear, fragment);
                fragmentTransaction.commit();
            }
        });



    }
}