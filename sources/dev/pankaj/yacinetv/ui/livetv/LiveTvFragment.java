package dev.pankaj.yacinetv.ui.livetv;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.lifecycle.n;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.ui.main.MainActivity;
import dev.pankaj.ytvlib.data.model.Category;
import gf.e0;
import gf.j0;
import k1.a;
import kd.o;
import kotlin.reflect.KProperty;
import o1.c0;
import o1.s;
import o1.x;
import td.l;
import ud.k;
import ud.q;
import ud.v;

/* compiled from: LiveTvFragment.kt */
public final class LiveTvFragment extends gc.b<zb.g> {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f13391z0;

    /* renamed from: u0  reason: collision with root package name */
    public final o1.e f13392u0 = new o1.e(v.a(jc.d.class), new e(this));

    /* renamed from: v0  reason: collision with root package name */
    public final kd.d f13393v0 = kd.e.b(new c(this));

    /* renamed from: w0  reason: collision with root package name */
    public final kd.d f13394w0;

    /* renamed from: x0  reason: collision with root package name */
    public final kd.d f13395x0;

    /* renamed from: y0  reason: collision with root package name */
    public final kc.b f13396y0;

    /* compiled from: LiveTvFragment.kt */
    public /* synthetic */ class a extends ud.j implements l<View, zb.g> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13397i = new a();

        public a() {
            super(1, zb.g.class, "bind", "bind(Landroid/view/View;)Ldev/pankaj/yacinetv/databinding/FragmentLiveTvBinding;", 0);
        }

        public Object c(Object obj) {
            View view = (View) obj;
            k.f(view, "p0");
            RecyclerView recyclerView = (RecyclerView) b8.a.d(view, R.id.list);
            if (recyclerView != null) {
                return new zb.g((ConstraintLayout) view, recyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.list)));
        }
    }

    /* compiled from: LiveTvFragment.kt */
    public static final class b extends ud.l implements l<Category, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveTvFragment f13398b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(LiveTvFragment liveTvFragment) {
            super(1);
            this.f13398b = liveTvFragment;
        }

        public Object c(Object obj) {
            s sVar;
            Category category = (Category) obj;
            k.f(category, "it");
            o1.k kVar = (o1.k) this.f13398b.f13393v0.getValue();
            if (category.getHasChild()) {
                sVar = new jc.e(category);
            } else {
                k.f(category, "category");
                sVar = new jc.f(category);
            }
            kVar.getClass();
            k.f(sVar, "directions");
            kVar.l(sVar.b(), sVar.a(), (x) null);
            return o.f20627a;
        }
    }

    /* compiled from: LiveTvFragment.kt */
    public static final class c extends ud.l implements td.a<o1.k> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveTvFragment f13399b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(LiveTvFragment liveTvFragment) {
            super(0);
            this.f13399b = liveTvFragment;
        }

        public Object d() {
            Dialog dialog;
            Window window;
            LiveTvFragment liveTvFragment = this.f13399b;
            k.f(liveTvFragment, "<this>");
            k.f(liveTvFragment, "fragment");
            for (p pVar = liveTvFragment; pVar != null; pVar = pVar.E) {
                if (pVar instanceof NavHostFragment) {
                    o1.v vVar = ((NavHostFragment) pVar).f2752n0;
                    if (vVar != null) {
                        return vVar;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                p pVar2 = pVar.y().f1601y;
                if (pVar2 instanceof NavHostFragment) {
                    o1.v vVar2 = ((NavHostFragment) pVar2).f2752n0;
                    if (vVar2 != null) {
                        return vVar2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = liveTvFragment.Q;
            if (view != null) {
                return c0.a(view);
            }
            View view2 = null;
            androidx.fragment.app.o oVar = liveTvFragment instanceof androidx.fragment.app.o ? (androidx.fragment.app.o) liveTvFragment : null;
            if (!(oVar == null || (dialog = oVar.f1775y0) == null || (window = dialog.getWindow()) == null)) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return c0.a(view2);
            }
            throw new IllegalStateException("Fragment " + liveTvFragment + " does not have a NavController set");
        }
    }

    /* compiled from: types.kt */
    public static final class d extends e0<gd.b> {
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class e extends ud.l implements td.a<Bundle> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13400b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(0);
            this.f13400b = pVar;
        }

        public Object d() {
            Bundle bundle = this.f13400b.f1796g;
            if (bundle != null) {
                return bundle;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Fragment ");
            a10.append(this.f13400b);
            a10.append(" has null arguments");
            throw new IllegalStateException(a10.toString());
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends ud.l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13401b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar) {
            super(0);
            this.f13401b = pVar;
        }

        public Object d() {
            return this.f13401b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class g extends ud.l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13402b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(td.a aVar) {
            super(0);
            this.f13402b = aVar;
        }

        public Object d() {
            return (v0) this.f13402b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class h extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13403b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(kd.d dVar) {
            super(0);
            this.f13403b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13403b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class i extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13404b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(td.a aVar, kd.d dVar) {
            super(0);
            this.f13404b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13404b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: LiveTvFragment.kt */
    public static final class j extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveTvFragment f13405b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(LiveTvFragment liveTvFragment) {
            super(0);
            this.f13405b = liveTvFragment;
        }

        public Object d() {
            return (gd.b) this.f13405b.f13394w0.getValue();
        }
    }

    static {
        q qVar = new q(LiveTvFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/livetv/viewmodel/LiveTvViewModelFactory;", 0);
        v.f26198a.getClass();
        f13391z0 = new ae.g[]{qVar};
    }

    public LiveTvFragment() {
        super(R.layout.fragment_live_tv, a.f13397i);
        d dVar = new d();
        ae.g[] gVarArr = j0.f18667a;
        this.f13394w0 = gf.p.a(this, j0.b(dVar.f18662a), (Object) null).a(this, f13391z0[0]);
        j jVar = new j(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new g(new f(this)));
        this.f13395x0 = new r0(v.a(gd.a.class), new h(a10), jVar, new i((td.a) null, a10));
        this.f13396y0 = new kc.b(new b(this));
    }

    public void L(Bundle bundle) {
        String str;
        boolean z10 = true;
        this.O = true;
        MainActivity mainActivity = (MainActivity) g0();
        Category category = v0().f19741a;
        if (category == null || (str = category.getName()) == null) {
            str = D(R.string.app_name);
            k.e(str, "getString(R.string.app_name)");
        }
        mainActivity.O(str);
        RecyclerView recyclerView = ((zb.g) r0()).f28802b;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f13396y0);
        w0().f18627e.f(F(), new r1.c(this));
        if (this.f13396y0.b() > 0) {
            z10 = false;
        }
        if (z10) {
            gd.a w02 = w0();
            Category category2 = v0().f19741a;
            w02.f(category2 != null ? Long.valueOf(category2.getId()) : null);
        }
    }

    public final jc.d v0() {
        return (jc.d) this.f13392u0.getValue();
    }

    public final gd.a w0() {
        return (gd.a) this.f13395x0.getValue();
    }
}
