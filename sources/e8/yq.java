package e8;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import d7.l;
import e7.e;
import f7.d0;
import f7.j;
import f7.j0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yq {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17649a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17650b = false;

    /* renamed from: c  reason: collision with root package name */
    public final long f17651c;

    /* renamed from: d  reason: collision with root package name */
    public final d7<Boolean> f17652d = new d7<>();

    /* renamed from: e  reason: collision with root package name */
    public final Context f17653e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<Context> f17654f;

    /* renamed from: g  reason: collision with root package name */
    public final gb f17655g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f17656h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f17657i;

    /* renamed from: j  reason: collision with root package name */
    public final ScheduledExecutorService f17658j;

    /* renamed from: k  reason: collision with root package name */
    public final uq f17659k;

    /* renamed from: l  reason: collision with root package name */
    public final f9 f17660l;

    /* renamed from: m  reason: collision with root package name */
    public Map<String, y3> f17661m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    public final fl f17662n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17663o = true;

    public yq(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, gb gbVar, ScheduledExecutorService scheduledExecutorService, uq uqVar, f9 f9Var, fl flVar) {
        this.f17655g = gbVar;
        this.f17653e = context;
        this.f17654f = weakReference;
        this.f17656h = executor2;
        this.f17658j = scheduledExecutorService;
        this.f17657i = executor;
        this.f17659k = uqVar;
        this.f17660l = f9Var;
        this.f17662n = flVar;
        this.f17651c = l.B.f13193j.a();
        this.f17661m.put("com.google.android.gms.ads.MobileAds", new y3("com.google.android.gms.ads.MobileAds", false, 0, ""));
    }

    public static void a(yq yqVar, String str, boolean z10, String str2, int i10) {
        yqVar.f17661m.put(str, new y3(str, z10, i10, str2));
    }

    public final void b(String str, boolean z10, String str2, int i10) {
        this.f17661m.put(str, new y3(str, z10, i10, str2));
    }

    public final void c() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.Z0)).booleanValue() && !((Boolean) x0.f17423a.b()).booleanValue()) {
            if (this.f17660l.f14546c >= ((Integer) ti0.f16763j.f16769f.a(t.f16544a1)).intValue() && this.f17663o) {
                if (!this.f17649a) {
                    synchronized (this) {
                        if (!this.f17649a) {
                            this.f17659k.a();
                            this.f17662n.I0(hl.f14921a);
                            d7<Boolean> d7Var = this.f17652d;
                            d7Var.f6188a.a(new e(this), this.f17656h);
                            this.f17649a = true;
                            p50<String> e10 = e();
                            this.f17658j.schedule(new j(this), ((Long) ti0.f16763j.f16769f.a(t.f16556c1)).longValue(), TimeUnit.SECONDS);
                            qh qhVar = new qh(this);
                            e10.a(new j0((Future) e10, (zh) qhVar), this.f17656h);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f17649a) {
            this.f17661m.put("com.google.android.gms.ads.MobileAds", new y3("com.google.android.gms.ads.MobileAds", true, 0, ""));
            this.f17652d.b(Boolean.FALSE);
            this.f17649a = true;
        }
    }

    public final List<y3> d() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f17661m.keySet()) {
            y3 y3Var = this.f17661m.get(next);
            arrayList.add(new y3(next, y3Var.f17570b, y3Var.f17571c, y3Var.f17572d));
        }
        return arrayList;
    }

    public final synchronized p50<String> e() {
        String str = ((o) l.B.f13190g.f()).j().f16860f;
        if (!TextUtils.isEmpty(str)) {
            return yh.h(str);
        }
        d7 d7Var = new d7();
        d0 f10 = l.B.f13190g.f();
        ((o) f10).f5681c.add(new j0(this, d7Var));
        return d7Var;
    }
}
