package com.ale.ai_ai_ai_podnobral_kondiciy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri imageUri;
    private ImageView dialogImageView; // Ссылка на ImageView в диалоговом окне
    private GridLayout gridLayout; // Ссылка на GridLayout

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        gridLayout = findViewById(R.id.grid_layout);


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
        Intent i = new Intent(this, activity_rooms.class);
        startActivity(i);
    }


}