package n5;

import com.startapp.b4;
import d5.a0;
import d5.k;
import n5.e0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import v6.u;
import v6.v;

/* compiled from: H265Reader */
public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    public final z f22217a;

    /* renamed from: b  reason: collision with root package name */
    public String f22218b;

    /* renamed from: c  reason: collision with root package name */
    public a0 f22219c;

    /* renamed from: d  reason: collision with root package name */
    public a f22220d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22221e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f22222f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final r f22223g = new r(32, 128);

    /* renamed from: h  reason: collision with root package name */
    public final r f22224h = new r(33, 128);

    /* renamed from: i  reason: collision with root package name */
    public final r f22225i = new r(34, 128);

    /* renamed from: j  reason: collision with root package name */
    public final r f22226j = new r(39, 128);

    /* renamed from: k  reason: collision with root package name */
    public final r f22227k = new r(40, 128);

    /* renamed from: l  reason: collision with root package name */
    public long f22228l;

    /* renamed from: m  reason: collision with root package name */
    public long f22229m;

    /* renamed from: n  reason: collision with root package name */
    public final v f22230n = new v();

    /* compiled from: H265Reader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f22231a;

        /* renamed from: b  reason: collision with root package name */
        public long f22232b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22233c;

        /* renamed from: d  reason: collision with root package name */
        public int f22234d;

        /* renamed from: e  reason: collision with root package name */
        public long f22235e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f22236f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f22237g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f22238h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f22239i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f22240j;

        /* renamed from: k  reason: collision with root package name */
        public long f22241k;

        /* renamed from: l  reason: collision with root package name */
        public long f22242l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f22243m;

        public a(a0 a0Var) {
            this.f22231a = a0Var;
        }

        public final void a(int i10) {
            boolean z10 = this.f22243m;
            int i11 = (int) (this.f22232b - this.f22241k);
            this.f22231a.d(this.f22242l, z10 ? 1 : 0, i11, i10, (a0.a) null);
        }
    }

    public n(z zVar) {
        this.f22217a = zVar;
    }

    public void a() {
        this.f22228l = 0;
        u.a(this.f22222f);
        this.f22223g.c();
        this.f22224h.c();
        this.f22225i.c();
        this.f22226j.c();
        this.f22227k.c();
        a aVar = this.f22220d;
        if (aVar != null) {
            aVar.f22236f = false;
            aVar.f22237g = false;
            aVar.f22238h = false;
            aVar.f22239i = false;
            aVar.f22240j = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void b(byte[] bArr, int i10, int i11) {
        a aVar = this.f22220d;
        if (aVar.f22236f) {
            int i12 = aVar.f22234d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                aVar.f22237g = (bArr[i13] & b4.f10104d) != 0;
                aVar.f22236f = false;
            } else {
                aVar.f22234d = (i11 - i10) + i12;
            }
        }
        if (!this.f22221e) {
            this.f22223g.a(bArr, i10, i11);
            this.f22224h.a(bArr, i10, i11);
            this.f22225i.a(bArr, i10, i11);
        }
        this.f22226j.a(bArr, i10, i11);
        this.f22227k.a(bArr, i10, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03fc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            d5.a0 r2 = r0.f22219c
            v6.a.f(r2)
            int r2 = v6.e0.f26436a
        L_0x000b:
            int r2 = r28.a()
            if (r2 <= 0) goto L_0x0414
            int r2 = r1.f26519b
            int r3 = r1.f26520c
            byte[] r4 = r1.f26518a
            long r5 = r0.f22228l
            int r7 = r28.a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f22228l = r5
            d5.a0 r5 = r0.f22219c
            int r6 = r28.a()
            r5.b(r1, r6)
        L_0x002a:
            if (r2 >= r3) goto L_0x0410
            boolean[] r5 = r0.f22222f
            int r5 = v6.u.b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0038
            r0.b(r4, r2, r3)
            return
        L_0x0038:
            int r6 = r5 + 3
            byte r7 = r4[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            int r7 = r7 >> 1
            int r8 = r5 - r2
            if (r8 <= 0) goto L_0x0047
            r0.b(r4, r2, r5)
        L_0x0047:
            int r2 = r3 - r5
            long r9 = r0.f22228l
            long r11 = (long) r2
            long r9 = r9 - r11
            r5 = 0
            if (r8 >= 0) goto L_0x0052
            int r8 = -r8
            goto L_0x0053
        L_0x0052:
            r8 = 0
        L_0x0053:
            long r11 = r0.f22229m
            n5.n$a r13 = r0.f22220d
            boolean r14 = r0.f22221e
            boolean r15 = r13.f22240j
            if (r15 == 0) goto L_0x0068
            boolean r15 = r13.f22237g
            if (r15 == 0) goto L_0x0068
            boolean r14 = r13.f22233c
            r13.f22243m = r14
            r13.f22240j = r5
            goto L_0x008e
        L_0x0068:
            boolean r5 = r13.f22238h
            if (r5 != 0) goto L_0x0070
            boolean r5 = r13.f22237g
            if (r5 == 0) goto L_0x008e
        L_0x0070:
            if (r14 == 0) goto L_0x007f
            boolean r5 = r13.f22239i
            if (r5 == 0) goto L_0x007f
            long r14 = r13.f22232b
            long r14 = r9 - r14
            int r5 = (int) r14
            int r5 = r5 + r2
            r13.a(r5)
        L_0x007f:
            long r14 = r13.f22232b
            r13.f22241k = r14
            long r14 = r13.f22235e
            r13.f22242l = r14
            boolean r5 = r13.f22233c
            r13.f22243m = r5
            r5 = 1
            r13.f22239i = r5
        L_0x008e:
            boolean r5 = r0.f22221e
            if (r5 != 0) goto L_0x031e
            n5.r r5 = r0.f22223g
            r5.b(r8)
            n5.r r5 = r0.f22224h
            r5.b(r8)
            n5.r r5 = r0.f22225i
            r5.b(r8)
            n5.r r5 = r0.f22223g
            boolean r13 = r5.f22285c
            if (r13 == 0) goto L_0x031e
            n5.r r13 = r0.f22224h
            boolean r14 = r13.f22285c
            if (r14 == 0) goto L_0x031e
            n5.r r14 = r0.f22225i
            boolean r15 = r14.f22285c
            if (r15 == 0) goto L_0x031e
            d5.a0 r15 = r0.f22219c
            java.lang.String r1 = r0.f22218b
            r16 = r3
            int r3 = r5.f22287e
            r17 = r4
            int r4 = r13.f22287e
            int r4 = r4 + r3
            r18 = r6
            int r6 = r14.f22287e
            int r4 = r4 + r6
            byte[] r4 = new byte[r4]
            byte[] r6 = r5.f22286d
            r19 = r2
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r4, r2, r3)
            byte[] r3 = r13.f22286d
            int r6 = r5.f22287e
            r20 = r7
            int r7 = r13.f22287e
            java.lang.System.arraycopy(r3, r2, r4, r6, r7)
            byte[] r3 = r14.f22286d
            int r5 = r5.f22287e
            int r6 = r13.f22287e
            int r5 = r5 + r6
            int r6 = r14.f22287e
            java.lang.System.arraycopy(r3, r2, r4, r5, r6)
            d5.b0 r3 = new d5.b0
            byte[] r5 = r13.f22286d
            int r6 = r13.f22287e
            r3.<init>((byte[]) r5, (int) r2, (int) r6)
            r2 = 44
            r3.s(r2)
            r2 = 3
            int r5 = r3.i(r2)
            r3.r()
            r6 = 88
            r3.s(r6)
            r6 = 8
            r3.s(r6)
            r6 = 0
            r7 = 0
        L_0x0108:
            if (r6 >= r5) goto L_0x011d
            boolean r14 = r3.h()
            if (r14 == 0) goto L_0x0112
            int r7 = r7 + 89
        L_0x0112:
            boolean r14 = r3.h()
            if (r14 == 0) goto L_0x011a
            int r7 = r7 + 8
        L_0x011a:
            int r6 = r6 + 1
            goto L_0x0108
        L_0x011d:
            r3.s(r7)
            r6 = 2
            if (r5 <= 0) goto L_0x012a
            int r7 = 8 - r5
            int r7 = r7 * 2
            r3.s(r7)
        L_0x012a:
            r3.l()
            int r7 = r3.l()
            if (r7 != r2) goto L_0x0136
            r3.r()
        L_0x0136:
            int r2 = r3.l()
            int r14 = r3.l()
            boolean r21 = r3.h()
            if (r21 == 0) goto L_0x0171
            int r21 = r3.l()
            int r22 = r3.l()
            int r23 = r3.l()
            int r24 = r3.l()
            r25 = r9
            r9 = 1
            if (r7 == r9) goto L_0x015e
            if (r7 != r6) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r6 = 1
            goto L_0x015f
        L_0x015e:
            r6 = 2
        L_0x015f:
            if (r7 != r9) goto L_0x0163
            r7 = 2
            goto L_0x0164
        L_0x0163:
            r7 = 1
        L_0x0164:
            int r21 = r21 + r22
            int r21 = r21 * r6
            int r2 = r2 - r21
            int r23 = r23 + r24
            int r23 = r23 * r7
            int r14 = r14 - r23
            goto L_0x0173
        L_0x0171:
            r25 = r9
        L_0x0173:
            r3.l()
            r3.l()
            int r6 = r3.l()
            boolean r7 = r3.h()
            if (r7 == 0) goto L_0x0185
            r7 = 0
            goto L_0x0186
        L_0x0185:
            r7 = r5
        L_0x0186:
            if (r7 > r5) goto L_0x0194
            r3.l()
            r3.l()
            r3.l()
            int r7 = r7 + 1
            goto L_0x0186
        L_0x0194:
            r3.l()
            r3.l()
            r3.l()
            r3.l()
            r3.l()
            r3.l()
            boolean r5 = r3.h()
            r7 = 4
            if (r5 == 0) goto L_0x01f3
            boolean r5 = r3.h()
            if (r5 == 0) goto L_0x01f3
            r5 = 0
        L_0x01b4:
            if (r5 >= r7) goto L_0x01f3
            r7 = 0
        L_0x01b7:
            r9 = 6
            if (r7 >= r9) goto L_0x01ed
            boolean r9 = r3.h()
            if (r9 != 0) goto L_0x01c6
            r3.l()
            r21 = r11
            goto L_0x01e3
        L_0x01c6:
            r9 = 64
            int r10 = r5 << 1
            int r10 = r10 + 4
            r21 = r11
            r11 = 1
            int r10 = r11 << r10
            int r9 = java.lang.Math.min(r9, r10)
            if (r5 <= r11) goto L_0x01da
            r3.m()
        L_0x01da:
            r10 = 0
        L_0x01db:
            if (r10 >= r9) goto L_0x01e3
            r3.m()
            int r10 = r10 + 1
            goto L_0x01db
        L_0x01e3:
            r9 = 3
            if (r5 != r9) goto L_0x01e8
            r9 = 3
            goto L_0x01e9
        L_0x01e8:
            r9 = 1
        L_0x01e9:
            int r7 = r7 + r9
            r11 = r21
            goto L_0x01b7
        L_0x01ed:
            r21 = r11
            int r5 = r5 + 1
            r7 = 4
            goto L_0x01b4
        L_0x01f3:
            r21 = r11
            r5 = 2
            r3.s(r5)
            boolean r5 = r3.h()
            if (r5 == 0) goto L_0x020d
            r5 = 8
            r3.s(r5)
            r3.l()
            r3.l()
            r3.r()
        L_0x020d:
            int r5 = r3.l()
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x0214:
            if (r7 >= r5) goto L_0x0262
            if (r7 == 0) goto L_0x021c
            boolean r9 = r3.h()
        L_0x021c:
            if (r9 == 0) goto L_0x0236
            r3.r()
            r3.l()
            r11 = 0
        L_0x0225:
            if (r11 > r10) goto L_0x0233
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x0230
            r3.r()
        L_0x0230:
            int r11 = r11 + 1
            goto L_0x0225
        L_0x0233:
            r24 = r5
            goto L_0x025d
        L_0x0236:
            int r10 = r3.l()
            int r11 = r3.l()
            int r12 = r10 + r11
            r23 = 0
            r24 = r5
            r5 = 0
        L_0x0245:
            if (r5 >= r10) goto L_0x0250
            r3.l()
            r3.r()
            int r5 = r5 + 1
            goto L_0x0245
        L_0x0250:
            r5 = 0
        L_0x0251:
            if (r5 >= r11) goto L_0x025c
            r3.l()
            r3.r()
            int r5 = r5 + 1
            goto L_0x0251
        L_0x025c:
            r10 = r12
        L_0x025d:
            int r7 = r7 + 1
            r5 = r24
            goto L_0x0214
        L_0x0262:
            boolean r5 = r3.h()
            if (r5 == 0) goto L_0x0279
            r5 = 0
        L_0x0269:
            int r7 = r3.l()
            if (r5 >= r7) goto L_0x0279
            int r7 = r6 + 4
            int r7 = r7 + 1
            r3.s(r7)
            int r5 = r5 + 1
            goto L_0x0269
        L_0x0279:
            r5 = 2
            r3.s(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            boolean r6 = r3.h()
            r7 = 24
            if (r6 == 0) goto L_0x02eb
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x02b8
            r6 = 8
            int r6 = r3.i(r6)
            r9 = 255(0xff, float:3.57E-43)
            if (r6 != r9) goto L_0x02a9
            r6 = 16
            int r9 = r3.i(r6)
            int r6 = r3.i(r6)
            if (r9 == 0) goto L_0x02b8
            if (r6 == 0) goto L_0x02b8
            float r5 = (float) r9
            float r6 = (float) r6
            float r5 = r5 / r6
            goto L_0x02b8
        L_0x02a9:
            float[] r9 = v6.u.f26499b
            int r10 = r9.length
            if (r6 >= r10) goto L_0x02b1
            r5 = r9[r6]
            goto L_0x02b8
        L_0x02b1:
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r10 = "H265Reader"
            f0.j.a(r9, r6, r10)
        L_0x02b8:
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x02c1
            r3.r()
        L_0x02c1:
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x02d4
            r6 = 4
            r3.s(r6)
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x02d4
            r3.s(r7)
        L_0x02d4:
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x02e0
            r3.l()
            r3.l()
        L_0x02e0:
            r3.r()
            boolean r6 = r3.h()
            if (r6 == 0) goto L_0x02eb
            int r14 = r14 * 2
        L_0x02eb:
            byte[] r6 = r13.f22286d
            int r9 = r13.f22287e
            r10 = 0
            r3.o(r6, r10, r9)
            r3.s(r7)
            java.lang.String r3 = v6.c.b(r3)
            x4.b0$b r6 = new x4.b0$b
            r6.<init>()
            r6.f27415a = r1
            java.lang.String r1 = "video/hevc"
            r6.f27425k = r1
            r6.f27422h = r3
            r6.f27430p = r2
            r6.f27431q = r14
            r6.f27434t = r5
            java.util.List r1 = java.util.Collections.singletonList(r4)
            r6.f27427m = r1
            x4.b0 r1 = r6.a()
            r15.c(r1)
            r1 = 1
            r0.f22221e = r1
            goto L_0x032c
        L_0x031e:
            r19 = r2
            r16 = r3
            r17 = r4
            r18 = r6
            r20 = r7
            r25 = r9
            r21 = r11
        L_0x032c:
            n5.r r1 = r0.f22226j
            boolean r1 = r1.b(r8)
            r2 = 5
            if (r1 == 0) goto L_0x0359
            n5.r r1 = r0.f22226j
            byte[] r3 = r1.f22286d
            int r1 = r1.f22287e
            int r1 = v6.u.e(r3, r1)
            v6.v r3 = r0.f22230n
            n5.r r4 = r0.f22226j
            byte[] r4 = r4.f22286d
            r3.B(r4, r1)
            v6.v r1 = r0.f22230n
            r1.E(r2)
            n5.z r1 = r0.f22217a
            v6.v r3 = r0.f22230n
            d5.a0[] r1 = r1.f22338b
            r4 = r21
            d5.c.a(r4, r3, r1)
            goto L_0x035b
        L_0x0359:
            r4 = r21
        L_0x035b:
            n5.r r1 = r0.f22227k
            boolean r1 = r1.b(r8)
            if (r1 == 0) goto L_0x0384
            n5.r r1 = r0.f22227k
            byte[] r3 = r1.f22286d
            int r1 = r1.f22287e
            int r1 = v6.u.e(r3, r1)
            v6.v r3 = r0.f22230n
            n5.r r6 = r0.f22227k
            byte[] r6 = r6.f22286d
            r3.B(r6, r1)
            v6.v r1 = r0.f22230n
            r1.E(r2)
            n5.z r1 = r0.f22217a
            v6.v r2 = r0.f22230n
            d5.a0[] r1 = r1.f22338b
            d5.c.a(r4, r2, r1)
        L_0x0384:
            long r1 = r0.f22229m
            n5.n$a r3 = r0.f22220d
            boolean r4 = r0.f22221e
            r5 = 0
            r3.f22237g = r5
            r3.f22238h = r5
            r3.f22235e = r1
            r3.f22234d = r5
            r9 = r25
            r3.f22232b = r9
            r1 = 32
            r2 = r20
            if (r2 < r1) goto L_0x03a4
            r5 = 40
            if (r2 != r5) goto L_0x03a2
            goto L_0x03a4
        L_0x03a2:
            r5 = 0
            goto L_0x03a5
        L_0x03a4:
            r5 = 1
        L_0x03a5:
            if (r5 != 0) goto L_0x03d0
            boolean r5 = r3.f22239i
            if (r5 == 0) goto L_0x03b9
            boolean r5 = r3.f22240j
            if (r5 != 0) goto L_0x03b9
            if (r4 == 0) goto L_0x03b6
            r4 = r19
            r3.a(r4)
        L_0x03b6:
            r4 = 0
            r3.f22239i = r4
        L_0x03b9:
            if (r1 > r2) goto L_0x03bf
            r1 = 35
            if (r2 <= r1) goto L_0x03c3
        L_0x03bf:
            r1 = 39
            if (r2 != r1) goto L_0x03c5
        L_0x03c3:
            r1 = 1
            goto L_0x03c6
        L_0x03c5:
            r1 = 0
        L_0x03c6:
            if (r1 == 0) goto L_0x03d0
            boolean r1 = r3.f22240j
            r4 = 1
            r1 = r1 ^ r4
            r3.f22238h = r1
            r3.f22240j = r4
        L_0x03d0:
            r1 = 16
            if (r2 < r1) goto L_0x03da
            r1 = 21
            if (r2 > r1) goto L_0x03da
            r1 = 1
            goto L_0x03db
        L_0x03da:
            r1 = 0
        L_0x03db:
            r3.f22233c = r1
            if (r1 != 0) goto L_0x03e6
            r1 = 9
            if (r2 > r1) goto L_0x03e4
            goto L_0x03e6
        L_0x03e4:
            r1 = 0
            goto L_0x03e7
        L_0x03e6:
            r1 = 1
        L_0x03e7:
            r3.f22236f = r1
            boolean r1 = r0.f22221e
            if (r1 != 0) goto L_0x03fc
            n5.r r1 = r0.f22223g
            r1.d(r2)
            n5.r r1 = r0.f22224h
            r1.d(r2)
            n5.r r1 = r0.f22225i
            r1.d(r2)
        L_0x03fc:
            n5.r r1 = r0.f22226j
            r1.d(r2)
            n5.r r1 = r0.f22227k
            r1.d(r2)
            r1 = r28
            r3 = r16
            r4 = r17
            r2 = r18
            goto L_0x002a
        L_0x0410:
            r1 = r28
            goto L_0x000b
        L_0x0414:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.n.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22218b = dVar.b();
        a0 l10 = kVar.l(dVar.c(), 2);
        this.f22219c = l10;
        this.f22220d = new a(l10);
        this.f22217a.a(kVar, dVar);
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22229m = j10;
    }
}
