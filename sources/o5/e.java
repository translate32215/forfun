package o5;

import d5.x;
import d5.y;
import v6.e0;

/* compiled from: WavSeekMap */
public final class e implements x {

    /* renamed from: a  reason: collision with root package name */
    public final c f23009a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23010b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23011c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23012d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23013e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f23009a = cVar;
        this.f23010b = i10;
        this.f23011c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f23004d);
        this.f23012d = j12;
        this.f23013e = a(j12);
    }

    public final long a(long j10) {
        return e0.P(j10 * ((long) this.f23010b), 1000000, (long) this.f23009a.f23003c);
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f23013e;
    }

    public x.a j(long j10) {
        long j11 = e0.j((((long) this.f23009a.f23003c) * j10) / (((long) this.f23010b) * 1000000), 0, this.f23012d - 1);
        long j12 = (((long) this.f23009a.f23004d) * j11) + this.f23011c;
        long a10 = a(j11);
        y yVar = new y(a10, j12);
        if (a10 >= j10 || j11 == this.f23012d - 1) {
            return new x.a(yVar);
        }
        long j13 = j11 + 1;
        return new x.a(yVar, new y(a(j13), (((long) this.f23009a.f23004d) * j13) + this.f23011c));
    }
}
