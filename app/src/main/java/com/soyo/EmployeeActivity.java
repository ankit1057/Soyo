package com.soyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.soyo.Models.EmployeeItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeActivity extends AppCompatActivity {
    RecyclerView employeeRecycler;
    List<EmployeeItem> employeeItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        employeeItemList=new ArrayList<>();
        employeeRecycler=findViewById(R.id.employeeRecycler);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(EmployeeActivity.this);
        employeeRecycler.setLayoutManager(manager);
        employeeRecycler.setItemAnimator(new DefaultItemAnimator());

        final JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, "http://dummy.restapiexample.com/api/v1/employees", null, new Response.Listener<JSONArray>() {


            @Override
            public void onResponse(JSONArray response) {
                for (int i=0;i<response.length();i++){
                    try {
                        JSONObject jsonObject=response.getJSONObject(i);
                        EmployeeItem employeeItem=new EmployeeItem(
                                jsonObject.getString("id"),
                                jsonObject.getString("employee_name"),
                                jsonObject.getString("employee_salary"),
                                jsonObject.getString("employee_age"),

                                ""
                        );
                        employeeItemList.add(employeeItem);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }
                EmployeeAdapter employeeAdapter=new EmployeeAdapter(EmployeeActivity.this,employeeItemList);
                employeeRecycler.setAdapter(employeeAdapter);
                Toast.makeText(EmployeeActivity.this, "" + response.toString(), Toast.LENGTH_SHORT).show();

            }
        }
                , new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(EmployeeActivity.this);
        requestQueue.add(jsonArrayRequest);

    }
}
