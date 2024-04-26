package com.startapp;

import com.startapp.networkTest.enums.ThreeStateShort;

/* compiled from: Sta */
public class f2 {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f10348a = "0123456789abcdef".toCharArray();

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10349a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.ThreeStateShort[] r0 = com.startapp.networkTest.enums.ThreeStateShort.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10349a = r0
                com.startapp.networkTest.enums.ThreeStateShort r1 = com.startapp.networkTest.enums.ThreeStateShort.Yes     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10349a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.ThreeStateShort r1 = com.startapp.networkTest.enums.ThreeStateShort.No     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10349a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.ThreeStateShort r1 = com.startapp.networkTest.enums.ThreeStateShort.Unknown     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.f2.a.<clinit>():void");
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10] & 255;
            int i11 = i10 * 2;
            char[] cArr2 = f10348a;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int a(ThreeStateShort threeStateShort) {
        int i10 = a.f10349a[threeStateShort.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? -1 : 0;
        }
        return 1;
    }
}
