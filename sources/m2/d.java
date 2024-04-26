package m2;

import android.content.Context;
import android.os.Build;
import androidx.work.c;
import l2.b;
import n2.e;
import n2.g;
import o2.j;
import r2.a;

/* compiled from: NetworkConnectedController */
public class d extends c<b> {
    public d(Context context, a aVar) {
        super((e) g.k(context, aVar).f21852c);
    }

    public boolean b(j jVar) {
        return jVar.f22873j.f18394a == c.CONNECTED;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        if (Build.VERSION.SDK_INT < 26) {
            return true ^ bVar.f21013a;
        }
        if (!bVar.f21013a || !bVar.f21014b) {
            return true;
        }
        return false;
    }
}
