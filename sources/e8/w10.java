package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.df;
import com.google.android.gms.internal.ads.ye;
import com.google.android.gms.internal.ads.ze;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w10 {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<cf, v10<? extends ah>> f17203a = new HashMap<>();

    public final <AdT extends ah> v10<AdT> a(cf cfVar, Context context, i10 i10, gz gzVar) {
        ze zeVar;
        v10<AdT> v10 = this.f17203a.get(cfVar);
        if (v10 != null) {
            return v10;
        }
        if (cfVar == cf.Rewarded) {
            Context context2 = context;
            cf cfVar2 = cfVar;
            zeVar = new ze(context2, cfVar2, ((Integer) ti0.f16763j.f16769f.a(t.E3)).intValue(), ((Integer) ti0.f16763j.f16769f.a(t.K3)).intValue(), ((Integer) ti0.f16763j.f16769f.a(t.M3)).intValue(), (String) ti0.f16763j.f16769f.a(t.O3), (String) ti0.f16763j.f16769f.a(t.G3), (String) ti0.f16763j.f16769f.a(t.I3));
        } else if (cfVar == cf.Interstitial) {
            Context context3 = context;
            cf cfVar3 = cfVar;
            zeVar = new ze(context3, cfVar3, ((Integer) ti0.f16763j.f16769f.a(t.F3)).intValue(), ((Integer) ti0.f16763j.f16769f.a(t.L3)).intValue(), ((Integer) ti0.f16763j.f16769f.a(t.N3)).intValue(), (String) ti0.f16763j.f16769f.a(t.P3), (String) ti0.f16763j.f16769f.a(t.H3), (String) ti0.f16763j.f16769f.a(t.J3));
        } else if (cfVar == cf.AppOpen) {
            Context context4 = context;
            cf cfVar4 = cfVar;
            zeVar = new ze(context4, cfVar4, ((Integer) ti0.f16763j.f16769f.a(t.S3)).intValue(), ((Integer) ti0.f16763j.f16769f.a(t.U3)).intValue(), ((Integer) ti0.f16763j.f16769f.a(t.V3)).intValue(), (String) ti0.f16763j.f16769f.a(t.Q3), (String) ti0.f16763j.f16769f.a(t.R3), (String) ti0.f16763j.f16769f.a(t.T3));
        } else {
            zeVar = null;
        }
        ye yeVar = new ye(zeVar);
        v10<AdT> v102 = new v10<>(yeVar, new df(yeVar, i10, gzVar));
        this.f17203a.put(cfVar, v102);
        return v102;
    }
}
