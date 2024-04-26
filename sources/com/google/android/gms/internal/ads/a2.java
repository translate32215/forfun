package com.google.android.gms.internal.ads;

import e8.d4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class a2 extends os implements d4 {
    public a2() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.d2} */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.hz] */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.y] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 3
            java.lang.String r0 = "getVideoController: Instream ad should not be used after destroyed"
            r1 = 0
            java.lang.String r2 = "#008 Must be called on the main UI thread."
            if (r4 == r7) goto L_0x0087
            r7 = 4
            if (r4 == r7) goto L_0x007d
            r7 = 5
            if (r4 == r7) goto L_0x0051
            r7 = 6
            if (r4 == r7) goto L_0x0037
            r5 = 7
            if (r4 == r5) goto L_0x0016
            r4 = 0
            return r4
        L_0x0016:
            r4 = r3
            com.google.android.gms.internal.ads.sa r4 = (com.google.android.gms.internal.ads.sa) r4
            com.google.android.gms.common.internal.i.d(r2)
            boolean r5 = r4.f8110d
            if (r5 == 0) goto L_0x0024
            l0.e.I(r0)
            goto L_0x0030
        L_0x0024:
            e8.fn r4 = r4.f8109c
            if (r4 == 0) goto L_0x0030
            e8.in r4 = r4.f14670z
            if (r4 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.y r1 = r4.a()
        L_0x0030:
            r6.writeNoException()
            e8.ob0.b(r6, r1)
            goto L_0x009d
        L_0x0037:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r5 = r3
            com.google.android.gms.internal.ads.sa r5 = (com.google.android.gms.internal.ads.sa) r5
            com.google.android.gms.common.internal.i.d(r2)
            com.google.android.gms.internal.ads.ta r7 = new com.google.android.gms.internal.ads.ta
            r7.<init>()
            r5.s6(r4, r7)
            r6.writeNoException()
            goto L_0x009d
        L_0x0051:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0060
            goto L_0x0073
        L_0x0060:
            java.lang.String r7 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            android.os.IInterface r7 = r5.queryLocalInterface(r7)
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.b2
            if (r0 == 0) goto L_0x006e
            r1 = r7
            com.google.android.gms.internal.ads.b2 r1 = (com.google.android.gms.internal.ads.b2) r1
            goto L_0x0073
        L_0x006e:
            com.google.android.gms.internal.ads.d2 r1 = new com.google.android.gms.internal.ads.d2
            r1.<init>(r5)
        L_0x0073:
            r5 = r3
            com.google.android.gms.internal.ads.sa r5 = (com.google.android.gms.internal.ads.sa) r5
            r5.s6(r4, r1)
            r6.writeNoException()
            goto L_0x009d
        L_0x007d:
            r4 = r3
            com.google.android.gms.internal.ads.sa r4 = (com.google.android.gms.internal.ads.sa) r4
            r4.destroy()
            r6.writeNoException()
            goto L_0x009d
        L_0x0087:
            r4 = r3
            com.google.android.gms.internal.ads.sa r4 = (com.google.android.gms.internal.ads.sa) r4
            com.google.android.gms.common.internal.i.d(r2)
            boolean r5 = r4.f8110d
            if (r5 == 0) goto L_0x0095
            l0.e.I(r0)
            goto L_0x0097
        L_0x0095:
            com.google.android.gms.internal.ads.hz r1 = r4.f8108b
        L_0x0097:
            r6.writeNoException()
            e8.ob0.b(r6, r1)
        L_0x009d:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a2.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
