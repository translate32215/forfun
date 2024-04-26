package b6;

import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.r;
import d5.a0;
import d5.f;
import java.io.IOException;
import v6.a;
import v6.e0;
import x4.b0;

/* compiled from: SingleSampleMediaChunk */
public final class o extends a {

    /* renamed from: o  reason: collision with root package name */
    public final int f3637o;

    /* renamed from: p  reason: collision with root package name */
    public final b0 f3638p;

    /* renamed from: q  reason: collision with root package name */
    public long f3639q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3640r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(e eVar, u6.e eVar2, b0 b0Var, int i10, Object obj, long j10, long j11, long j12, int i11, b0 b0Var2) {
        super(eVar, eVar2, b0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f3637o = i11;
        this.f3638p = b0Var2;
    }

    public void a() throws IOException {
        c cVar = this.f3568m;
        a.f(cVar);
        cVar.a(0);
        a0 b10 = cVar.b(0, this.f3637o);
        b10.c(this.f3638p);
        try {
            long O = this.f3597i.O(this.f3590b.b(this.f3639q));
            if (O != -1) {
                O += this.f3639q;
            }
            f fVar = new f(this.f3597i, this.f3639q, O);
            for (int i10 = 0; i10 != -1; i10 = b10.f(fVar, Integer.MAX_VALUE, true)) {
                this.f3639q += (long) i10;
            }
            b10.d(this.f3595g, 1, (int) this.f3639q, 0, (a0.a) null);
            r rVar = this.f3597i;
            int i11 = e0.f26436a;
            if (rVar != null) {
                try {
                    rVar.f5557a.close();
                } catch (IOException unused) {
                }
            }
            this.f3640r = true;
        } catch (Throwable th) {
            r rVar2 = this.f3597i;
            int i12 = e0.f26436a;
            if (rVar2 != null) {
                try {
                    rVar2.f5557a.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void b() {
    }

    public boolean d() {
        return this.f3640r;
    }
}
