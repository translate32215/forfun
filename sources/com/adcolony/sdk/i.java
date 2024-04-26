package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import t2.a0;
import t2.b0;
import t2.c0;
import t2.d0;
import t2.f0;
import t2.s;
import t2.t;
import t2.u;
import t2.v;
import t2.w;
import t2.x;
import t2.y;
import t2.z;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, h> f4525a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<String, d> f4526b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, t2.f> f4527c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, b> f4528d;

    public class a implements f0 {
        public a() {
        }

        public void a(g gVar) {
            i iVar = i.this;
            iVar.getClass();
            String optString = gVar.f4485b.optString("id");
            t2.f remove = iVar.f4527c.remove(optString);
            if (remove == null) {
                iVar.b(gVar.f4484a, optString);
            } else {
                j0.h(new d0(iVar, remove));
            }
        }
    }

    public class b implements f0 {
        public b() {
        }

        public void a(g gVar) {
            t2.i iVar;
            i iVar2 = i.this;
            iVar2.getClass();
            JSONObject jSONObject = gVar.f4485b;
            String optString = jSONObject.optString("id");
            if (jSONObject.optInt("type") == 0) {
                d remove = iVar2.f4526b.remove(optString);
                if (remove == null) {
                    iVar = null;
                } else {
                    iVar = remove.f4462a;
                }
                if (iVar == null) {
                    iVar2.b(gVar.f4484a, optString);
                } else if (f.e()) {
                    j0.h(new a0(iVar2, remove, iVar));
                }
            }
        }
    }

    public class c implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4532a;

            public a(g gVar) {
                this.f4532a = gVar;
            }

            public void run() {
                d dVar = i.this.f4526b.get(this.f4532a.f4485b.optString("id"));
            }
        }

        public c() {
        }

        public void a(g gVar) {
            j0.h(new a(gVar));
        }
    }

    public class d implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4535a;

            public a(g gVar) {
                this.f4535a = gVar;
            }

            public void run() {
                d dVar = i.this.f4526b.get(this.f4535a.f4485b.optString("id"));
            }
        }

        public d() {
        }

        public void a(g gVar) {
            j0.h(new a(gVar));
        }
    }

    public class e implements f0 {
        public e() {
        }

        public void a(g gVar) {
            t2.i iVar;
            i iVar2 = i.this;
            iVar2.getClass();
            String optString = gVar.f4485b.optString("id");
            d dVar = iVar2.f4526b.get(optString);
            if (dVar == null) {
                iVar = null;
            } else {
                iVar = dVar.f4462a;
            }
            if (iVar == null) {
                iVar2.b(gVar.f4484a, optString);
            } else if (f.e()) {
                j0.h(new j(iVar2, dVar, gVar, iVar));
            }
        }
    }

    public class f implements f0 {
        public f() {
        }

        public void a(g gVar) {
            t2.i iVar;
            i iVar2 = i.this;
            iVar2.getClass();
            String optString = gVar.f4485b.optString("id");
            d remove = iVar2.f4526b.remove(optString);
            if (remove == null) {
                iVar = null;
            } else {
                iVar = remove.f4462a;
            }
            if (iVar == null) {
                iVar2.b(gVar.f4484a, optString);
            } else if (f.e()) {
                j0.h(new b0(iVar2, remove, iVar));
            }
        }
    }

    public class g implements f0 {
        public g() {
        }

        public void a(g gVar) {
            i.this.getClass();
            String optString = gVar.f4485b.optString("id");
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "id", optString);
            Context context = f.f4478a;
            boolean z10 = false;
            if (context == null) {
                y.a(jSONObject, "has_audio", false, gVar, jSONObject);
                return;
            }
            AudioManager c10 = j0.c(context);
            if (c10 == null) {
                p.f.a(0, 0, "isAudioEnabled() called with a null AudioManager", true);
            } else {
                try {
                    if (c10.getStreamVolume(3) > 0) {
                        z10 = true;
                    }
                } catch (Exception e10) {
                    StringBuilder a10 = android.support.v4.media.a.a("Exception occurred when accessing AudioManager.getStreamVolume: ");
                    a10.append(e10.toString());
                    p.f.a(0, 0, a10.toString(), true);
                }
            }
            double a11 = j0.a(j0.c(context));
            r0.k(jSONObject, "has_audio", z10);
            r0.d(jSONObject, "volume", a11);
            gVar.a(jSONObject).b();
        }
    }

    public class h implements f0 {
        public h(i iVar) {
        }

        public void a(g gVar) {
            JSONObject jSONObject = new JSONObject();
            r0.k(jSONObject, "success", true);
            gVar.a(jSONObject).b();
        }
    }

    /* renamed from: com.adcolony.sdk.i$i  reason: collision with other inner class name */
    public class C0065i implements f0 {

        /* renamed from: com.adcolony.sdk.i$i$a */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4540a;

            public a(C0065i iVar, g gVar) {
                this.f4540a = gVar;
            }

            public void run() {
                g gVar = this.f4540a;
                gVar.a(gVar.f4485b).b();
            }
        }

        public C0065i(i iVar) {
        }

        public void a(g gVar) {
            j0.h(new a(this, gVar));
        }
    }

    public class j implements f0 {
        public j(i iVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
            r7 = r3.f4616e;
            r8 = r7.length;
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
            if (r9 >= r8) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
            r10 = r7[r9];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            if (r1 == r10) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
            if (r1.equals(r10) == false) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
            r10 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
            if (r10 == false) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
            r4 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
            r9 = r9 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.adcolony.sdk.g r12) {
            /*
                r11 = this;
                com.adcolony.sdk.q r0 = com.adcolony.sdk.q.c()
                com.adcolony.sdk.n r1 = r0.f4707a
                if (r1 != 0) goto L_0x000a
                goto L_0x00ea
            L_0x000a:
                org.json.JSONObject r12 = r12.f4485b
                if (r12 != 0) goto L_0x0010
                goto L_0x00ea
            L_0x0010:
                java.lang.String r1 = "payload"
                org.json.JSONObject r12 = r12.optJSONObject(r1)
                if (r12 != 0) goto L_0x001a
                goto L_0x00ea
            L_0x001a:
                java.lang.String r1 = "request_type"
                java.lang.String r1 = r12.optString(r1)
                com.adcolony.sdk.n r2 = r0.f4707a
                r2.getClass()
                boolean r3 = r1.isEmpty()
                r4 = 0
                r5 = 0
                r6 = 1
                if (r3 == 0) goto L_0x002f
                goto L_0x0076
            L_0x002f:
                java.util.List<com.adcolony.sdk.n$a> r2 = r2.f4611b
                java.util.Iterator r2 = r2.iterator()
            L_0x0035:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0076
                java.lang.Object r3 = r2.next()
                com.adcolony.sdk.n$a r3 = (com.adcolony.sdk.n.a) r3
                java.lang.String[] r7 = r3.f4615d
                int r8 = r7.length
                r9 = 0
            L_0x0045:
                if (r9 >= r8) goto L_0x005b
                r10 = r7[r9]
                if (r1 == r10) goto L_0x0054
                boolean r10 = r1.equals(r10)
                if (r10 == 0) goto L_0x0052
                goto L_0x0054
            L_0x0052:
                r10 = 0
                goto L_0x0055
            L_0x0054:
                r10 = 1
            L_0x0055:
                if (r10 == 0) goto L_0x0058
                goto L_0x0071
            L_0x0058:
                int r9 = r9 + 1
                goto L_0x0045
            L_0x005b:
                java.lang.String[] r7 = r3.f4616e
                int r8 = r7.length
                r9 = 0
            L_0x005f:
                if (r9 >= r8) goto L_0x0035
                r10 = r7[r9]
                if (r1 == r10) goto L_0x006e
                boolean r10 = r1.equals(r10)
                if (r10 == 0) goto L_0x006c
                goto L_0x006e
            L_0x006c:
                r10 = 0
                goto L_0x006f
            L_0x006e:
                r10 = 1
            L_0x006f:
                if (r10 == 0) goto L_0x0073
            L_0x0071:
                r4 = r3
                goto L_0x0076
            L_0x0073:
                int r9 = r9 + 1
                goto L_0x005f
            L_0x0076:
                if (r4 == 0) goto L_0x00ea
                android.content.ContentValues r2 = com.adcolony.sdk.q.a(r12, r4)     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                com.adcolony.sdk.i0 r3 = com.adcolony.sdk.i0.d()     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                java.lang.String r7 = r4.f4613b     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                r3.b(r7, r2)     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                com.adcolony.sdk.i0 r3 = com.adcolony.sdk.i0.d()     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                r3.a(r4, r2)     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                r0.f4710d = r5     // Catch:{ JSONException -> 0x0093, NumberFormatException -> 0x0091, NullPointerException -> 0x008f }
                goto L_0x00ea
            L_0x008f:
                r2 = move-exception
                goto L_0x0094
            L_0x0091:
                r2 = move-exception
                goto L_0x0094
            L_0x0093:
                r2 = move-exception
            L_0x0094:
                r2.printStackTrace()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "Error parsing event:"
                r4.append(r7)
                r4.append(r1)
                java.lang.String r1 = " "
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                r3.append(r4)
                java.lang.String r12 = r12.toString()
                r3.append(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r4 = "Schema version: "
                r12.append(r4)
                com.adcolony.sdk.n r0 = r0.f4707a
                int r0 = r0.f4610a
                r12.append(r0)
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                r3.append(r12)
                java.lang.String r12 = " e: "
                r3.append(r12)
                java.lang.String r12 = r2.toString()
                r3.append(r12)
                java.lang.String r12 = r3.toString()
                p.f.a(r5, r6, r12, r6)
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.i.j.a(com.adcolony.sdk.g):void");
        }
    }

    public class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f4541a;

        public k(i iVar, h hVar) {
            this.f4541a = hVar;
        }

        public void run() {
            for (int i10 = 0; i10 < this.f4541a.A.size(); i10++) {
                String str = this.f4541a.B.get(i10);
                f0 f0Var = this.f4541a.A.get(i10);
                l m10 = f.d().m();
                synchronized (m10.f4602d) {
                    ArrayList arrayList = m10.f4602d.get(str);
                    if (arrayList != null) {
                        arrayList.remove(f0Var);
                    }
                }
            }
            this.f4541a.B.clear();
            this.f4541a.A.clear();
            this.f4541a.removeAllViews();
            h hVar = this.f4541a;
            hVar.H = null;
            hVar.G = null;
            for (q0 next : hVar.f4505c.values()) {
                if (!next.I) {
                    int i11 = next.D;
                    if (i11 <= 0) {
                        i11 = next.C;
                    }
                    f.d().d(i11);
                    next.loadUrl("about:blank");
                    next.clearCache(true);
                    next.removeAllViews();
                    next.K = true;
                }
            }
            for (k0 next2 : this.f4541a.f4503a.values()) {
                next2.e();
                next2.B = true;
            }
            this.f4541a.f4503a.clear();
            this.f4541a.f4504b.clear();
            this.f4541a.f4505c.clear();
            this.f4541a.f4507e.clear();
            this.f4541a.f4509g.clear();
            this.f4541a.f4506d.clear();
            this.f4541a.f4508f.clear();
            this.f4541a.f4515u = true;
        }
    }

    public class l implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4543a;

            public a(g gVar) {
                this.f4543a = gVar;
            }

            public void run() {
                int i10;
                i iVar = i.this;
                g gVar = this.f4543a;
                iVar.getClass();
                Context context = f.f4478a;
                if (context != null) {
                    JSONObject jSONObject = gVar.f4485b;
                    String optString = jSONObject.optString("ad_session_id");
                    h hVar = new h(context.getApplicationContext(), optString);
                    hVar.f4503a = new HashMap<>();
                    hVar.f4504b = new HashMap<>();
                    hVar.f4505c = new HashMap<>();
                    hVar.f4506d = new HashMap<>();
                    hVar.f4507e = new HashMap<>();
                    hVar.f4508f = new HashMap<>();
                    hVar.f4509g = new HashMap<>();
                    hVar.A = new ArrayList<>();
                    hVar.B = new ArrayList<>();
                    JSONObject jSONObject2 = gVar.f4485b;
                    if (jSONObject2.optBoolean("transparent")) {
                        hVar.setBackgroundColor(0);
                    }
                    hVar.f4512r = jSONObject2.optInt("id");
                    hVar.f4510h = jSONObject2.optInt("width");
                    hVar.f4511i = jSONObject2.optInt("height");
                    hVar.f4513s = jSONObject2.optInt("module_id");
                    hVar.f4516v = jSONObject2.optBoolean("viewability_enabled");
                    hVar.C = hVar.f4512r == 1;
                    o d10 = f.d();
                    if (hVar.f4510h == 0 && hVar.f4511i == 0) {
                        hVar.f4510h = d10.i().h();
                        if (((JSONObject) d10.o().f23743d).optBoolean("multi_window_enabled")) {
                            i10 = d10.i().g() - j0.s(f.f4478a);
                        } else {
                            i10 = d10.i().g();
                        }
                        hVar.f4511i = i10;
                    } else {
                        hVar.setLayoutParams(new FrameLayout.LayoutParams(hVar.f4510h, hVar.f4511i));
                    }
                    ArrayList<f0> arrayList = hVar.A;
                    t2.p pVar = new t2.p(hVar);
                    f.a("VideoView.create", pVar);
                    arrayList.add(pVar);
                    ArrayList<f0> arrayList2 = hVar.A;
                    t2.q qVar = new t2.q(hVar);
                    f.a("VideoView.destroy", qVar);
                    arrayList2.add(qVar);
                    ArrayList<f0> arrayList3 = hVar.A;
                    t2.r rVar = new t2.r(hVar);
                    f.a("WebView.create", rVar);
                    arrayList3.add(rVar);
                    ArrayList<f0> arrayList4 = hVar.A;
                    s sVar = new s(hVar);
                    f.a("WebView.destroy", sVar);
                    arrayList4.add(sVar);
                    ArrayList<f0> arrayList5 = hVar.A;
                    t tVar = new t(hVar);
                    f.a("TextView.create", tVar);
                    arrayList5.add(tVar);
                    ArrayList<f0> arrayList6 = hVar.A;
                    u uVar = new u(hVar);
                    f.a("TextView.destroy", uVar);
                    arrayList6.add(uVar);
                    ArrayList<f0> arrayList7 = hVar.A;
                    v vVar = new v(hVar);
                    f.a("ImageView.create", vVar);
                    arrayList7.add(vVar);
                    ArrayList<f0> arrayList8 = hVar.A;
                    w wVar = new w(hVar);
                    f.a("ImageView.destroy", wVar);
                    arrayList8.add(wVar);
                    hVar.B.add("VideoView.create");
                    hVar.B.add("VideoView.destroy");
                    hVar.B.add("WebView.create");
                    hVar.B.add("WebView.destroy");
                    hVar.B.add("TextView.create");
                    hVar.B.add("TextView.destroy");
                    hVar.B.add("ImageView.create");
                    hVar.B.add("ImageView.destroy");
                    VideoView videoView = new VideoView(hVar.G);
                    hVar.H = videoView;
                    videoView.setVisibility(8);
                    hVar.addView(hVar.H);
                    hVar.setClipToPadding(false);
                    if (hVar.f4516v) {
                        new Thread(new t2.o(hVar, new x(hVar, gVar.f4485b.optBoolean("advanced_viewability")))).start();
                    }
                    iVar.f4525a.put(optString, hVar);
                    if (jSONObject.optInt("width") == 0) {
                        d dVar = iVar.f4526b.get(optString);
                        if (dVar == null) {
                            iVar.b(gVar.f4484a, optString);
                            return;
                        }
                        dVar.f4463b = hVar;
                    } else {
                        hVar.C = false;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    r0.k(jSONObject3, "success", true);
                    gVar.a(jSONObject3).b();
                }
            }
        }

        public l() {
        }

        public void a(g gVar) {
            j0.h(new a(gVar));
        }
    }

    public class m implements f0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4546a;

            public a(g gVar) {
                this.f4546a = gVar;
            }

            public void run() {
                i iVar = i.this;
                g gVar = this.f4546a;
                iVar.getClass();
                String optString = gVar.f4485b.optString("ad_session_id");
                h hVar = iVar.f4525a.get(optString);
                if (hVar == null) {
                    iVar.b(gVar.f4484a, optString);
                } else {
                    iVar.a(hVar);
                }
            }
        }

        public m() {
        }

        public void a(g gVar) {
            j0.h(new a(gVar));
        }
    }

    public class n implements f0 {
        public n() {
        }

        public void a(g gVar) {
            i iVar = i.this;
            iVar.getClass();
            JSONObject jSONObject = gVar.f4485b;
            String str = gVar.f4484a;
            String optString = jSONObject.optString("ad_session_id");
            int optInt = jSONObject.optInt("view_id");
            h hVar = iVar.f4525a.get(optString);
            if (hVar == null) {
                iVar.b(str, optString);
                return;
            }
            View view = hVar.f4509g.get(Integer.valueOf(optInt));
            if (view == null) {
                iVar.b(str, "" + optInt);
                return;
            }
            view.bringToFront();
        }
    }

    public class o implements f0 {
        public o() {
        }

        public void a(g gVar) {
            i iVar = i.this;
            iVar.getClass();
            JSONObject jSONObject = gVar.f4485b;
            String str = gVar.f4484a;
            String optString = jSONObject.optString("ad_session_id");
            int optInt = jSONObject.optInt("view_id");
            h hVar = iVar.f4525a.get(optString);
            if (hVar == null) {
                iVar.b(str, optString);
                return;
            }
            View view = hVar.f4509g.get(Integer.valueOf(optInt));
            if (view == null) {
                iVar.b(str, "" + optInt);
                return;
            }
            hVar.removeView(view);
            hVar.addView(view, view.getLayoutParams());
        }
    }

    public class p implements f0 {
        public p() {
        }

        public void a(g gVar) {
            t2.i iVar;
            i iVar2 = i.this;
            iVar2.getClass();
            JSONObject jSONObject = gVar.f4485b;
            int optInt = jSONObject.optInt("status");
            if (optInt != 5 && optInt != 1 && optInt != 0 && optInt != 6) {
                String optString = jSONObject.optString("id");
                d remove = iVar2.f4526b.remove(optString);
                if (remove == null) {
                    iVar = null;
                } else {
                    iVar = remove.f4462a;
                }
                if (iVar == null) {
                    iVar2.b(gVar.f4484a, optString);
                    return;
                }
                j0.h(new c0(iVar2, iVar, remove));
                remove.f4463b = null;
            }
        }
    }

    public class q implements f0 {
        public q() {
        }

        public void a(g gVar) {
            i iVar = i.this;
            iVar.getClass();
            JSONObject jSONObject = gVar.f4485b;
            String optString = jSONObject.optString("id");
            d dVar = iVar.f4526b.get(optString);
            b bVar = iVar.f4528d.get(optString);
            int optInt = jSONObject.optInt("orientation", -1);
            boolean z10 = bVar != null;
            if (dVar != null || z10) {
                r0.e(new JSONObject(), "id", optString);
                if (dVar != null) {
                    dVar.f4465d = optInt;
                    Context context = f.f4478a;
                    if (context != null && f.f()) {
                        f.d().f4682z = true;
                        f.d().f4668l = dVar.f4463b;
                        f.d().f4670n = dVar;
                        j0.f(new Intent(context, AdColonyInterstitialActivity.class));
                        dVar.f4471j = true;
                        return;
                    }
                    return;
                }
                return;
            }
            iVar.b(gVar.f4484a, optString);
        }
    }

    public class r implements f0 {
        public r() {
        }

        public void a(g gVar) {
            i iVar = i.this;
            iVar.getClass();
            String optString = gVar.f4485b.optString("id");
            t2.f remove = iVar.f4527c.remove(optString);
            if (remove == null) {
                iVar.b(gVar.f4484a, optString);
                return;
            }
            Context context = f.f4478a;
            if (context != null) {
                j0.h(new z(iVar, context, gVar, remove, optString));
            }
        }
    }

    public void a(h hVar) {
        j0.h(new k(this, hVar));
        if (this.f4528d.get(hVar.f4514t) == null) {
            this.f4525a.remove(hVar.f4514t);
            hVar.G = null;
        }
    }

    public void b(String str, String str2) {
        p.f.a(0, 0, "Message '" + str + "' sent with invalid id: " + str2, false);
    }

    public void c() {
        this.f4525a = new HashMap<>();
        this.f4526b = new ConcurrentHashMap<>();
        this.f4527c = new HashMap<>();
        this.f4528d = new HashMap<>();
        f.c("AdContainer.create", new l());
        f.c("AdContainer.destroy", new m());
        f.c("AdContainer.move_view_to_index", new n());
        f.c("AdContainer.move_view_to_front", new o());
        f.c("AdSession.finish_fullscreen_ad", new p());
        f.c("AdSession.start_fullscreen_ad", new q());
        f.c("AdSession.ad_view_available", new r());
        f.c("AdSession.ad_view_unavailable", new a());
        f.c("AdSession.expiring", new b());
        f.c("AdSession.audio_stopped", new c());
        f.c("AdSession.audio_started", new d());
        f.c("AdSession.interstitial_available", new e());
        f.c("AdSession.interstitial_unavailable", new f());
        f.c("AdSession.has_audio", new g());
        f.c("WebView.prepare", new h(this));
        f.c("AdSession.expanded", new C0065i(this));
        f.c("AdColony.odt_event", new j(this));
    }
}
