package com.ns.android.ns_app;

/**
 * Created by I337241 on 5/25/2017.
 */

public class SaveMainActivity {
    private static MainActivity ma ;

    public static MainActivity getMa() {
        return ma;
    }

    public static void setMa(MainActivity ma) {
        SaveMainActivity.ma = ma;
    }
}
