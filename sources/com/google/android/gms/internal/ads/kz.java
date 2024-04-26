package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class kz extends os implements hz {
    public kz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static hz s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof hz) {
            return (hz) queryLocalInterface;
        }
        return new jz(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            r0 = 0
            switch(r2) {
                case 1: goto L_0x00aa;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0093;
                case 4: goto L_0x0086;
                case 5: goto L_0x007b;
                case 6: goto L_0x0070;
                case 7: goto L_0x0065;
                case 8: goto L_0x0042;
                case 9: goto L_0x0036;
                case 10: goto L_0x0028;
                case 11: goto L_0x001c;
                case 12: goto L_0x000e;
                case 13: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return r0
        L_0x0006:
            r1.stop()
            r4.writeNoException()
            goto L_0x00b0
        L_0x000e:
            boolean r2 = r1.p1()
            r4.writeNoException()
            java.lang.ClassLoader r3 = e8.ob0.f15778a
            r4.writeInt(r2)
            goto L_0x00b0
        L_0x001c:
            com.google.android.gms.internal.ads.mz r2 = r1.R1()
            r4.writeNoException()
            e8.ob0.b(r4, r2)
            goto L_0x00b0
        L_0x0028:
            boolean r2 = r1.k3()
            r4.writeNoException()
            java.lang.ClassLoader r3 = e8.ob0.f15778a
            r4.writeInt(r2)
            goto L_0x00b0
        L_0x0036:
            float r2 = r1.s1()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00b0
        L_0x0042:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x004a
            r2 = 0
            goto L_0x005e
        L_0x004a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.mz
            if (r0 == 0) goto L_0x0058
            r2 = r3
            com.google.android.gms.internal.ads.mz r2 = (com.google.android.gms.internal.ads.mz) r2
            goto L_0x005e
        L_0x0058:
            com.google.android.gms.internal.ads.nz r3 = new com.google.android.gms.internal.ads.nz
            r3.<init>(r2)
            r2 = r3
        L_0x005e:
            r1.x3(r2)
            r4.writeNoException()
            goto L_0x00b0
        L_0x0065:
            float r2 = r1.H0()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00b0
        L_0x0070:
            float r2 = r1.n0()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x00b0
        L_0x007b:
            int r2 = r1.W()
            r4.writeNoException()
            r4.writeInt(r2)
            goto L_0x00b0
        L_0x0086:
            boolean r2 = r1.u2()
            r4.writeNoException()
            java.lang.ClassLoader r3 = e8.ob0.f15778a
            r4.writeInt(r2)
            goto L_0x00b0
        L_0x0093:
            java.lang.ClassLoader r2 = e8.ob0.f15778a
            int r2 = r3.readInt()
            if (r2 == 0) goto L_0x009c
            r0 = 1
        L_0x009c:
            r1.X3(r0)
            r4.writeNoException()
            goto L_0x00b0
        L_0x00a3:
            r1.g()
            r4.writeNoException()
            goto L_0x00b0
        L_0x00aa:
            r1.k0()
            r4.writeNoException()
        L_0x00b0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kz.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
