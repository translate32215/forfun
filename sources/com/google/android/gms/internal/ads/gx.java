package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import e8.gd0;
import e8.qe0;
import e8.r5;
import e8.wi0;
import e8.y10;
import java.util.concurrent.BlockingQueue;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gx extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<a<?>> f6720a;

    /* renamed from: b  reason: collision with root package name */
    public final wx f6721b;

    /* renamed from: c  reason: collision with root package name */
    public final gd0 f6722c;

    /* renamed from: d  reason: collision with root package name */
    public final y10 f6723d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f6724e = false;

    public gx(BlockingQueue<a<?>> blockingQueue, wx wxVar, gd0 gd0, y10 y10) {
        this.f6720a = blockingQueue;
        this.f6721b = wxVar;
        this.f6722c = gd0;
        this.f6723d = y10;
    }

    public final void a() throws InterruptedException {
        a take = this.f6720a.take();
        SystemClock.elapsedRealtime();
        take.o(3);
        try {
            take.m("network-queue-take");
            take.b();
            TrafficStats.setThreadStatsTag(take.f5923d);
            wi0 a10 = this.f6721b.a(take);
            take.m("network-http-complete");
            if (!a10.f17367e || !take.u()) {
                c c10 = take.c(a10);
                take.m("network-parse-complete");
                if (take.f5928i && ((qe0) c10.f27857b) != null) {
                    ((h6) this.f6722c).i(take.r(), (qe0) c10.f27857b);
                    take.m("network-cache-written");
                }
                take.t();
                this.f6723d.h(take, c10, (Runnable) null);
                take.i(c10);
                take.o(4);
                return;
            }
            take.q("not-modified");
            take.v();
        } catch (r5 e10) {
            SystemClock.elapsedRealtime();
            this.f6723d.c(take, e10);
            take.v();
        } catch (Exception e11) {
            Log.e("Volley", i4.d("Unhandled exception %s", e11.toString()), e11);
            r5 r5Var = new r5((Throwable) e11);
            SystemClock.elapsedRealtime();
            this.f6723d.c(take, r5Var);
            take.v();
        } finally {
            take.o(4);
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f6724e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                i4.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
