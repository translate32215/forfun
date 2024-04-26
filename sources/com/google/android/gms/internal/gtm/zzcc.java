package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcc implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzcd zzb;

    public zzcc(zzcd zzcd, ComponentName componentName) {
        this.zzb = zzcd;
        this.zza = componentName;
    }

    public final void run() {
        zzce.zzb(this.zzb.zza, this.zza);
    }
}
