package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzby {
    public final Context zza;
    public final Context zzb;

    public zzby(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            i.i(applicationContext, "Application context can't be null");
            this.zza = applicationContext;
            this.zzb = applicationContext;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
