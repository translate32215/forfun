package ve;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import t3.a0;

/* compiled from: RealBufferedSource */
public final class t implements h {

    /* renamed from: a  reason: collision with root package name */
    public final f f26770a = new f();

    /* renamed from: b  reason: collision with root package name */
    public final y f26771b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26772c;

    public t(y yVar) {
        if (yVar != null) {
            this.f26771b = yVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public f A() {
        return this.f26770a;
    }

    public boolean B() throws IOException {
        if (!this.f26772c) {
            return this.f26770a.B() && this.f26771b.a0(this.f26770a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public byte[] D(long j10) throws IOException {
        if (p(j10)) {
            return this.f26770a.D(j10);
        }
        throw new EOFException();
    }

    public short I() throws IOException {
        X(2);
        return this.f26770a.I();
    }

    public long K(x xVar) throws IOException {
        long j10 = 0;
        while (this.f26771b.a0(this.f26770a, 8192) != -1) {
            long o10 = this.f26770a.o();
            if (o10 > 0) {
                j10 += o10;
                ((f) xVar).m(this.f26770a, o10);
            }
        }
        f fVar = this.f26770a;
        long j11 = fVar.f26740b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        ((f) xVar).m(fVar, j11);
        return j12;
    }

    public String O(long j10) throws IOException {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long a10 = a((byte) 10, 0, j11);
            if (a10 != -1) {
                return this.f26770a.j0(a10);
            }
            if (j11 < Long.MAX_VALUE && p(j11) && this.f26770a.u(j11 - 1) == 13 && p(1 + j11) && this.f26770a.u(j11) == 10) {
                return this.f26770a.j0(j11);
            }
            f fVar = new f();
            f fVar2 = this.f26770a;
            fVar2.t(fVar, 0, Math.min(32, fVar2.f26740b));
            StringBuilder a11 = android.support.v4.media.a.a("\\n not found: limit=");
            a11.append(Math.min(this.f26770a.f26740b, j10));
            a11.append(" content=");
            a11.append(fVar.T().o());
            a11.append(8230);
            throw new EOFException(a11.toString());
        }
        throw new IllegalArgumentException(a0.a("limit < 0: ", j10));
    }

    public boolean R(long j10, i iVar) throws IOException {
        int u10 = iVar.u();
        if (this.f26772c) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || u10 < 0 || iVar.u() - 0 < u10) {
            return false;
        } else {
            for (int i10 = 0; i10 < u10; i10++) {
                long j11 = ((long) i10) + j10;
                if (!p(1 + j11) || this.f26770a.u(j11) != iVar.m(0 + i10)) {
                    return false;
                }
            }
            return true;
        }
    }

    public void X(long j10) throws IOException {
        if (!p(j10)) {
            throw new EOFException();
        }
    }

    public long a(byte b10, long j10, long j11) throws IOException {
        if (this.f26772c) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j10), Long.valueOf(j11)}));
        } else {
            while (j10 < j11) {
                long v10 = this.f26770a.v(b10, j10, j11);
                if (v10 == -1) {
                    f fVar = this.f26770a;
                    long j12 = fVar.f26740b;
                    if (j12 >= j11 || this.f26771b.a0(fVar, 8192) == -1) {
                        break;
                    }
                    j10 = Math.max(j10, j12);
                } else {
                    return v10;
                }
            }
            return -1;
        }
    }

    public long a0(f fVar, long j10) throws IOException {
        if (fVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 < 0) {
            throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
        } else if (!this.f26772c) {
            f fVar2 = this.f26770a;
            if (fVar2.f26740b == 0 && this.f26771b.a0(fVar2, 8192) == -1) {
                return -1;
            }
            return this.f26770a.a0(fVar, Math.min(j10, this.f26770a.f26740b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void b(long j10) throws IOException {
        if (!this.f26772c) {
            while (j10 > 0) {
                f fVar = this.f26770a;
                if (fVar.f26740b == 0 && this.f26771b.a0(fVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f26770a.f26740b);
                this.f26770a.b(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public long b0(byte b10) throws IOException {
        return a(b10, 0, Long.MAX_VALUE);
    }

    public f c() {
        return this.f26770a;
    }

    public long c0() throws IOException {
        X(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!p((long) i11)) {
                break;
            }
            byte u10 = this.f26770a.u((long) i10);
            if ((u10 >= 48 && u10 <= 57) || ((u10 >= 97 && u10 <= 102) || (u10 >= 65 && u10 <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(u10)}));
            }
        }
        return this.f26770a.c0();
    }

    public void close() throws IOException {
        if (!this.f26772c) {
            this.f26772c = true;
            this.f26771b.close();
            this.f26770a.a();
        }
    }

    public void d(byte[] bArr) throws IOException {
        try {
            X((long) bArr.length);
            this.f26770a.V(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                f fVar = this.f26770a;
                long j10 = fVar.f26740b;
                if (j10 > 0) {
                    int H = fVar.H(bArr, i10, (int) j10);
                    if (H != -1) {
                        i10 += H;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    public String d0(Charset charset) throws IOException {
        if (charset != null) {
            this.f26770a.p0(this.f26771b);
            return this.f26770a.d0(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public z e() {
        return this.f26771b.e();
    }

    public InputStream e0() {
        return new a();
    }

    public int f(r rVar) throws IOException {
        if (!this.f26772c) {
            do {
                int k02 = this.f26770a.k0(rVar, true);
                if (k02 == -1) {
                    return -1;
                }
                if (k02 != -2) {
                    this.f26770a.b((long) rVar.f26765a[k02].u());
                    return k02;
                }
            } while (this.f26771b.a0(this.f26770a, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f26772c;
    }

    public i l(long j10) throws IOException {
        if (p(j10)) {
            return this.f26770a.l(j10);
        }
        throw new EOFException();
    }

    public boolean p(long j10) throws IOException {
        f fVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
        } else if (!this.f26772c) {
            do {
                fVar = this.f26770a;
                if (fVar.f26740b >= j10) {
                    return true;
                }
            } while (this.f26771b.a0(fVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long q(i iVar) throws IOException {
        if (!this.f26772c) {
            long j10 = 0;
            while (true) {
                long G = this.f26770a.G(iVar, j10);
                if (G != -1) {
                    return G;
                }
                f fVar = this.f26770a;
                long j11 = fVar.f26740b;
                if (this.f26771b.a0(fVar, 8192) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, j11);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        f fVar = this.f26770a;
        if (fVar.f26740b == 0 && this.f26771b.a0(fVar, 8192) == -1) {
            return -1;
        }
        return this.f26770a.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        X(1);
        return this.f26770a.readByte();
    }

    public int readInt() throws IOException {
        X(4);
        return this.f26770a.readInt();
    }

    public short readShort() throws IOException {
        X(2);
        return this.f26770a.readShort();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("buffer(");
        a10.append(this.f26771b);
        a10.append(")");
        return a10.toString();
    }

    public String w() throws IOException {
        return O(Long.MAX_VALUE);
    }

    public int y() throws IOException {
        X(4);
        return this.f26770a.y();
    }

    /* compiled from: RealBufferedSource */
    public class a extends InputStream {
        public a() {
        }

        public int available() throws IOException {
            t tVar = t.this;
            if (!tVar.f26772c) {
                return (int) Math.min(tVar.f26770a.f26740b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            t.this.close();
        }

        public int read() throws IOException {
            t tVar = t.this;
            if (!tVar.f26772c) {
                f fVar = tVar.f26770a;
                if (fVar.f26740b == 0 && tVar.f26771b.a0(fVar, 8192) == -1) {
                    return -1;
                }
                return t.this.f26770a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return t.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!t.this.f26772c) {
                a0.b((long) bArr.length, (long) i10, (long) i11);
                t tVar = t.this;
                f fVar = tVar.f26770a;
                if (fVar.f26740b == 0 && tVar.f26771b.a0(fVar, 8192) == -1) {
                    return -1;
                }
                return t.this.f26770a.H(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
