package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import i8.e;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import v7.b;
import v7.c0;
import v7.d0;
import v7.e0;
import y7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class x extends b {
    @GuardedBy("connectionStatus")

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5892d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f5893e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Handler f5894f;

    /* renamed from: g  reason: collision with root package name */
    public final a f5895g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5896h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5897i;

    public x(Context context, Looper looper) {
        e0 e0Var = new e0(this);
        this.f5893e = context.getApplicationContext();
        this.f5894f = new e(looper, e0Var);
        this.f5895g = a.b();
        this.f5896h = 5000;
        this.f5897i = 300000;
    }

    public final boolean d(c0 c0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z10;
        synchronized (this.f5892d) {
            try {
                d0 d0Var = (d0) this.f5892d.get(c0Var);
                if (d0Var == null) {
                    d0Var = new d0(this, c0Var);
                    d0Var.f26557a.put(serviceConnection, serviceConnection);
                    d0Var.a(str, executor);
                    this.f5892d.put(c0Var, d0Var);
                } else {
                    this.f5894f.removeMessages(0, c0Var);
                    if (!d0Var.f26557a.containsKey(serviceConnection)) {
                        d0Var.f26557a.put(serviceConnection, serviceConnection);
                        int i10 = d0Var.f26558b;
                        if (i10 == 1) {
                            ((u) serviceConnection).onServiceConnected(d0Var.f26562f, d0Var.f26560d);
                        } else if (i10 == 2) {
                            d0Var.a(str, executor);
                        }
                    } else {
                        String c0Var2 = c0Var.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c0Var2);
                    }
                }
                z10 = d0Var.f26559c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
