package com.google.android.gms.internal.ads;

import e.g;
import e8.p50;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ei<V> extends vh<V> {
    @NullableDecl

    /* renamed from: h  reason: collision with root package name */
    public p50<V> f6287h;
    @NullableDecl

    /* renamed from: i  reason: collision with root package name */
    public ScheduledFuture<?> f6288i;

    public ei(p50<V> p50) {
        p50.getClass();
        this.f6287h = p50;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.ei, com.google.android.gms.internal.ads.gh] */
    public final void c() {
        g(this.f6287h);
        ScheduledFuture<?> scheduledFuture = this.f6288i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f6287h = null;
        this.f6288i = null;
    }

    public final String h() {
        p50<V> p50 = this.f6287h;
        ScheduledFuture<?> scheduledFuture = this.f6288i;
        if (p50 == null) {
            return null;
        }
        String valueOf = String.valueOf(p50);
        String a10 = g.a(valueOf.length() + 14, "inputFuture=[", valueOf, "]");
        if (scheduledFuture == null) {
            return a10;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return a10;
        }
        String valueOf2 = String.valueOf(a10);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 43);
        sb2.append(valueOf2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }
}
