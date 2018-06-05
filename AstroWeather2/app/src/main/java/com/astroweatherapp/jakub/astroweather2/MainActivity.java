package com.astroweatherapp.jakub.astroweather2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.astroweatherapp.jakub.astroweather2.Astro.AstroWeatherActivity;
import com.astroweatherapp.jakub.astroweather2.Settings.SettingsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        configureActivity(R.id.btn_astro,AstroWeatherActivity.class);
        configureActivity(R.id.btn_settings,SettingsActivity.class);

        Button exit = findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }

    private void configureActivity(int resource,final Class activityClass) {
        Button button = findViewById(resource);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,activityClass));
            }
        });
    }
}
