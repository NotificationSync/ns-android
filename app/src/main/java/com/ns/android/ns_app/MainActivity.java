package com.ns.android.ns_app;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ns.android.ns_app.Service.MyNotificationListenerService;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    static Myhandler mh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.NotificationText);
        Intent i = new Intent(MainActivity.this, MyNotificationListenerService.class);
        startService(i);
    }
    public Myhandler getHandler(){
        if(this.mh ==null){
            mh = new Myhandler();
            return mh;
        }
        else
            return mh;
    }

    class Myhandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            super.handleMessage(msg);
            // 此处可以更新UI
            tv.append(msg.getData().toString());
        }
    }
}
