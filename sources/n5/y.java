package n5;

import d5.k;
import n5.e0;
import v6.b0;
import v6.v;

/* compiled from: SectionReader */
public final class y implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final x f22331a;

    /* renamed from: b  reason: collision with root package name */
    public final v f22332b = new v(32);

    /* renamed from: c  reason: collision with root package name */
    public int f22333c;

    /* renamed from: d  reason: collision with root package name */
    public int f22334d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22335e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22336f;

    public y(x xVar) {
        this.f22331a = xVar;
    }

    public void a() {
        this.f22336f = true;
    }

    public void b(b0 b0Var, k kVar, e0.d dVar) {
        this.f22331a.b(b0Var, kVar, dVar);
        this.f22336f = true;
    }

    public void c(v vVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int s10 = z10 ? vVar.f26519b + vVar.s() : -1;
        if (this.f22336f) {
            if (z10) {
                this.f22336f = false;
                vVar.D(s10);
                this.f22334d = 0;
            } else {
                return;
            }
        }
        while (vVar.a() > 0) {
            int i11 = this.f22334d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int s11 = vVar.s();
                    vVar.D(vVar.f26519b - 1);
                    if (s11 == 255) {
                        this.f22336f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.f22334d);
                vVar.e(this.f22332b.f26518a, this.f22334d, min);
                int i12 = this.f22334d + min;
                this.f22334d = i12;
                if (i12 == 3) {
                    this.f22332b.D(0);
                    this.f22332b.C(3);
                    this.f22332b.E(1);
                    int s12 = this.f22332b.s();
                    int s13 = this.f22332b.s();
                    this.f22335e = (s12 & 128) != 0;
                    int i13 = (((s12 & 15) << 8) | s13) + 3;
                    this.f22333c = i13;
                    byte[] bArr = this.f22332b.f26518a;
                    if (bArr.length < i13) {
                        this.f22332b.b(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.f22333c - this.f22334d);
                vVar.e(this.f22332b.f26518a, this.f22334d, min2);
                int i14 = this.f22334d + min2;
                this.f22334d = i14;
                int i15 = this.f22333c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f22335e) {
                        byte[] bArr2 = this.f22332b.f26518a;
                        int i16 = v6.e0.f26436a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i15; i18++) {
                            i17 = v6.e0.f26448m[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        if (i17 != 0) {
                            this.f22336f = true;
                            return;
                        }
                        this.f22332b.C(this.f22333c - 4);
                    } else {
                        this.f22332b.C(i15);
                    }
                    this.f22332b.D(0);
                    this.f22331a.c(this.f22332b);
                    this.f22334d = 0;
                }
            }
        }
    }
}
