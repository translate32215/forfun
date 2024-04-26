package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import e8.ah0;
import e8.d40;
import e8.qz;
import e8.yg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ru implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Activity f8070a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8071b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8072c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8073d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8074e = false;
    @GuardedBy("lock")

    /* renamed from: f  reason: collision with root package name */
    public final List<yg0> f8075f = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: g  reason: collision with root package name */
    public final List<ah0> f8076g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public Runnable f8077h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8078i = false;

    /* renamed from: r  reason: collision with root package name */
    public long f8079r;

    public final void a(Activity activity) {
        synchronized (this.f8072c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f8070a = activity;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f8072c) {
            Activity activity2 = this.f8070a;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f8070a = null;
                }
                Iterator<ah0> it = this.f8076g.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        y6 y6Var = l.B.f13190g;
                        a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        e.C("", e10);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f8072c) {
            for (ah0 onActivityPaused : this.f8076g) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e10) {
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    e.C("", e10);
                }
            }
        }
        this.f8074e = true;
        Runnable runnable = this.f8077h;
        if (runnable != null) {
            p.f5702i.removeCallbacks(runnable);
        }
        d40 d40 = p.f5702i;
        qz qzVar = new qz(this);
        this.f8077h = qzVar;
        d40.postDelayed(qzVar, this.f8079r);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f8074e = false;
        boolean z10 = !this.f8073d;
        this.f8073d = true;
        Runnable runnable = this.f8077h;
        if (runnable != null) {
            p.f5702i.removeCallbacks(runnable);
        }
        synchronized (this.f8072c) {
            for (ah0 onActivityResumed : this.f8076g) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e10) {
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    e.C("", e10);
                }
            }
            if (z10) {
                for (yg0 a10 : this.f8075f) {
                    try {
                        a10.a(true);
                    } catch (Exception e11) {
                        e.C("", e11);
                    }
                }
            } else {
                e.E("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
