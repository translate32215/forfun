package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import b8.c;
import com.google.android.gms.common.internal.i;
import f7.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import n7.a;
import n7.j;
import n7.o;
import n7.p;
import n7.v;
import n7.x;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcm extends zzbu {
    public boolean zza;
    public final zzcg zzb;
    public final zzfg zzc;
    public final zzfe zzd;
    public final zzce zze;
    public long zzf;
    public final zzcy zzg;
    public final zzcy zzh;
    public final zzfq zzi;
    public long zzj;
    public boolean zzk;

    public zzcm(zzbx zzbx, zzby zzby) {
        super(zzbx);
        if (zzby != null) {
            this.zzf = Long.MIN_VALUE;
            this.zzd = new zzfe(zzbx);
            this.zzb = new zzcg(zzbx);
            this.zzc = new zzfg(zzbx);
            this.zze = new zzce(zzbx);
            this.zzi = new zzfq(zzC());
            this.zzg = new zzci(this, zzbx);
            this.zzh = new zzcj(this, zzbx);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static /* bridge */ /* synthetic */ void zzc(zzcm zzcm) {
        try {
            zzcm.zzb.zza();
            zzcm.zzad();
        } catch (SQLiteException e10) {
            zzcm.zzR("Failed to delete stale hits", e10);
        }
        zzcy zzcy = zzcm.zzh;
        zzcm.zzw();
        zzcy.zzg(86400000);
    }

    public final void zzZ() {
        zzV();
        i.k(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().c(new zzck(this));
    }

    public final long zza() {
        long j10 = this.zzf;
        if (j10 != Long.MIN_VALUE) {
            return j10;
        }
        zzw();
        long longValue = ((Long) zzew.zzi.zzb()).longValue();
        zzfv zzB = zzB();
        zzB.zzV();
        if (!zzB.zzc) {
            return longValue;
        }
        zzfv zzB2 = zzB();
        zzB2.zzV();
        return ((long) zzB2.zzd) * 1000;
    }

    public final void zzaa() {
        zzV();
        zzw();
        v.b();
        Context zza2 = zzt().zza();
        if (!zzfk.zza(zza2)) {
            zzQ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfp.zzh(zza2)) {
            zzI("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!a.zzb(zza2)) {
            zzQ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzaj("android.permission.ACCESS_NETWORK_STATE")) {
            zzI("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (!zzaj("android.permission.INTERNET")) {
            zzI("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (zzfp.zzh(zzo())) {
            zzN("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzQ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzab()) {
                zzi();
            }
        }
        zzad();
    }

    public final void zzab() {
        v.b();
        zzV();
        zzE("Sync dispatching local hits");
        long j10 = this.zzj;
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzJ("Sync local dispatch failed", e10);
            zzad();
        }
    }

    public final void zzac() {
        zzV();
        v.b();
        this.zzk = true;
        this.zze.zzc();
        zzad();
    }

    public final void zzad() {
        long j10;
        v.b();
        zzV();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzab()) {
                    this.zzd.zzc();
                    zzag();
                    zzaf();
                    return;
                }
                if (!((Boolean) zzew.zzJ.zzb()).booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzag();
                        zzaf();
                        zzah();
                        return;
                    }
                }
                zzah();
                long zza2 = zza();
                long zzb2 = zzA().zzb();
                if (zzb2 != 0) {
                    j10 = zza2 - Math.abs(zzC().b() - zzb2);
                    if (j10 <= 0) {
                        zzw();
                        j10 = Math.min(zzcv.zze(), zza2);
                    }
                } else {
                    zzw();
                    j10 = Math.min(zzcv.zze(), zza2);
                }
                zzO("Dispatch scheduled (ms)", Long.valueOf(j10));
                if (this.zzg.zzh()) {
                    this.zzg.zze(Math.max(1, this.zzg.zzb() + j10));
                    return;
                }
                this.zzg.zzg(j10);
                return;
            }
        }
        this.zzd.zzc();
        zzag();
        zzaf();
    }

    public final boolean zzae() {
        boolean z10;
        v.b();
        zzV();
        zzN("Dispatching a batch of local hits");
        if (!this.zze.zzg()) {
            zzw();
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zze2 = true ^ this.zzc.zze();
        if (!z10 || !zze2) {
            zzw();
            int zzh2 = zzcv.zzh();
            zzw();
            long max = (long) Math.max(zzh2, zzcv.zzg());
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            while (true) {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List<zzez> zzj2 = this.zzb.zzj(max);
                        if (zzj2.isEmpty()) {
                            zzN("Store is empty, nothing to dispatch");
                            zzag();
                            zzaf();
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e10) {
                                zzJ("Failed to commit local dispatch transaction", e10);
                                zzag();
                                zzaf();
                                return false;
                            }
                        } else {
                            zzO("Hits loaded from store. count", Integer.valueOf(zzj2.size()));
                            for (zzez zzb2 : zzj2) {
                                if (zzb2.zzb() == j10) {
                                    zzK("Database contains successfully uploaded hit", Long.valueOf(j10), Integer.valueOf(zzj2.size()));
                                    zzag();
                                    zzaf();
                                    try {
                                        this.zzb.zzaa();
                                        this.zzb.zzZ();
                                        return false;
                                    } catch (SQLiteException e11) {
                                        zzJ("Failed to commit local dispatch transaction", e11);
                                        zzag();
                                        zzaf();
                                        return false;
                                    }
                                }
                            }
                            if (this.zze.zzg()) {
                                zzw();
                                zzN("Service connected, sending hits to the service");
                                while (true) {
                                    if (!zzj2.isEmpty()) {
                                        zzez zzez = (zzez) zzj2.get(0);
                                        if (!this.zze.zzh(zzez)) {
                                            break;
                                        }
                                        j10 = Math.max(j10, zzez.zzb());
                                        zzj2.remove(zzez);
                                        zzF("Hit sent do device AnalyticsService for delivery", zzez);
                                        this.zzb.zzn(zzez.zzb());
                                        arrayList.add(Long.valueOf(zzez.zzb()));
                                    }
                                }
                            }
                            if (this.zzc.zze()) {
                                List<Long> zzc2 = this.zzc.zzc(zzj2);
                                for (Long longValue : zzc2) {
                                    j10 = Math.max(j10, longValue.longValue());
                                }
                                try {
                                    this.zzb.zzY(zzc2);
                                    arrayList.addAll(zzc2);
                                } catch (SQLiteException e12) {
                                    zzJ("Failed to remove successfully uploaded hits", e12);
                                    zzag();
                                    zzaf();
                                    try {
                                        this.zzb.zzaa();
                                        this.zzb.zzZ();
                                        return false;
                                    } catch (SQLiteException e13) {
                                        zzJ("Failed to commit local dispatch transaction", e13);
                                        zzag();
                                        zzaf();
                                        return false;
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                    return false;
                                } catch (SQLiteException e14) {
                                    zzJ("Failed to commit local dispatch transaction", e14);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            } else {
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                } catch (SQLiteException e15) {
                                    zzJ("Failed to commit local dispatch transaction", e15);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            }
                        }
                    } catch (SQLiteException e16) {
                        zzR("Failed to read hits from persisted store", e16);
                        zzag();
                        zzaf();
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                            return false;
                        } catch (SQLiteException e17) {
                            zzJ("Failed to commit local dispatch transaction", e17);
                            zzag();
                            zzaf();
                            return false;
                        }
                    }
                } catch (SQLiteException e18) {
                    zzJ("Failed to remove hit that was send for delivery", e18);
                    zzag();
                    zzaf();
                    try {
                        this.zzb.zzaa();
                        this.zzb.zzZ();
                        return false;
                    } catch (SQLiteException e19) {
                        zzJ("Failed to commit local dispatch transaction", e19);
                        zzag();
                        zzaf();
                        return false;
                    }
                } catch (Throwable th) {
                    try {
                        this.zzb.zzaa();
                        this.zzb.zzZ();
                        throw th;
                    } catch (SQLiteException e20) {
                        zzJ("Failed to commit local dispatch transaction", e20);
                        zzag();
                        zzaf();
                        return false;
                    }
                }
            }
        } else {
            zzN("No network or service available. Will retry later");
            return false;
        }
    }

    public final void zzaf() {
        zzda zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    public final void zzag() {
        if (this.zzg.zzh()) {
            zzN("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    public final void zzah() {
        long j10;
        zzda zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            v.b();
            zzV();
            try {
                j10 = this.zzb.zzc();
            } catch (SQLiteException e10) {
                zzJ("Failed to get min/max hit times from local store", e10);
                j10 = 0;
            }
            if (j10 != 0) {
                long abs = Math.abs(zzC().b() - j10);
                zzw();
                if (abs <= ((Long) zzew.zzn.zzb()).longValue()) {
                    zzw();
                    zzO("Dispatch alarm scheduled (ms)", Long.valueOf(zzcv.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    public final void zzai(zzbz zzbz, zzay zzay) {
        if (zzbz == null) {
            throw new NullPointerException("null reference");
        } else if (zzay != null) {
            n7.i iVar = new n7.i(zzt());
            String zzc2 = zzbz.zzc();
            i.e(zzc2);
            Uri i10 = j.i(zzc2);
            ListIterator listIterator = iVar.f22366b.f22387k.listIterator();
            while (listIterator.hasNext()) {
                if (i10.equals(((x) listIterator.next()).d())) {
                    listIterator.remove();
                }
            }
            iVar.f22366b.f22387k.add(new j(iVar.f22368d, zzc2));
            iVar.f22369e = zzbz.zzf();
            o oVar = new o(iVar.f22366b);
            oVar.b(iVar.f22368d.zzh().zza());
            oVar.b(iVar.f22368d.zzk().zza());
            for (p zza2 : iVar.f22367c) {
                zza2.zza();
            }
            zzbg zzbg = (zzbg) oVar.a(zzbg.class);
            zzbg.zzk("data");
            zzbg.zzl(true);
            oVar.b(zzay);
            zzbb zzbb = (zzbb) oVar.a(zzbb.class);
            zzax zzax = (zzax) oVar.a(zzax.class);
            for (Map.Entry entry : zzbz.zzd().entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if ("an".equals(str)) {
                    zzax.zzk(str2);
                } else if ("av".equals(str)) {
                    zzax.zzl(str2);
                } else if ("aid".equals(str)) {
                    zzax.zzi(str2);
                } else if ("aiid".equals(str)) {
                    zzax.zzj(str2);
                } else if ("uid".equals(str)) {
                    zzbg.zzm(str2);
                } else {
                    zzbb.zze(str, str2);
                }
            }
            zzG("Sending installation campaign to", zzbz.zzc(), zzay);
            oVar.f22381e = zzA().zza();
            v vVar = oVar.f22377a.f22365a;
            vVar.getClass();
            if (oVar.f22385i) {
                throw new IllegalStateException("Measurement prototype can't be submitted");
            } else if (!oVar.f22379c) {
                o oVar2 = new o(oVar);
                oVar2.f22382f = oVar2.f22378b.a();
                long j10 = oVar2.f22381e;
                if (j10 != 0) {
                    oVar2.f22380d = j10;
                } else {
                    oVar2.f22380d = oVar2.f22378b.b();
                }
                oVar2.f22379c = true;
                vVar.f22394c.execute(new j0(vVar, oVar2));
            } else {
                throw new IllegalStateException("Measurement can only be submitted once");
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final boolean zzaj(String str) {
        return c.a(zzo()).f3657a.checkCallingOrSelfPermission(str) == 0;
    }

    public final long zzb(zzbz zzbz, boolean z10) {
        if (zzbz != null) {
            zzV();
            v.b();
            try {
                this.zzb.zzm();
                zzcg zzcg = this.zzb;
                String zzb2 = zzbz.zzb();
                i.e(zzb2);
                zzcg.zzV();
                v.b();
                int delete = zzcg.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", zzb2});
                if (delete > 0) {
                    zzcg.zzO("Deleted property records", Integer.valueOf(delete));
                }
                long zze2 = this.zzb.zze(0, zzbz.zzb(), zzbz.zzc());
                zzbz.zze(1 + zze2);
                zzcg zzcg2 = this.zzb;
                zzcg2.zzV();
                v.b();
                SQLiteDatabase zzf2 = zzcg2.zzf();
                Map zzd2 = zzbz.zzd();
                i.h(zzd2);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : zzd2.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", 0L);
                contentValues.put("cid", zzbz.zzb());
                contentValues.put("tid", zzbz.zzc());
                contentValues.put("adid", Integer.valueOf(zzbz.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbz.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf2.insertWithOnConflict("properties", (String) null, contentValues, 5) == -1) {
                        zzcg2.zzI("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e10) {
                    zzcg2.zzJ("Error storing a property", e10);
                }
                this.zzb.zzaa();
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e11) {
                    zzJ("Failed to end transaction", e11);
                }
                return zze2;
            } catch (SQLiteException e12) {
                zzJ("Failed to update Analytics property", e12);
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e13) {
                    zzJ("Failed to end transaction", e13);
                }
                return -1;
            } catch (Throwable th) {
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e14) {
                    zzJ("Failed to end transaction", e14);
                }
                throw th;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public final void zzf(zzdb zzdb) {
        zzg(zzdb, this.zzj);
    }

    public final void zzg(zzdb zzdb, long j10) {
        v.b();
        zzV();
        long zzb2 = zzA().zzb();
        zzF("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(zzb2 != 0 ? Math.abs(zzC().b() - zzb2) : -1));
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (zzdb != null) {
                zzdb.zza((Throwable) null);
            }
            if (this.zzj != j10) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzJ("Local dispatch failed", e10);
            zzA().zzi();
            zzad();
            if (zzdb != null) {
                zzdb.zza(e10);
            }
        }
    }

    public final void zzi() {
        if (!this.zzk) {
            zzw();
            if (zzcv.zzl() && !this.zze.zzg()) {
                zzw();
                if (this.zzi.zzc(((Long) zzew.zzO.zzb()).longValue())) {
                    this.zzi.zzb();
                    zzN("Connecting to service");
                    if (this.zze.zzf()) {
                        zzN("Connected to service");
                        this.zzi.zza();
                        zzm();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0168, code lost:
        if (r2 != null) goto L_0x0159;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0181 A[Catch:{ SQLiteException -> 0x01ed }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(com.google.android.gms.internal.gtm.zzez r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "hit_id"
            if (r0 == 0) goto L_0x01fd
            n7.v.b()
            r20.zzV()
            boolean r3 = r1.zzk
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"
            r1.zzE(r3)
            goto L_0x001d
        L_0x0018:
            java.lang.String r3 = "Delivering hit"
            r1.zzO(r3, r0)
        L_0x001d:
            java.lang.String r3 = r21.zzf()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.internal.gtm.zzfj r3 = r20.zzA()
            com.google.android.gms.internal.gtm.zzfi r3 = r3.zze()
            android.util.Pair r3 = r3.zza()
            if (r3 == 0) goto L_0x0063
            java.lang.Object r4 = r3.second
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r3 = r3.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ":"
            r5.append(r4)
            r5.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            java.util.Map r4 = r21.zzg()
            r3.<init>(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "_m"
            r3.put(r5, r4)
            com.google.android.gms.internal.gtm.zzez r0 = com.google.android.gms.internal.gtm.zzez.zze(r1, r0, r3)
        L_0x0063:
            r3 = r0
            r20.zzi()
            com.google.android.gms.internal.gtm.zzce r0 = r1.zze
            boolean r0 = r0.zzh(r3)
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "Hit sent to the device AnalyticsService for delivery"
            r1.zzE(r0)
            return
        L_0x0075:
            r20.zzw()
            com.google.android.gms.internal.gtm.zzcg r4 = r1.zzb     // Catch:{ SQLiteException -> 0x01ed }
            com.google.android.gms.common.internal.i.h(r3)     // Catch:{ SQLiteException -> 0x01ed }
            n7.v.b()     // Catch:{ SQLiteException -> 0x01ed }
            r4.zzV()     // Catch:{ SQLiteException -> 0x01ed }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ SQLiteException -> 0x01ed }
            r0.<init>()     // Catch:{ SQLiteException -> 0x01ed }
            java.util.Map r5 = r3.zzg()     // Catch:{ SQLiteException -> 0x01ed }
            java.util.Set r5 = r5.entrySet()     // Catch:{ SQLiteException -> 0x01ed }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ SQLiteException -> 0x01ed }
        L_0x0094:
            boolean r6 = r5.hasNext()     // Catch:{ SQLiteException -> 0x01ed }
            if (r6 == 0) goto L_0x00c8
            java.lang.Object r6 = r5.next()     // Catch:{ SQLiteException -> 0x01ed }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.Object r7 = r6.getKey()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r8 = "ht"
            boolean r8 = r8.equals(r7)     // Catch:{ SQLiteException -> 0x01ed }
            if (r8 != 0) goto L_0x0094
            java.lang.String r8 = "qt"
            boolean r8 = r8.equals(r7)     // Catch:{ SQLiteException -> 0x01ed }
            if (r8 != 0) goto L_0x0094
            java.lang.String r8 = "AppUID"
            boolean r8 = r8.equals(r7)     // Catch:{ SQLiteException -> 0x01ed }
            if (r8 != 0) goto L_0x0094
            java.lang.Object r6 = r6.getValue()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SQLiteException -> 0x01ed }
            r0.appendQueryParameter(r7, r6)     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x0094
        L_0x00c8:
            android.net.Uri r0 = r0.build()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r0 = r0.getEncodedQuery()     // Catch:{ SQLiteException -> 0x01ed }
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = ""
        L_0x00d4:
            r5 = r0
            int r0 = r5.length()     // Catch:{ SQLiteException -> 0x01ed }
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r0 <= r6) goto L_0x00e8
            com.google.android.gms.internal.gtm.zzfd r0 = r4.zzz()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r2 = "Hit length exceeds the maximum allowed size"
            r0.zzb(r3, r2)     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x01e9
        L_0x00e8:
            r4.zzw()     // Catch:{ SQLiteException -> 0x01ed }
            com.google.android.gms.internal.gtm.zzev r0 = com.google.android.gms.internal.gtm.zzew.zzf     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.Object r0 = r0.zzb()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SQLiteException -> 0x01ed }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x01ed }
            long r6 = r4.zzb()     // Catch:{ SQLiteException -> 0x01ed }
            int r8 = r0 + -1
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x01ed }
            r10 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0185
            long r8 = (long) r0     // Catch:{ SQLiteException -> 0x01ed }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            n7.v.b()     // Catch:{ SQLiteException -> 0x01ed }
            r4.zzV()     // Catch:{ SQLiteException -> 0x01ed }
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0119
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x016c
        L_0x0119:
            android.database.sqlite.SQLiteDatabase r11 = r4.zzf()     // Catch:{ SQLiteException -> 0x01ed }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01ed }
            r8.<init>()     // Catch:{ SQLiteException -> 0x01ed }
            r0 = 1
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            r9 = 0
            r13[r9] = r2     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            r0[r9] = r2     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            java.lang.String r12 = "hits2"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r2 = "%s ASC"
            java.lang.String r18 = java.lang.String.format(r2, r0)     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            java.lang.String r19 = java.lang.Long.toString(r6)     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            android.database.Cursor r2 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0161, all -> 0x015f }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x015d }
            if (r0 == 0) goto L_0x0159
        L_0x0148:
            long r6 = r2.getLong(r9)     // Catch:{ SQLiteException -> 0x015d }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x015d }
            r8.add(r0)     // Catch:{ SQLiteException -> 0x015d }
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x015d }
            if (r0 != 0) goto L_0x0148
        L_0x0159:
            r2.close()     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x016b
        L_0x015d:
            r0 = move-exception
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            goto L_0x017f
        L_0x0161:
            r0 = move-exception
            r2 = r10
        L_0x0163:
            java.lang.String r6 = "Error selecting hit ids"
            r4.zzR(r6, r0)     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x016b
            goto L_0x0159
        L_0x016b:
            r0 = r8
        L_0x016c:
            java.lang.String r2 = "Store full, deleting hits to make room, count"
            int r6 = r0.size()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x01ed }
            r4.zzR(r2, r6)     // Catch:{ SQLiteException -> 0x01ed }
            r4.zzY(r0)     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x0185
        L_0x017d:
            r0 = move-exception
            r10 = r2
        L_0x017f:
            if (r10 == 0) goto L_0x0184
            r10.close()     // Catch:{ SQLiteException -> 0x01ed }
        L_0x0184:
            throw r0     // Catch:{ SQLiteException -> 0x01ed }
        L_0x0185:
            android.database.sqlite.SQLiteDatabase r0 = r4.zzf()     // Catch:{ SQLiteException -> 0x01ed }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x01ed }
            r2.<init>()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r6 = "hit_string"
            r2.put(r6, r5)     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r5 = "hit_time"
            long r6 = r3.zzd()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x01ed }
            r2.put(r5, r6)     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r5 = "hit_app_id"
            int r6 = r3.zza()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x01ed }
            r2.put(r5, r6)     // Catch:{ SQLiteException -> 0x01ed }
            boolean r5 = r3.zzh()     // Catch:{ SQLiteException -> 0x01ed }
            if (r5 == 0) goto L_0x01bb
            r4.zzw()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r5 = com.google.android.gms.internal.gtm.zzcv.zzi()     // Catch:{ SQLiteException -> 0x01ed }
            goto L_0x01c2
        L_0x01bb:
            r4.zzw()     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r5 = com.google.android.gms.internal.gtm.zzcv.zzk()     // Catch:{ SQLiteException -> 0x01ed }
        L_0x01c2:
            java.lang.String r6 = "hit_url"
            r2.put(r6, r5)     // Catch:{ SQLiteException -> 0x01ed }
            java.lang.String r5 = "hits2"
            long r5 = r0.insert(r5, r10, r2)     // Catch:{ SQLiteException -> 0x01e3 }
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01d9
            java.lang.String r0 = "Failed to insert a hit (got -1)"
            r4.zzI(r0)     // Catch:{ SQLiteException -> 0x01e3 }
            goto L_0x01e9
        L_0x01d9:
            java.lang.String r0 = "Hit saved to database. db-id, hit"
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x01e3 }
            r4.zzG(r0, r2, r3)     // Catch:{ SQLiteException -> 0x01e3 }
            goto L_0x01e9
        L_0x01e3:
            r0 = move-exception
            java.lang.String r2 = "Error storing a hit"
            r4.zzJ(r2, r0)     // Catch:{ SQLiteException -> 0x01ed }
        L_0x01e9:
            r20.zzad()     // Catch:{ SQLiteException -> 0x01ed }
            return
        L_0x01ed:
            r0 = move-exception
            java.lang.String r2 = "Delivery failed to save hit to a database"
            r1.zzJ(r2, r0)
            com.google.android.gms.internal.gtm.zzfd r0 = r20.zzz()
            java.lang.String r2 = "deliver: failed to insert hit to database"
            r0.zzb(r3, r2)
            return
        L_0x01fd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null reference"
            r0.<init>(r2)
            goto L_0x0206
        L_0x0205:
            throw r0
        L_0x0206:
            goto L_0x0205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcm.zzj(com.google.android.gms.internal.gtm.zzez):void");
    }

    public final void zzk(zzbz zzbz) {
        v.b();
        zzF("Sending first hit to property", zzbz.zzc());
        zzfq zzf2 = zzA().zzf();
        zzw();
        if (!zzf2.zzc(zzcv.zzc())) {
            String zzg2 = zzA().zzg();
            if (!TextUtils.isEmpty(zzg2)) {
                zzay zzb2 = zzfu.zzb(zzz(), zzg2);
                zzF("Found relevant installation campaign", zzb2);
                zzai(zzbz, zzb2);
            }
        }
    }

    public final void zzl() {
        v.b();
        this.zzj = zzC().b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[LOOP:1: B:14:0x004d->B:22:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080 A[SYNTHETIC, Splitter:B:26:0x0080] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm() {
        /*
            r5 = this;
            n7.v.b()
            r5.zzw()
            n7.v.b()
            r5.zzV()
            r5.zzw()
            r5.zzw()
            boolean r0 = com.google.android.gms.internal.gtm.zzcv.zzl()
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.zzQ(r0)
        L_0x001d:
            com.google.android.gms.internal.gtm.zzce r0 = r5.zze
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "Service not connected"
            r5.zzN(r0)
            return
        L_0x002b:
            com.google.android.gms.internal.gtm.zzcg r0 = r5.zzb
            boolean r0 = r0.zzab()
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.zzN(r0)
        L_0x0039:
            com.google.android.gms.internal.gtm.zzcg r0 = r5.zzb     // Catch:{ SQLiteException -> 0x0084 }
            r5.zzw()     // Catch:{ SQLiteException -> 0x0084 }
            int r1 = com.google.android.gms.internal.gtm.zzcv.zzh()     // Catch:{ SQLiteException -> 0x0084 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0084 }
            java.util.List r0 = r0.zzj(r1)     // Catch:{ SQLiteException -> 0x0084 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0084 }
            if (r1 != 0) goto L_0x0080
        L_0x004d:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0039
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.gtm.zzez r1 = (com.google.android.gms.internal.gtm.zzez) r1
            com.google.android.gms.internal.gtm.zzce r2 = r5.zze
            boolean r2 = r2.zzh(r1)
            if (r2 != 0) goto L_0x0066
            r5.zzad()
            return
        L_0x0066:
            r0.remove(r1)
            com.google.android.gms.internal.gtm.zzcg r2 = r5.zzb     // Catch:{ SQLiteException -> 0x0073 }
            long r3 = r1.zzb()     // Catch:{ SQLiteException -> 0x0073 }
            r2.zzn(r3)     // Catch:{ SQLiteException -> 0x0073 }
            goto L_0x004d
        L_0x0073:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.zzJ(r1, r0)
            r5.zzag()
            r5.zzaf()
            return
        L_0x0080:
            r5.zzad()     // Catch:{ SQLiteException -> 0x0084 }
            return
        L_0x0084:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.zzJ(r1, r0)
            r5.zzag()
            r5.zzaf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcm.zzm():void");
    }
}
