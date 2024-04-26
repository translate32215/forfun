package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import g2.e;
import h2.a;
import h2.c;
import h2.h;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f3320c = e.e("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    public h f3321a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, JobParameters> f3322b = new HashMap();

    public void a(String str, boolean z10) {
        JobParameters remove;
        e.c().a(f3320c, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f3322b) {
            remove = this.f3322b.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            h c10 = h.c(getApplicationContext());
            this.f3321a = c10;
            c10.f18833f.b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                e.c().f(f3320c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f3321a;
        if (hVar != null) {
            c cVar = hVar.f18833f;
            synchronized (cVar.f18810i) {
                cVar.f18809h.remove(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        r2 = null;
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r3 < 24) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r2.f3233b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r2.f3232a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (r3 < 28) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r2.f3234c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        r9 = r8.f3321a;
        r3 = r9.f18831d;
        ((r2.b) r3).f24500a.execute(new p2.i(r9, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            h2.h r0 = r8.f3321a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            g2.e r0 = g2.e.c()
            java.lang.String r3 = f3320c
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            android.os.PersistableBundle r0 = r9.getExtras()
            if (r0 != 0) goto L_0x002b
            g2.e r9 = g2.e.c()
            java.lang.String r0 = f3320c
            java.lang.String r1 = "No extras in JobParameters."
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L_0x002b:
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0045
            g2.e r9 = g2.e.c()
            java.lang.String r0 = f3320c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L_0x0045:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f3322b
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f3322b     // Catch:{ all -> 0x00c9 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00c9 }
            if (r4 == 0) goto L_0x0067
            g2.e r9 = g2.e.c()     // Catch:{ all -> 0x00c9 }
            java.lang.String r4 = f3320c     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c9 }
            r1[r2] = r0     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00c9 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00c9 }
            r9.a(r4, r0, r1)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            return r2
        L_0x0067:
            g2.e r4 = g2.e.c()     // Catch:{ all -> 0x00c9 }
            java.lang.String r5 = f3320c     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c9 }
            r7[r2] = r0     // Catch:{ all -> 0x00c9 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00c9 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00c9 }
            r4.a(r5, r6, r2)     // Catch:{ all -> 0x00c9 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f3322b     // Catch:{ all -> 0x00c9 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00b8
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x009e
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f3233b = r4
        L_0x009e:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x00ae
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f3232a = r4
        L_0x00ae:
            r4 = 28
            if (r3 < r4) goto L_0x00b8
            android.net.Network r9 = r9.getNetwork()
            r2.f3234c = r9
        L_0x00b8:
            h2.h r9 = r8.f3321a
            r2.a r3 = r9.f18831d
            p2.i r4 = new p2.i
            r4.<init>(r9, r0, r2)
            r2.b r3 = (r2.b) r3
            java.util.concurrent.Executor r9 = r3.f24500a
            r9.execute(r4)
            return r1
        L_0x00c9:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f3321a == null) {
            e.c().a(f3320c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            e.c().b(f3320c, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            e.c().b(f3320c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        e.c().a(f3320c, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.f3322b) {
            this.f3322b.remove(string);
        }
        this.f3321a.f(string);
        c cVar = this.f3321a.f18833f;
        synchronized (cVar.f18810i) {
            contains = cVar.f18808g.contains(string);
        }
        return !contains;
    }
}
