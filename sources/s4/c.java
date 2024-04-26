package s4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import l0.e;
import l4.d;
import o4.i;
import w4.a;

/* compiled from: JobInfoScheduler */
public class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24919a;

    /* renamed from: b  reason: collision with root package name */
    public final t4.c f24920b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.c f24921c;

    public c(Context context, t4.c cVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar2) {
        this.f24919a = context;
        this.f24920b = cVar;
        this.f24921c = cVar2;
    }

    public void a(i iVar, int i10) {
        b(iVar, i10, false);
    }

    public void b(i iVar, int i10, boolean z10) {
        boolean z11;
        i iVar2 = iVar;
        int i11 = i10;
        ComponentName componentName = new ComponentName(this.f24919a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f24919a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f24919a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(iVar.d())).array());
        if (iVar.c() != null) {
            adler32.update(iVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i12 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i12 >= i11) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                e.c("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar2);
                return;
            }
        }
        long U = this.f24920b.U(iVar2);
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = this.f24921c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        d d10 = iVar.d();
        String str = "JobInfoScheduler";
        builder.setMinimumLatency(cVar.b(d10, U, i11));
        Set<c.b> c10 = cVar.c().get(d10).c();
        if (c10.contains(c.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c10.contains(c.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c10.contains(c.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", iVar.b());
        persistableBundle.putInt("priority", a.a(iVar.d()));
        if (iVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(iVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        e.d(str, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", iVar2, Integer.valueOf(value), Long.valueOf(this.f24921c.b(iVar.d(), U, i11)), Long.valueOf(U), Integer.valueOf(i10));
        jobScheduler.schedule(builder.build());
    }
}
