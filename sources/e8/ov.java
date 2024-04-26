package e8;

import android.os.RemoteException;
import android.util.Pair;
import androidx.activity.k;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.ky;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.qy;
import com.google.android.gms.internal.ads.rx;
import com.google.android.gms.internal.ads.sx;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l0.e;
import z6.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ov implements a, li, pi, wi, zi, pj, e9, ek, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<rx> f15843a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<ky> f15844b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<cz> f15845c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<sx> f15846d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<qy> f15847e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f15848f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    public final t20 f15849g;

    /* renamed from: h  reason: collision with root package name */
    public final BlockingQueue<Pair<String, String>> f15850h = new ArrayBlockingQueue(((Integer) ti0.f16763j.f16769f.a(t.L4)).intValue());

    public ov(t20 t20) {
        this.f15849g = t20;
    }

    public final void C() {
        k.d(this.f15843a, nv.f15716a);
        k.d(this.f15847e, qv.f16209a);
    }

    public final void C0(t00 t00) {
        this.f15848f.set(true);
    }

    public final void F() {
        k.d(this.f15843a, tv.f16813a);
        k.d(this.f15847e, uv.f16998a);
    }

    public final void J() {
        k.d(this.f15843a, sv.f16525a);
    }

    public final void O() {
        k.d(this.f15843a, rv.f16344a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        return;
     */
    @android.annotation.TargetApi(5)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f15848f     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0038
            java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>> r0 = r4.f15850h     // Catch:{ all -> 0x0045 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0045 }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            l0.e.E(r0)     // Catch:{ all -> 0x0045 }
            e8.t20 r0 = r4.f15849g     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = "dae_action"
            e8.u20 r1 = e8.u20.c(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "dae_name"
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r1.f16842a     // Catch:{ all -> 0x0045 }
            r3.put(r2, r5)     // Catch:{ all -> 0x0045 }
            java.lang.String r5 = "dae_data"
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r1.f16842a     // Catch:{ all -> 0x0045 }
            r2.put(r5, r6)     // Catch:{ all -> 0x0045 }
            r0.a(r1)     // Catch:{ all -> 0x0045 }
        L_0x0036:
            monitor-exit(r4)
            return
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.ky> r0 = r4.f15844b     // Catch:{ all -> 0x0045 }
            d6.m r1 = new d6.m     // Catch:{ all -> 0x0045 }
            r2 = 1
            r1.<init>(r5, r6, r2)     // Catch:{ all -> 0x0045 }
            androidx.activity.k.d(r0, r1)     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            return
        L_0x0045:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ov.a(java.lang.String, java.lang.String):void");
    }

    public final void d0() {
    }

    public final void g(zh0 zh0) {
        k.d(this.f15847e, new mi(zh0, 2));
    }

    public final void g0() {
    }

    public final void j0(zh0 zh0) {
        rx rxVar = this.f15843a.get();
        if (rxVar != null) {
            try {
                rxVar.U(zh0);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        rx rxVar2 = this.f15843a.get();
        if (rxVar2 != null) {
            try {
                rxVar2.h0(zh0.f17753a);
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
        sx sxVar = this.f15846d.get();
        if (sxVar != null) {
            try {
                sxVar.j0(zh0);
            } catch (RemoteException e12) {
                e.F("#007 Could not call remote method.", e12);
            }
        }
        this.f15848f.set(false);
        this.f15850h.clear();
    }

    public final void k0(l5 l5Var) {
    }

    public final void l(fx fxVar) {
        cz czVar = this.f15845c.get();
        if (czVar != null) {
            try {
                czVar.I1(fxVar);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final synchronized rx m() {
        return this.f15843a.get();
    }

    public final void n() {
        k.d(this.f15843a, pv.f16028a);
    }

    public final void t(m5 m5Var, String str, String str2) {
    }

    public final synchronized void v() {
        rx rxVar = this.f15843a.get();
        if (rxVar != null) {
            try {
                rxVar.v();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        sx sxVar = this.f15846d.get();
        if (sxVar != null) {
            try {
                sxVar.v();
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
        for (Pair g2Var : this.f15850h) {
            k.d(this.f15844b, new g2(g2Var));
        }
        this.f15850h.clear();
        this.f15848f.set(false);
    }
}
