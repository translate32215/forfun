package dd;

import android.support.v4.media.a;
import fb.b;
import sc.g;
import ud.k;

/* compiled from: CouponResponse.kt */
public final class c {
    @b("error")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13251a;
    @b("message")

    /* renamed from: b  reason: collision with root package name */
    private final String f13252b;
    @b("data")

    /* renamed from: c  reason: collision with root package name */
    private final g f13253c;

    public final g a() {
        return this.f13253c;
    }

    public final boolean b() {
        return this.f13251a;
    }

    public final String c() {
        return this.f13252b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13251a == cVar.f13251a && k.a(this.f13252b, cVar.f13252b) && k.a(this.f13253c, cVar.f13253c);
    }

    public int hashCode() {
        boolean z10 = this.f13251a;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        String str = this.f13252b;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f13253c;
        if (gVar != null) {
            i11 = gVar.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        StringBuilder a10 = a.a("CouponResponse(error=");
        a10.append(this.f13251a);
        a10.append(", message=");
        a10.append(this.f13252b);
        a10.append(", data=");
        a10.append(this.f13253c);
        a10.append(')');
        return a10.toString();
    }
}
