package org.eclipse.uprotocol.v1.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.protobuf.InvalidProtocolBufferException;

import org.eclipse.uprotocol.v1.UAttributes;
import org.eclipse.uprotocol.v1.UMessageType;
import org.eclipse.uprotocol.v1.UPriority;

import java.util.Optional;

public class ParcelableUAttributesProtobuf implements Parcelable {

    protected UAttributes attributes;

    public ParcelableUAttributesProtobuf(@NonNull UAttributes attr) {
        attributes = attr;
    }

    public ParcelableUAttributesProtobuf(Parcel in) {
    }

    public static final Creator<ParcelableUAttributesProtobuf> CREATOR = new Creator<ParcelableUAttributesProtobuf>() {
        @Override
        public ParcelableUAttributesProtobuf createFromParcel(Parcel in) {
            return new ParcelableUAttributesProtobuf(in);
        }

        @Override
        public ParcelableUAttributesProtobuf[] newArray(int size) {
            return new ParcelableUAttributesProtobuf[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel out, int i) {
        out.setDataPosition(0);
        out.writeByteArray(attributes.toByteArray());
    }

    public @NonNull Optional<UAttributes> readFromParcel(@NonNull Parcel in) {
        in.setDataPosition(0);
        try {
            byte[] data = in.createByteArray();
            if (data != null) {
                return Optional.ofNullable(UAttributes.parseFrom(data)); // Use ofNullable in case attributes is null
            }
        } catch (InvalidProtocolBufferException e) {
            Log.d("Ooopsies", "You triggered an InvalidProtocolBufferException! " + e.getMessage());
            // Log the exception message
        }
        return Optional.empty();
    }
}
