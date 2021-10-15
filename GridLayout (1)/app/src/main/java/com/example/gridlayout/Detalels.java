package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalels extends AppCompatActivity {


    private TextView textTitle;
    private ImageView animalImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalels);

        textTitle = findViewById(R.id.textTitle);
        animalImage = findViewById(R.id.animalImage);


        Intent i = getIntent();

        String animalName = i.getStringExtra(MainActivity.ANIMAL_NAME);
        int iProductImage = i.getIntExtra(MainActivity.ANIMAL_IMAGE,0);


        textTitle.setText(animalName);

        animalImage.setImageResource(iProductImage);

    }
}