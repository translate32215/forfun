package sc;

import android.support.v4.media.a;
import fb.b;
import ud.k;

/* compiled from: Config.kt */
public final class l {
    @b("app_id")

    /* renamed from: a  reason: collision with root package name */
    private final String f25257a;
    @b("snm")

    /* renamed from: b  reason: collision with root package name */
    private final long f25258b;
    @b("pm")

    /* renamed from: c  reason: collision with root package name */
    private final long f25259c;

    public final String a() {
        return this.f25257a;
    }

    public final long b() {
        return this.f25259c;
    }

    public final long c() {
        return this.f25258b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k.a(this.f25257a, lVar.f25257a) && this.f25258b == lVar.f25258b && this.f25259c == lVar.f25259c;
    }

    public int hashCode() {
        long j10 = this.f25258b;
        long j11 = this.f25259c;
        return (((this.f25257a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("StartApp(appId=");
        a10.append(this.f25257a);
        a10.append(", showNoMore=");
        a10.append(this.f25258b);
        a10.append(", perMinute=");
        a10.append(this.f25259c);
        a10.append(')');
        return a10.toString();
    }
}
