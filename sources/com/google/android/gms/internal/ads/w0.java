package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class w0 extends os implements t0 {
    public w0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 != r6) goto L_0x002d
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x000b
            r3 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.l0
            if (r1 == 0) goto L_0x0019
            r3 = r0
            com.google.android.gms.internal.ads.l0 r3 = (com.google.android.gms.internal.ads.l0) r3
            goto L_0x001f
        L_0x0019:
            com.google.android.gms.internal.ads.m0 r0 = new com.google.android.gms.internal.ads.m0
            r0.<init>(r3)
            r3 = r0
        L_0x001f:
            java.lang.String r4 = r4.readString()
            r0 = r2
            e8.g2 r0 = (e8.g2) r0
            r0.u0(r3, r4)
            r5.writeNoException()
            return r6
        L_0x002d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w0.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
