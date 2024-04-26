package e8;

import a7.d;
import a7.g;
import a7.m;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.i3;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.z;
import g7.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class t5 extends i3 {

    /* renamed from: a  reason: collision with root package name */
    public final n f16706a;

    public t5(n nVar) {
        this.f16706a = nVar;
    }

    public final void A(a aVar) {
        n nVar = this.f16706a;
        View view = (View) b.z0(aVar);
        nVar.getClass();
    }

    public final a E() {
        this.f16706a.getClass();
        return null;
    }

    public final boolean G() {
        return this.f16706a.f18591m;
    }

    public final void H(a aVar) {
        n nVar = this.f16706a;
        View view = (View) b.z0(aVar);
        nVar.getClass();
    }

    public final boolean I() {
        return this.f16706a.f18592n;
    }

    public final Bundle K() {
        return this.f16706a.f18590l;
    }

    public final float K3() {
        this.f16706a.getClass();
        return 0.0f;
    }

    public final a L() {
        this.f16706a.getClass();
        return null;
    }

    public final float V1() {
        this.f16706a.getClass();
        return 0.0f;
    }

    public final String b() {
        return this.f16706a.f18579a;
    }

    public final String c() {
        return this.f16706a.f18581c;
    }

    public final float d3() {
        this.f16706a.getClass();
        return 0.0f;
    }

    public final String getCallToAction() {
        return this.f16706a.f18583e;
    }

    public final hz getVideoController() {
        f fVar = this.f16706a.f18588j;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public final u h() {
        return null;
    }

    public final List i() {
        List<d.b> list = this.f16706a.f18580b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (d.b next : list) {
                arrayList.add(new t(next.a(), next.d(), next.c(), next.e(), next.b()));
            }
        }
        return arrayList;
    }

    public final double k() {
        Double d10 = this.f16706a.f18585g;
        if (d10 != null) {
            return d10.doubleValue();
        }
        return -1.0d;
    }

    public final a p() {
        Object obj = this.f16706a.f18589k;
        if (obj == null) {
            return null;
        }
        return new b(obj);
    }

    public final String r() {
        return this.f16706a.f18587i;
    }

    public final String t() {
        return this.f16706a.f18584f;
    }

    public final String u() {
        return this.f16706a.f18586h;
    }

    public final z w() {
        d.b bVar = this.f16706a.f18582d;
        if (bVar != null) {
            return new t(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b());
        }
        return null;
    }

    public final void x() {
        this.f16706a.getClass();
    }

    public final void z(a aVar, a aVar2, a aVar3) {
        a aVar4;
        HashMap hashMap = (HashMap) b.z0(aVar2);
        HashMap hashMap2 = (HashMap) b.z0(aVar3);
        n nVar = this.f16706a;
        View view = (View) b.z0(aVar);
        AbstractAdViewAdapter.d dVar = (AbstractAdViewAdapter.d) nVar;
        dVar.getClass();
        if (view instanceof m) {
            ((m) view).setNativeAd(dVar.f4999o);
            return;
        }
        g gVar = g.f144a.get(view);
        if (gVar != null) {
            d2 d2Var = (d2) dVar.f4999o;
            d2Var.getClass();
            try {
                aVar4 = d2Var.f14203a.y();
            } catch (RemoteException e10) {
                e.C("", e10);
                aVar4 = null;
            }
            gVar.b(aVar4);
        }
    }
}
