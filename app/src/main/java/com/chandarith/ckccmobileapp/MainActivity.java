package com.chandarith.ckccmobileapp;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chan Darith on 9/22/2017.
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private List<Listitem> listitems = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;
    private NavigationView navigationView;

    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;

    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ToolBar
        mToolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mToolbar);
        setTitle("CKCC Mobile Application");

        //ActionBarDrawerToggle
        mDrawerlayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerlayout, R.string.open, R.string.close);

        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);


        //recyclerview

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        mAdapter = new MyAdapter(listitems);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }


    private void prepareMovieData() {

        Listitem movie = new Listitem("Mad Max: Fury Road", "Action & Adventure", "2015");
        listitems.add(movie);

        movie = new Listitem("Inside Out", "Animation, Kids & Family", "2015");
        listitems.add(movie);

        movie = new Listitem("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        listitems.add(movie);

        movie = new Listitem("Shaun the Sheep", "Animation", "2015");
        listitems.add(movie);

        movie = new Listitem("The Martian", "Science Fiction & Fantasy", "2015");
        listitems.add(movie);

        movie = new Listitem("Mission: Impossible Rogue Nation", "Action", "2015");
        listitems.add(movie);

        movie = new Listitem("Up", "Animation", "2009");
        listitems.add(movie);

        movie = new Listitem("Star Trek", "Science Fiction", "2009");
        listitems.add(movie);

        movie = new Listitem("The LEGO Movie", "Animation", "2014");
        listitems.add(movie);

        movie = new Listitem("Iron Man", "Action & Adventure", "2008");
        listitems.add(movie);

        movie = new Listitem("Aliens", "Science Fiction", "1986");
        listitems.add(movie);

        movie = new Listitem("Chicken Run", "Animation", "2000");
        listitems.add(movie);

        movie = new Listitem("Back to the Future", "Science Fiction", "1985");
        listitems.add(movie);

        movie = new Listitem("Raiders of the Lost Ark", "Action & Adventure", "1981");
        listitems.add(movie);

        movie = new Listitem("Goldfinger", "Action & Adventure", "1965");
        listitems.add(movie);

        movie = new Listitem("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        listitems.add(movie);

        mAdapter.notifyDataSetChanged();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ProfileClick(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);

    }

    public void OnLogoutButtonClick(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_news:
                Intent intent = new Intent(this, NewsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_trainingcourses:
               Intent intent1 = new Intent(this, TrainingActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_userprofile:
                Intent intent2 = new Intent(this, UserProfileActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_Setting:
                Intent intent3 = new Intent(this, SettingActivity.class);
                startActivity(intent3);
                break;
        }

        return true;

    }

    /*@Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.nav_news){
            Intent newsintent = new Intent(this,NewsActivity.class);
            startActivity(newsintent);
        }
        return false;
    }*/
}