package e7;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j implements Parcelable.Creator<AdOverlayInfoParcel> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            r27 = this;
            r0 = r28
            int r1 = w7.b.r(r28)
            r2 = 0
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r11 = 0
            r14 = 0
            r15 = 0
        L_0x0029:
            int r2 = r28.dataPosition()
            if (r2 >= r1) goto L_0x00bd
            int r2 = r28.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x00b2;
                case 3: goto L_0x00ac;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00a1;
                case 6: goto L_0x009c;
                case 7: goto L_0x0097;
                case 8: goto L_0x0092;
                case 9: goto L_0x008d;
                case 10: goto L_0x0088;
                case 11: goto L_0x0083;
                case 12: goto L_0x007e;
                case 13: goto L_0x0079;
                case 14: goto L_0x006e;
                case 15: goto L_0x0037;
                case 16: goto L_0x0069;
                case 17: goto L_0x005e;
                case 18: goto L_0x0059;
                case 19: goto L_0x0054;
                case 20: goto L_0x004f;
                case 21: goto L_0x004a;
                case 22: goto L_0x0045;
                case 23: goto L_0x0040;
                case 24: goto L_0x003b;
                default: goto L_0x0037;
            }
        L_0x0037:
            w7.b.q(r0, r2)
            goto L_0x0029
        L_0x003b:
            java.lang.String r26 = w7.b.e(r0, r2)
            goto L_0x0029
        L_0x0040:
            android.os.IBinder r25 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x0045:
            android.os.IBinder r24 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x004a:
            android.os.IBinder r23 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x004f:
            android.os.IBinder r22 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x0054:
            java.lang.String r21 = w7.b.e(r0, r2)
            goto L_0x0029
        L_0x0059:
            android.os.IBinder r20 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x005e:
            android.os.Parcelable$Creator<d7.g> r3 = d7.g.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r19 = r2
            d7.g r19 = (d7.g) r19
            goto L_0x0029
        L_0x0069:
            java.lang.String r18 = w7.b.e(r0, r2)
            goto L_0x0029
        L_0x006e:
            android.os.Parcelable$Creator<e8.f9> r3 = e8.f9.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r17 = r2
            e8.f9 r17 = (e8.f9) r17
            goto L_0x0029
        L_0x0079:
            java.lang.String r16 = w7.b.e(r0, r2)
            goto L_0x0029
        L_0x007e:
            int r15 = w7.b.n(r0, r2)
            goto L_0x0029
        L_0x0083:
            int r14 = w7.b.n(r0, r2)
            goto L_0x0029
        L_0x0088:
            android.os.IBinder r13 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x008d:
            java.lang.String r12 = w7.b.e(r0, r2)
            goto L_0x0029
        L_0x0092:
            boolean r11 = w7.b.k(r0, r2)
            goto L_0x0029
        L_0x0097:
            java.lang.String r10 = w7.b.e(r0, r2)
            goto L_0x0029
        L_0x009c:
            android.os.IBinder r9 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x00a1:
            android.os.IBinder r8 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x00a6:
            android.os.IBinder r7 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x00ac:
            android.os.IBinder r6 = w7.b.m(r0, r2)
            goto L_0x0029
        L_0x00b2:
            android.os.Parcelable$Creator<e7.c> r3 = e7.c.CREATOR
            android.os.Parcelable r2 = w7.b.d(r0, r2, r3)
            r5 = r2
            e7.c r5 = (e7.c) r5
            goto L_0x0029
        L_0x00bd:
            w7.b.j(r0, r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
