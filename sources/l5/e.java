package l5;

import d5.j;
import java.io.EOFException;
import java.io.IOException;
import v6.a;
import v6.v;
import x4.m0;

/* compiled from: OggPageHeader */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f21067a;

    /* renamed from: b  reason: collision with root package name */
    public long f21068b;

    /* renamed from: c  reason: collision with root package name */
    public int f21069c;

    /* renamed from: d  reason: collision with root package name */
    public int f21070d;

    /* renamed from: e  reason: collision with root package name */
    public int f21071e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f21072f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final v f21073g = new v(255);

    public boolean a(j jVar, boolean z10) throws IOException {
        boolean z11;
        b();
        this.f21073g.z(27);
        try {
            z11 = jVar.h(this.f21073g.f26518a, 0, 27, z10);
        } catch (EOFException e10) {
            if (z10) {
                z11 = false;
            } else {
                throw e10;
            }
        }
        if (!z11 || this.f21073g.t() != 1332176723) {
            return false;
        }
        if (this.f21073g.s() == 0) {
            this.f21067a = this.f21073g.s();
            v vVar = this.f21073g;
            byte[] bArr = vVar.f26518a;
            int i10 = vVar.f26519b;
            int i11 = i10 + 1;
            vVar.f26519b = i11;
            int i12 = i11 + 1;
            vVar.f26519b = i12;
            int i13 = i12 + 1;
            vVar.f26519b = i13;
            int i14 = i13 + 1;
            vVar.f26519b = i14;
            int i15 = i14 + 1;
            vVar.f26519b = i15;
            int i16 = i15 + 1;
            vVar.f26519b = i16;
            int i17 = i16 + 1;
            vVar.f26519b = i17;
            vVar.f26519b = i17 + 1;
            this.f21068b = ((((long) bArr[i17]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24) | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40) | ((((long) bArr[i16]) & 255) << 48);
            vVar.j();
            this.f21073g.j();
            this.f21073g.j();
            int s10 = this.f21073g.s();
            this.f21069c = s10;
            this.f21070d = s10 + 27;
            this.f21073g.z(s10);
            jVar.j(this.f21073g.f26518a, 0, this.f21069c);
            for (int i18 = 0; i18 < this.f21069c; i18++) {
                this.f21072f[i18] = this.f21073g.s();
                this.f21071e += this.f21072f[i18];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw new m0("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f21067a = 0;
        this.f21068b = 0;
        this.f21069c = 0;
        this.f21070d = 0;
        this.f21071e = 0;
    }

    public boolean c(j jVar, long j10) throws IOException {
        boolean z10;
        a.a(jVar.l() == jVar.i());
        this.f21073g.z(4);
        while (true) {
            if (j10 != -1 && jVar.l() + 4 >= j10) {
                break;
            }
            try {
                z10 = jVar.h(this.f21073g.f26518a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            this.f21073g.D(0);
            if (this.f21073g.t() == 1332176723) {
                jVar.f();
                return true;
            }
            jVar.g(1);
        }
        do {
            if ((j10 != -1 && jVar.l() >= j10) || jVar.c(1) == -1) {
                return false;
            }
            break;
        } while (jVar.c(1) == -1);
        return false;
    }
}
