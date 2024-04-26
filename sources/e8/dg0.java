package e8;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dg0 implements zf0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14269a;

    /* renamed from: b  reason: collision with root package name */
    public long f14270b;

    /* renamed from: c  reason: collision with root package name */
    public long f14271c;

    /* renamed from: d  reason: collision with root package name */
    public dc0 f14272d = dc0.f14249d;

    public final dc0 a() {
        return this.f14272d;
    }

    public final dc0 b(dc0 dc0) {
        if (this.f14269a) {
            e(d());
        }
        this.f14272d = dc0;
        return dc0;
    }

    public final void c(zf0 zf0) {
        e(zf0.d());
        this.f14272d = zf0.a();
    }

    public final long d() {
        long j10 = this.f14270b;
        if (!this.f14269a) {
            return j10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f14271c;
        dc0 dc0 = this.f14272d;
        if (dc0.f14250a == 1.0f) {
            return j10 + sb0.b(elapsedRealtime);
        }
        return j10 + (elapsedRealtime * ((long) dc0.f14252c));
    }

    public final void e(long j10) {
        this.f14270b = j10;
        if (this.f14269a) {
            this.f14271c = SystemClock.elapsedRealtime();
        }
    }
}
