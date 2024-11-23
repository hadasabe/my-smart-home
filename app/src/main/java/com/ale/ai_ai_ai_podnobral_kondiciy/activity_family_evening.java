//package com.ale.ai_ai_ai_podnobral_kondiciy;
//
//import android.os.Bundle;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class activity_family_evening extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_family_evening);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}


package com.ale.ai_ai_ai_podnobral_kondiciy;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class activity_family_evening extends AppCompatActivity {

    private int clickCountCTV = 0;
    private int clickCountHot = 0;
    private int clickCountLamp = 0;
    private int clickCountMarusa = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_evening);

        final CardView cardViewCTV = findViewById(R.id.c_tv);
        final LinearLayout linearLayoutCTV = findViewById(R.id.l_tv);

        cardViewCTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCountCTV % 2 == 0) {
                    linearLayoutCTV.setBackgroundColor(Color.rgb(255,66,66)); // Красный цвет
                    Toast.makeText(activity_family_evening.this, "Телевизор выключен", Toast.LENGTH_SHORT).show();
                } else {
                    linearLayoutCTV.setBackgroundColor(Color.rgb(76,175,80)); // Зеленый цвет
                    Toast.makeText(activity_family_evening.this, "Телевизор включен", Toast.LENGTH_SHORT).show();
                }
                clickCountCTV++;
            }
        });

        final CardView cardViewHot = findViewById(R.id.c_hot);
        final LinearLayout linearLayoutHot = findViewById(R.id.l_hot);

        cardViewHot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCountHot % 2 == 0) {
                    linearLayoutHot.setBackgroundColor(Color.rgb(255,66,66)); // Красный цвет
                    Toast.makeText(activity_family_evening.this, "Теплый пол выключен", Toast.LENGTH_SHORT).show();
                } else {
                    linearLayoutHot.setBackgroundColor(Color.rgb(76,175,80)); // Зеленый цвет
                    Toast.makeText(activity_family_evening.this, "Теплый пол включен", Toast.LENGTH_SHORT).show();
                }
                clickCountHot++;
            }
        });

        final CardView cardViewLamp = findViewById(R.id.c_lamp);
        final LinearLayout linearLayoutLamp = findViewById(R.id.l_lamp);

        cardViewLamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCountLamp % 2 == 0) {
                    linearLayoutLamp.setBackgroundColor(Color.rgb(255,66,66)); // Красный цвет
                    Toast.makeText(activity_family_evening.this, "Лампочка выключена", Toast.LENGTH_SHORT).show();
                } else {
                    linearLayoutLamp.setBackgroundColor(Color.rgb(76,175,80)); // Зеленый цвет
                    Toast.makeText(activity_family_evening.this, "Лампочка включена", Toast.LENGTH_SHORT).show();
                }
                clickCountLamp++;
            }
        });

        final CardView cardViewMarusa = findViewById(R.id.c_marus);
        final LinearLayout linearLayoutMarusa = findViewById(R.id.l_marus);

        cardViewMarusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCountMarusa % 2 == 0) {
                    linearLayoutMarusa.setBackgroundColor(Color.rgb(255,66,66)); // Красный цвет
                    Toast.makeText(activity_family_evening.this, "Голосовой помощник выключен", Toast.LENGTH_SHORT).show();
                } else {
                    linearLayoutMarusa.setBackgroundColor(Color.rgb(76,175,80)); // Зеленый цвет
                    Toast.makeText(activity_family_evening.this, "Голосовой помощник выключен", Toast.LENGTH_SHORT).show();
                }
                clickCountMarusa++;
            }
        });
    }
}