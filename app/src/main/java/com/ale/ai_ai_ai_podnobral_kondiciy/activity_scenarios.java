package com.ale.ai_ai_ai_podnobral_kondiciy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_scenarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scenarios);
    }

    public void goFamilyScen(View v){
        Intent i = new Intent(this, activity_family_evening.class);
        startActivity(i);
    }

    public void goFamilyEvening(View v){
        Intent i = new Intent(this, activity_family_evening.class);
        startActivity(i);
    }
}