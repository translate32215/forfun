package dc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.leanback.app.h;
import androidx.leanback.widget.l0;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.r1;
import androidx.leanback.widget.y0;
import androidx.lifecycle.n;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import dev.pankaj.ytvclib.data.model.Channel;
import dev.pankaj.ytvlib.data.model.Category;
import gf.e0;
import gf.j0;
import k1.a;
import kotlin.reflect.KProperty;
import ud.k;
import ud.l;
import ud.q;
import ud.v;
import ud.w;

/* compiled from: LiveTvFragment.kt */
public final class d extends bc.c {
    public static final /* synthetic */ KProperty<Object>[] F0;
    public final long A0;
    public final kd.d B0;
    public final kd.d C0;
    public final kd.d D0;
    public androidx.leanback.widget.a E0;

    /* renamed from: z0  reason: collision with root package name */
    public final boolean f13241z0;

    /* compiled from: LiveTvFragment.kt */
    public final class a implements l0 {
        public a() {
        }

        public void a(r0.a aVar, Object obj, y0.b bVar, Object obj2) {
            if (obj instanceof Channel) {
                oc.e eVar = oc.e.f23682a;
                Context h02 = d.this.h0();
                long id2 = ((Channel) obj).getId();
                sc.f fVar = d.this.f3873o0;
                eVar.a(h02, 1, id2, fVar != null ? fVar.d() : null);
            } else if (obj instanceof Category) {
                Category category = (Category) obj;
                if (category.getHasChild()) {
                    d.this.v0().f(Long.valueOf(category.getId()));
                } else {
                    d.this.v0().g(category.getId());
                }
            }
        }
    }

    /* compiled from: types.kt */
    public static final class b extends e0<gd.b> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13243b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f13243b = pVar;
        }

        public Object d() {
            return this.f13243b;
        }
    }

    /* renamed from: dc.d$d  reason: collision with other inner class name */
    /* compiled from: FragmentViewModelLazy.kt */
    public static final class C0130d extends l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13244b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0130d(td.a aVar) {
            super(0);
            this.f13244b = aVar;
        }

        public Object d() {
            return (v0) this.f13244b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13245b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(kd.d dVar) {
            super(0);
            this.f13245b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13245b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13246b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar, kd.d dVar) {
            super(0);
            this.f13246b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13246b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: LiveTvFragment.kt */
    public static final class g extends l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f13247b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(d dVar) {
            super(0);
            this.f13247b = dVar;
        }

        public Object d() {
            return (gd.b) this.f13247b.C0.getValue();
        }
    }

    static {
        q qVar = new q(d.class, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(d.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/livetv/viewmodel/LiveTvViewModelFactory;", 0);
        wVar.getClass();
        F0 = new ae.g[]{qVar, qVar2};
    }

    public d(boolean z10, long j10) {
        this.f13241z0 = z10;
        this.A0 = j10;
        hf.b<Object> a10 = p000if.c.a(this);
        ae.g[] gVarArr = F0;
        this.B0 = ((hf.c) a10).a(this, gVarArr[0]);
        this.C0 = gf.p.a(this, j0.a(new b()), (Object) null).a(this, gVarArr[1]);
        g gVar = new g(this);
        kd.d a11 = kd.e.a(kd.f.NONE, new C0130d(new c(this)));
        this.D0 = o0.b(this, v.a(gd.a.class), new e(a11), new f((td.a) null, a11), gVar);
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        r1 r1Var = new r1(2);
        if (r1Var.f2510a != 5) {
            r1Var.f2510a = 5;
        }
        r0(r1Var);
        a aVar = new a();
        this.f3879u0 = aVar;
        r1 r1Var2 = this.f3878t0;
        if (r1Var2 != null) {
            r1Var2.f2512c = aVar;
        }
        h.p<p> pVar = this.f3877s0;
        pVar.f2003c.a(pVar);
    }

    public void d0(View view, Bundle bundle) {
        k.f(view, "view");
        super.d0(view, bundle);
        v0().f18627e.f(F(), new r1.c(this));
        v0().f18628f.f(F(), new r0.b(this));
        if (this.f13241z0) {
            v0().f(Long.valueOf(this.A0));
        } else {
            v0().g(this.A0);
        }
    }

    public gf.l j() {
        return (gf.l) this.B0.getValue();
    }

    public final gd.a v0() {
        return (gd.a) this.D0.getValue();
    }
}
