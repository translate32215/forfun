package i6;

import a5.e;
import a5.h;
import h6.f;
import h6.g;
import h6.i;
import h6.j;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import v6.e0;

/* compiled from: CeaDecoder */
public abstract class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<b> f19314a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<j> f19315b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue<b> f19316c;

    /* renamed from: d  reason: collision with root package name */
    public b f19317d;

    /* renamed from: e  reason: collision with root package name */
    public long f19318e;

    /* renamed from: f  reason: collision with root package name */
    public long f19319f;

    /* compiled from: CeaDecoder */
    public static final class b extends i implements Comparable<b> {

        /* renamed from: r  reason: collision with root package name */
        public long f19320r;

        public b() {
        }

        public int compareTo(Object obj) {
            b bVar = (b) obj;
            if (r() == bVar.r()) {
                long j10 = this.f88e - bVar.f88e;
                if (j10 == 0) {
                    j10 = this.f19320r - bVar.f19320r;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
            } else if (r()) {
                return 1;
            }
            return -1;
        }

        public b(a aVar) {
        }
    }

    /* compiled from: CeaDecoder */
    public static final class c extends j {

        /* renamed from: e  reason: collision with root package name */
        public h.a<c> f19321e;

        public c(h.a<c> aVar) {
            this.f19321e = aVar;
        }

        public final void t() {
            this.f19321e.h(this);
        }
    }

    public d() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f19314a.add(new b((a) null));
        }
        this.f19315b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f19315b.add(new c(new r1.c(this)));
        }
        this.f19316c = new PriorityQueue<>();
    }

    public void a() {
    }

    public void b(long j10) {
        this.f19318e = j10;
    }

    public void c(Object obj) throws e {
        i iVar = (i) obj;
        v6.a.a(iVar == this.f19317d);
        b bVar = (b) iVar;
        if (bVar.q()) {
            j(bVar);
        } else {
            long j10 = this.f19319f;
            this.f19319f = 1 + j10;
            bVar.f19320r = j10;
            this.f19316c.add(bVar);
        }
        this.f19317d = null;
    }

    public Object e() throws e {
        v6.a.d(this.f19317d == null);
        if (this.f19314a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f19314a.pollFirst();
        this.f19317d = pollFirst;
        return pollFirst;
    }

    public abstract h6.e f();

    public void flush() {
        this.f19319f = 0;
        this.f19318e = 0;
        while (!this.f19316c.isEmpty()) {
            int i10 = e0.f26436a;
            j(this.f19316c.poll());
        }
        b bVar = this.f19317d;
        if (bVar != null) {
            j(bVar);
            this.f19317d = null;
        }
    }

    public abstract void g(i iVar);

    /* renamed from: h */
    public j d() throws g {
        if (this.f19315b.isEmpty()) {
            return null;
        }
        while (!this.f19316c.isEmpty()) {
            int i10 = e0.f26436a;
            if (this.f19316c.peek().f88e > this.f19318e) {
                break;
            }
            b poll = this.f19316c.poll();
            if (poll.r()) {
                j pollFirst = this.f19315b.pollFirst();
                pollFirst.i(4);
                j(poll);
                return pollFirst;
            }
            g(poll);
            if (i()) {
                h6.e f10 = f();
                j pollFirst2 = this.f19315b.pollFirst();
                pollFirst2.v(poll.f88e, f10, Long.MAX_VALUE);
                j(poll);
                return pollFirst2;
            }
            j(poll);
        }
        return null;
    }

    public abstract boolean i();

    public final void j(b bVar) {
        bVar.t();
        this.f19314a.add(bVar);
    }
}
