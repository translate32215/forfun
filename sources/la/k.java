package la;

import android.content.Context;
import sa.c;
import sa.f;
import ua.a;

public final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21210a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21211b;

    public /* synthetic */ k(Context context) {
        this.f21211b = context;
    }

    public /* synthetic */ k(g gVar) {
        this.f21211b = gVar;
    }

    public final Object get() {
        f fVar;
        switch (this.f21210a) {
            case 0:
                return (g) this.f21211b;
            default:
                Context context = (Context) this.f21211b;
                int i10 = c.f25185b;
                f fVar2 = f.f25187b;
                synchronized (f.class) {
                    if (f.f25187b == null) {
                        f.f25187b = new f(context);
                    }
                    fVar = f.f25187b;
                }
                return fVar;
        }
    }
}
