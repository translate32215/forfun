package com.google.android.gms.internal.ads;

import android.os.Process;
import e7.i;
import e8.gd0;
import e8.gf0;
import e8.qe0;
import e8.r5;
import e8.wi0;
import e8.y10;
import java.util.concurrent.BlockingQueue;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vt extends Thread {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f8406g = i4.f6915a;

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<a<?>> f8407a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<a<?>> f8408b;

    /* renamed from: c  reason: collision with root package name */
    public final gd0 f8409c;

    /* renamed from: d  reason: collision with root package name */
    public final y10 f8410d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f8411e = false;

    /* renamed from: f  reason: collision with root package name */
    public final gf0 f8412f;

    public vt(BlockingQueue<a<?>> blockingQueue, BlockingQueue<a<?>> blockingQueue2, gd0 gd0, y10 y10) {
        this.f8407a = blockingQueue;
        this.f8408b = blockingQueue2;
        this.f8409c = gd0;
        this.f8410d = y10;
        this.f8412f = new gf0(this);
    }

    public final void a() throws InterruptedException {
        a take = this.f8407a.take();
        take.m("cache-queue-take");
        take.o(1);
        try {
            take.b();
            qe0 l10 = ((h6) this.f8409c).l(take.r());
            if (l10 == null) {
                take.m("cache-miss");
                if (!gf0.k(this.f8412f, take)) {
                    this.f8408b.put(take);
                }
                take.o(2);
                return;
            }
            boolean z10 = false;
            if (l10.f16150e < System.currentTimeMillis()) {
                take.m("cache-hit-expired");
                take.f5931t = l10;
                if (!gf0.k(this.f8412f, take)) {
                    this.f8408b.put(take);
                }
                take.o(2);
                return;
            }
            take.m("cache-hit");
            c c10 = take.c(new wi0(200, l10.f16146a, l10.f16152g, false, 0));
            take.m("cache-hit-parsed");
            if (!(((r5) c10.f27858c) == null)) {
                take.m("cache-parsing-failed");
                gd0 gd0 = this.f8409c;
                String r10 = take.r();
                h6 h6Var = (h6) gd0;
                synchronized (h6Var) {
                    qe0 l11 = h6Var.l(r10);
                    if (l11 != null) {
                        l11.f16151f = 0;
                        l11.f16150e = 0;
                        h6Var.i(r10, l11);
                    }
                }
                take.f5931t = null;
                if (!gf0.k(this.f8412f, take)) {
                    this.f8408b.put(take);
                }
                take.o(2);
                return;
            }
            if (l10.f16151f < System.currentTimeMillis()) {
                z10 = true;
            }
            if (!z10) {
                this.f8410d.h(take, c10, (Runnable) null);
            } else {
                take.m("cache-hit-refresh-needed");
                take.f5931t = l10;
                c10.f27859d = true;
                if (!gf0.k(this.f8412f, take)) {
                    this.f8410d.h(take, c10, new i(this, take));
                } else {
                    this.f8410d.h(take, c10, (Runnable) null);
                }
            }
            take.o(2);
        } catch (Throwable th) {
            take.o(2);
            throw th;
        }
    }

    public final void run() {
        if (f8406g) {
            i4.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((h6) this.f8409c).a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f8411e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                i4.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
