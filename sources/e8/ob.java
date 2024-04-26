package e8;

import com.google.android.gms.internal.ads.ju;
import com.google.android.gms.internal.ads.lu;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.q7;
import d5.w;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ob extends q7 implements vf0<ju> {

    /* renamed from: d  reason: collision with root package name */
    public String f15767d;

    /* renamed from: e  reason: collision with root package name */
    public final ja f15768e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15769f;

    /* renamed from: g  reason: collision with root package name */
    public final lb f15770g = new lb();

    /* renamed from: h  reason: collision with root package name */
    public final w f15771h = new w(1);

    /* renamed from: i  reason: collision with root package name */
    public ByteBuffer f15772i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15773r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f15774s = new Object();

    /* renamed from: t  reason: collision with root package name */
    public final String f15775t;

    /* renamed from: u  reason: collision with root package name */
    public final int f15776u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15777v;

    public ob(ia iaVar, ja jaVar) {
        super(iaVar);
        this.f15768e = jaVar;
        this.f15775t = iaVar.w();
        this.f15776u = iaVar.S();
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final void g(Object obj, qf0 qf0) {
        ju juVar = (ju) obj;
        if (juVar instanceof lu) {
            this.f15770g.f15376a.add((lu) juVar);
        }
    }

    public final void h() {
        this.f15769f = true;
    }

    public final /* bridge */ /* synthetic */ void i(Object obj, int i10) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.google.android.gms.internal.ads.lu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.google.android.gms.internal.ads.lu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.android.gms.internal.ads.lu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.google.android.gms.internal.ads.l7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: com.google.android.gms.internal.ads.lu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(java.lang.String r26) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r7.f15767d = r8
            java.lang.String r9 = r25.s(r26)
            java.lang.String r10 = "error"
            r0 = 0
            com.google.android.gms.internal.ads.lu r13 = new com.google.android.gms.internal.ads.lu     // Catch:{ Exception -> 0x0152 }
            java.lang.String r1 = r7.f7920b     // Catch:{ Exception -> 0x0152 }
            e8.ja r2 = r7.f15768e     // Catch:{ Exception -> 0x0152 }
            int r3 = r2.f15111d     // Catch:{ Exception -> 0x0152 }
            int r2 = r2.f15112e     // Catch:{ Exception -> 0x0152 }
            r13.<init>(r1, r7, r3, r2)     // Catch:{ Exception -> 0x0152 }
            e8.ja r1 = r7.f15768e     // Catch:{ Exception -> 0x0152 }
            boolean r1 = r1.f15116i     // Catch:{ Exception -> 0x0152 }
            if (r1 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.l7 r1 = new com.google.android.gms.internal.ads.l7     // Catch:{ Exception -> 0x0152 }
            android.content.Context r12 = r7.f7919a     // Catch:{ Exception -> 0x0152 }
            java.lang.String r14 = r7.f15775t     // Catch:{ Exception -> 0x0152 }
            int r15 = r7.f15776u     // Catch:{ Exception -> 0x0152 }
            r16 = 0
            r17 = 0
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0152 }
            r13 = r1
        L_0x0031:
            android.net.Uri r15 = android.net.Uri.parse(r26)     // Catch:{ Exception -> 0x0152 }
            e8.qf0 r1 = new e8.qf0     // Catch:{ Exception -> 0x0152 }
            r16 = 0
            r24 = 0
            r17 = 0
            r19 = 0
            r21 = -1
            r23 = 0
            r14 = r1
            r14.<init>(r15, r16, r17, r19, r21, r23, r24)     // Catch:{ Exception -> 0x0152 }
            r13.b(r1)     // Catch:{ Exception -> 0x0152 }
            java.lang.ref.WeakReference<e8.ia> r1 = r7.f7921c     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0152 }
            e8.ia r1 = (e8.ia) r1     // Catch:{ Exception -> 0x0152 }
            if (r1 == 0) goto L_0x0057
            r1.h(r9, r7)     // Catch:{ Exception -> 0x0152 }
        L_0x0057:
            d7.l r1 = d7.l.B     // Catch:{ Exception -> 0x0152 }
            z7.b r1 = r1.f13193j     // Catch:{ Exception -> 0x0152 }
            long r2 = r1.b()     // Catch:{ Exception -> 0x0152 }
            e8.l<java.lang.Long> r4 = e8.t.f16632p     // Catch:{ Exception -> 0x0152 }
            e8.ti0 r5 = e8.ti0.f16763j     // Catch:{ Exception -> 0x0152 }
            com.google.android.gms.internal.ads.e r5 = r5.f16769f     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ Exception -> 0x0152 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0152 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x0152 }
            e8.l<java.lang.Long> r6 = e8.t.f16626o     // Catch:{ Exception -> 0x0152 }
            e8.ti0 r11 = e8.ti0.f16763j     // Catch:{ Exception -> 0x0152 }
            com.google.android.gms.internal.ads.e r11 = r11.f16769f     // Catch:{ Exception -> 0x0152 }
            java.lang.Object r6 = r11.a(r6)     // Catch:{ Exception -> 0x0152 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x0152 }
            long r11 = r6.longValue()     // Catch:{ Exception -> 0x0152 }
            e8.ja r6 = r7.f15768e     // Catch:{ Exception -> 0x0152 }
            int r6 = r6.f15110c     // Catch:{ Exception -> 0x0152 }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ Exception -> 0x0152 }
            r7.f15772i = r6     // Catch:{ Exception -> 0x0152 }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r14 = new byte[r6]     // Catch:{ Exception -> 0x0152 }
            r15 = r2
            r17 = r10
        L_0x0090:
            java.nio.ByteBuffer r10 = r7.f15772i     // Catch:{ Exception -> 0x014e }
            int r10 = r10.remaining()     // Catch:{ Exception -> 0x014e }
            int r6 = java.lang.Math.min(r10, r6)     // Catch:{ Exception -> 0x014e }
            int r0 = r13.a(r14, r0, r6)     // Catch:{ Exception -> 0x014e }
            r6 = -1
            if (r0 != r6) goto L_0x00bf
            r0 = 1
            r7.f15777v = r0     // Catch:{ Exception -> 0x014e }
            d5.w r0 = r7.f15771h     // Catch:{ Exception -> 0x014e }
            java.nio.ByteBuffer r1 = r7.f15772i     // Catch:{ Exception -> 0x014e }
            long r0 = r0.a(r1)     // Catch:{ Exception -> 0x014e }
            int r1 = (int) r0     // Catch:{ Exception -> 0x014e }
            long r5 = (long) r1     // Catch:{ Exception -> 0x014e }
            android.os.Handler r0 = e8.y8.f17578b     // Catch:{ Exception -> 0x014e }
            e8.fb r10 = new e8.fb     // Catch:{ Exception -> 0x014e }
            r1 = r10
            r2 = r25
            r3 = r26
            r4 = r9
            r1.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x014e }
            r0.post(r10)     // Catch:{ Exception -> 0x014e }
            goto L_0x00dd
        L_0x00bf:
            java.lang.Object r6 = r7.f15774s     // Catch:{ Exception -> 0x014e }
            monitor-enter(r6)     // Catch:{ Exception -> 0x014e }
            boolean r10 = r7.f15769f     // Catch:{ all -> 0x014b }
            if (r10 != 0) goto L_0x00cf
            java.nio.ByteBuffer r10 = r7.f15772i     // Catch:{ all -> 0x014b }
            r18 = r13
            r13 = 0
            r10.put(r14, r13, r0)     // Catch:{ all -> 0x014b }
            goto L_0x00d1
        L_0x00cf:
            r18 = r13
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x014b }
            java.nio.ByteBuffer r0 = r7.f15772i     // Catch:{ Exception -> 0x014e }
            int r0 = r0.remaining()     // Catch:{ Exception -> 0x014e }
            if (r0 > 0) goto L_0x00df
            r25.t()     // Catch:{ Exception -> 0x014e }
        L_0x00dd:
            r0 = 1
            return r0
        L_0x00df:
            boolean r0 = r7.f15769f     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x0122
            long r19 = r1.b()     // Catch:{ Exception -> 0x014e }
            long r21 = r19 - r15
            int r0 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00f2
            r25.t()     // Catch:{ Exception -> 0x014e }
            r15 = r19
        L_0x00f2:
            long r19 = r19 - r2
            r21 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r11
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0102
            r0 = 0
            r6 = 8192(0x2000, float:1.14794E-41)
            r13 = r18
            goto L_0x0090
        L_0x0102:
            java.lang.String r1 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0148 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r2.append(r0)     // Catch:{ Exception -> 0x0148 }
            r2.append(r11)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0148 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ Exception -> 0x0148 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0148 }
            throw r2     // Catch:{ Exception -> 0x0148 }
        L_0x0122:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0148 }
            java.nio.ByteBuffer r2 = r7.f15772i     // Catch:{ Exception -> 0x0148 }
            int r2 = r2.limit()     // Catch:{ Exception -> 0x0148 }
            r3 = 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0148 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r3 = "Precache abort at "
            r4.append(r3)     // Catch:{ Exception -> 0x0148 }
            r4.append(r2)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r2 = " bytes"
            r4.append(r2)     // Catch:{ Exception -> 0x0148 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0148 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0148 }
            throw r0     // Catch:{ Exception -> 0x0148 }
        L_0x0148:
            r0 = move-exception
            r10 = r1
            goto L_0x0156
        L_0x014b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ Exception -> 0x014e }
        L_0x014e:
            r0 = move-exception
        L_0x014f:
            r10 = r17
            goto L_0x0156
        L_0x0152:
            r0 = move-exception
            r17 = r10
            goto L_0x014f
        L_0x0156:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            r2 = 1
            int r2 = androidx.appcompat.widget.o.a(r1, r2)
            int r2 = androidx.appcompat.widget.o.a(r0, r2)
            java.lang.String r3 = ":"
            java.lang.String r0 = e.g.a(r2, r1, r3, r0)
            r1 = 34
            int r1 = androidx.appcompat.widget.o.a(r8, r1)
            int r1 = androidx.appcompat.widget.o.a(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            l0.e.K(r1)
            r7.l(r8, r9, r10, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ob.r(java.lang.String):boolean");
    }

    public final String s(String str) {
        String valueOf = String.valueOf(y8.h(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final void t() {
        lb lbVar = this.f15770g;
        Iterator<lu> it = lbVar.f15376a.iterator();
        while (it.hasNext()) {
            HttpURLConnection httpURLConnection = it.next().f7425h;
            Map headerFields = httpURLConnection == null ? null : httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                for (Map.Entry entry : headerFields.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            lbVar.f15377b = Math.max(lbVar.f15377b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        int i10 = (int) lbVar.f15377b;
        int a10 = (int) this.f15771h.a(this.f15772i);
        int position = this.f15772i.position();
        int round = Math.round((((float) position) / ((float) i10)) * ((float) a10));
        boolean z10 = round > 0;
        int i11 = n7.B;
        int i12 = n7.C;
        String str = this.f15767d;
        y8.f17578b.post(new db(this, str, s(str), position, i10, (long) round, (long) a10, z10, i11, i12));
    }
}
