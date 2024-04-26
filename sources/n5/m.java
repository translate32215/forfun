package n5;

import android.util.SparseArray;
import d5.a0;
import d5.b0;
import d5.k;
import n5.e0;
import v6.u;
import v6.v;

/* compiled from: H264Reader */
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    public final z f22168a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22169b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22170c;

    /* renamed from: d  reason: collision with root package name */
    public final r f22171d = new r(7, 128);

    /* renamed from: e  reason: collision with root package name */
    public final r f22172e = new r(8, 128);

    /* renamed from: f  reason: collision with root package name */
    public final r f22173f = new r(6, 128);

    /* renamed from: g  reason: collision with root package name */
    public long f22174g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f22175h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    public String f22176i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f22177j;

    /* renamed from: k  reason: collision with root package name */
    public b f22178k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22179l;

    /* renamed from: m  reason: collision with root package name */
    public long f22180m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f22181n;

    /* renamed from: o  reason: collision with root package name */
    public final v f22182o = new v();

    /* compiled from: H264Reader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f22183a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22184b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f22185c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<u.b> f22186d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<u.a> f22187e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final b0 f22188f;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f22189g;

        /* renamed from: h  reason: collision with root package name */
        public int f22190h;

        /* renamed from: i  reason: collision with root package name */
        public int f22191i;

        /* renamed from: j  reason: collision with root package name */
        public long f22192j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f22193k;

        /* renamed from: l  reason: collision with root package name */
        public long f22194l;

        /* renamed from: m  reason: collision with root package name */
        public a f22195m = new a((a) null);

        /* renamed from: n  reason: collision with root package name */
        public a f22196n = new a((a) null);

        /* renamed from: o  reason: collision with root package name */
        public boolean f22197o;

        /* renamed from: p  reason: collision with root package name */
        public long f22198p;

        /* renamed from: q  reason: collision with root package name */
        public long f22199q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f22200r;

        /* compiled from: H264Reader */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f22201a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f22202b;

            /* renamed from: c  reason: collision with root package name */
            public u.b f22203c;

            /* renamed from: d  reason: collision with root package name */
            public int f22204d;

            /* renamed from: e  reason: collision with root package name */
            public int f22205e;

            /* renamed from: f  reason: collision with root package name */
            public int f22206f;

            /* renamed from: g  reason: collision with root package name */
            public int f22207g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f22208h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f22209i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f22210j;

            /* renamed from: k  reason: collision with root package name */
            public boolean f22211k;

            /* renamed from: l  reason: collision with root package name */
            public int f22212l;

            /* renamed from: m  reason: collision with root package name */
            public int f22213m;

            /* renamed from: n  reason: collision with root package name */
            public int f22214n;

            /* renamed from: o  reason: collision with root package name */
            public int f22215o;

            /* renamed from: p  reason: collision with root package name */
            public int f22216p;

            public a(a aVar) {
            }
        }

        public b(a0 a0Var, boolean z10, boolean z11) {
            this.f22183a = a0Var;
            this.f22184b = z10;
            this.f22185c = z11;
            byte[] bArr = new byte[128];
            this.f22189g = bArr;
            this.f22188f = new b0(bArr, 0, 0);
            this.f22193k = false;
            this.f22197o = false;
            a aVar = this.f22196n;
            aVar.f22202b = false;
            aVar.f22201a = false;
        }
    }

    public m(z zVar, boolean z10, boolean z11) {
        this.f22168a = zVar;
        this.f22169b = z10;
        this.f22170c = z11;
    }

    public void a() {
        this.f22174g = 0;
        this.f22181n = false;
        u.a(this.f22175h);
        this.f22171d.c();
        this.f22172e.c();
        this.f22173f.c();
        b bVar = this.f22178k;
        if (bVar != null) {
            bVar.f22193k = false;
            bVar.f22197o = false;
            b.a aVar = bVar.f22196n;
            aVar.f22202b = false;
            aVar.f22201a = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0169  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f22179l
            if (r4 == 0) goto L_0x0012
            n5.m$b r4 = r0.f22178k
            boolean r4 = r4.f22185c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            n5.r r4 = r0.f22171d
            r4.a(r1, r2, r3)
            n5.r r4 = r0.f22172e
            r4.a(r1, r2, r3)
        L_0x001c:
            n5.r r4 = r0.f22173f
            r4.a(r1, r2, r3)
            n5.m$b r4 = r0.f22178k
            boolean r5 = r4.f22193k
            if (r5 != 0) goto L_0x0029
            goto L_0x01c3
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f22189g
            int r6 = r5.length
            int r7 = r4.f22190h
            int r7 = r7 + r3
            r8 = 2
            if (r6 >= r7) goto L_0x003b
            int r7 = r7 * 2
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f22189g = r5
        L_0x003b:
            byte[] r5 = r4.f22189g
            int r6 = r4.f22190h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f22190h
            int r1 = r1 + r3
            r4.f22190h = r1
            d5.b0 r2 = r4.f22188f
            byte[] r3 = r4.f22189g
            r5 = 0
            r2.o(r3, r5, r1)
            d5.b0 r1 = r4.f22188f
            r2 = 8
            boolean r1 = r1.d(r2)
            if (r1 != 0) goto L_0x005b
            goto L_0x01c3
        L_0x005b:
            d5.b0 r1 = r4.f22188f
            r1.r()
            d5.b0 r1 = r4.f22188f
            int r1 = r1.i(r8)
            d5.b0 r2 = r4.f22188f
            r3 = 5
            r2.s(r3)
            d5.b0 r2 = r4.f22188f
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x0076
            goto L_0x01c3
        L_0x0076:
            d5.b0 r2 = r4.f22188f
            r2.l()
            d5.b0 r2 = r4.f22188f
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x0085
            goto L_0x01c3
        L_0x0085:
            d5.b0 r2 = r4.f22188f
            int r2 = r2.l()
            boolean r6 = r4.f22185c
            r7 = 1
            if (r6 != 0) goto L_0x009a
            r4.f22193k = r5
            n5.m$b$a r1 = r4.f22196n
            r1.f22205e = r2
            r1.f22202b = r7
            goto L_0x01c3
        L_0x009a:
            d5.b0 r6 = r4.f22188f
            boolean r6 = r6.e()
            if (r6 != 0) goto L_0x00a4
            goto L_0x01c3
        L_0x00a4:
            d5.b0 r6 = r4.f22188f
            int r6 = r6.l()
            android.util.SparseArray<v6.u$a> r9 = r4.f22187e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00b6
            r4.f22193k = r5
            goto L_0x01c3
        L_0x00b6:
            android.util.SparseArray<v6.u$a> r9 = r4.f22187e
            java.lang.Object r9 = r9.get(r6)
            v6.u$a r9 = (v6.u.a) r9
            android.util.SparseArray<v6.u$b> r10 = r4.f22186d
            int r11 = r9.f26503b
            java.lang.Object r10 = r10.get(r11)
            v6.u$b r10 = (v6.u.b) r10
            boolean r11 = r10.f26512h
            if (r11 == 0) goto L_0x00db
            d5.b0 r11 = r4.f22188f
            boolean r11 = r11.d(r8)
            if (r11 != 0) goto L_0x00d6
            goto L_0x01c3
        L_0x00d6:
            d5.b0 r11 = r4.f22188f
            r11.s(r8)
        L_0x00db:
            d5.b0 r8 = r4.f22188f
            int r11 = r10.f26514j
            boolean r8 = r8.d(r11)
            if (r8 != 0) goto L_0x00e7
            goto L_0x01c3
        L_0x00e7:
            d5.b0 r8 = r4.f22188f
            int r11 = r10.f26514j
            int r8 = r8.i(r11)
            boolean r11 = r10.f26513i
            if (r11 != 0) goto L_0x0117
            d5.b0 r11 = r4.f22188f
            boolean r11 = r11.d(r7)
            if (r11 != 0) goto L_0x00fd
            goto L_0x01c3
        L_0x00fd:
            d5.b0 r11 = r4.f22188f
            boolean r11 = r11.h()
            if (r11 == 0) goto L_0x0118
            d5.b0 r12 = r4.f22188f
            boolean r12 = r12.d(r7)
            if (r12 != 0) goto L_0x010f
            goto L_0x01c3
        L_0x010f:
            d5.b0 r12 = r4.f22188f
            boolean r12 = r12.h()
            r13 = 1
            goto L_0x011a
        L_0x0117:
            r11 = 0
        L_0x0118:
            r12 = 0
            r13 = 0
        L_0x011a:
            int r14 = r4.f22191i
            if (r14 != r3) goto L_0x0120
            r3 = 1
            goto L_0x0121
        L_0x0120:
            r3 = 0
        L_0x0121:
            if (r3 == 0) goto L_0x0134
            d5.b0 r14 = r4.f22188f
            boolean r14 = r14.e()
            if (r14 != 0) goto L_0x012d
            goto L_0x01c3
        L_0x012d:
            d5.b0 r14 = r4.f22188f
            int r14 = r14.l()
            goto L_0x0135
        L_0x0134:
            r14 = 0
        L_0x0135:
            int r15 = r10.f26515k
            if (r15 != 0) goto L_0x0169
            d5.b0 r15 = r4.f22188f
            int r5 = r10.f26516l
            boolean r5 = r15.d(r5)
            if (r5 != 0) goto L_0x0145
            goto L_0x01c3
        L_0x0145:
            d5.b0 r5 = r4.f22188f
            int r15 = r10.f26516l
            int r5 = r5.i(r15)
            boolean r9 = r9.f26504c
            if (r9 == 0) goto L_0x0164
            if (r11 != 0) goto L_0x0164
            d5.b0 r9 = r4.f22188f
            boolean r9 = r9.e()
            if (r9 != 0) goto L_0x015d
            goto L_0x01c3
        L_0x015d:
            d5.b0 r9 = r4.f22188f
            int r9 = r9.m()
            goto L_0x0165
        L_0x0164:
            r9 = 0
        L_0x0165:
            r15 = r9
            r7 = 0
            r9 = 0
            goto L_0x019d
        L_0x0169:
            if (r15 != r7) goto L_0x0198
            boolean r5 = r10.f26517m
            if (r5 != 0) goto L_0x0198
            d5.b0 r5 = r4.f22188f
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x0178
            goto L_0x01c3
        L_0x0178:
            d5.b0 r5 = r4.f22188f
            int r5 = r5.m()
            boolean r9 = r9.f26504c
            if (r9 == 0) goto L_0x0199
            if (r11 != 0) goto L_0x0199
            d5.b0 r9 = r4.f22188f
            boolean r9 = r9.e()
            if (r9 != 0) goto L_0x018d
            goto L_0x01c3
        L_0x018d:
            d5.b0 r9 = r4.f22188f
            int r9 = r9.m()
            r7 = r9
            r15 = 0
            r9 = r5
            r5 = 0
            goto L_0x019d
        L_0x0198:
            r5 = 0
        L_0x0199:
            r9 = r5
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x019d:
            n5.m$b$a r0 = r4.f22196n
            r0.f22203c = r10
            r0.f22204d = r1
            r0.f22205e = r2
            r0.f22206f = r8
            r0.f22207g = r6
            r0.f22208h = r11
            r0.f22209i = r13
            r0.f22210j = r12
            r0.f22211k = r3
            r0.f22212l = r14
            r0.f22213m = r5
            r0.f22214n = r15
            r0.f22215o = r9
            r0.f22216p = r7
            r1 = 1
            r0.f22201a = r1
            r0.f22202b = r1
            r0 = 0
            r4.f22193k = r0
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.m.b(byte[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x027a, code lost:
        if (r6 != 1) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ac, code lost:
        if (r7.f22210j == r10.f22210j) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b6, code lost:
        if (r14 != 0) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ca, code lost:
        if (r7.f22214n == r10.f22214n) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01dd, code lost:
        if (r7.f22216p == r10.f22216p) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01eb, code lost:
        if (r7.f22212l == r10.f22212l) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f1, code lost:
        if (r7 == false) goto L_0x0225;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0241 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            d5.a0 r2 = r0.f22177j
            v6.a.f(r2)
            int r2 = v6.e0.f26436a
            int r2 = r1.f26519b
            int r3 = r1.f26520c
            byte[] r4 = r1.f26518a
            long r5 = r0.f22174g
            int r7 = r26.a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f22174g = r5
            d5.a0 r5 = r0.f22177j
            int r6 = r26.a()
            r5.b(r1, r6)
        L_0x0024:
            boolean[] r1 = r0.f22175h
            int r1 = v6.u.b(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0030
            r0.b(r4, r2, r3)
            return
        L_0x0030:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x003d
            r0.b(r4, r2, r1)
        L_0x003d:
            int r1 = r3 - r1
            long r8 = r0.f22174g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x0047
            int r7 = -r7
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            long r10 = r0.f22180m
            boolean r12 = r0.f22179l
            if (r12 == 0) goto L_0x005b
            n5.m$b r12 = r0.f22178k
            boolean r12 = r12.f22185c
            if (r12 == 0) goto L_0x0055
            goto L_0x005b
        L_0x0055:
            r16 = r3
            r17 = r4
            goto L_0x013a
        L_0x005b:
            n5.r r12 = r0.f22171d
            r12.b(r7)
            n5.r r12 = r0.f22172e
            r12.b(r7)
            boolean r12 = r0.f22179l
            r14 = 3
            if (r12 != 0) goto L_0x00fd
            n5.r r12 = r0.f22171d
            boolean r12 = r12.f22285c
            if (r12 == 0) goto L_0x0055
            n5.r r12 = r0.f22172e
            boolean r12 = r12.f22285c
            if (r12 == 0) goto L_0x0055
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            n5.r r15 = r0.f22171d
            byte[] r2 = r15.f22286d
            int r15 = r15.f22287e
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            n5.r r2 = r0.f22172e
            byte[] r15 = r2.f22286d
            int r2 = r2.f22287e
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            n5.r r2 = r0.f22171d
            byte[] r15 = r2.f22286d
            int r2 = r2.f22287e
            v6.u$b r2 = v6.u.d(r15, r14, r2)
            n5.r r15 = r0.f22172e
            byte[] r13 = r15.f22286d
            int r15 = r15.f22287e
            v6.u$a r13 = v6.u.c(r13, r14, r15)
            int r14 = r2.f26505a
            int r15 = r2.f26506b
            r16 = r3
            int r3 = r2.f26507c
            java.lang.String r3 = v6.c.a(r14, r15, r3)
            d5.a0 r14 = r0.f22177j
            x4.b0$b r15 = new x4.b0$b
            r15.<init>()
            r17 = r4
            java.lang.String r4 = r0.f22176i
            r15.f27415a = r4
            java.lang.String r4 = "video/avc"
            r15.f27425k = r4
            r15.f27422h = r3
            int r3 = r2.f26509e
            r15.f27430p = r3
            int r3 = r2.f26510f
            r15.f27431q = r3
            float r3 = r2.f26511g
            r15.f27434t = r3
            r15.f27427m = r12
            x4.b0 r3 = r15.a()
            r14.c(r3)
            r3 = 1
            r0.f22179l = r3
            n5.m$b r3 = r0.f22178k
            android.util.SparseArray<v6.u$b> r3 = r3.f22186d
            int r4 = r2.f26508d
            r3.append(r4, r2)
            n5.m$b r2 = r0.f22178k
            android.util.SparseArray<v6.u$a> r2 = r2.f22187e
            int r3 = r13.f26502a
            r2.append(r3, r13)
            n5.r r2 = r0.f22171d
            r2.c()
            n5.r r2 = r0.f22172e
            r2.c()
            goto L_0x013a
        L_0x00fd:
            r16 = r3
            r17 = r4
            n5.r r2 = r0.f22171d
            boolean r3 = r2.f22285c
            if (r3 == 0) goto L_0x011e
            byte[] r3 = r2.f22286d
            int r2 = r2.f22287e
            v6.u$b r2 = v6.u.d(r3, r14, r2)
            n5.m$b r3 = r0.f22178k
            android.util.SparseArray<v6.u$b> r3 = r3.f22186d
            int r4 = r2.f26508d
            r3.append(r4, r2)
            n5.r r2 = r0.f22171d
            r2.c()
            goto L_0x013a
        L_0x011e:
            n5.r r2 = r0.f22172e
            boolean r3 = r2.f22285c
            if (r3 == 0) goto L_0x013a
            byte[] r3 = r2.f22286d
            int r2 = r2.f22287e
            v6.u$a r2 = v6.u.c(r3, r14, r2)
            n5.m$b r3 = r0.f22178k
            android.util.SparseArray<v6.u$a> r3 = r3.f22187e
            int r4 = r2.f26502a
            r3.append(r4, r2)
            n5.r r2 = r0.f22172e
            r2.c()
        L_0x013a:
            n5.r r2 = r0.f22173f
            boolean r2 = r2.b(r7)
            if (r2 == 0) goto L_0x0164
            n5.r r2 = r0.f22173f
            byte[] r3 = r2.f22286d
            int r2 = r2.f22287e
            int r2 = v6.u.e(r3, r2)
            v6.v r3 = r0.f22182o
            n5.r r4 = r0.f22173f
            byte[] r4 = r4.f22286d
            r3.B(r4, r2)
            v6.v r2 = r0.f22182o
            r3 = 4
            r2.D(r3)
            n5.z r2 = r0.f22168a
            v6.v r3 = r0.f22182o
            d5.a0[] r2 = r2.f22338b
            d5.c.a(r10, r3, r2)
        L_0x0164:
            n5.m$b r2 = r0.f22178k
            boolean r3 = r0.f22179l
            boolean r4 = r0.f22181n
            int r7 = r2.f22191i
            r10 = 9
            if (r7 == r10) goto L_0x01f3
            boolean r7 = r2.f22185c
            if (r7 == 0) goto L_0x0225
            n5.m$b$a r7 = r2.f22196n
            n5.m$b$a r10 = r2.f22195m
            boolean r11 = r7.f22201a
            if (r11 != 0) goto L_0x017e
            goto L_0x01ee
        L_0x017e:
            boolean r11 = r10.f22201a
            if (r11 != 0) goto L_0x0184
            goto L_0x01f0
        L_0x0184:
            v6.u$b r11 = r7.f22203c
            v6.a.f(r11)
            v6.u$b r12 = r10.f22203c
            v6.a.f(r12)
            int r13 = r7.f22206f
            int r14 = r10.f22206f
            if (r13 != r14) goto L_0x01f0
            int r13 = r7.f22207g
            int r14 = r10.f22207g
            if (r13 != r14) goto L_0x01f0
            boolean r13 = r7.f22208h
            boolean r14 = r10.f22208h
            if (r13 != r14) goto L_0x01f0
            boolean r13 = r7.f22209i
            if (r13 == 0) goto L_0x01ae
            boolean r13 = r10.f22209i
            if (r13 == 0) goto L_0x01ae
            boolean r13 = r7.f22210j
            boolean r14 = r10.f22210j
            if (r13 != r14) goto L_0x01f0
        L_0x01ae:
            int r13 = r7.f22204d
            int r14 = r10.f22204d
            if (r13 == r14) goto L_0x01b8
            if (r13 == 0) goto L_0x01f0
            if (r14 == 0) goto L_0x01f0
        L_0x01b8:
            int r11 = r11.f26515k
            if (r11 != 0) goto L_0x01cc
            int r13 = r12.f26515k
            if (r13 != 0) goto L_0x01cc
            int r13 = r7.f22213m
            int r14 = r10.f22213m
            if (r13 != r14) goto L_0x01f0
            int r13 = r7.f22214n
            int r14 = r10.f22214n
            if (r13 != r14) goto L_0x01f0
        L_0x01cc:
            r13 = 1
            if (r11 != r13) goto L_0x01df
            int r11 = r12.f26515k
            if (r11 != r13) goto L_0x01df
            int r11 = r7.f22215o
            int r12 = r10.f22215o
            if (r11 != r12) goto L_0x01f0
            int r11 = r7.f22216p
            int r12 = r10.f22216p
            if (r11 != r12) goto L_0x01f0
        L_0x01df:
            boolean r11 = r7.f22211k
            boolean r12 = r10.f22211k
            if (r11 != r12) goto L_0x01f0
            if (r11 == 0) goto L_0x01ee
            int r7 = r7.f22212l
            int r10 = r10.f22212l
            if (r7 == r10) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            r7 = 0
            goto L_0x01f1
        L_0x01f0:
            r7 = 1
        L_0x01f1:
            if (r7 == 0) goto L_0x0225
        L_0x01f3:
            if (r3 == 0) goto L_0x0217
            boolean r3 = r2.f22197o
            if (r3 == 0) goto L_0x0217
            long r10 = r2.f22192j
            long r12 = r8 - r10
            int r3 = (int) r12
            int r23 = r1 + r3
            boolean r1 = r2.f22200r
            long r12 = r2.f22198p
            long r10 = r10 - r12
            int r3 = (int) r10
            d5.a0 r7 = r2.f22183a
            long r10 = r2.f22199q
            r24 = 0
            r18 = r7
            r19 = r10
            r21 = r1
            r22 = r3
            r18.d(r19, r21, r22, r23, r24)
        L_0x0217:
            long r10 = r2.f22192j
            r2.f22198p = r10
            long r10 = r2.f22194l
            r2.f22199q = r10
            r1 = 0
            r2.f22200r = r1
            r1 = 1
            r2.f22197o = r1
        L_0x0225:
            boolean r1 = r2.f22184b
            r3 = 2
            if (r1 == 0) goto L_0x023a
            n5.m$b$a r1 = r2.f22196n
            boolean r4 = r1.f22202b
            if (r4 == 0) goto L_0x0239
            int r1 = r1.f22205e
            r4 = 7
            if (r1 == r4) goto L_0x0237
            if (r1 != r3) goto L_0x0239
        L_0x0237:
            r4 = 1
            goto L_0x023a
        L_0x0239:
            r4 = 0
        L_0x023a:
            boolean r1 = r2.f22200r
            int r7 = r2.f22191i
            r10 = 5
            if (r7 == r10) goto L_0x0249
            if (r4 == 0) goto L_0x0247
            r4 = 1
            if (r7 != r4) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            r4 = 0
            goto L_0x024a
        L_0x0249:
            r4 = 1
        L_0x024a:
            r1 = r1 | r4
            r2.f22200r = r1
            if (r1 == 0) goto L_0x0252
            r1 = 0
            r0.f22181n = r1
        L_0x0252:
            long r1 = r0.f22180m
            boolean r4 = r0.f22179l
            if (r4 == 0) goto L_0x025e
            n5.m$b r4 = r0.f22178k
            boolean r4 = r4.f22185c
            if (r4 == 0) goto L_0x0268
        L_0x025e:
            n5.r r4 = r0.f22171d
            r4.d(r6)
            n5.r r4 = r0.f22172e
            r4.d(r6)
        L_0x0268:
            n5.r r4 = r0.f22173f
            r4.d(r6)
            n5.m$b r4 = r0.f22178k
            r4.f22191i = r6
            r4.f22194l = r1
            r4.f22192j = r8
            boolean r1 = r4.f22184b
            if (r1 == 0) goto L_0x027d
            r1 = 1
            if (r6 == r1) goto L_0x0288
            goto L_0x027e
        L_0x027d:
            r1 = 1
        L_0x027e:
            boolean r2 = r4.f22185c
            if (r2 == 0) goto L_0x029a
            if (r6 == r10) goto L_0x0288
            if (r6 == r1) goto L_0x0288
            if (r6 != r3) goto L_0x029a
        L_0x0288:
            n5.m$b$a r1 = r4.f22195m
            n5.m$b$a r2 = r4.f22196n
            r4.f22195m = r2
            r4.f22196n = r1
            r2 = 0
            r1.f22202b = r2
            r1.f22201a = r2
            r4.f22190h = r2
            r1 = 1
            r4.f22193k = r1
        L_0x029a:
            r2 = r5
            r3 = r16
            r4 = r17
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.m.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22176i = dVar.b();
        a0 l10 = kVar.l(dVar.c(), 2);
        this.f22177j = l10;
        this.f22178k = new b(l10, this.f22169b, this.f22170c);
        this.f22168a.a(kVar, dVar);
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22180m = j10;
        this.f22181n |= (i10 & 2) != 0;
    }
}
