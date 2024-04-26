package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.JsonReader;
import android.util.MalformedJsonException;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.JobRequest;
import com.startapp.sdk.jobs.d;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.PeriodicAppEventMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class jb {

    /* renamed from: a  reason: collision with root package name */
    public final String f10721a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10722b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f10723c;

    /* renamed from: d  reason: collision with root package name */
    public final m5 f10724d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f10725e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Long> f10726f;

    /* renamed from: g  reason: collision with root package name */
    public final AdvertisingIdResolver f10727g;

    /* renamed from: h  reason: collision with root package name */
    public final ub f10728h;

    /* renamed from: i  reason: collision with root package name */
    public final d3<TriggeredLinksMetadata> f10729i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f10730j = new a();

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            jb.this.b();
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TriggeredLinksMetadata f10732a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f10733b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f10734c;

        public b(TriggeredLinksMetadata triggeredLinksMetadata, Map map, String str) {
            this.f10732a = triggeredLinksMetadata;
            this.f10733b = map;
            this.f10734c = str;
        }

        public void run() {
            try {
                jb.this.b(this.f10732a, this.f10733b, this.f10734c);
            } catch (Throwable th) {
                if (jb.this.a(2)) {
                    i4.a(th);
                }
            }
        }
    }

    public jb(String str, e eVar, Executor executor, m5 m5Var, AdvertisingIdResolver advertisingIdResolver, ub ubVar, d3<TriggeredLinksMetadata> d3Var) {
        this.f10721a = str;
        this.f10722b = eVar;
        this.f10723c = new q9(executor);
        this.f10724d = m5Var;
        this.f10725e = new Handler(Looper.getMainLooper());
        this.f10726f = new HashMap();
        this.f10727g = advertisingIdResolver;
        this.f10728h = ubVar;
        this.f10729i = d3Var;
    }

    public final TriggeredLinksMetadata a() {
        TriggeredLinksMetadata call = this.f10729i.call();
        if (call == null || !call.e()) {
            return null;
        }
        return call;
    }

    public void b() {
        String b10;
        this.f10725e.removeCallbacks(this.f10730j);
        int i10 = 1;
        this.f10724d.a(JobRequest.a((Class<? extends com.startapp.sdk.jobs.b>[]) new Class[]{ib.class}));
        TriggeredLinksMetadata a10 = a();
        Map<String, PeriodicAppEventMetadata> map = null;
        AppEventsMetadata a11 = a10 != null ? a10.a() : null;
        if (a11 != null) {
            map = a11.d();
        }
        if (map != null && map.size() >= 1) {
            e.a a12 = this.f10722b.edit();
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = Long.MAX_VALUE;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) next.getValue();
                if (!(str == null || str.length() < i10 || periodicAppEventMetadata == null || (b10 = periodicAppEventMetadata.b()) == null || b10.length() < i10)) {
                    int a13 = periodicAppEventMetadata.a();
                    int i11 = a13 < 5 ? 5 : a13;
                    long j11 = this.f10722b.getLong(str, 0);
                    if (j11 > currentTimeMillis) {
                        a12.a(str, Long.valueOf(j11));
                        a12.f12335a.putLong(str, j11);
                        if (j10 > j11) {
                            j10 = j11;
                        }
                    } else {
                        long j12 = (((long) i11) * 1000) + currentTimeMillis;
                        a12.a(str, Long.valueOf(j12));
                        a12.f12335a.putLong(str, j12);
                        lb lbVar = r0;
                        Executor executor = this.f10723c;
                        lb lbVar2 = new lb(this, a10, str, b10, i11);
                        executor.execute(lbVar);
                    }
                }
                i10 = 1;
            }
            a12.apply();
            if (j10 != Long.MAX_VALUE) {
                long j13 = j10 - currentTimeMillis;
                if (j13 < 5000) {
                    a(j13);
                    return;
                }
                d.a aVar = new d.a(ib.class);
                aVar.f12568d = Long.valueOf(j13);
                aVar.f12557b = JobRequest.Network.ANY;
                this.f10724d.a(new d((d.a) aVar.a()));
            }
        }
    }

    public boolean a(int i10) {
        TriggeredLinksMetadata a10 = a();
        return a10 != null && (a10.b() & i10) == i10;
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f10725e.postDelayed(this.f10730j, j10);
        } else {
            this.f10725e.post(this.f10730j);
        }
    }

    public void a(String str, int i10) {
        e.a a10 = this.f10722b.edit();
        long currentTimeMillis = (((long) i10) * 1000) + System.currentTimeMillis();
        a10.a(str, Long.valueOf(currentTimeMillis));
        a10.f12335a.putLong(str, currentTimeMillis);
        a10.apply();
    }

    public void a(TriggeredLinksMetadata triggeredLinksMetadata, Map<String, String> map, String str) {
        this.f10723c.execute(new b(triggeredLinksMetadata, map, str));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.URLConnection] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r7.equals("startapp_advertising_id") == false) goto L_0x0035;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011d A[Catch:{ all -> 0x0122 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) throws java.io.IOException, org.json.JSONException {
        /*
            r10 = this;
            android.net.Uri r14 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r0 = r14.buildUpon()
            r1 = 0
            r0.query(r1)
            java.util.Set r2 = r14.getQueryParameterNames()
            java.util.Iterator r2 = r2.iterator()
        L_0x0014:
            boolean r3 = r2.hasNext()
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0026
            goto L_0x0014
        L_0x0026:
            java.lang.String r7 = r14.getQueryParameter(r3)
            if (r7 != 0) goto L_0x002d
            goto L_0x0014
        L_0x002d:
            r8 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case -1089147532: goto L_0x004b;
                case 613582261: goto L_0x0040;
                case 1311708630: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            r4 = -1
            goto L_0x0055
        L_0x0037:
            java.lang.String r5 = "startapp_advertising_id"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L_0x0055
            goto L_0x0035
        L_0x0040:
            java.lang.String r4 = "startapp_no_tracking"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0049
            goto L_0x0035
        L_0x0049:
            r4 = 1
            goto L_0x0055
        L_0x004b:
            java.lang.String r4 = "startapp_package_id"
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0054
            goto L_0x0035
        L_0x0054:
            r4 = 0
        L_0x0055:
            java.lang.String r5 = "0"
            switch(r4) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0072;
                case 2: goto L_0x005e;
                default: goto L_0x005a;
            }
        L_0x005a:
            r0.appendQueryParameter(r3, r7)
            goto L_0x0014
        L_0x005e:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r4 = r10.f10727g
            com.startapp.t r4 = r4.a()
            java.lang.String r4 = r4.f12591a
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x006e
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
        L_0x006e:
            r0.appendQueryParameter(r3, r4)
            goto L_0x0014
        L_0x0072:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r4 = r10.f10727g
            com.startapp.t r4 = r4.a()
            boolean r4 = r4.f12593c
            if (r4 == 0) goto L_0x007e
            java.lang.String r5 = "1"
        L_0x007e:
            r0.appendQueryParameter(r3, r5)
            goto L_0x0014
        L_0x0082:
            java.lang.String r4 = r10.f10721a
            r0.appendQueryParameter(r3, r4)
            goto L_0x0014
        L_0x0088:
            android.net.Uri r14 = r0.build()
            java.lang.String r14 = r14.toString()
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x0114 }
            r0.<init>(r14)     // Catch:{ all -> 0x0114 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x0114 }
            boolean r2 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x00d4
            r2 = r0
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x0110 }
            r2.setInstanceFollowRedirects(r5)     // Catch:{ all -> 0x0110 }
            int r3 = r11.c()     // Catch:{ all -> 0x0110 }
            int r3 = r3 * 1000
            r2.setReadTimeout(r3)     // Catch:{ all -> 0x0110 }
            int r3 = r11.c()     // Catch:{ all -> 0x0110 }
            int r3 = r3 * 1000
            r2.setConnectTimeout(r3)     // Catch:{ all -> 0x0110 }
            com.startapp.ub r3 = r10.f10728h     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r3.f12678a     // Catch:{ all -> 0x0110 }
            if (r3 == 0) goto L_0x00c6
            int r5 = r3.length()     // Catch:{ all -> 0x0110 }
            if (r5 <= 0) goto L_0x00c6
            java.lang.String r5 = "User-Agent"
            r2.setRequestProperty(r5, r3)     // Catch:{ all -> 0x0110 }
        L_0x00c6:
            r2.connect()     // Catch:{ all -> 0x0110 }
            int r6 = r2.getResponseCode()     // Catch:{ all -> 0x0110 }
            java.io.InputStream r1 = r2.getInputStream()     // Catch:{ all -> 0x0110 }
            r10.a((java.lang.String) r12, (java.lang.String) r13, (java.io.InputStream) r1)     // Catch:{ all -> 0x0110 }
        L_0x00d4:
            com.startapp.wb.a((java.io.Closeable) r1)
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00e2
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x00e1 }
            r0.disconnect()     // Catch:{ all -> 0x00e1 }
            goto L_0x00e2
        L_0x00e1:
        L_0x00e2:
            boolean r11 = r11.f()
            if (r11 == 0) goto L_0x010f
            int r6 = r6 / 100
            if (r6 != r4) goto L_0x010f
            com.startapp.i4 r11 = new com.startapp.i4
            com.startapp.j4 r0 = com.startapp.j4.f10598o
            r11.<init>((com.startapp.j4) r0)
            r11.f10537d = r13
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r0 = "eventType"
            org.json.JSONObject r12 = r13.put(r0, r12)
            java.lang.String r13 = "url"
            org.json.JSONObject r12 = r12.put(r13, r14)
            java.lang.String r12 = r12.toString()
            r11.f10538e = r12
            r11.a()
        L_0x010f:
            return
        L_0x0110:
            r11 = move-exception
            r12 = r1
            r1 = r0
            goto L_0x0116
        L_0x0114:
            r11 = move-exception
            r12 = r1
        L_0x0116:
            com.startapp.wb.a((java.io.Closeable) r12)
            boolean r12 = r1 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x0122 }
            if (r12 == 0) goto L_0x0122
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0122 }
            r1.disconnect()     // Catch:{ all -> 0x0122 }
        L_0x0122:
            goto L_0x0124
        L_0x0123:
            throw r11
        L_0x0124:
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.jb.a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r2.longValue() > android.os.SystemClock.elapsedRealtime()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
            r8 = this;
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0008:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0094
            int r2 = r1.length()
            r3 = 1
            if (r2 >= r3) goto L_0x002a
            goto L_0x0094
        L_0x002a:
            if (r0 == 0) goto L_0x0094
            int r2 = r0.length()
            if (r2 >= r3) goto L_0x0033
            goto L_0x0094
        L_0x0033:
            java.util.List r2 = r9.d()
            if (r2 != 0) goto L_0x003a
            goto L_0x007f
        L_0x003a:
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.f10726f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "-"
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x007f
            long r4 = r2.longValue()
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0083
            return
        L_0x0083:
            r8.a(r9, r11, r1, r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0008
        L_0x0087:
            r0 = move-exception
            r1 = 4
            boolean r1 = r8.a((int) r1)
            if (r1 == 0) goto L_0x0008
            com.startapp.i4.a((java.lang.Throwable) r0)
            goto L_0x0008
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.jb.b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.util.Map, java.lang.String):void");
    }

    public final void a(String str, String str2, InputStream inputStream) throws IOException {
        try {
            Object b10 = q5.b(new JsonReader(new InputStreamReader(inputStream)));
            if (b10 instanceof Map) {
                Object obj = ((Map) b10).get("throttleSec");
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    Map<String, Long> map = this.f10726f;
                    map.put(str2 + "-" + str, Long.valueOf((((long) intValue) * 1000) + SystemClock.elapsedRealtime()));
                }
            }
        } catch (IOException e10) {
            if (!(e10 instanceof MalformedJsonException)) {
                throw e10;
            }
        }
    }
}
