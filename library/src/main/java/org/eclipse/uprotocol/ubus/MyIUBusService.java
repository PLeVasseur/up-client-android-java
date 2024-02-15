package org.eclipse.uprotocol.ubus;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import org.eclipse.uprotocol.ubus.MyIUBus;

public class MyIUBusService extends Service {
    private final MyIUBus myIUBus = new MyIUBus();

    @Override
    public IBinder onBind(Intent intent) {
        return myIUBus.asBinder();
    }
}
