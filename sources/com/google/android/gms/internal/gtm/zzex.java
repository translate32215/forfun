package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzex implements zzct {
    public final zzbx zza;
    public final zzey zzb = new zzey();

    public zzex(zzbx zzbx) {
        this.zza = zzbx;
    }

    public final /* synthetic */ zzcs zza() {
        return this.zzb;
    }

    public final void zzb(String str, String str2) {
    }

    public final void zzc(String str, boolean z10) {
        if ("ga_dryRun".equals(str)) {
            this.zzb.zze = z10 ? 1 : 0;
            return;
        }
        this.zza.zzm().zzR("Bool xml configuration name not recognized", str);
    }

    public final void zzd(String str, int i10) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.zzb.zzd = i10;
        } else {
            this.zza.zzm().zzR("Int xml configuration name not recognized", str);
        }
    }

    public final void zze(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.zzb.zza = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.zzb.zzb = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.zzb.zzc = str2;
        } else {
            this.zza.zzm().zzR("String xml configuration name not recognized", str);
        }
    }
}
