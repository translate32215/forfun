package ke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import le.c;

/* compiled from: ConnectionSpec */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final i f20739e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f20740f = new i(new a(false));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20741a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20742b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String[] f20743c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String[] f20744d;

    static {
        g gVar = g.f20718q;
        g gVar2 = g.f20719r;
        g gVar3 = g.f20720s;
        g gVar4 = g.f20721t;
        g gVar5 = g.f20722u;
        g gVar6 = g.f20712k;
        g gVar7 = g.f20714m;
        g gVar8 = g.f20713l;
        g gVar9 = g.f20715n;
        g gVar10 = g.f20717p;
        g gVar11 = g.f20716o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.f20710i, g.f20711j, g.f20708g, g.f20709h, g.f20706e, g.f20707f, g.f20705d};
        a aVar = new a(true);
        aVar.b(gVarArr);
        g0 g0Var = g0.TLS_1_3;
        g0 g0Var2 = g0.TLS_1_2;
        aVar.e(g0Var, g0Var2);
        aVar.c(true);
        new i(aVar);
        a aVar2 = new a(true);
        aVar2.b(gVarArr2);
        g0 g0Var3 = g0.TLS_1_0;
        aVar2.e(g0Var, g0Var2, g0.TLS_1_1, g0Var3);
        aVar2.c(true);
        f20739e = new i(aVar2);
        a aVar3 = new a(true);
        aVar3.b(gVarArr2);
        aVar3.e(g0Var3);
        aVar3.c(true);
        new i(aVar3);
    }

    public i(a aVar) {
        this.f20741a = aVar.f20745a;
        this.f20743c = aVar.f20746b;
        this.f20744d = aVar.f20747c;
        this.f20742b = aVar.f20748d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f20741a) {
            return false;
        }
        String[] strArr = this.f20744d;
        if (strArr != null && !c.t(c.f21275o, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f20743c;
        if (strArr2 == null || c.t(g.f20703b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z10 = this.f20741a;
        if (z10 != iVar.f20741a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f20743c, iVar.f20743c) && Arrays.equals(this.f20744d, iVar.f20744d) && this.f20742b == iVar.f20742b);
    }

    public int hashCode() {
        if (this.f20741a) {
            return ((((527 + Arrays.hashCode(this.f20743c)) * 31) + Arrays.hashCode(this.f20744d)) * 31) + (this.f20742b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (!this.f20741a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f20743c;
        List list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String a10 : strArr) {
                    arrayList.add(g.a(a10));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.f20744d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                ArrayList arrayList2 = new ArrayList(strArr2.length);
                for (String a11 : strArr2) {
                    arrayList2.add(g0.a(a11));
                }
                list2 = Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f20742b + ")";
    }

    /* compiled from: ConnectionSpec */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f20745a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String[] f20746b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String[] f20747c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f20748d;

        public a(boolean z10) {
            this.f20745a = z10;
        }

        public a a(String... strArr) {
            if (!this.f20745a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f20746b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a b(g... gVarArr) {
            if (this.f20745a) {
                String[] strArr = new String[gVarArr.length];
                for (int i10 = 0; i10 < gVarArr.length; i10++) {
                    strArr[i10] = gVarArr[i10].f20723a;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(boolean z10) {
            if (this.f20745a) {
                this.f20748d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a d(String... strArr) {
            if (!this.f20745a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f20747c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a e(g0... g0VarArr) {
            if (this.f20745a) {
                String[] strArr = new String[g0VarArr.length];
                for (int i10 = 0; i10 < g0VarArr.length; i10++) {
                    strArr[i10] = g0VarArr[i10].f20730a;
                }
                d(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(i iVar) {
            this.f20745a = iVar.f20741a;
            this.f20746b = iVar.f20743c;
            this.f20747c = iVar.f20744d;
            this.f20748d = iVar.f20742b;
        }
    }
}
