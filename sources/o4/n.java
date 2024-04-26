package o4;

import android.content.Context;
import androidx.activity.f;
import o4.c;
import r4.c;
import s4.h;
import s4.j;
import v4.a;

/* compiled from: TransportRuntime */
public class n implements m {

    /* renamed from: e  reason: collision with root package name */
    public static volatile o f22962e;

    /* renamed from: a  reason: collision with root package name */
    public final a f22963a;

    /* renamed from: b  reason: collision with root package name */
    public final a f22964b;

    /* renamed from: c  reason: collision with root package name */
    public final c f22965c;

    /* renamed from: d  reason: collision with root package name */
    public final h f22966d;

    public n(a aVar, a aVar2, c cVar, h hVar, j jVar) {
        this.f22963a = aVar;
        this.f22964b = aVar2;
        this.f22965c = cVar;
        this.f22966d = hVar;
        jVar.f24951a.execute(new f(jVar));
    }

    public static n a() {
        o oVar = f22962e;
        if (oVar != null) {
            return ((c) oVar).f22946e.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f22962e == null) {
            synchronized (n.class) {
                if (f22962e == null) {
                    context.getClass();
                    Class<Context> cls = Context.class;
                    f22962e = new c(context, (c.a) null);
                }
            }
        }
    }
}
