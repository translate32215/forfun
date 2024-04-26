package e8;

import com.google.android.gms.internal.ads.t7;
import f7.w;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class t2 implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3 f16703a = new t2();

    public final void f(Object obj, Map map) {
        lc lcVar = (lc) obj;
        f3<t7> f3Var = q2.f16061a;
        String str = (String) map.get("u");
        if (str == null) {
            e.K("URL missing from httpTrack GMSG.");
        } else {
            new w(lcVar.getContext(), ((sc) lcVar).c().f14544a, str).b();
        }
    }
}
