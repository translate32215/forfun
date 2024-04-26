package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class e1 extends os implements f1 {
    public e1() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            if (r2 != r5) goto L_0x0029
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000b
            r2 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.k1
            if (r0 == 0) goto L_0x0019
            r2 = r3
            com.google.android.gms.internal.ads.k1 r2 = (com.google.android.gms.internal.ads.k1) r2
            goto L_0x001f
        L_0x0019:
            com.google.android.gms.internal.ads.m1 r3 = new com.google.android.gms.internal.ads.m1
            r3.<init>(r2)
            r2 = r3
        L_0x001f:
            r3 = r1
            e8.k2 r3 = (e8.k2) r3
            r3.m3(r2)
            r4.writeNoException()
            return r5
        L_0x0029:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e1.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
