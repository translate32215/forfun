package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class h7 extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f6740a;

    /* renamed from: b  reason: collision with root package name */
    public long f6741b;

    public h7(InputStream inputStream, long j10) {
        super(inputStream);
        this.f6740a = j10;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f6741b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.f6741b += (long) read;
        }
        return read;
    }
}
