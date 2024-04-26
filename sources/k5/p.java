package k5;

import v6.a;
import v6.e0;

/* compiled from: TrackSampleTable */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final m f20029a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20030b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f20031c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f20032d;

    /* renamed from: e  reason: collision with root package name */
    public final int f20033e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f20034f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f20035g;

    /* renamed from: h  reason: collision with root package name */
    public final long f20036h;

    public p(m mVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10 = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z10);
        this.f20029a = mVar;
        this.f20031c = jArr;
        this.f20032d = iArr;
        this.f20033e = i10;
        this.f20034f = jArr2;
        this.f20035g = iArr2;
        this.f20036h = j10;
        this.f20030b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int f10 = e0.f(this.f20034f, j10, true, false); f10 >= 0; f10--) {
            if ((this.f20035g[f10] & 1) != 0) {
                return f10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int b10 = e0.b(this.f20034f, j10, true, false); b10 < this.f20034f.length; b10++) {
            if ((this.f20035g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
