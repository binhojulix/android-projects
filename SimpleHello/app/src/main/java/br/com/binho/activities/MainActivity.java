package br.com.binho.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.binho.simplehello.R;

import java.util.Arrays;
import java.util.List;

import br.com.binho.beer.Beer;

public class MainActivity extends AppCompatActivity  {

    ListView listaDeCervejas ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Beer> cervejas = Arrays.asList(
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"),
                new Beer("itaipava", 7, "itapiava"));
        Adapter adapter = new Adapter() {
        }
    }
}
