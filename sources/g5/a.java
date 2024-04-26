package g5;

import d5.a0;
import g5.e;
import java.util.Collections;
import v6.v;
import x4.b0;
import x4.m0;
import z4.a;

/* compiled from: AudioTagPayloadReader */
public final class a extends e {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18471e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    public boolean f18472b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18473c;

    /* renamed from: d  reason: collision with root package name */
    public int f18474d;

    public a(a0 a0Var) {
        super(a0Var);
    }

    public boolean b(v vVar) throws e.a {
        if (!this.f18472b) {
            int s10 = vVar.s();
            int i10 = (s10 >> 4) & 15;
            this.f18474d = i10;
            if (i10 == 2) {
                int i11 = f18471e[(s10 >> 2) & 3];
                b0.b bVar = new b0.b();
                bVar.f27425k = "audio/mpeg";
                bVar.f27438x = 1;
                bVar.f27439y = i11;
                this.f18495a.c(bVar.a());
                this.f18473c = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                b0.b bVar2 = new b0.b();
                bVar2.f27425k = str;
                bVar2.f27438x = 1;
                bVar2.f27439y = 8000;
                this.f18495a.c(bVar2.a());
                this.f18473c = true;
            } else if (i10 != 10) {
                StringBuilder a10 = android.support.v4.media.a.a("Audio format not supported: ");
                a10.append(this.f18474d);
                throw new e.a(a10.toString());
            }
            this.f18472b = true;
        } else {
            vVar.E(1);
        }
        return true;
    }

    public boolean c(v vVar, long j10) throws m0 {
        if (this.f18474d == 2) {
            int a10 = vVar.a();
            this.f18495a.b(vVar, a10);
            this.f18495a.d(j10, 1, a10, 0, (a0.a) null);
            return true;
        }
        int s10 = vVar.s();
        if (s10 == 0 && !this.f18473c) {
            int a11 = vVar.a();
            byte[] bArr = new byte[a11];
            System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, a11);
            vVar.f26519b += a11;
            a.b e10 = z4.a.e(bArr);
            b0.b bVar = new b0.b();
            bVar.f27425k = "audio/mp4a-latm";
            bVar.f27422h = e10.f28282c;
            bVar.f27438x = e10.f28281b;
            bVar.f27439y = e10.f28280a;
            bVar.f27427m = Collections.singletonList(bArr);
            this.f18495a.c(bVar.a());
            this.f18473c = true;
            return false;
        } else if (this.f18474d == 10 && s10 != 1) {
            return false;
        } else {
            int a12 = vVar.a();
            this.f18495a.b(vVar, a12);
            this.f18495a.d(j10, 1, a12, 0, (a0.a) null);
            return true;
        }
    }
}
