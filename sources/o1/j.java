package o1;

import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.Iterator;
import ud.k;
import w1.a;

public final /* synthetic */ class j implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22715a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22716b;

    public /* synthetic */ j(k kVar) {
        this.f22716b = kVar;
    }

    public /* synthetic */ j(a aVar) {
        this.f22716b = aVar;
    }

    public final void d(t tVar, o.b bVar) {
        switch (this.f22715a) {
            case 0:
                k kVar = (k) this.f22716b;
                k.f(kVar, "this$0");
                k.f(tVar, "<anonymous parameter 0>");
                k.f(bVar, "event");
                kVar.f22734r = bVar.a();
                if (kVar.f22719c != null) {
                    Iterator<h> it = kVar.f22723g.iterator();
                    while (it.hasNext()) {
                        h next = it.next();
                        next.getClass();
                        next.f22698d = bVar.a();
                        next.b();
                    }
                    return;
                }
                return;
            default:
                a aVar = (a) this.f22716b;
                k.f(aVar, "this$0");
                k.f(tVar, "<anonymous parameter 0>");
                k.f(bVar, "event");
                if (bVar == o.b.ON_START) {
                    aVar.f26865f = true;
                    return;
                } else if (bVar == o.b.ON_STOP) {
                    aVar.f26865f = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
