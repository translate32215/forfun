package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfk;

/* compiled from: com.google.android.gms:play-services-analytics@@18.0.2 */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public zzfk f5719a;

    public void onReceive(Context context, Intent intent) {
        if (this.f5719a == null) {
            this.f5719a = new zzfk();
        }
        zzfk.zzb(context, intent);
    }
}
