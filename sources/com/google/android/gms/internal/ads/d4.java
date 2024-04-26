package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class d4 extends os implements a4 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6149a = 0;

    public d4() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [e8.v5] */
    /* JADX WARNING: type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.q3] */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.gms.internal.ads.p3] */
    /* JADX WARNING: type inference failed for: r19v0, types: [com.google.android.gms.internal.ads.p3] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.ads.v3] */
    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.ads.t3] */
    /* JADX WARNING: type inference failed for: r12v0, types: [com.google.android.gms.internal.ads.t3] */
    /* JADX WARNING: type inference failed for: r3v17, types: [com.google.android.gms.internal.ads.b4] */
    /* JADX WARNING: type inference failed for: r3v18, types: [com.google.android.gms.internal.ads.z3] */
    /* JADX WARNING: type inference failed for: r12v1, types: [com.google.android.gms.internal.ads.z3] */
    /* JADX WARNING: type inference failed for: r3v22, types: [com.google.android.gms.internal.ads.w3] */
    /* JADX WARNING: type inference failed for: r3v23, types: [com.google.android.gms.internal.ads.u3] */
    /* JADX WARNING: type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.u3] */
    /* JADX WARNING: type inference failed for: r3v26, types: [com.google.android.gms.internal.ads.b4] */
    /* JADX WARNING: type inference failed for: r3v27, types: [com.google.android.gms.internal.ads.z3] */
    /* JADX WARNING: type inference failed for: r12v2, types: [com.google.android.gms.internal.ads.z3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r23, android.os.Parcel r24, android.os.Parcel r25, int r26) throws android.os.RemoteException {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L_0x01fd
            r5 = 2
            if (r0 == r5) goto L_0x01f5
            r5 = 3
            if (r0 == r5) goto L_0x01ed
            r5 = 5
            if (r0 == r5) goto L_0x01de
            r5 = 10
            if (r0 == r5) goto L_0x01d3
            r5 = 11
            if (r0 == r5) goto L_0x01c3
            java.lang.String r5 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            r6 = 0
            switch(r0) {
                case 13: goto L_0x016f;
                case 14: goto L_0x0127;
                case 15: goto L_0x0116;
                case 16: goto L_0x00d0;
                case 17: goto L_0x00bf;
                case 18: goto L_0x0077;
                case 19: goto L_0x0068;
                case 20: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            return r6
        L_0x0022:
            java.lang.String r8 = r24.readString()
            java.lang.String r9 = r24.readString()
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r10 = r0
            e8.fi0 r10 = (e8.fi0) r10
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a r11 = c8.a.C0062a.Y(r0)
            android.os.IBinder r0 = r24.readStrongBinder()
            if (r0 != 0) goto L_0x0043
        L_0x0041:
            r12 = r3
            goto L_0x0054
        L_0x0043:
            android.os.IInterface r3 = r0.queryLocalInterface(r5)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.z3
            if (r5 == 0) goto L_0x004e
            com.google.android.gms.internal.ads.z3 r3 = (com.google.android.gms.internal.ads.z3) r3
            goto L_0x0041
        L_0x004e:
            com.google.android.gms.internal.ads.b4 r3 = new com.google.android.gms.internal.ads.b4
            r3.<init>(r0)
            goto L_0x0041
        L_0x0054:
            android.os.IBinder r0 = r24.readStrongBinder()
            com.google.android.gms.internal.ads.y2 r13 = com.google.android.gms.internal.ads.b3.s6(r0)
            r7 = r22
            com.google.android.gms.internal.ads.g4 r7 = (com.google.android.gms.internal.ads.g4) r7
            r7.Q1(r8, r9, r10, r11, r12, r13)
            r25.writeNoException()
            goto L_0x0248
        L_0x0068:
            java.lang.String r0 = r24.readString()
            r1 = r22
            com.google.android.gms.internal.ads.g4 r1 = (com.google.android.gms.internal.ads.g4) r1
            r1.f6513c = r0
            r25.writeNoException()
            goto L_0x0248
        L_0x0077:
            java.lang.String r6 = r24.readString()
            java.lang.String r7 = r24.readString()
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r8 = r0
            e8.fi0 r8 = (e8.fi0) r8
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a r9 = c8.a.C0062a.Y(r0)
            android.os.IBinder r0 = r24.readStrongBinder()
            if (r0 != 0) goto L_0x0098
        L_0x0096:
            r10 = r3
            goto L_0x00ab
        L_0x0098:
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.u3
            if (r5 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.u3 r3 = (com.google.android.gms.internal.ads.u3) r3
            goto L_0x0096
        L_0x00a5:
            com.google.android.gms.internal.ads.w3 r3 = new com.google.android.gms.internal.ads.w3
            r3.<init>(r0)
            goto L_0x0096
        L_0x00ab:
            android.os.IBinder r0 = r24.readStrongBinder()
            com.google.android.gms.internal.ads.y2 r11 = com.google.android.gms.internal.ads.b3.s6(r0)
            r5 = r22
            com.google.android.gms.internal.ads.g4 r5 = (com.google.android.gms.internal.ads.g4) r5
            r5.y4(r6, r7, r8, r9, r10, r11)
            r25.writeNoException()
            goto L_0x0248
        L_0x00bf:
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a.C0062a.Y(r0)
            r25.writeNoException()
            java.lang.ClassLoader r0 = e8.ob0.f15778a
            r2.writeInt(r6)
            goto L_0x0248
        L_0x00d0:
            java.lang.String r8 = r24.readString()
            java.lang.String r9 = r24.readString()
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r10 = r0
            e8.fi0 r10 = (e8.fi0) r10
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a r11 = c8.a.C0062a.Y(r0)
            android.os.IBinder r0 = r24.readStrongBinder()
            if (r0 != 0) goto L_0x00f1
        L_0x00ef:
            r12 = r3
            goto L_0x0102
        L_0x00f1:
            android.os.IInterface r3 = r0.queryLocalInterface(r5)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.z3
            if (r5 == 0) goto L_0x00fc
            com.google.android.gms.internal.ads.z3 r3 = (com.google.android.gms.internal.ads.z3) r3
            goto L_0x00ef
        L_0x00fc:
            com.google.android.gms.internal.ads.b4 r3 = new com.google.android.gms.internal.ads.b4
            r3.<init>(r0)
            goto L_0x00ef
        L_0x0102:
            android.os.IBinder r0 = r24.readStrongBinder()
            com.google.android.gms.internal.ads.y2 r13 = com.google.android.gms.internal.ads.b3.s6(r0)
            r7 = r22
            com.google.android.gms.internal.ads.g4 r7 = (com.google.android.gms.internal.ads.g4) r7
            r7.v2(r8, r9, r10, r11, r12, r13)
            r25.writeNoException()
            goto L_0x0248
        L_0x0116:
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a.C0062a.Y(r0)
            r25.writeNoException()
            java.lang.ClassLoader r0 = e8.ob0.f15778a
            r2.writeInt(r6)
            goto L_0x0248
        L_0x0127:
            java.lang.String r8 = r24.readString()
            java.lang.String r9 = r24.readString()
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r10 = r0
            e8.fi0 r10 = (e8.fi0) r10
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a r11 = c8.a.C0062a.Y(r0)
            android.os.IBinder r0 = r24.readStrongBinder()
            if (r0 != 0) goto L_0x0148
        L_0x0146:
            r12 = r3
            goto L_0x015b
        L_0x0148:
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.t3
            if (r5 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.t3 r3 = (com.google.android.gms.internal.ads.t3) r3
            goto L_0x0146
        L_0x0155:
            com.google.android.gms.internal.ads.v3 r3 = new com.google.android.gms.internal.ads.v3
            r3.<init>(r0)
            goto L_0x0146
        L_0x015b:
            android.os.IBinder r0 = r24.readStrongBinder()
            com.google.android.gms.internal.ads.y2 r13 = com.google.android.gms.internal.ads.b3.s6(r0)
            r7 = r22
            com.google.android.gms.internal.ads.g4 r7 = (com.google.android.gms.internal.ads.g4) r7
            r7.a1(r8, r9, r10, r11, r12, r13)
            r25.writeNoException()
            goto L_0x0248
        L_0x016f:
            java.lang.String r15 = r24.readString()
            java.lang.String r16 = r24.readString()
            android.os.Parcelable$Creator<e8.fi0> r0 = e8.fi0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r17 = r0
            e8.fi0 r17 = (e8.fi0) r17
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a r18 = c8.a.C0062a.Y(r0)
            android.os.IBinder r0 = r24.readStrongBinder()
            if (r0 != 0) goto L_0x0192
        L_0x018f:
            r19 = r3
            goto L_0x01a5
        L_0x0192:
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.p3
            if (r5 == 0) goto L_0x019f
            com.google.android.gms.internal.ads.p3 r3 = (com.google.android.gms.internal.ads.p3) r3
            goto L_0x018f
        L_0x019f:
            com.google.android.gms.internal.ads.q3 r3 = new com.google.android.gms.internal.ads.q3
            r3.<init>(r0)
            goto L_0x018f
        L_0x01a5:
            android.os.IBinder r0 = r24.readStrongBinder()
            com.google.android.gms.internal.ads.y2 r20 = com.google.android.gms.internal.ads.b3.s6(r0)
            android.os.Parcelable$Creator<e8.li0> r0 = e8.li0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r21 = r0
            e8.li0 r21 = (e8.li0) r21
            r14 = r22
            com.google.android.gms.internal.ads.g4 r14 = (com.google.android.gms.internal.ads.g4) r14
            r14.X2(r15, r16, r17, r18, r19, r20, r21)
            r25.writeNoException()
            goto L_0x0248
        L_0x01c3:
            r24.createStringArray()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r1.createTypedArray(r0)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r25.writeNoException()
            goto L_0x0248
        L_0x01d3:
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a.C0062a.Y(r0)
            r25.writeNoException()
            goto L_0x0248
        L_0x01de:
            r0 = r22
            com.google.android.gms.internal.ads.g4 r0 = (com.google.android.gms.internal.ads.g4) r0
            com.google.android.gms.internal.ads.hz r0 = r0.getVideoController()
            r25.writeNoException()
            e8.ob0.b(r2, r0)
            goto L_0x0248
        L_0x01ed:
            r0 = r22
            com.google.android.gms.internal.ads.g4 r0 = (com.google.android.gms.internal.ads.g4) r0
            r0.m0()
            throw r3
        L_0x01f5:
            r0 = r22
            com.google.android.gms.internal.ads.g4 r0 = (com.google.android.gms.internal.ads.g4) r0
            r0.r0()
            throw r3
        L_0x01fd:
            android.os.IBinder r0 = r24.readStrongBinder()
            c8.a r6 = c8.a.C0062a.Y(r0)
            java.lang.String r7 = r24.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = e8.ob0.a(r1, r0)
            r8 = r5
            android.os.Bundle r8 = (android.os.Bundle) r8
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r9 = r0
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.Parcelable$Creator<e8.li0> r0 = e8.li0.CREATOR
            android.os.Parcelable r0 = e8.ob0.a(r1, r0)
            r10 = r0
            e8.li0 r10 = (e8.li0) r10
            android.os.IBinder r0 = r24.readStrongBinder()
            if (r0 != 0) goto L_0x022a
        L_0x0228:
            r11 = r3
            goto L_0x023e
        L_0x022a:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r3 = r1 instanceof e8.v5
            if (r3 == 0) goto L_0x0238
            r3 = r1
            e8.v5 r3 = (e8.v5) r3
            goto L_0x0228
        L_0x0238:
            e8.w5 r3 = new e8.w5
            r3.<init>(r0)
            goto L_0x0228
        L_0x023e:
            r5 = r22
            com.google.android.gms.internal.ads.g4 r5 = (com.google.android.gms.internal.ads.g4) r5
            r5.i2(r6, r7, r8, r9, r10, r11)
            r25.writeNoException()
        L_0x0248:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d4.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
