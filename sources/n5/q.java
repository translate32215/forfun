package n5;

import d5.a0;
import d5.k;
import n5.e0;
import v6.a;
import v6.v;
import x4.b0;
import z4.x;

/* compiled from: MpegAudioReader */
public final class q implements j {

    /* renamed from: a  reason: collision with root package name */
    public final v f22271a;

    /* renamed from: b  reason: collision with root package name */
    public final x.a f22272b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22273c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f22274d;

    /* renamed from: e  reason: collision with root package name */
    public String f22275e;

    /* renamed from: f  reason: collision with root package name */
    public int f22276f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f22277g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22278h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22279i;

    /* renamed from: j  reason: collision with root package name */
    public long f22280j;

    /* renamed from: k  reason: collision with root package name */
    public int f22281k;

    /* renamed from: l  reason: collision with root package name */
    public long f22282l;

    public q(String str) {
        v vVar = new v(4);
        this.f22271a = vVar;
        vVar.f26518a[0] = -1;
        this.f22272b = new x.a();
        this.f22273c = str;
    }

    public void a() {
        this.f22276f = 0;
        this.f22277g = 0;
        this.f22279i = false;
    }

    public void c(v vVar) {
        a.f(this.f22274d);
        while (vVar.a() > 0) {
            int i10 = this.f22276f;
            if (i10 == 0) {
                byte[] bArr = vVar.f26518a;
                int i11 = vVar.f26519b;
                int i12 = vVar.f26520c;
                while (true) {
                    if (i11 >= i12) {
                        vVar.D(i12);
                        break;
                    }
                    boolean z10 = (bArr[i11] & 255) == 255;
                    boolean z11 = this.f22279i && (bArr[i11] & 224) == 224;
                    this.f22279i = z10;
                    if (z11) {
                        vVar.D(i11 + 1);
                        this.f22279i = false;
                        this.f22271a.f26518a[1] = bArr[i11];
                        this.f22277g = 2;
                        this.f22276f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(vVar.a(), 4 - this.f22277g);
                vVar.e(this.f22271a.f26518a, this.f22277g, min);
                int i13 = this.f22277g + min;
                this.f22277g = i13;
                if (i13 >= 4) {
                    this.f22271a.D(0);
                    if (!this.f22272b.a(this.f22271a.f())) {
                        this.f22277g = 0;
                        this.f22276f = 1;
                    } else {
                        x.a aVar = this.f22272b;
                        this.f22281k = aVar.f28492c;
                        if (!this.f22278h) {
                            int i14 = aVar.f28493d;
                            this.f22280j = (((long) aVar.f28496g) * 1000000) / ((long) i14);
                            b0.b bVar = new b0.b();
                            bVar.f27415a = this.f22275e;
                            bVar.f27425k = aVar.f28491b;
                            bVar.f27426l = 4096;
                            bVar.f27438x = aVar.f28494e;
                            bVar.f27439y = i14;
                            bVar.f27417c = this.f22273c;
                            this.f22274d.c(bVar.a());
                            this.f22278h = true;
                        }
                        this.f22271a.D(0);
                        this.f22274d.b(this.f22271a, 4);
                        this.f22276f = 2;
                    }
                }
            } else if (i10 == 2) {
                int min2 = Math.min(vVar.a(), this.f22281k - this.f22277g);
                this.f22274d.b(vVar, min2);
                int i15 = this.f22277g + min2;
                this.f22277g = i15;
                int i16 = this.f22281k;
                if (i15 >= i16) {
                    this.f22274d.d(this.f22282l, 1, i16, 0, (a0.a) null);
                    this.f22282l += this.f22280j;
                    this.f22277g = 0;
                    this.f22276f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22275e = dVar.b();
        this.f22274d = kVar.l(dVar.c(), 1);
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22282l = j10;
    }
}
