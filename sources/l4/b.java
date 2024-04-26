package l4;

import android.support.v4.media.a;
import androidx.activity.e;

/* compiled from: Encoding */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f21035a;

    public b(String str) {
        if (str != null) {
            this.f21035a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f21035a.equals(((b) obj).f21035a);
    }

    public int hashCode() {
        return this.f21035a.hashCode() ^ 1000003;
    }

    public String toString() {
        return e.a(a.a("Encoding{name=\""), this.f21035a, "\"}");
    }
}
