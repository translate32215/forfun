package g4;

import android.support.v4.media.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream */
public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f18449a;

    /* renamed from: b  reason: collision with root package name */
    public int f18450b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f18449a = j10;
    }

    public final int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f18450b += i10;
        } else if (this.f18449a - ((long) this.f18450b) > 0) {
            StringBuilder a10 = a.a("Failed to read all expected data, expected: ");
            a10.append(this.f18449a);
            a10.append(", but read: ");
            a10.append(this.f18450b);
            throw new IOException(a10.toString());
        }
        return i10;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f18449a - ((long) this.f18450b), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
