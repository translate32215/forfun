package e8;

import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zd0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17726a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f17727b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f17728c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17729d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f17730e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f17731f;

    public zd0(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        boolean z10 = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z10);
        this.f17727b = jArr;
        this.f17728c = iArr;
        this.f17729d = i10;
        this.f17730e = jArr2;
        this.f17731f = iArr2;
        this.f17726a = jArr.length;
    }

    public final int a(long j10) {
        for (int a10 = eg0.a(this.f17730e, j10, false); a10 >= 0; a10--) {
            if ((this.f17731f[a10] & 1) != 0) {
                return a10;
            }
        }
        return -1;
    }

    public final int b(long j10) {
        for (int e10 = eg0.e(this.f17730e, j10, true, false); e10 < this.f17730e.length; e10++) {
            if ((this.f17731f[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
