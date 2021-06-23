package com.hamza.wificontrtoller;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnon,btnoff;
WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnon=(Button)findViewById(R.id.btnTurnOn);
        btnoff=(Button)findViewById(R.id.btnTurnOff);

        btnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager=(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                Toast.makeText(MainActivity.this, "Wifi Turn On", Toast.LENGTH_SHORT).show();
            }
        });

        btnoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager=(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                Toast.makeText(getApplicationContext(),"Wifi Turn Off",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
