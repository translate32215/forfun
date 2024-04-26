package b6;

import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.r;
import d5.f;
import java.io.IOException;
import v6.a;
import v6.e0;
import x4.b0;

/* compiled from: ContainerMediaChunk */
public class j extends a {

    /* renamed from: o  reason: collision with root package name */
    public final int f3623o;

    /* renamed from: p  reason: collision with root package name */
    public final long f3624p;

    /* renamed from: q  reason: collision with root package name */
    public final f f3625q;

    /* renamed from: r  reason: collision with root package name */
    public long f3626r;

    /* renamed from: s  reason: collision with root package name */
    public volatile boolean f3627s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3628t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(e eVar, u6.e eVar2, b0 b0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(eVar, eVar2, b0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f3623o = i11;
        this.f3624p = j15;
        this.f3625q = fVar;
    }

    public final void a() throws IOException {
        f fVar;
        if (this.f3626r == 0) {
            c cVar = this.f3568m;
            a.f(cVar);
            cVar.a(this.f3624p);
            f fVar2 = this.f3625q;
            long j10 = this.f3566k;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.f3624p;
            long j12 = this.f3567l;
            ((d) fVar2).a(cVar, j11, j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f3624p);
        }
        try {
            u6.e b10 = this.f3590b.b(this.f3626r);
            r rVar = this.f3597i;
            fVar = new f(rVar, b10.f26053f, rVar.O(b10));
            do {
                if (this.f3627s || !((d) this.f3625q).c(fVar)) {
                    break;
                }
                break;
                break;
            } while (!((d) this.f3625q).c(fVar));
            break;
            this.f3626r = fVar.f13029d - this.f3590b.f26053f;
            r rVar2 = this.f3597i;
            int i10 = e0.f26436a;
            if (rVar2 != null) {
                try {
                    rVar2.f5557a.close();
                } catch (IOException unused) {
                }
            }
            this.f3628t = !this.f3627s;
        } catch (Throwable th) {
            r rVar3 = this.f3597i;
            int i11 = e0.f26436a;
            if (rVar3 != null) {
                try {
                    rVar3.f5557a.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public final void b() {
        this.f3627s = true;
    }

    public long c() {
        return this.f3635j + ((long) this.f3623o);
    }

    public boolean d() {
        return this.f3628t;
    }
}
