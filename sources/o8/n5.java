package o8;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import k8.z9;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class n5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o5 f23369a;

    public n5(o5 o5Var) {
        this.f23369a = o5Var;
    }

    public final void a() {
        this.f23369a.h();
        if (this.f23369a.f8864a.t().t(this.f23369a.f8864a.f8850n.b())) {
            this.f23369a.f8864a.t().f8816k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f23369a.f8864a.d().f8805n.a("Detected application was in foreground");
                c(this.f23369a.f8864a.f8850n.b(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        this.f23369a.h();
        this.f23369a.l();
        if (this.f23369a.f8864a.t().t(j10)) {
            this.f23369a.f8864a.t().f8816k.a(true);
        }
        this.f23369a.f8864a.t().f8819n.b(j10);
        if (this.f23369a.f8864a.t().f8816k.b()) {
            c(j10, z10);
        }
    }

    public final void c(long j10, boolean z10) {
        this.f23369a.h();
        if (this.f23369a.f8864a.g()) {
            this.f23369a.f8864a.t().f8819n.b(j10);
            this.f23369a.f8864a.d().f8805n.b("Session started, time", Long.valueOf(this.f23369a.f8864a.f8850n.a()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f23369a.f8864a.v().B("auto", "_sid", valueOf, j10);
            this.f23369a.f8864a.t().f8816k.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f23369a.f8864a.f8843g.v((String) null, v2.f23508e0) && z10) {
                bundle.putLong("_aib", 1);
            }
            this.f23369a.f8864a.v().p("auto", "_s", j10, bundle);
            z9.b();
            if (this.f23369a.f8864a.f8843g.v((String) null, v2.f23516i0)) {
                String a10 = this.f23369a.f8864a.t().f8824s.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    this.f23369a.f8864a.v().p("auto", "_ssr", j10, bundle2);
                }
            }
        }
    }
}
