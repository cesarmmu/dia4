package com.azpe.cou.clasedia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Autocomplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete);

        String[] ciudades = {"Madrid", "Sevilla", " Malaga", "Barcelona", "Merida"};

        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> arrCiudades = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, ciudades);

        auto.setThreshold(2);
        auto.setAdapter(arrCiudades);
    }
}
