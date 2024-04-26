package l2;

import android.content.Context;
import androidx.work.impl.constraints.controllers.ConstraintController;
import g2.e;
import java.util.List;
import m2.b;
import m2.c;
import m2.f;
import m2.g;
import m2.h;
import o2.j;
import r2.a;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f21017d = e.e("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    public final c f21018a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintController<?>[] f21019b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f21020c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21018a = cVar;
        this.f21019b = new c[]{new m2.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new m2.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new m2.e(applicationContext, aVar)};
    }

    public boolean a(String str) {
        synchronized (this.f21020c) {
            for (c cVar : this.f21019b) {
                T t10 = cVar.f21490b;
                if (t10 != null && cVar.c(t10) && cVar.f21489a.contains(str)) {
                    e.c().a(f21017d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(List<j> list) {
        synchronized (this.f21020c) {
            for (c cVar : this.f21019b) {
                if (cVar.f21492d != null) {
                    cVar.f21492d = null;
                    cVar.e();
                }
            }
            for (c d10 : this.f21019b) {
                d10.d(list);
            }
            for (c cVar2 : this.f21019b) {
                if (cVar2.f21492d != this) {
                    cVar2.f21492d = this;
                    cVar2.e();
                }
            }
        }
    }

    public void c() {
        synchronized (this.f21020c) {
            for (c cVar : this.f21019b) {
                if (!cVar.f21489a.isEmpty()) {
                    cVar.f21489a.clear();
                    cVar.f21491c.b(cVar);
                }
            }
        }
    }
}
