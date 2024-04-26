package e8;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.internal.ads.bp;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.m2;
import f7.g0;
import z3.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xh implements ta0<a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17490a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f17491b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<h8> f17492c;

    public xh(g2 g2Var, ab0 ab0, ab0 ab02) {
        this.f17491b = ab0;
        this.f17492c = ab02;
    }

    public final Object get() {
        m2 m2Var;
        h10 h10;
        h10 h102;
        switch (this.f17490a) {
            case 0:
                return new a(this.f17491b.get(), this.f17492c.get());
            case 1:
                return new j8(this.f17491b.get(), ((w00) this.f17492c.get()).f17192f);
            case 2:
                g10 g10 = (g10) this.f17491b.get();
                String str = (String) this.f17492c.get();
                if (str == null) {
                    h10 = new h10(g10.f14699b, g10.f14700c.f(), g10.f14700c.f8582c, (w90) null);
                } else if (g10.f14698a.containsKey(str)) {
                    h10 = g10.f14698a.get(str);
                } else {
                    Context context = g10.f14699b;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    q7 q7Var = new q7(context);
                    try {
                        synchronized (q7Var) {
                            q7Var.f16097a = q7Var.createPackageContext(str, 0);
                        }
                        o oVar = new o();
                        oVar.r(g10.f14699b, str, false);
                        g0 g0Var = new g0(g10.f14700c.f(), oVar);
                        h102 = new h10(q7Var, g0Var, new x8(y8.m(), g0Var), (w90) null);
                    } catch (PackageManager.NameNotFoundException unused) {
                        h102 = new h10(g10.f14699b, g10.f14700c.f(), g10.f14700c.f8582c, (w90) null);
                    }
                    g10.f14698a.put(str, h102);
                    h10 = h102;
                }
                jc0.b(h10, "Cannot return null from a non-@Nullable @Provides method");
                return h10;
            default:
                Context context2 = this.f17491b.get();
                f9 f9Var = (f9) this.f17492c.get();
                synchronized (new Object()) {
                    Context applicationContext2 = context2.getApplicationContext();
                    if (applicationContext2 != null) {
                        context2 = applicationContext2;
                    }
                    m2Var = new m2(context2, f9Var, (String) ti0.f16763j.f16769f.a(t.f16542a));
                }
                return m2Var;
        }
    }

    public xh(l2 l2Var, ab0 ab0, ab0 ab02) {
        this.f17491b = ab0;
        this.f17492c = ab02;
    }

    public xh(bp bpVar, ab0 ab0, ab0 ab02) {
        this.f17491b = ab0;
        this.f17492c = ab02;
    }

    public xh(g gVar, ab0 ab0, ab0 ab02) {
        this.f17491b = ab0;
        this.f17492c = ab02;
    }
}
