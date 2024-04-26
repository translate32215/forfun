package com.google.android.gms.internal.ads;

import android.content.Context;
import b8.c;
import com.google.android.gms.ads.internal.util.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.yq;
import e8.a8;
import e8.b8;
import e8.c1;
import e8.c8;
import e8.f9;
import e8.h8;
import e8.h9;
import e8.i8;
import e8.o50;
import e8.p50;
import e8.w3;
import f7.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import s7.e;
import z7.h;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n6 implements h8 {

    /* renamed from: m  reason: collision with root package name */
    public static List<Future<Void>> f7519m = Collections.synchronizedList(new ArrayList());
    @GuardedBy("lock")

    /* renamed from: a  reason: collision with root package name */
    public final yq.b f7520a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, yq.h.b> f7521b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f7522c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f7523d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Context f7524e;

    /* renamed from: f  reason: collision with root package name */
    public final i8 f7525f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7526g;

    /* renamed from: h  reason: collision with root package name */
    public final c8 f7527h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f7528i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public HashSet<String> f7529j = new HashSet<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f7530k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7531l = false;

    public n6(Context context, f9 f9Var, c8 c8Var, String str, i8 i8Var) {
        i.i(c8Var, "SafeBrowsing config is not present.");
        this.f7524e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f7521b = new LinkedHashMap<>();
        this.f7525f = i8Var;
        this.f7527h = c8Var;
        for (String lowerCase : c8Var.f14093e) {
            this.f7529j.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f7529j.remove("cookie".toLowerCase(Locale.ENGLISH));
        yq.b L = yq.L();
        yq.g gVar = yq.g.OCTAGON_AD;
        if (L.f5971c) {
            L.n();
            L.f5971c = false;
        }
        yq.C((yq) L.f5970b, gVar);
        if (L.f5971c) {
            L.n();
            L.f5971c = false;
        }
        yq.G((yq) L.f5970b, str);
        if (L.f5971c) {
            L.n();
            L.f5971c = false;
        }
        yq.I((yq) L.f5970b, str);
        yq.a.C0088a z10 = yq.a.z();
        String str2 = this.f7527h.f14089a;
        if (str2 != null) {
            if (z10.f5971c) {
                z10.n();
                z10.f5971c = false;
            }
            yq.a.y((yq.a) z10.f5970b, str2);
        }
        yq.a aVar = (yq.a) ((aq) z10.j());
        if (L.f5971c) {
            L.n();
            L.f5971c = false;
        }
        yq.A((yq) L.f5970b, aVar);
        yq.i.a B = yq.i.B();
        boolean c10 = c.a(this.f7524e).c();
        if (B.f5971c) {
            B.n();
            B.f5971c = false;
        }
        yq.i.A((yq.i) B.f5970b, c10);
        String str3 = f9Var.f14544a;
        if (str3 != null) {
            if (B.f5971c) {
                B.n();
                B.f5971c = false;
            }
            yq.i.z((yq.i) B.f5970b, str3);
        }
        long a10 = (long) e.f25013b.a(this.f7524e);
        if (a10 > 0) {
            if (B.f5971c) {
                B.n();
                B.f5971c = false;
            }
            yq.i.y((yq.i) B.f5970b, a10);
        }
        yq.i iVar = (yq.i) ((aq) B.j());
        if (L.f5971c) {
            L.n();
            L.f5971c = false;
        }
        yq.E((yq) L.f5970b, iVar);
        this.f7520a = L;
    }

    public final boolean a() {
        return h.b() && this.f7527h.f14091c && !this.f7530k;
    }

    public final void b(String str) {
        synchronized (this.f7528i) {
            if (str == null) {
                yq.b bVar = this.f7520a;
                if (bVar.f5971c) {
                    bVar.n();
                    bVar.f5971c = false;
                }
                yq.z((yq) bVar.f5970b);
            } else {
                yq.b bVar2 = this.f7520a;
                if (bVar2.f5971c) {
                    bVar2.n();
                    bVar2.f5971c = false;
                }
                yq.N((yq) bVar2.f5970b, str);
            }
        }
    }

    public final c8 c() {
        return this.f7527h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, int r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7528i
            monitor-enter(r0)
            r1 = 3
            if (r10 != r1) goto L_0x0009
            r2 = 1
            r7.f7531l = r2     // Catch:{ all -> 0x0124 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.yq$h$b> r2 = r7.f7521b     // Catch:{ all -> 0x0124 }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x0124 }
            r3 = 0
            if (r2 == 0) goto L_0x0032
            if (r10 != r1) goto L_0x0030
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.yq$h$b> r9 = r7.f7521b     // Catch:{ all -> 0x0124 }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h$b r8 = (com.google.android.gms.internal.ads.yq.h.b) r8     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h$a r9 = com.google.android.gms.internal.ads.yq.h.a.a(r10)     // Catch:{ all -> 0x0124 }
            boolean r10 = r8.f5971c     // Catch:{ all -> 0x0124 }
            if (r10 == 0) goto L_0x0029
            r8.n()     // Catch:{ all -> 0x0124 }
            r8.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x0029:
            MessageType r8 = r8.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h r8 = (com.google.android.gms.internal.ads.yq.h) r8     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.h.B(r8, r9)     // Catch:{ all -> 0x0124 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            return
        L_0x0032:
            com.google.android.gms.internal.ads.yq$h$b r1 = com.google.android.gms.internal.ads.yq.h.F()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h$a r10 = com.google.android.gms.internal.ads.yq.h.a.a(r10)     // Catch:{ all -> 0x0124 }
            if (r10 == 0) goto L_0x004c
            boolean r2 = r1.f5971c     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x0045
            r1.n()     // Catch:{ all -> 0x0124 }
            r1.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x0045:
            MessageType r2 = r1.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h r2 = (com.google.android.gms.internal.ads.yq.h) r2     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.h.B(r2, r10)     // Catch:{ all -> 0x0124 }
        L_0x004c:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.yq$h$b> r10 = r7.f7521b     // Catch:{ all -> 0x0124 }
            int r10 = r10.size()     // Catch:{ all -> 0x0124 }
            boolean r2 = r1.f5971c     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x005b
            r1.n()     // Catch:{ all -> 0x0124 }
            r1.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x005b:
            MessageType r2 = r1.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h r2 = (com.google.android.gms.internal.ads.yq.h) r2     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.h.z(r2, r10)     // Catch:{ all -> 0x0124 }
            boolean r10 = r1.f5971c     // Catch:{ all -> 0x0124 }
            if (r10 == 0) goto L_0x006b
            r1.n()     // Catch:{ all -> 0x0124 }
            r1.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x006b:
            MessageType r10 = r1.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h r10 = (com.google.android.gms.internal.ads.yq.h) r10     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.h.C(r10, r8)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$d$b r10 = com.google.android.gms.internal.ads.yq.d.z()     // Catch:{ all -> 0x0124 }
            java.util.HashSet<java.lang.String> r2 = r7.f7529j     // Catch:{ all -> 0x0124 }
            int r2 = r2.size()     // Catch:{ all -> 0x0124 }
            if (r2 <= 0) goto L_0x0105
            if (r9 == 0) goto L_0x0105
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0124 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0124 }
        L_0x0088:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0124 }
            if (r2 == 0) goto L_0x0105
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0124 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0124 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00a1
            java.lang.Object r4 = r2.getKey()     // Catch:{ all -> 0x0124 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0124 }
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r4 = ""
        L_0x00a3:
            java.lang.Object r5 = r2.getValue()     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0124 }
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r2 = ""
        L_0x00b2:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0124 }
            java.lang.String r5 = r4.toLowerCase(r5)     // Catch:{ all -> 0x0124 }
            java.util.HashSet<java.lang.String> r6 = r7.f7529j     // Catch:{ all -> 0x0124 }
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.yq$c$a r5 = com.google.android.gms.internal.ads.yq.c.A()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.mp r4 = com.google.android.gms.internal.ads.mp.J(r4)     // Catch:{ all -> 0x0124 }
            boolean r6 = r5.f5971c     // Catch:{ all -> 0x0124 }
            if (r6 == 0) goto L_0x00d1
            r5.n()     // Catch:{ all -> 0x0124 }
            r5.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x00d1:
            MessageType r6 = r5.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$c r6 = (com.google.android.gms.internal.ads.yq.c) r6     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.c.y(r6, r4)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.mp r2 = com.google.android.gms.internal.ads.mp.J(r2)     // Catch:{ all -> 0x0124 }
            boolean r4 = r5.f5971c     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00e5
            r5.n()     // Catch:{ all -> 0x0124 }
            r5.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x00e5:
            MessageType r4 = r5.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$c r4 = (com.google.android.gms.internal.ads.yq.c) r4     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.c.z(r4, r2)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.cq r2 = r5.j()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.aq r2 = (com.google.android.gms.internal.ads.aq) r2     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$c r2 = (com.google.android.gms.internal.ads.yq.c) r2     // Catch:{ all -> 0x0124 }
            boolean r4 = r10.f5971c     // Catch:{ all -> 0x0124 }
            if (r4 == 0) goto L_0x00fd
            r10.n()     // Catch:{ all -> 0x0124 }
            r10.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x00fd:
            MessageType r4 = r10.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$d r4 = (com.google.android.gms.internal.ads.yq.d) r4     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.d.y(r4, r2)     // Catch:{ all -> 0x0124 }
            goto L_0x0088
        L_0x0105:
            com.google.android.gms.internal.ads.cq r9 = r10.j()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.aq r9 = (com.google.android.gms.internal.ads.aq) r9     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$d r9 = (com.google.android.gms.internal.ads.yq.d) r9     // Catch:{ all -> 0x0124 }
            boolean r10 = r1.f5971c     // Catch:{ all -> 0x0124 }
            if (r10 == 0) goto L_0x0116
            r1.n()     // Catch:{ all -> 0x0124 }
            r1.f5971c = r3     // Catch:{ all -> 0x0124 }
        L_0x0116:
            MessageType r10 = r1.f5970b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq$h r10 = (com.google.android.gms.internal.ads.yq.h) r10     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.yq.h.A(r10, r9)     // Catch:{ all -> 0x0124 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.yq$h$b> r9 = r7.f7521b     // Catch:{ all -> 0x0124 }
            r9.put(r8, r1)     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            return
        L_0x0124:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            goto L_0x0128
        L_0x0127:
            throw r8
        L_0x0128:
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n6.d(java.lang.String, java.util.Map, int):void");
    }

    public final void e() {
        synchronized (this.f7528i) {
            p50<Map<String, String>> a10 = this.f7525f.a(this.f7524e, this.f7521b.keySet());
            w3 w3Var = new w3(this);
            o50 o50 = h9.f14886f;
            p50<O> j10 = yh.j(a10, w3Var, o50);
            p50<O> e10 = yh.e(j10, 10, TimeUnit.SECONDS, h9.f14884d);
            ((gh) j10).a(new j0((Future) j10, (zh) new ri((p50) e10)), o50);
            f7519m.add(e10);
        }
    }

    public final void f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[SYNTHETIC, Splitter:B:20:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(android.view.View r8) {
        /*
            r7 = this;
            e8.c8 r0 = r7.f7527h
            boolean r0 = r0.f14091c
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.f7530k
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            d7.l r0 = d7.l.B
            com.google.android.gms.ads.internal.util.p r0 = r0.f13186c
            r0 = 0
            r1 = 1
            if (r8 != 0) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002e }
            r8.setDrawingCacheEnabled(r1)     // Catch:{ RuntimeException -> 0x002e }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002e }
            if (r3 == 0) goto L_0x0027
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x0028
        L_0x0027:
            r3 = r0
        L_0x0028:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002c }
            goto L_0x0035
        L_0x002c:
            r2 = move-exception
            goto L_0x0030
        L_0x002e:
            r2 = move-exception
            r3 = r0
        L_0x0030:
            java.lang.String r4 = "Fail to capture the web view"
            l0.e.C(r4, r2)
        L_0x0035:
            if (r3 != 0) goto L_0x006d
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0066 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0066 }
            if (r2 == 0) goto L_0x0060
            if (r3 != 0) goto L_0x0044
            goto L_0x0060
        L_0x0044:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0066 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0066 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0066 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0066 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0066 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0066 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0066 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0066 }
            r0 = r4
            goto L_0x006e
        L_0x0060:
            java.lang.String r8 = "Width or height of view is zero"
            l0.e.K(r8)     // Catch:{ RuntimeException -> 0x0066 }
            goto L_0x006e
        L_0x0066:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            l0.e.C(r2, r8)
            goto L_0x006e
        L_0x006d:
            r0 = r3
        L_0x006e:
            if (r0 != 0) goto L_0x0076
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.uc.d(r8)
            return
        L_0x0076:
            r7.f7530k = r1
            e7.i r8 = new e7.i
            r8.<init>((com.google.android.gms.internal.ads.n6) r7, (android.graphics.Bitmap) r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L_0x008f
            r8.run()
            goto L_0x0098
        L_0x008f:
            e8.o50 r0 = e8.h9.f14881a
            e8.k9 r0 = (e8.k9) r0
            java.util.concurrent.Executor r0 = r0.f15244a
            r0.execute(r8)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n6.g(android.view.View):void");
    }

    public final p50<Void> h() {
        p50<Void> i10;
        boolean z10 = this.f7526g;
        if (!((z10 && this.f7527h.f14095g) || (this.f7531l && this.f7527h.f14094f) || (!z10 && this.f7527h.f14092d))) {
            return yh.h(null);
        }
        synchronized (this.f7528i) {
            for (yq.h.b j10 : this.f7521b.values()) {
                yq.b bVar = this.f7520a;
                yq.h hVar = (yq.h) ((aq) j10.j());
                if (bVar.f5971c) {
                    bVar.n();
                    bVar.f5971c = false;
                }
                yq.D((yq) bVar.f5970b, hVar);
            }
            yq.b bVar2 = this.f7520a;
            List<String> list = this.f7522c;
            if (bVar2.f5971c) {
                bVar2.n();
                bVar2.f5971c = false;
            }
            yq.F((yq) bVar2.f5970b, list);
            yq.b bVar3 = this.f7520a;
            List<String> list2 = this.f7523d;
            if (bVar3.f5971c) {
                bVar3.n();
                bVar3.f5971c = false;
            }
            yq.H((yq) bVar3.f5970b, list2);
            if (((Boolean) c1.f14074a.b()).booleanValue()) {
                String y10 = ((yq) this.f7520a.f5970b).y();
                String K = ((yq) this.f7520a.f5970b).K();
                StringBuilder sb2 = new StringBuilder(String.valueOf(y10).length() + 53 + String.valueOf(K).length());
                sb2.append("Sending SB report\n  url: ");
                sb2.append(y10);
                sb2.append("\n  clickUrl: ");
                sb2.append(K);
                sb2.append("\n  resources: \n");
                StringBuilder sb3 = new StringBuilder(sb2.toString());
                for (T t10 : Collections.unmodifiableList(((yq) this.f7520a.f5970b).J())) {
                    sb3.append("    [");
                    sb3.append(t10.E());
                    sb3.append("] ");
                    sb3.append(t10.y());
                }
                uc.d(sb3.toString());
            }
            p50<String> a10 = new d(this.f7524e).a(1, this.f7527h.f14090b, (Map<String, String>) null, ((yq) ((aq) this.f7520a.j())).f());
            if (((Boolean) c1.f14074a.b()).booleanValue()) {
                ((d7) a10).f6188a.a(b8.f13902a, h9.f14881a);
            }
            i10 = yh.i(a10, a8.f13667a, h9.f14886f);
        }
        return i10;
    }
}
