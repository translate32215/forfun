package com.google.android.gms.internal.ads;

import l0.d;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class pg {
    public static void a(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @NonNullDecl
    public static <T> T b(@NonNullDecl T t10, @NullableDecl Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @NonNullDecl
    public static <T> T c(@NonNullDecl T t10, @NullableDecl String str, @NullableDecl Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(qg.a(str, obj));
    }

    public static String d(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return qg.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        } else if (i11 >= 0) {
            return qg.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException(d.a(26, "negative size: ", i11));
        }
    }

    public static void e(int i10, int i11, int i12) {
        String str;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                str = d(i10, i12, "start index");
            } else if (i11 < 0 || i11 > i12) {
                str = d(i11, i12, "end index");
            } else {
                str = qg.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static int f(int i10, int i11) {
        String str;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            str = qg.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            throw new IllegalArgumentException(d.a(26, "negative size: ", i11));
        } else {
            str = qg.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static int g(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(d(i10, i11, "index"));
    }
}
