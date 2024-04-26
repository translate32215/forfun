package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class uy extends os implements ry {
    public uy() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            r0 = 0
            switch(r2) {
                case 1: goto L_0x00d9;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00a0;
                case 6: goto L_0x008d;
                case 7: goto L_0x0082;
                case 8: goto L_0x0075;
                case 9: goto L_0x006a;
                case 10: goto L_0x005e;
                case 11: goto L_0x004e;
                case 12: goto L_0x002a;
                case 13: goto L_0x001e;
                case 14: goto L_0x000e;
                case 15: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return r0
        L_0x0006:
            r1.o6()
            r4.writeNoException()
            goto L_0x00df
        L_0x000e:
            android.os.Parcelable$Creator<e8.c> r2 = e8.c.CREATOR
            android.os.Parcelable r2 = e8.ob0.a(r3, r2)
            e8.c r2 = (e8.c) r2
            r1.b6(r2)
            r4.writeNoException()
            goto L_0x00df
        L_0x001e:
            java.util.List r2 = r1.X4()
            r4.writeNoException()
            r4.writeTypedList(r2)
            goto L_0x00df
        L_0x002a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0032
            r2 = 0
            goto L_0x0046
        L_0x0032:
            java.lang.String r3 = "com.google.android.gms.ads.internal.initialization.IInitializationCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.x1
            if (r0 == 0) goto L_0x0040
            r2 = r3
            com.google.android.gms.internal.ads.x1 r2 = (com.google.android.gms.internal.ads.x1) r2
            goto L_0x0046
        L_0x0040:
            com.google.android.gms.internal.ads.y1 r3 = new com.google.android.gms.internal.ads.y1
            r3.<init>(r2)
            r2 = r3
        L_0x0046:
            r1.x1(r2)
            r4.writeNoException()
            goto L_0x00df
        L_0x004e:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.s2 r2 = com.google.android.gms.internal.ads.v2.s6(r2)
            r1.s3(r2)
            r4.writeNoException()
            goto L_0x00df
        L_0x005e:
            java.lang.String r2 = r3.readString()
            r1.M5(r2)
            r4.writeNoException()
            goto L_0x00df
        L_0x006a:
            java.lang.String r2 = r1.j6()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x00df
        L_0x0075:
            boolean r2 = r1.I0()
            r4.writeNoException()
            java.lang.ClassLoader r3 = e8.ob0.f15778a
            r4.writeInt(r2)
            goto L_0x00df
        L_0x0082:
            float r2 = r1.n4()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00df
        L_0x008d:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r3 = r3.readStrongBinder()
            c8.a r3 = c8.a.C0062a.Y(r3)
            r1.P0(r2, r3)
            r4.writeNoException()
            goto L_0x00df
        L_0x00a0:
            android.os.IBinder r2 = r3.readStrongBinder()
            c8.a r2 = c8.a.C0062a.Y(r2)
            java.lang.String r3 = r3.readString()
            r1.f5(r2, r3)
            r4.writeNoException()
            goto L_0x00df
        L_0x00b3:
            java.lang.ClassLoader r2 = e8.ob0.f15778a
            int r2 = r3.readInt()
            if (r2 == 0) goto L_0x00bc
            r0 = 1
        L_0x00bc:
            r1.j3(r0)
            r4.writeNoException()
            goto L_0x00df
        L_0x00c3:
            java.lang.String r2 = r3.readString()
            r1.W4(r2)
            r4.writeNoException()
            goto L_0x00df
        L_0x00ce:
            float r2 = r3.readFloat()
            r1.C3(r2)
            r4.writeNoException()
            goto L_0x00df
        L_0x00d9:
            r1.P()
            r4.writeNoException()
        L_0x00df:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uy.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
