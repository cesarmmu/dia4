package com.azpe.cou.clasedia4;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaPersonalizada extends ListActivity {

    ArrayList<HashMap<String, String>> Eventos;

    String[] from =new String[]{"Hora", "Name", "Desc"};
    int[] to = new int[]{R.id.hora, R.id.nombre, R.id.desc};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividadlistapersonalizada);

        ArrayList<String[]> lista = new ArrayList<String[]>();

        String[] evento1 = {"11:30", "Ofrenda de flores a la patrona",
                "Participa el pueblo en la ofrenda"};
        String[] evento2 = {"12:30", "Partido de futbol",
                "Partido de futbol solteros contra casados"};
        String[] evento3 = {"15:00", "Paella",
                "Gran paellada para todos"};

        lista.add(evento1);
        lista.add(evento2);
        lista.add(evento3);

        Eventos = new ArrayList<HashMap<String, String>>();

        for(String[] evento:lista){
            HashMap<String, String> datosEvento = new HashMap<String, String>();
            datosEvento.put("Hora", evento[0]);
            datosEvento.put("Name", evento[1]);
            datosEvento.put("Desc", evento[2]);

            Eventos.add(datosEvento);
        }

        SimpleAdapter ListAdapter = new SimpleAdapter(this, Eventos,
                R.layout.listapersonalizada, from, to);

        setListAdapter(ListAdapter);
    }
}
