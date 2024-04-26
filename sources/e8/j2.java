package e8;

import a7.i;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.internal.ads.i0;
import com.google.android.gms.internal.ads.r0;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class j2 extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public final i.a f15089a;

    public j2(i.a aVar) {
        this.f15089a = aVar;
    }

    public final void K2(i0 i0Var) {
        i.a aVar = this.f15089a;
        y1 y1Var = new y1(i0Var);
        AbstractAdViewAdapter.e eVar = (AbstractAdViewAdapter.e) aVar;
        ((g) eVar.f5001b).r(eVar.f5000a, new AbstractAdViewAdapter.a(y1Var));
    }
}
