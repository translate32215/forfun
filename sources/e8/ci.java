package e8;

import android.content.Context;
import b6.g;
import com.google.android.gms.internal.ads.qe;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ci implements bj, pj {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14143a;

    /* renamed from: b  reason: collision with root package name */
    public final qe f14144b;

    /* renamed from: c  reason: collision with root package name */
    public final o6 f14145c;

    public ci(Context context, qe qeVar, o6 o6Var) {
        this.f14143a = context;
        this.f14144b = qeVar;
        this.f14145c = o6Var;
    }

    public final void l(Context context) {
    }

    public final void m(Context context) {
        this.f14145c.a();
    }

    public final void v() {
        g gVar = this.f14144b.X;
        if (gVar != null && gVar.f3599b) {
            ArrayList arrayList = new ArrayList();
            if (!((String) this.f14144b.X.f3598a).isEmpty()) {
                arrayList.add((String) this.f14144b.X.f3598a);
            }
            this.f14145c.b(this.f14143a, arrayList);
        }
    }

    public final void w(Context context) {
    }
}
