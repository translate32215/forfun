package ve;

import android.support.v4.media.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSink */
public final class s implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f f26767a = new f();

    /* renamed from: b  reason: collision with root package name */
    public final x f26768b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26769c;

    public s(x xVar) {
        if (xVar != null) {
            this.f26768b = xVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public g C(int i10) throws IOException {
        if (!this.f26769c) {
            this.f26767a.q0(i10);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g F(byte[] bArr) throws IOException {
        if (!this.f26769c) {
            this.f26767a.n0(bArr);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g L() throws IOException {
        if (!this.f26769c) {
            long o10 = this.f26767a.o();
            if (o10 > 0) {
                this.f26768b.m(this.f26767a, o10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g Y(String str) throws IOException {
        if (!this.f26769c) {
            this.f26767a.w0(str);
            return L();
        }
        throw new IllegalStateException("closed");
    }

    public g Z(long j10) throws IOException {
        if (!this.f26769c) {
            this.f26767a.Z(j10);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f c() {
        return this.f26767a;
    }

    public void close() throws IOException {
        if (!this.f26769c) {
            Throwable th = null;
            try {
                f fVar = this.f26767a;
                long j10 = fVar.f26740b;
                if (j10 > 0) {
                    this.f26768b.m(fVar, j10);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f26768b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f26769c = true;
            if (th != null) {
                Charset charset = a0.f26727a;
                throw th;
            }
        }
    }

    public z e() {
        return this.f26768b.e();
    }

    public void flush() throws IOException {
        if (!this.f26769c) {
            f fVar = this.f26767a;
            long j10 = fVar.f26740b;
            if (j10 > 0) {
                this.f26768b.m(fVar, j10);
            }
            this.f26768b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public g g(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f26769c) {
            this.f26767a.o0(bArr, i10, i11);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f26769c;
    }

    public g k(long j10) throws IOException {
        if (!this.f26769c) {
            this.f26767a.k(j10);
            return L();
        }
        throw new IllegalStateException("closed");
    }

    public void m(f fVar, long j10) throws IOException {
        if (!this.f26769c) {
            this.f26767a.m(fVar, j10);
            L();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public g n(int i10) throws IOException {
        if (!this.f26769c) {
            this.f26767a.u0(i10);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public g r(int i10) throws IOException {
        if (!this.f26769c) {
            this.f26767a.t0(i10);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder a10 = a.a("buffer(");
        a10.append(this.f26768b);
        a10.append(")");
        return a10.toString();
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f26769c) {
            int write = this.f26767a.write(byteBuffer);
            L();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public g x(i iVar) throws IOException {
        if (!this.f26769c) {
            this.f26767a.m0(iVar);
            L();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
