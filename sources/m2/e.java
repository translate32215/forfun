package m2;

import android.content.Context;
import android.os.Build;
import androidx.work.c;
import l2.b;
import n2.g;
import o2.j;
import r2.a;

/* compiled from: NetworkMeteredController */
public class e extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f21493e = g2.e.e("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super((n2.e) g.k(context, aVar).f21852c);
    }

    public boolean b(j jVar) {
        return jVar.f22873j.f18394a == c.METERED;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            g2.e.c().a(f21493e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.f21013a;
        }
        if (bVar.f21013a && bVar.f21015c) {
            z10 = false;
        }
        return z10;
    }
}
