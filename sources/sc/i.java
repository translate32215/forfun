package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class i {
    @b("banner")

    /* renamed from: a  reason: collision with root package name */
    private final String f25238a;
    @b("interstitial")

    /* renamed from: b  reason: collision with root package name */
    private final String f25239b;
    @b("snm")

    /* renamed from: c  reason: collision with root package name */
    private final long f25240c;
    @b("pm")

    /* renamed from: d  reason: collision with root package name */
    private final long f25241d;

    public final String a() {
        return this.f25238a;
    }

    public final String b() {
        return this.f25239b;
    }

    public final long c() {
        return this.f25241d;
    }

    public final long d() {
        return this.f25240c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.a(this.f25238a, iVar.f25238a) && k.a(this.f25239b, iVar.f25239b) && this.f25240c == iVar.f25240c && this.f25241d == iVar.f25241d;
    }

    public int hashCode() {
        int a10 = q.a(this.f25239b, this.f25238a.hashCode() * 31, 31);
        long j10 = this.f25240c;
        long j11 = this.f25241d;
        return ((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("Fan(banner=");
        a10.append(this.f25238a);
        a10.append(", interstitial=");
        a10.append(this.f25239b);
        a10.append(", showNoMore=");
        a10.append(this.f25240c);
        a10.append(", perMinute=");
        a10.append(this.f25241d);
        a10.append(')');
        return a10.toString();
    }
}
