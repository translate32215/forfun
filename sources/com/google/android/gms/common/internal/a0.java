package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import i8.b;
import i8.c;
import s7.s;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class a0 extends b implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5821a = 0;

    public a0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean m(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a f10 = ((s) this).f();
            parcel2.writeNoException();
            c.d(parcel2, f10);
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = ((s) this).f25024b;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        }
        return true;
    }
}
