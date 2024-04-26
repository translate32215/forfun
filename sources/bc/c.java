package bc;

import ae.g;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import androidx.fragment.app.p;
import androidx.leanback.app.h;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.i0;
import androidx.leanback.widget.l0;
import androidx.leanback.widget.m0;
import androidx.leanback.widget.r1;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import gf.l;
import gf.o;
import gf.s;
import gf.x;
import kd.d;
import kotlin.reflect.KProperty;
import r0.b;
import sc.f;
import ud.k;
import ud.q;
import ud.v;

/* compiled from: GridFragment.kt */
public class c extends p implements o, h.q {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f3871y0;

    /* renamed from: n0  reason: collision with root package name */
    public final d f3872n0 = ((hf.c) p000if.c.a(this)).a(this, f3871y0[0]);

    /* renamed from: o0  reason: collision with root package name */
    public f f3873o0;

    /* renamed from: p0  reason: collision with root package name */
    public r1.b f3874p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3875q0 = -1;

    /* renamed from: r0  reason: collision with root package name */
    public Object f3876r0;

    /* renamed from: s0  reason: collision with root package name */
    public final h.p<p> f3877s0 = new a(this);

    /* renamed from: t0  reason: collision with root package name */
    public r1 f3878t0;

    /* renamed from: u0  reason: collision with root package name */
    public l0 f3879u0;

    /* renamed from: v0  reason: collision with root package name */
    public h0 f3880v0;

    /* renamed from: w0  reason: collision with root package name */
    public final m0 f3881w0 = new r1.c(this);

    /* renamed from: x0  reason: collision with root package name */
    public final i0 f3882x0 = new b(this);

    /* compiled from: GridFragment.kt */
    public static final class a extends h.p<p> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f3883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(cVar);
            this.f3883d = cVar;
        }

        public void f(boolean z10) {
            c cVar = this.f3883d;
            if (cVar.f3878t0 != null) {
                cVar.f3874p0.f2519c.setChildrenVisibility(z10 ? 0 : 4);
            }
        }
    }

    static {
        q qVar = new q(c.class, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        v.f26198a.getClass();
        f3871y0 = new g[]{qVar};
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        this.f3873o0 = MainApp.l().c();
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.grid_fragment, viewGroup, false);
    }

    public void R() {
        this.O = true;
        this.f3874p0 = null;
    }

    @SuppressLint({"RestrictedApi"})
    public void d0(View view, Bundle bundle) {
        k.f(view, "view");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.browse_grid_dock);
        r1 r1Var = this.f3878t0;
        k.c(r1Var);
        r1.b h10 = r1Var.d(viewGroup);
        this.f3874p0 = h10;
        k.c(h10);
        viewGroup.addView(h10.f2509a);
        r1.b bVar = this.f3874p0;
        k.c(bVar);
        bVar.f2519c.setOnChildLaidOutListener(this.f3882x0);
        this.f3876r0 = androidx.leanback.transition.b.b(viewGroup, new androidx.activity.f(this));
        h.p<p> pVar = this.f3877s0;
        pVar.f2003c.b(pVar);
        u0();
    }

    public h.p<?> g() {
        return this.f3877s0;
    }

    public l j() {
        return (l) this.f3872n0.getValue();
    }

    public final void r0(r1 r1Var) {
        this.f3878t0 = r1Var;
        r1Var.f2511b = this.f3881w0;
    }

    public final void s0(boolean z10) {
        a0 y10 = y();
        p G = y10.G("spinner");
        if (z10) {
            if (G == null) {
                androidx.fragment.app.b bVar = new androidx.fragment.app.b(y());
                bVar.g(R.id.container, new d(), "spinner", 1);
                bVar.e();
            }
        } else if (G != null) {
            androidx.fragment.app.b bVar2 = new androidx.fragment.app.b(y10);
            bVar2.o(G);
            bVar2.e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0() {
        /*
            r8 = this;
            androidx.leanback.widget.r1$b r0 = r8.f3874p0
            ud.k.c(r0)
            androidx.leanback.widget.VerticalGridView r0 = r0.f2519c
            int r1 = r8.f3875q0
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.G(r1)
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            androidx.leanback.widget.r1$b r0 = r8.f3874p0
            ud.k.c(r0)
            androidx.leanback.widget.VerticalGridView r0 = r0.f2519c
            int r1 = r8.f3875q0
            androidx.leanback.widget.p r0 = r0.T0
            androidx.leanback.widget.o r2 = r0.W
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0050
            r5 = -1
            if (r1 == r5) goto L_0x0050
            int r5 = r2.f2444f
            if (r5 >= 0) goto L_0x0029
            goto L_0x0050
        L_0x0029:
            if (r5 <= 0) goto L_0x002c
            goto L_0x004b
        L_0x002c:
            androidx.leanback.widget.o$a r2 = r2.k(r1)
            int r2 = r2.f2448a
            int r5 = r0.A()
            int r5 = r5 - r4
        L_0x0037:
            if (r5 < 0) goto L_0x0050
            int r6 = r0.e1(r5)
            androidx.leanback.widget.o r7 = r0.W
            androidx.leanback.widget.o$a r7 = r7.k(r6)
            if (r7 == 0) goto L_0x004d
            int r7 = r7.f2448a
            if (r7 != r2) goto L_0x004d
            if (r6 >= r1) goto L_0x004d
        L_0x004b:
            r0 = 1
            goto L_0x0051
        L_0x004d:
            int r5 = r5 + -1
            goto L_0x0037
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            androidx.leanback.app.h$p<androidx.fragment.app.p> r0 = r8.f3877s0
            androidx.leanback.app.h$n r0 = r0.f2003c
            r0.c(r4)
            goto L_0x0062
        L_0x005b:
            androidx.leanback.app.h$p<androidx.fragment.app.p> r0 = r8.f3877s0
            androidx.leanback.app.h$n r0 = r0.f2003c
            r0.c(r3)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.c.t0():void");
    }

    public final void u0() {
        if (this.f3874p0 != null) {
            r1 r1Var = this.f3878t0;
            k.c(r1Var);
            r1Var.c(this.f3874p0, this.f3880v0);
            if (this.f3875q0 != -1) {
                r1.b bVar = this.f3874p0;
                k.c(bVar);
                bVar.f2519c.setSelectedPosition(this.f3875q0);
            }
        }
    }

    public x w() {
        return null;
    }

    public s<?> z() {
        gf.g gVar = gf.g.f18665b;
        return gf.g.f18664a;
    }
}
