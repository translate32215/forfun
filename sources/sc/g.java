package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Coupon.kt */
public final class g {
    @b("email")

    /* renamed from: a  reason: collision with root package name */
    private final String f25231a;
    @b("code")

    /* renamed from: b  reason: collision with root package name */
    private final String f25232b;
    @b("expire_at")

    /* renamed from: c  reason: collision with root package name */
    private final long f25233c;

    public final String a() {
        return this.f25232b;
    }

    public final long b() {
        return this.f25233c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.a(this.f25231a, gVar.f25231a) && k.a(this.f25232b, gVar.f25232b) && this.f25233c == gVar.f25233c;
    }

    public int hashCode() {
        int a10 = q.a(this.f25232b, this.f25231a.hashCode() * 31, 31);
        long j10 = this.f25233c;
        return a10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("Coupon(email=");
        a10.append(this.f25231a);
        a10.append(", code=");
        a10.append(this.f25232b);
        a10.append(", expireAt=");
        a10.append(this.f25233c);
        a10.append(')');
        return a10.toString();
    }
}
