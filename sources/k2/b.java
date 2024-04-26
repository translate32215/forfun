package k2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import g2.e;
import h2.d;
import h2.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o2.f;
import o2.j;
import o2.l;

/* compiled from: SystemJobScheduler */
public class b implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final String f19881f = e.e("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f19882a;

    /* renamed from: b  reason: collision with root package name */
    public final JobScheduler f19883b;

    /* renamed from: c  reason: collision with root package name */
    public final h f19884c;

    /* renamed from: d  reason: collision with root package name */
    public final p2.e f19885d;

    /* renamed from: e  reason: collision with root package name */
    public final a f19886e;

    public b(Context context, h hVar) {
        a aVar = new a(context);
        this.f19882a = context;
        this.f19884c = hVar;
        this.f19883b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f19885d = new p2.e(context);
        this.f19886e = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            e.c().b(f19881f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)}), th);
        }
    }

    public static List<Integer> c(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> e10 = e(context, jobScheduler);
        if (e10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : e10) {
            PersistableBundle extras = next.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            e.c().b(f19881f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void b(String str) {
        List<Integer> c10 = c(this.f19882a, this.f19883b, str);
        if (c10 != null && !c10.isEmpty()) {
            for (Integer intValue : c10) {
                a(this.f19883b, intValue.intValue());
            }
            ((f) this.f19884c.f18830c.l()).c(str);
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(j... jVarArr) {
        int i10;
        List<Integer> c10;
        int i11;
        WorkDatabase workDatabase = this.f19884c.f18830c;
        int length = jVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            j jVar = jVarArr[i12];
            workDatabase.c();
            try {
                j h10 = ((l) workDatabase.n()).h(jVar.f22864a);
                if (h10 == null) {
                    e c11 = e.c();
                    String str = f19881f;
                    c11.f(str, "Skipping scheduling " + jVar.f22864a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.j();
                } else if (h10.f22865b != androidx.work.d.ENQUEUED) {
                    e c12 = e.c();
                    String str2 = f19881f;
                    c12.f(str2, "Skipping scheduling " + jVar.f22864a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.j();
                } else {
                    o2.d a10 = ((f) workDatabase.l()).a(jVar.f22864a);
                    if (a10 != null) {
                        i10 = a10.f22856b;
                    } else {
                        p2.e eVar = this.f19885d;
                        this.f19884c.f18829b.getClass();
                        i10 = eVar.c(0, this.f19884c.f18829b.f18391e);
                    }
                    if (a10 == null) {
                        ((f) this.f19884c.f18830c.l()).b(new o2.d(jVar.f22864a, i10));
                    }
                    f(jVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (c10 = c(this.f19882a, this.f19883b, jVar.f22864a)) != null) {
                        int indexOf = c10.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            c10.remove(indexOf);
                        }
                        if (!c10.isEmpty()) {
                            i11 = c10.get(0).intValue();
                        } else {
                            p2.e eVar2 = this.f19885d;
                            this.f19884c.f18829b.getClass();
                            i11 = eVar2.c(0, this.f19884c.f18829b.f18391e);
                        }
                        f(jVar, i11);
                    }
                    workDatabase.j();
                }
                workDatabase.g();
                i12++;
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(o2.j r13, int r14) {
        /*
            r12 = this;
            k2.a r0 = r12.f19886e
            r0.getClass()
            g2.b r1 = r13.f22873j
            androidx.work.c r2 = r1.f18394a
            int r3 = r2.ordinal()
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            r8 = 26
            r9 = 24
            if (r3 == 0) goto L_0x0046
            if (r3 == r6) goto L_0x0044
            if (r3 == r4) goto L_0x0042
            if (r3 == r5) goto L_0x0026
            r10 = 4
            if (r3 == r10) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r8) goto L_0x002c
            goto L_0x0047
        L_0x0026:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r9) goto L_0x002c
            r10 = 3
            goto L_0x0047
        L_0x002c:
            g2.e r3 = g2.e.c()
            java.lang.String r10 = k2.a.f19879b
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r7] = r2
            java.lang.String r2 = "API version too low. Cannot convert network type value %s"
            java.lang.String r2 = java.lang.String.format(r2, r11)
            java.lang.Throwable[] r11 = new java.lang.Throwable[r7]
            r3.a(r10, r2, r11)
            goto L_0x0044
        L_0x0042:
            r10 = 2
            goto L_0x0047
        L_0x0044:
            r10 = 1
            goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            android.os.PersistableBundle r2 = new android.os.PersistableBundle
            r2.<init>()
            java.lang.String r3 = r13.f22864a
            java.lang.String r11 = "EXTRA_WORK_SPEC_ID"
            r2.putString(r11, r3)
            boolean r3 = r13.d()
            java.lang.String r11 = "EXTRA_IS_PERIODIC"
            r2.putBoolean(r11, r3)
            android.app.job.JobInfo$Builder r3 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r0 = r0.f19880a
            r3.<init>(r14, r0)
            android.app.job.JobInfo$Builder r0 = r3.setRequiredNetworkType(r10)
            boolean r3 = r1.f18395b
            android.app.job.JobInfo$Builder r0 = r0.setRequiresCharging(r3)
            boolean r3 = r1.f18396c
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r3)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r2)
            boolean r2 = r1.f18396c
            if (r2 != 0) goto L_0x0089
            androidx.work.a r2 = r13.f22875l
            androidx.work.a r3 = androidx.work.a.LINEAR
            if (r2 != r3) goto L_0x0083
            r2 = 0
            goto L_0x0084
        L_0x0083:
            r2 = 1
        L_0x0084:
            long r10 = r13.f22876m
            r0.setBackoffCriteria(r10, r2)
        L_0x0089:
            long r2 = r13.a()
            long r10 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r10
            r10 = 0
            long r2 = java.lang.Math.max(r2, r10)
            r0.setMinimumLatency(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r9) goto L_0x00d7
            g2.c r2 = r1.f18401h
            int r2 = r2.a()
            if (r2 <= 0) goto L_0x00a9
            r2 = 1
            goto L_0x00aa
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            if (r2 == 0) goto L_0x00d7
            g2.c r2 = r1.f18401h
            java.util.Set<g2.c$a> r2 = r2.f18404a
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00cd
            java.lang.Object r3 = r2.next()
            g2.c$a r3 = (g2.c.a) r3
            boolean r9 = r3.f18406b
            android.app.job.JobInfo$TriggerContentUri r10 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r3 = r3.f18405a
            r10.<init>(r3, r9)
            r0.addTriggerContentUri(r10)
            goto L_0x00b4
        L_0x00cd:
            long r2 = r1.f18399f
            r0.setTriggerContentUpdateDelay(r2)
            long r2 = r1.f18400g
            r0.setTriggerContentMaxDelay(r2)
        L_0x00d7:
            r0.setPersisted(r7)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r8) goto L_0x00e8
            boolean r2 = r1.f18397d
            r0.setRequiresBatteryNotLow(r2)
            boolean r1 = r1.f18398e
            r0.setRequiresStorageNotLow(r1)
        L_0x00e8:
            android.app.job.JobInfo r0 = r0.build()
            g2.e r1 = g2.e.c()
            java.lang.String r2 = f19881f
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r8 = r13.f22864a
            r3[r7] = r8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r3[r6] = r14
            java.lang.String r14 = "Scheduling work ID %s Job ID %s"
            java.lang.String r14 = java.lang.String.format(r14, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r7]
            r1.a(r2, r14, r3)
            android.app.job.JobScheduler r14 = r12.f19883b     // Catch:{ IllegalStateException -> 0x0128, all -> 0x010f }
            r14.schedule(r0)     // Catch:{ IllegalStateException -> 0x0128, all -> 0x010f }
            goto L_0x0127
        L_0x010f:
            r14 = move-exception
            g2.e r0 = g2.e.c()
            java.lang.String r1 = f19881f
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r7] = r13
            java.lang.String r13 = "Unable to schedule %s"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r6]
            r2[r7] = r14
            r0.b(r1, r13, r2)
        L_0x0127:
            return
        L_0x0128:
            r13 = move-exception
            android.content.Context r14 = r12.f19882a
            android.app.job.JobScheduler r0 = r12.f19883b
            java.util.List r14 = e(r14, r0)
            if (r14 == 0) goto L_0x0138
            int r14 = r14.size()
            goto L_0x0139
        L_0x0138:
            r14 = 0
        L_0x0139:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r7] = r14
            h2.h r14 = r12.f19884c
            androidx.work.impl.WorkDatabase r14 = r14.f18830c
            o2.k r14 = r14.n()
            o2.l r14 = (o2.l) r14
            java.util.List r14 = r14.d()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r14 = r14.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r6] = r14
            h2.h r14 = r12.f19884c
            g2.a r14 = r14.f18829b
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 != r3) goto L_0x016d
            int r14 = r14.f18392f
            int r14 = r14 / r4
            goto L_0x016f
        L_0x016d:
            int r14 = r14.f18392f
        L_0x016f:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1[r4] = r14
            java.lang.String r14 = "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."
            java.lang.String r14 = java.lang.String.format(r0, r14, r1)
            g2.e r0 = g2.e.c()
            java.lang.String r1 = f19881f
            java.lang.Throwable[] r2 = new java.lang.Throwable[r7]
            r0.b(r1, r14, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14, r13)
            goto L_0x018d
        L_0x018c:
            throw r0
        L_0x018d:
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.b.f(o2.j, int):void");
    }
}
