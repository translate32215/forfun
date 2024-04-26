package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class gy extends os implements dy {
    public gy() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.rx] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.ky] */
    /* JADX WARNING: type inference failed for: r1v9, types: [e8.n6] */
    /* JADX WARNING: type inference failed for: r1v13, types: [e8.q6] */
    /* JADX WARNING: type inference failed for: r1v18, types: [com.google.android.gms.internal.ads.n] */
    /* JADX WARNING: type inference failed for: r1v22, types: [com.google.android.gms.internal.ads.ox] */
    /* JADX WARNING: type inference failed for: r1v26, types: [e8.ui0] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.ads.t5] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.google.android.gms.internal.ads.jy] */
    /* JADX WARNING: type inference failed for: r1v38, types: [com.google.android.gms.internal.ads.av] */
    /* JADX WARNING: type inference failed for: r1v42, types: [com.google.android.gms.internal.ads.cz] */
    /* JADX WARNING: type inference failed for: r1v46, types: [com.google.android.gms.internal.ads.sx] */
    /* JADX WARNING: type inference failed for: r1v51, types: [com.google.android.gms.internal.ads.qy] */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r1v63 */
    /* JADX WARNING: type inference failed for: r1v64 */
    /* JADX WARNING: type inference failed for: r1v65 */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: type inference failed for: r1v68 */
    /* JADX WARNING: type inference failed for: r1v69 */
    /* JADX WARNING: type inference failed for: r1v70 */
    /* JADX WARNING: type inference failed for: r1v71 */
    /* JADX WARNING: type inference failed for: r1v72 */
    /* JADX WARNING: type inference failed for: r1v73 */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: type inference failed for: r1v76 */
    /* JADX WARNING: type inference failed for: r1v77 */
    /* JADX WARNING: type inference failed for: r1v78 */
    /* JADX WARNING: type inference failed for: r1v79 */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            r0 = 0
            r1 = 0
            switch(r3) {
                case 1: goto L_0x031c;
                case 2: goto L_0x0315;
                case 3: goto L_0x0308;
                case 4: goto L_0x02f5;
                case 5: goto L_0x02ee;
                case 6: goto L_0x02e7;
                case 7: goto L_0x02c6;
                case 8: goto L_0x02a5;
                case 9: goto L_0x029d;
                case 10: goto L_0x0295;
                case 11: goto L_0x028d;
                case 12: goto L_0x0281;
                case 13: goto L_0x0271;
                case 14: goto L_0x024f;
                case 15: goto L_0x0229;
                case 16: goto L_0x0006;
                case 17: goto L_0x0006;
                case 18: goto L_0x021d;
                case 19: goto L_0x01fb;
                case 20: goto L_0x01d9;
                case 21: goto L_0x01b7;
                case 22: goto L_0x01a6;
                case 23: goto L_0x0198;
                case 24: goto L_0x0176;
                case 25: goto L_0x016a;
                case 26: goto L_0x015e;
                case 27: goto L_0x0006;
                case 28: goto L_0x0006;
                case 29: goto L_0x014e;
                case 30: goto L_0x013e;
                case 31: goto L_0x0132;
                case 32: goto L_0x0126;
                case 33: goto L_0x011a;
                case 34: goto L_0x0109;
                case 35: goto L_0x00fd;
                case 36: goto L_0x00db;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00c3;
                case 39: goto L_0x00b3;
                case 40: goto L_0x0091;
                case 41: goto L_0x0085;
                case 42: goto L_0x0063;
                case 43: goto L_0x0039;
                case 44: goto L_0x0029;
                case 45: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return r0
        L_0x0007:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x000e
            goto L_0x0021
        L_0x000e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.qy
            if (r0 == 0) goto L_0x001c
            r1 = r4
            com.google.android.gms.internal.ads.qy r1 = (com.google.android.gms.internal.ads.qy) r1
            goto L_0x0021
        L_0x001c:
            com.google.android.gms.internal.ads.sy r1 = new com.google.android.gms.internal.ads.sy
            r1.<init>(r3)
        L_0x0021:
            r2.q3(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x0029:
            android.os.IBinder r3 = r4.readStrongBinder()
            c8.a r3 = c8.a.C0062a.Y(r3)
            r2.O5(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x0039:
            android.os.Parcelable$Creator<e8.fi0> r3 = e8.fi0.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.fi0 r3 = (e8.fi0) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 != 0) goto L_0x0048
            goto L_0x005b
        L_0x0048:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdLoadCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.sx
            if (r1 == 0) goto L_0x0056
            r1 = r0
            com.google.android.gms.internal.ads.sx r1 = (com.google.android.gms.internal.ads.sx) r1
            goto L_0x005b
        L_0x0056:
            com.google.android.gms.internal.ads.vx r1 = new com.google.android.gms.internal.ads.vx
            r1.<init>(r4)
        L_0x005b:
            r2.r5(r3, r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x0063:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x006a
            goto L_0x007d
        L_0x006a:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.cz
            if (r0 == 0) goto L_0x0078
            r1 = r4
            com.google.android.gms.internal.ads.cz r1 = (com.google.android.gms.internal.ads.cz) r1
            goto L_0x007d
        L_0x0078:
            com.google.android.gms.internal.ads.ez r1 = new com.google.android.gms.internal.ads.ez
            r1.<init>(r3)
        L_0x007d:
            r2.y5(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x0085:
            com.google.android.gms.internal.ads.gz r3 = r2.B()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x0326
        L_0x0091:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            java.lang.String r4 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.av
            if (r0 == 0) goto L_0x00a6
            r1 = r4
            com.google.android.gms.internal.ads.av r1 = (com.google.android.gms.internal.ads.av) r1
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.internal.ads.cv r1 = new com.google.android.gms.internal.ads.cv
            r1.<init>(r3)
        L_0x00ab:
            r2.F1(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x00b3:
            android.os.Parcelable$Creator<e8.pi0> r3 = e8.pi0.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.pi0 r3 = (e8.pi0) r3
            r2.L5(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x00c3:
            java.lang.String r3 = r4.readString()
            r2.k2(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x00cf:
            android.os.Bundle r3 = r2.X()
            r5.writeNoException()
            e8.ob0.d(r5, r3)
            goto L_0x0326
        L_0x00db:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00e2
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.jy
            if (r0 == 0) goto L_0x00f0
            r1 = r4
            com.google.android.gms.internal.ads.jy r1 = (com.google.android.gms.internal.ads.jy) r1
            goto L_0x00f5
        L_0x00f0:
            com.google.android.gms.internal.ads.ly r1 = new com.google.android.gms.internal.ads.ly
            r1.<init>(r3)
        L_0x00f5:
            r2.e0(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x00fd:
            java.lang.String r3 = r2.A0()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0326
        L_0x0109:
            java.lang.ClassLoader r3 = e8.ob0.f15778a
            int r3 = r4.readInt()
            if (r3 == 0) goto L_0x0112
            r0 = 1
        L_0x0112:
            r2.N(r0)
            r5.writeNoException()
            goto L_0x0326
        L_0x011a:
            com.google.android.gms.internal.ads.rx r3 = r2.n2()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x0326
        L_0x0126:
            com.google.android.gms.internal.ads.ky r3 = r2.F0()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x0326
        L_0x0132:
            java.lang.String r3 = r2.H4()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0326
        L_0x013e:
            android.os.Parcelable$Creator<e8.yi0> r3 = e8.yi0.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.yi0 r3 = (e8.yi0) r3
            r2.Q2(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x014e:
            android.os.Parcelable$Creator<e8.h> r3 = e8.h.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.h r3 = (e8.h) r3
            r2.p2(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x015e:
            com.google.android.gms.internal.ads.hz r3 = r2.getVideoController()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
            goto L_0x0326
        L_0x016a:
            java.lang.String r3 = r4.readString()
            r2.i0(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x0176:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x017d
            goto L_0x0190
        L_0x017d:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.t5
            if (r0 == 0) goto L_0x018b
            r1 = r4
            com.google.android.gms.internal.ads.t5 r1 = (com.google.android.gms.internal.ads.t5) r1
            goto L_0x0190
        L_0x018b:
            com.google.android.gms.internal.ads.w5 r1 = new com.google.android.gms.internal.ads.w5
            r1.<init>(r3)
        L_0x0190:
            r2.T(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x0198:
            boolean r3 = r2.j()
            r5.writeNoException()
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            r5.writeInt(r3)
            goto L_0x0326
        L_0x01a6:
            java.lang.ClassLoader r3 = e8.ob0.f15778a
            int r3 = r4.readInt()
            if (r3 == 0) goto L_0x01af
            r0 = 1
        L_0x01af:
            r2.X1(r0)
            r5.writeNoException()
            goto L_0x0326
        L_0x01b7:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x01be
            goto L_0x01d1
        L_0x01be:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof e8.ui0
            if (r0 == 0) goto L_0x01cc
            r1 = r4
            e8.ui0 r1 = (e8.ui0) r1
            goto L_0x01d1
        L_0x01cc:
            e8.vi0 r1 = new e8.vi0
            r1.<init>(r3)
        L_0x01d1:
            r2.t3(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x01d9:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x01e0
            goto L_0x01f3
        L_0x01e0:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.ox
            if (r0 == 0) goto L_0x01ee
            r1 = r4
            com.google.android.gms.internal.ads.ox r1 = (com.google.android.gms.internal.ads.ox) r1
            goto L_0x01f3
        L_0x01ee:
            com.google.android.gms.internal.ads.px r1 = new com.google.android.gms.internal.ads.px
            r1.<init>(r3)
        L_0x01f3:
            r2.q1(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x01fb:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0202
            goto L_0x0215
        L_0x0202:
            java.lang.String r4 = "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.n
            if (r0 == 0) goto L_0x0210
            r1 = r4
            com.google.android.gms.internal.ads.n r1 = (com.google.android.gms.internal.ads.n) r1
            goto L_0x0215
        L_0x0210:
            com.google.android.gms.internal.ads.o r1 = new com.google.android.gms.internal.ads.o
            r1.<init>(r3)
        L_0x0215:
            r2.Z5(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x021d:
            java.lang.String r3 = r2.s()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0326
        L_0x0229:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0230
            goto L_0x0243
        L_0x0230:
            java.lang.String r0 = "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof e8.q6
            if (r1 == 0) goto L_0x023e
            r1 = r0
            e8.q6 r1 = (e8.q6) r1
            goto L_0x0243
        L_0x023e:
            e8.r6 r1 = new e8.r6
            r1.<init>(r3)
        L_0x0243:
            java.lang.String r3 = r4.readString()
            r2.n3(r1, r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x024f:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0256
            goto L_0x0269
        L_0x0256:
            java.lang.String r4 = "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof e8.n6
            if (r0 == 0) goto L_0x0264
            r1 = r4
            e8.n6 r1 = (e8.n6) r1
            goto L_0x0269
        L_0x0264:
            e8.p6 r1 = new e8.p6
            r1.<init>(r3)
        L_0x0269:
            r2.C4(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x0271:
            android.os.Parcelable$Creator<e8.li0> r3 = e8.li0.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.li0 r3 = (e8.li0) r3
            r2.n5(r3)
            r5.writeNoException()
            goto L_0x0326
        L_0x0281:
            e8.li0 r3 = r2.O4()
            r5.writeNoException()
            e8.ob0.d(r5, r3)
            goto L_0x0326
        L_0x028d:
            r2.r3()
            r5.writeNoException()
            goto L_0x0326
        L_0x0295:
            r2.r1()
            r5.writeNoException()
            goto L_0x0326
        L_0x029d:
            r2.showInterstitial()
            r5.writeNoException()
            goto L_0x0326
        L_0x02a5:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x02ac
            goto L_0x02bf
        L_0x02ac:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.ky
            if (r0 == 0) goto L_0x02ba
            r1 = r4
            com.google.android.gms.internal.ads.ky r1 = (com.google.android.gms.internal.ads.ky) r1
            goto L_0x02bf
        L_0x02ba:
            com.google.android.gms.internal.ads.my r1 = new com.google.android.gms.internal.ads.my
            r1.<init>(r3)
        L_0x02bf:
            r2.k1(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x02c6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x02cd
            goto L_0x02e0
        L_0x02cd:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.rx
            if (r0 == 0) goto L_0x02db
            r1 = r4
            com.google.android.gms.internal.ads.rx r1 = (com.google.android.gms.internal.ads.rx) r1
            goto L_0x02e0
        L_0x02db:
            com.google.android.gms.internal.ads.tx r1 = new com.google.android.gms.internal.ads.tx
            r1.<init>(r3)
        L_0x02e0:
            r2.p6(r1)
            r5.writeNoException()
            goto L_0x0326
        L_0x02e7:
            r2.D()
            r5.writeNoException()
            goto L_0x0326
        L_0x02ee:
            r2.g()
            r5.writeNoException()
            goto L_0x0326
        L_0x02f5:
            android.os.Parcelable$Creator<e8.fi0> r3 = e8.fi0.CREATOR
            android.os.Parcelable r3 = e8.ob0.a(r4, r3)
            e8.fi0 r3 = (e8.fi0) r3
            boolean r3 = r2.e1(r3)
            r5.writeNoException()
            r5.writeInt(r3)
            goto L_0x0326
        L_0x0308:
            boolean r3 = r2.isReady()
            r5.writeNoException()
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            r5.writeInt(r3)
            goto L_0x0326
        L_0x0315:
            r2.destroy()
            r5.writeNoException()
            goto L_0x0326
        L_0x031c:
            c8.a r3 = r2.O1()
            r5.writeNoException()
            e8.ob0.b(r5, r3)
        L_0x0326:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gy.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
