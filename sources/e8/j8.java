package e8;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class j8 implements ug0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15098a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15099b;

    /* renamed from: c  reason: collision with root package name */
    public String f15100c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15101d;

    public j8(Context context, String str) {
        this.f15098a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f15100c = str;
        this.f15101d = false;
        this.f15099b = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7) {
        /*
            r6 = this;
            d7.l r0 = d7.l.B
            com.google.android.gms.internal.ads.p6 r0 = r0.f13207x
            android.content.Context r1 = r6.f15098a
            boolean r0 = r0.p(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r6.f15099b
            monitor-enter(r0)
            boolean r1 = r6.f15101d     // Catch:{ all -> 0x0070 }
            if (r1 != r7) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x0016:
            r6.f15101d = r7     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = r6.f15100c     // Catch:{ all -> 0x0070 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0070 }
            if (r7 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x0022:
            boolean r7 = r6.f15101d     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r7 == 0) goto L_0x004b
            d7.l r7 = d7.l.B     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.ads.p6 r7 = r7.f13207x     // Catch:{ all -> 0x0070 }
            android.content.Context r2 = r6.f15098a     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r6.f15100c     // Catch:{ all -> 0x0070 }
            boolean r4 = r7.p(r2)     // Catch:{ all -> 0x0070 }
            if (r4 != 0) goto L_0x0036
            goto L_0x006e
        L_0x0036:
            boolean r4 = com.google.android.gms.internal.ads.p6.g(r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "beginAdUnitExposure"
            if (r4 == 0) goto L_0x0047
            e8.l8 r2 = new e8.l8     // Catch:{ all -> 0x0070 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0070 }
            r7.e(r5, r2)     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x0047:
            r7.b(r2, r3, r5)     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x004b:
            d7.l r7 = d7.l.B     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.ads.p6 r7 = r7.f13207x     // Catch:{ all -> 0x0070 }
            android.content.Context r2 = r6.f15098a     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r6.f15100c     // Catch:{ all -> 0x0070 }
            boolean r4 = r7.p(r2)     // Catch:{ all -> 0x0070 }
            if (r4 != 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            boolean r4 = com.google.android.gms.internal.ads.p6.g(r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "endAdUnitExposure"
            if (r4 == 0) goto L_0x006b
            e8.k8 r2 = new e8.k8     // Catch:{ all -> 0x0070 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0070 }
            r7.e(r5, r2)     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x006b:
            r7.b(r2, r3, r5)     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x0070:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.j8.a(boolean):void");
    }

    public final void t(vg0 vg0) {
        a(vg0.f17142j);
    }
}
