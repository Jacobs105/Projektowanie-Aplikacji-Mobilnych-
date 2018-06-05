package com.astroweatherapp.jakub.astroweather2.Settings;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.astroweatherapp.jakub.astroweather2.R;

/**
 * Created by Jakub on 2018-06-05.
 */

public class SettingsActivity extends AppCompatActivity{

    private EditText getLatitude , getLongitude,getTimeZone;
    private float latitude,longitude;
    private int timeZone;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferences = getSharedPreferences("Settings", Context.MODE_PRIVATE);

        setContentView(R.layout.settings_activity);

        getLatitude = findViewById(R.id.get_latitude);

        getLongitude = findViewById(R.id.get_longitude);

        getTimeZone = findViewById(R.id.getTimeZone);


        Button exit = findViewById(R.id.btn_save_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferences.edit();
                latitude = Float.parseFloat(String.valueOf(getLatitude.getText()));
                longitude = Float.parseFloat(String.valueOf(getLongitude.getText()));
                timeZone = Integer.parseInt(String.valueOf(getTimeZone.getText()));
                editor.putFloat("latitude",latitude);
                editor.putFloat("longitude",longitude);
                editor.putInt("timeZone",timeZone);
                editor.commit();
                finish();
            }
        });

    }
}
