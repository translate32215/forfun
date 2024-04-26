package com.adcolony.sdk;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import b7.a;
import com.adcolony.sdk.b0;
import com.adcolony.sdk.i0;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;
import t2.f0;
import t2.f1;
import t2.g0;
import t2.h0;
import t2.j0;
import t2.l0;
import t2.o0;
import t2.r0;
import t2.y;

public class o implements b0.a {
    public static String R = "https://adc3-launch.adcolony.com/v4/launch";
    public static volatile String S = "";
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L = 1;
    public Application.ActivityLifecycleCallbacks M;
    public t2.g N = null;
    public long O;
    public long P;
    public boolean Q;

    /* renamed from: a  reason: collision with root package name */
    public l f4657a;

    /* renamed from: b  reason: collision with root package name */
    public h0 f4658b;

    /* renamed from: c  reason: collision with root package name */
    public y f4659c;

    /* renamed from: d  reason: collision with root package name */
    public i f4660d;

    /* renamed from: e  reason: collision with root package name */
    public z f4661e;

    /* renamed from: f  reason: collision with root package name */
    public n0 f4662f;

    /* renamed from: g  reason: collision with root package name */
    public g0 f4663g;

    /* renamed from: h  reason: collision with root package name */
    public a0 f4664h;

    /* renamed from: i  reason: collision with root package name */
    public t2.m f4665i;

    /* renamed from: j  reason: collision with root package name */
    public w f4666j;

    /* renamed from: k  reason: collision with root package name */
    public m f4667k;

    /* renamed from: l  reason: collision with root package name */
    public h f4668l;

    /* renamed from: m  reason: collision with root package name */
    public b f4669m;

    /* renamed from: n  reason: collision with root package name */
    public d f4670n;

    /* renamed from: o  reason: collision with root package name */
    public HashMap<String, t2.h> f4671o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    public p.g f4672p;

    /* renamed from: q  reason: collision with root package name */
    public g f4673q;

    /* renamed from: r  reason: collision with root package name */
    public JSONObject f4674r;

    /* renamed from: s  reason: collision with root package name */
    public HashMap<String, e> f4675s = new HashMap<>();

    /* renamed from: t  reason: collision with root package name */
    public HashMap<Integer, q0> f4676t = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    public String f4677u;

    /* renamed from: v  reason: collision with root package name */
    public String f4678v;

    /* renamed from: w  reason: collision with root package name */
    public String f4679w;

    /* renamed from: x  reason: collision with root package name */
    public String f4680x;

    /* renamed from: y  reason: collision with root package name */
    public String f4681y = "";

    /* renamed from: z  reason: collision with root package name */
    public boolean f4682z;

    public class a implements f0 {
        public a(o oVar) {
        }

        public void a(g gVar) {
            JSONObject jSONObject = new JSONObject();
            String optString = gVar.f4485b.optString("data");
            ExecutorService executorService = j0.f4565a;
            CRC32 crc32 = new CRC32();
            int length = optString.length();
            for (int i10 = 0; i10 < length; i10++) {
                crc32.update(optString.charAt(i10));
            }
            r0.j(jSONObject, "crc32", (int) crc32.getValue());
            gVar.a(jSONObject).b();
        }
    }

    public class b implements f0 {
        public b(o oVar) {
        }

        public void a(g gVar) {
            int optInt = gVar.f4485b.optInt("number");
            JSONObject jSONObject = new JSONObject();
            ExecutorService executorService = j0.f4565a;
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < optInt; i10++) {
                jSONArray.put(j0.d());
            }
            r0.f(jSONObject, "uuids", jSONArray);
            gVar.a(jSONObject).b();
        }
    }

    public class c implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f4684a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g f4685b;

            public a(Context context, g gVar) {
                this.f4684a = context;
                this.f4685b = gVar;
            }

            public void run() {
                o.this.e(this.f4684a, this.f4685b);
            }
        }

        public c() {
        }

        public void a(g gVar) {
            Context context = f.f4478a;
            if (context != null) {
                try {
                    j0.f4565a.execute(new a(context, gVar));
                } catch (RejectedExecutionException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder a10 = android.support.v4.media.a.a("ADCController.configure queryAdvertisingId failed with error: ");
                    a10.append(e10.toString());
                    sb2.append(a10.toString());
                    p.f.a(0, 0, sb2.toString(), true);
                }
            }
        }
    }

    public class d implements f0 {
        public d() {
        }

        public void a(g gVar) {
            u uVar = o.this.l().f25518d;
            o.this.i().f4802h = gVar.f4485b.optString("version");
            if (uVar != null) {
                String str = o.this.i().f4802h;
                synchronized (uVar) {
                    uVar.f4789e.put("controllerVersion", str);
                }
            }
        }
    }

    public class e implements f0 {
        public e() {
        }

        public void a(g gVar) {
            o oVar = o.this;
            r0.n(gVar.f4485b, "signals");
            oVar.getClass();
        }
    }

    public class f implements f0 {

        public class a implements t2.a<o0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4690a;

            public a(f fVar, g gVar) {
                this.f4690a = gVar;
            }

            public void a(Object obj) {
                o0 o0Var = (o0) obj;
                JSONObject jSONObject = new JSONObject();
                if (o0Var != null) {
                    r0.g(jSONObject, "odt", o0Var.a());
                }
                this.f4690a.a(jSONObject).b();
            }
        }

        public f() {
        }

        public void a(g gVar) {
            if (o.this.Q) {
                q.c().b(new a(this, gVar), o.this.P);
                return;
            }
            o0 o0Var = q.c().f4709c;
            JSONObject jSONObject = new JSONObject();
            if (o0Var != null) {
                r0.g(jSONObject, "odt", o0Var.a());
            }
            gVar.a(jSONObject).b();
        }
    }

    public class g implements f0 {
        public g(o oVar) {
        }

        public void a(g gVar) {
            q c10 = q.c();
            c10.b(new l0(c10), -1);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        public void run() {
            Context context = f.f4478a;
            if (!o.this.J && context != null) {
                try {
                    kb.a.a(context.getApplicationContext());
                    o.this.J = true;
                } catch (IllegalArgumentException unused) {
                    p.f.a(0, 0, "IllegalArgumentException when activating Omid", true);
                    o.this.J = false;
                }
            }
            o oVar = o.this;
            if (oVar.J && oVar.N == null) {
                try {
                    e.d.b("AdColony", "Name is null or empty");
                    e.d.b("4.5.0", "Version is null or empty");
                    oVar.N = new t2.g("AdColony", "4.5.0", 1);
                } catch (IllegalArgumentException unused2) {
                    p.f.a(0, 0, "IllegalArgumentException when creating Omid Partner", true);
                    o.this.J = false;
                }
            }
        }
    }

    public class i implements i0.b {
        public i(o oVar) {
        }
    }

    public class j implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                if (f.d().p().f4823u) {
                    o oVar = o.this;
                    oVar.getClass();
                    new Thread(new p(oVar)).start();
                }
            }
        }

        public j() {
        }

        public void run() {
            new Handler().postDelayed(new a(), (long) (o.this.L * 1000));
        }
    }

    public class k implements Runnable {
        public k() {
        }

        public void run() {
            o.this.f4657a.b();
        }
    }

    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q0 f4695a;

        public l(o oVar, q0 q0Var) {
            this.f4695a = q0Var;
        }

        public void run() {
            q0 q0Var = this.f4695a;
            if (q0Var != null && q0Var.I) {
                q0Var.loadUrl("about:blank");
                this.f4695a.clearCache(true);
                this.f4695a.removeAllViews();
                q0 q0Var2 = this.f4695a;
                q0Var2.K = true;
                q0Var2.destroy();
            }
        }
    }

    public class m implements t2.a<n> {
        public m(o oVar) {
        }

        public void a(Object obj) {
            q.c().f4707a = (n) obj;
        }
    }

    public class n implements f0 {
        public n() {
        }

        public void a(g gVar) {
            o oVar = o.this;
            oVar.getClass();
            Context context = f.f4478a;
            if (context != null) {
                try {
                    int optInt = gVar.f4485b.has("id") ? gVar.f4485b.optInt("id") : 0;
                    if (optInt <= 0) {
                        optInt = oVar.f4657a.f();
                    }
                    oVar.d(optInt);
                    j0.h(new j0(oVar, context, gVar.f4485b.optBoolean("is_display_module"), gVar));
                } catch (RuntimeException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e10.toString() + ": during WebView initialization.");
                    sb2.append(" Disabling AdColony.");
                    f.d().l().e(0, 0, sb2.toString(), false);
                    a.e();
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.o$o  reason: collision with other inner class name */
    public class C0067o implements f0 {
        public C0067o() {
        }

        public void a(g gVar) {
            o oVar = o.this;
            oVar.getClass();
            oVar.d(gVar.f4485b.optInt("id"));
        }
    }

    public class p implements f0 {
        public p() {
        }

        public void a(g gVar) {
            u uVar = o.this.l().f25518d;
            o oVar = o.this;
            oVar.C = true;
            if (oVar.H) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                r0.e(jSONObject2, "app_version", j0.o());
                r0.g(jSONObject, "app_bundle_info", jSONObject2);
                new g("AdColony.on_update", 1, jSONObject).b();
                o.this.H = false;
            }
            if (o.this.I) {
                new g("AdColony.on_install", 1).b();
            }
            if (uVar != null) {
                String optString = gVar.f4485b.optString("app_session_id");
                synchronized (uVar) {
                    uVar.f4789e.put("sessionId", optString);
                }
            }
            if (c.a()) {
                c.b();
            }
            int optInt = gVar.f4485b.optInt("concurrent_requests", 4);
            if (optInt != o.this.f4658b.f4522b.getCorePoolSize()) {
                o.this.f4658b.f4522b.setCorePoolSize(optInt);
            }
            o oVar2 = o.this;
            oVar2.getClass();
            JSONObject jSONObject3 = new JSONObject();
            r0.e(jSONObject3, "type", "AdColony.on_configuration_completed");
            JSONArray jSONArray = new JSONArray();
            for (String put : oVar2.f4675s.keySet()) {
                jSONArray.put(put);
            }
            JSONObject jSONObject4 = new JSONObject();
            r0.f(jSONObject4, "zone_ids", jSONArray);
            r0.g(jSONObject3, "message", jSONObject4);
            new g("CustomMessage.controller_send", 0, jSONObject3).b();
        }
    }

    public class q implements f0 {
        public q() {
        }

        public void a(g gVar) {
            o oVar = o.this;
            p.g gVar2 = oVar.f4672p;
            JSONObject jSONObject = (JSONObject) gVar2.f23743d;
            r0.e(jSONObject, "app_id", (String) gVar2.f23740a);
            r0.f(jSONObject, "zone_ids", (JSONArray) oVar.f4672p.f23742c);
            JSONObject jSONObject2 = new JSONObject();
            r0.g(jSONObject2, "options", jSONObject);
            gVar.a(jSONObject2).b();
        }
    }

    public class r implements f0 {
        public r() {
        }

        public void a(g gVar) {
            o.this.getClass();
        }
    }

    public class s implements f0 {
        public s() {
        }

        public void a(g gVar) {
            e eVar;
            o oVar = o.this;
            if (!oVar.B) {
                String optString = gVar.f4485b.optString("zone_id");
                if (oVar.f4675s.containsKey(optString)) {
                    eVar = oVar.f4675s.get(optString);
                } else {
                    e eVar2 = new e(optString);
                    oVar.f4675s.put(optString, eVar2);
                    eVar = eVar2;
                }
                eVar.getClass();
                JSONObject jSONObject = gVar.f4485b;
                JSONObject n10 = r0.n(jSONObject, "reward");
                n10.optString("reward_name");
                n10.optInt("reward_amount");
                n10.optInt("views_per_reward");
                n10.optInt("views_until_reward");
                eVar.f4476d = jSONObject.optBoolean("rewarded");
                jSONObject.optInt("status");
                eVar.f4473a = jSONObject.optInt("type");
                eVar.f4474b = jSONObject.optInt("play_interval");
                jSONObject.optString("zone_id");
            }
        }
    }

    public class t implements f0 {
        public t() {
        }

        public void a(g gVar) {
            o.this.f(true, true);
        }
    }

    public class u implements f0 {
        public u(o oVar) {
        }

        public void a(g gVar) {
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "sha1", j0.m(gVar.f4485b.optString("data")));
            gVar.a(jSONObject).b();
        }
    }

    public o() {
        new JSONObject();
        this.O = 500;
        this.P = 500;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        new java.io.File(r8.f4664h.f4418a + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x007a */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.adcolony.sdk.b0 r9, com.adcolony.sdk.g r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r8 = this;
            java.lang.String r10 = "sha1"
            java.lang.String r11 = "url"
            java.lang.String r0 = "controller"
            java.lang.String r1 = r9.f4454s
            java.lang.String r2 = R
            boolean r1 = r1.equals(r2)
            r2 = 1
            r3 = 0
            java.lang.String r4 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            if (r1 == 0) goto L_0x016f
            boolean r1 = r9.f4456u
            if (r1 == 0) goto L_0x016a
            java.lang.String r9 = r9.f4455t
            java.lang.String r1 = "Parsing launch response"
            org.json.JSONObject r9 = com.adcolony.sdk.r0.a(r9, r1)
            com.adcolony.sdk.w r1 = r8.i()
            r1.getClass()
            java.lang.String r1 = "sdkVersion"
            java.lang.String r5 = "4.5.0"
            com.adcolony.sdk.r0.e(r9, r1, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.a0 r5 = r8.f4664h
            java.lang.String r5 = r5.f4418a
            r1.append(r5)
            java.lang.String r5 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.adcolony.sdk.r0.o(r9, r1)
            org.json.JSONObject r1 = r9.optJSONObject(r0)     // Catch:{ Exception -> 0x007a }
            if (r1 != 0) goto L_0x0051
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x007a }
            r1.<init>()     // Catch:{ Exception -> 0x007a }
        L_0x0051:
            java.lang.String r6 = r1.optString(r11)     // Catch:{ Exception -> 0x007a }
            r8.f4678v = r6     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = r1.optString(r10)     // Catch:{ Exception -> 0x007a }
            r8.f4679w = r1     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = "status"
            java.lang.String r1 = r9.optString(r1)     // Catch:{ Exception -> 0x007a }
            r8.f4680x = r1     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = "pie"
            java.lang.String r1 = r9.optString(r1)     // Catch:{ Exception -> 0x007a }
            S = r1     // Catch:{ Exception -> 0x007a }
            boolean r1 = com.adcolony.sdk.c.a()     // Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0076
            com.adcolony.sdk.c.b()     // Catch:{ Exception -> 0x007a }
        L_0x0076:
            r8.h(r9)     // Catch:{ Exception -> 0x007a }
            goto L_0x0097
        L_0x007a:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0096 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0096 }
            r6.<init>()     // Catch:{ Exception -> 0x0096 }
            com.adcolony.sdk.a0 r7 = r8.f4664h     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = r7.f4418a     // Catch:{ Exception -> 0x0096 }
            r6.append(r7)     // Catch:{ Exception -> 0x0096 }
            r6.append(r5)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0096 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0096 }
            r1.delete()     // Catch:{ Exception -> 0x0096 }
            goto L_0x0097
        L_0x0096:
        L_0x0097:
            java.lang.String r1 = r8.f4680x
            java.lang.String r5 = "disable"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00d1
            boolean r1 = com.adcolony.sdk.q0.f4714d0
            if (r1 != 0) goto L_0x00d1
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00c0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r5.<init>()     // Catch:{ Exception -> 0x00c0 }
            com.adcolony.sdk.a0 r6 = r8.f4664h     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r6 = r6.f4418a     // Catch:{ Exception -> 0x00c0 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c0 }
            r5.append(r4)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c0 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x00c0 }
            r1.delete()     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            com.adcolony.sdk.o r1 = com.adcolony.sdk.f.d()
            t2.m r1 = r1.l()
            java.lang.String r5 = "Launch server response with disabled status. Disabling AdColony until next launch."
            r1.e(r3, r2, r5, r2)
            com.adcolony.sdk.a.e()
            goto L_0x00ec
        L_0x00d1:
            java.lang.String r1 = r8.f4678v
            java.lang.String r5 = ""
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00e3
            java.lang.String r1 = r8.f4680x
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ee
        L_0x00e3:
            boolean r1 = com.adcolony.sdk.q0.f4714d0
            if (r1 != 0) goto L_0x00ee
            java.lang.String r1 = "Missing controller status or URL. Disabling AdColony until next launch."
            p.f.a(r3, r3, r1, r2)
        L_0x00ec:
            r1 = 0
            goto L_0x00ef
        L_0x00ee:
            r1 = 1
        L_0x00ef:
            if (r1 != 0) goto L_0x00fd
            boolean r9 = r8.E
            if (r9 != 0) goto L_0x00fc
            java.lang.String r9 = "Incomplete or disabled launch server response. Disabling AdColony until next launch."
            p.f.a(r3, r3, r9, r3)
            r8.B = r2
        L_0x00fc:
            return
        L_0x00fd:
            boolean r1 = r8.E
            if (r1 != 0) goto L_0x0102
            goto L_0x0131
        L_0x0102:
            org.json.JSONObject r1 = r8.f4674r
            if (r1 == 0) goto L_0x012c
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 != 0) goto L_0x0111
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0111:
            java.lang.String r1 = r1.optString(r10)
            org.json.JSONObject r0 = r9.optJSONObject(r0)
            if (r0 != 0) goto L_0x0120
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0120:
            java.lang.String r10 = r0.optString(r10)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x012c
            r2 = 0
            goto L_0x0131
        L_0x012c:
            java.lang.String r10 = "Controller sha1 does not match, downloading new controller."
            p.f.a(r3, r2, r10, r2)
        L_0x0131:
            if (r2 == 0) goto L_0x0166
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r0 = r8.f4678v
            com.adcolony.sdk.r0.e(r10, r11, r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.adcolony.sdk.a0 r0 = r8.f4664h
            java.lang.String r0 = r0.f4418a
            r11.append(r0)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "filepath"
            com.adcolony.sdk.r0.e(r10, r0, r11)
            com.adcolony.sdk.h0 r11 = r8.f4658b
            com.adcolony.sdk.b0 r0 = new com.adcolony.sdk.b0
            com.adcolony.sdk.g r1 = new com.adcolony.sdk.g
            java.lang.String r2 = "WebServices.download"
            r1.<init>(r2, r3, r10)
            r0.<init>(r1, r8)
            r11.b(r0)
        L_0x0166:
            r8.f4674r = r9
            goto L_0x0236
        L_0x016a:
            r8.b()
            goto L_0x0236
        L_0x016f:
            java.lang.String r9 = r9.f4454s
            java.lang.String r10 = r8.f4678v
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0236
            java.lang.String r9 = r8.f4679w
            java.lang.String r10 = "Exception on closing MD5 input stream"
            android.content.Context r11 = com.adcolony.sdk.f.f4478a
            if (r11 == 0) goto L_0x020e
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r11 = r11.getFilesDir()
            java.lang.String r11 = r11.getAbsolutePath()
            r1.append(r11)
            java.lang.String r11 = "/adc3/"
            r1.append(r11)
            r1.append(r4)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            boolean r11 = r0.exists()
            if (r11 == 0) goto L_0x020e
            java.util.concurrent.ExecutorService r11 = com.adcolony.sdk.j0.f4565a
            java.lang.String r11 = "SHA1"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)     // Catch:{ NoSuchAlgorithmException -> 0x0209 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0203 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0203 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
        L_0x01b9:
            int r4 = r1.read(r0)     // Catch:{ IOException -> 0x01f2 }
            if (r4 <= 0) goto L_0x01c3
            r11.update(r0, r3, r4)     // Catch:{ IOException -> 0x01f2 }
            goto L_0x01b9
        L_0x01c3:
            byte[] r11 = r11.digest()     // Catch:{ IOException -> 0x01f2 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ IOException -> 0x01f2 }
            r0.<init>(r2, r11)     // Catch:{ IOException -> 0x01f2 }
            r11 = 16
            java.lang.String r11 = r0.toString(r11)     // Catch:{ IOException -> 0x01f2 }
            java.lang.String r0 = "%40s"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x01f2 }
            r4[r3] = r11     // Catch:{ IOException -> 0x01f2 }
            java.lang.String r11 = java.lang.String.format(r0, r4)     // Catch:{ IOException -> 0x01f2 }
            r0 = 32
            r4 = 48
            java.lang.String r11 = r11.replace(r0, r4)     // Catch:{ IOException -> 0x01f2 }
            boolean r9 = r9.equals(r11)     // Catch:{ IOException -> 0x01f2 }
            r1.close()     // Catch:{ IOException -> 0x01ec }
            goto L_0x020f
        L_0x01ec:
            p.f.a(r3, r3, r10, r2)
            goto L_0x020f
        L_0x01f0:
            r9 = move-exception
            goto L_0x01fb
        L_0x01f2:
            r9 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x01f0 }
            java.lang.String r0 = "Unable to process file for MD5"
            r11.<init>(r0, r9)     // Catch:{ all -> 0x01f0 }
            throw r11     // Catch:{ all -> 0x01f0 }
        L_0x01fb:
            r1.close()     // Catch:{ IOException -> 0x01ff }
            goto L_0x0202
        L_0x01ff:
            p.f.a(r3, r3, r10, r2)
        L_0x0202:
            throw r9
        L_0x0203:
            java.lang.String r9 = "Exception while getting FileInputStream"
            p.f.a(r3, r3, r9, r2)
            goto L_0x020e
        L_0x0209:
            java.lang.String r9 = "Exception while getting Digest"
            p.f.a(r3, r3, r9, r2)
        L_0x020e:
            r9 = 0
        L_0x020f:
            if (r9 != 0) goto L_0x0226
            boolean r9 = com.adcolony.sdk.q0.f4714d0
            if (r9 != 0) goto L_0x0226
            com.adcolony.sdk.o r9 = com.adcolony.sdk.f.d()
            t2.m r9 = r9.l()
            java.lang.String r10 = "Downloaded controller sha1 does not match, retrying."
            r9.e(r3, r2, r10, r3)
            r8.b()
            return
        L_0x0226:
            boolean r9 = r8.E
            if (r9 != 0) goto L_0x0236
            boolean r9 = r8.G
            if (r9 != 0) goto L_0x0236
            com.adcolony.sdk.o$k r9 = new com.adcolony.sdk.o$k
            r9.<init>()
            com.adcolony.sdk.j0.h(r9)
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.o.a(com.adcolony.sdk.b0, com.adcolony.sdk.g, java.util.Map):void");
    }

    public final void b() {
        if (f.d().p().f4823u) {
            int i10 = this.K + 1;
            this.K = i10;
            this.L = Math.min(this.L * i10, 120);
            j0.h(new j());
            return;
        }
        p.f.a(0, 1, j.f.a("Max launch server download attempts hit, or AdColony is no longer", " active."), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0287  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(p.g r8, boolean r9) {
        /*
            r7 = this;
            r7.B = r9
            r7.f4672p = r8
            com.adcolony.sdk.l r0 = new com.adcolony.sdk.l
            r0.<init>()
            r7.f4657a = r0
            t2.m0 r0 = new t2.m0
            r0.<init>()
            com.adcolony.sdk.w r0 = new com.adcolony.sdk.w
            r0.<init>()
            r7.f4666j = r0
            r0.a()
            com.adcolony.sdk.h0 r0 = new com.adcolony.sdk.h0
            r0.<init>()
            r7.f4658b = r0
            com.adcolony.sdk.o r1 = com.adcolony.sdk.f.d()
            com.adcolony.sdk.w r1 = r1.i()
            r1.getClass()
            com.adcolony.sdk.x r2 = new com.adcolony.sdk.x
            r2.<init>(r1)
            com.adcolony.sdk.j0.h(r2)
            com.adcolony.sdk.d0 r1 = new com.adcolony.sdk.d0
            r1.<init>(r0)
            java.lang.String r2 = "WebServices.download"
            com.adcolony.sdk.f.c(r2, r1)
            com.adcolony.sdk.e0 r1 = new com.adcolony.sdk.e0
            r1.<init>(r0)
            java.lang.String r2 = "WebServices.get"
            com.adcolony.sdk.f.c(r2, r1)
            com.adcolony.sdk.f0 r1 = new com.adcolony.sdk.f0
            r1.<init>(r0)
            java.lang.String r0 = "WebServices.post"
            com.adcolony.sdk.f.c(r0, r1)
            com.adcolony.sdk.y r0 = new com.adcolony.sdk.y
            r0.<init>()
            r7.f4659c = r0
            t2.r0 r1 = new t2.r0
            r1.<init>(r0)
            java.lang.String r0 = "SessionInfo.stopped"
            com.adcolony.sdk.f.c(r0, r1)
            com.adcolony.sdk.i r0 = new com.adcolony.sdk.i
            r0.<init>()
            r7.f4660d = r0
            r0.c()
            com.adcolony.sdk.z r0 = new com.adcolony.sdk.z
            r0.<init>()
            r7.f4661e = r0
            com.adcolony.sdk.n0 r0 = new com.adcolony.sdk.n0
            r0.<init>()
            r7.f4662f = r0
            r0.f()
            t2.m r0 = new t2.m
            r0.<init>()
            r7.f4665i = r0
            r0.d()
            com.adcolony.sdk.a0 r0 = new com.adcolony.sdk.a0
            r0.<init>()
            r7.f4664h = r0
            r0.a()
            com.adcolony.sdk.g0 r0 = new com.adcolony.sdk.g0
            r0.<init>()
            r7.f4663g = r0
            r0.a()
            com.adcolony.sdk.m r0 = new com.adcolony.sdk.m
            r0.<init>()
            r7.f4667k = r0
            java.lang.String r0 = r0.a()
            r7.f4677u = r0
            android.content.Context r0 = com.adcolony.sdk.f.f4478a
            com.adcolony.sdk.a.a(r0, r8)
            r8 = 0
            r0 = 1
            if (r9 != 0) goto L_0x016a
            java.io.File r9 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.a0 r2 = r7.f4664h
            java.lang.String r2 = r2.f4418a
            java.lang.String r3 = "026ae9c9824b3e483fa6c71fa88f57ae27816141"
            java.lang.String r1 = androidx.activity.e.a(r1, r2, r3)
            r9.<init>(r1)
            boolean r9 = r9.exists()
            r7.F = r9
            java.io.File r9 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.adcolony.sdk.a0 r2 = r7.f4664h
            java.lang.String r2 = r2.f4418a
            java.lang.String r4 = "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5"
            java.lang.String r1 = androidx.activity.e.a(r1, r2, r4)
            r9.<init>(r1)
            boolean r9 = r9.exists()
            boolean r1 = r7.F
            if (r1 == 0) goto L_0x0116
            if (r9 == 0) goto L_0x0116
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.adcolony.sdk.a0 r1 = r7.f4664h
            java.lang.String r1 = r1.f4418a
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            org.json.JSONObject r9 = com.adcolony.sdk.r0.m(r9)
            java.lang.String r1 = "sdkVersion"
            java.lang.String r9 = r9.optString(r1)
            com.adcolony.sdk.w r1 = r7.f4666j
            r1.getClass()
            java.lang.String r1 = "4.5.0"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0116
            r9 = 1
            goto L_0x0117
        L_0x0116:
            r9 = 0
        L_0x0117:
            r7.E = r9
            com.adcolony.sdk.i0 r9 = com.adcolony.sdk.i0.d()
            com.adcolony.sdk.o$i r1 = new com.adcolony.sdk.o$i
            r1.<init>(r7)
            r9.f4557d = r1
            boolean r9 = r7.F
            if (r9 == 0) goto L_0x0144
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.adcolony.sdk.a0 r1 = r7.f4664h
            java.lang.String r1 = r1.f4418a
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            org.json.JSONObject r9 = com.adcolony.sdk.r0.m(r9)
            r7.f4674r = r9
            r7.h(r9)
        L_0x0144:
            boolean r9 = r7.E
            r7.f(r9, r8)
            android.content.Context r9 = com.adcolony.sdk.f.f4478a
            if (r9 == 0) goto L_0x016a
            android.app.Application$ActivityLifecycleCallbacks r1 = r7.M
            if (r1 != 0) goto L_0x016a
            t2.k0 r1 = new t2.k0
            r1.<init>(r7)
            r7.M = r1
            boolean r1 = r9 instanceof android.app.Application
            if (r1 == 0) goto L_0x015f
            android.app.Application r9 = (android.app.Application) r9
            goto L_0x0165
        L_0x015f:
            android.app.Activity r9 = (android.app.Activity) r9
            android.app.Application r9 = r9.getApplication()
        L_0x0165:
            android.app.Application$ActivityLifecycleCallbacks r1 = r7.M
            r9.registerActivityLifecycleCallbacks(r1)
        L_0x016a:
            com.adcolony.sdk.o$n r9 = new com.adcolony.sdk.o$n
            r9.<init>()
            java.lang.String r1 = "Module.load"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$o r9 = new com.adcolony.sdk.o$o
            r9.<init>()
            java.lang.String r1 = "Module.unload"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$p r9 = new com.adcolony.sdk.o$p
            r9.<init>()
            java.lang.String r1 = "AdColony.on_configured"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$q r9 = new com.adcolony.sdk.o$q
            r9.<init>()
            java.lang.String r1 = "AdColony.get_app_info"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$r r9 = new com.adcolony.sdk.o$r
            r9.<init>()
            java.lang.String r1 = "AdColony.v4vc_reward"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$s r9 = new com.adcolony.sdk.o$s
            r9.<init>()
            java.lang.String r1 = "AdColony.zone_info"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$t r9 = new com.adcolony.sdk.o$t
            r9.<init>()
            java.lang.String r1 = "AdColony.probe_launch_server"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$u r9 = new com.adcolony.sdk.o$u
            r9.<init>(r7)
            java.lang.String r1 = "Crypto.sha1"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$a r9 = new com.adcolony.sdk.o$a
            r9.<init>(r7)
            java.lang.String r1 = "Crypto.crc32"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$b r9 = new com.adcolony.sdk.o$b
            r9.<init>(r7)
            java.lang.String r1 = "Crypto.uuid"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$c r9 = new com.adcolony.sdk.o$c
            r9.<init>()
            java.lang.String r1 = "Device.query_advertiser_info"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$d r9 = new com.adcolony.sdk.o$d
            r9.<init>()
            java.lang.String r1 = "AdColony.controller_version"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$e r9 = new com.adcolony.sdk.o$e
            r9.<init>()
            java.lang.String r1 = "AdColony.provide_signals"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$f r9 = new com.adcolony.sdk.o$f
            r9.<init>()
            java.lang.String r1 = "AdColony.odt_calculate"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.o$g r9 = new com.adcolony.sdk.o$g
            r9.<init>(r7)
            java.lang.String r1 = "AdColony.odt_cache"
            com.adcolony.sdk.f.c(r1, r9)
            com.adcolony.sdk.a0 r9 = r7.f4664h
            java.lang.String r1 = "AppVersion"
            r2 = 2
            android.content.Context r3 = com.adcolony.sdk.f.f4478a     // Catch:{ Exception -> 0x027d }
            if (r3 == 0) goto L_0x027d
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ Exception -> 0x027d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x027d }
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r8)     // Catch:{ Exception -> 0x027d }
            long r3 = r3.lastUpdateTime     // Catch:{ Exception -> 0x027d }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r4 = (int) r3     // Catch:{ Exception -> 0x027d }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x027d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027d }
            r5.<init>()     // Catch:{ Exception -> 0x027d }
            java.lang.String r6 = r9.f4418a     // Catch:{ Exception -> 0x027d }
            r5.append(r6)     // Catch:{ Exception -> 0x027d }
            r5.append(r1)     // Catch:{ Exception -> 0x027d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x027d }
            r3.<init>(r5)     // Catch:{ Exception -> 0x027d }
            boolean r3 = r3.exists()     // Catch:{ Exception -> 0x027d }
            java.lang.String r5 = "last_update"
            if (r3 == 0) goto L_0x025a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027d }
            r3.<init>()     // Catch:{ Exception -> 0x027d }
            java.lang.String r6 = r9.f4418a     // Catch:{ Exception -> 0x027d }
            r3.append(r6)     // Catch:{ Exception -> 0x027d }
            r3.append(r1)     // Catch:{ Exception -> 0x027d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x027d }
            org.json.JSONObject r3 = com.adcolony.sdk.r0.m(r3)     // Catch:{ Exception -> 0x027d }
            int r3 = r3.optInt(r5)     // Catch:{ Exception -> 0x027d }
            if (r3 == r4) goto L_0x0257
            r3 = 1
            r6 = 1
            goto L_0x025c
        L_0x0257:
            r3 = 0
            r6 = 0
            goto L_0x025c
        L_0x025a:
            r3 = 1
            r6 = 2
        L_0x025c:
            if (r3 == 0) goto L_0x027e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x027b }
            r3.<init>()     // Catch:{ Exception -> 0x027b }
            com.adcolony.sdk.r0.j(r3, r5, r4)     // Catch:{ Exception -> 0x027b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027b }
            r4.<init>()     // Catch:{ Exception -> 0x027b }
            java.lang.String r9 = r9.f4418a     // Catch:{ Exception -> 0x027b }
            r4.append(r9)     // Catch:{ Exception -> 0x027b }
            r4.append(r1)     // Catch:{ Exception -> 0x027b }
            java.lang.String r9 = r4.toString()     // Catch:{ Exception -> 0x027b }
            com.adcolony.sdk.r0.o(r3, r9)     // Catch:{ Exception -> 0x027b }
            goto L_0x027e
        L_0x027b:
            goto L_0x027e
        L_0x027d:
            r6 = 0
        L_0x027e:
            if (r6 != r0) goto L_0x0282
            r9 = 1
            goto L_0x0283
        L_0x0282:
            r9 = 0
        L_0x0283:
            r7.H = r9
            if (r6 != r2) goto L_0x0288
            r8 = 1
        L_0x0288:
            r7.I = r8
            com.adcolony.sdk.o$h r8 = new com.adcolony.sdk.o$h
            r8.<init>()
            com.adcolony.sdk.j0.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.o.c(p.g, boolean):void");
    }

    public boolean d(int i10) {
        h0 a10 = this.f4657a.a(i10);
        q0 remove = this.f4676t.remove(Integer.valueOf(i10));
        boolean z10 = false;
        if (a10 == null) {
            return false;
        }
        if (remove != null && remove.M) {
            z10 = true;
        }
        l lVar = new l(this, remove);
        if (z10) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            new Handler().postDelayed(lVar, 1000);
        } else {
            lVar.run();
        }
        return true;
    }

    public boolean e(Context context, g gVar) {
        boolean z10;
        String str;
        if (context == null) {
            return false;
        }
        String str2 = "";
        a.C0050a aVar = null;
        u uVar = l().f25518d;
        try {
            aVar = b7.a.a(context);
        } catch (NoClassDefFoundError unused) {
            p.f.a(0, 1, "Google Play Services ads dependencies are missing. Collecting Android ID instead of Advertising ID.", false);
            return false;
        } catch (NoSuchMethodError unused2) {
            p.f.a(0, 1, "Google Play Services is out of date, please update to GPS 4.0+. Collecting Android ID instead of Advertising ID.", false);
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!Build.MANUFACTURER.equals("Amazon")) {
                p.f.a(0, 1, "Advertising ID is not available. Collecting Android ID instead of Advertising ID.", false);
                return false;
            }
            i().getClass();
            Context context2 = f.f4478a;
            if (context2 == null) {
                str = "";
            } else {
                str = Settings.Secure.getString(context2.getContentResolver(), "advertising_id");
            }
            str2 = str;
            i().getClass();
            Context context3 = f.f4478a;
            if (context3 != null) {
                try {
                    if (Settings.Secure.getInt(context3.getContentResolver(), "limit_ad_tracking") != 0) {
                        z10 = true;
                    }
                } catch (Settings.SettingNotFoundException unused3) {
                }
            }
        }
        z10 = false;
        String str3 = Build.MANUFACTURER;
        if (!str3.equals("Amazon") && aVar == null) {
            return false;
        }
        if (!str3.equals("Amazon")) {
            str2 = aVar.f3648a;
            z10 = aVar.f3649b;
        }
        i().f4795a = str2;
        if (uVar != null) {
            uVar.f4789e.put("advertisingId", i().f4795a);
        }
        i().f4798d = z10;
        g0 g0Var = i().f4797c;
        synchronized (g0Var) {
            g0Var.f25480a = true;
            g0Var.notifyAll();
        }
        if (gVar != null) {
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "advertiser_id", i().f4795a);
            y.a(jSONObject, "limit_ad_tracking", i().f4798d, gVar, jSONObject);
        }
        return true;
    }

    public final boolean f(boolean z10, boolean z11) {
        if (!f.e()) {
            return false;
        }
        this.G = z11;
        this.E = z10;
        if (z10 && !z11) {
            this.f4657a.b();
        }
        new Thread(new p(this)).start();
        return true;
    }

    public i g() {
        if (this.f4660d == null) {
            i iVar = new i();
            this.f4660d = iVar;
            iVar.c();
        }
        return this.f4660d;
    }

    public final void h(JSONObject jSONObject) {
        if (!q0.f4714d0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("logging");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            t2.m.f25514g = optJSONObject.optInt("send_level", 1);
            t2.m.f25512e = optJSONObject.optBoolean("log_private");
            t2.m.f25513f = optJSONObject.optInt("print_level", 3);
            t2.m mVar = this.f4665i;
            JSONArray optJSONArray = optJSONObject.optJSONArray("modules");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            mVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                }
                r0.g(jSONObject2, Integer.toString(optJSONObject2.optInt("id")), optJSONObject2);
            }
            mVar.f25515a = jSONObject2;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("metadata");
        if (optJSONObject3 == null) {
            optJSONObject3 = new JSONObject();
        }
        i().f4799e = optJSONObject3;
        y p10 = p();
        int optInt = optJSONObject3.optInt("session_timeout");
        p10.f4811a = optInt <= 0 ? p10.f4811a : (long) (optInt * 1000);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("controller");
        if (optJSONObject4 == null) {
            optJSONObject4 = new JSONObject();
        }
        this.f4681y = optJSONObject4.optString("version");
        this.O = optJSONObject3.optLong("signals_timeout", this.O);
        this.P = optJSONObject3.optLong("calculate_odt_timeout", this.P);
        this.Q = optJSONObject3.optBoolean("async_odt_query", this.Q);
        i0 d10 = i0.d();
        JSONObject optJSONObject5 = optJSONObject3.optJSONObject("odt_config");
        m mVar2 = new m(this);
        d10.getClass();
        Context applicationContext = f.e() ? f.f4478a.getApplicationContext() : null;
        if (applicationContext != null && optJSONObject5 != null) {
            try {
                d10.f4554a.execute(new f1(d10, optJSONObject5, mVar2, applicationContext));
            } catch (RejectedExecutionException e10) {
                StringBuilder sb2 = new StringBuilder();
                StringBuilder a10 = android.support.v4.media.a.a("ADCEventsRepository.open failed with: ");
                a10.append(e10.toString());
                sb2.append(a10.toString());
                p.f.a(0, 0, sb2.toString(), true);
            }
        }
    }

    public w i() {
        if (this.f4666j == null) {
            w wVar = new w();
            this.f4666j = wVar;
            wVar.a();
        }
        return this.f4666j;
    }

    public z j() {
        if (this.f4661e == null) {
            this.f4661e = new z();
        }
        return this.f4661e;
    }

    public n0 k() {
        if (this.f4662f == null) {
            n0 n0Var = new n0();
            this.f4662f = n0Var;
            n0Var.f();
        }
        return this.f4662f;
    }

    public t2.m l() {
        if (this.f4665i == null) {
            t2.m mVar = new t2.m();
            this.f4665i = mVar;
            mVar.d();
        }
        return this.f4665i;
    }

    public l m() {
        if (this.f4657a == null) {
            l lVar = new l();
            this.f4657a = lVar;
            lVar.b();
        }
        return this.f4657a;
    }

    public m n() {
        if (this.f4667k == null) {
            this.f4667k = new m();
        }
        return this.f4667k;
    }

    public p.g o() {
        if (this.f4672p == null) {
            this.f4672p = new p.g(3);
        }
        return this.f4672p;
    }

    public y p() {
        if (this.f4659c == null) {
            y yVar = new y();
            this.f4659c = yVar;
            f.c("SessionInfo.stopped", new r0(yVar));
        }
        return this.f4659c;
    }

    public a0 q() {
        if (this.f4664h == null) {
            a0 a0Var = new a0();
            this.f4664h = a0Var;
            a0Var.a();
        }
        return this.f4664h;
    }

    public g0 r() {
        if (this.f4663g == null) {
            g0 g0Var = new g0();
            this.f4663g = g0Var;
            g0Var.a();
        }
        return this.f4663g;
    }
}
