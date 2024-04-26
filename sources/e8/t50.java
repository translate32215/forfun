package e8;

import com.google.android.gms.internal.ads.bi;
import com.google.android.gms.internal.ads.hi;
import com.google.android.gms.internal.ads.ii;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.vh;
import e.g;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class t50<V> extends vh<V> implements RunnableFuture<V> {

    /* renamed from: h  reason: collision with root package name */
    public volatile bi<?> f16707h;

    public t50(Callable<V> callable) {
        this.f16707h = new hi(this, callable);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    public final void c() {
        bi<?> biVar;
        if (l() && (biVar = this.f16707h) != null) {
            biVar.a();
        }
        this.f16707h = null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [e8.t50, com.google.android.gms.internal.ads.gh] */
    public final String h() {
        bi<?> biVar = this.f16707h;
        if (biVar == null) {
            return t50.super.h();
        }
        String valueOf = String.valueOf(biVar);
        return g.a(valueOf.length() + 7, "task=[", valueOf, "]");
    }

    public final void run() {
        bi<?> biVar = this.f16707h;
        if (biVar != null) {
            biVar.run();
        }
        this.f16707h = null;
    }

    public t50(ph<V> phVar) {
        this.f16707h = new ii(this, phVar);
    }
}
