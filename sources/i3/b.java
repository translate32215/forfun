package i3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
public class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f19134a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f19135b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f19136c;

    /* renamed from: d  reason: collision with root package name */
    public int f19137d;

    /* renamed from: e  reason: collision with root package name */
    public int f19138e;

    /* compiled from: StrictLineReader */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        public String toString() {
            int i10 = this.count;
            if (i10 > 0 && this.buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(this.buf, 0, i10, b.this.f19135b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.f19140a)) {
            this.f19134a = inputStream;
            this.f19135b = charset;
            this.f19136c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f19134a;
        byte[] bArr = this.f19136c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f19137d = 0;
            this.f19138e = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f19134a) {
            if (this.f19136c != null) {
                this.f19136c = null;
                this.f19134a.close();
            }
        }
    }

    public String d() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f19134a) {
            if (this.f19136c != null) {
                if (this.f19137d >= this.f19138e) {
                    a();
                }
                for (int i12 = this.f19137d; i12 != this.f19138e; i12++) {
                    byte[] bArr2 = this.f19136c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f19137d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f19135b.name());
                                this.f19137d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f19135b.name());
                        this.f19137d = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f19138e - this.f19137d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f19136c;
                    int i14 = this.f19137d;
                    aVar.write(bArr3, i14, this.f19138e - i14);
                    this.f19138e = -1;
                    a();
                    i10 = this.f19137d;
                    while (true) {
                        if (i10 != this.f19138e) {
                            bArr = this.f19136c;
                            if (bArr[i10] == 10) {
                                break loop1;
                            }
                            i10++;
                        }
                    }
                }
                int i15 = this.f19137d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f19137d = i10 + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
