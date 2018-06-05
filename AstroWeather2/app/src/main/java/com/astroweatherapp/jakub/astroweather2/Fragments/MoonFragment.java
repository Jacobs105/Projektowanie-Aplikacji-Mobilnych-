package com.astroweatherapp.jakub.astroweather2.Fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroDateTime;
import com.astroweatherapp.jakub.astroweather2.Astro.AstroDateCalendarParser;
import com.astroweatherapp.jakub.astroweather2.MainActivity;
import com.astroweatherapp.jakub.astroweather2.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Jakub on 2018-06-05.
 */

public class MoonFragment extends Fragment {


    private MoonFragment moonFragment;
    private View v;
    private TextView latitude_Text, longitude_Text,wsch,zach,faza,dzien,pelnia,now;
    private SharedPreferences sharedPreferences;
    private float latitude,longitude;
    private int timeZone;
    NumberFormat formatter = new DecimalFormat("#0.00");
    final Handler refreshHandler = new Handler();
    protected View mView;
    private MainActivity mainActivity;
    private int seconds;


    public MoonFragment(){}

    public Fragment newInstance() {
        if (moonFragment==null)
            moonFragment = new MoonFragment();
        return moonFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.moon_fragment,container,false);
        sharedPreferences = getActivity().getSharedPreferences("Settings", Context.MODE_PRIVATE);

        mView = v;
        update(v);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                latitude = sharedPreferences.getFloat("latitude",20);
                longitude = sharedPreferences.getFloat("longitude",20);
                timeZone = sharedPreferences.getInt("timeZone",1);
                seconds = sharedPreferences.getInt("refresh",5);

                System.out.println("TIME : "+seconds);

                Toast.makeText(v.getContext(), "Updated Moon", Toast.LENGTH_SHORT).show();
                update(mView);
                refreshHandler.postDelayed(this, seconds * 1000);
            }
        };
        refreshHandler.postDelayed(runnable, seconds * 1000);


        return v;

    }

    private void update(View v) {


       AstroDateTime dateTime = AstroDateCalendarParser.getNow(timeZone);
       AstroCalculator.Location location =new AstroCalculator.Location(latitude,longitude);
       AstroCalculator calculator = new AstroCalculator(dateTime,location);
       AstroCalculator.MoonInfo moonInfo = calculator.getMoonInfo();

        latitude_Text = v.findViewById(R.id.Moon_latitude);
        longitude_Text = v.findViewById(R.id.Moon_longitude);
        wsch = v.findViewById(R.id.Moon_wsch);
        zach = v.findViewById(R.id.Moon_zach);
        pelnia = v.findViewById(R.id.Moon_pelniia);
        now = v.findViewById(R.id.Moon_now);
        faza = v.findViewById(R.id.Moon_faza);
        dzien = v.findViewById(R.id.Moon_dzien_s);

        latitude_Text.setText(""+latitude);
        longitude_Text.setText(""+longitude);
        wsch.setText(""+AstroDateCalendarParser.getDateTime(moonInfo.getMoonrise()));
        zach.setText(""+AstroDateCalendarParser.getDateTime(moonInfo.getMoonset()));
        pelnia.setText(""+AstroDateCalendarParser.getDateTime(moonInfo.getNextFullMoon()));
        now.setText(""+AstroDateCalendarParser.getDateTime(moonInfo.getNextNewMoon()));
        faza.setText(""+formatter.format(moonInfo.getIllumination() * 100)+"%");
        dzien.setText(""+formatter.format(moonInfo.getAge()%29.530588853));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


    }
}
