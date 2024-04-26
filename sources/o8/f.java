package o8;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import b8.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.r;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class f extends n {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f23190b;

    /* renamed from: c  reason: collision with root package name */
    public e f23191c = d.f23156a;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f23192d;

    public f(l lVar) {
        super(lVar);
    }

    public static final long i() {
        return v2.D.a(null).longValue();
    }

    public final String j(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            i.h(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f8864a.d().f8797f.b("Could not find SystemProperties class", e10);
            return "";
        } catch (NoSuchMethodException e11) {
            this.f8864a.d().f8797f.b("Could not find SystemProperties.get() method", e11);
            return "";
        } catch (IllegalAccessException e12) {
            this.f8864a.d().f8797f.b("Could not access SystemProperties.get()", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f8864a.d().f8797f.b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final double k(String str, u2<Double> u2Var) {
        if (str == null) {
            return u2Var.a(null).doubleValue();
        }
        String a10 = this.f23191c.a(str, u2Var.f23456a);
        if (TextUtils.isEmpty(a10)) {
            return u2Var.a(null).doubleValue();
        }
        try {
            return u2Var.a(Double.valueOf(Double.parseDouble(a10))).doubleValue();
        } catch (NumberFormatException unused) {
            return u2Var.a(null).doubleValue();
        }
    }

    public final int l(String str) {
        return Math.max(Math.min(o(str, v2.H), 2000), 500);
    }

    public final int m() {
        r A = this.f8864a.A();
        Boolean bool = A.f8864a.y().f8868e;
        if (A.l0() < 201500) {
            return (bool == null || bool.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int n(String str) {
        return Math.max(Math.min(o(str, v2.I), 100), 25);
    }

    public final int o(String str, u2<Integer> u2Var) {
        if (str == null) {
            return u2Var.a(null).intValue();
        }
        String a10 = this.f23191c.a(str, u2Var.f23456a);
        if (TextUtils.isEmpty(a10)) {
            return u2Var.a(null).intValue();
        }
        try {
            return u2Var.a(Integer.valueOf(Integer.parseInt(a10))).intValue();
        } catch (NumberFormatException unused) {
            return u2Var.a(null).intValue();
        }
    }

    public final int p(String str, u2<Integer> u2Var, int i10, int i11) {
        return Math.max(Math.min(o(str, u2Var), i11), i10);
    }

    public final long q() {
        this.f8864a.getClass();
        return 43042;
    }

    public final long r(String str, u2<Long> u2Var) {
        if (str == null) {
            return u2Var.a(null).longValue();
        }
        String a10 = this.f23191c.a(str, u2Var.f23456a);
        if (TextUtils.isEmpty(a10)) {
            return u2Var.a(null).longValue();
        }
        try {
            return u2Var.a(Long.valueOf(Long.parseLong(a10))).longValue();
        } catch (NumberFormatException unused) {
            return u2Var.a(null).longValue();
        }
    }

    public final Bundle s() {
        try {
            if (this.f8864a.f8837a.getPackageManager() == null) {
                this.f8864a.d().f8797f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = c.a(this.f8864a.f8837a).a(this.f8864a.f8837a.getPackageName(), 128);
            if (a10 != null) {
                return a10.metaData;
            }
            this.f8864a.d().f8797f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f8864a.d().f8797f.b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean t(String str) {
        i.e(str);
        Bundle s10 = s();
        if (s10 == null) {
            this.f8864a.d().f8797f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!s10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(s10.getBoolean(str));
        }
    }

    public final boolean u() {
        Boolean t10 = t("google_analytics_adid_collection_enabled");
        return t10 == null || t10.booleanValue();
    }

    public final boolean v(String str, u2<Boolean> u2Var) {
        boolean z10;
        if (str == null) {
            return u2Var.a(null).booleanValue();
        }
        String a10 = this.f23191c.a(str, u2Var.f23456a);
        if (TextUtils.isEmpty(a10)) {
            return u2Var.a(null).booleanValue();
        }
        if (this.f8864a.f8843g.v((String) null, v2.f23544w0)) {
            z10 = "1".equals(a10);
        } else {
            z10 = Boolean.parseBoolean(a10);
        }
        return u2Var.a(Boolean.valueOf(z10)).booleanValue();
    }

    public final boolean w() {
        Boolean t10 = t("google_analytics_automatic_screen_reporting_enabled");
        return t10 == null || t10.booleanValue();
    }

    public final boolean x() {
        this.f8864a.getClass();
        Boolean t10 = t("firebase_analytics_collection_deactivated");
        return t10 != null && t10.booleanValue();
    }

    public final boolean y(String str) {
        return "1".equals(this.f23191c.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean z() {
        if (this.f23190b == null) {
            Boolean t10 = t("app_measurement_lite");
            this.f23190b = t10;
            if (t10 == null) {
                this.f23190b = Boolean.FALSE;
            }
        }
        return this.f23190b.booleanValue() || !this.f8864a.f8841e;
    }
}
