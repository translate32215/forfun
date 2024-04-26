package f4;

import android.support.v4.media.a;
import java.security.MessageDigest;
import k3.c;

/* compiled from: ObjectKey */
public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    public final Object f18110b;

    public b(Object obj) {
        if (obj != null) {
            this.f18110b = obj;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f18110b.toString().getBytes(c.f19887a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f18110b.equals(((b) obj).f18110b);
        }
        return false;
    }

    public int hashCode() {
        return this.f18110b.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("ObjectKey{object=");
        a10.append(this.f18110b);
        a10.append('}');
        return a10.toString();
    }
}
