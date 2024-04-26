package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import e8.lh0;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kv {
    @GuardedBy("lock")

    /* renamed from: a  reason: collision with root package name */
    public lh0 f7302a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public boolean f7303b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7304c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7305d = new Object();

    public kv(Context context) {
        this.f7304c = context;
    }

    public static void a(kv kvVar) {
        synchronized (kvVar.f7305d) {
            lh0 lh0 = kvVar.f7302a;
            if (lh0 != null) {
                lh0.p();
                kvVar.f7302a = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
