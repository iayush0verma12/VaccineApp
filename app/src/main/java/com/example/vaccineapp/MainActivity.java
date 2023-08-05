package com.example.vaccineapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //1-AdapterView
    RecyclerView recyclerView;
    // 2 Data Source
    VaccineModel[] myListData;
    //covid vaccines
    //pfizer bioNTech
    //moderna
    //AstarZeneca
    //CovidSHield
    //Covaxin
    //SputnikV

    // 3rd step is to connect adapter view with the data source using adapter
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        myListData = new VaccineModel[]{
                new VaccineModel("Pfizer bioNtech",R.drawable.pfizerone),
                new VaccineModel("moderna",R.drawable.moderna),
                new VaccineModel("AstraZeneca", R.drawable.astrazeneca),
                new VaccineModel("Covid Shield", R.drawable.covidshield),
                new VaccineModel("Covaxin", R.drawable.covaxin),
                new VaccineModel("spikevat", R.drawable.spikevat),
                new VaccineModel("NovaWax", R.drawable.novawax),
                new VaccineModel("Sanofi", R.drawable.sanofi),
                new VaccineModel("Valneva", R.drawable.valneva),
                new VaccineModel("Zf", R.drawable.zf),
                new VaccineModel("evac", R.drawable.evac),
                new VaccineModel("Quaz", R.drawable.quaz),
                new VaccineModel("CoVIran", R.drawable.iran),
                new VaccineModel("SputnikV",R.drawable.sputnik)

        };


        //Adapter
        adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}