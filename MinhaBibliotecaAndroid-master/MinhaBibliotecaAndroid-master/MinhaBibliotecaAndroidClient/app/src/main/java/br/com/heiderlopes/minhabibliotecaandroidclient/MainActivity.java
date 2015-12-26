package br.com.heiderlopes.minhabibliotecaandroidclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import br.com.heiderlopes.minhabibliotecaandroid.Matematica;

public class MainActivity extends AppCompatActivity {

    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvResultado.setText(String.valueOf(Matematica.somar(1, 2)));
    }
}
