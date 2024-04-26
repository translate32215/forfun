package k8;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class o0 extends u0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Bundle> f20385a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f20386b;

    public static final <T> T E1(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e10);
            throw e10;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle Y(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f20385a
            monitor-enter(r0)
            boolean r1 = r2.f20386b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f20385a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f20385a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.o0.Y(long):android.os.Bundle");
    }

    public final void o0(Bundle bundle) {
        synchronized (this.f20385a) {
            try {
                this.f20385a.set(bundle);
                this.f20386b = true;
                this.f20385a.notify();
            } catch (Throwable th) {
                this.f20385a.notify();
                throw th;
            }
        }
    }

    public final String z0(long j10) {
        return (String) E1(Y(j10), String.class);
    }
}
