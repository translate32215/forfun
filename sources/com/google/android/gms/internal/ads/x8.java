package com.google.android.gms.internal.ads;

import android.content.Context;
import c8.a;
import e8.f9;
import e8.pj;
import e8.zi;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x8 implements zi, pj {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8504a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f8505b;

    /* renamed from: c  reason: collision with root package name */
    public final qe f8506c;

    /* renamed from: d  reason: collision with root package name */
    public final f9 f8507d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public a f8508e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public boolean f8509f;

    public x8(Context context, t7 t7Var, qe qeVar, f9 f9Var) {
        this.f8504a = context;
        this.f8505b = t7Var;
        this.f8506c = qeVar;
        this.f8507d = f9Var;
    }

    public final synchronized void O() {
        t7 t7Var;
        if (!this.f8509f) {
            a();
        }
        if (!(!this.f8506c.N || this.f8508e == null || (t7Var = this.f8505b) == null)) {
            t7Var.O("onSdkImpression", new s.a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.android.gms.internal.ads.qe r0 = r13.f8506c     // Catch:{ all -> 0x00e9 }
            boolean r0 = r0.N     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r13)
            return
        L_0x0009:
            com.google.android.gms.internal.ads.t7 r0 = r13.f8505b     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r13)
            return
        L_0x000f:
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.o4 r0 = r0.f13205v     // Catch:{ all -> 0x00e9 }
            android.content.Context r1 = r13.f8504a     // Catch:{ all -> 0x00e9 }
            boolean r0 = r0.e(r1)     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r13)
            return
        L_0x001d:
            e8.f9 r0 = r13.f8507d     // Catch:{ all -> 0x00e9 }
            int r1 = r0.f14545b     // Catch:{ all -> 0x00e9 }
            int r0 = r0.f14546c     // Catch:{ all -> 0x00e9 }
            r2 = 23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ all -> 0x00e9 }
            r3.append(r1)     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = "."
            r3.append(r1)     // Catch:{ all -> 0x00e9 }
            r3.append(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.qe r0 = r13.f8506c     // Catch:{ all -> 0x00e9 }
            cb.d r0 = r0.P     // Catch:{ all -> 0x00e9 }
            java.lang.String r9 = r0.c()     // Catch:{ all -> 0x00e9 }
            e8.l<java.lang.Boolean> r0 = e8.t.H2     // Catch:{ all -> 0x00e9 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x00e9 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00e9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00e9 }
            r1 = 1
            if (r0 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.qe r0 = r13.f8506c     // Catch:{ all -> 0x00e9 }
            cb.d r0 = r0.P     // Catch:{ all -> 0x00e9 }
            j7.a r0 = r0.a()     // Catch:{ all -> 0x00e9 }
            j7.a r2 = j7.a.VIDEO     // Catch:{ all -> 0x00e9 }
            if (r0 != r2) goto L_0x0067
            com.google.android.gms.internal.ads.p4 r0 = com.google.android.gms.internal.ads.p4.VIDEO     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.q4 r2 = com.google.android.gms.internal.ads.q4.DEFINED_BY_JAVASCRIPT     // Catch:{ all -> 0x00e9 }
        L_0x0064:
            r11 = r0
            r10 = r2
            goto L_0x0075
        L_0x0067:
            com.google.android.gms.internal.ads.p4 r0 = com.google.android.gms.internal.ads.p4.HTML_DISPLAY     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.qe r2 = r13.f8506c     // Catch:{ all -> 0x00e9 }
            int r2 = r2.f7950e     // Catch:{ all -> 0x00e9 }
            if (r2 != r1) goto L_0x0072
            com.google.android.gms.internal.ads.q4 r2 = com.google.android.gms.internal.ads.q4.ONE_PIXEL     // Catch:{ all -> 0x00e9 }
            goto L_0x0064
        L_0x0072:
            com.google.android.gms.internal.ads.q4 r2 = com.google.android.gms.internal.ads.q4.BEGIN_TO_RENDER     // Catch:{ all -> 0x00e9 }
            goto L_0x0064
        L_0x0075:
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.o4 r4 = r0.f13205v     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.t7 r0 = r13.f8505b     // Catch:{ all -> 0x00e9 }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x00e9 }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            com.google.android.gms.internal.ads.qe r0 = r13.f8506c     // Catch:{ all -> 0x00e9 }
            java.lang.String r12 = r0.f7953f0     // Catch:{ all -> 0x00e9 }
            c8.a r0 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00e9 }
            r13.f8508e = r0     // Catch:{ all -> 0x00e9 }
            goto L_0x00a4
        L_0x008e:
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.o4 r4 = r0.f13205v     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.t7 r0 = r13.f8505b     // Catch:{ all -> 0x00e9 }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x00e9 }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            java.lang.String r10 = "Google"
            c8.a r0 = r4.b(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00e9 }
            r13.f8508e = r0     // Catch:{ all -> 0x00e9 }
        L_0x00a4:
            com.google.android.gms.internal.ads.t7 r0 = r13.f8505b     // Catch:{ all -> 0x00e9 }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x00e9 }
            c8.a r2 = r13.f8508e     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x00e7
            if (r0 == 0) goto L_0x00e7
            d7.l r3 = d7.l.B     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.o4 r3 = r3.f13205v     // Catch:{ all -> 0x00e9 }
            r3.c(r2, r0)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.t7 r0 = r13.f8505b     // Catch:{ all -> 0x00e9 }
            c8.a r2 = r13.f8508e     // Catch:{ all -> 0x00e9 }
            r0.D(r2)     // Catch:{ all -> 0x00e9 }
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.o4 r0 = r0.f13205v     // Catch:{ all -> 0x00e9 }
            c8.a r2 = r13.f8508e     // Catch:{ all -> 0x00e9 }
            r0.d(r2)     // Catch:{ all -> 0x00e9 }
            r13.f8509f = r1     // Catch:{ all -> 0x00e9 }
            e8.l<java.lang.Boolean> r0 = e8.t.J2     // Catch:{ all -> 0x00e9 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x00e9 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00e9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x00e7
            com.google.android.gms.internal.ads.t7 r0 = r13.f8505b     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = "onSdkLoaded"
            s.a r2 = new s.a     // Catch:{ all -> 0x00e9 }
            r2.<init>()     // Catch:{ all -> 0x00e9 }
            r0.O(r1, r2)     // Catch:{ all -> 0x00e9 }
        L_0x00e7:
            monitor-exit(r13)
            return
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r13)
            goto L_0x00ed
        L_0x00ec:
            throw r0
        L_0x00ed:
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x8.a():void");
    }

    public final synchronized void v() {
        if (!this.f8509f) {
            a();
        }
    }
}
