package k8;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public final o f20213a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20214b;

    public g() {
        throw null;
    }

    public g(String str) {
        this.f20213a = o.f20381n;
        this.f20214b = str;
    }

    public g(String str, o oVar) {
        this.f20213a = oVar;
        this.f20214b = str;
    }

    public final Double a() {
        throw new IllegalStateException("Control is not a double");
    }

    public final Iterator<o> c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f20214b.equals(gVar.f20214b) && this.f20213a.equals(gVar.f20213a);
    }

    public final o f() {
        return new g(this.f20214b, this.f20213a.f());
    }

    public final int hashCode() {
        return this.f20213a.hashCode() + (this.f20214b.hashCode() * 31);
    }

    public final Boolean j() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final String q() {
        throw new IllegalStateException("Control is not a String");
    }

    public final o s(String str, n2.g gVar, List<o> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
