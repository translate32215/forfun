package n5;

import android.util.Log;
import d5.b0;
import d5.k;
import f0.j;
import n5.e0;
import q.e;
import v6.a;
import v6.v;
import x4.m0;

/* compiled from: PesReader */
public final class t implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final j f22291a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f22292b = new b0(new byte[10], 1, (e) null);

    /* renamed from: c  reason: collision with root package name */
    public int f22293c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f22294d;

    /* renamed from: e  reason: collision with root package name */
    public v6.b0 f22295e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22296f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22297g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22298h;

    /* renamed from: i  reason: collision with root package name */
    public int f22299i;

    /* renamed from: j  reason: collision with root package name */
    public int f22300j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22301k;

    /* renamed from: l  reason: collision with root package name */
    public long f22302l;

    public t(j jVar) {
        this.f22291a = jVar;
    }

    public final void a() {
        this.f22293c = 0;
        this.f22294d = 0;
        this.f22298h = false;
        this.f22291a.a();
    }

    public void b(v6.b0 b0Var, k kVar, e0.d dVar) {
        this.f22295e = b0Var;
        this.f22291a.d(kVar, dVar);
    }

    public final void c(v vVar, int i10) throws m0 {
        boolean z10;
        a.f(this.f22295e);
        int i11 = -1;
        int i12 = 3;
        if ((i10 & 1) != 0) {
            int i13 = this.f22293c;
            if (!(i13 == 0 || i13 == 1)) {
                if (i13 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else if (i13 == 3) {
                    if (this.f22300j != -1) {
                        StringBuilder a10 = android.support.v4.media.a.a("Unexpected start indicator: expected ");
                        a10.append(this.f22300j);
                        a10.append(" more bytes");
                        Log.w("PesReader", a10.toString());
                    }
                    this.f22291a.e();
                } else {
                    throw new IllegalStateException();
                }
            }
            e(1);
        }
        while (vVar.a() > 0) {
            int i14 = this.f22293c;
            if (i14 != 0) {
                int i15 = 0;
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (d(vVar, this.f22292b.f13001b, Math.min(10, this.f22299i)) && d(vVar, (byte[]) null, this.f22299i)) {
                            this.f22292b.p(0);
                            this.f22302l = -9223372036854775807L;
                            if (this.f22296f) {
                                this.f22292b.s(4);
                                this.f22292b.s(1);
                                this.f22292b.s(1);
                                long i16 = (((long) this.f22292b.i(i12)) << 30) | ((long) (this.f22292b.i(15) << 15)) | ((long) this.f22292b.i(15));
                                this.f22292b.s(1);
                                if (!this.f22298h && this.f22297g) {
                                    this.f22292b.s(4);
                                    this.f22292b.s(1);
                                    this.f22292b.s(1);
                                    this.f22292b.s(1);
                                    this.f22295e.b((((long) this.f22292b.i(i12)) << 30) | ((long) (this.f22292b.i(15) << 15)) | ((long) this.f22292b.i(15)));
                                    this.f22298h = true;
                                }
                                this.f22302l = this.f22295e.b(i16);
                            }
                            i10 |= this.f22301k ? 4 : 0;
                            this.f22291a.f(this.f22302l, i10);
                            e(3);
                        }
                    } else if (i14 == i12) {
                        int a11 = vVar.a();
                        int i17 = this.f22300j;
                        if (i17 != i11) {
                            i15 = a11 - i17;
                        }
                        if (i15 > 0) {
                            a11 -= i15;
                            vVar.C(vVar.f26519b + a11);
                        }
                        this.f22291a.c(vVar);
                        int i18 = this.f22300j;
                        if (i18 != i11) {
                            int i19 = i18 - a11;
                            this.f22300j = i19;
                            if (i19 == 0) {
                                this.f22291a.e();
                                e(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(vVar, this.f22292b.f13001b, 9)) {
                    this.f22292b.p(0);
                    int i20 = this.f22292b.i(24);
                    if (i20 != 1) {
                        j.a("Unexpected start code prefix: ", i20, "PesReader");
                        this.f22300j = -1;
                        z10 = false;
                    } else {
                        this.f22292b.s(8);
                        int i21 = this.f22292b.i(16);
                        this.f22292b.s(5);
                        this.f22301k = this.f22292b.h();
                        this.f22292b.s(2);
                        this.f22296f = this.f22292b.h();
                        this.f22297g = this.f22292b.h();
                        this.f22292b.s(6);
                        int i22 = this.f22292b.i(8);
                        this.f22299i = i22;
                        if (i21 == 0) {
                            this.f22300j = -1;
                        } else {
                            int i23 = ((i21 + 6) - 9) - i22;
                            this.f22300j = i23;
                            if (i23 < 0) {
                                StringBuilder a12 = android.support.v4.media.a.a("Found negative packet payload size: ");
                                a12.append(this.f22300j);
                                Log.w("PesReader", a12.toString());
                                this.f22300j = -1;
                            }
                        }
                        z10 = true;
                    }
                    e(z10 ? 2 : 0);
                }
            } else {
                vVar.E(vVar.a());
            }
            i11 = -1;
            i12 = 3;
        }
    }

    public final boolean d(v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f22294d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.E(min);
        } else {
            System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, this.f22294d, min);
            vVar.f26519b += min;
        }
        int i11 = this.f22294d + min;
        this.f22294d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final void e(int i10) {
        this.f22293c = i10;
        this.f22294d = 0;
    }
}
