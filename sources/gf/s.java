package gf;

import ud.k;

/* compiled from: KodeinAware.kt */
public interface s<C> {

    /* compiled from: KodeinAware.kt */
    public static final class a<C> implements s<C> {

        /* renamed from: a  reason: collision with root package name */
        public final g0<? super C> f18690a;

        /* renamed from: b  reason: collision with root package name */
        public final C f18691b;

        public a(g0<? super C> g0Var, C c10) {
            this.f18690a = g0Var;
            this.f18691b = c10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.a(this.f18690a, aVar.f18690a) && k.a(this.f18691b, aVar.f18691b);
        }

        public C getValue() {
            return this.f18691b;
        }

        public int hashCode() {
            g0<? super C> g0Var = this.f18690a;
            int i10 = 0;
            int hashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
            C c10 = this.f18691b;
            if (c10 != null) {
                i10 = c10.hashCode();
            }
            return hashCode + i10;
        }

        public g0<? super C> o() {
            return this.f18690a;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Value(type=");
            a10.append(this.f18690a);
            a10.append(", value=");
            a10.append(this.f18691b);
            a10.append(")");
            return a10.toString();
        }
    }

    C getValue();

    g0<? super C> o();
}
