package e8;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.fd;
import com.google.android.gms.internal.ads.o4;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.ua;
import com.google.android.gms.internal.ads.va;
import com.google.android.gms.internal.ads.wa;
import d7.l;
import e7.e;
import e7.i;
import f7.j;
import f7.j0;
import java.util.concurrent.Executor;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fn extends ah {
    public final fd A;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f14652h;

    /* renamed from: i  reason: collision with root package name */
    public final jn f14653i;

    /* renamed from: j  reason: collision with root package name */
    public final pn f14654j;

    /* renamed from: k  reason: collision with root package name */
    public final tn f14655k;

    /* renamed from: l  reason: collision with root package name */
    public final mn f14656l;

    /* renamed from: m  reason: collision with root package name */
    public final qn f14657m;

    /* renamed from: n  reason: collision with root package name */
    public final pa0<va> f14658n;

    /* renamed from: o  reason: collision with root package name */
    public final pa0<ua> f14659o;

    /* renamed from: p  reason: collision with root package name */
    public final pa0<wa> f14660p;

    /* renamed from: q  reason: collision with root package name */
    public final pa0<sa> f14661q;

    /* renamed from: r  reason: collision with root package name */
    public final pa0<ap> f14662r;

    /* renamed from: s  reason: collision with root package name */
    public co f14663s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14664t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14665u = false;

    /* renamed from: v  reason: collision with root package name */
    public final j8 f14666v;

    /* renamed from: w  reason: collision with root package name */
    public final tm f14667w;

    /* renamed from: x  reason: collision with root package name */
    public final f9 f14668x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f14669y;

    /* renamed from: z  reason: collision with root package name */
    public final in f14670z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fn(zg zgVar, Executor executor, jn jnVar, pn pnVar, tn tnVar, mn mnVar, qn qnVar, pa0<va> pa0, pa0<ua> pa02, pa0<wa> pa03, pa0<sa> pa04, pa0<ap> pa05, j8 j8Var, tm tmVar, f9 f9Var, Context context, in inVar, fd fdVar) {
        super(zgVar);
        this.f14652h = executor;
        this.f14653i = jnVar;
        this.f14654j = pnVar;
        this.f14655k = tnVar;
        this.f14656l = mnVar;
        this.f14657m = qnVar;
        this.f14658n = pa0;
        this.f14659o = pa02;
        this.f14660p = pa03;
        this.f14661q = pa04;
        this.f14662r = pa05;
        this.f14666v = j8Var;
        this.f14667w = tmVar;
        this.f14668x = f9Var;
        this.f14669y = context;
        this.f14670z = inVar;
        this.A = fdVar;
    }

    public static boolean o(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    public final synchronized void a() {
        this.f14652h.execute(new e(this));
        super.a();
    }

    public final void b() {
        this.f14652h.execute(new j(this));
        if (this.f14653i.k() != 7) {
            Executor executor = this.f14652h;
            pn pnVar = this.f14654j;
            pnVar.getClass();
            executor.execute(new j(pnVar));
        }
        super.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(android.view.View r7, android.view.View r8, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r9, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r10, boolean r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            e8.tn r0 = r6.f14655k     // Catch:{ all -> 0x006f }
            e8.co r1 = r6.f14663s     // Catch:{ all -> 0x006f }
            r0.getClass()     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.ia r2 = r0.f16779e     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0032
            android.widget.FrameLayout r2 = r1.u4()     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x0015
            goto L_0x0032
        L_0x0015:
            e8.mn r2 = r0.f16777c     // Catch:{ all -> 0x006f }
            boolean r2 = r2.c()     // Catch:{ all -> 0x006f }
            if (r2 != 0) goto L_0x001e
            goto L_0x0032
        L_0x001e:
            android.widget.FrameLayout r1 = r1.u4()     // Catch:{ ec -> 0x002c }
            com.google.android.gms.internal.ads.ia r0 = r0.f16779e     // Catch:{ ec -> 0x002c }
            android.view.View r0 = r0.a()     // Catch:{ ec -> 0x002c }
            r1.addView(r0)     // Catch:{ ec -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r0 = move-exception
            java.lang.String r1 = "web view can not be obtained"
            l0.e.v(r1, r0)     // Catch:{ all -> 0x006f }
        L_0x0032:
            e8.pn r0 = r6.f14654j     // Catch:{ all -> 0x006f }
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.l(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x006f }
            boolean r7 = r6.f14665u     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x006d
            e8.l<java.lang.Boolean> r7 = e8.t.K1     // Catch:{ all -> 0x006f }
            e8.ti0 r8 = e8.ti0.f16763j     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.e r8 = r8.f16769f     // Catch:{ all -> 0x006f }
            java.lang.Object r7 = r8.a(r7)     // Catch:{ all -> 0x006f }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x006f }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x006d
            e8.jn r7 = r6.f14653i     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.t7 r7 = r7.o()     // Catch:{ all -> 0x006f }
            if (r7 != 0) goto L_0x005b
            goto L_0x006d
        L_0x005b:
            e8.jn r7 = r6.f14653i     // Catch:{ all -> 0x006f }
            com.google.android.gms.internal.ads.t7 r7 = r7.o()     // Catch:{ all -> 0x006f }
            java.lang.String r8 = "onSdkAdUserInteractionClick"
            s.a r9 = new s.a     // Catch:{ all -> 0x006f }
            r9.<init>()     // Catch:{ all -> 0x006f }
            r7.O(r8, r9)     // Catch:{ all -> 0x006f }
            monitor-exit(r6)
            return
        L_0x006d:
            monitor-exit(r6)
            return
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.fn.c(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void d(co coVar) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.Y0)).booleanValue()) {
            p.f5702i.post(new i(this, coVar));
        } else {
            h(coVar);
        }
    }

    public final void e(View view) {
        a q10 = this.f14653i.q();
        boolean z10 = this.f14653i.p() != null;
        if (this.f14656l.a() && q10 != null && z10 && view != null) {
            l.B.f13205v.c(q10, view);
        }
    }

    public final void f(View view) {
        a q10 = this.f14653i.q();
        if (this.f14656l.a() && q10 != null && view != null) {
            o4 o4Var = l.B.f13205v;
            o4Var.getClass();
            synchronized (o4.f7665b) {
                if (((Boolean) ti0.f16763j.f16769f.a(t.F2)).booleanValue()) {
                    if (o4.f7666c) {
                        try {
                            o4Var.f7668a.w4(q10, new b(view));
                        } catch (RemoteException | NullPointerException e10) {
                            l0.e.F("#007 Could not call remote method.", e10);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f14664t     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            if (r6 == 0) goto L_0x001a
            e8.tn r6 = r2.f14655k     // Catch:{ all -> 0x006a }
            e8.co r1 = r2.f14663s     // Catch:{ all -> 0x006a }
            r6.c(r1)     // Catch:{ all -> 0x006a }
            e8.pn r6 = r2.f14654j     // Catch:{ all -> 0x006a }
            r6.m(r3, r4, r5)     // Catch:{ all -> 0x006a }
            r2.f14664t = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)
            return
        L_0x001a:
            if (r6 != 0) goto L_0x0068
            e8.l<java.lang.Boolean> r6 = e8.t.Q1     // Catch:{ all -> 0x006a }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x006a }
            java.lang.Object r6 = r1.a(r6)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x006a }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x0068
            java.util.Set r6 = r4.entrySet()     // Catch:{ all -> 0x006a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x006a }
        L_0x0038:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x006a }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006a }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006a }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0038
            boolean r1 = o(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0038
            e8.tn r6 = r2.f14655k     // Catch:{ all -> 0x006a }
            e8.co r1 = r2.f14663s     // Catch:{ all -> 0x006a }
            r6.c(r1)     // Catch:{ all -> 0x006a }
            e8.pn r6 = r2.f14654j     // Catch:{ all -> 0x006a }
            r6.m(r3, r4, r5)     // Catch:{ all -> 0x006a }
            r2.f14664t = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)
            return
        L_0x0068:
            monitor-exit(r2)
            return
        L_0x006a:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x006e
        L_0x006d:
            throw r3
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.fn.g(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final void h(co coVar) {
        c40 c40;
        this.f14663s = coVar;
        tn tnVar = this.f14655k;
        tnVar.f16781g.execute(new m(tnVar, coVar));
        this.f14654j.a(coVar.E1(), coVar.B5(), coVar.H1(), coVar, coVar);
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16634p1)).booleanValue() && (c40 = this.f14667w.f8207b) != null) {
            c40.a(coVar.E1());
        }
        if (coVar.Q5() != null) {
            sg0 Q5 = coVar.Q5();
            Q5.f16484t.add(this.f14666v);
            Q5.c(3);
        }
    }

    public final synchronized void i(co coVar) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.Y0)).booleanValue()) {
            p.f5702i.post(new j0(this, coVar));
        } else {
            j(coVar);
        }
    }

    public final void j(co coVar) {
        this.f14654j.i(coVar.E1(), coVar.d4());
        if (coVar.u4() != null) {
            coVar.u4().setClickable(false);
            coVar.u4().removeAllViews();
        }
        if (coVar.Q5() != null) {
            sg0 Q5 = coVar.Q5();
            Q5.f16484t.remove(this.f14666v);
        }
        this.f14663s = null;
    }

    public final synchronized void k(Bundle bundle) {
        this.f14654j.j(bundle);
    }

    public final synchronized void l(Bundle bundle) {
        this.f14654j.b(bundle);
    }

    public final synchronized boolean m(Bundle bundle) {
        if (this.f14664t) {
            return true;
        }
        boolean p10 = this.f14654j.p(bundle);
        this.f14664t = p10;
        return p10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.String r18, boolean r19) {
        /*
            r17 = this;
            r1 = r17
            e8.mn r0 = r1.f14656l
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            e8.jn r0 = r1.f14653i
            com.google.android.gms.internal.ads.t7 r0 = r0.p()
            e8.jn r2 = r1.f14653i
            com.google.android.gms.internal.ads.t7 r2 = r2.o()
            if (r0 != 0) goto L_0x001c
            if (r2 != 0) goto L_0x001c
            return
        L_0x001c:
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0025
            r3 = 1
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r5 = r0
            goto L_0x0031
        L_0x0029:
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = "javascript"
            r12 = r0
            r5 = r2
            goto L_0x0032
        L_0x0030:
            r5 = 0
        L_0x0031:
            r12 = 0
        L_0x0032:
            android.webkit.WebView r0 = r5.getWebView()
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "Webview is null in InternalNativeAd"
            l0.e.K(r0)
            return
        L_0x003e:
            d7.l r0 = d7.l.B
            com.google.android.gms.internal.ads.o4 r0 = r0.f13205v
            android.content.Context r7 = r1.f14669y
            boolean r0 = r0.e(r7)
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "Failed to initialize omid in InternalNativeAd"
            l0.e.K(r0)
            return
        L_0x0050:
            e8.f9 r0 = r1.f14668x
            int r7 = r0.f14545b
            int r0 = r0.f14546c
            r8 = 23
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            r9.append(r7)
            java.lang.String r7 = "."
            r9.append(r7)
            r9.append(r0)
            java.lang.String r8 = r9.toString()
            e8.l<java.lang.Boolean> r0 = e8.t.I2
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r7 = r7.a(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0109
            if (r3 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.p4 r7 = com.google.android.gms.internal.ads.p4.VIDEO
            com.google.android.gms.internal.ads.q4 r9 = com.google.android.gms.internal.ads.q4.DEFINED_BY_JAVASCRIPT
            goto L_0x0095
        L_0x0085:
            com.google.android.gms.internal.ads.p4 r7 = com.google.android.gms.internal.ads.p4.NATIVE_DISPLAY
            e8.jn r9 = r1.f14653i
            int r9 = r9.k()
            r10 = 3
            if (r9 != r10) goto L_0x0093
            com.google.android.gms.internal.ads.q4 r9 = com.google.android.gms.internal.ads.q4.UNSPECIFIED
            goto L_0x0095
        L_0x0093:
            com.google.android.gms.internal.ads.q4 r9 = com.google.android.gms.internal.ads.q4.ONE_PIXEL
        L_0x0095:
            d7.l r10 = d7.l.B
            com.google.android.gms.internal.ads.o4 r10 = r10.f13205v
            android.webkit.WebView r11 = r5.getWebView()
            java.lang.String r13 = ""
            java.lang.String r14 = "javascript"
            com.google.android.gms.internal.ads.qe r15 = r1.f13725b
            java.lang.String r15 = r15.f7953f0
            r10.getClass()
            java.lang.Object r16 = com.google.android.gms.internal.ads.o4.f7665b
            monitor-enter(r16)
            e8.l<java.lang.Boolean> r6 = e8.t.F2     // Catch:{ all -> 0x0106 }
            e8.ti0 r4 = e8.ti0.f16763j     // Catch:{ all -> 0x0106 }
            com.google.android.gms.internal.ads.e r4 = r4.f16769f     // Catch:{ all -> 0x0106 }
            java.lang.Object r4 = r4.a(r6)     // Catch:{ all -> 0x0106 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0106 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0106 }
            if (r4 == 0) goto L_0x0103
            boolean r4 = com.google.android.gms.internal.ads.o4.f7666c     // Catch:{ all -> 0x0106 }
            if (r4 != 0) goto L_0x00c2
            goto L_0x0103
        L_0x00c2:
            monitor-exit(r16)     // Catch:{ all -> 0x0106 }
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r0 = r4.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00de
            r7 = r10
            r9 = r11
            r10 = r13
            r11 = r14
            r13 = r18
            c8.a r6 = r7.b(r8, r9, r10, r11, r12, r13)
            goto L_0x011b
        L_0x00de:
            com.google.android.gms.internal.ads.jf r0 = r10.f7668a     // Catch:{ RemoteException -> 0x00fc, NullPointerException -> 0x00fa }
            c8.b r4 = new c8.b     // Catch:{ RemoteException -> 0x00fc, NullPointerException -> 0x00fa }
            r4.<init>(r11)     // Catch:{ RemoteException -> 0x00fc, NullPointerException -> 0x00fa }
            java.lang.String r6 = r9.f7917a     // Catch:{ RemoteException -> 0x00fc, NullPointerException -> 0x00fa }
            java.lang.String r11 = r7.f7809a     // Catch:{ RemoteException -> 0x00fc, NullPointerException -> 0x00fa }
            r7 = r0
            r9 = r4
            r10 = r13
            r0 = r11
            r11 = r14
            r13 = r18
            r14 = r6
            r4 = r15
            r15 = r0
            r16 = r4
            c8.a r6 = r7.s2(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ RemoteException -> 0x00fc, NullPointerException -> 0x00fa }
            goto L_0x011b
        L_0x00fa:
            r0 = move-exception
            goto L_0x00fd
        L_0x00fc:
            r0 = move-exception
        L_0x00fd:
            java.lang.String r4 = "#007 Could not call remote method."
            l0.e.F(r4, r0)
            goto L_0x0104
        L_0x0103:
            monitor-exit(r16)     // Catch:{ all -> 0x0106 }
        L_0x0104:
            r6 = 0
            goto L_0x011b
        L_0x0106:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0106 }
            throw r0
        L_0x0109:
            d7.l r0 = d7.l.B
            com.google.android.gms.internal.ads.o4 r7 = r0.f13205v
            android.webkit.WebView r9 = r5.getWebView()
            java.lang.String r10 = ""
            java.lang.String r11 = "javascript"
            r13 = r18
            c8.a r6 = r7.b(r8, r9, r10, r11, r12, r13)
        L_0x011b:
            if (r6 != 0) goto L_0x0123
            java.lang.String r0 = "Failed to create omid session in InternalNativeAd"
            l0.e.K(r0)
            return
        L_0x0123:
            e8.jn r4 = r1.f14653i
            monitor-enter(r4)
            r4.f15166k = r6     // Catch:{ all -> 0x0164 }
            monitor-exit(r4)
            r5.D(r6)
            if (r3 == 0) goto L_0x013e
            android.view.View r0 = r2.getView()
            if (r0 == 0) goto L_0x013b
            d7.l r2 = d7.l.B
            com.google.android.gms.internal.ads.o4 r2 = r2.f13205v
            r2.c(r6, r0)
        L_0x013b:
            r2 = 1
            r1.f14665u = r2
        L_0x013e:
            if (r19 == 0) goto L_0x0163
            d7.l r0 = d7.l.B
            com.google.android.gms.internal.ads.o4 r0 = r0.f13205v
            r0.d(r6)
            e8.l<java.lang.Boolean> r0 = e8.t.J2
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = "onSdkLoaded"
            s.a r2 = new s.a
            r2.<init>()
            r5.O(r0, r2)
        L_0x0163:
            return
        L_0x0164:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.fn.n(java.lang.String, boolean):void");
    }
}
