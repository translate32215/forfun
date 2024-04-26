package b6;

import com.google.android.exoplayer2.upstream.e;
import x4.b0;

/* compiled from: MediaChunk */
public abstract class m extends e {

    /* renamed from: j  reason: collision with root package name */
    public final long f3635j;

    public m(e eVar, u6.e eVar2, b0 b0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(eVar, eVar2, 1, b0Var, i10, obj, j10, j11);
        b0Var.getClass();
        this.f3635j = j12;
    }

    public long c() {
        long j10 = this.f3635j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1;
    }

    public abstract boolean d();
}
