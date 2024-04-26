package com.google.android.gms.internal.ads;

import e8.ha0;
import e8.v70;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class tp implements ha0 {

    /* renamed from: a  reason: collision with root package name */
    public final sp f8209a;

    public tp(sp spVar) {
        Charset charset = v70.f17029a;
        this.f8209a = spVar;
        spVar.f8139a = this;
    }

    public final void a(int i10, float f10) throws IOException {
        sp spVar = this.f8209a;
        spVar.getClass();
        spVar.j(i10, Float.floatToRawIntBits(f10));
    }

    public final void b(int i10, Object obj, iq iqVar) throws IOException {
        this.f8209a.g(i10, (cq) obj, iqVar);
    }

    public final void c(int i10, int i11) throws IOException {
        this.f8209a.i(i10, sp.L(i11));
    }

    public final void d(int i10, double d10) throws IOException {
        sp spVar = this.f8209a;
        spVar.getClass();
        spVar.R(i10, Double.doubleToRawLongBits(d10));
    }

    public final void e(int i10, Object obj, iq iqVar) throws IOException {
        sp spVar = this.f8209a;
        spVar.c(i10, 3);
        iqVar.d((cq) obj, spVar.f8139a);
        spVar.c(i10, 4);
    }

    public final void f(int i10, Object obj) throws IOException {
        if (obj instanceof mp) {
            this.f8209a.s(i10, (mp) obj);
        } else {
            this.f8209a.f(i10, (cq) obj);
        }
    }

    public final void g(int i10, long j10) throws IOException {
        this.f8209a.N(i10, sp.C(j10));
    }
}
