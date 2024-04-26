package d5;

import d5.x;
import v6.a;
import v6.e0;

/* compiled from: IndexSeekMap */
public final class v implements x {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f13059a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f13060b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13061c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13062d;

    public v(long[] jArr, long[] jArr2, long j10) {
        a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f13062d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f13059a = jArr;
            this.f13060b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f13059a = jArr3;
            long[] jArr4 = new long[i10];
            this.f13060b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f13061c = j10;
    }

    public boolean b() {
        return this.f13062d;
    }

    public long c() {
        return this.f13061c;
    }

    public x.a j(long j10) {
        if (!this.f13062d) {
            return new x.a(y.f13068c);
        }
        int f10 = e0.f(this.f13060b, j10, true, true);
        long[] jArr = this.f13060b;
        long j11 = jArr[f10];
        long[] jArr2 = this.f13059a;
        y yVar = new y(j11, jArr2[f10]);
        if (j11 == j10 || f10 == jArr.length - 1) {
            return new x.a(yVar);
        }
        int i10 = f10 + 1;
        return new x.a(yVar, new y(jArr[i10], jArr2[i10]));
    }
}
