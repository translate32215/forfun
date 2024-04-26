package e8;

import com.google.android.gms.internal.ads.Cif;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qs implements q20 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Cif, String> f16198a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Cif, String> f16199b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final u20 f16200c;

    public qs(Set<ss> set, u20 u20) {
        this.f16200c = u20;
        for (ss next : set) {
            this.f16198a.put(next.f16516b, next.f16515a);
            this.f16199b.put(next.f16517c, next.f16515a);
        }
    }

    public final void B(Cif ifVar, String str) {
        u20 u20 = this.f16200c;
        String valueOf = String.valueOf(str);
        u20.d(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.f16198a.containsKey(ifVar)) {
            u20 u202 = this.f16200c;
            String valueOf2 = String.valueOf(this.f16198a.get(ifVar));
            u202.d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    public final void P(Cif ifVar, String str) {
        u20 u20 = this.f16200c;
        String valueOf = String.valueOf(str);
        u20.f(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.f16199b.containsKey(ifVar)) {
            u20 u202 = this.f16200c;
            String valueOf2 = String.valueOf(this.f16199b.get(ifVar));
            u202.f(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    public final void g(Cif ifVar, String str, Throwable th) {
        u20 u20 = this.f16200c;
        String valueOf = String.valueOf(str);
        u20.f(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.f16199b.containsKey(ifVar)) {
            u20 u202 = this.f16200c;
            String valueOf2 = String.valueOf(this.f16199b.get(ifVar));
            u202.f(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }

    public final void y(Cif ifVar, String str) {
    }
}
