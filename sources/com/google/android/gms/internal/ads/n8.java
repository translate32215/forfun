package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import e8.c10;
import e8.d30;
import e8.i0;
import e8.j0;
import e8.l50;
import e8.li;
import e8.pj;
import e8.t;
import e8.t0;
import e8.t00;
import e8.ti0;
import e8.v00;
import e8.wh0;
import e8.wi;
import e8.zh0;
import e8.zi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n8 implements li, wi, zi, pj, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7550a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7551b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f7552c;

    /* renamed from: d  reason: collision with root package name */
    public final t00 f7553d;

    /* renamed from: e  reason: collision with root package name */
    public final qe f7554e;

    /* renamed from: f  reason: collision with root package name */
    public final d30 f7555f;

    /* renamed from: g  reason: collision with root package name */
    public final c10 f7556g;

    /* renamed from: h  reason: collision with root package name */
    public final tm f7557h;

    /* renamed from: i  reason: collision with root package name */
    public final i0 f7558i;

    /* renamed from: r  reason: collision with root package name */
    public final j0 f7559r;

    /* renamed from: s  reason: collision with root package name */
    public final WeakReference<View> f7560s;
    @GuardedBy("this")

    /* renamed from: t  reason: collision with root package name */
    public boolean f7561t;
    @GuardedBy("this")

    /* renamed from: u  reason: collision with root package name */
    public boolean f7562u;

    public n8(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, t00 t00, qe qeVar, d30 d30, c10 c10, View view, tm tmVar, i0 i0Var, j0 j0Var) {
        this.f7550a = context;
        this.f7551b = executor;
        this.f7552c = scheduledExecutorService;
        this.f7553d = t00;
        this.f7554e = qeVar;
        this.f7555f = d30;
        this.f7556g = c10;
        this.f7557h = tmVar;
        this.f7560s = new WeakReference<>(view);
        this.f7558i = i0Var;
        this.f7559r = j0Var;
    }

    public final void C() {
    }

    public final void F() {
    }

    public final void J() {
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [java.util.concurrent.Future, e8.p50, e8.l50] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void O() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f7562u     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x00ab
            e8.l<java.lang.Boolean> r0 = e8.t.C1     // Catch:{ all -> 0x00ad }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00ad }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ad }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ad }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.tm r0 = r9.f7557h     // Catch:{ all -> 0x00ad }
            e8.c40 r0 = r0.f8207b     // Catch:{ all -> 0x00ad }
            android.content.Context r2 = r9.f7550a     // Catch:{ all -> 0x00ad }
            java.lang.ref.WeakReference<android.view.View> r3 = r9.f7560s     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x00ad }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = r0.d(r2, r3, r1)     // Catch:{ all -> 0x00ad }
        L_0x002a:
            r5 = r1
            e8.l<java.lang.Boolean> r0 = e8.t.f16567e0     // Catch:{ all -> 0x00ad }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x00ad }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ad }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ad }
            r8 = 1
            if (r0 == 0) goto L_0x004c
            e8.t00 r0 = r9.f7553d     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.j8 r0 = r0.f16701b     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.f7135c     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.re r0 = (com.google.android.gms.internal.ads.re) r0     // Catch:{ all -> 0x00ad }
            boolean r0 = r0.f8035g     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 != 0) goto L_0x0094
            a6.b<java.lang.Boolean> r0 = e8.t0.f16699b     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x00ad }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00ad }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x005e
            goto L_0x0094
        L_0x005e:
            e8.j0 r0 = r9.f7559r     // Catch:{ all -> 0x00ad }
            android.content.Context r1 = r9.f7550a     // Catch:{ all -> 0x00ad }
            e8.p50 r0 = r0.a(r1)     // Catch:{ all -> 0x00ad }
            e8.l50 r0 = e8.l50.v(r0)     // Catch:{ all -> 0x00ad }
            e8.l<java.lang.Long> r1 = e8.t.f16687y0     // Catch:{ all -> 0x00ad }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x00ad }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x00ad }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x00ad }
            long r1 = r1.longValue()     // Catch:{ all -> 0x00ad }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ad }
            java.util.concurrent.ScheduledExecutorService r4 = r9.f7552c     // Catch:{ all -> 0x00ad }
            e8.l50 r0 = r0.s(r1, r3, r4)     // Catch:{ all -> 0x00ad }
            t1.c r1 = new t1.c     // Catch:{ all -> 0x00ad }
            r1.<init>((com.google.android.gms.internal.ads.n8) r9, (java.lang.String) r5)     // Catch:{ all -> 0x00ad }
            java.util.concurrent.Executor r2 = r9.f7551b     // Catch:{ all -> 0x00ad }
            f7.j0 r3 = new f7.j0     // Catch:{ all -> 0x00ad }
            r3.<init>((java.util.concurrent.Future) r0, (com.google.android.gms.internal.ads.zh) r1)     // Catch:{ all -> 0x00ad }
            r0.a(r3, r2)     // Catch:{ all -> 0x00ad }
            r9.f7562u = r8     // Catch:{ all -> 0x00ad }
            goto L_0x00ab
        L_0x0094:
            e8.c10 r0 = r9.f7556g     // Catch:{ all -> 0x00ad }
            e8.d30 r1 = r9.f7555f     // Catch:{ all -> 0x00ad }
            e8.t00 r2 = r9.f7553d     // Catch:{ all -> 0x00ad }
            com.google.android.gms.internal.ads.qe r3 = r9.f7554e     // Catch:{ all -> 0x00ad }
            r4 = 0
            r6 = 0
            java.util.List<java.lang.String> r7 = r3.f7948d     // Catch:{ all -> 0x00ad }
            java.util.List r1 = r1.b(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ad }
            r0.c(r1)     // Catch:{ all -> 0x00ad }
            r9.f7562u = r8     // Catch:{ all -> 0x00ad }
            monitor-exit(r9)
            return
        L_0x00ab:
            monitor-exit(r9)
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n8.O():void");
    }

    public final void d0() {
        c10 c10 = this.f7556g;
        d30 d30 = this.f7555f;
        t00 t00 = this.f7553d;
        qe qeVar = this.f7554e;
        c10.c(d30.a(t00, qeVar, qeVar.f7954g));
    }

    public final void g(zh0 zh0) {
        if (((Boolean) ti0.f16763j.f16769f.a(t.U0)).booleanValue()) {
            int i10 = zh0.f17753a;
            List<String> list = this.f7554e.f7961n;
            ArrayList arrayList = new ArrayList();
            for (String c10 : list) {
                StringBuilder sb2 = new StringBuilder(23);
                sb2.append(2);
                sb2.append(".");
                sb2.append(i10);
                arrayList.add(d30.c(c10, "@gw_mpe@", sb2.toString()));
            }
            this.f7556g.c(this.f7555f.a(this.f7553d, this.f7554e, arrayList));
        }
    }

    public final void g0() {
        c10 c10 = this.f7556g;
        d30 d30 = this.f7555f;
        t00 t00 = this.f7553d;
        qe qeVar = this.f7554e;
        c10.c(d30.a(t00, qeVar, qeVar.f7956i));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [java.util.concurrent.Future, e8.p50, e8.l50] */
    public final void n() {
        int i10 = 1;
        if ((((Boolean) ti0.f16763j.f16769f.a(t.f16567e0)).booleanValue() && ((re) this.f7553d.f16701b.f7135c).f8035g) || !((Boolean) t0.f16698a.b()).booleanValue()) {
            c10 c10 = this.f7556g;
            d30 d30 = this.f7555f;
            t00 t00 = this.f7553d;
            qe qeVar = this.f7554e;
            List<String> a10 = d30.a(t00, qeVar, qeVar.f7946c);
            p pVar = l.B.f13186c;
            if (p.t(this.f7550a)) {
                i10 = 2;
            }
            c10.a(a10, i10);
            return;
        }
        j0 j0Var = this.f7559r;
        Context context = this.f7550a;
        i0 i0Var = this.f7558i;
        ? s10 = l50.v(j0Var.b(context, i0Var.f14965a, i0Var.f14966b)).s(((Long) ti0.f16763j.f16769f.a(t.f16687y0)).longValue(), TimeUnit.MILLISECONDS, this.f7552c);
        s10.a(new f7.j0((Future) s10, (zh) new g2(this)), this.f7551b);
    }

    public final void t(m5 m5Var, String str, String str2) {
        String str3;
        c10 c10 = this.f7556g;
        d30 d30 = this.f7555f;
        qe qeVar = this.f7554e;
        List<String> list = qeVar.f7955h;
        d30.getClass();
        ArrayList arrayList = new ArrayList();
        long b10 = d30.f14215g.b();
        try {
            String o10 = m5Var.o();
            String num = Integer.toString(m5Var.q0());
            v00 v00 = d30.f14214f;
            String str4 = "";
            if (v00 == null) {
                str3 = str4;
            } else {
                str3 = v00.f17012a;
                if (!TextUtils.isEmpty(str3) && b7.a()) {
                    str3 = "fakeForAdDebugLog";
                }
            }
            v00 v002 = d30.f14214f;
            if (v002 != null) {
                str4 = v002.f17013b;
                if (!TextUtils.isEmpty(str4) && b7.a()) {
                    str4 = "fakeForAdDebugLog";
                }
            }
            for (String c11 : list) {
                arrayList.add(e8.n8.c(d30.c(d30.c(d30.c(d30.c(d30.c(d30.c(c11, "@gw_rwd_userid@", Uri.encode(str3)), "@gw_rwd_custom_data@", Uri.encode(str4)), "@gw_tmstmp@", Long.toString(b10)), "@gw_rwd_itm@", Uri.encode(o10)), "@gw_rwd_amt@", num), "@gw_sdkver@", d30.f14210b), d30.f14213e, qeVar.Q));
            }
        } catch (RemoteException e10) {
            e.C("Unable to determine award type and amount.", e10);
        }
        c10.c(arrayList);
    }

    public final synchronized void v() {
        if (this.f7561t) {
            ArrayList arrayList = new ArrayList(this.f7554e.f7948d);
            arrayList.addAll(this.f7554e.f7952f);
            this.f7556g.c(this.f7555f.b(this.f7553d, this.f7554e, true, (String) null, (String) null, arrayList));
        } else {
            c10 c10 = this.f7556g;
            d30 d30 = this.f7555f;
            t00 t00 = this.f7553d;
            qe qeVar = this.f7554e;
            c10.c(d30.a(t00, qeVar, qeVar.f7960m));
            c10 c102 = this.f7556g;
            d30 d302 = this.f7555f;
            t00 t002 = this.f7553d;
            qe qeVar2 = this.f7554e;
            c102.c(d302.a(t002, qeVar2, qeVar2.f7952f));
        }
        this.f7561t = true;
    }
}
