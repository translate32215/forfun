package o8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.p;
import e8.qz;
import e8.s30;
import r7.m;
import s7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class g5 implements ServiceConnection, b.a, b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f23221a;

    /* renamed from: b  reason: collision with root package name */
    public volatile y2 f23222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f23223c;

    public g5(p pVar) {
        this.f23223c = pVar;
    }

    public final void Y(int i10) {
        i.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f23223c.f8864a.d().f8804m.a("Service connection suspended");
        this.f23223c.f8864a.b().r(new s30(this));
    }

    public final void m(a aVar) {
        i.d("MeasurementServiceConnection.onConnectionFailed");
        l lVar = this.f23223c.f8864a;
        h hVar = lVar.f8845i;
        h hVar2 = (hVar == null || !hVar.n()) ? null : lVar.f8845i;
        if (hVar2 != null) {
            hVar2.f8800i.b("Service connection failed", aVar);
        }
        synchronized (this) {
            this.f23221a = false;
            this.f23222b = null;
        }
        this.f23223c.f8864a.b().r(new qz(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f23223c.f8864a.d().f8797f.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.i.d(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f23221a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.p r4 = r3.f23223c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ all -> 0x001c }
            o8.a3 r4 = r4.f8797f     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0095
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.d     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            com.google.android.gms.measurement.internal.d r1 = (com.google.android.gms.measurement.internal.d) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            com.google.android.gms.measurement.internal.b r1 = new com.google.android.gms.measurement.internal.b     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            com.google.android.gms.measurement.internal.p r5 = r3.f23223c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ RemoteException -> 0x0060 }
            o8.a3 r5 = r5.f8805n     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            com.google.android.gms.measurement.internal.p r5 = r3.f23223c     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ RemoteException -> 0x0060 }
            o8.a3 r5 = r5.f8797f     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            com.google.android.gms.measurement.internal.p r5 = r3.f23223c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x001c }
            o8.a3 r5 = r5.f8797f     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0083
            r3.f23221a = r4     // Catch:{ all -> 0x001c }
            y7.a r4 = y7.a.b()     // Catch:{ IllegalArgumentException -> 0x0093 }
            com.google.android.gms.measurement.internal.p r5 = r3.f23223c     // Catch:{ IllegalArgumentException -> 0x0093 }
            com.google.android.gms.measurement.internal.l r0 = r5.f8864a     // Catch:{ IllegalArgumentException -> 0x0093 }
            android.content.Context r0 = r0.f8837a     // Catch:{ IllegalArgumentException -> 0x0093 }
            o8.g5 r5 = r5.f8866c     // Catch:{ IllegalArgumentException -> 0x0093 }
            r4.c(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0093 }
            goto L_0x0093
        L_0x0083:
            com.google.android.gms.measurement.internal.p r4 = r3.f23223c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.k r4 = r4.b()     // Catch:{ all -> 0x001c }
            f7.j0 r5 = new f7.j0     // Catch:{ all -> 0x001c }
            r5.<init>((o8.g5) r3, (com.google.android.gms.measurement.internal.d) r0)     // Catch:{ all -> 0x001c }
            r4.r(r5)     // Catch:{ all -> 0x001c }
        L_0x0093:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0095:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            goto L_0x0098
        L_0x0097:
            throw r4
        L_0x0098:
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.g5.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        i.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f23223c.f8864a.d().f8804m.a("Service disconnected");
        this.f23223c.f8864a.b().r(new e7.i(this, componentName));
    }

    public final void z0(Bundle bundle) {
        i.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                i.h(this.f23222b);
                this.f23223c.f8864a.b().r(new m(this, (d) this.f23222b.v()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f23222b = null;
                this.f23221a = false;
            }
        }
    }
}
