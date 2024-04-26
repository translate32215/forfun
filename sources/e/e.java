package e;

import com.google.android.gms.common.internal.h;
import com.google.android.gms.internal.ads.zh;
import e8.fi0;
import e8.h9;
import e8.l8;
import e8.p50;
import e8.s5;
import f7.j0;
import i4.a;
import i4.b;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.Future;

public final class e {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public static <T> T c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static <T> boolean d(T[] tArr, T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (!h.a(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static int e(a aVar) {
        int i10 = s5.f16375b[aVar.ordinal()];
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 3;
        }
        return 2;
    }

    public static j4.a f(fi0 fi0, boolean z10) {
        b bVar;
        HashSet hashSet = fi0.f14635e != null ? new HashSet(fi0.f14635e) : null;
        Date date = new Date(fi0.f14632b);
        int i10 = fi0.f14634d;
        if (i10 == 1) {
            bVar = b.MALE;
        } else if (i10 != 2) {
            bVar = b.UNKNOWN;
        } else {
            bVar = b.FEMALE;
        }
        return new j4.a(date, bVar, hashSet, z10, fi0.f14641s);
    }

    public static void g(p50<?> p50, String str) {
        l8 l8Var = new l8(str, 1);
        p50.a(new j0((Future) p50, (zh) l8Var), h9.f14886f);
    }

    public static Date h(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }
}
