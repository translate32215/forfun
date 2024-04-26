package ud;

import ae.a;
import ae.d;
import ud.b;

/* compiled from: FunctionReference */
public class i extends b implements h, d {

    /* renamed from: g  reason: collision with root package name */
    public final int f26191g;

    /* renamed from: h  reason: collision with root package name */
    public final int f26192h;

    public i(int i10) {
        this(i10, b.a.f26187a, (Class) null, (String) null, (String) null, 0);
    }

    public int e() {
        return this.f26191g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (!a().equals(iVar.a()) || !l().equals(iVar.l()) || this.f26192h != iVar.f26192h || this.f26191g != iVar.f26191g || !k.a(this.f26182b, iVar.f26182b) || !k.a(j(), iVar.j())) {
                return false;
            }
            return true;
        } else if (obj instanceof d) {
            return obj.equals(g());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return l().hashCode() + ((a().hashCode() + (j() == null ? 0 : j().hashCode() * 31)) * 31);
    }

    public a i() {
        v.f26198a.getClass();
        return this;
    }

    public String toString() {
        a g10 = g();
        if (g10 != this) {
            return g10.toString();
        }
        if ("<init>".equals(a())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder a10 = android.support.v4.media.a.a("function ");
        a10.append(a());
        a10.append(" (Kotlin reflection is not available)");
        return a10.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f26191g = i10;
        this.f26192h = i11 >> 1;
    }
}
