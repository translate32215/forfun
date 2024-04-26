package e8;

import com.google.android.gms.internal.ads.ph;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class sx implements ph {

    /* renamed from: a  reason: collision with root package name */
    public final tx f16534a;

    public sx(tx txVar) {
        this.f16534a = txVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r3v11, types: [e8.p50, e8.l50] */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.eh, com.google.android.gms.internal.ads.gh, java.lang.Object, java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e8.p50 a() {
        /*
            r9 = this;
            e8.tx r0 = r9.f16534a
            e8.jv r1 = r0.f16819c
            java.lang.String r2 = r0.f16823g
            e8.w00 r3 = r0.f16821e
            java.lang.String r3 = r3.f17192f
            r1.getClass()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0076
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x001a
            goto L_0x0076
        L_0x001a:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<e8.lv>>> r4 = r1.f15197b
            java.lang.Object r4 = r4.get(r2)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L_0x0029
            java.util.Map r1 = java.util.Collections.emptyMap()
            goto L_0x007a
        L_0x0029:
            java.lang.Object r5 = r4.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x003e
            org.json.JSONObject r1 = r1.f15199d
            java.lang.String r1 = l0.e.u(r1, r3, r2)
            java.lang.Object r1 = r4.get(r1)
            r5 = r1
            java.util.List r5 = (java.util.List) r5
        L_0x003e:
            if (r5 != 0) goto L_0x0045
            java.util.Map r1 = java.util.Collections.emptyMap()
            goto L_0x007a
        L_0x0045:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x004e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r2.next()
            e8.lv r3 = (e8.lv) r3
            java.lang.String r4 = r3.f15429a
            boolean r5 = r1.containsKey(r4)
            if (r5 != 0) goto L_0x006a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.put(r4, r5)
        L_0x006a:
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            android.os.Bundle r3 = r3.f15430b
            r4.add(r3)
            goto L_0x004e
        L_0x0076:
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x007a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0087:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ed
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            e8.w00 r5 = r0.f16821e
            e8.fi0 r5 = r5.f17190d
            android.os.Bundle r5 = r5.f14643u
            if (r5 == 0) goto L_0x00ac
            android.os.Bundle r5 = r5.getBundle(r4)
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            e8.ux r6 = new e8.ux
            r6.<init>(r0, r4, r3, r5)
            e8.o50 r3 = r0.f16817a
            e8.p50 r3 = com.google.android.gms.internal.ads.yh.d(r6, r3)
            e8.l50 r3 = e8.l50.v(r3)
            e8.l<java.lang.Long> r5 = e8.t.P0
            e8.ti0 r6 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r6 = r6.f16769f
            java.lang.Object r5 = r6.a(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r8 = r0.f16818b
            e8.l50 r3 = r3.s(r5, r7, r8)
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            e8.bp r6 = new e8.bp
            r6.<init>((java.lang.String) r4)
            e8.o50 r4 = r0.f16817a
            com.google.android.gms.internal.ads.eh r7 = new com.google.android.gms.internal.ads.eh
            r7.<init>(r3, r5, r6)
            java.util.concurrent.Executor r4 = e.h.d(r4, r7)
            r3.a(r7, r4)
            r2.add(r7)
            goto L_0x0087
        L_0x00ed:
            com.google.android.gms.internal.ads.ug r1 = com.google.android.gms.internal.ads.ug.A(r2)
            r3 = 1
            e8.wy r4 = new e8.wy
            r4.<init>((java.util.List) r2)
            e8.o50 r0 = r0.f16817a
            com.google.android.gms.internal.ads.rh r2 = new com.google.android.gms.internal.ads.rh
            r2.<init>(r1, r3, r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.sx.a():e8.p50");
    }
}
