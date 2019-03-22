package com.soyo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.soyo.Models.HotelItem;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    RecyclerView hotelRecycler;
    List<HotelItem> hotelItemList;
    Button users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        hotelRecycler=findViewById(R.id.hotelRecycler);
        hotelItemList=new ArrayList<>();
        users=findViewById(R.id.btnUsers);

        HotelItem hotelItem1=new HotelItem("Karni","1234567890");
        HotelItem hotelItem2=new HotelItem("Morni","1234567890");
        HotelItem hotelItem3=new HotelItem("Chorni","1234567890");
        HotelItem hotelItem4=new HotelItem("Horni","1234567890");
        HotelItem hotelItem5=new HotelItem("Nornie","1234567890");
        HotelItem hotelItem6=new HotelItem("Fornie","1234567890");

        hotelItemList.add(hotelItem1);
        hotelItemList.add(hotelItem2);
        hotelItemList.add(hotelItem3);
        hotelItemList.add(hotelItem4);
        hotelItemList.add(hotelItem5);
        hotelItemList.add(hotelItem6);
        hotelItemList.add(new HotelItem("a","n"));



        HotelAdapter hotelAdapter=new HotelAdapter(HomeActivity.this,hotelItemList);
        LinearLayoutManager layoutManager=new LinearLayoutManager(HomeActivity.this);
        GridLayoutManager manager=new GridLayoutManager(HomeActivity.this,6);

        hotelRecycler.setLayoutManager(layoutManager);
        hotelRecycler.setItemAnimator(new DefaultItemAnimator());
        hotelRecycler.setAdapter(hotelAdapter);

        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, UsersActivity.class);
                startActivity(intent);
            }
        });
    }
}
