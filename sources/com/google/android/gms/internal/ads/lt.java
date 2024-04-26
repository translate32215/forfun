package com.google.android.gms.internal.ads;

import e8.fd0;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lt {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f7412d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7413a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f7414b;

    /* renamed from: c  reason: collision with root package name */
    public int f7415c;

    public static long b(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= f7412d[i10 - 1] ^ -1;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f7412d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public final long a(fd0 fd0, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.f7414b == 0) {
            if (!((gt) fd0).c(this.f7413a, 0, 1, z10)) {
                return -1;
            }
            int c10 = c(this.f7413a[0] & 255);
            this.f7415c = c10;
            if (c10 != -1) {
                this.f7414b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f7415c;
        if (i11 > i10) {
            this.f7414b = 0;
            return -2;
        }
        if (i11 != 1) {
            ((gt) fd0).c(this.f7413a, 1, i11 - 1, false);
        }
        this.f7414b = 0;
        return b(this.f7413a, this.f7415c, z11);
    }
}
