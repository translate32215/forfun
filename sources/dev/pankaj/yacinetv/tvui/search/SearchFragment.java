package dev.pankaj.yacinetv.tvui.search;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.a0;
import androidx.fragment.app.o0;
import androidx.leanback.app.p;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.e0;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.l0;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.y0;
import androidx.lifecycle.n;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Channel;
import gf.j0;
import gf.o;
import gf.s;
import gf.x;
import k1.a;
import kotlin.reflect.KProperty;
import sc.k;
import ud.l;
import ud.q;
import ud.v;
import ud.w;

/* compiled from: SearchFragment.kt */
public final class SearchFragment extends p implements p.h, o {
    public static final /* synthetic */ KProperty<Object>[] P0;
    public final kd.d I0;
    public androidx.leanback.app.b J0;
    public final kd.d K0;
    public final kd.d L0;
    public String M0 = "";
    public androidx.leanback.widget.a N0 = new androidx.leanback.widget.a(new e0());
    public androidx.leanback.widget.a O0 = new androidx.leanback.widget.a(new dc.a());

    /* compiled from: SearchFragment.kt */
    public final class a implements l0 {
        public a() {
        }

        public void a(r0.a aVar, Object obj, y0.b bVar, Object obj2) {
            if (obj instanceof Channel) {
                oc.e.f23682a.a(SearchFragment.this.h0(), 1, ((Channel) obj).getId(), (k) null);
            }
        }
    }

    /* compiled from: types.kt */
    public static final class b extends gf.e0<hd.b> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class c extends l implements td.a<androidx.fragment.app.p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f13351b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.p pVar) {
            super(0);
            this.f13351b = pVar;
        }

        public Object d() {
            return this.f13351b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13352b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(td.a aVar) {
            super(0);
            this.f13352b = aVar;
        }

        public Object d() {
            return (v0) this.f13352b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13353b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(kd.d dVar) {
            super(0);
            this.f13353b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13353b).v();
            ud.k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13354b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar, kd.d dVar) {
            super(0);
            this.f13354b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13354b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: SearchFragment.kt */
    public static final class g extends l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SearchFragment f13355b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(SearchFragment searchFragment) {
            super(0);
            this.f13355b = searchFragment;
        }

        public Object d() {
            return (hd.b) this.f13355b.K0.getValue();
        }
    }

    static {
        q qVar = new q(SearchFragment.class, "kodein", "getKodein()Lorg/kodein/di/Kodein;", 0);
        w wVar = v.f26198a;
        wVar.getClass();
        q qVar2 = new q(SearchFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/search/viewmodel/SearchViewModelFactory;", 0);
        wVar.getClass();
        P0 = new ae.g[]{qVar, qVar2};
    }

    public SearchFragment() {
        hf.c cVar = new hf.c(new p000if.b(this));
        ae.g[] gVarArr = P0;
        this.I0 = cVar.a(this, gVarArr[0]);
        b bVar = new b();
        ae.g[] gVarArr2 = j0.f18667a;
        this.K0 = gf.p.a(this, j0.b(bVar.f18662a), (Object) null).a(this, gVarArr[1]);
        g gVar = new g(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new d(new c(this)));
        this.L0 = new androidx.lifecycle.r0(v.a(hd.a.class), new e(a10), gVar, new f((td.a) null, a10));
    }

    public void L(Bundle bundle) {
        this.O = true;
        i0().findViewById(R.id.lb_search_bar_speech_orb).requestFocus();
        ((hd.a) this.L0.getValue()).f18976e.f(F(), new r1.c(this));
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        androidx.leanback.app.b c10 = androidx.leanback.app.b.c(o());
        c10.a(g0().getWindow());
        this.J0 = c10;
        if (this.f2064u0 != this) {
            this.f2064u0 = this;
            this.f2058o0.removeCallbacks(this.f2060q0);
            this.f2058o0.post(this.f2060q0);
        }
        a aVar = new a();
        if (aVar != this.f2066w0) {
            this.f2066w0 = aVar;
            androidx.leanback.app.o oVar = this.f2062s0;
            if (oVar != null) {
                oVar.D0(aVar);
            }
        }
    }

    public void Z() {
        super.Z();
        androidx.leanback.app.b bVar = this.J0;
        if (bVar != null) {
            bVar.g(d0.a.c(h0(), R.drawable.bg));
        } else {
            ud.k.l("backgroundManager");
            throw null;
        }
    }

    public boolean a(String str) {
        ud.k.f(str, "newQuery");
        return false;
    }

    public boolean b(String str) {
        ud.k.f(str, "query");
        if (str.length() <= 2) {
            return false;
        }
        this.M0 = str;
        ((hd.a) this.L0.getValue()).f(this.M0);
        return false;
    }

    public void d0(View view, Bundle bundle) {
        ud.k.f(view, "view");
        View findViewById = ((FrameLayout) view.findViewById(R.id.lb_search_frame)).findViewById(R.id.lb_search_bar);
        if (findViewById != null) {
            View findViewById2 = ((SearchBar) findViewById).findViewById(R.id.lb_search_bar_speech_orb);
            ud.k.e(findViewById2, "mSearchBar.findViewById<…lb_search_bar_speech_orb)");
            ud.k.f(findViewById2, "<this>");
            findViewById2.setVisibility(4);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.leanback.widget.SearchBar");
    }

    public h0 h() {
        return this.N0;
    }

    public gf.l j() {
        return (gf.l) this.I0.getValue();
    }

    public final void v0(boolean z10) {
        a0 y10 = y();
        androidx.fragment.app.p G = y10.G("spinner");
        if (z10) {
            if (G == null) {
                androidx.fragment.app.b bVar = new androidx.fragment.app.b(y());
                bVar.g(R.id.search_fragment, new bc.d(), "spinner", 1);
                bVar.e();
            }
        } else if (G != null) {
            androidx.fragment.app.b bVar2 = new androidx.fragment.app.b(y10);
            bVar2.o(G);
            bVar2.e();
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
