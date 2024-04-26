package g4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream */
public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final Queue<d> f18451c = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public InputStream f18452a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f18453b;

    static {
        char[] cArr = j.f18467a;
    }

    public void a() {
        this.f18453b = null;
        this.f18452a = null;
        Queue<d> queue = f18451c;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(this);
        }
    }

    public int available() throws IOException {
        return this.f18452a.available();
    }

    public void close() throws IOException {
        this.f18452a.close();
    }

    public void mark(int i10) {
        this.f18452a.mark(i10);
    }

    public boolean markSupported() {
        return this.f18452a.markSupported();
    }

    public int read() throws IOException {
        try {
            return this.f18452a.read();
        } catch (IOException e10) {
            this.f18453b = e10;
            throw e10;
        }
    }

    public synchronized void reset() throws IOException {
        this.f18452a.reset();
    }

    public long skip(long j10) throws IOException {
        try {
            return this.f18452a.skip(j10);
        } catch (IOException e10) {
            this.f18453b = e10;
            throw e10;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f18452a.read(bArr);
        } catch (IOException e10) {
            this.f18453b = e10;
            throw e10;
        }
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f18452a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f18453b = e10;
            throw e10;
        }
    }
}
