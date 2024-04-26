package sc;

import fb.b;
import ud.k;

/* compiled from: Config.kt */
public final class a {
    @b("ad_type")

    /* renamed from: a  reason: collision with root package name */
    private final int f25204a;
    @b("ad_type_full")

    /* renamed from: b  reason: collision with root package name */
    private final int f25205b;
    @b("ad_full_posi")

    /* renamed from: c  reason: collision with root package name */
    private final int f25206c;
    @b("custom")

    /* renamed from: d  reason: collision with root package name */
    private final h f25207d;
    @b("admob")

    /* renamed from: e  reason: collision with root package name */
    private final c f25208e;
    @b("fb")

    /* renamed from: f  reason: collision with root package name */
    private final i f25209f;
    @b("startapp")

    /* renamed from: g  reason: collision with root package name */
    private final l f25210g;
    @b("appnext")

    /* renamed from: h  reason: collision with root package name */
    private final e f25211h;
    @b("adcolony")

    /* renamed from: i  reason: collision with root package name */
    private final b f25212i;
    @b("yandex")

    /* renamed from: j  reason: collision with root package name */
    private final m f25213j;

    public final b a() {
        return this.f25212i;
    }

    public final int b() {
        return this.f25206c;
    }

    public final c c() {
        return this.f25208e;
    }

    public final int d() {
        return this.f25204a;
    }

    public final int e() {
        return this.f25205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25204a == aVar.f25204a && this.f25205b == aVar.f25205b && this.f25206c == aVar.f25206c && k.a(this.f25207d, aVar.f25207d) && k.a(this.f25208e, aVar.f25208e) && k.a(this.f25209f, aVar.f25209f) && k.a(this.f25210g, aVar.f25210g) && k.a(this.f25211h, aVar.f25211h) && k.a(this.f25212i, aVar.f25212i) && k.a(this.f25213j, aVar.f25213j);
    }

    public final h f() {
        return this.f25207d;
    }

    public final i g() {
        return this.f25209f;
    }

    public final l h() {
        return this.f25210g;
    }

    public int hashCode() {
        int hashCode = this.f25207d.hashCode();
        int hashCode2 = this.f25208e.hashCode();
        int hashCode3 = this.f25209f.hashCode();
        int hashCode4 = this.f25210g.hashCode();
        int hashCode5 = this.f25211h.hashCode();
        int hashCode6 = this.f25212i.hashCode();
        return this.f25213j.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (((((this.f25204a * 31) + this.f25205b) * 31) + this.f25206c) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final m i() {
        return this.f25213j;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Ad(adType=");
        a10.append(this.f25204a);
        a10.append(", adTypeFull=");
        a10.append(this.f25205b);
        a10.append(", adFullPosi=");
        a10.append(this.f25206c);
        a10.append(", custom=");
        a10.append(this.f25207d);
        a10.append(", adMob=");
        a10.append(this.f25208e);
        a10.append(", fb=");
        a10.append(this.f25209f);
        a10.append(", startApp=");
        a10.append(this.f25210g);
        a10.append(", appNext=");
        a10.append(this.f25211h);
        a10.append(", adColony=");
        a10.append(this.f25212i);
        a10.append(", yandex=");
        a10.append(this.f25213j);
        a10.append(')');
        return a10.toString();
    }
}
