package com.example.student.rejestracjawizyt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<LEKARZ>lekarze=new ArrayList<>();
        lekarze.add(new LEKARZ("Adam Kowaliski","dermatolog"));
        lekarze.add(new LEKARZ("Jan Kowaliski","dermatolog"));
        lekarze.add(new LEKARZ("Michał Kowaliski","dermatolog"));
        lekarze.add(new LEKARZ("Piotrek Kowaliski","dermatolog"));

        LekarzAdapter lekarzAdapter=new LekarzAdapter(lekarze);
        recyclerView.setAdapter(lekarzAdapter);


    }
}
