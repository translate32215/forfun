package e8;

import com.google.android.gms.internal.ads.hq;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class l90 extends g70 {

    /* renamed from: a  reason: collision with root package name */
    public final m90 f15371a;

    /* renamed from: b  reason: collision with root package name */
    public i70 f15372b = a();

    public l90(hq hqVar) {
        this.f15371a = new m90(hqVar, (l90) null);
    }

    public final i70 a() {
        if (this.f15371a.hasNext()) {
            return (i70) ((k70) this.f15371a.next()).iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f15372b != null;
    }

    public final byte i() {
        i70 i70 = this.f15372b;
        if (i70 != null) {
            byte i10 = i70.i();
            if (!this.f15372b.hasNext()) {
                this.f15372b = a();
            }
            return i10;
        }
        throw new NoSuchElementException();
    }
}
