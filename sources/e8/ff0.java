package e8;

import com.google.android.gms.internal.ads.hu;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ff0 extends hu {

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<ef0> f14616d = new AtomicReference<>(new ef0());

    public static int c(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static boolean d(int i10, boolean z10) {
        int i11 = i10 & 3;
        if (i11 != 3) {
            return z10 && i11 == 2;
        }
        return true;
    }
}
