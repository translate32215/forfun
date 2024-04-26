package e8;

import android.content.Context;
import android.view.ViewGroup;
import c8.a;
import c8.b;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.ri;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ap extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13736a;

    /* renamed from: b  reason: collision with root package name */
    public final jn f13737b;

    /* renamed from: c  reason: collision with root package name */
    public tn f13738c;

    /* renamed from: d  reason: collision with root package name */
    public fn f13739d;

    public ap(Context context, jn jnVar, tn tnVar, fn fnVar) {
        this.f13736a = context;
        this.f13737b = jnVar;
        this.f13738c = tnVar;
        this.f13739d = fnVar;
    }

    public final boolean W0(a aVar) {
        Object z02 = b.z0(aVar);
        if (!(z02 instanceof ViewGroup)) {
            return false;
        }
        tn tnVar = this.f13738c;
        if (!(tnVar != null && tnVar.b((ViewGroup) z02))) {
            return false;
        }
        this.f13737b.o().A0(new ri(this));
        return true;
    }

    public final a s5() {
        return new b(this.f13736a);
    }

    public final void s6(String str) {
        fn fnVar = this.f13739d;
        if (fnVar != null) {
            synchronized (fnVar) {
                fnVar.f14654j.t(str);
            }
        }
    }

    public final String t2() {
        return this.f13737b.c();
    }

    public final void t6() {
        String str;
        jn jnVar = this.f13737b;
        synchronized (jnVar) {
            str = jnVar.f15176u;
        }
        if ("Google".equals(str)) {
            e.K("Illegal argument specified for omid partner name.");
            return;
        }
        fn fnVar = this.f13739d;
        if (fnVar != null) {
            fnVar.n(str, false);
        }
    }

    public final void x() {
        fn fnVar = this.f13739d;
        if (fnVar != null) {
            synchronized (fnVar) {
                if (!fnVar.f14664t) {
                    fnVar.f14654j.o();
                }
            }
        }
    }
}
