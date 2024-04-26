package sc;

import android.support.v4.media.a;
import fb.b;
import ud.k;

/* compiled from: Config.kt */
public final class f {
    @b("app")

    /* renamed from: a  reason: collision with root package name */
    private final d f25226a;
    @b("nav")

    /* renamed from: b  reason: collision with root package name */
    private final j f25227b;
    @b("player")

    /* renamed from: c  reason: collision with root package name */
    private final k f25228c;
    @b("ad")

    /* renamed from: d  reason: collision with root package name */
    private final a f25229d;
    @b("premium")

    /* renamed from: e  reason: collision with root package name */
    private final g f25230e;

    public final a a() {
        return this.f25229d;
    }

    public final d b() {
        return this.f25226a;
    }

    public final j c() {
        return this.f25227b;
    }

    public final k d() {
        return this.f25228c;
    }

    public final g e() {
        return this.f25230e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.a(this.f25226a, fVar.f25226a) && k.a(this.f25227b, fVar.f25227b) && k.a(this.f25228c, fVar.f25228c) && k.a(this.f25229d, fVar.f25229d) && k.a(this.f25230e, fVar.f25230e);
    }

    public int hashCode() {
        int hashCode = this.f25227b.hashCode();
        int hashCode2 = (this.f25229d.hashCode() + ((this.f25228c.hashCode() + ((hashCode + (this.f25226a.hashCode() * 31)) * 31)) * 31)) * 31;
        g gVar = this.f25230e;
        return hashCode2 + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        StringBuilder a10 = a.a("Config(app=");
        a10.append(this.f25226a);
        a10.append(", nav=");
        a10.append(this.f25227b);
        a10.append(", player=");
        a10.append(this.f25228c);
        a10.append(", ad=");
        a10.append(this.f25229d);
        a10.append(", premium=");
        a10.append(this.f25230e);
        a10.append(')');
        return a10.toString();
    }
}
