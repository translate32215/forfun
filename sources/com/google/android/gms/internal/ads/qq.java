package com.google.android.gms.internal.ads;

import e8.b70;
import e8.ca0;
import e8.f80;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class qq {

    /* renamed from: a  reason: collision with root package name */
    public static final lg f7993a;

    static {
        lg lgVar;
        if (!(oq.f7706f && oq.f7705e) || b70.a()) {
            lgVar = new sq();
        } else {
            lgVar = new tq();
        }
        f7993a = lgVar;
    }

    public static int a(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new ca0(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean d(byte[] bArr, int i10, int i11) {
        if (f7993a.b(0, bArr, i10, i11) == 0) {
            return true;
        }
        return false;
    }

    public static String e(byte[] bArr, int i10, int i11) throws f80 {
        return f7993a.e(bArr, i10, i11);
    }

    public static int f(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        byte b11 = -1;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        } else if (i12 == 1) {
            byte b12 = bArr[i10];
            if (b10 <= -12 && b12 <= -65) {
                b11 = b10 ^ (b12 << 8);
            }
            return b11;
        } else if (i12 == 2) {
            return c(b10, bArr[i10], bArr[i10 + 1]);
        } else {
            throw new AssertionError();
        }
    }
}
