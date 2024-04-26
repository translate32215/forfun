package s8;

import e8.s30;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class s<TResult> implements w<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f25055a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f25056b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public c f25057c;

    public s(Executor executor, c cVar) {
        this.f25055a = executor;
        this.f25057c = cVar;
    }

    public final void c(i<TResult> iVar) {
        if (iVar.j()) {
            synchronized (this.f25056b) {
                if (this.f25057c != null) {
                    this.f25055a.execute(new s30(this));
                }
            }
        }
    }
}
