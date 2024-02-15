package org.eclipse.uprotocol.ubus;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import org.eclipse.uprotocol.core.ubus.IUBus;
import org.eclipse.uprotocol.core.ubus.IUListener;
import org.eclipse.uprotocol.v1.internal.ParcelableUEntity;
import org.eclipse.uprotocol.v1.internal.ParcelableUMessage;
import org.eclipse.uprotocol.v1.internal.ParcelableUStatus;
import org.eclipse.uprotocol.v1.internal.ParcelableUUri;

public class MyIUBus implements IUBus {

    private static final String TAG = "MyIUBus";

    @Override
    public ParcelableUStatus registerClient(String packageName, ParcelableUEntity entity, IBinder clientToken, int flags, IUListener listener) throws RemoteException {

        Log.i("MyIUBus", "entered registerClient");

        return null;
    }

    @Override
    public ParcelableUStatus unregisterClient(IBinder clientToken) throws RemoteException {
        // Implement logic here
        return null;
    }

    @Override
    public ParcelableUStatus send(ParcelableUMessage message, IBinder clientToken) throws RemoteException {
        // Implement logic here
        return null;
    }

    @Override
    public ParcelableUMessage[] pull(ParcelableUUri uri, int count, IBinder clientToken) throws RemoteException {
        // Implement logic here
        return null;
    }

    @Override
    public ParcelableUStatus enableDispatching(ParcelableUUri uri, IBinder clientToken) throws RemoteException {
        // Implement logic here
        return null;
    }

    @Override
    public ParcelableUStatus disableDispatching(ParcelableUUri uri, IBinder clientToken) throws RemoteException {
        // Implement logic here
        return null;
    }

    @Override
    public IBinder asBinder() {
        return null;
    }
}
