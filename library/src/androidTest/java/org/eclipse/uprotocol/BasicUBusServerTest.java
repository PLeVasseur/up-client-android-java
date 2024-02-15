package org.eclipse.uprotocol;
import org.eclipse.uprotocol.ubus.MyIUBusService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

import android.content.Intent;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;

import java.util.concurrent.CountDownLatch;

public class BasicUBusServerTest {

    private Context context;
    private CountDownLatch latch;

    @Before
    public void setUp() {
        latch = new CountDownLatch(1); // Expecting one event
        context = ApplicationProvider.getApplicationContext();
        Intent serviceIntent = new Intent(context, MyIUBusService.class);
        context.bindService(serviceIntent, serviceConnection, Context.BIND_AUTO_CREATE);
        // Wait for the service to be connected
    }

    private final ServiceConnection serviceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Test
    public void sitIdle() {
        Log.i("BasicUBusServerTest", "entered sitIdle");

        try {
            latch.await(); // Wait for the service event
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // Handle the interruption appropriately
        }
    }

    @After
    public void tearDown() {
        context.unbindService(serviceConnection);
    }
}