//package com.ale.ai_ai_ai_podnobral_kondiciy;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//public class activity_scenarios extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_scenarios);
//    }
//
//    public void goFamilyScen(View v){
//        Intent i = new Intent(this, activity_family_evening.class);
//        startActivity(i);
//    }
//
//    public void goFamilyGarmon(View v){
//        Intent i = new Intent(this, activity_garmony.class);
//        startActivity(i);
//    }
//
//    public void goFeedAnimal(View v){
//        Intent i = new Intent(this, activity_feed_homepets.class);
//        startActivity(i);
//    }
//
//    public void goDevices(View v){
//        Intent i = new Intent(this, activity_devices.class);
//        startActivity(i);
//    }
//
//    public void goHome(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);
//    }
//
//    public void goScenarios(View v){
//        Intent i = new Intent(this, activity_scenarios.class);
//        startActivity(i);
//    }
//}

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

public class activity_scenarios extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri imageUri;
    private ImageView dialogImageView; // Ссылка на ImageView в диалоговом окне
    private GridLayout grid2; // Ссылка на GridLayout

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scenarios);

        grid2 = findViewById(R.id.grid2);

        CardView cardAdd = findViewById(R.id.card_add2);
        cardAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddItemDialog();
            }
        });
    }


    private void showAddItemDialog() {
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_add_item, null);
        EditText editText = dialogView.findViewById(R.id.edit_text);
        dialogImageView = dialogView.findViewById(R.id.image_view); // Получаем ссылку на ImageView
        Button buttonChooseImage = dialogView.findViewById(R.id.button_choose_image);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Добавить элемент")
                .setView(dialogView)
                .setPositiveButton("Добавить", (dialogInterface, which) -> {
                    String text = editText.getText().toString();
                    if (!text.isEmpty() && imageUri != null) {
                        addItemToGrid(text, imageUri);
                        Toast.makeText(activity_scenarios.this, "Элемент добавлен: " + text, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(activity_scenarios.this, "Пожалуйста, введите текст и выберите изображение", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Отмена", (dialogInterface, which) -> dialogInterface.dismiss())
                .create();

        buttonChooseImage.setOnClickListener(v -> openImageChooser());

        dialog.show();
    }

    private void openImageChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Выберите изображение"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                if (dialogImageView != null) { // Проверяем, что ссылка на ImageView не null
                    dialogImageView.setImageBitmap(bitmap);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void addItemToGrid(String text, Uri imageUri) {
        // Создаем новый CardView
        CardView newCardView = (CardView) LayoutInflater.from(this).inflate(R.layout.card_items, grid2, false);

        // Настройка TextView и ImageView внутри CardView
        TextView cardTextView = newCardView.findViewById(R.id.card_text);
        ImageView cardImageView = newCardView.findViewById(R.id.card_image);

        cardTextView.setText(text);
        cardImageView.setImageURI(imageUri);

        // Добавляем новый CardView в GridLayout
        grid2.addView(newCardView);
    }

    public void goFamilyScen(View v){
        Intent i = new Intent(this, activity_family_evening.class);
        startActivity(i);
    }

    public void goFamilyGarmon(View v){
        Intent i = new Intent(this, activity_garmony.class);
        startActivity(i);
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
}