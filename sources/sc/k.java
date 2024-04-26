package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;

/* compiled from: Config.kt */
public final class k {
    @b("ip")

    /* renamed from: a  reason: collision with root package name */
    private final String f25250a;
    @b("wmp")

    /* renamed from: b  reason: collision with root package name */
    private final String f25251b;
    @b("wmv")

    /* renamed from: c  reason: collision with root package name */
    private final String f25252c;
    @b("type")

    /* renamed from: d  reason: collision with root package name */
    private final int f25253d;
    @b("package")

    /* renamed from: e  reason: collision with root package name */
    private final String f25254e;
    @b("link")

    /* renamed from: f  reason: collision with root package name */
    private final String f25255f;
    @b("msg")

    /* renamed from: g  reason: collision with root package name */
    private final String f25256g;

    public final String a() {
        return this.f25250a;
    }

    public final String b() {
        return this.f25255f;
    }

    public final String c() {
        return this.f25256g;
    }

    public final String d() {
        return this.f25254e;
    }

    public final int e() {
        return this.f25253d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return ud.k.a(this.f25250a, kVar.f25250a) && ud.k.a(this.f25251b, kVar.f25251b) && ud.k.a(this.f25252c, kVar.f25252c) && this.f25253d == kVar.f25253d && ud.k.a(this.f25254e, kVar.f25254e) && ud.k.a(this.f25255f, kVar.f25255f) && ud.k.a(this.f25256g, kVar.f25256g);
    }

    public final String f() {
        return this.f25251b;
    }

    public final String g() {
        return this.f25252c;
    }

    public int hashCode() {
        int a10 = q.a(this.f25251b, this.f25250a.hashCode() * 31, 31);
        return this.f25256g.hashCode() + q.a(this.f25255f, q.a(this.f25254e, (q.a(this.f25252c, a10, 31) + this.f25253d) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("Player(ip=");
        a10.append(this.f25250a);
        a10.append(", wmp=");
        a10.append(this.f25251b);
        a10.append(", wmv=");
        a10.append(this.f25252c);
        a10.append(", type=");
        a10.append(this.f25253d);
        a10.append(", package=");
        a10.append(this.f25254e);
        a10.append(", link=");
        a10.append(this.f25255f);
        a10.append(", message=");
        a10.append(this.f25256g);
        a10.append(')');
        return a10.toString();
    }
}
