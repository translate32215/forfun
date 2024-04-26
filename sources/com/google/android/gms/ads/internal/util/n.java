package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import e8.t;
import e8.ti0;
import f7.z;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f5674a = new z(this);
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final Map<BroadcastReceiver, IntentFilter> f5675b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public boolean f5676c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5677d;

    /* renamed from: e  reason: collision with root package name */
    public Context f5678e;

    public final synchronized void a(Context context) {
        if (!this.f5676c) {
            Context applicationContext = context.getApplicationContext();
            this.f5678e = applicationContext;
            if (applicationContext == null) {
                this.f5678e = context;
            }
            t.a(this.f5678e);
            this.f5677d = ((Boolean) ti0.f16763j.f16769f.a(t.O1)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f5678e.registerReceiver(this.f5674a, intentFilter);
            this.f5676c = true;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f5677d) {
            this.f5675b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
