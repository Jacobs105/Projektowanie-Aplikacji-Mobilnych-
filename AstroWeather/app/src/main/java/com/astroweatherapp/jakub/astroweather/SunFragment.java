package com.astroweatherapp.jakub.astroweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jakub on 2018-04-26.
 */

public class SunFragment extends android.app.Fragment  {

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       View view = inflater.inflate(R.layout.fragment_sun,container,false);

       final TextView textViewS = view.findViewById(R.id.TextS);
       Button buttonS = view.findViewById(R.id.ButtonS);

       buttonS.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              textViewS.setText("SUN");
           }
       });
       return view;
   }
}
