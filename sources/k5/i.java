package k5;

import d5.a0;
import d5.j;
import d5.k;
import d5.x;
import d5.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k5.a;
import q5.a;
import v6.u;
import v6.v;
import w5.b;

/* compiled from: Mp4Extractor */
public final class i implements d5.i, x {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19955y = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f19956a;

    /* renamed from: b  reason: collision with root package name */
    public final v f19957b;

    /* renamed from: c  reason: collision with root package name */
    public final v f19958c;

    /* renamed from: d  reason: collision with root package name */
    public final v f19959d;

    /* renamed from: e  reason: collision with root package name */
    public final v f19960e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<a.C0173a> f19961f;

    /* renamed from: g  reason: collision with root package name */
    public final k f19962g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a.b> f19963h;

    /* renamed from: i  reason: collision with root package name */
    public int f19964i;

    /* renamed from: j  reason: collision with root package name */
    public int f19965j;

    /* renamed from: k  reason: collision with root package name */
    public long f19966k;

    /* renamed from: l  reason: collision with root package name */
    public int f19967l;

    /* renamed from: m  reason: collision with root package name */
    public v f19968m;

    /* renamed from: n  reason: collision with root package name */
    public int f19969n;

    /* renamed from: o  reason: collision with root package name */
    public int f19970o;

    /* renamed from: p  reason: collision with root package name */
    public int f19971p;

    /* renamed from: q  reason: collision with root package name */
    public int f19972q;

    /* renamed from: r  reason: collision with root package name */
    public k f19973r;

    /* renamed from: s  reason: collision with root package name */
    public a[] f19974s;

    /* renamed from: t  reason: collision with root package name */
    public long[][] f19975t;

    /* renamed from: u  reason: collision with root package name */
    public int f19976u;

    /* renamed from: v  reason: collision with root package name */
    public long f19977v;

    /* renamed from: w  reason: collision with root package name */
    public int f19978w;

    /* renamed from: x  reason: collision with root package name */
    public b f19979x;

    /* compiled from: Mp4Extractor */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f19980a;

        /* renamed from: b  reason: collision with root package name */
        public final p f19981b;

        /* renamed from: c  reason: collision with root package name */
        public final a0 f19982c;

        /* renamed from: d  reason: collision with root package name */
        public int f19983d;

        public a(m mVar, p pVar, a0 a0Var) {
            this.f19980a = mVar;
            this.f19981b = pVar;
            this.f19982c = a0Var;
        }
    }

    static {
        t4.k kVar = t4.k.f25707a;
    }

    public i(int i10) {
        this.f19956a = i10;
        this.f19964i = (i10 & 4) != 0 ? 3 : 0;
        this.f19962g = new k();
        this.f19963h = new ArrayList();
        this.f19960e = new v(16);
        this.f19961f = new ArrayDeque<>();
        this.f19957b = new v(u.f26498a);
        this.f19958c = new v(4);
        this.f19959d = new v();
        this.f19969n = -1;
    }

    public static long l(p pVar, long j10, long j11) {
        int a10 = pVar.a(j10);
        if (a10 == -1) {
            a10 = pVar.b(j10);
        }
        if (a10 == -1) {
            return j11;
        }
        return Math.min(pVar.f20031c[a10], j11);
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.f19977v;
    }

    public boolean e(j jVar) throws IOException {
        return l.a(jVar, false, (this.f19956a & 2) != 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x047e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x068f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r40, d5.w r41) throws java.io.IOException {
        /*
            r39 = this;
            r1 = r39
            r0 = r40
            r2 = r41
        L_0x0006:
            int r3 = r1.f19964i
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r11 = 4
            r12 = 2
            r13 = 0
            r14 = 1
            if (r3 == 0) goto L_0x0480
            r15 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r14) goto L_0x03ec
            r17 = 8
            r4 = 7
            if (r3 == r12) goto L_0x026e
            r15 = 3
            if (r3 != r15) goto L_0x0268
            k5.k r3 = r1.f19962g
            java.util.List<q5.a$b> r7 = r1.f19963h
            int r5 = r3.f19990b
            if (r5 == 0) goto L_0x0244
            if (r5 == r14) goto L_0x01e7
            r10 = 2816(0xb00, float:3.946E-42)
            if (r5 == r12) goto L_0x016d
            if (r5 != r15) goto L_0x0167
            long r16 = r40.l()
            long r19 = r40.b()
            long r22 = r40.l()
            long r19 = r19 - r22
            int r5 = r3.f19991c
            long r4 = (long) r5
            long r4 = r19 - r4
            int r5 = (int) r4
            v6.v r4 = new v6.v
            r4.<init>((int) r5)
            byte[] r6 = r4.f26518a
            r0.readFully(r6, r13, r5)
            r0 = 0
        L_0x004d:
            java.util.List<k5.k$a> r5 = r3.f19989a
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0161
            java.util.List<k5.k$a> r5 = r3.f19989a
            java.lang.Object r5 = r5.get(r0)
            k5.k$a r5 = (k5.k.a) r5
            long r8 = r5.f19992a
            long r8 = r8 - r16
            int r9 = (int) r8
            r4.D(r9)
            r4.E(r11)
            int r8 = r4.h()
            java.lang.String r9 = r4.p(r8)
            int r21 = r9.hashCode()
            switch(r21) {
                case -1711564334: goto L_0x00a4;
                case -1332107749: goto L_0x0099;
                case -1251387154: goto L_0x008e;
                case -830665521: goto L_0x0083;
                case 1760745220: goto L_0x0078;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x00af
        L_0x0078:
            java.lang.String r6 = "Super_SlowMotion_BGM"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x0081
            goto L_0x00af
        L_0x0081:
            r6 = 4
            goto L_0x00b0
        L_0x0083:
            java.lang.String r6 = "Super_SlowMotion_Deflickering_On"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x008c
            goto L_0x00af
        L_0x008c:
            r6 = 3
            goto L_0x00b0
        L_0x008e:
            java.lang.String r6 = "Super_SlowMotion_Data"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r6 = 2
            goto L_0x00b0
        L_0x0099:
            java.lang.String r6 = "Super_SlowMotion_Edit_Data"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00a2
            goto L_0x00af
        L_0x00a2:
            r6 = 1
            goto L_0x00b0
        L_0x00a4:
            java.lang.String r6 = "SlowMotion_Data"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r6 = 0
            goto L_0x00b0
        L_0x00af:
            r6 = -1
        L_0x00b0:
            if (r6 == 0) goto L_0x00ce
            if (r6 == r14) goto L_0x00cb
            if (r6 == r12) goto L_0x00c8
            if (r6 == r15) goto L_0x00c5
            if (r6 != r11) goto L_0x00bd
            r9 = 2817(0xb01, float:3.947E-42)
            goto L_0x00d0
        L_0x00bd:
            x4.m0 r0 = new x4.m0
            java.lang.String r2 = "Invalid SEF name"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00c5:
            r9 = 2820(0xb04, float:3.952E-42)
            goto L_0x00d0
        L_0x00c8:
            r9 = 2816(0xb00, float:3.946E-42)
            goto L_0x00d0
        L_0x00cb:
            r9 = 2819(0xb03, float:3.95E-42)
            goto L_0x00d0
        L_0x00ce:
            r9 = 2192(0x890, float:3.072E-42)
        L_0x00d0:
            int r5 = r5.f19993b
            int r8 = r8 + 8
            int r5 = r5 - r8
            r6 = 2192(0x890, float:3.072E-42)
            if (r9 == r6) goto L_0x00ee
            if (r9 == r10) goto L_0x015c
            r5 = 2817(0xb01, float:3.947E-42)
            if (r9 == r5) goto L_0x015c
            r5 = 2819(0xb03, float:3.95E-42)
            if (r9 == r5) goto L_0x015c
            r5 = 2820(0xb04, float:3.952E-42)
            if (r9 != r5) goto L_0x00e8
            goto L_0x015c
        L_0x00e8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ee:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r5 = r4.p(r5)
            aa.k r9 = k5.k.f19988e
            java.util.List r5 = r9.a(r5)
            r9 = 0
        L_0x00fe:
            int r6 = r5.size()
            if (r9 >= r6) goto L_0x0154
            aa.k r6 = k5.k.f19987d
            java.lang.Object r21 = r5.get(r9)
            r11 = r21
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.util.List r6 = r6.a(r11)
            int r11 = r6.size()
            if (r11 != r15) goto L_0x014e
            java.lang.Object r11 = r6.get(r13)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0147 }
            long r25 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.Object r11 = r6.get(r14)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0147 }
            long r27 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ NumberFormatException -> 0x0147 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x0147 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0147 }
            int r6 = r6 - r14
            int r29 = r14 << r6
            w5.c$b r6 = new w5.c$b     // Catch:{ NumberFormatException -> 0x0147 }
            r24 = r6
            r24.<init>(r25, r27, r29)     // Catch:{ NumberFormatException -> 0x0147 }
            r8.add(r6)     // Catch:{ NumberFormatException -> 0x0147 }
            int r9 = r9 + 1
            r11 = 4
            goto L_0x00fe
        L_0x0147:
            r0 = move-exception
            x4.m0 r2 = new x4.m0
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x014e:
            x4.m0 r0 = new x4.m0
            r0.<init>()
            throw r0
        L_0x0154:
            w5.c r5 = new w5.c
            r5.<init>(r8)
            r7.add(r5)
        L_0x015c:
            int r0 = r0 + 1
            r11 = 4
            goto L_0x004d
        L_0x0161:
            r5 = 0
            r2.f13063a = r5
            goto L_0x025c
        L_0x0167:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x016d:
            long r4 = r40.b()
            int r6 = r3.f19991c
            int r6 = r6 + -12
            r7 = 8
            int r6 = r6 - r7
            v6.v r7 = new v6.v
            r7.<init>((int) r6)
            byte[] r8 = r7.f26518a
            r0.readFully(r8, r13, r6)
            r0 = 0
        L_0x0183:
            int r8 = r6 / 12
            if (r0 >= r8) goto L_0x01c8
            r7.E(r12)
            short r8 = r7.i()
            r9 = 2192(0x890, float:3.072E-42)
            if (r8 == r9) goto L_0x01a6
            if (r8 == r10) goto L_0x01a6
            r11 = 2817(0xb01, float:3.947E-42)
            if (r8 == r11) goto L_0x01a8
            r9 = 2819(0xb03, float:3.95E-42)
            if (r8 == r9) goto L_0x01a8
            r9 = 2820(0xb04, float:3.952E-42)
            if (r8 == r9) goto L_0x01a8
            r9 = 8
            r7.E(r9)
            goto L_0x01c1
        L_0x01a6:
            r11 = 2817(0xb01, float:3.947E-42)
        L_0x01a8:
            int r9 = r3.f19991c
            long r10 = (long) r9
            long r10 = r4 - r10
            int r9 = r7.h()
            long r12 = (long) r9
            long r10 = r10 - r12
            int r9 = r7.h()
            java.util.List<k5.k$a> r12 = r3.f19989a
            k5.k$a r13 = new k5.k$a
            r13.<init>(r8, r10, r9)
            r12.add(r13)
        L_0x01c1:
            int r0 = r0 + 1
            r10 = 2816(0xb00, float:3.946E-42)
            r12 = 2
            r13 = 0
            goto L_0x0183
        L_0x01c8:
            java.util.List<k5.k$a> r0 = r3.f19989a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01d6
            r4 = 0
            r2.f13063a = r4
            goto L_0x025c
        L_0x01d6:
            r3.f19990b = r15
            java.util.List<k5.k$a> r0 = r3.f19989a
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            k5.k$a r0 = (k5.k.a) r0
            long r3 = r0.f19992a
            r2.f13063a = r3
            goto L_0x025c
        L_0x01e7:
            r5 = 0
            r6 = 8
            byte[] r7 = new byte[r6]
            r0.readFully(r7, r5, r6)
            byte r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r8 = r7[r14]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r6
            r5 = r5 | r8
            r6 = 2
            byte r8 = r7[r6]
            r6 = r8 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            byte r6 = r7[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r5 = r5 | r6
            r6 = 8
            int r5 = r5 + r6
            r3.f19991c = r5
            r5 = 5
            r6 = 4
            byte r6 = r7[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r8 = 6
            byte r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r5 = r5 | r6
            byte r6 = r7[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r8 = 8
            int r6 = r6 << r8
            r5 = r5 | r6
            byte r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            r5 = 1397048916(0x53454654, float:8.4728847E11)
            if (r4 == r5) goto L_0x0234
            r4 = 0
            r2.f13063a = r4
            goto L_0x025c
        L_0x0234:
            long r4 = r40.l()
            int r0 = r3.f19991c
            int r0 = r0 + -12
            long r6 = (long) r0
            long r4 = r4 - r6
            r2.f13063a = r4
            r0 = 2
            r3.f19990b = r0
            goto L_0x025c
        L_0x0244:
            long r4 = r40.b()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0256
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0253
            goto L_0x0256
        L_0x0253:
            long r4 = r4 - r17
            goto L_0x0258
        L_0x0256:
            r4 = 0
        L_0x0258:
            r2.f13063a = r4
            r3.f19990b = r14
        L_0x025c:
            long r2 = r2.f13063a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0267
            r39.k()
        L_0x0267:
            return r14
        L_0x0268:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x026e:
            long r5 = r40.l()
            int r3 = r1.f19969n
            r7 = -1
            if (r3 != r7) goto L_0x02ee
            r3 = -1
            r4 = 1
            r9 = -1
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 1
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x028b:
            k5.i$a[] r14 = r1.f19974s
            int r28 = v6.e0.f26436a
            int r7 = r14.length
            if (r10 >= r7) goto L_0x02d2
            r7 = r14[r10]
            int r8 = r7.f19983d
            k5.p r7 = r7.f19981b
            int r14 = r7.f20030b
            if (r8 != r14) goto L_0x029d
            goto L_0x02cf
        L_0x029d:
            long[] r7 = r7.f20031c
            r30 = r7[r8]
            long[][] r7 = r1.f19975t
            r7 = r7[r10]
            r32 = r7[r8]
            long r30 = r30 - r5
            r7 = 0
            int r14 = (r30 > r7 ? 1 : (r30 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x02b6
            int r7 = (r30 > r15 ? 1 : (r30 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            r7 = 0
            goto L_0x02b7
        L_0x02b6:
            r7 = 1
        L_0x02b7:
            if (r7 != 0) goto L_0x02bb
            if (r4 != 0) goto L_0x02c1
        L_0x02bb:
            if (r7 != r4) goto L_0x02c7
            int r8 = (r30 > r25 ? 1 : (r30 == r25 ? 0 : -1))
            if (r8 >= 0) goto L_0x02c7
        L_0x02c1:
            r4 = r7
            r9 = r10
            r25 = r30
            r19 = r32
        L_0x02c7:
            int r8 = (r32 > r11 ? 1 : (r32 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x02cf
            r13 = r7
            r3 = r10
            r11 = r32
        L_0x02cf:
            int r10 = r10 + 1
            goto L_0x028b
        L_0x02d2:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x02e5
            if (r13 == 0) goto L_0x02e5
            r7 = 10485760(0xa00000, double:5.180654E-317)
            long r11 = r11 + r7
            int r4 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x02e6
        L_0x02e5:
            r3 = r9
        L_0x02e6:
            r1.f19969n = r3
            r4 = -1
            if (r3 != r4) goto L_0x02ee
            r7 = -1
            goto L_0x03eb
        L_0x02ee:
            k5.i$a[] r3 = r1.f19974s
            int r4 = v6.e0.f26436a
            int r4 = r1.f19969n
            r3 = r3[r4]
            d5.a0 r7 = r3.f19982c
            int r4 = r3.f19983d
            k5.p r8 = r3.f19981b
            long[] r9 = r8.f20031c
            r10 = r9[r4]
            int[] r8 = r8.f20032d
            r8 = r8[r4]
            long r5 = r10 - r5
            int r9 = r1.f19970o
            long r12 = (long) r9
            long r5 = r5 + r12
            r12 = 0
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x03e8
            int r9 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x0316
            goto L_0x03e8
        L_0x0316:
            k5.m r2 = r3.f19980a
            int r2 = r2.f20001g
            r9 = 1
            if (r2 != r9) goto L_0x0321
            long r5 = r5 + r17
            int r8 = r8 + -8
        L_0x0321:
            int r2 = (int) r5
            r0.g(r2)
            k5.m r2 = r3.f19980a
            int r5 = r2.f20004j
            if (r5 == 0) goto L_0x0389
            v6.v r2 = r1.f19958c
            byte[] r2 = r2.f26518a
            r6 = 0
            r2[r6] = r6
            r9 = 1
            r2[r9] = r6
            r9 = 2
            r2[r9] = r6
            int r6 = 4 - r5
        L_0x033a:
            int r9 = r1.f19971p
            if (r9 >= r8) goto L_0x03c6
            int r9 = r1.f19972q
            if (r9 != 0) goto L_0x0374
            r0.readFully(r2, r6, r5)
            int r9 = r1.f19970o
            int r9 = r9 + r5
            r1.f19970o = r9
            v6.v r9 = r1.f19958c
            r10 = 0
            r9.D(r10)
            v6.v r9 = r1.f19958c
            int r9 = r9.f()
            if (r9 < 0) goto L_0x036c
            r1.f19972q = r9
            v6.v r9 = r1.f19957b
            r9.D(r10)
            v6.v r9 = r1.f19957b
            r10 = 4
            r7.b(r9, r10)
            int r9 = r1.f19971p
            int r9 = r9 + r10
            r1.f19971p = r9
            int r8 = r8 + r6
            goto L_0x033a
        L_0x036c:
            x4.m0 r0 = new x4.m0
            java.lang.String r2 = "Invalid NAL length"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0374:
            r10 = 0
            int r9 = r7.f(r0, r9, r10)
            int r10 = r1.f19970o
            int r10 = r10 + r9
            r1.f19970o = r10
            int r10 = r1.f19971p
            int r10 = r10 + r9
            r1.f19971p = r10
            int r10 = r1.f19972q
            int r10 = r10 - r9
            r1.f19972q = r10
            goto L_0x033a
        L_0x0389:
            x4.b0 r2 = r2.f20000f
            java.lang.String r2 = r2.f27408t
            java.lang.String r5 = "audio/ac4"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x03ab
            int r2 = r1.f19971p
            if (r2 != 0) goto L_0x03a9
            v6.v r2 = r1.f19959d
            z4.c.a(r8, r2)
            v6.v r2 = r1.f19959d
            r5 = 7
            r7.b(r2, r5)
            int r2 = r1.f19971p
            int r2 = r2 + r5
            r1.f19971p = r2
        L_0x03a9:
            int r8 = r8 + 7
        L_0x03ab:
            int r2 = r1.f19971p
            if (r2 >= r8) goto L_0x03c6
            int r2 = r8 - r2
            r5 = 0
            int r2 = r7.f(r0, r2, r5)
            int r5 = r1.f19970o
            int r5 = r5 + r2
            r1.f19970o = r5
            int r5 = r1.f19971p
            int r5 = r5 + r2
            r1.f19971p = r5
            int r5 = r1.f19972q
            int r5 = r5 - r2
            r1.f19972q = r5
            goto L_0x03ab
        L_0x03c6:
            r11 = r8
            k5.p r0 = r3.f19981b
            long[] r2 = r0.f20034f
            r8 = r2[r4]
            int[] r0 = r0.f20035g
            r10 = r0[r4]
            r12 = 0
            r13 = 0
            r7.d(r8, r10, r11, r12, r13)
            int r0 = r3.f19983d
            r2 = 1
            int r0 = r0 + r2
            r3.f19983d = r0
            r0 = -1
            r1.f19969n = r0
            r0 = 0
            r1.f19970o = r0
            r1.f19971p = r0
            r1.f19972q = r0
            r7 = 0
            goto L_0x03eb
        L_0x03e8:
            r2.f13063a = r10
            r7 = 1
        L_0x03eb:
            return r7
        L_0x03ec:
            long r5 = r1.f19966k
            int r3 = r1.f19967l
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r40.l()
            long r7 = r7 + r5
            v6.v r3 = r1.f19968m
            if (r3 == 0) goto L_0x045d
            byte[] r9 = r3.f26518a
            int r10 = r1.f19967l
            int r6 = (int) r5
            r0.readFully(r9, r10, r6)
            int r5 = r1.f19965j
            if (r5 != r4) goto L_0x0440
            r4 = 8
            r3.D(r4)
            int r4 = r3.f()
            r5 = 1903435808(0x71742020, float:1.2088509E30)
            r6 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r6) goto L_0x041e
            if (r4 == r5) goto L_0x041c
            r4 = 0
            goto L_0x041f
        L_0x041c:
            r4 = 1
            goto L_0x041f
        L_0x041e:
            r4 = 2
        L_0x041f:
            if (r4 == 0) goto L_0x0422
            goto L_0x043d
        L_0x0422:
            r4 = 4
            r3.E(r4)
        L_0x0426:
            int r4 = r3.a()
            if (r4 <= 0) goto L_0x043c
            int r4 = r3.f()
            if (r4 == r6) goto L_0x0438
            if (r4 == r5) goto L_0x0436
            r4 = 0
            goto L_0x0439
        L_0x0436:
            r4 = 1
            goto L_0x0439
        L_0x0438:
            r4 = 2
        L_0x0439:
            if (r4 == 0) goto L_0x0426
            goto L_0x043d
        L_0x043c:
            r4 = 0
        L_0x043d:
            r1.f19978w = r4
            goto L_0x0465
        L_0x0440:
            java.util.ArrayDeque<k5.a$a> r4 = r1.f19961f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0465
            java.util.ArrayDeque<k5.a$a> r4 = r1.f19961f
            java.lang.Object r4 = r4.peek()
            k5.a$a r4 = (k5.a.C0173a) r4
            k5.a$b r5 = new k5.a$b
            int r6 = r1.f19965j
            r5.<init>(r6, r3)
            java.util.List<k5.a$b> r3 = r4.f19896c
            r3.add(r5)
            goto L_0x0465
        L_0x045d:
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0467
            int r3 = (int) r5
            r0.g(r3)
        L_0x0465:
            r3 = 0
            goto L_0x046f
        L_0x0467:
            long r3 = r40.l()
            long r3 = r3 + r5
            r2.f13063a = r3
            r3 = 1
        L_0x046f:
            r1.m(r7)
            if (r3 == 0) goto L_0x047b
            int r3 = r1.f19964i
            r4 = 2
            if (r3 == r4) goto L_0x047b
            r13 = 1
            goto L_0x047c
        L_0x047b:
            r13 = 0
        L_0x047c:
            if (r13 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0480:
            r3 = 1
            int r5 = r1.f19967l
            r6 = 0
            if (r5 != 0) goto L_0x04f3
            v6.v r5 = r1.f19960e
            byte[] r5 = r5.f26518a
            r7 = 8
            r8 = 0
            boolean r5 = r0.d(r5, r8, r7, r3)
            if (r5 != 0) goto L_0x04d9
            int r3 = r1.f19978w
            r4 = 2
            if (r3 != r4) goto L_0x04d6
            int r3 = r1.f19956a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04d6
            d5.k r3 = r1.f19973r
            r3.getClass()
            r4 = 4
            d5.a0 r4 = r3.l(r8, r4)
            w5.b r5 = r1.f19979x
            if (r5 != 0) goto L_0x04ac
            goto L_0x04b6
        L_0x04ac:
            q5.a r6 = new q5.a
            r7 = 1
            q5.a$b[] r7 = new q5.a.b[r7]
            r7[r8] = r5
            r6.<init>((q5.a.b[]) r7)
        L_0x04b6:
            x4.b0$b r5 = new x4.b0$b
            r5.<init>()
            r5.f27423i = r6
            x4.b0 r5 = r5.a()
            r4.c(r5)
            r3.d()
            d5.x$b r4 = new d5.x$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r4.<init>(r5, r7)
            r3.b(r4)
        L_0x04d6:
            r13 = 0
            goto L_0x068d
        L_0x04d9:
            r3 = 8
            r1.f19967l = r3
            v6.v r3 = r1.f19960e
            r5 = 0
            r3.D(r5)
            v6.v r3 = r1.f19960e
            long r7 = r3.t()
            r1.f19966k = r7
            v6.v r3 = r1.f19960e
            int r3 = r3.f()
            r1.f19965j = r3
        L_0x04f3:
            long r7 = r1.f19966k
            r9 = 1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0512
            v6.v r3 = r1.f19960e
            byte[] r3 = r3.f26518a
            r5 = 8
            r0.readFully(r3, r5, r5)
            int r3 = r1.f19967l
            int r3 = r3 + r5
            r1.f19967l = r3
            v6.v r3 = r1.f19960e
            long r7 = r3.w()
            r1.f19966k = r7
            goto L_0x053d
        L_0x0512:
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x053d
            long r7 = r40.b()
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x052e
            java.util.ArrayDeque<k5.a$a> r3 = r1.f19961f
            java.lang.Object r3 = r3.peek()
            k5.a$a r3 = (k5.a.C0173a) r3
            if (r3 == 0) goto L_0x052e
            long r7 = r3.f19895b
        L_0x052e:
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x053d
            long r9 = r40.l()
            long r7 = r7 - r9
            int r3 = r1.f19967l
            long r9 = (long) r3
            long r7 = r7 + r9
            r1.f19966k = r7
        L_0x053d:
            long r7 = r1.f19966k
            int r3 = r1.f19967l
            long r9 = (long) r3
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0691
            int r5 = r1.f19965j
            r7 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r7) goto L_0x056e
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r7) goto L_0x056e
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r7) goto L_0x056e
            r7 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r7) goto L_0x056e
            r7 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r7) goto L_0x056e
            r7 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r7) goto L_0x056e
            if (r5 != r8) goto L_0x056c
            goto L_0x056e
        L_0x056c:
            r7 = 0
            goto L_0x056f
        L_0x056e:
            r7 = 1
        L_0x056f:
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            if (r7 == 0) goto L_0x05d4
            long r3 = r40.l()
            long r5 = r1.f19966k
            long r3 = r3 + r5
            int r7 = r1.f19967l
            long r10 = (long) r7
            long r3 = r3 - r10
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x05b5
            int r5 = r1.f19965j
            if (r5 != r8) goto L_0x05b5
            v6.v r5 = r1.f19959d
            r6 = 8
            r5.z(r6)
            v6.v r5 = r1.f19959d
            byte[] r5 = r5.f26518a
            r7 = 0
            r0.j(r5, r7, r6)
            v6.v r5 = r1.f19959d
            byte[] r6 = k5.c.f19899a
            int r6 = r5.f26519b
            r7 = 4
            r5.E(r7)
            int r7 = r5.f()
            if (r7 == r9) goto L_0x05a8
            int r6 = r6 + 4
        L_0x05a8:
            r5.D(r6)
            v6.v r5 = r1.f19959d
            int r5 = r5.f26519b
            r0.g(r5)
            r40.f()
        L_0x05b5:
            java.util.ArrayDeque<k5.a$a> r5 = r1.f19961f
            k5.a$a r6 = new k5.a$a
            int r7 = r1.f19965j
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r1.f19966k
            int r7 = r1.f19967l
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x05ce
            r1.m(r3)
            goto L_0x05d1
        L_0x05ce:
            r39.k()
        L_0x05d1:
            r3 = 1
            goto L_0x068c
        L_0x05d4:
            r7 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r7) goto L_0x062b
            r7 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r7) goto L_0x062b
            if (r5 == r9) goto L_0x062b
            r7 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r7) goto L_0x062b
            r7 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r7) goto L_0x062b
            r7 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r7) goto L_0x062b
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r7) goto L_0x062b
            r7 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r7) goto L_0x062b
            if (r5 == r4) goto L_0x062b
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x062b
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x062b
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0629
            goto L_0x062b
        L_0x0629:
            r5 = 0
            goto L_0x062c
        L_0x062b:
            r5 = 1
        L_0x062c:
            if (r5 == 0) goto L_0x0661
            r4 = 8
            if (r3 != r4) goto L_0x0634
            r5 = 1
            goto L_0x0635
        L_0x0634:
            r5 = 0
        L_0x0635:
            v6.a.d(r5)
            long r3 = r1.f19966k
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0643
            r5 = 1
            goto L_0x0644
        L_0x0643:
            r5 = 0
        L_0x0644:
            v6.a.d(r5)
            v6.v r3 = new v6.v
            long r4 = r1.f19966k
            int r5 = (int) r4
            r3.<init>((int) r5)
            v6.v r4 = r1.f19960e
            byte[] r4 = r4.f26518a
            byte[] r5 = r3.f26518a
            r6 = 8
            r7 = 0
            java.lang.System.arraycopy(r4, r7, r5, r7, r6)
            r1.f19968m = r3
            r3 = 1
            r1.f19964i = r3
            goto L_0x068c
        L_0x0661:
            long r3 = r40.l()
            int r5 = r1.f19967l
            long r7 = (long) r5
            long r31 = r3 - r7
            int r3 = r1.f19965j
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0687
            w5.b r3 = new w5.b
            r29 = 0
            r33 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r35 = r31 + r7
            long r4 = r1.f19966k
            long r37 = r4 - r7
            r28 = r3
            r28.<init>(r29, r31, r33, r35, r37)
            r1.f19979x = r3
        L_0x0687:
            r1.f19968m = r6
            r3 = 1
            r1.f19964i = r3
        L_0x068c:
            r13 = 1
        L_0x068d:
            if (r13 != 0) goto L_0x0006
            r3 = -1
            return r3
        L_0x0691:
            x4.m0 r0 = new x4.m0
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r0.<init>((java.lang.String) r2)
            goto L_0x069a
        L_0x0699:
            throw r0
        L_0x069a:
            goto L_0x0699
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        this.f19961f.clear();
        this.f19967l = 0;
        this.f19969n = -1;
        this.f19970o = 0;
        this.f19971p = 0;
        this.f19972q = 0;
        if (j10 != 0) {
            a[] aVarArr = this.f19974s;
            if (aVarArr != null) {
                for (a aVar : aVarArr) {
                    p pVar = aVar.f19981b;
                    int a10 = pVar.a(j11);
                    if (a10 == -1) {
                        a10 = pVar.b(j11);
                    }
                    aVar.f19983d = a10;
                }
            }
        } else if (this.f19964i != 3) {
            k();
        } else {
            k kVar = this.f19962g;
            kVar.f19989a.clear();
            kVar.f19990b = 0;
            this.f19963h.clear();
        }
    }

    public void i(k kVar) {
        this.f19973r = kVar;
    }

    public x.a j(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        long j15 = j10;
        a[] aVarArr = this.f19974s;
        aVarArr.getClass();
        if (aVarArr.length == 0) {
            return new x.a(y.f13068c);
        }
        long j16 = -1;
        int i10 = this.f19976u;
        if (i10 != -1) {
            p pVar = this.f19974s[i10].f19981b;
            int a10 = pVar.a(j15);
            if (a10 == -1) {
                a10 = pVar.b(j15);
            }
            if (a10 == -1) {
                return new x.a(y.f13068c);
            }
            long j17 = pVar.f20034f[a10];
            j11 = pVar.f20031c[a10];
            if (j17 >= j15 || a10 >= pVar.f20030b - 1 || (b10 = pVar.b(j15)) == -1 || b10 == a10) {
                j14 = -9223372036854775807L;
            } else {
                long j18 = pVar.f20034f[b10];
                long j19 = pVar.f20031c[b10];
                j14 = j18;
                j16 = j19;
            }
            j12 = j16;
            j13 = j14;
            j15 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr2 = this.f19974s;
            if (i11 >= aVarArr2.length) {
                break;
            }
            if (i11 != this.f19976u) {
                p pVar2 = aVarArr2[i11].f19981b;
                long l10 = l(pVar2, j15, j11);
                if (j13 != -9223372036854775807L) {
                    j12 = l(pVar2, j13, j12);
                }
                j11 = l10;
            }
            i11++;
        }
        y yVar = new y(j15, j11);
        if (j13 == -9223372036854775807L) {
            return new x.a(yVar);
        }
        return new x.a(yVar, new y(j13, j12));
    }

    public final void k() {
        this.f19964i = 0;
        this.f19967l = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x035b, code lost:
        r12 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0595 A[LOOP:11: B:279:0x0592->B:281:0x0595, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05f6 A[LOOP:12: B:293:0x05f3->B:295:0x05f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x02c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5 A[Catch:{ all -> 0x022a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(long r23) throws x4.m0 {
        /*
            r22 = this;
            r1 = r22
        L_0x0002:
            java.util.ArrayDeque<k5.a$a> r0 = r1.f19961f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x067f
            java.util.ArrayDeque<k5.a$a> r0 = r1.f19961f
            java.lang.Object r0 = r0.peek()
            k5.a$a r0 = (k5.a.C0173a) r0
            long r2 = r0.f19895b
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x067f
            java.util.ArrayDeque<k5.a$a> r0 = r1.f19961f
            java.lang.Object r0 = r0.pop()
            r2 = r0
            k5.a$a r2 = (k5.a.C0173a) r2
            int r0 = r2.f19894a
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r0 != r3) goto L_0x0666
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r1.f19978w
            r4 = 1
            if (r3 != r4) goto L_0x0035
            r3 = 1
            r8 = 1
            goto L_0x0037
        L_0x0035:
            r3 = 0
            r8 = 0
        L_0x0037:
            d5.t r10 = new d5.t
            r10.<init>()
            r3 = 1969517665(0x75647461, float:2.8960062E32)
            k5.a$b r3 = r2.c(r3)
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 1835365473(0x6d657461, float:4.4382975E27)
            r7 = 4
            r9 = 8
            r11 = 0
            if (r3 == 0) goto L_0x038d
            byte[] r12 = k5.c.f19899a
            v6.v r3 = r3.f19898b
            r3.D(r9)
            r12 = r11
            r13 = r12
        L_0x005b:
            int r14 = r3.a()
            if (r14 < r9) goto L_0x0374
            int r14 = r3.f26519b
            int r15 = r3.f()
            r16 = r4
            int r4 = r3.f()
            if (r4 != r6) goto L_0x02fc
            r3.D(r14)
            int r4 = r14 + r15
            r3.E(r9)
            int r6 = r3.f26519b
            r3.E(r7)
            int r7 = r3.f()
            if (r7 == r5) goto L_0x0084
            int r6 = r6 + 4
        L_0x0084:
            r3.D(r6)
            r5 = r16
        L_0x0089:
            int r6 = r3.f26519b
            if (r6 >= r4) goto L_0x02f5
            int r7 = r3.f()
            int r11 = r3.f()
            if (r11 != r5) goto L_0x02e5
            r3.D(r6)
            int r6 = r6 + r7
            r3.E(r9)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x00a3:
            int r5 = r3.f26519b
            if (r5 >= r6) goto L_0x02d4
            int r7 = r3.f()
            int r7 = r7 + r5
            int r5 = r3.f()
            int r9 = r5 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = 169(0xa9, float:2.37E-43)
            r16 = r6
            java.lang.String r6 = "TCON"
            r17 = r0
            java.lang.String r0 = "MetadataUtil"
            if (r9 == r11) goto L_0x0219
            r11 = 253(0xfd, float:3.55E-43)
            if (r9 != r11) goto L_0x00c6
            goto L_0x0219
        L_0x00c6:
            r9 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r5 != r9) goto L_0x00ee
            int r5 = k5.g.f(r3)     // Catch:{ all -> 0x022a }
            if (r5 <= 0) goto L_0x00db
            java.lang.String[] r9 = k5.g.f19953a     // Catch:{ all -> 0x022a }
            int r11 = r9.length     // Catch:{ all -> 0x022a }
            if (r5 > r11) goto L_0x00db
            int r5 = r5 + -1
            r5 = r9[r5]     // Catch:{ all -> 0x022a }
            goto L_0x00dc
        L_0x00db:
            r5 = r13
        L_0x00dc:
            if (r5 == 0) goto L_0x00e5
            v5.l r0 = new v5.l     // Catch:{ all -> 0x022a }
            r0.<init>(r6, r13, r5)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x00e5:
            java.lang.String r5 = "Failed to parse standard genre code"
            android.util.Log.w(r0, r5)     // Catch:{ all -> 0x022a }
            r19 = r8
            goto L_0x02b0
        L_0x00ee:
            r6 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r5 != r6) goto L_0x00fb
            java.lang.String r0 = "TPOS"
            v5.l r0 = k5.g.c(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x00fb:
            r6 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r5 != r6) goto L_0x0108
            java.lang.String r0 = "TRCK"
            v5.l r0 = k5.g.c(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0108:
            r6 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r5 != r6) goto L_0x0117
            java.lang.String r0 = "TBPM"
            r6 = 0
            r9 = 1
            v5.h r0 = k5.g.e(r5, r0, r3, r9, r6)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0117:
            r6 = 1668311404(0x6370696c, float:4.434815E21)
            if (r5 != r6) goto L_0x0125
            java.lang.String r0 = "TCMP"
            r6 = 1
            v5.h r0 = k5.g.e(r5, r0, r3, r6, r6)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0125:
            r6 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r5 != r6) goto L_0x0130
            v5.a r0 = k5.g.b(r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0130:
            r6 = 1631670868(0x61415254, float:2.2288462E20)
            if (r5 != r6) goto L_0x013d
            java.lang.String r0 = "TPE2"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x013d:
            r6 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r5 != r6) goto L_0x0149
            java.lang.String r0 = "TSOT"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0149:
            r6 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r5 != r6) goto L_0x0155
            java.lang.String r0 = "TSO2"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0155:
            r6 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r5 != r6) goto L_0x0161
            java.lang.String r0 = "TSOA"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0161:
            r6 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r5 != r6) goto L_0x016d
            java.lang.String r0 = "TSOP"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x016d:
            r6 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r5 != r6) goto L_0x0179
            java.lang.String r0 = "TSOC"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0179:
            r6 = 1920233063(0x72746e67, float:4.84146E30)
            if (r5 != r6) goto L_0x0186
            java.lang.String r0 = "ITUNESADVISORY"
            r6 = 0
            v5.h r0 = k5.g.e(r5, r0, r3, r6, r6)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0186:
            r6 = 1885823344(0x70676170, float:2.8643533E29)
            if (r5 != r6) goto L_0x0194
            java.lang.String r0 = "ITUNESGAPLESS"
            r6 = 0
            r9 = 1
            v5.h r0 = k5.g.e(r5, r0, r3, r6, r9)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x0194:
            r6 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r5 != r6) goto L_0x01a0
            java.lang.String r0 = "TVSHOWSORT"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x01ab
        L_0x01a0:
            r6 = 1953919848(0x74767368, float:7.810338E31)
            if (r5 != r6) goto L_0x01af
            java.lang.String r0 = "TVSHOW"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
        L_0x01ab:
            r19 = r8
            goto L_0x02bf
        L_0x01af:
            r6 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r5 != r6) goto L_0x0215
            r0 = -1
            r5 = -1
            r6 = r13
        L_0x01b7:
            int r9 = r3.f26519b     // Catch:{ all -> 0x022a }
            if (r9 >= r7) goto L_0x01f4
            int r11 = r3.f()     // Catch:{ all -> 0x022a }
            r18 = r9
            int r9 = r3.f()     // Catch:{ all -> 0x022a }
            r19 = r8
            r8 = 4
            r3.E(r8)     // Catch:{ all -> 0x022a }
            r8 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r9 != r8) goto L_0x01d8
            int r11 = r11 + -12
            java.lang.String r8 = r3.o(r11)     // Catch:{ all -> 0x022a }
            r13 = r8
            goto L_0x01f1
        L_0x01d8:
            r8 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r9 != r8) goto L_0x01e4
            int r11 = r11 + -12
            java.lang.String r6 = r3.o(r11)     // Catch:{ all -> 0x022a }
            goto L_0x01f1
        L_0x01e4:
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r9 != r8) goto L_0x01ec
            r5 = r11
            r0 = r18
        L_0x01ec:
            int r11 = r11 + -12
            r3.E(r11)     // Catch:{ all -> 0x022a }
        L_0x01f1:
            r8 = r19
            goto L_0x01b7
        L_0x01f4:
            r19 = r8
            if (r13 == 0) goto L_0x02b0
            if (r6 == 0) goto L_0x02b0
            r8 = -1
            if (r0 != r8) goto L_0x01ff
            goto L_0x02b0
        L_0x01ff:
            r3.D(r0)     // Catch:{ all -> 0x022a }
            r0 = 16
            r3.E(r0)     // Catch:{ all -> 0x022a }
            int r5 = r5 + -16
            java.lang.String r0 = r3.o(r5)     // Catch:{ all -> 0x022a }
            v5.i r5 = new v5.i     // Catch:{ all -> 0x022a }
            r5.<init>(r13, r6, r0)     // Catch:{ all -> 0x022a }
            r0 = r5
            goto L_0x02bf
        L_0x0215:
            r19 = r8
            goto L_0x0298
        L_0x0219:
            r19 = r8
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r5
            r9 = 6516084(0x636d74, float:9.130979E-39)
            if (r8 != r9) goto L_0x022d
            v5.e r0 = k5.g.a(r5, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x022a:
            r0 = move-exception
            goto L_0x02d0
        L_0x022d:
            r9 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r8 == r9) goto L_0x02b9
            r9 = 7631467(0x74726b, float:1.0693963E-38)
            if (r8 != r9) goto L_0x0239
            goto L_0x02b9
        L_0x0239:
            r9 = 6516589(0x636f6d, float:9.131686E-39)
            if (r8 == r9) goto L_0x02b2
            r9 = 7828084(0x777274, float:1.0969482E-38)
            if (r8 != r9) goto L_0x0245
            goto L_0x02b2
        L_0x0245:
            r9 = 6578553(0x646179, float:9.218516E-39)
            if (r8 != r9) goto L_0x0252
            java.lang.String r0 = "TDRC"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x0252:
            r9 = 4280916(0x415254, float:5.998841E-39)
            if (r8 != r9) goto L_0x025e
            java.lang.String r0 = "TPE1"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x025e:
            r9 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r8 != r9) goto L_0x026a
            java.lang.String r0 = "TSSE"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x026a:
            r9 = 6384738(0x616c62, float:8.946924E-39)
            if (r8 != r9) goto L_0x0276
            java.lang.String r0 = "TALB"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x0276:
            r9 = 7108978(0x6c7972, float:9.9618E-39)
            if (r8 != r9) goto L_0x0282
            java.lang.String r0 = "USLT"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x0282:
            r9 = 6776174(0x67656e, float:9.495442E-39)
            if (r8 != r9) goto L_0x028c
            v5.l r0 = k5.g.d(r5, r6, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x028c:
            r6 = 6779504(0x677270, float:9.500109E-39)
            if (r8 != r6) goto L_0x0298
            java.lang.String r0 = "TIT1"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x0298:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x022a }
            r6.<init>()     // Catch:{ all -> 0x022a }
            java.lang.String r8 = "Skipped unknown metadata entry: "
            r6.append(r8)     // Catch:{ all -> 0x022a }
            java.lang.String r5 = k5.a.a(r5)     // Catch:{ all -> 0x022a }
            r6.append(r5)     // Catch:{ all -> 0x022a }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x022a }
            android.util.Log.d(r0, r5)     // Catch:{ all -> 0x022a }
        L_0x02b0:
            r0 = 0
            goto L_0x02bf
        L_0x02b2:
            java.lang.String r0 = "TCOM"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
            goto L_0x02bf
        L_0x02b9:
            java.lang.String r0 = "TIT2"
            v5.l r0 = k5.g.d(r5, r0, r3)     // Catch:{ all -> 0x022a }
        L_0x02bf:
            r3.D(r7)
            if (r0 == 0) goto L_0x02c7
            r4.add(r0)
        L_0x02c7:
            r13 = 0
            r6 = r16
            r0 = r17
            r8 = r19
            goto L_0x00a3
        L_0x02d0:
            r3.D(r7)
            throw r0
        L_0x02d4:
            r17 = r0
            r19 = r8
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02df
            goto L_0x02f9
        L_0x02df:
            q5.a r0 = new q5.a
            r0.<init>((java.util.List<? extends q5.a.b>) r4)
            goto L_0x02fa
        L_0x02e5:
            r17 = r0
            r19 = r8
            int r6 = r6 + r7
            r3.D(r6)
            r9 = 8
            r13 = 0
            r5 = 1768715124(0x696c7374, float:1.7865732E25)
            goto L_0x0089
        L_0x02f5:
            r17 = r0
            r19 = r8
        L_0x02f9:
            r0 = 0
        L_0x02fa:
            r11 = r0
            goto L_0x035d
        L_0x02fc:
            r17 = r0
            r19 = r8
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r4 != r0) goto L_0x035d
            r3.D(r14)
            int r0 = r14 + r15
            r4 = 12
            r3.E(r4)
        L_0x030f:
            int r4 = r3.f26519b
            if (r4 >= r0) goto L_0x035b
            int r5 = r3.f()
            int r6 = r3.f()
            r7 = 1935766900(0x73617574, float:1.7862687E31)
            if (r6 != r7) goto L_0x0356
            r0 = 14
            if (r5 >= r0) goto L_0x0325
            goto L_0x035b
        L_0x0325:
            r0 = 5
            r3.E(r0)
            int r0 = r3.s()
            r4 = 12
            if (r0 == r4) goto L_0x0336
            r5 = 13
            if (r0 == r5) goto L_0x0336
            goto L_0x035b
        L_0x0336:
            if (r0 != r4) goto L_0x033b
            r0 = 1131413504(0x43700000, float:240.0)
            goto L_0x033d
        L_0x033b:
            r0 = 1123024896(0x42f00000, float:120.0)
        L_0x033d:
            r4 = 1
            r3.E(r4)
            int r5 = r3.s()
            q5.a r6 = new q5.a
            q5.a$b[] r4 = new q5.a.b[r4]
            w5.d r7 = new w5.d
            r7.<init>((float) r0, (int) r5)
            r0 = 0
            r4[r0] = r7
            r6.<init>((q5.a.b[]) r4)
            r12 = r6
            goto L_0x035d
        L_0x0356:
            int r4 = r4 + r5
            r3.D(r4)
            goto L_0x030f
        L_0x035b:
            r0 = 0
            r12 = r0
        L_0x035d:
            int r14 = r14 + r15
            r3.D(r14)
            r9 = 8
            r13 = 0
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 1835365473(0x6d657461, float:4.4382975E27)
            r7 = 4
            r0 = r17
            r8 = r19
            goto L_0x005b
        L_0x0374:
            r17 = r0
            r19 = r8
            android.util.Pair r0 = android.util.Pair.create(r11, r12)
            java.lang.Object r3 = r0.first
            q5.a r3 = (q5.a) r3
            java.lang.Object r0 = r0.second
            q5.a r0 = (q5.a) r0
            if (r3 == 0) goto L_0x0389
            r10.b(r3)
        L_0x0389:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x0396
        L_0x038d:
            r17 = r0
            r19 = r8
            r0 = 0
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            r3 = 0
        L_0x0396:
            r11 = r3
            k5.a$a r3 = r2.b(r4)
            if (r3 == 0) goto L_0x048d
            byte[] r4 = k5.c.f19899a
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            k5.a$b r4 = r3.c(r4)
            r5 = 1801812339(0x6b657973, float:2.7741754E26)
            k5.a$b r5 = r3.c(r5)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            k5.a$b r3 = r3.c(r6)
            if (r4 == 0) goto L_0x048d
            if (r5 == 0) goto L_0x048d
            if (r3 == 0) goto L_0x048d
            v6.v r4 = r4.f19898b
            r6 = 16
            r4.D(r6)
            int r4 = r4.f()
            r6 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r4 == r6) goto L_0x03cc
            goto L_0x048d
        L_0x03cc:
            v6.v r4 = r5.f19898b
            r5 = 12
            r4.D(r5)
            int r5 = r4.f()
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 0
        L_0x03da:
            if (r7 >= r5) goto L_0x03ef
            int r8 = r4.f()
            r9 = 4
            r4.E(r9)
            int r8 = r8 + -8
            java.lang.String r8 = r4.p(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x03da
        L_0x03ef:
            r4 = 8
            v6.v r3 = r3.f19898b
            r3.D(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x03fb:
            int r8 = r3.a()
            if (r8 <= r4) goto L_0x047e
            int r4 = r3.f26519b
            int r8 = r3.f()
            int r9 = r3.f()
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x0463
            if (r9 >= r5) goto L_0x0463
            r9 = r6[r9]
            int r12 = r4 + r8
        L_0x0415:
            int r13 = r3.f26519b
            if (r13 >= r12) goto L_0x0456
            int r14 = r3.f()
            int r15 = r3.f()
            r16 = r5
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            if (r15 != r5) goto L_0x044b
            int r5 = r3.f()
            int r12 = r3.f()
            int r14 = r14 + -16
            byte[] r13 = new byte[r14]
            byte[] r15 = r3.f26518a
            r18 = r6
            int r6 = r3.f26519b
            r20 = r11
            r11 = 0
            java.lang.System.arraycopy(r15, r6, r13, r11, r14)
            int r6 = r3.f26519b
            int r6 = r6 + r14
            r3.f26519b = r6
            w5.a r6 = new w5.a
            r6.<init>(r9, r13, r12, r5)
            goto L_0x045d
        L_0x044b:
            r18 = r6
            r20 = r11
            int r13 = r13 + r14
            r3.D(r13)
            r5 = r16
            goto L_0x0415
        L_0x0456:
            r16 = r5
            r18 = r6
            r20 = r11
            r6 = 0
        L_0x045d:
            if (r6 == 0) goto L_0x0470
            r7.add(r6)
            goto L_0x0470
        L_0x0463:
            r16 = r5
            r18 = r6
            r20 = r11
            java.lang.String r5 = "Skipped metadata with unknown key index: "
            java.lang.String r6 = "AtomParsers"
            f0.j.a(r5, r9, r6)
        L_0x0470:
            int r4 = r4 + r8
            r3.D(r4)
            r4 = 8
            r5 = r16
            r6 = r18
            r11 = r20
            goto L_0x03fb
        L_0x047e:
            r20 = r11
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0487
            goto L_0x048f
        L_0x0487:
            q5.a r3 = new q5.a
            r3.<init>((java.util.List<? extends q5.a.b>) r7)
            goto L_0x0490
        L_0x048d:
            r20 = r11
        L_0x048f:
            r3 = 0
        L_0x0490:
            r11 = r3
            int r3 = r1.f19956a
            r3 = r3 & 1
            if (r3 == 0) goto L_0x049a
            r3 = 1
            r7 = 1
            goto L_0x049c
        L_0x049a:
            r3 = 0
            r7 = 0
        L_0x049c:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            k5.h r9 = k5.h.f19954a
            r3 = r10
            r8 = r19
            java.util.List r2 = k5.c.e(r2, r3, r4, r6, r7, r8, r9)
            d5.k r3 = r1.f19973r
            r3.getClass()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.size()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = -1
            r8 = 0
            r7 = r5
            r9 = -1
            r12 = 0
        L_0x04c0:
            if (r12 >= r4) goto L_0x05d2
            java.lang.Object r13 = r2.get(r12)
            k5.p r13 = (k5.p) r13
            int r14 = r13.f20030b
            if (r14 != 0) goto L_0x04d6
            r21 = r0
            r13 = r1
            r15 = r2
            r16 = r4
            r0 = r17
            goto L_0x05c1
        L_0x04d6:
            k5.m r14 = r13.f20029a
            r15 = r2
            long r1 = r14.f19999e
            int r16 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r16 == 0) goto L_0x04e0
            goto L_0x04e2
        L_0x04e0:
            long r1 = r13.f20036h
        L_0x04e2:
            long r5 = java.lang.Math.max(r5, r1)
            k5.i$a r7 = new k5.i$a
            int r8 = r14.f19996b
            d5.a0 r8 = r3.l(r12, r8)
            r7.<init>(r14, r13, r8)
            int r8 = r13.f20033e
            int r8 = r8 + 30
            r16 = r4
            x4.b0 r4 = r14.f20000f
            x4.b0$b r4 = r4.a()
            r4.f27426l = r8
            int r8 = r14.f19996b
            r18 = r5
            r5 = 2
            if (r8 != r5) goto L_0x051a
            r5 = 0
            int r21 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r21 <= 0) goto L_0x051a
            int r5 = r13.f20030b
            r6 = 1
            if (r5 <= r6) goto L_0x051a
            float r5 = (float) r5
            float r1 = (float) r1
            r2 = 1232348160(0x49742400, float:1000000.0)
            float r1 = r1 / r2
            float r5 = r5 / r1
            r4.f27432r = r5
        L_0x051a:
            r1 = 1
            if (r8 != r1) goto L_0x0531
            int r1 = r10.f13056a
            r2 = -1
            if (r1 == r2) goto L_0x0528
            int r5 = r10.f13057b
            if (r5 == r2) goto L_0x0528
            r2 = 1
            goto L_0x0529
        L_0x0528:
            r2 = 0
        L_0x0529:
            if (r2 == 0) goto L_0x0531
            r4.A = r1
            int r1 = r10.f13057b
            r4.B = r1
        L_0x0531:
            r1 = 2
            q5.a[] r1 = new q5.a[r1]
            r2 = 0
            r1[r2] = r0
            r13 = r22
            java.util.List<q5.a$b> r5 = r13.f19963h
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0543
            r5 = 0
            goto L_0x054a
        L_0x0543:
            q5.a r5 = new q5.a
            java.util.List<q5.a$b> r6 = r13.f19963h
            r5.<init>((java.util.List<? extends q5.a.b>) r6)
        L_0x054a:
            r6 = 1
            r1[r6] = r5
            q5.a r5 = new q5.a
            q5.a$b[] r2 = new q5.a.b[r2]
            r5.<init>((q5.a.b[]) r2)
            if (r8 != r6) goto L_0x055d
            if (r20 == 0) goto L_0x058f
            r21 = r0
            r5 = r20
            goto L_0x0591
        L_0x055d:
            r2 = 2
            if (r8 != r2) goto L_0x058f
            if (r11 == 0) goto L_0x058f
            r2 = 0
        L_0x0563:
            q5.a$b[] r6 = r11.f24150a
            int r8 = r6.length
            if (r2 >= r8) goto L_0x058f
            r6 = r6[r2]
            boolean r8 = r6 instanceof w5.a
            if (r8 == 0) goto L_0x0588
            w5.a r6 = (w5.a) r6
            java.lang.String r8 = r6.f27002a
            r21 = r0
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x058a
            q5.a r5 = new q5.a
            r0 = 1
            q5.a$b[] r0 = new q5.a.b[r0]
            r2 = 0
            r0[r2] = r6
            r5.<init>((q5.a.b[]) r0)
            goto L_0x0591
        L_0x0588:
            r21 = r0
        L_0x058a:
            int r2 = r2 + 1
            r0 = r21
            goto L_0x0563
        L_0x058f:
            r21 = r0
        L_0x0591:
            r0 = 0
        L_0x0592:
            r2 = 2
            if (r0 >= r2) goto L_0x059e
            r2 = r1[r0]
            q5.a r5 = r5.b(r2)
            int r0 = r0 + 1
            goto L_0x0592
        L_0x059e:
            q5.a$b[] r0 = r5.f24150a
            int r0 = r0.length
            if (r0 <= 0) goto L_0x05a5
            r4.f27423i = r5
        L_0x05a5:
            d5.a0 r0 = r7.f19982c
            x4.b0 r1 = r4.a()
            r0.c(r1)
            int r0 = r14.f19996b
            r1 = 2
            if (r0 != r1) goto L_0x05ba
            r0 = -1
            if (r9 != r0) goto L_0x05ba
            int r9 = r17.size()
        L_0x05ba:
            r0 = r17
            r0.add(r7)
            r5 = r18
        L_0x05c1:
            int r12 = r12 + 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r1 = r13
            r2 = r15
            r4 = r16
            r0 = r21
            goto L_0x04c0
        L_0x05d2:
            r13 = r1
            r0 = r17
            r1 = 0
            r13.f19976u = r9
            r13.f19977v = r5
            r4 = 0
            k5.i$a[] r4 = new k5.i.a[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            k5.i$a[] r0 = (k5.i.a[]) r0
            r13.f19974s = r0
            int r4 = r0.length
            long[][] r4 = new long[r4][]
            int r5 = r0.length
            int[] r5 = new int[r5]
            int r6 = r0.length
            long[] r6 = new long[r6]
            int r7 = r0.length
            boolean[] r7 = new boolean[r7]
            r8 = 0
        L_0x05f3:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x060e
            r9 = r0[r8]
            k5.p r9 = r9.f19981b
            int r9 = r9.f20030b
            long[] r9 = new long[r9]
            r4[r8] = r9
            r9 = r0[r8]
            k5.p r9 = r9.f19981b
            long[] r9 = r9.f20034f
            r10 = 0
            r10 = r9[r10]
            r6[r8] = r10
            int r8 = r8 + 1
            goto L_0x05f3
        L_0x060e:
            r8 = 0
        L_0x060f:
            int r9 = r0.length
            if (r8 >= r9) goto L_0x0655
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = -1
            r12 = 0
        L_0x0619:
            int r14 = r0.length
            if (r12 >= r14) goto L_0x062c
            boolean r14 = r7[r12]
            if (r14 != 0) goto L_0x0629
            r14 = r6[r12]
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 > 0) goto L_0x0629
            r9 = r6[r12]
            r11 = r12
        L_0x0629:
            int r12 = r12 + 1
            goto L_0x0619
        L_0x062c:
            r9 = r5[r11]
            r10 = r4[r11]
            r10[r9] = r1
            r10 = r0[r11]
            k5.p r10 = r10.f19981b
            int[] r10 = r10.f20032d
            r10 = r10[r9]
            long r14 = (long) r10
            long r1 = r1 + r14
            r10 = 1
            int r9 = r9 + r10
            r5[r11] = r9
            r12 = r4[r11]
            int r12 = r12.length
            if (r9 >= r12) goto L_0x0650
            r10 = r0[r11]
            k5.p r10 = r10.f19981b
            long[] r10 = r10.f20034f
            r9 = r10[r9]
            r6[r11] = r9
            goto L_0x060f
        L_0x0650:
            r7[r11] = r10
            int r8 = r8 + 1
            goto L_0x060f
        L_0x0655:
            r13.f19975t = r4
            r3.d()
            r3.b(r13)
            java.util.ArrayDeque<k5.a$a> r0 = r13.f19961f
            r0.clear()
            r0 = 2
            r13.f19964i = r0
            goto L_0x067c
        L_0x0666:
            r13 = r1
            java.util.ArrayDeque<k5.a$a> r0 = r13.f19961f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x067c
            java.util.ArrayDeque<k5.a$a> r0 = r13.f19961f
            java.lang.Object r0 = r0.peek()
            k5.a$a r0 = (k5.a.C0173a) r0
            java.util.List<k5.a$a> r0 = r0.f19897d
            r0.add(r2)
        L_0x067c:
            r1 = r13
            goto L_0x0002
        L_0x067f:
            r13 = r1
            int r0 = r13.f19964i
            r1 = 2
            if (r0 == r1) goto L_0x0688
            r22.k()
        L_0x0688:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.i.m(long):void");
    }
}
