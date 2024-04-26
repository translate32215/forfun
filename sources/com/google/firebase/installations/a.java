package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import s8.l;
import s8.z;
import sa.e;
import va.c;
import va.f;
import va.g;
import va.h;
import va.i;
import va.j;
import xa.a;
import xa.b;
import xa.c;
import xa.d;
import ya.b;
import ya.f;

/* compiled from: FirebaseInstallations */
public class a implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f9676m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadFactory f9677n = new C0107a();

    /* renamed from: a  reason: collision with root package name */
    public final com.google.firebase.a f9678a;

    /* renamed from: b  reason: collision with root package name */
    public final ya.c f9679b;

    /* renamed from: c  reason: collision with root package name */
    public final xa.c f9680c;

    /* renamed from: d  reason: collision with root package name */
    public final j f9681d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9682e;

    /* renamed from: f  reason: collision with root package name */
    public final h f9683f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9684g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f9685h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f9686i;

    /* renamed from: j  reason: collision with root package name */
    public String f9687j;

    /* renamed from: k  reason: collision with root package name */
    public Set<wa.a> f9688k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    public final List<i> f9689l = new ArrayList();

    /* renamed from: com.google.firebase.installations.a$a  reason: collision with other inner class name */
    /* compiled from: FirebaseInstallations */
    public class C0107a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f9690a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f9690a.getAndIncrement())}));
        }
    }

    public a(com.google.firebase.a aVar, ua.a<cb.h> aVar2, ua.a<e> aVar3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f9677n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        aVar.a();
        ya.c cVar = new ya.c(aVar.f9662a, aVar2, aVar3);
        xa.c cVar2 = new xa.c(aVar);
        j c10 = j.c();
        b bVar = new b(aVar);
        h hVar = new h();
        this.f9678a = aVar;
        this.f9679b = cVar;
        this.f9680c = cVar2;
        this.f9681d = c10;
        this.f9682e = bVar;
        this.f9683f = hVar;
        this.f9685h = threadPoolExecutor;
        this.f9686i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    public static a f(com.google.firebase.a aVar) {
        com.google.android.gms.common.internal.i.b(true, "Null is not a valid value of FirebaseApp.");
        aVar.a();
        return (a) aVar.f9665d.a(c.class);
    }

    public s8.i<b> a(boolean z10) {
        h();
        s8.j jVar = new s8.j();
        f fVar = new f(this.f9681d, jVar);
        synchronized (this.f9684g) {
            this.f9689l.add(fVar);
        }
        z<TResult> zVar = jVar.f25035a;
        this.f9685h.execute(new va.b(this, z10, 0));
        return zVar;
    }

    public final void b(boolean z10) {
        d b10;
        synchronized (f9676m) {
            com.google.firebase.a aVar = this.f9678a;
            aVar.a();
            t1.c d10 = t1.c.d(aVar.f9662a, "generatefid.lock");
            try {
                b10 = this.f9680c.b();
                if (b10.i()) {
                    String i10 = i(b10);
                    xa.c cVar = this.f9680c;
                    a.b bVar = (a.b) b10.k();
                    bVar.f27897a = i10;
                    bVar.f27898b = c.a.UNREGISTERED;
                    b10 = bVar.a();
                    cVar.a(b10);
                }
            } finally {
                if (d10 != null) {
                    d10.g();
                }
            }
        }
        if (z10) {
            a.b bVar2 = (a.b) b10.k();
            bVar2.f27899c = null;
            b10 = bVar2.a();
        }
        l(b10);
        this.f9686i.execute(new va.b(this, z10, 1));
    }

    public final d c(d dVar) throws va.d {
        ya.f f10;
        ya.c cVar = this.f9679b;
        String d10 = d();
        xa.a aVar = (xa.a) dVar;
        String str = aVar.f27890b;
        String g10 = g();
        String str2 = aVar.f27893e;
        if (cVar.f28154d.a()) {
            URL a10 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{g10, str}));
            int i10 = 0;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, d10);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c10.setDoOutput(true);
                    cVar.h(c10);
                    int responseCode = c10.getResponseCode();
                    cVar.f28154d.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f10 = cVar.f(c10);
                    } else {
                        ya.c.b(c10, (String) null, d10, g10);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new va.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 3);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    b.C0285b bVar = (b.C0285b) ya.f.a();
                                    bVar.f28148c = f.b.BAD_CONFIG;
                                    f10 = bVar.a();
                                } else {
                                    c10.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i10++;
                                }
                            }
                        }
                        b.C0285b bVar2 = (b.C0285b) ya.f.a();
                        bVar2.f28148c = f.b.AUTH_ERROR;
                        f10 = bVar2.a();
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    ya.b bVar3 = (ya.b) f10;
                    int ordinal = bVar3.f28145c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.f28143a;
                        long j10 = bVar3.f28144b;
                        long b10 = this.f9681d.b();
                        a.b bVar4 = (a.b) dVar.k();
                        bVar4.f27899c = str3;
                        bVar4.f27901e = Long.valueOf(j10);
                        bVar4.f27902f = Long.valueOf(b10);
                        return bVar4.a();
                    } else if (ordinal == 1) {
                        a.b bVar5 = (a.b) dVar.k();
                        bVar5.f27903g = "BAD CONFIG";
                        bVar5.f27898b = c.a.REGISTER_ERROR;
                        return bVar5.a();
                    } else if (ordinal == 2) {
                        synchronized (this) {
                            this.f9687j = null;
                        }
                        a.b bVar6 = (a.b) dVar.k();
                        bVar6.f27898b = c.a.NOT_GENERATED;
                        return bVar6.a();
                    } else {
                        throw new va.d("Firebase Installations Service is unavailable. Please try again later.", 2);
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new va.d("Firebase Installations Service is unavailable. Please try again later.", 2);
        }
        throw new va.d("Firebase Installations Service is unavailable. Please try again later.", 2);
    }

    public String d() {
        com.google.firebase.a aVar = this.f9678a;
        aVar.a();
        return aVar.f9664c.f18332a;
    }

    public String e() {
        com.google.firebase.a aVar = this.f9678a;
        aVar.a();
        return aVar.f9664c.f18333b;
    }

    public String g() {
        com.google.firebase.a aVar = this.f9678a;
        aVar.a();
        return aVar.f9664c.f18338g;
    }

    public s8.i<String> getId() {
        String str;
        h();
        synchronized (this) {
            str = this.f9687j;
        }
        if (str != null) {
            return l.e(str);
        }
        s8.j jVar = new s8.j();
        g gVar = new g(jVar);
        synchronized (this.f9684g) {
            this.f9689l.add(gVar);
        }
        z<TResult> zVar = jVar.f25035a;
        this.f9685h.execute(new androidx.activity.c(this));
        return zVar;
    }

    public final void h() {
        com.google.android.gms.common.internal.i.f(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.i.f(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.i.f(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String e10 = e();
        Pattern pattern = j.f26698c;
        com.google.android.gms.common.internal.i.b(e10.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.i.b(j.f26698c.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String i(d dVar) {
        String string;
        com.google.firebase.a aVar = this.f9678a;
        aVar.a();
        if (aVar.f9663b.equals("CHIME_ANDROID_SDK") || this.f9678a.g()) {
            if (((xa.a) dVar).f27891c == c.a.ATTEMPT_MIGRATION) {
                xa.b bVar = this.f9682e;
                synchronized (bVar.f27905a) {
                    synchronized (bVar.f27905a) {
                        string = bVar.f27905a.getString("|S|id", (String) null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f9683f.a() : string;
            }
        }
        return this.f9683f.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xa.d j(xa.d r24) throws va.d {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            xa.a r0 = (xa.a) r0
            java.lang.String r2 = r0.f27890b
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0069
            int r2 = r2.length()
            r5 = 11
            if (r2 != r5) goto L_0x0069
            xa.b r2 = r1.f9682e
            android.content.SharedPreferences r5 = r2.f27905a
            monitor-enter(r5)
            java.lang.String[] r6 = xa.b.f27904c     // Catch:{ all -> 0x0066 }
            int r7 = r6.length     // Catch:{ all -> 0x0066 }
            r8 = 0
        L_0x001d:
            if (r8 >= r7) goto L_0x0064
            r9 = r6[r8]     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r2.f27906b     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r11.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x0066 }
            r11.append(r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0066 }
            r11.append(r9)     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences r10 = r2.f27905a     // Catch:{ all -> 0x0066 }
            java.lang.String r9 = r10.getString(r9, r3)     // Catch:{ all -> 0x0066 }
            if (r9 == 0) goto L_0x0061
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r10 != 0) goto L_0x0061
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x005e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r6 = "token"
            java.lang.String r3 = r2.getString(r6)     // Catch:{ JSONException -> 0x005f }
            goto L_0x005f
        L_0x005e:
            r3 = r9
        L_0x005f:
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0061:
            int r8 = r8 + 1
            goto L_0x001d
        L_0x0064:
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            ya.c r2 = r1.f9679b
            java.lang.String r5 = r23.d()
            java.lang.String r0 = r0.f27890b
            java.lang.String r6 = r23.g()
            java.lang.String r7 = r23.e()
            ya.e r8 = r2.f28154d
            boolean r8 = r8.a()
            java.lang.String r9 = "Firebase Installations Service is unavailable. Please try again later."
            r10 = 2
            if (r8 == 0) goto L_0x0185
            r8 = 1
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r4] = r6
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.net.URL r11 = r2.a(r11)
            r12 = 0
        L_0x0094:
            if (r12 > r8) goto L_0x017f
            r13 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r13)
            java.net.HttpURLConnection r13 = r2.c(r11, r5)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r13.setDoOutput(r8)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            if (r3 == 0) goto L_0x00af
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r3)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
        L_0x00af:
            r2.g(r13, r0, r7)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            int r14 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            ya.e r15 = r2.f28154d     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r15.b(r14)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto L_0x00c5
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto L_0x00c5
            r15 = 1
            goto L_0x00c6
        L_0x00c5:
            r15 = 0
        L_0x00c6:
            if (r15 == 0) goto L_0x00d3
            ya.d r0 = r2.e(r13)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0105
        L_0x00d3:
            ya.c.b(r13, r7, r5, r6)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L_0x0163
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto L_0x00e4
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto L_0x00e4
            goto L_0x0174
        L_0x00e4:
            java.lang.String r14 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r14, r15)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            ya.d$a r21 = ya.d.a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            ya.a r14 = new ya.a     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r22 = 0
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r0 = r14
        L_0x0105:
            ya.a r0 = (ya.a) r0
            ya.d$a r2 = r0.f28142e
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x0124
            java.lang.String r0 = "BAD CONFIG"
            xa.d$a r2 = r24.k()
            xa.a$b r2 = (xa.a.b) r2
            r2.f27903g = r0
            xa.c$a r0 = xa.c.a.REGISTER_ERROR
            r2.f27898b = r0
            xa.d r0 = r2.a()
            return r0
        L_0x0124:
            va.d r0 = new va.d
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2, r10)
            throw r0
        L_0x012c:
            java.lang.String r2 = r0.f28139b
            java.lang.String r3 = r0.f28140c
            va.j r4 = r1.f9681d
            long r4 = r4.b()
            ya.f r6 = r0.f28141d
            java.lang.String r6 = r6.c()
            ya.f r0 = r0.f28141d
            long r7 = r0.d()
            xa.d$a r0 = r24.k()
            xa.a$b r0 = (xa.a.b) r0
            r0.f27897a = r2
            xa.c$a r2 = xa.c.a.REGISTERED
            r0.f27898b = r2
            r0.f27899c = r6
            r0.f27900d = r3
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r0.f27901e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.f27902f = r2
            xa.d r0 = r0.a()
            return r0
        L_0x0163:
            va.d r14 = new va.d     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4 = 3
            r14.<init>(r15, r4)     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
            throw r14     // Catch:{ IOException | AssertionError -> 0x0174, all -> 0x016c }
        L_0x016c:
            r0 = move-exception
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0174:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r12 = r12 + 1
            r4 = 0
            goto L_0x0094
        L_0x017f:
            va.d r0 = new va.d
            r0.<init>(r9, r10)
            throw r0
        L_0x0185:
            va.d r0 = new va.d
            r0.<init>(r9, r10)
            goto L_0x018c
        L_0x018b:
            throw r0
        L_0x018c:
            goto L_0x018b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.j(xa.d):xa.d");
    }

    public final void k(Exception exc) {
        synchronized (this.f9684g) {
            Iterator<i> it = this.f9689l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(d dVar) {
        synchronized (this.f9684g) {
            Iterator<i> it = this.f9689l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }
}
