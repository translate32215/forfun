package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e8.n1;
import e8.ob0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class cy extends ps implements ay {
    public cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ux K5() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.z0()
            r1 = 1
            android.os.Parcel r0 = r4.m(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.ux
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.ux r1 = (com.google.android.gms.internal.ads.ux) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.xx r2 = new com.google.android.gms.internal.ads.xx
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cy.K5():com.google.android.gms.internal.ads.ux");
    }

    public final void N2(n1 n1Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.c(z02, n1Var);
        Y(6, z02);
    }

    public final void P4(o0 o0Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, o0Var);
        Y(3, z02);
    }

    public final void R3(String str, y0 y0Var, t0 t0Var) throws RemoteException {
        Parcel z02 = z0();
        z02.writeString(str);
        ob0.b(z02, y0Var);
        ob0.b(z02, t0Var);
        Y(5, z02);
    }

    public final void R4(rx rxVar) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, rxVar);
        Y(2, z02);
    }

    public final void c3(s0 s0Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, s0Var);
        Y(4, z02);
    }

    public final void w5(f1 f1Var) throws RemoteException {
        Parcel z02 = z0();
        ob0.b(z02, f1Var);
        Y(10, z02);
    }
}
