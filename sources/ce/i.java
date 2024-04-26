package ce;

import ld.q;
import ud.k;
import zd.c;

/* compiled from: StringsJVM.kt */
public class i extends h {
    public static boolean b(String str, String str2, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if (!z10) {
            return str.endsWith(str2);
        }
        return e(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final boolean c(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(java.lang.CharSequence r4) {
        /*
            int r0 = r4.length()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003c
            zd.c r0 = ce.k.j(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x001a
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0037
            r3 = r0
            ld.q r3 = (ld.q) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = ce.a.c(r3)
            if (r3 != 0) goto L_0x001e
            r4 = 0
            goto L_0x0038
        L_0x0037:
            r4 = 1
        L_0x0038:
            if (r4 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.i.d(java.lang.CharSequence):boolean");
    }

    public static final boolean e(String str, int i10, String str2, int i11, int i12, boolean z10) {
        k.f(str, "<this>");
        k.f(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final String f(CharSequence charSequence, int i10) {
        if (i10 >= 0) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return charSequence.toString();
                }
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                        q j10 = new c(1, i10).iterator();
                        while (j10.hasNext()) {
                            j10.a();
                            sb2.append(charSequence);
                        }
                        String sb3 = sb2.toString();
                        k.e(sb3, "{\n                    va…tring()\n                }");
                        return sb3;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        cArr[i11] = charAt;
                    }
                    return new String(cArr);
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
    }

    public static String g(String str, String str2, String str3, boolean z10, int i10) {
        int i11 = 0;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        k.f(str, "<this>");
        int l10 = k.l(str, str2, 0, z10);
        if (l10 < 0) {
            return str;
        }
        int length = str2.length();
        int i12 = 1;
        if (length >= 1) {
            i12 = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append(str, i11, l10);
                sb2.append(str3);
                i11 = l10 + length;
                if (l10 >= str.length() || (l10 = k.l(str, str2, l10 + i12, z10)) <= 0) {
                    sb2.append(str, i11, str.length());
                    String sb3 = sb2.toString();
                    k.e(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i11, l10);
                sb2.append(str3);
                i11 = l10 + length;
                break;
            } while ((l10 = k.l(str, str2, l10 + i12, z10)) <= 0);
            sb2.append(str, i11, str.length());
            String sb32 = sb2.toString();
            k.e(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static boolean h(String str, String str2, boolean z10, int i10) {
        boolean z11 = (i10 & 2) != 0 ? false : z10;
        k.f(str, "<this>");
        if (!z11) {
            return str.startsWith(str2);
        }
        return e(str, 0, str2, 0, str2.length(), z11);
    }
}
