package com.soyo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    ImageView imageHotel, imageFlight, imageBookNow, imageCompare, imageDeals, imageEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imageHotel = findViewById(R.id.imageHotel);
        imageFlight = findViewById(R.id.imageFlights);
        imageBookNow = findViewById(R.id.imageBookNow);
        imageCompare = findViewById(R.id.imageCompare);
        imageDeals = findViewById(R.id.imageDeals);
        imageEmployees=findViewById(R.id.employees);

        imageHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        imageFlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, FlightActivity.class);
                startActivity(intent);
            }
        });

    }
}
