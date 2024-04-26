package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class vy extends ps implements wy {
    public vy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder C0(a aVar, int i10) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        z02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel m10 = m(1, z02);
        IBinder readStrongBinder = m10.readStrongBinder();
        m10.recycle();
        return readStrongBinder;
    }
}
