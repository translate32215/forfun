package com.google.android.gms.internal.ads;

import e8.lj;
import e8.na0;
import e8.oh;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class cr implements a9 {

    /* renamed from: h  reason: collision with root package name */
    public static na0 f6134h = na0.b(cr.class);

    /* renamed from: a  reason: collision with root package name */
    public String f6135a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6136b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6137c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f6138d;

    /* renamed from: e  reason: collision with root package name */
    public long f6139e;

    /* renamed from: f  reason: collision with root package name */
    public long f6140f = -1;

    /* renamed from: g  reason: collision with root package name */
    public o7 f6141g;

    public cr(String str) {
        this.f6135a = str;
        this.f6137c = true;
        this.f6136b = true;
    }

    public final void a(o7 o7Var, ByteBuffer byteBuffer, long j10, oh ohVar) throws IOException {
        this.f6139e = o7Var.a();
        byteBuffer.remaining();
        this.f6140f = j10;
        this.f6141g = o7Var;
        o7Var.d(o7Var.a() + j10);
        this.f6137c = false;
        this.f6136b = false;
        c();
    }

    public final synchronized void b() {
        if (!this.f6137c) {
            try {
                na0 na0 = f6134h;
                String valueOf = String.valueOf(this.f6135a);
                na0.a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f6138d = this.f6141g.i(this.f6139e, this.f6140f);
                this.f6137c = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final synchronized void c() {
        b();
        na0 na0 = f6134h;
        String valueOf = String.valueOf(this.f6135a);
        na0.a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f6138d;
        if (byteBuffer != null) {
            this.f6136b = true;
            byteBuffer.rewind();
            e(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.f6138d = null;
        }
    }

    public final void d(lj ljVar) {
    }

    public abstract void e(ByteBuffer byteBuffer);

    public final String o() {
        return this.f6135a;
    }
}
