package br.com.fabio.launcbroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void executarApp(View v){
       Intent intent = new Intent("br.com.fabio.demobroadcastreceiver.intent.demobroadcastreceiver");
        intent.putExtra("TITULO","Nova Mensagem");
        intent.putExtra("DESCRICAO","oi esse é um exemplo de notificacao com broadcastreceiver");
        intent.putExtra("TICKER","Você tem uma nova mensagem");
        sendBroadcast(intent);
    }
}
