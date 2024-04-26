package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;
import t2.f0;
import t2.y;

public class g0 {

    public class a implements f0 {
        public a() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = gVar.f4485b;
            Intent type = new Intent("android.intent.action.SEND").setType("text/plain");
            Intent putExtra = type.putExtra("android.intent.extra.TEXT", jSONObject2.optString("text") + " " + jSONObject2.optString("url"));
            String optString = jSONObject2.optString("ad_session_id");
            if (j0.g(putExtra, true)) {
                r0.k(jSONObject, "success", true);
                gVar.a(jSONObject).b();
                g0Var.d(optString);
                g0Var.b(optString);
                g0Var.c(optString);
                return;
            }
            j0.i("Unable to create social post.", 0);
            r0.k(jSONObject, "success", false);
            gVar.a(jSONObject).b();
        }
    }

    public class b implements f0 {
        public b() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            i g10 = f.d().g();
            String optString = jSONObject.optString("ad_session_id");
            d dVar = g10.f4526b.get(optString);
            b bVar = g10.f4528d.get(optString);
            if ((dVar != null && dVar.f4462a != null && dVar.f4463b != null) || (bVar != null && bVar.getListener() != null)) {
                if (bVar == null) {
                    new g("AdUnit.make_in_app_purchase", dVar.f4463b.f4513s).b();
                }
                g0Var.b(optString);
                g0Var.c(optString);
            }
        }
    }

    public class c implements f0 {
        public c() {
        }

        public void a(g gVar) {
            g0.this.getClass();
            String optString = gVar.f4485b.optString("ad_session_id");
            Context context = f.f4478a;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            boolean z10 = activity instanceof AdColonyAdViewActivity;
            if (activity instanceof t2.l) {
                if (z10) {
                    ((AdColonyAdViewActivity) activity).f();
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                r0.e(jSONObject, "id", optString);
                new g("AdSession.on_request_close", ((t2.l) activity).f25503c, jSONObject).b();
            }
        }
    }

    public class d implements f0 {
        public d() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            Context context = f.f4478a;
            if (context != null && f.f()) {
                String optString = jSONObject.optString("ad_session_id");
                o d10 = f.d();
                b bVar = d10.g().f4528d.get(optString);
                if (bVar == null) {
                    return;
                }
                if ((bVar.getTrustedDemandSource() || bVar.getUserInteraction()) && d10.f4669m != bVar) {
                    bVar.setExpandMessage(gVar);
                    bVar.setExpandedWidth(jSONObject.optInt("width"));
                    bVar.setExpandedHeight(jSONObject.optInt("height"));
                    bVar.setOrientation(jSONObject.optInt("orientation", -1));
                    bVar.setNoCloseButton(jSONObject.optBoolean("use_custom_close"));
                    d10.f4669m = bVar;
                    d10.f4668l = bVar.getContainer();
                    Intent intent = new Intent(context, AdColonyAdViewActivity.class);
                    g0Var.c(optString);
                    g0Var.b(optString);
                    j0.f(intent);
                }
            }
        }
    }

    public class e implements f0 {
        public e() {
        }

        public void a(g gVar) {
            g0.this.getClass();
            b bVar = f.d().g().f4528d.get(gVar.f4485b.optString("ad_session_id"));
            if (bVar != null) {
                bVar.setNoCloseButton(gVar.f4485b.optBoolean("use_custom_close"));
            }
        }
    }

    public class f implements f0 {
        public f() {
        }

        public void a(g gVar) {
            int i10;
            g0.this.getClass();
            JSONObject jSONObject = gVar.f4485b;
            String optString = jSONObject.optString("ad_session_id");
            int optInt = jSONObject.optInt("orientation");
            i g10 = f.d().g();
            b bVar = g10.f4528d.get(optString);
            d dVar = g10.f4526b.get(optString);
            Context context = f.f4478a;
            if (bVar != null) {
                bVar.setOrientation(optInt);
            } else if (dVar != null) {
                dVar.f4465d = optInt;
            }
            if (dVar == null && bVar == null) {
                p.f.a(0, 0, j.f.a("Invalid ad session id sent with set orientation properties message: ", optString), true);
            } else if (context instanceof t2.l) {
                t2.l lVar = (t2.l) context;
                if (bVar == null) {
                    i10 = dVar.f4465d;
                } else {
                    i10 = bVar.getOrientation();
                }
                lVar.b(i10);
            }
        }
    }

    public class g implements f0 {
        public g() {
        }

        public void a(g gVar) {
            g0.this.getClass();
            JSONObject jSONObject = gVar.f4485b;
            String optString = r0.n(jSONObject, "clickOverride").optString("url");
            String optString2 = jSONObject.optString("ad_session_id");
            i g10 = f.d().g();
            d dVar = g10.f4526b.get(optString2);
            b bVar = g10.f4528d.get(optString2);
            if (dVar != null) {
                dVar.f4469h = optString;
            } else if (bVar != null) {
                bVar.setClickOverride(optString);
            }
        }
    }

    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4493a;

        public h(g0 g0Var, String str) {
            this.f4493a = str;
        }

        public void run() {
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "type", "open_hook");
            r0.e(jSONObject, "message", this.f4493a);
            new g("CustomMessage.controller_send", 0, jSONObject).b();
        }
    }

    public class i implements f0 {
        public i() {
        }

        public void a(g gVar) {
            g0.this.f(gVar);
        }
    }

    public class j implements f0 {
        public j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00d6 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.adcolony.sdk.g r14) {
            /*
                r13 = this;
                com.adcolony.sdk.g0 r0 = com.adcolony.sdk.g0.this
                r0.getClass()
                java.lang.String r1 = "success"
                java.lang.String r2 = "Error saving screenshot."
                android.content.Context r3 = com.adcolony.sdk.f.f4478a
                r4 = 0
                if (r3 == 0) goto L_0x010a
                boolean r5 = r3 instanceof android.app.Activity
                if (r5 != 0) goto L_0x0014
                goto L_0x010a
            L_0x0014:
                java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
                int r5 = d0.a.a(r3, r5)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                if (r5 != 0) goto L_0x00f2
                org.json.JSONObject r5 = r14.f4485b     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.lang.String r6 = "ad_session_id"
                java.lang.String r5 = r5.optString(r6)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r0.b(r5)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r5.<init>()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r6.<init>()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.io.File r7 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.lang.String r7 = r7.toString()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r6.append(r7)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.lang.String r7 = "/Pictures/AdColony_Screenshots/AdColony_Screenshot_"
                r6.append(r7)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r6.append(r7)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.lang.String r7 = ".jpg"
                r6.append(r7)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.lang.String r6 = r6.toString()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r7 = r3
                android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ NoClassDefFoundError -> 0x0102 }
                android.view.Window r7 = r7.getWindow()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                android.view.View r7 = r7.getDecorView()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                android.view.View r7 = r7.getRootView()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r8 = 1
                r7.setDrawingCacheEnabled(r8)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                android.graphics.Bitmap r9 = r7.getDrawingCache()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r7.setDrawingCacheEnabled(r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00b1 }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
                r10.<init>()     // Catch:{ Exception -> 0x00b1 }
                java.io.File r11 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00b1 }
                java.lang.String r11 = r11.getPath()     // Catch:{ Exception -> 0x00b1 }
                r10.append(r11)     // Catch:{ Exception -> 0x00b1 }
                java.lang.String r11 = "/Pictures"
                r10.append(r11)     // Catch:{ Exception -> 0x00b1 }
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00b1 }
                r7.<init>(r10)     // Catch:{ Exception -> 0x00b1 }
                java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x00b1 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
                r11.<init>()     // Catch:{ Exception -> 0x00b1 }
                java.io.File r12 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00b1 }
                java.lang.String r12 = r12.getPath()     // Catch:{ Exception -> 0x00b1 }
                r11.append(r12)     // Catch:{ Exception -> 0x00b1 }
                java.lang.String r12 = "/Pictures/AdColony_Screenshots"
                r11.append(r12)     // Catch:{ Exception -> 0x00b1 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00b1 }
                r10.<init>(r11)     // Catch:{ Exception -> 0x00b1 }
                r7.mkdirs()     // Catch:{ Exception -> 0x00b1 }
                r10.mkdirs()     // Catch:{ Exception -> 0x00b1 }
            L_0x00b1:
                java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r7.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r10.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r11 = 90
                r9.compress(r7, r11, r10)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r10.flush()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r10.close()     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                java.lang.String[] r7 = new java.lang.String[r8]     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r7[r4] = r6     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r6 = 0
                t2.s0 r8 = new t2.s0     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                r8.<init>(r0, r5, r14)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                android.media.MediaScannerConnection.scanFile(r3, r7, r6, r8)     // Catch:{ FileNotFoundException -> 0x00e4, IOException -> 0x00d6 }
                goto L_0x010a
            L_0x00d6:
                com.adcolony.sdk.j0.i(r2, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                com.adcolony.sdk.r0.k(r5, r1, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                com.adcolony.sdk.g r0 = r14.a(r5)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r0.b()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                goto L_0x010a
            L_0x00e4:
                com.adcolony.sdk.j0.i(r2, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                com.adcolony.sdk.r0.k(r5, r1, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                com.adcolony.sdk.g r0 = r14.a(r5)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r0.b()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                goto L_0x010a
            L_0x00f2:
                com.adcolony.sdk.j0.i(r2, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                org.json.JSONObject r0 = r14.f4485b     // Catch:{ NoClassDefFoundError -> 0x0102 }
                com.adcolony.sdk.r0.k(r0, r1, r4)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                com.adcolony.sdk.g r0 = r14.a(r0)     // Catch:{ NoClassDefFoundError -> 0x0102 }
                r0.b()     // Catch:{ NoClassDefFoundError -> 0x0102 }
                goto L_0x010a
            L_0x0102:
                com.adcolony.sdk.j0.i(r2, r4)
                org.json.JSONObject r0 = r14.f4485b
                t2.y.a(r0, r1, r4, r14, r0)
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.g0.j.a(com.adcolony.sdk.g):void");
        }
    }

    public class k implements f0 {
        public k() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = gVar.f4485b;
            Intent intent = new Intent("android.intent.action.DIAL");
            StringBuilder a10 = android.support.v4.media.a.a("tel:");
            a10.append(jSONObject2.optString("phone_number"));
            Intent data = intent.setData(Uri.parse(a10.toString()));
            String optString = jSONObject2.optString("ad_session_id");
            if (j0.f(data)) {
                r0.k(jSONObject, "success", true);
                gVar.a(jSONObject).b();
                g0Var.d(optString);
                g0Var.b(optString);
                g0Var.c(optString);
                return;
            }
            j0.i("Failed to dial number.", 0);
            r0.k(jSONObject, "success", false);
            gVar.a(jSONObject).b();
        }
    }

    public class l implements f0 {
        public l() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = gVar.f4485b;
            JSONObject jSONObject2 = new JSONObject();
            String optString = jSONObject.optString("ad_session_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("recipients");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            String str = "";
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (i10 != 0) {
                    str = j.f.a(str, ";");
                }
                StringBuilder a10 = android.support.v4.media.a.a(str);
                a10.append(optJSONArray.optString(i10));
                str = a10.toString();
            }
            if (j0.f(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + str)).putExtra("sms_body", jSONObject.optString("body")))) {
                r0.k(jSONObject2, "success", true);
                gVar.a(jSONObject2).b();
                g0Var.d(optString);
                g0Var.b(optString);
                g0Var.c(optString);
                return;
            }
            j0.i("Failed to create sms.", 0);
            r0.k(jSONObject2, "success", false);
            gVar.a(jSONObject2).b();
        }
    }

    public class m implements f0 {
        public m() {
        }

        public void a(g gVar) {
            g0.this.getClass();
            Context context = f.f4478a;
            if (context != null) {
                int optInt = gVar.f4485b.optInt("length_ms", 500);
                JSONObject jSONObject = new JSONObject();
                JSONArray r10 = j0.r(context);
                boolean z10 = false;
                for (int i10 = 0; i10 < r10.length(); i10++) {
                    if (r10.optString(i10).equals("android.permission.VIBRATE")) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    p.f.a(0, 1, "No vibrate permission detected.", false);
                    y.a(jSONObject, "success", false, gVar, jSONObject);
                    return;
                }
                try {
                    Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate((long) optInt);
                        r0.k(jSONObject, "success", true);
                        gVar.a(jSONObject).b();
                        return;
                    }
                } catch (Exception unused) {
                    p.f.a(0, 1, "Vibrate command failed.", false);
                }
                y.a(jSONObject, "success", false, gVar, jSONObject);
            }
        }
    }

    public class n implements f0 {
        public n() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = gVar.f4485b;
            String optString = jSONObject2.optString("url");
            String optString2 = jSONObject2.optString("ad_session_id");
            b bVar = f.d().g().f4528d.get(optString2);
            if (bVar == null || bVar.getTrustedDemandSource() || bVar.getUserInteraction()) {
                if (optString.startsWith("browser")) {
                    optString = optString.replaceFirst("browser", "http");
                }
                if (optString.startsWith("safari")) {
                    optString = optString.replaceFirst("safari", "http");
                }
                g0Var.e(optString);
                if (j0.f(new Intent("android.intent.action.VIEW", Uri.parse(optString)))) {
                    r0.k(jSONObject, "success", true);
                    gVar.a(jSONObject).b();
                    g0Var.d(optString2);
                    g0Var.b(optString2);
                    g0Var.c(optString2);
                    return;
                }
                j0.i("Failed to launch browser.", 0);
                r0.k(jSONObject, "success", false);
                gVar.a(jSONObject).b();
            }
        }
    }

    public class o implements f0 {
        public o() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = gVar.f4485b;
            JSONArray i10 = r0.i(jSONObject2, "recipients");
            boolean optBoolean = jSONObject2.optBoolean("html");
            String optString = jSONObject2.optString("subject");
            String optString2 = jSONObject2.optString("body");
            String optString3 = jSONObject2.optString("ad_session_id");
            String[] strArr = new String[i10.length()];
            for (int i11 = 0; i11 < i10.length(); i11++) {
                strArr[i11] = i10.optString(i11);
            }
            Intent intent = new Intent("android.intent.action.SEND");
            if (!optBoolean) {
                intent.setType("plain/text");
            }
            intent.putExtra("android.intent.extra.SUBJECT", optString).putExtra("android.intent.extra.TEXT", optString2).putExtra("android.intent.extra.EMAIL", strArr);
            if (j0.f(intent)) {
                r0.k(jSONObject, "success", true);
                gVar.a(jSONObject).b();
                g0Var.d(optString3);
                g0Var.b(optString3);
                g0Var.c(optString3);
                return;
            }
            j0.i("Failed to send email.", 0);
            r0.k(jSONObject, "success", false);
            gVar.a(jSONObject).b();
        }
    }

    public class p implements f0 {
        public p() {
        }

        public void a(g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = gVar.f4485b;
            String optString = jSONObject2.optString("ad_session_id");
            if (jSONObject2.optBoolean("deep_link")) {
                g0Var.f(gVar);
                return;
            }
            Context context = f.f4478a;
            if (context != null) {
                if (j0.f(context.getPackageManager().getLaunchIntentForPackage(jSONObject2.optString("handle")))) {
                    r0.k(jSONObject, "success", true);
                    gVar.a(jSONObject).b();
                    g0Var.d(optString);
                    g0Var.b(optString);
                    g0Var.c(optString);
                    return;
                }
                j0.i("Failed to launch external application.", 0);
                r0.k(jSONObject, "success", false);
                gVar.a(jSONObject).b();
            }
        }
    }

    public class q implements f0 {
        public q() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01f0  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x020f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.adcolony.sdk.g r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                com.adcolony.sdk.g0 r2 = com.adcolony.sdk.g0.this
                r2.getClass()
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                org.json.JSONObject r4 = r1.f4485b
                java.lang.String r5 = "ad_session_id"
                java.lang.String r5 = r4.optString(r5)
                java.lang.String r6 = "params"
                org.json.JSONObject r4 = r4.optJSONObject(r6)
                if (r4 != 0) goto L_0x0023
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>()
            L_0x0023:
                java.lang.String r6 = "recurrence"
                org.json.JSONObject r6 = r4.optJSONObject(r6)
                if (r6 != 0) goto L_0x0030
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
            L_0x0030:
                org.json.JSONArray r7 = new org.json.JSONArray
                r7.<init>()
                org.json.JSONArray r8 = new org.json.JSONArray
                r8.<init>()
                org.json.JSONArray r9 = new org.json.JSONArray
                r9.<init>()
                java.lang.String r10 = "description"
                java.lang.String r11 = r4.optString(r10)
                java.lang.String r12 = "location"
                r4.optString(r12)
                java.lang.String r12 = "start"
                java.lang.String r12 = r4.optString(r12)
                java.lang.String r13 = "end"
                java.lang.String r13 = r4.optString(r13)
                java.lang.String r14 = "summary"
                java.lang.String r4 = r4.optString(r14)
                int r14 = r6.length()
                java.lang.String r15 = ""
                if (r14 <= 0) goto L_0x00a0
                java.lang.String r7 = "expires"
                java.lang.String r7 = r6.optString(r7)
                java.lang.String r8 = "frequency"
                java.lang.String r8 = r6.optString(r8)
                java.util.Locale r9 = java.util.Locale.getDefault()
                java.lang.String r8 = r8.toUpperCase(r9)
                java.lang.String r9 = "daysInWeek"
                org.json.JSONArray r9 = r6.optJSONArray(r9)
                if (r9 != 0) goto L_0x0085
                org.json.JSONArray r9 = new org.json.JSONArray
                r9.<init>()
            L_0x0085:
                java.lang.String r14 = "daysInMonth"
                org.json.JSONArray r14 = r6.optJSONArray(r14)
                if (r14 != 0) goto L_0x0092
                org.json.JSONArray r14 = new org.json.JSONArray
                r14.<init>()
            L_0x0092:
                java.lang.String r0 = "daysInYear"
                org.json.JSONArray r0 = r6.optJSONArray(r0)
                if (r0 != 0) goto L_0x00a5
                org.json.JSONArray r0 = new org.json.JSONArray
                r0.<init>()
                goto L_0x00a5
            L_0x00a0:
                r14 = r8
                r0 = r9
                r8 = r15
                r9 = r7
                r7 = r8
            L_0x00a5:
                boolean r15 = r4.equals(r15)
                if (r15 == 0) goto L_0x00ac
                r4 = r11
            L_0x00ac:
                java.util.Date r12 = com.adcolony.sdk.j0.x(r12)
                java.util.Date r13 = com.adcolony.sdk.j0.x(r13)
                java.util.Date r7 = com.adcolony.sdk.j0.x(r7)
                java.lang.String r15 = "success"
                r16 = r2
                if (r12 == 0) goto L_0x0226
                if (r13 != 0) goto L_0x00c2
                goto L_0x0226
            L_0x00c2:
                r17 = r3
                long r2 = r12.getTime()
                r18 = r2
                long r1 = r13.getTime()
                r20 = 0
                if (r7 == 0) goto L_0x00e1
                long r22 = r7.getTime()
                long r12 = r12.getTime()
                long r22 = r22 - r12
                r12 = 1000(0x3e8, double:4.94E-321)
                long r22 = r22 / r12
                goto L_0x00e3
            L_0x00e1:
                r22 = r20
            L_0x00e3:
                java.lang.String r3 = "DAILY"
                boolean r3 = r8.equals(r3)
                r12 = 1
                if (r3 == 0) goto L_0x00f3
                r20 = 86400(0x15180, double:4.26873E-319)
                long r22 = r22 / r20
                goto L_0x011c
            L_0x00f3:
                java.lang.String r3 = "WEEKLY"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x0101
                r20 = 604800(0x93a80, double:2.98811E-318)
                long r22 = r22 / r20
                goto L_0x011c
            L_0x0101:
                java.lang.String r3 = "MONTHLY"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x010f
                r20 = 2629800(0x2820a8, double:1.299294E-317)
                long r22 = r22 / r20
                goto L_0x011c
            L_0x010f:
                java.lang.String r3 = "YEARLY"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x011e
                r20 = 31557600(0x1e187e0, double:1.5591526E-316)
                long r22 = r22 / r20
            L_0x011c:
                long r20 = r22 + r12
            L_0x011e:
                r12 = r20
                int r3 = r6.length()
                java.lang.String r6 = "endTime"
                java.lang.String r7 = "beginTime"
                r20 = r5
                java.lang.String r5 = "title"
                r21 = r15
                java.lang.String r15 = "vnd.android.cursor.item/event"
                r22 = r1
                java.lang.String r1 = "android.intent.action.EDIT"
                if (r3 <= 0) goto L_0x01cd
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "FREQ="
                r2.append(r3)
                r2.append(r8)
                java.lang.String r3 = ";COUNT="
                r2.append(r3)
                r2.append(r12)
                java.lang.String r2 = r2.toString()
                int r3 = r9.length()     // Catch:{ JSONException -> 0x01a9 }
                if (r3 == 0) goto L_0x016d
                java.lang.String r3 = com.adcolony.sdk.j0.e(r9)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01a9 }
                r8.<init>()     // Catch:{ JSONException -> 0x01a9 }
                r8.append(r2)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r9 = ";BYDAY="
                r8.append(r9)     // Catch:{ JSONException -> 0x01a9 }
                r8.append(r3)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r2 = r8.toString()     // Catch:{ JSONException -> 0x01a9 }
            L_0x016d:
                int r3 = r14.length()     // Catch:{ JSONException -> 0x01a9 }
                if (r3 == 0) goto L_0x018b
                java.lang.String r3 = com.adcolony.sdk.j0.n(r14)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01a9 }
                r8.<init>()     // Catch:{ JSONException -> 0x01a9 }
                r8.append(r2)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r9 = ";BYMONTHDAY="
                r8.append(r9)     // Catch:{ JSONException -> 0x01a9 }
                r8.append(r3)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r2 = r8.toString()     // Catch:{ JSONException -> 0x01a9 }
            L_0x018b:
                int r3 = r0.length()     // Catch:{ JSONException -> 0x01a9 }
                if (r3 == 0) goto L_0x01a9
                java.lang.String r0 = com.adcolony.sdk.j0.n(r0)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01a9 }
                r3.<init>()     // Catch:{ JSONException -> 0x01a9 }
                r3.append(r2)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r8 = ";BYYEARDAY="
                r3.append(r8)     // Catch:{ JSONException -> 0x01a9 }
                r3.append(r0)     // Catch:{ JSONException -> 0x01a9 }
                java.lang.String r2 = r3.toString()     // Catch:{ JSONException -> 0x01a9 }
            L_0x01a9:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r1)
                android.content.Intent r0 = r0.setType(r15)
                android.content.Intent r0 = r0.putExtra(r5, r4)
                android.content.Intent r0 = r0.putExtra(r10, r11)
                r8 = r18
                android.content.Intent r0 = r0.putExtra(r7, r8)
                r12 = r22
                android.content.Intent r0 = r0.putExtra(r6, r12)
                java.lang.String r1 = "rrule"
                android.content.Intent r0 = r0.putExtra(r1, r2)
                goto L_0x01ea
            L_0x01cd:
                r8 = r18
                r12 = r22
                android.content.Intent r0 = new android.content.Intent
                r0.<init>(r1)
                android.content.Intent r0 = r0.setType(r15)
                android.content.Intent r0 = r0.putExtra(r5, r4)
                android.content.Intent r0 = r0.putExtra(r10, r11)
                android.content.Intent r0 = r0.putExtra(r7, r8)
                android.content.Intent r0 = r0.putExtra(r6, r12)
            L_0x01ea:
                boolean r0 = com.adcolony.sdk.j0.f(r0)
                if (r0 == 0) goto L_0x020f
                r0 = 1
                r1 = r17
                r2 = r21
                com.adcolony.sdk.r0.k(r1, r2, r0)
                r0 = r25
                com.adcolony.sdk.g r0 = r0.a(r1)
                r0.b()
                r0 = r16
                r1 = r20
                r0.d(r1)
                r0.b(r1)
                r0.c(r1)
                goto L_0x0239
            L_0x020f:
                r0 = r25
                r1 = r17
                r2 = r21
                java.lang.String r3 = "Unable to create Calendar Event."
                r4 = 0
                com.adcolony.sdk.j0.i(r3, r4)
                com.adcolony.sdk.r0.k(r1, r2, r4)
                com.adcolony.sdk.g r0 = r0.a(r1)
                r0.b()
                goto L_0x0239
            L_0x0226:
                r0 = r1
                r1 = r3
                r2 = r15
                r4 = 0
                java.lang.String r3 = "Unable to create Calendar Event"
                com.adcolony.sdk.j0.i(r3, r4)
                com.adcolony.sdk.r0.k(r1, r2, r4)
                com.adcolony.sdk.g r0 = r0.a(r1)
                r0.b()
            L_0x0239:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.g0.q.a(com.adcolony.sdk.g):void");
        }
    }

    public void a() {
        f.c("System.open_store", new i());
        f.c("System.save_screenshot", new j());
        f.c("System.telephone", new k());
        f.c("System.sms", new l());
        f.c("System.vibrate", new m());
        f.c("System.open_browser", new n());
        f.c("System.mail", new o());
        f.c("System.launch_app", new p());
        f.c("System.create_calendar_event", new q());
        f.c("System.social_post", new a());
        f.c("System.make_in_app_purchase", new b());
        f.c("System.close", new c());
        f.c("System.expand", new d());
        f.c("System.use_custom_close", new e());
        f.c("System.set_orientation_properties", new f());
        f.c("System.click_override", new g());
    }

    public void b(String str) {
        t2.i iVar;
        i g10 = f.d().g();
        d dVar = g10.f4526b.get(str);
        if (dVar == null || (iVar = dVar.f4462a) == null) {
            b bVar = g10.f4528d.get(str);
            if (bVar != null) {
                bVar.getListener();
                return;
            }
            return;
        }
        iVar.getClass();
    }

    public final boolean c(String str) {
        if (f.d().g().f4528d.get(str) == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "ad_session_id", str);
        new g("MRAID.on_event", 1, jSONObject).b();
        return true;
    }

    public void d(String str) {
        t2.i iVar;
        i g10 = f.d().g();
        d dVar = g10.f4526b.get(str);
        if (dVar == null || (iVar = dVar.f4462a) == null) {
            b bVar = g10.f4528d.get(str);
            if (bVar != null) {
                bVar.getListener();
                return;
            }
            return;
        }
        iVar.getClass();
    }

    public final void e(String str) {
        try {
            j0.f4565a.execute(new h(this, str));
        } catch (RejectedExecutionException e10) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder a10 = android.support.v4.media.a.a("ADCSystem.sendOpenCustomMessage failed with error: ");
            a10.append(e10.toString());
            sb2.append(a10.toString());
            p.f.a(0, 0, sb2.toString(), true);
        }
    }

    public boolean f(g gVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = gVar.f4485b;
        String optString = jSONObject2.optString("product_id");
        String optString2 = jSONObject2.optString("ad_session_id");
        if (optString.equals("")) {
            optString = jSONObject2.optString("handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(optString));
        e(optString);
        if (j0.f(intent)) {
            r0.k(jSONObject, "success", true);
            gVar.a(jSONObject).b();
            d(optString2);
            b(optString2);
            c(optString2);
            return true;
        }
        j0.i("Unable to open.", 0);
        r0.k(jSONObject, "success", false);
        gVar.a(jSONObject).b();
        return false;
    }
}
