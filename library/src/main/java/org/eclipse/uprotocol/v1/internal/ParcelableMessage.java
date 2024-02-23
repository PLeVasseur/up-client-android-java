/*
 * Copyright (c) 2024 General Motors GTO LLC
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * SPDX-FileType: SOURCE
 * SPDX-FileCopyrightText: 2023 General Motors GTO LLC
 * SPDX-License-Identifier: Apache-2.0
 */
package org.eclipse.uprotocol.v1.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;

import java.util.Objects;

/**
 * A parcelable wrapper base for protobuf messages.
 */
public abstract class ParcelableMessage<T extends Message> implements Parcelable {
    protected final T mMessage;

    protected ParcelableMessage(@NonNull Parcel in) {
        mMessage = readFromParcel(in);
    }

    protected ParcelableMessage(@NonNull T message) {
        mMessage = message;
    }

    @Override
    public void writeToParcel(@NonNull Parcel out, int flags) {
        final byte[] data = mMessage.toByteArray();
//        Log.d("ParcelableMessage", "writeToParcel: before out.writeInt: data size: " + out.dataSize() + " data position: " + out.dataPosition());
        out.writeInt(data.length);
//        Log.d("ParcelableMessage", "writeToParcel: after out.writeInt: data size: " + out.dataSize() + " data position: " + out.dataPosition());
//        Log.d("ParcelableMessage", "writeToParcel: before out.writeByteArray: data size: " + out.dataSize() + " data position: " + out.dataPosition());
//        Log.d("ParcelableMessage", "size: " + data.length);
        out.writeByteArray(data);
//        Log.d("ParcelableMessage", "writeToParcel: after out.writeByteArray: data size: " + out.dataSize() + " data position: " + out.dataPosition());
    }

    private @NonNull T readFromParcel(@NonNull Parcel in) {
        try {
            // TODO - PELE: Remove logging
//            Log.d("ParcelableMessage", "readFromParcel: before in.readInt: data size: " + in.dataSize() + " data position: " + in.dataPosition());
            final int size = in.readInt();
//            Log.d("ParcelableMessage", "readFromParcel: after in.readInt: data size: " + in.dataSize() + " data position: " + in.dataPosition());
            final byte[] data = new byte[size];
//            Log.d("ParcelableMessage", "size: " + size);
//            Log.d("ParcelableMessage", "readFromParcel: before in.readByteArray(data): data size: " + in.dataSize() + " data position: " + in.dataPosition());
            in.readByteArray(data);
//            Log.d("ParcelableMessage", "readFromParcel: after in.readByteArray(data): data size: " + in.dataSize() + " data position: " + in.dataPosition());
            return parse(data);
        } catch (Exception e) {
            throw new BadParcelableException(e.getMessage());
        }
    }

    protected abstract @NonNull T parse(byte[] data) throws InvalidProtocolBufferException;

    public @NonNull T getWrapped() {
        return mMessage;
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mMessage);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ParcelableMessage<?> other)) {
            return false;
        }
        return Objects.equals(mMessage, other.mMessage);
    }
}
