package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovie;
    private ArrayList<MovieModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovie = findViewById(R.id.activity_main_rv);
        rvMovie.setHasFixedSize(true);
        list.addAll(MovieData.getListData());

        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        MovieAdaptor movieAdaptor = new MovieAdaptor(MovieData.getListData(), this);
        rvMovie.setAdapter(movieAdaptor);



    }
}