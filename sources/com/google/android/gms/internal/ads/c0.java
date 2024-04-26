package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class c0 extends os {
    public c0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            r0 = 0
            switch(r2) {
                case 1: goto L_0x00d2;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00ae;
                case 4: goto L_0x0078;
                case 5: goto L_0x0065;
                case 6: goto L_0x0052;
                case 7: goto L_0x003f;
                case 8: goto L_0x001a;
                case 9: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 0
            return r2
        L_0x0007:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a r2 = c8.a.C0062a.Y(r2)
            r3 = r1
            com.google.android.gms.internal.ads.ga r3 = (com.google.android.gms.internal.ads.ga) r3
            r3.y6(r2)
            r4.writeNoException()
            goto L_0x00e7
        L_0x001a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0021
            goto L_0x0034
        L_0x0021:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.y
            if (r0 == 0) goto L_0x002f
            r0 = r3
            com.google.android.gms.internal.ads.y r0 = (com.google.android.gms.internal.ads.y) r0
            goto L_0x0034
        L_0x002f:
            com.google.android.gms.internal.ads.a0 r0 = new com.google.android.gms.internal.ads.a0
            r0.<init>(r2)
        L_0x0034:
            r2 = r1
            com.google.android.gms.internal.ads.ga r2 = (com.google.android.gms.internal.ads.ga) r2
            r2.t6(r0)
            r4.writeNoException()
            goto L_0x00e7
        L_0x003f:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a r2 = c8.a.C0062a.Y(r2)
            r3 = r1
            com.google.android.gms.internal.ads.ga r3 = (com.google.android.gms.internal.ads.ga) r3
            r3.x6(r2)
            r4.writeNoException()
            goto L_0x00e7
        L_0x0052:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a r2 = c8.a.C0062a.Y(r2)
            r3 = r1
            com.google.android.gms.internal.ads.ga r3 = (com.google.android.gms.internal.ads.ga) r3
            r3.w6(r2)
            r4.writeNoException()
            goto L_0x00e7
        L_0x0065:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a.C0062a.Y(r2)
            r3.readInt()
            r2 = r1
            com.google.android.gms.internal.ads.ga r2 = (com.google.android.gms.internal.ads.ga) r2
            monitor-enter(r2)
            monitor-exit(r2)
            r4.writeNoException()
            goto L_0x00e7
        L_0x0078:
            r2 = r1
            com.google.android.gms.internal.ads.ga r2 = (com.google.android.gms.internal.ads.ga) r2
            monitor-enter(r2)
            boolean r3 = r2.f6630u     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x0082
            monitor-exit(r2)
            goto L_0x00a7
        L_0x0082:
            e8.fn r3 = r2.f6625h     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x008b
            r3.i(r2)     // Catch:{ all -> 0x00ab }
            r2.f6625h = r0     // Catch:{ all -> 0x00ab }
        L_0x008b:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r2.f6619b     // Catch:{ all -> 0x00ab }
            r3.clear()     // Catch:{ all -> 0x00ab }
            android.widget.FrameLayout r3 = r2.f6620c     // Catch:{ all -> 0x00ab }
            r3.removeAllViews()     // Catch:{ all -> 0x00ab }
            android.widget.FrameLayout r3 = r2.f6621d     // Catch:{ all -> 0x00ab }
            r3.removeAllViews()     // Catch:{ all -> 0x00ab }
            r2.f6619b = r0     // Catch:{ all -> 0x00ab }
            r2.f6620c = r0     // Catch:{ all -> 0x00ab }
            r2.f6621d = r0     // Catch:{ all -> 0x00ab }
            r2.f6623f = r0     // Catch:{ all -> 0x00ab }
            r2.f6626i = r0     // Catch:{ all -> 0x00ab }
            r2.f6630u = r5     // Catch:{ all -> 0x00ab }
            monitor-exit(r2)
        L_0x00a7:
            r4.writeNoException()
            goto L_0x00e7
        L_0x00ab:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x00ae:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a r2 = c8.a.C0062a.Y(r2)
            r3 = r1
            com.google.android.gms.internal.ads.ga r3 = (com.google.android.gms.internal.ads.ga) r3
            r3.s6(r2)
            r4.writeNoException()
            goto L_0x00e7
        L_0x00c0:
            java.lang.String r2 = r3.readString()
            r3 = r1
            com.google.android.gms.internal.ads.ga r3 = (com.google.android.gms.internal.ads.ga) r3
            c8.a r2 = r3.v6(r2)
            r4.writeNoException()
            e8.ob0.b(r4, r2)
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r3 = r3.readStrongBinder()
            c8.a r3 = c8.a.C0062a.Y(r3)
            r0 = r1
            com.google.android.gms.internal.ads.ga r0 = (com.google.android.gms.internal.ads.ga) r0
            r0.u6(r2, r3)
            r4.writeNoException()
        L_0x00e7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c0.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
