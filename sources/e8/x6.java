package e8;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.d5;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x6 implements Parcelable.Creator<d5> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r69) {
        /*
            r68 = this;
            r0 = r69
            int r1 = w7.b.r(r69)
            r2 = 0
            r4 = 0
            r28 = r2
            r35 = r28
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
        L_0x0075:
            int r2 = r69.dataPosition()
            if (r2 >= r1) goto L_0x022c
            int r2 = r69.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0226;
                case 2: goto L_0x0220;
                case 3: goto L_0x0215;
                case 4: goto L_0x020a;
                case 5: goto L_0x0204;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01ee;
                case 8: goto L_0x01e8;
                case 9: goto L_0x01e2;
                case 10: goto L_0x01dc;
                case 11: goto L_0x01d0;
                case 12: goto L_0x01ca;
                case 13: goto L_0x01c4;
                case 14: goto L_0x01be;
                case 15: goto L_0x01b8;
                case 16: goto L_0x01b2;
                case 17: goto L_0x0083;
                case 18: goto L_0x01ac;
                case 19: goto L_0x01a6;
                case 20: goto L_0x01a0;
                case 21: goto L_0x019a;
                case 22: goto L_0x0083;
                case 23: goto L_0x0083;
                case 24: goto L_0x0083;
                case 25: goto L_0x0194;
                case 26: goto L_0x018e;
                case 27: goto L_0x0188;
                case 28: goto L_0x0182;
                case 29: goto L_0x0176;
                case 30: goto L_0x0170;
                case 31: goto L_0x016a;
                case 32: goto L_0x0083;
                case 33: goto L_0x0164;
                case 34: goto L_0x015e;
                case 35: goto L_0x0158;
                case 36: goto L_0x0152;
                case 37: goto L_0x014c;
                case 38: goto L_0x0083;
                case 39: goto L_0x0146;
                case 40: goto L_0x0140;
                case 41: goto L_0x013a;
                case 42: goto L_0x0134;
                case 43: goto L_0x012e;
                case 44: goto L_0x0128;
                case 45: goto L_0x0122;
                case 46: goto L_0x0116;
                case 47: goto L_0x0110;
                case 48: goto L_0x010a;
                case 49: goto L_0x0104;
                case 50: goto L_0x00fe;
                case 51: goto L_0x00f8;
                case 52: goto L_0x00f2;
                case 53: goto L_0x00c4;
                case 54: goto L_0x00bf;
                case 55: goto L_0x00ba;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00b0;
                case 58: goto L_0x00ab;
                case 59: goto L_0x00a6;
                case 60: goto L_0x00a1;
                case 61: goto L_0x009c;
                case 62: goto L_0x0083;
                case 63: goto L_0x0091;
                case 64: goto L_0x008c;
                case 65: goto L_0x0087;
                default: goto L_0x0083;
            }
        L_0x0083:
            w7.b.q(r0, r2)
            goto L_0x0075
        L_0x0087:
            android.os.Bundle r67 = w7.b.a(r0, r2)
            goto L_0x0075
        L_0x008c:
            java.lang.String r66 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x0091:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.z1> r3 = com.google.android.gms.internal.ads.z1.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r65 = r2
            com.google.android.gms.internal.ads.z1 r65 = (com.google.android.gms.internal.ads.z1) r65
            goto L_0x0075
        L_0x009c:
            java.lang.String r64 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x00a1:
            java.util.ArrayList r63 = w7.b.g(r0, r2)
            goto L_0x0075
        L_0x00a6:
            boolean r62 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x00ab:
            boolean r61 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x00b0:
            boolean r60 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x00b5:
            int r59 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x00ba:
            java.util.ArrayList r58 = w7.b.g(r0, r2)
            goto L_0x0075
        L_0x00bf:
            java.lang.String r57 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x00c4:
            int r2 = w7.b.p(r0, r2)
            int r3 = r69.dataPosition()
            if (r2 != 0) goto L_0x00d1
            r56 = 0
            goto L_0x0075
        L_0x00d1:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r69.readInt()
            r5 = 0
        L_0x00db:
            if (r5 >= r7) goto L_0x00eb
            int r56 = r69.readInt()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r56)
            r4.add(r6)
            int r5 = r5 + 1
            goto L_0x00db
        L_0x00eb:
            int r3 = r3 + r2
            r0.setDataPosition(r3)
            r56 = r4
            goto L_0x0075
        L_0x00f2:
            boolean r55 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x00f8:
            java.lang.String r54 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x00fe:
            java.lang.String r53 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x0104:
            java.lang.String r52 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x010a:
            android.os.Bundle r51 = w7.b.a(r0, r2)
            goto L_0x0075
        L_0x0110:
            boolean r50 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x0116:
            android.os.Parcelable$Creator<e8.yi0> r3 = e8.yi0.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r49 = r2
            e8.yi0 r49 = (e8.yi0) r49
            goto L_0x0075
        L_0x0122:
            java.lang.String r48 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x0128:
            android.os.Bundle r47 = w7.b.a(r0, r2)
            goto L_0x0075
        L_0x012e:
            int r46 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x0134:
            boolean r45 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x013a:
            java.lang.String r44 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x0140:
            boolean r39 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x0146:
            java.lang.String r43 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x014c:
            boolean r42 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x0152:
            int r41 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x0158:
            int r40 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x015e:
            float r38 = w7.b.l(r0, r2)
            goto L_0x0075
        L_0x0164:
            java.lang.String r37 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x016a:
            long r35 = w7.b.o(r0, r2)
            goto L_0x0075
        L_0x0170:
            java.util.ArrayList r34 = w7.b.g(r0, r2)
            goto L_0x0075
        L_0x0176:
            android.os.Parcelable$Creator<e8.n1> r3 = e8.n1.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r33 = r2
            e8.n1 r33 = (e8.n1) r33
            goto L_0x0075
        L_0x0182:
            java.lang.String r32 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x0188:
            java.util.ArrayList r31 = w7.b.g(r0, r2)
            goto L_0x0075
        L_0x018e:
            java.lang.String r30 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x0194:
            long r28 = w7.b.o(r0, r2)
            goto L_0x0075
        L_0x019a:
            java.lang.String r27 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x01a0:
            float r26 = w7.b.l(r0, r2)
            goto L_0x0075
        L_0x01a6:
            int r25 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x01ac:
            int r24 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x01b2:
            boolean r23 = w7.b.k(r0, r2)
            goto L_0x0075
        L_0x01b8:
            android.os.Bundle r22 = w7.b.a(r0, r2)
            goto L_0x0075
        L_0x01be:
            java.util.ArrayList r21 = w7.b.g(r0, r2)
            goto L_0x0075
        L_0x01c4:
            int r20 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x01ca:
            android.os.Bundle r19 = w7.b.a(r0, r2)
            goto L_0x0075
        L_0x01d0:
            android.os.Parcelable$Creator<e8.f9> r3 = e8.f9.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r18 = r2
            e8.f9 r18 = (e8.f9) r18
            goto L_0x0075
        L_0x01dc:
            java.lang.String r17 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x01e2:
            java.lang.String r16 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x01e8:
            java.lang.String r15 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x01ee:
            android.os.Parcelable$Creator r3 = android.content.pm.PackageInfo.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r14 = r2
            android.content.pm.PackageInfo r14 = (android.content.pm.PackageInfo) r14
            goto L_0x0075
        L_0x01f9:
            android.os.Parcelable$Creator r3 = android.content.pm.ApplicationInfo.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r13 = r2
            android.content.pm.ApplicationInfo r13 = (android.content.pm.ApplicationInfo) r13
            goto L_0x0075
        L_0x0204:
            java.lang.String r12 = w7.b.e(r0, r2)
            goto L_0x0075
        L_0x020a:
            android.os.Parcelable$Creator<e8.li0> r3 = e8.li0.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r11 = r2
            e8.li0 r11 = (e8.li0) r11
            goto L_0x0075
        L_0x0215:
            android.os.Parcelable$Creator<e8.fi0> r3 = e8.fi0.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r10 = r2
            e8.fi0 r10 = (e8.fi0) r10
            goto L_0x0075
        L_0x0220:
            android.os.Bundle r9 = w7.b.a(r0, r2)
            goto L_0x0075
        L_0x0226:
            int r8 = w7.b.n(r0, r2)
            goto L_0x0075
        L_0x022c:
            w7.b.j(r0, r1)
            com.google.android.gms.internal.ads.d5 r0 = new com.google.android.gms.internal.ads.d5
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.x6.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d5[i10];
    }
}
