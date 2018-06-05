package com.astroweatherapp.jakub.astroweather2.Astro;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.astroweatherapp.jakub.astroweather2.R;

/**
 * Created by Jakub on 2018-06-05.
 */

public class AstroWeatherActivity extends FragmentActivity {

    PageAdapter adapter;

    private SharedPreferences preferences;
    private float latitude,longitude;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(isPortrait()){
            setContentView(R.layout.astro_portrait_activity);
            ViewPager pager = findViewById(R.id.VPager);
            adapter = new PageAdapter(getSupportFragmentManager());
            pager.setAdapter(adapter);

        }
        if (isLandscape()){
            setContentView(R.layout.astro_landscape_activity);
        }
    }




    boolean isPortrait(){
        return getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT;
    }

    boolean isLandscape(){
        return getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
    }
}
