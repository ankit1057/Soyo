package com.soyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.soyo.Models.FlightItem;

import java.util.ArrayList;
import java.util.List;

public class FlightActivity extends AppCompatActivity {
    RecyclerView flightRecycler;
    List<FlightItem> flightItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);
        flightItemList = new ArrayList<>();

        FlightItem flightItem1 = new FlightItem("Air Singh", "12:00", "11:00");
        FlightItem flightItem2 = new FlightItem("Flight Singh", "12:00", "11:00");
        FlightItem flightItem3 = new FlightItem("Air Mitthoo", "00:00", "23:00");

        flightItemList.add(flightItem1);
        flightItemList.add(flightItem2);
        flightItemList.add(flightItem3);
        flightItemList.add(new FlightItem("Flight Mitthoo", "00:00", "23:00"));

        FlightAdapter flightAdapter = new FlightAdapter(FlightActivity.this, flightItemList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(FlightActivity.this);
        flightRecycler = findViewById(R.id.flightRecycler);

        flightRecycler.setLayoutManager(layoutManager);
        flightRecycler.setItemAnimator(new DefaultItemAnimator());
        flightRecycler.setAdapter(flightAdapter);
    }
}
