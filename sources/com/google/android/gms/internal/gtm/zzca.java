package com.google.android.gms.internal.gtm;

import n7.v;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzca extends zzcy {
    public final /* synthetic */ zzce zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzca(zzce zzce, zzbx zzbx) {
        super(zzbx);
        this.zza = zzce;
    }

    public final void zza() {
        zzce zzce = this.zza;
        v.b();
        if (zzce.zzg()) {
            zzce.zzN("Inactivity, disconnecting from device AnalyticsService");
            zzce.zzc();
        }
    }
}
