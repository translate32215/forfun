package e8;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class hi0 implements Parcelable.Creator<fi0> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r32) {
        /*
            r31 = this;
            r0 = r32
            int r1 = w7.b.r(r32)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r3
            r12 = r10
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r28 = r26
            r29 = r28
            r8 = r4
            r7 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r25 = 0
            r27 = 0
            r30 = 0
        L_0x0030:
            int r2 = r32.dataPosition()
            if (r2 >= r1) goto L_0x00cc
            int r2 = r32.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x00c6;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00b4;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00a4;
                case 8: goto L_0x009f;
                case 9: goto L_0x009a;
                case 10: goto L_0x008f;
                case 11: goto L_0x0084;
                case 12: goto L_0x007f;
                case 13: goto L_0x007a;
                case 14: goto L_0x0075;
                case 15: goto L_0x0070;
                case 16: goto L_0x006b;
                case 17: goto L_0x0066;
                case 18: goto L_0x0061;
                case 19: goto L_0x0056;
                case 20: goto L_0x0051;
                case 21: goto L_0x004c;
                case 22: goto L_0x0047;
                case 23: goto L_0x0042;
                default: goto L_0x003e;
            }
        L_0x003e:
            w7.b.q(r0, r2)
            goto L_0x0030
        L_0x0042:
            int r30 = w7.b.n(r0, r2)
            goto L_0x0030
        L_0x0047:
            java.util.ArrayList r29 = w7.b.g(r0, r2)
            goto L_0x0030
        L_0x004c:
            java.lang.String r28 = w7.b.e(r0, r2)
            goto L_0x0030
        L_0x0051:
            int r27 = w7.b.n(r0, r2)
            goto L_0x0030
        L_0x0056:
            android.os.Parcelable$Creator<e8.xh0> r3 = e8.xh0.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r26 = r2
            e8.xh0 r26 = (e8.xh0) r26
            goto L_0x0030
        L_0x0061:
            boolean r25 = w7.b.k(r0, r2)
            goto L_0x0030
        L_0x0066:
            java.lang.String r24 = w7.b.e(r0, r2)
            goto L_0x0030
        L_0x006b:
            java.lang.String r23 = w7.b.e(r0, r2)
            goto L_0x0030
        L_0x0070:
            java.util.ArrayList r22 = w7.b.g(r0, r2)
            goto L_0x0030
        L_0x0075:
            android.os.Bundle r21 = w7.b.a(r0, r2)
            goto L_0x0030
        L_0x007a:
            android.os.Bundle r20 = w7.b.a(r0, r2)
            goto L_0x0030
        L_0x007f:
            java.lang.String r19 = w7.b.e(r0, r2)
            goto L_0x0030
        L_0x0084:
            android.os.Parcelable$Creator r3 = android.location.Location.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r18 = r2
            android.location.Location r18 = (android.location.Location) r18
            goto L_0x0030
        L_0x008f:
            android.os.Parcelable$Creator<e8.e> r3 = e8.e.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r17 = r2
            e8.e r17 = (e8.e) r17
            goto L_0x0030
        L_0x009a:
            java.lang.String r16 = w7.b.e(r0, r2)
            goto L_0x0030
        L_0x009f:
            boolean r15 = w7.b.k(r0, r2)
            goto L_0x0030
        L_0x00a4:
            int r14 = w7.b.n(r0, r2)
            goto L_0x0030
        L_0x00a9:
            boolean r13 = w7.b.k(r0, r2)
            goto L_0x0030
        L_0x00ae:
            java.util.ArrayList r12 = w7.b.g(r0, r2)
            goto L_0x0030
        L_0x00b4:
            int r11 = w7.b.n(r0, r2)
            goto L_0x0030
        L_0x00ba:
            android.os.Bundle r10 = w7.b.a(r0, r2)
            goto L_0x0030
        L_0x00c0:
            long r8 = w7.b.o(r0, r2)
            goto L_0x0030
        L_0x00c6:
            int r7 = w7.b.n(r0, r2)
            goto L_0x0030
        L_0x00cc:
            w7.b.j(r0, r1)
            e8.fi0 r0 = new e8.fi0
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.hi0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new fi0[i10];
    }
}
