package e8;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.yh;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class af {

    /* renamed from: a  reason: collision with root package name */
    public final String f13713a;

    /* renamed from: b  reason: collision with root package name */
    public final c5 f13714b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f13715c;

    /* renamed from: d  reason: collision with root package name */
    public p8 f13716d;

    /* renamed from: e  reason: collision with root package name */
    public final f3<Object> f13717e = new cf(this, 0);

    /* renamed from: f  reason: collision with root package name */
    public final f3<Object> f13718f = new cf(this, 1);

    public af(String str, c5 c5Var, Executor executor) {
        this.f13713a = str;
        this.f13714b = c5Var;
        this.f13715c = executor;
    }

    public static boolean b(af afVar, Map map) {
        afVar.getClass();
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(afVar.f13713a)) {
            return false;
        }
        return true;
    }

    public final void a(p8 p8Var) {
        c5 c5Var = this.f13714b;
        f3<Object> f3Var = this.f13717e;
        c5Var.a();
        p50<u4> p50 = c5Var.f14083b;
        g5 g5Var = new g5("/updateActiveView", (f3) f3Var);
        o50 o50 = h9.f14886f;
        c5Var.f14083b = yh.j(p50, g5Var, o50);
        c5 c5Var2 = this.f13714b;
        f3<Object> f3Var2 = this.f13718f;
        c5Var2.a();
        c5Var2.f14083b = yh.j(c5Var2.f14083b, new g5("/untrackActiveViewUnit", (f3) f3Var2), o50);
        this.f13716d = p8Var;
    }
}
