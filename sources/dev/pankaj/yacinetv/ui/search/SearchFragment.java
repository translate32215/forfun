package dev.pankaj.yacinetv.ui.search;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.lifecycle.n;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.ui.main.MainActivity;
import dev.pankaj.ytvclib.data.model.Channel;
import dev.pankaj.ytvlib.utils.AutoFitGridLayoutManager;
import gf.e0;
import gf.j0;
import k1.a;
import kd.o;
import kotlin.reflect.KProperty;
import td.l;
import ud.j;
import ud.k;
import ud.q;
import ud.v;

/* compiled from: SearchFragment.kt */
public final class SearchFragment extends gc.b<zb.h> {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f13409y0;

    /* renamed from: u0  reason: collision with root package name */
    public final kd.d f13410u0;

    /* renamed from: v0  reason: collision with root package name */
    public final kd.d f13411v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f13412w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    public final kc.d f13413x0 = new kc.d(new b(this));

    /* compiled from: SearchFragment.kt */
    public /* synthetic */ class a extends j implements l<View, zb.h> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13414i = new a();

        public a() {
            super(1, zb.h.class, "bind", "bind(Landroid/view/View;)Ldev/pankaj/yacinetv/databinding/FragmentSearchBinding;", 0);
        }

        public Object c(Object obj) {
            View view = (View) obj;
            k.f(view, "p0");
            int i10 = R.id.adView;
            RelativeLayout relativeLayout = (RelativeLayout) b8.a.d(view, R.id.adView);
            if (relativeLayout != null) {
                i10 = R.id.card_search_view;
                MaterialCardView materialCardView = (MaterialCardView) b8.a.d(view, R.id.card_search_view);
                if (materialCardView != null) {
                    i10 = R.id.list;
                    RecyclerView recyclerView = (RecyclerView) b8.a.d(view, R.id.list);
                    if (recyclerView != null) {
                        i10 = R.id.search_view;
                        SearchView searchView = (SearchView) b8.a.d(view, R.id.search_view);
                        if (searchView != null) {
                            return new zb.h((ConstraintLayout) view, relativeLayout, materialCardView, recyclerView, searchView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    /* compiled from: SearchFragment.kt */
    public static final class b extends ud.l implements l<Channel, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SearchFragment f13415b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(SearchFragment searchFragment) {
            super(1);
            this.f13415b = searchFragment;
        }

        public Object c(Object obj) {
            Channel channel = (Channel) obj;
            k.f(channel, "it");
            oc.e eVar = oc.e.f23682a;
            Context h02 = this.f13415b.h0();
            long id2 = channel.getId();
            sc.f fVar = this.f13415b.f18622r0;
            eVar.a(h02, 1, id2, fVar != null ? fVar.d() : null);
            return o.f20627a;
        }
    }

    /* compiled from: SearchFragment.kt */
    public static final class c implements SearchView.m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SearchFragment f13416a;

        public c(SearchFragment searchFragment) {
            this.f13416a = searchFragment;
        }

        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            SearchFragment searchFragment = this.f13416a;
            searchFragment.f13412w0 = str;
            ((hd.a) searchFragment.f13411v0.getValue()).f(searchFragment.f13412w0);
            return false;
        }

        public boolean b(String str) {
            k.f(str, "query");
            if (str.length() <= 2) {
                return false;
            }
            SearchFragment searchFragment = this.f13416a;
            searchFragment.f13412w0 = str;
            ((hd.a) searchFragment.f13411v0.getValue()).f(this.f13416a.f13412w0);
            ((zb.h) this.f13416a.r0()).f28806d.clearFocus();
            return false;
        }
    }

    /* compiled from: types.kt */
    public static final class d extends e0<hd.b> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends ud.l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13417b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(0);
            this.f13417b = pVar;
        }

        public Object d() {
            return this.f13417b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends ud.l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13418b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar) {
            super(0);
            this.f13418b = aVar;
        }

        public Object d() {
            return (v0) this.f13418b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class g extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13419b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(kd.d dVar) {
            super(0);
            this.f13419b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13419b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class h extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13420b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(td.a aVar, kd.d dVar) {
            super(0);
            this.f13420b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13420b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: SearchFragment.kt */
    public static final class i extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SearchFragment f13421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(SearchFragment searchFragment) {
            super(0);
            this.f13421b = searchFragment;
        }

        public Object d() {
            return (hd.b) this.f13421b.f13410u0.getValue();
        }
    }

    static {
        q qVar = new q(SearchFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/search/viewmodel/SearchViewModelFactory;", 0);
        v.f26198a.getClass();
        f13409y0 = new ae.g[]{qVar};
    }

    public SearchFragment() {
        super(R.layout.fragment_search, a.f13414i);
        d dVar = new d();
        ae.g[] gVarArr = j0.f18667a;
        this.f13410u0 = gf.p.a(this, j0.b(dVar.f18662a), (Object) null).a(this, f13409y0[0]);
        i iVar = new i(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new f(new e(this)));
        this.f13411v0 = new r0(v.a(hd.a.class), new g(a10), iVar, new h((td.a) null, a10));
    }

    public static final hd.a v0(SearchFragment searchFragment) {
        return (hd.a) searchFragment.f13411v0.getValue();
    }

    public void L(Bundle bundle) {
        this.O = true;
        String D = D(R.string.search);
        k.e(D, "getString(R.string.search)");
        ((MainActivity) g0()).O(D);
        RelativeLayout relativeLayout = ((zb.h) r0()).f28804b;
        k.e(relativeLayout, "binding.adView");
        s0(relativeLayout);
        RecyclerView recyclerView = ((zb.h) r0()).f28805c;
        recyclerView.setHasFixedSize(true);
        Context context = recyclerView.getContext();
        k.e(context, "context");
        recyclerView.setLayoutManager(new AutoFitGridLayoutManager(context, e.k.b(120)));
        recyclerView.setAdapter(this.f13413x0);
        w0().f18976e.f(F(), new r1.c(this));
        ((zb.h) r0()).f28806d.setOnQueryTextListener(new c(this));
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        if (!this.M) {
            this.M = true;
            if (I() && !J()) {
                this.C.p();
            }
        }
    }

    public void W(Menu menu) {
        k.f(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.searchFragment);
        if (findItem != null) {
            findItem.setEnabled(false);
        }
    }

    public final hd.a w0() {
        return (hd.a) this.f13411v0.getValue();
    }
}
