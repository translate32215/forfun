package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class pz extends os implements zy {

    /* renamed from: a  reason: collision with root package name */
    public final String f7907a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7908b;

    public pz(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f7907a = str;
        this.f7908b = str2;
    }

    public static zy s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zy) {
            return (zy) queryLocalInterface;
        }
        return new az(iBinder);
    }

    public final String Q4() throws RemoteException {
        return this.f7908b;
    }

    public final String getDescription() throws RemoteException {
        return this.f7907a;
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String str = this.f7907a;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            String str2 = this.f7908b;
            parcel2.writeNoException();
            parcel2.writeString(str2);
            return true;
        }
    }
}
