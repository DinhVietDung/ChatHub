package com.example.pc.chatapplication;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class ControlActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        bottomNavigationView = findViewById(R.id.navigation);
//        //add fragment vao linearlayout control
//        FragmentManager fragmentManager= getFragmentManager();
//        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
//        FragmentChat fragmentChat= new FragmentChat();
//        fragmentTransaction.add(R.id.fragment_lo,fragmentChat);
//        fragmentTransaction.commit();
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment select = null;
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_lo, select);
                fragmentTransaction.commit();
                switch (item.getItemId()) {
                    case R.id.action_chat:

                        break;
                    case R.id.action_contact:

                        break;
                }

                return true;
            }
        });

    }

}
