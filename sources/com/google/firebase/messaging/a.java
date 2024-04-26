package com.google.firebase.messaging;

import ab.d0;
import ab.g;
import ab.h;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import e8.cr;
import e8.qz;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import s8.i;
import s8.l;
import s8.t;
import s8.z;
import t1.c;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9712c = new Object();
    @GuardedBy("lock")

    /* renamed from: d  reason: collision with root package name */
    public static d0 f9713d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9714a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f9715b = g.f224a;

    public a(Context context) {
        this.f9714a = context;
    }

    public static i<Integer> a(Context context, Intent intent) {
        d0 d0Var;
        z<TResult> zVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f9712c) {
            if (f9713d == null) {
                f9713d = new d0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            d0Var = f9713d;
        }
        synchronized (d0Var) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            d0.a aVar = new d0.a(intent);
            ScheduledExecutorService scheduledExecutorService = d0Var.f211c;
            ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new qz(aVar), 9000, TimeUnit.MILLISECONDS);
            z<TResult> zVar2 = aVar.f216b.f25035a;
            zVar2.f25071b.a(new t(scheduledExecutorService, new b2.t((ScheduledFuture) schedule)));
            zVar2.s();
            d0Var.f212d.add(aVar);
            d0Var.b();
            zVar = aVar.f216b.f25035a;
        }
        return zVar.e(h.f225a, ab.i.f226a);
    }

    public i<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f9714a;
        if (z7.h.d() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z10 && flags == 0) {
            return a(context, intent);
        }
        Executor executor = g.f224a;
        return l.c(executor, new cr(context, intent)).f(executor, new c(context, intent));
    }
}
