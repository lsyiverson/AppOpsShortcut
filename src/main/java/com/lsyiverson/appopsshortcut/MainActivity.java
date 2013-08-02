package com.lsyiverson.appopsshortcut;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.provider.Settings;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent("android.settings.APP_OPS_SETTINGS");
        startActivity(intent);
        finish();
    }

}
