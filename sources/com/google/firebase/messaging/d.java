package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public class d {

    /* renamed from: e  reason: collision with root package name */
    public static d f9723e;
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public String f9724a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f9725b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f9726c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Intent> f9727d = new ArrayDeque();

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f9723e == null) {
                f9723e = new d();
            }
            dVar = f9723e;
        }
        return dVar;
    }

    public boolean b(Context context) {
        if (this.f9726c == null) {
            this.f9726c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f9725b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9726c.booleanValue();
    }

    public boolean c(Context context) {
        if (this.f9725b == null) {
            this.f9725b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f9725b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9725b.booleanValue();
    }
}
