package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class x extends os implements y {
    public x() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.ads.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.gms.internal.ads.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.gms.internal.ads.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.gms.internal.ads.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.c1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.hz] */
    /* JADX WARNING: type inference failed for: r5v50, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            switch(r4) {
                case 2: goto L_0x0139;
                case 3: goto L_0x0115;
                case 4: goto L_0x0106;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00a6;
                case 7: goto L_0x0082;
                case 8: goto L_0x0059;
                case 9: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r0
        L_0x0008:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x000f
            goto L_0x0022
        L_0x000f:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.z0
            if (r0 == 0) goto L_0x001d
            r1 = r5
            com.google.android.gms.internal.ads.z0 r1 = (com.google.android.gms.internal.ads.z0) r1
            goto L_0x0022
        L_0x001d:
            com.google.android.gms.internal.ads.c1 r1 = new com.google.android.gms.internal.ads.c1
            r1.<init>(r4)
        L_0x0022:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            e8.l<java.lang.Boolean> r5 = e8.t.C3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0038
            goto L_0x0054
        L_0x0038:
            e8.jn r5 = r4.f6196a
            com.google.android.gms.internal.ads.hz r5 = r5.h()
            boolean r5 = r5 instanceof com.google.android.gms.internal.ads.w7
            if (r5 == 0) goto L_0x0054
            e8.jn r4 = r4.f6196a
            com.google.android.gms.internal.ads.hz r4 = r4.h()
            com.google.android.gms.internal.ads.w7 r4 = (com.google.android.gms.internal.ads.w7) r4
            java.lang.Object r5 = r4.f8419b
            monitor-enter(r5)
            r4.f8431v = r1     // Catch:{ all -> 0x0051 }
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            throw r4
        L_0x0054:
            r6.writeNoException()
            goto L_0x01be
        L_0x0059:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            e8.l<java.lang.Boolean> r5 = e8.t.C3
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r5 = r1.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            e8.jn r4 = r4.f6196a
            com.google.android.gms.internal.ads.hz r4 = r4.h()
            if (r4 == 0) goto L_0x0078
            r0 = 1
        L_0x0078:
            r6.writeNoException()
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            r6.writeInt(r0)
            goto L_0x01be
        L_0x0082:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            e8.l<java.lang.Boolean> r5 = e8.t.C3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            e8.jn r4 = r4.f6196a
            com.google.android.gms.internal.ads.hz r1 = r4.h()
        L_0x009e:
            r6.writeNoException()
            e8.ob0.b(r6, r1)
            goto L_0x01be
        L_0x00a6:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            e8.l<java.lang.Boolean> r5 = e8.t.C3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x00bc
            goto L_0x00ce
        L_0x00bc:
            e8.jn r5 = r4.f6196a
            com.google.android.gms.internal.ads.hz r5 = r5.h()
            if (r5 == 0) goto L_0x00ce
            e8.jn r4 = r4.f6196a
            com.google.android.gms.internal.ads.hz r4 = r4.h()
            float r2 = r4.H0()
        L_0x00ce:
            r6.writeNoException()
            r6.writeFloat(r2)
            goto L_0x01be
        L_0x00d6:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            e8.l<java.lang.Boolean> r5 = e8.t.C3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x00ec
            goto L_0x00fe
        L_0x00ec:
            e8.jn r5 = r4.f6196a
            com.google.android.gms.internal.ads.hz r5 = r5.h()
            if (r5 == 0) goto L_0x00fe
            e8.jn r4 = r4.f6196a
            com.google.android.gms.internal.ads.hz r4 = r4.h()
            float r2 = r4.n0()
        L_0x00fe:
            r6.writeNoException()
            r6.writeFloat(r2)
            goto L_0x01be
        L_0x0106:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            c8.a r4 = r4.b3()
            r6.writeNoException()
            e8.ob0.b(r6, r4)
            goto L_0x01be
        L_0x0115:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r5 = r3
            com.google.android.gms.internal.ads.da r5 = (com.google.android.gms.internal.ads.da) r5
            e8.l<java.lang.Boolean> r0 = e8.t.M1
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0134
            r5.f6197b = r4
        L_0x0134:
            r6.writeNoException()
            goto L_0x01be
        L_0x0139:
            r4 = r3
            com.google.android.gms.internal.ads.da r4 = (com.google.android.gms.internal.ads.da) r4
            e8.l<java.lang.Boolean> r5 = e8.t.B3
            e8.ti0 r0 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r0 = r0.f16769f
            java.lang.Object r5 = r0.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0150
            goto L_0x01b8
        L_0x0150:
            e8.jn r5 = r4.f6196a
            monitor-enter(r5)
            float r0 = r5.f15175t     // Catch:{ all -> 0x01bf }
            monitor-exit(r5)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0164
            e8.jn r4 = r4.f6196a
            monitor-enter(r4)
            float r2 = r4.f15175t     // Catch:{ all -> 0x0161 }
            monitor-exit(r4)
            goto L_0x01b8
        L_0x0161:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0164:
            e8.jn r5 = r4.f6196a
            com.google.android.gms.internal.ads.hz r5 = r5.h()
            if (r5 == 0) goto L_0x017e
            e8.jn r4 = r4.f6196a     // Catch:{ RemoteException -> 0x0177 }
            com.google.android.gms.internal.ads.hz r4 = r4.h()     // Catch:{ RemoteException -> 0x0177 }
            float r2 = r4.s1()     // Catch:{ RemoteException -> 0x0177 }
            goto L_0x01b8
        L_0x0177:
            r4 = move-exception
            java.lang.String r5 = "Remote exception getting video controller aspect ratio."
            l0.e.C(r5, r4)
            goto L_0x01b8
        L_0x017e:
            c8.a r5 = r4.f6197b
            if (r5 == 0) goto L_0x0187
            float r2 = com.google.android.gms.internal.ads.da.s6(r5)
            goto L_0x01b8
        L_0x0187:
            e8.jn r4 = r4.f6196a
            com.google.android.gms.internal.ads.z r4 = r4.l()
            if (r4 != 0) goto L_0x0190
            goto L_0x01b8
        L_0x0190:
            int r5 = r4.getWidth()
            r0 = -1
            if (r5 == r0) goto L_0x01a9
            int r5 = r4.getHeight()
            if (r5 == r0) goto L_0x01a9
            int r5 = r4.getWidth()
            float r5 = (float) r5
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            goto L_0x01aa
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01b0
            r2 = r5
            goto L_0x01b8
        L_0x01b0:
            c8.a r4 = r4.y3()
            float r2 = com.google.android.gms.internal.ads.da.s6(r4)
        L_0x01b8:
            r6.writeNoException()
            r6.writeFloat(r2)
        L_0x01be:
            return r7
        L_0x01bf:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
