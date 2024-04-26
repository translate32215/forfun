package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.i;
import java.util.List;
import n7.c;
import n7.v;
import z7.b;
import z7.e;

@SuppressLint({"StaticFieldLeak"})
/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbx {
    public static volatile zzbx zza;
    public final Context zzb;
    public final Context zzc;
    public final b zzd = e.f28726a;
    public final zzcv zze = new zzcv(this);
    public final zzfd zzf;
    public final v zzg;
    public final zzbs zzh;
    public final zzda zzi;
    public final zzfv zzj;
    public final zzfj zzk;
    public final c zzl;
    public final zzcp zzm;
    public final zzbk zzn;
    public final zzch zzo;
    public final zzcz zzp;

    public zzbx(zzby zzby) {
        Context zza2 = zzby.zza();
        i.i(zza2, "Application context can't be null");
        Context zzb2 = zzby.zzb();
        i.h(zzb2);
        this.zzb = zza2;
        this.zzc = zzb2;
        zzfd zzfd = new zzfd(this);
        zzfd.zzW();
        this.zzf = zzfd;
        zzfd zzm2 = zzm();
        String str = zzbv.zza;
        zzm2.zzL("Google Analytics " + str + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfj zzfj = new zzfj(this);
        zzfj.zzW();
        this.zzk = zzfj;
        zzfv zzfv = new zzfv(this);
        zzfv.zzW();
        this.zzj = zzfv;
        zzbs zzbs = new zzbs(this, zzby);
        zzcp zzcp = new zzcp(this);
        zzbk zzbk = new zzbk(this);
        zzch zzch = new zzch(this);
        zzcz zzcz = new zzcz(this);
        if (v.f22391f == null) {
            synchronized (v.class) {
                if (v.f22391f == null) {
                    v.f22391f = new v(zza2);
                }
            }
        }
        v vVar = v.f22391f;
        vVar.f22396e = new zzbw(this);
        this.zzg = vVar;
        c cVar = new c(this);
        zzcp.zzW();
        this.zzm = zzcp;
        zzbk.zzW();
        this.zzn = zzbk;
        zzch.zzW();
        this.zzo = zzch;
        zzcz.zzW();
        this.zzp = zzcz;
        zzda zzda = new zzda(this);
        zzda.zzW();
        this.zzi = zzda;
        zzbs.zzW();
        this.zzh = zzbs;
        zzfv zzq = cVar.f22368d.zzq();
        zzq.zzf();
        if (zzq.zze()) {
            cVar.f22354i = zzq.zzc();
        }
        zzq.zzf();
        cVar.f22351f = true;
        this.zzl = cVar;
        zzbs.zzm();
    }

    public static zzbx zzg(Context context) {
        if (context != null) {
            if (zza == null) {
                synchronized (zzbx.class) {
                    if (zza == null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        zzbx zzbx = new zzbx(new zzby(context));
                        zza = zzbx;
                        List list = c.f22350j;
                        synchronized (c.class) {
                            List<Runnable> list2 = c.f22350j;
                            if (list2 != null) {
                                for (Runnable run : list2) {
                                    run.run();
                                }
                                c.f22350j = null;
                            }
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        long longValue = ((Long) zzew.zzQ.zzb()).longValue();
                        if (elapsedRealtime2 > longValue) {
                            zzbx.zzm().zzS("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                        }
                    }
                }
            }
            return zza;
        }
        throw new NullPointerException("null reference");
    }

    public static final void zzs(zzbu zzbu) {
        i.i(zzbu, "Analytics service not created/initialized");
        i.b(zzbu.zzX(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final c zzc() {
        i.h(this.zzl);
        i.b(this.zzl.f22351f, "Analytics instance not initialized");
        return this.zzl;
    }

    public final v zzd() {
        i.h(this.zzg);
        return this.zzg;
    }

    public final zzbk zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbs zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzch zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcp zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzcv zzj() {
        return this.zze;
    }

    public final zzcz zzk() {
        return this.zzp;
    }

    public final zzda zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfd zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfd zzn() {
        return this.zzf;
    }

    public final zzfj zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfj zzp() {
        zzfj zzfj = this.zzk;
        if (zzfj == null || !zzfj.zzX()) {
            return null;
        }
        return zzfj;
    }

    public final zzfv zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final b zzr() {
        return this.zzd;
    }
}
