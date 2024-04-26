package l1;

import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k1.a;
import s.j;
import ud.k;

/* compiled from: LoaderManagerImpl */
public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final t f21009a;

    /* renamed from: b  reason: collision with root package name */
    public final C0180b f21010b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends b0<D> {
        public void h() {
            throw null;
        }

        public void i() {
            throw null;
        }

        public void k(c0<? super D> c0Var) {
            super.k(c0Var);
        }

        public void l(D d10) {
            super.l(d10);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(0);
            sb2.append(" : ");
            p.a.b((Object) null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: l1.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    public static class C0180b extends q0 {

        /* renamed from: e  reason: collision with root package name */
        public static final s0.b f21011e = new a();

        /* renamed from: d  reason: collision with root package name */
        public j<a> f21012d = new j<>();

        /* renamed from: l1.b$b$a */
        /* compiled from: LoaderManagerImpl */
        public static class a implements s0.b {
            public <T extends q0> T a(Class<T> cls) {
                return new C0180b();
            }

            public /* synthetic */ q0 b(Class cls, k1.a aVar) {
                return t0.b(this, cls, aVar);
            }
        }

        public void d() {
            if (this.f21012d.k() <= 0) {
                j<a> jVar = this.f21012d;
                int i10 = jVar.f24856d;
                Object[] objArr = jVar.f24855c;
                for (int i11 = 0; i11 < i10; i11++) {
                    objArr[i11] = null;
                }
                jVar.f24856d = 0;
                jVar.f24853a = false;
                return;
            }
            this.f21012d.l(0).getClass();
            throw null;
        }
    }

    public b(t tVar, u0 u0Var) {
        this.f21009a = tVar;
        s0.b bVar = C0180b.f21011e;
        k.f(u0Var, "store");
        k.f(bVar, "factory");
        this.f21010b = (C0180b) new s0(u0Var, bVar, a.C0172a.f19874b).a(C0180b.class);
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0180b bVar = this.f21010b;
        if (bVar.f21012d.k() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.f21012d.k() > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f21012d.g(0));
                printWriter.print(": ");
                printWriter.println(bVar.f21012d.l(0).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        p.a.b(this.f21009a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
