package o8;

import com.google.android.gms.measurement.internal.p;
import java.util.concurrent.atomic.AtomicReference;
import k8.v0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class a5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23100a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23102c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b6 f23103d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f23104e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f23105f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p f23106g;

    public a5(p pVar, String str, String str2, b6 b6Var, boolean z10, v0 v0Var) {
        this.f23106g = pVar;
        this.f23101b = str;
        this.f23102c = str2;
        this.f23103d = b6Var;
        this.f23104e = z10;
        this.f23105f = v0Var;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f23100a
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00c8
        L_0x0007:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.p r1 = r8.f23106g     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            com.google.android.gms.measurement.internal.d r2 = r1.f8867d     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            com.google.android.gms.measurement.internal.h r1 = r1.d()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            o8.a3 r1 = r1.f8797f     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            java.lang.String r2 = "Failed to get user properties; not connected to service"
            java.lang.String r3 = r8.f23101b     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            java.lang.String r4 = r8.f23102c     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            r1.c(r2, r3, r4)     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            com.google.android.gms.measurement.internal.p r1 = r8.f23106g
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            java.lang.Object r2 = r8.f23105f
            k8.v0 r2 = (k8.v0) r2
            r1.D(r2, r0)
            goto L_0x00b4
        L_0x0034:
            o8.b6 r1 = r8.f23103d     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            com.google.android.gms.common.internal.i.h(r1)     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            java.lang.String r1 = r8.f23101b     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            java.lang.String r3 = r8.f23102c     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            boolean r4 = r8.f23104e     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            o8.b6 r5 = r8.f23103d     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            java.util.List r1 = r2.R0(r1, r3, r4, r5)     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            r2.<init>()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            if (r1 != 0) goto L_0x004d
            goto L_0x0083
        L_0x004d:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
        L_0x0051:
            boolean r3 = r1.hasNext()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            if (r3 == 0) goto L_0x0083
            java.lang.Object r3 = r1.next()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            o8.w5 r3 = (o8.w5) r3     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            java.lang.String r4 = r3.f23565e     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            if (r4 == 0) goto L_0x0067
            java.lang.String r3 = r3.f23562b     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            r2.putString(r3, r4)     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            goto L_0x0051
        L_0x0067:
            java.lang.Long r4 = r3.f23564d     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            if (r4 == 0) goto L_0x0075
            java.lang.String r3 = r3.f23562b     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            long r4 = r4.longValue()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            r2.putLong(r3, r4)     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            goto L_0x0051
        L_0x0075:
            java.lang.Double r4 = r3.f23567g     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            if (r4 == 0) goto L_0x0051
            java.lang.String r3 = r3.f23562b     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            double r4 = r4.doubleValue()     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            r2.putDouble(r3, r4)     // Catch:{ RemoteException -> 0x0091, all -> 0x008f }
            goto L_0x0051
        L_0x0083:
            com.google.android.gms.measurement.internal.p r0 = r8.f23106g     // Catch:{ RemoteException -> 0x008d }
            r0.s()     // Catch:{ RemoteException -> 0x008d }
            com.google.android.gms.measurement.internal.p r0 = r8.f23106g
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            goto L_0x00a9
        L_0x008d:
            r0 = move-exception
            goto L_0x0094
        L_0x008f:
            r1 = move-exception
            goto L_0x00b8
        L_0x0091:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0094:
            com.google.android.gms.measurement.internal.p r1 = r8.f23106g     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.h r1 = r1.d()     // Catch:{ all -> 0x00b5 }
            o8.a3 r1 = r1.f8797f     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "Failed to get user properties; remote exception"
            java.lang.String r4 = r8.f23101b     // Catch:{ all -> 0x00b5 }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.p r0 = r8.f23106g
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
        L_0x00a9:
            com.google.android.gms.measurement.internal.r r0 = r0.A()
            java.lang.Object r1 = r8.f23105f
            k8.v0 r1 = (k8.v0) r1
            r0.D(r1, r2)
        L_0x00b4:
            return
        L_0x00b5:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x00b8:
            com.google.android.gms.measurement.internal.p r2 = r8.f23106g
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.r r2 = r2.A()
            java.lang.Object r3 = r8.f23105f
            k8.v0 r3 = (k8.v0) r3
            r2.D(r3, r0)
            throw r1
        L_0x00c8:
            java.lang.Object r0 = r8.f23105f
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.p r2 = r8.f23106g     // Catch:{ RemoteException -> 0x0135 }
            com.google.android.gms.measurement.internal.d r3 = r2.f8867d     // Catch:{ RemoteException -> 0x0135 }
            if (r3 != 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ RemoteException -> 0x0135 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ RemoteException -> 0x0135 }
            o8.a3 r2 = r2.f8797f     // Catch:{ RemoteException -> 0x0135 }
            java.lang.String r3 = "(legacy) Failed to get user properties; not connected to service"
            java.lang.String r4 = r8.f23101b     // Catch:{ RemoteException -> 0x0135 }
            java.lang.String r5 = r8.f23102c     // Catch:{ RemoteException -> 0x0135 }
            r2.d(r3, r1, r4, r5)     // Catch:{ RemoteException -> 0x0135 }
            java.lang.Object r2 = r8.f23105f     // Catch:{ RemoteException -> 0x0135 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0135 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ RemoteException -> 0x0135 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0135 }
            java.lang.Object r1 = r8.f23105f     // Catch:{ all -> 0x0163 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0163 }
            r1.notify()     // Catch:{ all -> 0x0163 }
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            goto L_0x015a
        L_0x00f9:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RemoteException -> 0x0135 }
            if (r2 == 0) goto L_0x0118
            o8.b6 r2 = r8.f23103d     // Catch:{ RemoteException -> 0x0135 }
            com.google.android.gms.common.internal.i.h(r2)     // Catch:{ RemoteException -> 0x0135 }
            java.lang.Object r2 = r8.f23105f     // Catch:{ RemoteException -> 0x0135 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0135 }
            java.lang.String r4 = r8.f23101b     // Catch:{ RemoteException -> 0x0135 }
            java.lang.String r5 = r8.f23102c     // Catch:{ RemoteException -> 0x0135 }
            boolean r6 = r8.f23104e     // Catch:{ RemoteException -> 0x0135 }
            o8.b6 r7 = r8.f23103d     // Catch:{ RemoteException -> 0x0135 }
            java.util.List r3 = r3.R0(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0135 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0135 }
            goto L_0x0129
        L_0x0118:
            java.lang.Object r2 = r8.f23105f     // Catch:{ RemoteException -> 0x0135 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0135 }
            java.lang.String r4 = r8.f23101b     // Catch:{ RemoteException -> 0x0135 }
            java.lang.String r5 = r8.f23102c     // Catch:{ RemoteException -> 0x0135 }
            boolean r6 = r8.f23104e     // Catch:{ RemoteException -> 0x0135 }
            java.util.List r3 = r3.S1(r1, r4, r5, r6)     // Catch:{ RemoteException -> 0x0135 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0135 }
        L_0x0129:
            com.google.android.gms.measurement.internal.p r2 = r8.f23106g     // Catch:{ RemoteException -> 0x0135 }
            r2.s()     // Catch:{ RemoteException -> 0x0135 }
            java.lang.Object r1 = r8.f23105f     // Catch:{ all -> 0x0163 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0163 }
            goto L_0x0156
        L_0x0133:
            r1 = move-exception
            goto L_0x015b
        L_0x0135:
            r2 = move-exception
            com.google.android.gms.measurement.internal.p r3 = r8.f23106g     // Catch:{ all -> 0x0133 }
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a     // Catch:{ all -> 0x0133 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x0133 }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x0133 }
            java.lang.String r4 = "(legacy) Failed to get user properties; remote exception"
            java.lang.String r5 = r8.f23101b     // Catch:{ all -> 0x0133 }
            r3.d(r4, r1, r5, r2)     // Catch:{ all -> 0x0133 }
            java.lang.Object r1 = r8.f23105f     // Catch:{ all -> 0x0133 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0133 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0133 }
            r1.set(r2)     // Catch:{ all -> 0x0133 }
            java.lang.Object r1 = r8.f23105f     // Catch:{ all -> 0x0163 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0163 }
        L_0x0156:
            r1.notify()     // Catch:{ all -> 0x0163 }
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
        L_0x015a:
            return
        L_0x015b:
            java.lang.Object r2 = r8.f23105f     // Catch:{ all -> 0x0163 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x0163 }
            r2.notify()     // Catch:{ all -> 0x0163 }
            throw r1     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            goto L_0x0167
        L_0x0166:
            throw r1
        L_0x0167:
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.a5.run():void");
    }

    public a5(p pVar, AtomicReference atomicReference, String str, String str2, b6 b6Var, boolean z10) {
        this.f23106g = pVar;
        this.f23105f = atomicReference;
        this.f23101b = str;
        this.f23102c = str2;
        this.f23103d = b6Var;
        this.f23104e = z10;
    }
}
