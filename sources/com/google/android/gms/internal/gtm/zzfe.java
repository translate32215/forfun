package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfe extends BroadcastReceiver {
    public static final String zza = zzfe.class.getName();
    public final zzbx zzb;
    public boolean zzc;
    public boolean zzd;

    public zzfe(zzbx zzbx) {
        if (zzbx != null) {
            this.zzb = zzbx;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzm();
        this.zzb.zzf();
        String action = intent.getAction();
        this.zzb.zzm().zzO("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zze = zze();
            if (this.zzd != zze) {
                this.zzd = zze;
                zzbs zzf = this.zzb.zzf();
                zzf.zzO("Network connectivity status changed", Boolean.valueOf(zze));
                zzf.zzq().c(new zzbl(zzf, zze));
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(zza)) {
            zzbs zzf2 = this.zzb.zzf();
            zzf2.zzN("Radio powered up");
            zzf2.zzc();
        }
    }

    public final void zza() {
        this.zzb.zzm();
        this.zzb.zzf();
        if (!this.zzc) {
            Context zza2 = this.zzb.zza();
            zza2.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(zza2.getPackageName());
            zza2.registerReceiver(this, intentFilter);
            this.zzd = zze();
            this.zzb.zzm().zzO("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
            this.zzc = true;
        }
    }

    public final void zzb() {
        Context zza2 = this.zzb.zza();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(zza2.getPackageName());
        intent.putExtra(zza, true);
        zza2.sendOrderedBroadcast(intent, (String) null);
    }

    public final void zzc() {
        if (this.zzc) {
            this.zzb.zzm().zzN("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zzb.zzm().zzJ("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final boolean zzd() {
        if (!this.zzc) {
            this.zzb.zzm().zzQ("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    public final boolean zze() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.zza().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
        }
    }
}
