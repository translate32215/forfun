package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vu {
    public static int a(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = (length & -4) + 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13 += 4) {
            int i14 = ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | (bArr[i13 + 3] << 24)) * -862048943;
            int i15 = i12 ^ (((i14 << 15) | (i14 >>> 17)) * 461845907);
            i12 = (((i15 >>> 19) | (i15 << 13)) * 5) - 430675100;
        }
        int i16 = length & 3;
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    i10 = (bArr[i11 + 2] & 255) << 16;
                }
                int i17 = i12 ^ length;
                int i18 = (i17 ^ (i17 >>> 16)) * -2048144789;
                int i19 = (i18 ^ (i18 >>> 13)) * -1028477387;
                return i19 ^ (i19 >>> 16);
            }
            i10 |= (bArr[i11 + 1] & 255) << 8;
        }
        int i20 = ((bArr[i11] & 255) | i10) * -862048943;
        i12 ^= ((i20 >>> 17) | (i20 << 15)) * 461845907;
        int i172 = i12 ^ length;
        int i182 = (i172 ^ (i172 >>> 16)) * -2048144789;
        int i192 = (i182 ^ (i182 >>> 13)) * -1028477387;
        return i192 ^ (i192 >>> 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007f, code lost:
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        if (r4 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d4, code lost:
        if (r4 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] b(java.lang.String r11, boolean r12) {
        /*
            if (r11 != 0) goto L_0x0004
            r11 = 0
            return r11
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            char[] r1 = r11.toCharArray()
            int r11 = r11.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0015:
            if (r3 >= r11) goto L_0x00db
            int r6 = java.lang.Character.codePointAt(r1, r3)
            int r7 = java.lang.Character.charCount(r6)
            boolean r8 = java.lang.Character.isLetter(r6)
            r9 = 1
            if (r8 == 0) goto L_0x0083
            java.lang.Character$UnicodeBlock r8 = java.lang.Character.UnicodeBlock.of(r6)
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_JAMO
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HIRAGANA
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
            if (r8 != r10) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r8 = 0
            goto L_0x0066
        L_0x0065:
            r8 = 1
        L_0x0066:
            if (r8 != 0) goto L_0x0081
            r8 = 65382(0xff66, float:9.162E-41)
            if (r6 < r8) goto L_0x0072
            r8 = 65437(0xff9d, float:9.1697E-41)
            if (r6 <= r8) goto L_0x007c
        L_0x0072:
            r8 = 65441(0xffa1, float:9.1702E-41)
            if (r6 < r8) goto L_0x007e
            r8 = 65500(0xffdc, float:9.1785E-41)
            if (r6 > r8) goto L_0x007e
        L_0x007c:
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            if (r8 == 0) goto L_0x0083
        L_0x0081:
            r8 = 1
            goto L_0x0084
        L_0x0083:
            r8 = 0
        L_0x0084:
            if (r8 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            r0.add(r4)
        L_0x0092:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r3, r7)
            r0.add(r4)
        L_0x009a:
            r4 = 0
            goto L_0x00d8
        L_0x009c:
            boolean r8 = java.lang.Character.isLetterOrDigit(r6)
            if (r8 != 0) goto L_0x00d4
            int r8 = java.lang.Character.getType(r6)
            r10 = 6
            if (r8 == r10) goto L_0x00d4
            int r8 = java.lang.Character.getType(r6)
            r10 = 8
            if (r8 != r10) goto L_0x00b2
            goto L_0x00d4
        L_0x00b2:
            if (r12 == 0) goto L_0x00c7
            int r8 = java.lang.Character.charCount(r6)
            if (r8 != r9) goto L_0x00c7
            char[] r6 = java.lang.Character.toChars(r6)
            char r6 = r6[r2]
            r8 = 39
            if (r6 != r8) goto L_0x00c7
            if (r4 != 0) goto L_0x00d7
            goto L_0x00d6
        L_0x00c7:
            if (r4 == 0) goto L_0x00d8
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            r0.add(r4)
            goto L_0x009a
        L_0x00d4:
            if (r4 != 0) goto L_0x00d7
        L_0x00d6:
            r5 = r3
        L_0x00d7:
            r4 = 1
        L_0x00d8:
            int r3 = r3 + r7
            goto L_0x0015
        L_0x00db:
            if (r4 == 0) goto L_0x00e6
            java.lang.String r11 = new java.lang.String
            int r3 = r3 - r5
            r11.<init>(r1, r5, r3)
            r0.add(r11)
        L_0x00e6:
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vu.b(java.lang.String, boolean):java.lang.String[]");
    }
}
