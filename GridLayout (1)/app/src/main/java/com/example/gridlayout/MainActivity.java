package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static String ANIMAL_NAME = "com.example.GridLayout.ANIMAL_NAME";
    public static String ANIMAL_IMAGE = "com.example.GridLayout.ANIMAL_IMAGE";

    private CardView cardView2;
    private CardView cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);


        cardView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String productTitle = "Pinguin";
                int animalImage = R.drawable.animals1;


                Intent intent = new Intent(MainActivity.this,Detalels.class);
                intent.putExtra(ANIMAL_NAME,productTitle);
                intent.putExtra(ANIMAL_IMAGE, animalImage);
                startActivity(intent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String productTitle = "Rhino";
                int animalImage = R.drawable.animals2;


                Intent intent = new Intent(MainActivity.this,Detalels.class);
                intent.putExtra(ANIMAL_NAME,productTitle);
                intent.putExtra(ANIMAL_IMAGE, animalImage);
                startActivity(intent);
            }
        });
    }
}