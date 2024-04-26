package b6;

import b6.f;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.r;
import java.io.IOException;
import v6.e0;
import x4.b0;

/* compiled from: InitializationChunk */
public final class l extends e {

    /* renamed from: j  reason: collision with root package name */
    public final f f3631j;

    /* renamed from: k  reason: collision with root package name */
    public f.a f3632k;

    /* renamed from: l  reason: collision with root package name */
    public long f3633l;

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f3634m;

    public l(e eVar, u6.e eVar2, b0 b0Var, int i10, Object obj, f fVar) {
        super(eVar, eVar2, 2, b0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f3631j = fVar;
    }

    public void a() throws IOException {
        d5.f fVar;
        if (this.f3633l == 0) {
            ((d) this.f3631j).a(this.f3632k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            u6.e b10 = this.f3590b.b(this.f3633l);
            r rVar = this.f3597i;
            fVar = new d5.f(rVar, b10.f26053f, rVar.O(b10));
            do {
                if (this.f3634m || !((d) this.f3631j).c(fVar)) {
                    break;
                }
                break;
                break;
            } while (!((d) this.f3631j).c(fVar));
            break;
            this.f3633l = fVar.f13029d - this.f3590b.f26053f;
            r rVar2 = this.f3597i;
            int i10 = e0.f26436a;
            if (rVar2 != null) {
                try {
                    rVar2.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th) {
            r rVar3 = this.f3597i;
            int i11 = e0.f26436a;
            if (rVar3 != null) {
                try {
                    rVar3.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void b() {
        this.f3634m = true;
    }
}
