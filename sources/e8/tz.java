package e8;

import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.uh;
import com.google.android.gms.internal.ads.yh;
import e8.ah;
import e8.fi;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tz<R extends fi<AdT>, AdT extends ah> implements yz<R, s10<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    public R f16825a;

    /* JADX WARNING: type inference failed for: r3v4, types: [e8.p50, com.google.android.gms.internal.ads.gh, e8.l50] */
    public final p50<s10<AdT>> a(je jeVar, a00<R> a00) {
        p50 p50;
        ei<R> C = a00.C(jeVar.f7150b);
        C.a(new c00());
        R r10 = (fi) C.b();
        this.f16825a = r10;
        mh a10 = r10.a();
        s10 s10 = new s10();
        l5 l5Var = jeVar.f7149a;
        if (l5Var != null) {
            a10.getClass();
            p50 = a10.a(yh.h(l5Var));
        } else {
            p50 = a10.a(a10.f15520i.b());
        }
        l50 v10 = l50.v(p50);
        ih ihVar = new ih(this, s10, a10);
        uh uhVar = uh.f8247a;
        ? u10 = v10.u(ihVar, uhVar);
        mh mhVar = new mh(u10, new bp(s10));
        u10.a(mhVar, uhVar);
        return mhVar;
    }

    public final /* synthetic */ Object b() {
        return this.f16825a;
    }
}
