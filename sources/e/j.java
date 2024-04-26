package e;

import android.widget.Toast;
import com.google.gson.n;
import de.a;
import de.d1;
import de.g0;
import de.j1;
import de.s;
import de.u;
import de.w0;
import de.y;
import ie.t;
import java.util.List;
import k8.i;
import k8.r;
import kd.o;
import md.e;
import md.f;
import md.g;
import pd.b;
import td.l;
import td.p;
import ud.k;
import ud.x;

public class j {
    public static final void a(Throwable th, Throwable th2) {
        k.f(th, "<this>");
        k.f(th2, "exception");
        if (th != th2) {
            b.f23986a.a(th, th2);
        }
    }

    public static w0 b(y yVar, f fVar, int i10, p pVar, int i11, Object obj) {
        a aVar;
        f fVar2;
        Object c10;
        if ((i11 & 1) != 0) {
            fVar = g.f21797a;
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        f a10 = s.a(yVar.i(), fVar, true);
        u uVar = g0.f13286a;
        if (a10 != uVar) {
            int i12 = e.X;
            if (a10.get(e.a.f21795a) == null) {
                a10 = a10.plus(uVar);
            }
        }
        t.g.h(i10);
        if (i10 == 2) {
            aVar = new d1(a10, pVar);
        } else {
            aVar = new j1(a10, true);
        }
        int f10 = t.g.f(i10);
        if (f10 == 0) {
            o.a.h(pVar, aVar, aVar, (l) null, 4);
        } else if (f10 != 1) {
            if (f10 == 2) {
                k.f(pVar, "<this>");
                q.a.k(q.a.h(pVar, aVar, aVar)).g(o.f20627a);
            } else if (f10 == 3) {
                try {
                    fVar2 = aVar.f13255b;
                    c10 = t.c(fVar2, (Object) null);
                    x.b(pVar, 2);
                    Object h10 = pVar.h(aVar, aVar);
                    t.a(fVar2, c10);
                    if (h10 != nd.a.COROUTINE_SUSPENDED) {
                        aVar.g(h10);
                    }
                } catch (Throwable th) {
                    aVar.g(l0.e.a(th));
                }
            } else {
                throw new n();
            }
        }
        return aVar;
    }

    public static String c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static void d(androidx.fragment.app.p pVar, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        Toast.makeText(pVar.h0(), str, i10).show();
    }

    public static k8.o e(k8.k kVar, k8.o oVar, n2.g gVar, List<k8.o> list) {
        r rVar = (r) oVar;
        if (kVar.h(rVar.f20445a)) {
            k8.o i10 = kVar.i(rVar.f20445a);
            if (i10 instanceof i) {
                return ((i) i10).b(gVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{rVar.f20445a}));
        } else if ("hasOwnProperty".equals(rVar.f20445a)) {
            x.f.n("hasOwnProperty", 1, list);
            if (kVar.h(gVar.y(list.get(0)).q())) {
                return k8.o.U;
            }
            return k8.o.V;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{rVar.f20445a}));
        }
    }
}
