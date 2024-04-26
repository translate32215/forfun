package com.google.android.gms.internal.ads;

import d7.l;
import e8.yg0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q8 implements yg0 {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f7922a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7923b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public ScheduledFuture<?> f7924c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public long f7925d = -1;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public long f7926e = -1;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public Runnable f7927f = null;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public boolean f7928g = false;

    public q8(ScheduledExecutorService scheduledExecutorService, b bVar) {
        this.f7922a = scheduledExecutorService;
        this.f7923b = bVar;
        l.B.f13189f.d(this);
    }

    public final void a(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        if (z10) {
            synchronized (this) {
                if (this.f7928g) {
                    if (this.f7926e > 0 && (scheduledFuture = this.f7924c) != null && scheduledFuture.isCancelled()) {
                        this.f7924c = this.f7922a.schedule(this.f7927f, this.f7926e, TimeUnit.MILLISECONDS);
                    }
                    this.f7928g = false;
                }
            }
            return;
        }
        synchronized (this) {
            if (!this.f7928g) {
                ScheduledFuture<?> scheduledFuture2 = this.f7924c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f7926e = -1;
                } else {
                    this.f7924c.cancel(true);
                    this.f7926e = this.f7925d - this.f7923b.a();
                }
                this.f7928g = true;
            }
        }
    }

    public final synchronized void b(int i10, Runnable runnable) {
        this.f7927f = runnable;
        long j10 = (long) i10;
        this.f7925d = this.f7923b.a() + j10;
        this.f7924c = this.f7922a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }
}
