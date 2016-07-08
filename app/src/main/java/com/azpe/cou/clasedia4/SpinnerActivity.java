package com.azpe.cou.clasedia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SpinnerActivity extends AppCompatActivity {

    private  String[] ciudades = {"Madrid", "Malaga", "Valencia", "Sevilla", "Barcelona"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner sp = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> arrCiudades = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, ciudades);

        sp.setAdapter(arrCiudades);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView lbl = (TextView)findViewById(R.id.textView2);

                lbl.setText("Ha seleccionado la ciudad de " + ciudades[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
