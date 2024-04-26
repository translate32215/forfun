package l5;

import d5.j;
import java.io.IOException;
import v6.a;
import v6.v;

/* compiled from: OggPacket */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f21062a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final v f21063b = new v(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f21064c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f21065d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21066e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f21065d = 0;
        do {
            int i13 = this.f21065d;
            int i14 = i10 + i13;
            e eVar = this.f21062a;
            if (i14 >= eVar.f21069c) {
                break;
            }
            int[] iArr = eVar.f21072f;
            this.f21065d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean b(j jVar) throws IOException {
        int i10;
        a.d(jVar != null);
        if (this.f21066e) {
            this.f21066e = false;
            this.f21063b.z(0);
        }
        while (!this.f21066e) {
            if (this.f21064c < 0) {
                if (!this.f21062a.c(jVar, -1) || !this.f21062a.a(jVar, true)) {
                    return false;
                }
                e eVar = this.f21062a;
                int i11 = eVar.f21070d;
                if ((eVar.f21067a & 1) == 1 && this.f21063b.f26520c == 0) {
                    i11 += a(0);
                    i10 = this.f21065d + 0;
                } else {
                    i10 = 0;
                }
                jVar.g(i11);
                this.f21064c = i10;
            }
            int a10 = a(this.f21064c);
            int i12 = this.f21064c + this.f21065d;
            if (a10 > 0) {
                v vVar = this.f21063b;
                vVar.b(vVar.f26520c + a10);
                v vVar2 = this.f21063b;
                jVar.readFully(vVar2.f26518a, vVar2.f26520c, a10);
                v vVar3 = this.f21063b;
                vVar3.C(vVar3.f26520c + a10);
                this.f21066e = this.f21062a.f21072f[i12 + -1] != 255;
            }
            if (i12 == this.f21062a.f21069c) {
                i12 = -1;
            }
            this.f21064c = i12;
        }
        return true;
    }
}
