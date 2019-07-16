package com.ernest.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button aboutBtn, profilebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutBtn = (Button) findViewById(R.id.aboutBtn);
        profilebtn = (Button) findViewById(R.id.profileBtn);

        aboutBtn.setOnClickListener(this);
        profilebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.aboutBtn:
                startActivity(new Intent(MainActivity.this,aboutActivity.class));
                break;
            case R.id.profileBtn:
                startActivity(new Intent(this, profileActivity.class));
                break;
        }
    }
}
