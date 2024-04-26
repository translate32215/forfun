package e8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import f7.e0;
import java.util.concurrent.Executor;
import m8.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i9 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14999a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15000b;

    public i9(int i10) {
        this.f14999a = i10;
        if (i10 != 1) {
            this.f15000b = new e0(Looper.getMainLooper());
        } else {
            this.f15000b = new a(Looper.getMainLooper());
        }
    }

    public final void execute(Runnable runnable) {
        switch (this.f14999a) {
            case 0:
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    try {
                        runnable.run();
                        return;
                    } catch (Throwable th) {
                        p pVar = l.B.f13186c;
                        p.g(l.B.f13190g.f8584e, th);
                        throw th;
                    }
                } else {
                    this.f15000b.post(runnable);
                    return;
                }
            default:
                this.f15000b.post(runnable);
                return;
        }
    }
}
