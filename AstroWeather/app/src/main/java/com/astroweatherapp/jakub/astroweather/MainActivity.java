package com.astroweatherapp.jakub.astroweather;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    private final FragmentManager fm = getFragmentManager();
    private Fragment currentFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if ((getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)){
            setSunFragment();
        }
    }

    private void setSunFragment() {
        FragmentTransaction ft = this.fm.beginTransaction();
        this.currentFragment = new SunFragment();
        ft.replace(R.id.fragment_container, this.currentFragment);
        ft.commit();
    }
    private void setMoonFragment(){
        FragmentTransaction ft = this.fm.beginTransaction();
        this.currentFragment = new MoonFragment();
        ft.replace(R.id.fragment_container, this.currentFragment);

        ft.addToBackStack(null);
        ft.commit();
    }
}
