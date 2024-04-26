package n0;

import android.support.v4.media.a;

/* compiled from: Pair */
public class c<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f21812a;

    /* renamed from: b  reason: collision with root package name */
    public final S f21813b;

    public c(F f10, S s10) {
        this.f21812a = f10;
        this.f21813b = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f21812a, this.f21812a) || !b.a(cVar.f21813b, this.f21813b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f10 = this.f21812a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f21813b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("Pair{");
        a10.append(this.f21812a);
        a10.append(" ");
        a10.append(this.f21813b);
        a10.append("}");
        return a10.toString();
    }
}
