package h5;

import android.util.Log;
import d5.a0;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import h5.b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import q5.a;
import v6.e0;
import v6.v;
import w5.b;
import x4.b0;
import x4.m0;

/* compiled from: JpegExtractor */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final v f18890a = new v(6);

    /* renamed from: b  reason: collision with root package name */
    public k f18891b;

    /* renamed from: c  reason: collision with root package name */
    public int f18892c;

    /* renamed from: d  reason: collision with root package name */
    public int f18893d;

    /* renamed from: e  reason: collision with root package name */
    public int f18894e;

    /* renamed from: f  reason: collision with root package name */
    public long f18895f = -1;

    /* renamed from: g  reason: collision with root package name */
    public b f18896g;

    /* renamed from: h  reason: collision with root package name */
    public j f18897h;

    /* renamed from: i  reason: collision with root package name */
    public c f18898i;

    /* renamed from: j  reason: collision with root package name */
    public k5.i f18899j;

    public void a() {
        k5.i iVar = this.f18899j;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public final void b() {
        c(new a.b[0]);
        k kVar = this.f18891b;
        kVar.getClass();
        kVar.d();
        this.f18891b.b(new x.b(-9223372036854775807L, 0));
        this.f18892c = 6;
    }

    public final void c(a.b... bVarArr) {
        k kVar = this.f18891b;
        kVar.getClass();
        a0 l10 = kVar.l(1024, 4);
        b0.b bVar = new b0.b();
        bVar.f27423i = new q5.a(bVarArr);
        l10.c(bVar.a());
    }

    public final int d(j jVar) throws IOException {
        this.f18890a.z(2);
        jVar.j(this.f18890a.f26518a, 0, 2);
        return this.f18890a.x();
    }

    public boolean e(j jVar) throws IOException {
        if (d(jVar) != 65496) {
            return false;
        }
        int d10 = d(jVar);
        this.f18893d = d10;
        if (d10 == 65504) {
            this.f18890a.z(2);
            jVar.j(this.f18890a.f26518a, 0, 2);
            jVar.k(this.f18890a.x() - 2);
            this.f18893d = d(jVar);
        }
        if (this.f18893d != 65505) {
            return false;
        }
        jVar.k(2);
        this.f18890a.z(6);
        jVar.j(this.f18890a.f26518a, 0, 6);
        if (this.f18890a.t() == 1165519206 && this.f18890a.x() == 0) {
            return true;
        }
        return false;
    }

    public int f(j jVar, w wVar) throws IOException {
        String str;
        int i10;
        String str2;
        b bVar;
        long j10;
        j jVar2 = jVar;
        w wVar2 = wVar;
        int i11 = this.f18892c;
        if (i11 == 0) {
            this.f18890a.z(2);
            jVar2.readFully(this.f18890a.f26518a, 0, 2);
            int x10 = this.f18890a.x();
            this.f18893d = x10;
            if (x10 == 65498) {
                if (this.f18895f != -1) {
                    this.f18892c = 4;
                } else {
                    b();
                }
            } else if ((x10 < 65488 || x10 > 65497) && x10 != 65281) {
                this.f18892c = 1;
            }
            return 0;
        } else if (i11 == 1) {
            this.f18890a.z(2);
            jVar2.readFully(this.f18890a.f26518a, 0, 2);
            this.f18894e = this.f18890a.x() - 2;
            this.f18892c = 2;
            return 0;
        } else if (i11 == 2) {
            if (this.f18893d == 65505) {
                int i12 = this.f18894e;
                byte[] bArr = new byte[i12];
                jVar2.readFully(bArr, 0, i12);
                if (this.f18896g == null) {
                    b bVar2 = null;
                    if (i12 + 0 == 0) {
                        str = null;
                        i10 = 0;
                    } else {
                        i10 = 0;
                        while (i10 < i12 && bArr[i10] != 0) {
                            i10++;
                        }
                        str = e0.p(bArr, 0, i10 + 0);
                        if (i10 < i12) {
                            i10++;
                        }
                    }
                    if ("http://ns.adobe.com/xap/1.0/".equals(str)) {
                        if (i12 - i10 == 0) {
                            str2 = null;
                        } else {
                            int i13 = i10;
                            while (i13 < i12 && bArr[i13] != 0) {
                                i13++;
                            }
                            str2 = e0.p(bArr, i10, i13 - i10);
                        }
                        if (str2 != null) {
                            long b10 = jVar.b();
                            if (b10 != -1) {
                                try {
                                    bVar = e.a(str2);
                                } catch (NumberFormatException | XmlPullParserException | m0 unused) {
                                    Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                    bVar = null;
                                }
                                if (bVar != null && bVar.f18901b.size() >= 2) {
                                    long j11 = -1;
                                    long j12 = -1;
                                    long j13 = -1;
                                    long j14 = -1;
                                    boolean z10 = false;
                                    for (int size = bVar.f18901b.size() - 1; size >= 0; size--) {
                                        b.a aVar = bVar.f18901b.get(size);
                                        z10 |= "video/mp4".equals(aVar.f18902a);
                                        if (size == 0) {
                                            j10 = b10 - aVar.f18904c;
                                            b10 = 0;
                                        } else {
                                            long j15 = b10 - aVar.f18903b;
                                            j10 = b10;
                                            b10 = j15;
                                        }
                                        if (z10 && b10 != j10) {
                                            j14 = j10 - b10;
                                            j13 = b10;
                                            z10 = false;
                                        }
                                        if (size == 0) {
                                            j12 = j10;
                                            j11 = b10;
                                        }
                                    }
                                    if (!(j13 == -1 || j14 == -1 || j11 == -1 || j12 == -1)) {
                                        bVar2 = new w5.b(j11, j12, bVar.f18900a, j13, j14);
                                    }
                                }
                            }
                            this.f18896g = bVar2;
                            if (bVar2 != null) {
                                this.f18895f = bVar2.f27009d;
                            }
                        }
                    }
                }
            } else {
                jVar2.g(this.f18894e);
            }
            this.f18892c = 0;
            return 0;
        } else if (i11 == 4) {
            long l10 = jVar.l();
            long j16 = this.f18895f;
            if (l10 != j16) {
                wVar2.f13063a = j16;
                return 1;
            }
            if (!jVar2.h(this.f18890a.f26518a, 0, 1, true)) {
                b();
            } else {
                jVar.f();
                if (this.f18899j == null) {
                    this.f18899j = new k5.i(0);
                }
                c cVar = new c(jVar2, this.f18895f);
                this.f18898i = cVar;
                if (this.f18899j.e(cVar)) {
                    k5.i iVar = this.f18899j;
                    long j17 = this.f18895f;
                    k kVar = this.f18891b;
                    kVar.getClass();
                    iVar.f19973r = new d(j17, kVar);
                    w5.b bVar3 = this.f18896g;
                    bVar3.getClass();
                    c(bVar3);
                    this.f18892c = 5;
                } else {
                    b();
                }
            }
            return 0;
        } else if (i11 == 5) {
            if (this.f18898i == null || jVar2 != this.f18897h) {
                this.f18897h = jVar2;
                this.f18898i = new c(jVar2, this.f18895f);
            }
            k5.i iVar2 = this.f18899j;
            iVar2.getClass();
            int f10 = iVar2.f(this.f18898i, wVar2);
            if (f10 == 1) {
                wVar2.f13063a += this.f18895f;
            }
            return f10;
        } else if (i11 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void h(long j10, long j11) {
        if (j10 == 0) {
            this.f18892c = 0;
            this.f18899j = null;
        } else if (this.f18892c == 5) {
            k5.i iVar = this.f18899j;
            iVar.getClass();
            iVar.h(j10, j11);
        }
    }

    public void i(k kVar) {
        this.f18891b = kVar;
    }
}
