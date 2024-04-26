package e8;

import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ze0 extends gc0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f17736d = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f17737b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17738c;

    public ze0(long j10, boolean z10) {
        this.f17737b = j10;
        this.f17738c = j10;
    }

    public final hc0 d(int i10, hc0 hc0, boolean z10, long j10) {
        a.i(i10, 1);
        long j11 = this.f17738c;
        hc0.getClass();
        hc0.f14894a = j11;
        return hc0;
    }

    public final ic0 e(int i10, ic0 ic0, boolean z10) {
        a.i(i10, 1);
        Object obj = z10 ? f17736d : null;
        long j10 = this.f17737b;
        ic0.f15015a = obj;
        ic0.f15016b = obj;
        ic0.f15017c = j10;
        return ic0;
    }

    public final int f(Object obj) {
        return f17736d.equals(obj) ? 0 : -1;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 1;
    }
}
