package e8;

import com.google.android.gms.internal.ads.uu;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fh0 implements Comparator<uu> {
    public final int compare(Object obj, Object obj2) {
        uu uuVar = (uu) obj;
        uu uuVar2 = (uu) obj2;
        float f10 = uuVar.f8296b;
        float f11 = uuVar2.f8296b;
        if (f10 < f11) {
            return -1;
        }
        if (f10 > f11) {
            return 1;
        }
        float f12 = uuVar.f8295a;
        float f13 = uuVar2.f8295a;
        if (f12 < f13) {
            return -1;
        }
        if (f12 > f13) {
            return 1;
        }
        float f14 = (uuVar.f8297c - f12) * (uuVar.f8298d - f10);
        float f15 = (uuVar2.f8297c - f13) * (uuVar2.f8298d - f11);
        if (f14 > f15) {
            return -1;
        }
        if (f14 < f15) {
            return 1;
        }
        return 0;
    }
}
