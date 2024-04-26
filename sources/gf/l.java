package gf;

import jf.p;
import kd.o;
import ud.k;
import ud.v;

/* compiled from: Kodein.kt */
public interface l extends o {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f18672m = 0;

    /* compiled from: Kodein.kt */
    public interface a<C> {

        /* renamed from: gf.l$a$a  reason: collision with other inner class name */
        /* compiled from: Kodein.kt */
        public interface C0150a<C> extends a<C> {
            p<C> b();
        }

        g0<C> a();
    }

    /* compiled from: Kodein.kt */
    public interface b extends a.C0150a<Object>, a.C0150a {

        /* compiled from: Kodein.kt */
        public static final class a {
            public static /* synthetic */ c b(b bVar, g0 g0Var, Object obj, Boolean bool, int i10, Object obj2) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                return bVar.c(g0Var, obj, (Boolean) null);
            }

            public static /* synthetic */ void c(b bVar, g gVar, boolean z10, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                bVar.d(gVar, z10);
            }

            public static /* synthetic */ void d(b bVar, g gVar, boolean z10, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                bVar.f(gVar, z10);
            }
        }

        /* renamed from: gf.l$b$b  reason: collision with other inner class name */
        /* compiled from: Kodein.kt */
        public interface C0151b {
            <C, A, T> void a(jf.h<? super C, ? super A, ? extends T> hVar);
        }

        /* compiled from: Kodein.kt */
        public interface c<T> {
            <C, A> void a(jf.h<? super C, ? super A, ? extends T> hVar);
        }

        <T> c<T> c(g0<? extends T> g0Var, Object obj, Boolean bool);

        void d(g gVar, boolean z10);

        C0151b e(Object obj, Boolean bool);

        void f(g gVar, boolean z10);

        void g(jf.e<?, ?> eVar);
    }

    /* compiled from: Kodein.kt */
    public static final class c {
        public static s<?> a(l lVar) {
            g gVar = g.f18665b;
            return g.f18664a;
        }
    }

    /* compiled from: Kodein.kt */
    public static final class d extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(str);
            k.g(str, "message");
        }
    }

    /* compiled from: Kodein.kt */
    public static final class e<C, A, T> {

        /* renamed from: a  reason: collision with root package name */
        public int f18673a;

        /* renamed from: b  reason: collision with root package name */
        public final g0<? super C> f18674b;

        /* renamed from: c  reason: collision with root package name */
        public final g0<? super A> f18675c;

        /* renamed from: d  reason: collision with root package name */
        public final g0<? extends T> f18676d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f18677e;

        /* compiled from: Kodein.kt */
        public static final /* synthetic */ class a extends ud.i implements td.l<g0<? extends Object>, String> {

            /* renamed from: i  reason: collision with root package name */
            public static final a f18678i = new a();

            public a() {
                super(1);
            }

            public final String a() {
                return "simpleDispString";
            }

            public Object c(Object obj) {
                g0 g0Var = (g0) obj;
                k.g(g0Var, "p1");
                return g0Var.e();
            }

            public final ae.c j() {
                return v.a(g0.class);
            }

            public final String l() {
                return "simpleDispString()Ljava/lang/String;";
            }
        }

        public e(g0<? super C> g0Var, g0<? super A> g0Var2, g0<? extends T> g0Var3, Object obj) {
            k.g(g0Var, "contextType");
            k.g(g0Var2, "argType");
            k.g(g0Var3, "type");
            this.f18674b = g0Var;
            this.f18675c = g0Var2;
            this.f18676d = g0Var3;
            this.f18677e = obj;
        }

        public final void a(StringBuilder sb2, td.l<? super g0<?>, String> lVar) {
            sb2.append(" with ");
            if (!k.a(this.f18674b, d0.f18659b)) {
                StringBuilder a10 = android.support.v4.media.a.a("?<");
                a10.append(lVar.c(this.f18674b));
                a10.append(">().");
                sb2.append(a10.toString());
            }
            sb2.append("? { ");
            if (!k.a(this.f18675c, d0.f18658a)) {
                sb2.append(lVar.c(this.f18675c));
                sb2.append(" -> ");
            }
            sb2.append("? }");
        }

        public final String b() {
            String str;
            StringBuilder a10 = android.support.v4.media.a.a("bind<");
            a10.append(this.f18676d.e());
            a10.append(">(");
            if (this.f18677e != null) {
                StringBuilder a11 = android.support.v4.media.a.a("tag = \"");
                a11.append(this.f18677e);
                a11.append('\"');
                str = a11.toString();
            } else {
                str = "";
            }
            a10.append(str);
            a10.append(')');
            return a10.toString();
        }

        public final String c() {
            String str;
            StringBuilder a10 = android.support.v4.media.a.a("bind<");
            a10.append(this.f18676d.a());
            a10.append(">(");
            if (this.f18677e != null) {
                StringBuilder a11 = android.support.v4.media.a.a("tag = \"");
                a11.append(this.f18677e);
                a11.append('\"');
                str = a11.toString();
            } else {
                str = "";
            }
            a10.append(str);
            a10.append(')');
            return a10.toString();
        }

        public final String d() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            a(sb2, a.f18678i);
            String sb3 = sb2.toString();
            k.b(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }

        public final String e() {
            StringBuilder a10 = android.support.v4.media.a.a("(context: ");
            a10.append(this.f18674b.e());
            a10.append(", arg: ");
            a10.append(this.f18675c.e());
            a10.append(", type: ");
            a10.append(this.f18676d.e());
            a10.append(", tag: ");
            a10.append(this.f18677e);
            a10.append(')');
            return a10.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return k.a(this.f18674b, eVar.f18674b) && k.a(this.f18675c, eVar.f18675c) && k.a(this.f18676d, eVar.f18676d) && k.a(this.f18677e, eVar.f18677e);
        }

        public int hashCode() {
            if (this.f18673a == 0) {
                int hashCode = this.f18674b.hashCode();
                this.f18673a = hashCode;
                this.f18673a = this.f18675c.hashCode() + (hashCode * 31);
                int hashCode2 = this.f18676d.hashCode() * 29;
                this.f18673a = hashCode2;
                int i10 = hashCode2 * 23;
                Object obj = this.f18677e;
                this.f18673a = i10 + (obj != null ? obj.hashCode() : 0);
            }
            return this.f18673a;
        }

        public String toString() {
            return d();
        }
    }

    /* compiled from: Kodein.kt */
    public interface f extends b {
    }

    /* compiled from: Kodein.kt */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final String f18679a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18680b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18681c;

        /* renamed from: d  reason: collision with root package name */
        public final td.l<b, o> f18682d;

        public g(String str, boolean z10, String str2, td.l lVar, int i10) {
            z10 = (i10 & 2) != 0 ? false : z10;
            String str3 = (i10 & 4) != 0 ? "" : null;
            k.g(str3, "prefix");
            this.f18679a = str;
            this.f18680b = z10;
            this.f18681c = str3;
            this.f18682d = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return k.a(this.f18679a, gVar.f18679a) && this.f18680b == gVar.f18680b && k.a(this.f18681c, gVar.f18681c) && k.a(this.f18682d, gVar.f18682d);
        }

        public int hashCode() {
            String str = this.f18679a;
            int i10 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z10 = this.f18680b;
            if (z10) {
                z10 = true;
            }
            int i11 = (hashCode + (z10 ? 1 : 0)) * 31;
            String str2 = this.f18681c;
            int hashCode2 = (i11 + (str2 != null ? str2.hashCode() : 0)) * 31;
            td.l<b, o> lVar = this.f18682d;
            if (lVar != null) {
                i10 = lVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Module(name=");
            a10.append(this.f18679a);
            a10.append(", allowSilentOverride=");
            a10.append(this.f18680b);
            a10.append(", prefix=");
            a10.append(this.f18681c);
            a10.append(", init=");
            a10.append(this.f18682d);
            a10.append(")");
            return a10.toString();
        }
    }

    /* compiled from: Kodein.kt */
    public static final class h extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(e<?, ?, ?> eVar, String str) {
            super(str);
            k.g(str, "message");
        }
    }

    /* compiled from: Kodein.kt */
    public static final class i extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(str);
            k.g(str, "message");
        }
    }

    q t();
}
