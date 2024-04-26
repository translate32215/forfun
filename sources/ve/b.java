package ve;

import android.support.v4.media.a;
import java.io.IOException;

/* compiled from: AsyncTimeout */
public class b implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f26728a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f26729b;

    public b(c cVar, y yVar) {
        this.f26729b = cVar;
        this.f26728a = yVar;
    }

    public long a0(f fVar, long j10) throws IOException {
        this.f26729b.i();
        try {
            long a02 = this.f26728a.a0(fVar, j10);
            this.f26729b.j(true);
            return a02;
        } catch (IOException e10) {
            e = e10;
            c cVar = this.f26729b;
            if (cVar.k()) {
                e = cVar.l(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f26729b.j(false);
            throw th;
        }
    }

    public void close() throws IOException {
        this.f26729b.i();
        try {
            this.f26728a.close();
            this.f26729b.j(true);
        } catch (IOException e10) {
            e = e10;
            c cVar = this.f26729b;
            if (cVar.k()) {
                e = cVar.l(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f26729b.j(false);
            throw th;
        }
    }

    public z e() {
        return this.f26729b;
    }

    public String toString() {
        StringBuilder a10 = a.a("AsyncTimeout.source(");
        a10.append(this.f26728a);
        a10.append(")");
        return a10.toString();
    }
}
