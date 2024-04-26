package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import t2.h0;
import t2.p1;

public class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public long f4811a = 1800000;

    /* renamed from: b  reason: collision with root package name */
    public long f4812b;

    /* renamed from: c  reason: collision with root package name */
    public long f4813c;

    /* renamed from: d  reason: collision with root package name */
    public long f4814d;

    /* renamed from: e  reason: collision with root package name */
    public long f4815e;

    /* renamed from: f  reason: collision with root package name */
    public long f4816f;

    /* renamed from: g  reason: collision with root package name */
    public long f4817g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4818h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4819i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4820r = true;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4821s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4822t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4823u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4824v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4825w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4826x;

    public void a(boolean z10) {
        ArrayList<h0> arrayList = f.d().m().f4599a;
        synchronized (arrayList) {
            Iterator<h0> it = arrayList.iterator();
            while (it.hasNext()) {
                h0 next = it.next();
                JSONObject jSONObject = new JSONObject();
                r0.k(jSONObject, "from_window_focus", z10);
                if (this.f4822t && !this.f4821s) {
                    r0.k(jSONObject, "app_in_foreground", false);
                    this.f4822t = false;
                }
                new g("SessionInfo.on_pause", next.d(), jSONObject).b();
            }
        }
        this.f4820r = true;
        f.g();
    }

    public void b(boolean z10) {
        o d10 = f.d();
        ArrayList<h0> arrayList = d10.m().f4599a;
        synchronized (arrayList) {
            Iterator<h0> it = arrayList.iterator();
            while (it.hasNext()) {
                h0 next = it.next();
                JSONObject jSONObject = new JSONObject();
                r0.k(jSONObject, "from_window_focus", z10);
                if (this.f4822t && this.f4821s) {
                    r0.k(jSONObject, "app_in_foreground", true);
                    this.f4822t = false;
                }
                new g("SessionInfo.on_resume", next.d(), jSONObject).b();
            }
        }
        d10.l().f();
        this.f4820r = false;
    }

    public void c(boolean z10) {
        o d10 = f.d();
        if (!this.f4823u) {
            if (this.f4824v) {
                d10.A = false;
                this.f4824v = false;
            }
            this.f4812b = 0;
            this.f4813c = 0;
            this.f4823u = true;
            this.f4818h = true;
            this.f4825w = false;
            new Thread(this).start();
            if (z10) {
                JSONObject jSONObject = new JSONObject();
                r0.e(jSONObject, "id", j0.d());
                new g("SessionInfo.on_start", 1, jSONObject).b();
                q0 q0Var = (q0) f.d().m().f4600b.get(1);
                if (q0Var != null) {
                    j0.h(new p1(q0Var));
                }
            }
            if (a.f4411a.isShutdown()) {
                a.f4411a = Executors.newSingleThreadExecutor();
            }
            d10.l().f();
            i0.d().f4558e.clear();
        }
    }

    public void d(boolean z10) {
        if (this.f4821s != z10) {
            this.f4821s = z10;
            this.f4822t = true;
            if (!z10) {
                a(false);
            } else if (!this.f4820r) {
                this.f4820r = true;
                this.f4819i = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.f4786b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x007a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
        L_0x0000:
            long r0 = java.lang.System.currentTimeMillis()
            r10.f4814d = r0
            com.adcolony.sdk.f.g()
            long r0 = r10.f4813c
            long r2 = r10.f4811a
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e4
            java.lang.String r0 = "AdColony session ending, releasing Context."
            com.adcolony.sdk.o r1 = com.adcolony.sdk.f.d()
            t2.m r1 = r1.l()
            r2 = 2
            r1.e(r4, r2, r0, r4)
            com.adcolony.sdk.o r0 = com.adcolony.sdk.f.d()
            r0.A = r5
            r0 = 0
            com.adcolony.sdk.f.f4478a = r0
            r10.f4824v = r5
            r10.f4826x = r5
            com.adcolony.sdk.o r0 = com.adcolony.sdk.f.d()
            t2.m r0 = r0.l()
            com.adcolony.sdk.u r0 = r0.f25518d
            r10.f4823u = r4
            r10.f4818h = r4
            if (r0 == 0) goto L_0x008b
            monitor-enter(r0)
            java.util.concurrent.ScheduledExecutorService r1 = r0.f4786b     // Catch:{ all -> 0x0088 }
            r1.shutdown()     // Catch:{ all -> 0x0088 }
            java.util.concurrent.ScheduledExecutorService r1 = r0.f4786b     // Catch:{ InterruptedException -> 0x007a }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x007a }
            r3 = 1
            boolean r1 = r1.awaitTermination(r3, r2)     // Catch:{ InterruptedException -> 0x007a }
            if (r1 != 0) goto L_0x0086
            java.util.concurrent.ScheduledExecutorService r1 = r0.f4786b     // Catch:{ InterruptedException -> 0x007a }
            r1.shutdownNow()     // Catch:{ InterruptedException -> 0x007a }
            java.util.concurrent.ScheduledExecutorService r1 = r0.f4786b     // Catch:{ InterruptedException -> 0x007a }
            boolean r1 = r1.awaitTermination(r3, r2)     // Catch:{ InterruptedException -> 0x007a }
            if (r1 != 0) goto L_0x0086
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ InterruptedException -> 0x007a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x007a }
            r2.<init>()     // Catch:{ InterruptedException -> 0x007a }
            java.lang.Class<com.adcolony.sdk.u> r3 = com.adcolony.sdk.u.class
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ InterruptedException -> 0x007a }
            r2.append(r3)     // Catch:{ InterruptedException -> 0x007a }
            java.lang.String r3 = ": ScheduledExecutorService did not terminate"
            r2.append(r3)     // Catch:{ InterruptedException -> 0x007a }
            java.lang.String r2 = r2.toString()     // Catch:{ InterruptedException -> 0x007a }
            r1.println(r2)     // Catch:{ InterruptedException -> 0x007a }
            goto L_0x0086
        L_0x007a:
            java.util.concurrent.ScheduledExecutorService r1 = r0.f4786b     // Catch:{ all -> 0x0088 }
            r1.shutdownNow()     // Catch:{ all -> 0x0088 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0088 }
            r1.interrupt()     // Catch:{ all -> 0x0088 }
        L_0x0086:
            monitor-exit(r0)
            goto L_0x008b
        L_0x0088:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x008b:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = r10.f4812b
            double r1 = (double) r1
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r3
            java.lang.String r3 = "session_length"
            com.adcolony.sdk.r0.d(r0, r3, r1)
            com.adcolony.sdk.g r1 = new com.adcolony.sdk.g
            java.lang.String r2 = "SessionInfo.on_stop"
            r1.<init>(r2, r5, r0)
            r1.b()
            com.adcolony.sdk.f.g()
            java.util.concurrent.ExecutorService r0 = com.adcolony.sdk.a.f4411a
            r0.shutdown()
            com.adcolony.sdk.j0$b r0 = new com.adcolony.sdk.j0$b
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            r0.<init>(r1)
        L_0x00c0:
            boolean r1 = r10.f4825w
            if (r1 != 0) goto L_0x00e3
            double r1 = r0.a()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00d0
            r1 = 1
            goto L_0x00d1
        L_0x00d0:
            r1 = 0
        L_0x00d1:
            if (r1 != 0) goto L_0x00e3
            boolean r1 = r10.f4826x
            if (r1 != 0) goto L_0x00d8
            goto L_0x00e3
        L_0x00d8:
            com.adcolony.sdk.f.g()
            r1 = 100
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00e1 }
            goto L_0x00c0
        L_0x00e1:
            goto L_0x00c0
        L_0x00e3:
            return
        L_0x00e4:
            boolean r0 = r10.f4818h
            r1 = 0
            if (r0 != 0) goto L_0x0112
            boolean r0 = r10.f4819i
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r10.f4820r
            if (r0 != 0) goto L_0x00f7
            r10.f4819i = r4
            r10.a(r4)
        L_0x00f7:
            long r3 = r10.f4813c
            long r6 = r10.f4817g
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0101
            r6 = r1
            goto L_0x0108
        L_0x0101:
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f4817g
            long r6 = r6 - r8
        L_0x0108:
            long r3 = r3 + r6
            r10.f4813c = r3
            long r3 = java.lang.System.currentTimeMillis()
            r10.f4817g = r3
            goto L_0x0123
        L_0x0112:
            boolean r0 = r10.f4819i
            if (r0 == 0) goto L_0x011f
            boolean r0 = r10.f4820r
            if (r0 == 0) goto L_0x011f
            r10.f4819i = r4
            r10.b(r4)
        L_0x011f:
            r10.f4813c = r1
            r10.f4817g = r1
        L_0x0123:
            r3 = 17
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0129 }
            goto L_0x012a
        L_0x0129:
        L_0x012a:
            long r3 = java.lang.System.currentTimeMillis()
            long r6 = r10.f4814d
            long r3 = r3 - r6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0140
            r0 = 6000(0x1770, double:2.9644E-320)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0140
            long r0 = r10.f4812b
            long r0 = r0 + r3
            r10.f4812b = r0
        L_0x0140:
            com.adcolony.sdk.o r0 = com.adcolony.sdk.f.d()
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r10.f4816f
            long r3 = r1 - r3
            r6 = 15000(0x3a98, double:7.411E-320)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0154
            r10.f4816f = r1
        L_0x0154:
            boolean r3 = com.adcolony.sdk.f.e()
            if (r3 == 0) goto L_0x0000
            long r3 = r10.f4815e
            long r3 = r1 - r3
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0000
            r10.f4815e = r1
            com.adcolony.sdk.m r1 = r0.n()
            java.lang.String r1 = r1.a()
            java.lang.String r2 = r0.f4677u
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0000
            r0.f4677u = r1
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = r0.f4677u
            java.lang.String r2 = "network_type"
            com.adcolony.sdk.r0.e(r1, r2, r0)
            com.adcolony.sdk.g r0 = new com.adcolony.sdk.g
            java.lang.String r2 = "Network.on_status_change"
            r0.<init>(r2, r5, r1)
            r0.b()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.y.run():void");
    }
}
