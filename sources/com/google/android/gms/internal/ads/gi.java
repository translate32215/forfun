package com.google.android.gms.internal.ads;

import e8.p50;
import e8.u50;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gi<V> implements Runnable {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    public ei<V> f6677a;

    public gi(ei<V> eiVar) {
        this.f6677a = eiVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.ei, com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.ei<V>] */
    public final void run() {
        p50<V> p50;
        String str;
        ? r02 = this.f6677a;
        if (r02 != 0 && (p50 = r02.f6287h) != null) {
            this.f6677a = null;
            if (p50.isDone()) {
                r02.k(p50);
                return;
            }
            try {
                ScheduledFuture<?> scheduledFuture = r02.f6288i;
                r02.f6288i = null;
                str = "Timed out";
                if (scheduledFuture != null) {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb2 = new StringBuilder(75);
                        sb2.append(str);
                        sb2.append(" (timeout delayed by ");
                        sb2.append(abs);
                        sb2.append(" ms after scheduled time)");
                        str = sb2.toString();
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(p50);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
                sb3.append(valueOf);
                sb3.append(": ");
                sb3.append(valueOf2);
                r02.j(new u50(sb3.toString(), (g7) null));
                p50.cancel(true);
            } catch (Throwable th) {
                p50.cancel(true);
                throw th;
            }
        }
    }
}
