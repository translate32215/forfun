package jf;

import td.a;
import ud.k;

/* compiled from: references.kt */
public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f19810a;

    /* renamed from: b  reason: collision with root package name */
    public final a<T> f19811b;

    public o(T t10, a<? extends T> aVar) {
        k.g(t10, "current");
        this.f19810a = t10;
        this.f19811b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k.a(this.f19810a, oVar.f19810a) && k.a(this.f19811b, oVar.f19811b);
    }

    public int hashCode() {
        T t10 = this.f19810a;
        int i10 = 0;
        int hashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        a<T> aVar = this.f19811b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Reference(current=");
        a10.append(this.f19810a);
        a10.append(", next=");
        a10.append(this.f19811b);
        a10.append(")");
        return a10.toString();
    }
}
