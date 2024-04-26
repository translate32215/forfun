package com.adcolony.sdk;

import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import b2.t;
import cb.d;
import com.startapp.b4;
import e8.bt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import mb.b;
import mb.c;
import mb.e;
import mb.f;
import mb.g;
import mb.h;
import org.json.JSONException;
import org.json.JSONObject;
import t2.n0;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public mb.a f4751a;

    /* renamed from: b  reason: collision with root package name */
    public d f4752b;

    /* renamed from: c  reason: collision with root package name */
    public t f4753c;

    /* renamed from: d  reason: collision with root package name */
    public List<g> f4754d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f4755e = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f4756f = "";

    /* renamed from: g  reason: collision with root package name */
    public boolean f4757g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4758h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4759i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4760j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4761k;

    /* renamed from: l  reason: collision with root package name */
    public int f4762l;

    /* renamed from: m  reason: collision with root package name */
    public int f4763m;

    /* renamed from: n  reason: collision with root package name */
    public String f4764n = "";

    /* renamed from: o  reason: collision with root package name */
    public String f4765o = "";

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4766a;

        public a(String str) {
            this.f4766a = str;
        }

        public void run() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            r0.j(jSONObject2, "session_type", r.this.f4755e);
            r0.e(jSONObject2, "session_id", r.this.f4756f);
            r0.e(jSONObject2, "event", this.f4766a);
            r0.e(jSONObject, "type", "iab_hook");
            r0.e(jSONObject, "message", jSONObject2.toString());
            new g("CustomMessage.controller_send", 0, jSONObject).b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[SYNTHETIC, Splitter:B:27:0x009a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(org.json.JSONObject r11, java.lang.String r12) {
        /*
            r10 = this;
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f4754d = r0
            r0 = -1
            r10.f4755e = r0
            java.lang.String r0 = ""
            r10.f4756f = r0
            r10.f4764n = r0
            r10.f4765o = r0
            java.lang.String r1 = "ad_unit_type"
            int r1 = r11.optInt(r1)
            java.lang.String r2 = "ad_type"
            java.lang.String r2 = r11.optString(r2)
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0026
            goto L_0x0030
        L_0x0026:
            if (r1 != r4) goto L_0x004e
            java.lang.String r1 = "video"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0050
        L_0x0032:
            java.lang.String r1 = "display"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x0050
        L_0x003c:
            java.lang.String r1 = "banner_display"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = "interstitial_display"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x004e
        L_0x004c:
            r1 = 2
            goto L_0x0050
        L_0x004e:
            int r1 = r10.f4755e
        L_0x0050:
            r10.f4755e = r1
            java.lang.String r1 = "skippable"
            boolean r1 = r11.optBoolean(r1)
            r10.f4760j = r1
            java.lang.String r1 = "skip_offset"
            int r1 = r11.optInt(r1)
            r10.f4762l = r1
            java.lang.String r1 = "video_duration"
            int r1 = r11.optInt(r1)
            r10.f4763m = r1
            java.lang.String r1 = "js_resources"
            org.json.JSONArray r1 = r11.optJSONArray(r1)
            if (r1 != 0) goto L_0x0077
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x0077:
            java.lang.String r2 = "verification_params"
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r2 != 0) goto L_0x0084
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
        L_0x0084:
            java.lang.String r5 = "vendor_keys"
            org.json.JSONArray r5 = r11.optJSONArray(r5)
            if (r5 != 0) goto L_0x0091
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
        L_0x0091:
            r10.f4765o = r12
            r12 = 0
        L_0x0094:
            int r6 = r1.length()
            if (r12 >= r6) goto L_0x00e7
            java.lang.String r6 = r2.optString(r12)     // Catch:{ MalformedURLException -> 0x00df }
            java.lang.String r7 = r5.optString(r12)     // Catch:{ MalformedURLException -> 0x00df }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00df }
            java.lang.String r9 = r1.optString(r12)     // Catch:{ MalformedURLException -> 0x00df }
            r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x00df }
            boolean r9 = r6.equals(r0)     // Catch:{ MalformedURLException -> 0x00df }
            if (r9 != 0) goto L_0x00c7
            boolean r9 = r7.equals(r0)     // Catch:{ MalformedURLException -> 0x00df }
            if (r9 != 0) goto L_0x00c7
            java.lang.String r9 = "VendorKey is null or empty"
            e.d.b(r7, r9)     // Catch:{ MalformedURLException -> 0x00df }
            java.lang.String r9 = "VerificationParameters is null or empty"
            e.d.b(r6, r9)     // Catch:{ MalformedURLException -> 0x00df }
            mb.g r9 = new mb.g     // Catch:{ MalformedURLException -> 0x00df }
            r9.<init>(r7, r8, r6)     // Catch:{ MalformedURLException -> 0x00df }
            goto L_0x00d9
        L_0x00c7:
            boolean r6 = r7.equals(r0)     // Catch:{ MalformedURLException -> 0x00df }
            r7 = 0
            if (r6 != 0) goto L_0x00d4
            mb.g r9 = new mb.g     // Catch:{ MalformedURLException -> 0x00df }
            r9.<init>(r7, r8, r7)     // Catch:{ MalformedURLException -> 0x00df }
            goto L_0x00d9
        L_0x00d4:
            mb.g r9 = new mb.g     // Catch:{ MalformedURLException -> 0x00df }
            r9.<init>(r7, r8, r7)     // Catch:{ MalformedURLException -> 0x00df }
        L_0x00d9:
            java.util.List<mb.g> r6 = r10.f4754d     // Catch:{ MalformedURLException -> 0x00df }
            r6.add(r9)     // Catch:{ MalformedURLException -> 0x00df }
            goto L_0x00e4
        L_0x00df:
            java.lang.String r6 = "Invalid js resource url passed to Omid"
            p.f.a(r3, r3, r6, r4)
        L_0x00e4:
            int r12 = r12 + 1
            goto L_0x0094
        L_0x00e7:
            com.adcolony.sdk.o r12 = com.adcolony.sdk.f.d()     // Catch:{ IOException -> 0x0100 }
            com.adcolony.sdk.n0 r12 = r12.k()     // Catch:{ IOException -> 0x0100 }
            java.lang.String r0 = "filepath"
            java.lang.String r11 = r11.optString(r0)     // Catch:{ IOException -> 0x0100 }
            java.lang.StringBuilder r11 = r12.a(r11, r4)     // Catch:{ IOException -> 0x0100 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0100 }
            r10.f4764n = r11     // Catch:{ IOException -> 0x0100 }
            goto L_0x0105
        L_0x0100:
            java.lang.String r11 = "Error loading IAB JS Client"
            p.f.a(r3, r3, r11, r4)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.r.<init>(org.json.JSONObject, java.lang.String):void");
    }

    public void a(WebView webView) throws IllegalArgumentException {
        String str;
        List<g> list;
        if (this.f4755e >= 0 && (str = this.f4764n) != null && !str.equals("") && (list = this.f4754d) != null) {
            if (!list.isEmpty() || this.f4755e == 2) {
                o d10 = f.d();
                f fVar = f.NATIVE;
                e eVar = e.BEGIN_TO_RENDER;
                int i10 = this.f4755e;
                if (i10 == 0) {
                    c cVar = c.VIDEO;
                    mb.a b10 = mb.a.b(bt.a(cVar, eVar, fVar, fVar, false), com.google.android.material.datepicker.c.a(d10.N, this.f4764n, this.f4754d, (String) null, (String) null));
                    this.f4751a = b10;
                    this.f4756f = ((h) b10).f21786h;
                    e("inject_javascript");
                } else if (i10 == 1) {
                    c cVar2 = c.NATIVE_DISPLAY;
                    mb.a b11 = mb.a.b(bt.a(cVar2, eVar, fVar, (f) null, false), com.google.android.material.datepicker.c.a(d10.N, this.f4764n, this.f4754d, (String) null, (String) null));
                    this.f4751a = b11;
                    this.f4756f = ((h) b11).f21786h;
                    e("inject_javascript");
                } else if (i10 == 2) {
                    c cVar3 = c.HTML_DISPLAY;
                    t2.g gVar = d10.N;
                    e.d.a(gVar, "Partner is null");
                    e.d.a(webView, "WebView is null");
                    mb.a b12 = mb.a.b(bt.a(cVar3, eVar, fVar, (f) null, false), new com.google.android.material.datepicker.c(gVar, webView, (String) null, (List) null, "", (String) null, b.HTML));
                    this.f4751a = b12;
                    this.f4756f = ((h) b12).f21786h;
                }
            }
        }
    }

    public void b(h hVar) {
        t tVar;
        nb.c cVar;
        mb.a aVar;
        if (!this.f4759i && this.f4755e >= 0 && this.f4751a != null) {
            mb.d dVar = mb.d.OTHER;
            e("register_ad_view");
            q0 q0Var = f.d().f4676t.get(Integer.valueOf(hVar.f4513s));
            if (q0Var == null && !hVar.f4505c.isEmpty()) {
                q0Var = (q0) hVar.f4505c.entrySet().iterator().next().getValue();
            }
            mb.a aVar2 = this.f4751a;
            if (aVar2 != null && q0Var != null) {
                aVar2.c(q0Var);
                ImageView imageView = q0Var.f4718b0;
                if (!(imageView == null || (aVar = q0Var.S.F) == null)) {
                    try {
                        aVar.a(imageView, dVar, (String) null);
                    } catch (RuntimeException unused) {
                    }
                }
            } else if (aVar2 != null) {
                aVar2.c(hVar);
                mb.a aVar3 = this.f4751a;
                hVar.F = aVar3;
                HashMap<Integer, View> hashMap = hVar.f4509g;
                if (!(aVar3 == null || hashMap == null)) {
                    for (Map.Entry<Integer, View> value : hashMap.entrySet()) {
                        hVar.a((View) value.getValue(), dVar);
                    }
                }
                e("register_obstructions");
            }
            n0 n0Var = new n0(this);
            ExecutorService executorService = a.f4411a;
            if (!f.f4480c) {
                p.f.a(0, 1, "Ignoring call to AdColony.addCustomMessageListener as AdColony has not yet been configured.", false);
            } else if (!j0.u("viewability_ad_event")) {
                p.f.a(0, 1, "Ignoring call to AdColony.addCustomMessageListener.", false);
            } else {
                f.d().f4671o.put("viewability_ad_event", n0Var);
            }
            if (this.f4755e != 0) {
                tVar = null;
            } else {
                mb.a aVar4 = this.f4751a;
                h hVar2 = (h) aVar4;
                e.d.a(aVar4, "AdSession is null");
                if (!(f.NATIVE == ((f) hVar2.f21780b.f14055c))) {
                    throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
                } else if (hVar2.f21784f) {
                    throw new IllegalStateException("AdSession is started");
                } else if (!hVar2.f21785g) {
                    sb.a aVar5 = hVar2.f21783e;
                    if (aVar5.f25192c == null) {
                        tVar = new t(hVar2);
                        aVar5.f25192c = tVar;
                    } else {
                        throw new IllegalStateException("MediaEvents already exists for AdSession");
                    }
                } else {
                    throw new IllegalStateException("AdSession is finished");
                }
            }
            this.f4753c = tVar;
            this.f4751a.d();
            mb.a aVar6 = this.f4751a;
            h hVar3 = (h) aVar6;
            e.d.a(aVar6, "AdSession is null");
            sb.a aVar7 = hVar3.f21783e;
            if (aVar7.f25191b != null) {
                throw new IllegalStateException("AdEvents already exists for AdSession");
            } else if (!hVar3.f21785g) {
                d dVar2 = new d(hVar3);
                aVar7.f25191b = dVar2;
                this.f4752b = dVar2;
                e("start_session");
                if (this.f4753c != null) {
                    nb.b bVar = nb.b.PREROLL;
                    if (this.f4760j) {
                        e.d.a(bVar, "Position is null");
                        cVar = new nb.c(true, Float.valueOf((float) this.f4762l), true, bVar);
                    } else {
                        e.d.a(bVar, "Position is null");
                        cVar = new nb.c(false, (Float) null, true, bVar);
                    }
                    d dVar3 = this.f4752b;
                    dVar3.getClass();
                    e.d.a(cVar, "VastProperties is null");
                    e.d.d((h) dVar3.f4374b);
                    e.d.e((h) dVar3.f4374b);
                    h hVar4 = (h) dVar3.f4374b;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("skippable", cVar.f22477a);
                        if (cVar.f22477a) {
                            jSONObject.put("skipOffset", cVar.f22478b);
                        }
                        jSONObject.put("autoPlay", cVar.f22479c);
                        jSONObject.put("position", cVar.f22480d);
                    } catch (JSONException e10) {
                        e.a.a("VastProperties: JSON error", e10);
                    }
                    if (!hVar4.f21788j) {
                        ob.e.f23667a.b(hVar4.f21783e.f(), "publishLoadedEvent", jSONObject);
                        hVar4.f21788j = true;
                    } else {
                        throw new IllegalStateException("Loaded event can only be sent once");
                    }
                } else {
                    d dVar4 = this.f4752b;
                    e.d.d((h) dVar4.f4374b);
                    e.d.e((h) dVar4.f4374b);
                    h hVar5 = (h) dVar4.f4374b;
                    if (!hVar5.f21788j) {
                        ob.e.f23667a.b(hVar5.f21783e.f(), "publishLoadedEvent", new Object[0]);
                        hVar5.f21788j = true;
                    } else {
                        throw new IllegalStateException("Loaded event can only be sent once");
                    }
                }
                this.f4759i = true;
            } else {
                throw new IllegalStateException("AdSession is finished");
            }
        }
    }

    public void c(String str, float f10) {
        if (f.e() && this.f4751a != null) {
            if (this.f4753c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c10 = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals("first_quartile")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c10 = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c10 = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals("resume")) {
                                c10 = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals("third_quartile")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c10 = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c10 = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals("pause")) {
                                c10 = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals("start")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c10 = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c10 = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c10 = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c10 = 13;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            this.f4752b.g();
                            t tVar = this.f4753c;
                            if (tVar != null) {
                                if (f10 <= 0.0f) {
                                    f10 = (float) this.f4763m;
                                }
                                tVar.Y(f10, 1.0f);
                            }
                            e(str);
                            return;
                        case 1:
                            this.f4753c.M();
                            e(str);
                            return;
                        case 2:
                            this.f4753c.N();
                            e(str);
                            return;
                        case 3:
                            this.f4753c.Z();
                            e(str);
                            return;
                        case 4:
                            this.f4761k = true;
                            this.f4753c.K();
                            e(str);
                            return;
                        case 5:
                            e(str);
                            d();
                            return;
                        case 6:
                        case 7:
                            t tVar2 = this.f4753c;
                            if (tVar2 != null) {
                                tVar2.X();
                            }
                            e(str);
                            d();
                            return;
                        case b4.f10106f /*8*/:
                            this.f4753c.a0(0.0f);
                            e(str);
                            return;
                        case 9:
                            this.f4753c.a0(1.0f);
                            e(str);
                            return;
                        case 10:
                            if (!this.f4757g && !this.f4758h && !this.f4761k) {
                                this.f4753c.R();
                                e(str);
                                this.f4757g = true;
                                this.f4758h = false;
                                return;
                            }
                            return;
                        case 11:
                            if (this.f4757g && !this.f4761k) {
                                this.f4753c.T();
                                e(str);
                                this.f4757g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f4753c.J();
                            e(str);
                            return;
                        case 13:
                            this.f4753c.I();
                            e(str);
                            return;
                        case 14:
                        case 15:
                            this.f4753c.G(nb.a.CLICK);
                            e(str);
                            if (this.f4758h && !this.f4757g && !this.f4761k) {
                                this.f4753c.R();
                                e("pause");
                                this.f4757g = true;
                                this.f4758h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e10) {
                    StringBuilder a10 = t.f.a("Recording IAB event for ", str);
                    StringBuilder a11 = android.support.v4.media.a.a(" caused ");
                    a11.append(e10.getClass());
                    a10.append(a11.toString());
                    p.f.a(0, 1, a10.toString(), true);
                }
            }
        }
    }

    public void d() {
        ExecutorService executorService = a.f4411a;
        if (!f.f4480c) {
            p.f.a(0, 1, "Ignoring call to AdColony.removeCustomMessageListener as AdColony has not yet been configured.", false);
        } else {
            f.d().f4671o.remove("viewability_ad_event");
        }
        h hVar = (h) this.f4751a;
        if (!hVar.f21785g) {
            hVar.f21782d.clear();
            if (!hVar.f21785g) {
                hVar.f21781c.clear();
            }
            hVar.f21785g = true;
            ob.e.f23667a.b(hVar.f21783e.f(), "finishSession", new Object[0]);
            ob.a aVar = ob.a.f23656c;
            boolean c10 = aVar.c();
            aVar.f23657a.remove(hVar);
            aVar.f23658b.remove(hVar);
            if (c10 && !aVar.c()) {
                ob.f a10 = ob.f.a();
                a10.getClass();
                tb.a aVar2 = tb.a.f25861g;
                aVar2.getClass();
                Handler handler = tb.a.f25863i;
                if (handler != null) {
                    handler.removeCallbacks(tb.a.f25865k);
                    tb.a.f25863i = null;
                }
                aVar2.f25866a.clear();
                tb.a.f25862h.post(new tb.b(aVar2));
                lb.b bVar = a10.f23672d;
                bVar.f21241a.getContentResolver().unregisterContentObserver(bVar);
            }
            hVar.f21783e.e();
            hVar.f21783e = null;
        }
        e("end_session");
        this.f4751a = null;
    }

    public final void e(String str) {
        try {
            j0.f4565a.execute(new a(str));
        } catch (RejectedExecutionException e10) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder a10 = android.support.v4.media.a.a("ADCOmidManager.sendIabCustomMessage failed with error: ");
            a10.append(e10.toString());
            sb2.append(a10.toString());
            p.f.a(0, 0, sb2.toString(), true);
        }
    }
}
