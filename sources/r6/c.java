package r6;

import android.os.SystemClock;
import b6.e;
import b6.m;
import java.util.Arrays;
import java.util.List;
import v6.a;
import v6.e0;
import x4.b0;
import z5.f0;

/* compiled from: BaseTrackSelection */
public abstract class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f24565a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24566b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f24567c;

    /* renamed from: d  reason: collision with root package name */
    public final b0[] f24568d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f24569e;

    /* renamed from: f  reason: collision with root package name */
    public int f24570f;

    public c(f0 f0Var, int... iArr) {
        int i10 = 0;
        a.d(iArr.length > 0);
        f0Var.getClass();
        this.f24565a = f0Var;
        int length = iArr.length;
        this.f24566b = length;
        this.f24568d = new b0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f24568d[i11] = f0Var.f28584b[iArr[i11]];
        }
        Arrays.sort(this.f24568d, b.f24562b);
        this.f24567c = new int[this.f24566b];
        while (true) {
            int i12 = this.f24566b;
            if (i10 < i12) {
                this.f24567c[i10] = f0Var.a(this.f24568d[i10]);
                i10++;
            } else {
                this.f24569e = new long[i12];
                return;
            }
        }
    }

    public final boolean a(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean u10 = u(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f24566b && !u10) {
            u10 = i11 != i10 && !u(i11, elapsedRealtime);
            i11++;
        }
        if (!u10) {
            return false;
        }
        long[] jArr = this.f24569e;
        long j11 = jArr[i10];
        long j12 = Long.MAX_VALUE;
        int i12 = e0.f26436a;
        long j13 = elapsedRealtime + j10;
        if (((j10 ^ j13) & (elapsedRealtime ^ j13)) >= 0) {
            j12 = j13;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    public /* synthetic */ void b(boolean z10) {
        g.b(this, z10);
    }

    public final b0 c(int i10) {
        return this.f24568d[i10];
    }

    public void d() {
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24565a != cVar.f24565a || !Arrays.equals(this.f24567c, cVar.f24567c)) {
            return false;
        }
        return true;
    }

    public final int f(int i10) {
        return this.f24567c[i10];
    }

    public int g(long j10, List<? extends m> list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f24570f == 0) {
            this.f24570f = Arrays.hashCode(this.f24567c) + (System.identityHashCode(this.f24565a) * 31);
        }
        return this.f24570f;
    }

    public final int i() {
        return this.f24567c[m()];
    }

    public final f0 j() {
        return this.f24565a;
    }

    public final b0 k() {
        return this.f24568d[m()];
    }

    public final int length() {
        return this.f24567c.length;
    }

    public void n(float f10) {
    }

    public final int o(b0 b0Var) {
        for (int i10 = 0; i10 < this.f24566b; i10++) {
            if (this.f24568d[i10] == b0Var) {
                return i10;
            }
        }
        return -1;
    }

    public /* synthetic */ void q() {
        g.a(this);
    }

    public /* synthetic */ boolean r(long j10, e eVar, List list) {
        return g.d(this, j10, eVar, list);
    }

    public /* synthetic */ void s() {
        g.c(this);
    }

    public final int t(int i10) {
        for (int i11 = 0; i11 < this.f24566b; i11++) {
            if (this.f24567c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean u(int i10, long j10) {
        return this.f24569e[i10] > j10;
    }
}
