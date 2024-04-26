package e8;

import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import f7.j0;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ur implements vr {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ab0<vr>> f16987a;

    /* renamed from: b  reason: collision with root package name */
    public final o50 f16988b;

    /* renamed from: c  reason: collision with root package name */
    public final dk f16989c;

    public ur(Map<String, ab0<vr>> map, o50 o50, dk dkVar) {
        this.f16987a = map;
        this.f16988b = o50;
        this.f16989c = dkVar;
    }

    public final p50<t00> a(l5 l5Var) {
        this.f16989c.I0(new g2(l5Var));
        p50<V> aVar = new ai.a<>(new br(we.NO_FILL));
        for (String trim : ((String) ti0.f16763j.f16769f.a(t.f16673v4)).split(",")) {
            ab0 ab0 = this.f16987a.get(trim.trim());
            if (ab0 != null) {
                aVar = yh.k(aVar, br.class, new h5(ab0, l5Var), this.f16988b);
            }
        }
        aVar.a(new j0((Future) aVar, (zh) new g2(this)), h9.f14886f);
        return aVar;
    }
}
