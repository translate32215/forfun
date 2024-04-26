package e8;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class ni0 implements Parcelable.Creator<oi0> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = w7.b.r(r11)
            r1 = 0
            r2 = 0
            r5 = r1
            r8 = r5
            r9 = r8
            r6 = r2
        L_0x000b:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x003f
            int r1 = r11.readInt()
            char r2 = (char) r1
            r3 = 1
            if (r2 == r3) goto L_0x003a
            r3 = 2
            if (r2 == r3) goto L_0x0035
            r3 = 3
            if (r2 == r3) goto L_0x002b
            r3 = 4
            if (r2 == r3) goto L_0x0026
            w7.b.q(r11, r1)
            goto L_0x000b
        L_0x0026:
            android.os.Bundle r9 = w7.b.a(r11, r1)
            goto L_0x000b
        L_0x002b:
            android.os.Parcelable$Creator<e8.zh0> r2 = e8.zh0.CREATOR
            android.os.Parcelable r1 = w7.b.d(r11, r1, r2)
            r8 = r1
            e8.zh0 r8 = (e8.zh0) r8
            goto L_0x000b
        L_0x0035:
            long r6 = w7.b.o(r11, r1)
            goto L_0x000b
        L_0x003a:
            java.lang.String r5 = w7.b.e(r11, r1)
            goto L_0x000b
        L_0x003f:
            w7.b.j(r11, r0)
            e8.oi0 r11 = new e8.oi0
            r4 = r11
            r4.<init>(r5, r6, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ni0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new oi0[i10];
    }
}
