package k3;

import g4.b;
import java.security.MessageDigest;
import k3.d;
import s.a;

/* compiled from: Options */
public final class e implements c {

    /* renamed from: b  reason: collision with root package name */
    public final a<d<?>, Object> f19893b = new b();

    public void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            a<d<?>, Object> aVar = this.f19893b;
            if (i10 < aVar.f24851c) {
                d h10 = aVar.h(i10);
                Object l10 = this.f19893b.l(i10);
                d.b<T> bVar = h10.f19890b;
                if (h10.f19892d == null) {
                    h10.f19892d = h10.f19891c.getBytes(c.f19887a);
                }
                bVar.a(h10.f19892d, l10, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public <T> T c(d<T> dVar) {
        if (this.f19893b.e(dVar) >= 0) {
            return this.f19893b.getOrDefault(dVar, null);
        }
        return dVar.f19889a;
    }

    public void d(e eVar) {
        this.f19893b.i(eVar.f19893b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f19893b.equals(((e) obj).f19893b);
        }
        return false;
    }

    public int hashCode() {
        return this.f19893b.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Options{values=");
        a10.append(this.f19893b);
        a10.append('}');
        return a10.toString();
    }
}
