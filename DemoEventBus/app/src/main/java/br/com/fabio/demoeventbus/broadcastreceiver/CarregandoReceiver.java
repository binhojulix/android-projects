package br.com.fabio.demoeventbus.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.format.Time;
import android.util.Log;

import java.util.Calendar;
import java.util.Timer;

import br.com.fabio.demoeventbus.eventos.EventoCarregar;
import de.greenrobot.event.EventBus;

/**
 * Created by rm40246 on 10/12/2015.
 */
public class CarregandoReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        EventoCarregar eventoCarregar = null;
        Time agora = new Time();
        agora.setToNow();
        String horaEvento = agora.format("%H:%M:%S");

        if (intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)) {
            eventoCarregar = new EventoCarregar("Carregando desde as " + horaEvento);
        } else if (intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)) {
           eventoCarregar = new EventoCarregar("Descarregando desde as " + horaEvento);
        }

        EventBus.getDefault().post(eventoCarregar);
    }
}
