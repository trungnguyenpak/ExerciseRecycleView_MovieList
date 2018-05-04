package com.trungnguyeen.exerciserecycleview_movielist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trungnguyeen.exerciserecycleview_movielist.R;
import com.trungnguyeen.exerciserecycleview_movielist.model.Movie;

import java.util.ArrayList;

/**
 * Created by trungnguyeen on 11/17/17.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieListViewHolder>{

    private ArrayList<Movie> mMovieList;

    @Override
    public MovieAdapter.MovieListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.custom_movie_item, parent, false);

        return new MovieListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MovieListViewHolder holder, int position) {
        Movie item = this.mMovieList.get(position);
        holder.bindView(item);
    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    public void setmMovieList(ArrayList<Movie> arrlist){
        this.mMovieList = arrlist;
    }

    public static class MovieListViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvGenre;
        public TextView tvYear;

        public MovieListViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvGenre = itemView.findViewById(R.id.tv_genre);
            tvYear = itemView.findViewById(R.id.tv_year);
        }

        public void bindView(Movie item){
            tvTitle.setText(item.getmTitle());
            tvGenre.setText(item.getmGenre());
            tvYear.setText(item.getmYear());
        }
    }
}
