package o1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.y0;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u0;
import be.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ld.n;
import o1.h;

/* compiled from: NavController.kt */
public class k {
    public int A;
    public final List<h> B;
    public final kd.d C;
    public final ge.a<h> D;

    /* renamed from: a  reason: collision with root package name */
    public final Context f22717a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f22718b;

    /* renamed from: c  reason: collision with root package name */
    public t f22719c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f22720d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable[] f22721e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22722f;

    /* renamed from: g  reason: collision with root package name */
    public final ld.c<h> f22723g;

    /* renamed from: h  reason: collision with root package name */
    public final ge.b<List<h>> f22724h;

    /* renamed from: i  reason: collision with root package name */
    public final ge.e<List<h>> f22725i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<h, h> f22726j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<h, AtomicInteger> f22727k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<Integer, String> f22728l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<String, ld.c<i>> f22729m;

    /* renamed from: n  reason: collision with root package name */
    public t f22730n;

    /* renamed from: o  reason: collision with root package name */
    public OnBackPressedDispatcher f22731o;

    /* renamed from: p  reason: collision with root package name */
    public m f22732p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f22733q;

    /* renamed from: r  reason: collision with root package name */
    public o.c f22734r;

    /* renamed from: s  reason: collision with root package name */
    public final s f22735s;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.activity.h f22736t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f22737u;

    /* renamed from: v  reason: collision with root package name */
    public e0 f22738v;

    /* renamed from: w  reason: collision with root package name */
    public final Map<d0<? extends r>, a> f22739w;

    /* renamed from: x  reason: collision with root package name */
    public td.l<? super h, kd.o> f22740x;

    /* renamed from: y  reason: collision with root package name */
    public td.l<? super h, kd.o> f22741y;

    /* renamed from: z  reason: collision with root package name */
    public final Map<h, Boolean> f22742z;

    /* compiled from: NavController.kt */
    public final class a extends f0 {

        /* renamed from: g  reason: collision with root package name */
        public final d0<? extends r> f22743g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f22744h;

        public a(k kVar, d0<? extends r> d0Var) {
            ud.k.f(d0Var, "navigator");
            this.f22744h = kVar;
            this.f22743g = d0Var;
        }

        public h a(r rVar, Bundle bundle) {
            h.a aVar = h.f22694v;
            k kVar = this.f22744h;
            return h.a.b(aVar, kVar.f22717a, rVar, bundle, kVar.j(), this.f22744h.f22732p, (String) null, (Bundle) null, 96);
        }

        public void c(h hVar, boolean z10) {
            d0 c10 = this.f22744h.f22738v.c(hVar.f22696b.f22799a);
            if (ud.k.a(c10, this.f22743g)) {
                k kVar = this.f22744h;
                td.l<? super h, kd.o> lVar = kVar.f22741y;
                if (lVar != null) {
                    lVar.c(hVar);
                    super.c(hVar, z10);
                    return;
                }
                int indexOf = kVar.f22723g.indexOf(hVar);
                if (indexOf < 0) {
                    Log.i("NavController", "Ignoring pop of " + hVar + " as it was not found on the current back stack");
                    return;
                }
                int i10 = indexOf + 1;
                if (i10 != kVar.f22723g.size()) {
                    kVar.o(kVar.f22723g.get(i10).f22696b.f22806h, true, false);
                }
                k.r(kVar, hVar, false, (ld.c) null, 6, (Object) null);
                super.c(hVar, z10);
                kVar.x();
                kVar.c();
                return;
            }
            a aVar = this.f22744h.f22739w.get(c10);
            ud.k.c(aVar);
            aVar.c(hVar, z10);
        }

        public void d(h hVar) {
            ud.k.f(hVar, "backStackEntry");
            d0 c10 = this.f22744h.f22738v.c(hVar.f22696b.f22799a);
            if (ud.k.a(c10, this.f22743g)) {
                td.l<? super h, kd.o> lVar = this.f22744h.f22740x;
                if (lVar != null) {
                    lVar.c(hVar);
                    super.d(hVar);
                    return;
                }
                StringBuilder a10 = android.support.v4.media.a.a("Ignoring add of destination ");
                a10.append(hVar.f22696b);
                a10.append(" outside of the call to navigate(). ");
                Log.i("NavController", a10.toString());
                return;
            }
            a aVar = this.f22744h.f22739w.get(c10);
            if (aVar != null) {
                aVar.d(hVar);
                return;
            }
            throw new IllegalStateException(androidx.activity.e.a(android.support.v4.media.a.a("NavigatorBackStack for "), hVar.f22696b.f22799a, " should already be created").toString());
        }

        public final void e(h hVar) {
            super.d(hVar);
        }
    }

    /* compiled from: NavController.kt */
    public interface b {
        void a(k kVar, r rVar, Bundle bundle);
    }

    /* compiled from: NavController.kt */
    public static final class c extends ud.l implements td.l<Context, Context> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f22745b = new c();

        public c() {
            super(1);
        }

        public Object c(Object obj) {
            Context context = (Context) obj;
            ud.k.f(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    public static final class d extends ud.l implements td.a<w> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f22746b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(0);
            this.f22746b = kVar;
        }

        public Object d() {
            this.f22746b.getClass();
            k kVar = this.f22746b;
            return new w(kVar.f22717a, kVar.f22738v);
        }
    }

    /* compiled from: NavController.kt */
    public static final class e extends ud.l implements td.l<h, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ud.s f22747b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f22748c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r f22749d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Bundle f22750e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ud.s sVar, k kVar, r rVar, Bundle bundle) {
            super(1);
            this.f22747b = sVar;
            this.f22748c = kVar;
            this.f22749d = rVar;
            this.f22750e = bundle;
        }

        public Object c(Object obj) {
            h hVar = (h) obj;
            ud.k.f(hVar, "it");
            this.f22747b.f26195a = true;
            this.f22748c.a(this.f22749d, this.f22750e, hVar, n.f21256a);
            return kd.o.f20627a;
        }
    }

    /* compiled from: NavController.kt */
    public static final class f extends androidx.activity.h {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f22751c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(k kVar) {
            super(false);
            this.f22751c = kVar;
        }

        public void a() {
            this.f22751c.n();
        }
    }

    /* compiled from: NavController.kt */
    public static final class g extends ud.l implements td.l<h, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ud.s f22752b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ud.s f22753c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k f22754d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f22755e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ld.c<i> f22756f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ud.s sVar, ud.s sVar2, k kVar, boolean z10, ld.c<i> cVar) {
            super(1);
            this.f22752b = sVar;
            this.f22753c = sVar2;
            this.f22754d = kVar;
            this.f22755e = z10;
            this.f22756f = cVar;
        }

        public Object c(Object obj) {
            h hVar = (h) obj;
            ud.k.f(hVar, "entry");
            this.f22752b.f26195a = true;
            this.f22753c.f26195a = true;
            this.f22754d.q(hVar, this.f22755e, this.f22756f);
            return kd.o.f20627a;
        }
    }

    /* compiled from: NavController.kt */
    public static final class h extends ud.l implements td.l<r, r> {

        /* renamed from: b  reason: collision with root package name */
        public static final h f22757b = new h();

        public h() {
            super(1);
        }

        public Object c(Object obj) {
            r rVar = (r) obj;
            ud.k.f(rVar, "destination");
            t tVar = rVar.f22800b;
            boolean z10 = false;
            if (tVar != null && tVar.f22815t == rVar.f22806h) {
                z10 = true;
            }
            if (z10) {
                return tVar;
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    public static final class i extends ud.l implements td.l<r, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f22758b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(k kVar) {
            super(1);
            this.f22758b = kVar;
        }

        public Object c(Object obj) {
            r rVar = (r) obj;
            ud.k.f(rVar, "destination");
            return Boolean.valueOf(!this.f22758b.f22728l.containsKey(Integer.valueOf(rVar.f22806h)));
        }
    }

    /* compiled from: NavController.kt */
    public static final class j extends ud.l implements td.l<r, r> {

        /* renamed from: b  reason: collision with root package name */
        public static final j f22759b = new j();

        public j() {
            super(1);
        }

        public Object c(Object obj) {
            r rVar = (r) obj;
            ud.k.f(rVar, "destination");
            t tVar = rVar.f22800b;
            boolean z10 = false;
            if (tVar != null && tVar.f22815t == rVar.f22806h) {
                z10 = true;
            }
            if (z10) {
                return tVar;
            }
            return null;
        }
    }

    /* renamed from: o1.k$k  reason: collision with other inner class name */
    /* compiled from: NavController.kt */
    public static final class C0201k extends ud.l implements td.l<r, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f22760b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0201k(k kVar) {
            super(1);
            this.f22760b = kVar;
        }

        public Object c(Object obj) {
            r rVar = (r) obj;
            ud.k.f(rVar, "destination");
            return Boolean.valueOf(!this.f22760b.f22728l.containsKey(Integer.valueOf(rVar.f22806h)));
        }
    }

    /* compiled from: NavController.kt */
    public static final class l extends ud.l implements td.l<h, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ud.s f22761b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List<h> f22762c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ud.t f22763d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k f22764e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Bundle f22765f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(ud.s sVar, List<h> list, ud.t tVar, k kVar, Bundle bundle) {
            super(1);
            this.f22761b = sVar;
            this.f22762c = list;
            this.f22763d = tVar;
            this.f22764e = kVar;
            this.f22765f = bundle;
        }

        public Object c(Object obj) {
            List<h> list;
            h hVar = (h) obj;
            ud.k.f(hVar, "entry");
            this.f22761b.f26195a = true;
            int indexOf = this.f22762c.indexOf(hVar);
            if (indexOf != -1) {
                int i10 = indexOf + 1;
                list = this.f22762c.subList(this.f22763d.f26196a, i10);
                this.f22763d.f26196a = i10;
            } else {
                list = n.f21256a;
            }
            this.f22764e.a(hVar.f22696b, this.f22765f, hVar, list);
            return kd.o.f20627a;
        }
    }

    public k(Context context) {
        Object obj;
        this.f22717a = context;
        Iterator it = be.g.c(context, c.f22745b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22718b = (Activity) obj;
        this.f22723g = new ld.c<>();
        ge.f fVar = new ge.f(n.f21256a);
        this.f22724h = fVar;
        this.f22725i = e.i.b(fVar);
        this.f22726j = new LinkedHashMap();
        this.f22727k = new LinkedHashMap();
        this.f22728l = new LinkedHashMap();
        this.f22729m = new LinkedHashMap();
        this.f22733q = new CopyOnWriteArrayList<>();
        this.f22734r = o.c.INITIALIZED;
        this.f22735s = new j(this);
        this.f22736t = new f(this);
        this.f22737u = true;
        this.f22738v = new e0();
        this.f22739w = new LinkedHashMap();
        this.f22742z = new LinkedHashMap();
        e0 e0Var = this.f22738v;
        e0Var.a(new u(e0Var));
        this.f22738v.a(new a(this.f22717a));
        this.B = new ArrayList();
        this.C = kd.e.b(new d(this));
        this.D = new ge.d(1, 1, fe.a.DROP_OLDEST);
    }

    public static /* synthetic */ boolean p(k kVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return kVar.o(i10, z10, z11);
    }

    public static /* synthetic */ void r(k kVar, h hVar, boolean z10, ld.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        kVar.q(hVar, z10, (i10 & 4) != 0 ? new ld.c() : null);
    }

    public final void a(r rVar, Bundle bundle, h hVar, List<h> list) {
        r rVar2;
        Bundle bundle2;
        List<h> list2;
        ld.c<h> cVar;
        h hVar2;
        r rVar3;
        r rVar4;
        h hVar3;
        t tVar;
        h hVar4;
        Bundle bundle3;
        List<h> list3;
        r rVar5 = rVar;
        Bundle bundle4 = bundle;
        h hVar5 = hVar;
        List<h> list4 = list;
        r rVar6 = hVar5.f22696b;
        if (!(rVar6 instanceof b)) {
            while (!this.f22723g.isEmpty() && (this.f22723g.last().f22696b instanceof b)) {
                if (!p(this, this.f22723g.last().f22696b.f22806h, true, false, 4, (Object) null)) {
                    break;
                }
            }
        }
        ld.c cVar2 = new ld.c();
        h hVar6 = null;
        if (rVar5 instanceof t) {
            t tVar2 = rVar6;
            while (true) {
                ud.k.c(tVar2);
                t tVar3 = tVar2.f22800b;
                if (tVar3 != null) {
                    ListIterator<h> listIterator = list4.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            hVar4 = null;
                            break;
                        }
                        hVar4 = listIterator.previous();
                        if (ud.k.a(hVar4.f22696b, tVar3)) {
                            break;
                        }
                    }
                    h hVar7 = hVar4;
                    if (hVar7 == null) {
                        rVar2 = rVar6;
                        list3 = list4;
                        bundle3 = bundle4;
                        hVar2 = hVar5;
                        hVar7 = h.a.b(h.f22694v, this.f22717a, tVar3, bundle, j(), this.f22732p, (String) null, (Bundle) null, 96);
                    } else {
                        rVar2 = rVar6;
                        list3 = list4;
                        hVar2 = hVar5;
                        bundle3 = bundle4;
                    }
                    cVar2.c(hVar7);
                    if (!(!this.f22723g.isEmpty()) || this.f22723g.last().f22696b != tVar3) {
                        list2 = list3;
                        bundle2 = bundle3;
                        tVar = tVar3;
                        cVar = cVar2;
                    } else {
                        list2 = list3;
                        bundle2 = bundle3;
                        tVar = tVar3;
                        cVar = cVar2;
                        r(this, this.f22723g.last(), false, (ld.c) null, 6, (Object) null);
                    }
                } else {
                    tVar = tVar3;
                    cVar = cVar2;
                    rVar2 = rVar6;
                    list2 = list4;
                    hVar2 = hVar5;
                    bundle2 = bundle4;
                }
                if (tVar == null || tVar == rVar5) {
                    break;
                }
                hVar5 = hVar2;
                tVar2 = tVar;
                cVar2 = cVar;
                bundle4 = bundle2;
                list4 = list2;
                rVar6 = rVar2;
            }
        } else {
            cVar = cVar2;
            rVar2 = rVar6;
            list2 = list4;
            hVar2 = hVar5;
            bundle2 = bundle4;
        }
        if (cVar.isEmpty()) {
            rVar3 = rVar2;
        } else {
            rVar3 = ((h) cVar.first()).f22696b;
        }
        while (rVar3 != null && d(rVar3.f22806h) == null) {
            rVar3 = rVar3.f22800b;
            if (rVar3 != null) {
                ListIterator<h> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        hVar3 = null;
                        break;
                    }
                    hVar3 = listIterator2.previous();
                    if (ud.k.a(hVar3.f22696b, rVar3)) {
                        break;
                    }
                }
                h hVar8 = hVar3;
                if (hVar8 == null) {
                    hVar8 = h.a.b(h.f22694v, this.f22717a, rVar3, rVar3.f(bundle2), j(), this.f22732p, (String) null, (Bundle) null, 96);
                }
                cVar.c(hVar8);
            }
        }
        if (cVar.isEmpty()) {
            rVar4 = rVar2;
        } else {
            rVar4 = ((h) cVar.first()).f22696b;
        }
        while (!this.f22723g.isEmpty() && (this.f22723g.last().f22696b instanceof t) && ((t) this.f22723g.last().f22696b).C(rVar4.f22806h, false) == null) {
            r(this, this.f22723g.last(), false, (ld.c) null, 6, (Object) null);
        }
        h o10 = this.f22723g.o();
        if (o10 == null) {
            o10 = (h) cVar.o();
        }
        if (!ud.k.a(o10 != null ? o10.f22696b : null, this.f22719c)) {
            ListIterator<h> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                h previous = listIterator3.previous();
                r rVar7 = previous.f22696b;
                t tVar4 = this.f22719c;
                ud.k.c(tVar4);
                if (ud.k.a(rVar7, tVar4)) {
                    hVar6 = previous;
                    break;
                }
            }
            h hVar9 = hVar6;
            if (hVar9 == null) {
                h.a aVar = h.f22694v;
                Context context = this.f22717a;
                t tVar5 = this.f22719c;
                ud.k.c(tVar5);
                t tVar6 = this.f22719c;
                ud.k.c(tVar6);
                hVar9 = h.a.b(aVar, context, tVar5, tVar6.f(bundle2), j(), this.f22732p, (String) null, (Bundle) null, 96);
            }
            cVar.c(hVar9);
        }
        for (h hVar10 : cVar) {
            a aVar2 = this.f22739w.get(this.f22738v.c(hVar10.f22696b.f22799a));
            if (aVar2 != null) {
                aVar2.e(hVar10);
            } else {
                throw new IllegalStateException(androidx.activity.e.a(android.support.v4.media.a.a("NavigatorBackStack for "), rVar5.f22799a, " should already be created").toString());
            }
        }
        this.f22723g.addAll(cVar);
        this.f22723g.f(hVar2);
        for (h hVar11 : ld.l.r(cVar, hVar2)) {
            t tVar7 = hVar11.f22696b.f22800b;
            if (tVar7 != null) {
                k(hVar11, f(tVar7.f22806h));
            }
        }
    }

    public void b(b bVar) {
        this.f22733q.add(bVar);
        if (!this.f22723g.isEmpty()) {
            h last = this.f22723g.last();
            bVar.a(this, last.f22696b, last.f22697c);
        }
    }

    public final boolean c() {
        while (!this.f22723g.isEmpty() && (this.f22723g.last().f22696b instanceof t)) {
            r(this, this.f22723g.last(), false, (ld.c) null, 6, (Object) null);
        }
        h s10 = this.f22723g.s();
        if (s10 != null) {
            this.B.add(s10);
        }
        this.A++;
        w();
        int i10 = this.A - 1;
        this.A = i10;
        if (i10 == 0) {
            List<T> y10 = ld.l.y(this.B);
            this.B.clear();
            Iterator it = ((ArrayList) y10).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                Iterator<b> it2 = this.f22733q.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, hVar.f22696b, hVar.f22697c);
                }
                this.D.a(hVar);
            }
            this.f22724h.a(s());
        }
        if (s10 != null) {
            return true;
        }
        return false;
    }

    public final r d(int i10) {
        r rVar;
        t tVar = this.f22719c;
        if (tVar == null) {
            return null;
        }
        ud.k.c(tVar);
        if (tVar.f22806h == i10) {
            return this.f22719c;
        }
        h s10 = this.f22723g.s();
        if (s10 == null || (rVar = s10.f22696b) == null) {
            rVar = this.f22719c;
            ud.k.c(rVar);
        }
        return e(rVar, i10);
    }

    public final r e(r rVar, int i10) {
        t tVar;
        if (rVar.f22806h == i10) {
            return rVar;
        }
        if (rVar instanceof t) {
            tVar = (t) rVar;
        } else {
            tVar = rVar.f22800b;
            ud.k.c(tVar);
        }
        return tVar.C(i10, true);
    }

    public h f(int i10) {
        h hVar;
        boolean z10;
        ld.c<h> cVar = this.f22723g;
        ListIterator<h> listIterator = cVar.listIterator(cVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                hVar = null;
                break;
            }
            hVar = listIterator.previous();
            if (hVar.f22696b.f22806h == i10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        h hVar2 = hVar;
        if (hVar2 != null) {
            return hVar2;
        }
        StringBuilder a10 = y0.a("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        a10.append(g());
        throw new IllegalArgumentException(a10.toString().toString());
    }

    public r g() {
        h s10 = this.f22723g.s();
        if (s10 != null) {
            return s10.f22696b;
        }
        return null;
    }

    public final int h() {
        ld.c<h> cVar = this.f22723g;
        int i10 = 0;
        if (!(cVar instanceof Collection) || !cVar.isEmpty()) {
            for (h hVar : cVar) {
                if ((!(hVar.f22696b instanceof t)) && (i10 = i10 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i10;
    }

    public t i() {
        t tVar = this.f22719c;
        if (tVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        } else if (tVar != null) {
            return tVar;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
    }

    public final o.c j() {
        if (this.f22730n == null) {
            return o.c.CREATED;
        }
        return this.f22734r;
    }

    public final void k(h hVar, h hVar2) {
        this.f22726j.put(hVar, hVar2);
        if (this.f22727k.get(hVar2) == null) {
            this.f22727k.put(hVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f22727k.get(hVar2);
        ud.k.c(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(int r8, android.os.Bundle r9, o1.x r10) {
        /*
            r7 = this;
            ld.c<o1.h> r0 = r7.f22723g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000b
            o1.t r0 = r7.f22719c
            goto L_0x0015
        L_0x000b:
            ld.c<o1.h> r0 = r7.f22723g
            java.lang.Object r0 = r0.last()
            o1.h r0 = (o1.h) r0
            o1.r r0 = r0.f22696b
        L_0x0015:
            if (r0 == 0) goto L_0x00c3
            o1.c r1 = r0.j(r8)
            r2 = 0
            if (r1 == 0) goto L_0x0031
            if (r10 != 0) goto L_0x0022
            o1.x r10 = r1.f22662b
        L_0x0022:
            int r3 = r1.f22661a
            android.os.Bundle r4 = r1.f22663c
            if (r4 == 0) goto L_0x0032
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putAll(r4)
            goto L_0x0033
        L_0x0031:
            r3 = r8
        L_0x0032:
            r5 = r2
        L_0x0033:
            if (r9 == 0) goto L_0x003f
            if (r5 != 0) goto L_0x003c
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x003c:
            r5.putAll(r9)
        L_0x003f:
            r9 = 0
            if (r3 != 0) goto L_0x0055
            if (r10 == 0) goto L_0x0055
            int r4 = r10.f22828c
            r6 = -1
            if (r4 == r6) goto L_0x0055
            boolean r8 = r10.f22829d
            boolean r8 = r7.o(r4, r8, r9)
            if (r8 == 0) goto L_0x00b6
            r7.c()
            goto L_0x00b6
        L_0x0055:
            if (r3 == 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x00b7
            o1.r r4 = r7.d(r3)
            if (r4 != 0) goto L_0x00b3
            o1.r r10 = o1.r.f22798r
            android.content.Context r10 = r7.f22717a
            java.lang.String r10 = o1.r.q(r10, r3)
            if (r1 != 0) goto L_0x006d
            r9 = 1
        L_0x006d:
            java.lang.String r1 = " cannot be found from the current destination "
            if (r9 != 0) goto L_0x0096
            java.lang.String r9 = "Navigation destination "
            java.lang.String r2 = " referenced from action "
            java.lang.StringBuilder r9 = androidx.activity.result.d.a(r9, r10, r2)
            android.content.Context r10 = r7.f22717a
            java.lang.String r8 = o1.r.q(r10, r8)
            r9.append(r8)
            r9.append(r1)
            r9.append(r0)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x0096:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "Navigation action/destination "
            r9.append(r2)
            r9.append(r10)
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00b3:
            r7.m(r4, r5, r10, r2)
        L_0x00b6:
            return
        L_0x00b7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00c3:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "no current navigation node"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.l(int, android.os.Bundle, o1.x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r1 = r11.f22828c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011c A[LOOP:1: B:42:0x0116->B:44:0x011c, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(o1.r r19, android.os.Bundle r20, o1.x r21, o1.d0.a r22) {
        /*
            r18 = this;
            r0 = r18
            r10 = r19
            r11 = r21
            r12 = r22
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r1 = r0.f22739w
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r1.next()
            o1.k$a r2 = (o1.k.a) r2
            r2.f22684d = r3
            goto L_0x0012
        L_0x0022:
            ud.s r13 = new ud.s
            r13.<init>()
            if (r11 == 0) goto L_0x0038
            int r1 = r11.f22828c
            r2 = -1
            if (r1 == r2) goto L_0x0038
            boolean r2 = r11.f22829d
            boolean r4 = r11.f22830e
            boolean r1 = r0.o(r1, r2, r4)
            r15 = r1
            goto L_0x0039
        L_0x0038:
            r15 = 0
        L_0x0039:
            android.os.Bundle r9 = r19.f(r20)
            if (r11 == 0) goto L_0x0045
            boolean r1 = r11.f22827b
            if (r1 != r3) goto L_0x0045
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            if (r1 == 0) goto L_0x0062
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r0.f22728l
            int r2 = r10.f22806h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0062
            int r1 = r10.f22806h
            boolean r1 = r0.t(r1, r9, r11, r12)
            r13.f26195a = r1
            r17 = r15
            goto L_0x0108
        L_0x0062:
            ld.c<o1.h> r1 = r0.f22723g
            java.lang.Object r1 = r1.s()
            o1.h r1 = (o1.h) r1
            o1.e0 r2 = r0.f22738v
            java.lang.String r4 = r10.f22799a
            o1.d0 r2 = r2.c(r4)
            if (r11 == 0) goto L_0x007a
            boolean r4 = r11.f22826a
            if (r4 != r3) goto L_0x007a
            r4 = 1
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            if (r4 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x008b
            o1.r r4 = r1.f22696b
            if (r4 == 0) goto L_0x008b
            int r5 = r10.f22806h
            int r4 = r4.f22806h
            if (r5 != r4) goto L_0x008b
            r4 = 1
            goto L_0x008c
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r4 == 0) goto L_0x00da
            ld.c<o1.h> r4 = r0.f22723g
            java.lang.Object r4 = r4.A()
            o1.h r4 = (o1.h) r4
            r0.v(r4)
            o1.h r12 = new o1.h
            java.lang.String r4 = "entry"
            ud.k.f(r1, r4)
            android.content.Context r5 = r1.f22695a
            o1.r r6 = r1.f22696b
            androidx.lifecycle.o$c r8 = r1.f22698d
            o1.b0 r10 = r1.f22699e
            java.lang.String r11 = r1.f22700f
            android.os.Bundle r7 = r1.f22701g
            r4 = r12
            r16 = r7
            r7 = r9
            r9 = r10
            r10 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            androidx.lifecycle.o$c r4 = r1.f22698d
            r12.f22698d = r4
            androidx.lifecycle.o$c r1 = r1.f22707u
            r12.a(r1)
            ld.c<o1.h> r1 = r0.f22723g
            r1.f(r12)
            o1.r r1 = r12.f22696b
            o1.t r1 = r1.f22800b
            if (r1 == 0) goto L_0x00d4
            int r1 = r1.f22806h
            o1.h r1 = r0.f(r1)
            r0.k(r12, r1)
        L_0x00d4:
            r2.f(r12)
            r17 = r15
            goto L_0x0109
        L_0x00da:
            o1.h$a r1 = o1.h.f22694v
            android.content.Context r3 = r0.f22717a
            androidx.lifecycle.o$c r5 = r18.j()
            o1.m r6 = r0.f22732p
            r7 = 0
            r8 = 0
            r16 = 96
            r4 = r2
            r2 = r3
            r3 = r19
            r14 = r4
            r4 = r9
            r17 = r15
            r15 = r9
            r9 = r16
            o1.h r1 = o1.h.a.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.List r1 = ld.h.c(r1)
            o1.k$e r2 = new o1.k$e
            r2.<init>(r13, r0, r10, r15)
            r0.f22740x = r2
            r14.d(r1, r11, r12)
            r1 = 0
            r0.f22740x = r1
        L_0x0108:
            r3 = 0
        L_0x0109:
            r18.x()
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r1 = r0.f22739w
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0116:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0126
            java.lang.Object r2 = r1.next()
            o1.k$a r2 = (o1.k.a) r2
            r4 = 0
            r2.f22684d = r4
            goto L_0x0116
        L_0x0126:
            if (r17 != 0) goto L_0x0133
            boolean r1 = r13.f26195a
            if (r1 != 0) goto L_0x0133
            if (r3 == 0) goto L_0x012f
            goto L_0x0133
        L_0x012f:
            r18.w()
            goto L_0x0136
        L_0x0133:
            r18.c()
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.m(o1.r, android.os.Bundle, o1.x, o1.d0$a):void");
    }

    public boolean n() {
        if (!this.f22723g.isEmpty()) {
            r g10 = g();
            ud.k.c(g10);
            if (!o(g10.f22806h, true, false) || !c()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean o(int i10, boolean z10, boolean z11) {
        r rVar;
        String str;
        int i11 = i10;
        boolean z12 = z11;
        if (this.f22723g.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ld.l.s(this.f22723g).iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = ((h) it.next()).f22696b;
            d0 c10 = this.f22738v.c(rVar.f22799a);
            if (z10 || rVar.f22806h != i11) {
                arrayList.add(c10);
            }
            if (rVar.f22806h == i11) {
                break;
            }
        }
        r rVar2 = rVar;
        if (rVar2 == null) {
            r rVar3 = r.f22798r;
            String q10 = r.q(this.f22717a, i11);
            Log.i("NavController", "Ignoring popBackStack to destination " + q10 + " as it was not found on the current back stack");
            return false;
        }
        ud.s sVar = new ud.s();
        ld.c cVar = new ld.c();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            ud.s sVar2 = new ud.s();
            this.f22741y = new g(sVar2, sVar, this, z11, cVar);
            ((d0) it2.next()).i(this.f22723g.last(), z12);
            str = null;
            this.f22741y = null;
            if (!sVar2.f26195a) {
                break;
            }
        }
        if (z12) {
            if (!z10) {
                k.a aVar = new k.a(new be.k(be.g.c(rVar2, h.f22757b), new i(this)));
                while (aVar.hasNext()) {
                    Map<Integer, String> map = this.f22728l;
                    Integer valueOf = Integer.valueOf(((r) aVar.next()).f22806h);
                    i iVar = (i) cVar.o();
                    map.put(valueOf, iVar != null ? iVar.f22711a : str);
                }
            }
            if (!cVar.isEmpty()) {
                i iVar2 = (i) cVar.first();
                k.a aVar2 = new k.a(new be.k(be.g.c(d(iVar2.f22712b), j.f22759b), new C0201k(this)));
                while (aVar2.hasNext()) {
                    this.f22728l.put(Integer.valueOf(((r) aVar2.next()).f22806h), iVar2.f22711a);
                }
                this.f22729m.put(iVar2.f22711a, cVar);
            }
        }
        x();
        return sVar.f26195a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r5 = (r5 = r5.f22686f).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(o1.h r5, boolean r6, ld.c<o1.i> r7) {
        /*
            r4 = this;
            ld.c<o1.h> r0 = r4.f22723g
            java.lang.Object r0 = r0.last()
            o1.h r0 = (o1.h) r0
            boolean r1 = ud.k.a(r0, r5)
            if (r1 == 0) goto L_0x0093
            ld.c<o1.h> r5 = r4.f22723g
            r5.A()
            o1.e0 r5 = r4.f22738v
            o1.r r1 = r0.f22696b
            java.lang.String r1 = r1.f22799a
            o1.d0 r5 = r5.c(r1)
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r1 = r4.f22739w
            java.lang.Object r5 = r1.get(r5)
            o1.k$a r5 = (o1.k.a) r5
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x003d
            ge.e<java.util.Set<o1.h>> r5 = r5.f22686f
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            if (r5 == 0) goto L_0x003d
            boolean r5 = r5.contains(r0)
            if (r5 != r2) goto L_0x003d
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            if (r5 != 0) goto L_0x004b
            java.util.Map<o1.h, java.util.concurrent.atomic.AtomicInteger> r5 = r4.f22727k
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r5 = 0
            goto L_0x004c
        L_0x004b:
            r5 = 1
        L_0x004c:
            androidx.lifecycle.u r2 = r0.f22702h
            androidx.lifecycle.o$c r2 = r2.f2726b
            androidx.lifecycle.o$c r3 = androidx.lifecycle.o.c.CREATED
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L_0x0059
            r1 = 1
        L_0x0059:
            if (r1 == 0) goto L_0x0076
            if (r6 == 0) goto L_0x0068
            r0.a(r3)
            o1.i r1 = new o1.i
            r1.<init>((o1.h) r0)
            r7.c(r1)
        L_0x0068:
            if (r5 != 0) goto L_0x0073
            androidx.lifecycle.o$c r7 = androidx.lifecycle.o.c.DESTROYED
            r0.a(r7)
            r4.v(r0)
            goto L_0x0076
        L_0x0073:
            r0.a(r3)
        L_0x0076:
            if (r6 != 0) goto L_0x0092
            if (r5 != 0) goto L_0x0092
            o1.m r5 = r4.f22732p
            if (r5 == 0) goto L_0x0092
            java.lang.String r6 = r0.f22700f
            java.lang.String r7 = "backStackEntryId"
            ud.k.f(r6, r7)
            java.util.Map<java.lang.String, androidx.lifecycle.u0> r5 = r5.f22770d
            java.lang.Object r5 = r5.remove(r6)
            androidx.lifecycle.u0 r5 = (androidx.lifecycle.u0) r5
            if (r5 == 0) goto L_0x0092
            r5.a()
        L_0x0092:
            return
        L_0x0093:
            java.lang.String r6 = "Attempted to pop "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            o1.r r5 = r5.f22696b
            r6.append(r5)
            java.lang.String r5 = ", which is not the top of the back stack ("
            r6.append(r5)
            o1.r r5 = r0.f22696b
            r6.append(r5)
            r5 = 41
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.q(o1.h, boolean, ld.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0030 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<o1.h> s() {
        /*
            r10 = this;
            androidx.lifecycle.o$c r0 = androidx.lifecycle.o.c.STARTED
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r2 = r10.f22739w
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0011:
            boolean r3 = r2.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()
            o1.k$a r3 = (o1.k.a) r3
            ge.e<java.util.Set<o1.h>> r3 = r3.f22686f
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0030:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0059
            java.lang.Object r7 = r3.next()
            r8 = r7
            o1.h r8 = (o1.h) r8
            boolean r9 = r1.contains(r8)
            if (r9 != 0) goto L_0x0052
            androidx.lifecycle.o$c r8 = r8.f22707u
            int r8 = r8.compareTo(r0)
            if (r8 < 0) goto L_0x004d
            r8 = 1
            goto L_0x004e
        L_0x004d:
            r8 = 0
        L_0x004e:
            if (r8 != 0) goto L_0x0052
            r8 = 1
            goto L_0x0053
        L_0x0052:
            r8 = 0
        L_0x0053:
            if (r8 == 0) goto L_0x0030
            r6.add(r7)
            goto L_0x0030
        L_0x0059:
            ld.k.g(r1, r6)
            goto L_0x0011
        L_0x005d:
            ld.c<o1.h> r2 = r10.f22723g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0068:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0091
            java.lang.Object r6 = r2.next()
            r7 = r6
            o1.h r7 = (o1.h) r7
            boolean r8 = r1.contains(r7)
            if (r8 != 0) goto L_0x008a
            androidx.lifecycle.o$c r7 = r7.f22707u
            int r7 = r7.compareTo(r0)
            if (r7 < 0) goto L_0x0085
            r7 = 1
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            if (r7 == 0) goto L_0x0068
            r3.add(r6)
            goto L_0x0068
        L_0x0091:
            ld.k.g(r1, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x009d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r1.next()
            r3 = r2
            o1.h r3 = (o1.h) r3
            o1.r r3 = r3.f22696b
            boolean r3 = r3 instanceof o1.t
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x009d
            r0.add(r2)
            goto L_0x009d
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.s():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010a, code lost:
        r9 = (r9 = (o1.h) ld.l.n(r5)).f22696b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(int r15, android.os.Bundle r16, o1.x r17, o1.d0.a r18) {
        /*
            r14 = this;
            r6 = r14
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r6.f22728l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            boolean r0 = r0.containsKey(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000f
            return r1
        L_0x000f:
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r6.f22728l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r6.f22728l
            java.util.Collection r2 = r2.values()
            java.lang.String r3 = "<this>"
            ud.k.f(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = ud.k.a(r3, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 != r4) goto L_0x002a
            r2.remove()
            goto L_0x002a
        L_0x0049:
            java.util.Map<java.lang.String, ld.c<o1.i>> r2 = r6.f22729m
            boolean r3 = r2 instanceof vd.a
            r7 = 0
            if (r3 != 0) goto L_0x0177
            java.lang.Object r0 = r2.remove(r0)
            ld.c r0 = (ld.c) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            ld.c<o1.h> r2 = r6.f22723g
            java.lang.Object r2 = r2.s()
            o1.h r2 = (o1.h) r2
            if (r2 == 0) goto L_0x0069
            o1.r r2 = r2.f22696b
            if (r2 != 0) goto L_0x006d
        L_0x0069:
            o1.t r2 = r14.i()
        L_0x006d:
            if (r0 == 0) goto L_0x00c5
            java.util.Iterator r0 = r0.iterator()
        L_0x0073:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r3 = r0.next()
            o1.i r3 = (o1.i) r3
            int r5 = r3.f22712b
            o1.r r5 = r14.e(r2, r5)
            if (r5 == 0) goto L_0x0098
            android.content.Context r2 = r6.f22717a
            androidx.lifecycle.o$c r9 = r14.j()
            o1.m r10 = r6.f22732p
            o1.h r2 = r3.a(r2, r5, r9, r10)
            r8.add(r2)
            r2 = r5
            goto L_0x0073
        L_0x0098:
            o1.r r0 = o1.r.f22798r
            android.content.Context r0 = r6.f22717a
            int r1 = r3.f22712b
            java.lang.String r0 = o1.r.q(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Restore State failed: destination "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00c5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x00d3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ea
            java.lang.Object r5 = r3.next()
            r9 = r5
            o1.h r9 = (o1.h) r9
            o1.r r9 = r9.f22696b
            boolean r9 = r9 instanceof o1.t
            if (r9 != 0) goto L_0x00d3
            r2.add(r5)
            goto L_0x00d3
        L_0x00ea:
            java.util.Iterator r2 = r2.iterator()
        L_0x00ee:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0132
            java.lang.Object r3 = r2.next()
            o1.h r3 = (o1.h) r3
            java.lang.Object r5 = ld.l.o(r0)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0111
            java.lang.Object r9 = ld.l.n(r5)
            o1.h r9 = (o1.h) r9
            if (r9 == 0) goto L_0x0111
            o1.r r9 = r9.f22696b
            if (r9 == 0) goto L_0x0111
            java.lang.String r9 = r9.f22799a
            goto L_0x0112
        L_0x0111:
            r9 = r7
        L_0x0112:
            o1.r r10 = r3.f22696b
            java.lang.String r10 = r10.f22799a
            boolean r9 = ud.k.a(r9, r10)
            if (r9 == 0) goto L_0x0120
            r5.add(r3)
            goto L_0x00ee
        L_0x0120:
            o1.h[] r5 = new o1.h[r4]
            r5[r1] = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            ld.b r9 = new ld.b
            r9.<init>(r5, r4)
            r3.<init>(r9)
            r0.add(r3)
            goto L_0x00ee
        L_0x0132:
            ud.s r9 = new ud.s
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x013b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r10.next()
            r11 = r0
            java.util.List r11 = (java.util.List) r11
            o1.e0 r0 = r6.f22738v
            java.lang.Object r1 = ld.l.k(r11)
            o1.h r1 = (o1.h) r1
            o1.r r1 = r1.f22696b
            java.lang.String r1 = r1.f22799a
            o1.d0 r12 = r0.c(r1)
            ud.t r3 = new ud.t
            r3.<init>()
            o1.k$l r13 = new o1.k$l
            r0 = r13
            r1 = r9
            r2 = r8
            r4 = r14
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f22740x = r13
            r0 = r17
            r1 = r18
            r12.d(r11, r0, r1)
            r6.f22740x = r7
            goto L_0x013b
        L_0x0174:
            boolean r0 = r9.f26195a
            return r0
        L_0x0177:
            java.lang.String r0 = "kotlin.collections.MutableMap"
            ud.x.c(r2, r0)
            goto L_0x017e
        L_0x017d:
            throw r7
        L_0x017e:
            goto L_0x017d
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.t(int, android.os.Bundle, o1.x, o1.d0$a):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a2, code lost:
        if (r0 == false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cd, code lost:
        if ((r2.length == 0) != false) goto L_0x01cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(o1.t r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            o1.t r0 = r6.f22719c
            boolean r0 = ud.k.a(r0, r7)
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x03b9
            o1.t r0 = r6.f22719c
            r10 = 0
            if (r0 == 0) goto L_0x007e
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r6.f22728l
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0073
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r3 = "id"
            ud.k.e(r2, r3)
            int r2 = r2.intValue()
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r3 = r6.f22739w
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x0041:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r3.next()
            o1.k$a r4 = (o1.k.a) r4
            r4.f22684d = r8
            goto L_0x0041
        L_0x0050:
            boolean r3 = r6.t(r2, r10, r10, r10)
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r4 = r6.f22739w
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x005e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x006d
            java.lang.Object r5 = r4.next()
            o1.k$a r5 = (o1.k.a) r5
            r5.f22684d = r9
            goto L_0x005e
        L_0x006d:
            if (r3 == 0) goto L_0x0022
            r6.o(r2, r8, r9)
            goto L_0x0022
        L_0x0073:
            int r1 = r0.f22806h
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r23
            p(r0, r1, r2, r3, r4, r5)
        L_0x007e:
            r6.f22719c = r7
            android.os.Bundle r0 = r6.f22720d
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)
            if (r1 == 0) goto L_0x00b1
            java.util.Iterator r1 = r1.iterator()
        L_0x0090:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            o1.e0 r3 = r6.f22738v
            java.lang.String r4 = "name"
            ud.k.e(r2, r4)
            o1.d0 r3 = r3.c(r2)
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 == 0) goto L_0x0090
            r3.g(r2)
            goto L_0x0090
        L_0x00b1:
            android.os.Parcelable[] r0 = r6.f22721e
            java.lang.String r7 = " cannot be found from the current destination "
            if (r0 == 0) goto L_0x012d
            int r1 = r0.length
            r2 = 0
        L_0x00b9:
            if (r2 >= r1) goto L_0x0128
            r3 = r0[r2]
            o1.i r3 = (o1.i) r3
            int r4 = r3.f22712b
            o1.r r4 = r6.d(r4)
            if (r4 == 0) goto L_0x0107
            android.content.Context r5 = r6.f22717a
            androidx.lifecycle.o$c r11 = r23.j()
            o1.m r12 = r6.f22732p
            o1.h r3 = r3.a(r5, r4, r11, r12)
            o1.e0 r5 = r6.f22738v
            java.lang.String r4 = r4.f22799a
            o1.d0 r4 = r5.c(r4)
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r5 = r6.f22739w
            java.lang.Object r11 = r5.get(r4)
            if (r11 != 0) goto L_0x00eb
            o1.k$a r11 = new o1.k$a
            r11.<init>(r6, r4)
            r5.put(r4, r11)
        L_0x00eb:
            o1.k$a r11 = (o1.k.a) r11
            ld.c<o1.h> r4 = r6.f22723g
            r4.f(r3)
            r11.e(r3)
            o1.r r4 = r3.f22696b
            o1.t r4 = r4.f22800b
            if (r4 == 0) goto L_0x0104
            int r4 = r4.f22806h
            o1.h r4 = r6.f(r4)
            r6.k(r3, r4)
        L_0x0104:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x0107:
            o1.r r0 = o1.r.f22798r
            android.content.Context r0 = r6.f22717a
            int r1 = r3.f22712b
            java.lang.String r0 = o1.r.q(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Restoring the Navigation back stack failed: destination "
            java.lang.StringBuilder r0 = androidx.activity.result.d.a(r2, r0, r7)
            o1.r r2 = r23.g()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0128:
            r23.x()
            r6.f22721e = r10
        L_0x012d:
            o1.e0 r0 = r6.f22738v
            java.util.Map<java.lang.String, o1.d0<? extends o1.r>> r0 = r0.f22678a
            java.util.Map r0 = ld.t.e(r0)
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0142:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0157
            java.lang.Object r2 = r0.next()
            r3 = r2
            o1.d0 r3 = (o1.d0) r3
            boolean r3 = r3.f22668b
            if (r3 != 0) goto L_0x0142
            r1.add(r2)
            goto L_0x0142
        L_0x0157:
            java.util.Iterator r0 = r1.iterator()
        L_0x015b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x017d
            java.lang.Object r1 = r0.next()
            o1.d0 r1 = (o1.d0) r1
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r2 = r6.f22739w
            java.lang.Object r3 = r2.get(r1)
            if (r3 != 0) goto L_0x0177
            o1.k$a r3 = new o1.k$a
            r3.<init>(r6, r1)
            r2.put(r1, r3)
        L_0x0177:
            o1.k$a r3 = (o1.k.a) r3
            r1.e(r3)
            goto L_0x015b
        L_0x017d:
            o1.t r0 = r6.f22719c
            if (r0 == 0) goto L_0x03b4
            ld.c<o1.h> r0 = r6.f22723g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03b4
            boolean r0 = r6.f22722f
            if (r0 != 0) goto L_0x03a5
            android.app.Activity r0 = r6.f22718b
            if (r0 == 0) goto L_0x03a5
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L_0x0199
            goto L_0x03a1
        L_0x0199:
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x01a6
            java.lang.String r2 = "android-support-nav:controller:deepLinkIds"
            int[] r2 = r1.getIntArray(r2)
            goto L_0x01a7
        L_0x01a6:
            r2 = r10
        L_0x01a7:
            if (r1 == 0) goto L_0x01b0
            java.lang.String r3 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            goto L_0x01b1
        L_0x01b0:
            r3 = r10
        L_0x01b1:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r1 == 0) goto L_0x01bf
            java.lang.String r5 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r1 = r1.getBundle(r5)
            goto L_0x01c0
        L_0x01bf:
            r1 = r10
        L_0x01c0:
            if (r1 == 0) goto L_0x01c5
            r4.putAll(r1)
        L_0x01c5:
            if (r2 == 0) goto L_0x01cf
            int r1 = r2.length
            if (r1 != 0) goto L_0x01cc
            r1 = 1
            goto L_0x01cd
        L_0x01cc:
            r1 = 0
        L_0x01cd:
            if (r1 == 0) goto L_0x01f3
        L_0x01cf:
            o1.t r1 = r6.f22719c
            ud.k.c(r1)
            o1.p r5 = new o1.p
            r5.<init>((android.content.Intent) r0)
            o1.r$b r1 = r1.x(r5)
            if (r1 == 0) goto L_0x01f3
            o1.r r2 = r1.f22809a
            int[] r3 = r2.h(r10)
            android.os.Bundle r1 = r1.f22810b
            android.os.Bundle r1 = r2.f(r1)
            if (r1 == 0) goto L_0x01f0
            r4.putAll(r1)
        L_0x01f0:
            r11 = r3
            r3 = r10
            goto L_0x01f4
        L_0x01f3:
            r11 = r2
        L_0x01f4:
            if (r11 == 0) goto L_0x03a1
            int r1 = r11.length
            if (r1 != 0) goto L_0x01fb
            r1 = 1
            goto L_0x01fc
        L_0x01fb:
            r1 = 0
        L_0x01fc:
            if (r1 == 0) goto L_0x0200
            goto L_0x03a1
        L_0x0200:
            o1.t r1 = r6.f22719c
            int r2 = r11.length
            r5 = 0
        L_0x0204:
            if (r5 >= r2) goto L_0x0250
            r12 = r11[r5]
            if (r5 != 0) goto L_0x0218
            o1.t r13 = r6.f22719c
            ud.k.c(r13)
            int r13 = r13.f22806h
            if (r13 != r12) goto L_0x0216
            o1.t r13 = r6.f22719c
            goto L_0x021f
        L_0x0216:
            r13 = r10
            goto L_0x021f
        L_0x0218:
            ud.k.c(r1)
            o1.r r13 = r1.B(r12)
        L_0x021f:
            if (r13 != 0) goto L_0x022a
            o1.r r1 = o1.r.f22798r
            android.content.Context r1 = r6.f22717a
            java.lang.String r1 = o1.r.q(r1, r12)
            goto L_0x0251
        L_0x022a:
            int r12 = r11.length
            int r12 = r12 + -1
            if (r5 == r12) goto L_0x024d
            boolean r12 = r13 instanceof o1.t
            if (r12 == 0) goto L_0x024d
            o1.t r13 = (o1.t) r13
        L_0x0235:
            ud.k.c(r13)
            int r1 = r13.f22815t
            o1.r r1 = r13.B(r1)
            boolean r1 = r1 instanceof o1.t
            if (r1 == 0) goto L_0x024c
            int r1 = r13.f22815t
            o1.r r1 = r13.B(r1)
            r13 = r1
            o1.t r13 = (o1.t) r13
            goto L_0x0235
        L_0x024c:
            r1 = r13
        L_0x024d:
            int r5 = r5 + 1
            goto L_0x0204
        L_0x0250:
            r1 = r10
        L_0x0251:
            if (r1 == 0) goto L_0x0273
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find destination "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " in the navigation graph, ignoring the deep link from "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "NavController"
            android.util.Log.i(r1, r0)
            goto L_0x03a1
        L_0x0273:
            java.lang.String r1 = "android-support-nav:controller:deepLinkIntent"
            r4.putParcelable(r1, r0)
            int r1 = r11.length
            android.os.Bundle[] r12 = new android.os.Bundle[r1]
            r2 = 0
        L_0x027c:
            if (r2 >= r1) goto L_0x0298
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putAll(r4)
            if (r3 == 0) goto L_0x0293
            java.lang.Object r13 = r3.get(r2)
            android.os.Bundle r13 = (android.os.Bundle) r13
            if (r13 == 0) goto L_0x0293
            r5.putAll(r13)
        L_0x0293:
            r12[r2] = r5
            int r2 = r2 + 1
            goto L_0x027c
        L_0x0298:
            int r1 = r0.getFlags()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x02c3
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r3
            if (r1 != 0) goto L_0x02c3
            r0.addFlags(r3)
            android.content.Context r1 = r6.f22717a
            c0.t r2 = new c0.t
            r2.<init>(r1)
            r2.c(r0)
            r2.h()
            android.app.Activity r0 = r6.f22718b
            if (r0 == 0) goto L_0x039f
            r0.finish()
            r0.overridePendingTransition(r9, r9)
            goto L_0x039f
        L_0x02c3:
            java.lang.String r9 = "Deep Linking failed: destination "
            if (r2 == 0) goto L_0x031a
            ld.c<o1.h> r0 = r6.f22723g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02df
            o1.t r0 = r6.f22719c
            ud.k.c(r0)
            int r1 = r0.f22806h
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r23
            p(r0, r1, r2, r3, r4, r5)
        L_0x02df:
            r0 = 0
        L_0x02e0:
            int r1 = r11.length
            if (r0 >= r1) goto L_0x039f
            r1 = r11[r0]
            int r2 = r0 + 1
            r0 = r12[r0]
            o1.r r3 = r6.d(r1)
            if (r3 == 0) goto L_0x02fd
            o1.l r1 = new o1.l
            r1.<init>(r3, r6)
            o1.x r1 = e.a.f(r1)
            r6.m(r3, r0, r1, r10)
            r0 = r2
            goto L_0x02e0
        L_0x02fd:
            o1.r r0 = o1.r.f22798r
            android.content.Context r0 = r6.f22717a
            java.lang.String r0 = o1.r.q(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = androidx.activity.result.d.a(r9, r0, r7)
            o1.r r2 = r23.g()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x031a:
            o1.t r0 = r6.f22719c
            int r1 = r11.length
            r2 = 0
        L_0x031e:
            if (r2 >= r1) goto L_0x039d
            r3 = r11[r2]
            r4 = r12[r2]
            if (r2 != 0) goto L_0x0329
            o1.t r5 = r6.f22719c
            goto L_0x0330
        L_0x0329:
            ud.k.c(r0)
            o1.r r5 = r0.B(r3)
        L_0x0330:
            if (r5 == 0) goto L_0x0378
            int r3 = r11.length
            int r3 = r3 - r8
            if (r2 == r3) goto L_0x0355
            boolean r3 = r5 instanceof o1.t
            if (r3 == 0) goto L_0x0375
            o1.t r5 = (o1.t) r5
        L_0x033c:
            ud.k.c(r5)
            int r0 = r5.f22815t
            o1.r r0 = r5.B(r0)
            boolean r0 = r0 instanceof o1.t
            if (r0 == 0) goto L_0x0353
            int r0 = r5.f22815t
            o1.r r0 = r5.B(r0)
            r5 = r0
            o1.t r5 = (o1.t) r5
            goto L_0x033c
        L_0x0353:
            r0 = r5
            goto L_0x0375
        L_0x0355:
            r15 = 0
            r14 = 0
            r22 = -1
            o1.t r3 = r6.f22719c
            ud.k.c(r3)
            int r3 = r3.f22806h
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            o1.x r7 = new o1.x
            r13 = r7
            r16 = r3
            r21 = r22
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6.m(r5, r4, r7, r10)
        L_0x0375:
            int r2 = r2 + 1
            goto L_0x031e
        L_0x0378:
            o1.r r1 = o1.r.f22798r
            android.content.Context r1 = r6.f22717a
            java.lang.String r1 = o1.r.q(r1, r3)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            r3.append(r1)
            java.lang.String r1 = " cannot be found in graph "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x039d:
            r6.f22722f = r8
        L_0x039f:
            r0 = 1
            goto L_0x03a2
        L_0x03a1:
            r0 = 0
        L_0x03a2:
            if (r0 == 0) goto L_0x03a5
            goto L_0x03a6
        L_0x03a5:
            r8 = 0
        L_0x03a6:
            if (r8 != 0) goto L_0x0431
            o1.t r0 = r6.f22719c
            ud.k.c(r0)
            r1 = r25
            r6.m(r0, r1, r10, r10)
            goto L_0x0431
        L_0x03b4:
            r23.c()
            goto L_0x0431
        L_0x03b9:
            s.j<o1.r> r0 = r7.f22814s
            int r0 = r0.k()
            r1 = 0
        L_0x03c0:
            if (r1 >= r0) goto L_0x0431
            s.j<o1.r> r2 = r7.f22814s
            java.lang.Object r2 = r2.l(r1)
            o1.r r2 = (o1.r) r2
            o1.t r3 = r6.f22719c
            ud.k.c(r3)
            s.j<o1.r> r3 = r3.f22814s
            boolean r4 = r3.f24853a
            if (r4 == 0) goto L_0x03d8
            r3.c()
        L_0x03d8:
            int[] r4 = r3.f24854b
            int r5 = r3.f24856d
            int r4 = s.e.a(r4, r5, r1)
            if (r4 < 0) goto L_0x03e8
            java.lang.Object[] r3 = r3.f24855c
            r5 = r3[r4]
            r3[r4] = r2
        L_0x03e8:
            ld.c<o1.h> r3 = r6.f22723g
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x03f3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0413
            java.lang.Object r5 = r3.next()
            r8 = r5
            o1.h r8 = (o1.h) r8
            if (r2 == 0) goto L_0x040c
            o1.r r8 = r8.f22696b
            int r8 = r8.f22806h
            int r9 = r2.f22806h
            if (r8 != r9) goto L_0x040c
            r8 = 1
            goto L_0x040d
        L_0x040c:
            r8 = 0
        L_0x040d:
            if (r8 == 0) goto L_0x03f3
            r4.add(r5)
            goto L_0x03f3
        L_0x0413:
            java.util.Iterator r3 = r4.iterator()
        L_0x0417:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x042e
            java.lang.Object r4 = r3.next()
            o1.h r4 = (o1.h) r4
            java.lang.String r5 = "newDestination"
            ud.k.e(r2, r5)
            r4.getClass()
            r4.f22696b = r2
            goto L_0x0417
        L_0x042e:
            int r1 = r1 + 1
            goto L_0x03c0
        L_0x0431:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.u(o1.t, android.os.Bundle):void");
    }

    public final h v(h hVar) {
        m mVar;
        ud.k.f(hVar, "child");
        h remove = this.f22726j.remove(hVar);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f22727k.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            a aVar = this.f22739w.get(this.f22738v.c(remove.f22696b.f22799a));
            if (aVar != null) {
                ud.k.f(remove, "entry");
                boolean a10 = ud.k.a(aVar.f22744h.f22742z.get(remove), Boolean.TRUE);
                ud.k.f(remove, "entry");
                ge.b<Set<h>> bVar = aVar.f22683c;
                Set value = bVar.getValue();
                ud.k.f(value, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(ld.s.a(value.size()));
                Iterator it = value.iterator();
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    boolean z12 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!z11 && ud.k.a(next, remove)) {
                        z11 = true;
                        z12 = false;
                    }
                    if (z12) {
                        linkedHashSet.add(next);
                    }
                }
                bVar.setValue(linkedHashSet);
                aVar.f22744h.f22742z.remove(remove);
                if (!aVar.f22744h.f22723g.contains(remove)) {
                    aVar.f22744h.v(remove);
                    if (remove.f22702h.f2726b.compareTo(o.c.CREATED) >= 0) {
                        remove.a(o.c.DESTROYED);
                    }
                    ld.c<h> cVar = aVar.f22744h.f22723g;
                    if (!(cVar instanceof Collection) || !cVar.isEmpty()) {
                        Iterator<h> it2 = cVar.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (ud.k.a(it2.next().f22700f, remove.f22700f)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10 && !a10 && (mVar = aVar.f22744h.f22732p) != null) {
                        String str = remove.f22700f;
                        ud.k.f(str, "backStackEntryId");
                        u0 remove2 = mVar.f22770d.remove(str);
                        if (remove2 != null) {
                            remove2.a();
                        }
                    }
                    aVar.f22744h.w();
                    k kVar = aVar.f22744h;
                    kVar.f22724h.a(kVar.s());
                } else if (!aVar.f22684d) {
                    aVar.f22744h.w();
                    k kVar2 = aVar.f22744h;
                    kVar2.f22724h.a(kVar2.s());
                }
            }
            this.f22727k.remove(remove);
        }
        return remove;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r9 = (r9 = r9.f22686f).getValue();
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r13 = this;
            androidx.lifecycle.o$c r0 = androidx.lifecycle.o.c.RESUMED
            androidx.lifecycle.o$c r1 = androidx.lifecycle.o.c.STARTED
            ld.c<o1.h> r2 = r13.f22723g
            java.util.List r2 = ld.l.y(r2)
            r3 = r2
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.Object r4 = ld.l.n(r2)
            o1.h r4 = (o1.h) r4
            o1.r r4 = r4.f22696b
            boolean r5 = r4 instanceof o1.b
            r6 = 0
            if (r5 == 0) goto L_0x0040
            java.util.List r5 = ld.l.s(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0029:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r5.next()
            o1.h r7 = (o1.h) r7
            o1.r r7 = r7.f22696b
            boolean r8 = r7 instanceof o1.t
            if (r8 != 0) goto L_0x0029
            boolean r8 = r7 instanceof o1.b
            if (r8 != 0) goto L_0x0029
            goto L_0x0041
        L_0x0040:
            r7 = r6
        L_0x0041:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.List r2 = ld.l.s(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x004e:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00d3
            java.lang.Object r8 = r2.next()
            o1.h r8 = (o1.h) r8
            androidx.lifecycle.o$c r9 = r8.f22707u
            o1.r r10 = r8.f22696b
            if (r4 == 0) goto L_0x00b6
            int r11 = r10.f22806h
            int r12 = r4.f22806h
            if (r11 != r12) goto L_0x00b6
            if (r9 == r0) goto L_0x00b3
            o1.e0 r9 = r13.f22738v
            java.lang.String r10 = r10.f22799a
            o1.d0 r9 = r9.c(r10)
            java.util.Map<o1.d0<? extends o1.r>, o1.k$a> r10 = r13.f22739w
            java.lang.Object r9 = r10.get(r9)
            o1.k$a r9 = (o1.k.a) r9
            if (r9 == 0) goto L_0x008f
            ge.e<java.util.Set<o1.h>> r9 = r9.f22686f
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r9.getValue()
            java.util.Set r9 = (java.util.Set) r9
            if (r9 == 0) goto L_0x008f
            boolean r9 = r9.contains(r8)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            goto L_0x0090
        L_0x008f:
            r9 = r6
        L_0x0090:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = ud.k.a(r9, r10)
            if (r9 != 0) goto L_0x00b0
            java.util.Map<o1.h, java.util.concurrent.atomic.AtomicInteger> r9 = r13.f22727k
            java.lang.Object r9 = r9.get(r8)
            java.util.concurrent.atomic.AtomicInteger r9 = (java.util.concurrent.atomic.AtomicInteger) r9
            r10 = 0
            if (r9 == 0) goto L_0x00aa
            int r9 = r9.get()
            if (r9 != 0) goto L_0x00aa
            r10 = 1
        L_0x00aa:
            if (r10 != 0) goto L_0x00b0
            r5.put(r8, r0)
            goto L_0x00b3
        L_0x00b0:
            r5.put(r8, r1)
        L_0x00b3:
            o1.t r4 = r4.f22800b
            goto L_0x004e
        L_0x00b6:
            if (r7 == 0) goto L_0x00cc
            int r10 = r10.f22806h
            int r11 = r7.f22806h
            if (r10 != r11) goto L_0x00cc
            if (r9 != r0) goto L_0x00c4
            r8.a(r1)
            goto L_0x00c9
        L_0x00c4:
            if (r9 == r1) goto L_0x00c9
            r5.put(r8, r1)
        L_0x00c9:
            o1.t r7 = r7.f22800b
            goto L_0x004e
        L_0x00cc:
            androidx.lifecycle.o$c r9 = androidx.lifecycle.o.c.CREATED
            r8.a(r9)
            goto L_0x004e
        L_0x00d3:
            java.util.Iterator r0 = r3.iterator()
        L_0x00d7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f3
            java.lang.Object r1 = r0.next()
            o1.h r1 = (o1.h) r1
            java.lang.Object r2 = r5.get(r1)
            androidx.lifecycle.o$c r2 = (androidx.lifecycle.o.c) r2
            if (r2 == 0) goto L_0x00ef
            r1.a(r2)
            goto L_0x00d7
        L_0x00ef:
            r1.b()
            goto L_0x00d7
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.k.w():void");
    }

    public final void x() {
        androidx.activity.h hVar = this.f22736t;
        boolean z10 = true;
        if (!this.f22737u || h() <= 1) {
            z10 = false;
        }
        hVar.f371a = z10;
    }
}
