package e8;

import com.google.android.gms.internal.ads.ji;
import com.google.android.gms.internal.ads.oq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class n80 extends m80 {
    public n80(ji jiVar) {
        super((ji) null);
    }

    public static <E> c80<E> d(Object obj, long j10) {
        return (c80) oq.u(obj, j10);
    }

    public final <L> List<L> a(Object obj, long j10) {
        c80 d10 = d(obj, j10);
        if (d10.k()) {
            return d10;
        }
        int size = d10.size();
        c80 r10 = d10.r(size == 0 ? 10 : size << 1);
        oq.e(obj, j10, r10);
        return r10;
    }

    public final <E> void b(Object obj, Object obj2, long j10) {
        c80 d10 = d(obj, j10);
        c80 d11 = d(obj2, j10);
        int size = d10.size();
        int size2 = d11.size();
        if (size > 0 && size2 > 0) {
            if (!d10.k()) {
                d10 = d10.r(size2 + size);
            }
            d10.addAll(d11);
        }
        if (size > 0) {
            d11 = d10;
        }
        oq.e(obj, j10, d11);
    }

    public final void c(Object obj, long j10) {
        d(obj, j10).t();
    }
}
