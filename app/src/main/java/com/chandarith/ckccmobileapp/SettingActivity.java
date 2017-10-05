package com.chandarith.ckccmobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Chan Darith on 9/30/2017.
 */

public class SettingActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void BackButton(View View){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
