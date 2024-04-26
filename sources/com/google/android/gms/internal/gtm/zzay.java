package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import n7.q;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzay extends q {
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.zza);
        hashMap.put("source", this.zzb);
        hashMap.put("medium", this.zzc);
        hashMap.put("keyword", this.zzd);
        hashMap.put("content", this.zze);
        hashMap.put("id", this.zzf);
        hashMap.put("adNetworkId", this.zzg);
        hashMap.put("gclid", this.zzh);
        hashMap.put("dclid", this.zzi);
        hashMap.put("aclid", this.zzj);
        return q.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(q qVar) {
        zzay zzay = (zzay) qVar;
        if (!TextUtils.isEmpty(this.zza)) {
            zzay.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzay.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzay.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzay.zzd = this.zzd;
        }
        if (!TextUtils.isEmpty(this.zze)) {
            zzay.zze = this.zze;
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            zzay.zzf = this.zzf;
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzay.zzg = this.zzg;
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            zzay.zzh = this.zzh;
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            zzay.zzi = this.zzi;
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            zzay.zzj = this.zzj;
        }
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzi;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zza;
    }

    public final String zzm() {
        return this.zzb;
    }

    public final void zzn(String str) {
        this.zzj = str;
    }

    public final void zzo(String str) {
        this.zzg = str;
    }

    public final void zzp(String str) {
        this.zze = str;
    }

    public final void zzq(String str) {
        this.zzi = str;
    }

    public final void zzr(String str) {
        this.zzh = str;
    }

    public final void zzs(String str) {
        this.zzf = str;
    }

    public final void zzt(String str) {
        this.zzd = str;
    }

    public final void zzu(String str) {
        this.zzc = str;
    }

    public final void zzv(String str) {
        this.zza = str;
    }

    public final void zzw(String str) {
        this.zzb = str;
    }
}
