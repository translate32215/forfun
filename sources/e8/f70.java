package e8;

import com.google.android.gms.internal.ads.mp;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class f70 extends g70 {

    /* renamed from: a  reason: collision with root package name */
    public int f14541a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f14542b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ mp f14543c;

    public f70(mp mpVar) {
        this.f14543c = mpVar;
        this.f14542b = mpVar.size();
    }

    public final boolean hasNext() {
        return this.f14541a < this.f14542b;
    }

    public final byte i() {
        int i10 = this.f14541a;
        if (i10 < this.f14542b) {
            this.f14541a = i10 + 1;
            return this.f14543c.F(i10);
        }
        throw new NoSuchElementException();
    }
}
