/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.eclipse.uprotocol.core.ubus;

import android.util.Log;

public interface IUBus extends android.os.IInterface
{
  /** Default implementation for IUBus. */
  public static class Default implements org.eclipse.uprotocol.core.ubus.IUBus
  {
    @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus registerClient(java.lang.String packageName, org.eclipse.uprotocol.v1.internal.ParcelableUEntity entity, android.os.IBinder clientToken, int flags, org.eclipse.uprotocol.core.ubus.IUListener listener) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus unregisterClient(android.os.IBinder clientToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus send(org.eclipse.uprotocol.v1.internal.ParcelableUMessage message, android.os.IBinder clientToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.eclipse.uprotocol.v1.internal.ParcelableUMessage[] pull(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int count, int flags, android.os.IBinder clientToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus enableDispatching(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int flags, android.os.IBinder clientToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus disableDispatching(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int flags, android.os.IBinder clientToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.eclipse.uprotocol.core.ubus.IUBus
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.eclipse.uprotocol.core.ubus.IUBus interface,
     * generating a proxy if needed.
     */
    public static org.eclipse.uprotocol.core.ubus.IUBus asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.eclipse.uprotocol.core.ubus.IUBus))) {
        return ((org.eclipse.uprotocol.core.ubus.IUBus)iin);
      }
      return new org.eclipse.uprotocol.core.ubus.IUBus.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_registerClient:
        {
          int sizeBeforePackageName = data.dataSize();
          int positionBeforePackageName = data.dataPosition();
          java.lang.String _arg0;
          _arg0 = data.readString();
          Log.d("registerClient: read", "packageName: " + _arg0);
          Log.d("registerClient: read", "packageName: " + _arg0 + " before packageName data size: " + sizeBeforePackageName + " data position: " + positionBeforePackageName);
          Log.d("registerClient: read", "packageName: " + _arg0 + " after packageName data size: " + data.dataSize() + " data position: " + data.dataPosition());
          org.eclipse.uprotocol.v1.internal.ParcelableUEntity _arg1;
          Log.d("registerClient: read", "packageName: " + _arg0 + " before ParcelableUEntity data size: " + data.dataSize() + " data position: " + data.dataPosition());
          _arg1 = _Parcel.readTypedObject(data, org.eclipse.uprotocol.v1.internal.ParcelableUEntity.CREATOR);
          Log.d("registerClient: read", "packageName: " + _arg0 + " after ParcelableUEntity data size: " + data.dataSize() + " data position: " + data.dataPosition());
          android.os.IBinder _arg2;
          Log.d("registerClient: read", "packageName: " + _arg0 + " before clientToken data size: " + data.dataSize() + " data position: " + data.dataPosition());
          _arg2 = data.readStrongBinder();
          Log.d("registerClient: read", "packageName: " + _arg0 + " after clientToken data size: " + data.dataSize() + " data position: " + data.dataPosition());
          int _arg3;
          Log.d("registerClient: read", "packageName: " + _arg0 + " before flags data size: " + data.dataSize() + " data position: " + data.dataPosition());
          _arg3 = data.readInt();
          Log.d("registerClient: read", "packageName: " + _arg0 + " after flags data size: " + data.dataSize() + " data position: " + data.dataPosition());
          org.eclipse.uprotocol.core.ubus.IUListener _arg4;
          Log.d("registerClient: read", "packageName: " + _arg0 + " before IUListener data size: " + data.dataSize() + " data position: " + data.dataPosition());
          _arg4 = org.eclipse.uprotocol.core.ubus.IUListener.Stub.asInterface(data.readStrongBinder());
          Log.d("registerClient: read", "packageName: " + _arg0 + " after IUListener data size: " + data.dataSize() + " data position: " + data.dataPosition());
          org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result = this.registerClient(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_unregisterClient:
        {
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result = this.unregisterClient(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_send:
        {
          org.eclipse.uprotocol.v1.internal.ParcelableUMessage _arg0;
          _arg0 = _Parcel.readTypedObject(data, org.eclipse.uprotocol.v1.internal.ParcelableUMessage.CREATOR);
          android.os.IBinder _arg1;
          _arg1 = data.readStrongBinder();
          org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result = this.send(_arg0, _arg1);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_pull:
        {
          org.eclipse.uprotocol.v1.internal.ParcelableUUri _arg0;
          _arg0 = _Parcel.readTypedObject(data, org.eclipse.uprotocol.v1.internal.ParcelableUUri.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          android.os.IBinder _arg3;
          _arg3 = data.readStrongBinder();
          org.eclipse.uprotocol.v1.internal.ParcelableUMessage[] _result = this.pull(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_enableDispatching:
        {
          org.eclipse.uprotocol.v1.internal.ParcelableUUri _arg0;
          _arg0 = _Parcel.readTypedObject(data, org.eclipse.uprotocol.v1.internal.ParcelableUUri.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          android.os.IBinder _arg2;
          _arg2 = data.readStrongBinder();
          org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result = this.enableDispatching(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_disableDispatching:
        {
          org.eclipse.uprotocol.v1.internal.ParcelableUUri _arg0;
          _arg0 = _Parcel.readTypedObject(data, org.eclipse.uprotocol.v1.internal.ParcelableUUri.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          android.os.IBinder _arg2;
          _arg2 = data.readStrongBinder();
          org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result = this.disableDispatching(_arg0, _arg1, _arg2);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements org.eclipse.uprotocol.core.ubus.IUBus
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus registerClient(java.lang.String packageName, org.eclipse.uprotocol.v1.internal.ParcelableUEntity entity, android.os.IBinder clientToken, int flags, org.eclipse.uprotocol.core.ubus.IUListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result;
        try {
          Log.d("registerClient: write", "packageName: " + packageName);
          Log.d("registerClient: write", "before descriptor data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          _data.writeInterfaceToken(DESCRIPTOR);
          Log.d("registerClient: write", "after descriptor data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          Log.d("registerClient: write", "before packageName data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          _data.writeString(packageName);
          Log.d("registerClient: write", "after packageName data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          Log.d("registerClient: write", "before entity data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          _Parcel.writeTypedObject(_data, entity, 0);
          Log.d("registerClient: write", "after entity data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          Log.d("registerClient: write", "before clientToken data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          _data.writeStrongBinder(clientToken);
          Log.d("registerClient: write", "after clientToken data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          Log.d("registerClient: write", "before flags data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          _data.writeInt(flags);
          Log.d("registerClient: write", "after flags data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          Log.d("registerClient: write", "before IUListener data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          _data.writeStrongInterface(listener);
          Log.d("registerClient: write", "after IUListener data size: " + _data.dataSize() + " data position: " + _data.dataPosition());
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerClient, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.eclipse.uprotocol.v1.internal.ParcelableUStatus.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus unregisterClient(android.os.IBinder clientToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(clientToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterClient, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.eclipse.uprotocol.v1.internal.ParcelableUStatus.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus send(org.eclipse.uprotocol.v1.internal.ParcelableUMessage message, android.os.IBinder clientToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, message, 0);
          _data.writeStrongBinder(clientToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_send, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.eclipse.uprotocol.v1.internal.ParcelableUStatus.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.eclipse.uprotocol.v1.internal.ParcelableUMessage[] pull(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int count, int flags, android.os.IBinder clientToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.eclipse.uprotocol.v1.internal.ParcelableUMessage[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, uri, 0);
          _data.writeInt(count);
          _data.writeInt(flags);
          _data.writeStrongBinder(clientToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_pull, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(org.eclipse.uprotocol.v1.internal.ParcelableUMessage.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus enableDispatching(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int flags, android.os.IBinder clientToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, uri, 0);
          _data.writeInt(flags);
          _data.writeStrongBinder(clientToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableDispatching, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.eclipse.uprotocol.v1.internal.ParcelableUStatus.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.eclipse.uprotocol.v1.internal.ParcelableUStatus disableDispatching(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int flags, android.os.IBinder clientToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.eclipse.uprotocol.v1.internal.ParcelableUStatus _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, uri, 0);
          _data.writeInt(flags);
          _data.writeStrongBinder(clientToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_disableDispatching, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, org.eclipse.uprotocol.v1.internal.ParcelableUStatus.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_registerClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_unregisterClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_pull = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_enableDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_disableDispatching = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
  }
  public static final java.lang.String DESCRIPTOR = "org.eclipse.uprotocol.core.ubus.IUBus";
  public org.eclipse.uprotocol.v1.internal.ParcelableUStatus registerClient(java.lang.String packageName, org.eclipse.uprotocol.v1.internal.ParcelableUEntity entity, android.os.IBinder clientToken, int flags, org.eclipse.uprotocol.core.ubus.IUListener listener) throws android.os.RemoteException;
  public org.eclipse.uprotocol.v1.internal.ParcelableUStatus unregisterClient(android.os.IBinder clientToken) throws android.os.RemoteException;
  public org.eclipse.uprotocol.v1.internal.ParcelableUStatus send(org.eclipse.uprotocol.v1.internal.ParcelableUMessage message, android.os.IBinder clientToken) throws android.os.RemoteException;
  public org.eclipse.uprotocol.v1.internal.ParcelableUMessage[] pull(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int count, int flags, android.os.IBinder clientToken) throws android.os.RemoteException;
  public org.eclipse.uprotocol.v1.internal.ParcelableUStatus enableDispatching(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int flags, android.os.IBinder clientToken) throws android.os.RemoteException;
  public org.eclipse.uprotocol.v1.internal.ParcelableUStatus disableDispatching(org.eclipse.uprotocol.v1.internal.ParcelableUUri uri, int flags, android.os.IBinder clientToken) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
            android.os.Parcel parcel,
            android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
        return c.createFromParcel(parcel);
      } else {
        return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
            android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
