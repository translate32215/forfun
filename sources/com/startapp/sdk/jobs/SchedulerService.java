package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Sta */
public class SchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f12559a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12560b = new a();

    /* compiled from: Sta */
    public class a extends a {
        public a() {
        }

        public void a(b bVar) {
            ExecutorService executorService = SchedulerService.this.f12559a;
            if (executorService != null) {
                executorService.execute(bVar);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JobParameters f12562a;

        public b(PersistableBundle persistableBundle, JobParameters jobParameters) {
            this.f12562a = jobParameters;
        }

        public void a(b bVar, boolean z10) {
            SchedulerService.this.jobFinished(this.f12562a, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f12559a = Executors.newSingleThreadExecutor(new ComponentLocator.j0("scheduler"));
    }

    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f12559a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f12559a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f12560b.a(this, extras.getStringArray("extraKeyTags"), new b(extras, jobParameters), bundle);
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
