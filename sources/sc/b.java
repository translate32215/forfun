package sc;

import android.support.v4.media.a;
import o1.q;
import ud.k;

/* compiled from: Config.kt */
public final class b {
    @fb.b("app_id")

    /* renamed from: a  reason: collision with root package name */
    private final String f25214a;
    @fb.b("banner")

    /* renamed from: b  reason: collision with root package name */
    private final String f25215b;
    @fb.b("full")

    /* renamed from: c  reason: collision with root package name */
    private final String f25216c;

    public final String a() {
        return this.f25214a;
    }

    public final String b() {
        return this.f25215b;
    }

    public final String c() {
        return this.f25216c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f25214a, bVar.f25214a) && k.a(this.f25215b, bVar.f25215b) && k.a(this.f25216c, bVar.f25216c);
    }

    public int hashCode() {
        return this.f25216c.hashCode() + q.a(this.f25215b, this.f25214a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("AdColony(appId=");
        a10.append(this.f25214a);
        a10.append(", banner=");
        a10.append(this.f25215b);
        a10.append(", full=");
        a10.append(this.f25216c);
        a10.append(')');
        return a10.toString();
    }
}
