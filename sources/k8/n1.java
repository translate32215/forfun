package k8;

import android.os.RemoteException;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.2 */
public abstract class n1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f20370a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public final long f20371b = SystemClock.elapsedRealtime();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20372c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s1 f20373d;

    public n1(s1 s1Var, boolean z10) {
        this.f20373d = s1Var;
        s1Var.getClass();
        this.f20372c = z10;
    }

    public abstract void a() throws RemoteException;

    public void b() {
    }

    public final void run() {
        if (this.f20373d.f20458d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f20373d.a(e10, false, this.f20372c);
            b();
        }
    }
}
