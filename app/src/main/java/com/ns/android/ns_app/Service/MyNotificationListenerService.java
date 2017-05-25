package com.ns.android.ns_app.Service;


import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

import com.ns.android.ns_app.MainActivity;

/**
 * Created by I337241 on 5/25/2017.
 */

public class MyNotificationListenerService extends NotificationListenerService {
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        // TODO Auto-generated method stub
        Notification mNotification = sbn.getNotification();
        if (mNotification != null) {

        }
    }


    @Override
    public void onNotificationRemoved(StatusBarNotification arg0) {
// TODO Auto-generated method stub


    }

}
