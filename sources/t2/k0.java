package t2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.adcolony.sdk.a;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.o;
import com.adcolony.sdk.u;
import com.adcolony.sdk.y;
import com.adcolony.sdk.z;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class k0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Integer> f25498a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f25499b;

    public k0(o oVar) {
        this.f25499b = oVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        y yVar = this.f25499b.f4659c;
        if (!yVar.f4823u) {
            yVar.c(true);
        }
        f.f4478a = activity;
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        f.f4481d = false;
        y yVar = this.f25499b.f4659c;
        yVar.f4818h = false;
        yVar.f4819i = true;
    }

    public void onActivityResumed(Activity activity) {
        ScheduledExecutorService scheduledExecutorService;
        this.f25498a.add(Integer.valueOf(activity.hashCode()));
        f.f4481d = true;
        f.f4478a = activity;
        u uVar = this.f25499b.l().f25518d;
        Context context = f.f4478a;
        if (context == null || !this.f25499b.f4659c.f4818h || !(context instanceof l) || ((l) context).f25504d) {
            f.f4478a = activity;
            g gVar = this.f25499b.f4673q;
            if (gVar != null) {
                gVar.a(gVar.f4485b).b();
                this.f25499b.f4673q = null;
            }
            o oVar = this.f25499b;
            oVar.A = false;
            y yVar = oVar.f4659c;
            yVar.f4818h = true;
            yVar.f4819i = true;
            yVar.f4826x = false;
            if (oVar.D && !yVar.f4823u) {
                yVar.c(true);
            }
            z zVar = this.f25499b.f4661e;
            g gVar2 = zVar.f4827a;
            if (gVar2 != null) {
                zVar.a(gVar2);
                zVar.f4827a = null;
            }
            if (uVar == null || (scheduledExecutorService = uVar.f4786b) == null || scheduledExecutorService.isShutdown() || uVar.f4786b.isTerminated()) {
                a.a(activity, f.d().f4672p);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        this.f25499b.f4659c.d(true);
    }

    public void onActivityStopped(Activity activity) {
        this.f25498a.remove(Integer.valueOf(activity.hashCode()));
        if (this.f25498a.isEmpty()) {
            this.f25499b.f4659c.d(false);
        }
    }
}
