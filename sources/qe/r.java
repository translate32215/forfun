package qe;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qe.d;
import v6.q;
import ve.f;
import ve.g;

/* compiled from: Http2Writer */
public final class r implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f24420g = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final g f24421a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24422b;

    /* renamed from: c  reason: collision with root package name */
    public final f f24423c;

    /* renamed from: d  reason: collision with root package name */
    public int f24424d = 16384;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24425e;

    /* renamed from: f  reason: collision with root package name */
    public final d.b f24426f;

    public r(g gVar, boolean z10) {
        this.f24421a = gVar;
        this.f24422b = z10;
        f fVar = new f();
        this.f24423c = fVar;
        this.f24426f = new d.b(fVar);
    }

    public final void G(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int min = (int) Math.min((long) this.f24424d, j10);
            long j11 = (long) min;
            j10 -= j11;
            i(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : 0);
            this.f24421a.m(this.f24423c, j11);
        }
    }

    public synchronized void a(q qVar) throws IOException {
        if (!this.f24425e) {
            int i10 = this.f24424d;
            int i11 = qVar.f26491b;
            if ((i11 & 32) != 0) {
                i10 = ((int[]) qVar.f26492c)[5];
            }
            this.f24424d = i10;
            int i12 = i11 & 2;
            int i13 = -1;
            if ((i12 != 0 ? ((int[]) qVar.f26492c)[1] : -1) != -1) {
                d.b bVar = this.f24426f;
                if (i12 != 0) {
                    i13 = ((int[]) qVar.f26492c)[1];
                }
                bVar.getClass();
                int min = Math.min(i13, 16384);
                int i14 = bVar.f24311d;
                if (i14 != min) {
                    if (min < i14) {
                        bVar.f24309b = Math.min(bVar.f24309b, min);
                    }
                    bVar.f24310c = true;
                    bVar.f24311d = min;
                    int i15 = bVar.f24315h;
                    if (min < i15) {
                        if (min == 0) {
                            bVar.a();
                        } else {
                            bVar.b(i15 - min);
                        }
                    }
                }
            }
            i(0, 0, (byte) 4, (byte) 1);
            this.f24421a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.f24425e = true;
        this.f24421a.close();
    }

    public synchronized void d(boolean z10, int i10, f fVar, int i11) throws IOException {
        if (!this.f24425e) {
            i(i10, i11, (byte) 0, z10 ? (byte) 1 : 0);
            if (i11 > 0) {
                this.f24421a.m(fVar, (long) i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.f24425e) {
            this.f24421a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void i(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f24420g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f24424d;
        if (i11 > i12) {
            e.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            throw null;
        } else if ((Integer.MIN_VALUE & i10) == 0) {
            g gVar = this.f24421a;
            gVar.C((i11 >>> 16) & 255);
            gVar.C((i11 >>> 8) & 255);
            gVar.C(i11 & 255);
            this.f24421a.C(b10 & 255);
            this.f24421a.C(b11 & 255);
            this.f24421a.r(i10 & Integer.MAX_VALUE);
        } else {
            e.b("reserved bit set: %s", Integer.valueOf(i10));
            throw null;
        }
    }

    public synchronized void o(int i10, b bVar, byte[] bArr) throws IOException {
        if (this.f24425e) {
            throw new IOException("closed");
        } else if (bVar.f24288a != -1) {
            i(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f24421a.r(i10);
            this.f24421a.r(bVar.f24288a);
            if (bArr.length > 0) {
                this.f24421a.F(bArr);
            }
            this.f24421a.flush();
        } else {
            e.b("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public void s(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f24425e) {
            this.f24426f.e(list);
            long j10 = this.f24423c.f26740b;
            int min = (int) Math.min((long) this.f24424d, j10);
            long j11 = (long) min;
            byte b10 = j10 == j11 ? (byte) 4 : 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            i(i10, min, (byte) 1, b10);
            this.f24421a.m(this.f24423c, j11);
            if (j10 > j11) {
                G(i10, j10 - j11);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void t(boolean z10, int i10, int i11) throws IOException {
        if (!this.f24425e) {
            i(0, 8, (byte) 6, z10 ? (byte) 1 : 0);
            this.f24421a.r(i10);
            this.f24421a.r(i11);
            this.f24421a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void u(int i10, b bVar) throws IOException {
        if (this.f24425e) {
            throw new IOException("closed");
        } else if (bVar.f24288a != -1) {
            i(i10, 4, (byte) 3, (byte) 0);
            this.f24421a.r(bVar.f24288a);
            this.f24421a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void v(int i10, long j10) throws IOException {
        if (this.f24425e) {
            throw new IOException("closed");
        } else if (j10 == 0 || j10 > 2147483647L) {
            e.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            throw null;
        } else {
            i(i10, 4, (byte) 8, (byte) 0);
            this.f24421a.r((int) j10);
            this.f24421a.flush();
        }
    }
}
