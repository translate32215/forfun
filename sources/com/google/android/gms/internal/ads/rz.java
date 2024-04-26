package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e8.fi0;
import e8.s30;
import e8.y8;
import l0.e;
import p.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class rz extends yx {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ qz f8086a;

    public rz(qz qzVar, a aVar) {
        this.f8086a = qzVar;
    }

    public final String A0() throws RemoteException {
        return null;
    }

    public final void J2(fi0 fi0) throws RemoteException {
        e.I("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        y8.f17578b.post(new s30(this));
    }

    public final void Y3(fi0 fi0, int i10) throws RemoteException {
        e.I("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        y8.f17578b.post(new s30(this));
    }

    public final boolean j() throws RemoteException {
        return false;
    }

    public final String s() throws RemoteException {
        return null;
    }
}
