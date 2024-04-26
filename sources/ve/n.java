package ve;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import t3.a0;

/* compiled from: InflaterSource */
public final class n implements y {

    /* renamed from: a  reason: collision with root package name */
    public final h f26755a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f26756b;

    /* renamed from: c  reason: collision with root package name */
    public int f26757c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26758d;

    public n(h hVar, Inflater inflater) {
        this.f26755a = hVar;
        this.f26756b = inflater;
    }

    public final void a() throws IOException {
        int i10 = this.f26757c;
        if (i10 != 0) {
            int remaining = i10 - this.f26756b.getRemaining();
            this.f26757c -= remaining;
            this.f26755a.b((long) remaining);
        }
    }

    public long a0(f fVar, long j10) throws IOException {
        u l02;
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
        } else if (this.f26758d) {
            throw new IllegalStateException("closed");
        } else if (j10 == 0) {
            return 0;
        } else {
            while (true) {
                boolean z10 = false;
                if (this.f26756b.needsInput()) {
                    a();
                    if (this.f26756b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.f26755a.B()) {
                        z10 = true;
                    } else {
                        u uVar = this.f26755a.c().f26739a;
                        int i10 = uVar.f26776c;
                        int i11 = uVar.f26775b;
                        int i12 = i10 - i11;
                        this.f26757c = i12;
                        this.f26756b.setInput(uVar.f26774a, i11, i12);
                    }
                }
                try {
                    l02 = fVar.l0(1);
                    int inflate = this.f26756b.inflate(l02.f26774a, l02.f26776c, (int) Math.min(j10, (long) (8192 - l02.f26776c)));
                    if (inflate > 0) {
                        l02.f26776c += inflate;
                        long j11 = (long) inflate;
                        fVar.f26740b += j11;
                        return j11;
                    } else if (this.f26756b.finished()) {
                        break;
                    } else if (this.f26756b.needsDictionary()) {
                        break;
                    } else if (z10) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            a();
            if (l02.f26775b != l02.f26776c) {
                return -1;
            }
            fVar.f26739a = l02.a();
            v.a(l02);
            return -1;
        }
    }

    public void close() throws IOException {
        if (!this.f26758d) {
            this.f26756b.end();
            this.f26758d = true;
            this.f26755a.close();
        }
    }

    public z e() {
        return this.f26755a.e();
    }
}
