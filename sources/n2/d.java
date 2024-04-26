package n2;

import android.content.Context;
import g2.e;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f21834f = e.e("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f21835a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f21836b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f21837c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Set<l2.a<T>> f21838d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public T f21839e;

    /* compiled from: ConstraintTracker */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f21840a;

        public a(List list) {
            this.f21840a = list;
        }

        public void run() {
            for (l2.a a10 : this.f21840a) {
                a10.a(d.this.f21839e);
            }
        }
    }

    public d(Context context, r2.a aVar) {
        this.f21836b = context.getApplicationContext();
        this.f21835a = aVar;
    }

    public abstract T a();

    public void b(l2.a<T> aVar) {
        synchronized (this.f21837c) {
            if (this.f21838d.remove(aVar) && this.f21838d.isEmpty()) {
                e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f21837c
            monitor-enter(r0)
            T r1 = r3.f21839e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f21839e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<l2.a<T>> r1 = r3.f21838d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            r2.a r1 = r3.f21835a     // Catch:{ all -> 0x002b }
            r2.b r1 = (r2.b) r1     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.f24502c     // Catch:{ all -> 0x002b }
            n2.d$a r2 = new n2.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.d.c(java.lang.Object):void");
    }

    public abstract void d();

    public abstract void e();
}
