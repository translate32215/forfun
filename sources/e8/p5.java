package e8;

import a7.d;
import android.os.Bundle;
import android.view.View;
import c8.a;
import c8.b;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.c3;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.z;
import g7.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class p5 extends c3 {

    /* renamed from: a  reason: collision with root package name */
    public final i f15871a;

    public p5(i iVar) {
        this.f15871a = iVar;
    }

    public final void A(a aVar) {
        i iVar = this.f15871a;
        View view = (View) b.z0(aVar);
        iVar.getClass();
    }

    public final a E() {
        this.f15871a.getClass();
        return null;
    }

    public final boolean G() {
        return this.f15871a.f18561a;
    }

    public final void H(a aVar) {
        i iVar = this.f15871a;
        View view = (View) b.z0(aVar);
        iVar.getClass();
    }

    public final boolean I() {
        return this.f15871a.f18562b;
    }

    public final Bundle K() {
        return this.f15871a.f18563c;
    }

    public final a L() {
        this.f15871a.getClass();
        return null;
    }

    public final String b() {
        return this.f15871a.f18565e;
    }

    public final String c() {
        return this.f15871a.f18567g;
    }

    public final String getCallToAction() {
        return this.f15871a.f18569i;
    }

    public final hz getVideoController() {
        f fVar = this.f15871a.f18564d;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public final u h() {
        return null;
    }

    public final List i() {
        List<d.b> list = this.f15871a.f18566f;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (d.b next : list) {
            arrayList.add(new t(next.a(), next.d(), next.c(), next.e(), next.b()));
        }
        return arrayList;
    }

    public final double k() {
        return this.f15871a.f18570j;
    }

    public final a p() {
        return null;
    }

    public final String r() {
        return this.f15871a.f18572l;
    }

    public final void t0(a aVar) {
        this.f15871a.a((View) b.z0(aVar));
    }

    public final String u() {
        return this.f15871a.f18571k;
    }

    public final z w() {
        d.b bVar = this.f15871a.f18568h;
        if (bVar != null) {
            return new t(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b());
        }
        return null;
    }

    public final void x() {
        this.f15871a.getClass();
    }

    public final void z(a aVar, a aVar2, a aVar3) {
        HashMap hashMap = (HashMap) b.z0(aVar2);
        HashMap hashMap2 = (HashMap) b.z0(aVar3);
        i iVar = this.f15871a;
        View view = (View) b.z0(aVar);
        iVar.getClass();
    }
}
