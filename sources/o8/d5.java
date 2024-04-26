package o8;

import android.os.RemoteException;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.p;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class d5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23166a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b6 f23167b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f23168c;

    public d5(p pVar, b6 b6Var, int i10) {
        this.f23166a = i10;
        if (i10 != 1) {
            this.f23168c = pVar;
            this.f23167b = b6Var;
            return;
        }
        this.f23168c = pVar;
        this.f23167b = b6Var;
    }

    public final void run() {
        switch (this.f23166a) {
            case 0:
                p pVar = this.f23168c;
                d dVar = pVar.f8867d;
                if (dVar == null) {
                    pVar.f8864a.d().f8797f.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    i.h(this.f23167b);
                    dVar.e4(this.f23167b);
                    this.f23168c.f8864a.r().n();
                    this.f23168c.l(dVar, (a) null, this.f23167b);
                    this.f23168c.s();
                    return;
                } catch (RemoteException e10) {
                    this.f23168c.f8864a.d().f8797f.b("Failed to send app launch to the service", e10);
                    return;
                }
            default:
                p pVar2 = this.f23168c;
                d dVar2 = pVar2.f8867d;
                if (dVar2 == null) {
                    pVar2.f8864a.d().f8797f.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    i.h(this.f23167b);
                    dVar2.D3(this.f23167b);
                    this.f23168c.s();
                    return;
                } catch (RemoteException e11) {
                    this.f23168c.f8864a.d().f8797f.b("Failed to send consent settings to the service", e11);
                    return;
                }
        }
    }
}
