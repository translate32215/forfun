package ve;

import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import t3.a0;

/* compiled from: GzipSource */
public final class m implements y {

    /* renamed from: a  reason: collision with root package name */
    public int f26750a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final h f26751b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f26752c;

    /* renamed from: d  reason: collision with root package name */
    public final n f26753d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f26754e = new CRC32();

    public m(y yVar) {
        if (yVar != null) {
            Inflater inflater = new Inflater(true);
            this.f26752c = inflater;
            Logger logger = p.f26761a;
            t tVar = new t(yVar);
            this.f26751b = tVar;
            this.f26753d = new n(tVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}));
        }
    }

    public long a0(f fVar, long j10) throws IOException {
        long j11;
        f fVar2 = fVar;
        long j12 = j10;
        if (j12 < 0) {
            throw new IllegalArgumentException(a0.a("byteCount < 0: ", j12));
        } else if (j12 == 0) {
            return 0;
        } else {
            if (this.f26750a == 0) {
                this.f26751b.X(10);
                byte u10 = this.f26751b.c().u(3);
                boolean z10 = ((u10 >> 1) & 1) == 1;
                if (z10) {
                    d(this.f26751b.c(), 0, 10);
                }
                a("ID1ID2", 8075, this.f26751b.readShort());
                this.f26751b.b(8);
                if (((u10 >> 2) & 1) == 1) {
                    this.f26751b.X(2);
                    if (z10) {
                        d(this.f26751b.c(), 0, 2);
                    }
                    long I = (long) this.f26751b.c().I();
                    this.f26751b.X(I);
                    if (z10) {
                        j11 = I;
                        d(this.f26751b.c(), 0, I);
                    } else {
                        j11 = I;
                    }
                    this.f26751b.b(j11);
                }
                if (((u10 >> 3) & 1) == 1) {
                    long b02 = this.f26751b.b0((byte) 0);
                    if (b02 != -1) {
                        if (z10) {
                            d(this.f26751b.c(), 0, b02 + 1);
                        }
                        this.f26751b.b(b02 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((u10 >> 4) & 1) == 1) {
                    long b03 = this.f26751b.b0((byte) 0);
                    if (b03 != -1) {
                        if (z10) {
                            d(this.f26751b.c(), 0, b03 + 1);
                        }
                        this.f26751b.b(b03 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    a("FHCRC", this.f26751b.I(), (short) ((int) this.f26754e.getValue()));
                    this.f26754e.reset();
                }
                this.f26750a = 1;
            }
            if (this.f26750a == 1) {
                long j13 = fVar2.f26740b;
                long a02 = this.f26753d.a0(fVar2, j12);
                if (a02 != -1) {
                    d(fVar, j13, a02);
                    return a02;
                }
                this.f26750a = 2;
            }
            if (this.f26750a == 2) {
                a("CRC", this.f26751b.y(), (int) this.f26754e.getValue());
                a("ISIZE", this.f26751b.y(), (int) this.f26752c.getBytesWritten());
                this.f26750a = 3;
                if (!this.f26751b.B()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.f26753d.close();
    }

    public final void d(f fVar, long j10, long j11) {
        u uVar = fVar.f26739a;
        while (true) {
            int i10 = uVar.f26776c;
            int i11 = uVar.f26775b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            uVar = uVar.f26779f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) uVar.f26775b) + j10);
            int min = (int) Math.min((long) (uVar.f26776c - i12), j11);
            this.f26754e.update(uVar.f26774a, i12, min);
            j11 -= (long) min;
            uVar = uVar.f26779f;
            j10 = 0;
        }
    }

    public z e() {
        return this.f26751b.e();
    }
}
