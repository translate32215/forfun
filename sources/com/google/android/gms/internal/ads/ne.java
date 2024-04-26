package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.google.android.gms.common.internal.i;
import d7.l;
import e8.e00;
import e8.gz;
import e8.ii;
import e8.n00;
import e8.oj;
import e8.q00;
import e8.t;
import e8.ti0;
import e8.u7;
import e8.v00;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ne extends q5 {

    /* renamed from: b  reason: collision with root package name */
    public final le f7573b;

    /* renamed from: c  reason: collision with root package name */
    public final e00 f7574c;

    /* renamed from: d  reason: collision with root package name */
    public final v00 f7575d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public za f7576e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public boolean f7577f = false;

    public ne(le leVar, e00 e00, v00 v00) {
        this.f7573b = leVar;
        this.f7574c = e00;
        this.f7575d = v00;
    }

    public final synchronized gz B() throws RemoteException {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.Y3)).booleanValue()) {
            return null;
        }
        za zaVar = this.f7576e;
        if (zaVar == null) {
            return null;
        }
        return zaVar.f13729f;
    }

    public final void D() {
        O2((a) null);
    }

    public final boolean G0() throws RemoteException {
        i.d("isLoaded must be called on the main UI thread.");
        return s6();
    }

    public final synchronized void G5(String str) throws RemoteException {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16663u0)).booleanValue()) {
            i.d("#008 Must be called on the main UI thread.: setCustomData");
            this.f7575d.f17013b = str;
        }
    }

    public final synchronized void N(boolean z10) {
        i.d("setImmersiveMode must be called on the main UI thread.");
        this.f7577f = z10;
    }

    public final synchronized void N5(u7 u7Var) throws RemoteException {
        i.d("loadAd must be called on the main UI thread.");
        String str = u7Var.f16853b;
        String str2 = (String) ti0.f16763j.f16769f.a(t.N2);
        boolean z10 = false;
        if (!(str2 == null || str == null)) {
            try {
                z10 = Pattern.matches(str2, str);
            } catch (RuntimeException e10) {
                y6 y6Var = l.B.f13190g;
                a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "NonagonUtil.isPatternMatched");
            }
        }
        if (!z10) {
            if (s6()) {
                if (!((Boolean) ti0.f16763j.f16769f.a(t.P2)).booleanValue()) {
                    return;
                }
            }
            n00 n00 = new n00();
            this.f7576e = null;
            le leVar = this.f7573b;
            leVar.f7384g.f17560p.f16946b = 1;
            leVar.k(u7Var.f16852a, u7Var.f16853b, n00, new gz(this));
            return;
        }
        return;
    }

    public final synchronized void O2(a aVar) {
        Context context;
        i.d("resume must be called on the main UI thread.");
        if (this.f7576e != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) b.z0(aVar);
            }
            this.f7576e.f13726c.L0(context);
        }
    }

    public final synchronized void S() throws RemoteException {
        v5((a) null);
    }

    public final void T(t5 t5Var) throws RemoteException {
        i.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f7574c.f14348e.set(t5Var);
    }

    public final Bundle X() {
        Bundle bundle;
        i.d("getAdMetadata can only be called from the UI thread.");
        za zaVar = this.f7576e;
        if (zaVar == null) {
            return new Bundle();
        }
        oj ojVar = zaVar.f8687m;
        synchronized (ojVar) {
            bundle = new Bundle(ojVar.f15802b);
        }
        return bundle;
    }

    public final void a3(String str) throws RemoteException {
    }

    public final void destroy() throws RemoteException {
        o1((a) null);
    }

    public final void e0(jy jyVar) {
        i.d("setAdMetadataListener can only be called from the UI thread.");
        if (jyVar == null) {
            this.f7574c.f14345b.set((Object) null);
            return;
        }
        e00 e00 = this.f7574c;
        e00.f14345b.set(new q00(this, jyVar));
    }

    public final void f3(p5 p5Var) {
        i.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f7574c.f14350g.set(p5Var);
    }

    public final void g() {
        g4((a) null);
    }

    public final synchronized void g4(a aVar) {
        Context context;
        i.d("pause must be called on the main UI thread.");
        if (this.f7576e != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) b.z0(aVar);
            }
            this.f7576e.f13726c.K0(context);
        }
    }

    public final synchronized void i0(String str) throws RemoteException {
        i.d("setUserId must be called on the main UI thread.");
        this.f7575d.f17012a = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void o1(c8.a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.i.d(r0)     // Catch:{ all -> 0x0025 }
            e8.e00 r0 = r2.f7574c     // Catch:{ all -> 0x0025 }
            java.util.concurrent.atomic.AtomicReference<k7.a> r0 = r0.f14345b     // Catch:{ all -> 0x0025 }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.za r0 = r2.f7576e     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0023
            if (r3 != 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            java.lang.Object r3 = c8.b.z0(r3)     // Catch:{ all -> 0x0025 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0025 }
        L_0x001c:
            com.google.android.gms.internal.ads.za r3 = r2.f7576e     // Catch:{ all -> 0x0025 }
            e8.aj r3 = r3.f13726c     // Catch:{ all -> 0x0025 }
            r3.M0(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ne.o1(c8.a):void");
    }

    public final boolean p3() {
        za zaVar = this.f7576e;
        if (zaVar != null) {
            t7 t7Var = (t7) zaVar.f8683i.get();
            if (t7Var != null && !t7Var.q0()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized String s() throws RemoteException {
        ii iiVar;
        za zaVar = this.f7576e;
        if (zaVar == null || (iiVar = zaVar.f13729f) == null) {
            return null;
        }
        return iiVar.f15049a;
    }

    public final synchronized boolean s6() {
        boolean z10;
        za zaVar = this.f7576e;
        if (zaVar == null || zaVar.f8688n.f15393b.get()) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void v5(a aVar) throws RemoteException {
        Activity activity;
        i.d("showAd must be called on the main UI thread.");
        if (this.f7576e != null) {
            if (aVar != null) {
                Object z02 = b.z0(aVar);
                if (z02 instanceof Activity) {
                    activity = (Activity) z02;
                    this.f7576e.c(this.f7577f, activity);
                }
            }
            activity = null;
            this.f7576e.c(this.f7577f, activity);
        }
    }
}
