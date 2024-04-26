package o8;

import android.os.RemoteException;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class c5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b6 f23154b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f23155c;

    public c5(p pVar, b6 b6Var, int i10) {
        this.f23153a = i10;
        if (i10 != 1) {
            this.f23155c = pVar;
            this.f23154b = b6Var;
            return;
        }
        this.f23155c = pVar;
        this.f23154b = b6Var;
    }

    public final void run() {
        switch (this.f23153a) {
            case 0:
                p pVar = this.f23155c;
                d dVar = pVar.f8867d;
                if (dVar == null) {
                    pVar.f8864a.d().f8797f.a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    i.h(this.f23154b);
                    dVar.w1(this.f23154b);
                } catch (RemoteException e10) {
                    this.f23155c.f8864a.d().f8797f.b("Failed to reset data on the service: remote exception", e10);
                }
                this.f23155c.s();
                return;
            default:
                p pVar2 = this.f23155c;
                d dVar2 = pVar2.f8867d;
                if (dVar2 == null) {
                    pVar2.f8864a.d().f8797f.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    i.h(this.f23154b);
                    dVar2.T3(this.f23154b);
                    this.f23155c.s();
                    return;
                } catch (RemoteException e11) {
                    this.f23155c.f8864a.d().f8797f.b("Failed to send measurementEnabled to the service", e11);
                    return;
                }
        }
    }
}
