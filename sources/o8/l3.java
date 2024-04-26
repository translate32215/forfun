package o8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import f7.f0;
import k8.i0;
import k8.j0;
import k8.k0;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class l3 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f23321a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m3 f23322b;

    public l3(m3 m3Var, String str) {
        this.f23322b = m3Var;
        this.f23321a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k0 k0Var;
        if (iBinder != null) {
            try {
                int i10 = j0.f20271a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof k0) {
                    k0Var = (k0) queryLocalInterface;
                } else {
                    k0Var = new i0(iBinder);
                }
                if (k0Var == null) {
                    this.f23322b.f23338a.d().f8800i.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f23322b.f23338a.d().f8805n.a("Install Referrer Service connected");
                this.f23322b.f23338a.b().r(new f0(this, k0Var, (ServiceConnection) this));
            } catch (RuntimeException e10) {
                this.f23322b.f23338a.d().f8800i.b("Exception occurred while calling Install Referrer API", e10);
            }
        } else {
            this.f23322b.f23338a.d().f8800i.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f23322b.f23338a.d().f8805n.a("Install Referrer Service disconnected");
    }
}
