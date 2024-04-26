package j5;

import d5.x;
import d5.y;
import v6.e0;

/* compiled from: VbriSeeker */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f19560a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f19561b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19562c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19563d;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f19560a = jArr;
        this.f19561b = jArr2;
        this.f19562c = j10;
        this.f19563d = j11;
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f19562c;
    }

    public long d(long j10) {
        return this.f19560a[e0.f(this.f19561b, j10, true, true)];
    }

    public long g() {
        return this.f19563d;
    }

    public x.a j(long j10) {
        int f10 = e0.f(this.f19560a, j10, true, true);
        long[] jArr = this.f19560a;
        long j11 = jArr[f10];
        long[] jArr2 = this.f19561b;
        y yVar = new y(j11, jArr2[f10]);
        if (j11 >= j10 || f10 == jArr.length - 1) {
            return new x.a(yVar);
        }
        int i10 = f10 + 1;
        return new x.a(yVar, new y(jArr[i10], jArr2[i10]));
    }
}
