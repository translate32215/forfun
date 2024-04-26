package f7;

import ab.f;
import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.p;
import e8.c9;
import e8.cu;
import e8.r4;
import e8.t00;
import e8.t9;
import java.util.concurrent.atomic.AtomicReference;
import k8.k0;
import k8.v0;
import o8.b;
import o8.b4;
import o8.b6;
import o8.j5;
import o8.l3;
import o8.r;
import o8.w5;
import s8.j;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18265a = 21;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18266b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18267c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f18268d;

    public f0(f fVar, Intent intent, j jVar) {
        this.f18266b = fVar;
        this.f18267c = intent;
        this.f18268d = jVar;
    }

    private final void a() {
        AtomicReference atomicReference;
        synchronized (((AtomicReference) this.f18266b)) {
            try {
                if (!((p) this.f18268d).f8864a.t().p().g()) {
                    ((p) this.f18268d).f8864a.d().f8802k.a("Analytics storage consent denied; will not get app instance id");
                    ((p) this.f18268d).f8864a.v().f23432g.set((Object) null);
                    ((p) this.f18268d).f8864a.t().f8811f.b((String) null);
                    ((AtomicReference) this.f18266b).set((Object) null);
                    ((AtomicReference) this.f18266b).notify();
                    return;
                }
                Object obj = this.f18268d;
                d dVar = ((p) obj).f8867d;
                if (dVar == null) {
                    ((p) obj).f8864a.d().f8797f.a("Failed to get app instance id");
                    ((AtomicReference) this.f18266b).notify();
                    return;
                }
                i.h((b6) this.f18267c);
                ((AtomicReference) this.f18266b).set(dVar.D0((b6) this.f18267c));
                String str = (String) ((AtomicReference) this.f18266b).get();
                if (str != null) {
                    ((p) this.f18268d).f8864a.v().f23432g.set(str);
                    ((p) this.f18268d).f8864a.t().f8811f.b(str);
                }
                ((p) this.f18268d).s();
                atomicReference = (AtomicReference) this.f18266b;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    ((p) this.f18268d).f8864a.d().f8797f.b("Failed to get app instance id", e10);
                    atomicReference = (AtomicReference) this.f18266b;
                } catch (Throwable th) {
                    ((AtomicReference) this.f18266b).notify();
                    throw th;
                }
            }
        }
    }

    private final void b() {
        l lVar;
        String str = null;
        try {
            if (!((p) this.f18268d).f8864a.t().p().g()) {
                ((p) this.f18268d).f8864a.d().f8802k.a("Analytics storage consent denied; will not get app instance id");
                ((p) this.f18268d).f8864a.v().f23432g.set((Object) null);
                ((p) this.f18268d).f8864a.t().f8811f.b((String) null);
                lVar = ((p) this.f18268d).f8864a;
            } else {
                Object obj = this.f18268d;
                d dVar = ((p) obj).f8867d;
                if (dVar == null) {
                    ((p) obj).f8864a.d().f8797f.a("Failed to get app instance id");
                    lVar = ((p) this.f18268d).f8864a;
                } else {
                    i.h((b6) this.f18266b);
                    str = dVar.D0((b6) this.f18266b);
                    if (str != null) {
                        ((p) this.f18268d).f8864a.v().f23432g.set(str);
                        ((p) this.f18268d).f8864a.t().f8811f.b(str);
                    }
                    ((p) this.f18268d).s();
                    lVar = ((p) this.f18268d).f8864a;
                }
            }
        } catch (RemoteException e10) {
            ((p) this.f18268d).f8864a.d().f8797f.b("Failed to get app instance id", e10);
            lVar = ((p) this.f18268d).f8864a;
        } catch (Throwable th) {
            ((p) this.f18268d).f8864a.A().H((v0) this.f18267c, (String) null);
            throw th;
        }
        lVar.A().H((v0) this.f18267c, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: k8.p0} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r6v11, types: [java.util.Set<cb.e>, e8.f3, e8.o4] */
    /* JADX WARNING: type inference failed for: r2v32, types: [com.google.android.gms.internal.ads.z7] */
    /* JADX WARNING: type inference failed for: r2v102 */
    /* JADX WARNING: type inference failed for: r2v103 */
    /* JADX WARNING: type inference failed for: r2v104 */
    /* JADX WARNING: type inference failed for: r2v105 */
    /* JADX WARNING: type inference failed for: r2v106 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f18265a
            r2 = 0
            r3 = 0
            r4 = -1
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 5
            r10 = 1
            switch(r0) {
                case 0: goto L_0x077c;
                case 1: goto L_0x0724;
                case 2: goto L_0x06cc;
                case 3: goto L_0x060e;
                case 4: goto L_0x0575;
                case 5: goto L_0x054f;
                case 6: goto L_0x0539;
                case 7: goto L_0x050e;
                case 8: goto L_0x04e1;
                case 9: goto L_0x04c6;
                case 10: goto L_0x0471;
                case 11: goto L_0x041b;
                case 12: goto L_0x02d6;
                case 13: goto L_0x029d;
                case 14: goto L_0x00c4;
                case 15: goto L_0x00a9;
                case 16: goto L_0x0072;
                case 17: goto L_0x006e;
                case 18: goto L_0x006a;
                case 19: goto L_0x0030;
                case 20: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x087f
        L_0x0012:
            java.lang.Object r0 = r1.f18266b
            o8.j5 r0 = (o8.j5) r0
            java.lang.Object r2 = r1.f18267c
            com.google.android.gms.measurement.internal.h r2 = (com.google.android.gms.measurement.internal.h) r2
            java.lang.Object r4 = r1.f18268d
            android.app.job.JobParameters r4 = (android.app.job.JobParameters) r4
            r0.getClass()
            o8.a3 r2 = r2.f8805n
            java.lang.String r5 = "AppMeasurementJobService processed last upload request."
            r2.a(r5)
            T r0 = r0.f23297a
            o8.i5 r0 = (o8.i5) r0
            r0.c(r4, r3)
            return
        L_0x0030:
            java.lang.Object r0 = r1.f18268d
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            com.google.android.gms.measurement.internal.d r2 = r0.f8867d
            java.lang.String r3 = "Failed to send default event parameters to service"
            if (r2 != 0) goto L_0x0046
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            r0.a(r3)
            goto L_0x0069
        L_0x0046:
            java.lang.Object r0 = r1.f18266b     // Catch:{ RemoteException -> 0x0059 }
            o8.b6 r0 = (o8.b6) r0     // Catch:{ RemoteException -> 0x0059 }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ RemoteException -> 0x0059 }
            java.lang.Object r0 = r1.f18267c     // Catch:{ RemoteException -> 0x0059 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ RemoteException -> 0x0059 }
            java.lang.Object r4 = r1.f18266b     // Catch:{ RemoteException -> 0x0059 }
            o8.b6 r4 = (o8.b6) r4     // Catch:{ RemoteException -> 0x0059 }
            r2.A5(r0, r4)     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x0069
        L_0x0059:
            r0 = move-exception
            java.lang.Object r2 = r1.f18268d
            com.google.android.gms.measurement.internal.p r2 = (com.google.android.gms.measurement.internal.p) r2
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            r2.b(r3, r0)
        L_0x0069:
            return
        L_0x006a:
            r17.b()
            return
        L_0x006e:
            r17.a()
            return
        L_0x0072:
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            r0.a()
            java.lang.Object r0 = r1.f18266b
            o8.w5 r0 = (o8.w5) r0
            java.lang.Object r0 = r0.i()
            if (r0 != 0) goto L_0x0097
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            java.lang.Object r2 = r1.f18266b
            o8.w5 r2 = (o8.w5) r2
            java.lang.Object r3 = r1.f18267c
            o8.b6 r3 = (o8.b6) r3
            r0.o(r2, r3)
            goto L_0x00a8
        L_0x0097:
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            java.lang.Object r2 = r1.f18266b
            o8.w5 r2 = (o8.w5) r2
            java.lang.Object r3 = r1.f18267c
            o8.b6 r3 = (o8.b6) r3
            r0.s(r2, r3)
        L_0x00a8:
            return
        L_0x00a9:
            java.lang.Object r0 = r1.f18267c
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            r0.a()
            java.lang.Object r0 = r1.f18267c
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            java.lang.Object r2 = r1.f18266b
            o8.r r2 = (o8.r) r2
            java.lang.Object r3 = r1.f18268d
            java.lang.String r3 = (java.lang.String) r3
            r0.j(r2, r3)
            return
        L_0x00c4:
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            java.lang.Object r3 = r1.f18266b
            o8.r r3 = (o8.r) r3
            java.lang.Object r4 = r1.f18267c
            o8.b6 r4 = (o8.b6) r4
            r0.getClass()
            java.lang.String r4 = r3.f23414a
            java.lang.String r5 = "_cmp"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0125
            o8.p r4 = r3.f23415b
            if (r4 == 0) goto L_0x0125
            android.os.Bundle r4 = r4.f23382a
            int r4 = r4.size()
            if (r4 != 0) goto L_0x00ea
            goto L_0x0125
        L_0x00ea:
            o8.p r4 = r3.f23415b
            android.os.Bundle r4 = r4.f23382a
            java.lang.String r5 = "_cis"
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "referrer broadcast"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0104
            java.lang.String r5 = "referrer API"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0125
        L_0x0104:
            o8.u5 r0 = r0.f23124a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8803l
            java.lang.String r4 = r3.toString()
            java.lang.String r5 = "Event has been filtered "
            r0.b(r5, r4)
            o8.r r0 = new o8.r
            o8.p r13 = r3.f23415b
            java.lang.String r14 = r3.f23416c
            long r3 = r3.f23417d
            java.lang.String r12 = "_cmpx"
            r11 = r0
            r15 = r3
            r11.<init>(r12, r13, r14, r15)
            r3 = r0
        L_0x0125:
            k8.nb.b()
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            o8.f r0 = r0.K()
            o8.u2<java.lang.Boolean> r4 = o8.v2.f23536s0
            boolean r0 = r0.v(r2, r4)
            if (r0 == 0) goto L_0x028a
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            java.lang.Object r5 = r1.f18267c
            o8.b6 r5 = (o8.b6) r5
            o8.u5 r6 = r0.f23124a
            o8.q3 r6 = r6.f23470a
            o8.u5.I(r6)
            java.lang.String r7 = r5.f23131a
            boolean r6 = r6.o(r7)
            if (r6 != 0) goto L_0x015d
            o8.u5 r2 = r0.f23124a
            r2.a()
            o8.u5 r0 = r0.f23124a
            r0.i(r3, r5)
            goto L_0x029c
        L_0x015d:
            o8.u5 r6 = r0.f23124a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8805n
            java.lang.String r7 = r5.f23131a
            java.lang.String r8 = "EES config found for"
            r6.b(r8, r7)
            o8.u5 r6 = r0.f23124a
            o8.q3 r6 = r6.f23470a
            o8.u5.I(r6)
            java.lang.String r7 = r5.f23131a
            k8.nb.b()
            com.google.android.gms.measurement.internal.l r8 = r6.f8864a
            o8.f r8 = r8.f8843g
            boolean r4 = r8.v(r2, r4)
            if (r4 == 0) goto L_0x0191
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x0189
            goto L_0x0191
        L_0x0189:
            s.g<java.lang.String, k8.p0> r2 = r6.f23404i
            java.lang.Object r2 = r2.b(r7)
            k8.p0 r2 = (k8.p0) r2
        L_0x0191:
            if (r2 == 0) goto L_0x0270
            o8.u5 r4 = r0.f23124a     // Catch:{ h1 -> 0x0245 }
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g     // Catch:{ h1 -> 0x0245 }
            o8.u5.I(r4)     // Catch:{ h1 -> 0x0245 }
            o8.p r6 = r3.f23415b     // Catch:{ h1 -> 0x0245 }
            android.os.Bundle r6 = r6.i()     // Catch:{ h1 -> 0x0245 }
            java.util.Map r4 = r4.I(r6, r10)     // Catch:{ h1 -> 0x0245 }
            java.lang.String r6 = r3.f23414a     // Catch:{ h1 -> 0x0245 }
            java.lang.String[] r7 = o8.e4.f23178c     // Catch:{ h1 -> 0x0245 }
            java.lang.String[] r8 = o8.e4.f23176a     // Catch:{ h1 -> 0x0245 }
            java.lang.String r6 = x.f.g(r6, r7, r8)     // Catch:{ h1 -> 0x0245 }
            if (r6 != 0) goto L_0x01b2
            java.lang.String r6 = r3.f23414a     // Catch:{ h1 -> 0x0245 }
        L_0x01b2:
            k8.b r7 = new k8.b     // Catch:{ h1 -> 0x0245 }
            long r8 = r3.f23417d     // Catch:{ h1 -> 0x0245 }
            r7.<init>(r6, r8, r4)     // Catch:{ h1 -> 0x0245 }
            boolean r4 = r2.b(r7)     // Catch:{ h1 -> 0x0245 }
            if (r4 != 0) goto L_0x01c1
            goto L_0x0256
        L_0x01c1:
            k8.c r4 = r2.f20401c
            k8.b r6 = r4.f20086b
            k8.b r4 = r4.f20085a
            boolean r4 = r6.equals(r4)
            r4 = r4 ^ r10
            if (r4 == 0) goto L_0x01f7
            o8.u5 r4 = r0.f23124a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8805n
            java.lang.String r3 = r3.f23414a
            java.lang.String r6 = "EES edited event"
            r4.b(r6, r3)
            o8.u5 r3 = r0.f23124a
            com.google.android.gms.measurement.internal.q r3 = r3.f23476g
            o8.u5.I(r3)
            k8.c r4 = r2.f20401c
            k8.b r4 = r4.f20086b
            o8.r r3 = r3.A(r4)
            o8.u5 r4 = r0.f23124a
            r4.a()
            o8.u5 r4 = r0.f23124a
            r4.i(r3, r5)
            goto L_0x0201
        L_0x01f7:
            o8.u5 r4 = r0.f23124a
            r4.a()
            o8.u5 r4 = r0.f23124a
            r4.i(r3, r5)
        L_0x0201:
            k8.c r3 = r2.f20401c
            java.util.List<k8.b> r3 = r3.f20087c
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x029c
            k8.c r2 = r2.f20401c
            java.util.List<k8.b> r2 = r2.f20087c
            java.util.Iterator r2 = r2.iterator()
        L_0x0214:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x029c
            java.lang.Object r3 = r2.next()
            k8.b r3 = (k8.b) r3
            o8.u5 r4 = r0.f23124a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8805n
            java.lang.String r6 = r3.f20074a
            java.lang.String r7 = "EES logging created event"
            r4.b(r7, r6)
            o8.u5 r4 = r0.f23124a
            com.google.android.gms.measurement.internal.q r4 = r4.f23476g
            o8.u5.I(r4)
            o8.r r3 = r4.A(r3)
            o8.u5 r4 = r0.f23124a
            r4.a()
            o8.u5 r4 = r0.f23124a
            r4.i(r3, r5)
            goto L_0x0214
        L_0x0245:
            o8.u5 r2 = r0.f23124a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = r5.f23132b
            java.lang.String r6 = r3.f23414a
            java.lang.String r7 = "EES error. appId, eventName"
            r2.c(r7, r4, r6)
        L_0x0256:
            o8.u5 r2 = r0.f23124a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8805n
            java.lang.String r4 = r3.f23414a
            java.lang.String r6 = "EES was not applied to event"
            r2.b(r6, r4)
            o8.u5 r2 = r0.f23124a
            r2.a()
            o8.u5 r0 = r0.f23124a
            r0.i(r3, r5)
            goto L_0x029c
        L_0x0270:
            o8.u5 r2 = r0.f23124a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8805n
            java.lang.String r4 = r5.f23131a
            java.lang.String r6 = "EES not loaded for"
            r2.b(r6, r4)
            o8.u5 r2 = r0.f23124a
            r2.a()
            o8.u5 r0 = r0.f23124a
            r0.i(r3, r5)
            goto L_0x029c
        L_0x028a:
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            java.lang.Object r2 = r1.f18267c
            o8.b6 r2 = (o8.b6) r2
            o8.u5 r4 = r0.f23124a
            r4.a()
            o8.u5 r0 = r0.f23124a
            r0.i(r3, r2)
        L_0x029c:
            return
        L_0x029d:
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            r0.a()
            java.lang.Object r0 = r1.f18266b
            o8.b r0 = (o8.b) r0
            o8.w5 r0 = r0.f23111c
            java.lang.Object r0 = r0.i()
            if (r0 != 0) goto L_0x02c4
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            java.lang.Object r2 = r1.f18266b
            o8.b r2 = (o8.b) r2
            java.lang.Object r3 = r1.f18267c
            o8.b6 r3 = (o8.b6) r3
            r0.n(r2, r3)
            goto L_0x02d5
        L_0x02c4:
            java.lang.Object r0 = r1.f18268d
            o8.b4 r0 = (o8.b4) r0
            o8.u5 r0 = r0.f23124a
            java.lang.Object r2 = r1.f18266b
            o8.b r2 = (o8.b) r2
            java.lang.Object r3 = r1.f18267c
            o8.b6 r3 = (o8.b6) r3
            r0.q(r2, r3)
        L_0x02d5:
            return
        L_0x02d6:
            java.lang.Object r0 = r1.f18266b
            o8.b4 r0 = (o8.b4) r0
            java.lang.Object r6 = r1.f18268d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f18267c
            android.os.Bundle r7 = (android.os.Bundle) r7
            o8.u5 r0 = r0.f23124a
            o8.j r8 = r0.f23472c
            o8.u5.I(r8)
            r8.h()
            r8.i()
            com.google.android.gms.measurement.internal.l r0 = r8.f8864a
            com.google.android.gms.common.internal.i.e(r6)
            java.lang.String r10 = "dep"
            com.google.android.gms.common.internal.i.e(r10)
            java.lang.String r10 = ""
            android.text.TextUtils.isEmpty(r10)
            r10 = 0
            if (r7 == 0) goto L_0x0363
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L_0x0363
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>(r7)
            java.util.Set r7 = r12.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0315:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x035d
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x0332
            com.google.android.gms.measurement.internal.h r13 = r0.d()
            o8.a3 r13 = r13.f8797f
            java.lang.String r14 = "Param name can't be null"
            r13.a(r14)
            r7.remove()
            goto L_0x0315
        L_0x0332:
            com.google.android.gms.measurement.internal.r r14 = r0.A()
            java.lang.Object r15 = r12.get(r13)
            java.lang.Object r14 = r14.o(r13, r15)
            if (r14 != 0) goto L_0x0355
            com.google.android.gms.measurement.internal.h r14 = r0.d()
            o8.a3 r14 = r14.f8800i
            o8.x2 r15 = r0.f8849m
            java.lang.String r13 = r15.e(r13)
            java.lang.String r15 = "Param value can't be null"
            r14.b(r15, r13)
            r7.remove()
            goto L_0x0315
        L_0x0355:
            com.google.android.gms.measurement.internal.r r15 = r0.A()
            r15.A(r12, r13, r14)
            goto L_0x0315
        L_0x035d:
            o8.p r0 = new o8.p
            r0.<init>(r12)
            goto L_0x036d
        L_0x0363:
            o8.p r0 = new o8.p
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r0.<init>(r7)
        L_0x036d:
            o8.u5 r7 = r8.f23413b
            com.google.android.gms.measurement.internal.q r7 = r7.f23476g
            o8.u5.I(r7)
            k8.x2 r12 = k8.y2.w()
            boolean r13 = r12.f20243c
            if (r13 == 0) goto L_0x0381
            r12.h()
            r12.f20243c = r3
        L_0x0381:
            MessageType r3 = r12.f20242b
            k8.y2 r3 = (k8.y2) r3
            k8.y2.I(r3, r10)
            android.os.Bundle r3 = r0.f23382a
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0392:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x03b5
            java.lang.Object r10 = r3.next()
            java.lang.String r10 = (java.lang.String) r10
            k8.b3 r11 = k8.c3.w()
            r11.o(r10)
            android.os.Bundle r13 = r0.f23382a
            java.lang.Object r10 = r13.get(r10)
            com.google.android.gms.common.internal.i.h(r10)
            r7.J(r11, r10)
            r12.p(r11)
            goto L_0x0392
        L_0x03b5:
            k8.k6 r0 = r12.f()
            k8.y2 r0 = (k8.y2) r0
            byte[] r0 = r0.i()
            com.google.android.gms.measurement.internal.l r3 = r8.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8805n
            com.google.android.gms.measurement.internal.l r7 = r8.f8864a
            o8.x2 r7 = r7.f8849m
            java.lang.String r7 = r7.d(r6)
            int r10 = r0.length
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "Saving default event parameters, appId, data size"
            r3.c(r11, r7, r10)
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r7 = "app_id"
            r3.put(r7, r6)
            java.lang.String r7 = "parameters"
            r3.put(r7, r0)
            android.database.sqlite.SQLiteDatabase r0 = r8.C()     // Catch:{ SQLiteException -> 0x0408 }
            java.lang.String r7 = "default_event_params"
            long r2 = r0.insertWithOnConflict(r7, r2, r3, r9)     // Catch:{ SQLiteException -> 0x0408 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x041a
            com.google.android.gms.measurement.internal.l r0 = r8.f8864a     // Catch:{ SQLiteException -> 0x0408 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x0408 }
            o8.a3 r0 = r0.f8797f     // Catch:{ SQLiteException -> 0x0408 }
            java.lang.String r2 = "Failed to insert default event parameters (got -1). appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ SQLiteException -> 0x0408 }
            r0.b(r2, r3)     // Catch:{ SQLiteException -> 0x0408 }
            goto L_0x041a
        L_0x0408:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r8.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r6)
            java.lang.String r4 = "Error storing default event parameters. appId"
            r2.c(r4, r3, r0)
        L_0x041a:
            return
        L_0x041b:
            java.lang.Object r0 = r1.f18268d
            o8.l3 r0 = (o8.l3) r0
            o8.m3 r3 = r0.f23322b
            java.lang.String r0 = r0.f23321a
            java.lang.Object r4 = r1.f18266b
            k8.k0 r4 = (k8.k0) r4
            java.lang.Object r5 = r1.f18267c
            android.content.ServiceConnection r5 = (android.content.ServiceConnection) r5
            com.google.android.gms.measurement.internal.l r5 = r3.f23338a
            com.google.android.gms.measurement.internal.k r5 = r5.b()
            r5.h()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "package_name"
            r5.putString(r6, r0)
            android.os.Bundle r0 = r4.o0(r5)     // Catch:{ Exception -> 0x0452 }
            if (r0 != 0) goto L_0x0464
            com.google.android.gms.measurement.internal.l r0 = r3.f23338a     // Catch:{ Exception -> 0x0452 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ Exception -> 0x0452 }
            o8.a3 r0 = r0.f8797f     // Catch:{ Exception -> 0x0452 }
            java.lang.String r4 = "Install Referrer Service returned a null response"
            r0.a(r4)     // Catch:{ Exception -> 0x0452 }
            goto L_0x0464
        L_0x0452:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r4 = r3.f23338a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8797f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "Exception occurred while retrieving the Install Referrer"
            r4.b(r5, r0)
        L_0x0464:
            com.google.android.gms.measurement.internal.l r0 = r3.f23338a
            com.google.android.gms.measurement.internal.k r0 = r0.b()
            r0.h()
            com.google.android.gms.measurement.internal.l.j()
            throw r2
        L_0x0471:
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.internal.ads.a r0 = (com.google.android.gms.internal.ads.a) r0
            r0.b()
            java.lang.Object r0 = r1.f18267c
            x6.c r0 = (x6.c) r0
            v6.a0<float[]> r2 = r0.f27858c
            e8.r5 r2 = (e8.r5) r2
            if (r2 != 0) goto L_0x0483
            r3 = 1
        L_0x0483:
            if (r3 == 0) goto L_0x048f
            java.lang.Object r2 = r1.f18266b
            com.google.android.gms.internal.ads.a r2 = (com.google.android.gms.internal.ads.a) r2
            java.lang.Object r0 = r0.f27856a
            r2.f(r0)
            goto L_0x049e
        L_0x048f:
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.internal.ads.a r0 = (com.google.android.gms.internal.ads.a) r0
            java.lang.Object r3 = r0.f5924e
            monitor-enter(r3)
            e8.j3 r0 = r0.f5925f     // Catch:{ all -> 0x04c3 }
            monitor-exit(r3)     // Catch:{ all -> 0x04c3 }
            if (r0 == 0) goto L_0x049e
            r0.p(r2)
        L_0x049e:
            java.lang.Object r0 = r1.f18267c
            x6.c r0 = (x6.c) r0
            boolean r0 = r0.f27859d
            if (r0 == 0) goto L_0x04b0
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.internal.ads.a r0 = (com.google.android.gms.internal.ads.a) r0
            java.lang.String r2 = "intermediate-response"
            r0.m(r2)
            goto L_0x04b9
        L_0x04b0:
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.internal.ads.a r0 = (com.google.android.gms.internal.ads.a) r0
            java.lang.String r2 = "done"
            r0.q(r2)
        L_0x04b9:
            java.lang.Object r0 = r1.f18268d
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x04c2
            r0.run()
        L_0x04c2:
            return
        L_0x04c3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04c3 }
            throw r0
        L_0x04c6:
            e8.q10 r0 = com.google.android.gms.internal.ads.yg.G     // Catch:{ Exception -> 0x04d8 }
            java.lang.Object r2 = r1.f18267c     // Catch:{ Exception -> 0x04d8 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ Exception -> 0x04d8 }
            java.lang.Object r3 = r1.f18266b     // Catch:{ Exception -> 0x04d8 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x04d8 }
            java.lang.Object r6 = r1.f18268d     // Catch:{ Exception -> 0x04d8 }
            android.app.Activity r6 = (android.app.Activity) r6     // Catch:{ Exception -> 0x04d8 }
            r0.d(r2, r3, r6)     // Catch:{ Exception -> 0x04d8 }
            goto L_0x04e0
        L_0x04d8:
            r0 = move-exception
            com.google.android.gms.internal.ads.mf r2 = com.google.android.gms.internal.ads.yg.I
            r3 = 2020(0x7e4, float:2.83E-42)
            r2.a(r3, r4, r0)
        L_0x04e0:
            return
        L_0x04e1:
            java.lang.Object r0 = r1.f18266b
            e8.cu r0 = (e8.cu) r0
            java.lang.Object r2 = r1.f18267c
            e8.t00 r2 = (e8.t00) r2
            java.lang.Object r3 = r1.f18268d
            com.google.android.gms.internal.ads.qe r3 = (com.google.android.gms.internal.ads.qe) r3
            e8.xt r4 = r0.f14191b
            e8.p50 r2 = r4.b(r2, r3)
            int r3 = r3.M
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledExecutorService r6 = r0.f14194e
            e8.p50 r2 = com.google.android.gms.internal.ads.yh.e(r2, r3, r5, r6)
            com.google.android.gms.internal.ads.g2 r3 = new com.google.android.gms.internal.ads.g2
            r3.<init>((e8.cu) r0)
            e8.o50 r0 = r0.f14192c
            f7.j0 r4 = new f7.j0
            r4.<init>((java.util.concurrent.Future) r2, (com.google.android.gms.internal.ads.zh) r3)
            r2.a(r4, r0)
            return
        L_0x050e:
            java.lang.Object r0 = r1.f18266b
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            java.lang.Object r2 = r1.f18268d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r1.f18267c
            e8.c9 r4 = (e8.c9) r4
            int r5 = e8.dt.f14328c
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.String r7 = "event_state"
            r5.put(r7, r6)
            java.lang.String[] r6 = new java.lang.String[r10]
            r6[r3] = r2
            java.lang.String r2 = "offline_buffered_pings"
            java.lang.String r3 = "gws_query_id = ?"
            r0.update(r2, r5, r3, r6)
            e8.dt.a(r0, r4)
            return
        L_0x0539:
            java.lang.Object r0 = r1.f18267c
            e8.t9 r0 = (e8.t9) r0
            com.google.android.gms.internal.ads.f7 r0 = r0.f16729x
            if (r0 == 0) goto L_0x054e
            java.lang.Object r2 = r1.f18268d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f18266b
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.i7 r0 = (com.google.android.gms.internal.ads.i7) r0
            r0.k(r2, r3)
        L_0x054e:
            return
        L_0x054f:
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.internal.ads.p6 r0 = (com.google.android.gms.internal.ads.p6) r0
            java.lang.Object r2 = r1.f18267c
            com.google.android.gms.internal.ads.q6 r2 = (com.google.android.gms.internal.ads.q6) r2
            java.lang.Object r4 = r1.f18268d
            java.lang.String r4 = (java.lang.String) r4
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r5 = r0.f7819j
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.y7 r5 = (com.google.android.gms.internal.ads.y7) r5
            if (r5 == 0) goto L_0x0574
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r5 = r0.f7819j     // Catch:{ Exception -> 0x0571 }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0571 }
            com.google.android.gms.internal.ads.y7 r5 = (com.google.android.gms.internal.ads.y7) r5     // Catch:{ Exception -> 0x0571 }
            r2.e(r5)     // Catch:{ Exception -> 0x0571 }
            goto L_0x0574
        L_0x0571:
            r0.m(r4, r3)
        L_0x0574:
            return
        L_0x0575:
            java.lang.Object r0 = r1.f18267c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r1.f18268d
            java.lang.String r3 = (java.lang.String) r3
            e8.t.a(r0)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            e8.l<java.lang.Boolean> r5 = e8.t.Y
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r6 = "measurementEnabled"
            r4.putBoolean(r6, r5)
            e8.l<java.lang.Boolean> r5 = e8.t.f16573f0
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x05b8
            java.lang.String r5 = "ad_storage"
            java.lang.String r6 = "denied"
            r4.putString(r5, r6)
            java.lang.String r5 = "analytics_storage"
            r4.putString(r5, r6)
        L_0x05b8:
            java.lang.String r5 = "FA-Ads"
            java.lang.String r6 = "am"
            k8.s1 r3 = k8.s1.e(r0, r5, r6, r3, r4)
            b2.t r3 = r3.f20456b
            java.lang.String r4 = "com.google.android.gms.ads.measurement.DynamiteMeasurementManager"
            com.google.android.gms.dynamite.DynamiteModule$b r5 = com.google.android.gms.dynamite.DynamiteModule.f5902b     // Catch:{ Exception -> 0x05f5 }
            java.lang.String r6 = "com.google.android.gms.ads.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.d(r0, r5, r6)     // Catch:{ Exception -> 0x05f5 }
            android.os.IBinder r4 = r5.c(r4)     // Catch:{ Exception -> 0x05fc }
            int r5 = e8.yc.f17597a     // Catch:{ Exception -> 0x05fc }
            if (r4 != 0) goto L_0x05d5
            goto L_0x05e7
        L_0x05d5:
            java.lang.String r2 = "com.google.android.gms.ads.measurement.IMeasurementManager"
            android.os.IInterface r2 = r4.queryLocalInterface(r2)     // Catch:{ Exception -> 0x05fc }
            boolean r5 = r2 instanceof com.google.android.gms.internal.ads.z7     // Catch:{ Exception -> 0x05fc }
            if (r5 == 0) goto L_0x05e2
            com.google.android.gms.internal.ads.z7 r2 = (com.google.android.gms.internal.ads.z7) r2     // Catch:{ Exception -> 0x05fc }
            goto L_0x05e7
        L_0x05e2:
            com.google.android.gms.internal.ads.a8 r2 = new com.google.android.gms.internal.ads.a8     // Catch:{ Exception -> 0x05fc }
            r2.<init>(r4)     // Catch:{ Exception -> 0x05fc }
        L_0x05e7:
            c8.b r4 = new c8.b     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            r4.<init>(r0)     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            com.google.android.gms.internal.ads.o2 r0 = new com.google.android.gms.internal.ads.o2     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            r0.<init>(r3)     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            r2.u1(r4, r0)     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            goto L_0x060d
        L_0x05f5:
            r0 = move-exception
            e8.d9 r2 = new e8.d9     // Catch:{ Exception -> 0x05fc }
            r2.<init>(r0)     // Catch:{ Exception -> 0x05fc }
            throw r2     // Catch:{ Exception -> 0x05fc }
        L_0x05fc:
            r0 = move-exception
            e8.d9 r2 = new e8.d9     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            r2.<init>(r0)     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
            throw r2     // Catch:{ d9 -> 0x0607, NullPointerException -> 0x0605, RemoteException -> 0x0603 }
        L_0x0603:
            r0 = move-exception
            goto L_0x0608
        L_0x0605:
            r0 = move-exception
            goto L_0x0608
        L_0x0607:
            r0 = move-exception
        L_0x0608:
            java.lang.String r2 = "#007 Could not call remote method."
            l0.e.F(r2, r0)
        L_0x060d:
            return
        L_0x060e:
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.internal.ads.h2 r0 = (com.google.android.gms.internal.ads.h2) r0
            java.lang.Object r2 = r1.f18267c
            com.google.android.gms.internal.ads.tm r2 = (com.google.android.gms.internal.ads.tm) r2
            java.lang.Object r4 = r1.f18268d
            e8.r4 r4 = (e8.r4) r4
            r0.getClass()
            android.content.Context r5 = r0.f6726b     // Catch:{ all -> 0x06b1 }
            e8.f9 r6 = r0.f6728d     // Catch:{ all -> 0x06b1 }
            com.google.android.gms.internal.ads.f2 r7 = new com.google.android.gms.internal.ads.f2     // Catch:{ all -> 0x06b1 }
            r7.<init>(r5, r6, r2)     // Catch:{ all -> 0x06b1 }
            com.google.android.gms.internal.ads.j8 r5 = new com.google.android.gms.internal.ads.j8
            r5.<init>((com.google.android.gms.internal.ads.h2) r0, (e8.r4) r4, (e8.h4) r7)
            com.google.android.gms.internal.ads.t7 r6 = r7.f6346a
            e8.uc r6 = r6.H()
            com.google.android.gms.internal.ads.g2 r8 = new com.google.android.gms.internal.ads.g2
            r8.<init>((com.google.android.gms.internal.ads.j8) r5)
            com.google.android.gms.internal.ads.s7 r6 = (com.google.android.gms.internal.ads.s7) r6
            r6.f8096h = r8
            e8.n4 r5 = new e8.n4
            r5.<init>(r0, r4, r7)
            com.google.android.gms.internal.ads.t7 r6 = r7.f6346a
            e8.k4 r8 = new e8.k4
            r8.<init>(r7, r5)
            java.lang.String r5 = "/jsLoaded"
            r6.r(r5, r8)
            cb.d r5 = new cb.d
            r6 = 7
            r5.<init>((int) r6)
            e8.o4 r6 = new e8.o4
            r6.<init>(r0, r2, r7, r5)
            r5.f4374b = r6
            com.google.android.gms.internal.ads.t7 r2 = r7.f6346a
            e8.k4 r5 = new e8.k4
            r5.<init>(r7, r6)
            java.lang.String r6 = "/requestReload"
            r2.r(r6, r5)
            java.lang.String r2 = r0.f6727c
            java.lang.String r5 = ".js"
            boolean r2 = r2.endsWith(r5)
            if (r2 == 0) goto L_0x0683
            java.lang.String r2 = r0.f6727c
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r3] = r2
            java.lang.String r2 = "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            e8.i4 r5 = new e8.i4
            r5.<init>(r7, r2, r3)
            com.google.android.gms.internal.ads.f2.g(r5)
            goto L_0x06a2
        L_0x0683:
            java.lang.String r2 = r0.f6727c
            java.lang.String r3 = "<html>"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0698
            java.lang.String r2 = r0.f6727c
            e8.i4 r3 = new e8.i4
            r3.<init>(r7, r2, r10)
            com.google.android.gms.internal.ads.f2.g(r3)
            goto L_0x06a2
        L_0x0698:
            java.lang.String r2 = r0.f6727c
            r7.m r3 = new r7.m
            r3.<init>((com.google.android.gms.internal.ads.f2) r7, (java.lang.String) r2)
            com.google.android.gms.internal.ads.f2.g(r3)
        L_0x06a2:
            e8.d40 r2 = com.google.android.gms.ads.internal.util.p.f5702i
            e8.m4 r3 = new e8.m4
            r3.<init>(r0, r4, r7, r10)
            r0 = 60000(0xea60, float:8.4078E-41)
            long r4 = (long) r0
            r2.postDelayed(r3, r4)
            goto L_0x06cb
        L_0x06b1:
            r0 = move-exception
            java.lang.String r2 = "Error creating webview."
            l0.e.C(r2, r0)
            d7.l r2 = d7.l.B
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g
            android.content.Context r3 = r2.f8584e
            e8.f9 r2 = r2.f8585f
            e8.v6 r2 = com.google.android.gms.internal.ads.a5.d(r3, r2)
            java.lang.String r3 = "SdkJavascriptFactory.loadJavascriptEngine"
            r2.c(r0, r3)
            r4.g()
        L_0x06cb:
            return
        L_0x06cc:
            java.lang.Object r0 = r1.f18267c
            u7.i0 r0 = (u7.i0) r0
            int r3 = r0.f26112o0
            if (r3 <= 0) goto L_0x06e7
            java.lang.Object r3 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            android.os.Bundle r0 = r0.f26113p0
            if (r0 == 0) goto L_0x06e4
            java.lang.Object r2 = r1.f18268d
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r2 = r0.getBundle(r2)
        L_0x06e4:
            r3.c(r2)
        L_0x06e7:
            java.lang.Object r0 = r1.f18267c
            u7.i0 r0 = (u7.i0) r0
            int r0 = r0.f26112o0
            if (r0 < r8) goto L_0x06f6
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.f()
        L_0x06f6:
            java.lang.Object r0 = r1.f18267c
            u7.i0 r0 = (u7.i0) r0
            int r0 = r0.f26112o0
            if (r0 < r7) goto L_0x0705
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.d()
        L_0x0705:
            java.lang.Object r0 = r1.f18267c
            u7.i0 r0 = (u7.i0) r0
            int r0 = r0.f26112o0
            if (r0 < r6) goto L_0x0714
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.g()
        L_0x0714:
            java.lang.Object r0 = r1.f18267c
            u7.i0 r0 = (u7.i0) r0
            int r0 = r0.f26112o0
            if (r0 < r9) goto L_0x0723
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.getClass()
        L_0x0723:
            return
        L_0x0724:
            java.lang.Object r0 = r1.f18267c
            u7.h0 r0 = (u7.h0) r0
            int r3 = r0.f26108b
            if (r3 <= 0) goto L_0x073f
            java.lang.Object r3 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            android.os.Bundle r0 = r0.f26109c
            if (r0 == 0) goto L_0x073c
            java.lang.Object r2 = r1.f18268d
            java.lang.String r2 = (java.lang.String) r2
            android.os.Bundle r2 = r0.getBundle(r2)
        L_0x073c:
            r3.c(r2)
        L_0x073f:
            java.lang.Object r0 = r1.f18267c
            u7.h0 r0 = (u7.h0) r0
            int r0 = r0.f26108b
            if (r0 < r8) goto L_0x074e
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.f()
        L_0x074e:
            java.lang.Object r0 = r1.f18267c
            u7.h0 r0 = (u7.h0) r0
            int r0 = r0.f26108b
            if (r0 < r7) goto L_0x075d
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.d()
        L_0x075d:
            java.lang.Object r0 = r1.f18267c
            u7.h0 r0 = (u7.h0) r0
            int r0 = r0.f26108b
            if (r0 < r6) goto L_0x076c
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.g()
        L_0x076c:
            java.lang.Object r0 = r1.f18267c
            u7.h0 r0 = (u7.h0) r0
            int r0 = r0.f26108b
            if (r0 < r9) goto L_0x077b
            java.lang.Object r0 = r1.f18266b
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.getClass()
        L_0x077b:
            return
        L_0x077c:
            java.lang.Object r0 = r1.f18266b
            r2 = r0
            com.google.android.gms.ads.internal.util.o r2 = (com.google.android.gms.ads.internal.util.o) r2
            java.lang.Object r0 = r1.f18267c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r4 = r1.f18268d
            java.lang.String r4 = (java.lang.String) r4
            r2.getClass()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r3)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.lang.Object r5 = r2.f5679a
            monitor-enter(r5)
            r2.f5684f = r0     // Catch:{ all -> 0x087c }
            r2.f5685g = r4     // Catch:{ all -> 0x087c }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x087c }
            r4 = 23
            if (r0 < r4) goto L_0x07a2
            r3 = 1
        L_0x07a2:
            if (r3 == 0) goto L_0x07ab
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()     // Catch:{ all -> 0x087c }
            r0.isCleartextTrafficPermitted()     // Catch:{ all -> 0x087c }
        L_0x07ab:
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "use_https"
            boolean r4 = r2.f5686h     // Catch:{ all -> 0x087c }
            boolean r0 = r0.getBoolean(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5686h = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "content_url_opted_out"
            boolean r4 = r2.f5698t     // Catch:{ all -> 0x087c }
            boolean r0 = r0.getBoolean(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5698t = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "content_url_hashes"
            java.lang.String r4 = r2.f5687i     // Catch:{ all -> 0x087c }
            java.lang.String r0 = r0.getString(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5687i = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "gad_idless"
            boolean r4 = r2.f5689k     // Catch:{ all -> 0x087c }
            boolean r0 = r0.getBoolean(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5689k = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "content_vertical_opted_out"
            boolean r4 = r2.f5699u     // Catch:{ all -> 0x087c }
            boolean r0 = r0.getBoolean(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5699u = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "content_vertical_hashes"
            java.lang.String r4 = r2.f5688j     // Catch:{ all -> 0x087c }
            java.lang.String r0 = r0.getString(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5688j = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "version_code"
            int r4 = r2.f5695q     // Catch:{ all -> 0x087c }
            int r0 = r0.getInt(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5695q = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "app_settings_json"
            java.lang.String r4 = r2.f5690l     // Catch:{ all -> 0x087c }
            java.lang.String r0 = r0.getString(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5690l = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "app_settings_last_update_ms"
            long r6 = r2.f5691m     // Catch:{ all -> 0x087c }
            long r3 = r0.getLong(r3, r6)     // Catch:{ all -> 0x087c }
            r2.f5691m = r3     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "app_last_background_time_ms"
            long r6 = r2.f5692n     // Catch:{ all -> 0x087c }
            long r3 = r0.getLong(r3, r6)     // Catch:{ all -> 0x087c }
            r2.f5692n = r3     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "request_in_session_count"
            int r4 = r2.f5694p     // Catch:{ all -> 0x087c }
            int r0 = r0.getInt(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5694p = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "first_ad_req_time_ms"
            long r6 = r2.f5693o     // Catch:{ all -> 0x087c }
            long r3 = r0.getLong(r3, r6)     // Catch:{ all -> 0x087c }
            r2.f5693o = r3     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "never_pool_slots"
            java.util.Set<java.lang.String> r4 = r2.f5696r     // Catch:{ all -> 0x087c }
            java.util.Set r0 = r0.getStringSet(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5696r = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "display_cutout"
            java.lang.String r4 = r2.f5700v     // Catch:{ all -> 0x087c }
            java.lang.String r0 = r0.getString(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5700v = r0     // Catch:{ all -> 0x087c }
            android.content.SharedPreferences r0 = r2.f5684f     // Catch:{ all -> 0x087c }
            java.lang.String r3 = "app_measurement_npa"
            int r4 = r2.f5701w     // Catch:{ all -> 0x087c }
            int r0 = r0.getInt(r3, r4)     // Catch:{ all -> 0x087c }
            r2.f5701w = r0     // Catch:{ all -> 0x087c }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0871 }
            android.content.SharedPreferences r3 = r2.f5684f     // Catch:{ JSONException -> 0x0871 }
            java.lang.String r4 = "native_advanced_settings"
            java.lang.String r6 = "{}"
            java.lang.String r3 = r3.getString(r4, r6)     // Catch:{ JSONException -> 0x0871 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0871 }
            r2.f5697s = r0     // Catch:{ JSONException -> 0x0871 }
            goto L_0x0877
        L_0x0871:
            r0 = move-exception
            java.lang.String r3 = "Could not convert native advanced settings to json object"
            l0.e.D(r3, r0)     // Catch:{ all -> 0x087c }
        L_0x0877:
            r2.C()     // Catch:{ all -> 0x087c }
            monitor-exit(r5)     // Catch:{ all -> 0x087c }
            return
        L_0x087c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x087c }
            throw r0
        L_0x087f:
            java.lang.Object r0 = r1.f18266b
            ab.f r0 = (ab.f) r0
            java.lang.Object r3 = r1.f18267c
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r4 = r1.f18268d
            s8.j r4 = (s8.j) r4
            r0.getClass()
            r0.b(r3)     // Catch:{ all -> 0x0897 }
            s8.z<TResult> r0 = r4.f25035a
            r0.p(r2)
            return
        L_0x0897:
            r0 = move-exception
            r3 = r0
            s8.z<TResult> r0 = r4.f25035a
            r0.p(r2)
            goto L_0x08a0
        L_0x089f:
            throw r3
        L_0x08a0:
            goto L_0x089f
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.f0.run():void");
    }

    public f0(SQLiteDatabase sQLiteDatabase, String str, c9 c9Var) {
        this.f18266b = sQLiteDatabase;
        this.f18268d = str;
        this.f18267c = c9Var;
    }

    public f0(o oVar, Context context, String str) {
        this.f18266b = oVar;
        this.f18267c = context;
        this.f18268d = str;
    }

    public f0(h2 h2Var, tm tmVar, r4 r4Var) {
        this.f18266b = h2Var;
        this.f18267c = tmVar;
        this.f18268d = r4Var;
    }

    public f0(p6 p6Var, q6 q6Var, String str) {
        this.f18266b = p6Var;
        this.f18267c = q6Var;
        this.f18268d = str;
    }

    public f0(ri riVar, Context context, String str) {
        this.f18266b = riVar;
        this.f18267c = context;
        this.f18268d = str;
    }

    public f0(p pVar, AtomicReference atomicReference, b6 b6Var) {
        this.f18268d = pVar;
        this.f18266b = atomicReference;
        this.f18267c = b6Var;
    }

    public f0(p pVar, b6 b6Var, Bundle bundle) {
        this.f18268d = pVar;
        this.f18266b = b6Var;
        this.f18267c = bundle;
    }

    public f0(p pVar, b6 b6Var, v0 v0Var) {
        this.f18268d = pVar;
        this.f18266b = b6Var;
        this.f18267c = v0Var;
    }

    public f0(cu cuVar, t00 t00, qe qeVar) {
        this.f18266b = cuVar;
        this.f18267c = t00;
        this.f18268d = qeVar;
    }

    public f0(l3 l3Var, k0 k0Var, ServiceConnection serviceConnection) {
        this.f18268d = l3Var;
        this.f18266b = k0Var;
        this.f18267c = serviceConnection;
    }

    public /* synthetic */ f0(b4 b4Var, String str, Bundle bundle) {
        this.f18266b = b4Var;
        this.f18268d = str;
        this.f18267c = bundle;
    }

    public f0(b4 b4Var, b bVar, b6 b6Var) {
        this.f18268d = b4Var;
        this.f18266b = bVar;
        this.f18267c = b6Var;
    }

    public f0(b4 b4Var, r rVar, String str) {
        this.f18267c = b4Var;
        this.f18266b = rVar;
        this.f18268d = str;
    }

    public f0(b4 b4Var, r rVar, b6 b6Var) {
        this.f18268d = b4Var;
        this.f18266b = rVar;
        this.f18267c = b6Var;
    }

    public f0(b4 b4Var, w5 w5Var, b6 b6Var) {
        this.f18268d = b4Var;
        this.f18266b = w5Var;
        this.f18267c = b6Var;
    }

    public /* synthetic */ f0(j5 j5Var, h hVar, JobParameters jobParameters) {
        this.f18266b = j5Var;
        this.f18267c = hVar;
        this.f18268d = jobParameters;
    }

    public f0(Context context, View view, Activity activity) {
        this.f18267c = context;
        this.f18266b = view;
        this.f18268d = activity;
    }

    public f0(a aVar, c cVar, Runnable runnable) {
        this.f18266b = aVar;
        this.f18267c = cVar;
        this.f18268d = runnable;
    }

    public f0(t9 t9Var, String str, String str2) {
        this.f18267c = t9Var;
        this.f18268d = str;
        this.f18266b = str2;
    }
}
