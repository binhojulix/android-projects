package crud.binho.com.br.crudapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import crud.binho.com.br.crudapp.cerveja.Cerveja;

public class MainActivity extends AppCompatActivity {

    ListView listaDeCervejas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Cerveja> cervejas = Arrays.asList(
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"),
                new Cerveja("itaipava", 7, "itapiava"));

        listaDeCervejas = (ListView) findViewById(R.id.list_view);
        listaDeCervejas.setAdapter(new CervejaAdapter(cervejas, this));
    }
}
