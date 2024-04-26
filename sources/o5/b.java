package o5;

import androidx.appcompat.widget.y0;
import d5.a0;
import d5.i;
import d5.j;
import d5.k;
import java.io.IOException;
import v6.e0;
import v6.v;
import x4.b0;
import x4.m0;

/* compiled from: WavExtractor */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public k f22974a;

    /* renamed from: b  reason: collision with root package name */
    public a0 f22975b;

    /* renamed from: c  reason: collision with root package name */
    public C0205b f22976c;

    /* renamed from: d  reason: collision with root package name */
    public int f22977d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f22978e = -1;

    /* compiled from: WavExtractor */
    public static final class a implements C0205b {

        /* renamed from: m  reason: collision with root package name */
        public static final int[] f22979m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        public static final int[] f22980n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        public final k f22981a;

        /* renamed from: b  reason: collision with root package name */
        public final a0 f22982b;

        /* renamed from: c  reason: collision with root package name */
        public final c f22983c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22984d;

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f22985e;

        /* renamed from: f  reason: collision with root package name */
        public final v f22986f;

        /* renamed from: g  reason: collision with root package name */
        public final int f22987g;

        /* renamed from: h  reason: collision with root package name */
        public final b0 f22988h;

        /* renamed from: i  reason: collision with root package name */
        public int f22989i;

        /* renamed from: j  reason: collision with root package name */
        public long f22990j;

        /* renamed from: k  reason: collision with root package name */
        public int f22991k;

        /* renamed from: l  reason: collision with root package name */
        public long f22992l;

        public a(k kVar, a0 a0Var, c cVar) throws m0 {
            this.f22981a = kVar;
            this.f22982b = a0Var;
            this.f22983c = cVar;
            int max = Math.max(1, cVar.f23003c / 10);
            this.f22987g = max;
            byte[] bArr = cVar.f23006f;
            int length = bArr.length;
            byte b10 = bArr[0];
            byte b11 = bArr[1];
            byte b12 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            this.f22984d = b12;
            int i10 = cVar.f23002b;
            int i11 = (((cVar.f23004d - (i10 * 4)) * 8) / (cVar.f23005e * i10)) + 1;
            if (b12 == i11) {
                int g10 = e0.g(max, b12);
                this.f22985e = new byte[(cVar.f23004d * g10)];
                this.f22986f = new v(b12 * 2 * i10 * g10);
                int i12 = cVar.f23003c;
                int i13 = ((cVar.f23004d * i12) * 8) / b12;
                b0.b bVar = new b0.b();
                bVar.f27425k = "audio/raw";
                bVar.f27420f = i13;
                bVar.f27421g = i13;
                bVar.f27426l = max * 2 * i10;
                bVar.f27438x = cVar.f23002b;
                bVar.f27439y = i12;
                bVar.f27440z = 2;
                this.f22988h = bVar.a();
                return;
            }
            throw new m0("Expected frames per block: " + i11 + "; got: " + b12);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[EDGE_INSN: B:41:0x0049->B:12:0x0049 ?: BREAK  
        EDGE_INSN: B:42:0x0049->B:12:0x0049 ?: BREAK  ] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
        public boolean a(d5.j r19, long r20) throws java.io.IOException {
            /*
                r18 = this;
                r0 = r18
                int r1 = r0.f22987g
                int r2 = r0.f22991k
                int r2 = r0.d(r2)
                int r1 = r1 - r2
                int r2 = r0.f22984d
                int r1 = v6.e0.g(r1, r2)
                o5.c r2 = r0.f22983c
                int r2 = r2.f23004d
                int r1 = r1 * r2
                r4 = 0
                int r6 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
                r4 = r20
                r8 = r0
                if (r6 != 0) goto L_0x0024
                r6 = r1
                r1 = r19
                goto L_0x0041
            L_0x0024:
                r6 = r1
                r7 = 0
                r1 = r19
            L_0x0028:
                r9 = -1
                if (r7 != 0) goto L_0x0049
                int r10 = r8.f22989i
                if (r10 >= r6) goto L_0x0049
                int r10 = r6 - r10
                long r10 = (long) r10
                long r10 = java.lang.Math.min(r10, r4)
                int r11 = (int) r10
                byte[] r10 = r8.f22985e
                int r12 = r8.f22989i
                int r10 = r1.a(r10, r12, r11)
                if (r10 != r9) goto L_0x0043
            L_0x0041:
                r7 = 1
                goto L_0x0028
            L_0x0043:
                int r9 = r8.f22989i
                int r9 = r9 + r10
                r8.f22989i = r9
                goto L_0x0028
            L_0x0049:
                int r1 = r8.f22989i
                o5.c r4 = r8.f22983c
                int r4 = r4.f23004d
                int r1 = r1 / r4
                if (r1 <= 0) goto L_0x015c
                byte[] r4 = r8.f22985e
                v6.v r5 = r8.f22986f
                r6 = 0
            L_0x0057:
                if (r6 >= r1) goto L_0x0122
                r10 = 0
            L_0x005a:
                o5.c r11 = r8.f22983c
                int r12 = r11.f23002b
                if (r10 >= r12) goto L_0x0115
                byte[] r13 = r5.f26518a
                int r11 = r11.f23004d
                int r14 = r6 * r11
                int r15 = r10 * 4
                int r15 = r15 + r14
                int r14 = r12 * 4
                int r14 = r14 + r15
                int r11 = r11 / r12
                int r11 = r11 + -4
                int r16 = r15 + 1
                byte r2 = r4[r16]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r2 = r2 << 8
                byte r9 = r4[r15]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r2 = r2 | r9
                short r2 = (short) r2
                int r15 = r15 + 2
                byte r9 = r4[r15]
                r9 = r9 & 255(0xff, float:3.57E-43)
                r15 = 88
                int r9 = java.lang.Math.min(r9, r15)
                int[] r15 = f22980n
                r15 = r15[r9]
                int r3 = r8.f22984d
                int r3 = r3 * r6
                int r3 = r3 * r12
                int r3 = r3 + r10
                int r3 = r3 * 2
                r0 = r2 & 255(0xff, float:3.57E-43)
                byte r0 = (byte) r0
                r13[r3] = r0
                int r0 = r3 + 1
                r20 = r3
                int r3 = r2 >> 8
                byte r3 = (byte) r3
                r13[r0] = r3
                r3 = r20
                r20 = r7
                r0 = 0
            L_0x00a9:
                int r7 = r11 * 2
                if (r0 >= r7) goto L_0x0108
                int r7 = r0 / 8
                int r17 = r0 / 2
                int r17 = r17 % 4
                int r7 = r7 * r12
                int r7 = r7 * 4
                int r7 = r7 + r14
                int r7 = r7 + r17
                byte r7 = r4[r7]
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r17 = r0 % 2
                if (r17 != 0) goto L_0x00c5
                r7 = r7 & 15
                goto L_0x00c7
            L_0x00c5:
                int r7 = r7 >> 4
            L_0x00c7:
                r17 = r7 & 7
                int r17 = r17 * 2
                r16 = 1
                int r17 = r17 + 1
                int r17 = r17 * r15
                int r15 = r17 >> 3
                r17 = r7 & 8
                if (r17 == 0) goto L_0x00d8
                int r15 = -r15
            L_0x00d8:
                int r2 = r2 + r15
                r15 = -32768(0xffffffffffff8000, float:NaN)
                r17 = r4
                r4 = 32767(0x7fff, float:4.5916E-41)
                int r2 = v6.e0.i(r2, r15, r4)
                int r4 = r12 * 2
                int r3 = r3 + r4
                r4 = r2 & 255(0xff, float:3.57E-43)
                byte r4 = (byte) r4
                r13[r3] = r4
                int r4 = r3 + 1
                int r15 = r2 >> 8
                byte r15 = (byte) r15
                r13[r4] = r15
                int[] r4 = f22979m
                r4 = r4[r7]
                int r9 = r9 + r4
                int[] r4 = f22980n
                int r7 = r4.length
                r15 = -1
                int r7 = r7 + r15
                r15 = 0
                int r9 = v6.e0.i(r9, r15, r7)
                r15 = r4[r9]
                int r0 = r0 + 1
                r4 = r17
                goto L_0x00a9
            L_0x0108:
                r17 = r4
                r16 = 1
                int r10 = r10 + 1
                r0 = r18
                r7 = r20
                r9 = -1
                goto L_0x005a
            L_0x0115:
                r17 = r4
                r20 = r7
                r16 = 1
                int r6 = r6 + 1
                r0 = r18
                r9 = -1
                goto L_0x0057
            L_0x0122:
                r20 = r7
                int r0 = r8.f22984d
                int r0 = r0 * r1
                o5.c r2 = r8.f22983c
                int r2 = r2.f23002b
                int r0 = r0 * 2
                int r0 = r0 * r2
                r2 = 0
                r5.D(r2)
                r5.C(r0)
                int r0 = r8.f22989i
                o5.c r2 = r8.f22983c
                int r2 = r2.f23004d
                int r1 = r1 * r2
                int r0 = r0 - r1
                r8.f22989i = r0
                v6.v r0 = r8.f22986f
                int r1 = r0.f26520c
                d5.a0 r2 = r8.f22982b
                r2.b(r0, r1)
                int r0 = r8.f22991k
                int r0 = r0 + r1
                r8.f22991k = r0
                int r0 = r8.d(r0)
                int r1 = r8.f22987g
                if (r0 < r1) goto L_0x015e
                r8.e(r1)
                goto L_0x015e
            L_0x015c:
                r20 = r7
            L_0x015e:
                if (r20 == 0) goto L_0x016b
                int r0 = r8.f22991k
                int r0 = r8.d(r0)
                if (r0 <= 0) goto L_0x016b
                r8.e(r0)
            L_0x016b:
                return r20
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.b.a.a(d5.j, long):boolean");
        }

        public void b(int i10, long j10) {
            this.f22981a.b(new e(this.f22983c, this.f22984d, (long) i10, j10));
            this.f22982b.c(this.f22988h);
        }

        public void c(long j10) {
            this.f22989i = 0;
            this.f22990j = j10;
            this.f22991k = 0;
            this.f22992l = 0;
        }

        public final int d(int i10) {
            return i10 / (this.f22983c.f23002b * 2);
        }

        public final void e(int i10) {
            long P = this.f22990j + e0.P(this.f22992l, 1000000, (long) this.f22983c.f23003c);
            int i11 = i10 * 2 * this.f22983c.f23002b;
            this.f22982b.d(P, 1, i11, this.f22991k - i11, (a0.a) null);
            this.f22992l += (long) i10;
            this.f22991k -= i11;
        }
    }

    /* renamed from: o5.b$b  reason: collision with other inner class name */
    /* compiled from: WavExtractor */
    public interface C0205b {
        boolean a(j jVar, long j10) throws IOException;

        void b(int i10, long j10) throws m0;

        void c(long j10);
    }

    /* compiled from: WavExtractor */
    public static final class c implements C0205b {

        /* renamed from: a  reason: collision with root package name */
        public final k f22993a;

        /* renamed from: b  reason: collision with root package name */
        public final a0 f22994b;

        /* renamed from: c  reason: collision with root package name */
        public final c f22995c;

        /* renamed from: d  reason: collision with root package name */
        public final b0 f22996d;

        /* renamed from: e  reason: collision with root package name */
        public final int f22997e;

        /* renamed from: f  reason: collision with root package name */
        public long f22998f;

        /* renamed from: g  reason: collision with root package name */
        public int f22999g;

        /* renamed from: h  reason: collision with root package name */
        public long f23000h;

        public c(k kVar, a0 a0Var, c cVar, String str, int i10) throws m0 {
            this.f22993a = kVar;
            this.f22994b = a0Var;
            this.f22995c = cVar;
            int i11 = (cVar.f23002b * cVar.f23005e) / 8;
            if (cVar.f23004d == i11) {
                int i12 = cVar.f23003c * i11;
                int i13 = i12 * 8;
                int max = Math.max(i11, i12 / 10);
                this.f22997e = max;
                b0.b bVar = new b0.b();
                bVar.f27425k = str;
                bVar.f27420f = i13;
                bVar.f27421g = i13;
                bVar.f27426l = max;
                bVar.f27438x = cVar.f23002b;
                bVar.f27439y = cVar.f23003c;
                bVar.f27440z = i10;
                this.f22996d = bVar.a();
                return;
            }
            StringBuilder a10 = y0.a("Expected block size: ", i11, "; got: ");
            a10.append(cVar.f23004d);
            throw new m0(a10.toString());
        }

        public boolean a(j jVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f22999g) < (i11 = this.f22997e)) {
                int f10 = this.f22994b.f(jVar, (int) Math.min((long) (i11 - i10), j11), true);
                if (f10 == -1) {
                    j11 = 0;
                } else {
                    this.f22999g += f10;
                    j11 -= (long) f10;
                }
            }
            c cVar = this.f22995c;
            int i12 = cVar.f23004d;
            int i13 = this.f22999g / i12;
            if (i13 > 0) {
                long P = this.f22998f + e0.P(this.f23000h, 1000000, (long) cVar.f23003c);
                int i14 = i13 * i12;
                int i15 = this.f22999g - i14;
                this.f22994b.d(P, 1, i14, i15, (a0.a) null);
                this.f23000h += (long) i13;
                this.f22999g = i15;
            }
            return j11 <= 0;
        }

        public void b(int i10, long j10) {
            this.f22993a.b(new e(this.f22995c, 1, (long) i10, j10));
            this.f22994b.c(this.f22996d);
        }

        public void c(long j10) {
            this.f22998f = j10;
            this.f22999g = 0;
            this.f23000h = 0;
        }
    }

    static {
        a aVar = a.f22973a;
    }

    public void a() {
    }

    public boolean e(j jVar) throws IOException {
        return d.a(jVar) != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r13, d5.w r14) throws java.io.IOException {
        /*
            r12 = this;
            d5.a0 r14 = r12.f22975b
            v6.a.f(r14)
            int r14 = v6.e0.f26436a
            o5.b$b r14 = r12.f22976c
            r0 = 1
            r1 = 0
            if (r14 != 0) goto L_0x0096
            o5.c r5 = o5.d.a(r13)
            if (r5 == 0) goto L_0x008e
            int r14 = r5.f23001a
            r2 = 17
            if (r14 != r2) goto L_0x0026
            o5.b$a r14 = new o5.b$a
            d5.k r2 = r12.f22974a
            d5.a0 r3 = r12.f22975b
            r14.<init>(r2, r3, r5)
            r12.f22976c = r14
            goto L_0x0096
        L_0x0026:
            r2 = 6
            if (r14 != r2) goto L_0x0039
            o5.b$c r14 = new o5.b$c
            d5.k r3 = r12.f22974a
            d5.a0 r4 = r12.f22975b
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            r12.f22976c = r14
            goto L_0x0096
        L_0x0039:
            r2 = 7
            if (r14 != r2) goto L_0x004c
            o5.b$c r14 = new o5.b$c
            d5.k r3 = r12.f22974a
            d5.a0 r4 = r12.f22975b
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            r12.f22976c = r14
            goto L_0x0096
        L_0x004c:
            int r2 = r5.f23005e
            if (r14 == r0) goto L_0x0063
            r3 = 3
            if (r14 == r3) goto L_0x005b
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r14 == r3) goto L_0x0063
            r14 = 0
            r7 = 0
            goto L_0x0068
        L_0x005b:
            r14 = 32
            if (r2 != r14) goto L_0x0061
            r14 = 4
            goto L_0x0067
        L_0x0061:
            r14 = 0
            goto L_0x0067
        L_0x0063:
            int r14 = v6.e0.x(r2)
        L_0x0067:
            r7 = r14
        L_0x0068:
            if (r7 == 0) goto L_0x0079
            o5.b$c r14 = new o5.b$c
            d5.k r3 = r12.f22974a
            d5.a0 r4 = r12.f22975b
            java.lang.String r6 = "audio/raw"
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            r12.f22976c = r14
            goto L_0x0096
        L_0x0079:
            x4.m0 r13 = new x4.m0
            java.lang.String r14 = "Unsupported WAV format type: "
            java.lang.StringBuilder r14 = android.support.v4.media.a.a(r14)
            int r0 = r5.f23001a
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>((java.lang.String) r14)
            throw r13
        L_0x008e:
            x4.m0 r13 = new x4.m0
            java.lang.String r14 = "Unsupported or unrecognized wav header."
            r13.<init>((java.lang.String) r14)
            throw r13
        L_0x0096:
            int r14 = r12.f22977d
            r2 = -1
            r4 = -1
            if (r14 != r4) goto L_0x015e
            r13.getClass()
            r13.f()
            v6.v r14 = new v6.v
            r4 = 8
            r14.<init>((int) r4)
            o5.d$a r5 = o5.d.a.a(r13, r14)
        L_0x00ae:
            int r6 = r5.f23007a
            r7 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r8 = "WavHeaderReader"
            if (r6 == r7) goto L_0x0103
            r7 = 1380533830(0x52494646, float:2.16116855E11)
            if (r6 == r7) goto L_0x00d3
            r9 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r6 == r9) goto L_0x00d3
            java.lang.String r6 = "Ignoring unknown WAV chunk: "
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            int r9 = r5.f23007a
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r8, r6)
        L_0x00d3:
            r8 = 8
            long r10 = r5.f23008b
            long r10 = r10 + r8
            int r6 = r5.f23007a
            if (r6 != r7) goto L_0x00de
            r10 = 12
        L_0x00de:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x00ee
            int r5 = (int) r10
            r13.g(r5)
            o5.d$a r5 = o5.d.a.a(r13, r14)
            goto L_0x00ae
        L_0x00ee:
            x4.m0 r13 = new x4.m0
            java.lang.String r14 = "Chunk is too large (~2GB+) to skip; id: "
            java.lang.StringBuilder r14 = android.support.v4.media.a.a(r14)
            int r0 = r5.f23007a
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>((java.lang.String) r14)
            throw r13
        L_0x0103:
            r13.g(r4)
            long r6 = r13.l()
            long r4 = r5.f23008b
            long r4 = r4 + r6
            long r9 = r13.b()
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0136
            int r14 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x0136
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r11 = "Data exceeds input length: "
            r14.append(r11)
            r14.append(r4)
            java.lang.String r4 = ", "
            r14.append(r4)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            android.util.Log.w(r8, r14)
            r4 = r9
        L_0x0136:
            java.lang.Long r14 = java.lang.Long.valueOf(r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            android.util.Pair r14 = android.util.Pair.create(r14, r4)
            java.lang.Object r4 = r14.first
            java.lang.Long r4 = (java.lang.Long) r4
            int r4 = r4.intValue()
            r12.f22977d = r4
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r4 = r14.longValue()
            r12.f22978e = r4
            o5.b$b r14 = r12.f22976c
            int r6 = r12.f22977d
            r14.b(r6, r4)
            goto L_0x016d
        L_0x015e:
            long r4 = r13.l()
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x016d
            int r14 = r12.f22977d
            r13.g(r14)
        L_0x016d:
            long r4 = r12.f22978e
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0174
            goto L_0x0175
        L_0x0174:
            r0 = 0
        L_0x0175:
            v6.a.d(r0)
            long r2 = r12.f22978e
            long r4 = r13.l()
            long r2 = r2 - r4
            o5.b$b r14 = r12.f22976c
            boolean r13 = r14.a(r13, r2)
            if (r13 == 0) goto L_0x0188
            r1 = -1
        L_0x0188:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        C0205b bVar = this.f22976c;
        if (bVar != null) {
            bVar.c(j11);
        }
    }

    public void i(k kVar) {
        this.f22974a = kVar;
        this.f22975b = kVar.l(0, 1);
        kVar.d();
    }
}
