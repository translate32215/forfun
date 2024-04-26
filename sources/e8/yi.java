package e8;

import com.google.android.gms.internal.ads.h9;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yi extends h9<zi> {

    /* renamed from: b  reason: collision with root package name */
    public boolean f17632b = false;

    public yi(Set<ul<zi>> set) {
        super(set);
    }

    public final synchronized void O() {
        if (!this.f17632b) {
            I0(xi.f17495a);
            this.f17632b = true;
        }
    }
}
