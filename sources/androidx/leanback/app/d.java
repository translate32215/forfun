package androidx.leanback.app;

import android.os.Bundle;
import android.view.View;
import androidx.leanback.app.h;
import h1.a;

/* compiled from: BaseSupportFragment */
public class d extends g {
    public final a.c A0 = new a.c("ENTRANCE_COMPLETE", true, false);
    public final a.b B0 = new a.b("onCreate");
    public final a.b C0 = new a.b("onCreateView");
    public final a.b D0 = new a.b("prepareEntranceTransition");
    public final a.b E0 = new a.b("startEntranceTransition");
    public final a.b F0 = new a.b("onEntranceTransitionEnd");
    public final a.C0154a G0 = new e(this, "EntranceTransitionNotSupport");
    public final h1.a H0 = new h1.a();
    public Object I0;
    public final n J0 = new n();

    /* renamed from: u0  reason: collision with root package name */
    public final a.c f1934u0 = new a.c("START", true, false);

    /* renamed from: v0  reason: collision with root package name */
    public final a.c f1935v0 = new a.c("ENTRANCE_INIT", false, true);

    /* renamed from: w0  reason: collision with root package name */
    public final a.c f1936w0 = new a("ENTRANCE_ON_PREPARED", true, false);

    /* renamed from: x0  reason: collision with root package name */
    public final a.c f1937x0 = new b("ENTRANCE_ON_PREPARED_ON_CREATEVIEW");

    /* renamed from: y0  reason: collision with root package name */
    public final a.c f1938y0 = new c("STATE_ENTRANCE_PERFORM");

    /* renamed from: z0  reason: collision with root package name */
    public final a.c f1939z0 = new C0024d("ENTRANCE_ON_ENDED");

    /* compiled from: BaseSupportFragment */
    public class a extends a.c {
        public a(String str, boolean z10, boolean z11) {
            super(str, z10, z11);
        }

        public void c() {
            n nVar = d.this.J0;
            if (nVar.f2039d) {
                nVar.f2040e = true;
                nVar.f2038c.postDelayed(nVar.f2041f, 1000);
            }
        }
    }

    /* compiled from: BaseSupportFragment */
    public class b extends a.c {
        public b(String str) {
            super(str, false, true);
        }

        public void c() {
            h hVar = (h) d.this;
            hVar.R0.v0();
            hVar.P0.f(false);
            hVar.P0.c();
        }
    }

    /* compiled from: BaseSupportFragment */
    public class c extends a.c {
        public c(String str) {
            super(str, false, true);
        }

        public void c() {
            n nVar = d.this.J0;
            nVar.f2040e = false;
            View view = nVar.f2037b;
            if (view != null) {
                nVar.f2036a.removeView(view);
                nVar.f2037b = null;
            }
            nVar.f2038c.removeCallbacks(nVar.f2041f);
            d dVar = d.this;
            View view2 = dVar.Q;
            if (view2 != null) {
                view2.getViewTreeObserver().addOnPreDrawListener(new e(dVar, view2));
                view2.invalidate();
            }
        }
    }

    /* renamed from: androidx.leanback.app.d$d  reason: collision with other inner class name */
    /* compiled from: BaseSupportFragment */
    public class C0024d extends a.c {
        public C0024d(String str) {
            super(str, false, true);
        }

        public void c() {
            h hVar = (h) d.this;
            h.p pVar = hVar.P0;
            if (pVar != null) {
                pVar.b();
            }
            l lVar = hVar.R0;
            if (lVar != null) {
                lVar.u0();
            }
        }
    }

    /* compiled from: BaseSupportFragment */
    public class e extends a.C0154a {
        public e(d dVar, String str) {
            super(str);
        }
    }

    public void O(Bundle bundle) {
        h hVar = (h) this;
        hVar.H0.a(hVar.f1934u0);
        hVar.H0.a(hVar.f1935v0);
        hVar.H0.a(hVar.f1936w0);
        hVar.H0.a(hVar.f1937x0);
        hVar.H0.a(hVar.f1938y0);
        hVar.H0.a(hVar.f1939z0);
        hVar.H0.a(hVar.A0);
        hVar.H0.a(hVar.K0);
        hVar.H0.b(hVar.f1934u0, hVar.f1935v0, hVar.B0);
        h1.a aVar = hVar.H0;
        a.c cVar = hVar.f1935v0;
        a.c cVar2 = hVar.A0;
        a.C0154a aVar2 = hVar.G0;
        aVar.getClass();
        a.d dVar = new a.d(cVar, cVar2, aVar2);
        cVar2.a(dVar);
        cVar.b(dVar);
        hVar.H0.b(hVar.f1935v0, hVar.A0, hVar.C0);
        hVar.H0.b(hVar.f1935v0, hVar.f1936w0, hVar.D0);
        hVar.H0.b(hVar.f1936w0, hVar.f1937x0, hVar.C0);
        hVar.H0.b(hVar.f1936w0, hVar.f1938y0, hVar.E0);
        h1.a aVar3 = hVar.H0;
        a.c cVar3 = hVar.f1937x0;
        a.c cVar4 = hVar.f1938y0;
        aVar3.getClass();
        a.d dVar2 = new a.d(cVar3, cVar4);
        cVar4.a(dVar2);
        cVar3.b(dVar2);
        hVar.H0.b(hVar.f1938y0, hVar.f1939z0, hVar.F0);
        h1.a aVar4 = hVar.H0;
        a.c cVar5 = hVar.f1939z0;
        a.c cVar6 = hVar.A0;
        aVar4.getClass();
        a.d dVar3 = new a.d(cVar5, cVar6);
        cVar6.a(dVar3);
        cVar5.b(dVar3);
        hVar.H0.b(hVar.f1936w0, hVar.K0, hVar.L0);
        hVar.H0.b(hVar.f1936w0, hVar.f1937x0, hVar.M0);
        hVar.H0.b(hVar.f1936w0, hVar.f1938y0, hVar.N0);
        h1.a aVar5 = this.H0;
        aVar5.f18784c.addAll(aVar5.f18782a);
        aVar5.d();
        super.O(bundle);
        this.H0.c(this.B0);
    }

    public void d0(View view, Bundle bundle) {
        super.d0(view, bundle);
        this.H0.c(this.C0);
    }
}
