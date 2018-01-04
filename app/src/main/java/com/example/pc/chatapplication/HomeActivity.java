package com.example.pc.chatapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageView imgLogo;
    Button btnSignIn;
    TextView txtCreateAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgLogo= findViewById(R.id.logo_img);
        btnSignIn= findViewById(R.id.sign_in_btn);
        txtCreateAcc= findViewById(R.id.create_acc_tv);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(HomeActivity.this,ControlActivity.class);
                startActivity(intent);
            }
        });


    }


}
