package n8;

import android.os.Bundle;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import e8.b60;
import f7.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o8.s4;
import o8.w5;
import o8.x4;
import r7.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final l f22410a;

    /* renamed from: b  reason: collision with root package name */
    public final s4 f22411b;

    public a(l lVar) {
        if (lVar != null) {
            this.f22410a = lVar;
            this.f22411b = lVar.v();
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final String a() {
        return this.f22411b.F();
    }

    public final void b(String str) {
        this.f22410a.n().i(str, this.f22410a.f8850n.a());
    }

    public final void c(String str, String str2, Bundle bundle) {
        this.f22410a.v().I(str, str2, bundle);
    }

    public final long d() {
        return this.f22410a.A().n0();
    }

    public final Map<String, Object> e(String str, String str2, boolean z10) {
        s4 s4Var = this.f22411b;
        if (s4Var.f8864a.b().t()) {
            s4Var.f8864a.d().f8797f.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        s4Var.f8864a.getClass();
        if (v.a()) {
            s4Var.f8864a.d().f8797f.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        s4Var.f8864a.b().o(atomicReference, 5000, "get user properties", new h(s4Var, atomicReference, str, str2, z10));
        List<w5> list = (List) atomicReference.get();
        if (list == null) {
            s4Var.f8864a.d().f8797f.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        s.a aVar = new s.a(list.size());
        for (w5 w5Var : list) {
            Object i10 = w5Var.i();
            if (i10 != null) {
                aVar.put(w5Var.f23562b, i10);
            }
        }
        return aVar;
    }

    public final void f(String str) {
        this.f22410a.n().j(str, this.f22410a.f8850n.a());
    }

    public final List<Bundle> g(String str, String str2) {
        s4 s4Var = this.f22411b;
        if (s4Var.f8864a.b().t()) {
            s4Var.f8864a.d().f8797f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        s4Var.f8864a.getClass();
        if (v.a()) {
            s4Var.f8864a.d().f8797f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        s4Var.f8864a.b().o(atomicReference, 5000, "get conditional user properties", new b60(s4Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return r.t(list);
        }
        s4Var.f8864a.d().f8797f.b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    public final String h() {
        x4 x4Var = this.f22411b.f8864a.x().f23640c;
        if (x4Var != null) {
            return x4Var.f23601a;
        }
        return null;
    }

    public final String i() {
        return this.f22411b.F();
    }

    public final int j(String str) {
        s4 s4Var = this.f22411b;
        s4Var.getClass();
        i.e(str);
        s4Var.f8864a.getClass();
        return 25;
    }

    public final void k(Bundle bundle) {
        s4 s4Var = this.f22411b;
        s4Var.u(bundle, s4Var.f8864a.f8850n.b());
    }

    public final void l(String str, String str2, Bundle bundle) {
        this.f22411b.m(str, str2, bundle);
    }

    public final String q() {
        x4 x4Var = this.f22411b.f8864a.x().f23640c;
        if (x4Var != null) {
            return x4Var.f23602b;
        }
        return null;
    }
}
