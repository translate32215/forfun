package ce;

import androidx.appcompat.widget.d0;
import ld.e;
import ld.q;
import zd.a;
import zd.c;

/* compiled from: Strings.kt */
public class k extends i {
    public static final boolean i(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        ud.k.f(charSequence, "<this>");
        ud.k.f(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (n(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16) >= 0) {
                return true;
            }
        } else if (p(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static final c j(CharSequence charSequence) {
        return new c(0, charSequence.length() - 1);
    }

    public static final int k(CharSequence charSequence) {
        ud.k.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int l(CharSequence charSequence, String str, int i10, boolean z10) {
        ud.k.f(charSequence, "<this>");
        ud.k.f(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return n(charSequence, str, i10, charSequence.length(), z10, false, 16);
    }

    public static final int m(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        a aVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            aVar = new c(i10, i11);
        } else {
            int k10 = k(charSequence);
            if (i10 > k10) {
                i10 = k10;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            aVar = com.google.gson.internal.a.b(i10, i11);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int f10 = aVar.f();
            int h10 = aVar.h();
            int i12 = aVar.i();
            if ((i12 <= 0 || f10 > h10) && (i12 >= 0 || h10 > f10)) {
                return -1;
            }
            while (true) {
                if (q(charSequence2, 0, charSequence, f10, charSequence2.length(), z10)) {
                    return f10;
                }
                if (f10 == h10) {
                    return -1;
                }
                f10 += i12;
            }
        } else {
            int f11 = aVar.f();
            int h11 = aVar.h();
            int i13 = aVar.i();
            if ((i13 <= 0 || f11 > h11) && (i13 >= 0 || h11 > f11)) {
                return -1;
            }
            while (true) {
                if (i.e((String) charSequence2, 0, (String) charSequence, f11, charSequence2.length(), z10)) {
                    return f11;
                }
                if (f11 == h11) {
                    return -1;
                }
                f11 += i13;
            }
        }
    }

    public static /* synthetic */ int n(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12) {
        return m(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static int o(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        boolean z11;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if (!z10) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        char[] cArr = {c10};
        if (!z10) {
            return ((String) charSequence).indexOf(e.h(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        q j10 = new c(i10, k(charSequence)).iterator();
        while (j10.hasNext()) {
            int a10 = j10.a();
            char charAt = charSequence.charAt(a10);
            int i12 = 0;
            while (true) {
                if (i12 >= 1) {
                    z11 = false;
                    continue;
                    break;
                } else if (a.b(cArr[i12], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i12++;
                }
            }
            if (z11) {
                return a10;
            }
        }
        return -1;
    }

    public static /* synthetic */ int p(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return l(charSequence, str, i10, z10);
    }

    public static final boolean q(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        ud.k.f(charSequence, "<this>");
        ud.k.f(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!a.b(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final void r(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(d0.a("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static String s(String str, char c10, String str2, int i10) {
        String str3 = (i10 & 2) != 0 ? str : null;
        ud.k.f(str, "<this>");
        ud.k.f(str3, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(c10, k(str));
        if (lastIndexOf == -1) {
            return str3;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        ud.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence t(CharSequence charSequence) {
        ud.k.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = a.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
