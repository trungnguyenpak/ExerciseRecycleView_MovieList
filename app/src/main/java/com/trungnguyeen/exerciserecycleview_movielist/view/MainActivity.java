package com.trungnguyeen.exerciserecycleview_movielist.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.trungnguyeen.exerciserecycleview_movielist.R;
import com.trungnguyeen.exerciserecycleview_movielist.adapter.MovieAdapter;
import com.trungnguyeen.exerciserecycleview_movielist.model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovieList;
    private ArrayList<Movie> mMovieList;
    private MovieAdapter mMovieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Step 1: Setup recycleView
        rvMovieList = (RecyclerView) findViewById(R.id.recycle_movies);

        //Step 2: setup layout recycleview
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvMovieList.setLayoutManager(layoutManager);

        //Step 3: setup adapter
        mMovieAdapter = new MovieAdapter();

        this.mMovieList = new ArrayList<>();
        this.mMovieList.add(new Movie("Inside Out", "Animation, Kids & Family", "2015"));
        this.mMovieList.add(new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015"));
        this.mMovieList.add(new Movie("Shaun the Sheep", "Animation", "2015"));
        this.mMovieList.add(new Movie("The Martian", "Science Fiction & Fantasy", "2015"));
        this.mMovieList.add(new Movie("Mission: Impossible Rogue Nation", "Action", "2015"));
        this.mMovieList.add(new Movie("Up", "Animation", "2009"));
        this.mMovieList.add(new Movie("Star Trek", "Science Fiction", "2009"));

        mMovieAdapter.setmMovieList(this.mMovieList);
        rvMovieList.setItemAnimator(new DefaultItemAnimator());
        rvMovieList.setAdapter(mMovieAdapter);
    }
}
