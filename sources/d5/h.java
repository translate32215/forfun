package d5;

import com.google.android.exoplayer2.upstream.c;
import d5.a0;
import java.io.EOFException;
import java.io.IOException;
import v6.v;
import x4.b0;

/* compiled from: DummyTrackOutput */
public final class h implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13035a = new byte[4096];

    public int a(c cVar, int i10, boolean z10, int i11) throws IOException {
        int a10 = cVar.a(this.f13035a, 0, Math.min(this.f13035a.length, i10));
        if (a10 != -1) {
            return a10;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public /* synthetic */ void b(v vVar, int i10) {
        z.b(this, vVar, i10);
    }

    public void c(b0 b0Var) {
    }

    public void d(long j10, int i10, int i11, int i12, a0.a aVar) {
    }

    public void e(v vVar, int i10, int i11) {
        vVar.D(vVar.f26519b + i10);
    }

    public /* synthetic */ int f(c cVar, int i10, boolean z10) {
        return z.a(this, cVar, i10, z10);
    }
}
