package heiderlopes.com.br.demonetcoders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import heiderlopes.com.br.demonetcoders.dao.CarroDAO;
import heiderlopes.com.br.demonetcoders.dao.CarroDAOImpl;
import heiderlopes.com.br.demonetcoders.model.Carro;

public class CadastroActivity extends AppCompatActivity {

    private EditText etPlaca;
    private EditText etMarca;
    private Spinner spCombustivel;
    private EditText etFabricacao;
    private EditText etModelo;

    private CarroDAO carroDAO;
    private Carro carro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cadastro);

        carro = new Carro();
        carroDAO = new CarroDAOImpl();

        setUpView();
        preencheCampos();
    }

    private void setUpView() {
        etPlaca = (EditText) findViewById(R.id.etPlaca);
        etMarca = (EditText) findViewById(R.id.etMarca);
        spCombustivel = (Spinner) findViewById(R.id.spCombustivel);
        etFabricacao = (EditText) findViewById(R.id.etFabricacao);
        etModelo = (EditText) findViewById(R.id.etModelo);
    }

    private void preencheCampos() {
        if(getIntent().getExtras() != null) {
            int id = getIntent().getExtras().getInt("id");
            carro = carroDAO.buscarPorId(id);
            etMarca.setText(carro.getMarca());
            etPlaca.setText(carro.getPlaca());
            etFabricacao.setText(String.valueOf(carro.getFabricacao()));
            etModelo.setText(String.valueOf(carro.getModelo()));
            List combustiveis = Arrays.asList(getResources().getStringArray(R.array.combustiveis));
            spCombustivel.setSelection(combustiveis.indexOf(carro.getCombustivel()));
        } else {
            carro = new Carro();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_cadastro, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_save:
                salvar();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void salvar() {
        carro.setMarca(etMarca.getText().toString());
        carro.setPlaca(etPlaca.getText().toString());
        carro.setCombustivel(
                spCombustivel.getSelectedItem()
                        .toString());

        carro.setFabricacao(Integer.parseInt(
                etFabricacao.getText().toString()));

        carro.setModelo(Integer.parseInt(
                etModelo.getText().toString()));

        if(carroDAO.gravar(carro)) {
            Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.msg_sucesso),
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.msg_erro),
                    Toast.LENGTH_LONG).show();
        }
    }
}
