package com.ns.android.ns_app.Service;


import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

import com.ns.android.ns_app.MainActivity;
import com.ns.android.ns_app.SaveMainActivity;

/**
 * Created by I337241 on 5/25/2017.
 */

public class MyNotificationListenerService extends NotificationListenerService {
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        // TODO Auto-generated method stub
        Notification mNotification = sbn.getNotification();
        if (mNotification != null) {
            Message ms = new Message();
            Bundle bundle = new Bundle();
            bundle.putString("title","new message title");
            bundle.putString("content","new message content");
            ms.setData(bundle);
            SaveMainActivity.getMa().getHandler().sendMessage(ms);
        }
    }


    @Override
    public void onNotificationRemoved(StatusBarNotification arg0) {
// TODO Auto-generated method stub


    }

}
