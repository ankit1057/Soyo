package com.soyo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.soyo.Models.FlightItem;

import java.util.List;

public class FlightAdapter extends RecyclerView.Adapter<FlightAdapter.ViewHolder> {
    Context context;
    List<FlightItem> flightItemList;

    public FlightAdapter(Context context, List<FlightItem> flightItemList) {
        this.context = context;
        this.flightItemList = flightItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.flight_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        FlightItem flightItem = flightItemList.get(i);
        viewHolder.name.setText(flightItem.getName());
        viewHolder.arvlTime.setText(flightItem.getArvltime());
        viewHolder.depTime.setText(flightItem.getDeptime());
    }

    @Override
    public int getItemCount() {
        return flightItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, arvlTime, depTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textFlightName);
            arvlTime = itemView.findViewById(R.id.textArvlTime);
            depTime = itemView.findViewById(R.id.textDepTime);
        }
    }
}
