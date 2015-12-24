package br.com.fabio.demoeventbus;

import android.app.usage.UsageEvents;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.fabio.demoeventbus.eventos.EventoCarregar;
import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {
    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvStatus = (TextView) findViewById(R.id.tvstatus);
        EventBus.getDefault().register(this);
    }//


    protected void onEvent(EventoCarregar event) {
        tvStatus.setText(tvStatus.getText() + "\n" + event.getData());
    }

    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }
}
