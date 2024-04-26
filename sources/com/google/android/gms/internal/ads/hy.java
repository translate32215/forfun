package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.li0;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class hy extends ps implements iy {
    public hy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder f4(a aVar, li0 li0, String str, s2 s2Var, int i10, int i11) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.c(z02, li0);
        z02.writeString(str);
        ob0.b(z02, s2Var);
        z02.writeInt(ModuleDescriptor.MODULE_VERSION);
        z02.writeInt(i11);
        Parcel m10 = m(2, z02);
        IBinder readStrongBinder = m10.readStrongBinder();
        m10.recycle();
        return readStrongBinder;
    }
}
