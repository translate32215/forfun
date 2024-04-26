package o8;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import k8.a1;
import o8.i5;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class j5<T extends Context & i5> {

    /* renamed from: a  reason: collision with root package name */
    public final T f23297a;

    public j5(T t10) {
        this.f23297a = t10;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f8797f.a("onRebind called with null intent");
            return;
        }
        c().f8805n.b("onRebind called. action", intent.getAction());
    }

    public final boolean b(Intent intent) {
        if (intent == null) {
            c().f8797f.a("onUnbind called with null intent");
            return true;
        }
        c().f8805n.b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final h c() {
        return l.u(this.f23297a, (a1) null, (Long) null).d();
    }
}
