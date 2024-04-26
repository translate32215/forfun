package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import n3.b;

/* compiled from: BufferedOutputStream */
public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f4970a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4971b;

    /* renamed from: c  reason: collision with root package name */
    public b f4972c;

    /* renamed from: d  reason: collision with root package name */
    public int f4973d;

    public c(OutputStream outputStream, b bVar) {
        this.f4970a = outputStream;
        this.f4972c = bVar;
        this.f4971b = (byte[]) bVar.f(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f4970a.close();
            byte[] bArr = this.f4971b;
            if (bArr != null) {
                this.f4972c.put(bArr);
                this.f4971b = null;
            }
        } catch (Throwable th) {
            this.f4970a.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        int i10 = this.f4973d;
        if (i10 > 0) {
            this.f4970a.write(this.f4971b, 0, i10);
            this.f4973d = 0;
        }
        this.f4970a.flush();
    }

    public void write(int i10) throws IOException {
        byte[] bArr = this.f4971b;
        int i11 = this.f4973d;
        int i12 = i11 + 1;
        this.f4973d = i12;
        bArr[i11] = (byte) i10;
        if (i12 == bArr.length && i12 > 0) {
            this.f4970a.write(bArr, 0, i12);
            this.f4973d = 0;
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f4973d;
            if (i15 != 0 || i13 < this.f4971b.length) {
                int min = Math.min(i13, this.f4971b.length - i15);
                System.arraycopy(bArr, i14, this.f4971b, this.f4973d, min);
                int i16 = this.f4973d + min;
                this.f4973d = i16;
                i12 += min;
                byte[] bArr2 = this.f4971b;
                if (i16 == bArr2.length && i16 > 0) {
                    this.f4970a.write(bArr2, 0, i16);
                    this.f4973d = 0;
                    continue;
                }
            } else {
                this.f4970a.write(bArr, i14, i13);
                return;
            }
        } while (i12 < i11);
    }
}
