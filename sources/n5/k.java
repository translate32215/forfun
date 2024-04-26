package n5;

import d5.a0;
import java.util.Arrays;
import n5.e0;
import v6.u;
import v6.v;

/* compiled from: H262Reader */
public final class k implements j {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f22120q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f22121a;

    /* renamed from: b  reason: collision with root package name */
    public a0 f22122b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f22123c;

    /* renamed from: d  reason: collision with root package name */
    public final v f22124d;

    /* renamed from: e  reason: collision with root package name */
    public final r f22125e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f22126f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final a f22127g = new a(128);

    /* renamed from: h  reason: collision with root package name */
    public long f22128h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22129i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22130j;

    /* renamed from: k  reason: collision with root package name */
    public long f22131k;

    /* renamed from: l  reason: collision with root package name */
    public long f22132l;

    /* renamed from: m  reason: collision with root package name */
    public long f22133m;

    /* renamed from: n  reason: collision with root package name */
    public long f22134n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22135o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22136p;

    /* compiled from: H262Reader */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f22137e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f22138a;

        /* renamed from: b  reason: collision with root package name */
        public int f22139b;

        /* renamed from: c  reason: collision with root package name */
        public int f22140c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f22141d;

        public a(int i10) {
            this.f22141d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f22138a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f22141d;
                int length = bArr2.length;
                int i13 = this.f22139b;
                if (length < i13 + i12) {
                    this.f22141d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f22141d, this.f22139b, i12);
                this.f22139b += i12;
            }
        }
    }

    public k(f0 f0Var) {
        this.f22123c = f0Var;
        if (f0Var != null) {
            this.f22125e = new r(178, 128);
            this.f22124d = new v();
            return;
        }
        this.f22125e = null;
        this.f22124d = null;
    }

    public void a() {
        u.a(this.f22126f);
        a aVar = this.f22127g;
        aVar.f22138a = false;
        aVar.f22139b = 0;
        aVar.f22140c = 0;
        r rVar = this.f22125e;
        if (rVar != null) {
            rVar.c();
        }
        this.f22128h = 0;
        this.f22129i = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            d5.a0 r2 = r0.f22122b
            v6.a.f(r2)
            int r2 = r1.f26519b
            int r3 = r1.f26520c
            byte[] r4 = r1.f26518a
            long r5 = r0.f22128h
            int r7 = r26.a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f22128h = r5
            d5.a0 r5 = r0.f22122b
            int r6 = r26.a()
            r5.b(r1, r6)
        L_0x0022:
            boolean[] r5 = r0.f22126f
            int r5 = v6.u.b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x003b
            boolean r1 = r0.f22130j
            if (r1 != 0) goto L_0x0033
            n5.k$a r1 = r0.f22127g
            r1.a(r4, r2, r3)
        L_0x0033:
            n5.r r1 = r0.f22125e
            if (r1 == 0) goto L_0x003a
            r1.a(r4, r2, r3)
        L_0x003a:
            return
        L_0x003b:
            byte[] r6 = r1.f26518a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f22130j
            r12 = 179(0xb3, float:2.51E-43)
            r13 = 0
            r14 = 1
            if (r9 != 0) goto L_0x0155
            if (r8 <= 0) goto L_0x0054
            n5.k$a r9 = r0.f22127g
            r9.a(r4, r2, r5)
        L_0x0054:
            if (r8 >= 0) goto L_0x0058
            int r9 = -r8
            goto L_0x0059
        L_0x0058:
            r9 = 0
        L_0x0059:
            n5.k$a r15 = r0.f22127g
            boolean r10 = r15.f22138a
            if (r10 == 0) goto L_0x0073
            int r10 = r15.f22139b
            int r10 = r10 - r9
            r15.f22139b = r10
            int r9 = r15.f22140c
            if (r9 != 0) goto L_0x006f
            r9 = 181(0xb5, float:2.54E-43)
            if (r6 != r9) goto L_0x006f
            r15.f22140c = r10
            goto L_0x0077
        L_0x006f:
            r15.f22138a = r13
            r9 = 1
            goto L_0x007e
        L_0x0073:
            if (r6 != r12) goto L_0x0077
            r15.f22138a = r14
        L_0x0077:
            byte[] r9 = n5.k.a.f22137e
            int r10 = r9.length
            r15.a(r9, r13, r10)
            r9 = 0
        L_0x007e:
            if (r9 == 0) goto L_0x0155
            n5.k$a r9 = r0.f22127g
            java.lang.String r10 = r0.f22121a
            r10.getClass()
            byte[] r11 = r9.f22141d
            int r15 = r9.f22139b
            byte[] r11 = java.util.Arrays.copyOf(r11, r15)
            r15 = 4
            byte r13 = r11[r15]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r16 = 5
            byte r12 = r11[r16]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r17 = 6
            byte r14 = r11[r17]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r15
            int r17 = r12 >> 4
            r13 = r13 | r17
            r12 = r12 & 15
            int r12 = r12 << 8
            r12 = r12 | r14
            r14 = 7
            byte r15 = r11[r14]
            r15 = r15 & 240(0xf0, float:3.36E-43)
            r14 = 4
            int r15 = r15 >> r14
            r14 = 2
            if (r15 == r14) goto L_0x00c9
            r14 = 3
            if (r15 == r14) goto L_0x00c3
            r14 = 4
            if (r15 == r14) goto L_0x00bd
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d0
        L_0x00bd:
            int r14 = r12 * 121
            float r14 = (float) r14
            int r15 = r13 * 100
            goto L_0x00ce
        L_0x00c3:
            int r14 = r12 * 16
            float r14 = (float) r14
            int r15 = r13 * 9
            goto L_0x00ce
        L_0x00c9:
            int r14 = r12 * 4
            float r14 = (float) r14
            int r15 = r13 * 3
        L_0x00ce:
            float r15 = (float) r15
            float r14 = r14 / r15
        L_0x00d0:
            x4.b0$b r15 = new x4.b0$b
            r15.<init>()
            r15.f27415a = r10
            java.lang.String r10 = "video/mpeg2"
            r15.f27425k = r10
            r15.f27430p = r13
            r15.f27431q = r12
            r15.f27434t = r14
            java.util.List r10 = java.util.Collections.singletonList(r11)
            r15.f27427m = r10
            x4.b0 r10 = r15.a()
            r12 = 7
            byte r12 = r11[r12]
            r12 = r12 & 15
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x0131
            double[] r13 = f22120q
            int r14 = r13.length
            if (r12 >= r14) goto L_0x0131
            r12 = r13[r12]
            int r9 = r9.f22140c
            int r9 = r9 + 9
            byte r14 = r11[r9]
            r14 = r14 & 96
            int r14 = r14 >> 5
            byte r9 = r11[r9]
            r9 = r9 & 31
            if (r14 == r9) goto L_0x0126
            double r14 = (double) r14
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r14)
            double r14 = r14 + r18
            int r9 = r9 + 1
            r16 = r6
            r11 = r7
            double r6 = (double) r9
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r14 = r14 / r6
            double r12 = r12 * r14
            goto L_0x0129
        L_0x0126:
            r16 = r6
            r11 = r7
        L_0x0129:
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 / r12
            long r6 = (long) r6
            goto L_0x0136
        L_0x0131:
            r16 = r6
            r11 = r7
            r6 = 0
        L_0x0136:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            android.util.Pair r6 = android.util.Pair.create(r10, r6)
            d5.a0 r7 = r0.f22122b
            java.lang.Object r9 = r6.first
            x4.b0 r9 = (x4.b0) r9
            r7.c(r9)
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r0.f22131k = r6
            r6 = 1
            r0.f22130j = r6
            goto L_0x0158
        L_0x0155:
            r16 = r6
            r11 = r7
        L_0x0158:
            n5.r r6 = r0.f22125e
            if (r6 == 0) goto L_0x019f
            if (r8 <= 0) goto L_0x0163
            r6.a(r4, r2, r5)
            r2 = 0
            goto L_0x0164
        L_0x0163:
            int r2 = -r8
        L_0x0164:
            n5.r r6 = r0.f22125e
            boolean r2 = r6.b(r2)
            if (r2 == 0) goto L_0x018a
            n5.r r2 = r0.f22125e
            byte[] r6 = r2.f22286d
            int r2 = r2.f22287e
            int r2 = v6.u.e(r6, r2)
            v6.v r6 = r0.f22124d
            int r7 = v6.e0.f26436a
            n5.r r7 = r0.f22125e
            byte[] r7 = r7.f22286d
            r6.B(r7, r2)
            n5.f0 r2 = r0.f22123c
            long r6 = r0.f22134n
            v6.v r8 = r0.f22124d
            r2.a(r6, r8)
        L_0x018a:
            r2 = 178(0xb2, float:2.5E-43)
            r6 = r16
            if (r6 != r2) goto L_0x01a1
            byte[] r2 = r1.f26518a
            int r7 = r5 + 2
            byte r2 = r2[r7]
            r7 = 1
            if (r2 != r7) goto L_0x01a1
            n5.r r2 = r0.f22125e
            r2.d(r6)
            goto L_0x01a1
        L_0x019f:
            r6 = r16
        L_0x01a1:
            if (r6 == 0) goto L_0x01b0
            r2 = 179(0xb3, float:2.51E-43)
            if (r6 != r2) goto L_0x01a8
            goto L_0x01b0
        L_0x01a8:
            r2 = 184(0xb8, float:2.58E-43)
            if (r6 != r2) goto L_0x0212
            r2 = 1
            r0.f22135o = r2
            goto L_0x0212
        L_0x01b0:
            int r2 = r3 - r5
            boolean r5 = r0.f22129i
            if (r5 == 0) goto L_0x01d9
            boolean r5 = r0.f22136p
            if (r5 == 0) goto L_0x01d9
            boolean r5 = r0.f22130j
            if (r5 == 0) goto L_0x01d9
            boolean r5 = r0.f22135o
            long r7 = r0.f22128h
            long r9 = r0.f22133m
            long r7 = r7 - r9
            int r8 = (int) r7
            int r22 = r8 - r2
            d5.a0 r7 = r0.f22122b
            long r8 = r0.f22134n
            r24 = 0
            r18 = r7
            r19 = r8
            r21 = r5
            r23 = r2
            r18.d(r19, r21, r22, r23, r24)
        L_0x01d9:
            boolean r5 = r0.f22129i
            if (r5 == 0) goto L_0x01e5
            boolean r7 = r0.f22136p
            if (r7 == 0) goto L_0x01e2
            goto L_0x01e5
        L_0x01e2:
            r2 = 0
            r5 = 1
            goto L_0x020b
        L_0x01e5:
            long r7 = r0.f22128h
            long r9 = (long) r2
            long r7 = r7 - r9
            r0.f22133m = r7
            long r7 = r0.f22132l
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01f7
            goto L_0x0201
        L_0x01f7:
            if (r5 == 0) goto L_0x01ff
            long r7 = r0.f22134n
            long r12 = r0.f22131k
            long r7 = r7 + r12
            goto L_0x0201
        L_0x01ff:
            r7 = 0
        L_0x0201:
            r0.f22134n = r7
            r2 = 0
            r0.f22135o = r2
            r0.f22132l = r9
            r5 = 1
            r0.f22129i = r5
        L_0x020b:
            if (r6 != 0) goto L_0x020f
            r13 = 1
            goto L_0x0210
        L_0x020f:
            r13 = 0
        L_0x0210:
            r0.f22136p = r13
        L_0x0212:
            r2 = r11
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.k.c(v6.v):void");
    }

    public void d(d5.k kVar, e0.d dVar) {
        dVar.a();
        this.f22121a = dVar.b();
        this.f22122b = kVar.l(dVar.c(), 2);
        f0 f0Var = this.f22123c;
        if (f0Var != null) {
            f0Var.b(kVar, dVar);
        }
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22132l = j10;
    }
}
