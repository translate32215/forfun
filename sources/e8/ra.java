package e8;

import u6.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ra {

    /* renamed from: a  reason: collision with root package name */
    public final f f16253a = new f();

    /* renamed from: b  reason: collision with root package name */
    public long f16254b = 15000000;

    /* renamed from: c  reason: collision with root package name */
    public long f16255c = 30000000;

    /* renamed from: d  reason: collision with root package name */
    public long f16256d = 2500000;

    /* renamed from: e  reason: collision with root package name */
    public long f16257e = 5000000;

    /* renamed from: f  reason: collision with root package name */
    public int f16258f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16259g;

    public final synchronized boolean a(long j10, boolean z10) {
        boolean z11;
        long j11 = z10 ? this.f16257e : this.f16256d;
        if (j11 <= 0 || j10 >= j11) {
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    public final void b() {
        d(false);
    }

    public final void c() {
        d(true);
    }

    public final void d(boolean z10) {
        this.f16258f = 0;
        this.f16259g = false;
        if (z10) {
            this.f16253a.b();
        }
    }
}
