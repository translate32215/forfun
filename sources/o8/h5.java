package o8;

import android.util.Pair;
import b7.a;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.r;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class h5 extends r5 {

    /* renamed from: d  reason: collision with root package name */
    public String f23243d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23244e;

    /* renamed from: f  reason: collision with root package name */
    public long f23245f;

    /* renamed from: g  reason: collision with root package name */
    public final h3 f23246g;

    /* renamed from: h  reason: collision with root package name */
    public final h3 f23247h;

    /* renamed from: i  reason: collision with root package name */
    public final h3 f23248i;

    /* renamed from: j  reason: collision with root package name */
    public final h3 f23249j;

    /* renamed from: k  reason: collision with root package name */
    public final h3 f23250k;

    public h5(u5 u5Var) {
        super(u5Var);
        j t10 = this.f8864a.t();
        t10.getClass();
        this.f23246g = new h3(t10, "last_delete_stale", 0);
        j t11 = this.f8864a.t();
        t11.getClass();
        this.f23247h = new h3(t11, "backoff", 0);
        j t12 = this.f8864a.t();
        t12.getClass();
        this.f23248i = new h3(t12, "last_upload", 0);
        j t13 = this.f8864a.t();
        t13.getClass();
        this.f23249j = new h3(t13, "last_upload_attempt", 0);
        j t14 = this.f8864a.t();
        t14.getClass();
        this.f23250k = new h3(t14, "midnight_offset", 0);
    }

    public final boolean k() {
        return false;
    }

    @Deprecated
    public final Pair<String, Boolean> l(String str) {
        h();
        long a10 = this.f8864a.f8850n.a();
        String str2 = this.f23243d;
        if (str2 != null && a10 < this.f23245f) {
            return new Pair<>(str2, Boolean.valueOf(this.f23244e));
        }
        this.f23245f = this.f8864a.f8843g.r(str, v2.f23501b) + a10;
        try {
            a.C0050a a11 = a.a(this.f8864a.f8837a);
            this.f23243d = "";
            String str3 = a11.f3648a;
            if (str3 != null) {
                this.f23243d = str3;
            }
            this.f23244e = a11.f3649b;
        } catch (Exception e10) {
            this.f8864a.d().f8804m.b("Unable to get advertising id", e10);
            this.f23243d = "";
        }
        return new Pair<>(this.f23243d, Boolean.valueOf(this.f23244e));
    }

    public final Pair<String, Boolean> m(String str, g gVar) {
        if (gVar.f()) {
            return l(str);
        }
        return new Pair<>("", Boolean.FALSE);
    }

    @Deprecated
    public final String n(String str) {
        h();
        String str2 = (String) l(str).first;
        MessageDigest r10 = r.r("MD5");
        if (r10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r10.digest(str2.getBytes()))});
    }
}
