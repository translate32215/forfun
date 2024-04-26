package x4;

import v6.a;
import v6.e0;

/* compiled from: SeekParameters */
public final class z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final z0 f27810c;

    /* renamed from: a  reason: collision with root package name */
    public final long f27811a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27812b;

    static {
        z0 z0Var = new z0(0, 0);
        new z0(Long.MAX_VALUE, Long.MAX_VALUE);
        new z0(Long.MAX_VALUE, 0);
        new z0(0, Long.MAX_VALUE);
        f27810c = z0Var;
    }

    public z0(long j10, long j11) {
        boolean z10 = true;
        a.a(j10 >= 0);
        a.a(j11 < 0 ? false : z10);
        this.f27811a = j10;
        this.f27812b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f27811a;
        if (j13 == 0 && this.f27812b == 0) {
            return j10;
        }
        long j14 = Long.MIN_VALUE;
        int i10 = e0.f26436a;
        long j15 = j10 - j13;
        if (((j13 ^ j10) & (j10 ^ j15)) >= 0) {
            j14 = j15;
        }
        long j16 = this.f27812b;
        long j17 = Long.MAX_VALUE;
        long j18 = j10 + j16;
        if (((j16 ^ j18) & (j10 ^ j18)) >= 0) {
            j17 = j18;
        }
        boolean z10 = false;
        boolean z11 = j14 <= j11 && j11 <= j17;
        if (j14 <= j12 && j12 <= j17) {
            z10 = true;
        }
        if (z11 && z10) {
            return Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
        }
        if (z11) {
            return j11;
        }
        return z10 ? j12 : j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f27811a == z0Var.f27811a && this.f27812b == z0Var.f27812b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f27811a) * 31) + ((int) this.f27812b);
    }
}
