package e8;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.v1;
import com.google.android.gms.measurement.internal.p;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k8.v0;
import o8.b6;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ib implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15005a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final String f15006b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15007c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15008d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f15009e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f15010f;

    public ib(p pVar, String str, String str2, b6 b6Var, v0 v0Var) {
        this.f15010f = pVar;
        this.f15006b = str;
        this.f15007c = str2;
        this.f15008d = b6Var;
        this.f15009e = v0Var;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00eb */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f15005a
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x00b4;
                case 2: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x022a
        L_0x0007:
            java.lang.Object r0 = r10.f15008d
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            java.lang.Object r2 = r10.f15010f     // Catch:{ RemoteException -> 0x0081 }
            r3 = r2
            com.google.android.gms.measurement.internal.p r3 = (com.google.android.gms.measurement.internal.p) r3     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.measurement.internal.d r3 = r3.f8867d     // Catch:{ RemoteException -> 0x0081 }
            if (r3 != 0) goto L_0x003f
            com.google.android.gms.measurement.internal.p r2 = (com.google.android.gms.measurement.internal.p) r2     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ RemoteException -> 0x0081 }
            o8.a3 r2 = r2.f8797f     // Catch:{ RemoteException -> 0x0081 }
            java.lang.String r3 = "(legacy) Failed to get conditional properties; not connected to service"
            java.lang.String r4 = r10.f15006b     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r5 = r10.f15007c     // Catch:{ RemoteException -> 0x0081 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x0081 }
            r2.d(r3, r1, r4, r5)     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r2 = r10.f15008d     // Catch:{ RemoteException -> 0x0081 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0081 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ RemoteException -> 0x0081 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r1 = r10.f15008d     // Catch:{ all -> 0x00b1 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x00b1 }
            r1.notify()     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a8
        L_0x003f:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RemoteException -> 0x0081 }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r10.f15009e     // Catch:{ RemoteException -> 0x0081 }
            o8.b6 r2 = (o8.b6) r2     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.common.internal.i.h(r2)     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r2 = r10.f15008d     // Catch:{ RemoteException -> 0x0081 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0081 }
            java.lang.String r4 = r10.f15006b     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r5 = r10.f15007c     // Catch:{ RemoteException -> 0x0081 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r6 = r10.f15009e     // Catch:{ RemoteException -> 0x0081 }
            o8.b6 r6 = (o8.b6) r6     // Catch:{ RemoteException -> 0x0081 }
            java.util.List r3 = r3.k5(r4, r5, r6)     // Catch:{ RemoteException -> 0x0081 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0081 }
            goto L_0x0073
        L_0x0062:
            java.lang.Object r2 = r10.f15008d     // Catch:{ RemoteException -> 0x0081 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ RemoteException -> 0x0081 }
            java.lang.String r4 = r10.f15006b     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r5 = r10.f15007c     // Catch:{ RemoteException -> 0x0081 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x0081 }
            java.util.List r3 = r3.E3(r1, r4, r5)     // Catch:{ RemoteException -> 0x0081 }
            r2.set(r3)     // Catch:{ RemoteException -> 0x0081 }
        L_0x0073:
            java.lang.Object r2 = r10.f15010f     // Catch:{ RemoteException -> 0x0081 }
            com.google.android.gms.measurement.internal.p r2 = (com.google.android.gms.measurement.internal.p) r2     // Catch:{ RemoteException -> 0x0081 }
            r2.s()     // Catch:{ RemoteException -> 0x0081 }
            java.lang.Object r1 = r10.f15008d     // Catch:{ all -> 0x00b1 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x00b1 }
            goto L_0x00a4
        L_0x007f:
            r1 = move-exception
            goto L_0x00a9
        L_0x0081:
            r2 = move-exception
            java.lang.Object r3 = r10.f15010f     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.p r3 = (com.google.android.gms.measurement.internal.p) r3     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x007f }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "(legacy) Failed to get conditional properties; remote exception"
            java.lang.String r5 = r10.f15006b     // Catch:{ all -> 0x007f }
            r3.d(r4, r1, r5, r2)     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r10.f15008d     // Catch:{ all -> 0x007f }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x007f }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x007f }
            r1.set(r2)     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r10.f15008d     // Catch:{ all -> 0x00b1 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x00b1 }
        L_0x00a4:
            r1.notify()     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00a8:
            return
        L_0x00a9:
            java.lang.Object r2 = r10.f15008d     // Catch:{ all -> 0x00b1 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x00b1 }
            r2.notify()     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            throw r1
        L_0x00b4:
            java.lang.Object r0 = r10.f15007c
            e8.yq r0 = (e8.yq) r0
            java.lang.Object r1 = r10.f15008d
            com.google.android.gms.internal.ads.ue r1 = (com.google.android.gms.internal.ads.ue) r1
            java.lang.Object r2 = r10.f15009e
            com.google.android.gms.internal.ads.v1 r2 = (com.google.android.gms.internal.ads.v1) r2
            java.lang.Object r3 = r10.f15010f
            java.util.List r3 = (java.util.List) r3
            java.lang.String r4 = r10.f15006b
            r0.getClass()
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f17654f     // Catch:{ b10 -> 0x00eb }
            java.lang.Object r5 = r5.get()     // Catch:{ b10 -> 0x00eb }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ b10 -> 0x00eb }
            if (r5 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            android.content.Context r5 = r0.f17653e     // Catch:{ b10 -> 0x00eb }
        L_0x00d6:
            r1.getClass()     // Catch:{ b10 -> 0x00eb }
            com.google.android.gms.internal.ads.x2 r0 = r1.f8245a     // Catch:{ all -> 0x00e4 }
            c8.b r1 = new c8.b     // Catch:{ all -> 0x00e4 }
            r1.<init>(r5)     // Catch:{ all -> 0x00e4 }
            r0.W5(r1, r2, r3)     // Catch:{ all -> 0x00e4 }
            goto L_0x0115
        L_0x00e4:
            r0 = move-exception
            e8.b10 r1 = new e8.b10     // Catch:{ b10 -> 0x00eb }
            r1.<init>(r0)     // Catch:{ b10 -> 0x00eb }
            throw r1     // Catch:{ b10 -> 0x00eb }
        L_0x00eb:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x010f }
            int r0 = r0.length()     // Catch:{ RemoteException -> 0x010f }
            int r0 = r0 + 74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x010f }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x010f }
            java.lang.String r0 = "Failed to initialize adapter. "
            r1.append(r0)     // Catch:{ RemoteException -> 0x010f }
            r1.append(r4)     // Catch:{ RemoteException -> 0x010f }
            java.lang.String r0 = " does not implement the initialize() method."
            r1.append(r0)     // Catch:{ RemoteException -> 0x010f }
            java.lang.String r0 = r1.toString()     // Catch:{ RemoteException -> 0x010f }
            r2.M3(r0)     // Catch:{ RemoteException -> 0x010f }
            goto L_0x0115
        L_0x010f:
            r0 = move-exception
            java.lang.String r1 = ""
            l0.e.C(r1, r0)
        L_0x0115:
            return
        L_0x0116:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheCanceled"
            r0.put(r1, r2)
            java.lang.String r1 = r10.f15006b
            java.lang.String r2 = "src"
            r0.put(r2, r1)
            java.lang.Object r1 = r10.f15007c
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x013c
            java.lang.Object r1 = r10.f15007c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L_0x013c:
            java.lang.Object r1 = r10.f15010f
            com.google.android.gms.internal.ads.q7 r1 = (com.google.android.gms.internal.ads.q7) r1
            java.lang.Object r1 = r10.f15008d
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = -1
            r4 = 1
            r5 = 3
            r6 = 6
            r7 = 7
            r8 = 10
            r9 = 11
            switch(r2) {
                case -1947652542: goto L_0x01de;
                case -1396664534: goto L_0x01d3;
                case -1347010958: goto L_0x01c8;
                case -918817863: goto L_0x01bd;
                case -659376217: goto L_0x01b2;
                case -642208130: goto L_0x01a7;
                case -354048396: goto L_0x019c;
                case -32082395: goto L_0x0191;
                case 3387234: goto L_0x0183;
                case 96784904: goto L_0x0175;
                case 580119100: goto L_0x0167;
                case 725497484: goto L_0x0159;
                default: goto L_0x0157;
            }
        L_0x0157:
            goto L_0x01e8
        L_0x0159:
            java.lang.String r2 = "noCacheDir"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0163
            goto L_0x01e8
        L_0x0163:
            r3 = 11
            goto L_0x01e8
        L_0x0167:
            java.lang.String r2 = "expireFailed"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0171
            goto L_0x01e8
        L_0x0171:
            r3 = 10
            goto L_0x01e8
        L_0x0175:
            java.lang.String r2 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x017f
            goto L_0x01e8
        L_0x017f:
            r3 = 9
            goto L_0x01e8
        L_0x0183:
            java.lang.String r2 = "noop"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x018d
            goto L_0x01e8
        L_0x018d:
            r3 = 8
            goto L_0x01e8
        L_0x0191:
            java.lang.String r2 = "externalAbort"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x019a
            goto L_0x01e8
        L_0x019a:
            r3 = 7
            goto L_0x01e8
        L_0x019c:
            java.lang.String r2 = "sizeExceeded"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01a5
            goto L_0x01e8
        L_0x01a5:
            r3 = 6
            goto L_0x01e8
        L_0x01a7:
            java.lang.String r2 = "playerFailed"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01b0
            goto L_0x01e8
        L_0x01b0:
            r3 = 5
            goto L_0x01e8
        L_0x01b2:
            java.lang.String r2 = "contentLengthMissing"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01bb
            goto L_0x01e8
        L_0x01bb:
            r3 = 4
            goto L_0x01e8
        L_0x01bd:
            java.lang.String r2 = "downloadTimeout"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01c6
            goto L_0x01e8
        L_0x01c6:
            r3 = 3
            goto L_0x01e8
        L_0x01c8:
            java.lang.String r2 = "inProgress"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01d1
            goto L_0x01e8
        L_0x01d1:
            r3 = 2
            goto L_0x01e8
        L_0x01d3:
            java.lang.String r2 = "badUrl"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01dc
            goto L_0x01e8
        L_0x01dc:
            r3 = 1
            goto L_0x01e8
        L_0x01de:
            java.lang.String r2 = "interrupted"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01e7
            goto L_0x01e8
        L_0x01e7:
            r3 = 0
        L_0x01e8:
            if (r3 == r4) goto L_0x01fd
            if (r3 == r5) goto L_0x01fd
            if (r3 == r6) goto L_0x01fa
            if (r3 == r7) goto L_0x01fa
            if (r3 == r8) goto L_0x01f7
            if (r3 == r9) goto L_0x01f7
            java.lang.String r1 = "internal"
            goto L_0x01ff
        L_0x01f7:
            java.lang.String r1 = "io"
            goto L_0x01ff
        L_0x01fa:
            java.lang.String r1 = "policy"
            goto L_0x01ff
        L_0x01fd:
            java.lang.String r1 = "network"
        L_0x01ff:
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            java.lang.Object r1 = r10.f15008d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.Object r1 = r10.f15009e
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0220
            java.lang.Object r1 = r10.f15009e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        L_0x0220:
            java.lang.Object r1 = r10.f15010f
            com.google.android.gms.internal.ads.q7 r1 = (com.google.android.gms.internal.ads.q7) r1
            java.lang.String r2 = "onPrecacheEvent"
            com.google.android.gms.internal.ads.q7.j(r1, r2, r0)
            return
        L_0x022a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r10.f15010f     // Catch:{ RemoteException -> 0x027d }
            r2 = r1
            com.google.android.gms.measurement.internal.p r2 = (com.google.android.gms.measurement.internal.p) r2     // Catch:{ RemoteException -> 0x027d }
            com.google.android.gms.measurement.internal.d r2 = r2.f8867d     // Catch:{ RemoteException -> 0x027d }
            if (r2 != 0) goto L_0x0254
            com.google.android.gms.measurement.internal.p r1 = (com.google.android.gms.measurement.internal.p) r1     // Catch:{ RemoteException -> 0x027d }
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a     // Catch:{ RemoteException -> 0x027d }
            com.google.android.gms.measurement.internal.h r1 = r1.d()     // Catch:{ RemoteException -> 0x027d }
            o8.a3 r1 = r1.f8797f     // Catch:{ RemoteException -> 0x027d }
            java.lang.String r2 = "Failed to get conditional properties; not connected to service"
            java.lang.String r3 = r10.f15006b     // Catch:{ RemoteException -> 0x027d }
            java.lang.Object r4 = r10.f15007c     // Catch:{ RemoteException -> 0x027d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ RemoteException -> 0x027d }
            r1.c(r2, r3, r4)     // Catch:{ RemoteException -> 0x027d }
            java.lang.Object r1 = r10.f15010f
            com.google.android.gms.measurement.internal.p r1 = (com.google.android.gms.measurement.internal.p) r1
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
            goto L_0x029b
        L_0x0254:
            java.lang.Object r1 = r10.f15008d     // Catch:{ RemoteException -> 0x027d }
            o8.b6 r1 = (o8.b6) r1     // Catch:{ RemoteException -> 0x027d }
            com.google.android.gms.common.internal.i.h(r1)     // Catch:{ RemoteException -> 0x027d }
            java.lang.String r1 = r10.f15006b     // Catch:{ RemoteException -> 0x027d }
            java.lang.Object r3 = r10.f15007c     // Catch:{ RemoteException -> 0x027d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ RemoteException -> 0x027d }
            java.lang.Object r4 = r10.f15008d     // Catch:{ RemoteException -> 0x027d }
            o8.b6 r4 = (o8.b6) r4     // Catch:{ RemoteException -> 0x027d }
            java.util.List r1 = r2.k5(r1, r3, r4)     // Catch:{ RemoteException -> 0x027d }
            java.util.ArrayList r0 = com.google.android.gms.measurement.internal.r.t(r1)     // Catch:{ RemoteException -> 0x027d }
            java.lang.Object r1 = r10.f15010f     // Catch:{ RemoteException -> 0x027d }
            com.google.android.gms.measurement.internal.p r1 = (com.google.android.gms.measurement.internal.p) r1     // Catch:{ RemoteException -> 0x027d }
            r1.s()     // Catch:{ RemoteException -> 0x027d }
            java.lang.Object r1 = r10.f15010f
            com.google.android.gms.measurement.internal.p r1 = (com.google.android.gms.measurement.internal.p) r1
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
            goto L_0x029b
        L_0x027b:
            r1 = move-exception
            goto L_0x02a7
        L_0x027d:
            r1 = move-exception
            java.lang.Object r2 = r10.f15010f     // Catch:{ all -> 0x027b }
            com.google.android.gms.measurement.internal.p r2 = (com.google.android.gms.measurement.internal.p) r2     // Catch:{ all -> 0x027b }
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x027b }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x027b }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x027b }
            java.lang.String r3 = "Failed to get conditional properties; remote exception"
            java.lang.String r4 = r10.f15006b     // Catch:{ all -> 0x027b }
            java.lang.Object r5 = r10.f15007c     // Catch:{ all -> 0x027b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x027b }
            r2.d(r3, r4, r5, r1)     // Catch:{ all -> 0x027b }
            java.lang.Object r1 = r10.f15010f
            com.google.android.gms.measurement.internal.p r1 = (com.google.android.gms.measurement.internal.p) r1
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
        L_0x029b:
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            java.lang.Object r2 = r10.f15009e
            k8.v0 r2 = (k8.v0) r2
            r1.C(r2, r0)
            return
        L_0x02a7:
            java.lang.Object r2 = r10.f15010f
            com.google.android.gms.measurement.internal.p r2 = (com.google.android.gms.measurement.internal.p) r2
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.r r2 = r2.A()
            java.lang.Object r3 = r10.f15009e
            k8.v0 r3 = (k8.v0) r3
            r2.C(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ib.run():void");
    }

    public ib(p pVar, AtomicReference atomicReference, String str, String str2, b6 b6Var) {
        this.f15010f = pVar;
        this.f15008d = atomicReference;
        this.f15006b = str;
        this.f15007c = str2;
        this.f15009e = b6Var;
    }

    public ib(yq yqVar, ue ueVar, v1 v1Var, List list, String str) {
        this.f15007c = yqVar;
        this.f15008d = ueVar;
        this.f15009e = v1Var;
        this.f15010f = list;
        this.f15006b = str;
    }

    public ib(q7 q7Var, String str, String str2, String str3, String str4) {
        this.f15010f = q7Var;
        this.f15006b = str;
        this.f15007c = str2;
        this.f15008d = str3;
        this.f15009e = str4;
    }
}
