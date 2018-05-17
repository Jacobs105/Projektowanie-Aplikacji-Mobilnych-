package com.astroweatherapp.jakub.astroweather;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 202332 on 4/27/2018.
 */

class CustomPageAdapter extends FragmentStatePagerAdapter {


    public CustomPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new SunFragment();
        }else if (position == 1){
            return new MoonFragment();
        }else{
            return new SunFragment();
        }

    }
}
