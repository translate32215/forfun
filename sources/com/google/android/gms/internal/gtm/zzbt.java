package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import n7.c;
import n7.v;
import z7.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class zzbt {
    public final zzbx zza;

    public zzbt(zzbx zzbx) {
        if (zzbx != null) {
            this.zza = zzbx;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String zza2 = zza(obj);
        String zza3 = zza(obj2);
        String zza4 = zza(obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        } else {
            str2 = "";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zza2)) {
            sb2.append(str2);
            sb2.append(zza2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(zza3)) {
            sb2.append(str2);
            sb2.append(zza3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zza4)) {
            sb2.append(str3);
            sb2.append(zza4);
        }
        return sb2.toString();
    }

    public static final boolean zzU() {
        return Log.isLoggable((String) zzew.zzc.zzb(), 2);
    }

    public static String zza(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }

    public final zzfj zzA() {
        return this.zza.zzo();
    }

    public final zzfv zzB() {
        return this.zza.zzq();
    }

    public final b zzC() {
        return this.zza.zzr();
    }

    public final void zzE(String str) {
        zzb(3, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzF(String str, Object obj) {
        zzb(3, str, obj, (Object) null, (Object) null);
    }

    public final void zzG(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, (Object) null);
    }

    public final void zzH(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzI(String str) {
        zzb(6, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzJ(String str, Object obj) {
        zzb(6, str, obj, (Object) null, (Object) null);
    }

    public final void zzK(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, (Object) null);
    }

    public final void zzL(String str) {
        zzb(4, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzM(String str, Object obj) {
        zzb(4, str, obj, (Object) null, (Object) null);
    }

    public final void zzN(String str) {
        zzb(2, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzO(String str, Object obj) {
        zzb(2, str, obj, (Object) null, (Object) null);
    }

    public final void zzP(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, (Object) null);
    }

    public final void zzQ(String str) {
        zzb(5, str, (Object) null, (Object) null, (Object) null);
    }

    public final void zzR(String str, Object obj) {
        zzb(5, str, obj, (Object) null, (Object) null);
    }

    public final void zzS(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, (Object) null);
    }

    public final void zzT(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    public final void zzb(int i10, String str, Object obj, Object obj2, Object obj3) {
        zzbx zzbx = this.zza;
        zzfd zzn = zzbx != null ? zzbx.zzn() : null;
        if (zzn != null) {
            String str2 = (String) zzew.zzc.zzb();
            if (Log.isLoggable(str2, i10)) {
                Log.println(i10, str2, zzD(str, obj, obj2, obj3));
            }
            if (i10 >= 5) {
                zzn.zze(i10, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String str3 = (String) zzew.zzc.zzb();
        if (Log.isLoggable(str3, i10)) {
            Log.println(i10, str3, zzD(str, obj, obj2, obj3));
        }
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final c zzp() {
        return this.zza.zzc();
    }

    public final v zzq() {
        return this.zza.zzd();
    }

    public final zzbk zzr() {
        return this.zza.zze();
    }

    public final zzbs zzs() {
        return this.zza.zzf();
    }

    public final zzbx zzt() {
        return this.zza;
    }

    public final zzch zzu() {
        return this.zza.zzh();
    }

    public final zzcp zzv() {
        return this.zza.zzi();
    }

    public final zzcv zzw() {
        return this.zza.zzj();
    }

    public final zzcz zzx() {
        return this.zza.zzk();
    }

    public final zzda zzy() {
        return this.zza.zzl();
    }

    public final zzfd zzz() {
        return this.zza.zzm();
    }
}
