package f6;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c5.c;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.upstream.r;
import e6.e;
import f6.d;
import f6.e;
import f6.g;
import f6.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import t4.l;
import u6.h;
import v6.e0;
import x4.b0;
import x4.f;
import x4.m0;
import z5.k;
import z5.v;

/* compiled from: DefaultHlsPlaylistTracker */
public final class b implements i, n.b<p<f>> {

    /* renamed from: w  reason: collision with root package name */
    public static final i.a f18129w = l.f25709a;

    /* renamed from: a  reason: collision with root package name */
    public final e f18130a;

    /* renamed from: b  reason: collision with root package name */
    public final h f18131b;

    /* renamed from: c  reason: collision with root package name */
    public final h f18132c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<Uri, a> f18133d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final List<i.b> f18134e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public v.a f18135f;

    /* renamed from: g  reason: collision with root package name */
    public n f18136g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f18137h;

    /* renamed from: i  reason: collision with root package name */
    public i.e f18138i;

    /* renamed from: r  reason: collision with root package name */
    public d f18139r;

    /* renamed from: s  reason: collision with root package name */
    public Uri f18140s;

    /* renamed from: t  reason: collision with root package name */
    public e f18141t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18142u;

    /* renamed from: v  reason: collision with root package name */
    public long f18143v = -9223372036854775807L;

    /* compiled from: DefaultHlsPlaylistTracker */
    public final class a implements n.b<p<f>> {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f18144a;

        /* renamed from: b  reason: collision with root package name */
        public final n f18145b = new n("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c  reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.e f18146c;

        /* renamed from: d  reason: collision with root package name */
        public e f18147d;

        /* renamed from: e  reason: collision with root package name */
        public long f18148e;

        /* renamed from: f  reason: collision with root package name */
        public long f18149f;

        /* renamed from: g  reason: collision with root package name */
        public long f18150g;

        /* renamed from: h  reason: collision with root package name */
        public long f18151h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f18152i;

        /* renamed from: r  reason: collision with root package name */
        public IOException f18153r;

        public a(Uri uri) {
            this.f18144a = uri;
            this.f18146c = b.this.f18130a.a(4);
        }

        public final boolean a(long j10) {
            boolean z10;
            this.f18151h = SystemClock.elapsedRealtime() + j10;
            if (!this.f18144a.equals(b.this.f18140s)) {
                return false;
            }
            b bVar = b.this;
            List<d.b> list = bVar.f18139r.f18159e;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                a aVar = bVar.f18133d.get(list.get(i10).f18171a);
                aVar.getClass();
                if (elapsedRealtime > aVar.f18151h) {
                    Uri uri = aVar.f18144a;
                    bVar.f18140s = uri;
                    aVar.c(bVar.q(uri));
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                return true;
            }
            return false;
        }

        public final void b(Uri uri) {
            b bVar = b.this;
            p pVar = new p(this.f18146c, uri, 4, bVar.f18131b.b(bVar.f18139r, this.f18147d));
            b.this.f18135f.m(new k(pVar.f5547a, pVar.f5548b, this.f18145b.h(pVar, this, ((com.google.android.exoplayer2.upstream.k) b.this.f18132c).a(pVar.f5549c))), pVar.f5549c);
        }

        public final void c(Uri uri) {
            this.f18151h = 0;
            if (!this.f18152i && !this.f18145b.e() && !this.f18145b.d()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f18150g;
                if (elapsedRealtime < j10) {
                    this.f18152i = true;
                    b.this.f18137h.postDelayed(new f0.i(this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:120:0x0309  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x03a9  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x03b7  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x03de  */
        /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0159  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(f6.e r39, z5.k r40) {
            /*
                r38 = this;
                r0 = r38
                r1 = r39
                f6.e r2 = r0.f18147d
                long r3 = android.os.SystemClock.elapsedRealtime()
                r0.f18148e = r3
                f6.b r5 = f6.b.this
                f6.i$a r6 = f6.b.f18129w
                r5.getClass()
                r39.getClass()
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L_0x0055
                long r8 = r1.f18182i
                long r10 = r2.f18182i
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto L_0x0023
                goto L_0x0055
            L_0x0023:
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 >= 0) goto L_0x0028
                goto L_0x0053
            L_0x0028:
                java.util.List<f6.e$d> r8 = r1.f18189p
                int r8 = r8.size()
                java.util.List<f6.e$d> r9 = r2.f18189p
                int r9 = r9.size()
                int r8 = r8 - r9
                if (r8 == 0) goto L_0x003a
                if (r8 <= 0) goto L_0x0053
                goto L_0x0055
            L_0x003a:
                java.util.List<f6.e$b> r8 = r1.f18190q
                int r8 = r8.size()
                java.util.List<f6.e$b> r9 = r2.f18190q
                int r9 = r9.size()
                if (r8 > r9) goto L_0x0055
                if (r8 != r9) goto L_0x0053
                boolean r8 = r1.f18186m
                if (r8 == 0) goto L_0x0053
                boolean r8 = r2.f18186m
                if (r8 != 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                r8 = 0
                goto L_0x0056
            L_0x0055:
                r8 = 1
            L_0x0056:
                if (r8 != 0) goto L_0x00af
                boolean r5 = r1.f18186m
                if (r5 == 0) goto L_0x00ac
                boolean r5 = r2.f18186m
                if (r5 == 0) goto L_0x0061
                goto L_0x00ac
            L_0x0061:
                f6.e r5 = new f6.e
                r11 = r5
                int r12 = r2.f18177d
                java.lang.String r13 = r2.f18216a
                java.util.List<java.lang.String> r14 = r2.f18217b
                long r9 = r2.f18178e
                r15 = r9
                long r8 = r2.f18179f
                r17 = r8
                boolean r8 = r2.f18180g
                r19 = r8
                int r8 = r2.f18181h
                r20 = r8
                long r8 = r2.f18182i
                r21 = r8
                int r8 = r2.f18183j
                r23 = r8
                long r8 = r2.f18184k
                r24 = r8
                long r8 = r2.f18185l
                r26 = r8
                boolean r8 = r2.f18218c
                r28 = r8
                r29 = 1
                boolean r8 = r2.f18187n
                r30 = r8
                c5.f r8 = r2.f18188o
                r31 = r8
                java.util.List<f6.e$d> r8 = r2.f18189p
                r32 = r8
                java.util.List<f6.e$b> r8 = r2.f18190q
                r33 = r8
                f6.e$f r8 = r2.f18193t
                r34 = r8
                java.util.Map<android.net.Uri, f6.e$c> r8 = r2.f18191r
                r35 = r8
                r11.<init>(r12, r13, r14, r15, r17, r19, r20, r21, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35)
                goto L_0x0150
            L_0x00ac:
                r5 = r2
                goto L_0x0150
            L_0x00af:
                boolean r8 = r1.f18187n
                if (r8 == 0) goto L_0x00b8
                long r8 = r1.f18179f
            L_0x00b5:
                r16 = r8
                goto L_0x00e5
            L_0x00b8:
                f6.e r8 = r5.f18141t
                if (r8 == 0) goto L_0x00bf
                long r8 = r8.f18179f
                goto L_0x00c1
            L_0x00bf:
                r8 = 0
            L_0x00c1:
                if (r2 != 0) goto L_0x00c4
                goto L_0x00b5
            L_0x00c4:
                java.util.List<f6.e$d> r10 = r2.f18189p
                int r10 = r10.size()
                f6.e$d r11 = f6.b.p(r2, r1)
                if (r11 == 0) goto L_0x00d6
                long r8 = r2.f18179f
                long r10 = r11.f18204e
                long r8 = r8 + r10
                goto L_0x00b5
            L_0x00d6:
                long r10 = (long) r10
                long r12 = r1.f18182i
                long r14 = r2.f18182i
                long r12 = r12 - r14
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 != 0) goto L_0x00b5
                long r8 = r2.b()
                goto L_0x00b5
            L_0x00e5:
                boolean r8 = r1.f18180g
                if (r8 == 0) goto L_0x00ee
                int r5 = r1.f18181h
            L_0x00eb:
                r19 = r5
                goto L_0x0110
            L_0x00ee:
                f6.e r5 = r5.f18141t
                if (r5 == 0) goto L_0x00f5
                int r5 = r5.f18181h
                goto L_0x00f6
            L_0x00f5:
                r5 = 0
            L_0x00f6:
                if (r2 != 0) goto L_0x00f9
                goto L_0x00eb
            L_0x00f9:
                f6.e$d r8 = f6.b.p(r2, r1)
                if (r8 == 0) goto L_0x00eb
                int r5 = r2.f18181h
                int r8 = r8.f18203d
                int r5 = r5 + r8
                java.util.List<f6.e$d> r8 = r1.f18189p
                java.lang.Object r8 = r8.get(r7)
                f6.e$d r8 = (f6.e.d) r8
                int r8 = r8.f18203d
                int r5 = r5 - r8
                goto L_0x00eb
            L_0x0110:
                f6.e r5 = new f6.e
                r10 = r5
                int r11 = r1.f18177d
                java.lang.String r12 = r1.f18216a
                java.util.List<java.lang.String> r13 = r1.f18217b
                long r14 = r1.f18178e
                long r8 = r1.f18182i
                r20 = r8
                int r8 = r1.f18183j
                r22 = r8
                long r8 = r1.f18184k
                r23 = r8
                long r8 = r1.f18185l
                r25 = r8
                boolean r8 = r1.f18218c
                r27 = r8
                boolean r8 = r1.f18186m
                r28 = r8
                boolean r8 = r1.f18187n
                r29 = r8
                c5.f r8 = r1.f18188o
                r30 = r8
                java.util.List<f6.e$d> r8 = r1.f18189p
                r31 = r8
                java.util.List<f6.e$b> r8 = r1.f18190q
                r32 = r8
                f6.e$f r8 = r1.f18193t
                r33 = r8
                java.util.Map<android.net.Uri, f6.e$c> r8 = r1.f18191r
                r34 = r8
                r18 = 1
                r10.<init>(r11, r12, r13, r14, r16, r18, r19, r20, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34)
            L_0x0150:
                r0.f18147d = r5
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r5 == r2) goto L_0x0309
                r1 = 0
                r0.f18153r = r1
                r0.f18149f = r3
                f6.b r1 = f6.b.this
                android.net.Uri r10 = r0.f18144a
                android.net.Uri r11 = r1.f18140s
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x02ee
                f6.e r10 = r1.f18141t
                if (r10 != 0) goto L_0x0177
                boolean r10 = r5.f18186m
                r10 = r10 ^ r6
                r1.f18142u = r10
                long r10 = r5.f18179f
                r1.f18143v = r10
            L_0x0177:
                r1.f18141t = r5
                f6.i$e r10 = r1.f18138i
                com.google.android.exoplayer2.source.hls.HlsMediaSource r10 = (com.google.android.exoplayer2.source.hls.HlsMediaSource) r10
                r10.getClass()
                boolean r11 = r5.f18187n
                if (r11 == 0) goto L_0x018d
                long r11 = r5.f18179f
                long r11 = x4.f.c(r11)
                r16 = r11
                goto L_0x018f
            L_0x018d:
                r16 = r8
            L_0x018f:
                int r11 = r5.f18177d
                r12 = 2
                if (r11 == r12) goto L_0x0199
                if (r11 != r6) goto L_0x0197
                goto L_0x0199
            L_0x0197:
                r14 = r8
                goto L_0x019b
            L_0x0199:
                r14 = r16
            L_0x019b:
                long r11 = r5.f18178e
                androidx.appcompat.widget.m r13 = new androidx.appcompat.widget.m
                f6.i r7 = r10.f5141x
                f6.d r7 = r7.b()
                r7.getClass()
                r13.<init>((f6.d) r7, (f6.e) r5)
                f6.i r7 = r10.f5141x
                boolean r7 = r7.a()
                if (r7 == 0) goto L_0x02bc
                boolean r7 = r5.f18187n
                if (r7 == 0) goto L_0x01ca
                long r6 = r10.f5142y
                long r6 = v6.e0.w(r6)
                long r6 = x4.f.b(r6)
                long r18 = r5.b()
                long r6 = r6 - r18
                r39 = r13
                goto L_0x01ce
            L_0x01ca:
                r39 = r13
                r6 = 0
            L_0x01ce:
                x4.e0$f r13 = r10.A
                r34 = r2
                r36 = r3
                long r2 = r13.f27549a
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x01e1
                long r2 = x4.f.b(r2)
                r18 = r2
                goto L_0x0213
            L_0x01e1:
                f6.e$f r2 = r5.f18193t
                long r3 = r5.f18178e
                int r13 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r13 == 0) goto L_0x01ed
                long r8 = r5.f18192s
                long r8 = r8 - r3
                goto L_0x0210
            L_0x01ed:
                long r8 = r2.f18214d
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r13 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r13 == 0) goto L_0x0203
                r18 = r8
                long r8 = r5.f18185l
                int r13 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r13 == 0) goto L_0x0203
                r8 = r18
                goto L_0x0210
            L_0x0203:
                long r8 = r2.f18213c
                int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r2 == 0) goto L_0x020a
                goto L_0x0210
            L_0x020a:
                r2 = 3
                long r8 = r5.f18184k
                long r8 = r8 * r2
            L_0x0210:
                long r8 = r8 + r6
                r18 = r8
            L_0x0213:
                long r2 = r5.f18192s
                long r22 = r2 + r6
                r20 = r6
                long r2 = v6.e0.j(r18, r20, r22)
                long r2 = x4.f.c(r2)
                x4.e0$f r4 = r10.A
                long r8 = r4.f27549a
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 == 0) goto L_0x0239
                x4.e0 r4 = r10.f5143z
                x4.e0$c r4 = r4.a()
                r4.f27532w = r2
                x4.e0 r2 = r4.a()
                x4.e0$f r2 = r2.f27505c
                r10.A = r2
            L_0x0239:
                long r2 = r5.f18179f
                f6.i r4 = r10.f5141x
                long r8 = r4.l()
                long r24 = r2 - r8
                boolean r2 = r5.f18186m
                if (r2 == 0) goto L_0x024e
                long r2 = r5.f18192s
                long r2 = r2 + r24
                r20 = r2
                goto L_0x0253
            L_0x024e:
                r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L_0x0253:
                java.util.List<f6.e$d> r2 = r5.f18189p
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x028b
                java.util.List<f6.e$d> r2 = r5.f18189p
                int r3 = r2.size()
                int r3 = r3 + -1
                long r8 = r5.f18192s
                long r8 = r8 + r6
                x4.e0$f r4 = r10.A
                long r6 = r4.f27549a
                long r6 = x4.f.b(r6)
                long r8 = r8 - r6
            L_0x026f:
                if (r3 <= 0) goto L_0x0280
                java.lang.Object r4 = r2.get(r3)
                f6.e$d r4 = (f6.e.d) r4
                long r6 = r4.f18204e
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 <= 0) goto L_0x0280
                int r3 = r3 + -1
                goto L_0x026f
            L_0x0280:
                java.lang.Object r2 = r2.get(r3)
                f6.e$d r2 = (f6.e.d) r2
                long r2 = r2.f18204e
                r26 = r2
                goto L_0x0299
            L_0x028b:
                r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0297
                r26 = 0
                goto L_0x0299
            L_0x0297:
                r26 = r11
            L_0x0299:
                z5.e0 r2 = new z5.e0
                r3 = r39
                r13 = r2
                r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                long r6 = r5.f18192s
                r22 = r6
                r28 = 1
                boolean r4 = r5.f18186m
                r6 = 1
                r29 = r4 ^ 1
                x4.e0 r4 = r10.f5143z
                r31 = r4
                x4.e0$f r4 = r10.A
                r32 = r4
                r30 = r3
                r13.<init>(r14, r16, r18, r20, r22, r24, r26, r28, r29, r30, r31, r32)
                goto L_0x02ea
            L_0x02bc:
                r34 = r2
                r36 = r3
                r7 = r8
                r3 = r13
                int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r2 != 0) goto L_0x02c9
                r26 = 0
                goto L_0x02cb
            L_0x02c9:
                r26 = r11
            L_0x02cb:
                z5.e0 r2 = new z5.e0
                r13 = r2
                r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                long r4 = r5.f18192s
                r22 = r4
                r20 = r4
                r24 = 0
                r28 = 1
                r29 = 0
                x4.e0 r4 = r10.f5143z
                r31 = r4
                r32 = 0
                r30 = r3
                r13.<init>(r14, r16, r18, r20, r22, r24, r26, r28, r29, r30, r31, r32)
            L_0x02ea:
                r10.v(r2)
                goto L_0x02f2
            L_0x02ee:
                r34 = r2
                r36 = r3
            L_0x02f2:
                java.util.List<f6.i$b> r2 = r1.f18134e
                int r2 = r2.size()
                r3 = 0
            L_0x02f9:
                if (r3 >= r2) goto L_0x03a1
                java.util.List<f6.i$b> r4 = r1.f18134e
                java.lang.Object r4 = r4.get(r3)
                f6.i$b r4 = (f6.i.b) r4
                r4.b()
                int r3 = r3 + 1
                goto L_0x02f9
            L_0x0309:
                r34 = r2
                r36 = r3
                boolean r2 = r5.f18186m
                if (r2 != 0) goto L_0x03a1
                long r2 = r1.f18182i
                java.util.List<f6.e$d> r1 = r1.f18189p
                int r1 = r1.size()
                long r4 = (long) r1
                long r2 = r2 + r4
                f6.e r1 = r0.f18147d
                long r4 = r1.f18182i
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 >= 0) goto L_0x0339
                f6.i$c r1 = new f6.i$c
                android.net.Uri r2 = r0.f18144a
                r1.<init>(r2)
                r0.f18153r = r1
                f6.b r1 = f6.b.this
                android.net.Uri r2 = r0.f18144a
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                f6.b.o(r1, r2, r3)
                goto L_0x03a1
            L_0x0339:
                long r2 = r0.f18149f
                long r2 = r36 - r2
                double r2 = (double) r2
                long r4 = r1.f18184k
                long r4 = x4.f.c(r4)
                double r4 = (double) r4
                f6.b r1 = f6.b.this
                r1.getClass()
                r7 = 4615063718147915776(0x400c000000000000, double:3.5)
                java.lang.Double.isNaN(r4)
                java.lang.Double.isNaN(r4)
                double r4 = r4 * r7
                int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x03a1
                f6.i$d r1 = new f6.i$d
                android.net.Uri r2 = r0.f18144a
                r1.<init>(r2)
                r0.f18153r = r1
                f6.b r2 = f6.b.this
                u6.h r3 = r2.f18132c
                com.google.android.exoplayer2.upstream.k r3 = (com.google.android.exoplayer2.upstream.k) r3
                boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.m.f
                if (r3 == 0) goto L_0x038b
                com.google.android.exoplayer2.upstream.m$f r1 = (com.google.android.exoplayer2.upstream.m.f) r1
                int r1 = r1.f5524a
                r3 = 403(0x193, float:5.65E-43)
                if (r1 == r3) goto L_0x0387
                r3 = 404(0x194, float:5.66E-43)
                if (r1 == r3) goto L_0x0387
                r3 = 410(0x19a, float:5.75E-43)
                if (r1 == r3) goto L_0x0387
                r3 = 416(0x1a0, float:5.83E-43)
                if (r1 == r3) goto L_0x0387
                r3 = 500(0x1f4, float:7.0E-43)
                if (r1 == r3) goto L_0x0387
                r3 = 503(0x1f7, float:7.05E-43)
                if (r1 != r3) goto L_0x038b
            L_0x0387:
                r3 = 60000(0xea60, double:2.9644E-319)
                goto L_0x0390
            L_0x038b:
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            L_0x0390:
                android.net.Uri r1 = r0.f18144a
                f6.b.o(r2, r1, r3)
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto L_0x03a1
                r0.a(r3)
            L_0x03a1:
                f6.e r1 = r0.f18147d
                f6.e$f r2 = r1.f18193t
                boolean r2 = r2.f18215e
                if (r2 != 0) goto L_0x03b7
                r2 = r34
                if (r1 == r2) goto L_0x03b0
                long r1 = r1.f18184k
                goto L_0x03b5
            L_0x03b0:
                long r1 = r1.f18184k
                r3 = 2
                long r1 = r1 / r3
            L_0x03b5:
                r9 = r1
                goto L_0x03b9
            L_0x03b7:
                r9 = 0
            L_0x03b9:
                long r1 = x4.f.c(r9)
                long r1 = r1 + r36
                r0.f18150g = r1
                f6.e r1 = r0.f18147d
                long r1 = r1.f18185l
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x03dc
                android.net.Uri r1 = r0.f18144a
                f6.b r2 = f6.b.this
                android.net.Uri r2 = r2.f18140s
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x03db
                goto L_0x03dc
            L_0x03db:
                r6 = 0
            L_0x03dc:
                if (r6 == 0) goto L_0x046b
                f6.e r1 = r0.f18147d
                boolean r2 = r1.f18186m
                if (r2 != 0) goto L_0x046b
                f6.e$f r1 = r1.f18193t
                long r2 = r1.f18211a
                r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x03f8
                boolean r1 = r1.f18215e
                if (r1 != 0) goto L_0x03f8
                android.net.Uri r1 = r0.f18144a
                goto L_0x0468
            L_0x03f8:
                android.net.Uri r1 = r0.f18144a
                android.net.Uri$Builder r1 = r1.buildUpon()
                f6.e r2 = r0.f18147d
                f6.e$f r3 = r2.f18193t
                boolean r3 = r3.f18215e
                if (r3 == 0) goto L_0x0447
                long r3 = r2.f18182i
                java.util.List<f6.e$d> r2 = r2.f18189p
                int r2 = r2.size()
                long r5 = (long) r2
                long r3 = r3 + r5
                java.lang.String r2 = java.lang.String.valueOf(r3)
                java.lang.String r3 = "_HLS_msn"
                r1.appendQueryParameter(r3, r2)
                f6.e r2 = r0.f18147d
                long r3 = r2.f18185l
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0447
                java.util.List<f6.e$b> r2 = r2.f18190q
                int r3 = r2.size()
                boolean r4 = r2.isEmpty()
                if (r4 != 0) goto L_0x043e
                java.lang.Object r2 = ba.y.b(r2)
                f6.e$b r2 = (f6.e.b) r2
                boolean r2 = r2.f18195u
                if (r2 == 0) goto L_0x043e
                int r3 = r3 + -1
            L_0x043e:
                java.lang.String r2 = java.lang.String.valueOf(r3)
                java.lang.String r3 = "_HLS_part"
                r1.appendQueryParameter(r3, r2)
            L_0x0447:
                f6.e r2 = r0.f18147d
                f6.e$f r2 = r2.f18193t
                long r3 = r2.f18211a
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0464
                boolean r2 = r2.f18212b
                if (r2 == 0) goto L_0x045d
                java.lang.String r2 = "v2"
                goto L_0x045f
            L_0x045d:
                java.lang.String r2 = "YES"
            L_0x045f:
                java.lang.String r3 = "_HLS_skip"
                r1.appendQueryParameter(r3, r2)
            L_0x0464:
                android.net.Uri r1 = r1.build()
            L_0x0468:
                r0.c(r1)
            L_0x046b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.b.a.d(f6.e, z5.k):void");
        }

        public void k(n.e eVar, long j10, long j11, boolean z10) {
            p pVar = (p) eVar;
            long j12 = pVar.f5547a;
            u6.e eVar2 = pVar.f5548b;
            r rVar = pVar.f5550d;
            k kVar = new k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
            b.this.f18132c.getClass();
            b.this.f18135f.d(kVar, 4);
        }

        public n.c m(n.e eVar, long j10, long j11, IOException iOException, int i10) {
            n.c cVar;
            int i11;
            IOException iOException2 = iOException;
            p pVar = (p) eVar;
            long j12 = pVar.f5547a;
            u6.e eVar2 = pVar.f5548b;
            r rVar = pVar.f5550d;
            Uri uri = rVar.f5559c;
            k kVar = r3;
            Uri uri2 = uri;
            k kVar2 = new k(j12, eVar2, uri, rVar.f5560d, j10, j11, rVar.f5558b);
            boolean z10 = iOException2 instanceof g.a;
            if ((uri2.getQueryParameter("_HLS_msn") != null) || z10) {
                int i12 = Integer.MAX_VALUE;
                if (iOException2 instanceof m.f) {
                    i12 = ((m.f) iOException2).f5524a;
                }
                if (z10 || i12 == 400 || i12 == 503) {
                    this.f18150g = SystemClock.elapsedRealtime();
                    c(this.f18144a);
                    v.a aVar = b.this.f18135f;
                    int i13 = e0.f26436a;
                    aVar.k(kVar, pVar.f5549c, iOException2, true);
                    return n.f5529e;
                }
            }
            b bVar = b.this;
            com.google.android.exoplayer2.upstream.k kVar3 = (com.google.android.exoplayer2.upstream.k) bVar.f18132c;
            long j13 = (!(iOException2 instanceof m.f) || !((i11 = ((m.f) iOException2).f5524a) == 403 || i11 == 404 || i11 == 410 || i11 == 416 || i11 == 500 || i11 == 503)) ? -9223372036854775807L : 60000;
            boolean z11 = j13 != -9223372036854775807L;
            boolean z12 = b.o(bVar, this.f18144a, j13) || !z11;
            if (z11) {
                z12 |= a(j13);
            }
            if (z12) {
                com.google.android.exoplayer2.upstream.k kVar4 = (com.google.android.exoplayer2.upstream.k) b.this.f18132c;
                long a10 = ((iOException2 instanceof m0) || (iOException2 instanceof FileNotFoundException) || (iOException2 instanceof m.b) || (iOException2 instanceof n.h)) ? -9223372036854775807L : (long) c.a(i10, -1, 1000, 5000);
                if (a10 != -9223372036854775807L) {
                    cVar = n.c(false, a10);
                } else {
                    cVar = n.f5530f;
                }
            } else {
                cVar = n.f5529e;
            }
            boolean z13 = !cVar.a();
            b.this.f18135f.k(kVar, pVar.f5549c, iOException2, z13);
            if (!z13) {
                return cVar;
            }
            b.this.f18132c.getClass();
            return cVar;
        }

        public void n(n.e eVar, long j10, long j11) {
            p pVar = (p) eVar;
            f fVar = (f) pVar.f5552f;
            long j12 = pVar.f5547a;
            u6.e eVar2 = pVar.f5548b;
            r rVar = pVar.f5550d;
            k kVar = new k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
            if (fVar instanceof e) {
                d((e) fVar, kVar);
                b.this.f18135f.g(kVar, 4);
            } else {
                m0 m0Var = new m0("Loaded playlist has unexpected type.");
                this.f18153r = m0Var;
                b.this.f18135f.k(kVar, 4, m0Var, true);
            }
            b.this.f18132c.getClass();
        }
    }

    public b(e eVar, h hVar, h hVar2) {
        this.f18130a = eVar;
        this.f18131b = hVar2;
        this.f18132c = hVar;
    }

    public static boolean o(b bVar, Uri uri, long j10) {
        int size = bVar.f18134e.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            z10 |= !bVar.f18134e.get(i10).h(uri, j10);
        }
        return z10;
    }

    public static e.d p(e eVar, e eVar2) {
        int i10 = (int) (eVar2.f18182i - eVar.f18182i);
        List<e.d> list = eVar.f18189p;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    public boolean a() {
        return this.f18142u;
    }

    public d b() {
        return this.f18139r;
    }

    public boolean c(Uri uri) {
        int i10;
        a aVar = this.f18133d.get(uri);
        if (aVar.f18147d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000, f.c(aVar.f18147d.f18192s));
        e eVar = aVar.f18147d;
        if (eVar.f18186m || (i10 = eVar.f18177d) == 2 || i10 == 1 || aVar.f18148e + max > elapsedRealtime) {
            return true;
        }
        return false;
    }

    public void d() throws IOException {
        n nVar = this.f18136g;
        if (nVar != null) {
            nVar.f(Integer.MIN_VALUE);
        }
        Uri uri = this.f18140s;
        if (uri != null) {
            f(uri);
        }
    }

    public void e(i.b bVar) {
        this.f18134e.remove(bVar);
    }

    public void f(Uri uri) throws IOException {
        a aVar = this.f18133d.get(uri);
        aVar.f18145b.f(Integer.MIN_VALUE);
        IOException iOException = aVar.f18153r;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void g(i.b bVar) {
        this.f18134e.add(bVar);
    }

    public void h(Uri uri) {
        a aVar = this.f18133d.get(uri);
        aVar.c(aVar.f18144a);
    }

    public e i(Uri uri, boolean z10) {
        e eVar;
        e eVar2 = this.f18133d.get(uri).f18147d;
        if (eVar2 != null && z10 && !uri.equals(this.f18140s)) {
            List<d.b> list = this.f18139r.f18159e;
            boolean z11 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (uri.equals(list.get(i10).f18171a)) {
                    z11 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z11 && ((eVar = this.f18141t) == null || !eVar.f18186m)) {
                this.f18140s = uri;
                this.f18133d.get(uri).c(q(uri));
            }
        }
        return eVar2;
    }

    public void j(Uri uri, v.a aVar, i.e eVar) {
        this.f18137h = e0.l();
        this.f18135f = aVar;
        this.f18138i = eVar;
        p pVar = new p(this.f18130a.a(4), uri, 4, this.f18131b.a());
        v6.a.d(this.f18136g == null);
        n nVar = new n("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f18136g = nVar;
        aVar.m(new k(pVar.f5547a, pVar.f5548b, nVar.h(pVar, this, ((com.google.android.exoplayer2.upstream.k) this.f18132c).a(pVar.f5549c))), pVar.f5549c);
    }

    public void k(n.e eVar, long j10, long j11, boolean z10) {
        p pVar = (p) eVar;
        long j12 = pVar.f5547a;
        u6.e eVar2 = pVar.f5548b;
        r rVar = pVar.f5550d;
        k kVar = new k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f18132c.getClass();
        this.f18135f.d(kVar, 4);
    }

    public long l() {
        return this.f18143v;
    }

    public n.c m(n.e eVar, long j10, long j11, IOException iOException, int i10) {
        IOException iOException2 = iOException;
        p pVar = (p) eVar;
        long j12 = pVar.f5547a;
        u6.e eVar2 = pVar.f5548b;
        r rVar = pVar.f5550d;
        k kVar = new k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        com.google.android.exoplayer2.upstream.k kVar2 = (com.google.android.exoplayer2.upstream.k) this.f18132c;
        long a10 = ((iOException2 instanceof m0) || (iOException2 instanceof FileNotFoundException) || (iOException2 instanceof m.b) || (iOException2 instanceof n.h)) ? -9223372036854775807L : (long) c.a(i10, -1, 1000, 5000);
        boolean z10 = a10 == -9223372036854775807L;
        this.f18135f.k(kVar, pVar.f5549c, iOException2, z10);
        if (z10) {
            this.f18132c.getClass();
        }
        if (z10) {
            return n.f5530f;
        }
        return n.c(false, a10);
    }

    public void n(n.e eVar, long j10, long j11) {
        d dVar;
        p pVar = (p) eVar;
        f fVar = (f) pVar.f5552f;
        boolean z10 = fVar instanceof e;
        if (z10) {
            String str = fVar.f18216a;
            d dVar2 = d.f18157n;
            Uri parse = Uri.parse(str);
            b0.b bVar = new b0.b();
            bVar.f27415a = "0";
            bVar.f27424j = "application/x-mpegURL";
            dVar = new d("", Collections.emptyList(), Collections.singletonList(new d.b(parse, bVar.a(), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (b0) null, (List<b0>) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            dVar = (d) fVar;
        }
        this.f18139r = dVar;
        this.f18140s = dVar.f18159e.get(0).f18171a;
        List<Uri> list = dVar.f18158d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f18133d.put(uri, new a(uri));
        }
        long j12 = pVar.f5547a;
        u6.e eVar2 = pVar.f5548b;
        r rVar = pVar.f5550d;
        k kVar = new k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        a aVar = this.f18133d.get(this.f18140s);
        if (z10) {
            aVar.d((e) fVar, kVar);
        } else {
            aVar.c(aVar.f18144a);
        }
        this.f18132c.getClass();
        this.f18135f.g(kVar, 4);
    }

    public final Uri q(Uri uri) {
        e.c cVar;
        e eVar = this.f18141t;
        if (eVar == null || !eVar.f18193t.f18215e || (cVar = eVar.f18191r.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f18196a));
        int i10 = cVar.f18197b;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    public void stop() {
        this.f18140s = null;
        this.f18141t = null;
        this.f18139r = null;
        this.f18143v = -9223372036854775807L;
        this.f18136g.g((n.f) null);
        this.f18136g = null;
        for (a aVar : this.f18133d.values()) {
            aVar.f18145b.g((n.f) null);
        }
        this.f18137h.removeCallbacksAndMessages((Object) null);
        this.f18137h = null;
        this.f18133d.clear();
    }
}
