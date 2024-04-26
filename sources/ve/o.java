package ve;

import android.support.v4.media.a;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Okio */
public final class o implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f26759a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OutputStream f26760b;

    public o(z zVar, OutputStream outputStream) {
        this.f26759a = zVar;
        this.f26760b = outputStream;
    }

    public void close() throws IOException {
        this.f26760b.close();
    }

    public z e() {
        return this.f26759a;
    }

    public void flush() throws IOException {
        this.f26760b.flush();
    }

    public void m(f fVar, long j10) throws IOException {
        a0.b(fVar.f26740b, 0, j10);
        while (j10 > 0) {
            this.f26759a.f();
            u uVar = fVar.f26739a;
            int min = (int) Math.min(j10, (long) (uVar.f26776c - uVar.f26775b));
            this.f26760b.write(uVar.f26774a, uVar.f26775b, min);
            int i10 = uVar.f26775b + min;
            uVar.f26775b = i10;
            long j11 = (long) min;
            j10 -= j11;
            fVar.f26740b -= j11;
            if (i10 == uVar.f26776c) {
                fVar.f26739a = uVar.a();
                v.a(uVar);
            }
        }
    }

    public String toString() {
        StringBuilder a10 = a.a("sink(");
        a10.append(this.f26760b);
        a10.append(")");
        return a10.toString();
    }
}
