package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import e8.gb;
import f7.j0;
import j1.a;
import k8.a1;
import o8.b4;
import o8.i5;
import o8.j5;
import o8.u5;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class AppMeasurementService extends Service implements i5 {

    /* renamed from: a  reason: collision with root package name */
    public j5<AppMeasurementService> f8777a;

    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.f19480a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = a.f19480a;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                    return;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    public final boolean b(int i10) {
        return stopSelfResult(i10);
    }

    public final void c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final j5<AppMeasurementService> d() {
        if (this.f8777a == null) {
            this.f8777a = new j5<>(this);
        }
        return this.f8777a;
    }

    public IBinder onBind(Intent intent) {
        j5<AppMeasurementService> d10 = d();
        d10.getClass();
        if (intent == null) {
            d10.c().f8797f.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new b4(u5.O(d10.f23297a));
        }
        d10.c().f8800i.b("onBind received unknown action", action);
        return null;
    }

    public void onCreate() {
        super.onCreate();
        l.u(d().f23297a, (a1) null, (Long) null).d().f8805n.a("Local AppMeasurementService is starting up");
    }

    public void onDestroy() {
        l.u(d().f23297a, (a1) null, (Long) null).d().f8805n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        d().a(intent);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        j5<AppMeasurementService> d10 = d();
        h d11 = l.u(d10.f23297a, (a1) null, (Long) null).d();
        if (intent == null) {
            d11.f8800i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d11.f8805n.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        gb gbVar = new gb((j5) d10, i11, d11, intent);
        u5 O = u5.O(d10.f23297a);
        O.b().r(new j0(O, (Runnable) gbVar));
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
