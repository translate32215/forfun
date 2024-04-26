package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.o;

/* compiled from: LifecycleService */
public class w extends Service implements t {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f2736a = new o0(this);

    public o c() {
        return this.f2736a.f2696a;
    }

    public IBinder onBind(Intent intent) {
        this.f2736a.a(o.b.ON_START);
        return null;
    }

    public void onCreate() {
        this.f2736a.a(o.b.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        o0 o0Var = this.f2736a;
        o0Var.a(o.b.ON_STOP);
        o0Var.a(o.b.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i10) {
        this.f2736a.a(o.b.ON_START);
        super.onStart(intent, i10);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
