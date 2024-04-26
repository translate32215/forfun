package e8;

import android.os.Build;
import androidx.appcompat.widget.o;
import j4.e;
import java.util.Arrays;
import java.util.regex.Pattern;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class eg0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14479a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f14480b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f14481c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f14482d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f14483e;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        }
        f14479a = i10;
        String str = Build.DEVICE;
        f14480b = str;
        String str2 = Build.MANUFACTURER;
        f14481c = str2;
        String str3 = Build.MODEL;
        f14482d = str3;
        StringBuilder a10 = e.a(o.a(str2, o.a(str3, o.a(str, 17))), str, ", ", str3, ", ");
        a10.append(str2);
        a10.append(", ");
        a10.append(i10);
        f14483e = a10.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static int a(long[] jArr, long j10, boolean z10) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j10) {
                    i10 = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j10);
            i10 = binarySearch + 1;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static long b(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        double d10 = (double) j11;
        double d11 = (double) j12;
        Double.isNaN(d10);
        Double.isNaN(d11);
        double d12 = (double) j10;
        Double.isNaN(d12);
        return (long) (d12 * (d10 / d11));
    }

    public static void c(long[] jArr, long j10) {
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long j11 = j10 / 1000000;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j11;
                i10++;
            }
        } else if (j10 >= 1000000 || 1000000 % j10 != 0) {
            double d10 = (double) j10;
            Double.isNaN(d10);
            Double.isNaN(d10);
            double d11 = 1000000.0d / d10;
            while (i10 < jArr.length) {
                double d12 = (double) jArr[i10];
                Double.isNaN(d12);
                Double.isNaN(d12);
                jArr[i10] = (long) (d12 * d11);
                i10++;
            }
        } else {
            long j12 = 1000000 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j12;
                i10++;
            }
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0009
            r5 = r0 ^ -1
            goto L_0x001a
        L_0x0009:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0009
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0024
            int r4 = r4.length
            int r4 = r4 + -1
            int r4 = java.lang.Math.min(r4, r5)
            return r4
        L_0x0024:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.eg0.e(long[], long, boolean, boolean):int");
    }

    public static int f(String str) {
        int length = str.length();
        a.a(length <= 4);
        char c10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            c10 = (c10 << 8) | str.charAt(i10);
        }
        return c10;
    }

    public static int g(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int h(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int i(int i10, int i11) {
        if (i10 == Integer.MIN_VALUE) {
            return i11 * 3;
        }
        if (i10 == 1073741824) {
            return i11 << 2;
        }
        if (i10 == 2) {
            return i11 << 1;
        }
        if (i10 == 3) {
            return i11;
        }
        throw new IllegalArgumentException();
    }
}
