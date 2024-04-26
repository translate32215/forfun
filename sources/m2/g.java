package m2;

import android.content.Context;
import androidx.work.c;
import l2.b;
import n2.e;
import o2.j;
import r2.a;

/* compiled from: NetworkUnmeteredController */
public class g extends c<b> {
    public g(Context context, a aVar) {
        super((e) n2.g.k(context, aVar).f21852c);
    }

    public boolean b(j jVar) {
        return jVar.f22873j.f18394a == c.UNMETERED;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        return !bVar.f21013a || bVar.f21015c;
    }
}
