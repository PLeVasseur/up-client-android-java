package org.eclipse.uprotocol;

import android.os.Parcel;
import android.util.Log;

import org.eclipse.uprotocol.transport.builder.UAttributesBuilder;
import org.eclipse.uprotocol.uri.builder.UResourceBuilder;
import org.eclipse.uprotocol.v1.UAttributes;
import org.eclipse.uprotocol.v1.UEntity;
import org.eclipse.uprotocol.v1.UPriority;
import org.eclipse.uprotocol.v1.UUri;
import org.eclipse.uprotocol.v1.internal.ParcelableUAttributesProtobuf;
import org.junit.Test;

public class ParcelableUAttributesProtobufStressTestWriteToParcel {
    @Test
    public void testWriteToParcelPerformance() {
        // Assuming a method createFullUAttributes() that creates a UAttributes object
        // with all fields set
        UAttributes fullAttributes = createFullUAttributes();
        ParcelableUAttributesProtobuf parcelableUAttributes = new ParcelableUAttributesProtobuf(fullAttributes);

        long startTime = System.nanoTime();

        // TODO: What's more representative -- having this inside of the loop or not?
        Parcel parcel = Parcel.obtain();

        for (int i = 0; i < 1000000; i++) {
//          // Parcel parcel = Parcel.obtain();
            parcelableUAttributes.writeToParcel(parcel, 0);
            parcel.setDataPosition(0); // Reset parcel for next write
        }

        long endTime = System.nanoTime();
        double averageTime = (endTime - startTime) / 1000000.0;

        Log.d("TestTag", "Protobuf: Average time per writeToParcel: " + averageTime + " ns");
    }

    // Mock method to create a UAttributes object with all fields set
    private UAttributes createFullUAttributes() {

        final UEntity SERVICE = UEntity.newBuilder()
                .setName("client.test")
                .setVersionMajor(1)
                .build();

        final UUri METHOD_URI = UUri.newBuilder()
                .setEntity(SERVICE)
                .setResource(UResourceBuilder.forRpcRequest("method"))
                .build();

        final int TTL = 5000;

        return UAttributesBuilder.request(UPriority.UPRIORITY_CS4, METHOD_URI, TTL).build();
    }
}
