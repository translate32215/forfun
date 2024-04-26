package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class m {
    @b("banner")

    /* renamed from: a  reason: collision with root package name */
    private final String f25260a;
    @b("interstitial")

    /* renamed from: b  reason: collision with root package name */
    private final String f25261b;
    @b("snm")

    /* renamed from: c  reason: collision with root package name */
    private final long f25262c;
    @b("pm")

    /* renamed from: d  reason: collision with root package name */
    private final long f25263d;

    public final String a() {
        return this.f25260a;
    }

    public final String b() {
        return this.f25261b;
    }

    public final long c() {
        return this.f25263d;
    }

    public final long d() {
        return this.f25262c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k.a(this.f25260a, mVar.f25260a) && k.a(this.f25261b, mVar.f25261b) && this.f25262c == mVar.f25262c && this.f25263d == mVar.f25263d;
    }

    public int hashCode() {
        int a10 = q.a(this.f25261b, this.f25260a.hashCode() * 31, 31);
        long j10 = this.f25262c;
        long j11 = this.f25263d;
        return ((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("Yandex(banner=");
        a10.append(this.f25260a);
        a10.append(", interstitial=");
        a10.append(this.f25261b);
        a10.append(", showNoMore=");
        a10.append(this.f25262c);
        a10.append(", perMinute=");
        a10.append(this.f25263d);
        a10.append(')');
        return a10.toString();
    }
}
