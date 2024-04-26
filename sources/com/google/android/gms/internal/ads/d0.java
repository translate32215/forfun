package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import e8.fn;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class d0 extends os {
    public d0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ((ha) this).s6(a.C0062a.Y(parcel.readStrongBinder()));
        } else if (i10 == 2) {
            ha haVar = (ha) this;
            synchronized (haVar) {
                fn fnVar = haVar.f6838e;
                if (fnVar != null) {
                    fnVar.i(haVar);
                    haVar.f6838e = null;
                }
            }
        } else if (i10 != 3) {
            return false;
        } else {
            a Y = a.C0062a.Y(parcel.readStrongBinder());
            ha haVar2 = (ha) this;
            synchronized (haVar2) {
                if (haVar2.f6838e != null) {
                    Object z02 = b.z0(Y);
                    if (!(z02 instanceof View)) {
                        e.K("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                    }
                    fn fnVar2 = haVar2.f6838e;
                    View view = (View) z02;
                    synchronized (fnVar2) {
                        fnVar2.f14654j.c(view);
                    }
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
