package br.com.lopes.heider.android_sensores;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;


public class SensorLuzActivity extends Activity {

    private TextView textLIGHT_available, textLIGHT_reading, LIGHT_reading_value;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_luz);

        textLIGHT_available
                = (TextView)findViewById(R.id.LIGHT_available);
        textLIGHT_reading
                = (TextView)findViewById(R.id.LIGHT_reading);

        LIGHT_reading_value = (TextView)findViewById(R.id.LIGHT_reading_value);

        SensorManager mySensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);

        Sensor LightSensor = mySensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if(LightSensor != null){
            textLIGHT_available.setText("Sensor.TYPE_LIGHT Available");
            mySensorManager.registerListener(
                    LightSensorListener,
                    LightSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);

        }else{
            textLIGHT_available.setText("Sensor.TYPE_LIGHT NOT Available");
        }
    }

    private final SensorEventListener LightSensorListener
            = new SensorEventListener(){

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onSensorChanged(SensorEvent event) {
            if(event.sensor.getType() == Sensor.TYPE_LIGHT){
                textLIGHT_reading.setText("LIGHT: " );
                LIGHT_reading_value.setText(String.valueOf(event.values[0]));
            }
        }

    };
}
