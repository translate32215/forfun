package c6;

import d6.h;
import v6.e0;
import z7.b;

/* compiled from: DashWrappingSegmentIndex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4357a;

    /* renamed from: b  reason: collision with root package name */
    public long f4358b;

    public d(b bVar) {
        if (bVar != null) {
            this.f4357a = bVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public int B(long j10) {
        return ((d5.d) this.f4357a).f13014a;
    }

    public int C(long j10, long j11) {
        return ((d5.d) this.f4357a).f13014a;
    }

    public long d(long j10) {
        return ((d5.d) this.f4357a).f13018e[(int) j10] - this.f4358b;
    }

    public long h(long j10, long j11) {
        return (long) e0.f(((d5.d) this.f4357a).f13018e, j10 + this.f4358b, true, true);
    }

    public long l(long j10, long j11) {
        return ((d5.d) this.f4357a).f13017d[(int) j10];
    }

    public long n(long j10, long j11) {
        return 0;
    }

    public long t(long j10, long j11) {
        return -9223372036854775807L;
    }

    public h u(long j10) {
        Object obj = this.f4357a;
        int i10 = (int) j10;
        return new h((String) null, ((d5.d) obj).f13016c[i10], (long) ((d5.d) obj).f13015b[i10]);
    }

    public boolean w() {
        return true;
    }

    public long x() {
        return 0;
    }

    public d(d5.d dVar, long j10) {
        this.f4357a = dVar;
        this.f4358b = j10;
    }
}
