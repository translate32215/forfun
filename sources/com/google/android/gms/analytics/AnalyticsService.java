package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfo;
import com.google.android.gms.internal.gtm.zzfp;

/* compiled from: com.google.android.gms:play-services-analytics@@18.0.2 */
public final class AnalyticsService extends Service implements zzfo {

    /* renamed from: a  reason: collision with root package name */
    public zzfp f5720a;

    public final zzfp a() {
        if (this.f5720a == null) {
            this.f5720a = new zzfp(this);
        }
        return this.f5720a;
    }

    public boolean callServiceStopSelfResult(int i10) {
        return stopSelfResult(i10);
    }

    public IBinder onBind(Intent intent) {
        a();
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        a().zza(intent, i10, i11);
        return 2;
    }

    public final void zza(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }
}
