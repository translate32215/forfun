package r1;

import android.os.Bundle;
import android.view.MenuItem;
import com.startapp.startappsdk.R;
import java.util.Iterator;
import java.util.Set;
import o1.a;
import o1.r;
import o1.t;
import o1.x;
import ud.k;

/* compiled from: NavigationUI.kt */
public final class e {
    public static final boolean a(r rVar, int i10) {
        boolean z10;
        r rVar2 = r.f22798r;
        Iterator<r> it = r.s(rVar).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().f22806h == i10) {
                z10 = true;
                continue;
            }
        } while (!z10);
        return true;
    }

    public static final boolean b(r rVar, Set<Integer> set) {
        k.f(set, "destinationIds");
        r rVar2 = r.f22798r;
        for (r rVar3 : r.s(rVar)) {
            if (set.contains(Integer.valueOf(rVar3.f22806h))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(MenuItem menuItem, o1.k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        r g10 = kVar.g();
        k.c(g10);
        t tVar = g10.f22800b;
        k.c(tVar);
        if (tVar.B(menuItem.getItemId()) instanceof a.C0200a) {
            i13 = R.anim.nav_default_enter_anim;
            i12 = R.anim.nav_default_exit_anim;
            i11 = R.anim.nav_default_pop_enter_anim;
            i10 = R.anim.nav_default_pop_exit_anim;
        } else {
            i13 = R.animator.nav_default_enter_anim;
            i12 = R.animator.nav_default_exit_anim;
            i11 = R.animator.nav_default_pop_enter_anim;
            i10 = R.animator.nav_default_pop_exit_anim;
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            i14 = t.F(kVar.i()).f22806h;
            z10 = true;
        } else {
            i14 = -1;
            z10 = false;
        }
        try {
            kVar.l(menuItem.getItemId(), (Bundle) null, new x(true, true, i14, false, z10, i13, i12, i11, i10));
            r g11 = kVar.g();
            return g11 != null && a(g11, menuItem.getItemId());
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
