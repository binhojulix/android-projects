package br.com.lopes.heider.android_sensores;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


public class ListaSensores extends Activity {

    private ListView lvSensores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sensores);
        lvSensores = (ListView)findViewById(R.id.lvSensores);
        lvSensores.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1, loadSensores() ));
    }

    private List<Sensor> loadSensores() {
        SensorManager sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> listSensor = sensorManager.getSensorList(Sensor.TYPE_ALL);
        return listSensor;
    }
}
