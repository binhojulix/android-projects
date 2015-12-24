package broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by rm40246 on 10/12/2015.
 */
public class BootBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Demo Broadcast","Boot Finalizado");
        Toast.makeText(context, "Boot Finalizado", 10000).show();
    }
}
