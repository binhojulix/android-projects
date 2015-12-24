package broadcastreceiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

import br.com.fabio.demobroadcastreceiver.R;

/**
 * Created by rm40246 on 10/12/2015.
 */
public class MeuBroadCast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        builder.setContentTitle(intent.getStringExtra("TITULO"));
        builder.setContentText(intent.getStringExtra("DESCRICAO"));
        builder.setTicker(intent.getStringExtra("TICKER"));
        builder.setSmallIcon(R.mipmap.ic_launcher);
        notificationManager.notify(100, builder.build());






    }
}
