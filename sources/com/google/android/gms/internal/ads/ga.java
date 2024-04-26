package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import c8.a;
import c8.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import d7.l;
import e8.co;
import e8.fn;
import e8.h9;
import e8.o50;
import e8.q9;
import e8.sg0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ga extends c0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, co {

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f6617v = {"2011", "1009", "3010"};

    /* renamed from: a  reason: collision with root package name */
    public final String f6618a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public Map<String, WeakReference<View>> f6619b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f6620c;

    /* renamed from: d  reason: collision with root package name */
    public FrameLayout f6621d;

    /* renamed from: e  reason: collision with root package name */
    public o50 f6622e;

    /* renamed from: f  reason: collision with root package name */
    public View f6623f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6624g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public fn f6625h;

    /* renamed from: i  reason: collision with root package name */
    public sg0 f6626i;

    /* renamed from: r  reason: collision with root package name */
    public a f6627r = null;

    /* renamed from: s  reason: collision with root package name */
    public y f6628s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6629t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6630u = false;

    public ga(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f6620c = frameLayout;
        this.f6621d = frameLayout2;
        this.f6624g = ModuleDescriptor.MODULE_VERSION;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "a7.m".equals(canonicalName);
            str = "3012";
        }
        this.f6618a = str;
        q9 q9Var = l.B.A;
        q9.a(frameLayout, this);
        q9 q9Var2 = l.B.A;
        q9.b(frameLayout, this);
        this.f6622e = h9.f14885e;
        this.f6626i = new sg0(this.f6620c.getContext(), this.f6620c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized Map<String, WeakReference<View>> B5() {
        return this.f6619b;
    }

    public final /* synthetic */ View E1() {
        return this.f6620c;
    }

    public final synchronized View G3(String str) {
        if (this.f6630u) {
            return null;
        }
        WeakReference weakReference = this.f6619b.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized Map<String, WeakReference<View>> H1() {
        return null;
    }

    public final sg0 Q5() {
        return this.f6626i;
    }

    public final synchronized JSONObject Y() {
        JSONObject q10;
        fn fnVar = this.f6625h;
        if (fnVar == null) {
            return null;
        }
        FrameLayout frameLayout = this.f6620c;
        Map<String, WeakReference<View>> d42 = d4();
        Map<String, WeakReference<View>> B5 = B5();
        synchronized (fnVar) {
            q10 = fnVar.f14654j.q(frameLayout, d42, B5);
        }
        return q10;
    }

    public final a b2() {
        return this.f6627r;
    }

    public final synchronized Map<String, WeakReference<View>> d4() {
        return this.f6619b;
    }

    public final synchronized String i3() {
        return this.f6618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void j2(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f6630u     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f6619b     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f6619b     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.f6624g     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.ads.internal.util.k.k(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ga.j2(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized void onClick(View view) {
        fn fnVar = this.f6625h;
        if (fnVar != null) {
            synchronized (fnVar) {
                fnVar.f14654j.g();
            }
            this.f6625h.c(view, this.f6620c, d4(), B5(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        fn fnVar = this.f6625h;
        if (fnVar != null) {
            fnVar.g(this.f6620c, d4(), B5(), fn.o(this.f6620c));
        }
    }

    public final synchronized void onScrollChanged() {
        fn fnVar = this.f6625h;
        if (fnVar != null) {
            fnVar.g(this.f6620c, d4(), B5(), fn.o(this.f6620c));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        fn fnVar = this.f6625h;
        if (fnVar != null) {
            FrameLayout frameLayout = this.f6620c;
            synchronized (fnVar) {
                fnVar.f14654j.k(view, motionEvent, frameLayout);
            }
        }
        return false;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void s6(c8.a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6630u     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            java.lang.Object r3 = c8.b.z0(r3)     // Catch:{ all -> 0x0055 }
            boolean r0 = r3 instanceof e8.fn     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r3 = "Not an instance of native engine. This is most likely a transient error"
            l0.e.K(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r2)
            return
        L_0x0016:
            e8.fn r0 = r2.f6625h     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x001d
            r0.i(r2)     // Catch:{ all -> 0x0055 }
        L_0x001d:
            monitor-enter(r2)     // Catch:{ all -> 0x0055 }
            e8.o50 r0 = r2.f6622e     // Catch:{ all -> 0x0052 }
            f7.j r1 = new f7.j     // Catch:{ all -> 0x0052 }
            r1.<init>((com.google.android.gms.internal.ads.ga) r2)     // Catch:{ all -> 0x0052 }
            r0.execute(r1)     // Catch:{ all -> 0x0052 }
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            e8.fn r3 = (e8.fn) r3     // Catch:{ all -> 0x0055 }
            r2.f6625h = r3     // Catch:{ all -> 0x0055 }
            r3.d(r2)     // Catch:{ all -> 0x0055 }
            e8.fn r3 = r2.f6625h     // Catch:{ all -> 0x0055 }
            android.widget.FrameLayout r0 = r2.f6620c     // Catch:{ all -> 0x0055 }
            r3.e(r0)     // Catch:{ all -> 0x0055 }
            e8.fn r3 = r2.f6625h     // Catch:{ all -> 0x0055 }
            android.widget.FrameLayout r0 = r2.f6621d     // Catch:{ all -> 0x0055 }
            r3.f(r0)     // Catch:{ all -> 0x0055 }
            boolean r3 = r2.f6629t     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x0050
            e8.fn r3 = r2.f6625h     // Catch:{ all -> 0x0055 }
            e8.in r3 = r3.f14670z     // Catch:{ all -> 0x0055 }
            com.google.android.gms.internal.ads.y r0 = r2.f6628s     // Catch:{ all -> 0x0055 }
            monitor-enter(r3)     // Catch:{ all -> 0x0055 }
            r3.f15059a = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            goto L_0x0050
        L_0x004d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0050:
            monitor-exit(r2)
            return
        L_0x0052:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            throw r3     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ga.s6(c8.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void t6(com.google.android.gms.internal.ads.y r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f6630u     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r0 = 1
            r1.f6629t = r0     // Catch:{ all -> 0x001c }
            r1.f6628s = r2     // Catch:{ all -> 0x001c }
            e8.fn r0 = r1.f6625h     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            e8.in r0 = r0.f14670z     // Catch:{ all -> 0x001c }
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            r0.f15059a = r2     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001a
        L_0x0017:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ga.t6(com.google.android.gms.internal.ads.y):void");
    }

    public final FrameLayout u4() {
        return this.f6621d;
    }

    public final synchronized void u6(String str, a aVar) {
        j2(str, (View) b.z0(aVar), true);
    }

    public final synchronized a v6(String str) {
        return new b(G3(str));
    }

    public final synchronized void w6(a aVar) {
        fn fnVar = this.f6625h;
        View view = (View) b.z0(aVar);
        synchronized (fnVar) {
            fnVar.f14654j.c(view);
        }
    }

    public final void x6(a aVar) {
        onTouch(this.f6620c, (MotionEvent) b.z0(aVar));
    }

    public final synchronized void y6(a aVar) {
        if (!this.f6630u) {
            this.f6627r = aVar;
        }
    }
}
