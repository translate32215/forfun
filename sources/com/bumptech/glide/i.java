package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import c4.e;
import c4.f;
import com.bumptech.glide.c;
import d4.h;
import g4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z3.c;
import z3.d;
import z3.k;
import z3.l;
import z3.m;
import z3.p;
import z3.q;
import z3.s;

/* compiled from: RequestManager */
public class i implements ComponentCallbacks2, l {

    /* renamed from: s  reason: collision with root package name */
    public static final f f4937s;

    /* renamed from: a  reason: collision with root package name */
    public final b f4938a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4939b;

    /* renamed from: c  reason: collision with root package name */
    public final k f4940c;

    /* renamed from: d  reason: collision with root package name */
    public final q f4941d;

    /* renamed from: e  reason: collision with root package name */
    public final p f4942e;

    /* renamed from: f  reason: collision with root package name */
    public final s f4943f = new s();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f4944g;

    /* renamed from: h  reason: collision with root package name */
    public final c f4945h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList<e<Object>> f4946i;

    /* renamed from: r  reason: collision with root package name */
    public f f4947r;

    /* compiled from: RequestManager */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = i.this;
            iVar.f4940c.b(iVar);
        }
    }

    /* compiled from: RequestManager */
    public class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final q f4949a;

        public b(q qVar) {
            this.f4949a = qVar;
        }
    }

    static {
        f fVar = (f) new f().c(Bitmap.class);
        fVar.B = true;
        f4937s = fVar;
        ((f) new f().c(x3.c.class)).B = true;
        f fVar2 = (f) ((f) ((f) new f().d(m3.k.f21589b)).k(f.LOW)).o(true);
    }

    public i(b bVar, k kVar, p pVar, Context context) {
        c cVar;
        f fVar;
        q qVar = new q();
        d dVar = bVar.f4889g;
        a aVar = new a();
        this.f4944g = aVar;
        this.f4938a = bVar;
        this.f4940c = kVar;
        this.f4942e = pVar;
        this.f4941d = qVar;
        this.f4939b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(qVar);
        ((z3.f) dVar).getClass();
        boolean z10 = d0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z10) {
            cVar = new z3.e(applicationContext, bVar2);
        } else {
            cVar = new m();
        }
        this.f4945h = cVar;
        if (j.h()) {
            j.f().post(aVar);
        } else {
            kVar.b(this);
        }
        kVar.b(cVar);
        this.f4946i = new CopyOnWriteArrayList<>(bVar.f4885c.f4912e);
        d dVar2 = bVar.f4885c;
        synchronized (dVar2) {
            if (dVar2.f4917j == null) {
                ((c.a) dVar2.f4911d).getClass();
                f fVar2 = new f();
                fVar2.B = true;
                dVar2.f4917j = fVar2;
            }
            fVar = dVar2.f4917j;
        }
        synchronized (this) {
            f fVar3 = (f) fVar.clone();
            if (fVar3.B) {
                if (!fVar3.D) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            fVar3.D = true;
            fVar3.B = true;
            this.f4947r = fVar3;
        }
        synchronized (bVar.f4890h) {
            if (!bVar.f4890h.contains(this)) {
                bVar.f4890h.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public synchronized void Z() {
        k();
        this.f4943f.Z();
    }

    public void i(h<?> hVar) {
        boolean z10;
        if (hVar != null) {
            boolean l10 = l(hVar);
            c4.c g10 = hVar.g();
            if (!l10) {
                b bVar = this.f4938a;
                synchronized (bVar.f4890h) {
                    Iterator<i> it = bVar.f4890h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().l(hVar)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (!z10 && g10 != null) {
                    hVar.f((c4.c) null);
                    g10.clear();
                }
            }
        }
    }

    public h<Drawable> j(String str) {
        return new h(this.f4938a, this, Drawable.class, this.f4939b).A(str);
    }

    public synchronized void k() {
        q qVar = this.f4941d;
        qVar.f28269c = true;
        Iterator it = ((ArrayList) j.e(qVar.f28267a)).iterator();
        while (it.hasNext()) {
            c4.c cVar = (c4.c) it.next();
            if (cVar.isRunning()) {
                cVar.g();
                qVar.f28268b.add(cVar);
            }
        }
    }

    public synchronized boolean l(h<?> hVar) {
        c4.c g10 = hVar.g();
        if (g10 == null) {
            return true;
        }
        if (!this.f4941d.a(g10)) {
            return false;
        }
        this.f4943f.f28277a.remove(hVar);
        hVar.f((c4.c) null);
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.f4943f.onDestroy();
        for (T i10 : j.e(this.f4943f.f28277a)) {
            i(i10);
        }
        this.f4943f.f28277a.clear();
        q qVar = this.f4941d;
        Iterator it = ((ArrayList) j.e(qVar.f28267a)).iterator();
        while (it.hasNext()) {
            qVar.a((c4.c) it.next());
        }
        qVar.f28268b.clear();
        this.f4940c.a(this);
        this.f4940c.a(this.f4945h);
        j.f().removeCallbacks(this.f4944g);
        b bVar = this.f4938a;
        synchronized (bVar.f4890h) {
            if (bVar.f4890h.contains(this)) {
                bVar.f4890h.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i10) {
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f4941d + ", treeNode=" + this.f4942e + "}";
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void v0() {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            z3.q r0 = r1.f4941d     // Catch:{ all -> 0x0011 }
            r0.c()     // Catch:{ all -> 0x0011 }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            z3.s r0 = r1.f4943f     // Catch:{ all -> 0x000f }
            r0.v0()     // Catch:{ all -> 0x000f }
            monitor-exit(r1)
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0014
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0014:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.i.v0():void");
    }
}
