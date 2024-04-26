package c0;

import android.app.Application;
import c0.e;

/* compiled from: ActivityRecreator */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f3932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f3933b;

    public c(Application application, e.a aVar) {
        this.f3932a = application;
        this.f3933b = aVar;
    }

    public void run() {
        this.f3932a.unregisterActivityLifecycleCallbacks(this.f3933b);
    }
}
