package com.google.android.gms.internal.ads;

import e8.ca0;
import e8.f80;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class sq extends lg {
    public sq() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r13[r14] > -65) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        if (r13[r14] > -65) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] > -65) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -1
            r7 = -65
            if (r12 == 0) goto L_0x0085
            if (r14 < r15) goto L_0x0013
            return r12
        L_0x0013:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L_0x0023
            if (r8 < r1) goto L_0x0022
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 <= r7) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r14 = r12
            goto L_0x0085
        L_0x0022:
            return r6
        L_0x0023:
            if (r8 >= r2) goto L_0x004a
            int r12 = r12 >> 8
            r12 = r12 ^ r6
            byte r12 = (byte) r12
            if (r12 != 0) goto L_0x0039
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 < r15) goto L_0x0036
            int r12 = com.google.android.gms.internal.ads.qq.a(r8, r14)
            return r12
        L_0x0036:
            r10 = r14
            r14 = r12
            r12 = r10
        L_0x0039:
            if (r12 > r7) goto L_0x0049
            if (r8 != r5) goto L_0x003f
            if (r12 < r4) goto L_0x0049
        L_0x003f:
            if (r8 != r0) goto L_0x0043
            if (r12 >= r4) goto L_0x0049
        L_0x0043:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 <= r7) goto L_0x001f
        L_0x0049:
            return r6
        L_0x004a:
            int r9 = r12 >> 8
            r9 = r9 ^ r6
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x005e
            int r12 = r14 + 1
            byte r9 = r13[r14]
            if (r12 < r15) goto L_0x005b
            int r12 = com.google.android.gms.internal.ads.qq.a(r8, r9)
            return r12
        L_0x005b:
            r14 = r12
            r12 = 0
            goto L_0x0061
        L_0x005e:
            int r12 = r12 >> 16
            byte r12 = (byte) r12
        L_0x0061:
            if (r12 != 0) goto L_0x0071
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 < r15) goto L_0x006e
            int r12 = com.google.android.gms.internal.ads.qq.c(r8, r9, r14)
            return r12
        L_0x006e:
            r10 = r14
            r14 = r12
            r12 = r10
        L_0x0071:
            if (r9 > r7) goto L_0x0084
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r9 = r9 + r8
            int r8 = r9 >> 30
            if (r8 != 0) goto L_0x0084
            if (r12 > r7) goto L_0x0084
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 <= r7) goto L_0x001f
        L_0x0084:
            return r6
        L_0x0085:
            if (r14 >= r15) goto L_0x008e
            byte r12 = r13[r14]
            if (r12 < 0) goto L_0x008e
            int r14 = r14 + 1
            goto L_0x0085
        L_0x008e:
            if (r14 < r15) goto L_0x0091
            return r3
        L_0x0091:
            if (r14 < r15) goto L_0x0094
            return r3
        L_0x0094:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 >= 0) goto L_0x00ed
            if (r14 >= r5) goto L_0x00a8
            if (r12 < r15) goto L_0x009f
            return r14
        L_0x009f:
            if (r14 < r1) goto L_0x00a7
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r7) goto L_0x0091
        L_0x00a7:
            return r6
        L_0x00a8:
            if (r14 >= r2) goto L_0x00c8
            int r8 = r15 + -1
            if (r12 < r8) goto L_0x00b3
            int r12 = com.google.android.gms.internal.ads.qq.f(r13, r12, r15)
            return r12
        L_0x00b3:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r7) goto L_0x00c7
            if (r14 != r5) goto L_0x00bd
            if (r12 < r4) goto L_0x00c7
        L_0x00bd:
            if (r14 != r0) goto L_0x00c1
            if (r12 >= r4) goto L_0x00c7
        L_0x00c1:
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 <= r7) goto L_0x00ed
        L_0x00c7:
            return r6
        L_0x00c8:
            int r8 = r15 + -2
            if (r12 < r8) goto L_0x00d1
            int r12 = com.google.android.gms.internal.ads.qq.f(r13, r12, r15)
            return r12
        L_0x00d1:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r7) goto L_0x00ec
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r12 = r12 + r14
            int r12 = r12 >> 30
            if (r12 != 0) goto L_0x00ec
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 > r7) goto L_0x00ec
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r7) goto L_0x0091
        L_0x00ec:
            return r6
        L_0x00ed:
            r14 = r12
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sq.b(int, byte[], int, int):int");
    }

    public final int c(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (charAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) charAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char charAt2 = charSequence.charAt(i16);
            if (charAt2 < 128 && i17 < i15) {
                i13 = i17 + 1;
                bArr[i17] = (byte) charAt2;
            } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                i17 = i18 + 1;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
                i16++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i17 <= i15 - 3) {
                int i19 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 >>> 12) | 480);
                int i20 = i19 + 1;
                bArr[i19] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i13 = i20 + 1;
                bArr[i20] = (byte) ((charAt2 & '?') | 128);
            } else if (i17 <= i15 - 4) {
                int i21 = i16 + 1;
                if (i21 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i21);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i22 = i17 + 1;
                        bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                        int i23 = i22 + 1;
                        bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i24 = i23 + 1;
                        bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i17 = i24 + 1;
                        bArr[i24] = (byte) ((codePoint & 63) | 128);
                        i16 = i21;
                        i16++;
                    } else {
                        i16 = i21;
                    }
                }
                throw new ca0(i16 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i12 = i16 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i17);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            } else {
                throw new ca0(i16, length);
            }
            i17 = i13;
            i16++;
        }
        return i17;
    }

    public final String e(byte[] bArr, int i10, int i11) throws f80 {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (r13 < i12) {
                byte b10 = bArr[r13];
                if (!rq.e(b10)) {
                    break;
                }
                i10 = r13 + 1;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (r13 < i12) {
                int i15 = r13 + 1;
                byte b11 = bArr[r13];
                if (rq.e(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    r13 = i15;
                    while (true) {
                        i14 = i16;
                        if (r13 >= i12) {
                            break;
                        }
                        byte b12 = bArr[r13];
                        if (!rq.e(b12)) {
                            break;
                        }
                        r13++;
                        i16 = i14 + 1;
                        cArr[i14] = (char) b12;
                    }
                } else {
                    if (!(b11 < -32)) {
                        if (b11 < -16) {
                            if (i15 < i12 - 1) {
                                int i17 = i15 + 1;
                                rq.b(b11, bArr[i15], bArr[i17], cArr, i14);
                                r13 = i17 + 1;
                                i14++;
                            } else {
                                throw f80.h();
                            }
                        } else if (i15 < i12 - 2) {
                            int i18 = i15 + 1;
                            byte b13 = bArr[i15];
                            int i19 = i18 + 1;
                            rq.a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                            i14 = i14 + 1 + 1;
                            r13 = i19 + 1;
                        } else {
                            throw f80.h();
                        }
                    } else if (i15 < i12) {
                        rq.c(b11, bArr[i15], cArr, i14);
                        r13 = i15 + 1;
                        i14++;
                    } else {
                        throw f80.h();
                    }
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }
}
