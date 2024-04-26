package o8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.l;
import e8.ey;
import e8.qz;
import e8.s30;
import r7.h;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class r4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s4 f23421a;

    public /* synthetic */ r4(s4 s4Var) {
        this.f23421a = s4Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l lVar;
        try {
            this.f23421a.f8864a.d().f8805n.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                lVar = this.f23421a.f8864a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f23421a.f8864a.A();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z10 = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z10 = false;
                        }
                        this.f23421a.f8864a.b().r(new h(this, z10, data, str, queryParameter));
                        lVar = this.f23421a.f8864a;
                    }
                }
                lVar = this.f23421a.f8864a;
            }
        } catch (RuntimeException e10) {
            this.f23421a.f8864a.d().f8797f.b("Throwable caught in onActivityCreated", e10);
            lVar = this.f23421a.f8864a;
        } catch (Throwable th) {
            this.f23421a.f8864a.x().q(activity, bundle);
            throw th;
        }
        lVar.x().q(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        z4 x10 = this.f23421a.f8864a.x();
        synchronized (x10.f23649l) {
            if (activity == x10.f23644g) {
                x10.f23644g = null;
            }
        }
        if (x10.f8864a.f8843g.w()) {
            x10.f23643f.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        z4 x10 = this.f23421a.f8864a.x();
        synchronized (x10.f23649l) {
            x10.f23648k = false;
            x10.f23645h = true;
        }
        long a10 = x10.f8864a.f8850n.a();
        if (!x10.f8864a.f8843g.w()) {
            x10.f23640c = null;
            x10.f8864a.b().r(new ey(x10, a10));
        } else {
            x4 s10 = x10.s(activity);
            x10.f23641d = x10.f23640c;
            x10.f23640c = null;
            x10.f8864a.b().r(new k4(x10, s10, a10));
        }
        o5 z10 = this.f23421a.f8864a.z();
        z10.f8864a.b().r(new k5(z10, z10.f8864a.f8850n.a(), 1));
    }

    public final void onActivityResumed(Activity activity) {
        o5 z10 = this.f23421a.f8864a.z();
        z10.f8864a.b().r(new k5(z10, z10.f8864a.f8850n.a(), 0));
        z4 x10 = this.f23421a.f8864a.x();
        synchronized (x10.f23649l) {
            x10.f23648k = true;
            if (activity != x10.f23644g) {
                synchronized (x10.f23649l) {
                    x10.f23644g = activity;
                    x10.f23645h = false;
                }
                if (x10.f8864a.f8843g.w()) {
                    x10.f23646i = null;
                    x10.f8864a.b().r(new qz(x10));
                }
            }
        }
        if (!x10.f8864a.f8843g.w()) {
            x10.f23640c = x10.f23646i;
            x10.f8864a.b().r(new s30(x10));
            return;
        }
        x10.l(activity, x10.s(activity), false);
        y1 n10 = x10.f8864a.n();
        n10.f8864a.b().r(new ey(n10, n10.f8864a.f8850n.a()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        x4 x4Var;
        z4 x10 = this.f23421a.f8864a.x();
        if (x10.f8864a.f8843g.w() && bundle != null && (x4Var = x10.f23643f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", x4Var.f23603c);
            bundle2.putString("name", x4Var.f23601a);
            bundle2.putString("referrer_name", x4Var.f23602b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
