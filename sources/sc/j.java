package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class j {
    @b("facebook")

    /* renamed from: a  reason: collision with root package name */
    private final String f25242a;
    @b("instagram")

    /* renamed from: b  reason: collision with root package name */
    private final String f25243b;
    @b("youtube")

    /* renamed from: c  reason: collision with root package name */
    private final String f25244c;
    @b("twitter")

    /* renamed from: d  reason: collision with root package name */
    private final String f25245d;
    @b("telegram")

    /* renamed from: e  reason: collision with root package name */
    private final String f25246e;
    @b("email")

    /* renamed from: f  reason: collision with root package name */
    private final String f25247f;
    @b("share")

    /* renamed from: g  reason: collision with root package name */
    private final String f25248g;
    @b("privacy_policy")

    /* renamed from: h  reason: collision with root package name */
    private final String f25249h;

    public final String a() {
        return this.f25247f;
    }

    public final String b() {
        return this.f25242a;
    }

    public final String c() {
        return this.f25243b;
    }

    public final String d() {
        return this.f25249h;
    }

    public final String e() {
        return this.f25248g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k.a(this.f25242a, jVar.f25242a) && k.a(this.f25243b, jVar.f25243b) && k.a(this.f25244c, jVar.f25244c) && k.a(this.f25245d, jVar.f25245d) && k.a(this.f25246e, jVar.f25246e) && k.a(this.f25247f, jVar.f25247f) && k.a(this.f25248g, jVar.f25248g) && k.a(this.f25249h, jVar.f25249h);
    }

    public final String f() {
        return this.f25246e;
    }

    public final String g() {
        return this.f25245d;
    }

    public final String h() {
        return this.f25244c;
    }

    public int hashCode() {
        return this.f25249h.hashCode() + q.a(this.f25248g, q.a(this.f25247f, q.a(this.f25246e, q.a(this.f25245d, q.a(this.f25244c, q.a(this.f25243b, this.f25242a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("Nav(facebook=");
        a10.append(this.f25242a);
        a10.append(", instagram=");
        a10.append(this.f25243b);
        a10.append(", youtube=");
        a10.append(this.f25244c);
        a10.append(", twitter=");
        a10.append(this.f25245d);
        a10.append(", telegram=");
        a10.append(this.f25246e);
        a10.append(", email=");
        a10.append(this.f25247f);
        a10.append(", share=");
        a10.append(this.f25248g);
        a10.append(", privacyPolicy=");
        a10.append(this.f25249h);
        a10.append(')');
        return a10.toString();
    }
}
