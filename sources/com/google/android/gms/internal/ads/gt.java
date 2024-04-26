package com.google.android.gms.internal.ads;

import e8.eg0;
import e8.fd0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gt implements fd0 {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6685g = new byte[4096];

    /* renamed from: a  reason: collision with root package name */
    public final ju f6686a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6687b;

    /* renamed from: c  reason: collision with root package name */
    public long f6688c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6689d = new byte[65536];

    /* renamed from: e  reason: collision with root package name */
    public int f6690e;

    /* renamed from: f  reason: collision with root package name */
    public int f6691f;

    public gt(ju juVar, long j10, long j11) {
        this.f6686a = juVar;
        this.f6688c = j10;
        this.f6687b = j11;
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a10 = this.f6686a.a(bArr, i10 + i12, i11 - i12);
            if (a10 != -1) {
                return i12 + a10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    public final void b(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        if (g(i11)) {
            System.arraycopy(this.f6689d, this.f6690e - i11, bArr, i10, i11);
        }
    }

    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int i12;
        int i13 = this.f6691f;
        if (i13 == 0) {
            i12 = 0;
        } else {
            i12 = Math.min(i13, i11);
            System.arraycopy(this.f6689d, 0, bArr, i10, i12);
            e(i12);
        }
        int i14 = i12;
        while (i14 < i11 && i14 != -1) {
            i14 = a(bArr, i10, i11, i14, z10);
        }
        f(i14);
        if (i14 != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i10) throws IOException, InterruptedException {
        int min = Math.min(this.f6691f, i10);
        e(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = f6685g;
            i11 = a(bArr, -i11, Math.min(i10, bArr.length + i11), i11, false);
        }
        f(i11);
    }

    public final void e(int i10) {
        int i11 = this.f6691f - i10;
        this.f6691f = i11;
        this.f6690e = 0;
        byte[] bArr = this.f6689d;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[(65536 + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f6689d = bArr2;
    }

    public final void f(int i10) {
        if (i10 != -1) {
            this.f6688c += (long) i10;
        }
    }

    public final boolean g(int i10) throws IOException, InterruptedException {
        int i11 = this.f6690e + i10;
        byte[] bArr = this.f6689d;
        if (i11 > bArr.length) {
            int i12 = eg0.f14479a;
            this.f6689d = Arrays.copyOf(this.f6689d, Math.max(65536 + i11, Math.min(bArr.length << 1, i11 + 524288)));
        }
        int min = Math.min(this.f6691f - this.f6690e, i10);
        while (min < i10) {
            min = a(this.f6689d, this.f6690e, i10, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i13 = this.f6690e + i10;
        this.f6690e = i13;
        this.f6691f = Math.max(this.f6691f, i13);
        return true;
    }
}
