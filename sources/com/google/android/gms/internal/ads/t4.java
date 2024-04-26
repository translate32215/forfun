package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import com.startapp.b4;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class t4 extends os implements r4 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8176a = 0;

    public t4() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                h6((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                o3();
                parcel2.writeNoException();
                return true;
            case 3:
                v0();
                parcel2.writeNoException();
                return true;
            case 4:
                onResume();
                parcel2.writeNoException();
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) ob0.a(parcel, Bundle.CREATOR);
                T5(bundle);
                parcel2.writeNoException();
                ob0.d(parcel2, bundle);
                return true;
            case 7:
                Z();
                parcel2.writeNoException();
                return true;
            case b4.f10106f /*8*/:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 9:
                D2();
                parcel2.writeNoException();
                return true;
            case 10:
                B4();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean w22 = w2();
                parcel2.writeNoException();
                ClassLoader classLoader = ob0.f15778a;
                parcel2.writeInt(w22 ? 1 : 0);
                return true;
            case 12:
                Z0(parcel.readInt(), parcel.readInt(), (Intent) ob0.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                h1(a.C0062a.Y(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                x0();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
