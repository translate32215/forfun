package n5;

import d5.a0;
import d5.k;
import java.util.Arrays;
import n5.e0;
import v6.u;
import v6.v;

/* compiled from: H263Reader */
public final class l implements j {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f22142l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final f0 f22143a;

    /* renamed from: b  reason: collision with root package name */
    public final v f22144b = new v();

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f22145c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final a f22146d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    public final r f22147e = new r(178, 128);

    /* renamed from: f  reason: collision with root package name */
    public b f22148f;

    /* renamed from: g  reason: collision with root package name */
    public long f22149g;

    /* renamed from: h  reason: collision with root package name */
    public String f22150h;

    /* renamed from: i  reason: collision with root package name */
    public a0 f22151i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22152j;

    /* renamed from: k  reason: collision with root package name */
    public long f22153k;

    /* compiled from: H263Reader */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        public static final byte[] f22154f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f22155a;

        /* renamed from: b  reason: collision with root package name */
        public int f22156b;

        /* renamed from: c  reason: collision with root package name */
        public int f22157c;

        /* renamed from: d  reason: collision with root package name */
        public int f22158d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f22159e;

        public a(int i10) {
            this.f22159e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f22155a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f22159e;
                int length = bArr2.length;
                int i13 = this.f22157c;
                if (length < i13 + i12) {
                    this.f22159e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f22159e, this.f22157c, i12);
                this.f22157c += i12;
            }
        }

        public void b() {
            this.f22155a = false;
            this.f22157c = 0;
            this.f22156b = 0;
        }
    }

    /* compiled from: H263Reader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f22160a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f22161b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22162c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22163d;

        /* renamed from: e  reason: collision with root package name */
        public int f22164e;

        /* renamed from: f  reason: collision with root package name */
        public int f22165f;

        /* renamed from: g  reason: collision with root package name */
        public long f22166g;

        /* renamed from: h  reason: collision with root package name */
        public long f22167h;

        public b(a0 a0Var) {
            this.f22160a = a0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f22162c) {
                int i12 = this.f22165f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f22163d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f22162c = false;
                    return;
                }
                this.f22165f = (i11 - i10) + i12;
            }
        }
    }

    public l(f0 f0Var) {
        this.f22143a = f0Var;
    }

    public void a() {
        u.a(this.f22145c);
        this.f22146d.b();
        b bVar = this.f22148f;
        if (bVar != null) {
            bVar.f22161b = false;
            bVar.f22162c = false;
            bVar.f22163d = false;
            bVar.f22164e = -1;
        }
        r rVar = this.f22147e;
        if (rVar != null) {
            rVar.c();
        }
        this.f22149g = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            n5.l$b r2 = r0.f22148f
            v6.a.f(r2)
            d5.a0 r2 = r0.f22151i
            v6.a.f(r2)
            int r2 = r1.f26519b
            int r3 = r1.f26520c
            byte[] r4 = r1.f26518a
            long r5 = r0.f22149g
            int r7 = r26.a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f22149g = r5
            d5.a0 r5 = r0.f22151i
            int r6 = r26.a()
            r5.b(r1, r6)
        L_0x0027:
            boolean[] r5 = r0.f22145c
            int r5 = v6.u.b(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0045
            boolean r1 = r0.f22152j
            if (r1 != 0) goto L_0x0038
            n5.l$a r1 = r0.f22146d
            r1.a(r4, r2, r3)
        L_0x0038:
            n5.l$b r1 = r0.f22148f
            r1.a(r4, r2, r3)
            n5.r r1 = r0.f22147e
            if (r1 == 0) goto L_0x0044
            r1.a(r4, r2, r3)
        L_0x0044:
            return
        L_0x0045:
            byte[] r6 = r1.f26518a
            int r7 = r5 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 - r2
            boolean r9 = r0.f22152j
            r12 = 1
            if (r9 != 0) goto L_0x01db
            if (r8 <= 0) goto L_0x005b
            n5.l$a r9 = r0.f22146d
            r9.a(r4, r2, r5)
        L_0x005b:
            if (r8 >= 0) goto L_0x005f
            int r9 = -r8
            goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            n5.l$a r13 = r0.f22146d
            int r14 = r13.f22156b
            java.lang.String r11 = "H263Reader"
            r10 = 2
            if (r14 == 0) goto L_0x00bf
            java.lang.String r15 = "Unexpected start code value"
            if (r14 == r12) goto L_0x00b1
            if (r14 == r10) goto L_0x00a2
            r12 = 3
            if (r14 == r12) goto L_0x008d
            r12 = 4
            if (r14 != r12) goto L_0x0087
            r12 = 179(0xb3, float:2.51E-43)
            if (r6 == r12) goto L_0x007d
            r12 = 181(0xb5, float:2.54E-43)
            if (r6 != r12) goto L_0x00c8
        L_0x007d:
            int r12 = r13.f22157c
            int r12 = r12 - r9
            r13.f22157c = r12
            r9 = 0
            r13.f22155a = r9
            r9 = 1
            goto L_0x00d0
        L_0x0087:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x008d:
            r9 = r6 & 240(0xf0, float:3.36E-43)
            r12 = 32
            if (r9 == r12) goto L_0x009a
            android.util.Log.w(r11, r15)
            r13.b()
            goto L_0x00c8
        L_0x009a:
            int r9 = r13.f22157c
            r13.f22158d = r9
            r9 = 4
            r13.f22156b = r9
            goto L_0x00c8
        L_0x00a2:
            r9 = 31
            if (r6 <= r9) goto L_0x00ad
            android.util.Log.w(r11, r15)
            r13.b()
            goto L_0x00c8
        L_0x00ad:
            r9 = 3
            r13.f22156b = r9
            goto L_0x00c8
        L_0x00b1:
            r9 = 181(0xb5, float:2.54E-43)
            if (r6 == r9) goto L_0x00bc
            android.util.Log.w(r11, r15)
            r13.b()
            goto L_0x00c8
        L_0x00bc:
            r13.f22156b = r10
            goto L_0x00c8
        L_0x00bf:
            r9 = 176(0xb0, float:2.47E-43)
            if (r6 != r9) goto L_0x00c8
            r9 = 1
            r13.f22156b = r9
            r13.f22155a = r9
        L_0x00c8:
            byte[] r9 = n5.l.a.f22154f
            int r12 = r9.length
            r14 = 0
            r13.a(r9, r14, r12)
            r9 = 0
        L_0x00d0:
            if (r9 == 0) goto L_0x01db
            d5.a0 r9 = r0.f22151i
            n5.l$a r12 = r0.f22146d
            int r13 = r12.f22158d
            java.lang.String r14 = r0.f22150h
            r14.getClass()
            byte[] r15 = r12.f22159e
            int r12 = r12.f22157c
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            d5.b0 r15 = new d5.b0
            r10 = 0
            r16 = r7
            r7 = 1
            r15.<init>((byte[]) r12, (int) r7, (q.e) r10)
            r15.t(r13)
            r7 = 4
            r15.t(r7)
            r15.r()
            r10 = 8
            r15.s(r10)
            boolean r13 = r15.h()
            if (r13 == 0) goto L_0x010a
            r15.s(r7)
            r13 = 3
            r15.s(r13)
        L_0x010a:
            int r7 = r15.i(r7)
            java.lang.String r13 = "Invalid aspect ratio"
            r17 = r3
            r3 = 15
            if (r7 != r3) goto L_0x0129
            int r7 = r15.i(r10)
            int r10 = r15.i(r10)
            if (r10 != 0) goto L_0x0124
            android.util.Log.w(r11, r13)
            goto L_0x0134
        L_0x0124:
            float r7 = (float) r7
            float r10 = (float) r10
            float r13 = r7 / r10
            goto L_0x0136
        L_0x0129:
            float[] r10 = f22142l
            int r3 = r10.length
            if (r7 >= r3) goto L_0x0131
            r13 = r10[r7]
            goto L_0x0136
        L_0x0131:
            android.util.Log.w(r11, r13)
        L_0x0134:
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x0136:
            boolean r3 = r15.h()
            if (r3 == 0) goto L_0x0170
            r3 = 2
            r15.s(r3)
            r3 = 1
            r15.s(r3)
            boolean r3 = r15.h()
            if (r3 == 0) goto L_0x0170
            r3 = 15
            r15.s(r3)
            r15.r()
            r15.s(r3)
            r15.r()
            r15.s(r3)
            r15.r()
            r7 = 3
            r15.s(r7)
            r7 = 11
            r15.s(r7)
            r15.r()
            r15.s(r3)
            r15.r()
        L_0x0170:
            r3 = 2
            int r3 = r15.i(r3)
            if (r3 == 0) goto L_0x017c
            java.lang.String r3 = "Unhandled video object layer shape"
            android.util.Log.w(r11, r3)
        L_0x017c:
            r15.r()
            r3 = 16
            int r3 = r15.i(r3)
            r15.r()
            boolean r7 = r15.h()
            if (r7 == 0) goto L_0x01a3
            if (r3 != 0) goto L_0x0196
            java.lang.String r3 = "Invalid vop_increment_time_resolution"
            android.util.Log.w(r11, r3)
            goto L_0x01a3
        L_0x0196:
            int r3 = r3 + -1
            r7 = 0
        L_0x0199:
            if (r3 <= 0) goto L_0x01a0
            int r7 = r7 + 1
            int r3 = r3 >> 1
            goto L_0x0199
        L_0x01a0:
            r15.s(r7)
        L_0x01a3:
            r15.r()
            r3 = 13
            int r7 = r15.i(r3)
            r15.r()
            int r3 = r15.i(r3)
            r15.r()
            r15.r()
            x4.b0$b r10 = new x4.b0$b
            r10.<init>()
            r10.f27415a = r14
            java.lang.String r11 = "video/mp4v-es"
            r10.f27425k = r11
            r10.f27430p = r7
            r10.f27431q = r3
            r10.f27434t = r13
            java.util.List r3 = java.util.Collections.singletonList(r12)
            r10.f27427m = r3
            x4.b0 r3 = r10.a()
            r9.c(r3)
            r3 = 1
            r0.f22152j = r3
            goto L_0x01df
        L_0x01db:
            r17 = r3
            r16 = r7
        L_0x01df:
            n5.l$b r3 = r0.f22148f
            r3.a(r4, r2, r5)
            n5.r r3 = r0.f22147e
            if (r3 == 0) goto L_0x0229
            if (r8 <= 0) goto L_0x01ef
            r3.a(r4, r2, r5)
            r2 = 0
            goto L_0x01f0
        L_0x01ef:
            int r2 = -r8
        L_0x01f0:
            n5.r r3 = r0.f22147e
            boolean r2 = r3.b(r2)
            if (r2 == 0) goto L_0x0216
            n5.r r2 = r0.f22147e
            byte[] r3 = r2.f22286d
            int r2 = r2.f22287e
            int r2 = v6.u.e(r3, r2)
            v6.v r3 = r0.f22144b
            int r7 = v6.e0.f26436a
            n5.r r7 = r0.f22147e
            byte[] r7 = r7.f22286d
            r3.B(r7, r2)
            n5.f0 r2 = r0.f22143a
            long r7 = r0.f22153k
            v6.v r3 = r0.f22144b
            r2.a(r7, r3)
        L_0x0216:
            r2 = 178(0xb2, float:2.5E-43)
            if (r6 != r2) goto L_0x0229
            byte[] r2 = r1.f26518a
            int r3 = r5 + 2
            byte r2 = r2[r3]
            r9 = 1
            if (r2 != r9) goto L_0x022a
            n5.r r2 = r0.f22147e
            r2.d(r6)
            goto L_0x022a
        L_0x0229:
            r9 = 1
        L_0x022a:
            int r2 = r17 - r5
            long r7 = r0.f22149g
            long r10 = (long) r2
            long r7 = r7 - r10
            n5.l$b r3 = r0.f22148f
            boolean r5 = r0.f22152j
            int r10 = r3.f22164e
            r11 = 182(0xb6, float:2.55E-43)
            if (r10 != r11) goto L_0x025a
            if (r5 == 0) goto L_0x025a
            boolean r5 = r3.f22161b
            if (r5 == 0) goto L_0x025a
            long r12 = r3.f22166g
            long r12 = r7 - r12
            int r5 = (int) r12
            boolean r10 = r3.f22163d
            d5.a0 r12 = r3.f22160a
            long r13 = r3.f22167h
            r24 = 0
            r18 = r12
            r19 = r13
            r21 = r10
            r22 = r5
            r23 = r2
            r18.d(r19, r21, r22, r23, r24)
        L_0x025a:
            int r2 = r3.f22164e
            r5 = 179(0xb3, float:2.51E-43)
            if (r2 == r5) goto L_0x0262
            r3.f22166g = r7
        L_0x0262:
            n5.l$b r2 = r0.f22148f
            long r7 = r0.f22153k
            r2.f22164e = r6
            r3 = 0
            r2.f22163d = r3
            if (r6 == r11) goto L_0x0274
            r3 = 179(0xb3, float:2.51E-43)
            if (r6 != r3) goto L_0x0272
            goto L_0x0274
        L_0x0272:
            r3 = 0
            goto L_0x0275
        L_0x0274:
            r3 = 1
        L_0x0275:
            r2.f22161b = r3
            if (r6 != r11) goto L_0x027b
            r12 = 1
            goto L_0x027c
        L_0x027b:
            r12 = 0
        L_0x027c:
            r2.f22162c = r12
            r3 = 0
            r2.f22165f = r3
            r2.f22167h = r7
            r2 = r16
            r3 = r17
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.l.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22150h = dVar.b();
        a0 l10 = kVar.l(dVar.c(), 2);
        this.f22151i = l10;
        this.f22148f = new b(l10);
        f0 f0Var = this.f22143a;
        if (f0Var != null) {
            f0Var.b(kVar, dVar);
        }
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22153k = j10;
    }
}
