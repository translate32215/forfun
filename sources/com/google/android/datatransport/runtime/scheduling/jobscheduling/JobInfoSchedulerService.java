package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c1.c;
import o4.b;
import o4.i;
import o4.n;
import s4.d;
import s4.h;
import w4.a;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5013a = 0;

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        n.b(getApplicationContext());
        i.a a10 = i.a();
        a10.a(string);
        b.C0204b bVar = (b.C0204b) a10;
        bVar.f22941c = a.b(i10);
        if (string2 != null) {
            bVar.f22940b = Base64.decode(string2, 0);
        }
        h hVar = n.a().f22966d;
        hVar.f24941e.execute(new d(hVar, bVar.b(), i11, new c(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
