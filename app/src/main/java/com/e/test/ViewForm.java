package com.e.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

    public class ViewForm extends AppCompatActivity implements AdapterView.OnItemSelectedListener, RadioGroup.OnCheckedChangeListener {
        Spinner sc,sd;
        RadioGroup radiogrp1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view_form);
            sc=findViewById(R.id.planets_spinnerC);
            sc.setOnItemSelectedListener(this);

            sd=findViewById(R.id.planets_spinnerD);
            sd.setOnItemSelectedListener(this);

            radiogrp1=findViewById(R.id.radioGroup1);
            radiogrp1.setOnCheckedChangeListener(this);

            // Create an ArrayAdapter using the string array and a default spinner layout
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                    R.array.class_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
            sc.setAdapter(adapter);

            ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                    R.array.Div_array, android.R.layout.simple_spinner_item);
            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sd.setAdapter(adapter1);
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }


        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

            switch (checkedId) {
                case R.id.DateRadio:
                    Toast.makeText(getApplicationContext(), "Date", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.Weekradio:
                    Toast.makeText(getApplicationContext(), "week", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.MonthRadio:
                    Toast.makeText(getApplicationContext(), "month", Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    }
