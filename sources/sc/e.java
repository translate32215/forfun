package sc;

import android.support.v4.media.a;
import fb.b;
import ud.k;

/* compiled from: Config.kt */
public final class e {
    @b("id")

    /* renamed from: a  reason: collision with root package name */
    private final String f25225a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.a(this.f25225a, ((e) obj).f25225a);
    }

    public int hashCode() {
        return this.f25225a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("AppNext(id=");
        a10.append(this.f25225a);
        a10.append(')');
        return a10.toString();
    }
}
