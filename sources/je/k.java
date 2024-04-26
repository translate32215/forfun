package je;

import android.support.v4.media.a;
import de.a0;

/* compiled from: Tasks.kt */
public final class k extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f19777c;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f19777c = runnable;
    }

    public void run() {
        try {
            this.f19777c.run();
        } finally {
            this.f19775b.a();
        }
    }

    public String toString() {
        StringBuilder a10 = a.a("Task[");
        a10.append(a0.b(this.f19777c));
        a10.append('@');
        a10.append(a0.c(this.f19777c));
        a10.append(", ");
        a10.append(this.f19774a);
        a10.append(", ");
        a10.append(this.f19775b);
        a10.append(']');
        return a10.toString();
    }
}
