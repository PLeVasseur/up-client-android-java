package org.eclipse.uprotocol;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyIUBusService extends Service {
    private final MyIUBus myIUBus = new MyIUBus();

    @Override
    public IBinder onBind(Intent intent) {
        return myIUBus.asBinder();
    }
}
