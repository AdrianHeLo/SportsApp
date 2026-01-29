package com.adrianhelo.sportsapp.ui

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adrianhelo.sportsapp.R
import com.adrianhelo.sportsapp.adapter.SportsAdapter
import com.adrianhelo.sportsapp.model.SportsModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1.- ListView
        val listView: RecyclerView = findViewById(R.id.activity_main_recycler_view)
        listView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // 2.- Data Source
        val sportList = ArrayList<SportsModel>()
        val sport1 = SportsModel("Football", R.drawable.football)
        val sport2 = SportsModel("Tennis", R.drawable.tennis)
        val sport3 = SportsModel("Basketball", R.drawable.basketball)
        val sport4 = SportsModel("Ping Pong", R.drawable.ping)
        val sport5 = SportsModel("Volley", R.drawable.volley)
        sportList.add(sport1)
        sportList.add(sport2)
        sportList.add(sport3)
        sportList.add(sport4)
        sportList.add(sport5)

        // 3.- Adapter
        val sportsAdapter = SportsAdapter(sportList)
        listView.adapter = sportsAdapter
    }
}