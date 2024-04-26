package j5;

import android.util.Pair;
import d5.x;
import d5.y;
import v6.e0;
import x4.f;

/* compiled from: MlltSeeker */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f19536a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f19537b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19538c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f19536a = jArr;
        this.f19537b = jArr2;
        this.f19538c = j10 == -9223372036854775807L ? f.b(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int f10 = e0.f(jArr, j10, true, true);
        long j11 = jArr[f10];
        long j12 = jArr2[f10];
        int i10 = f10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            double d11 = (double) j10;
            double d12 = (double) j11;
            Double.isNaN(d11);
            Double.isNaN(d12);
            double d13 = (double) (j13 - j11);
            Double.isNaN(d13);
            d10 = (d11 - d12) / d13;
        }
        double d14 = (double) (j14 - j12);
        Double.isNaN(d14);
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * d14)) + j12));
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f19538c;
    }

    public long d(long j10) {
        return f.b(((Long) a(j10, this.f19536a, this.f19537b).second).longValue());
    }

    public long g() {
        return -1;
    }

    public x.a j(long j10) {
        Pair<Long, Long> a10 = a(f.c(e0.j(j10, 0, this.f19538c)), this.f19537b, this.f19536a);
        return new x.a(new y(f.b(((Long) a10.first).longValue()), ((Long) a10.second).longValue()));
    }
}
