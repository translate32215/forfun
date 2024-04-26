package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.c;
import e7.k;
import e8.af;
import e8.bj;
import e8.c5;
import e8.ef;
import e8.f3;
import e8.f5;
import e8.h9;
import e8.i5;
import e8.o50;
import e8.p50;
import e8.u4;
import e8.ug0;
import e8.vg0;
import e8.x4;
import e8.y4;
import e8.zi;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p8 implements k, zi, bj, ug0 {

    /* renamed from: a  reason: collision with root package name */
    public final af f7827a;

    /* renamed from: b  reason: collision with root package name */
    public final o8 f7828b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<t7> f7829c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final i5<JSONObject, JSONObject> f7830d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f7831e;

    /* renamed from: f  reason: collision with root package name */
    public final b f7832f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicBoolean f7833g = new AtomicBoolean(false);
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public final ef f7834h = new ef();

    /* renamed from: i  reason: collision with root package name */
    public boolean f7835i = false;

    /* renamed from: r  reason: collision with root package name */
    public WeakReference<?> f7836r = new WeakReference<>(this);

    public p8(c5 c5Var, o8 o8Var, Executor executor, af afVar, b bVar) {
        this.f7827a = afVar;
        y4<JSONObject> y4Var = x4.f17438b;
        c5Var.a();
        this.f7830d = new i5<>((p50) c5Var.f14083b, "google.afma.activeView.handleUpdate", (j2) y4Var, (k2) y4Var);
        this.f7828b = o8Var;
        this.f7831e = executor;
        this.f7832f = bVar;
    }

    public final void G1() {
    }

    public final void J3(c cVar) {
    }

    public final synchronized void O() {
        if (this.f7833g.compareAndSet(false, true)) {
            this.f7827a.a(this);
            a();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference<?> r0 = r5.f7836r     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0078 }
            r1 = 1
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 != 0) goto L_0x001b
            monitor-enter(r5)     // Catch:{ all -> 0x0078 }
            r5.g()     // Catch:{ all -> 0x0018 }
            r5.f7835i = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r5)     // Catch:{ all -> 0x0078 }
            monitor-exit(r5)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x001b:
            boolean r0 = r5.f7835i     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0076
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f7833g     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0076
            e8.ef r0 = r5.f7834h     // Catch:{ Exception -> 0x0070 }
            z7.b r1 = r5.f7832f     // Catch:{ Exception -> 0x0070 }
            long r1 = r1.a()     // Catch:{ Exception -> 0x0070 }
            r0.f14457c = r1     // Catch:{ Exception -> 0x0070 }
            com.google.android.gms.internal.ads.o8 r0 = r5.f7828b     // Catch:{ Exception -> 0x0070 }
            e8.ef r1 = r5.f7834h     // Catch:{ Exception -> 0x0070 }
            org.json.JSONObject r0 = r0.c(r1)     // Catch:{ Exception -> 0x0070 }
            java.util.Set<com.google.android.gms.internal.ads.t7> r1 = r5.f7829c     // Catch:{ Exception -> 0x0070 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0070 }
        L_0x003f:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0070 }
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0070 }
            com.google.android.gms.internal.ads.t7 r2 = (com.google.android.gms.internal.ads.t7) r2     // Catch:{ Exception -> 0x0070 }
            java.util.concurrent.Executor r3 = r5.f7831e     // Catch:{ Exception -> 0x0070 }
            e7.i r4 = new e7.i     // Catch:{ Exception -> 0x0070 }
            r4.<init>((com.google.android.gms.internal.ads.t7) r2, (org.json.JSONObject) r0)     // Catch:{ Exception -> 0x0070 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0070 }
            goto L_0x003f
        L_0x0056:
            e8.i5<org.json.JSONObject, org.json.JSONObject> r1 = r5.f7830d     // Catch:{ Exception -> 0x0070 }
            e8.p50 r0 = r1.a(r0)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            e8.k8 r2 = new e8.k8     // Catch:{ Exception -> 0x0070 }
            r3 = 2
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0070 }
            e8.o50 r1 = e8.h9.f14886f     // Catch:{ Exception -> 0x0070 }
            f7.j0 r3 = new f7.j0     // Catch:{ Exception -> 0x0070 }
            r3.<init>((java.util.concurrent.Future) r0, (com.google.android.gms.internal.ads.zh) r2)     // Catch:{ Exception -> 0x0070 }
            r0.a(r3, r1)     // Catch:{ Exception -> 0x0070 }
            monitor-exit(r5)
            return
        L_0x0070:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            l0.e.v(r1, r0)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r5)
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x007c
        L_0x007b:
            throw r0
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p8.a():void");
    }

    public final void g() {
        for (t7 next : this.f7829c) {
            af afVar = this.f7827a;
            next.e("/updateActiveView", afVar.f13717e);
            next.e("/untrackActiveViewUnit", afVar.f13718f);
        }
        af afVar2 = this.f7827a;
        c5 c5Var = afVar2.f13714b;
        f3<Object> f3Var = afVar2.f13717e;
        p50<u4> p50 = c5Var.f14083b;
        f5 f5Var = new f5("/updateActiveView", (f3) f3Var);
        o50 o50 = h9.f14886f;
        c5Var.f14083b = yh.i(p50, f5Var, o50);
        c5 c5Var2 = afVar2.f13714b;
        c5Var2.f14083b = yh.i(c5Var2.f14083b, new f5("/untrackActiveViewUnit", (f3) afVar2.f13718f), o50);
    }

    public final synchronized void l(Context context) {
        this.f7834h.f14456b = false;
        a();
    }

    public final synchronized void m(Context context) {
        this.f7834h.f14458d = "u";
        a();
        g();
        this.f7835i = true;
    }

    public final synchronized void onPause() {
        this.f7834h.f14456b = true;
        a();
    }

    public final synchronized void onResume() {
        this.f7834h.f14456b = false;
        a();
    }

    public final synchronized void t(vg0 vg0) {
        ef efVar = this.f7834h;
        efVar.f14455a = vg0.f17142j;
        efVar.f14459e = vg0;
        a();
    }

    public final synchronized void w(Context context) {
        this.f7834h.f14456b = true;
        a();
    }

    public final void x0() {
    }
}
