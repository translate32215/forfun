package n5;

import d5.a0;
import d5.b0;
import d5.h;
import d5.k;
import java.util.Arrays;
import n5.e0;
import q.e;
import v6.v;
import x4.b0;

/* compiled from: AdtsReader */
public final class f implements j {

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f22077v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22078a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f22079b = new b0(new byte[7], 1, (e) null);

    /* renamed from: c  reason: collision with root package name */
    public final v f22080c = new v(Arrays.copyOf(f22077v, 10));

    /* renamed from: d  reason: collision with root package name */
    public final String f22081d;

    /* renamed from: e  reason: collision with root package name */
    public String f22082e;

    /* renamed from: f  reason: collision with root package name */
    public a0 f22083f;

    /* renamed from: g  reason: collision with root package name */
    public a0 f22084g;

    /* renamed from: h  reason: collision with root package name */
    public int f22085h;

    /* renamed from: i  reason: collision with root package name */
    public int f22086i;

    /* renamed from: j  reason: collision with root package name */
    public int f22087j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f22088k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22089l;

    /* renamed from: m  reason: collision with root package name */
    public int f22090m;

    /* renamed from: n  reason: collision with root package name */
    public int f22091n;

    /* renamed from: o  reason: collision with root package name */
    public int f22092o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22093p;

    /* renamed from: q  reason: collision with root package name */
    public long f22094q;

    /* renamed from: r  reason: collision with root package name */
    public int f22095r;

    /* renamed from: s  reason: collision with root package name */
    public long f22096s;

    /* renamed from: t  reason: collision with root package name */
    public a0 f22097t;

    /* renamed from: u  reason: collision with root package name */
    public long f22098u;

    public f(boolean z10, String str) {
        h();
        this.f22090m = -1;
        this.f22091n = -1;
        this.f22094q = -9223372036854775807L;
        this.f22078a = z10;
        this.f22081d = str;
    }

    public static boolean g(int i10) {
        return (i10 & 65526) == 65520;
    }

    public void a() {
        this.f22089l = false;
        h();
    }

    public final boolean b(v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.f22086i);
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, this.f22086i, min);
        vVar.f26519b += min;
        int i11 = this.f22086i + min;
        this.f22086i = i11;
        return i11 == i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0251 A[EDGE_INSN: B:138:0x0251->B:91:0x0251 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r18) throws x4.m0 {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            d5.a0 r2 = r0.f22083f
            r2.getClass()
            int r2 = v6.e0.f26436a
        L_0x000b:
            int r2 = r18.a()
            if (r2 <= 0) goto L_0x02c9
            int r2 = r0.f22085h
            r3 = 7
            r4 = 13
            r5 = -1
            r6 = 3
            r7 = 0
            r8 = 4
            r9 = 2
            r10 = 1
            if (r2 == 0) goto L_0x017c
            if (r2 == r10) goto L_0x0140
            r5 = 10
            if (r2 == r9) goto L_0x0112
            if (r2 == r6) goto L_0x005e
            if (r2 != r8) goto L_0x0058
            int r2 = r18.a()
            int r3 = r0.f22095r
            int r4 = r0.f22086i
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            d5.a0 r3 = r0.f22097t
            r3.b(r1, r2)
            int r3 = r0.f22086i
            int r3 = r3 + r2
            r0.f22086i = r3
            int r8 = r0.f22095r
            if (r3 != r8) goto L_0x000b
            d5.a0 r4 = r0.f22097t
            long r5 = r0.f22096s
            r7 = 1
            r9 = 0
            r10 = 0
            r4.d(r5, r7, r8, r9, r10)
            long r2 = r0.f22096s
            long r4 = r0.f22098u
            long r2 = r2 + r4
            r0.f22096s = r2
            r17.h()
            goto L_0x000b
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x005e:
            boolean r2 = r0.f22088k
            r11 = 5
            if (r2 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r3 = 5
        L_0x0065:
            d5.b0 r2 = r0.f22079b
            byte[] r2 = r2.f13001b
            boolean r2 = r0.b(r1, r2, r3)
            if (r2 == 0) goto L_0x000b
            d5.b0 r2 = r0.f22079b
            r2.p(r7)
            boolean r2 = r0.f22093p
            if (r2 != 0) goto L_0x00ea
            d5.b0 r2 = r0.f22079b
            int r2 = r2.i(r9)
            int r2 = r2 + r10
            if (r2 == r9) goto L_0x009d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Detected audio object type: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = ", but assuming AAC LC."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AdtsReader"
            android.util.Log.w(r3, r2)
            r2 = 2
        L_0x009d:
            d5.b0 r3 = r0.f22079b
            r3.s(r11)
            d5.b0 r3 = r0.f22079b
            int r3 = r3.i(r6)
            int r5 = r0.f22091n
            byte[] r2 = z4.a.a(r2, r5, r3)
            z4.a$b r3 = z4.a.e(r2)
            x4.b0$b r5 = new x4.b0$b
            r5.<init>()
            java.lang.String r6 = r0.f22082e
            r5.f27415a = r6
            java.lang.String r6 = "audio/mp4a-latm"
            r5.f27425k = r6
            java.lang.String r6 = r3.f28282c
            r5.f27422h = r6
            int r6 = r3.f28281b
            r5.f27438x = r6
            int r3 = r3.f28280a
            r5.f27439y = r3
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r5.f27427m = r2
            java.lang.String r2 = r0.f22081d
            r5.f27417c = r2
            x4.b0 r2 = r5.a()
            r5 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r3 = r2.H
            long r12 = (long) r3
            long r5 = r5 / r12
            r0.f22094q = r5
            d5.a0 r3 = r0.f22083f
            r3.c(r2)
            r0.f22093p = r10
            goto L_0x00ef
        L_0x00ea:
            d5.b0 r2 = r0.f22079b
            r2.s(r5)
        L_0x00ef:
            d5.b0 r2 = r0.f22079b
            r2.s(r8)
            d5.b0 r2 = r0.f22079b
            int r2 = r2.i(r4)
            int r2 = r2 - r9
            int r2 = r2 - r11
            boolean r3 = r0.f22088k
            if (r3 == 0) goto L_0x0102
            int r2 = r2 + -2
        L_0x0102:
            d5.a0 r3 = r0.f22083f
            long r4 = r0.f22094q
            r0.f22085h = r8
            r0.f22086i = r7
            r0.f22097t = r3
            r0.f22098u = r4
            r0.f22095r = r2
            goto L_0x000b
        L_0x0112:
            v6.v r2 = r0.f22080c
            byte[] r2 = r2.f26518a
            boolean r2 = r0.b(r1, r2, r5)
            if (r2 == 0) goto L_0x000b
            d5.a0 r2 = r0.f22084g
            v6.v r3 = r0.f22080c
            r2.b(r3, r5)
            v6.v r2 = r0.f22080c
            r3 = 6
            r2.D(r3)
            d5.a0 r2 = r0.f22084g
            v6.v r3 = r0.f22080c
            int r3 = r3.r()
            int r3 = r3 + r5
            r0.f22085h = r8
            r0.f22086i = r5
            r0.f22097t = r2
            r4 = 0
            r0.f22098u = r4
            r0.f22095r = r3
            goto L_0x000b
        L_0x0140:
            int r2 = r18.a()
            if (r2 != 0) goto L_0x0148
            goto L_0x000b
        L_0x0148:
            d5.b0 r2 = r0.f22079b
            byte[] r3 = r2.f13001b
            byte[] r4 = r1.f26518a
            int r11 = r1.f26519b
            byte r4 = r4[r11]
            r3[r7] = r4
            r2.p(r9)
            d5.b0 r2 = r0.f22079b
            int r2 = r2.i(r8)
            int r3 = r0.f22091n
            if (r3 == r5) goto L_0x016a
            if (r2 == r3) goto L_0x016a
            r0.f22089l = r7
            r17.h()
            goto L_0x000b
        L_0x016a:
            boolean r3 = r0.f22089l
            if (r3 != 0) goto L_0x0176
            r0.f22089l = r10
            int r3 = r0.f22092o
            r0.f22090m = r3
            r0.f22091n = r2
        L_0x0176:
            r0.f22085h = r6
            r0.f22086i = r7
            goto L_0x000b
        L_0x017c:
            byte[] r2 = r1.f26518a
            int r11 = r1.f26519b
            int r12 = r1.f26520c
        L_0x0182:
            if (r11 >= r12) goto L_0x02c4
            int r13 = r11 + 1
            byte r11 = r2[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r14 = r0.f22087j
            r15 = 512(0x200, float:7.175E-43)
            if (r14 != r15) goto L_0x0273
            byte r14 = (byte) r11
            r14 = r14 & 255(0xff, float:3.57E-43)
            r16 = 65280(0xff00, float:9.1477E-41)
            r14 = r14 | r16
            boolean r14 = g(r14)
            if (r14 == 0) goto L_0x0273
            boolean r14 = r0.f22089l
            if (r14 != 0) goto L_0x0251
            int r14 = r13 + -2
            int r15 = r14 + 1
            r1.D(r15)
            d5.b0 r15 = r0.f22079b
            byte[] r15 = r15.f13001b
            boolean r15 = r0.i(r1, r15, r10)
            if (r15 != 0) goto L_0x01b5
            goto L_0x024e
        L_0x01b5:
            d5.b0 r15 = r0.f22079b
            r15.p(r8)
            d5.b0 r15 = r0.f22079b
            int r15 = r15.i(r10)
            int r7 = r0.f22090m
            if (r7 == r5) goto L_0x01c8
            if (r15 == r7) goto L_0x01c8
            goto L_0x024e
        L_0x01c8:
            int r7 = r0.f22091n
            if (r7 == r5) goto L_0x01ee
            d5.b0 r7 = r0.f22079b
            byte[] r7 = r7.f13001b
            boolean r7 = r0.i(r1, r7, r10)
            if (r7 != 0) goto L_0x01d8
            goto L_0x024c
        L_0x01d8:
            d5.b0 r7 = r0.f22079b
            r7.p(r9)
            d5.b0 r7 = r0.f22079b
            int r7 = r7.i(r8)
            int r9 = r0.f22091n
            if (r7 == r9) goto L_0x01e9
            goto L_0x024e
        L_0x01e9:
            int r7 = r14 + 2
            r1.D(r7)
        L_0x01ee:
            d5.b0 r7 = r0.f22079b
            byte[] r7 = r7.f13001b
            boolean r7 = r0.i(r1, r7, r8)
            if (r7 != 0) goto L_0x01f9
            goto L_0x024c
        L_0x01f9:
            d5.b0 r7 = r0.f22079b
            r9 = 14
            r7.p(r9)
            d5.b0 r7 = r0.f22079b
            int r7 = r7.i(r4)
            if (r7 >= r3) goto L_0x0209
            goto L_0x024e
        L_0x0209:
            byte[] r9 = r1.f26518a
            int r3 = r1.f26520c
            int r14 = r14 + r7
            if (r14 < r3) goto L_0x0211
            goto L_0x024c
        L_0x0211:
            byte r7 = r9[r14]
            if (r7 != r5) goto L_0x022e
            int r14 = r14 + 1
            if (r14 != r3) goto L_0x021a
            goto L_0x024c
        L_0x021a:
            byte r3 = r9[r14]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r16
            boolean r3 = g(r3)
            if (r3 == 0) goto L_0x024e
            byte r3 = r9[r14]
            r3 = r3 & 8
            int r3 = r3 >> r6
            if (r3 != r15) goto L_0x024e
            goto L_0x024c
        L_0x022e:
            byte r7 = r9[r14]
            r15 = 73
            if (r7 == r15) goto L_0x0235
            goto L_0x024e
        L_0x0235:
            int r7 = r14 + 1
            if (r7 != r3) goto L_0x023a
            goto L_0x024c
        L_0x023a:
            byte r7 = r9[r7]
            r15 = 68
            if (r7 == r15) goto L_0x0241
            goto L_0x024e
        L_0x0241:
            int r14 = r14 + 2
            if (r14 != r3) goto L_0x0246
            goto L_0x024c
        L_0x0246:
            byte r3 = r9[r14]
            r7 = 51
            if (r3 != r7) goto L_0x024e
        L_0x024c:
            r3 = 1
            goto L_0x024f
        L_0x024e:
            r3 = 0
        L_0x024f:
            if (r3 == 0) goto L_0x0273
        L_0x0251:
            r2 = r11 & 8
            int r2 = r2 >> r6
            r0.f22092o = r2
            r2 = r11 & 1
            if (r2 != 0) goto L_0x025c
            r2 = 1
            goto L_0x025d
        L_0x025c:
            r2 = 0
        L_0x025d:
            r0.f22088k = r2
            boolean r2 = r0.f22089l
            if (r2 != 0) goto L_0x0269
            r0.f22085h = r10
            r2 = 0
            r0.f22086i = r2
            goto L_0x026e
        L_0x0269:
            r2 = 0
            r0.f22085h = r6
            r0.f22086i = r2
        L_0x026e:
            r1.D(r13)
            goto L_0x000b
        L_0x0273:
            int r3 = r0.f22087j
            r7 = r11 | r3
            r9 = 329(0x149, float:4.61E-43)
            if (r7 == r9) goto L_0x02b9
            r9 = 511(0x1ff, float:7.16E-43)
            if (r7 == r9) goto L_0x02b2
            r9 = 836(0x344, float:1.171E-42)
            if (r7 == r9) goto L_0x02ab
            r9 = 1075(0x433, float:1.506E-42)
            if (r7 == r9) goto L_0x0296
            r7 = 256(0x100, float:3.59E-43)
            if (r3 == r7) goto L_0x0293
            r0.f22087j = r7
            int r13 = r13 + -1
            r11 = r13
            r3 = 2
            r7 = 0
            goto L_0x02c0
        L_0x0293:
            r3 = 2
            r7 = 0
            goto L_0x02bf
        L_0x0296:
            r3 = 2
            r0.f22085h = r3
            byte[] r2 = f22077v
            int r2 = r2.length
            r0.f22086i = r2
            r7 = 0
            r0.f22095r = r7
            v6.v r2 = r0.f22080c
            r2.D(r7)
            r1.D(r13)
            goto L_0x000b
        L_0x02ab:
            r3 = 2
            r7 = 0
            r9 = 1024(0x400, float:1.435E-42)
            r0.f22087j = r9
            goto L_0x02bf
        L_0x02b2:
            r3 = 2
            r7 = 0
            r9 = 512(0x200, float:7.175E-43)
            r0.f22087j = r9
            goto L_0x02bf
        L_0x02b9:
            r3 = 2
            r7 = 0
            r9 = 768(0x300, float:1.076E-42)
            r0.f22087j = r9
        L_0x02bf:
            r11 = r13
        L_0x02c0:
            r3 = 7
            r9 = 2
            goto L_0x0182
        L_0x02c4:
            r1.D(r11)
            goto L_0x000b
        L_0x02c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.f.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22082e = dVar.b();
        a0 l10 = kVar.l(dVar.c(), 1);
        this.f22083f = l10;
        this.f22097t = l10;
        if (this.f22078a) {
            dVar.a();
            a0 l11 = kVar.l(dVar.c(), 5);
            this.f22084g = l11;
            b0.b bVar = new b0.b();
            bVar.f27415a = dVar.b();
            bVar.f27425k = "application/id3";
            l11.c(bVar.a());
            return;
        }
        this.f22084g = new h();
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22096s = j10;
    }

    public final void h() {
        this.f22085h = 0;
        this.f22086i = 0;
        this.f22087j = 256;
    }

    public final boolean i(v vVar, byte[] bArr, int i10) {
        if (vVar.a() < i10) {
            return false;
        }
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i10);
        vVar.f26519b += i10;
        return true;
    }
}
