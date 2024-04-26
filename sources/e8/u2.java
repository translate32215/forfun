package e8;

import com.google.android.gms.internal.ads.t7;
import f7.w;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class u2 implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3 f16841a = new u2();

    /* JADX WARNING: type inference failed for: r3v1, types: [e8.pb, e8.lc] */
    public final void f(Object obj, Map map) {
        ? r32 = (pb) obj;
        f3<t7> f3Var = q2.f16061a;
        String str = (String) map.get("u");
        if (str == null) {
            e.K("URL missing from click GMSG.");
            return;
        }
        new w(r32.getContext(), ((sc) r32).c().f14544a, q2.a(r32, str)).b();
    }
}
