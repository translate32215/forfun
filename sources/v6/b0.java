package v6;

/* compiled from: TimestampAdjuster */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f26425a;

    /* renamed from: b  reason: collision with root package name */
    public long f26426b;

    /* renamed from: c  reason: collision with root package name */
    public long f26427c;

    /* renamed from: d  reason: collision with root package name */
    public long f26428d = -9223372036854775807L;

    public b0(long j10) {
        this.f26426b = j10;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f26428d != -9223372036854775807L) {
            this.f26428d = j10;
        } else {
            long j11 = this.f26426b;
            if (j11 != Long.MAX_VALUE) {
                this.f26427c = j11 - j10;
            }
            this.f26428d = j10;
            notifyAll();
        }
        return j10 + this.f26427c;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f26428d;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = (4294967296L + j12) / 8589934592L;
            long j14 = ((j13 - 1) * 8589934592L) + j10;
            j10 += j13 * 8589934592L;
            if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                j10 = j14;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public synchronized long c() {
        return this.f26426b;
    }

    public synchronized long d() {
        long j10;
        j10 = -9223372036854775807L;
        if (this.f26426b == Long.MAX_VALUE) {
            j10 = 0;
        } else if (this.f26428d != -9223372036854775807L) {
            j10 = this.f26427c;
        }
        return j10;
    }

    public synchronized void e(long j10) {
        this.f26426b = j10;
        this.f26428d = -9223372036854775807L;
        this.f26425a = false;
    }
}
