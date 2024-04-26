package e8;

import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.xu;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dh0 {

    /* renamed from: a  reason: collision with root package name */
    public final tu f14274a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14275b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14276c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14277d;

    public dh0(int i10, int i11, int i12) {
        this.f14275b = i10;
        if (i11 > 64 || i11 < 0) {
            this.f14276c = 64;
        } else {
            this.f14276c = i11;
        }
        if (i12 <= 0) {
            this.f14277d = 1;
        } else {
            this.f14277d = i12;
        }
        this.f14274a = new xu(this.f14276c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        if (r2.size() < r1.f14275b) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.util.ArrayList<java.lang.String> r17, java.util.ArrayList<com.google.android.gms.internal.ads.uu> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            e8.fh0 r2 = new e8.fh0
            r2.<init>()
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0012:
            int r5 = r18.size()
            if (r4 >= r5) goto L_0x010d
            java.lang.Object r5 = r0.get(r4)
            com.google.android.gms.internal.ads.uu r5 = (com.google.android.gms.internal.ads.uu) r5
            int r5 = r5.f8299e
            r6 = r17
            java.lang.Object r5 = r6.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r7 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r7)
            java.lang.String r7 = "\n"
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            r8 = 1
            if (r7 == 0) goto L_0x0107
            r7 = 0
        L_0x003f:
            int r9 = r5.length
            if (r7 >= r9) goto L_0x0107
            r9 = r5[r7]
            java.lang.String r10 = "'"
            int r10 = r9.indexOf(r10)
            r11 = -1
            if (r10 == r11) goto L_0x00a2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r11 = 1
            r12 = 0
        L_0x0054:
            int r13 = r11 + 2
            int r14 = r10.length()
            if (r13 > r14) goto L_0x0097
            char r14 = r10.charAt(r11)
            r15 = 39
            if (r14 != r15) goto L_0x0095
            int r12 = r11 + -1
            char r12 = r10.charAt(r12)
            r14 = 32
            if (r12 == r14) goto L_0x0091
            int r12 = r11 + 1
            char r15 = r10.charAt(r12)
            r3 = 115(0x73, float:1.61E-43)
            if (r15 == r3) goto L_0x0080
            char r3 = r10.charAt(r12)
            r12 = 83
            if (r3 != r12) goto L_0x0091
        L_0x0080:
            int r3 = r10.length()
            if (r13 == r3) goto L_0x008c
            char r3 = r10.charAt(r13)
            if (r3 != r14) goto L_0x0091
        L_0x008c:
            r10.insert(r11, r14)
            r11 = r13
            goto L_0x0094
        L_0x0091:
            r10.setCharAt(r11, r14)
        L_0x0094:
            r12 = 1
        L_0x0095:
            int r11 = r11 + r8
            goto L_0x0054
        L_0x0097:
            if (r12 == 0) goto L_0x009e
            java.lang.String r3 = r10.toString()
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 == 0) goto L_0x00a2
            r9 = r3
        L_0x00a2:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.vu.b(r9, r8)
            int r9 = r3.length
            int r10 = r1.f14277d
            if (r9 < r10) goto L_0x0103
            r9 = 0
        L_0x00ac:
            int r10 = r3.length
            if (r9 >= r10) goto L_0x00f9
            java.lang.String r10 = ""
            r11 = 0
        L_0x00b2:
            int r12 = r1.f14277d
            if (r11 >= r12) goto L_0x00e7
            int r12 = r9 + r11
            int r13 = r3.length
            if (r12 < r13) goto L_0x00bd
            r11 = 0
            goto L_0x00e8
        L_0x00bd:
            if (r11 <= 0) goto L_0x00c9
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r13 = " "
            java.lang.String r10 = r10.concat(r13)
        L_0x00c9:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r12 = r3[r12]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            if (r13 == 0) goto L_0x00de
            java.lang.String r10 = r10.concat(r12)
            goto L_0x00e4
        L_0x00de:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r10)
            r10 = r12
        L_0x00e4:
            int r11 = r11 + 1
            goto L_0x00b2
        L_0x00e7:
            r11 = 1
        L_0x00e8:
            if (r11 == 0) goto L_0x00f9
            r2.add(r10)
            int r10 = r2.size()
            int r11 = r1.f14275b
            if (r10 < r11) goto L_0x00f6
            goto L_0x0101
        L_0x00f6:
            int r9 = r9 + 1
            goto L_0x00ac
        L_0x00f9:
            int r3 = r2.size()
            int r9 = r1.f14275b
            if (r3 < r9) goto L_0x0103
        L_0x0101:
            r8 = 0
            goto L_0x0107
        L_0x0103:
            int r7 = r7 + 1
            goto L_0x003f
        L_0x0107:
            if (r8 == 0) goto L_0x010d
            int r4 = r4 + 1
            goto L_0x0012
        L_0x010d:
            e8.gf0 r3 = new e8.gf0
            r3.<init>()
            java.util.Iterator r0 = r2.iterator()
        L_0x0116:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0136
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.tu r4 = r1.f14274a     // Catch:{ IOException -> 0x0130 }
            byte[] r2 = r4.a(r2)     // Catch:{ IOException -> 0x0130 }
            java.lang.Object r4 = r3.f14777c     // Catch:{ IOException -> 0x0130 }
            android.util.Base64OutputStream r4 = (android.util.Base64OutputStream) r4     // Catch:{ IOException -> 0x0130 }
            r4.write(r2)     // Catch:{ IOException -> 0x0130 }
            goto L_0x0116
        L_0x0130:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            l0.e.C(r2, r0)
        L_0x0136:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.dh0.a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }
}
