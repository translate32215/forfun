package g4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream */
public class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f18463a = Integer.MIN_VALUE;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    public final long a(long j10) {
        int i10 = this.f18463a;
        if (i10 == 0) {
            return -1;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : (long) i10;
    }

    public int available() throws IOException {
        int i10 = this.f18463a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    public final void d(long j10) {
        int i10 = this.f18463a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f18463a = (int) (((long) i10) - j10);
        }
    }

    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f18463a = i10;
    }

    public int read() throws IOException {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        d(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f18463a = Integer.MIN_VALUE;
    }

    public long skip(long j10) throws IOException {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0;
        }
        long skip = super.skip(a10);
        d(skip);
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int a10 = (int) a((long) i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        d((long) read);
        return read;
    }
}
