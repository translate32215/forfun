package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f5898a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f5899b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i10 = 0;
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            int i11 = i10 + 1;
            char[] cArr2 = f5899b;
            cArr[i10] = cArr2[b11 >>> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        int i10 = 0;
        while (i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0)) {
            char[] cArr = f5898a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
            i10++;
        }
        return sb2.toString();
    }

    public static byte[] c(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 2;
                bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
                i10 = i11;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
