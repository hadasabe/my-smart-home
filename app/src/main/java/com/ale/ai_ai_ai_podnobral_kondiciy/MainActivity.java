package com.ale.ai_ai_ai_podnobral_kondiciy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void goDevices(View v){
        Intent i = new Intent(this, activity_devices.class);
        startActivity(i);
    }

    public void goHome(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void goScenarios(View v){
        Intent i = new Intent(this, activity_scenarios.class);
        startActivity(i);
    }

    public void goRooms(View v){
        Intent i = new Intent(this, activity_scenarios.class);
        startActivity(i);
    }


}