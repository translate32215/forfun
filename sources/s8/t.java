package s8;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import r7.m;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class t<TResult> implements w<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f25058a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f25059b = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public d<TResult> f25060c;

    public t(Executor executor, d<TResult> dVar) {
        this.f25058a = executor;
        this.f25060c = dVar;
    }

    public final void c(i<TResult> iVar) {
        synchronized (this.f25059b) {
            if (this.f25060c != null) {
                this.f25058a.execute(new m(this, (i) iVar));
            }
        }
    }
}
