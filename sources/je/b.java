package je;

import androidx.appcompat.widget.p;
import de.p0;
import de.u;
import ie.f;
import ie.s;
import java.util.concurrent.Executor;
import md.g;
import ud.k;

/* compiled from: Dispatcher.kt */
public final class b extends p0 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final b f19765b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final u f19766c;

    static {
        m mVar = m.f19785b;
        int i10 = s.f19397a;
        int l10 = p.l("kotlinx.coroutines.io.parallelism", 64 < i10 ? i10 : 64, 0, 0, 12, (Object) null);
        mVar.getClass();
        boolean z10 = true;
        if (l10 < 1) {
            z10 = false;
        }
        if (z10) {
            f19766c = new f(mVar, l10);
            return;
        }
        throw new IllegalArgumentException(k.j("Expected positive parallelism level, but got ", Integer.valueOf(l10)).toString());
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        f19766c.f0(g.f21797a, runnable);
    }

    public void f0(md.f fVar, Runnable runnable) {
        f19766c.f0(fVar, runnable);
    }

    public void g0(md.f fVar, Runnable runnable) {
        f19766c.g0(fVar, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
