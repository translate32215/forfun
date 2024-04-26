package k6;

import h6.c;
import java.util.zip.Inflater;
import v6.v;

/* compiled from: PgsDecoder */
public final class a extends c {

    /* renamed from: n  reason: collision with root package name */
    public final v f20037n = new v();

    /* renamed from: o  reason: collision with root package name */
    public final v f20038o = new v();

    /* renamed from: p  reason: collision with root package name */
    public final C0175a f20039p = new C0175a();

    /* renamed from: q  reason: collision with root package name */
    public Inflater f20040q;

    /* renamed from: k6.a$a  reason: collision with other inner class name */
    /* compiled from: PgsDecoder */
    public static final class C0175a {

        /* renamed from: a  reason: collision with root package name */
        public final v f20041a = new v();

        /* renamed from: b  reason: collision with root package name */
        public final int[] f20042b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        public boolean f20043c;

        /* renamed from: d  reason: collision with root package name */
        public int f20044d;

        /* renamed from: e  reason: collision with root package name */
        public int f20045e;

        /* renamed from: f  reason: collision with root package name */
        public int f20046f;

        /* renamed from: g  reason: collision with root package name */
        public int f20047g;

        /* renamed from: h  reason: collision with root package name */
        public int f20048h;

        /* renamed from: i  reason: collision with root package name */
        public int f20049i;

        public void a() {
            this.f20044d = 0;
            this.f20045e = 0;
            this.f20046f = 0;
            this.f20047g = 0;
            this.f20048h = 0;
            this.f20049i = 0;
            this.f20041a.z(0);
            this.f20043c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c4, code lost:
        r10 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h6.e k(byte[] r33, int r34, boolean r35) throws h6.g {
        /*
            r32 = this;
            r0 = r32
            v6.v r1 = r0.f20037n
            r2 = r33
            r1.f26518a = r2
            r2 = r34
            r1.f26520c = r2
            r2 = 0
            r1.f26519b = r2
            int r3 = r1.a()
            if (r3 <= 0) goto L_0x003b
            int r3 = r1.c()
            r4 = 120(0x78, float:1.68E-43)
            if (r3 != r4) goto L_0x003b
            java.util.zip.Inflater r3 = r0.f20040q
            if (r3 != 0) goto L_0x0028
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r3.<init>()
            r0.f20040q = r3
        L_0x0028:
            v6.v r3 = r0.f20038o
            java.util.zip.Inflater r4 = r0.f20040q
            boolean r3 = v6.e0.F(r1, r3, r4)
            if (r3 == 0) goto L_0x003b
            v6.v r3 = r0.f20038o
            byte[] r4 = r3.f26518a
            int r3 = r3.f26520c
            r1.B(r4, r3)
        L_0x003b:
            k6.a$a r1 = r0.f20039p
            r1.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0045:
            v6.v r3 = r0.f20037n
            int r3 = r3.a()
            r4 = 3
            if (r3 < r4) goto L_0x0291
            v6.v r3 = r0.f20037n
            k6.a$a r5 = r0.f20039p
            int r6 = r3.f26520c
            int r7 = r3.s()
            int r8 = r3.x()
            int r9 = r3.f26519b
            int r9 = r9 + r8
            if (r9 <= r6) goto L_0x0068
            r3.D(r6)
            r10 = 0
            r13 = 0
            goto L_0x0285
        L_0x0068:
            r6 = 128(0x80, float:1.794E-43)
            if (r7 == r6) goto L_0x01c8
            switch(r7) {
                case 20: goto L_0x00ed;
                case 21: goto L_0x0098;
                case 22: goto L_0x0072;
                default: goto L_0x006f;
            }
        L_0x006f:
            r7 = r3
            goto L_0x01c4
        L_0x0072:
            r5.getClass()
            r4 = 19
            if (r8 >= r4) goto L_0x007a
            goto L_0x006f
        L_0x007a:
            int r4 = r3.x()
            r5.f20044d = r4
            int r4 = r3.x()
            r5.f20045e = r4
            r4 = 11
            r3.E(r4)
            int r4 = r3.x()
            r5.f20046f = r4
            int r4 = r3.x()
            r5.f20047g = r4
            goto L_0x006f
        L_0x0098:
            r5.getClass()
            r7 = 4
            if (r8 >= r7) goto L_0x009f
            goto L_0x006f
        L_0x009f:
            r3.E(r4)
            int r4 = r3.s()
            r4 = r4 & r6
            if (r4 == 0) goto L_0x00ab
            r11 = 1
            goto L_0x00ac
        L_0x00ab:
            r11 = 0
        L_0x00ac:
            int r8 = r8 + -4
            if (r11 == 0) goto L_0x00d0
            r4 = 7
            if (r8 >= r4) goto L_0x00b4
            goto L_0x006f
        L_0x00b4:
            int r4 = r3.u()
            if (r4 >= r7) goto L_0x00bb
            goto L_0x006f
        L_0x00bb:
            int r6 = r3.x()
            r5.f20048h = r6
            int r6 = r3.x()
            r5.f20049i = r6
            v6.v r6 = r5.f20041a
            int r4 = r4 + -4
            r6.z(r4)
            int r8 = r8 + -7
        L_0x00d0:
            v6.v r4 = r5.f20041a
            int r6 = r4.f26519b
            int r4 = r4.f26520c
            if (r6 >= r4) goto L_0x006f
            if (r8 <= 0) goto L_0x006f
            int r4 = r4 - r6
            int r4 = java.lang.Math.min(r8, r4)
            v6.v r7 = r5.f20041a
            byte[] r7 = r7.f26518a
            r3.e(r7, r6, r4)
            v6.v r5 = r5.f20041a
            int r6 = r6 + r4
            r5.D(r6)
            goto L_0x006f
        L_0x00ed:
            r5.getClass()
            int r4 = r8 % 5
            r6 = 2
            if (r4 == r6) goto L_0x00f7
            goto L_0x006f
        L_0x00f7:
            r3.E(r6)
            int[] r4 = r5.f20042b
            java.util.Arrays.fill(r4, r2)
            int r8 = r8 / 5
            r4 = 0
        L_0x0102:
            if (r4 >= r8) goto L_0x01c0
            int r6 = r3.s()
            int r7 = r3.s()
            int r12 = r3.s()
            int r13 = r3.s()
            int r14 = r3.s()
            double r10 = (double) r7
            r15 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r12 = r12 + -128
            r7 = r3
            double r2 = (double) r12
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            double r15 = r15 * r2
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            r12 = r1
            double r0 = r15 + r10
            int r0 = (int) r0
            r15 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r13 = r13 + -128
            r1 = r12
            double r12 = (double) r13
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            double r15 = r15 * r12
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            double r15 = r10 - r15
            r17 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r17
            double r2 = r15 - r2
            int r2 = (int) r2
            r15 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r12)
            double r12 = r12 * r15
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r10)
            double r12 = r12 + r10
            int r3 = (int) r12
            int[] r10 = r5.f20042b
            int r11 = r14 << 24
            r12 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r0 = v6.e0.i(r0, r13, r12)
            int r0 = r0 << 16
            r0 = r0 | r11
            int r2 = v6.e0.i(r2, r13, r12)
            int r2 = r2 << 8
            r0 = r0 | r2
            int r2 = v6.e0.i(r3, r13, r12)
            r0 = r0 | r2
            r10[r6] = r0
            int r4 = r4 + 1
            r0 = r32
            r3 = r7
            r2 = 0
            goto L_0x0102
        L_0x01c0:
            r7 = r3
            r0 = 1
            r5.f20043c = r0
        L_0x01c4:
            r10 = 0
            r13 = 0
            goto L_0x0282
        L_0x01c8:
            r7 = r3
            int r0 = r5.f20044d
            if (r0 == 0) goto L_0x027d
            int r0 = r5.f20045e
            if (r0 == 0) goto L_0x027d
            int r0 = r5.f20048h
            if (r0 == 0) goto L_0x027d
            int r0 = r5.f20049i
            if (r0 == 0) goto L_0x027d
            v6.v r0 = r5.f20041a
            int r2 = r0.f26520c
            if (r2 == 0) goto L_0x027d
            int r3 = r0.f26519b
            if (r3 != r2) goto L_0x027d
            boolean r2 = r5.f20043c
            if (r2 != 0) goto L_0x01e9
            goto L_0x027d
        L_0x01e9:
            r13 = 0
            r0.D(r13)
            int r0 = r5.f20048h
            int r2 = r5.f20049i
            int r0 = r0 * r2
            int[] r2 = new int[r0]
            r3 = 0
        L_0x01f6:
            if (r3 >= r0) goto L_0x0239
            v6.v r4 = r5.f20041a
            int r4 = r4.s()
            if (r4 == 0) goto L_0x020a
            int r6 = r3 + 1
            int[] r8 = r5.f20042b
            r4 = r8[r4]
            r2[r3] = r4
        L_0x0208:
            r3 = r6
            goto L_0x01f6
        L_0x020a:
            v6.v r4 = r5.f20041a
            int r4 = r4.s()
            if (r4 == 0) goto L_0x01f6
            r6 = r4 & 64
            if (r6 != 0) goto L_0x0219
            r6 = r4 & 63
            goto L_0x0224
        L_0x0219:
            r6 = r4 & 63
            int r6 = r6 << 8
            v6.v r8 = r5.f20041a
            int r8 = r8.s()
            r6 = r6 | r8
        L_0x0224:
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x022a
            r4 = 0
            goto L_0x0234
        L_0x022a:
            int[] r4 = r5.f20042b
            v6.v r8 = r5.f20041a
            int r8 = r8.s()
            r4 = r4[r8]
        L_0x0234:
            int r6 = r6 + r3
            java.util.Arrays.fill(r2, r3, r6, r4)
            goto L_0x0208
        L_0x0239:
            int r0 = r5.f20048h
            int r3 = r5.f20049i
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r17 = android.graphics.Bitmap.createBitmap(r2, r0, r3, r4)
            r30 = 0
            r16 = 0
            r15 = r16
            r24 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r23
            r27 = 0
            r28 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r5.f20046f
            float r0 = (float) r0
            int r2 = r5.f20044d
            float r2 = (float) r2
            float r21 = r0 / r2
            r22 = 0
            int r0 = r5.f20047g
            float r0 = (float) r0
            int r3 = r5.f20045e
            float r3 = (float) r3
            float r18 = r0 / r3
            r19 = 0
            r20 = 0
            int r0 = r5.f20048h
            float r0 = (float) r0
            float r25 = r0 / r2
            int r0 = r5.f20049i
            float r0 = (float) r0
            float r26 = r0 / r3
            h6.b r10 = new h6.b
            r14 = r10
            r31 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x027f
        L_0x027d:
            r13 = 0
            r10 = 0
        L_0x027f:
            r5.a()
        L_0x0282:
            r7.D(r9)
        L_0x0285:
            r0 = r1
            if (r10 == 0) goto L_0x028b
            r0.add(r10)
        L_0x028b:
            r1 = r0
            r2 = 0
            r0 = r32
            goto L_0x0045
        L_0x0291:
            r0 = r1
            k6.b r1 = new k6.b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a.k(byte[], int, boolean):h6.e");
    }
}
