package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import c5.j;
import c5.l;
import c5.m;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.upstream.r;
import de.a0;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u6.i;
import v6.x;
import x4.c1;
import x4.e0;
import x4.m0;
import x4.z;
import z5.r;
import z5.v;
import z5.w;

public final class DashMediaSource extends z5.a {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f5026b0 = 0;
    public final SparseArray<b> A;
    public final Runnable B;
    public final Runnable C;
    public final e.b D;
    public final o E;
    public com.google.android.exoplayer2.upstream.e F;
    public n G;
    public i H;
    public IOException I;
    public Handler J;
    public e0.f K;
    public Uri L;
    public Uri M;
    public d6.b N = null;
    public boolean O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public long Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f5027a0;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f5028g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5029h;

    /* renamed from: i  reason: collision with root package name */
    public final e.a f5030i;

    /* renamed from: r  reason: collision with root package name */
    public final a.C0075a f5031r;

    /* renamed from: s  reason: collision with root package name */
    public final a0 f5032s;

    /* renamed from: t  reason: collision with root package name */
    public final l f5033t;

    /* renamed from: u  reason: collision with root package name */
    public final u6.h f5034u;

    /* renamed from: v  reason: collision with root package name */
    public final long f5035v;

    /* renamed from: w  reason: collision with root package name */
    public final v.a f5036w;

    /* renamed from: x  reason: collision with root package name */
    public final p.a<? extends d6.b> f5037x;

    /* renamed from: y  reason: collision with root package name */
    public final e f5038y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f5039z;

    public static final class Factory implements w {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0075a f5040a;

        /* renamed from: b  reason: collision with root package name */
        public final e.a f5041b;

        /* renamed from: c  reason: collision with root package name */
        public m f5042c = new c5.e();

        /* renamed from: d  reason: collision with root package name */
        public a0 f5043d = new a0(2);

        /* renamed from: e  reason: collision with root package name */
        public u6.h f5044e = new k();

        /* renamed from: f  reason: collision with root package name */
        public long f5045f = -9223372036854775807L;

        /* renamed from: g  reason: collision with root package name */
        public long f5046g = 30000;

        /* renamed from: h  reason: collision with root package name */
        public List<y5.c> f5047h = Collections.emptyList();

        public Factory(e.a aVar) {
            this.f5040a = new c.a(aVar);
            this.f5041b = aVar;
        }
    }

    public class a implements x.b {
        public a() {
        }

        public void a() {
            long j10;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            synchronized (x.f26534b) {
                j10 = x.f26535c ? x.f26536d : -9223372036854775807L;
            }
            dashMediaSource.R = j10;
            dashMediaSource.C(true);
        }
    }

    public static final class b extends c1 {

        /* renamed from: b  reason: collision with root package name */
        public final long f5049b;

        /* renamed from: c  reason: collision with root package name */
        public final long f5050c;

        /* renamed from: d  reason: collision with root package name */
        public final long f5051d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5052e;

        /* renamed from: f  reason: collision with root package name */
        public final long f5053f;

        /* renamed from: g  reason: collision with root package name */
        public final long f5054g;

        /* renamed from: h  reason: collision with root package name */
        public final long f5055h;

        /* renamed from: i  reason: collision with root package name */
        public final d6.b f5056i;

        /* renamed from: j  reason: collision with root package name */
        public final e0 f5057j;

        /* renamed from: k  reason: collision with root package name */
        public final e0.f f5058k;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, d6.b bVar, e0 e0Var, e0.f fVar) {
            d6.b bVar2 = bVar;
            e0.f fVar2 = fVar;
            v6.a.d(bVar2.f13080d != (fVar2 != null) ? false : true);
            this.f5049b = j10;
            this.f5050c = j11;
            this.f5051d = j12;
            this.f5052e = i10;
            this.f5053f = j13;
            this.f5054g = j14;
            this.f5055h = j15;
            this.f5056i = bVar2;
            this.f5057j = e0Var;
            this.f5058k = fVar2;
        }

        public static boolean r(d6.b bVar) {
            return bVar.f13080d && bVar.f13081e != -9223372036854775807L && bVar.f13078b == -9223372036854775807L;
        }

        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f5052e) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        public c1.b g(int i10, c1.b bVar, boolean z10) {
            v6.a.c(i10, 0, i());
            Integer num = null;
            String str = z10 ? this.f5056i.f13089m.get(i10).f13109a : null;
            if (z10) {
                num = Integer.valueOf(this.f5052e + i10);
            }
            bVar.f(str, num, 0, x4.f.b(this.f5056i.d(i10)), x4.f.b(this.f5056i.f13089m.get(i10).f13110b - this.f5056i.b(0).f13110b) - this.f5053f);
            return bVar;
        }

        public int i() {
            return this.f5056i.c();
        }

        public Object m(int i10) {
            v6.a.c(i10, 0, i());
            return Integer.valueOf(this.f5052e + i10);
        }

        public c1.c o(int i10, c1.c cVar, long j10) {
            c6.b b10;
            v6.a.c(i10, 0, 1);
            long j11 = this.f5055h;
            if (r(this.f5056i)) {
                if (j10 > 0) {
                    j11 += j10;
                    if (j11 > this.f5054g) {
                        j11 = -9223372036854775807L;
                    }
                }
                long j12 = this.f5053f + j11;
                long e10 = this.f5056i.e(0);
                int i11 = 0;
                while (i11 < this.f5056i.c() - 1 && j12 >= e10) {
                    j12 -= e10;
                    i11++;
                    e10 = this.f5056i.e(i11);
                }
                d6.f b11 = this.f5056i.b(i11);
                int size = b11.f13111c.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        i12 = -1;
                        break;
                    } else if (b11.f13111c.get(i12).f13072b == 2) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (!(i12 == -1 || (b10 = b11.f13111c.get(i12).f13073c.get(0).b()) == null || b10.B(e10) == 0)) {
                    j11 = (b10.d(b10.h(j12, e10)) + j11) - j12;
                }
            }
            long j13 = j11;
            Object obj = c1.c.f27468r;
            e0 e0Var = this.f5057j;
            d6.b bVar = this.f5056i;
            cVar.d(obj, e0Var, bVar, this.f5049b, this.f5050c, this.f5051d, true, r(bVar), this.f5058k, j13, this.f5054g, 0, i() - 1, this.f5053f);
            return cVar;
        }

        public int p() {
            return 1;
        }
    }

    public final class c implements e.b {
        public c(a aVar) {
        }
    }

    public static final class d implements p.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f5060a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        public Object a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, aa.c.f178c)).readLine();
            try {
                Matcher matcher = f5060a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j10 = "+".equals(matcher.group(4)) ? 1 : -1;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000) * j10;
                    }
                    return Long.valueOf(time);
                }
                throw new m0("Couldn't parse timestamp: " + readLine);
            } catch (ParseException e10) {
                throw new m0((Throwable) e10);
            }
        }
    }

    public final class e implements n.b<p<d6.b>> {
        public e(a aVar) {
        }

        public void k(n.e eVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.z((p) eVar, j10, j11);
        }

        public n.c m(n.e eVar, long j10, long j11, IOException iOException, int i10) {
            n.c cVar;
            IOException iOException2 = iOException;
            p pVar = (p) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j12 = pVar.f5547a;
            u6.e eVar2 = pVar.f5548b;
            r rVar = pVar.f5550d;
            z5.k kVar = r4;
            z5.k kVar2 = new z5.k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
            k kVar3 = (k) dashMediaSource.f5034u;
            long a10 = ((iOException2 instanceof m0) || (iOException2 instanceof FileNotFoundException) || (iOException2 instanceof m.b) || (iOException2 instanceof n.h)) ? -9223372036854775807L : (long) c5.c.a(i10, -1, 1000, 5000);
            if (a10 == -9223372036854775807L) {
                cVar = n.f5530f;
            } else {
                cVar = n.c(false, a10);
            }
            boolean z10 = !cVar.a();
            dashMediaSource.f5036w.k(kVar, pVar.f5549c, iOException2, z10);
            if (z10) {
                dashMediaSource.f5034u.getClass();
            }
            return cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00d9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void n(com.google.android.exoplayer2.upstream.n.e r19, long r20, long r22) {
            /*
                r18 = this;
                r13 = r20
                r0 = r19
                com.google.android.exoplayer2.upstream.p r0 = (com.google.android.exoplayer2.upstream.p) r0
                r15 = r18
                com.google.android.exoplayer2.source.dash.DashMediaSource r11 = com.google.android.exoplayer2.source.dash.DashMediaSource.this
                r11.getClass()
                z5.k r12 = new z5.k
                long r2 = r0.f5547a
                u6.e r4 = r0.f5548b
                com.google.android.exoplayer2.upstream.r r1 = r0.f5550d
                android.net.Uri r5 = r1.f5559c
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r1.f5560d
                long r9 = r1.f5558b
                r1 = r12
                r7 = r20
                r16 = r9
                r9 = r22
                r15 = r11
                r13 = r12
                r11 = r16
                r1.<init>(r2, r4, r5, r6, r7, r9, r11)
                u6.h r1 = r15.f5034u
                r1.getClass()
                z5.v$a r1 = r15.f5036w
                int r2 = r0.f5549c
                r1.g(r13, r2)
                T r1 = r0.f5552f
                d6.b r1 = (d6.b) r1
                d6.b r2 = r15.N
                r3 = 0
                if (r2 != 0) goto L_0x0040
                r2 = 0
                goto L_0x0044
            L_0x0040:
                int r2 = r2.c()
            L_0x0044:
                d6.f r4 = r1.b(r3)
                long r4 = r4.f13110b
                r6 = 0
            L_0x004b:
                if (r6 >= r2) goto L_0x005c
                d6.b r7 = r15.N
                d6.f r7 = r7.b(r6)
                long r7 = r7.f13110b
                int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r9 >= 0) goto L_0x005c
                int r6 = r6 + 1
                goto L_0x004b
            L_0x005c:
                boolean r4 = r1.f13080d
                r5 = 1
                if (r4 == 0) goto L_0x00db
                int r4 = r2 - r6
                int r7 = r1.c()
                if (r4 <= r7) goto L_0x0071
                java.lang.String r4 = "DashMediaSource"
                java.lang.String r7 = "Loaded out of sync manifest"
                android.util.Log.w(r4, r7)
                goto L_0x00a4
            L_0x0071:
                long r7 = r15.Z
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r4 == 0) goto L_0x00a6
                long r9 = r1.f13084h
                r11 = 1000(0x3e8, double:4.94E-321)
                long r9 = r9 * r11
                int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x00a6
                java.lang.String r4 = "DashMediaSource"
                java.lang.String r7 = "Loaded stale dynamic manifest: "
                java.lang.StringBuilder r7 = android.support.v4.media.a.a(r7)
                long r8 = r1.f13084h
                r7.append(r8)
                java.lang.String r8 = ", "
                r7.append(r8)
                long r8 = r15.Z
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                android.util.Log.w(r4, r7)
            L_0x00a4:
                r4 = 1
                goto L_0x00a7
            L_0x00a6:
                r4 = 0
            L_0x00a7:
                if (r4 == 0) goto L_0x00d9
                int r1 = r15.S
                int r2 = r1 + 1
                r15.S = r2
                u6.h r2 = r15.f5034u
                int r0 = r0.f5549c
                com.google.android.exoplayer2.upstream.k r2 = (com.google.android.exoplayer2.upstream.k) r2
                int r0 = r2.a(r0)
                if (r1 >= r0) goto L_0x00d0
                int r0 = r15.S
                r1 = -1
                r2 = 1000(0x3e8, float:1.401E-42)
                r3 = 5000(0x1388, float:7.006E-42)
                int r0 = c5.c.a(r0, r1, r2, r3)
                long r0 = (long) r0
                android.os.Handler r2 = r15.J
                java.lang.Runnable r3 = r15.B
                r2.postDelayed(r3, r0)
                goto L_0x019e
            L_0x00d0:
                c6.a r0 = new c6.a
                r0.<init>()
                r15.I = r0
                goto L_0x019e
            L_0x00d9:
                r15.S = r3
            L_0x00db:
                r15.N = r1
                boolean r4 = r15.O
                boolean r1 = r1.f13080d
                r1 = r1 & r4
                r15.O = r1
                r7 = r20
                long r9 = r7 - r22
                r15.P = r9
                r15.Q = r7
                java.lang.Object r1 = r15.f5039z
                monitor-enter(r1)
                u6.e r4 = r0.f5548b     // Catch:{ all -> 0x019f }
                android.net.Uri r4 = r4.f26048a     // Catch:{ all -> 0x019f }
                android.net.Uri r7 = r15.L     // Catch:{ all -> 0x019f }
                if (r4 != r7) goto L_0x00f8
                r3 = 1
            L_0x00f8:
                if (r3 == 0) goto L_0x0107
                d6.b r3 = r15.N     // Catch:{ all -> 0x019f }
                android.net.Uri r3 = r3.f13087k     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x0101
                goto L_0x0105
            L_0x0101:
                com.google.android.exoplayer2.upstream.r r0 = r0.f5550d     // Catch:{ all -> 0x019f }
                android.net.Uri r3 = r0.f5559c     // Catch:{ all -> 0x019f }
            L_0x0105:
                r15.L = r3     // Catch:{ all -> 0x019f }
            L_0x0107:
                monitor-exit(r1)     // Catch:{ all -> 0x019f }
                if (r2 != 0) goto L_0x0196
                d6.b r0 = r15.N
                boolean r1 = r0.f13080d
                if (r1 == 0) goto L_0x0192
                d6.m r0 = r0.f13085i
                if (r0 == 0) goto L_0x018e
                java.lang.String r1 = r0.f13158b
                java.lang.String r2 = "urn:mpeg:dash:utc:direct:2014"
                boolean r2 = v6.e0.a(r1, r2)
                if (r2 != 0) goto L_0x017c
                java.lang.String r2 = "urn:mpeg:dash:utc:direct:2012"
                boolean r2 = v6.e0.a(r1, r2)
                if (r2 == 0) goto L_0x0127
                goto L_0x017c
            L_0x0127:
                java.lang.String r2 = "urn:mpeg:dash:utc:http-iso:2014"
                boolean r2 = v6.e0.a(r1, r2)
                if (r2 != 0) goto L_0x0173
                java.lang.String r2 = "urn:mpeg:dash:utc:http-iso:2012"
                boolean r2 = v6.e0.a(r1, r2)
                if (r2 == 0) goto L_0x0138
                goto L_0x0173
            L_0x0138:
                java.lang.String r2 = "urn:mpeg:dash:utc:http-xsdate:2014"
                boolean r2 = v6.e0.a(r1, r2)
                if (r2 != 0) goto L_0x0169
                java.lang.String r2 = "urn:mpeg:dash:utc:http-xsdate:2012"
                boolean r2 = v6.e0.a(r1, r2)
                if (r2 == 0) goto L_0x0149
                goto L_0x0169
            L_0x0149:
                java.lang.String r0 = "urn:mpeg:dash:utc:ntp:2014"
                boolean r0 = v6.e0.a(r1, r0)
                if (r0 != 0) goto L_0x0165
                java.lang.String r0 = "urn:mpeg:dash:utc:ntp:2012"
                boolean r0 = v6.e0.a(r1, r0)
                if (r0 == 0) goto L_0x015a
                goto L_0x0165
            L_0x015a:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Unsupported UTC timing scheme"
                r0.<init>(r1)
                r15.A(r0)
                goto L_0x019e
            L_0x0165:
                r15.y()
                goto L_0x019e
            L_0x0169:
                com.google.android.exoplayer2.source.dash.DashMediaSource$h r1 = new com.google.android.exoplayer2.source.dash.DashMediaSource$h
                r2 = 0
                r1.<init>(r2)
                r15.D(r0, r1)
                goto L_0x019e
            L_0x0173:
                com.google.android.exoplayer2.source.dash.DashMediaSource$d r1 = new com.google.android.exoplayer2.source.dash.DashMediaSource$d
                r1.<init>()
                r15.D(r0, r1)
                goto L_0x019e
            L_0x017c:
                java.lang.String r0 = r0.f13159c     // Catch:{ m0 -> 0x0189 }
                long r0 = v6.e0.M(r0)     // Catch:{ m0 -> 0x0189 }
                long r2 = r15.Q     // Catch:{ m0 -> 0x0189 }
                long r0 = r0 - r2
                r15.B(r0)     // Catch:{ m0 -> 0x0189 }
                goto L_0x019e
            L_0x0189:
                r0 = move-exception
                r15.A(r0)
                goto L_0x019e
            L_0x018e:
                r15.y()
                goto L_0x019e
            L_0x0192:
                r15.C(r5)
                goto L_0x019e
            L_0x0196:
                int r0 = r15.f5027a0
                int r0 = r0 + r6
                r15.f5027a0 = r0
                r15.C(r5)
            L_0x019e:
                return
            L_0x019f:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x019f }
                goto L_0x01a3
            L_0x01a2:
                throw r0
            L_0x01a3:
                goto L_0x01a2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.e.n(com.google.android.exoplayer2.upstream.n$e, long, long):void");
        }
    }

    public final class f implements o {
        public f() {
        }

        public void b() throws IOException {
            DashMediaSource.this.G.f(Integer.MIN_VALUE);
            IOException iOException = DashMediaSource.this.I;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final class g implements n.b<p<Long>> {
        public g(a aVar) {
        }

        public void k(n.e eVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.z((p) eVar, j10, j11);
        }

        public n.c m(n.e eVar, long j10, long j11, IOException iOException, int i10) {
            IOException iOException2 = iOException;
            p pVar = (p) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            v.a aVar = dashMediaSource.f5036w;
            long j12 = pVar.f5547a;
            u6.e eVar2 = pVar.f5548b;
            r rVar = pVar.f5550d;
            z5.k kVar = r5;
            z5.k kVar2 = new z5.k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
            aVar.k(kVar, pVar.f5549c, iOException2, true);
            dashMediaSource.f5034u.getClass();
            dashMediaSource.A(iOException2);
            return n.f5529e;
        }

        public void n(n.e eVar, long j10, long j11) {
            p pVar = (p) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j12 = pVar.f5547a;
            u6.e eVar2 = pVar.f5548b;
            r rVar = pVar.f5550d;
            z5.k kVar = new z5.k(j12, eVar2, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
            dashMediaSource.f5034u.getClass();
            dashMediaSource.f5036w.g(kVar, pVar.f5549c);
            dashMediaSource.B(((Long) pVar.f5552f).longValue() - j10);
        }
    }

    public static final class h implements p.a<Long> {
        public h(a aVar) {
        }

        public Object a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(v6.e0.M(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        z.a("goog.exo.dash");
    }

    public DashMediaSource(e0 e0Var, d6.b bVar, e.a aVar, p.a aVar2, a.C0075a aVar3, a0 a0Var, l lVar, u6.h hVar, long j10, a aVar4) {
        this.f5028g = e0Var;
        this.K = e0Var.f27505c;
        e0.g gVar = e0Var.f27504b;
        gVar.getClass();
        this.L = gVar.f27554a;
        this.M = e0Var.f27504b.f27554a;
        this.f5030i = aVar;
        this.f5037x = aVar2;
        this.f5031r = aVar3;
        this.f5033t = lVar;
        this.f5034u = hVar;
        this.f5035v = j10;
        this.f5032s = a0Var;
        this.f5029h = false;
        this.f5036w = r((r.a) null);
        this.f5039z = new Object();
        this.A = new SparseArray<>();
        this.D = new c((a) null);
        this.Z = -9223372036854775807L;
        this.R = -9223372036854775807L;
        this.f5038y = new e((a) null);
        this.E = new f();
        this.B = new androidx.activity.c(this);
        this.C = new androidx.activity.f(this);
    }

    public static boolean x(d6.f fVar) {
        for (int i10 = 0; i10 < fVar.f13111c.size(); i10++) {
            int i11 = fVar.f13111c.get(i10).f13072b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(IOException iOException) {
        v6.p.b("DashMediaSource", "Failed to resolve time offset.", iOException);
        C(true);
    }

    public final void B(long j10) {
        this.R = j10;
        C(true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0259, code lost:
        if (r2 != -9223372036854775807L) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0461, code lost:
        if (r9 > 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0464, code lost:
        if (r12 > 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0467, code lost:
        if (r12 < 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0116, code lost:
        if (r1.f13072b != 3) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017c, code lost:
        if (r12.f13072b != 3) goto L_0x0182;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0224  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(boolean r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = 0
            r2 = 0
        L_0x0004:
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.b> r3 = r0.A
            int r3 = r3.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 >= r3) goto L_0x00c8
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.b> r3 = r0.A
            int r3 = r3.keyAt(r2)
            int r7 = r0.f5027a0
            if (r3 < r7) goto L_0x00c4
            android.util.SparseArray<com.google.android.exoplayer2.source.dash.b> r7 = r0.A
            java.lang.Object r7 = r7.valueAt(r2)
            com.google.android.exoplayer2.source.dash.b r7 = (com.google.android.exoplayer2.source.dash.b) r7
            d6.b r8 = r0.N
            int r9 = r0.f5027a0
            int r3 = r3 - r9
            r7.B = r8
            r7.C = r3
            com.google.android.exoplayer2.source.dash.e r9 = r7.f5075t
            r9.f5123i = r1
            r9.f5121g = r4
            r9.f5120f = r8
            java.util.TreeMap<java.lang.Long, java.lang.Long> r4 = r9.f5119e
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x003f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getKey()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            d6.b r5 = r9.f5120f
            long r12 = r5.f13084h
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x003f
            r4.remove()
            goto L_0x003f
        L_0x0061:
            com.google.android.exoplayer2.source.chunk.ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] r4 = r7.f5080y
            if (r4 == 0) goto L_0x007a
            int r5 = r4.length
            r9 = 0
        L_0x0067:
            if (r9 >= r5) goto L_0x0075
            r10 = r4[r9]
            T r10 = r10.f3604e
            com.google.android.exoplayer2.source.dash.a r10 = (com.google.android.exoplayer2.source.dash.a) r10
            r10.f(r8, r3)
            int r9 = r9 + 1
            goto L_0x0067
        L_0x0075:
            z5.o$a r4 = r7.f5079x
            r4.d(r7)
        L_0x007a:
            java.util.List<d6.f> r4 = r8.f13089m
            java.lang.Object r4 = r4.get(r3)
            d6.f r4 = (d6.f) r4
            java.util.List<d6.e> r4 = r4.f13112d
            r7.D = r4
            com.google.android.exoplayer2.source.dash.d[] r4 = r7.f5081z
            int r5 = r4.length
            r9 = 0
        L_0x008a:
            if (r9 >= r5) goto L_0x00c4
            r10 = r4[r9]
            java.util.List<d6.e> r11 = r7.D
            java.util.Iterator r11 = r11.iterator()
        L_0x0094:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00c1
            java.lang.Object r12 = r11.next()
            d6.e r12 = (d6.e) r12
            java.lang.String r13 = r12.a()
            d6.e r14 = r10.f5111e
            java.lang.String r14 = r14.a()
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x0094
            int r11 = r8.c()
            int r11 = r11 - r6
            boolean r13 = r8.f13080d
            if (r13 == 0) goto L_0x00bd
            if (r3 != r11) goto L_0x00bd
            r11 = 1
            goto L_0x00be
        L_0x00bd:
            r11 = 0
        L_0x00be:
            r10.c(r12, r11)
        L_0x00c1:
            int r9 = r9 + 1
            goto L_0x008a
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x00c8:
            d6.b r2 = r0.N
            d6.f r2 = r2.b(r1)
            d6.b r3 = r0.N
            int r3 = r3.c()
            int r3 = r3 - r6
            d6.b r7 = r0.N
            d6.f r7 = r7.b(r3)
            d6.b r8 = r0.N
            long r8 = r8.e(r3)
            long r10 = r0.R
            long r10 = v6.e0.w(r10)
            long r10 = x4.f.b(r10)
            d6.b r3 = r0.N
            long r12 = r3.e(r1)
            long r14 = r2.f13110b
            long r14 = x4.f.b(r14)
            boolean r3 = x(r2)
            r4 = r14
            r6 = 0
        L_0x00fd:
            java.util.List<d6.a> r1 = r2.f13111c
            int r1 = r1.size()
            if (r6 >= r1) goto L_0x014f
            java.util.List<d6.a> r1 = r2.f13111c
            java.lang.Object r1 = r1.get(r6)
            d6.a r1 = (d6.a) r1
            java.util.List<d6.i> r0 = r1.f13073c
            if (r3 == 0) goto L_0x0119
            int r1 = r1.f13072b
            r19 = r3
            r3 = 3
            if (r1 == r3) goto L_0x0121
            goto L_0x011b
        L_0x0119:
            r19 = r3
        L_0x011b:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0123
        L_0x0121:
            r3 = r2
            goto L_0x0147
        L_0x0123:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            d6.i r0 = (d6.i) r0
            c6.b r0 = r0.b()
            if (r0 != 0) goto L_0x0131
            goto L_0x0137
        L_0x0131:
            int r1 = r0.C(r12, r10)
            if (r1 != 0) goto L_0x0139
        L_0x0137:
            r3 = r2
            goto L_0x0151
        L_0x0139:
            r3 = r2
            long r1 = r0.n(r12, r10)
            long r0 = r0.d(r1)
            long r0 = r0 + r14
            long r4 = java.lang.Math.max(r4, r0)
        L_0x0147:
            int r6 = r6 + 1
            r0 = r38
            r2 = r3
            r3 = r19
            goto L_0x00fd
        L_0x014f:
            r3 = r2
            r14 = r4
        L_0x0151:
            long r0 = r7.f13110b
            long r0 = x4.f.b(r0)
            boolean r2 = x(r7)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
        L_0x0161:
            java.util.List<d6.a> r12 = r7.f13111c
            int r12 = r12.size()
            r19 = 1
            if (r6 >= r12) goto L_0x01c5
            java.util.List<d6.a> r12 = r7.f13111c
            java.lang.Object r12 = r12.get(r6)
            d6.a r12 = (d6.a) r12
            java.util.List<d6.i> r13 = r12.f13073c
            if (r2 == 0) goto L_0x017f
            int r12 = r12.f13072b
            r21 = r2
            r2 = 3
            if (r12 == r2) goto L_0x0188
            goto L_0x0182
        L_0x017f:
            r21 = r2
            r2 = 3
        L_0x0182:
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L_0x018b
        L_0x0188:
            r18 = r3
            goto L_0x01be
        L_0x018b:
            r12 = 0
            java.lang.Object r13 = r13.get(r12)
            d6.i r13 = (d6.i) r13
            c6.b r12 = r13.b()
            if (r12 != 0) goto L_0x019a
            long r0 = r0 + r8
            goto L_0x01a0
        L_0x019a:
            int r13 = r12.C(r8, r10)
            if (r13 != 0) goto L_0x01a2
        L_0x01a0:
            r4 = r0
            goto L_0x01c5
        L_0x01a2:
            long r22 = r12.n(r8, r10)
            r18 = r3
            long r2 = (long) r13
            long r22 = r22 + r2
            long r2 = r22 - r19
            long r19 = r12.d(r2)
            long r19 = r19 + r0
            long r2 = r12.l(r2, r8)
            long r2 = r2 + r19
            long r2 = java.lang.Math.min(r4, r2)
            r4 = r2
        L_0x01be:
            int r6 = r6 + 1
            r3 = r18
            r2 = r21
            goto L_0x0161
        L_0x01c5:
            r18 = r3
            r0 = r38
            d6.b r1 = r0.N
            boolean r1 = r1.f13080d
            if (r1 == 0) goto L_0x0200
            r1 = 0
        L_0x01d0:
            java.util.List<d6.a> r2 = r7.f13111c
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x01fb
            java.util.List<d6.a> r2 = r7.f13111c
            java.lang.Object r2 = r2.get(r1)
            d6.a r2 = (d6.a) r2
            java.util.List<d6.i> r2 = r2.f13073c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            d6.i r2 = (d6.i) r2
            c6.b r2 = r2.b()
            if (r2 == 0) goto L_0x01f9
            boolean r2 = r2.w()
            if (r2 == 0) goto L_0x01f6
            goto L_0x01f9
        L_0x01f6:
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x01f9:
            r1 = 1
            goto L_0x01fc
        L_0x01fb:
            r1 = 0
        L_0x01fc:
            if (r1 != 0) goto L_0x0200
            r1 = 1
            goto L_0x0201
        L_0x0200:
            r1 = 0
        L_0x0201:
            if (r1 == 0) goto L_0x021a
            d6.b r2 = r0.N
            long r2 = r2.f13082f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x021a
            long r2 = x4.f.b(r2)
            long r2 = r4 - r2
            long r14 = java.lang.Math.max(r14, r2)
        L_0x021a:
            long r31 = r4 - r14
            d6.b r2 = r0.N
            boolean r3 = r2.f13080d
            r4 = 0
            if (r3 == 0) goto L_0x0347
            long r2 = r2.f13077a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0231
            r2 = 1
            goto L_0x0232
        L_0x0231:
            r2 = 0
        L_0x0232:
            v6.a.d(r2)
            d6.b r2 = r0.N
            long r2 = r2.f13077a
            long r2 = x4.f.b(r2)
            long r10 = r10 - r2
            long r10 = r10 - r14
            x4.e0 r2 = r0.f5028g
            x4.e0$f r2 = r2.f27505c
            long r2 = r2.f27551c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x024f
            goto L_0x0260
        L_0x024f:
            d6.b r2 = r0.N
            d6.k r2 = r2.f13086j
            if (r2 == 0) goto L_0x025c
            long r2 = r2.f13150c
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x025c
            goto L_0x0260
        L_0x025c:
            long r2 = x4.f.c(r10)
        L_0x0260:
            x4.e0 r8 = r0.f5028g
            x4.e0$f r8 = r8.f27505c
            long r8 = r8.f27550b
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x026d
            r12 = r6
            r6 = r8
            goto L_0x02a1
        L_0x026d:
            d6.b r8 = r0.N
            d6.k r8 = r8.f13086j
            if (r8 == 0) goto L_0x0280
            long r8 = r8.f13149b
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0280
            r6 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02a1
        L_0x0280:
            long r6 = r10 - r31
            long r6 = x4.f.c(r6)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x028f
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x028f
            r6 = r4
        L_0x028f:
            d6.b r8 = r0.N
            long r8 = r8.f13079c
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r16 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x02a1
            long r6 = r6 + r8
            long r6 = java.lang.Math.min(r6, r2)
        L_0x02a1:
            x4.e0$f r8 = r0.K
            long r8 = r8.f27549a
            int r16 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r16 == 0) goto L_0x02aa
            goto L_0x02c1
        L_0x02aa:
            d6.b r8 = r0.N
            d6.k r9 = r8.f13086j
            if (r9 == 0) goto L_0x02b8
            long r4 = r9.f13148a
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x02b8
            r8 = r4
            goto L_0x02c1
        L_0x02b8:
            long r8 = r8.f13083g
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x02bf
            goto L_0x02c1
        L_0x02bf:
            long r8 = r0.f5035v
        L_0x02c1:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x02c6
            r8 = r6
        L_0x02c6:
            r4 = 2
            r12 = 5000000(0x4c4b40, double:2.470328E-317)
            int r21 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r21 <= 0) goto L_0x02e3
            long r8 = r31 / r4
            long r8 = java.lang.Math.min(r12, r8)
            long r8 = r10 - r8
            long r21 = x4.f.c(r8)
            r23 = r6
            r25 = r2
            long r8 = v6.e0.j(r21, r23, r25)
        L_0x02e3:
            r22 = r8
            x4.e0 r8 = r0.f5028g
            x4.e0$f r8 = r8.f27505c
            float r9 = r8.f27552d
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r24 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r24 == 0) goto L_0x02f3
            goto L_0x02fb
        L_0x02f3:
            d6.b r9 = r0.N
            d6.k r9 = r9.f13086j
            if (r9 == 0) goto L_0x02fe
            float r9 = r9.f13151d
        L_0x02fb:
            r28 = r9
            goto L_0x0301
        L_0x02fe:
            r28 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0301:
            float r8 = r8.f27553e
            int r9 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r9 == 0) goto L_0x0308
            goto L_0x0310
        L_0x0308:
            d6.b r8 = r0.N
            d6.k r8 = r8.f13086j
            if (r8 == 0) goto L_0x0313
            float r8 = r8.f13152e
        L_0x0310:
            r29 = r8
            goto L_0x0316
        L_0x0313:
            r29 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0316:
            x4.e0$f r8 = new x4.e0$f
            r21 = r8
            r24 = r6
            r26 = r2
            r21.<init>(r22, r24, r26, r28, r29)
            r0.K = r8
            d6.b r2 = r0.N
            long r2 = r2.f13077a
            long r6 = x4.f.c(r14)
            long r6 = r6 + r2
            x4.e0$f r2 = r0.K
            long r2 = r2.f27549a
            long r2 = x4.f.b(r2)
            long r10 = r10 - r2
            long r2 = r31 / r4
            long r2 = java.lang.Math.min(r12, r2)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0340
            r10 = r2
        L_0x0340:
            r24 = r6
            r33 = r10
            r2 = r18
            goto L_0x0350
        L_0x0347:
            r2 = r18
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = 0
        L_0x0350:
            long r2 = r2.f13110b
            long r2 = x4.f.b(r2)
            long r29 = r14 - r2
            com.google.android.exoplayer2.source.dash.DashMediaSource$b r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$b
            d6.b r3 = r0.N
            long r4 = r3.f13077a
            long r6 = r0.R
            int r8 = r0.f5027a0
            x4.e0 r9 = r0.f5028g
            boolean r10 = r3.f13080d
            if (r10 == 0) goto L_0x036b
            x4.e0$f r10 = r0.K
            goto L_0x036c
        L_0x036b:
            r10 = 0
        L_0x036c:
            r37 = r10
            r21 = r2
            r22 = r4
            r26 = r6
            r28 = r8
            r35 = r3
            r36 = r9
            r21.<init>(r22, r24, r26, r28, r29, r31, r33, r35, r36, r37)
            r0.v(r2)
            boolean r2 = r0.f5029h
            if (r2 != 0) goto L_0x04bc
            android.os.Handler r2 = r0.J
            java.lang.Runnable r3 = r0.C
            r2.removeCallbacks(r3)
            r2 = 5000(0x1388, double:2.4703E-320)
            if (r1 == 0) goto L_0x0486
            android.os.Handler r1 = r0.J
            java.lang.Runnable r4 = r0.C
            d6.b r5 = r0.N
            long r6 = r0.R
            long r6 = v6.e0.w(r6)
            int r8 = r5.c()
            r9 = 1
            int r8 = r8 - r9
            d6.f r9 = r5.b(r8)
            long r10 = r9.f13110b
            long r10 = x4.f.b(r10)
            long r12 = r5.e(r8)
            long r6 = x4.f.b(r6)
            long r14 = r5.f13077a
            long r14 = x4.f.b(r14)
            long r21 = x4.f.b(r2)
            r5 = 0
        L_0x03be:
            java.util.List<d6.a> r8 = r9.f13111c
            int r8 = r8.size()
            if (r5 >= r8) goto L_0x0409
            java.util.List<d6.a> r8 = r9.f13111c
            java.lang.Object r8 = r8.get(r5)
            d6.a r8 = (d6.a) r8
            java.util.List<d6.i> r8 = r8.f13073c
            boolean r18 = r8.isEmpty()
            if (r18 == 0) goto L_0x03d8
            r2 = 0
            goto L_0x0404
        L_0x03d8:
            r2 = 0
            java.lang.Object r3 = r8.get(r2)
            d6.i r3 = (d6.i) r3
            c6.b r3 = r3.b()
            if (r3 == 0) goto L_0x0404
            long r17 = r14 + r10
            long r25 = r3.t(r12, r6)
            long r25 = r25 + r17
            long r25 = r25 - r6
            r17 = 100000(0x186a0, double:4.94066E-319)
            long r27 = r21 - r17
            int r3 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r3 < 0) goto L_0x0402
            int r3 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x0404
            long r17 = r21 + r17
            int r3 = (r25 > r17 ? 1 : (r25 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x0404
        L_0x0402:
            r21 = r25
        L_0x0404:
            int r5 = r5 + 1
            r2 = 5000(0x1388, double:2.4703E-320)
            goto L_0x03be
        L_0x0409:
            r2 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            r3.getClass()
            long r7 = r21 / r5
            long r9 = r7 * r5
            long r9 = r21 - r9
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x041e
            goto L_0x047a
        L_0x041e:
            long r11 = r21 ^ r5
            r13 = 63
            long r11 = r11 >> r13
            int r12 = (int) r11
            r11 = 1
            r12 = r12 | r11
            int[] r13 = ca.a.f4366a
            int r14 = r3.ordinal()
            r13 = r13[r14]
            switch(r13) {
                case 1: goto L_0x046b;
                case 2: goto L_0x0476;
                case 3: goto L_0x0467;
                case 4: goto L_0x0469;
                case 5: goto L_0x0464;
                case 6: goto L_0x0437;
                case 7: goto L_0x0437;
                case 8: goto L_0x0437;
                default: goto L_0x0431;
            }
        L_0x0431:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0437:
            long r9 = java.lang.Math.abs(r9)
            long r5 = java.lang.Math.abs(r5)
            long r5 = r5 - r9
            long r9 = r9 - r5
            r5 = 0
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x045f
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            if (r3 != r9) goto L_0x044d
            r9 = 1
            goto L_0x044e
        L_0x044d:
            r9 = 0
        L_0x044e:
            java.math.RoundingMode r10 = java.math.RoundingMode.HALF_EVEN
            if (r3 != r10) goto L_0x0454
            r3 = 1
            goto L_0x0455
        L_0x0454:
            r3 = 0
        L_0x0455:
            long r13 = r7 & r19
            int r10 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x045c
            r2 = 1
        L_0x045c:
            r2 = r2 & r3
            r2 = r2 | r9
            goto L_0x0476
        L_0x045f:
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0476
            goto L_0x0469
        L_0x0464:
            if (r12 <= 0) goto L_0x0476
            goto L_0x0469
        L_0x0467:
            if (r12 >= 0) goto L_0x0476
        L_0x0469:
            r2 = 1
            goto L_0x0476
        L_0x046b:
            r5 = 0
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0473
            r6 = 1
            goto L_0x0474
        L_0x0473:
            r6 = 0
        L_0x0474:
            if (r6 == 0) goto L_0x047e
        L_0x0476:
            if (r2 == 0) goto L_0x047a
            long r2 = (long) r12
            long r7 = r7 + r2
        L_0x047a:
            r1.postDelayed(r4, r7)
            goto L_0x0486
        L_0x047e:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "mode was UNNECESSARY, but rounding was necessary"
            r1.<init>(r2)
            throw r1
        L_0x0486:
            boolean r1 = r0.O
            if (r1 == 0) goto L_0x048e
            r38.F()
            goto L_0x04bc
        L_0x048e:
            if (r39 == 0) goto L_0x04bc
            d6.b r1 = r0.N
            boolean r2 = r1.f13080d
            if (r2 == 0) goto L_0x04bc
            long r1 = r1.f13081e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x04bc
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x04a9
            r1 = 5000(0x1388, double:2.4703E-320)
        L_0x04a9:
            long r5 = r0.P
            long r5 = r5 + r1
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            long r1 = java.lang.Math.max(r3, r5)
            android.os.Handler r3 = r0.J
            java.lang.Runnable r4 = r0.B
            r3.postDelayed(r4, r1)
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.C(boolean):void");
    }

    public final void D(d6.m mVar, p.a<Long> aVar) {
        E(new p(this.F, Uri.parse(mVar.f13159c), 5, aVar), new g((a) null), 1);
    }

    public final <T> void E(p<T> pVar, n.b<p<T>> bVar, int i10) {
        this.f5036w.m(new z5.k(pVar.f5547a, pVar.f5548b, this.G.h(pVar, bVar, i10)), pVar.f5549c);
    }

    public final void F() {
        Uri uri;
        this.J.removeCallbacks(this.B);
        if (!this.G.d()) {
            if (this.G.e()) {
                this.O = true;
                return;
            }
            synchronized (this.f5039z) {
                uri = this.L;
            }
            this.O = false;
            E(new p(this.F, uri, 4, this.f5037x), this.f5038y, ((k) this.f5034u).a(4));
        }
    }

    public e0 a() {
        return this.f5028g;
    }

    public void c() throws IOException {
        this.E.b();
    }

    public void g(z5.o oVar) {
        b bVar = (b) oVar;
        e eVar = bVar.f5075t;
        eVar.f5124r = true;
        eVar.f5118d.removeCallbacksAndMessages((Object) null);
        for (b6.h w10 : bVar.f5080y) {
            w10.w(bVar);
        }
        bVar.f5079x = null;
        this.A.remove(bVar.f5064a);
    }

    public z5.o o(r.a aVar, u6.f fVar, long j10) {
        r.a aVar2 = aVar;
        int intValue = ((Integer) aVar2.f28627a).intValue() - this.f5027a0;
        v.a r10 = this.f28511c.r(0, aVar2, this.N.b(intValue).f13110b);
        j.a g10 = this.f28512d.g(0, aVar2);
        int i10 = this.f5027a0 + intValue;
        d6.b bVar = this.N;
        a.C0075a aVar3 = this.f5031r;
        i iVar = this.H;
        l lVar = this.f5033t;
        u6.h hVar = this.f5034u;
        long j11 = this.R;
        o oVar = this.E;
        a0 a0Var = this.f5032s;
        b bVar2 = new b(i10, bVar, intValue, aVar3, iVar, lVar, g10, hVar, r10, j11, oVar, fVar, a0Var, this.D);
        this.A.put(i10, bVar2);
        return bVar2;
    }

    public void u(i iVar) {
        this.H = iVar;
        this.f5033t.b();
        if (this.f5029h) {
            C(false);
            return;
        }
        this.F = this.f5030i.a();
        this.G = new n("Loader:DashMediaSource");
        this.J = v6.e0.l();
        F();
    }

    public void w() {
        this.O = false;
        this.F = null;
        n nVar = this.G;
        if (nVar != null) {
            nVar.g((n.f) null);
            this.G = null;
        }
        this.P = 0;
        this.Q = 0;
        this.N = this.f5029h ? this.N : null;
        this.L = this.M;
        this.I = null;
        Handler handler = this.J;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.J = null;
        }
        this.R = -9223372036854775807L;
        this.S = 0;
        this.Z = -9223372036854775807L;
        this.f5027a0 = 0;
        this.A.clear();
        this.f5033t.a();
    }

    public final void y() {
        boolean z10;
        n nVar = this.G;
        a aVar = new a();
        synchronized (x.f26534b) {
            z10 = x.f26535c;
        }
        if (z10) {
            aVar.a();
            return;
        }
        if (nVar == null) {
            nVar = new n("SntpClient");
        }
        nVar.h(new x.d((x.a) null), new x.c(aVar), 1);
    }

    public void z(p<?> pVar, long j10, long j11) {
        p<?> pVar2 = pVar;
        long j12 = pVar2.f5547a;
        u6.e eVar = pVar2.f5548b;
        com.google.android.exoplayer2.upstream.r rVar = pVar2.f5550d;
        z5.k kVar = new z5.k(j12, eVar, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f5034u.getClass();
        this.f5036w.d(kVar, pVar2.f5549c);
    }
}
