package f7;

import c8.a;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.uo;
import com.google.android.gms.internal.ads.vd;
import e8.aa;
import e8.cf;
import e8.cs;
import e8.eg;
import e8.fn;
import e8.gh;
import e8.h4;
import e8.jv;
import e8.nr;
import e8.pn;
import e8.pr;
import e8.sr;
import e8.yp;
import e8.yq;
import java.lang.ref.WeakReference;
import u7.z;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18293a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18294b;

    public j(a aVar) {
        this.f18293a = 10;
        this.f18294b = aVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0330  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f18293a
            r1 = 0
            r2 = 1
            r3 = 2
            r4 = 0
            switch(r0) {
                case 0: goto L_0x02c7;
                case 1: goto L_0x02b5;
                case 2: goto L_0x02ad;
                case 3: goto L_0x02a3;
                case 4: goto L_0x029b;
                case 5: goto L_0x0289;
                case 6: goto L_0x0281;
                case 7: goto L_0x0279;
                case 8: goto L_0x026b;
                case 9: goto L_0x0237;
                case 10: goto L_0x01fb;
                case 11: goto L_0x01ef;
                case 12: goto L_0x01dc;
                case 13: goto L_0x01b8;
                case 14: goto L_0x01b1;
                case 15: goto L_0x019f;
                case 16: goto L_0x00de;
                case 17: goto L_0x00d6;
                case 18: goto L_0x00a6;
                case 19: goto L_0x009e;
                case 20: goto L_0x006a;
                case 21: goto L_0x0062;
                case 22: goto L_0x005a;
                case 23: goto L_0x0052;
                case 24: goto L_0x0042;
                case 25: goto L_0x003a;
                case 26: goto L_0x0026;
                case 27: goto L_0x0014;
                case 28: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x036d
        L_0x000b:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.internal.ads.ud r0 = (com.google.android.gms.internal.ads.ud) r0
            r1 = 5
            r0.t6(r1)
            return
        L_0x0014:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.internal.ads.j8 r0 = (com.google.android.gms.internal.ads.j8) r0
            java.lang.Object r0 = r0.f7136d
            com.google.android.gms.internal.ads.kd r0 = (com.google.android.gms.internal.ads.kd) r0
            com.google.android.gms.internal.ads.j8 r0 = r0.f7237d
            java.lang.Object r0 = r0.f7135c
            e8.ov r0 = (e8.ov) r0
            r0.v()
            return
        L_0x0026:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.internal.ads.kd r0 = (com.google.android.gms.internal.ads.kd) r0
            com.google.android.gms.internal.ads.j8 r0 = r0.f7237d
            java.lang.Object r0 = r0.f7136d
            e8.pi r0 = (e8.pi) r0
            com.google.android.gms.internal.ads.we r1 = com.google.android.gms.internal.ads.we.APP_ID_MISSING
            e8.zh0 r1 = l0.e.p(r1, r4, r4)
            r0.j0(r1)
            return
        L_0x003a:
            java.lang.Object r0 = r9.f18294b
            e8.jv r0 = (e8.jv) r0
            r0.a()
            return
        L_0x0042:
            java.lang.Object r0 = r9.f18294b
            e8.cs r0 = (e8.cs) r0
            e8.l7 r0 = r0.f14186d
            e8.p50 r0 = r0.a()
            java.lang.String r1 = "persistFlags"
            e.e.g(r0, r1)
            return
        L_0x0052:
            java.lang.Object r0 = r9.f18294b
            e8.sr r0 = (e8.sr) r0
            r0.a()
            return
        L_0x005a:
            java.lang.Object r0 = r9.f18294b
            e8.pr r0 = (e8.pr) r0
            r0.a()
            return
        L_0x0062:
            java.lang.Object r0 = r9.f18294b
            e8.nr r0 = (e8.nr) r0
            r0.a()
            return
        L_0x006a:
            java.lang.Object r0 = r9.f18294b
            e8.yq r0 = (e8.yq) r0
            monitor-enter(r0)
            boolean r2 = r0.f17650b     // Catch:{ all -> 0x009b }
            if (r2 == 0) goto L_0x0075
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            goto L_0x009a
        L_0x0075:
            java.lang.String r2 = "com.google.android.gms.ads.MobileAds"
            java.lang.String r3 = "Timeout."
            d7.l r4 = d7.l.B     // Catch:{ all -> 0x009b }
            z7.b r4 = r4.f13193j     // Catch:{ all -> 0x009b }
            long r4 = r4.a()     // Catch:{ all -> 0x009b }
            long r6 = r0.f17651c     // Catch:{ all -> 0x009b }
            long r4 = r4 - r6
            int r5 = (int) r4     // Catch:{ all -> 0x009b }
            java.util.Map<java.lang.String, e8.y3> r4 = r0.f17661m     // Catch:{ all -> 0x009b }
            e8.y3 r6 = new e8.y3     // Catch:{ all -> 0x009b }
            r6.<init>(r2, r1, r5, r3)     // Catch:{ all -> 0x009b }
            r4.put(r2, r6)     // Catch:{ all -> 0x009b }
            com.google.android.gms.internal.ads.d7<java.lang.Boolean> r1 = r0.f17652d     // Catch:{ all -> 0x009b }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x009b }
            r2.<init>()     // Catch:{ all -> 0x009b }
            r1.c(r2)     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
        L_0x009a:
            return
        L_0x009b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r1
        L_0x009e:
            java.lang.Object r0 = r9.f18294b
            e8.yp r0 = (e8.yp) r0
            r0.a()
            return
        L_0x00a6:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.internal.ads.ga r0 = (com.google.android.gms.internal.ads.ga) r0
            android.view.View r2 = r0.f6623f
            if (r2 != 0) goto L_0x00c4
            android.view.View r2 = new android.view.View
            android.widget.FrameLayout r3 = r0.f6620c
            android.content.Context r3 = r3.getContext()
            r2.<init>(r3)
            r0.f6623f = r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r1)
            r2.setLayoutParams(r3)
        L_0x00c4:
            android.widget.FrameLayout r1 = r0.f6620c
            android.view.View r2 = r0.f6623f
            android.view.ViewParent r2 = r2.getParent()
            if (r1 == r2) goto L_0x00d5
            android.widget.FrameLayout r1 = r0.f6620c
            android.view.View r0 = r0.f6623f
            r1.addView(r0)
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.Object r0 = r9.f18294b
            e8.pn r0 = (e8.pn) r0
            r0.e()
            return
        L_0x00de:
            java.lang.Object r0 = r9.f18294b
            e8.fn r0 = (e8.fn) r0
            r0.getClass()
            e8.jn r1 = r0.f14653i     // Catch:{ RemoteException -> 0x0198 }
            int r1 = r1.k()     // Catch:{ RemoteException -> 0x0198 }
            java.lang.String r5 = "Google"
            if (r1 == r2) goto L_0x017f
            if (r1 == r3) goto L_0x0166
            r3 = 3
            if (r1 == r3) goto L_0x012d
            r3 = 6
            if (r1 == r3) goto L_0x0114
            r2 = 7
            if (r1 == r2) goto L_0x0101
            java.lang.String r0 = "Wrong native template id!"
            l0.e.I(r0)     // Catch:{ RemoteException -> 0x0198 }
            goto L_0x019e
        L_0x0101:
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.c2 r1 = r1.f16187e     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x019e
            e8.pa0<com.google.android.gms.internal.ads.sa> r0 = r0.f14661q     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0198 }
            e8.d4 r0 = (e8.d4) r0     // Catch:{ RemoteException -> 0x0198 }
            r1.W1(r0)     // Catch:{ RemoteException -> 0x0198 }
            goto L_0x019e
        L_0x0114:
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.f1 r1 = r1.f16185c     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x019e
            r0.n(r5, r2)     // Catch:{ RemoteException -> 0x0198 }
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.f1 r1 = r1.f16185c     // Catch:{ RemoteException -> 0x0198 }
            e8.pa0<com.google.android.gms.internal.ads.wa> r0 = r0.f14660p     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.k1 r0 = (com.google.android.gms.internal.ads.k1) r0     // Catch:{ RemoteException -> 0x0198 }
            r1.m3(r0)     // Catch:{ RemoteException -> 0x0198 }
            goto L_0x019e
        L_0x012d:
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            e8.jn r3 = r0.f14653i     // Catch:{ RemoteException -> 0x0198 }
            java.lang.String r3 = r3.c()     // Catch:{ RemoteException -> 0x0198 }
            s.i<java.lang.String, com.google.android.gms.internal.ads.y0> r1 = r1.f16188f     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r1 = r1.getOrDefault(r3, r4)     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.y0 r1 = (com.google.android.gms.internal.ads.y0) r1     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x019e
            e8.jn r1 = r0.f14653i     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.t7 r1 = r1.o()     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x014a
            r0.n(r5, r2)     // Catch:{ RemoteException -> 0x0198 }
        L_0x014a:
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            e8.jn r2 = r0.f14653i     // Catch:{ RemoteException -> 0x0198 }
            java.lang.String r2 = r2.c()     // Catch:{ RemoteException -> 0x0198 }
            s.i<java.lang.String, com.google.android.gms.internal.ads.y0> r1 = r1.f16188f     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r1 = r1.getOrDefault(r2, r4)     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.y0 r1 = (com.google.android.gms.internal.ads.y0) r1     // Catch:{ RemoteException -> 0x0198 }
            e8.pa0<e8.ap> r0 = r0.f14662r     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.l0 r0 = (com.google.android.gms.internal.ads.l0) r0     // Catch:{ RemoteException -> 0x0198 }
            r1.o2(r0)     // Catch:{ RemoteException -> 0x0198 }
            goto L_0x019e
        L_0x0166:
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.o0 r1 = r1.f16184b     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x019e
            r0.n(r5, r2)     // Catch:{ RemoteException -> 0x0198 }
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.o0 r1 = r1.f16184b     // Catch:{ RemoteException -> 0x0198 }
            e8.pa0<com.google.android.gms.internal.ads.ua> r0 = r0.f14659o     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.e0 r0 = (com.google.android.gms.internal.ads.e0) r0     // Catch:{ RemoteException -> 0x0198 }
            r1.K4(r0)     // Catch:{ RemoteException -> 0x0198 }
            goto L_0x019e
        L_0x017f:
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.s0 r1 = r1.f16183a     // Catch:{ RemoteException -> 0x0198 }
            if (r1 == 0) goto L_0x019e
            r0.n(r5, r2)     // Catch:{ RemoteException -> 0x0198 }
            e8.qn r1 = r0.f14657m     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.s0 r1 = r1.f16183a     // Catch:{ RemoteException -> 0x0198 }
            e8.pa0<com.google.android.gms.internal.ads.va> r0 = r0.f14658n     // Catch:{ RemoteException -> 0x0198 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0198 }
            com.google.android.gms.internal.ads.i0 r0 = (com.google.android.gms.internal.ads.i0) r0     // Catch:{ RemoteException -> 0x0198 }
            r1.K2(r0)     // Catch:{ RemoteException -> 0x0198 }
            goto L_0x019e
        L_0x0198:
            r0 = move-exception
            java.lang.String r1 = "RemoteException when notifyAdLoad is called"
            l0.e.C(r1, r0)
        L_0x019e:
            return
        L_0x019f:
            java.lang.Object r0 = r9.f18294b
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.d9 r0 = (com.google.android.gms.internal.ads.d9) r0
            if (r0 == 0) goto L_0x01b0
            com.google.android.gms.internal.ads.j9 r1 = e8.bk.f14036a
            r0.I0(r1)
        L_0x01b0:
            return
        L_0x01b1:
            java.lang.Object r0 = r9.f18294b
            e8.gh r0 = (e8.gh) r0
            r0.f14783d = r1
            return
        L_0x01b8:
            java.lang.Object r0 = r9.f18294b
            e8.eg r0 = (e8.eg) r0
            e8.qn r1 = r0.f14474m
            com.google.android.gms.internal.ads.b1 r1 = r1.f16186d
            if (r1 == 0) goto L_0x01db
            e8.pa0<com.google.android.gms.internal.ads.bd> r2 = r0.f14476o     // Catch:{ RemoteException -> 0x01d5 }
            java.lang.Object r2 = r2.get()     // Catch:{ RemoteException -> 0x01d5 }
            com.google.android.gms.internal.ads.dy r2 = (com.google.android.gms.internal.ads.dy) r2     // Catch:{ RemoteException -> 0x01d5 }
            android.content.Context r0 = r0.f14469h     // Catch:{ RemoteException -> 0x01d5 }
            c8.b r3 = new c8.b     // Catch:{ RemoteException -> 0x01d5 }
            r3.<init>(r0)     // Catch:{ RemoteException -> 0x01d5 }
            r1.P3(r2, r3)     // Catch:{ RemoteException -> 0x01d5 }
            goto L_0x01db
        L_0x01d5:
            r0 = move-exception
            java.lang.String r1 = "RemoteException when notifyAdLoad is called"
            l0.e.C(r1, r0)
        L_0x01db:
            return
        L_0x01dc:
            java.lang.Object r0 = r9.f18294b
            e8.cf r0 = (e8.cf) r0
            e8.af r0 = r0.f14129b
            com.google.android.gms.internal.ads.p8 r0 = r0.f13716d
            monitor-enter(r0)
            r0.g()     // Catch:{ all -> 0x01ec }
            r0.f7835i = r2     // Catch:{ all -> 0x01ec }
            monitor-exit(r0)
            return
        L_0x01ec:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x01ef:
            java.lang.Object r0 = r9.f18294b
            e8.cf r0 = (e8.cf) r0
            e8.af r0 = r0.f14129b
            com.google.android.gms.internal.ads.p8 r0 = r0.f13716d
            r0.a()
            return
        L_0x01fb:
            java.lang.Object r0 = r9.f18294b
            c8.a r0 = (c8.a) r0
            int r1 = e8.dc.f14245d
            d7.l r1 = d7.l.B
            com.google.android.gms.internal.ads.o4 r1 = r1.f13205v
            r1.getClass()
            java.lang.Object r3 = com.google.android.gms.internal.ads.o4.f7665b
            monitor-enter(r3)
            e8.l<java.lang.Boolean> r2 = e8.t.F2     // Catch:{ all -> 0x0234 }
            e8.ti0 r4 = e8.ti0.f16763j     // Catch:{ all -> 0x0234 }
            com.google.android.gms.internal.ads.e r4 = r4.f16769f     // Catch:{ all -> 0x0234 }
            java.lang.Object r2 = r4.a(r2)     // Catch:{ all -> 0x0234 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0234 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0234 }
            if (r2 == 0) goto L_0x0232
            boolean r2 = com.google.android.gms.internal.ads.o4.f7666c     // Catch:{ all -> 0x0234 }
            if (r2 != 0) goto L_0x0222
            goto L_0x0232
        L_0x0222:
            monitor-exit(r3)     // Catch:{ all -> 0x0234 }
            com.google.android.gms.internal.ads.jf r1 = r1.f7668a     // Catch:{ RemoteException -> 0x022b, NullPointerException -> 0x0229 }
            r1.C5(r0)     // Catch:{ RemoteException -> 0x022b, NullPointerException -> 0x0229 }
            goto L_0x0233
        L_0x0229:
            r0 = move-exception
            goto L_0x022c
        L_0x022b:
            r0 = move-exception
        L_0x022c:
            java.lang.String r1 = "#007 Could not call remote method."
            l0.e.F(r1, r0)
            goto L_0x0233
        L_0x0232:
            monitor-exit(r3)     // Catch:{ all -> 0x0234 }
        L_0x0233:
            return
        L_0x0234:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0234 }
            throw r0
        L_0x0237:
            java.lang.Object r0 = r9.f18294b
            java.lang.String r0 = (java.lang.String) r0
            d7.l r1 = d7.l.B
            com.google.android.gms.internal.ads.y6 r1 = r1.f13190g
            com.google.android.gms.internal.ads.f r1 = r1.e()
            java.lang.String r0 = r0.substring(r2)
            java.util.HashSet<java.lang.String> r2 = r1.f6343g
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L_0x0250
            goto L_0x026a
        L_0x0250:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = r1.f6342f
            java.lang.String r5 = "sdkVersion"
            r2.put(r5, r3)
            java.lang.String r3 = "ue"
            r2.put(r3, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.f6338b
            java.util.Map r0 = r1.a(r0, r2)
            r1.b(r0, r4)
        L_0x026a:
            return
        L_0x026b:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.internal.ads.i7 r0 = (com.google.android.gms.internal.ads.i7) r0
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = com.google.android.gms.internal.ads.i7.f6920z
            java.lang.String r2 = "surfaceDestroyed"
            r0.h(r2, r1)
            return
        L_0x0279:
            java.lang.Object r0 = r9.f18294b
            e8.aa r0 = (e8.aa) r0
            r0.i()
            return
        L_0x0281:
            java.lang.Object r0 = r9.f18294b
            e8.h4 r0 = (e8.h4) r0
            r0.destroy()
            return
        L_0x0289:
            java.lang.Object r0 = r9.f18294b
            u7.z r0 = (u7.z) r0
            u7.y r0 = r0.f26147g
            s7.a r1 = new s7.a
            r2 = 4
            r1.<init>(r2)
            u7.r r0 = (u7.r) r0
            r0.b(r1)
            return
        L_0x029b:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.common.api.internal.e r0 = (com.google.android.gms.common.api.internal.e) r0
            r0.f()
            return
        L_0x02a3:
            java.lang.Object r0 = r9.f18294b
            r7.j r0 = (r7.j) r0
            java.lang.String r1 = "Service disconnected"
            r0.a(r3, r1)
            return
        L_0x02ad:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.ads.internal.util.o r0 = (com.google.android.gms.ads.internal.util.o) r0
            r0.w()
            return
        L_0x02b5:
            java.lang.Object r0 = r9.f18294b
            f7.a r0 = (f7.a) r0
            java.lang.Thread.currentThread()
            r0.getClass()
            java.lang.Object r0 = r9.f18294b
            f7.a r0 = (f7.a) r0
            r0.a()
            return
        L_0x02c7:
            java.lang.Object r0 = r9.f18294b
            f7.g r0 = (f7.g) r0
            r0.getClass()
            d7.l r3 = d7.l.B
            com.google.android.gms.ads.internal.util.b r3 = r3.f13196m
            android.content.Context r4 = r0.f18269a
            java.lang.String r5 = r0.f18271c
            java.lang.String r0 = r0.f18272d
            r3.getClass()
            e8.l<java.lang.String> r6 = e8.t.f16641q2
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r6 = r7.a(r6)
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r6 = r3.d(r4, r6, r5, r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.google.android.gms.ads.internal.util.b.e(r4, r6, r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x02ff
            java.lang.String r6 = "Not linked for in app preview."
            l0.e.E(r6)
            goto L_0x0327
        L_0x02ff:
            java.lang.String r6 = r6.trim()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0321 }
            r7.<init>(r6)     // Catch:{ JSONException -> 0x0321 }
            java.lang.String r6 = "gct"
            java.lang.String r6 = r7.optString(r6)     // Catch:{ JSONException -> 0x0321 }
            java.lang.String r8 = "status"
            java.lang.String r7 = r7.optString(r8)     // Catch:{ JSONException -> 0x0321 }
            r3.f5660e = r7     // Catch:{ JSONException -> 0x0321 }
            java.lang.Object r7 = r3.f5656a
            monitor-enter(r7)
            r3.f5658c = r6     // Catch:{ all -> 0x031e }
            monitor-exit(r7)     // Catch:{ all -> 0x031e }
            r6 = 1
            goto L_0x0328
        L_0x031e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x031e }
            throw r0
        L_0x0321:
            r6 = move-exception
            java.lang.String r7 = "Fail to get in app preview response json."
            l0.e.D(r7, r6)
        L_0x0327:
            r6 = 0
        L_0x0328:
            if (r6 != 0) goto L_0x0330
            java.lang.String r0 = "In-app preview failed to load because of a system error. Please try again later."
            r3.a(r4, r0, r2, r2)
            goto L_0x036c
        L_0x0330:
            java.lang.String r6 = "2"
            java.lang.String r7 = r3.f5660e
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0345
            java.lang.String r0 = "Creative is not pushed for this device."
            l0.e.E(r0)
            java.lang.String r0 = "There was no creative pushed from DFP to the device."
            r3.a(r4, r0, r1, r1)
            goto L_0x036c
        L_0x0345:
            java.lang.String r6 = "1"
            java.lang.String r7 = r3.f5660e
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0358
            java.lang.String r1 = "The app is not linked for creative preview."
            l0.e.E(r1)
            r3.f(r4, r5, r0)
            goto L_0x036c
        L_0x0358:
            java.lang.String r0 = "0"
            java.lang.String r5 = r3.f5660e
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x036c
            java.lang.String r0 = "Device is linked for in app preview."
            l0.e.E(r0)
            java.lang.String r0 = "The device is successfully linked for creative preview."
            r3.a(r4, r0, r1, r2)
        L_0x036c:
            return
        L_0x036d:
            java.lang.Object r0 = r9.f18294b
            com.google.android.gms.internal.ads.vd r0 = (com.google.android.gms.internal.ads.vd) r0
            e8.hz r0 = r0.f8355d
            com.google.android.gms.internal.ads.we r1 = com.google.android.gms.internal.ads.we.INVALID_AD_UNIT_ID
            e8.zh0 r1 = l0.e.p(r1, r4, r4)
            r0.j0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.j.run():void");
    }

    public j(o oVar) {
        this.f18293a = 2;
        this.f18294b = oVar;
    }

    public j(e eVar) {
        this.f18293a = 4;
        this.f18294b = eVar;
    }

    public j(j8 j8Var) {
        this.f18293a = 27;
        this.f18294b = j8Var;
    }

    public j(ga gaVar) {
        this.f18293a = 18;
        this.f18294b = gaVar;
    }

    public j(kd kdVar) {
        this.f18293a = 26;
        this.f18294b = kdVar;
    }

    public j(ud udVar) {
        this.f18293a = 28;
        this.f18294b = udVar;
    }

    public j(vd vdVar) {
        this.f18293a = 29;
        this.f18294b = vdVar;
    }

    public j(h4 h4Var) {
        this.f18293a = 6;
        this.f18294b = h4Var;
    }

    public j(aa aaVar) {
        this.f18293a = 7;
        this.f18294b = aaVar;
    }

    public j(cf cfVar) {
        this.f18293a = 11;
        this.f18294b = cfVar;
    }

    public j(cf cfVar, q.e eVar) {
        this.f18293a = 12;
        this.f18294b = cfVar;
    }

    public j(eg egVar) {
        this.f18293a = 13;
        this.f18294b = egVar;
    }

    public j(gh ghVar) {
        this.f18293a = 14;
        this.f18294b = ghVar;
    }

    public j(fn fnVar) {
        this.f18293a = 16;
        this.f18294b = fnVar;
    }

    public j(pn pnVar) {
        this.f18293a = 17;
        this.f18294b = pnVar;
    }

    public j(yp ypVar) {
        this.f18293a = 19;
        this.f18294b = ypVar;
    }

    public j(yq yqVar) {
        this.f18293a = 20;
        this.f18294b = yqVar;
    }

    public j(nr nrVar) {
        this.f18293a = 21;
        this.f18294b = nrVar;
    }

    public j(pr prVar) {
        this.f18293a = 22;
        this.f18294b = prVar;
    }

    public j(sr srVar) {
        this.f18293a = 23;
        this.f18294b = srVar;
    }

    public j(cs csVar) {
        this.f18293a = 24;
        this.f18294b = csVar;
    }

    public j(jv jvVar) {
        this.f18293a = 25;
        this.f18294b = jvVar;
    }

    public j(g gVar) {
        this.f18293a = 0;
        this.f18294b = gVar;
    }

    public j(String str) {
        this.f18293a = 9;
        this.f18294b = str;
    }

    public j(r7.j jVar) {
        this.f18293a = 3;
        this.f18294b = jVar;
    }

    public j(z zVar) {
        this.f18293a = 5;
        this.f18294b = zVar;
    }

    public j(i7 i7Var) {
        this.f18293a = 8;
        this.f18294b = i7Var;
    }

    public j(a aVar) {
        this.f18293a = 1;
        this.f18294b = aVar;
    }

    public j(d9 d9Var, uo uoVar) {
        this.f18293a = 15;
        this.f18293a = 15;
        this.f18294b = new WeakReference(d9Var);
    }
}
