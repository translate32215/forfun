package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;

public class c0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public InputStream f4460a;

    /* renamed from: b  reason: collision with root package name */
    public int f4461b;

    public c0(InputStream inputStream, int i10, int i11) throws IOException {
        this.f4460a = inputStream;
        while (i10 > 0) {
            i10 -= (int) inputStream.skip((long) i10);
        }
        this.f4461b = i11;
    }

    public int available() throws IOException {
        int available = this.f4460a.available();
        int i10 = this.f4461b;
        return available <= i10 ? available : i10;
    }

    public void close() throws IOException {
        this.f4460a.close();
    }

    public int read() throws IOException {
        int i10 = this.f4461b;
        if (i10 == 0) {
            return -1;
        }
        this.f4461b = i10 - 1;
        return this.f4460a.read();
    }

    public long skip(long j10) throws IOException {
        int i10 = (int) j10;
        if (i10 <= 0) {
            return 0;
        }
        int i11 = this.f4461b;
        if (i10 > i11) {
            i10 = i11;
        }
        this.f4461b = i11 - i10;
        while (i10 > 0) {
            i10 -= (int) this.f4460a.skip(j10);
        }
        return j10;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f4461b;
        if (i12 == 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int read = this.f4460a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f4461b -= read;
        return read;
    }
}
