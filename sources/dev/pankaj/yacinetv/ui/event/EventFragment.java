package dev.pankaj.yacinetv.ui.event;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import androidx.fragment.app.p;
import androidx.lifecycle.n;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.ui.main.MainActivity;
import dev.pankaj.ytvclib.data.model.Event;
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

/* compiled from: EventFragment.kt */
public final class EventFragment extends gc.b<zb.f> {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f13367x0;

    /* renamed from: u0  reason: collision with root package name */
    public final kd.d f13368u0;

    /* renamed from: v0  reason: collision with root package name */
    public final kd.d f13369v0;

    /* renamed from: w0  reason: collision with root package name */
    public final ic.a f13370w0 = new ic.a(new b(this));

    /* compiled from: EventFragment.kt */
    public /* synthetic */ class a extends j implements l<View, zb.f> {

        /* renamed from: i  reason: collision with root package name */
        public static final a f13371i = new a();

        public a() {
            super(1, zb.f.class, "bind", "bind(Landroid/view/View;)Ldev/pankaj/yacinetv/databinding/FragmentEventBinding;", 0);
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
                    i10 = R.id.no_item;
                    TextView textView = (TextView) b8.a.d(view, R.id.no_item);
                    if (textView != null) {
                        return new zb.f((ConstraintLayout) view, relativeLayout, recyclerView, textView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    /* compiled from: EventFragment.kt */
    public static final class b extends ud.l implements l<Event, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ EventFragment f13372b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(EventFragment eventFragment) {
            super(1);
            this.f13372b = eventFragment;
        }

        public Object c(Object obj) {
            Event event = (Event) obj;
            k.f(event, "it");
            oc.e eVar = oc.e.f23682a;
            Context h02 = this.f13372b.h0();
            long id2 = event.getId();
            sc.f fVar = this.f13372b.f18622r0;
            eVar.a(h02, 2, id2, fVar != null ? fVar.d() : null);
            return o.f20627a;
        }
    }

    /* compiled from: types.kt */
    public static final class c extends e0<fd.b> {
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class d extends ud.l implements td.a<p> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f13373b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(p pVar) {
            super(0);
            this.f13373b = pVar;
        }

        public Object d() {
            return this.f13373b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class e extends ud.l implements td.a<v0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.a f13374b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(td.a aVar) {
            super(0);
            this.f13374b = aVar;
        }

        public Object d() {
            return (v0) this.f13374b.d();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class f extends ud.l implements td.a<u0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13375b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(kd.d dVar) {
            super(0);
            this.f13375b = dVar;
        }

        public Object d() {
            u0 v10 = o0.a(this.f13375b).v();
            k.e(v10, "owner.viewModelStore");
            return v10;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    public static final class g extends ud.l implements td.a<k1.a> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kd.d f13376b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(td.a aVar, kd.d dVar) {
            super(0);
            this.f13376b = dVar;
        }

        public Object d() {
            v0 a10 = o0.a(this.f13376b);
            k1.a aVar = null;
            n nVar = a10 instanceof n ? (n) a10 : null;
            if (nVar != null) {
                aVar = nVar.l();
            }
            return aVar == null ? a.C0172a.f19874b : aVar;
        }
    }

    /* compiled from: EventFragment.kt */
    public static final class h extends ud.l implements td.a<s0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ EventFragment f13377b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(EventFragment eventFragment) {
            super(0);
            this.f13377b = eventFragment;
        }

        public Object d() {
            return (fd.b) this.f13377b.f13368u0.getValue();
        }
    }

    static {
        q qVar = new q(EventFragment.class, "viewModelFactory", "getViewModelFactory()Ldev/pankaj/ytvlib/ui/event/viewmodel/EventViewModelFactory;", 0);
        v.f26198a.getClass();
        f13367x0 = new ae.g[]{qVar};
    }

    public EventFragment() {
        super(R.layout.fragment_event, a.f13371i);
        c cVar = new c();
        ae.g[] gVarArr = j0.f18667a;
        k.g(cVar, "ref");
        this.f13368u0 = gf.p.a(this, j0.b(cVar.f18662a), (Object) null).a(this, f13367x0[0]);
        h hVar = new h(this);
        kd.d a10 = kd.e.a(kd.f.NONE, new e(new d(this)));
        this.f13369v0 = o0.b(this, v.a(fd.a.class), new f(a10), new g((td.a) null, a10), hVar);
    }

    public void d0(View view, Bundle bundle) {
        k.f(view, "view");
        RelativeLayout relativeLayout = ((zb.f) r0()).f28798b;
        k.e(relativeLayout, "binding.adView");
        s0(relativeLayout);
        String D = D(R.string.live_event);
        k.e(D, "getString(R.string.live_event)");
        ((MainActivity) g0()).O(D);
        RecyclerView recyclerView = ((zb.f) r0()).f28799c;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.f13370w0);
        v0().f18344e.f(F(), new r1.c(this));
        v0().g();
    }

    public final fd.a v0() {
        return (fd.a) this.f13369v0.getValue();
    }
}
