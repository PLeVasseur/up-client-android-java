package org.eclipse.uprotocol;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import org.eclipse.uprotocol.core.ubus.IUBus;
import org.eclipse.uprotocol.core.ubus.IUListener;
import org.eclipse.uprotocol.v1.UEntity;
import org.eclipse.uprotocol.v1.internal.ParcelableUEntity;
import org.eclipse.uprotocol.v1.internal.ParcelableUMessage;
import org.eclipse.uprotocol.v1.internal.ParcelableUStatus;
import org.junit.Test;

import java.lang.reflect.Method;

public class BasicUBusClientTest {

    @Test
    public void callRegisterClient() {
        Log.i("BasicUBusClientTest", "entered sitIdle");

        try {
            // Get the ServiceManager's class
            Class<?> serviceManager = Class.forName("android.os.ServiceManager");

            // Get the getService method
            Method getService = serviceManager.getMethod("getService", String.class);

            // Invoke getService to get the binder to your service
            IBinder binder = (IBinder) getService.invoke(null, "test-calling-client-iulistener-service");

            Log.d("ServiceConnector", "Binder object: " + binder);
            // You can now use this binder object to communicate with your service

            IUBus service = IUBus.Stub.asInterface(binder);

            IBinder clientToken = new Binder();

            UEntity entity = UEntity.newBuilder().setName("super_cool_name").build();

            ParcelableUEntity parcelableUEntity = new ParcelableUEntity(entity);

            int flags = 0;

            IUListener listener = new IUListener.Stub() {
                @Override
                public void onReceive(ParcelableUMessage event) throws RemoteException {

                }
            };

            ParcelableUStatus status = service.registerClient("your.package.name", parcelableUEntity, clientToken, flags, listener);

            Log.i("BasicUBusClientTest", "status: " + status.toString());
        } catch (Exception e) {
            // Handle exception
            Log.e("ServiceConnector", "Failed to connect to the service", e);
        }
    }
}
