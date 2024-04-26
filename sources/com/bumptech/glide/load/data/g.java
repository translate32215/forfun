package com.bumptech.glide.load.data;

import androidx.appcompat.widget.d0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream */
public final class g extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4977c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final int f4978d = 31;

    /* renamed from: a  reason: collision with root package name */
    public final byte f4979a;

    /* renamed from: b  reason: collision with root package name */
    public int f4980b;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(d0.a("Cannot add invalid orientation: ", i10));
        }
        this.f4979a = (byte) i10;
    }

    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f4980b;
        if (i12 < 2 || i12 > (i11 = f4978d)) {
            i10 = super.read();
        } else if (i12 == i11) {
            i10 = this.f4979a;
        } else {
            i10 = f4977c[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f4980b++;
        }
        return i10;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j10) throws IOException {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f4980b = (int) (((long) this.f4980b) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f4980b;
        int i14 = f4978d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f4979a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f4977c, this.f4980b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f4980b += i12;
        }
        return i12;
    }
}
