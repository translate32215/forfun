package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import e8.ob0;
import v7.h0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class kf extends ps implements jf {
    public kf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    public final void C5(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(7, z02);
    }

    public final a K0(String str, a aVar, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        ob0.b(z02, aVar);
        z02.writeString(str2);
        z02.writeString(str3);
        z02.writeString(str4);
        z02.writeString(str5);
        return h0.a(m(9, z02));
    }

    public final void U5(a aVar, a aVar2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.b(z02, aVar2);
        Y(5, z02);
    }

    public final a Z3(String str, a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        ob0.b(z02, aVar);
        z02.writeString(str2);
        z02.writeString(str3);
        z02.writeString(str4);
        z02.writeString(str5);
        z02.writeString(str6);
        z02.writeString(str7);
        z02.writeString(str8);
        return h0.a(m(11, z02));
    }

    public final void l4(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Y(4, z02);
    }

    public final String p5() throws RemoteException {
        Parcel m10 = m(6, z0());
        String readString = m10.readString();
        m10.recycle();
        return readString;
    }

    public final boolean r2(a aVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        Parcel m10 = m(2, z02);
        boolean z10 = m10.readInt() != 0;
        m10.recycle();
        return z10;
    }

    public final a s2(String str, a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        ob0.b(z02, aVar);
        z02.writeString(str2);
        z02.writeString(str3);
        z02.writeString(str4);
        z02.writeString(str5);
        z02.writeString(str6);
        z02.writeString(str7);
        z02.writeString(str8);
        return h0.a(m(10, z02));
    }

    public final void w4(a aVar, a aVar2) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, aVar);
        ob0.b(z02, aVar2);
        Y(8, z02);
    }
}
