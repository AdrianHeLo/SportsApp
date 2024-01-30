package net.oliversne.sportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.oliversne.sportsapp.Adapters.SportAdapter;
import net.oliversne.sportsapp.Models.Sport;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Adapter View
    private RecyclerView recyclerView;
    //Data Source
    private List<Sport> sportList;
    //Adapter
    private SportAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        sportList = new ArrayList<>();

        Sport s1 = new Sport("Football", R.drawable.football);
        Sport s2 = new Sport("Basketball", R.drawable.basketball);
        Sport s3 = new Sport("Tennis", R.drawable.tennis);
        Sport s4 = new Sport("Volleyball", R.drawable.volley);
        Sport s5 = new Sport("Ping Pong", R.drawable.ping);

        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        sportList.add(s5);

        adapter = new SportAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}