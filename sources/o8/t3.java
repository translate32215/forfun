package o8;

import com.google.android.gms.measurement.internal.k;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class t3<V> extends FutureTask<V> implements Comparable<t3<V>> {

    /* renamed from: a  reason: collision with root package name */
    public final long f23445a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23446b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23447c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f23448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t3(k kVar, Runnable runnable, boolean z10, String str) {
        super(runnable, (Object) null);
        this.f23448d = kVar;
        long andIncrement = k.f8828k.getAndIncrement();
        this.f23445a = andIncrement;
        this.f23447c = str;
        this.f23446b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            kVar.f8864a.d().f8797f.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        t3 t3Var = (t3) obj;
        boolean z10 = this.f23446b;
        if (z10 != t3Var.f23446b) {
            return !z10 ? 1 : -1;
        }
        long j10 = this.f23445a;
        long j11 = t3Var.f23445a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f23448d.f8864a.d().f8798g.b("Two tasks share the same index. index", Long.valueOf(this.f23445a));
        return 0;
    }

    public final void setException(Throwable th) {
        this.f23448d.f8864a.d().f8797f.b(this.f23447c, th);
        super.setException(th);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.measurement.internal.n, com.google.android.gms.measurement.internal.k, java.util.concurrent.Callable<V>] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.concurrent.Callable, boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.String, boolean] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t3(java.util.concurrent.Callable<V> r4, boolean r5, java.lang.String r6) {
        /*
            r3 = this;
            r3.f23448d = r4
            r3.<init>(r5)
            java.util.concurrent.atomic.AtomicLong r5 = com.google.android.gms.measurement.internal.k.f8828k
            long r0 = r5.getAndIncrement()
            r3.f23445a = r0
            java.lang.String r5 = "Task exception on worker thread"
            r3.f23447c = r5
            r3.f23446b = r6
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0029
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8797f
            java.lang.String r5 = "Tasks index overflow"
            r4.a(r5)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.t3.<init>(com.google.android.gms.measurement.internal.k, java.util.concurrent.Callable, boolean):void");
    }
}
