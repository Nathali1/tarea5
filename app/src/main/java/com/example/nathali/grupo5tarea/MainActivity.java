package com.example.nathali.grupo5tarea;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info =(TextView)findViewById(R.id.info);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setTitle("IdeasClick");
        actionBar.setIcon(R.mipmap.ic_launcher);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.rgb(10, 135, 135)));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.opcionbuscar:
                //metodoAdd()
                info.setText("Se presionó la opción Buscar");
                return true;
            case R.id.opcionamarillo:
                //metodoSearch()
                info.setText("Se presionó el color amarillo");
                info.setTextColor(Color.YELLOW);
                return true;
            case R.id.opcionverde:
                //metodoEdit()
                info.setText("Se presionó el color verde");
                info.setTextColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
