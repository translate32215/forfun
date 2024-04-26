package com.google.android.gms.internal.ads;

import e8.d7;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class m8 extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final d7 f7446a;

    public m8(d7 d7Var, int i10) {
        this.f7446a = d7Var;
        this.buf = d7Var.b(Math.max(i10, 256));
    }

    public final void a(int i10) {
        int i11 = this.count;
        if (i11 + i10 > this.buf.length) {
            byte[] b10 = this.f7446a.b((i11 + i10) << 1);
            System.arraycopy(this.buf, 0, b10, 0, this.count);
            this.f7446a.a(this.buf);
            this.buf = b10;
        }
    }

    public final void close() throws IOException {
        this.f7446a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f7446a.a(this.buf);
    }

    public final synchronized void write(byte[] bArr, int i10, int i11) {
        a(i11);
        super.write(bArr, i10, i11);
    }

    public final synchronized void write(int i10) {
        a(1);
        super.write(i10);
    }
}
