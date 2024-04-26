package o1;

import android.os.Bundle;
import android.support.v4.media.a;
import java.util.List;
import ld.h;
import o1.d0;
import q.b;
import ud.k;

@d0.b("navigation")
/* compiled from: NavGraphNavigator.kt */
public class u extends d0<t> {

    /* renamed from: c  reason: collision with root package name */
    public final e0 f22822c;

    public u(e0 e0Var) {
        k.f(e0Var, "navigatorProvider");
        this.f22822c = e0Var;
    }

    public r a() {
        return new t(this);
    }

    public void d(List<h> list, x xVar, d0.a aVar) {
        String str;
        r rVar;
        k.f(list, "entries");
        for (h next : list) {
            t tVar = (t) next.f22696b;
            Bundle bundle = next.f22697c;
            int i10 = tVar.f22815t;
            String str2 = tVar.f22817v;
            if (!((i10 == 0 && str2 == null) ? false : true)) {
                StringBuilder a10 = a.a("no start destination defined via app:startDestination for ");
                int i11 = tVar.f22806h;
                if (i11 != 0) {
                    str = tVar.f22801c;
                    if (str == null) {
                        str = String.valueOf(i11);
                    }
                } else {
                    str = "the root navigation";
                }
                a10.append(str);
                throw new IllegalStateException(a10.toString().toString());
            }
            if (str2 != null) {
                rVar = tVar.E(str2, false);
            } else {
                rVar = tVar.C(i10, false);
            }
            if (rVar == null) {
                if (tVar.f22816u == null) {
                    String str3 = tVar.f22817v;
                    if (str3 == null) {
                        str3 = String.valueOf(tVar.f22815t);
                    }
                    tVar.f22816u = str3;
                }
                String str4 = tVar.f22816u;
                k.c(str4);
                throw new IllegalArgumentException(b.a("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            this.f22822c.c(rVar.f22799a).d(h.c(b().a(rVar, rVar.f(bundle))), xVar, aVar);
        }
    }
}
