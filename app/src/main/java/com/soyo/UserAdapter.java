package com.soyo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.soyo.Models.UserItem;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    Context context;
    List<UserItem> UserItemList;

    public UserAdapter(Context context, List<UserItem> userItemList) {
        this.context = context;
        UserItemList = userItemList;
    }

    @NonNull
    @Override
    public UserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item, viewGroup, false );
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.MyViewHolder myViewHolder, int i) {
        UserItem userItem = UserItemList.get(i);
        myViewHolder.name.setText(userItem.getName());
        myViewHolder.city.setText(userItem.getCity());
        myViewHolder.phone.setText(userItem.getPhone());
        myViewHolder.days.setText(String.valueOf(userItem.getDays()));
    }

    @Override
    public int getItemCount() {
        return UserItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name, city, phone, days;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textUserName);
            city=itemView.findViewById(R.id.textUserCity);
            phone=itemView.findViewById(R.id.textUserPhone);
            days=itemView.findViewById(R.id.textUserDays);
        }
    }
}
