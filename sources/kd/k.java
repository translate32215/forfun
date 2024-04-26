package kd;

import java.io.Serializable;
import q.c;

/* compiled from: Tuples.kt */
public final class k<A, B, C> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f20623a;

    /* renamed from: b  reason: collision with root package name */
    public final B f20624b;

    /* renamed from: c  reason: collision with root package name */
    public final C f20625c;

    public k(A a10, B b10, C c10) {
        this.f20623a = a10;
        this.f20624b = b10;
        this.f20625c = c10;
    }

    public static k a(k kVar, Object obj, Object obj2, C c10, int i10) {
        B b10 = null;
        A a10 = (i10 & 1) != 0 ? kVar.f20623a : null;
        if ((i10 & 2) != 0) {
            b10 = kVar.f20624b;
        }
        if ((i10 & 4) != 0) {
            c10 = kVar.f20625c;
        }
        return new k(a10, b10, c10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return ud.k.a(this.f20623a, kVar.f20623a) && ud.k.a(this.f20624b, kVar.f20624b) && ud.k.a(this.f20625c, kVar.f20625c);
    }

    public int hashCode() {
        A a10 = this.f20623a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f20624b;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f20625c;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder a10 = c.a('(');
        a10.append(this.f20623a);
        a10.append(", ");
        a10.append(this.f20624b);
        a10.append(", ");
        a10.append(this.f20625c);
        a10.append(')');
        return a10.toString();
    }
}
