package com.rachidsakara.bgcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<DataItem> data_list;

    private LinearLayoutManager mLayoutManager;

    private StringBuilder builderString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        data_list = new ArrayList<>();

        //load data into data_list
        Load_Data();

        //set the adapter
        adapter = new CustomAdapter(getApplicationContext(),data_list);
        recyclerView.setAdapter(adapter);
    }

    private void Load_Data() {
        data_list.add(new DataItem(R.drawable.avatar1,R.drawable.movie,"Marty Fclly","Novamber 5,1995",getResources().getString(R.string.p_1)));
        data_list.add(new DataItem(R.drawable.avatar3,R.drawable.dainasor,"Sarah Conor","May 12, 1984",getResources().getString(R.string.p_2)));
        data_list.add(new DataItem(R.drawable.avatar2,R.drawable.cars,"Dr. Ian Malcolm","June 28, 1990",getResources().getString(R.string.p_3)));
    }

}
