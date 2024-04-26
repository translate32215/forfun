package d5;

import d5.x;
import java.io.IOException;
import v6.e0;

/* compiled from: BinarySearchSeeker */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0128a f12973a;

    /* renamed from: b  reason: collision with root package name */
    public final f f12974b;

    /* renamed from: c  reason: collision with root package name */
    public c f12975c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12976d;

    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* compiled from: BinarySearchSeeker */
    public static class C0128a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final d f12977a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12978b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12979c;

        /* renamed from: d  reason: collision with root package name */
        public final long f12980d;

        /* renamed from: e  reason: collision with root package name */
        public final long f12981e;

        /* renamed from: f  reason: collision with root package name */
        public final long f12982f;

        /* renamed from: g  reason: collision with root package name */
        public final long f12983g;

        public C0128a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f12977a = dVar;
            this.f12978b = j10;
            this.f12979c = j11;
            this.f12980d = j12;
            this.f12981e = j13;
            this.f12982f = j14;
            this.f12983g = j15;
        }

        public boolean b() {
            return true;
        }

        public long c() {
            return this.f12978b;
        }

        public x.a j(long j10) {
            return new x.a(new y(j10, c.a(this.f12977a.b(j10), this.f12979c, this.f12980d, this.f12981e, this.f12982f, this.f12983g)));
        }
    }

    /* compiled from: BinarySearchSeeker */
    public static final class b implements d {
        public long b(long j10) {
            return j10;
        }
    }

    /* compiled from: BinarySearchSeeker */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f12984a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12985b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12986c;

        /* renamed from: d  reason: collision with root package name */
        public long f12987d;

        /* renamed from: e  reason: collision with root package name */
        public long f12988e;

        /* renamed from: f  reason: collision with root package name */
        public long f12989f;

        /* renamed from: g  reason: collision with root package name */
        public long f12990g;

        /* renamed from: h  reason: collision with root package name */
        public long f12991h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f12984a = j10;
            this.f12985b = j11;
            this.f12987d = j12;
            this.f12988e = j13;
            this.f12989f = j14;
            this.f12990g = j15;
            this.f12986c = j16;
            this.f12991h = a(j11, j12, j13, j14, j15, j16);
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) (((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11))));
            return e0.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }
    }

    /* compiled from: BinarySearchSeeker */
    public interface d {
        long b(long j10);
    }

    /* compiled from: BinarySearchSeeker */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f12992d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f12993a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12994b;

        /* renamed from: c  reason: collision with root package name */
        public final long f12995c;

        public e(int i10, long j10, long j11) {
            this.f12993a = i10;
            this.f12994b = j10;
            this.f12995c = j11;
        }

        public static e a(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e b(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e c(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* compiled from: BinarySearchSeeker */
    public interface f {
        e a(j jVar, long j10) throws IOException;

        void b();
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f12974b = fVar;
        this.f12976d = i10;
        this.f12973a = new C0128a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public int a(j jVar, w wVar) throws IOException {
        j jVar2 = jVar;
        w wVar2 = wVar;
        while (true) {
            c cVar = this.f12975c;
            v6.a.f(cVar);
            long j10 = cVar.f12989f;
            long j11 = cVar.f12990g;
            long j12 = cVar.f12991h;
            if (j11 - j10 <= ((long) this.f12976d)) {
                c(false, j10);
                return d(jVar2, j10, wVar2);
            } else if (!f(jVar2, j12)) {
                return d(jVar2, j12, wVar2);
            } else {
                jVar.f();
                e a10 = this.f12974b.a(jVar2, cVar.f12985b);
                int i10 = a10.f12993a;
                if (i10 == -3) {
                    c(false, j12);
                    return d(jVar2, j12, wVar2);
                } else if (i10 == -2) {
                    long j13 = a10.f12994b;
                    long j14 = a10.f12995c;
                    cVar.f12987d = j13;
                    cVar.f12989f = j14;
                    cVar.f12991h = c.a(cVar.f12985b, j13, cVar.f12988e, j14, cVar.f12990g, cVar.f12986c);
                } else if (i10 == -1) {
                    long j15 = a10.f12994b;
                    long j16 = a10.f12995c;
                    cVar.f12988e = j15;
                    cVar.f12990g = j16;
                    cVar.f12991h = c.a(cVar.f12985b, cVar.f12987d, j15, cVar.f12989f, j16, cVar.f12986c);
                } else if (i10 == 0) {
                    f(jVar2, a10.f12995c);
                    c(true, a10.f12995c);
                    return d(jVar2, a10.f12995c, wVar2);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean b() {
        return this.f12975c != null;
    }

    public final void c(boolean z10, long j10) {
        this.f12975c = null;
        this.f12974b.b();
    }

    public final int d(j jVar, long j10, w wVar) {
        if (j10 == jVar.l()) {
            return 0;
        }
        wVar.f13063a = j10;
        return 1;
    }

    public final void e(long j10) {
        long j11 = j10;
        c cVar = this.f12975c;
        if (cVar == null || cVar.f12984a != j11) {
            long b10 = this.f12973a.f12977a.b(j11);
            C0128a aVar = this.f12973a;
            c cVar2 = r1;
            c cVar3 = new c(j10, b10, aVar.f12979c, aVar.f12980d, aVar.f12981e, aVar.f12982f, aVar.f12983g);
            this.f12975c = cVar2;
        }
    }

    public final boolean f(j jVar, long j10) throws IOException {
        long l10 = j10 - jVar.l();
        if (l10 < 0 || l10 > 262144) {
            return false;
        }
        jVar.g((int) l10);
        return true;
    }
}
