package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public abstract class zzbu extends zzbt {
    public boolean zza;

    public zzbu(zzbx zzbx) {
        super(zzbx);
    }

    public final void zzV() {
        if (!zzX()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzW() {
        zzd();
        this.zza = true;
    }

    public final boolean zzX() {
        return this.zza;
    }

    public abstract void zzd();
}
