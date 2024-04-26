package q3;

import g4.g;
import g4.j;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ModelCache */
public class l<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final g<b<A>, B> f24099a;

    /* compiled from: ModelCache */
    public class a extends g<b<A>, B> {
        public a(l lVar, long j10) {
            super(j10);
        }

        public void c(Object obj, Object obj2) {
            ((b) obj).b();
        }
    }

    /* compiled from: ModelCache */
    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<b<?>> f24100d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f24101a;

        /* renamed from: b  reason: collision with root package name */
        public int f24102b;

        /* renamed from: c  reason: collision with root package name */
        public A f24103c;

        static {
            char[] cArr = j.f18467a;
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 116 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <A> q3.l.b<A> a(A r2, int r3, int r4) {
            /*
                java.util.Queue<q3.l$b<?>> r0 = f24100d
                monitor-enter(r0)
                r1 = r0
                java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x001d }
                java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x001d }
                q3.l$b r1 = (q3.l.b) r1     // Catch:{ all -> 0x001d }
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                if (r1 != 0) goto L_0x0014
                q3.l$b r1 = new q3.l$b
                r1.<init>()
            L_0x0014:
                r1.f24103c = r2
                r1.f24102b = r3
                r1.f24101a = r4
                return r1
            L_0x001b:
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                throw r2
            L_0x001d:
                r2 = move-exception
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: q3.l.b.a(java.lang.Object, int, int):q3.l$b");
        }

        public void b() {
            Queue<b<?>> queue = f24100d;
            synchronized (queue) {
                ((ArrayDeque) queue).offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24102b == bVar.f24102b && this.f24101a == bVar.f24101a && this.f24103c.equals(bVar.f24103c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f24103c.hashCode() + (((this.f24101a * 31) + this.f24102b) * 31);
        }
    }

    public l(long j10) {
        this.f24099a = new a(this, j10);
    }
}
