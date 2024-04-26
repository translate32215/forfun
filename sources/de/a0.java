package de;

import android.app.Activity;
import e8.h4;
import e8.q2;
import f7.r;
import kd.h;
import l0.e;
import md.d;
import z3.j;

/* compiled from: DebugStrings.kt */
public final class a0 implements j, r {
    public a0(int i10) {
    }

    public static final String b(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String d(d<?> dVar) {
        String str;
        if (dVar instanceof ie.d) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + c(dVar);
        } catch (Throwable th) {
            str = e.a(th);
        }
        Throwable a10 = h.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + c(dVar);
        }
        return (String) str2;
    }

    public void a(Activity activity) {
    }

    public /* synthetic */ void m(Object obj) {
        h4 h4Var = (h4) obj;
        h4Var.r("/log", q2.f16068h);
        h4Var.r("/result", q2.f16076p);
    }
}
