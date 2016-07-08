package com.azpe.cou.clasedia4;

import android.content.pm.ActivityInfo;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int numero1 = 0;
    private int numero2 = 0;
    private int operacion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        /*if (getRequestedOrientation()== ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            //
        }*/

        int layoutId;

        int orienation = getResources().getConfiguration().orientation;

        if (orienation == Configuration.ORIENTATION_LANDSCAPE){
            layoutId = R.layout.vistahoriziontal;
        }
        else{
            layoutId = R.layout.activity_main;
        }

        setContentView(layoutId);
    }

    public void MostrarNumero(View v){

        TextView lbl = (TextView)findViewById(R.id.lblResultado);

        lbl.setText(lbl.getText().toString() + ((Button)v).getText().toString());


    }

    public  void Calcular(View v){
        TextView lbl = (TextView)findViewById(R.id.lblResultado);
        switch (v.getId()){
            case R.id.btnSuamar:
            case R.id.btnRestar:
            case R.id.btnMultiplicar:
            case R.id.btnDividir:
                numero1 = Integer.parseInt(lbl.getText().toString());
                operacion = v.getId();
                lbl.setText("");
                break;
            case R.id.btnBorrar:
                numero1 = 0;
                numero2 = 0;
                operacion = 0;
                lbl.setText("");
                break;
            case R.id.btnIgula:
                numero2 = Integer.parseInt(lbl.getText().toString());

                switch (operacion){
                    case R.id.btnSuamar:
                        lbl.setText("" + (numero1 + numero2));
                        break;
                    case R.id.btnRestar:
                        lbl.setText("" + (numero1 - numero2));
                        break;
                    case R.id.btnMultiplicar:
                        lbl.setText("" + (numero1 * numero2));
                        break;
                    case R.id.btnDividir:
                        lbl.setText("" + (numero1 / numero2));
                        break;
                }

                break;
        }

    }
}
