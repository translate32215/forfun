package o8;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.p;
import com.google.android.gms.measurement.internal.r;
import f7.j0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class z4 extends k3 {

    /* renamed from: c  reason: collision with root package name */
    public volatile x4 f23640c;

    /* renamed from: d  reason: collision with root package name */
    public volatile x4 f23641d;

    /* renamed from: e  reason: collision with root package name */
    public x4 f23642e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Activity, x4> f23643f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public Activity f23644g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f23645h;

    /* renamed from: i  reason: collision with root package name */
    public volatile x4 f23646i;

    /* renamed from: j  reason: collision with root package name */
    public x4 f23647j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23648k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f23649l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public String f23650m;

    public z4(l lVar) {
        super(lVar);
    }

    public final boolean k() {
        return false;
    }

    public final void l(Activity activity, x4 x4Var, boolean z10) {
        x4 x4Var2;
        x4 x4Var3;
        x4 x4Var4 = x4Var;
        if (this.f23640c == null) {
            x4Var2 = this.f23641d;
        } else {
            x4Var2 = this.f23640c;
        }
        x4 x4Var5 = x4Var2;
        if (x4Var4.f23602b == null) {
            x4Var3 = new x4(x4Var4.f23601a, activity != null ? p(activity.getClass(), "Activity") : null, x4Var4.f23603c, x4Var4.f23605e, x4Var4.f23606f);
        } else {
            x4Var3 = x4Var4;
        }
        this.f23641d = this.f23640c;
        this.f23640c = x4Var3;
        this.f8864a.b().r(new y4(this, x4Var3, x4Var5, this.f8864a.f8850n.a(), z10));
    }

    public final void m(x4 x4Var, x4 x4Var2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        x4 x4Var3 = x4Var;
        x4 x4Var4 = x4Var2;
        long j12 = j10;
        Bundle bundle3 = bundle;
        h();
        boolean z11 = false;
        boolean z12 = x4Var4 == null || x4Var4.f23603c != x4Var3.f23603c || !r.Y(x4Var4.f23602b, x4Var3.f23602b) || !r.Y(x4Var4.f23601a, x4Var3.f23601a);
        if (z10 && this.f23642e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            r.w(x4Var3, bundle4, true);
            if (x4Var4 != null) {
                String str = x4Var4.f23601a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = x4Var4.f23602b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", x4Var4.f23603c);
            }
            if (z11) {
                m5 m5Var = this.f8864a.z().f23380e;
                long j13 = j12 - m5Var.f23349b;
                m5Var.f23349b = j12;
                if (j13 > 0) {
                    this.f8864a.A().u(bundle4, j13);
                }
            }
            if (!this.f8864a.f8843g.w()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != x4Var3.f23605e ? "auto" : "app";
            long b10 = this.f8864a.f8850n.b();
            if (x4Var3.f23605e) {
                long j14 = x4Var3.f23606f;
                if (j14 != 0) {
                    j11 = j14;
                    this.f8864a.v().p(str3, "_vs", j11, bundle4);
                }
            }
            j11 = b10;
            this.f8864a.v().p(str3, "_vs", j11, bundle4);
        }
        if (z11) {
            n(this.f23642e, true, j12);
        }
        this.f23642e = x4Var3;
        if (x4Var3.f23605e) {
            this.f23647j = x4Var3;
        }
        p y10 = this.f8864a.y();
        y10.h();
        y10.i();
        y10.t(new j0(y10, x4Var3));
    }

    public final void n(x4 x4Var, boolean z10, long j10) {
        this.f8864a.n().k(this.f8864a.f8850n.a());
        if (this.f8864a.z().f23380e.a(x4Var != null && x4Var.f23604d, z10, j10) && x4Var != null) {
            x4Var.f23604d = false;
        }
    }

    public final x4 o(boolean z10) {
        i();
        h();
        if (!z10) {
            return this.f23642e;
        }
        x4 x4Var = this.f23642e;
        return x4Var != null ? x4Var : this.f23647j;
    }

    public final String p(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f8864a.getClass();
        if (length2 <= 100) {
            return str2;
        }
        this.f8864a.getClass();
        return str2.substring(0, 100);
    }

    public final void q(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f8864a.f8843g.w() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f23643f.put(activity, new x4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void r(String str, x4 x4Var) {
        h();
        synchronized (this) {
            String str2 = this.f23650m;
            if (str2 == null || str2.equals(str)) {
                this.f23650m = str;
            }
        }
    }

    public final x4 s(Activity activity) {
        if (activity != null) {
            x4 x4Var = this.f23643f.get(activity);
            if (x4Var == null) {
                x4 x4Var2 = new x4((String) null, p(activity.getClass(), "Activity"), this.f8864a.A().n0());
                this.f23643f.put(activity, x4Var2);
                x4Var = x4Var2;
            }
            return this.f23646i != null ? this.f23646i : x4Var;
        }
        throw new NullPointerException("null reference");
    }
}
