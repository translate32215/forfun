package dev.pankaj.yacinetv.tvui.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.leanback.app.h;
import androidx.leanback.app.i;
import androidx.leanback.widget.TitleView;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.e0;
import androidx.leanback.widget.n0;
import androidx.leanback.widget.p1;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.v0;
import androidx.leanback.widget.x;
import androidx.lifecycle.n;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import com.startapp.startappsdk.R;
import gf.j0;
import gf.o;
import gf.s;
import k1.a;
import kotlin.reflect.KProperty;
import ud.k;
import ud.l;
import ud.q;
import ud.v;
import ud.w;

/* compiled from: MainFragment.kt */
public final class MainFragment extends h implements o {
    public static final /* synthetic */ KProperty<Object>[] F1;
    public final kd.d A1;
    public final kd.d B1;
    public final kd.d C1;
    public androidx.leanback.app.b D1;
    public androidx.leanback.widget.a E1 = new androidx.leanback.widget.a(new e0());

    /* compiled from: MainFragment.kt */
    public final class a extends h.m<p> {
        public a(MainFragment mainFragment) {
        }

        public p a(Object obj) {
            k.f(obj, "rowObj");
            v0 v0Var = (v0) obj;
            if (v0Var.f2549a.f2525b == -1) {
                return new cc.b();
            }
            return new dc.d(Boolean.parseBoolean(((CharSequence) v0Var.f2549a.f2527d).toString()), v0Var.f2549a.f2525b);
        }
    }

    /* compiled from: types.kt */
    public static final class b extends gf.e0<gd.b> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13345b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f13345b = pVar;
        }

        public Object d() {
            return this.f13345b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends l implements td.a<androidx.lifecycle.v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13346b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(td.a aVar) {
            super(0);
            this.f13346b = aVar;
        }

        public Object d() {
            return (androidx.lifecycle.v0) this.f13346b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13347b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(kd.d dVar) {
            super(0);
            this.f13347b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13347b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13348b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar, kd.d dVar) {
            super(0);
            this.f13348b = dVar;
        }

        public Object d() {
            androidx.lifecycle.v0 a10 = o0.a(this.f13348b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: MainFragment.kt */
    public static final class g extends l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MainFragment f13349b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(MainFragment mainFragment) {
            super(0);
            this.f13349b = mainFragment;
        }

        public Object d() {
            return (gd.b) this.f13349b.B1.getValue();
        }
    }

    static {
        q qVar = new q(MainFragment.class, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(MainFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/livetv/viewmodel/LiveTvViewModelFactory;", 0);
        wVar.getClass();
        F1 = new ae.g[]{qVar, qVar2};
    }

    public MainFragment() {
        hf.b<Object> a10 = p000if.c.a(this);
        ae.g[] gVarArr = F1;
        this.A1 = ((hf.c) a10).a(this, gVarArr[0]);
        b bVar = new b();
        ae.g[] gVarArr2 = j0.f18667a;
        k.g(bVar, "ref");
        this.B1 = gf.p.a(this, j0.b(bVar.f18662a), (Object) null).a(this, gVarArr[1]);
        g gVar = new g(this);
        kd.d a11 = kd.e.a(kd.f.NONE, new d(new c(this)));
        this.C1 = o0.b(this, v.a(gd.a.class), new e(a11), new f((td.a) null, a11), gVar);
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        F0(1);
        this.f1957b1 = true;
        Drawable c10 = d0.a.c(h0(), R.drawable.logo_tv);
        if (this.f1949p0 != c10) {
            this.f1949p0 = c10;
            p1 p1Var = this.f1951r0;
            if (p1Var != null) {
                TitleView.this.setBadgeDrawable(c10);
            }
        }
        s0(D(R.string.app_name));
        int b10 = d0.a.b(h0(), R.color.primaryColor);
        this.X0 = b10;
        this.Y0 = true;
        androidx.leanback.app.l lVar = this.R0;
        if (lVar != null) {
            lVar.f2027z0 = b10;
            lVar.A0 = true;
            VerticalGridView verticalGridView = lVar.f1924o0;
            if (verticalGridView != null) {
                verticalGridView.setBackgroundColor(b10);
                lVar.B0(lVar.f2027z0);
            }
        }
        ec.a aVar = new ec.a(this);
        this.f1952s0 = aVar;
        p1 p1Var2 = this.f1951r0;
        if (p1Var2 != null) {
            TitleView.this.setOnSearchClickedListener(aVar);
        }
        this.H0.c(this.D0);
        androidx.leanback.app.b c11 = androidx.leanback.app.b.c(o());
        c11.a(g0().getWindow());
        this.D1 = c11;
        h.r rVar = this.O0;
        a aVar2 = new a(this);
        rVar.f2005a.put(n0.class, aVar2);
    }

    public void Z() {
        this.O = true;
        p1 p1Var = this.f1951r0;
        if (p1Var != null) {
            p1Var.a(true);
        }
        androidx.leanback.app.b bVar = this.D1;
        if (bVar != null) {
            bVar.g(d0.a.c(h0(), R.drawable.bg));
        } else {
            k.l("backgroundManager");
            throw null;
        }
    }

    public void d0(View view, Bundle bundle) {
        k.f(view, "view");
        super.d0(view, bundle);
        this.E1.h();
        androidx.leanback.widget.a aVar = this.E1;
        this.U0 = aVar;
        if (aVar == null) {
            this.V0 = null;
        } else {
            androidx.leanback.widget.s0 s0Var = aVar.f2401b;
            if (s0Var == null) {
                throw new IllegalArgumentException("Adapter.getPresenterSelector() is null");
            } else if (s0Var != this.V0) {
                this.V0 = s0Var;
                r0[] b10 = s0Var.b();
                x xVar = new x();
                int length = b10.length + 1;
                r0[] r0VarArr = new r0[length];
                System.arraycopy(r0VarArr, 0, b10, 0, b10.length);
                r0VarArr[length - 1] = xVar;
                this.U0.d(new i(this, s0Var, xVar, r0VarArr));
            }
        }
        if (this.Q != null) {
            M0();
            this.R0.w0(this.U0);
        }
        ((gd.a) this.C1.getValue()).f18627e.f(F(), new r0.b(this));
        ((gd.a) this.C1.getValue()).f((Long) null);
    }

    public gf.l j() {
        return (gf.l) this.A1.getValue();
    }

    public gf.x w() {
        return null;
    }

    public s<?> z() {
        gf.g gVar = gf.g.f18665b;
        return gf.g.f18664a;
    }
}
