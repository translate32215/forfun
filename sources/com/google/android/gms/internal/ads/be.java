package com.google.android.gms.internal.ads;

import l0.e;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class be implements zh<Void> {
    public final /* synthetic */ void a(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        e.H("Notification of cache hit successful.");
    }

    public final void n(Throwable th) {
        e.H("Notification of cache hit failed.");
    }
}
