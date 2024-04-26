package o8;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.r;
import java.util.Map;
import s.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class y1 extends w2 {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Long> f23609b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f23610c = new a();

    /* renamed from: d  reason: collision with root package name */
    public long f23611d;

    public y1(l lVar) {
        super(lVar);
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f8864a.d().f8797f.a("Ad unit id must be a non-empty string");
        } else {
            this.f8864a.b().r(new a(this, str, j10, 0));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f8864a.d().f8797f.a("Ad unit id must be a non-empty string");
        } else {
            this.f8864a.b().r(new a(this, str, j10, 1));
        }
    }

    public final void k(long j10) {
        x4 o10 = this.f8864a.x().o(false);
        for (String next : this.f23609b.keySet()) {
            m(next, j10 - this.f23609b.get(next).longValue(), o10);
        }
        if (!this.f23609b.isEmpty()) {
            l(j10 - this.f23611d, o10);
        }
        n(j10);
    }

    public final void l(long j10, x4 x4Var) {
        if (x4Var == null) {
            this.f8864a.d().f8805n.a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.f8864a.d().f8805n.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            r.w(x4Var, bundle, true);
            this.f8864a.v().o("am", "_xa", bundle);
        }
    }

    public final void m(String str, long j10, x4 x4Var) {
        if (x4Var == null) {
            this.f8864a.d().f8805n.a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.f8864a.d().f8805n.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            r.w(x4Var, bundle, true);
            this.f8864a.v().o("am", "_xu", bundle);
        }
    }

    public final void n(long j10) {
        for (String put : this.f23609b.keySet()) {
            this.f23609b.put(put, Long.valueOf(j10));
        }
        if (!this.f23609b.isEmpty()) {
            this.f23611d = j10;
        }
    }
}
