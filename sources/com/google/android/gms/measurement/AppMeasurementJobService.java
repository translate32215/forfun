package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import f7.f0;
import f7.j0;
import k8.a1;
import o8.i5;
import o8.j5;
import o8.u5;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class AppMeasurementJobService extends JobService implements i5 {

    /* renamed from: a  reason: collision with root package name */
    public j5<AppMeasurementJobService> f8775a;

    public final void a(Intent intent) {
    }

    public final boolean b(int i10) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    public final void c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    public final j5<AppMeasurementJobService> d() {
        if (this.f8775a == null) {
            this.f8775a = new j5<>(this);
        }
        return this.f8775a;
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

    public boolean onStartJob(JobParameters jobParameters) {
        j5<AppMeasurementJobService> d10 = d();
        h d11 = l.u(d10.f23297a, (a1) null, (Long) null).d();
        String string = jobParameters.getExtras().getString("action");
        d11.f8805n.b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f0 f0Var = new f0((j5) d10, d11, jobParameters);
        u5 O = u5.O(d10.f23297a);
        O.b().r(new j0(O, (Runnable) f0Var));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
