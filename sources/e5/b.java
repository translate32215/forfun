package e5;

import d5.a0;
import d5.e;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import v6.a;
import v6.e0;
import x4.b0;
import x4.m0;

/* compiled from: AmrExtractor */
public final class b implements i {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f13591o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f13592p;

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f13593q = e0.D("#!AMR\n");

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f13594r = e0.D("#!AMR-WB\n");

    /* renamed from: s  reason: collision with root package name */
    public static final int f13595s;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13596a = new byte[1];

    /* renamed from: b  reason: collision with root package name */
    public boolean f13597b;

    /* renamed from: c  reason: collision with root package name */
    public long f13598c;

    /* renamed from: d  reason: collision with root package name */
    public int f13599d;

    /* renamed from: e  reason: collision with root package name */
    public int f13600e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13601f;

    /* renamed from: g  reason: collision with root package name */
    public long f13602g;

    /* renamed from: h  reason: collision with root package name */
    public int f13603h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f13604i;

    /* renamed from: j  reason: collision with root package name */
    public long f13605j;

    /* renamed from: k  reason: collision with root package name */
    public k f13606k;

    /* renamed from: l  reason: collision with root package name */
    public a0 f13607l;

    /* renamed from: m  reason: collision with root package name */
    public x f13608m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13609n;

    static {
        a aVar = a.f13590a;
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f13592p = iArr;
        f13595s = iArr[8];
    }

    public b() {
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if ((!r0 && (r4 < 12 || r4 > 14)) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(d5.j r4) throws java.io.IOException {
        /*
            r3 = this;
            r4.f()
            byte[] r0 = r3.f13596a
            r1 = 0
            r2 = 1
            r4.j(r0, r1, r2)
            byte[] r4 = r3.f13596a
            byte r4 = r4[r1]
            r0 = r4 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L_0x0070
            int r4 = r4 >> 3
            r0 = 15
            r4 = r4 & r0
            if (r4 < 0) goto L_0x003c
            if (r4 > r0) goto L_0x003c
            boolean r0 = r3.f13597b
            if (r0 == 0) goto L_0x0029
            r2 = 10
            if (r4 < r2) goto L_0x0027
            r2 = 13
            if (r4 <= r2) goto L_0x0029
        L_0x0027:
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 != 0) goto L_0x003b
            if (r0 != 0) goto L_0x0038
            r0 = 12
            if (r4 < r0) goto L_0x0036
            r0 = 14
            if (r4 <= r0) goto L_0x0038
        L_0x0036:
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            if (r1 != 0) goto L_0x0062
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Illegal AMR "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            boolean r2 = r3.f13597b
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "WB"
            goto L_0x004f
        L_0x004d:
            java.lang.String r2 = "NB"
        L_0x004f:
            r1.append(r2)
            java.lang.String r2 = " frame type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>((java.lang.String) r4)
            throw r0
        L_0x0062:
            boolean r0 = r3.f13597b
            if (r0 == 0) goto L_0x006b
            int[] r0 = f13592p
            r4 = r0[r4]
            goto L_0x006f
        L_0x006b:
            int[] r0 = f13591o
            r4 = r0[r4]
        L_0x006f:
            return r4
        L_0x0070:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Invalid padding bits for frame header "
            java.lang.String r4 = androidx.appcompat.widget.d0.a(r1, r4)
            r0.<init>((java.lang.String) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.b.b(d5.j):int");
    }

    public final boolean c(j jVar) throws IOException {
        byte[] bArr = f13593q;
        jVar.f();
        byte[] bArr2 = new byte[bArr.length];
        jVar.j(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f13597b = false;
            jVar.g(bArr.length);
            return true;
        }
        byte[] bArr3 = f13594r;
        jVar.f();
        byte[] bArr4 = new byte[bArr3.length];
        jVar.j(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f13597b = true;
        jVar.g(bArr3.length);
        return true;
    }

    public boolean e(j jVar) throws IOException {
        return c(jVar);
    }

    public int f(j jVar, w wVar) throws IOException {
        a.f(this.f13607l);
        int i10 = e0.f26436a;
        if (jVar.l() != 0 || c(jVar)) {
            if (!this.f13609n) {
                this.f13609n = true;
                boolean z10 = this.f13597b;
                String str = z10 ? "audio/amr-wb" : "audio/3gpp";
                int i11 = z10 ? 16000 : 8000;
                a0 a0Var = this.f13607l;
                b0.b bVar = new b0.b();
                bVar.f27425k = str;
                bVar.f27426l = f13595s;
                bVar.f27438x = 1;
                bVar.f27439y = i11;
                a0Var.c(bVar.a());
            }
            int i12 = -1;
            if (this.f13600e == 0) {
                try {
                    int b10 = b(jVar);
                    this.f13599d = b10;
                    this.f13600e = b10;
                    if (this.f13603h == -1) {
                        this.f13602g = jVar.l();
                        this.f13603h = this.f13599d;
                    }
                    if (this.f13603h == this.f13599d) {
                        this.f13604i++;
                    }
                } catch (EOFException unused) {
                }
            }
            int f10 = this.f13607l.f(jVar, this.f13600e, true);
            if (f10 != -1) {
                int i13 = this.f13600e - f10;
                this.f13600e = i13;
                if (i13 <= 0) {
                    this.f13607l.d(this.f13605j + this.f13598c, 1, this.f13599d, 0, (a0.a) null);
                    this.f13598c += 20000;
                }
                i12 = 0;
            }
            jVar.b();
            if (!this.f13601f) {
                x.b bVar2 = new x.b(-9223372036854775807L, 0);
                this.f13608m = bVar2;
                this.f13606k.b(bVar2);
                this.f13601f = true;
            }
            return i12;
        }
        throw new m0("Could not find AMR header.");
    }

    public void h(long j10, long j11) {
        this.f13598c = 0;
        this.f13599d = 0;
        this.f13600e = 0;
        if (j10 != 0) {
            x xVar = this.f13608m;
            if (xVar instanceof e) {
                e eVar = (e) xVar;
                this.f13605j = e.e(j10, eVar.f13021b, eVar.f13024e);
                return;
            }
        }
        this.f13605j = 0;
    }

    public void i(k kVar) {
        this.f13606k = kVar;
        this.f13607l = kVar.l(0, 1);
        kVar.d();
    }

    public b(int i10) {
    }
}
