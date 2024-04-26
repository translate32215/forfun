package kd;

import java.io.Serializable;
import q.c;
import ud.k;

/* compiled from: Tuples.kt */
public final class g<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f20614a;

    /* renamed from: b  reason: collision with root package name */
    public final B f20615b;

    public g(A a10, B b10) {
        this.f20614a = a10;
        this.f20615b = b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.a(this.f20614a, gVar.f20614a) && k.a(this.f20615b, gVar.f20615b);
    }

    public int hashCode() {
        A a10 = this.f20614a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f20615b;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder a10 = c.a('(');
        a10.append(this.f20614a);
        a10.append(", ");
        a10.append(this.f20615b);
        a10.append(')');
        return a10.toString();
    }
}
