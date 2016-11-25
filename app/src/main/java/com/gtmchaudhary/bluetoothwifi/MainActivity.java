package com.gtmchaudhary.bluetoothwifi;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bluetooth, wifi;
    TextView blue,wi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bluetooth TOGGLE
        bluetooth = (Button)findViewById(R.id.bluetooth);
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blue = (TextView)findViewById(R.id.textView2);
                BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (mBluetoothAdapter.isEnabled()) {
                    mBluetoothAdapter.disable();
                    blue.setText("OFF");
                }
                else{
                    mBluetoothAdapter.enable();
                    blue.setText("ON");
         wifi = (Button)findViewById(R.id.wifi);
    }
}
});

        //Wifi TOGGLE

        View.OnClickListener wifiListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wi = (TextView)findViewById(R.id.textView4);
                WifiManager wifi1 = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                boolean b = wifi1.isWifiEnabled();
                if(b) {
                    wifi1.setWifiEnabled(false);
                    wi.setText("OFF");
                }
                else {
                    wifi1.setWifiEnabled(true);
                    wi.setText("ON");
                }
            }
        };
        wifi.setOnClickListener(wifiListener);

    }
}
