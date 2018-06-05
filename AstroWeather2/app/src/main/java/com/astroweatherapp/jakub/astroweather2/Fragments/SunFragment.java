package com.astroweatherapp.jakub.astroweather2.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;
import com.astroweatherapp.jakub.astroweather2.Astro.AstroDateCalendarParser;
import com.astroweatherapp.jakub.astroweather2.R;

import java.text.DecimalFormat;

/**
 * Created by Jakub on 2018-06-05.
 */

public class SunFragment extends Fragment {

    private SunFragment sunFragment;
    private AstroCalculator.Location location;
    private AstroCalculator calculator;
    private AstroCalculator.SunInfo sunInfo;
    private AstroDateTime dateTime;
    private View v;
    private TextView latitude_Text,longitude_Text,wsch,zach,swit,zmierzch;
    private SharedPreferences sharedPreferences;
    private float latitude,longitude;
    private int timeZone;

    DecimalFormat azimuthFormatter = new DecimalFormat("#.##");
    final String DEGREE  = "\u00b0";

    public SunFragment(){}

    public  SunFragment newInstance(){
        System.out.println("SUN FRAGMENT");
        if (sunFragment==null)
            sunFragment = new SunFragment();
        return sunFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.sun_fragment,container,false);
        sharedPreferences = getActivity().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        latitude = sharedPreferences.getFloat("latitude",20);
        longitude = sharedPreferences.getFloat("longitude",20);
        timeZone = sharedPreferences.getInt("timeZone",1);


        dateTime = AstroDateCalendarParser.getNow(timeZone);
        location =new AstroCalculator.Location(latitude,longitude);
        calculator = new AstroCalculator(dateTime,location);
        sunInfo = calculator.getSunInfo();



        latitude_Text = v.findViewById(R.id.Sun_latitude);
        longitude_Text = v.findViewById(R.id.Sun_longitude);
        wsch = v.findViewById(R.id.Sun_wsch_azym);
        zach = v.findViewById(R.id.Sun_zach_azym);
        swit = v.findViewById(R.id.Sun_swit);
        zmierzch = v.findViewById(R.id.Sun_zmierzch);

        latitude_Text.setText(""+latitude);
        longitude_Text.setText(""+longitude);
        wsch.setText(""+AstroDateCalendarParser.getDateTime(sunInfo.getSunrise())+"\n "+azimuthFormatter.format(sunInfo.getAzimuthRise())+ DEGREE );
        zach.setText(""+AstroDateCalendarParser.getDateTime(sunInfo.getSunset())+"\n "+azimuthFormatter.format(sunInfo.getAzimuthSet())+DEGREE);
        swit.setText(""+AstroDateCalendarParser.getDateTime(sunInfo.getTwilightMorning()));
        zmierzch.setText(""+AstroDateCalendarParser.getDateTime(sunInfo.getTwilightEvening()));


        return v;

    }
}
