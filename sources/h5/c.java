package h5;

import d5.j;
import v6.a;

/* compiled from: StartOffsetExtractorInput */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final j f18905a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18906b;

    public c(j jVar, long j10) {
        this.f18905a = jVar;
        a.a(jVar.l() >= j10);
        this.f18906b = j10;
    }

    public int a(byte[] bArr, int i10, int i11) {
        return this.f18905a.a(bArr, i10, i11);
    }

    public long b() {
        return this.f18905a.b() - this.f18906b;
    }

    public int c(int i10) {
        return this.f18905a.c(i10);
    }

    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f18905a.d(bArr, i10, i11, z10);
    }

    public int e(byte[] bArr, int i10, int i11) {
        return this.f18905a.e(bArr, i10, i11);
    }

    public void f() {
        this.f18905a.f();
    }

    public void g(int i10) {
        this.f18905a.g(i10);
    }

    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f18905a.h(bArr, i10, i11, z10);
    }

    public long i() {
        return this.f18905a.i() - this.f18906b;
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f18905a.j(bArr, i10, i11);
    }

    public void k(int i10) {
        this.f18905a.k(i10);
    }

    public long l() {
        return this.f18905a.l() - this.f18906b;
    }

    public void readFully(byte[] bArr, int i10, int i11) {
        this.f18905a.readFully(bArr, i10, i11);
    }
}
