package me;

import ke.d0;
import ke.t;

/* compiled from: CacheInterceptor */
public final class b implements t {

    /* renamed from: a  reason: collision with root package name */
    public final e f21802a;

    public b(e eVar) {
        this.f21802a = eVar;
    }

    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static d0 d(d0 d0Var) {
        if (d0Var == null || d0Var.f20670g == null) {
            return d0Var;
        }
        d0.a aVar = new d0.a(d0Var);
        aVar.f20683g = null;
        return aVar.a();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ke.d0, ke.z] */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        if (r4 > 0) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x028a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ke.d0 a(ke.t.a r27) throws java.io.IOException {
        /*
            r26 = this;
            r1 = r26
            me.e r0 = r1.f21802a
            if (r0 == 0) goto L_0x0012
            r3 = r27
            oe.f r3 = (oe.f) r3
            ke.z r3 = r3.f23704f
            ke.d0 r0 = r0.b(r3)
            r3 = r0
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            long r4 = java.lang.System.currentTimeMillis()
            r0 = r27
            oe.f r0 = (oe.f) r0
            ke.z r6 = r0.f23704f
            if (r3 == 0) goto L_0x008b
            long r11 = r3.f20674s
            long r13 = r3.f20675t
            ke.r r15 = r3.f20669f
            int r7 = r15.g()
            r9 = 0
            r10 = -1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0037:
            if (r9 >= r7) goto L_0x009c
            java.lang.String r2 = r15.d(r9)
            java.lang.String r8 = r15.h(r9)
            r22 = r7
            java.lang.String r7 = "Date"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0052
            java.util.Date r16 = oe.d.a(r8)
            r21 = r8
            goto L_0x0086
        L_0x0052:
            java.lang.String r7 = "Expires"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x005f
            java.util.Date r17 = oe.d.a(r8)
            goto L_0x0086
        L_0x005f:
            java.lang.String r7 = "Last-Modified"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x006e
            java.util.Date r18 = oe.d.a(r8)
            r20 = r8
            goto L_0x0086
        L_0x006e:
            java.lang.String r7 = "ETag"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0079
            r19 = r8
            goto L_0x0086
        L_0x0079:
            java.lang.String r7 = "Age"
            boolean r2 = r7.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0086
            r2 = -1
            int r10 = oe.e.c(r8, r2)
        L_0x0086:
            int r9 = r9 + 1
            r7 = r22
            goto L_0x0037
        L_0x008b:
            r10 = -1
            r11 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x009c:
            java.lang.String r2 = "Warning"
            if (r3 != 0) goto L_0x00a7
            me.d r4 = new me.d
            r8 = 0
            r4.<init>(r6, r8)
            goto L_0x00c9
        L_0x00a7:
            r8 = 0
            ke.s r9 = r6.f20880a
            java.lang.String r9 = r9.f20782a
            java.lang.String r15 = "https"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x00be
            ke.q r9 = r3.f20668e
            if (r9 != 0) goto L_0x00be
            me.d r4 = new me.d
            r4.<init>(r6, r8)
            goto L_0x00c9
        L_0x00be:
            boolean r9 = me.d.a(r3, r6)
            if (r9 != 0) goto L_0x00cf
            me.d r4 = new me.d
            r4.<init>(r6, r8)
        L_0x00c9:
            r25 = r0
            r0 = r6
        L_0x00cc:
            r1 = 0
            goto L_0x0261
        L_0x00cf:
            ke.c r8 = r6.a()
            boolean r9 = r8.f20648a
            if (r9 != 0) goto L_0x0258
            ke.r r9 = r6.f20882c
            java.lang.String r15 = "If-Modified-Since"
            java.lang.String r9 = r9.c(r15)
            java.lang.String r7 = "If-None-Match"
            if (r9 != 0) goto L_0x00ee
            ke.r r9 = r6.f20882c
            java.lang.String r9 = r9.c(r7)
            if (r9 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r9 = 0
            goto L_0x00ef
        L_0x00ee:
            r9 = 1
        L_0x00ef:
            if (r9 == 0) goto L_0x00f3
            goto L_0x0258
        L_0x00f3:
            ke.c r9 = r3.a()
            if (r16 == 0) goto L_0x010c
            long r23 = r16.getTime()
            r25 = r0
            long r0 = r13 - r23
            r23 = r6
            r24 = r7
            r6 = 0
            long r0 = java.lang.Math.max(r6, r0)
            goto L_0x0114
        L_0x010c:
            r25 = r0
            r23 = r6
            r24 = r7
            r0 = 0
        L_0x0114:
            r6 = -1
            if (r10 == r6) goto L_0x0124
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            long r9 = (long) r10
            long r9 = r6.toMillis(r9)
            long r0 = java.lang.Math.max(r0, r9)
            goto L_0x0125
        L_0x0124:
            r7 = r9
        L_0x0125:
            long r9 = r13 - r11
            long r4 = r4 - r13
            long r0 = r0 + r9
            long r0 = r0 + r4
            ke.c r4 = r3.a()
            int r4 = r4.f20650c
            r5 = -1
            if (r4 == r5) goto L_0x013b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = (long) r4
            long r4 = r5.toMillis(r9)
            goto L_0x014e
        L_0x013b:
            if (r17 == 0) goto L_0x0152
            if (r16 == 0) goto L_0x0143
            long r13 = r16.getTime()
        L_0x0143:
            long r4 = r17.getTime()
            long r4 = r4 - r13
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0184
        L_0x014e:
            r9 = r4
            r4 = 0
            goto L_0x0187
        L_0x0152:
            if (r18 == 0) goto L_0x0184
            ke.z r4 = r3.f20664a
            ke.s r4 = r4.f20880a
            java.util.List<java.lang.String> r5 = r4.f20788g
            if (r5 != 0) goto L_0x015e
            r4 = 0
            goto L_0x016c
        L_0x015e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.List<java.lang.String> r4 = r4.f20788g
            ke.s.j(r5, r4)
            java.lang.String r4 = r5.toString()
        L_0x016c:
            if (r4 != 0) goto L_0x0184
            if (r16 == 0) goto L_0x0174
            long r11 = r16.getTime()
        L_0x0174:
            long r4 = r18.getTime()
            long r11 = r11 - r4
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0186
            r9 = 10
            long r9 = r11 / r9
            goto L_0x0187
        L_0x0184:
            r4 = 0
        L_0x0186:
            r9 = r4
        L_0x0187:
            int r6 = r8.f20650c
            r11 = -1
            if (r6 == r11) goto L_0x0197
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r6
            long r12 = r12.toMillis(r13)
            long r9 = java.lang.Math.min(r9, r12)
        L_0x0197:
            int r6 = r8.f20656i
            if (r6 == r11) goto L_0x01a3
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r6
            long r12 = r12.toMillis(r13)
            goto L_0x01a4
        L_0x01a3:
            r12 = r4
        L_0x01a4:
            boolean r6 = r7.f20654g
            if (r6 != 0) goto L_0x01b3
            int r6 = r8.f20655h
            if (r6 == r11) goto L_0x01b3
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = (long) r6
            long r4 = r4.toMillis(r5)
        L_0x01b3:
            boolean r6 = r7.f20648a
            if (r6 != 0) goto L_0x01fa
            long r12 = r12 + r0
            long r4 = r4 + r9
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01fa
            ke.d0$a r4 = new ke.d0$a
            r4.<init>(r3)
            int r5 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x01cd
            ke.r$a r5 = r4.f20682f
            java.lang.String r6 = "110 HttpURLConnection \"Response is stale\""
            r5.a(r2, r6)
        L_0x01cd:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x01eb
            ke.c r0 = r3.a()
            int r0 = r0.f20650c
            r1 = -1
            if (r0 != r1) goto L_0x01e1
            if (r17 != 0) goto L_0x01e1
            r0 = 1
            goto L_0x01e2
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            if (r0 == 0) goto L_0x01eb
            ke.r$a r0 = r4.f20682f
            java.lang.String r1 = "113 HttpURLConnection \"Heuristic expiration\""
            r0.a(r2, r1)
        L_0x01eb:
            me.d r0 = new me.d
            ke.d0 r1 = r4.a()
            r4 = 0
            r0.<init>(r4, r1)
            r1 = r4
            r4 = r0
            r0 = r23
            goto L_0x0261
        L_0x01fa:
            if (r19 == 0) goto L_0x01ff
            r15 = r24
            goto L_0x0208
        L_0x01ff:
            if (r18 == 0) goto L_0x0204
            r19 = r20
            goto L_0x0208
        L_0x0204:
            if (r16 == 0) goto L_0x024f
            r19 = r21
        L_0x0208:
            r0 = r23
            ke.r r1 = r0.f20882c
            ke.r$a r1 = r1.e()
            le.a r4 = le.a.f21259a
            ke.w$a r4 = (ke.w.a) r4
            r4.getClass()
            java.util.List<java.lang.String> r4 = r1.f20780a
            r4.add(r15)
            java.util.List<java.lang.String> r4 = r1.f20780a
            java.lang.String r5 = r19.trim()
            r4.add(r5)
            ke.z$a r4 = new ke.z$a
            r4.<init>(r0)
            java.util.List<java.lang.String> r1 = r1.f20780a
            int r5 = r1.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r1 = r1.toArray(r5)
            java.lang.String[] r1 = (java.lang.String[]) r1
            ke.r$a r5 = new ke.r$a
            r5.<init>()
            java.util.List<java.lang.String> r6 = r5.f20780a
            java.util.Collections.addAll(r6, r1)
            r4.f20888c = r5
            ke.z r1 = r4.a()
            me.d r4 = new me.d
            r4.<init>(r1, r3)
            goto L_0x00cc
        L_0x024f:
            r0 = r23
            me.d r4 = new me.d
            r1 = 0
            r4.<init>(r0, r1)
            goto L_0x0261
        L_0x0258:
            r25 = r0
            r0 = r6
            r1 = 0
            me.d r4 = new me.d
            r4.<init>(r0, r1)
        L_0x0261:
            ke.z r5 = r4.f21803a
            if (r5 == 0) goto L_0x0272
            ke.c r0 = r0.a()
            boolean r0 = r0.f20657j
            if (r0 == 0) goto L_0x0272
            me.d r4 = new me.d
            r4.<init>(r1, r1)
        L_0x0272:
            ke.z r0 = r4.f21803a
            ke.d0 r5 = r4.f21804b
            r6 = r26
            me.e r7 = r6.f21802a
            if (r7 == 0) goto L_0x027f
            r7.e(r4)
        L_0x027f:
            if (r3 == 0) goto L_0x0288
            if (r5 != 0) goto L_0x0288
            ke.e0 r4 = r3.f20670g
            le.c.e(r4)
        L_0x0288:
            if (r0 != 0) goto L_0x02b6
            if (r5 != 0) goto L_0x02b6
            ke.d0$a r0 = new ke.d0$a
            r0.<init>()
            r1 = r25
            ke.z r1 = r1.f23704f
            r0.f20677a = r1
            ke.x r1 = ke.x.HTTP_1_1
            r0.f20678b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.f20679c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.f20680d = r1
            ke.e0 r1 = le.c.f21263c
            r0.f20683g = r1
            r1 = -1
            r0.f20687k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f20688l = r1
            ke.d0 r0 = r0.a()
            return r0
        L_0x02b6:
            if (r0 != 0) goto L_0x02cc
            r5.getClass()
            ke.d0$a r0 = new ke.d0$a
            r0.<init>(r5)
            ke.d0 r1 = d(r5)
            r0.b(r1)
            ke.d0 r0 = r0.a()
            return r0
        L_0x02cc:
            r4 = r27
            oe.f r4 = (oe.f) r4     // Catch:{ all -> 0x044f }
            ne.f r7 = r4.f23700b     // Catch:{ all -> 0x044f }
            oe.c r8 = r4.f23701c     // Catch:{ all -> 0x044f }
            ne.c r9 = r4.f23702d     // Catch:{ all -> 0x044f }
            ke.d0 r3 = r4.b(r0, r7, r8, r9)     // Catch:{ all -> 0x044f }
            java.lang.String r4 = "networkResponse"
            if (r5 == 0) goto L_0x03a4
            int r7 = r3.f20666c
            r8 = 304(0x130, float:4.26E-43)
            if (r7 != r8) goto L_0x039f
            ke.d0$a r0 = new ke.d0$a
            r0.<init>(r5)
            ke.r r1 = r5.f20669f
            ke.r r7 = r3.f20669f
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 20
            r8.<init>(r9)
            int r9 = r1.g()
            r10 = 0
        L_0x02f9:
            if (r10 >= r9) goto L_0x0331
            java.lang.String r11 = r1.d(r10)
            java.lang.String r12 = r1.h(r10)
            boolean r13 = r2.equalsIgnoreCase(r11)
            if (r13 == 0) goto L_0x0312
            java.lang.String r13 = "1"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x0312
            goto L_0x032e
        L_0x0312:
            boolean r13 = b(r11)
            if (r13 != 0) goto L_0x0324
            boolean r13 = c(r11)
            if (r13 == 0) goto L_0x0324
            java.lang.String r13 = r7.c(r11)
            if (r13 != 0) goto L_0x032e
        L_0x0324:
            r8.add(r11)
            java.lang.String r11 = r12.trim()
            r8.add(r11)
        L_0x032e:
            int r10 = r10 + 1
            goto L_0x02f9
        L_0x0331:
            int r1 = r7.g()
            r2 = 0
        L_0x0336:
            if (r2 >= r1) goto L_0x0359
            java.lang.String r9 = r7.d(r2)
            boolean r10 = b(r9)
            if (r10 != 0) goto L_0x0356
            boolean r10 = c(r9)
            if (r10 == 0) goto L_0x0356
            java.lang.String r10 = r7.h(r2)
            r8.add(r9)
            java.lang.String r9 = r10.trim()
            r8.add(r9)
        L_0x0356:
            int r2 = r2 + 1
            goto L_0x0336
        L_0x0359:
            int r1 = r8.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r8.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            ke.r$a r2 = new ke.r$a
            r2.<init>()
            java.util.List<java.lang.String> r7 = r2.f20780a
            java.util.Collections.addAll(r7, r1)
            r0.f20682f = r2
            long r1 = r3.f20674s
            r0.f20687k = r1
            long r1 = r3.f20675t
            r0.f20688l = r1
            ke.d0 r1 = d(r5)
            r0.b(r1)
            ke.d0 r1 = d(r3)
            if (r1 == 0) goto L_0x0389
            r0.c(r4, r1)
        L_0x0389:
            r0.f20684h = r1
            ke.d0 r0 = r0.a()
            ke.e0 r1 = r3.f20670g
            r1.close()
            me.e r1 = r6.f21802a
            r1.a()
            me.e r1 = r6.f21802a
            r1.c(r5, r0)
            return r0
        L_0x039f:
            ke.e0 r2 = r5.f20670g
            le.c.e(r2)
        L_0x03a4:
            ke.d0$a r2 = new ke.d0$a
            r2.<init>(r3)
            ke.d0 r5 = d(r5)
            r2.b(r5)
            ke.d0 r3 = d(r3)
            if (r3 == 0) goto L_0x03b9
            r2.c(r4, r3)
        L_0x03b9:
            r2.f20684h = r3
            ke.d0 r2 = r2.a()
            me.e r3 = r6.f21802a
            if (r3 == 0) goto L_0x044e
            boolean r3 = oe.e.b(r2)
            if (r3 == 0) goto L_0x0419
            boolean r3 = me.d.a(r2, r0)
            if (r3 == 0) goto L_0x0419
            me.e r0 = r6.f21802a
            me.c r0 = r0.f(r2)
            if (r0 != 0) goto L_0x03d8
            goto L_0x0418
        L_0x03d8:
            ve.x r3 = r0.a()
            if (r3 != 0) goto L_0x03df
            goto L_0x0418
        L_0x03df:
            ke.e0 r4 = r2.f20670g
            ve.h r4 = r4.o()
            java.util.logging.Logger r5 = ve.p.f26761a
            ve.s r5 = new ve.s
            r5.<init>(r3)
            me.a r3 = new me.a
            r3.<init>(r6, r4, r0, r5)
            ke.r r0 = r2.f20669f
            java.lang.String r4 = "Content-Type"
            java.lang.String r0 = r0.c(r4)
            if (r0 == 0) goto L_0x03fc
            goto L_0x03fd
        L_0x03fc:
            r0 = r1
        L_0x03fd:
            ke.e0 r1 = r2.f20670g
            long r4 = r1.a()
            ke.d0$a r1 = new ke.d0$a
            r1.<init>(r2)
            oe.g r2 = new oe.g
            ve.t r7 = new ve.t
            r7.<init>(r3)
            r2.<init>(r0, r4, r7)
            r1.f20683g = r2
            ke.d0 r2 = r1.a()
        L_0x0418:
            return r2
        L_0x0419:
            java.lang.String r1 = r0.f20881b
            java.lang.String r3 = "POST"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0446
            java.lang.String r3 = "PATCH"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0446
            java.lang.String r3 = "PUT"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0446
            java.lang.String r3 = "DELETE"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0446
            java.lang.String r3 = "MOVE"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0444
            goto L_0x0446
        L_0x0444:
            r7 = 0
            goto L_0x0447
        L_0x0446:
            r7 = 1
        L_0x0447:
            if (r7 == 0) goto L_0x044e
            me.e r1 = r6.f21802a     // Catch:{ IOException -> 0x044e }
            r1.d(r0)     // Catch:{ IOException -> 0x044e }
        L_0x044e:
            return r2
        L_0x044f:
            r0 = move-exception
            if (r3 == 0) goto L_0x0457
            ke.e0 r1 = r3.f20670g
            le.c.e(r1)
        L_0x0457:
            goto L_0x0459
        L_0x0458:
            throw r0
        L_0x0459:
            goto L_0x0458
        */
        throw new UnsupportedOperationException("Method not decompiled: me.b.a(ke.t$a):ke.d0");
    }
}
