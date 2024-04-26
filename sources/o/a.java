package o;

import androidx.lifecycle.g;
import androidx.lifecycle.q0;
import de.g0;
import de.k1;
import de.u;
import de.v;
import de.w0;
import de.x;
import de.y;
import e.j;
import f7.v;
import ie.n;
import kd.o;
import l0.e;
import md.d;
import md.f;
import td.l;
import td.p;
import ud.k;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static v f22534a;

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void d(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static final void e(d<?> dVar, Throwable th) {
        dVar.g(e.a(th));
        throw th;
    }

    public static final y f(q0 q0Var) {
        y yVar = (y) q0Var.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (yVar != null) {
            return yVar;
        }
        k1 k1Var = new k1((w0) null);
        u uVar = g0.f13286a;
        Object e10 = q0Var.e("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new g(f.b.a.d(k1Var, n.f19394a.i0())));
        k.e(e10, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (y) e10;
    }

    public static final void g(f fVar, Throwable th) {
        try {
            int i10 = de.v.f13335k;
            de.v vVar = (de.v) fVar.get(v.a.f13336a);
            if (vVar == null) {
                x.a(fVar, th);
            } else {
                vVar.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                j.a(runtimeException, th);
                th = runtimeException;
            }
            x.a(fVar, th);
        }
    }

    public static void h(p pVar, Object obj, d dVar, l lVar, int i10) {
        try {
            ie.e.a(q.a.k(q.a.h(pVar, obj, dVar)), o.f20627a, (l<? super Throwable, o>) null);
        } catch (Throwable th) {
            dVar.g(e.a(th));
            throw th;
        }
    }

    public static int i(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }
}
