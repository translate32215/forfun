package m3;

import android.support.v4.media.a;
import java.security.MessageDigest;
import k3.c;

/* compiled from: DataCacheKey */
public final class e implements c {

    /* renamed from: b  reason: collision with root package name */
    public final c f21523b;

    /* renamed from: c  reason: collision with root package name */
    public final c f21524c;

    public e(c cVar, c cVar2) {
        this.f21523b = cVar;
        this.f21524c = cVar2;
    }

    public void a(MessageDigest messageDigest) {
        this.f21523b.a(messageDigest);
        this.f21524c.a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f21523b.equals(eVar.f21523b) || !this.f21524c.equals(eVar.f21524c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f21524c.hashCode() + (this.f21523b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("DataCacheKey{sourceKey=");
        a10.append(this.f21523b);
        a10.append(", signature=");
        a10.append(this.f21524c);
        a10.append('}');
        return a10.toString();
    }
}
