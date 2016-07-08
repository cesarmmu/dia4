package com.azpe.cou.clasedia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListaPrimera extends AppCompatActivity {

    private  String[] ciudades = {"Madrid", "Malaga", "Valencia", "Sevilla", "Barcelona"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_primera);

        ListView lst = (ListView)findViewById(R.id.listView);

        lst.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        /*ArrayAdapter<String> arrCiudades = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, ciudades);

        lst.setAdapter(arrCiudades);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), ciudades[position], Toast.LENGTH_SHORT).show();
            }
        });*/

        ArrayAdapter<String> arrCiudades = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, ciudades);

        lst.setAdapter(arrCiudades);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleccion = "";
                ListView lst = (ListView) parent;

                for (int i=0; i < parent.getCount(); i++){
                    if (lst.isItemChecked(i)){
                        seleccion += parent.getItemAtPosition(i) + "\n";
                    }
                }

                Toast.makeText(getApplicationContext(), seleccion, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
