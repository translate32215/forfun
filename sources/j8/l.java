package j8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class l extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f19669a;

    /* renamed from: b  reason: collision with root package name */
    public long f19670b = -1;

    public l(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        this.f19669a = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f19669a);
    }

    public final synchronized void mark(int i10) {
        this.in.mark(i10);
        this.f19670b = this.f19669a;
    }

    public final int read() throws IOException {
        if (this.f19669a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f19669a--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f19670b != -1) {
            this.in.reset();
            this.f19669a = this.f19670b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j10) throws IOException {
        long skip = this.in.skip(Math.min(j10, this.f19669a));
        this.f19669a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f19669a;
        if (j10 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i10, (int) Math.min((long) i11, j10));
        if (read != -1) {
            this.f19669a -= (long) read;
        }
        return read;
    }
}
