package g4;

import android.support.v4.media.a;

/* compiled from: MultiClassKey */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f18464a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f18465b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f18466c;

    public i() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f18464a.equals(iVar.f18464a) && this.f18465b.equals(iVar.f18465b) && j.b(this.f18466c, iVar.f18466c);
    }

    public int hashCode() {
        int hashCode = (this.f18465b.hashCode() + (this.f18464a.hashCode() * 31)) * 31;
        Class<?> cls = this.f18466c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a10 = a.a("MultiClassKey{first=");
        a10.append(this.f18464a);
        a10.append(", second=");
        a10.append(this.f18465b);
        a10.append('}');
        return a10.toString();
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f18464a = cls;
        this.f18465b = cls2;
        this.f18466c = cls3;
    }
}
