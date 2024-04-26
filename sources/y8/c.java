package y8;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.WeakHashMap;
import l9.u;
import o0.c0;
import o0.o0;

/* compiled from: BottomNavigationView */
public class c implements u.b {
    public c(BottomNavigationView bottomNavigationView) {
    }

    public o0 a(View view, o0 o0Var, u.c cVar) {
        cVar.f21182d = o0Var.c() + cVar.f21182d;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z10 = true;
        if (c0.e.d(view) != 1) {
            z10 = false;
        }
        int d10 = o0Var.d();
        int e10 = o0Var.e();
        int i10 = cVar.f21179a + (z10 ? e10 : d10);
        cVar.f21179a = i10;
        int i11 = cVar.f21181c;
        if (!z10) {
            d10 = e10;
        }
        int i12 = i11 + d10;
        cVar.f21181c = i12;
        c0.e.k(view, i10, cVar.f21180b, i12, cVar.f21182d);
        return o0Var;
    }
}
