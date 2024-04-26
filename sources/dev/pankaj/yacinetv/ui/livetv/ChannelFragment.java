package dev.pankaj.yacinetv.ui.livetv;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.lifecycle.n;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.RecyclerView;
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

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment extends gc.b<zb.d> {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f13378y0;

    /* renamed from: u0  reason: collision with root package name */
    public final o1.e f13379u0 = new o1.e(v.a(jc.b.class), new d(this));

    /* renamed from: v0  reason: collision with root package name */
    public final kd.d f13380v0;

    /* renamed from: w0  reason: collision with root package name */
    public final kd.d f13381w0;

    /* renamed from: x0  reason: collision with root package name */
    public final kc.d f13382x0;

    /* compiled from: ChannelFragment.kt */
    public /* synthetic */ class a extends j implements l<View, zb.d> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13383i = new a();

        public a() {
            super(1, zb.d.class, "bind", "bind(Landroid/view/View;)Ldev/pankaj/yacinetv/databinding/FragmentChannelBinding;", 0);
        }

        public Object c(Object obj) {
            View view = (View) obj;
            k.f(view, "p0");
            int i10 = R.id.adView;
            RelativeLayout relativeLayout = (RelativeLayout) b8.a.d(view, R.id.adView);
            if (relativeLayout != null) {
                i10 = R.id.list;
                RecyclerView recyclerView = (RecyclerView) b8.a.d(view, R.id.list);
                if (recyclerView != null) {
                    return new zb.d((ConstraintLayout) view, relativeLayout, recyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final class b extends ud.l implements l<Channel, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ChannelFragment f13384b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ChannelFragment channelFragment) {
            super(1);
            this.f13384b = channelFragment;
        }

        public Object c(Object obj) {
            Channel channel = (Channel) obj;
            k.f(channel, "it");
            oc.e eVar = oc.e.f23682a;
            Context h02 = this.f13384b.h0();
            long id2 = channel.getId();
            sc.f fVar = this.f13384b.f18622r0;
            eVar.a(h02, 1, id2, fVar != null ? fVar.d() : null);
            return o.f20627a;
        }
    }

    /* compiled from: types.kt */
    public static final class c extends e0<gd.b> {
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    public static final class d extends ud.l implements td.a<Bundle> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13385b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(p pVar) {
            super(0);
            this.f13385b = pVar;
        }

        public Object d() {
            Bundle bundle = this.f13385b.f1796g;
            if (bundle != null) {
                return bundle;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Fragment ");
            a10.append(this.f13385b);
            a10.append(" has null arguments");
            throw new IllegalStateException(a10.toString());
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends ud.l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13386b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(0);
            this.f13386b = pVar;
        }

        public Object d() {
            return this.f13386b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends ud.l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13387b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(td.a aVar) {
            super(0);
            this.f13387b = aVar;
        }

        public Object d() {
            return (v0) this.f13387b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class g extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13388b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(kd.d dVar) {
            super(0);
            this.f13388b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13388b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class h extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13389b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(td.a aVar, kd.d dVar) {
            super(0);
            this.f13389b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13389b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final class i extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ChannelFragment f13390b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ChannelFragment channelFragment) {
            super(0);
            this.f13390b = channelFragment;
        }

        public Object d() {
            return (gd.b) this.f13390b.f13380v0.getValue();
        }
    }

    static {
        q qVar = new q(ChannelFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/livetv/viewmodel/LiveTvViewModelFactory;", 0);
        v.f26198a.getClass();
        f13378y0 = new ae.g[]{qVar};
    }

    public ChannelFragment() {
        super(R.layout.fragment_channel, a.f13383i);
        c cVar = new c();
        ae.g[] gVarArr = j0.f18667a;
        this.f13380v0 = gf.p.a(this, j0.b(cVar.f18662a), (Object) null).a(this, f13378y0[0]);
        i iVar = new i(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new f(new e(this)));
        this.f13381w0 = new r0(v.a(gd.a.class), new g(a10), iVar, new h((td.a) null, a10));
        this.f13382x0 = new kc.d(new b(this));
    }

    public void d0(View view, Bundle bundle) {
        k.f(view, "view");
        RelativeLayout relativeLayout = ((zb.d) r0()).f28790b;
        k.e(relativeLayout, "binding.adView");
        s0(relativeLayout);
        ((MainActivity) g0()).O(v0().f19739a.getName());
        RecyclerView recyclerView = ((zb.d) r0()).f28791c;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new AutoFitGridLayoutManager(h0(), e.k.b(120)));
        recyclerView.setAdapter(this.f13382x0);
        w0().f18628f.f(F(), new r0.b(this));
        w0().g(v0().f19739a.getId());
    }

    public final jc.b v0() {
        return (jc.b) this.f13379u0.getValue();
    }

    public final gd.a w0() {
        return (gd.a) this.f13381w0.getValue();
    }
}
