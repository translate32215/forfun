package jf;

import android.support.v4.media.a;
import ud.k;

/* compiled from: standardBindings.kt */
public final class r<A> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f19812a;

    /* renamed from: b  reason: collision with root package name */
    public final A f19813b;

    public r(Object obj, A a10) {
        this.f19812a = obj;
        this.f19813b = a10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k.a(this.f19812a, rVar.f19812a) && k.a(this.f19813b, rVar.f19813b);
    }

    public int hashCode() {
        Object obj = this.f19812a;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        A a10 = this.f19813b;
        if (a10 != null) {
            i10 = a10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder a10 = a.a("ScopeKey(scopeId=");
        a10.append(this.f19812a);
        a10.append(", arg=");
        a10.append(this.f19813b);
        a10.append(")");
        return a10.toString();
    }
}
