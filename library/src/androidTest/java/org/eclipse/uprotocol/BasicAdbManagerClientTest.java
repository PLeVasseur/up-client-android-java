package org.eclipse.uprotocol;

import static android.app.PendingIntent.getActivity;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;

import android.content.Context;
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

public class BasicAdbManagerClientTest {

    String TAG = "BasicAdbManagerClientTest";

    @Test
    public void connectToAdbManager() {
        Log.i(TAG, "entered connectToAdbManager");

        Object adbManagerObject = getApplicationContext().getSystemService("adb");

        if (adbManagerObject == null) {
            Log.i(TAG, "failed to get adbManagerObject");
        } else {
            Log.i(TAG, "was able to get adbManagerObject");
        }
    }
}
