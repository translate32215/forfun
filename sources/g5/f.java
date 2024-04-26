package g5;

import androidx.appcompat.widget.d0;
import d5.a0;
import g5.e;
import v6.u;
import v6.v;
import w6.a;
import x4.b0;
import x4.m0;

/* compiled from: VideoTagPayloadReader */
public final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    public final v f18496b = new v(u.f26498a);

    /* renamed from: c  reason: collision with root package name */
    public final v f18497c = new v(4);

    /* renamed from: d  reason: collision with root package name */
    public int f18498d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18499e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18500f;

    /* renamed from: g  reason: collision with root package name */
    public int f18501g;

    public f(a0 a0Var) {
        super(a0Var);
    }

    public boolean b(v vVar) throws e.a {
        int s10 = vVar.s();
        int i10 = (s10 >> 4) & 15;
        int i11 = s10 & 15;
        if (i11 == 7) {
            this.f18501g = i10;
            return i10 != 5;
        }
        throw new e.a(d0.a("Video format not supported: ", i11));
    }

    public boolean c(v vVar, long j10) throws m0 {
        int s10 = vVar.s();
        byte[] bArr = vVar.f26518a;
        int i10 = vVar.f26519b;
        int i11 = i10 + 1;
        vVar.f26519b = i11;
        int i12 = i11 + 1;
        vVar.f26519b = i12;
        byte b10 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        vVar.f26519b = i12 + 1;
        long j11 = (((long) ((bArr[i12] & 255) | b10)) * 1000) + j10;
        if (s10 == 0 && !this.f18499e) {
            v vVar2 = new v(new byte[vVar.a()]);
            vVar.e(vVar2.f26518a, 0, vVar.a());
            a b11 = a.b(vVar2);
            this.f18498d = b11.f27018b;
            b0.b bVar = new b0.b();
            bVar.f27425k = "video/avc";
            bVar.f27422h = b11.f27022f;
            bVar.f27430p = b11.f27019c;
            bVar.f27431q = b11.f27020d;
            bVar.f27434t = b11.f27021e;
            bVar.f27427m = b11.f27017a;
            this.f18495a.c(bVar.a());
            this.f18499e = true;
            return false;
        } else if (s10 != 1 || !this.f18499e) {
            return false;
        } else {
            int i13 = this.f18501g == 1 ? 1 : 0;
            if (!this.f18500f && i13 == 0) {
                return false;
            }
            byte[] bArr2 = this.f18497c.f26518a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i14 = 4 - this.f18498d;
            int i15 = 0;
            while (vVar.a() > 0) {
                vVar.e(this.f18497c.f26518a, i14, this.f18498d);
                this.f18497c.D(0);
                int v10 = this.f18497c.v();
                this.f18496b.D(0);
                this.f18495a.b(this.f18496b, 4);
                this.f18495a.b(vVar, v10);
                i15 = i15 + 4 + v10;
            }
            this.f18495a.d(j11, i13, i15, 0, (a0.a) null);
            this.f18500f = true;
            return true;
        }
    }
}
