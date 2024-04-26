package x4;

import v6.e0;
import z5.r;

/* compiled from: MediaPeriodInfo */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final r.a f27590a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27591b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27592c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27593d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27594e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27595f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27596g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27597h;

    public h0(r.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12) {
        this.f27590a = aVar;
        this.f27591b = j10;
        this.f27592c = j11;
        this.f27593d = j12;
        this.f27594e = j13;
        this.f27595f = z10;
        this.f27596g = z11;
        this.f27597h = z12;
    }

    public h0 a(long j10) {
        if (j10 == this.f27592c) {
            return this;
        }
        return new h0(this.f27590a, this.f27591b, j10, this.f27593d, this.f27594e, this.f27595f, this.f27596g, this.f27597h);
    }

    public h0 b(long j10) {
        if (j10 == this.f27591b) {
            return this;
        }
        return new h0(this.f27590a, j10, this.f27592c, this.f27593d, this.f27594e, this.f27595f, this.f27596g, this.f27597h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f27591b == h0Var.f27591b && this.f27592c == h0Var.f27592c && this.f27593d == h0Var.f27593d && this.f27594e == h0Var.f27594e && this.f27595f == h0Var.f27595f && this.f27596g == h0Var.f27596g && this.f27597h == h0Var.f27597h && e0.a(this.f27590a, h0Var.f27590a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.f27590a.hashCode() + 527) * 31) + ((int) this.f27591b)) * 31) + ((int) this.f27592c)) * 31) + ((int) this.f27593d)) * 31) + ((int) this.f27594e)) * 31) + (this.f27595f ? 1 : 0)) * 31) + (this.f27596g ? 1 : 0)) * 31) + (this.f27597h ? 1 : 0);
    }
}
