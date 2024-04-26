package sc;

import android.support.v4.media.a;
import fb.b;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class d {
    @b("version_code")

    /* renamed from: a  reason: collision with root package name */
    private final int f25221a;
    @b("update_msg")

    /* renamed from: b  reason: collision with root package name */
    private final String f25222b;
    @b("download_link")

    /* renamed from: c  reason: collision with root package name */
    private final String f25223c;
    @b("gtId")

    /* renamed from: d  reason: collision with root package name */
    private final String f25224d;

    public final String a() {
        return this.f25223c;
    }

    public final String b() {
        return this.f25224d;
    }

    public final String c() {
        return this.f25222b;
    }

    public final int d() {
        return this.f25221a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f25221a == dVar.f25221a && k.a(this.f25222b, dVar.f25222b) && k.a(this.f25223c, dVar.f25223c) && k.a(this.f25224d, dVar.f25224d);
    }

    public int hashCode() {
        return this.f25224d.hashCode() + q.a(this.f25223c, q.a(this.f25222b, this.f25221a * 31, 31), 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("App(versionCode=");
        a10.append(this.f25221a);
        a10.append(", updateMsg=");
        a10.append(this.f25222b);
        a10.append(", downloadLink=");
        a10.append(this.f25223c);
        a10.append(", gtID=");
        a10.append(this.f25224d);
        a10.append(')');
        return a10.toString();
    }
}
