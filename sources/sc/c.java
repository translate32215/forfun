package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class c {
    @b("banner")

    /* renamed from: a  reason: collision with root package name */
    private final String f25217a;
    @b("interstitial")

    /* renamed from: b  reason: collision with root package name */
    private final String f25218b;
    @b("snm")

    /* renamed from: c  reason: collision with root package name */
    private final long f25219c;
    @b("pm")

    /* renamed from: d  reason: collision with root package name */
    private final long f25220d;

    public final String a() {
        return this.f25217a;
    }

    public final String b() {
        return this.f25218b;
    }

    public final long c() {
        return this.f25220d;
    }

    public final long d() {
        return this.f25219c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.a(this.f25217a, cVar.f25217a) && k.a(this.f25218b, cVar.f25218b) && this.f25219c == cVar.f25219c && this.f25220d == cVar.f25220d;
    }

    public int hashCode() {
        int a10 = q.a(this.f25218b, this.f25217a.hashCode() * 31, 31);
        long j10 = this.f25219c;
        long j11 = this.f25220d;
        return ((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("Admob(banner=");
        a10.append(this.f25217a);
        a10.append(", interstitial=");
        a10.append(this.f25218b);
        a10.append(", showNoMore=");
        a10.append(this.f25219c);
        a10.append(", perMinute=");
        a10.append(this.f25220d);
        a10.append(')');
        return a10.toString();
    }
}
