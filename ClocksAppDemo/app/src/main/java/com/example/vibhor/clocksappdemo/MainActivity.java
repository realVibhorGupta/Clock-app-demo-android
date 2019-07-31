package com.example.vibhor.clocksappdemo;

import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.DigitalClock;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AnalogClock analogClock;
    private DigitalClock digitalClock ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        analogClock= (AnalogClock) findViewById(R.id.analogue_clock);
        digitalClock= (DigitalClock) findViewById(R.id.digital_clock);
    }
}
