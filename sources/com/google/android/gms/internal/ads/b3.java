package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class b3 extends os implements y2 {
    public b3() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static y2 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof y2) {
            return (y2) queryLocalInterface;
        }
        return new a3(iBinder);
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [e8.l5] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.l0] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.b6] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x0101;
                case 2: goto L_0x00fd;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00cb;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00bb;
                case 10: goto L_0x009a;
                case 11: goto L_0x0095;
                case 12: goto L_0x008c;
                case 13: goto L_0x0087;
                case 14: goto L_0x007a;
                case 15: goto L_0x0075;
                case 16: goto L_0x0056;
                case 17: goto L_0x004d;
                case 18: goto L_0x0048;
                case 19: goto L_0x003b;
                case 20: goto L_0x0036;
                case 21: goto L_0x002d;
                case 22: goto L_0x0020;
                case 23: goto L_0x0013;
                case 24: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.Parcelable$Creator<e8.zh0> r2 = e8.zh0.CREATOR
            android.os.Parcelable r2 = e8.ob0.a(r3, r2)
            e8.zh0 r2 = (e8.zh0) r2
            r1.X5(r2)
            goto L_0x0104
        L_0x0013:
            android.os.Parcelable$Creator<e8.zh0> r2 = e8.zh0.CREATOR
            android.os.Parcelable r2 = e8.ob0.a(r3, r2)
            e8.zh0 r2 = (e8.zh0) r2
            r1.U(r2)
            goto L_0x0104
        L_0x0020:
            int r2 = r3.readInt()
            java.lang.String r3 = r3.readString()
            r1.t4(r2, r3)
            goto L_0x0104
        L_0x002d:
            java.lang.String r2 = r3.readString()
            r1.g3(r2)
            goto L_0x0104
        L_0x0036:
            r1.c0()
            goto L_0x0104
        L_0x003b:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = e8.ob0.a(r3, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r1.b0(r2)
            goto L_0x0104
        L_0x0048:
            r1.V0()
            goto L_0x0104
        L_0x004d:
            int r2 = r3.readInt()
            r1.Q3(r2)
            goto L_0x0104
        L_0x0056:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x005d
            goto L_0x0070
        L_0x005d:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.b6
            if (r5 == 0) goto L_0x006b
            r5 = r3
            com.google.android.gms.internal.ads.b6 r5 = (com.google.android.gms.internal.ads.b6) r5
            goto L_0x0070
        L_0x006b:
            com.google.android.gms.internal.ads.c6 r5 = new com.google.android.gms.internal.ads.c6
            r5.<init>(r2)
        L_0x0070:
            r1.V(r5)
            goto L_0x0104
        L_0x0075:
            r1.a0()
            goto L_0x0104
        L_0x007a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.a6> r2 = com.google.android.gms.internal.ads.a6.CREATOR
            android.os.Parcelable r2 = e8.ob0.a(r3, r2)
            com.google.android.gms.internal.ads.a6 r2 = (com.google.android.gms.internal.ads.a6) r2
            r1.l3(r2)
            goto L_0x0104
        L_0x0087:
            r1.E2()
            goto L_0x0104
        L_0x008c:
            java.lang.String r2 = r3.readString()
            r1.B1(r2)
            goto L_0x0104
        L_0x0095:
            r1.y0()
            goto L_0x0104
        L_0x009a:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00a1
            goto L_0x00b3
        L_0x00a1:
            java.lang.String r5 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.l0
            if (r0 == 0) goto L_0x00ae
            com.google.android.gms.internal.ads.l0 r5 = (com.google.android.gms.internal.ads.l0) r5
            goto L_0x00b3
        L_0x00ae:
            com.google.android.gms.internal.ads.m0 r5 = new com.google.android.gms.internal.ads.m0
            r5.<init>(r2)
        L_0x00b3:
            java.lang.String r2 = r3.readString()
            r1.u0(r5, r2)
            goto L_0x0104
        L_0x00bb:
            java.lang.String r2 = r3.readString()
            java.lang.String r3 = r3.readString()
            r1.a(r2, r3)
            goto L_0x0104
        L_0x00c7:
            r1.O()
            goto L_0x0104
        L_0x00cb:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00d2
            goto L_0x00e5
        L_0x00d2:
            java.lang.String r3 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof e8.l5
            if (r5 == 0) goto L_0x00e0
            r5 = r3
            e8.l5 r5 = (e8.l5) r5
            goto L_0x00e5
        L_0x00e0:
            e8.k5 r5 = new e8.k5
            r5.<init>(r2)
        L_0x00e5:
            r1.S0(r5)
            goto L_0x0104
        L_0x00e9:
            r1.v()
            goto L_0x0104
        L_0x00ed:
            r1.F()
            goto L_0x0104
        L_0x00f1:
            r1.J()
            goto L_0x0104
        L_0x00f5:
            int r2 = r3.readInt()
            r1.h0(r2)
            goto L_0x0104
        L_0x00fd:
            r1.C()
            goto L_0x0104
        L_0x0101:
            r1.n()
        L_0x0104:
            r4.writeNoException()
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b3.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
