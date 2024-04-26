package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class zu extends os implements yu {
    public zu() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.bv] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.ev] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 2
            if (r2 == r5) goto L_0x0064
            r5 = 3
            r0 = 0
            if (r2 == r5) goto L_0x0043
            r5 = 4
            if (r2 == r5) goto L_0x001a
            r3 = 5
            if (r2 == r3) goto L_0x000f
            r2 = 0
            return r2
        L_0x000f:
            com.google.android.gms.internal.ads.gz r2 = r1.B()
            r4.writeNoException()
            e8.ob0.b(r4, r2)
            goto L_0x006e
        L_0x001a:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a r2 = c8.a.C0062a.Y(r2)
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            java.lang.String r5 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.ev
            if (r0 == 0) goto L_0x0037
            r0 = r5
            com.google.android.gms.internal.ads.ev r0 = (com.google.android.gms.internal.ads.ev) r0
            goto L_0x003c
        L_0x0037:
            com.google.android.gms.internal.ads.fv r0 = new com.google.android.gms.internal.ads.fv
            r0.<init>(r3)
        L_0x003c:
            r1.A3(r2, r0)
            r4.writeNoException()
            goto L_0x006e
        L_0x0043:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x004a
            goto L_0x005d
        L_0x004a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.bv
            if (r5 == 0) goto L_0x0058
            r0 = r3
            com.google.android.gms.internal.ads.bv r0 = (com.google.android.gms.internal.ads.bv) r0
            goto L_0x005d
        L_0x0058:
            com.google.android.gms.internal.ads.dv r0 = new com.google.android.gms.internal.ads.dv
            r0.<init>(r2)
        L_0x005d:
            r1.i6(r0)
            r4.writeNoException()
            goto L_0x006e
        L_0x0064:
            com.google.android.gms.internal.ads.dy r2 = r1.R5()
            r4.writeNoException()
            e8.ob0.b(r4, r2)
        L_0x006e:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zu.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
