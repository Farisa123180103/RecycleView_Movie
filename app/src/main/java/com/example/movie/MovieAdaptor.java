package com.example.movie;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MovieAdaptor extends RecyclerView.Adapter<MovieAdaptor.ViewHolder>{
    private Context context;
    private ArrayList<MovieModel> movieModels;

    public MovieAdaptor(ArrayList<MovieModel>movieModels, Context context) {
        this.context = context;
        this.movieModels = movieModels;
    }

    @NonNull
    @Override
    public MovieAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_view,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdaptor.ViewHolder holder, int i) {
        holder.judul.setText(getMovieModels().get(i).getJudul());
        holder.genre.setText(getMovieModels().get(i).getGenre());
        holder.starring.setText(getMovieModels().get(i).getStarring());
        holder.director.setText(getMovieModels().get(i).getDirector());
//        holder.sinopsis.setText(getMovieModels().get(i).getSinopsis());
//        holder.gambar.setImageResource(getMovieModels().get(i).getGambar());
        Glide.with(context).load(getMovieModels().get(i).getGambar()).into(holder.gambar);
        holder.details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(context ,
                        Detail.class);
//                moveIntent.putExtra(Detail.EXTRA_DATA, movieModels);
                moveIntent.putExtra("judul",getMovieModels().get(i).getJudul());
                moveIntent.putExtra("genre",getMovieModels().get(i).getGenre());
                moveIntent.putExtra("starring",getMovieModels().get(i).getStarring());
                moveIntent.putExtra("director",getMovieModels().get(i).getDirector());
                moveIntent.putExtra("gambar",getMovieModels().get(i).getGambar());
                moveIntent.putExtra("sinopsis",getMovieModels().get(i).getSinopsis());
                context.startActivity(moveIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getMovieModels().size();
    }

    public ArrayList<MovieModel> getMovieModels() {
        return movieModels;
    }

//    public void setMovieModels(ArrayList<MovieModel> movieModels) {
//        this.movieModels = movieModels;
//    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView gambar;
        TextView judul, genre, director, starring, sinopsis;
        Button details;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar);
            judul = itemView.findViewById(R.id.judul);
            genre = itemView.findViewById(R.id.genre);
            starring = itemView.findViewById(R.id.starring);
            director = itemView.findViewById(R.id.director);
//            sinopsis = itemView.findViewById(R.id.sinopsis);
            details = itemView.findViewById(R.id.btn_detail);


        }
    }


}
