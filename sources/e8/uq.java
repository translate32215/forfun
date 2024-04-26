package e8;

import d7.l;
import f7.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uq {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f16981a;

    /* renamed from: b  reason: collision with root package name */
    public List<Map<String, String>> f16982b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16983c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16984d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f16985e;

    /* renamed from: f  reason: collision with root package name */
    public tq f16986f;

    public uq(String str, tq tqVar) {
        this.f16985e = str;
        this.f16986f = tqVar;
        this.f16981a = l.B.f13190g.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            e8.l<java.lang.Boolean> r0 = e8.t.f16574f1     // Catch:{ all -> 0x0044 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            e8.l<java.lang.Boolean> r0 = e8.t.H4     // Catch:{ all -> 0x0044 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            boolean r0 = r4.f16983c     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0040
            java.util.Map r0 = r4.b()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0044 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0044 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r4.f16982b     // Catch:{ all -> 0x0044 }
            r1.add(r0)     // Catch:{ all -> 0x0044 }
            r0 = 1
            r4.f16983c = r0     // Catch:{ all -> 0x0044 }
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.uq.a():void");
    }

    public final Map<String, String> b() {
        tq tqVar = this.f16986f;
        tqVar.getClass();
        HashMap hashMap = new HashMap(tqVar.f16508a);
        hashMap.put("tms", Long.toString(l.B.f13193j.a(), 10));
        hashMap.put("tid", this.f16981a.b() ? "" : this.f16985e);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            e8.l<java.lang.Boolean> r0 = e8.t.f16574f1     // Catch:{ all -> 0x0042 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0040
            e8.l<java.lang.Boolean> r0 = e8.t.H4     // Catch:{ all -> 0x0042 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0040
        L_0x0026:
            java.util.Map r0 = r4.b()     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_started"
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0042 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "ancn"
            r3.put(r1, r5)     // Catch:{ all -> 0x0042 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r5 = r4.f16982b     // Catch:{ all -> 0x0042 }
            r5.add(r0)     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            return
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.uq.c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            e8.l<java.lang.Boolean> r0 = e8.t.f16574f1     // Catch:{ all -> 0x0042 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0040
            e8.l<java.lang.Boolean> r0 = e8.t.H4     // Catch:{ all -> 0x0042 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0042 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0040
        L_0x0026:
            java.util.Map r0 = r4.b()     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0042 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "ancn"
            r3.put(r1, r5)     // Catch:{ all -> 0x0042 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r5 = r4.f16982b     // Catch:{ all -> 0x0042 }
            r5.add(r0)     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)
            return
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.uq.d(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            e8.l<java.lang.Boolean> r0 = e8.t.f16574f1     // Catch:{ all -> 0x0047 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            e8.l<java.lang.Boolean> r0 = e8.t.H4     // Catch:{ all -> 0x0047 }
            e8.ti0 r1 = e8.ti0.f16763j     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.e r1 = r1.f16769f     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0045
        L_0x0026:
            java.util.Map r0 = r4.b()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r3 = r0
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0047 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "ancn"
            r3.put(r1, r5)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "rqe"
            r3.put(r5, r6)     // Catch:{ all -> 0x0047 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r5 = r4.f16982b     // Catch:{ all -> 0x0047 }
            r5.add(r0)     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)
            return
        L_0x0045:
            monitor-exit(r4)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.uq.e(java.lang.String, java.lang.String):void");
    }
}
