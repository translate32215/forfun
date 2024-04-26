package d5;

import d5.s;
import d5.x;
import v6.a;
import v6.e0;

/* compiled from: FlacSeekTableSeekMap */
public final class r implements x {

    /* renamed from: a  reason: collision with root package name */
    public final s f13039a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13040b;

    public r(s sVar, long j10) {
        this.f13039a = sVar;
        this.f13040b = j10;
    }

    public final y a(long j10, long j11) {
        return new y((j10 * 1000000) / ((long) this.f13039a.f13045e), this.f13040b + j11);
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f13039a.d();
    }

    public x.a j(long j10) {
        long j11;
        a.f(this.f13039a.f13051k);
        s sVar = this.f13039a;
        s.a aVar = sVar.f13051k;
        long[] jArr = aVar.f13053a;
        long[] jArr2 = aVar.f13054b;
        int f10 = e0.f(jArr, sVar.g(j10), true, false);
        long j12 = 0;
        if (f10 == -1) {
            j11 = 0;
        } else {
            j11 = jArr[f10];
        }
        if (f10 != -1) {
            j12 = jArr2[f10];
        }
        y a10 = a(j11, j12);
        if (a10.f13069a == j10 || f10 == jArr.length - 1) {
            return new x.a(a10);
        }
        int i10 = f10 + 1;
        return new x.a(a10, a(jArr[i10], jArr2[i10]));
    }
}
