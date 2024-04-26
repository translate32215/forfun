package cc;

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
import dev.pankaj.ytvclib.data.model.Event;
import gf.e0;
import gf.j0;
import k1.a;
import kotlin.reflect.KProperty;
import ud.k;
import ud.l;
import ud.q;
import ud.v;

/* compiled from: EventFragment.kt */
public final class b extends bc.c {
    public static final /* synthetic */ KProperty<Object>[] C0;
    public final kd.d A0;
    public androidx.leanback.widget.a B0 = new androidx.leanback.widget.a(new a());

    /* renamed from: z0  reason: collision with root package name */
    public final kd.d f4377z0;

    /* compiled from: EventFragment.kt */
    public final class a implements l0 {
        public a() {
        }

        public void a(r0.a aVar, Object obj, y0.b bVar, Object obj2) {
            if (obj instanceof Event) {
                oc.e eVar = oc.e.f23682a;
                Context h02 = b.this.h0();
                long id2 = ((Event) obj).getId();
                sc.f fVar = b.this.f3873o0;
                eVar.a(h02, 2, id2, fVar != null ? fVar.d() : null);
            }
        }
    }

    /* renamed from: cc.b$b  reason: collision with other inner class name */
    /* compiled from: types.kt */
    public static final class C0063b extends e0<fd.b> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f4379b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f4379b = pVar;
        }

        public Object d() {
            return this.f4379b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f4380b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(td.a aVar) {
            super(0);
            this.f4380b = aVar;
        }

        public Object d() {
            return (v0) this.f4380b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f4381b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(kd.d dVar) {
            super(0);
            this.f4381b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f4381b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f4382b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar, kd.d dVar) {
            super(0);
            this.f4382b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f4382b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: EventFragment.kt */
    public static final class g extends l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f4383b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(b bVar) {
            super(0);
            this.f4383b = bVar;
        }

        public Object d() {
            return (fd.b) this.f4383b.f4377z0.getValue();
        }
    }

    static {
        q qVar = new q(b.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/event/viewmodel/EventViewModelFactory;", 0);
        v.f26198a.getClass();
        C0 = new ae.g[]{qVar};
    }

    public b() {
        C0063b bVar = new C0063b();
        ae.g[] gVarArr = j0.f18667a;
        k.g(bVar, "ref");
        this.f4377z0 = gf.p.a(this, j0.b(bVar.f18662a), (Object) null).a(this, C0[0]);
        g gVar = new g(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new d(new c(this)));
        this.A0 = o0.b(this, v.a(fd.a.class), new e(a10), new f((td.a) null, a10), gVar);
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        r1 r1Var = new r1(2);
        if (r1Var.f2510a != 2) {
            r1Var.f2510a = 2;
        }
        r0(r1Var);
        this.f3880v0 = this.B0;
        u0();
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
        ((fd.a) this.A0.getValue()).f18344e.f(F(), new r0.b(this));
        ((fd.a) this.A0.getValue()).g();
    }
}
