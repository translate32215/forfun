package j5;

import d5.x;
import d5.y;
import v6.a;
import v6.e0;

/* compiled from: XingSeeker */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long f19564a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19565b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19566c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19567d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19568e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f19569f;

    public g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f19564a = j10;
        this.f19565b = i10;
        this.f19566c = j11;
        this.f19569f = jArr;
        this.f19567d = j12;
        this.f19568e = j12 != -1 ? j10 + j12 : -1;
    }

    public boolean b() {
        return this.f19569f != null;
    }

    public long c() {
        return this.f19566c;
    }

    public long d(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.f19564a;
        if (!b() || j12 <= ((long) this.f19565b)) {
            return 0;
        }
        long[] jArr = this.f19569f;
        a.f(jArr);
        double d11 = (double) j12;
        Double.isNaN(d11);
        Double.isNaN(d11);
        double d12 = (double) this.f19567d;
        Double.isNaN(d12);
        Double.isNaN(d12);
        double d13 = (d11 * 256.0d) / d12;
        int f10 = e0.f(jArr, (long) d13, true, true);
        long j13 = this.f19566c;
        long j14 = (((long) f10) * j13) / 100;
        long j15 = jArr[f10];
        int i10 = f10 + 1;
        long j16 = (j13 * ((long) i10)) / 100;
        if (f10 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i10];
        }
        if (j15 == j11) {
            d10 = 0.0d;
        } else {
            double d14 = (double) j15;
            Double.isNaN(d14);
            Double.isNaN(d14);
            double d15 = (double) (j11 - j15);
            Double.isNaN(d15);
            Double.isNaN(d15);
            d10 = (d13 - d14) / d15;
        }
        double d16 = (double) (j16 - j14);
        Double.isNaN(d16);
        Double.isNaN(d16);
        return Math.round(d10 * d16) + j14;
    }

    public long g() {
        return this.f19568e;
    }

    public x.a j(long j10) {
        double d10;
        if (!b()) {
            return new x.a(new y(0, this.f19564a + ((long) this.f19565b)));
        }
        long j11 = e0.j(j10, 0, this.f19566c);
        double d11 = (double) j11;
        Double.isNaN(d11);
        double d12 = (double) this.f19566c;
        Double.isNaN(d12);
        double d13 = (d11 * 100.0d) / d12;
        double d14 = 0.0d;
        if (d13 > 0.0d) {
            if (d13 >= 100.0d) {
                d14 = 256.0d;
            } else {
                int i10 = (int) d13;
                long[] jArr = this.f19569f;
                a.f(jArr);
                long[] jArr2 = jArr;
                double d15 = (double) jArr2[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr2[i10 + 1];
                }
                double d16 = (double) i10;
                Double.isNaN(d16);
                Double.isNaN(d15);
                Double.isNaN(d15);
                d14 = d15 + ((d10 - d15) * (d13 - d16));
            }
        }
        double d17 = (double) this.f19567d;
        Double.isNaN(d17);
        return new x.a(new y(j11, this.f19564a + e0.j(Math.round((d14 / 256.0d) * d17), (long) this.f19565b, this.f19567d - 1)));
    }
}
