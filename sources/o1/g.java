package o1;

import android.support.v4.media.a;
import ud.k;

/* compiled from: NavArgument.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final a0<Object> f22687a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22688b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22689c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f22690d;

    public g(a0<Object> a0Var, boolean z10, Object obj, boolean z11) {
        boolean z12 = true;
        if (a0Var.f22655a || !z10) {
            if (!z10 && z11 && obj == null) {
                z12 = false;
            }
            if (z12) {
                this.f22687a = a0Var;
                this.f22688b = z10;
                this.f22690d = obj;
                this.f22689c = z11;
                return;
            }
            StringBuilder a10 = a.a("Argument with type ");
            a10.append(a0Var.b());
            a10.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(a10.toString().toString());
        }
        throw new IllegalArgumentException((a0Var.b() + " does not allow nullable values").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.a(g.class, obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f22688b != gVar.f22688b || this.f22689c != gVar.f22689c || !k.a(this.f22687a, gVar.f22687a)) {
            return false;
        }
        Object obj2 = this.f22690d;
        if (obj2 != null) {
            return k.a(obj2, gVar.f22690d);
        }
        if (gVar.f22690d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f22687a.hashCode() * 31) + (this.f22688b ? 1 : 0)) * 31) + (this.f22689c ? 1 : 0)) * 31;
        Object obj = this.f22690d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g.class.getSimpleName());
        sb2.append(" Type: " + this.f22687a);
        sb2.append(" Nullable: " + this.f22688b);
        if (this.f22689c) {
            StringBuilder a10 = a.a(" DefaultValue: ");
            a10.append(this.f22690d);
            sb2.append(a10.toString());
        }
        String sb3 = sb2.toString();
        k.e(sb3, "sb.toString()");
        return sb3;
    }
}
