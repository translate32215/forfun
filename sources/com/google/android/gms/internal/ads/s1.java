package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import e8.ob0;
import e8.t3;
import e8.v3;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class s1 extends os implements t3 {
    public s1() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ((v3) this).f17020a.b((ParcelFileDescriptor) ob0.a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
