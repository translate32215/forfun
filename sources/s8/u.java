package s8;

import f7.j0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class u<TResult> implements w<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f25061a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f25062b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public e f25063c;

    public u(Executor executor, e eVar) {
        this.f25061a = executor;
        this.f25063c = eVar;
    }

    public final void c(i<TResult> iVar) {
        if (!iVar.l() && !iVar.j()) {
            synchronized (this.f25062b) {
                if (this.f25063c != null) {
                    this.f25061a.execute(new j0(this, (i) iVar));
                }
            }
        }
    }
}
