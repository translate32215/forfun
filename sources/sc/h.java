package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class h {
    @b("banner")

    /* renamed from: a  reason: collision with root package name */
    private final String f25234a;
    @b("full")

    /* renamed from: b  reason: collision with root package name */
    private final String f25235b;
    @b("snm")

    /* renamed from: c  reason: collision with root package name */
    private final long f25236c;
    @b("pm")

    /* renamed from: d  reason: collision with root package name */
    private final long f25237d;

    public final String a() {
        return this.f25234a;
    }

    public final String b() {
        return this.f25235b;
    }

    public final long c() {
        return this.f25237d;
    }

    public final long d() {
        return this.f25236c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.a(this.f25234a, hVar.f25234a) && k.a(this.f25235b, hVar.f25235b) && this.f25236c == hVar.f25236c && this.f25237d == hVar.f25237d;
    }

    public int hashCode() {
        int a10 = q.a(this.f25235b, this.f25234a.hashCode() * 31, 31);
        long j10 = this.f25236c;
        long j11 = this.f25237d;
        return ((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("CustomAd(banner=");
        a10.append(this.f25234a);
        a10.append(", full=");
        a10.append(this.f25235b);
        a10.append(", showNoMore=");
        a10.append(this.f25236c);
        a10.append(", perMinute=");
        a10.append(this.f25237d);
        a10.append(')');
        return a10.toString();
    }
}
