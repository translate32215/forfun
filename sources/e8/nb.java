package e8;

import android.annotation.TargetApi;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.q7;
import j4.e;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nb extends q7 implements ua {

    /* renamed from: d  reason: collision with root package name */
    public n7 f15601d;

    /* renamed from: e  reason: collision with root package name */
    public String f15602e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15603f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f15604g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15605h;

    public nb(ia iaVar, ja jaVar) {
        super(iaVar);
        n7 n7Var = new n7(iaVar.getContext(), jaVar, (ia) this.f7921c.get());
        this.f15601d = n7Var;
        n7Var.f7542s = this;
    }

    public static String t(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder a10 = e.a(o.a(message, o.a(canonicalName, o.a(str, 2))), str, "/", canonicalName, ":");
        a10.append(message);
        return a10.toString();
    }

    public final void a() {
        n7 n7Var = this.f15601d;
        if (n7Var != null) {
            n7Var.f7542s = null;
            n7Var.l();
        }
    }

    public final void b(int i10) {
    }

    public final void c(int i10, int i11) {
    }

    public final void d(boolean z10, long j10) {
        ia iaVar = (ia) this.f7921c.get();
        if (iaVar != null) {
            o50 o50 = h9.f14885e;
            ((k9) o50).f15244a.execute(new qa(iaVar, z10, j10));
        }
    }

    public final void f(String str, Exception exc) {
        String str2 = (String) ti0.f16763j.f16769f.a(t.f16590i);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.f15604g = exc;
        l0.e.D("Precache error", exc);
        u(str);
    }

    public final void h() {
        u((String) null);
    }

    public final void m(int i10) {
        ra raVar = this.f15601d.f7533b;
        synchronized (raVar) {
            raVar.f16254b = ((long) i10) * 1000;
        }
    }

    public final void n(int i10) {
        ra raVar = this.f15601d.f7533b;
        synchronized (raVar) {
            raVar.f16255c = ((long) i10) * 1000;
        }
    }

    public final void o(int i10) {
        ra raVar = this.f15601d.f7533b;
        synchronized (raVar) {
            raVar.f16256d = ((long) i10) * 1000;
        }
    }

    public final void p(int i10) {
        ra raVar = this.f15601d.f7533b;
        synchronized (raVar) {
            raVar.f16257e = ((long) i10) * 1000;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x021e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x021f, code lost:
        r2 = r15;
        r15 = r1;
        r1 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        r0 = r2.f15604g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        if (r0 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        r18 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x016f, code lost:
        e8.y8.f17578b.post(new e8.fb(r47, r48, r31, r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0182, code lost:
        r5 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a2, code lost:
        r0 = th;
        r5 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(java.lang.String r48, java.lang.String[] r49) {
        /*
            r47 = this;
            r15 = r47
            r13 = r48
            r0 = r49
            r15.f15602e = r13
            java.lang.String r14 = r47.s(r48)
            java.lang.String r18 = "error"
            r1 = 0
            int r2 = r0.length     // Catch:{ Exception -> 0x022d }
            android.net.Uri[] r2 = new android.net.Uri[r2]     // Catch:{ Exception -> 0x022d }
            r3 = 0
        L_0x0013:
            int r4 = r0.length     // Catch:{ Exception -> 0x022d }
            if (r3 >= r4) goto L_0x0023
            r4 = r0[r3]     // Catch:{ Exception -> 0x0021 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0021 }
            r2[r3] = r4     // Catch:{ Exception -> 0x0021 }
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0021:
            r0 = move-exception
            goto L_0x003f
        L_0x0023:
            com.google.android.gms.internal.ads.n7 r0 = r15.f15601d     // Catch:{ Exception -> 0x022d }
            java.lang.String r3 = r15.f7920b     // Catch:{ Exception -> 0x022d }
            r0.getClass()     // Catch:{ Exception -> 0x022d }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ Exception -> 0x022d }
            r0.m(r2, r3, r4, r1)     // Catch:{ Exception -> 0x022d }
            java.lang.ref.WeakReference<e8.ia> r0 = r15.f7921c     // Catch:{ Exception -> 0x022d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x022d }
            e8.ia r0 = (e8.ia) r0     // Catch:{ Exception -> 0x022d }
            if (r0 == 0) goto L_0x0048
            r0.h(r14, r15)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0048
        L_0x003f:
            r1 = 0
            r31 = r14
            r2 = r15
            r5 = r2
            r3 = r18
            goto L_0x0241
        L_0x0048:
            d7.l r0 = d7.l.B     // Catch:{ Exception -> 0x022d }
            z7.b r0 = r0.f13193j     // Catch:{ Exception -> 0x022d }
            long r19 = r0.b()     // Catch:{ Exception -> 0x022d }
            e8.l<java.lang.Long> r1 = e8.t.f16632p     // Catch:{ Exception -> 0x022d }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ Exception -> 0x022d }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ Exception -> 0x022d }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x022d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x022d }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x022d }
            e8.l<java.lang.Long> r1 = e8.t.f16626o     // Catch:{ Exception -> 0x022d }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ Exception -> 0x022d }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ Exception -> 0x022d }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x022d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x022d }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x022d }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            e8.l<java.lang.Integer> r1 = e8.t.f16620n     // Catch:{ Exception -> 0x022d }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ Exception -> 0x022d }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ Exception -> 0x022d }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x022d }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x022d }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x022d }
            long r7 = (long) r1     // Catch:{ Exception -> 0x022d }
            e8.l<java.lang.Boolean> r1 = e8.t.f16562d1     // Catch:{ Exception -> 0x022d }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ Exception -> 0x022d }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ Exception -> 0x022d }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ Exception -> 0x022d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x022d }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x022d }
            r22 = -1
            r1 = r15
            r2 = r1
            r3 = r22
        L_0x009b:
            monitor-enter(r47)     // Catch:{ Exception -> 0x0226 }
            long r5 = r0.b()     // Catch:{ all -> 0x0211 }
            long r5 = r5 - r19
            int r16 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r16 > 0) goto L_0x01e1
            boolean r5 = r2.f15603f     // Catch:{ all -> 0x0211 }
            if (r5 == 0) goto L_0x00c3
            java.lang.Exception r0 = r2.f15604g     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r3 = "badUrl"
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00b1:
            java.lang.String r3 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = "Abort requested before buffering finished. "
            r0.<init>(r4)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            r18 = r3
        L_0x00be:
            r31 = r14
            r5 = r15
            goto L_0x0214
        L_0x00c3:
            boolean r5 = r2.f15605h     // Catch:{ all -> 0x0211 }
            r24 = 1
            if (r5 == 0) goto L_0x00cd
            monitor-exit(r47)     // Catch:{ all -> 0x0211 }
            r5 = r15
            goto L_0x019e
        L_0x00cd:
            com.google.android.gms.internal.ads.n7 r5 = r2.f15601d     // Catch:{ all -> 0x0211 }
            e8.vb0 r5 = r5.f7538g     // Catch:{ all -> 0x0211 }
            if (r5 == 0) goto L_0x01d2
            long r25 = r5.b()     // Catch:{ all -> 0x0211 }
            r27 = 0
            int r6 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r6 <= 0) goto L_0x01a7
            long r29 = r5.a()     // Catch:{ all -> 0x0211 }
            int r5 = (r29 > r3 ? 1 : (r29 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x015e
            int r3 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ed
            r3 = 1
            r16 = 1
            goto L_0x00f0
        L_0x00ed:
            r3 = 0
            r16 = 0
        L_0x00f0:
            if (r21 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.n7 r3 = r2.f15601d     // Catch:{ all -> 0x0211 }
            boolean r4 = r3.n()     // Catch:{ all -> 0x0211 }
            if (r4 != 0) goto L_0x00fe
            int r3 = r3.f7543t     // Catch:{ all -> 0x0211 }
            long r3 = (long) r3     // Catch:{ all -> 0x0211 }
            goto L_0x0100
        L_0x00fe:
            r3 = r27
        L_0x0100:
            r31 = r3
            goto L_0x0105
        L_0x0103:
            r31 = r22
        L_0x0105:
            if (r21 == 0) goto L_0x0110
            com.google.android.gms.internal.ads.n7 r3 = r2.f15601d     // Catch:{ all -> 0x0211 }
            long r3 = r3.q()     // Catch:{ all -> 0x0211 }
            r33 = r3
            goto L_0x0112
        L_0x0110:
            r33 = r22
        L_0x0112:
            if (r21 == 0) goto L_0x011d
            com.google.android.gms.internal.ads.n7 r3 = r2.f15601d     // Catch:{ all -> 0x0211 }
            long r1 = r3.k()     // Catch:{ all -> 0x0211 }
            r35 = r1
            goto L_0x011f
        L_0x011d:
            r35 = r22
        L_0x011f:
            int r17 = com.google.android.gms.internal.ads.n7.B     // Catch:{ all -> 0x0157 }
            int r37 = com.google.android.gms.internal.ads.n7.C     // Catch:{ all -> 0x0157 }
            android.os.Handler r5 = e8.y8.f17578b     // Catch:{ all -> 0x0157 }
            e8.eb r6 = new e8.eb     // Catch:{ all -> 0x0157 }
            r38 = 0
            r1 = r6
            r2 = r47
            r3 = r48
            r4 = r14
            r49 = r0
            r39 = r5
            r0 = r6
            r5 = r29
            r40 = r7
            r7 = r25
            r42 = r9
            r9 = r31
            r44 = r11
            r11 = r33
            r31 = r14
            r13 = r35
            r15 = r16
            r16 = r17
            r17 = r37
            r1.<init>(r2, r3, r4, r5, r7, r9, r11, r13, r15, r16, r17)     // Catch:{ all -> 0x0186 }
            r1 = r39
            r1.post(r0)     // Catch:{ all -> 0x0186 }
            r3 = r29
            goto L_0x016b
        L_0x0157:
            r0 = move-exception
            r31 = r14
            r1 = 0
            r5 = r47
            goto L_0x018b
        L_0x015e:
            r49 = r0
            r40 = r7
            r42 = r9
            r44 = r11
            r31 = r14
            r0 = 0
            r38 = 0
        L_0x016b:
            int r0 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r0 < 0) goto L_0x018e
            android.os.Handler r0 = e8.y8.f17578b     // Catch:{ all -> 0x0186 }
            e8.fb r7 = new e8.fb     // Catch:{ all -> 0x0186 }
            r1 = r7
            r2 = r47
            r3 = r48
            r4 = r31
            r5 = r25
            r1.<init>(r2, r3, r4, r5)     // Catch:{ all -> 0x0186 }
            r0.post(r7)     // Catch:{ all -> 0x0186 }
            r5 = r47
            monitor-exit(r47)     // Catch:{ all -> 0x01a2 }
            goto L_0x019e
        L_0x0186:
            r0 = move-exception
            r5 = r47
            r1 = r38
        L_0x018b:
            r38 = r1
            goto L_0x01a3
        L_0x018e:
            r5 = r47
            com.google.android.gms.internal.ads.n7 r0 = r5.f15601d     // Catch:{ all -> 0x01a2 }
            int r0 = r0.f7543t     // Catch:{ all -> 0x01a2 }
            long r0 = (long) r0     // Catch:{ all -> 0x01a2 }
            int r2 = (r0 > r40 ? 1 : (r0 == r40 ? 0 : -1))
            if (r2 < 0) goto L_0x019f
            int r0 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            monitor-exit(r47)     // Catch:{ all -> 0x01a2 }
        L_0x019e:
            return r24
        L_0x019f:
            r1 = r5
            r2 = r1
            goto L_0x01b4
        L_0x01a2:
            r0 = move-exception
        L_0x01a3:
            r1 = r5
            r15 = r1
            goto L_0x021c
        L_0x01a7:
            r49 = r0
            r40 = r7
            r42 = r9
            r44 = r11
            r31 = r14
            r5 = r15
            r38 = 0
        L_0x01b4:
            r6 = r44
            r2.wait(r6)     // Catch:{ InterruptedException -> 0x01c8 }
            monitor-exit(r47)     // Catch:{ all -> 0x020f }
            r13 = r48
            r0 = r49
            r15 = r5
            r11 = r6
            r14 = r31
            r7 = r40
            r9 = r42
            goto L_0x009b
        L_0x01c8:
            java.lang.String r3 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x020a }
            java.lang.String r4 = "Wait interrupted."
            r0.<init>(r4)     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x01d2:
            r31 = r14
            r5 = r15
            r38 = 0
            java.lang.String r3 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x020a }
            java.lang.String r4 = "ExoPlayer was released during preloading."
            r0.<init>(r4)     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x01e1:
            r42 = r9
            r31 = r14
            r5 = r15
            r38 = 0
            java.lang.String r3 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x020a }
            r4 = 47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x020a }
            r6.<init>(r4)     // Catch:{ all -> 0x020a }
            java.lang.String r4 = "Timeout reached. Limit: "
            r6.append(r4)     // Catch:{ all -> 0x020a }
            r7 = r42
            r6.append(r7)     // Catch:{ all -> 0x020a }
            java.lang.String r4 = " ms"
            r6.append(r4)     // Catch:{ all -> 0x020a }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x020a }
            r0.<init>(r4)     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x020a:
            r0 = move-exception
            r15 = r2
            r18 = r3
            goto L_0x0217
        L_0x020f:
            r0 = move-exception
            goto L_0x0216
        L_0x0211:
            r0 = move-exception
            goto L_0x00be
        L_0x0214:
            r38 = 0
        L_0x0216:
            r15 = r2
        L_0x0217:
            r46 = r15
            r15 = r1
            r1 = r46
        L_0x021c:
            monitor-exit(r15)     // Catch:{ all -> 0x0224 }
            throw r0     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            r0 = move-exception
            r2 = r15
            r15 = r1
            r1 = r38
            goto L_0x023a
        L_0x0224:
            r0 = move-exception
            goto L_0x021c
        L_0x0226:
            r0 = move-exception
            r31 = r14
            r5 = r15
            r3 = 0
            r15 = r1
            goto L_0x0234
        L_0x022d:
            r0 = move-exception
            r31 = r14
            r5 = r15
            r3 = 0
            r2 = r5
            r15 = r2
        L_0x0234:
            r1 = r3
            r46 = r15
            r15 = r2
            r2 = r46
        L_0x023a:
            r3 = r18
            r46 = r15
            r15 = r2
            r2 = r46
        L_0x0241:
            java.lang.String r4 = r0.getMessage()
            r6 = 34
            r7 = r48
            int r6 = androidx.appcompat.widget.o.a(r7, r6)
            int r6 = androidx.appcompat.widget.o.a(r4, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Failed to preload url "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = " Exception: "
            r8.append(r6)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            l0.e.K(r4)
            r15.a()
            java.lang.String r0 = t(r3, r0)
            r4 = r31
            r2.l(r7, r4, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.nb.q(java.lang.String, java.lang.String[]):boolean");
    }

    public final boolean r(String str) {
        return q(str, new String[]{str});
    }

    public final String s(String str) {
        String valueOf = String.valueOf(y8.h(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final void u(String str) {
        synchronized (this) {
            this.f15603f = true;
            notify();
            a();
        }
        String str2 = this.f15602e;
        if (str2 != null) {
            String s10 = s(str2);
            Exception exc = this.f15604g;
            if (exc != null) {
                l(this.f15602e, s10, "badUrl", t(str, exc));
            } else {
                l(this.f15602e, s10, "externalAbort", "Programmatic precache abort.");
            }
        }
    }
}
