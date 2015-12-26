package heiderlopes.com.br.demonetcoders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import heiderlopes.com.br.demonetcoders.adapter.CarroAdapter;
import heiderlopes.com.br.demonetcoders.dao.CarroDAO;
import heiderlopes.com.br.demonetcoders.dao.CarroDAOImpl;

public class VisualizarActivity extends AppCompatActivity {

    private ListView lvCarros;
    private CarroDAO carroDAO;
    private CarroAdapter carroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        lvCarros = (ListView)findViewById(R.id.lvCarros);
        carroDAO = new CarroDAOImpl();
        carroAdapter = new CarroAdapter(
                getApplicationContext(),
                carroDAO.listarTodos());

        lvCarros.setAdapter(carroAdapter);

        lvCarros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent cadastro = new Intent(getApplicationContext(), CadastroActivity.class);
                cadastro.putExtra("id", position);
                startActivity(cadastro);
                finish();
            }
        });

    }
}
