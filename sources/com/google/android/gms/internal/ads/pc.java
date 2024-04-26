package com.google.android.gms.internal.ads;

import e8.bh;
import e8.d30;
import e8.e30;
import e8.n20;
import e8.ni;
import e8.qt;
import e8.qu;
import e8.t00;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pc<AdT> implements oh<t00, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final n20 f7842a;

    /* renamed from: b  reason: collision with root package name */
    public final ni f7843b;

    /* renamed from: c  reason: collision with root package name */
    public final d30 f7844c;

    /* renamed from: d  reason: collision with root package name */
    public final e30 f7845d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f7846e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f7847f;

    /* renamed from: g  reason: collision with root package name */
    public final bh<AdT> f7848g;

    /* renamed from: h  reason: collision with root package name */
    public final qu f7849h;

    /* renamed from: i  reason: collision with root package name */
    public final qt f7850i;

    public pc(n20 n20, qu quVar, ni niVar, d30 d30, e30 e30, bh<AdT> bhVar, Executor executor, ScheduledExecutorService scheduledExecutorService, qt qtVar) {
        this.f7842a = n20;
        this.f7849h = quVar;
        this.f7843b = niVar;
        this.f7844c = d30;
        this.f7845d = e30;
        this.f7848g = bhVar;
        this.f7846e = executor;
        this.f7847f = scheduledExecutorService;
        this.f7850i = qtVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e8.p50 a(java.lang.Object r18) throws java.lang.Exception {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.we r1 = com.google.android.gms.internal.ads.we.NO_FILL
            r2 = r18
            e8.t00 r2 = (e8.t00) r2
            com.google.android.gms.internal.ads.j8 r3 = r2.f16701b
            java.lang.Object r3 = r3.f7135c
            com.google.android.gms.internal.ads.re r3 = (com.google.android.gms.internal.ads.re) r3
            int r3 = r3.f8033e
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 == 0) goto L_0x0041
            if (r3 < r4) goto L_0x002f
            if (r3 >= r5) goto L_0x002f
            e8.l<java.lang.Boolean> r3 = e8.t.R2
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r3 = r6.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0041
            java.lang.String r3 = "No fill."
            goto L_0x0043
        L_0x002f:
            if (r3 < r5) goto L_0x0038
            r6 = 400(0x190, float:5.6E-43)
            if (r3 >= r6) goto L_0x0038
            java.lang.String r3 = "No location header to follow redirect or too many redirects."
            goto L_0x0043
        L_0x0038:
            r6 = 46
            java.lang.String r7 = "Received error HTTP response code: "
            java.lang.String r3 = l0.d.a(r6, r7, r3)
            goto L_0x0043
        L_0x0041:
            java.lang.String r3 = "No ad config."
        L_0x0043:
            com.google.android.gms.internal.ads.j8 r6 = r2.f16701b
            java.lang.Object r6 = r6.f7135c
            com.google.android.gms.internal.ads.re r6 = (com.google.android.gms.internal.ads.re) r6
            com.google.android.gms.internal.ads.se r6 = r6.f8036h
            if (r6 == 0) goto L_0x0051
            java.lang.Object r3 = r6.f8122b
            java.lang.String r3 = (java.lang.String) r3
        L_0x0051:
            e8.l<java.lang.Boolean> r6 = e8.t.A4
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.j8 r6 = r2.f16701b
            java.lang.Object r6 = r6.f7135c
            com.google.android.gms.internal.ads.re r6 = (com.google.android.gms.internal.ads.re) r6
            int r6 = r6.f8033e
            if (r6 < r4) goto L_0x006f
            if (r6 < r5) goto L_0x007a
        L_0x006f:
            e8.ru r2 = new e8.ru
            r2.<init>(r1, r3)
            com.google.android.gms.internal.ads.ai$a r1 = new com.google.android.gms.internal.ads.ai$a
            r1.<init>(r2)
            return r1
        L_0x007a:
            e8.n20 r4 = r0.f7842a
            com.google.android.gms.internal.ads.if r5 = com.google.android.gms.internal.ads.Cif.RENDER_CONFIG_INIT
            t1.c r4 = r4.c(r5)
            e8.ru r5 = new e8.ru
            r5.<init>(r1, r3)
            com.google.android.gms.internal.ads.ai$a r1 = new com.google.android.gms.internal.ads.ai$a
            r1.<init>(r5)
            e8.dv r1 = r4.s(r1)
            com.google.android.gms.internal.ads.hf r1 = r1.e()
            e8.ni r3 = r0.f7843b
            e8.ze r4 = new e8.ze
            e8.e30 r5 = r0.f7845d
            e8.d30 r6 = r0.f7844c
            r4.<init>(r2, r5, r6)
            java.util.concurrent.Executor r5 = r0.f7846e
            r3.J0(r4, r5)
            e8.l<java.lang.Boolean> r3 = e8.t.B4
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.j8 r3 = r2.f16701b
            java.lang.Object r3 = r3.f7134b
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00c1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x014c
            java.lang.Object r5 = r3.next()
            com.google.android.gms.internal.ads.qe r5 = (com.google.android.gms.internal.ads.qe) r5
            e8.qt r6 = r0.f7850i
            r6.getClass()
            java.lang.String r7 = r5.f7969v
            java.util.Map<java.lang.String, e8.oi0> r8 = r6.f16202b
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x00dd
            goto L_0x0115
        L_0x00dd:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            org.json.JSONObject r8 = r5.f7968u
            java.util.Iterator r8 = r8.keys()
        L_0x00e8:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0100
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            org.json.JSONObject r10 = r5.f7968u     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r10 = r10.getString(r9)     // Catch:{ JSONException -> 0x00fe }
            r14.putString(r9, r10)     // Catch:{ JSONException -> 0x00fe }
            goto L_0x00e8
        L_0x00fe:
            goto L_0x00e8
        L_0x0100:
            e8.oi0 r8 = new e8.oi0
            java.lang.String r10 = r5.D
            r11 = 0
            r13 = 0
            r9 = r8
            r9.<init>(r10, r11, r13, r14)
            java.util.List<e8.oi0> r9 = r6.f16201a
            r9.add(r8)
            java.util.Map<java.lang.String, e8.oi0> r6 = r6.f16202b
            r6.put(r7, r8)
        L_0x0115:
            java.util.List<java.lang.String> r6 = r5.f7942a
            java.util.Iterator r6 = r6.iterator()
        L_0x011b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0139
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            e8.bh<AdT> r8 = r0.f7848g
            int r9 = r5.f7944b
            e8.lt r7 = r8.a(r9, r7)
            if (r7 == 0) goto L_0x011b
            boolean r7 = r7.a(r2, r5)
            if (r7 == 0) goto L_0x011b
            r6 = 1
            goto L_0x013a
        L_0x0139:
            r6 = 0
        L_0x013a:
            if (r6 != 0) goto L_0x00c1
            e8.qt r6 = r0.f7850i
            r7 = 0
            com.google.android.gms.internal.ads.we r9 = com.google.android.gms.internal.ads.we.INTERNAL_ERROR
            r10 = 0
            e8.zh0 r9 = l0.e.p(r9, r10, r10)
            r6.a(r5, r7, r9)
            goto L_0x00c1
        L_0x014c:
            com.google.android.gms.internal.ads.j8 r3 = r2.f16701b
            java.lang.Object r3 = r3.f7134b
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0156:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01db
            java.lang.Object r5 = r3.next()
            com.google.android.gms.internal.ads.qe r5 = (com.google.android.gms.internal.ads.qe) r5
            java.util.List<java.lang.String> r6 = r5.f7942a
            java.util.Iterator r6 = r6.iterator()
        L_0x0168:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01d7
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            e8.bh<AdT> r8 = r0.f7848g
            int r9 = r5.f7944b
            e8.lt r8 = r8.a(r9, r7)
            if (r8 == 0) goto L_0x0168
            boolean r9 = r8.a(r2, r5)
            if (r9 == 0) goto L_0x0168
            e8.n20 r6 = r0.f7842a
            com.google.android.gms.internal.ads.if r9 = com.google.android.gms.internal.ads.Cif.RENDER_CONFIG_WATERFALL
            e8.dv r1 = r6.b(r9, r1)
            r6 = 26
            int r6 = androidx.appcompat.widget.o.a(r7, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r6 = "render-config-"
            r9.append(r6)
            r9.append(r4)
            java.lang.String r6 = "-"
            r9.append(r6)
            r9.append(r7)
            java.lang.String r13 = r9.toString()
            java.lang.Object r6 = r1.f14338f
            r11 = r6
            e8.k20 r11 = (e8.k20) r11
            java.lang.Object r12 = r1.f14333a
            java.lang.Object r6 = r1.f14335c
            r14 = r6
            e8.p50 r14 = (e8.p50) r14
            java.lang.Object r6 = r1.f14336d
            r15 = r6
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r1 = r1.f14337e
            e8.p50 r1 = (e8.p50) r1
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            e8.i5 r7 = new e8.i5
            r7.<init>((com.google.android.gms.internal.ads.pc) r0, (e8.t00) r2, (com.google.android.gms.internal.ads.qe) r5, (e8.lt) r8)
            e8.dv r5 = new e8.dv
            e8.o50 r8 = r11.f15223a
            e8.p50 r16 = com.google.android.gms.internal.ads.yh.k(r1, r6, r7, r8)
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.hf r1 = r5.e()
        L_0x01d7:
            int r4 = r4 + 1
            goto L_0x0156
        L_0x01db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pc.a(java.lang.Object):e8.p50");
    }
}
