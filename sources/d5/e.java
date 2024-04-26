package d5;

import d5.x;
import v6.e0;

/* compiled from: ConstantBitrateSeekMap */
public class e implements x {

    /* renamed from: a  reason: collision with root package name */
    public final long f13020a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13021b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13022c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13023d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13024e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13025f;

    public e(long j10, long j11, int i10, int i11) {
        this.f13020a = j10;
        this.f13021b = j11;
        this.f13022c = i11 == -1 ? 1 : i11;
        this.f13024e = i10;
        if (j10 == -1) {
            this.f13023d = -1;
            this.f13025f = -9223372036854775807L;
            return;
        }
        this.f13023d = j10 - j11;
        this.f13025f = e(j10, j11, i10);
    }

    public static long e(long j10, long j11, int i10) {
        return ((Math.max(0, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    public long a(long j10) {
        return e(j10, this.f13021b, this.f13024e);
    }

    public boolean b() {
        return this.f13023d != -1;
    }

    public long c() {
        return this.f13025f;
    }

    public x.a j(long j10) {
        long j11 = this.f13023d;
        if (j11 == -1) {
            return new x.a(new y(0, this.f13021b));
        }
        long j12 = (long) this.f13022c;
        long j13 = this.f13021b + e0.j((((((long) this.f13024e) * j10) / 8000000) / j12) * j12, 0, j11 - j12);
        long a10 = a(j13);
        y yVar = new y(a10, j13);
        if (a10 < j10) {
            int i10 = this.f13022c;
            if (((long) i10) + j13 < this.f13020a) {
                long j14 = j13 + ((long) i10);
                return new x.a(yVar, new y(a(j14), j14));
            }
        }
        return new x.a(yVar);
    }
}
