package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ed0 implements jd0 {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f14400a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f14401b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14402c;

    public ed0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f14400a = jArr;
        this.f14401b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i10 = length - 1;
            this.f14402c = jArr2[i10] + jArr3[i10];
            return;
        }
        this.f14402c = 0;
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.f14402c;
    }

    public final long d(long j10) {
        return this.f14400a[eg0.a(this.f14401b, j10, true)];
    }
}
