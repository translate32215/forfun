package ud;

import ae.a;
import ae.g;

/* compiled from: PropertyReference */
public abstract class r extends b implements g {
    public r() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (!j().equals(rVar.j()) || !a().equals(rVar.a()) || !l().equals(rVar.l()) || !k.a(this.f26182b, rVar.f26182b)) {
                return false;
            }
            return true;
        } else if (obj instanceof g) {
            return obj.equals(g());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = a().hashCode();
        return l().hashCode() + ((hashCode + (j().hashCode() * 31)) * 31);
    }

    public String toString() {
        a g10 = g();
        if (g10 != this) {
            return g10.toString();
        }
        StringBuilder a10 = android.support.v4.media.a.a("property ");
        a10.append(a());
        a10.append(" (Kotlin reflection is not available)");
        return a10.toString();
    }

    public r(Object obj) {
        super(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }
}
