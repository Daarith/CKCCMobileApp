package com.chandarith.ckccmobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Chan Darith on 9/30/2017.
 */

public class TrainingActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
       loadTrainingCourse();
    }

    public void loadTrainingCourse(){
        String url = "http://test.js-cambodia.com/ckcc/courses.json";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest articlesRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(articlesRequest);
    }

    public void BackButton(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
