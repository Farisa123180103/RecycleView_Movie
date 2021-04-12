package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

//    public static final String EXTRA_DATA = "EXTRA_DATA";
    
    ImageView ivgambar;
    TextView tvjudul, tvgenre, tvdirector, tvstarring, tvsinopsis;

    String judul, genre, director, starring, sinopsis, gambar;
//    int gambar;
//    private MovieModel movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivgambar = findViewById(R.id.gambar);
        tvjudul = findViewById(R.id.judul);
        tvgenre = findViewById(R.id.genre);
        tvdirector = findViewById(R.id.director);
        tvstarring = findViewById(R.id.starring);
        tvsinopsis = findViewById(R.id.sinopsis);

//        movie = getIntent().getParcelableExtra(EXTRA_DATA);

//        judul.setText(movie.getJudul());
//        genre.setText(movie.getGenre());
//        starring.setText(movie.getStarring());
//        sinopsis.setText(movie.getSinopsis());
//        gambar.setImageResource(movie.getGambar());

        judul = getIntent().getStringExtra("judul");
        genre = getIntent().getStringExtra("genre");
        director = getIntent().getStringExtra("director");
        starring = getIntent().getStringExtra("starring");
        sinopsis = getIntent().getStringExtra("sinopsis");
//        gambar = getIntent().getStringExtra("gambar");

        tvjudul.setText(judul);
        tvgenre.setText(genre);
        tvstarring.setText(starring);
        tvsinopsis.setText(sinopsis);
        tvdirector.setText(director);
        Glide.with(this).load(getIntent().getIntExtra("gambar",0)).into(ivgambar);
    }
}