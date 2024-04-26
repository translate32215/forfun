package com.adcolony.sdk;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n2.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.k;
import t2.m1;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public s0 f4785a;

    /* renamed from: b  reason: collision with root package name */
    public ScheduledExecutorService f4786b;

    /* renamed from: c  reason: collision with root package name */
    public List<k> f4787c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<k> f4788d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, Object> f4789e;

    /* renamed from: f  reason: collision with root package name */
    public g f4790f = new g("adcolony_android", "4.5.0", "Production");

    /* renamed from: g  reason: collision with root package name */
    public g f4791g = new g("adcolony_fatal_reports", "4.5.0", "Production");

    public class a implements Runnable {
        public a() {
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r3 = this;
                com.adcolony.sdk.u r0 = com.adcolony.sdk.u.this
                monitor-enter(r0)
                monitor-enter(r0)     // Catch:{ all -> 0x004b }
                java.util.List<t2.k> r1 = r0.f4787c     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                int r1 = r1.size()     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                if (r1 <= 0) goto L_0x001e
                n2.g r1 = r0.f4790f     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                java.util.List<t2.k> r2 = r0.f4787c     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                java.lang.String r1 = r0.a(r1, r2)     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                com.adcolony.sdk.s0 r2 = r0.f4785a     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                r2.a(r1)     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                java.util.List<t2.k> r1 = r0.f4787c     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                r1.clear()     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
            L_0x001e:
                java.util.List<t2.k> r1 = r0.f4788d     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                int r1 = r1.size()     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                if (r1 <= 0) goto L_0x0046
                n2.g r1 = r0.f4791g     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                java.util.List<t2.k> r2 = r0.f4788d     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                java.lang.String r1 = r0.a(r1, r2)     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                com.adcolony.sdk.s0 r2 = r0.f4785a     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                r2.a(r1)     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                java.util.List<t2.k> r1 = r0.f4788d     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                r1.clear()     // Catch:{ IOException -> 0x0041, JSONException -> 0x003b }
                goto L_0x0046
            L_0x0039:
                r1 = move-exception
                goto L_0x0049
            L_0x003b:
                java.util.List<t2.k> r1 = r0.f4787c     // Catch:{ all -> 0x0039 }
                r1.clear()     // Catch:{ all -> 0x0039 }
                goto L_0x0046
            L_0x0041:
                java.util.List<t2.k> r1 = r0.f4787c     // Catch:{ all -> 0x0039 }
                r1.clear()     // Catch:{ all -> 0x0039 }
            L_0x0046:
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)
                return
            L_0x0049:
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                throw r1     // Catch:{ all -> 0x004b }
            L_0x004b:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.u.a.run():void");
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f4793a;

        public b(k kVar) {
            this.f4793a = kVar;
        }

        public void run() {
            u.this.f4787c.add(this.f4793a);
        }
    }

    public u(s0 s0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f4785a = s0Var;
        this.f4786b = scheduledExecutorService;
        this.f4789e = hashMap;
    }

    public String a(g gVar, List<k> list) throws IOException, JSONException {
        JSONObject jSONObject;
        String str = f.d().i().f4795a;
        String str2 = this.f4789e.get("advertiserId") != null ? (String) this.f4789e.get("advertiserId") : "unknown";
        if (str != null && str.length() > 0 && !str.equals(str2)) {
            this.f4789e.put("advertiserId", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("index", (String) gVar.f21850a);
        jSONObject2.put("environment", (String) gVar.f21852c);
        jSONObject2.put("version", (String) gVar.f21851b);
        JSONArray jSONArray = new JSONArray();
        for (k next : list) {
            synchronized (this) {
                jSONObject = new JSONObject(this.f4789e);
                jSONObject.put("environment", (String) next.f25497d.f21852c);
                jSONObject.put("level", next.a());
                jSONObject.put("message", next.f25496c);
                jSONObject.put("clientTimestamp", k.f25493e.format(next.f25494a));
                JSONObject h10 = f.d().o().h();
                JSONObject i10 = f.d().o().i();
                double c10 = f.d().i().c();
                jSONObject.put("mediation_network", h10.optString("name"));
                jSONObject.put("mediation_network_version", h10.optString("version"));
                jSONObject.put("plugin", i10.optString("name"));
                jSONObject.put("plugin_version", i10.optString("version"));
                jSONObject.put("batteryInfo", c10);
                if (next instanceof m1) {
                    m1 m1Var = (m1) next;
                    jSONObject = r0.b(jSONObject, null);
                    jSONObject.put("platform", "android");
                }
            }
            jSONArray.put(jSONObject);
        }
        jSONObject2.put("logs", jSONArray);
        return jSONObject2.toString();
    }

    public synchronized void b(long j10, TimeUnit timeUnit) {
        try {
            if (!this.f4786b.isShutdown() && !this.f4786b.isTerminated()) {
                this.f4786b.scheduleAtFixedRate(new a(), j10, j10, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    public synchronized void c(k kVar) {
        try {
            if (!this.f4786b.isShutdown() && !this.f4786b.isTerminated()) {
                this.f4786b.submit(new b(kVar));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }
}
