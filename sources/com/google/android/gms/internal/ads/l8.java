package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import e8.c;
import e8.f9;
import e8.jv;
import e8.t;
import e8.ti0;
import e8.u8;
import e8.y3;
import e8.yp;
import e8.yq;
import f7.d;
import f7.g;
import f7.j0;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import l0.e;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l8 extends uy {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7344a;

    /* renamed from: b  reason: collision with root package name */
    public final f9 f7345b;

    /* renamed from: c  reason: collision with root package name */
    public final gb f7346c;

    /* renamed from: d  reason: collision with root package name */
    public final ub<ue, ac> f7347d;

    /* renamed from: e  reason: collision with root package name */
    public final jv f7348e;

    /* renamed from: f  reason: collision with root package name */
    public final yq f7349f;

    /* renamed from: g  reason: collision with root package name */
    public final p6 f7350g;

    /* renamed from: h  reason: collision with root package name */
    public final yp f7351h;
    @GuardedBy("this")

    /* renamed from: i  reason: collision with root package name */
    public boolean f7352i = false;

    public l8(Context context, f9 f9Var, gb gbVar, ub<ue, ac> ubVar, jv jvVar, yq yqVar, p6 p6Var, yp ypVar) {
        this.f7344a = context;
        this.f7345b = f9Var;
        this.f7346c = gbVar;
        this.f7347d = ubVar;
        this.f7348e = jvVar;
        this.f7349f = yqVar;
        this.f7350g = p6Var;
        this.f7351h = ypVar;
    }

    public final synchronized void C3(float f10) {
        d dVar = l.B.f13191h;
        synchronized (dVar) {
            dVar.f18261b = f10;
        }
    }

    public final synchronized boolean I0() {
        return l.B.f13191h.c();
    }

    public final void M5(String str) {
        this.f7348e.b(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0099, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void P() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f7352i     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            l0.e.K(r0)     // Catch:{ all -> 0x009a }
            monitor-exit(r4)
            return
        L_0x000c:
            android.content.Context r0 = r4.f7344a     // Catch:{ all -> 0x009a }
            e8.t.a(r0)     // Catch:{ all -> 0x009a }
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.y6 r0 = r0.f13190g     // Catch:{ all -> 0x009a }
            android.content.Context r1 = r4.f7344a     // Catch:{ all -> 0x009a }
            e8.f9 r2 = r4.f7345b     // Catch:{ all -> 0x009a }
            r0.d(r1, r2)     // Catch:{ all -> 0x009a }
            d7.l r0 = d7.l.B     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.gv r0 = r0.f13192i     // Catch:{ all -> 0x009a }
            android.content.Context r1 = r4.f7344a     // Catch:{ all -> 0x009a }
            r0.b(r1)     // Catch:{ all -> 0x009a }
            r0 = 1
            r4.f7352i = r0     // Catch:{ all -> 0x009a }
            e8.yq r0 = r4.f7349f     // Catch:{ all -> 0x009a }
            r0.c()     // Catch:{ all -> 0x009a }
            e8.l<java.lang.Boolean> r0 = e8.t.R0     // Catch:{ all -> 0x009a }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x009a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x009a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x009a }
            r1 = 0
            if (r0 == 0) goto L_0x0063
            e8.jv r0 = r4.f7348e     // Catch:{ all -> 0x009a }
            r0.getClass()     // Catch:{ all -> 0x009a }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g     // Catch:{ all -> 0x009a }
            f7.d0 r2 = r2.f()     // Catch:{ all -> 0x009a }
            e8.kv r3 = new e8.kv     // Catch:{ all -> 0x009a }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x009a }
            com.google.android.gms.ads.internal.util.o r2 = (com.google.android.gms.ads.internal.util.o) r2     // Catch:{ all -> 0x009a }
            java.util.List<java.lang.Runnable> r2 = r2.f5681c     // Catch:{ all -> 0x009a }
            r2.add(r3)     // Catch:{ all -> 0x009a }
            java.util.concurrent.Executor r2 = r0.f15198c     // Catch:{ all -> 0x009a }
            f7.j r3 = new f7.j     // Catch:{ all -> 0x009a }
            r3.<init>((e8.jv) r0)     // Catch:{ all -> 0x009a }
            r2.execute(r3)     // Catch:{ all -> 0x009a }
        L_0x0063:
            e8.l<java.lang.Boolean> r0 = e8.t.T1     // Catch:{ all -> 0x009a }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x009a }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x009a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x009a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0098
            e8.yp r0 = r4.f7351h     // Catch:{ all -> 0x009a }
            r0.getClass()     // Catch:{ all -> 0x009a }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x009a }
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g     // Catch:{ all -> 0x009a }
            f7.d0 r2 = r2.f()     // Catch:{ all -> 0x009a }
            e8.zp r3 = new e8.zp     // Catch:{ all -> 0x009a }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x009a }
            com.google.android.gms.ads.internal.util.o r2 = (com.google.android.gms.ads.internal.util.o) r2     // Catch:{ all -> 0x009a }
            java.util.List<java.lang.Runnable> r1 = r2.f5681c     // Catch:{ all -> 0x009a }
            r1.add(r3)     // Catch:{ all -> 0x009a }
            java.util.concurrent.Executor r1 = r0.f17646b     // Catch:{ all -> 0x009a }
            f7.j r2 = new f7.j     // Catch:{ all -> 0x009a }
            r2.<init>((e8.yp) r0)     // Catch:{ all -> 0x009a }
            r1.execute(r2)     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r4)
            return
        L_0x009a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l8.P():void");
    }

    public final void P0(String str, a aVar) {
        String str2;
        j0 j0Var;
        t.a(this.f7344a);
        if (((Boolean) ti0.f16763j.f16769f.a(t.U1)).booleanValue()) {
            p pVar = l.B.f13186c;
            str2 = p.o(this.f7344a);
        } else {
            str2 = "";
        }
        String str3 = TextUtils.isEmpty(str2) ? str : str2;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.S1)).booleanValue();
            e8.l lVar = t.f16651s0;
            boolean booleanValue2 = booleanValue | ((Boolean) ti0.f16763j.f16769f.a(lVar)).booleanValue();
            if (((Boolean) ti0.f16763j.f16769f.a(lVar)).booleanValue()) {
                booleanValue2 = true;
                j0Var = new j0(this, (Runnable) b.z0(aVar));
            } else {
                j0Var = null;
            }
            if (booleanValue2) {
                l.B.f13194k.a(this.f7344a, this.f7345b, true, (u8) null, str3, (String) null, j0Var);
            }
        }
    }

    public final synchronized void W4(String str) {
        t.a(this.f7344a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.S1)).booleanValue()) {
                l.B.f13194k.a(this.f7344a, this.f7345b, true, (u8) null, str, (String) null, (Runnable) null);
            }
        }
    }

    public final List<y3> X4() throws RemoteException {
        return this.f7349f.d();
    }

    public final void b6(c cVar) throws RemoteException {
        p6 p6Var = this.f7350g;
        Context context = this.f7344a;
        p6Var.getClass();
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16561d0)).booleanValue() && p6Var.p(context) && p6.g(context)) {
            synchronized (p6Var.f7821l) {
            }
        }
    }

    public final void f5(a aVar, String str) {
        if (aVar == null) {
            e.I("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.z0(aVar);
        if (context == null) {
            e.I("Context is null. Failed to open debug menu.");
            return;
        }
        g gVar = new g(context);
        gVar.f18271c = str;
        gVar.f18272d = this.f7345b.f14544a;
        gVar.a();
    }

    public final synchronized void j3(boolean z10) {
        d dVar = l.B.f13191h;
        synchronized (dVar) {
            dVar.f18260a = z10;
        }
    }

    public final String j6() {
        return this.f7345b.f14544a;
    }

    public final synchronized float n4() {
        return l.B.f13191h.b();
    }

    public final void o6() {
        this.f7349f.f17663o = false;
    }

    public final void s3(s2 s2Var) throws RemoteException {
        this.f7346c.f6632b.compareAndSet((Object) null, s2Var);
    }

    public final void x1(x1 x1Var) throws RemoteException {
        yq yqVar = this.f7349f;
        d7<Boolean> d7Var = yqVar.f17652d;
        d7Var.f6188a.a(new m(yqVar, x1Var), yqVar.f17657i);
    }
}
