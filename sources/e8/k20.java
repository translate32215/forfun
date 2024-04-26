package e8;

import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zzdzl;
import e.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class k20<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final p50<?> f15222d = yh.h(null);

    /* renamed from: a  reason: collision with root package name */
    public final o50 f15223a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f15224b;

    /* renamed from: c  reason: collision with root package name */
    public final m20<E> f15225c;

    public k20(o50 o50, ScheduledExecutorService scheduledExecutorService, m20<E> m20) {
        this.f15223a = o50;
        this.f15224b = scheduledExecutorService;
        this.f15225c = m20;
    }

    public final j8 a(E e10, zzdzl<?>... zzdzlArr) {
        return new j8(this, e10, Arrays.asList(zzdzlArr), (h) null);
    }

    public final <I> dv b(E e10, p50<I> p50) {
        return new dv(this, (Object) e10, (p50) p50, (List) Collections.singletonList(p50), (p50) p50);
    }

    public final c c(E e10) {
        return new c(this, e10, (h) null);
    }
}
