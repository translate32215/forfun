package i5;

import android.util.SparseArray;
import c5.f;
import com.startapp.b4;
import d5.a0;
import d5.i;
import d5.j;
import d5.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k0.g;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import v6.e0;
import v6.q;
import v6.u;
import v6.v;
import x4.m0;

/* compiled from: MatroskaExtractor */
public class e implements i {

    /* renamed from: b0  reason: collision with root package name */
    public static final byte[] f19166b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f19167c0 = e0.D("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f19168d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0  reason: collision with root package name */
    public static final UUID f19169e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0  reason: collision with root package name */
    public static final Map<String, Integer> f19170f0;
    public long A = -1;
    public long B = -9223372036854775807L;
    public q C;
    public q D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final c f19171a;

    /* renamed from: a0  reason: collision with root package name */
    public k f19172a0;

    /* renamed from: b  reason: collision with root package name */
    public final g f19173b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<c> f19174c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19175d;

    /* renamed from: e  reason: collision with root package name */
    public final v f19176e;

    /* renamed from: f  reason: collision with root package name */
    public final v f19177f;

    /* renamed from: g  reason: collision with root package name */
    public final v f19178g;

    /* renamed from: h  reason: collision with root package name */
    public final v f19179h;

    /* renamed from: i  reason: collision with root package name */
    public final v f19180i;

    /* renamed from: j  reason: collision with root package name */
    public final v f19181j;

    /* renamed from: k  reason: collision with root package name */
    public final v f19182k;

    /* renamed from: l  reason: collision with root package name */
    public final v f19183l;

    /* renamed from: m  reason: collision with root package name */
    public final v f19184m;

    /* renamed from: n  reason: collision with root package name */
    public final v f19185n;

    /* renamed from: o  reason: collision with root package name */
    public ByteBuffer f19186o;

    /* renamed from: p  reason: collision with root package name */
    public long f19187p;

    /* renamed from: q  reason: collision with root package name */
    public long f19188q = -1;

    /* renamed from: r  reason: collision with root package name */
    public long f19189r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f19190s = -9223372036854775807L;

    /* renamed from: t  reason: collision with root package name */
    public long f19191t = -9223372036854775807L;

    /* renamed from: u  reason: collision with root package name */
    public c f19192u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f19193v;

    /* renamed from: w  reason: collision with root package name */
    public int f19194w;

    /* renamed from: x  reason: collision with root package name */
    public long f19195x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f19196y;

    /* renamed from: z  reason: collision with root package name */
    public long f19197z = -1;

    /* compiled from: MatroskaExtractor */
    public final class b implements b {
        public b(a aVar) {
        }
    }

    /* compiled from: MatroskaExtractor */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f19225a = new byte[10];

        /* renamed from: b  reason: collision with root package name */
        public boolean f19226b;

        /* renamed from: c  reason: collision with root package name */
        public int f19227c;

        /* renamed from: d  reason: collision with root package name */
        public long f19228d;

        /* renamed from: e  reason: collision with root package name */
        public int f19229e;

        /* renamed from: f  reason: collision with root package name */
        public int f19230f;

        /* renamed from: g  reason: collision with root package name */
        public int f19231g;

        @RequiresNonNull({"#1.output"})
        public void a(c cVar) {
            if (this.f19227c > 0) {
                cVar.X.d(this.f19228d, this.f19229e, this.f19230f, this.f19231g, cVar.f19208j);
                this.f19227c = 0;
            }
        }
    }

    static {
        d dVar = d.f19164a;
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f19170f0 = Collections.unmodifiableMap(hashMap);
    }

    public e(int i10) {
        a aVar = new a();
        this.f19171a = aVar;
        aVar.f19158d = new b((a) null);
        this.f19175d = (i10 & 1) == 0;
        this.f19173b = new g();
        this.f19174c = new SparseArray<>();
        this.f19178g = new v(4);
        this.f19179h = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f19180i = new v(4);
        this.f19176e = new v(u.f26498a);
        this.f19177f = new v(4);
        this.f19181j = new v();
        this.f19182k = new v();
        this.f19183l = new v(8);
        this.f19184m = new v();
        this.f19185n = new v();
        this.L = new int[1];
    }

    public static int[] j(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] k(long j10, String str, long j11) {
        v6.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * 3600)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return e0.D(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    public final void a() {
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void b(int i10) throws m0 {
        if (this.C == null || this.D == null) {
            throw new m0(g.a("Element ", i10, " must be in a Cues"));
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void c(int i10) throws m0 {
        if (this.f19192u == null) {
            throw new m0(g.a("Element ", i10, " must be in a TrackEntry"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(i5.e.c r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            i5.e$d r3 = r1.T
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0035
            boolean r6 = r3.f19226b
            if (r6 != 0) goto L_0x0012
            goto L_0x00ec
        L_0x0012:
            int r6 = r3.f19227c
            int r7 = r6 + 1
            r3.f19227c = r7
            if (r6 != 0) goto L_0x0022
            r9 = r18
            r3.f19228d = r9
            r3.f19229e = r2
            r3.f19230f = r5
        L_0x0022:
            int r2 = r3.f19230f
            int r2 = r2 + r21
            r3.f19230f = r2
            r6 = r22
            r3.f19231g = r6
            r2 = 16
            if (r7 < r2) goto L_0x00ec
            r3.a(r1)
            goto L_0x00ec
        L_0x0035:
            r9 = r18
            r6 = r22
            java.lang.String r3 = r1.f19200b
            java.lang.String r7 = "S_TEXT/UTF8"
            boolean r3 = r7.equals(r3)
            java.lang.String r8 = "S_TEXT/ASS"
            if (r3 != 0) goto L_0x004d
            java.lang.String r3 = r1.f19200b
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0069
        L_0x004d:
            int r3 = r0.K
            java.lang.String r11 = "MatroskaExtractor"
            if (r3 <= r4) goto L_0x0059
            java.lang.String r3 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r11, r3)
            goto L_0x0069
        L_0x0059:
            long r12 = r0.I
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x006c
            java.lang.String r3 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r11, r3)
        L_0x0069:
            r3 = r21
            goto L_0x00c6
        L_0x006c:
            java.lang.String r3 = r1.f19200b
            v6.v r11 = r0.f19182k
            byte[] r11 = r11.f26518a
            r3.getClass()
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x0092
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x008c
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "%02d:%02d:%02d,%03d"
            byte[] r3 = k(r12, r3, r7)
            r7 = 19
            goto L_0x009c
        L_0x008c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0092:
            r7 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r3 = "%01d:%02d:%02d:%02d"
            byte[] r3 = k(r12, r3, r7)
            r7 = 21
        L_0x009c:
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r5, r11, r7, r8)
            v6.v r3 = r0.f19182k
            int r3 = r3.f26519b
        L_0x00a4:
            v6.v r5 = r0.f19182k
            int r7 = r5.f26520c
            if (r3 >= r7) goto L_0x00b7
            byte[] r7 = r5.f26518a
            byte r7 = r7[r3]
            if (r7 != 0) goto L_0x00b4
            r5.C(r3)
            goto L_0x00b7
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x00a4
        L_0x00b7:
            d5.a0 r3 = r1.X
            v6.v r5 = r0.f19182k
            int r7 = r5.f26520c
            r3.b(r5, r7)
            v6.v r3 = r0.f19182k
            int r3 = r3.f26520c
            int r3 = r21 + r3
        L_0x00c6:
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00df
            int r5 = r0.K
            if (r5 <= r4) goto L_0x00d4
            r5 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r2 = r2 & r5
            goto L_0x00df
        L_0x00d4:
            v6.v r5 = r0.f19185n
            int r7 = r5.f26520c
            d5.a0 r8 = r1.X
            r11 = 2
            r8.e(r5, r7, r11)
            int r3 = r3 + r7
        L_0x00df:
            r11 = r2
            r12 = r3
            d5.a0 r8 = r1.X
            d5.a0$a r14 = r1.f19208j
            r9 = r18
            r13 = r22
            r8.d(r9, r11, r12, r13, r14)
        L_0x00ec:
            r0.F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.d(i5.e$c, long, int, int, int):void");
    }

    public final boolean e(j jVar) throws IOException {
        j jVar2 = jVar;
        f fVar = new f();
        long b10 = jVar.b();
        long j10 = 1024;
        if (b10 != -1 && b10 <= 1024) {
            j10 = b10;
        }
        int i10 = (int) j10;
        jVar2.j(fVar.f19232a.f26518a, 0, 4);
        fVar.f19233b = 4;
        for (long t10 = fVar.f19232a.t(); t10 != 440786851; t10 = ((t10 << 8) & -256) | ((long) (fVar.f19232a.f26518a[0] & 255))) {
            int i11 = fVar.f19233b + 1;
            fVar.f19233b = i11;
            if (i11 == i10) {
                return false;
            }
            jVar2.j(fVar.f19232a.f26518a, 0, 1);
        }
        long a10 = fVar.a(jVar2);
        long j11 = (long) fVar.f19233b;
        if (a10 == Long.MIN_VALUE) {
            return false;
        }
        if (b10 != -1 && j11 + a10 >= b10) {
            return false;
        }
        while (true) {
            long j12 = (long) fVar.f19233b;
            long j13 = j11 + a10;
            if (j12 < j13) {
                if (fVar.a(jVar2) == Long.MIN_VALUE) {
                    return false;
                }
                long a11 = fVar.a(jVar2);
                if (a11 < 0 || a11 > 2147483647L) {
                    return false;
                }
                if (a11 != 0) {
                    int i12 = (int) a11;
                    jVar2.k(i12);
                    fVar.f19233b += i12;
                }
            } else if (j12 == j13) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r3v4, types: [int, byte, boolean] */
    /* JADX WARNING: type inference failed for: r3v131 */
    /* JADX WARNING: type inference failed for: r3v136 */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x077c, code lost:
        if (r4 != 7) goto L_0x07bd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x08d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x08d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(d5.j r27, d5.w r28) throws java.io.IOException {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = 0
            r0.F = r3
            r4 = 1
            r5 = 1
        L_0x000b:
            r6 = -1
            if (r5 == 0) goto L_0x08e7
            boolean r7 = r0.F
            if (r7 != 0) goto L_0x08e7
            i5.c r5 = r0.f19171a
            r7 = r5
            i5.a r7 = (i5.a) r7
            i5.b r5 = r7.f19158d
            v6.a.f(r5)
        L_0x001c:
            java.util.ArrayDeque<i5.a$b> r5 = r7.f19156b
            java.lang.Object r5 = r5.peek()
            i5.a$b r5 = (i5.a.b) r5
            r8 = -1
            if (r5 == 0) goto L_0x0047
            long r10 = r27.l()
            long r12 = r5.f19163b
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0047
            i5.b r3 = r7.f19158d
            java.util.ArrayDeque<i5.a$b> r4 = r7.f19156b
            java.lang.Object r4 = r4.pop()
            i5.a$b r4 = (i5.a.b) r4
            int r4 = r4.f19162a
            i5.e$b r3 = (i5.e.b) r3
            i5.e r3 = i5.e.this
            r3.g(r4)
            goto L_0x08aa
        L_0x0047:
            int r5 = r7.f19159e
            r10 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            r11 = 524531317(0x1f43b675, float:4.144378E-20)
            r12 = 4
            if (r5 != 0) goto L_0x00ac
            i5.g r5 = r7.f19157c
            long r13 = r5.c(r1, r4, r3, r12)
            r15 = -2
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x009f
            r27.f()
        L_0x0061:
            byte[] r5 = r7.f19155a
            r1.j(r5, r3, r12)
            byte[] r5 = r7.f19155a
            byte r5 = r5[r3]
            int r5 = i5.g.b(r5)
            if (r5 == r6) goto L_0x009b
            if (r5 > r12) goto L_0x009b
            byte[] r13 = r7.f19155a
            long r13 = i5.g.a(r13, r5, r3)
            int r14 = (int) r13
            i5.b r13 = r7.f19158d
            i5.e$b r13 = (i5.e.b) r13
            i5.e r13 = i5.e.this
            r13.getClass()
            r13 = 357149030(0x1549a966, float:4.072526E-26)
            if (r14 == r13) goto L_0x0093
            if (r14 == r11) goto L_0x0093
            if (r14 == r10) goto L_0x0093
            r13 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r14 != r13) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r13 = 0
            goto L_0x0094
        L_0x0093:
            r13 = 1
        L_0x0094:
            if (r13 == 0) goto L_0x009b
            r1.g(r5)
            long r13 = (long) r14
            goto L_0x009f
        L_0x009b:
            r1.g(r4)
            goto L_0x0061
        L_0x009f:
            int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x00a7
            r3 = 0
            r5 = 0
            goto L_0x08ac
        L_0x00a7:
            int r5 = (int) r13
            r7.f19160f = r5
            r7.f19159e = r4
        L_0x00ac:
            int r5 = r7.f19159e
            r8 = 8
            r9 = 2
            if (r5 != r4) goto L_0x00bd
            i5.g r5 = r7.f19157c
            long r10 = r5.c(r1, r3, r4, r8)
            r7.f19161g = r10
            r7.f19159e = r9
        L_0x00bd:
            i5.b r5 = r7.f19158d
            int r10 = r7.f19160f
            i5.e$b r5 = (i5.e.b) r5
            i5.e r5 = i5.e.this
            r5.getClass()
            r5 = 3
            r11 = 5
            switch(r10) {
                case 131: goto L_0x00d7;
                case 134: goto L_0x00d5;
                case 136: goto L_0x00d7;
                case 155: goto L_0x00d7;
                case 159: goto L_0x00d7;
                case 160: goto L_0x00d3;
                case 161: goto L_0x00d1;
                case 163: goto L_0x00d1;
                case 165: goto L_0x00d1;
                case 166: goto L_0x00d3;
                case 174: goto L_0x00d3;
                case 176: goto L_0x00d7;
                case 179: goto L_0x00d7;
                case 181: goto L_0x00cf;
                case 183: goto L_0x00d3;
                case 186: goto L_0x00d7;
                case 187: goto L_0x00d3;
                case 215: goto L_0x00d7;
                case 224: goto L_0x00d3;
                case 225: goto L_0x00d3;
                case 231: goto L_0x00d7;
                case 238: goto L_0x00d7;
                case 241: goto L_0x00d7;
                case 251: goto L_0x00d7;
                case 16868: goto L_0x00d3;
                case 16871: goto L_0x00d7;
                case 16877: goto L_0x00d1;
                case 16980: goto L_0x00d7;
                case 16981: goto L_0x00d1;
                case 17026: goto L_0x00d5;
                case 17029: goto L_0x00d7;
                case 17143: goto L_0x00d7;
                case 17545: goto L_0x00cf;
                case 18401: goto L_0x00d7;
                case 18402: goto L_0x00d1;
                case 18407: goto L_0x00d3;
                case 18408: goto L_0x00d7;
                case 19899: goto L_0x00d3;
                case 20529: goto L_0x00d7;
                case 20530: goto L_0x00d7;
                case 20532: goto L_0x00d3;
                case 20533: goto L_0x00d3;
                case 21358: goto L_0x00d5;
                case 21419: goto L_0x00d1;
                case 21420: goto L_0x00d7;
                case 21432: goto L_0x00d7;
                case 21680: goto L_0x00d7;
                case 21682: goto L_0x00d7;
                case 21690: goto L_0x00d7;
                case 21930: goto L_0x00d7;
                case 21936: goto L_0x00d3;
                case 21945: goto L_0x00d7;
                case 21946: goto L_0x00d7;
                case 21947: goto L_0x00d7;
                case 21948: goto L_0x00d7;
                case 21949: goto L_0x00d7;
                case 21968: goto L_0x00d3;
                case 21969: goto L_0x00cf;
                case 21970: goto L_0x00cf;
                case 21971: goto L_0x00cf;
                case 21972: goto L_0x00cf;
                case 21973: goto L_0x00cf;
                case 21974: goto L_0x00cf;
                case 21975: goto L_0x00cf;
                case 21976: goto L_0x00cf;
                case 21977: goto L_0x00cf;
                case 21978: goto L_0x00cf;
                case 21998: goto L_0x00d7;
                case 22186: goto L_0x00d7;
                case 22203: goto L_0x00d7;
                case 25152: goto L_0x00d3;
                case 25188: goto L_0x00d7;
                case 25506: goto L_0x00d1;
                case 28032: goto L_0x00d3;
                case 30113: goto L_0x00d3;
                case 30320: goto L_0x00d3;
                case 30321: goto L_0x00d7;
                case 30322: goto L_0x00d1;
                case 30323: goto L_0x00cf;
                case 30324: goto L_0x00cf;
                case 30325: goto L_0x00cf;
                case 2274716: goto L_0x00d5;
                case 2352003: goto L_0x00d7;
                case 2807729: goto L_0x00d7;
                case 290298740: goto L_0x00d3;
                case 357149030: goto L_0x00d3;
                case 374648427: goto L_0x00d3;
                case 408125543: goto L_0x00d3;
                case 440786851: goto L_0x00d3;
                case 475249515: goto L_0x00d3;
                case 524531317: goto L_0x00d3;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            r10 = 0
            goto L_0x00d8
        L_0x00cf:
            r10 = 5
            goto L_0x00d8
        L_0x00d1:
            r10 = 4
            goto L_0x00d8
        L_0x00d3:
            r10 = 1
            goto L_0x00d8
        L_0x00d5:
            r10 = 3
            goto L_0x00d8
        L_0x00d7:
            r10 = 2
        L_0x00d8:
            if (r10 == 0) goto L_0x08db
            if (r10 == r4) goto L_0x07e3
            java.lang.String r6 = " not supported"
            r13 = 8
            if (r10 == r9) goto L_0x0558
            r17 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r10 == r5) goto L_0x04cb
            if (r10 == r12) goto L_0x01cd
            if (r10 != r11) goto L_0x01c1
            long r4 = r7.f19161g
            r8 = 4
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x010d
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00f8
            goto L_0x010d
        L_0x00f8:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Invalid float size: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            long r3 = r7.f19161g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x010d:
            i5.b r6 = r7.f19158d
            int r8 = r7.f19160f
            int r5 = (int) r4
            long r9 = r7.a(r1, r5)
            if (r5 != r12) goto L_0x011f
            int r4 = (int) r9
            float r4 = java.lang.Float.intBitsToFloat(r4)
            double r4 = (double) r4
            goto L_0x0123
        L_0x011f:
            double r4 = java.lang.Double.longBitsToDouble(r9)
        L_0x0123:
            i5.e$b r6 = (i5.e.b) r6
            i5.e r6 = i5.e.this
            r6.getClass()
            r9 = 181(0xb5, float:2.54E-43)
            if (r8 == r9) goto L_0x01b5
            r9 = 17545(0x4489, float:2.4586E-41)
            if (r8 == r9) goto L_0x01b1
            switch(r8) {
                case 21969: goto L_0x018d;
                case 21970: goto L_0x0184;
                case 21971: goto L_0x017b;
                case 21972: goto L_0x0172;
                case 21973: goto L_0x0169;
                case 21974: goto L_0x0160;
                case 21975: goto L_0x0157;
                case 21976: goto L_0x014e;
                case 21977: goto L_0x0144;
                case 21978: goto L_0x013a;
                default: goto L_0x0135;
            }
        L_0x0135:
            switch(r8) {
                case 30323: goto L_0x01a8;
                case 30324: goto L_0x019f;
                case 30325: goto L_0x0196;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x01bd
        L_0x013a:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.M = r4
            goto L_0x01bd
        L_0x0144:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.L = r4
            goto L_0x01bd
        L_0x014e:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.K = r4
            goto L_0x01bd
        L_0x0157:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.J = r4
            goto L_0x01bd
        L_0x0160:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.I = r4
            goto L_0x01bd
        L_0x0169:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.H = r4
            goto L_0x01bd
        L_0x0172:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.G = r4
            goto L_0x01bd
        L_0x017b:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.F = r4
            goto L_0x01bd
        L_0x0184:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.E = r4
            goto L_0x01bd
        L_0x018d:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.D = r4
            goto L_0x01bd
        L_0x0196:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.f19219u = r4
            goto L_0x01bd
        L_0x019f:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.f19218t = r4
            goto L_0x01bd
        L_0x01a8:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            float r4 = (float) r4
            r6.f19217s = r4
            goto L_0x01bd
        L_0x01b1:
            long r4 = (long) r4
            r6.f19190s = r4
            goto L_0x01bd
        L_0x01b5:
            r6.c(r8)
            i5.e$c r6 = r6.f19192u
            int r4 = (int) r4
            r6.Q = r4
        L_0x01bd:
            r7.f19159e = r3
            goto L_0x08aa
        L_0x01c1:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Invalid element type "
            java.lang.String r2 = androidx.appcompat.widget.d0.a(r2, r10)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01cd:
            i5.b r6 = r7.f19158d
            int r10 = r7.f19160f
            long r13 = r7.f19161g
            int r11 = (int) r13
            i5.e$b r6 = (i5.e.b) r6
            i5.e r6 = i5.e.this
            r6.getClass()
            r13 = 161(0xa1, float:2.26E-43)
            r14 = 163(0xa3, float:2.28E-43)
            if (r10 == r13) goto L_0x02c0
            if (r10 == r14) goto L_0x02c0
            r5 = 165(0xa5, float:2.31E-43)
            if (r10 == r5) goto L_0x0288
            r5 = 16877(0x41ed, float:2.365E-41)
            if (r10 == r5) goto L_0x0268
            r5 = 16981(0x4255, float:2.3795E-41)
            if (r10 == r5) goto L_0x025a
            r5 = 18402(0x47e2, float:2.5787E-41)
            if (r10 == r5) goto L_0x0247
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r10 == r4) goto L_0x0227
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r10 == r4) goto L_0x0219
            r4 = 30322(0x7672, float:4.249E-41)
            if (r10 != r4) goto L_0x020d
            r6.c(r10)
            i5.e$c r4 = r6.f19192u
            byte[] r5 = new byte[r11]
            r4.f19220v = r5
            r1.readFully(r5, r3, r11)
            goto L_0x04c6
        L_0x020d:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Unexpected id: "
            java.lang.String r2 = androidx.appcompat.widget.d0.a(r2, r10)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0219:
            r6.c(r10)
            i5.e$c r4 = r6.f19192u
            byte[] r5 = new byte[r11]
            r4.f19209k = r5
            r1.readFully(r5, r3, r11)
            goto L_0x04c6
        L_0x0227:
            v6.v r4 = r6.f19180i
            byte[] r4 = r4.f26518a
            java.util.Arrays.fill(r4, r3)
            v6.v r4 = r6.f19180i
            byte[] r4 = r4.f26518a
            int r5 = 4 - r11
            r1.readFully(r4, r5, r11)
            v6.v r4 = r6.f19180i
            r4.D(r3)
            v6.v r3 = r6.f19180i
            long r3 = r3.t()
            int r4 = (int) r3
            r6.f19194w = r4
            goto L_0x04c6
        L_0x0247:
            byte[] r5 = new byte[r11]
            r1.readFully(r5, r3, r11)
            r6.c(r10)
            i5.e$c r6 = r6.f19192u
            d5.a0$a r8 = new d5.a0$a
            r8.<init>(r4, r5, r3, r3)
            r6.f19208j = r8
            goto L_0x04c6
        L_0x025a:
            r6.c(r10)
            i5.e$c r4 = r6.f19192u
            byte[] r5 = new byte[r11]
            r4.f19207i = r5
            r1.readFully(r5, r3, r11)
            goto L_0x04c6
        L_0x0268:
            r6.c(r10)
            i5.e$c r4 = r6.f19192u
            int r5 = r4.f19205g
            r6 = 1685485123(0x64767643, float:1.8185683E22)
            if (r5 == r6) goto L_0x027f
            r6 = 1685480259(0x64766343, float:1.8180206E22)
            if (r5 != r6) goto L_0x027a
            goto L_0x027f
        L_0x027a:
            r1.g(r11)
            goto L_0x04c6
        L_0x027f:
            byte[] r5 = new byte[r11]
            r4.N = r5
            r1.readFully(r5, r3, r11)
            goto L_0x04c6
        L_0x0288:
            int r4 = r6.G
            if (r4 == r9) goto L_0x028e
            goto L_0x04c6
        L_0x028e:
            android.util.SparseArray<i5.e$c> r4 = r6.f19174c
            int r5 = r6.M
            java.lang.Object r4 = r4.get(r5)
            i5.e$c r4 = (i5.e.c) r4
            int r5 = r6.P
            if (r5 != r12) goto L_0x02bb
            java.lang.String r4 = r4.f19200b
            java.lang.String r5 = "V_VP9"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02bb
            v6.v r4 = r6.f19185n
            byte[] r5 = r4.f26518a
            int r8 = r5.length
            if (r8 >= r11) goto L_0x02af
            byte[] r5 = new byte[r11]
        L_0x02af:
            r4.B(r5, r11)
            v6.v r4 = r6.f19185n
            byte[] r4 = r4.f26518a
            r1.readFully(r4, r3, r11)
            goto L_0x04c6
        L_0x02bb:
            r1.g(r11)
            goto L_0x04c6
        L_0x02c0:
            int r12 = r6.G
            if (r12 != 0) goto L_0x02e1
            i5.g r12 = r6.f19173b
            long r12 = r12.c(r1, r3, r4, r8)
            int r8 = (int) r12
            r6.M = r8
            i5.g r8 = r6.f19173b
            int r8 = r8.f19237c
            r6.N = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.I = r12
            r6.G = r4
            v6.v r8 = r6.f19178g
            r8.z(r3)
        L_0x02e1:
            android.util.SparseArray<i5.e$c> r8 = r6.f19174c
            int r12 = r6.M
            java.lang.Object r8 = r8.get(r12)
            i5.e$c r8 = (i5.e.c) r8
            if (r8 != 0) goto L_0x02f7
            int r4 = r6.N
            int r11 = r11 - r4
            r1.g(r11)
            r6.G = r3
            goto L_0x04c6
        L_0x02f7:
            d5.a0 r12 = r8.X
            r12.getClass()
            int r12 = r6.G
            if (r12 != r4) goto L_0x0478
            r6.l(r1, r5)
            v6.v r12 = r6.f19178g
            byte[] r12 = r12.f26518a
            byte r12 = r12[r9]
            r12 = r12 & 6
            int r12 = r12 >> r4
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x0322
            r6.K = r4
            int[] r9 = r6.L
            int[] r4 = j(r9, r4)
            r6.L = r4
            int r9 = r6.N
            int r11 = r11 - r9
            int r11 = r11 - r5
            r4[r3] = r11
            goto L_0x0432
        L_0x0322:
            r14 = 4
            r6.l(r1, r14)
            v6.v r14 = r6.f19178g
            byte[] r14 = r14.f26518a
            byte r14 = r14[r5]
            r14 = r14 & r13
            int r14 = r14 + r4
            r6.K = r14
            int[] r15 = r6.L
            int[] r14 = j(r15, r14)
            r6.L = r14
            if (r12 != r9) goto L_0x0347
            int r4 = r6.N
            int r11 = r11 - r4
            int r11 = r11 + -4
            int r4 = r6.K
            int r11 = r11 / r4
            java.util.Arrays.fill(r14, r3, r4, r11)
            goto L_0x0432
        L_0x0347:
            if (r12 != r4) goto L_0x0380
            r4 = 0
            r5 = 0
            r9 = 4
        L_0x034c:
            int r12 = r6.K
            int r14 = r12 + -1
            if (r4 >= r14) goto L_0x0373
            int[] r12 = r6.L
            r12[r4] = r3
        L_0x0356:
            int r9 = r9 + 1
            r6.l(r1, r9)
            v6.v r12 = r6.f19178g
            byte[] r12 = r12.f26518a
            int r14 = r9 + -1
            byte r12 = r12[r14]
            r12 = r12 & r13
            int[] r14 = r6.L
            r15 = r14[r4]
            int r15 = r15 + r12
            r14[r4] = r15
            if (r12 == r13) goto L_0x0356
            r12 = r14[r4]
            int r5 = r5 + r12
            int r4 = r4 + 1
            goto L_0x034c
        L_0x0373:
            int[] r3 = r6.L
            int r12 = r12 + -1
            int r4 = r6.N
            int r11 = r11 - r4
            int r11 = r11 - r9
            int r11 = r11 - r5
            r3[r12] = r11
            goto L_0x0432
        L_0x0380:
            if (r12 != r5) goto L_0x046c
            r5 = 0
            r9 = 0
            r12 = 4
        L_0x0385:
            int r14 = r6.K
            int r15 = r14 + -1
            if (r5 >= r15) goto L_0x0427
            int[] r14 = r6.L
            r14[r5] = r3
            int r12 = r12 + 1
            r6.l(r1, r12)
            v6.v r3 = r6.f19178g
            byte[] r3 = r3.f26518a
            int r14 = r12 + -1
            byte r3 = r3[r14]
            if (r3 == 0) goto L_0x041f
            r3 = 8
            r15 = 0
        L_0x03a1:
            if (r15 >= r3) goto L_0x03f2
            int r3 = 7 - r15
            int r3 = r4 << r3
            v6.v r4 = r6.f19178g
            byte[] r4 = r4.f26518a
            byte r4 = r4[r14]
            r4 = r4 & r3
            if (r4 == 0) goto L_0x03ea
            int r12 = r12 + r15
            r6.l(r1, r12)
            v6.v r4 = r6.f19178g
            byte[] r4 = r4.f26518a
            int r16 = r14 + 1
            byte r4 = r4[r14]
            r4 = r4 & r13
            r3 = r3 ^ -1
            r3 = r3 & r4
            long r3 = (long) r3
            r14 = r16
        L_0x03c3:
            if (r14 >= r12) goto L_0x03db
            r16 = 8
            long r3 = r3 << r16
            v6.v r13 = r6.f19178g
            byte[] r13 = r13.f26518a
            int r21 = r14 + 1
            byte r13 = r13[r14]
            r14 = 255(0xff, float:3.57E-43)
            r13 = r13 & r14
            long r13 = (long) r13
            long r3 = r3 | r13
            r14 = r21
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x03c3
        L_0x03db:
            if (r5 <= 0) goto L_0x03f4
            int r15 = r15 * 7
            int r15 = r15 + 6
            r13 = 1
            long r19 = r13 << r15
            long r21 = r19 - r13
            long r3 = r3 - r21
            goto L_0x03f4
        L_0x03ea:
            int r15 = r15 + 1
            r3 = 8
            r4 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x03a1
        L_0x03f2:
            r3 = 0
        L_0x03f4:
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x0417
            int r13 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r13 > 0) goto L_0x0417
            int r4 = (int) r3
            int[] r3 = r6.L
            if (r5 != 0) goto L_0x0405
            goto L_0x040a
        L_0x0405:
            int r13 = r5 + -1
            r13 = r3[r13]
            int r4 = r4 + r13
        L_0x040a:
            r3[r5] = r4
            r3 = r3[r5]
            int r9 = r9 + r3
            int r5 = r5 + 1
            r3 = 0
            r4 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x0385
        L_0x0417:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x041f:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0427:
            int[] r3 = r6.L
            int r14 = r14 + -1
            int r4 = r6.N
            int r11 = r11 - r4
            int r11 = r11 - r12
            int r11 = r11 - r9
            r3[r14] = r11
        L_0x0432:
            v6.v r3 = r6.f19178g
            byte[] r3 = r3.f26518a
            r4 = 0
            byte r4 = r3[r4]
            int r4 = r4 << 8
            r5 = 1
            byte r3 = r3[r5]
            r5 = 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            r3 = r3 | r4
            long r4 = r6.B
            long r11 = (long) r3
            long r11 = r6.n(r11)
            long r11 = r11 + r4
            r6.H = r11
            int r3 = r8.f19202d
            r4 = 2
            if (r3 == r4) goto L_0x0463
            r3 = 163(0xa3, float:2.28E-43)
            if (r10 != r3) goto L_0x0461
            v6.v r3 = r6.f19178g
            byte[] r3 = r3.f26518a
            byte r3 = r3[r4]
            r5 = 128(0x80, float:1.794E-43)
            r3 = r3 & r5
            if (r3 != r5) goto L_0x0461
            goto L_0x0463
        L_0x0461:
            r3 = 0
            goto L_0x0464
        L_0x0463:
            r3 = 1
        L_0x0464:
            r6.O = r3
            r6.G = r4
            r3 = 0
            r6.J = r3
            goto L_0x0478
        L_0x046c:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Unexpected lacing value: "
            java.lang.String r2 = androidx.appcompat.widget.d0.a(r2, r12)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0478:
            r3 = 163(0xa3, float:2.28E-43)
            if (r10 != r3) goto L_0x04af
        L_0x047c:
            int r3 = r6.J
            int r4 = r6.K
            if (r3 >= r4) goto L_0x04ab
            int[] r4 = r6.L
            r3 = r4[r3]
            int r24 = r6.o(r1, r8, r3)
            long r3 = r6.H
            int r5 = r6.J
            int r9 = r8.f19203e
            int r5 = r5 * r9
            int r5 = r5 / 1000
            long r9 = (long) r5
            long r21 = r9 + r3
            int r3 = r6.O
            r25 = 0
            r19 = r6
            r20 = r8
            r23 = r3
            r19.d(r20, r21, r23, r24, r25)
            int r3 = r6.J
            int r3 = r3 + 1
            r6.J = r3
            goto L_0x047c
        L_0x04ab:
            r3 = 0
            r6.G = r3
            goto L_0x04c6
        L_0x04af:
            int r3 = r6.J
            int r4 = r6.K
            if (r3 >= r4) goto L_0x04c6
            int[] r4 = r6.L
            r5 = r4[r3]
            int r5 = r6.o(r1, r8, r5)
            r4[r3] = r5
            int r3 = r6.J
            int r3 = r3 + 1
            r6.J = r3
            goto L_0x04af
        L_0x04c6:
            r3 = 0
            r7.f19159e = r3
            goto L_0x08aa
        L_0x04cb:
            long r3 = r7.f19161g
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 > 0) goto L_0x0543
            i5.b r5 = r7.f19158d
            int r8 = r7.f19160f
            int r4 = (int) r3
            if (r4 != 0) goto L_0x04db
            java.lang.String r3 = ""
            goto L_0x04f1
        L_0x04db:
            byte[] r3 = new byte[r4]
            r9 = 0
            r1.readFully(r3, r9, r4)
        L_0x04e1:
            if (r4 <= 0) goto L_0x04eb
            int r10 = r4 + -1
            byte r11 = r3[r10]
            if (r11 != 0) goto L_0x04eb
            r4 = r10
            goto L_0x04e1
        L_0x04eb:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r3, r9, r4)
            r3 = r10
        L_0x04f1:
            i5.e$b r5 = (i5.e.b) r5
            i5.e r4 = i5.e.this
            r4.getClass()
            r5 = 134(0x86, float:1.88E-43)
            if (r8 == r5) goto L_0x0537
            r5 = 17026(0x4282, float:2.3859E-41)
            if (r8 == r5) goto L_0x051a
            r5 = 21358(0x536e, float:2.9929E-41)
            if (r8 == r5) goto L_0x0512
            r5 = 2274716(0x22b59c, float:3.187556E-39)
            if (r8 == r5) goto L_0x050a
            goto L_0x053e
        L_0x050a:
            r4.c(r8)
            i5.e$c r4 = r4.f19192u
            r4.W = r3
            goto L_0x053e
        L_0x0512:
            r4.c(r8)
            i5.e$c r4 = r4.f19192u
            r4.f19199a = r3
            goto L_0x053e
        L_0x051a:
            java.lang.String r4 = "webm"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x053e
            java.lang.String r4 = "matroska"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x052b
            goto L_0x053e
        L_0x052b:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "DocType "
            java.lang.String r2 = q.b.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0537:
            r4.c(r8)
            i5.e$c r4 = r4.f19192u
            r4.f19200b = r3
        L_0x053e:
            r3 = 0
            r7.f19159e = r3
            goto L_0x08aa
        L_0x0543:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "String element size: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            long r3 = r7.f19161g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0558:
            long r3 = r7.f19161g
            int r8 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r8 > 0) goto L_0x07ce
            i5.b r8 = r7.f19158d
            int r9 = r7.f19160f
            int r4 = (int) r3
            long r3 = r7.a(r1, r4)
            i5.e$b r8 = (i5.e.b) r8
            i5.e r8 = i5.e.this
            r8.getClass()
            r10 = 20529(0x5031, float:2.8767E-41)
            if (r9 == r10) goto L_0x07b7
            r10 = 20530(0x5032, float:2.8769E-41)
            if (r9 == r10) goto L_0x07a4
            switch(r9) {
                case 131: goto L_0x0725;
                case 136: goto L_0x0713;
                case 155: goto L_0x070b;
                case 159: goto L_0x0701;
                case 176: goto L_0x06f7;
                case 179: goto L_0x06e9;
                case 186: goto L_0x06df;
                case 215: goto L_0x06d5;
                case 231: goto L_0x06cd;
                case 238: goto L_0x06c8;
                case 241: goto L_0x06b7;
                case 251: goto L_0x06b2;
                case 16871: goto L_0x06a8;
                case 16980: goto L_0x0694;
                case 17029: goto L_0x067a;
                case 17143: goto L_0x0666;
                case 18401: goto L_0x0652;
                case 18408: goto L_0x063e;
                case 21420: goto L_0x0637;
                case 21432: goto L_0x060c;
                case 21680: goto L_0x0602;
                case 21682: goto L_0x05f8;
                case 21690: goto L_0x05ee;
                case 21930: goto L_0x05dc;
                case 21998: goto L_0x05d2;
                case 22186: goto L_0x05c9;
                case 22203: goto L_0x05c0;
                case 25188: goto L_0x05b6;
                case 30321: goto L_0x058d;
                case 2352003: goto L_0x0583;
                case 2807729: goto L_0x057f;
                default: goto L_0x0579;
            }
        L_0x0579:
            r6 = 7
            switch(r9) {
                case 21945: goto L_0x078e;
                case 21946: goto L_0x076a;
                case 21947: goto L_0x0743;
                case 21948: goto L_0x0739;
                case 21949: goto L_0x072f;
                default: goto L_0x057d;
            }
        L_0x057d:
            goto L_0x07bd
        L_0x057f:
            r8.f19189r = r3
            goto L_0x07bd
        L_0x0583:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19203e = r4
            goto L_0x07bd
        L_0x058d:
            r8.c(r9)
            int r4 = (int) r3
            if (r4 == 0) goto L_0x05af
            r3 = 1
            if (r4 == r3) goto L_0x05a9
            r3 = 2
            if (r4 == r3) goto L_0x05a3
            if (r4 == r5) goto L_0x059d
            goto L_0x07bd
        L_0x059d:
            i5.e$c r3 = r8.f19192u
            r3.f19216r = r5
            goto L_0x07bd
        L_0x05a3:
            i5.e$c r4 = r8.f19192u
            r4.f19216r = r3
            goto L_0x07bd
        L_0x05a9:
            i5.e$c r4 = r8.f19192u
            r4.f19216r = r3
            goto L_0x07bd
        L_0x05af:
            i5.e$c r3 = r8.f19192u
            r4 = 0
            r3.f19216r = r4
            goto L_0x07bd
        L_0x05b6:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.P = r4
            goto L_0x07bd
        L_0x05c0:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            r5.S = r3
            goto L_0x07bd
        L_0x05c9:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            r5.R = r3
            goto L_0x07bd
        L_0x05d2:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19204f = r4
            goto L_0x07bd
        L_0x05dc:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            r8 = 1
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x05e9
            r3 = 1
            goto L_0x05ea
        L_0x05e9:
            r3 = 0
        L_0x05ea:
            r5.U = r3
            goto L_0x07bd
        L_0x05ee:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19214p = r4
            goto L_0x07bd
        L_0x05f8:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19215q = r4
            goto L_0x07bd
        L_0x0602:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19213o = r4
            goto L_0x07bd
        L_0x060c:
            int r4 = (int) r3
            r8.c(r9)
            if (r4 == 0) goto L_0x0630
            r3 = 1
            if (r4 == r3) goto L_0x0629
            if (r4 == r5) goto L_0x0623
            r3 = 15
            if (r4 == r3) goto L_0x061d
            goto L_0x07bd
        L_0x061d:
            i5.e$c r3 = r8.f19192u
            r3.f19221w = r5
            goto L_0x07bd
        L_0x0623:
            i5.e$c r4 = r8.f19192u
            r4.f19221w = r3
            goto L_0x07bd
        L_0x0629:
            i5.e$c r3 = r8.f19192u
            r4 = 2
            r3.f19221w = r4
            goto L_0x07bd
        L_0x0630:
            i5.e$c r3 = r8.f19192u
            r4 = 0
            r3.f19221w = r4
            goto L_0x07bd
        L_0x0637:
            long r5 = r8.f19188q
            long r3 = r3 + r5
            r8.f19195x = r3
            goto L_0x07bd
        L_0x063e:
            r8 = 1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0646
            goto L_0x07bd
        L_0x0646:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "AESSettingsCipherMode "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0652:
            r8 = 5
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x065a
            goto L_0x07bd
        L_0x065a:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "ContentEncAlgo "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0666:
            r8 = 1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x066e
            goto L_0x07bd
        L_0x066e:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "EBMLReadVersion "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x067a:
            r8 = 1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0688
            r8 = 2
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0688
            goto L_0x07bd
        L_0x0688:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "DocTypeReadVersion "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0694:
            r8 = 3
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x069c
            goto L_0x07bd
        L_0x069c:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "ContentCompAlgo "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x06a8:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19205g = r4
            goto L_0x07bd
        L_0x06b2:
            r3 = 1
            r8.Q = r3
            goto L_0x07bd
        L_0x06b7:
            r5 = 1
            boolean r6 = r8.E
            if (r6 != 0) goto L_0x07bd
            r8.b(r9)
            v6.q r6 = r8.D
            r6.a(r3)
            r8.E = r5
            goto L_0x07bd
        L_0x06c8:
            int r4 = (int) r3
            r8.P = r4
            goto L_0x07bd
        L_0x06cd:
            long r3 = r8.n(r3)
            r8.B = r3
            goto L_0x07bd
        L_0x06d5:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19201c = r4
            goto L_0x07bd
        L_0x06df:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19212n = r4
            goto L_0x07bd
        L_0x06e9:
            r8.b(r9)
            v6.q r5 = r8.C
            long r3 = r8.n(r3)
            r5.a(r3)
            goto L_0x07bd
        L_0x06f7:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19211m = r4
            goto L_0x07bd
        L_0x0701:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.O = r4
            goto L_0x07bd
        L_0x070b:
            long r3 = r8.n(r3)
            r8.I = r3
            goto L_0x07bd
        L_0x0713:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            r8 = 1
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0720
            r3 = 1
            goto L_0x0721
        L_0x0720:
            r3 = 0
        L_0x0721:
            r5.V = r3
            goto L_0x07bd
        L_0x0725:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.f19202d = r4
            goto L_0x07bd
        L_0x072f:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.C = r4
            goto L_0x07bd
        L_0x0739:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            int r4 = (int) r3
            r5.B = r4
            goto L_0x07bd
        L_0x0743:
            r8.c(r9)
            i5.e$c r5 = r8.f19192u
            r8 = 1
            r5.f19222x = r8
            int r4 = (int) r3
            if (r4 == r8) goto L_0x0766
            r3 = 9
            if (r4 == r3) goto L_0x0762
            r3 = 4
            if (r4 == r3) goto L_0x075e
            if (r4 == r11) goto L_0x075e
            r3 = 6
            if (r4 == r3) goto L_0x075e
            if (r4 == r6) goto L_0x075e
            goto L_0x07bd
        L_0x075e:
            r3 = 2
            r5.f19223y = r3
            goto L_0x07bd
        L_0x0762:
            r3 = 6
            r5.f19223y = r3
            goto L_0x07bd
        L_0x0766:
            r3 = 1
            r5.f19223y = r3
            goto L_0x07bd
        L_0x076a:
            r10 = 6
            r11 = 1
            r8.c(r9)
            int r4 = (int) r3
            if (r4 == r11) goto L_0x0789
            r3 = 16
            if (r4 == r3) goto L_0x0784
            r3 = 18
            if (r4 == r3) goto L_0x077f
            if (r4 == r10) goto L_0x0789
            if (r4 == r6) goto L_0x0789
            goto L_0x07bd
        L_0x077f:
            i5.e$c r3 = r8.f19192u
            r3.f19224z = r6
            goto L_0x07bd
        L_0x0784:
            i5.e$c r3 = r8.f19192u
            r3.f19224z = r10
            goto L_0x07bd
        L_0x0789:
            i5.e$c r3 = r8.f19192u
            r3.f19224z = r5
            goto L_0x07bd
        L_0x078e:
            r8.c(r9)
            int r4 = (int) r3
            r3 = 1
            if (r4 == r3) goto L_0x079e
            r5 = 2
            if (r4 == r5) goto L_0x0799
            goto L_0x07bd
        L_0x0799:
            i5.e$c r4 = r8.f19192u
            r4.A = r3
            goto L_0x07bd
        L_0x079e:
            r3 = 2
            i5.e$c r4 = r8.f19192u
            r4.A = r3
            goto L_0x07bd
        L_0x07a4:
            r8 = 1
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x07ab
            goto L_0x07bd
        L_0x07ab:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "ContentEncodingScope "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x07b7:
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x07c2
        L_0x07bd:
            r3 = 0
            r7.f19159e = r3
            goto L_0x08aa
        L_0x07c2:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "ContentEncodingOrder "
            java.lang.String r2 = q2.a.a(r2, r3, r6)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x07ce:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Invalid integer size: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            long r3 = r7.f19161g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x07e3:
            long r3 = r27.l()
            long r8 = r7.f19161g
            long r8 = r8 + r3
            java.util.ArrayDeque<i5.a$b> r5 = r7.f19156b
            i5.a$b r10 = new i5.a$b
            int r11 = r7.f19160f
            r12 = 0
            r10.<init>(r11, r8, r12)
            r5.push(r10)
            i5.b r5 = r7.f19158d
            int r8 = r7.f19160f
            long r9 = r7.f19161g
            i5.e$b r5 = (i5.e.b) r5
            i5.e r5 = i5.e.this
            d5.k r11 = r5.f19172a0
            v6.a.f(r11)
            r11 = 160(0xa0, float:2.24E-43)
            if (r8 == r11) goto L_0x08a5
            r11 = 174(0xae, float:2.44E-43)
            if (r8 == r11) goto L_0x089c
            r11 = 187(0xbb, float:2.62E-43)
            if (r8 == r11) goto L_0x0898
            r11 = 19899(0x4dbb, float:2.7884E-41)
            if (r8 == r11) goto L_0x0890
            r6 = 20533(0x5035, float:2.8773E-41)
            if (r8 == r6) goto L_0x0887
            r6 = 21968(0x55d0, float:3.0784E-41)
            if (r8 == r6) goto L_0x087e
            r6 = 408125543(0x18538067, float:2.7335937E-24)
            if (r8 == r6) goto L_0x0864
            r3 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r8 == r3) goto L_0x0854
            r3 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r8 == r3) goto L_0x082e
            goto L_0x0896
        L_0x082e:
            boolean r3 = r5.f19193v
            if (r3 != 0) goto L_0x0896
            boolean r3 = r5.f19175d
            if (r3 == 0) goto L_0x0842
            long r3 = r5.f19197z
            r8 = -1
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0842
            r3 = 1
            r5.f19196y = r3
            goto L_0x0896
        L_0x0842:
            r3 = 1
            d5.k r4 = r5.f19172a0
            d5.x$b r6 = new d5.x$b
            long r8 = r5.f19191t
            r10 = 0
            r6.<init>(r8, r10)
            r4.b(r6)
            r5.f19193v = r3
            goto L_0x0896
        L_0x0854:
            v6.q r3 = new v6.q
            r4 = 0
            r3.<init>(r4, r12)
            r5.C = r3
            v6.q r3 = new v6.q
            r3.<init>(r4, r12)
            r5.D = r3
            goto L_0x0896
        L_0x0864:
            long r11 = r5.f19188q
            r13 = -1
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0879
            int r6 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0871
            goto L_0x0879
        L_0x0871:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Multiple Segment elements not supported"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0879:
            r5.f19188q = r3
            r5.f19187p = r9
            goto L_0x0896
        L_0x087e:
            r5.c(r8)
            i5.e$c r3 = r5.f19192u
            r4 = 1
            r3.f19222x = r4
            goto L_0x0896
        L_0x0887:
            r3 = 1
            r5.c(r8)
            i5.e$c r4 = r5.f19192u
            r4.f19206h = r3
            goto L_0x0896
        L_0x0890:
            r5.f19194w = r6
            r3 = -1
            r5.f19195x = r3
        L_0x0896:
            r3 = 0
            goto L_0x08a8
        L_0x0898:
            r3 = 0
            r5.E = r3
            goto L_0x08a8
        L_0x089c:
            r3 = 0
            i5.e$c r4 = new i5.e$c
            r4.<init>(r12)
            r5.f19192u = r4
            goto L_0x08a8
        L_0x08a5:
            r3 = 0
            r5.Q = r3
        L_0x08a8:
            r7.f19159e = r3
        L_0x08aa:
            r3 = 1
            r5 = 1
        L_0x08ac:
            if (r5 == 0) goto L_0x08d7
            long r3 = r27.l()
            boolean r6 = r0.f19196y
            if (r6 == 0) goto L_0x08c0
            r0.A = r3
            long r3 = r0.f19197z
            r2.f13063a = r3
            r3 = 0
            r0.f19196y = r3
            goto L_0x08d0
        L_0x08c0:
            boolean r3 = r0.f19193v
            if (r3 == 0) goto L_0x08d2
            long r3 = r0.A
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x08d2
            r2.f13063a = r3
            r0.A = r6
        L_0x08d0:
            r3 = 1
            goto L_0x08d3
        L_0x08d2:
            r3 = 0
        L_0x08d3:
            if (r3 == 0) goto L_0x08d7
            r1 = 1
            return r1
        L_0x08d7:
            r3 = 0
            r4 = 1
            goto L_0x000b
        L_0x08db:
            long r3 = r7.f19161g
            int r4 = (int) r3
            r1.g(r4)
            r3 = 0
            r7.f19159e = r3
            r4 = 1
            goto L_0x001c
        L_0x08e7:
            if (r5 != 0) goto L_0x090a
            r1 = 0
        L_0x08ea:
            android.util.SparseArray<i5.e$c> r2 = r0.f19174c
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0909
            android.util.SparseArray<i5.e$c> r2 = r0.f19174c
            java.lang.Object r2 = r2.valueAt(r1)
            i5.e$c r2 = (i5.e.c) r2
            d5.a0 r3 = r2.X
            r3.getClass()
            i5.e$d r3 = r2.T
            if (r3 == 0) goto L_0x0906
            r3.a(r2)
        L_0x0906:
            int r1 = r1 + 1
            goto L_0x08ea
        L_0x0909:
            return r6
        L_0x090a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.f(d5.j, d5.w):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v162, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v167, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v168, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v170, resolved type: ba.s} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x05e8, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0636, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0637, code lost:
        r1 = null;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0721, code lost:
        r5 = r4;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0722, code lost:
        r4 = null;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0723, code lost:
        r6 = -1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0733, code lost:
        r5 = r1;
        r4 = 4096;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0737, code lost:
        r6 = r4;
        r4 = null;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07ce, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07cf, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0807, code lost:
        if (r1.m() == r7.getLeastSignificantBits()) goto L_0x0809;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x082f, code lost:
        r5 = null;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x084d, code lost:
        r4 = r1;
        r1 = null;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0850, code lost:
        r6 = -1;
        r10 = r5;
        r18 = r4;
        r4 = r1;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0857, code lost:
        r5 = r1;
        r1 = -1;
        r18 = r6;
        r6 = r4;
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x085f, code lost:
        r7 = r0.N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0861, code lost:
        if (r7 == null) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0863, code lost:
        r7 = w6.c.e(new v6.v(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x086c, code lost:
        if (r7 == null) goto L_0x0874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x086e, code lost:
        r6 = (java.lang.String) r7.f27030c;
        r10 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0874, code lost:
        r7 = r0.V | 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x087a, code lost:
        if (r0.U == false) goto L_0x087e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x087c, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x087e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x087f, code lost:
        r7 = r7 | r8;
        r8 = new x4.b0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0889, code lost:
        if (v6.s.k(r10) == false) goto L_0x0898;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x088b, code lost:
        r8.f27438x = r0.O;
        r8.f27439y = r0.Q;
        r8.f27440z = r1;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x089c, code lost:
        if (v6.s.m(r10) == false) goto L_0x0a22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x08a0, code lost:
        if (r0.f19215q != 0) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x08a2, code lost:
        r1 = r0.f19213o;
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x08a5, code lost:
        if (r1 != -1) goto L_0x08a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08a7, code lost:
        r1 = r0.f19211m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08a9, code lost:
        r0.f19213o = r1;
        r1 = r0.f19214p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x08ad, code lost:
        if (r1 != -1) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x08af, code lost:
        r1 = r0.f19212n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x08b1, code lost:
        r0.f19214p = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x08b4, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x08b5, code lost:
        r1 = -1.0f;
        r11 = r0.f19213o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08b9, code lost:
        if (r11 == r9) goto L_0x08ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x08bb, code lost:
        r12 = r0.f19214p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x08bd, code lost:
        if (r12 == r9) goto L_0x08ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x08bf, code lost:
        r1 = ((float) (r0.f19212n * r11)) / ((float) (r0.f19211m * r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08cc, code lost:
        if (r0.f19222x == false) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08d4, code lost:
        if (r0.D == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x08da, code lost:
        if (r0.E == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x08e0, code lost:
        if (r0.F == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x08e6, code lost:
        if (r0.G == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x08ec, code lost:
        if (r0.H == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x08f2, code lost:
        if (r0.I == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x08f8, code lost:
        if (r0.J == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x08fe, code lost:
        if (r0.K == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0904, code lost:
        if (r0.L == -1.0f) goto L_0x0992;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x090a, code lost:
        if (r0.M != -1.0f) goto L_0x090e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x090e, code lost:
        r9 = new byte[25];
        r11 = java.nio.ByteBuffer.wrap(r9).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r11.put((byte) 0);
        r11.putShort((short) ((int) ((r0.D * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.E * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.F * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.G * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.H * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.I * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.J * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) ((r0.K * 50000.0f) + 0.5f)));
        r11.putShort((short) ((int) (r0.L + 0.5f)));
        r11.putShort((short) ((int) (r0.M + 0.5f)));
        r11.putShort((short) r0.B);
        r11.putShort((short) r0.C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0992, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0993, code lost:
        r11 = new w6.b(r0.f19223y, r0.A, r0.f19224z, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x099f, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x09a0, code lost:
        r9 = r0.f19199a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09a2, code lost:
        if (r9 == null) goto L_0x09b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09a4, code lost:
        r12 = f19170f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09aa, code lost:
        if (r12.containsKey(r9) == false) goto L_0x09b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x09ac, code lost:
        r9 = r12.get(r0.f19199a).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09b9, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x09bc, code lost:
        if (r0.f19216r != 0) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x09c5, code lost:
        if (java.lang.Float.compare(r0.f19217s, 0.0f) != 0) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x09cd, code lost:
        if (java.lang.Float.compare(r0.f19218t, 0.0f) != 0) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x09d5, code lost:
        if (java.lang.Float.compare(r0.f19219u, 0.0f) != 0) goto L_0x09d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x09d7, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x09e1, code lost:
        if (java.lang.Float.compare(r0.f19218t, 90.0f) != 0) goto L_0x09e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x09e3, code lost:
        r9 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x09ee, code lost:
        if (java.lang.Float.compare(r0.f19218t, -180.0f) == 0) goto L_0x0a08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x09f8, code lost:
        if (java.lang.Float.compare(r0.f19218t, 180.0f) != 0) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a03, code lost:
        if (java.lang.Float.compare(r0.f19218t, -90.0f) != 0) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a05, code lost:
        r9 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0a08, code lost:
        r9 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0a0a, code lost:
        r8.f27430p = r0.f19211m;
        r8.f27431q = r0.f19212n;
        r8.f27434t = r1;
        r8.f27433s = r9;
        r8.f27435u = r0.f19220v;
        r8.f27436v = r0.f19221w;
        r8.f27437w = r11;
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0a28, code lost:
        if ("application/x-subrip".equals(r10) != false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a30, code lost:
        if ("text/x-ssa".equals(r10) != false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0a38, code lost:
        if ("application/vobsub".equals(r10) != false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0a40, code lost:
        if ("application/pgs".equals(r10) != false) goto L_0x0a53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0a48, code lost:
        if ("application/dvbsubs".equals(r10) == false) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0a52, code lost:
        throw new x4.m0("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0a53, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0a54, code lost:
        r9 = r0.f19199a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0a56, code lost:
        if (r9 == null) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0a5e, code lost:
        if (f19170f0.containsKey(r9) != false) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0a60, code lost:
        r8.f27416b = r0.f19199a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0a64, code lost:
        r8.b(r3);
        r8.f27425k = r10;
        r8.f27426l = r4;
        r8.f27417c = r0.W;
        r8.f27418d = r7;
        r8.f27427m = r5;
        r8.f27422h = r6;
        r8.f27428n = r0.f19210l;
        r3 = r8.a();
        r1 = r2.l(r0.f19201c, r1);
        r0.X = r1;
        r1.c(r3);
        r7 = r19;
        r7.f19174c.put(r0.f19201c, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x080e  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0832  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(int r20) throws x4.m0 {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            d5.k r1 = r7.f19172a0
            v6.a.f(r1)
            r1 = 2
            r2 = 0
            r3 = 160(0xa0, float:2.24E-43)
            if (r0 == r3) goto L_0x0a9d
            r3 = 174(0xae, float:2.44E-43)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r0 == r3) goto L_0x0186
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r3 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x016c
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013f
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0128
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010f
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f8
            if (r0 == r3) goto L_0x0038
            goto L_0x0af3
        L_0x0038:
            boolean r0 = r7.f19193v
            if (r0 != 0) goto L_0x00f2
            d5.k r0 = r7.f19172a0
            v6.q r1 = r7.C
            v6.q r3 = r7.D
            long r10 = r7.f19188q
            r12 = -1
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x00e4
            long r10 = r7.f19191t
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            int r4 = r1.f()
            if (r4 == 0) goto L_0x00e4
            if (r3 == 0) goto L_0x00e4
            int r4 = r3.f()
            int r8 = r1.f()
            if (r4 == r8) goto L_0x0066
            goto L_0x00e4
        L_0x0066:
            int r4 = r1.f()
            int[] r8 = new int[r4]
            long[] r9 = new long[r4]
            long[] r10 = new long[r4]
            long[] r11 = new long[r4]
            r12 = 0
        L_0x0073:
            if (r12 >= r4) goto L_0x0087
            long r13 = r1.c(r12)
            r11[r12] = r13
            long r13 = r7.f19188q
            long r15 = r3.c(r12)
            long r15 = r15 + r13
            r9[r12] = r15
            int r12 = r12 + 1
            goto L_0x0073
        L_0x0087:
            int r1 = r4 + -1
            if (r2 >= r1) goto L_0x009e
            int r1 = r2 + 1
            r12 = r9[r1]
            r14 = r9[r2]
            long r12 = r12 - r14
            int r3 = (int) r12
            r8[r2] = r3
            r12 = r11[r1]
            r14 = r11[r2]
            long r12 = r12 - r14
            r10[r2] = r12
            r2 = r1
            goto L_0x0087
        L_0x009e:
            long r2 = r7.f19188q
            long r12 = r7.f19187p
            long r2 = r2 + r12
            r12 = r9[r1]
            long r2 = r2 - r12
            int r3 = (int) r2
            r8[r1] = r3
            long r2 = r7.f19191t
            r12 = r11[r1]
            long r2 = r2 - r12
            r10[r1] = r2
            r2 = r10[r1]
            r12 = 0
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x00de
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "Discarding last cue point with unexpected duration: "
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MatroskaExtractor"
            android.util.Log.w(r3, r2)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            long[] r9 = java.util.Arrays.copyOf(r9, r1)
            long[] r10 = java.util.Arrays.copyOf(r10, r1)
            long[] r11 = java.util.Arrays.copyOf(r11, r1)
        L_0x00de:
            d5.d r1 = new d5.d
            r1.<init>(r8, r9, r10, r11)
            goto L_0x00ed
        L_0x00e4:
            d5.x$b r1 = new d5.x$b
            long r2 = r7.f19191t
            r8 = 0
            r1.<init>(r2, r8)
        L_0x00ed:
            r0.b(r1)
            r7.f19193v = r5
        L_0x00f2:
            r7.C = r6
            r7.D = r6
            goto L_0x0af3
        L_0x00f8:
            android.util.SparseArray<i5.e$c> r0 = r7.f19174c
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0107
            d5.k r0 = r7.f19172a0
            r0.d()
            goto L_0x0af3
        L_0x0107:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "No valid tracks were found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x010f:
            long r0 = r7.f19189r
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f19189r = r0
        L_0x011a:
            long r0 = r7.f19190s
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0af3
            long r0 = r7.n(r0)
            r7.f19191t = r0
            goto L_0x0af3
        L_0x0128:
            r19.c(r20)
            i5.e$c r0 = r7.f19192u
            boolean r1 = r0.f19206h
            if (r1 == 0) goto L_0x0af3
            byte[] r0 = r0.f19207i
            if (r0 != 0) goto L_0x0137
            goto L_0x0af3
        L_0x0137:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Combining encryption and compression is not supported"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x013f:
            r19.c(r20)
            i5.e$c r0 = r7.f19192u
            boolean r1 = r0.f19206h
            if (r1 == 0) goto L_0x0af3
            d5.a0$a r1 = r0.f19208j
            if (r1 == 0) goto L_0x0164
            c5.f r3 = new c5.f
            c5.f$b[] r4 = new c5.f.b[r5]
            c5.f$b r8 = new c5.f$b
            java.util.UUID r9 = x4.f.f27566a
            byte[] r1 = r1.f12997b
            java.lang.String r10 = "video/webm"
            r8.<init>(r9, r6, r10, r1)
            r4[r2] = r8
            r3.<init>(r6, r5, r4)
            r0.f19210l = r3
            goto L_0x0af3
        L_0x0164:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Encrypted Track found but ContentEncKeyID was not found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x016c:
            int r0 = r7.f19194w
            if (r0 == r4) goto L_0x017e
            long r1 = r7.f19195x
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x017e
            if (r0 != r3) goto L_0x0af3
            r7.f19197z = r1
            goto L_0x0af3
        L_0x017e:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Mandatory element SeekID or SeekPosition not found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0186:
            i5.e$c r0 = r7.f19192u
            v6.a.f(r0)
            java.lang.String r2 = r0.f19200b
            if (r2 == 0) goto L_0x0a95
            int r3 = r2.hashCode()
            java.lang.String r4 = "A_MS/ACM"
            java.lang.String r5 = "V_MPEG4/ISO/SP"
            java.lang.String r6 = "V_MPEG4/ISO/AP"
            java.lang.String r8 = "V_MS/VFW/FOURCC"
            java.lang.String r9 = "A_MPEG/L3"
            java.lang.String r10 = "A_MPEG/L2"
            java.lang.String r11 = "A_VORBIS"
            java.lang.String r12 = "A_TRUEHD"
            r15 = 8
            r16 = 17
            r13 = 3
            switch(r3) {
                case -2095576542: goto L_0x033a;
                case -2095575984: goto L_0x0331;
                case -1985379776: goto L_0x0328;
                case -1784763192: goto L_0x031f;
                case -1730367663: goto L_0x0316;
                case -1482641358: goto L_0x030d;
                case -1482641357: goto L_0x0304;
                case -1373388978: goto L_0x02fb;
                case -933872740: goto L_0x02ef;
                case -538363189: goto L_0x02e1;
                case -538363109: goto L_0x02d3;
                case -425012669: goto L_0x02c5;
                case -356037306: goto L_0x02b7;
                case 62923557: goto L_0x02a9;
                case 62923603: goto L_0x029b;
                case 62927045: goto L_0x028d;
                case 82318131: goto L_0x027f;
                case 82338133: goto L_0x0271;
                case 82338134: goto L_0x0263;
                case 99146302: goto L_0x0255;
                case 444813526: goto L_0x0247;
                case 542569478: goto L_0x0239;
                case 635596514: goto L_0x022b;
                case 725948237: goto L_0x021d;
                case 725957860: goto L_0x020f;
                case 738597099: goto L_0x0201;
                case 855502857: goto L_0x01f3;
                case 1422270023: goto L_0x01e5;
                case 1809237540: goto L_0x01d7;
                case 1950749482: goto L_0x01c9;
                case 1950789798: goto L_0x01bb;
                case 1951062397: goto L_0x01ad;
                default: goto L_0x01ab;
            }
        L_0x01ab:
            goto L_0x0343
        L_0x01ad:
            java.lang.String r3 = "A_OPUS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01b7
            goto L_0x0343
        L_0x01b7:
            r2 = 31
            goto L_0x0344
        L_0x01bb:
            java.lang.String r3 = "A_FLAC"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01c5
            goto L_0x0343
        L_0x01c5:
            r2 = 30
            goto L_0x0344
        L_0x01c9:
            java.lang.String r3 = "A_EAC3"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01d3
            goto L_0x0343
        L_0x01d3:
            r2 = 29
            goto L_0x0344
        L_0x01d7:
            java.lang.String r3 = "V_MPEG2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01e1
            goto L_0x0343
        L_0x01e1:
            r2 = 28
            goto L_0x0344
        L_0x01e5:
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01ef
            goto L_0x0343
        L_0x01ef:
            r2 = 27
            goto L_0x0344
        L_0x01f3:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01fd
            goto L_0x0343
        L_0x01fd:
            r2 = 26
            goto L_0x0344
        L_0x0201:
            java.lang.String r3 = "S_TEXT/ASS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x020b
            goto L_0x0343
        L_0x020b:
            r2 = 25
            goto L_0x0344
        L_0x020f:
            java.lang.String r3 = "A_PCM/INT/LIT"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0219
            goto L_0x0343
        L_0x0219:
            r2 = 24
            goto L_0x0344
        L_0x021d:
            java.lang.String r3 = "A_PCM/INT/BIG"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0227
            goto L_0x0343
        L_0x0227:
            r2 = 23
            goto L_0x0344
        L_0x022b:
            java.lang.String r3 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0235
            goto L_0x0343
        L_0x0235:
            r2 = 22
            goto L_0x0344
        L_0x0239:
            java.lang.String r3 = "A_DTS/EXPRESS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0243
            goto L_0x0343
        L_0x0243:
            r2 = 21
            goto L_0x0344
        L_0x0247:
            java.lang.String r3 = "V_THEORA"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0251
            goto L_0x0343
        L_0x0251:
            r2 = 20
            goto L_0x0344
        L_0x0255:
            java.lang.String r3 = "S_HDMV/PGS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x025f
            goto L_0x0343
        L_0x025f:
            r2 = 19
            goto L_0x0344
        L_0x0263:
            java.lang.String r3 = "V_VP9"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x026d
            goto L_0x0343
        L_0x026d:
            r2 = 18
            goto L_0x0344
        L_0x0271:
            java.lang.String r3 = "V_VP8"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x027b
            goto L_0x0343
        L_0x027b:
            r2 = 17
            goto L_0x0344
        L_0x027f:
            java.lang.String r3 = "V_AV1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0289
            goto L_0x0343
        L_0x0289:
            r2 = 16
            goto L_0x0344
        L_0x028d:
            java.lang.String r3 = "A_DTS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0297
            goto L_0x0343
        L_0x0297:
            r2 = 15
            goto L_0x0344
        L_0x029b:
            java.lang.String r3 = "A_AC3"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02a5
            goto L_0x0343
        L_0x02a5:
            r2 = 14
            goto L_0x0344
        L_0x02a9:
            java.lang.String r3 = "A_AAC"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02b3
            goto L_0x0343
        L_0x02b3:
            r2 = 13
            goto L_0x0344
        L_0x02b7:
            java.lang.String r3 = "A_DTS/LOSSLESS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02c1
            goto L_0x0343
        L_0x02c1:
            r2 = 12
            goto L_0x0344
        L_0x02c5:
            java.lang.String r3 = "S_VOBSUB"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02cf
            goto L_0x0343
        L_0x02cf:
            r2 = 11
            goto L_0x0344
        L_0x02d3:
            java.lang.String r3 = "V_MPEG4/ISO/AVC"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02dd
            goto L_0x0343
        L_0x02dd:
            r2 = 10
            goto L_0x0344
        L_0x02e1:
            java.lang.String r3 = "V_MPEG4/ISO/ASP"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02eb
            goto L_0x0343
        L_0x02eb:
            r2 = 9
            goto L_0x0344
        L_0x02ef:
            java.lang.String r3 = "S_DVBSUB"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02f8
            goto L_0x0343
        L_0x02f8:
            r2 = 8
            goto L_0x0344
        L_0x02fb:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0302
            goto L_0x0343
        L_0x0302:
            r2 = 7
            goto L_0x0344
        L_0x0304:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x030b
            goto L_0x0343
        L_0x030b:
            r2 = 6
            goto L_0x0344
        L_0x030d:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x0314
            goto L_0x0343
        L_0x0314:
            r2 = 5
            goto L_0x0344
        L_0x0316:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x031d
            goto L_0x0343
        L_0x031d:
            r2 = 4
            goto L_0x0344
        L_0x031f:
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x0326
            goto L_0x0343
        L_0x0326:
            r2 = 3
            goto L_0x0344
        L_0x0328:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x032f
            goto L_0x0343
        L_0x032f:
            r2 = 2
            goto L_0x0344
        L_0x0331:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0338
            goto L_0x0343
        L_0x0338:
            r2 = 1
            goto L_0x0344
        L_0x033a:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0341
            goto L_0x0343
        L_0x0341:
            r2 = 0
            goto L_0x0344
        L_0x0343:
            r2 = -1
        L_0x0344:
            switch(r2) {
                case 0: goto L_0x0349;
                case 1: goto L_0x0349;
                case 2: goto L_0x0349;
                case 3: goto L_0x0349;
                case 4: goto L_0x0349;
                case 5: goto L_0x0349;
                case 6: goto L_0x0349;
                case 7: goto L_0x0349;
                case 8: goto L_0x0349;
                case 9: goto L_0x0349;
                case 10: goto L_0x0349;
                case 11: goto L_0x0349;
                case 12: goto L_0x0349;
                case 13: goto L_0x0349;
                case 14: goto L_0x0349;
                case 15: goto L_0x0349;
                case 16: goto L_0x0349;
                case 17: goto L_0x0349;
                case 18: goto L_0x0349;
                case 19: goto L_0x0349;
                case 20: goto L_0x0349;
                case 21: goto L_0x0349;
                case 22: goto L_0x0349;
                case 23: goto L_0x0349;
                case 24: goto L_0x0349;
                case 25: goto L_0x0349;
                case 26: goto L_0x0349;
                case 27: goto L_0x0349;
                case 28: goto L_0x0349;
                case 29: goto L_0x0349;
                case 30: goto L_0x0349;
                case 31: goto L_0x0349;
                default: goto L_0x0347;
            }
        L_0x0347:
            r2 = 0
            goto L_0x034a
        L_0x0349:
            r2 = 1
        L_0x034a:
            if (r2 == 0) goto L_0x0a91
            d5.k r2 = r7.f19172a0
            int r3 = r0.f19201c
            java.lang.String r14 = r0.f19200b
            r14.getClass()
            int r17 = r14.hashCode()
            switch(r17) {
                case -2095576542: goto L_0x04eb;
                case -2095575984: goto L_0x04e2;
                case -1985379776: goto L_0x04d9;
                case -1784763192: goto L_0x04d0;
                case -1730367663: goto L_0x04c7;
                case -1482641358: goto L_0x04be;
                case -1482641357: goto L_0x04b5;
                case -1373388978: goto L_0x04ac;
                case -933872740: goto L_0x04a0;
                case -538363189: goto L_0x0492;
                case -538363109: goto L_0x0484;
                case -425012669: goto L_0x0476;
                case -356037306: goto L_0x0468;
                case 62923557: goto L_0x045a;
                case 62923603: goto L_0x044c;
                case 62927045: goto L_0x043e;
                case 82318131: goto L_0x0430;
                case 82338133: goto L_0x0422;
                case 82338134: goto L_0x0414;
                case 99146302: goto L_0x0406;
                case 444813526: goto L_0x03f8;
                case 542569478: goto L_0x03ea;
                case 635596514: goto L_0x03dc;
                case 725948237: goto L_0x03ce;
                case 725957860: goto L_0x03c0;
                case 738597099: goto L_0x03b2;
                case 855502857: goto L_0x03a4;
                case 1422270023: goto L_0x0396;
                case 1809237540: goto L_0x0388;
                case 1950749482: goto L_0x037a;
                case 1950789798: goto L_0x036c;
                case 1951062397: goto L_0x035e;
                default: goto L_0x035c;
            }
        L_0x035c:
            goto L_0x04f4
        L_0x035e:
            java.lang.String r4 = "A_OPUS"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0368
            goto L_0x04f4
        L_0x0368:
            r4 = 31
            goto L_0x04f5
        L_0x036c:
            java.lang.String r4 = "A_FLAC"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0376
            goto L_0x04f4
        L_0x0376:
            r4 = 30
            goto L_0x04f5
        L_0x037a:
            java.lang.String r4 = "A_EAC3"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0384
            goto L_0x04f4
        L_0x0384:
            r4 = 29
            goto L_0x04f5
        L_0x0388:
            java.lang.String r4 = "V_MPEG2"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0392
            goto L_0x04f4
        L_0x0392:
            r4 = 28
            goto L_0x04f5
        L_0x0396:
            java.lang.String r4 = "S_TEXT/UTF8"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03a0
            goto L_0x04f4
        L_0x03a0:
            r4 = 27
            goto L_0x04f5
        L_0x03a4:
            java.lang.String r4 = "V_MPEGH/ISO/HEVC"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03ae
            goto L_0x04f4
        L_0x03ae:
            r4 = 26
            goto L_0x04f5
        L_0x03b2:
            java.lang.String r4 = "S_TEXT/ASS"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03bc
            goto L_0x04f4
        L_0x03bc:
            r4 = 25
            goto L_0x04f5
        L_0x03c0:
            java.lang.String r4 = "A_PCM/INT/LIT"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03ca
            goto L_0x04f4
        L_0x03ca:
            r4 = 24
            goto L_0x04f5
        L_0x03ce:
            java.lang.String r4 = "A_PCM/INT/BIG"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03d8
            goto L_0x04f4
        L_0x03d8:
            r4 = 23
            goto L_0x04f5
        L_0x03dc:
            java.lang.String r4 = "A_PCM/FLOAT/IEEE"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03e6
            goto L_0x04f4
        L_0x03e6:
            r4 = 22
            goto L_0x04f5
        L_0x03ea:
            java.lang.String r4 = "A_DTS/EXPRESS"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x03f4
            goto L_0x04f4
        L_0x03f4:
            r4 = 21
            goto L_0x04f5
        L_0x03f8:
            java.lang.String r4 = "V_THEORA"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0402
            goto L_0x04f4
        L_0x0402:
            r4 = 20
            goto L_0x04f5
        L_0x0406:
            java.lang.String r4 = "S_HDMV/PGS"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0410
            goto L_0x04f4
        L_0x0410:
            r4 = 19
            goto L_0x04f5
        L_0x0414:
            java.lang.String r4 = "V_VP9"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x041e
            goto L_0x04f4
        L_0x041e:
            r4 = 18
            goto L_0x04f5
        L_0x0422:
            java.lang.String r4 = "V_VP8"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x042c
            goto L_0x04f4
        L_0x042c:
            r4 = 17
            goto L_0x04f5
        L_0x0430:
            java.lang.String r4 = "V_AV1"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x043a
            goto L_0x04f4
        L_0x043a:
            r4 = 16
            goto L_0x04f5
        L_0x043e:
            java.lang.String r4 = "A_DTS"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0448
            goto L_0x04f4
        L_0x0448:
            r4 = 15
            goto L_0x04f5
        L_0x044c:
            java.lang.String r4 = "A_AC3"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0456
            goto L_0x04f4
        L_0x0456:
            r4 = 14
            goto L_0x04f5
        L_0x045a:
            java.lang.String r4 = "A_AAC"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0464
            goto L_0x04f4
        L_0x0464:
            r4 = 13
            goto L_0x04f5
        L_0x0468:
            java.lang.String r4 = "A_DTS/LOSSLESS"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0472
            goto L_0x04f4
        L_0x0472:
            r4 = 12
            goto L_0x04f5
        L_0x0476:
            java.lang.String r4 = "S_VOBSUB"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x0480
            goto L_0x04f4
        L_0x0480:
            r4 = 11
            goto L_0x04f5
        L_0x0484:
            java.lang.String r4 = "V_MPEG4/ISO/AVC"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x048e
            goto L_0x04f4
        L_0x048e:
            r4 = 10
            goto L_0x04f5
        L_0x0492:
            java.lang.String r4 = "V_MPEG4/ISO/ASP"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x049c
            goto L_0x04f4
        L_0x049c:
            r4 = 9
            goto L_0x04f5
        L_0x04a0:
            java.lang.String r4 = "S_DVBSUB"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x04a9
            goto L_0x04f4
        L_0x04a9:
            r4 = 8
            goto L_0x04f5
        L_0x04ac:
            boolean r4 = r14.equals(r8)
            if (r4 != 0) goto L_0x04b3
            goto L_0x04f4
        L_0x04b3:
            r4 = 7
            goto L_0x04f5
        L_0x04b5:
            boolean r4 = r14.equals(r9)
            if (r4 != 0) goto L_0x04bc
            goto L_0x04f4
        L_0x04bc:
            r4 = 6
            goto L_0x04f5
        L_0x04be:
            boolean r4 = r14.equals(r10)
            if (r4 != 0) goto L_0x04c5
            goto L_0x04f4
        L_0x04c5:
            r4 = 5
            goto L_0x04f5
        L_0x04c7:
            boolean r4 = r14.equals(r11)
            if (r4 != 0) goto L_0x04ce
            goto L_0x04f4
        L_0x04ce:
            r4 = 4
            goto L_0x04f5
        L_0x04d0:
            boolean r4 = r14.equals(r12)
            if (r4 != 0) goto L_0x04d7
            goto L_0x04f4
        L_0x04d7:
            r4 = 3
            goto L_0x04f5
        L_0x04d9:
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x04e0
            goto L_0x04f4
        L_0x04e0:
            r4 = 2
            goto L_0x04f5
        L_0x04e2:
            boolean r4 = r14.equals(r5)
            if (r4 != 0) goto L_0x04e9
            goto L_0x04f4
        L_0x04e9:
            r4 = 1
            goto L_0x04f5
        L_0x04eb:
            boolean r4 = r14.equals(r6)
            if (r4 != 0) goto L_0x04f2
            goto L_0x04f4
        L_0x04f2:
            r4 = 0
            goto L_0x04f5
        L_0x04f4:
            r4 = -1
        L_0x04f5:
            java.lang.String r5 = "video/x-unknown"
            java.lang.String r6 = ". Setting mimeType to "
            java.lang.String r8 = "audio/x-unknown"
            java.lang.String r9 = "MatroskaExtractor"
            java.lang.String r10 = "audio/raw"
            switch(r4) {
                case 0: goto L_0x0841;
                case 1: goto L_0x0841;
                case 2: goto L_0x07d2;
                case 3: goto L_0x07c2;
                case 4: goto L_0x073f;
                case 5: goto L_0x0731;
                case 6: goto L_0x072e;
                case 7: goto L_0x0679;
                case 8: goto L_0x0664;
                case 9: goto L_0x0841;
                case 10: goto L_0x0649;
                case 11: goto L_0x063b;
                case 12: goto L_0x0634;
                case 13: goto L_0x0616;
                case 14: goto L_0x0613;
                case 15: goto L_0x0610;
                case 16: goto L_0x060d;
                case 17: goto L_0x060a;
                case 18: goto L_0x0607;
                case 19: goto L_0x0604;
                case 20: goto L_0x0636;
                case 21: goto L_0x0610;
                case 22: goto L_0x05e1;
                case 23: goto L_0x05bb;
                case 24: goto L_0x0599;
                case 25: goto L_0x057f;
                case 26: goto L_0x0564;
                case 27: goto L_0x0560;
                case 28: goto L_0x055c;
                case 29: goto L_0x0558;
                case 30: goto L_0x054a;
                case 31: goto L_0x050a;
                default: goto L_0x0502;
            }
        L_0x0502:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Unrecognized codec identifier."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x050a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            java.lang.String r4 = r0.f19200b
            byte[] r4 = r0.a(r4)
            r1.add(r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r15)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r5)
            long r8 = r0.R
            java.nio.ByteBuffer r4 = r4.putLong(r8)
            byte[] r4 = r4.array()
            r1.add(r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r15)
            java.nio.ByteBuffer r4 = r4.order(r5)
            long r5 = r0.S
            java.nio.ByteBuffer r4 = r4.putLong(r5)
            byte[] r4 = r4.array()
            r1.add(r4)
            r4 = 5760(0x1680, float:8.071E-42)
            java.lang.String r5 = "audio/opus"
            goto L_0x0737
        L_0x054a:
            java.lang.String r1 = r0.f19200b
            byte[] r1 = r0.a(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r4 = "audio/flac"
            goto L_0x0721
        L_0x0558:
            java.lang.String r5 = "audio/eac3"
            goto L_0x0636
        L_0x055c:
            java.lang.String r5 = "video/mpeg2"
            goto L_0x0636
        L_0x0560:
            java.lang.String r5 = "application/x-subrip"
            goto L_0x0636
        L_0x0564:
            v6.v r1 = new v6.v
            java.lang.String r4 = r0.f19200b
            byte[] r4 = r0.a(r4)
            r1.<init>((byte[]) r4)
            w6.f r1 = w6.f.a(r1)
            java.util.List<byte[]> r4 = r1.f27053a
            int r5 = r1.f27054b
            r0.Y = r5
            java.lang.String r1 = r1.f27055c
            java.lang.String r5 = "video/hevc"
            goto L_0x0850
        L_0x057f:
            byte[] r4 = f19167c0
            java.lang.String r5 = r0.f19200b
            byte[] r5 = r0.a(r5)
            ba.a<java.lang.Object> r6 = ba.s.f3795b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6 = 0
            r1[r6] = r4
            r4 = 1
            r1[r4] = r5
            ba.s r1 = ba.s.y(r1)
            java.lang.String r4 = "text/x-ssa"
            goto L_0x0721
        L_0x0599:
            int r1 = r0.P
            int r1 = v6.e0.x(r1)
            if (r1 != 0) goto L_0x05e8
            java.lang.String r1 = "Unsupported little endian PCM bit depth: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            int r4 = r0.P
            r1.append(r4)
            r1.append(r6)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
            goto L_0x0637
        L_0x05bb:
            int r1 = r0.P
            if (r1 != r15) goto L_0x05c1
            r1 = 3
            goto L_0x05e8
        L_0x05c1:
            r4 = 16
            if (r1 != r4) goto L_0x05c8
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x05e8
        L_0x05c8:
            java.lang.String r1 = "Unsupported big endian PCM bit depth: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            int r4 = r0.P
            r1.append(r4)
            r1.append(r6)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
            goto L_0x0637
        L_0x05e1:
            int r1 = r0.P
            r4 = 32
            if (r1 != r4) goto L_0x05eb
            r1 = 4
        L_0x05e8:
            r4 = -1
            goto L_0x082f
        L_0x05eb:
            java.lang.String r1 = "Unsupported floating point PCM bit depth: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            int r4 = r0.P
            r1.append(r4)
            r1.append(r6)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
            goto L_0x0637
        L_0x0604:
            java.lang.String r5 = "application/pgs"
            goto L_0x0636
        L_0x0607:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            goto L_0x0636
        L_0x060a:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            goto L_0x0636
        L_0x060d:
            java.lang.String r5 = "video/av01"
            goto L_0x0636
        L_0x0610:
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x0636
        L_0x0613:
            java.lang.String r5 = "audio/ac3"
            goto L_0x0636
        L_0x0616:
            java.lang.String r1 = r0.f19200b
            byte[] r1 = r0.a(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r4 = r0.f19209k
            z4.a$b r4 = z4.a.e(r4)
            int r5 = r4.f28280a
            r0.Q = r5
            int r5 = r4.f28281b
            r0.O = r5
            java.lang.String r4 = r4.f28282c
            java.lang.String r5 = "audio/mp4a-latm"
            goto L_0x0723
        L_0x0634:
            java.lang.String r5 = "audio/vnd.dts.hd"
        L_0x0636:
            r8 = r5
        L_0x0637:
            r1 = 0
            r5 = r8
            goto L_0x0722
        L_0x063b:
            java.lang.String r1 = r0.f19200b
            byte[] r1 = r0.a(r1)
            ba.s r1 = ba.s.C(r1)
            java.lang.String r4 = "application/vobsub"
            goto L_0x0721
        L_0x0649:
            v6.v r1 = new v6.v
            java.lang.String r4 = r0.f19200b
            byte[] r4 = r0.a(r4)
            r1.<init>((byte[]) r4)
            w6.a r1 = w6.a.b(r1)
            java.util.List<byte[]> r4 = r1.f27017a
            int r5 = r1.f27018b
            r0.Y = r5
            java.lang.String r1 = r1.f27022f
            java.lang.String r5 = "video/avc"
            goto L_0x0850
        L_0x0664:
            r1 = 4
            byte[] r4 = new byte[r1]
            java.lang.String r5 = r0.f19200b
            byte[] r5 = r0.a(r5)
            r6 = 0
            java.lang.System.arraycopy(r5, r6, r4, r6, r1)
            ba.s r1 = ba.s.C(r4)
            java.lang.String r4 = "application/dvbsubs"
            goto L_0x0721
        L_0x0679:
            java.lang.String r1 = r0.f19200b
            byte[] r1 = r0.a(r1)
            int r4 = r1.length
            r6 = 16
            if (r6 > r4) goto L_0x0686
            r4 = 1
            goto L_0x0687
        L_0x0686:
            r4 = 0
        L_0x0687:
            v6.a.a(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            byte r4 = r1[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r10 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            r12 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r12
            byte r4 = r1[r16]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r6 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r6 = r6 & r12
            long r6 = r6 << r15
            long r6 = r6 | r10
            r4 = 18
            byte r4 = r1[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r10 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r10 = r10 & r12
            r4 = 16
            long r10 = r10 << r4
            long r6 = r6 | r10
            r4 = 19
            byte r4 = r1[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r10 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            long r10 = r10 & r12
            r4 = 24
            long r10 = r10 << r4
            long r6 = r6 | r10
            r10 = 1482049860(0x58564944, double:7.322299212E-315)
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x06ba
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            java.lang.String r4 = "video/divx"
            r5 = 0
            r1.<init>(r4, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            goto L_0x0719
        L_0x06ba:
            r10 = 859189832(0x33363248, double:4.244961792E-315)
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x06ca
            android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            java.lang.String r4 = "video/3gpp"
            r5 = 0
            r1.<init>(r4, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            goto L_0x0719
        L_0x06ca:
            r10 = 826496599(0x31435657, double:4.08343576E-315)
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x070e
            r4 = 40
        L_0x06d3:
            int r5 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            int r5 = r5 + -4
            if (r4 >= r5) goto L_0x0706
            byte r5 = r1[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            if (r5 != 0) goto L_0x0703
            int r5 = r4 + 1
            byte r5 = r1[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            if (r5 != 0) goto L_0x0703
            int r5 = r4 + 2
            byte r5 = r1[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            r6 = 1
            if (r5 != r6) goto L_0x0703
            int r5 = r4 + 3
            byte r5 = r1[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            r6 = 15
            if (r5 != r6) goto L_0x0703
            int r5 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r4, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            android.util.Pair r4 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            java.lang.String r5 = "video/wvc1"
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            r4.<init>(r5, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            r1 = r4
            goto L_0x0719
        L_0x0703:
            int r4 = r4 + 1
            goto L_0x06d3
        L_0x0706:
            x4.m0 r0 = new x4.m0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            java.lang.String r1 = "Failed to find FourCC VC1 initialization data"
            r0.<init>((java.lang.String) r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0726 }
        L_0x070e:
            java.lang.String r1 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r9, r1)
            android.util.Pair r1 = new android.util.Pair
            r4 = 0
            r1.<init>(r5, r4)
        L_0x0719:
            java.lang.Object r4 = r1.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0721:
            r5 = r4
        L_0x0722:
            r4 = 0
        L_0x0723:
            r6 = -1
            goto L_0x07cf
        L_0x0726:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Error parsing FourCC private data"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x072e:
            java.lang.String r1 = "audio/mpeg"
            goto L_0x0733
        L_0x0731:
            java.lang.String r1 = "audio/mpeg-L2"
        L_0x0733:
            r5 = r1
            r4 = 4096(0x1000, float:5.74E-42)
            r1 = 0
        L_0x0737:
            r6 = 0
            r18 = r6
            r6 = r4
            r4 = r18
            goto L_0x07cf
        L_0x073f:
            java.lang.String r4 = r0.f19200b
            byte[] r4 = r0.a(r4)
            java.lang.String r5 = "Error parsing vorbis codec private"
            r6 = 0
            byte r6 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            if (r6 != r1) goto L_0x07b6
            r6 = 1
            r7 = 0
        L_0x074e:
            byte r8 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r9 = 255(0xff, float:3.57E-43)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x075a
            int r7 = r7 + 255
            int r6 = r6 + 1
            goto L_0x074e
        L_0x075a:
            int r8 = r6 + 1
            byte r6 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r6 = r6 & r9
            int r7 = r7 + r6
            r6 = 0
        L_0x0761:
            byte r10 = r4[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r10 = r10 & r9
            if (r10 != r9) goto L_0x076b
            int r6 = r6 + 255
            int r8 = r8 + 1
            goto L_0x0761
        L_0x076b:
            int r10 = r8 + 1
            byte r8 = r4[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r8 = r8 & r9
            int r6 = r6 + r8
            byte r8 = r4[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r9 = 1
            if (r8 != r9) goto L_0x07b0
            byte[] r8 = new byte[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r9 = 0
            java.lang.System.arraycopy(r4, r10, r8, r9, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            int r10 = r10 + r7
            byte r7 = r4[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            if (r7 != r13) goto L_0x07aa
            int r10 = r10 + r6
            byte r6 = r4[r10]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r7 = 5
            if (r6 != r7) goto L_0x07a4
            int r6 = r4.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            int r6 = r6 - r10
            byte[] r6 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            int r7 = r4.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            int r7 = r7 - r10
            r9 = 0
            java.lang.System.arraycopy(r4, r10, r6, r9, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r4.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r4.add(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r4.add(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r5 = "audio/vorbis"
            r1 = r4
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07ce
        L_0x07a4:
            x4.m0 r0 = new x4.m0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r0.<init>((java.lang.String) r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
        L_0x07aa:
            x4.m0 r0 = new x4.m0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r0.<init>((java.lang.String) r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
        L_0x07b0:
            x4.m0 r0 = new x4.m0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r0.<init>((java.lang.String) r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
        L_0x07b6:
            x4.m0 r0 = new x4.m0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            r0.<init>((java.lang.String) r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07bc }
        L_0x07bc:
            x4.m0 r0 = new x4.m0
            r0.<init>((java.lang.String) r5)
            throw r0
        L_0x07c2:
            i5.e$d r1 = new i5.e$d
            r1.<init>()
            r0.T = r1
            java.lang.String r5 = "audio/true-hd"
            r1 = 0
            r4 = -1
            r6 = -1
        L_0x07ce:
            r4 = 0
        L_0x07cf:
            r10 = r5
            goto L_0x0857
        L_0x07d2:
            v6.v r1 = new v6.v
            java.lang.String r4 = r0.f19200b
            byte[] r4 = r0.a(r4)
            r1.<init>((byte[]) r4)
            int r4 = r1.l()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            r5 = 1
            if (r4 != r5) goto L_0x07e5
            goto L_0x0809
        L_0x07e5:
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r4 != r5) goto L_0x080b
            r4 = 24
            r1.D(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            long r4 = r1.m()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            java.util.UUID r7 = f19169e0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            long r11 = r7.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x080b
            long r4 = r1.m()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            long r11 = r7.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0839 }
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x080b
        L_0x0809:
            r1 = 1
            goto L_0x080c
        L_0x080b:
            r1 = 0
        L_0x080c:
            if (r1 == 0) goto L_0x0832
            int r1 = r0.P
            int r1 = v6.e0.x(r1)
            if (r1 != 0) goto L_0x05e8
            java.lang.String r1 = "Unsupported PCM bit depth: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            int r4 = r0.P
            r1.append(r4)
            r1.append(r6)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
            goto L_0x0837
        L_0x082f:
            r5 = 0
            r6 = 0
            goto L_0x085f
        L_0x0832:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            android.util.Log.w(r9, r1)
        L_0x0837:
            r1 = 0
            goto L_0x084d
        L_0x0839:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Error parsing MS/ACM codec private"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0841:
            byte[] r1 = r0.f19209k
            if (r1 != 0) goto L_0x0847
            r1 = 0
            goto L_0x084b
        L_0x0847:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x084b:
            java.lang.String r8 = "video/mp4v-es"
        L_0x084d:
            r4 = r1
            r1 = 0
            r5 = r8
        L_0x0850:
            r6 = -1
            r10 = r5
            r18 = r4
            r4 = r1
            r1 = r18
        L_0x0857:
            r5 = -1
            r5 = r1
            r1 = -1
            r18 = r6
            r6 = r4
            r4 = r18
        L_0x085f:
            byte[] r7 = r0.N
            if (r7 == 0) goto L_0x0874
            v6.v r8 = new v6.v
            r8.<init>((byte[]) r7)
            w6.c r7 = w6.c.e(r8)
            if (r7 == 0) goto L_0x0874
            java.lang.Object r6 = r7.f27030c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r10 = "video/dolby-vision"
        L_0x0874:
            boolean r7 = r0.V
            r7 = r7 | 0
            boolean r8 = r0.U
            if (r8 == 0) goto L_0x087e
            r8 = 2
            goto L_0x087f
        L_0x087e:
            r8 = 0
        L_0x087f:
            r7 = r7 | r8
            x4.b0$b r8 = new x4.b0$b
            r8.<init>()
            boolean r9 = v6.s.k(r10)
            if (r9 == 0) goto L_0x0898
            int r9 = r0.O
            r8.f27438x = r9
            int r9 = r0.Q
            r8.f27439y = r9
            r8.f27440z = r1
            r1 = 1
            goto L_0x0a54
        L_0x0898:
            boolean r1 = v6.s.m(r10)
            if (r1 == 0) goto L_0x0a22
            int r1 = r0.f19215q
            if (r1 != 0) goto L_0x08b4
            int r1 = r0.f19213o
            r9 = -1
            if (r1 != r9) goto L_0x08a9
            int r1 = r0.f19211m
        L_0x08a9:
            r0.f19213o = r1
            int r1 = r0.f19214p
            if (r1 != r9) goto L_0x08b1
            int r1 = r0.f19212n
        L_0x08b1:
            r0.f19214p = r1
            goto L_0x08b5
        L_0x08b4:
            r9 = -1
        L_0x08b5:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = r0.f19213o
            if (r11 == r9) goto L_0x08ca
            int r12 = r0.f19214p
            if (r12 == r9) goto L_0x08ca
            int r1 = r0.f19212n
            int r1 = r1 * r11
            float r1 = (float) r1
            int r9 = r0.f19211m
            int r9 = r9 * r12
            float r9 = (float) r9
            float r1 = r1 / r9
        L_0x08ca:
            boolean r9 = r0.f19222x
            if (r9 == 0) goto L_0x099f
            float r9 = r0.D
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.E
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.F
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.G
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.H
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.I
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.J
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.K
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.L
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0992
            float r9 = r0.M
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x090e
            goto L_0x0992
        L_0x090e:
            r9 = 25
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r9)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r11 = r11.order(r12)
            r12 = 0
            r11.put(r12)
            float r12 = r0.D
            r13 = 1195593728(0x47435000, float:50000.0)
            float r12 = r12 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.E
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.F
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.G
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.H
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.I
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.J
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.K
            float r12 = r12 * r13
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.L
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            float r12 = r0.M
            float r12 = r12 + r14
            int r12 = (int) r12
            short r12 = (short) r12
            r11.putShort(r12)
            int r12 = r0.B
            short r12 = (short) r12
            r11.putShort(r12)
            int r12 = r0.C
            short r12 = (short) r12
            r11.putShort(r12)
            goto L_0x0993
        L_0x0992:
            r9 = 0
        L_0x0993:
            w6.b r11 = new w6.b
            int r12 = r0.f19223y
            int r13 = r0.A
            int r14 = r0.f19224z
            r11.<init>(r12, r13, r14, r9)
            goto L_0x09a0
        L_0x099f:
            r11 = 0
        L_0x09a0:
            java.lang.String r9 = r0.f19199a
            if (r9 == 0) goto L_0x09b9
            java.util.Map<java.lang.String, java.lang.Integer> r12 = f19170f0
            boolean r9 = r12.containsKey(r9)
            if (r9 == 0) goto L_0x09b9
            java.lang.String r9 = r0.f19199a
            java.lang.Object r9 = r12.get(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            goto L_0x09ba
        L_0x09b9:
            r9 = -1
        L_0x09ba:
            int r12 = r0.f19216r
            if (r12 != 0) goto L_0x0a0a
            float r12 = r0.f19217s
            r13 = 0
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 != 0) goto L_0x0a0a
            float r12 = r0.f19218t
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 != 0) goto L_0x0a0a
            float r12 = r0.f19219u
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 != 0) goto L_0x09d9
            r9 = 0
            goto L_0x0a0a
        L_0x09d9:
            float r12 = r0.f19218t
            r13 = 1119092736(0x42b40000, float:90.0)
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 != 0) goto L_0x09e6
            r9 = 90
            goto L_0x0a0a
        L_0x09e6:
            float r12 = r0.f19218t
            r13 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 == 0) goto L_0x0a08
            float r12 = r0.f19218t
            r13 = 1127481344(0x43340000, float:180.0)
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 != 0) goto L_0x09fb
            goto L_0x0a08
        L_0x09fb:
            float r12 = r0.f19218t
            r13 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r12 = java.lang.Float.compare(r12, r13)
            if (r12 != 0) goto L_0x0a0a
            r9 = 270(0x10e, float:3.78E-43)
            goto L_0x0a0a
        L_0x0a08:
            r9 = 180(0xb4, float:2.52E-43)
        L_0x0a0a:
            int r12 = r0.f19211m
            r8.f27430p = r12
            int r12 = r0.f19212n
            r8.f27431q = r12
            r8.f27434t = r1
            r8.f27433s = r9
            byte[] r1 = r0.f19220v
            r8.f27435u = r1
            int r1 = r0.f19221w
            r8.f27436v = r1
            r8.f27437w = r11
            r1 = 2
            goto L_0x0a54
        L_0x0a22:
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0a53
            java.lang.String r1 = "text/x-ssa"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0a53
            java.lang.String r1 = "application/vobsub"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0a53
            java.lang.String r1 = "application/pgs"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x0a53
            java.lang.String r1 = "application/dvbsubs"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0a4b
            goto L_0x0a53
        L_0x0a4b:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Unexpected MIME type."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a53:
            r1 = 3
        L_0x0a54:
            java.lang.String r9 = r0.f19199a
            if (r9 == 0) goto L_0x0a64
            java.util.Map<java.lang.String, java.lang.Integer> r11 = f19170f0
            boolean r9 = r11.containsKey(r9)
            if (r9 != 0) goto L_0x0a64
            java.lang.String r9 = r0.f19199a
            r8.f27416b = r9
        L_0x0a64:
            r8.b(r3)
            r8.f27425k = r10
            r8.f27426l = r4
            java.lang.String r3 = r0.W
            r8.f27417c = r3
            r8.f27418d = r7
            r8.f27427m = r5
            r8.f27422h = r6
            c5.f r3 = r0.f19210l
            r8.f27428n = r3
            x4.b0 r3 = r8.a()
            int r4 = r0.f19201c
            d5.a0 r1 = r2.l(r4, r1)
            r0.X = r1
            r1.c(r3)
            r7 = r19
            android.util.SparseArray<i5.e$c> r1 = r7.f19174c
            int r2 = r0.f19201c
            r1.put(r2, r0)
        L_0x0a91:
            r0 = 0
            r7.f19192u = r0
            goto L_0x0af3
        L_0x0a95:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0a9d:
            int r0 = r7.G
            r1 = 2
            if (r0 == r1) goto L_0x0aa3
            return
        L_0x0aa3:
            r0 = 0
            r1 = 0
        L_0x0aa5:
            int r2 = r7.K
            if (r1 >= r2) goto L_0x0ab1
            int[] r2 = r7.L
            r2 = r2[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x0aa5
        L_0x0ab1:
            android.util.SparseArray<i5.e$c> r1 = r7.f19174c
            int r2 = r7.M
            java.lang.Object r1 = r1.get(r2)
            r8 = r1
            i5.e$c r8 = (i5.e.c) r8
            d5.a0 r1 = r8.X
            r1.getClass()
            r1 = 0
            r9 = 0
        L_0x0ac3:
            int r1 = r7.K
            if (r9 >= r1) goto L_0x0af0
            long r1 = r7.H
            int r3 = r8.f19203e
            int r3 = r3 * r9
            int r3 = r3 / 1000
            long r3 = (long) r3
            long r3 = r3 + r1
            int r1 = r7.O
            if (r9 != 0) goto L_0x0adb
            boolean r2 = r7.Q
            if (r2 != 0) goto L_0x0adb
            r1 = r1 | 1
        L_0x0adb:
            r5 = r1
            int[] r1 = r7.L
            r6 = r1[r9]
            int r10 = r0 - r6
            r0 = r19
            r1 = r8
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r10
            r0.d(r1, r2, r4, r5, r6)
            int r9 = r9 + 1
            r0 = r10
            goto L_0x0ac3
        L_0x0af0:
            r0 = 0
            r7.G = r0
        L_0x0af3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.e.g(int):void");
    }

    public void h(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        a aVar = (a) this.f19171a;
        aVar.f19159e = 0;
        aVar.f19156b.clear();
        g gVar = aVar.f19157c;
        gVar.f19236b = 0;
        gVar.f19237c = 0;
        g gVar2 = this.f19173b;
        gVar2.f19236b = 0;
        gVar2.f19237c = 0;
        m();
        for (int i10 = 0; i10 < this.f19174c.size(); i10++) {
            d dVar = this.f19174c.valueAt(i10).T;
            if (dVar != null) {
                dVar.f19226b = false;
                dVar.f19227c = 0;
            }
        }
    }

    public final void i(k kVar) {
        this.f19172a0 = kVar;
    }

    public final void l(j jVar, int i10) throws IOException {
        v vVar = this.f19178g;
        if (vVar.f26520c < i10) {
            byte[] bArr = vVar.f26518a;
            if (bArr.length < i10) {
                vVar.b(Math.max(bArr.length * 2, i10));
            }
            v vVar2 = this.f19178g;
            byte[] bArr2 = vVar2.f26518a;
            int i11 = vVar2.f26520c;
            jVar.readFully(bArr2, i11, i10 - i11);
            this.f19178g.C(i10);
        }
    }

    public final void m() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.f19181j.z(0);
    }

    public final long n(long j10) throws m0 {
        long j11 = this.f19189r;
        if (j11 != -9223372036854775807L) {
            return e0.P(j10, j11, 1000);
        }
        throw new m0("Can't scale timecode prior to timecodeScale being set.");
    }

    @RequiresNonNull({"#2.output"})
    public final int o(j jVar, c cVar, int i10) throws IOException {
        int i11;
        int i12;
        if ("S_TEXT/UTF8".equals(cVar.f19200b)) {
            p(jVar, f19166b0, i10);
            int i13 = this.S;
            m();
            return i13;
        } else if ("S_TEXT/ASS".equals(cVar.f19200b)) {
            p(jVar, f19168d0, i10);
            int i14 = this.S;
            m();
            return i14;
        } else {
            a0 a0Var = cVar.X;
            char c10 = 8;
            if (!this.U) {
                if (cVar.f19206h) {
                    this.O &= -1073741825;
                    int i15 = 128;
                    if (!this.V) {
                        jVar.readFully(this.f19178g.f26518a, 0, 1);
                        this.R++;
                        byte[] bArr = this.f19178g.f26518a;
                        if ((bArr[0] & b4.f10104d) != 128) {
                            this.Y = bArr[0];
                            this.V = true;
                        } else {
                            throw new m0("Extension bit is set in signal byte");
                        }
                    }
                    byte b10 = this.Y;
                    if ((b10 & 1) == 1) {
                        boolean z10 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            jVar.readFully(this.f19183l.f26518a, 0, 8);
                            this.R += 8;
                            this.Z = true;
                            v vVar = this.f19178g;
                            byte[] bArr2 = vVar.f26518a;
                            if (!z10) {
                                i15 = 0;
                            }
                            bArr2[0] = (byte) (i15 | 8);
                            vVar.D(0);
                            a0Var.e(this.f19178g, 1, 1);
                            this.S++;
                            this.f19183l.D(0);
                            a0Var.e(this.f19183l, 8, 1);
                            this.S += 8;
                        }
                        if (z10) {
                            if (!this.W) {
                                jVar.readFully(this.f19178g.f26518a, 0, 1);
                                this.R++;
                                this.f19178g.D(0);
                                this.X = this.f19178g.s();
                                this.W = true;
                            }
                            int i16 = this.X * 4;
                            this.f19178g.z(i16);
                            jVar.readFully(this.f19178g.f26518a, 0, i16);
                            this.R += i16;
                            short s10 = (short) ((this.X / 2) + 1);
                            int i17 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f19186o;
                            if (byteBuffer == null || byteBuffer.capacity() < i17) {
                                this.f19186o = ByteBuffer.allocate(i17);
                            }
                            this.f19186o.position(0);
                            this.f19186o.putShort(s10);
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i12 = this.X;
                                if (i18 >= i12) {
                                    break;
                                }
                                int v10 = this.f19178g.v();
                                if (i18 % 2 == 0) {
                                    this.f19186o.putShort((short) (v10 - i19));
                                } else {
                                    this.f19186o.putInt(v10 - i19);
                                }
                                i18++;
                                i19 = v10;
                            }
                            int i20 = (i10 - this.R) - i19;
                            if (i12 % 2 == 1) {
                                this.f19186o.putInt(i20);
                            } else {
                                this.f19186o.putShort((short) i20);
                                this.f19186o.putInt(0);
                            }
                            this.f19184m.B(this.f19186o.array(), i17);
                            a0Var.e(this.f19184m, i17, 1);
                            this.S += i17;
                        }
                    }
                } else {
                    byte[] bArr3 = cVar.f19207i;
                    if (bArr3 != null) {
                        v vVar2 = this.f19181j;
                        int length = bArr3.length;
                        vVar2.f26518a = bArr3;
                        vVar2.f26520c = length;
                        vVar2.f26519b = 0;
                    }
                }
                if (cVar.f19204f > 0) {
                    this.O |= 268435456;
                    this.f19185n.z(0);
                    this.f19178g.z(4);
                    v vVar3 = this.f19178g;
                    byte[] bArr4 = vVar3.f26518a;
                    bArr4[0] = (byte) ((i10 >> 24) & 255);
                    bArr4[1] = (byte) ((i10 >> 16) & 255);
                    bArr4[2] = (byte) ((i10 >> 8) & 255);
                    bArr4[3] = (byte) (i10 & 255);
                    a0Var.e(vVar3, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int i21 = i10 + this.f19181j.f26520c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f19200b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f19200b)) {
                if (cVar.T != null) {
                    v6.a.d(this.f19181j.f26520c == 0);
                    d dVar = cVar.T;
                    if (!dVar.f19226b) {
                        jVar.j(dVar.f19225a, 0, 10);
                        jVar.f();
                        byte[] bArr5 = dVar.f19225a;
                        if (bArr5[4] == -8 && bArr5[5] == 114 && bArr5[6] == 111 && (bArr5[7] & 254) == 186) {
                            if ((bArr5[7] & 255) == 187) {
                                c10 = 9;
                            }
                            i11 = 40 << ((bArr5[c10] >> 4) & 7);
                        } else {
                            i11 = 0;
                        }
                        if (i11 != 0) {
                            dVar.f19226b = true;
                        }
                    }
                }
                while (true) {
                    int i22 = this.R;
                    if (i22 >= i21) {
                        break;
                    }
                    int q10 = q(jVar, a0Var, i21 - i22);
                    this.R += q10;
                    this.S += q10;
                }
            } else {
                byte[] bArr6 = this.f19177f.f26518a;
                bArr6[0] = 0;
                bArr6[1] = 0;
                bArr6[2] = 0;
                int i23 = cVar.Y;
                int i24 = 4 - i23;
                while (this.R < i21) {
                    int i25 = this.T;
                    if (i25 == 0) {
                        int min = Math.min(i23, this.f19181j.a());
                        jVar.readFully(bArr6, i24 + min, i23 - min);
                        if (min > 0) {
                            v vVar4 = this.f19181j;
                            System.arraycopy(vVar4.f26518a, vVar4.f26519b, bArr6, i24, min);
                            vVar4.f26519b += min;
                        }
                        this.R += i23;
                        this.f19177f.D(0);
                        this.T = this.f19177f.v();
                        this.f19176e.D(0);
                        a0Var.b(this.f19176e, 4);
                        this.S += 4;
                    } else {
                        int q11 = q(jVar, a0Var, i25);
                        this.R += q11;
                        this.S += q11;
                        this.T -= q11;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f19200b)) {
                this.f19179h.D(0);
                a0Var.b(this.f19179h, 4);
                this.S += 4;
            }
            int i26 = this.S;
            m();
            return i26;
        }
    }

    public final void p(j jVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        v vVar = this.f19182k;
        byte[] bArr2 = vVar.f26518a;
        if (bArr2.length < length) {
            vVar.A(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        jVar.readFully(this.f19182k.f26518a, bArr.length, i10);
        this.f19182k.D(0);
        this.f19182k.C(length);
    }

    public final int q(j jVar, a0 a0Var, int i10) throws IOException {
        int a10 = this.f19181j.a();
        if (a10 <= 0) {
            return a0Var.f(jVar, i10, false);
        }
        int min = Math.min(i10, a10);
        a0Var.b(this.f19181j, min);
        return min;
    }

    /* compiled from: MatroskaExtractor */
    public static final class c {
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public byte[] N;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public d T;
        public boolean U;
        public boolean V = true;
        public String W = "eng";
        public a0 X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f19199a;

        /* renamed from: b  reason: collision with root package name */
        public String f19200b;

        /* renamed from: c  reason: collision with root package name */
        public int f19201c;

        /* renamed from: d  reason: collision with root package name */
        public int f19202d;

        /* renamed from: e  reason: collision with root package name */
        public int f19203e;

        /* renamed from: f  reason: collision with root package name */
        public int f19204f;

        /* renamed from: g  reason: collision with root package name */
        public int f19205g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19206h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f19207i;

        /* renamed from: j  reason: collision with root package name */
        public a0.a f19208j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f19209k;

        /* renamed from: l  reason: collision with root package name */
        public f f19210l;

        /* renamed from: m  reason: collision with root package name */
        public int f19211m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f19212n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f19213o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f19214p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f19215q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f19216r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f19217s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f19218t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f19219u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f19220v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f19221w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f19222x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f19223y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f19224z = -1;

        public c() {
        }

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] a(String str) throws m0 {
            byte[] bArr = this.f19209k;
            if (bArr != null) {
                return bArr;
            }
            throw new m0(j.f.a("Missing CodecPrivate for codec ", str));
        }

        public c(a aVar) {
        }
    }
}
