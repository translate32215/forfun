package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import e8.cs;
import e8.ob0;
import e8.z6;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class f5 extends os implements g5 {
    public f5() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        i5 i5Var = null;
        if (i10 == 1) {
            d5 d5Var = (d5) ob0.a(parcel, d5.CREATOR);
            parcel2.writeNoException();
            ob0.d(parcel2, (Parcelable) null);
        } else if (i10 == 2) {
            d5 d5Var2 = (d5) ob0.a(parcel, d5.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof z6) {
                    z6 z6Var = (z6) queryLocalInterface;
                }
            }
            parcel2.writeNoException();
        } else if (i10 == 4) {
            l5 l5Var = (l5) ob0.a(parcel, l5.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface2 instanceof i5) {
                    i5Var = (i5) queryLocalInterface2;
                } else {
                    i5Var = new j5(readStrongBinder2);
                }
            }
            ((cs) this).k6(l5Var, i5Var);
            parcel2.writeNoException();
        } else if (i10 == 5) {
            l5 l5Var2 = (l5) ob0.a(parcel, l5.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface3 instanceof i5) {
                    i5Var = (i5) queryLocalInterface3;
                } else {
                    i5Var = new j5(readStrongBinder3);
                }
            }
            cs csVar = (cs) this;
            csVar.u6(csVar.x6(l5Var2, Binder.getCallingUid()), i5Var);
            parcel2.writeNoException();
        } else if (i10 == 6) {
            l5 l5Var3 = (l5) ob0.a(parcel, l5.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface4 instanceof i5) {
                    i5Var = (i5) queryLocalInterface4;
                } else {
                    i5Var = new j5(readStrongBinder4);
                }
            }
            cs csVar2 = (cs) this;
            csVar2.u6(csVar2.w6(l5Var3, Binder.getCallingUid()), i5Var);
            parcel2.writeNoException();
        } else if (i10 != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                if (queryLocalInterface5 instanceof i5) {
                    i5Var = (i5) queryLocalInterface5;
                } else {
                    i5Var = new j5(readStrongBinder5);
                }
            }
            cs csVar3 = (cs) this;
            csVar3.u6(csVar3.y6(readString), i5Var);
            parcel2.writeNoException();
        }
        return true;
    }
}
