package s8;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class v<TResult> implements w<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f25064a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f25065b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public f<? super TResult> f25066c;

    public v(Executor executor, f<? super TResult> fVar) {
        this.f25064a = executor;
        this.f25066c = fVar;
    }

    public final void c(i<TResult> iVar) {
        if (iVar.l()) {
            synchronized (this.f25065b) {
                if (this.f25066c != null) {
                    this.f25064a.execute(new r(this, (i) iVar));
                }
            }
        }
    }
}
