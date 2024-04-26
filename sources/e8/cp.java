package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.q1;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.xa;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import d7.a;
import f7.j0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.json.JSONObject;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cp {

    /* renamed from: a  reason: collision with root package name */
    public final ep f14167a = new ep((ob) null);

    /* renamed from: b  reason: collision with root package name */
    public final a f14168b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f14169c;

    /* renamed from: d  reason: collision with root package name */
    public final oq f14170d;

    /* renamed from: e  reason: collision with root package name */
    public final t20 f14171e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f14172f;

    /* renamed from: g  reason: collision with root package name */
    public final tm f14173g;

    /* renamed from: h  reason: collision with root package name */
    public final f9 f14174h;

    /* renamed from: i  reason: collision with root package name */
    public final q1 f14175i = new q1();

    /* renamed from: j  reason: collision with root package name */
    public final dt f14176j;

    /* renamed from: k  reason: collision with root package name */
    public final e30 f14177k;

    /* renamed from: l  reason: collision with root package name */
    public p50<t7> f14178l;

    public cp(xa xaVar) {
        this.f14169c = xaVar.f8518c;
        this.f14172f = xaVar.f8522g;
        this.f14173g = xaVar.f8523h;
        this.f14174h = xaVar.f8524i;
        this.f14168b = xaVar.f8516a;
        this.f14176j = xaVar.f8521f;
        this.f14177k = xaVar.f8525j;
        this.f14170d = xaVar.f8519d;
        this.f14171e = xaVar.f8520e;
    }

    public final synchronized void a(String str, f3<Object> f3Var) {
        p50<t7> p50 = this.f14178l;
        if (p50 != null) {
            c cVar = new c(str, (f3) f3Var);
            p50.a(new j0((Future) p50, (zh) cVar), this.f14172f);
        }
    }

    public final synchronized void b(String str, Map<String, ?> map) {
        p50<t7> p50 = this.f14178l;
        if (p50 != null) {
            p9 p9Var = new p9(str, (Map) map);
            p50.a(new j0((Future) p50, (zh) p9Var), this.f14172f);
        }
    }

    public final <T> void c(WeakReference<T> weakReference, String str, f3<T> f3Var) {
        a(str, new gp(this, weakReference, str, f3Var, (ob) null));
    }

    public final synchronized void d(String str, f3<Object> f3Var) {
        p50<t7> p50 = this.f14178l;
        if (p50 != null) {
            p9 p9Var = new p9(str, (f3) f3Var);
            p50.a(new j0((Future) p50, (zh) p9Var), this.f14172f);
        }
    }

    public final synchronized p50<JSONObject> e(String str, JSONObject jSONObject) {
        p50<t7> p50 = this.f14178l;
        if (p50 == null) {
            return yh.h(null);
        }
        return yh.j(p50, new ih(this, str, jSONObject), this.f14172f);
    }
}
