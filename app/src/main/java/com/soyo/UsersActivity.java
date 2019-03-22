package com.soyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.soyo.Models.UserItem;

import java.util.ArrayList;
import java.util.List;

public class UsersActivity extends AppCompatActivity {
    RecyclerView userRecycler;
    List<UserItem> userItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);
        userRecycler=findViewById(R.id.UserRecycler);
        userItemList=new ArrayList<>();

        UserItem userItem1 = new UserItem("Ankit", "Dadri", "9876543210", 100);
        UserItem userItem2 = new UserItem("Mitthoo", "Jaipur", "9876543210", 25);
        UserItem userItem3 = new UserItem("Singh", "Varanasi", "9876543210", 5);

        userItemList.add(userItem1);
        userItemList.add(userItem2);
        userItemList.add(userItem3);

        UserAdapter userAdapter=new UserAdapter(UsersActivity.this,userItemList);
        LinearLayoutManager layoutManager=new LinearLayoutManager(UsersActivity.this);

        userRecycler.setLayoutManager(layoutManager);
        userRecycler.setItemAnimator(new DefaultItemAnimator());
        userRecycler.setAdapter(userAdapter);

    }
}
