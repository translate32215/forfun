package e8;

import com.google.android.gms.internal.ads.b;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.rz;
import com.google.android.gms.internal.ads.yt;
import o8.g5;
import o8.l5;
import o8.s4;
import o8.z4;
import s8.s;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class s30 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16369a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16370b;

    public s30(b bVar) {
        this.f16369a = 7;
        this.f16370b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        e8.q10.l((e8.q10) r12.f16370b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ee, code lost:
        ((e8.q10) r12.f16370b).f16054f.a(2023, -1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            int r0 = r12.f16369a
            r1 = 1
            r2 = 0
            r3 = -1
            r5 = 0
            switch(r0) {
                case 0: goto L_0x02cf;
                case 1: goto L_0x02c5;
                case 2: goto L_0x021e;
                case 3: goto L_0x0215;
                case 4: goto L_0x020d;
                case 5: goto L_0x01f1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01c2;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00ca;
                case 10: goto L_0x00aa;
                case 11: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0310
        L_0x000c:
            java.lang.Object r0 = r12.f16370b
            o8.l5 r0 = (o8.l5) r0
            t1.c r3 = r0.f23328c
            long r9 = r0.f23326a
            long r6 = r0.f23327b
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            r0.h()
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            java.lang.String r4 = "Application going to the background"
            r0.a(r4)
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.f3 r0 = r0.f8821p
            r0.a(r1)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            o8.f r0 = r0.f8843g
            boolean r0 = r0.w()
            if (r0 != 0) goto L_0x0098
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            o8.m5 r0 = r0.f23380e
            o8.k r0 = r0.f23350c
            r0.a()
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            o8.f r0 = r0.f8843g
            o8.u2<java.lang.Boolean> r4 = o8.v2.f23512g0
            boolean r0 = r0.v(r5, r4)
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            o8.m5 r0 = r0.f23380e
            long r4 = r0.f23349b
            r0.f23349b = r6
            long r4 = r6 - r4
            java.lang.String r0 = "_et"
            r11.putLong(r0, r4)
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            o8.z4 r0 = r0.x()
            o8.x4 r0 = r0.o(r1)
            com.google.android.gms.measurement.internal.r.w(r0, r11, r1)
            goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            o8.m5 r0 = r0.f23380e
            r0.a(r2, r1, r6)
        L_0x0098:
            java.lang.Object r0 = r3.f25351c
            o8.o5 r0 = (o8.o5) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            o8.s4 r6 = r0.v()
            java.lang.String r7 = "auto"
            java.lang.String r8 = "_ab"
            r6.p(r7, r8, r9, r11)
            return
        L_0x00aa:
            java.lang.Object r0 = r12.f16370b
            o8.g5 r0 = (o8.g5) r0
            com.google.android.gms.measurement.internal.p r0 = r0.f23223c
            android.content.ComponentName r1 = new android.content.ComponentName
            com.google.android.gms.measurement.internal.l r2 = r0.f8864a
            android.content.Context r2 = r2.f8837a
            java.lang.Object r3 = r12.f16370b
            o8.g5 r3 = (o8.g5) r3
            com.google.android.gms.measurement.internal.p r3 = r3.f23223c
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a
            r3.getClass()
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            com.google.android.gms.measurement.internal.p.v(r0, r1)
            return
        L_0x00ca:
            java.lang.Object r0 = r12.f16370b
            o8.z4 r0 = (o8.z4) r0
            o8.x4 r1 = r0.f23647j
            r0.f23642e = r1
            return
        L_0x00d3:
            java.lang.Object r0 = r12.f16370b
            o8.s4 r0 = (o8.s4) r0
            o8.d6 r0 = r0.f23439n
            com.google.android.gms.measurement.internal.l r1 = r0.f23169a
            com.google.android.gms.measurement.internal.k r1 = r1.b()
            r1.h()
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x00ea
            goto L_0x01c1
        L_0x00ea:
            boolean r1 = r0.c()
            java.lang.String r2 = "_cc"
            if (r1 == 0) goto L_0x0129
            com.google.android.gms.measurement.internal.l r1 = r0.f23169a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.j3 r1 = r1.f8825t
            r1.b(r5)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "(not set)"
            java.lang.String r4 = "source"
            r1.putString(r4, r3)
            java.lang.String r4 = "medium"
            r1.putString(r4, r3)
            java.lang.String r3 = "_cis"
            java.lang.String r4 = "intent"
            r1.putString(r3, r4)
            r3 = 1
            r1.putLong(r2, r3)
            com.google.android.gms.measurement.internal.l r2 = r0.f23169a
            o8.s4 r2 = r2.v()
            java.lang.String r3 = "auto"
            java.lang.String r4 = "_cmpx"
            r2.o(r3, r4, r1)
            goto L_0x01b4
        L_0x0129:
            com.google.android.gms.measurement.internal.l r1 = r0.f23169a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.j3 r1 = r1.f8825t
            java.lang.String r1 = r1.a()
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.l r1 = r0.f23169a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8798g
            java.lang.String r2 = "Cache still valid but referrer not found"
            r1.a(r2)
            goto L_0x01a9
        L_0x0149:
            com.google.android.gms.measurement.internal.l r6 = r0.f23169a
            com.google.android.gms.measurement.internal.j r6 = r6.t()
            o8.h3 r6 = r6.f8826u
            long r6 = r6.a()
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 / r8
            long r6 = r6 + r3
            long r6 = r6 * r8
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r8 = r1.getPath()
            r4.<init>(r8, r3)
            java.util.Set r8 = r1.getQueryParameterNames()
            java.util.Iterator r8 = r8.iterator()
        L_0x0176:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x018a
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r1.getQueryParameter(r9)
            r3.putString(r9, r10)
            goto L_0x0176
        L_0x018a:
            java.lang.Object r1 = r4.second
            android.os.Bundle r1 = (android.os.Bundle) r1
            r1.putLong(r2, r6)
            java.lang.Object r1 = r4.first
            if (r1 != 0) goto L_0x0198
            java.lang.String r1 = "app"
            goto L_0x019a
        L_0x0198:
            java.lang.String r1 = (java.lang.String) r1
        L_0x019a:
            com.google.android.gms.measurement.internal.l r2 = r0.f23169a
            o8.s4 r2 = r2.v()
            java.lang.Object r3 = r4.second
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "_cmp"
            r2.o(r1, r4, r3)
        L_0x01a9:
            com.google.android.gms.measurement.internal.l r1 = r0.f23169a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.j3 r1 = r1.f8825t
            r1.b(r5)
        L_0x01b4:
            com.google.android.gms.measurement.internal.l r0 = r0.f23169a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.h3 r0 = r0.f8826u
            r1 = 0
            r0.b(r1)
        L_0x01c1:
            return
        L_0x01c2:
            java.lang.Object r0 = r12.f16370b
            com.google.android.gms.internal.ads.b r0 = (com.google.android.gms.internal.ads.b) r0
            com.google.android.gms.internal.ads.x1 r0 = r0.f5987a
            if (r0 == 0) goto L_0x01d8
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ RemoteException -> 0x01d2 }
            r0.E4(r1)     // Catch:{ RemoteException -> 0x01d2 }
            goto L_0x01d8
        L_0x01d2:
            r0 = move-exception
            java.lang.String r1 = "Could not notify onComplete event."
            l0.e.D(r1, r0)
        L_0x01d8:
            return
        L_0x01d9:
            java.lang.Object r0 = r12.f16370b
            r2 = r0
            e8.ij0 r2 = (e8.ij0) r2
            com.google.android.gms.internal.ads.rx r2 = r2.f15054a
            if (r2 == 0) goto L_0x01f0
            e8.ij0 r0 = (e8.ij0) r0     // Catch:{ RemoteException -> 0x01ea }
            com.google.android.gms.internal.ads.rx r0 = r0.f15054a     // Catch:{ RemoteException -> 0x01ea }
            r0.h0(r1)     // Catch:{ RemoteException -> 0x01ea }
            goto L_0x01f0
        L_0x01ea:
            r0 = move-exception
            java.lang.String r1 = "Could not notify onAdFailedToLoad event."
            l0.e.D(r1, r0)
        L_0x01f0:
            return
        L_0x01f1:
            java.lang.Object r0 = r12.f16370b
            r2 = r0
            com.google.android.gms.internal.ads.rz r2 = (com.google.android.gms.internal.ads.rz) r2
            com.google.android.gms.internal.ads.qz r2 = r2.f8086a
            com.google.android.gms.internal.ads.rx r2 = r2.f8000a
            if (r2 == 0) goto L_0x020c
            com.google.android.gms.internal.ads.rz r0 = (com.google.android.gms.internal.ads.rz) r0     // Catch:{ RemoteException -> 0x0206 }
            com.google.android.gms.internal.ads.qz r0 = r0.f8086a     // Catch:{ RemoteException -> 0x0206 }
            com.google.android.gms.internal.ads.rx r0 = r0.f8000a     // Catch:{ RemoteException -> 0x0206 }
            r0.h0(r1)     // Catch:{ RemoteException -> 0x0206 }
            goto L_0x020c
        L_0x0206:
            r0 = move-exception
            java.lang.String r1 = "Could not notify onAdFailedToLoad event."
            l0.e.D(r1, r0)
        L_0x020c:
            return
        L_0x020d:
            java.lang.Object r0 = r12.f16370b
            com.google.android.gms.internal.ads.gv r0 = (com.google.android.gms.internal.ads.gv) r0
            com.google.android.gms.internal.ads.gv.d(r0)
            return
        L_0x0215:
            java.lang.Object r0 = r12.f16370b
            e8.sg0 r0 = (e8.sg0) r0
            r1 = 3
            r0.c(r1)
            return
        L_0x021e:
            java.lang.Object r0 = r12.f16370b
            com.google.android.gms.internal.ads.yt r0 = (com.google.android.gms.internal.ads.yt) r0
            boolean r3 = r0.O
            if (r3 != 0) goto L_0x02c4
            boolean r3 = r0.A
            if (r3 != 0) goto L_0x02c4
            e8.jd0 r3 = r0.f8658y
            if (r3 == 0) goto L_0x02c4
            boolean r3 = r0.f8659z
            if (r3 != 0) goto L_0x0234
            goto L_0x02c4
        L_0x0234:
            android.util.SparseArray<com.google.android.gms.internal.ads.gu> r3 = r0.f8656w
            int r3 = r3.size()
            r4 = 0
        L_0x023b:
            if (r4 >= r3) goto L_0x0250
            android.util.SparseArray<com.google.android.gms.internal.ads.gu> r6 = r0.f8656w
            java.lang.Object r6 = r6.valueAt(r4)
            com.google.android.gms.internal.ads.gu r6 = (com.google.android.gms.internal.ads.gu) r6
            e8.bc0 r6 = r6.l()
            if (r6 != 0) goto L_0x024d
            goto L_0x02c4
        L_0x024d:
            int r4 = r4 + 1
            goto L_0x023b
        L_0x0250:
            e8.yf0 r4 = r0.f8652s
            monitor-enter(r4)
            r4.f17627b = r2     // Catch:{ all -> 0x02c1 }
            monitor-exit(r4)
            e8.ye0[] r4 = new e8.ye0[r3]
            boolean[] r6 = new boolean[r3]
            r0.H = r6
            boolean[] r6 = new boolean[r3]
            r0.G = r6
            e8.jd0 r6 = r0.f8658y
            long r6 = r6.c()
            r0.F = r6
            r6 = 0
        L_0x0269:
            if (r6 >= r3) goto L_0x02a0
            android.util.SparseArray<com.google.android.gms.internal.ads.gu> r7 = r0.f8656w
            java.lang.Object r7 = r7.valueAt(r6)
            com.google.android.gms.internal.ads.gu r7 = (com.google.android.gms.internal.ads.gu) r7
            e8.bc0 r7 = r7.l()
            e8.ye0 r8 = new e8.ye0
            e8.bc0[] r9 = new e8.bc0[r1]
            r9[r2] = r7
            r8.<init>(r9)
            r4[r6] = r8
            java.lang.String r7 = r7.f13920f
            boolean r8 = p.a.f(r7)
            if (r8 != 0) goto L_0x0293
            boolean r7 = p.a.e(r7)
            if (r7 == 0) goto L_0x0291
            goto L_0x0293
        L_0x0291:
            r7 = 0
            goto L_0x0294
        L_0x0293:
            r7 = 1
        L_0x0294:
            boolean[] r8 = r0.H
            r8[r6] = r7
            boolean r8 = r0.I
            r7 = r7 | r8
            r0.I = r7
            int r6 = r6 + 1
            goto L_0x0269
        L_0x02a0:
            e8.bf0 r2 = new e8.bf0
            r2.<init>(r4)
            r0.E = r2
            r0.A = r1
            e8.se0 r1 = r0.f8647f
            e8.ze0 r2 = new e8.ze0
            long r3 = r0.F
            e8.jd0 r6 = r0.f8658y
            boolean r6 = r6.b()
            r2.<init>(r3, r6)
            r1.d(r2, r5)
            e8.re0 r1 = r0.f8657x
            r1.c(r0)
            goto L_0x02c4
        L_0x02c1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x02c4:
            return
        L_0x02c5:
            java.lang.Object r0 = r12.f16370b
            com.google.android.gms.internal.ads.fr r0 = (com.google.android.gms.internal.ads.fr) r0
            android.content.Context r0 = r0.f6479a
            e8.t.a(r0)
            return
        L_0x02cf:
            java.lang.Object r0 = r12.f16370b
            e8.q10 r0 = (e8.q10) r0
            java.lang.Object r0 = r0.f16059s
            monitor-enter(r0)
            java.lang.Object r5 = r12.f16370b     // Catch:{ all -> 0x030d }
            e8.q10 r5 = (e8.q10) r5     // Catch:{ all -> 0x030d }
            boolean r5 = r5.f16060t     // Catch:{ all -> 0x030d }
            if (r5 != 0) goto L_0x030b
            java.lang.Object r5 = r12.f16370b     // Catch:{ all -> 0x030d }
            e8.q10 r5 = (e8.q10) r5     // Catch:{ all -> 0x030d }
            r5.f16060t = r1     // Catch:{ all -> 0x030d }
            monitor-exit(r0)     // Catch:{ all -> 0x030d }
            java.lang.Object r0 = r12.f16370b     // Catch:{ Exception -> 0x02ed }
            e8.q10 r0 = (e8.q10) r0     // Catch:{ Exception -> 0x02ed }
            e8.q10.l(r0)     // Catch:{ Exception -> 0x02ed }
            goto L_0x02f9
        L_0x02ed:
            r0 = move-exception
            java.lang.Object r1 = r12.f16370b
            e8.q10 r1 = (e8.q10) r1
            com.google.android.gms.internal.ads.mf r1 = r1.f16054f
            r5 = 2023(0x7e7, float:2.835E-42)
            r1.a(r5, r3, r0)
        L_0x02f9:
            java.lang.Object r0 = r12.f16370b
            e8.q10 r0 = (e8.q10) r0
            java.lang.Object r1 = r0.f16059s
            monitor-enter(r1)
            java.lang.Object r0 = r12.f16370b     // Catch:{ all -> 0x0308 }
            e8.q10 r0 = (e8.q10) r0     // Catch:{ all -> 0x0308 }
            r0.f16060t = r2     // Catch:{ all -> 0x0308 }
            monitor-exit(r1)     // Catch:{ all -> 0x0308 }
            goto L_0x030c
        L_0x0308:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0308 }
            throw r0
        L_0x030b:
            monitor-exit(r0)     // Catch:{ all -> 0x030d }
        L_0x030c:
            return
        L_0x030d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x030d }
            throw r1
        L_0x0310:
            java.lang.Object r0 = r12.f16370b
            s8.s r0 = (s8.s) r0
            java.lang.Object r0 = r0.f25056b
            monitor-enter(r0)
            java.lang.Object r1 = r12.f16370b     // Catch:{ all -> 0x0324 }
            s8.s r1 = (s8.s) r1     // Catch:{ all -> 0x0324 }
            s8.c r1 = r1.f25057c     // Catch:{ all -> 0x0324 }
            if (r1 == 0) goto L_0x0322
            r1.b()     // Catch:{ all -> 0x0324 }
        L_0x0322:
            monitor-exit(r0)     // Catch:{ all -> 0x0324 }
            return
        L_0x0324:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0324 }
            goto L_0x0328
        L_0x0327:
            throw r1
        L_0x0328:
            goto L_0x0327
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.s30.run():void");
    }

    public s30(sg0 sg0) {
        this.f16369a = 3;
        this.f16370b = sg0;
    }

    public s30(s4 s4Var) {
        this.f16369a = 8;
        this.f16370b = s4Var;
    }

    public s30(z4 z4Var) {
        this.f16369a = 9;
        this.f16370b = z4Var;
    }

    public s30(g5 g5Var) {
        this.f16369a = 10;
        this.f16370b = g5Var;
    }

    public /* synthetic */ s30(l5 l5Var) {
        this.f16369a = 11;
        this.f16370b = l5Var;
    }

    public s30(s sVar) {
        this.f16369a = 12;
        this.f16370b = sVar;
    }

    public s30(fr frVar) {
        this.f16369a = 1;
        this.f16370b = frVar;
    }

    public s30(yt ytVar) {
        this.f16369a = 2;
        this.f16370b = ytVar;
    }

    public s30(gv gvVar) {
        this.f16369a = 4;
        this.f16370b = gvVar;
    }

    public s30(rz rzVar) {
        this.f16369a = 5;
        this.f16370b = rzVar;
    }

    public s30(q10 q10) {
        this.f16369a = 0;
        this.f16370b = q10;
    }

    public s30(ij0 ij0) {
        this.f16369a = 6;
        this.f16370b = ij0;
    }

    public s30() {
        this.f16369a = 13;
        this.f16370b = null;
    }
}
