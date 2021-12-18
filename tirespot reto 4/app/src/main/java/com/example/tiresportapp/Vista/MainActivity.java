package com.example.tiresportapp.Vista;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tiresportapp.R;

import java.util.Timer;
import java.util.TimerTask;

    /*En esta iteracion se agrega la base de datos local SQL Open Helper
        y con esto se puede modificar la cantidad de productos que se tienen en
        el carrito y se agrego una notificacion cuando se va ha vaciar el carrito.
    */
//metodo principal de nuestra actividad
public class MainActivity extends AppCompatActivity {

    @Override
    //sobrescribe el metodo cuando se crea la actividad
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Catalogo.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);


    }


}
