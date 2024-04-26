package v6;

import d5.b0;

/* compiled from: CodecSpecificDataUtil */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f26429a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f26430b = {"", "A", "B", "C"};

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static String b(b0 b0Var) {
        b0Var.s(24);
        int i10 = b0Var.i(2);
        boolean h10 = b0Var.h();
        int i11 = b0Var.i(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (b0Var.h()) {
                i12 |= 1 << i13;
            }
        }
        int i14 = 6;
        int[] iArr = new int[6];
        for (int i15 = 0; i15 < 6; i15++) {
            iArr[i15] = b0Var.i(8);
        }
        int i16 = b0Var.i(8);
        Object[] objArr = new Object[5];
        objArr[0] = f26430b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(h10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i16);
        StringBuilder sb2 = new StringBuilder(e0.n("hvc1.%s%d.%X.%c%d", objArr));
        while (i14 > 0) {
            int i17 = i14 - 1;
            if (iArr[i17] != 0) {
                break;
            }
            i14 = i17;
        }
        for (int i18 = 0; i18 < i14; i18++) {
            sb2.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i18])}));
        }
        return sb2.toString();
    }

    public static boolean c(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f26429a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f26429a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }
}
