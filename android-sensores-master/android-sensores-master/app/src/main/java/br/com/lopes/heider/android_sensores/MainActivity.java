package br.com.lopes.heider.android_sensores;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listaSensores(View v) {
        startActivity(new Intent(this, ListaSensores.class));

    }

    public void sensorLuz(View v) {
        startActivity(new Intent(this, SensorLuzActivity.class));

    }

    public void sensorProximidade(View v) {
        startActivity(new Intent(this, SensorProximidadeActivity.class));

    }
}

