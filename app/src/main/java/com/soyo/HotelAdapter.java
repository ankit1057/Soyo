package com.soyo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.soyo.Models.HotelItem;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {
    private Context context;
    private List<HotelItem> hotelItemList;

    public HotelAdapter(Context context, List<HotelItem> hotelItemList) {
        this.context = context;
        this.hotelItemList = hotelItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(context);
               View view= (View) inflater.inflate(R.layout.hotel_item,viewGroup,false);
                return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        HotelItem hotelItem=hotelItemList.get(i);
        viewHolder.nameText.setText(hotelItem.getName());
        viewHolder.phoneText.setText(hotelItem.getPhone());



    }

    @Override
    public int getItemCount() {
        return hotelItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText,phoneText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText=itemView.findViewById(R.id.textHotelName);
            phoneText=itemView.findViewById(R.id.textHotelPhone);
        }
    }
}
