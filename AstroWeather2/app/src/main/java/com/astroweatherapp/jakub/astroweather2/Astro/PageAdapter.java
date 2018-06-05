package com.astroweatherapp.jakub.astroweather2.Astro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astroweatherapp.jakub.astroweather2.Fragments.MoonFragment;
import com.astroweatherapp.jakub.astroweather2.Fragments.SunFragment;

/**
 * Created by Jakub on 2018-06-05.
 */

public class PageAdapter extends FragmentPagerAdapter {

    private SunFragment sunFragment;
    private MoonFragment moonFragment;

    public PageAdapter(FragmentManager fm) {
        super(fm);
        sunFragment = new SunFragment();
        moonFragment = new MoonFragment();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return sunFragment.newInstance();
            case 1:
                return moonFragment.newInstance();
            default:
                return sunFragment.newInstance();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
