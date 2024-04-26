package kf;

import gf.d0;
import gf.g0;
import ud.f;
import ud.k;

/* compiled from: KodeinTreeImpl.kt */
public abstract class q {

    /* compiled from: KodeinTreeImpl.kt */
    public static final class a extends q {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f20955a;

        /* renamed from: b  reason: collision with root package name */
        public final g0<?> f20956b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g0<?> g0Var) {
            super((f) null);
            k.g(g0Var, "type");
            this.f20956b = g0Var;
            d0 d0Var = d0.f18660c;
            this.f20955a = k.a(g0Var, d0.f18659b);
        }

        public boolean a(g0<?> g0Var) {
            k.g(g0Var, "other");
            return this.f20955a || this.f20956b.g(g0Var);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && k.a(this.f20956b, ((a) obj).f20956b);
            }
            return true;
        }

        public int hashCode() {
            g0<?> g0Var = this.f20956b;
            if (g0Var != null) {
                return g0Var.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Down(type=");
            a10.append(this.f20956b);
            a10.append(")");
            return a10.toString();
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class b extends q {

        /* renamed from: a  reason: collision with root package name */
        public final g0<?> f20957a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g0<?> g0Var) {
            super((f) null);
            k.g(g0Var, "type");
            this.f20957a = g0Var;
        }

        public boolean a(g0<?> g0Var) {
            k.g(g0Var, "other");
            d0 d0Var = d0.f18660c;
            return k.a(g0Var, d0.f18659b) || g0Var.g(this.f20957a);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && k.a(this.f20957a, ((b) obj).f20957a);
            }
            return true;
        }

        public int hashCode() {
            g0<?> g0Var = this.f20957a;
            if (g0Var != null) {
                return g0Var.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Up(type=");
            a10.append(this.f20957a);
            a10.append(")");
            return a10.toString();
        }
    }

    public q() {
    }

    public abstract boolean a(g0<?> g0Var);

    public q(f fVar) {
    }
}
