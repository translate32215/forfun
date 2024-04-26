package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class q5 extends os implements r5 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7918a = 0;

    public q5() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.t5] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.jy] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.p5] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x0147
            r0 = 2
            if (r4 == r0) goto L_0x0140
            r0 = 3
            r1 = 0
            if (r4 == r0) goto L_0x011f
            r0 = 34
            r2 = 0
            if (r4 == r0) goto L_0x010f
            switch(r4) {
                case 5: goto L_0x0102;
                case 6: goto L_0x00fb;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00cd;
                case 11: goto L_0x00bd;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00a5;
                case 14: goto L_0x0083;
                case 15: goto L_0x0077;
                case 16: goto L_0x0055;
                case 17: goto L_0x0049;
                case 18: goto L_0x0039;
                case 19: goto L_0x002d;
                case 20: goto L_0x001f;
                case 21: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            return r2
        L_0x0013:
            com.google.android.gms.internal.ads.gz r4 = r3.B()
            r6.writeNoException()
            e8.ob0.b(r6, r4)
            goto L_0x0155
        L_0x001f:
            boolean r4 = r3.p3()
            r6.writeNoException()
            java.lang.ClassLoader r5 = e8.ob0.f15778a
            r6.writeInt(r4)
            goto L_0x0155
        L_0x002d:
            java.lang.String r4 = r5.readString()
            r3.G5(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x0039:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r3.v5(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x0049:
            java.lang.String r4 = r5.readString()
            r3.a3(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x0055:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x005c
            goto L_0x006f
        L_0x005c:
            java.lang.String r5 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.p5
            if (r0 == 0) goto L_0x006a
            r1 = r5
            com.google.android.gms.internal.ads.p5 r1 = (com.google.android.gms.internal.ads.p5) r1
            goto L_0x006f
        L_0x006a:
            com.google.android.gms.internal.ads.o5 r1 = new com.google.android.gms.internal.ads.o5
            r1.<init>(r4)
        L_0x006f:
            r3.f3(r1)
            r6.writeNoException()
            goto L_0x0155
        L_0x0077:
            android.os.Bundle r4 = r3.X()
            r6.writeNoException()
            e8.ob0.d(r6, r4)
            goto L_0x0155
        L_0x0083:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x008a
            goto L_0x009d
        L_0x008a:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.jy
            if (r0 == 0) goto L_0x0098
            r1 = r5
            com.google.android.gms.internal.ads.jy r1 = (com.google.android.gms.internal.ads.jy) r1
            goto L_0x009d
        L_0x0098:
            com.google.android.gms.internal.ads.ly r1 = new com.google.android.gms.internal.ads.ly
            r1.<init>(r4)
        L_0x009d:
            r3.e0(r1)
            r6.writeNoException()
            goto L_0x0155
        L_0x00a5:
            java.lang.String r4 = r5.readString()
            r3.i0(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x00b1:
            java.lang.String r4 = r3.s()
            r6.writeNoException()
            r6.writeString(r4)
            goto L_0x0155
        L_0x00bd:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r3.o1(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x00cd:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r3.O2(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x00dd:
            android.os.IBinder r4 = r5.readStrongBinder()
            c8.a r4 = c8.a.C0062a.Y(r4)
            r3.g4(r4)
            r6.writeNoException()
            goto L_0x0155
        L_0x00ed:
            r3.destroy()
            r6.writeNoException()
            goto L_0x0155
        L_0x00f4:
            r3.D()
            r6.writeNoException()
            goto L_0x0155
        L_0x00fb:
            r3.g()
            r6.writeNoException()
            goto L_0x0155
        L_0x0102:
            boolean r4 = r3.G0()
            r6.writeNoException()
            java.lang.ClassLoader r5 = e8.ob0.f15778a
            r6.writeInt(r4)
            goto L_0x0155
        L_0x010f:
            java.lang.ClassLoader r4 = e8.ob0.f15778a
            int r4 = r5.readInt()
            if (r4 == 0) goto L_0x0118
            r2 = 1
        L_0x0118:
            r3.N(r2)
            r6.writeNoException()
            goto L_0x0155
        L_0x011f:
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 != 0) goto L_0x0126
            goto L_0x0139
        L_0x0126:
            java.lang.String r5 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.t5
            if (r0 == 0) goto L_0x0134
            r1 = r5
            com.google.android.gms.internal.ads.t5 r1 = (com.google.android.gms.internal.ads.t5) r1
            goto L_0x0139
        L_0x0134:
            com.google.android.gms.internal.ads.w5 r1 = new com.google.android.gms.internal.ads.w5
            r1.<init>(r4)
        L_0x0139:
            r3.T(r1)
            r6.writeNoException()
            goto L_0x0155
        L_0x0140:
            r3.S()
            r6.writeNoException()
            goto L_0x0155
        L_0x0147:
            android.os.Parcelable$Creator<e8.u7> r4 = e8.u7.CREATOR
            android.os.Parcelable r4 = e8.ob0.a(r5, r4)
            e8.u7 r4 = (e8.u7) r4
            r3.N5(r4)
            r6.writeNoException()
        L_0x0155:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q5.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
