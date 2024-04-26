package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class n1 extends os implements k1 {
    public n1() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.google.android.gms.internal.ads.j1] */
    /* JADX WARNING: type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.xy] */
    /* JADX WARNING: type inference failed for: r6v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 0
            switch(r3) {
                case 2: goto L_0x024d;
                case 3: goto L_0x023d;
                case 4: goto L_0x022d;
                case 5: goto L_0x021a;
                case 6: goto L_0x020a;
                case 7: goto L_0x01f3;
                case 8: goto L_0x01e0;
                case 9: goto L_0x01c8;
                case 10: goto L_0x01b9;
                case 11: goto L_0x01aa;
                case 12: goto L_0x019d;
                case 13: goto L_0x0190;
                case 14: goto L_0x0181;
                case 15: goto L_0x016c;
                case 16: goto L_0x0153;
                case 17: goto L_0x013e;
                case 18: goto L_0x012c;
                case 19: goto L_0x011b;
                case 20: goto L_0x010a;
                case 21: goto L_0x00e5;
                case 22: goto L_0x00da;
                case 23: goto L_0x00be;
                case 24: goto L_0x00ad;
                case 25: goto L_0x009a;
                case 26: goto L_0x0075;
                case 27: goto L_0x006a;
                case 28: goto L_0x005f;
                case 29: goto L_0x004c;
                case 30: goto L_0x003b;
                case 31: goto L_0x0019;
                case 32: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r3 = 0
            return r3
        L_0x0006:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.cz r3 = com.google.android.gms.internal.ads.fz.s6(r3)
            r4 = r2
            com.google.android.gms.internal.ads.wa r4 = (com.google.android.gms.internal.ads.wa) r4
            r4.y5(r3)
            r5.writeNoException()
            goto L_0x025c
        L_0x0019:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.l<java.lang.Boolean> r4 = e8.t.Y3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r4 = r0.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            e8.fn r3 = r3.f8438b
            e8.ii r6 = r3.f13729f
        L_0x0033:
            r5.writeNoException()
            e8.ob0.b(r5, r6)
            goto L_0x025c
        L_0x003b:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            boolean r3 = r3.t6()
            r5.writeNoException()
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            r5.writeInt(r3)
            goto L_0x025c
        L_0x004c:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.fn r3 = r3.f8438b
            e8.in r3 = r3.f14670z
            com.google.android.gms.internal.ads.y r3 = r3.a()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x025c
        L_0x005f:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            r3.v6()
            r5.writeNoException()
            goto L_0x025c
        L_0x006a:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            r3.z6()
            r5.writeNoException()
            goto L_0x025c
        L_0x0075:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x007c
            goto L_0x008f
        L_0x007c:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IMuteThisAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r6 = r4 instanceof com.google.android.gms.internal.ads.xy
            if (r6 == 0) goto L_0x008a
            r6 = r4
            com.google.android.gms.internal.ads.xy r6 = (com.google.android.gms.internal.ads.xy) r6
            goto L_0x008f
        L_0x008a:
            com.google.android.gms.internal.ads.yy r6 = new com.google.android.gms.internal.ads.yy
            r6.<init>(r3)
        L_0x008f:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            r3.x6(r6)
            r5.writeNoException()
            goto L_0x025c
        L_0x009a:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zy r3 = com.google.android.gms.internal.ads.pz.s6(r3)
            r4 = r2
            com.google.android.gms.internal.ads.wa r4 = (com.google.android.gms.internal.ads.wa) r4
            r4.y6(r3)
            r5.writeNoException()
            goto L_0x025c
        L_0x00ad:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            boolean r3 = r3.u6()
            r5.writeNoException()
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            r5.writeInt(r3)
            goto L_0x025c
        L_0x00be:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            boolean r4 = r3.u6()
            if (r4 == 0) goto L_0x00ce
            e8.jn r3 = r3.f8439c
            java.util.List r3 = r3.g()
            goto L_0x00d2
        L_0x00ce:
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x00d2:
            r5.writeNoException()
            r5.writeList(r3)
            goto L_0x025c
        L_0x00da:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            r3.s6()
            r5.writeNoException()
            goto L_0x025c
        L_0x00e5:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00ec
            goto L_0x00ff
        L_0x00ec:
            java.lang.String r4 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r6 = r4 instanceof com.google.android.gms.internal.ads.j1
            if (r6 == 0) goto L_0x00fa
            r6 = r4
            com.google.android.gms.internal.ads.j1 r6 = (com.google.android.gms.internal.ads.j1) r6
            goto L_0x00ff
        L_0x00fa:
            com.google.android.gms.internal.ads.l1 r6 = new com.google.android.gms.internal.ads.l1
            r6.<init>(r3)
        L_0x00ff:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            r3.w6(r6)
            r5.writeNoException()
            goto L_0x025c
        L_0x010a:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            android.os.Bundle r3 = r3.d()
            r5.writeNoException()
            e8.ob0.d(r5, r3)
            goto L_0x025c
        L_0x011b:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            c8.a r3 = r3.w()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x025c
        L_0x012c:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.fn r3 = r3.f8438b
            c8.b r4 = new c8.b
            r4.<init>(r3)
            r5.writeNoException()
            e8.ob0.b(r5, r4)
            goto L_0x025c
        L_0x013e:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r4 = r2
            com.google.android.gms.internal.ads.wa r4 = (com.google.android.gms.internal.ads.wa) r4
            e8.fn r4 = r4.f8438b
            r4.l(r3)
            r5.writeNoException()
            goto L_0x025c
        L_0x0153:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r4 = r2
            com.google.android.gms.internal.ads.wa r4 = (com.google.android.gms.internal.ads.wa) r4
            e8.fn r4 = r4.f8438b
            boolean r3 = r4.m(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x025c
        L_0x016c:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r4 = r2
            com.google.android.gms.internal.ads.wa r4 = (com.google.android.gms.internal.ads.wa) r4
            e8.fn r4 = r4.f8438b
            r4.k(r3)
            r5.writeNoException()
            goto L_0x025c
        L_0x0181:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            com.google.android.gms.internal.ads.u r3 = r3.h()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x025c
        L_0x0190:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.fn r3 = r3.f8438b
            r3.a()
            r5.writeNoException()
            goto L_0x025c
        L_0x019d:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            java.lang.String r3 = r3.f8437a
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x025c
        L_0x01aa:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            com.google.android.gms.internal.ads.hz r3 = r3.getVideoController()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x025c
        L_0x01b9:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            java.lang.String r3 = r3.r()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x025c
        L_0x01c8:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            monitor-enter(r3)
            java.lang.String r4 = "store"
            java.lang.String r4 = r3.t(r4)     // Catch:{ all -> 0x01dd }
            monitor-exit(r3)
            r5.writeNoException()
            r5.writeString(r4)
            goto L_0x025c
        L_0x01dd:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x01e0:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            monitor-enter(r3)
            double r0 = r3.f15169n     // Catch:{ all -> 0x01f0 }
            monitor-exit(r3)
            r5.writeNoException()
            r5.writeDouble(r0)
            goto L_0x025c
        L_0x01f0:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x01f3:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            monitor-enter(r3)
            java.lang.String r4 = "advertiser"
            java.lang.String r4 = r3.t(r4)     // Catch:{ all -> 0x0207 }
            monitor-exit(r3)
            r5.writeNoException()
            r5.writeString(r4)
            goto L_0x025c
        L_0x0207:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x020a:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            java.lang.String r3 = r3.b()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x025c
        L_0x021a:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            monitor-enter(r3)
            com.google.android.gms.internal.ads.z r4 = r3.f15170o     // Catch:{ all -> 0x022a }
            monitor-exit(r3)
            r5.writeNoException()
            e8.ob0.b(r5, r4)
            goto L_0x025c
        L_0x022a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x022d:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            java.lang.String r3 = r3.a()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x025c
        L_0x023d:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            java.util.List r3 = r3.f()
            r5.writeNoException()
            r5.writeList(r3)
            goto L_0x025c
        L_0x024d:
            r3 = r2
            com.google.android.gms.internal.ads.wa r3 = (com.google.android.gms.internal.ads.wa) r3
            e8.jn r3 = r3.f8439c
            java.lang.String r3 = r3.e()
            r5.writeNoException()
            r5.writeString(r3)
        L_0x025c:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n1.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
