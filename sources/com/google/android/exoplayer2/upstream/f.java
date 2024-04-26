package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InputStream;
import u6.e;
import v6.a;

/* compiled from: DataSourceInputStream */
public final class f extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final e f5475a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5476b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5477c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5478d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5479e = false;

    /* renamed from: f  reason: collision with root package name */
    public long f5480f;

    public f(e eVar, e eVar2) {
        this.f5475a = eVar;
        this.f5476b = eVar2;
        this.f5477c = new byte[1];
    }

    public void close() throws IOException {
        if (!this.f5479e) {
            this.f5475a.close();
            this.f5479e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f5477c) == -1) {
            return -1;
        }
        return this.f5477c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        a.d(!this.f5479e);
        if (!this.f5478d) {
            this.f5475a.O(this.f5476b);
            this.f5478d = true;
        }
        int a10 = this.f5475a.a(bArr, i10, i11);
        if (a10 == -1) {
            return -1;
        }
        this.f5480f += (long) a10;
        return a10;
    }
}
