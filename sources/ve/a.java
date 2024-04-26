package ve;

import java.io.IOException;

/* compiled from: AsyncTimeout */
public class a implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f26725a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f26726b;

    public a(c cVar, x xVar) {
        this.f26726b = cVar;
        this.f26725a = xVar;
    }

    public void close() throws IOException {
        this.f26726b.i();
        try {
            this.f26725a.close();
            this.f26726b.j(true);
        } catch (IOException e10) {
            e = e10;
            c cVar = this.f26726b;
            if (cVar.k()) {
                e = cVar.l(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f26726b.j(false);
            throw th;
        }
    }

    public z e() {
        return this.f26726b;
    }

    public void flush() throws IOException {
        this.f26726b.i();
        try {
            this.f26725a.flush();
            this.f26726b.j(true);
        } catch (IOException e10) {
            e = e10;
            c cVar = this.f26726b;
            if (cVar.k()) {
                e = cVar.l(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f26726b.j(false);
            throw th;
        }
    }

    public void m(f fVar, long j10) throws IOException {
        a0.b(fVar.f26740b, 0, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                u uVar = fVar.f26739a;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (uVar.f26776c - uVar.f26775b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    uVar = uVar.f26779f;
                }
                this.f26726b.i();
                try {
                    this.f26725a.m(fVar, j11);
                    j10 -= j11;
                    this.f26726b.j(true);
                } catch (IOException e10) {
                    e = e10;
                    c cVar = this.f26726b;
                    if (cVar.k()) {
                        e = cVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    this.f26726b.j(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("AsyncTimeout.sink(");
        a10.append(this.f26725a);
        a10.append(")");
        return a10.toString();
    }
}
