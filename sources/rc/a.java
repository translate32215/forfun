package rc;

import fb.b;
import sc.f;
import ud.k;

/* compiled from: ConfigResponse.kt */
public final class a {
    @b("data")

    /* renamed from: a  reason: collision with root package name */
    private final f f24765a;

    public final f a() {
        return this.f24765a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.a(this.f24765a, ((a) obj).f24765a);
    }

    public int hashCode() {
        return this.f24765a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ConfigResponse(data=");
        a10.append(this.f24765a);
        a10.append(')');
        return a10.toString();
    }
}
