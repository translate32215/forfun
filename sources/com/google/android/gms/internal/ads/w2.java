package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class w2 extends os implements x2 {
    public w2() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.y2] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.y2] */
    /* JADX WARNING: type inference failed for: r2v29, types: [com.google.android.gms.internal.ads.v1] */
    /* JADX WARNING: type inference failed for: r2v34, types: [com.google.android.gms.internal.ads.y2] */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: type inference failed for: r2v53 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) throws android.os.RemoteException {
        /*
            r11 = this;
            r15 = 1
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            r2 = 0
            switch(r12) {
                case 1: goto L_0x0308;
                case 2: goto L_0x02fd;
                case 3: goto L_0x02ca;
                case 4: goto L_0x02c2;
                case 5: goto L_0x02ba;
                case 6: goto L_0x0275;
                case 7: goto L_0x0239;
                case 8: goto L_0x0231;
                case 9: goto L_0x0229;
                case 10: goto L_0x01ff;
                case 11: goto L_0x01eb;
                case 12: goto L_0x01e3;
                case 13: goto L_0x01d5;
                case 14: goto L_0x018c;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x0150;
                case 20: goto L_0x0138;
                case 21: goto L_0x0128;
                case 22: goto L_0x011a;
                case 23: goto L_0x00fe;
                case 24: goto L_0x00f2;
                case 25: goto L_0x00e1;
                case 26: goto L_0x00d5;
                case 27: goto L_0x00c9;
                case 28: goto L_0x0095;
                case 29: goto L_0x0008;
                case 30: goto L_0x0085;
                case 31: goto L_0x0055;
                case 32: goto L_0x0021;
                case 33: goto L_0x0015;
                case 34: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r0
        L_0x0009:
            com.google.android.gms.internal.ads.h4 r12 = r11.m0()
            r14.writeNoException()
            e8.ob0.d(r14, r12)
            goto L_0x0347
        L_0x0015:
            com.google.android.gms.internal.ads.h4 r12 = r11.r0()
            r14.writeNoException()
            e8.ob0.d(r14, r12)
            goto L_0x0347
        L_0x0021:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r13, r0)
            e8.fi0 r0 = (e8.fi0) r0
            java.lang.String r3 = r13.readString()
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 != 0) goto L_0x003c
            goto L_0x004d
        L_0x003c:
            android.os.IInterface r1 = r13.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.y2
            if (r2 == 0) goto L_0x0048
            r2 = r1
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x004d
        L_0x0048:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r13)
        L_0x004d:
            r11.b5(r12, r0, r3, r2)
            r14.writeNoException()
            goto L_0x0347
        L_0x0055:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            android.os.IBinder r0 = r13.readStrongBinder()
            if (r0 != 0) goto L_0x0064
            goto L_0x0077
        L_0x0064:
            java.lang.String r1 = "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.v1
            if (r2 == 0) goto L_0x0072
            r2 = r1
            com.google.android.gms.internal.ads.v1 r2 = (com.google.android.gms.internal.ads.v1) r2
            goto L_0x0077
        L_0x0072:
            com.google.android.gms.internal.ads.w1 r2 = new com.google.android.gms.internal.ads.w1
            r2.<init>(r0)
        L_0x0077:
            android.os.Parcelable$Creator<e8.b4> r0 = e8.b4.CREATOR
            java.util.ArrayList r13 = r13.createTypedArrayList(r0)
            r11.W5(r12, r2, r13)
            r14.writeNoException()
            goto L_0x0347
        L_0x0085:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            r11.v3(r12)
            r14.writeNoException()
            goto L_0x0347
        L_0x0095:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r13, r0)
            e8.fi0 r0 = (e8.fi0) r0
            java.lang.String r3 = r13.readString()
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 != 0) goto L_0x00b0
            goto L_0x00c1
        L_0x00b0:
            android.os.IInterface r1 = r13.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.y2
            if (r2 == 0) goto L_0x00bc
            r2 = r1
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x00c1
        L_0x00bc:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r13)
        L_0x00c1:
            r11.m6(r12, r0, r3, r2)
            r14.writeNoException()
            goto L_0x0347
        L_0x00c9:
            com.google.android.gms.internal.ads.j3 r12 = r11.m1()
            r14.writeNoException()
            e8.ob0.b(r14, r12)
            goto L_0x0347
        L_0x00d5:
            com.google.android.gms.internal.ads.hz r12 = r11.getVideoController()
            r14.writeNoException()
            e8.ob0.b(r14, r12)
            goto L_0x0347
        L_0x00e1:
            java.lang.ClassLoader r12 = e8.ob0.f15778a
            int r12 = r13.readInt()
            if (r12 == 0) goto L_0x00ea
            r0 = 1
        L_0x00ea:
            r11.N(r0)
            r14.writeNoException()
            goto L_0x0347
        L_0x00f2:
            com.google.android.gms.internal.ads.l0 r12 = r11.I4()
            r14.writeNoException()
            e8.ob0.b(r14, r12)
            goto L_0x0347
        L_0x00fe:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            android.os.IBinder r0 = r13.readStrongBinder()
            com.google.android.gms.internal.ads.y5 r0 = com.google.android.gms.internal.ads.x5.s6(r0)
            java.util.ArrayList r13 = r13.createStringArrayList()
            r11.i4(r12, r0, r13)
            r14.writeNoException()
            goto L_0x0347
        L_0x011a:
            boolean r12 = r11.l6()
            r14.writeNoException()
            java.lang.ClassLoader r13 = e8.ob0.f15778a
            r14.writeInt(r12)
            goto L_0x0347
        L_0x0128:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            r11.J4(r12)
            r14.writeNoException()
            goto L_0x0347
        L_0x0138:
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            e8.fi0 r12 = (e8.fi0) r12
            java.lang.String r0 = r13.readString()
            java.lang.String r13 = r13.readString()
            r11.a6(r12, r0, r13)
            r14.writeNoException()
            goto L_0x0347
        L_0x0150:
            android.os.Bundle r12 = r11.e2()
            r14.writeNoException()
            e8.ob0.d(r14, r12)
            goto L_0x0347
        L_0x015c:
            android.os.Bundle r12 = r11.getInterstitialAdapterInfo()
            r14.writeNoException()
            e8.ob0.d(r14, r12)
            goto L_0x0347
        L_0x0168:
            android.os.Bundle r12 = r11.zzuw()
            r14.writeNoException()
            e8.ob0.d(r14, r12)
            goto L_0x0347
        L_0x0174:
            com.google.android.gms.internal.ads.e3 r12 = r11.l2()
            r14.writeNoException()
            e8.ob0.b(r14, r12)
            goto L_0x0347
        L_0x0180:
            com.google.android.gms.internal.ads.d3 r12 = r11.N3()
            r14.writeNoException()
            e8.ob0.b(r14, r12)
            goto L_0x0347
        L_0x018c:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r5 = r12
            e8.fi0 r5 = (e8.fi0) r5
            java.lang.String r6 = r13.readString()
            java.lang.String r7 = r13.readString()
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 != 0) goto L_0x01ad
        L_0x01ab:
            r8 = r2
            goto L_0x01bf
        L_0x01ad:
            android.os.IInterface r0 = r12.queryLocalInterface(r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.y2
            if (r1 == 0) goto L_0x01b9
            r2 = r0
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x01ab
        L_0x01b9:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r12)
            goto L_0x01ab
        L_0x01bf:
            android.os.Parcelable$Creator<e8.n1> r12 = e8.n1.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r9 = r12
            e8.n1 r9 = (e8.n1) r9
            java.util.ArrayList r10 = r13.createStringArrayList()
            r3 = r11
            r3.C1(r4, r5, r6, r7, r8, r9, r10)
            r14.writeNoException()
            goto L_0x0347
        L_0x01d5:
            boolean r12 = r11.isInitialized()
            r14.writeNoException()
            java.lang.ClassLoader r13 = e8.ob0.f15778a
            r14.writeInt(r12)
            goto L_0x0347
        L_0x01e3:
            r11.showVideo()
            r14.writeNoException()
            goto L_0x0347
        L_0x01eb:
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            e8.fi0 r12 = (e8.fi0) r12
            java.lang.String r13 = r13.readString()
            r11.d2(r12, r13)
            r14.writeNoException()
            goto L_0x0347
        L_0x01ff:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r1 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r2 = r12
            e8.fi0 r2 = (e8.fi0) r2
            java.lang.String r3 = r13.readString()
            android.os.IBinder r12 = r13.readStrongBinder()
            com.google.android.gms.internal.ads.y5 r4 = com.google.android.gms.internal.ads.x5.s6(r12)
            java.lang.String r5 = r13.readString()
            r0 = r11
            r0.U0(r1, r2, r3, r4, r5)
            r14.writeNoException()
            goto L_0x0347
        L_0x0229:
            r11.D()
            r14.writeNoException()
            goto L_0x0347
        L_0x0231:
            r11.g()
            r14.writeNoException()
            goto L_0x0347
        L_0x0239:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r5 = r12
            e8.fi0 r5 = (e8.fi0) r5
            java.lang.String r6 = r13.readString()
            java.lang.String r7 = r13.readString()
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 != 0) goto L_0x025a
        L_0x0258:
            r8 = r2
            goto L_0x026c
        L_0x025a:
            android.os.IInterface r13 = r12.queryLocalInterface(r1)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.y2
            if (r0 == 0) goto L_0x0266
            r2 = r13
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x0258
        L_0x0266:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r12)
            goto L_0x0258
        L_0x026c:
            r3 = r11
            r3.c5(r4, r5, r6, r7, r8)
            r14.writeNoException()
            goto L_0x0347
        L_0x0275:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.li0> r12 = e8.li0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r5 = r12
            e8.li0 r5 = (e8.li0) r5
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r6 = r12
            e8.fi0 r6 = (e8.fi0) r6
            java.lang.String r7 = r13.readString()
            java.lang.String r8 = r13.readString()
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 != 0) goto L_0x029f
        L_0x029d:
            r9 = r2
            goto L_0x02b1
        L_0x029f:
            android.os.IInterface r13 = r12.queryLocalInterface(r1)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.y2
            if (r0 == 0) goto L_0x02ab
            r2 = r13
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x029d
        L_0x02ab:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r12)
            goto L_0x029d
        L_0x02b1:
            r3 = r11
            r3.S5(r4, r5, r6, r7, r8, r9)
            r14.writeNoException()
            goto L_0x0347
        L_0x02ba:
            r11.destroy()
            r14.writeNoException()
            goto L_0x0347
        L_0x02c2:
            r11.showInterstitial()
            r14.writeNoException()
            goto L_0x0347
        L_0x02ca:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r12 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r13, r0)
            e8.fi0 r0 = (e8.fi0) r0
            java.lang.String r3 = r13.readString()
            android.os.IBinder r13 = r13.readStrongBinder()
            if (r13 != 0) goto L_0x02e5
            goto L_0x02f6
        L_0x02e5:
            android.os.IInterface r1 = r13.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.y2
            if (r2 == 0) goto L_0x02f1
            r2 = r1
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x02f6
        L_0x02f1:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r13)
        L_0x02f6:
            r11.f2(r12, r0, r3, r2)
            r14.writeNoException()
            goto L_0x0347
        L_0x02fd:
            c8.a r12 = r11.i5()
            r14.writeNoException()
            e8.ob0.b(r14, r12)
            goto L_0x0347
        L_0x0308:
            android.os.IBinder r12 = r13.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r12)
            android.os.Parcelable$Creator<e8.li0> r12 = e8.li0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r5 = r12
            e8.li0 r5 = (e8.li0) r5
            android.os.Parcelable$Creator<e8.fi0> r12 = e8.fi0.CREATOR
            android.os.Parcelable r12 = e8.ob0.a(r13, r12)
            r6 = r12
            e8.fi0 r6 = (e8.fi0) r6
            java.lang.String r7 = r13.readString()
            android.os.IBinder r12 = r13.readStrongBinder()
            if (r12 != 0) goto L_0x032e
        L_0x032c:
            r8 = r2
            goto L_0x0340
        L_0x032e:
            android.os.IInterface r13 = r12.queryLocalInterface(r1)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.y2
            if (r0 == 0) goto L_0x033a
            r2 = r13
            com.google.android.gms.internal.ads.y2 r2 = (com.google.android.gms.internal.ads.y2) r2
            goto L_0x032c
        L_0x033a:
            com.google.android.gms.internal.ads.a3 r2 = new com.google.android.gms.internal.ads.a3
            r2.<init>(r12)
            goto L_0x032c
        L_0x0340:
            r3 = r11
            r3.A2(r4, r5, r6, r7, r8)
            r14.writeNoException()
        L_0x0347:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w2.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
