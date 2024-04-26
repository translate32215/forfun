package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import i8.b;
import i8.c;
import v7.d;
import v7.x;
import v7.y;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class o extends b implements d {
    public o() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean m(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            c.b(parcel);
            ((x) this).Y(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i10 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            y yVar = (y) c.a(parcel, y.CREATOR);
            c.b(parcel);
            x xVar = (x) this;
            b bVar = xVar.f26603a;
            i.i(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            if (yVar != null) {
                bVar.D = yVar;
                xVar.Y(readInt, readStrongBinder, yVar.f26605a);
            } else {
                throw new NullPointerException("null reference");
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
