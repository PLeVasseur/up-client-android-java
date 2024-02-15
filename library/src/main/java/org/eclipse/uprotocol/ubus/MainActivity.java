package org.eclipse.uprotocol.ubus;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.eclipse.uprotocol.client.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start your service
        Intent serviceIntent = new Intent(this, MyIUBusService.class);
        startService(serviceIntent);
    }
}