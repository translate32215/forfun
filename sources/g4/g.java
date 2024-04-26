package g4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<T, a<Y>> f18458a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f18459b;

    /* renamed from: c  reason: collision with root package name */
    public long f18460c;

    /* compiled from: LruCache */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f18461a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18462b;

        public a(Y y10, int i10) {
            this.f18461a = y10;
            this.f18462b = i10;
        }
    }

    public g(long j10) {
        this.f18459b = j10;
    }

    public synchronized Y a(T t10) {
        a aVar;
        aVar = this.f18458a.get(t10);
        return aVar != null ? aVar.f18461a : null;
    }

    public int b(Y y10) {
        return 1;
    }

    public void c(T t10, Y y10) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y d(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f18459b     // Catch:{ all -> 0x004c }
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0012
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r5
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r3 = r7.f18460c     // Catch:{ all -> 0x004c }
            long r3 = r3 + r1
            r7.f18460c = r3     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.Map<T, g4.g$a<Y>> r1 = r7.f18458a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r5
            goto L_0x0024
        L_0x001f:
            g4.g$a r2 = new g4.g$a     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            g4.g$a r0 = (g4.g.a) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f18460c     // Catch:{ all -> 0x004c }
            int r3 = r0.f18462b     // Catch:{ all -> 0x004c }
            long r3 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r3
            r7.f18460c = r1     // Catch:{ all -> 0x004c }
            Y r1 = r0.f18461a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f18461a     // Catch:{ all -> 0x004c }
            r7.c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f18459b     // Catch:{ all -> 0x004c }
            r7.e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            Y r5 = r0.f18461a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r5
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.g.d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public synchronized void e(long j10) {
        while (this.f18460c > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f18458a.entrySet().iterator();
            Map.Entry next = it.next();
            a aVar = (a) next.getValue();
            this.f18460c -= (long) aVar.f18462b;
            Object key = next.getKey();
            it.remove();
            c(key, aVar.f18461a);
        }
    }
}
