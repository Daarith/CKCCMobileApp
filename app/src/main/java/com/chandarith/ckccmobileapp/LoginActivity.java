package com.chandarith.ckccmobileapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Chan Darith on 9/22/2017.
 */

public class LoginActivity extends Activity {

    private final String APP_USERNAME="rith";
    private final String APP_PASSWORD="12345";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginButtonClick (View view){
        EditText etxtusername = (EditText) findViewById(R.id.un);
        EditText etxtpassword = (EditText) findViewById(R.id.ps);

        String inputusername = etxtusername.getText().toString();
        String inputpassword = etxtpassword.getText().toString();

        if (inputusername.equals(APP_USERNAME) && inputpassword.equals(APP_PASSWORD)){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);
            alertdialog.setTitle("Login Fail");
            alertdialog.setMessage("Incorrect username or password");
            alertdialog.setPositiveButton("OK",null);
            alertdialog.show();
        }
    }
}
