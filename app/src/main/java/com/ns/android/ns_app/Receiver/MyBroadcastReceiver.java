package com.ns.android.ns_app.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ns.android.ns_app.Service.MyNotificationListenerService;

/**
 * Created by I337241 on 5/25/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {     // boot
            Intent intent2 = new Intent(context,MyNotificationListenerService.class);
            context.startService(intent2);
        }
    }
}
