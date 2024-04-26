package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.leanback.widget.s;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import t7.a;
import t7.a.d;
import t7.c;
import t7.d;
import t7.j;
import u7.b0;
import u7.f;
import u7.h;
import u7.m;
import u7.o;
import u7.p;
import u7.r;
import u7.u;
import u7.x;
import u7.z;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class e<O extends a.d> implements d.a, d.b {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<j> f5779a = new LinkedList();
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final a.f f5780b;

    /* renamed from: c  reason: collision with root package name */
    public final u7.a<O> f5781c;

    /* renamed from: d  reason: collision with root package name */
    public final h f5782d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<b0> f5783e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Map<u7.e<?>, x> f5784f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final int f5785g;

    /* renamed from: h  reason: collision with root package name */
    public final z f5786h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5787i;

    /* renamed from: r  reason: collision with root package name */
    public final List<p> f5788r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public s7.a f5789s = null;

    /* renamed from: t  reason: collision with root package name */
    public int f5790t = 0;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f5791u;

    public e(b bVar, c<O> cVar) {
        this.f5791u = bVar;
        Looper looper = bVar.f5770v.getLooper();
        com.google.android.gms.common.internal.c a10 = cVar.a().a();
        a.C0249a aVar = cVar.f25825c.f25820a;
        i.h(aVar);
        a.f a11 = aVar.a(cVar.f25823a, looper, a10, cVar.f25826d, this, this);
        String str = cVar.f25824b;
        if (str != null && (a11 instanceof b)) {
            ((b) a11).A = str;
        }
        if (str != null && (a11 instanceof f)) {
            ((f) a11).getClass();
        }
        this.f5780b = a11;
        this.f5781c = cVar.f25827e;
        this.f5782d = new h();
        this.f5785g = cVar.f25828f;
        if (a11.m()) {
            this.f5786h = new z(bVar.f5761e, bVar.f5770v, cVar.a().a());
        } else {
            this.f5786h = null;
        }
    }

    public final void Y(int i10) {
        if (Looper.myLooper() == this.f5791u.f5770v.getLooper()) {
            g(i10);
        } else {
            this.f5791u.f5770v.post(new m(this, i10));
        }
    }

    public final s7.c a(s7.c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            s7.c[] i10 = this.f5780b.i();
            if (i10 == null) {
                i10 = new s7.c[0];
            }
            s.a aVar = new s.a(r3);
            for (s7.c cVar : i10) {
                aVar.put(cVar.f25007a, Long.valueOf(cVar.i()));
            }
            for (s7.c cVar2 : cVarArr) {
                Long l10 = (Long) aVar.get(cVar2.f25007a);
                if (l10 == null || l10.longValue() < cVar2.i()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void b(s7.a aVar) {
        Iterator<b0> it = this.f5783e.iterator();
        if (it.hasNext()) {
            b0 next = it.next();
            if (com.google.android.gms.common.internal.h.a(aVar, s7.a.f24998e)) {
                this.f5780b.j();
            }
            next.getClass();
            throw null;
        }
        this.f5783e.clear();
    }

    public final void c(Status status) {
        i.c(this.f5791u.f5770v);
        d(status, (Exception) null, false);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        i.c(this.f5791u.f5770v);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator it = this.f5779a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (!z10 || jVar.f5798a == 2) {
                    if (status != null) {
                        jVar.a(status);
                    } else {
                        jVar.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.f5779a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            j jVar = (j) arrayList.get(i10);
            if (this.f5780b.b()) {
                if (k(jVar)) {
                    this.f5779a.remove(jVar);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        o();
        b(s7.a.f24998e);
        j();
        Iterator<x> it = this.f5784f.values().iterator();
        if (!it.hasNext()) {
            e();
            h();
            return;
        }
        it.next().getClass();
        throw null;
    }

    public final void g(int i10) {
        o();
        this.f5787i = true;
        h hVar = this.f5782d;
        String k10 = this.f5780b.k();
        hVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (k10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(k10);
        }
        hVar.a(true, new Status(20, sb2.toString()));
        Handler handler = this.f5791u.f5770v;
        Message obtain = Message.obtain(handler, 9, this.f5781c);
        this.f5791u.getClass();
        handler.sendMessageDelayed(obtain, 5000);
        Handler handler2 = this.f5791u.f5770v;
        Message obtain2 = Message.obtain(handler2, 11, this.f5781c);
        this.f5791u.getClass();
        handler2.sendMessageDelayed(obtain2, 120000);
        this.f5791u.f5763g.f26590a.clear();
        Iterator<x> it = this.f5784f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
    }

    public final void h() {
        this.f5791u.f5770v.removeMessages(12, this.f5781c);
        Handler handler = this.f5791u.f5770v;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f5781c), this.f5791u.f5757a);
    }

    public final void i(j jVar) {
        jVar.d(this.f5782d, t());
        try {
            jVar.c(this);
        } catch (DeadObjectException unused) {
            Y(1);
            this.f5780b.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void j() {
        if (this.f5787i) {
            this.f5791u.f5770v.removeMessages(11, this.f5781c);
            this.f5791u.f5770v.removeMessages(9, this.f5781c);
            this.f5787i = false;
        }
    }

    public final boolean k(j jVar) {
        if (!(jVar instanceof u)) {
            i(jVar);
            return true;
        }
        u uVar = (u) jVar;
        s7.c a10 = a(uVar.g(this));
        if (a10 == null) {
            i(jVar);
            return true;
        }
        String name = this.f5780b.getClass().getName();
        String str = a10.f25007a;
        long i10 = a10.i();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        s.a(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(i10);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (!this.f5791u.f5771w || !uVar.f(this)) {
            uVar.b(new j(a10));
            return true;
        }
        p pVar = new p(this.f5781c, a10);
        int indexOf = this.f5788r.indexOf(pVar);
        if (indexOf >= 0) {
            p pVar2 = this.f5788r.get(indexOf);
            this.f5791u.f5770v.removeMessages(15, pVar2);
            Handler handler = this.f5791u.f5770v;
            Message obtain = Message.obtain(handler, 15, pVar2);
            this.f5791u.getClass();
            handler.sendMessageDelayed(obtain, 5000);
            return false;
        }
        this.f5788r.add(pVar);
        Handler handler2 = this.f5791u.f5770v;
        Message obtain2 = Message.obtain(handler2, 15, pVar);
        this.f5791u.getClass();
        handler2.sendMessageDelayed(obtain2, 5000);
        Handler handler3 = this.f5791u.f5770v;
        Message obtain3 = Message.obtain(handler3, 16, pVar);
        this.f5791u.getClass();
        handler3.sendMessageDelayed(obtain3, 120000);
        s7.a aVar = new s7.a(2, (PendingIntent) null);
        if (l(aVar)) {
            return false;
        }
        this.f5791u.b(aVar, this.f5785g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(s7.a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.b.f5756z
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.b r1 = r4.f5791u     // Catch:{ all -> 0x003a }
            u7.i r2 = r1.f5767s     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0037
            java.util.Set<u7.a<?>> r1 = r1.f5768t     // Catch:{ all -> 0x003a }
            u7.a<O> r2 = r4.f5781c     // Catch:{ all -> 0x003a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0037
            com.google.android.gms.common.api.internal.b r1 = r4.f5791u     // Catch:{ all -> 0x003a }
            u7.i r1 = r1.f5767s     // Catch:{ all -> 0x003a }
            int r2 = r4.f5785g     // Catch:{ all -> 0x003a }
            r1.getClass()     // Catch:{ all -> 0x003a }
            u7.c0 r3 = new u7.c0     // Catch:{ all -> 0x003a }
            r3.<init>(r5, r2)     // Catch:{ all -> 0x003a }
            java.util.concurrent.atomic.AtomicReference<u7.c0> r5 = r1.f26101c     // Catch:{ all -> 0x003a }
            r2 = 0
            boolean r5 = r5.compareAndSet(r2, r3)     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0034
            android.os.Handler r5 = r1.f26102d     // Catch:{ all -> 0x003a }
            u7.e0 r2 = new u7.e0     // Catch:{ all -> 0x003a }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x003a }
            r5.post(r2)     // Catch:{ all -> 0x003a }
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r5 = 1
            return r5
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r5 = 0
            return r5
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e.l(s7.a):boolean");
    }

    public final void m(s7.a aVar) {
        r(aVar, (Exception) null);
    }

    public final boolean n(boolean z10) {
        i.c(this.f5791u.f5770v);
        if (!this.f5780b.b() || this.f5784f.size() != 0) {
            return false;
        }
        h hVar = this.f5782d;
        if (!hVar.f26104a.isEmpty() || !hVar.f26105b.isEmpty()) {
            if (z10) {
                h();
            }
            return false;
        }
        this.f5780b.e("Timing out service connection.");
        return true;
    }

    public final void o() {
        i.c(this.f5791u.f5770v);
        this.f5789s = null;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [t7.a$f, p8.d] */
    public final void p() {
        i.c(this.f5791u.f5770v);
        if (!this.f5780b.b() && !this.f5780b.h()) {
            try {
                b bVar = this.f5791u;
                int a10 = bVar.f5763g.a(bVar.f5761e, this.f5780b);
                if (a10 != 0) {
                    s7.a aVar = new s7.a(a10, (PendingIntent) null);
                    String name = this.f5780b.getClass().getName();
                    String aVar2 = aVar.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + aVar2.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(aVar2);
                    Log.w("GoogleApiManager", sb2.toString());
                    r(aVar, (Exception) null);
                    return;
                }
                b bVar2 = this.f5791u;
                a.f fVar = this.f5780b;
                r rVar = new r(bVar2, fVar, this.f5781c);
                if (fVar.m()) {
                    z zVar = this.f5786h;
                    i.h(zVar);
                    z zVar2 = zVar;
                    p8.d dVar = zVar2.f26146f;
                    if (dVar != null) {
                        ((b) dVar).p();
                    }
                    zVar2.f26145e.f5848h = Integer.valueOf(System.identityHashCode(zVar2));
                    a.C0249a aVar3 = zVar2.f26143c;
                    Context context = zVar2.f26141a;
                    Looper looper = zVar2.f26142b.getLooper();
                    com.google.android.gms.common.internal.c cVar = zVar2.f26145e;
                    zVar2.f26146f = aVar3.a(context, looper, cVar, cVar.f5847g, zVar2, zVar2);
                    zVar2.f26147g = rVar;
                    Set<Scope> set = zVar2.f26144d;
                    if (set == null || set.isEmpty()) {
                        zVar2.f26142b.post(new f7.j(zVar2));
                    } else {
                        q8.a aVar4 = (q8.a) zVar2.f26146f;
                        aVar4.l(new b.d());
                    }
                }
                try {
                    this.f5780b.l(rVar);
                } catch (SecurityException e10) {
                    r(new s7.a(10), e10);
                }
            } catch (IllegalStateException e11) {
                r(new s7.a(10), e11);
            }
        }
    }

    public final void q(j jVar) {
        i.c(this.f5791u.f5770v);
        if (!this.f5780b.b()) {
            this.f5779a.add(jVar);
            s7.a aVar = this.f5789s;
            if (aVar == null || !aVar.i()) {
                p();
            } else {
                r(this.f5789s, (Exception) null);
            }
        } else if (k(jVar)) {
            h();
        } else {
            this.f5779a.add(jVar);
        }
    }

    public final void r(s7.a aVar, Exception exc) {
        p8.d dVar;
        i.c(this.f5791u.f5770v);
        z zVar = this.f5786h;
        if (!(zVar == null || (dVar = zVar.f26146f) == null)) {
            ((b) dVar).p();
        }
        o();
        this.f5791u.f5763g.f26590a.clear();
        b(aVar);
        if ((this.f5780b instanceof x7.d) && aVar.f25000b != 24) {
            b bVar = this.f5791u;
            bVar.f5758b = true;
            Handler handler = bVar.f5770v;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        if (aVar.f25000b == 4) {
            c(b.f5755y);
        } else if (this.f5779a.isEmpty()) {
            this.f5789s = aVar;
        } else if (exc != null) {
            i.c(this.f5791u.f5770v);
            d((Status) null, exc, false);
        } else if (this.f5791u.f5771w) {
            d(b.c(this.f5781c, aVar), (Exception) null, true);
            if (!this.f5779a.isEmpty() && !l(aVar) && !this.f5791u.b(aVar, this.f5785g)) {
                if (aVar.f25000b == 18) {
                    this.f5787i = true;
                }
                if (this.f5787i) {
                    Handler handler2 = this.f5791u.f5770v;
                    Message obtain = Message.obtain(handler2, 9, this.f5781c);
                    this.f5791u.getClass();
                    handler2.sendMessageDelayed(obtain, 5000);
                    return;
                }
                Status c10 = b.c(this.f5781c, aVar);
                i.c(this.f5791u.f5770v);
                d(c10, (Exception) null, false);
            }
        } else {
            Status c11 = b.c(this.f5781c, aVar);
            i.c(this.f5791u.f5770v);
            d(c11, (Exception) null, false);
        }
    }

    public final void s() {
        i.c(this.f5791u.f5770v);
        Status status = b.f5754x;
        c(status);
        h hVar = this.f5782d;
        hVar.getClass();
        hVar.a(false, status);
        for (u7.e iVar : (u7.e[]) this.f5784f.keySet().toArray(new u7.e[0])) {
            q(new i(iVar, new s8.j()));
        }
        b(new s7.a(4));
        if (this.f5780b.b()) {
            this.f5780b.a(new o(this));
        }
    }

    public final boolean t() {
        return this.f5780b.m();
    }

    public final void z0(Bundle bundle) {
        if (Looper.myLooper() == this.f5791u.f5770v.getLooper()) {
            f();
        } else {
            this.f5791u.f5770v.post(new f7.j(this));
        }
    }
}
