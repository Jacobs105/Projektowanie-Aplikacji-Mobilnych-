package com.astroweatherapp.jakub.astroweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jakub on 2018-04-26.
 */

public class MoonFragment extends android.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_moon, container, false);

        final TextView textViewM = view.findViewById(R.id.TextM);
        Button buttonM = view.findViewById(R.id.ButtonM);

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewM.setText("MOON");
            }
        });
        return view;
    }

}
