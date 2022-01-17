package com.example.android_id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String deviceID;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx=(TextView) findViewById(R.id.AID);
        deviceID= Settings.Secure.getString(this.getContentResolver(),Settings.Secure.ANDROID_ID);

        tx.setText(deviceID.toString());

    }
}