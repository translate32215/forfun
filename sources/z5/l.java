package z5;

import java.io.IOException;
import r6.h;
import u6.f;
import v6.e0;
import x4.z0;
import z5.o;
import z5.r;

/* compiled from: MaskingMediaPeriod */
public final class l implements o, o.a {

    /* renamed from: a  reason: collision with root package name */
    public final r.a f28600a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28601b;

    /* renamed from: c  reason: collision with root package name */
    public final f f28602c;

    /* renamed from: d  reason: collision with root package name */
    public r f28603d;

    /* renamed from: e  reason: collision with root package name */
    public o f28604e;

    /* renamed from: f  reason: collision with root package name */
    public o.a f28605f;

    /* renamed from: g  reason: collision with root package name */
    public long f28606g = -9223372036854775807L;

    public l(r.a aVar, f fVar, long j10) {
        this.f28600a = aVar;
        this.f28602c = fVar;
        this.f28601b = j10;
    }

    public void A(long j10, boolean z10) {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        oVar.A(j10, z10);
    }

    public long D(long j10) {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.D(j10);
    }

    public void E(o.a aVar, long j10) {
        this.f28605f = aVar;
        o oVar = this.f28604e;
        if (oVar != null) {
            long j11 = this.f28601b;
            long j12 = this.f28606g;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            oVar.E(this, j11);
        }
    }

    public long a() {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.a();
    }

    public void b(r.a aVar) {
        long j10 = this.f28601b;
        long j11 = this.f28606g;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        r rVar = this.f28603d;
        rVar.getClass();
        o o10 = rVar.o(aVar, this.f28602c, j10);
        this.f28604e = o10;
        if (this.f28605f != null) {
            o10.E(this, j10);
        }
    }

    public long c(long j10, z0 z0Var) {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.c(j10, z0Var);
    }

    public void d(c0 c0Var) {
        o oVar = (o) c0Var;
        o.a aVar = this.f28605f;
        int i10 = e0.f26436a;
        aVar.d(this);
    }

    public long e() {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.e();
    }

    public boolean f(long j10) {
        o oVar = this.f28604e;
        return oVar != null && oVar.f(j10);
    }

    public void g(long j10) {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        oVar.g(j10);
    }

    public long i(h[] hVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f28606g;
        if (j12 == -9223372036854775807L || j10 != this.f28601b) {
            j11 = j10;
        } else {
            this.f28606g = -9223372036854775807L;
            j11 = j12;
        }
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.i(hVarArr, zArr, b0VarArr, zArr2, j11);
    }

    public boolean j() {
        o oVar = this.f28604e;
        return oVar != null && oVar.j();
    }

    public void k(o oVar) {
        o.a aVar = this.f28605f;
        int i10 = e0.f26436a;
        aVar.k(this);
    }

    public long r() {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.r();
    }

    public g0 v() {
        o oVar = this.f28604e;
        int i10 = e0.f26436a;
        return oVar.v();
    }

    public void y() throws IOException {
        try {
            o oVar = this.f28604e;
            if (oVar != null) {
                oVar.y();
                return;
            }
            r rVar = this.f28603d;
            if (rVar != null) {
                rVar.c();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }
}
