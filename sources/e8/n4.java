package e8;

import com.google.android.gms.internal.ads.h2;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class n4 implements f3<u4> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15584a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15585b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15586c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15587d;

    public n4(h2 h2Var, r4 r4Var, h4 h4Var) {
        this.f15587d = h2Var;
        this.f15585b = r4Var;
        this.f15586c = h4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r3, java.util.Map r4) {
        /*
            r2 = this;
            int r0 = r2.f15584a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x005e
        L_0x0006:
            e8.u4 r3 = (e8.u4) r3
            java.lang.Object r3 = r2.f15587d
            com.google.android.gms.internal.ads.h2 r3 = (com.google.android.gms.internal.ads.h2) r3
            java.lang.Object r3 = r3.f6725a
            monitor-enter(r3)
            java.lang.Object r4 = r2.f15585b     // Catch:{ all -> 0x005b }
            e8.r4 r4 = (e8.r4) r4     // Catch:{ all -> 0x005b }
            int r4 = r4.f()     // Catch:{ all -> 0x005b }
            r0 = -1
            if (r4 == r0) goto L_0x0059
            java.lang.Object r4 = r2.f15585b     // Catch:{ all -> 0x005b }
            e8.r4 r4 = (e8.r4) r4     // Catch:{ all -> 0x005b }
            int r4 = r4.f()     // Catch:{ all -> 0x005b }
            r0 = 1
            if (r4 != r0) goto L_0x0026
            goto L_0x0059
        L_0x0026:
            java.lang.Object r4 = r2.f15587d     // Catch:{ all -> 0x005b }
            r0 = r4
            com.google.android.gms.internal.ads.h2 r0 = (com.google.android.gms.internal.ads.h2) r0     // Catch:{ all -> 0x005b }
            r1 = 0
            r0.f6732h = r1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.h2 r4 = (com.google.android.gms.internal.ads.h2) r4     // Catch:{ all -> 0x005b }
            f7.r<e8.h4> r4 = r4.f6729e     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r2.f15586c     // Catch:{ all -> 0x005b }
            e8.h4 r0 = (e8.h4) r0     // Catch:{ all -> 0x005b }
            r4.m(r0)     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r2.f15585b     // Catch:{ all -> 0x005b }
            e8.r4 r4 = (e8.r4) r4     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r2.f15586c     // Catch:{ all -> 0x005b }
            e8.h4 r0 = (e8.h4) r0     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.d7<T> r4 = r4.f15880b     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.d7 r4 = (com.google.android.gms.internal.ads.d7) r4     // Catch:{ all -> 0x005b }
            r4.b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r2.f15587d     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.h2 r4 = (com.google.android.gms.internal.ads.h2) r4     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r2.f15585b     // Catch:{ all -> 0x005b }
            e8.r4 r0 = (e8.r4) r0     // Catch:{ all -> 0x005b }
            r4.f6731g = r0     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "Successfully loaded JS Engine."
            l0.e.H(r4)     // Catch:{ all -> 0x005b }
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            goto L_0x005a
        L_0x0059:
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
        L_0x005a:
            return
        L_0x005b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            throw r4
        L_0x005e:
            java.lang.String r3 = "asset"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.f15585b     // Catch:{ RemoteException -> 0x0078 }
            com.google.android.gms.internal.ads.t0 r4 = (com.google.android.gms.internal.ads.t0) r4     // Catch:{ RemoteException -> 0x0078 }
            java.lang.Object r0 = r2.f15587d     // Catch:{ RemoteException -> 0x0078 }
            e8.pa0 r0 = (e8.pa0) r0     // Catch:{ RemoteException -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0078 }
            com.google.android.gms.internal.ads.l0 r0 = (com.google.android.gms.internal.ads.l0) r0     // Catch:{ RemoteException -> 0x0078 }
            r4.u0(r0, r3)     // Catch:{ RemoteException -> 0x0078 }
            goto L_0x009c
        L_0x0078:
            r4 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            int r0 = r0 + 40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to call onCustomClick for asset "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            l0.e.D(r3, r4)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.n4.f(java.lang.Object, java.util.Map):void");
    }

    public n4(qn qnVar, jn jnVar, cp cpVar, pa0 pa0) {
        this.f15585b = qnVar.a(jnVar.c());
        this.f15586c = cpVar;
        this.f15587d = pa0;
    }
}
