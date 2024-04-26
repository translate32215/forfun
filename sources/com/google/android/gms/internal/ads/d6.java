package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class d6 extends os {
    public d6() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.g6] */
    /* JADX WARNING: type inference failed for: r1v25, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v27, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.google.android.gms.internal.ads.g6] */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            r0 = 0
            r1 = 0
            switch(r4) {
                case 1: goto L_0x01f5;
                case 2: goto L_0x01c8;
                case 3: goto L_0x01ae;
                case 4: goto L_0x0192;
                case 5: goto L_0x016a;
                case 6: goto L_0x013c;
                case 7: goto L_0x0106;
                case 8: goto L_0x00ce;
                case 9: goto L_0x00a6;
                case 10: goto L_0x008a;
                case 11: goto L_0x0074;
                case 12: goto L_0x0050;
                case 13: goto L_0x0034;
                case 14: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return r0
        L_0x0007:
            android.os.Parcelable$Creator<e8.fi0> r4 = e8.fi0.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            e8.fi0 r4 = (e8.fi0) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0016
            goto L_0x0029
        L_0x0016:
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.g6
            if (r1 == 0) goto L_0x0024
            r1 = r0
            com.google.android.gms.internal.ads.g6 r1 = (com.google.android.gms.internal.ads.g6) r1
            goto L_0x0029
        L_0x0024:
            com.google.android.gms.internal.ads.i6 r1 = new com.google.android.gms.internal.ads.i6
            r1.<init>(r5)
        L_0x0029:
            r5 = r3
            com.google.android.gms.internal.ads.me r5 = (com.google.android.gms.internal.ads.me) r5
            r5.v6(r4, r1)
            r6.writeNoException()
            goto L_0x0220
        L_0x0034:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.internal.ads.cz r4 = com.google.android.gms.internal.ads.fz.s6(r4)
            r5 = r3
            com.google.android.gms.internal.ads.me r5 = (com.google.android.gms.internal.ads.me) r5
            java.lang.String r0 = "setOnPaidEventListener must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r0)
            e8.e00 r5 = r5.f7480b
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.cz> r5 = r5.f14351h
            r5.set(r4)
            r6.writeNoException()
            goto L_0x0220
        L_0x0050:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            e8.l<java.lang.Boolean> r5 = e8.t.Y3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            com.google.android.gms.internal.ads.za r4 = r4.f7484f
            if (r4 == 0) goto L_0x006c
            e8.ii r1 = r4.f13729f
        L_0x006c:
            r6.writeNoException()
            e8.ob0.b(r6, r1)
            goto L_0x0220
        L_0x0074:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r5)
            com.google.android.gms.internal.ads.za r4 = r4.f7484f
            if (r4 == 0) goto L_0x0082
            com.google.android.gms.internal.ads.b6 r1 = r4.f8689o
        L_0x0082:
            r6.writeNoException()
            e8.ob0.b(r6, r1)
            goto L_0x0220
        L_0x008a:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            java.lang.ClassLoader r1 = e8.ob0.f15778a
            int r5 = r5.readInt()
            if (r5 == 0) goto L_0x009b
            r0 = 1
        L_0x009b:
            r5 = r3
            com.google.android.gms.internal.ads.me r5 = (com.google.android.gms.internal.ads.me) r5
            r5.s6(r4, r0)
            r6.writeNoException()
            goto L_0x0220
        L_0x00a6:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r5)
            com.google.android.gms.internal.ads.za r4 = r4.f7484f
            if (r4 == 0) goto L_0x00c1
            e8.oj r4 = r4.f8687m
            monitor-enter(r4)
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x00be }
            android.os.Bundle r0 = r4.f15802b     // Catch:{ all -> 0x00be }
            r5.<init>(r0)     // Catch:{ all -> 0x00be }
            monitor-exit(r4)
            goto L_0x00c6
        L_0x00be:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x00c1:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x00c6:
            r6.writeNoException()
            e8.ob0.d(r6, r5)
            goto L_0x0220
        L_0x00ce:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x00d6
            r5 = r1
            goto L_0x00e8
        L_0x00d6:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.bz
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.bz r5 = (com.google.android.gms.internal.ads.bz) r5
            goto L_0x00e8
        L_0x00e3:
            com.google.android.gms.internal.ads.dz r5 = new com.google.android.gms.internal.ads.dz
            r5.<init>(r4)
        L_0x00e8:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            if (r5 != 0) goto L_0x00f5
            e8.e00 r4 = r4.f7480b
            java.util.concurrent.atomic.AtomicReference<k7.a> r4 = r4.f14345b
            r4.set(r1)
            goto L_0x0101
        L_0x00f5:
            e8.e00 r0 = r4.f7480b
            e8.p00 r1 = new e8.p00
            r1.<init>(r4, r5)
            java.util.concurrent.atomic.AtomicReference<k7.a> r4 = r0.f14345b
            r4.set(r1)
        L_0x0101:
            r6.writeNoException()
            goto L_0x0220
        L_0x0106:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.l6> r4 = com.google.android.gms.internal.ads.l6.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            com.google.android.gms.internal.ads.l6 r4 = (com.google.android.gms.internal.ads.l6) r4
            r5 = r3
            com.google.android.gms.internal.ads.me r5 = (com.google.android.gms.internal.ads.me) r5
            monitor-enter(r5)
            java.lang.String r0 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r0)     // Catch:{ all -> 0x0139 }
            e8.v00 r0 = r5.f7482d     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = r4.f7324a     // Catch:{ all -> 0x0139 }
            r0.f17012a = r1     // Catch:{ all -> 0x0139 }
            e8.l<java.lang.Boolean> r1 = e8.t.f16663u0     // Catch:{ all -> 0x0139 }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x0139 }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x0139 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x0139 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0139 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0133
            java.lang.String r4 = r4.f7325b     // Catch:{ all -> 0x0139 }
            r0.f17013b = r4     // Catch:{ all -> 0x0139 }
        L_0x0133:
            monitor-exit(r5)
            r6.writeNoException()
            goto L_0x0220
        L_0x0139:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x013c:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0143
            goto L_0x0156
        L_0x0143:
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.k6
            if (r0 == 0) goto L_0x0151
            r1 = r5
            com.google.android.gms.internal.ads.k6 r1 = (com.google.android.gms.internal.ads.k6) r1
            goto L_0x0156
        L_0x0151:
            com.google.android.gms.internal.ads.j6 r1 = new com.google.android.gms.internal.ads.j6
            r1.<init>(r4)
        L_0x0156:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r5)
            e8.e00 r4 = r4.f7480b
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.k6> r4 = r4.f14349f
            r4.set(r1)
            r6.writeNoException()
            goto L_0x0220
        L_0x016a:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r5 = r3
            com.google.android.gms.internal.ads.me r5 = (com.google.android.gms.internal.ads.me) r5
            monitor-enter(r5)
            e8.l<java.lang.Boolean> r0 = e8.t.f16609l0     // Catch:{ all -> 0x018f }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x018f }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x018f }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x018f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x018f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x018f }
            r5.s6(r4, r0)     // Catch:{ all -> 0x018f }
            monitor-exit(r5)
            r6.writeNoException()
            goto L_0x0220
        L_0x018f:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L_0x0192:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            monitor-enter(r4)
            com.google.android.gms.internal.ads.za r5 = r4.f7484f     // Catch:{ all -> 0x01ab }
            if (r5 == 0) goto L_0x01a2
            e8.ii r5 = r5.f13729f     // Catch:{ all -> 0x01ab }
            if (r5 == 0) goto L_0x01a2
            java.lang.String r1 = r5.f15049a     // Catch:{ all -> 0x01ab }
            monitor-exit(r4)
            goto L_0x01a3
        L_0x01a2:
            monitor-exit(r4)
        L_0x01a3:
            r6.writeNoException()
            r6.writeString(r1)
            goto L_0x0220
        L_0x01ab:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x01ae:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r5)
            com.google.android.gms.internal.ads.za r4 = r4.f7484f
            if (r4 == 0) goto L_0x01bf
            boolean r4 = r4.f8691q
            if (r4 != 0) goto L_0x01bf
            r0 = 1
        L_0x01bf:
            r6.writeNoException()
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            r6.writeInt(r0)
            goto L_0x0220
        L_0x01c8:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x01cf
            goto L_0x01e2
        L_0x01cf:
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.e6
            if (r0 == 0) goto L_0x01dd
            r1 = r5
            com.google.android.gms.internal.ads.e6 r1 = (com.google.android.gms.internal.ads.e6) r1
            goto L_0x01e2
        L_0x01dd:
            com.google.android.gms.internal.ads.f6 r1 = new com.google.android.gms.internal.ads.f6
            r1.<init>(r4)
        L_0x01e2:
            r4 = r3
            com.google.android.gms.internal.ads.me r4 = (com.google.android.gms.internal.ads.me) r4
            java.lang.String r5 = "#008 Must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r5)
            e8.e00 r4 = r4.f7480b
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.e6> r4 = r4.f14347d
            r4.set(r1)
            r6.writeNoException()
            goto L_0x0220
        L_0x01f5:
            android.os.Parcelable$Creator<e8.fi0> r4 = e8.fi0.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            e8.fi0 r4 = (e8.fi0) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0204
            goto L_0x0217
        L_0x0204:
            java.lang.String r0 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.g6
            if (r1 == 0) goto L_0x0212
            r1 = r0
            com.google.android.gms.internal.ads.g6 r1 = (com.google.android.gms.internal.ads.g6) r1
            goto L_0x0217
        L_0x0212:
            com.google.android.gms.internal.ads.i6 r1 = new com.google.android.gms.internal.ads.i6
            r1.<init>(r5)
        L_0x0217:
            r5 = r3
            com.google.android.gms.internal.ads.me r5 = (com.google.android.gms.internal.ads.me) r5
            r5.t6(r4, r1)
            r6.writeNoException()
        L_0x0220:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d6.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
