package com.soyo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.soyo.Models.EmployeeItem;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.MyViewHolder> {
    Context context;
    List<EmployeeItem> employeeItemList;

    public EmployeeAdapter(Context context, List<EmployeeItem> employeeItemList) {
        this.context = context;
        this.employeeItemList = employeeItemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.employee_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        EmployeeItem employeeItem = employeeItemList.get(i);
        myViewHolder.name.setText(employeeItem.getEmployeeName());
        myViewHolder.age.setText(employeeItem.getEmployeeAge());
        myViewHolder.salary.setText(employeeItem.getEmployeeSalary());
    }

    @Override
    public int getItemCount() {
        return employeeItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, age, salary;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textUserName);
            age=itemView.findViewById(R.id.textUserCity);
            salary=itemView.findViewById(R.id.textUserPhone);
        }
    }
}
