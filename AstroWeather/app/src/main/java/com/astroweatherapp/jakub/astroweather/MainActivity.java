package com.astroweatherapp.jakub.astroweather;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import android.os.Bundle;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    private final FragmentManager fm = getFragmentManager();
    private Fragment currentFragment = null;
    private PagerAdapter adapter;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager =  findViewById(R.id.viewPager);
        adapter = new CustomPageAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
    }

    @Override
    public void onBackPressed(){
        if(pager.getCurrentItem() == 0){
            super.onBackPressed();
        }else{
            pager.setCurrentItem(pager.getCurrentItem() - 1);
        }
    }


}



