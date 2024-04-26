package e8;

import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.zh;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ih implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15044a = 6;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15045b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15046c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15047d;

    public ih(ld ldVar, cp[] cpVarArr, String str) {
        this.f15045b = ldVar;
        this.f15046c = cpVarArr;
        this.f15047d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: e8.up} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: e8.vg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: e8.up} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: e8.up} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: e8.up} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e8.p50 a(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f15044a
            r2 = 0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0376;
                case 1: goto L_0x032e;
                case 2: goto L_0x02ec;
                case 3: goto L_0x0269;
                case 4: goto L_0x015d;
                case 5: goto L_0x00cd;
                case 6: goto L_0x005f;
                case 7: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x03a3
        L_0x000c:
            java.lang.Object r0 = r1.f15046c
            e8.s10 r0 = (e8.s10) r0
            java.lang.Object r5 = r1.f15047d
            e8.mh r5 = (e8.mh) r5
            r6 = r18
            e8.t00 r6 = (e8.t00) r6
            r0.f16365b = r6
            com.google.android.gms.internal.ads.j8 r0 = r6.f16701b
            java.lang.Object r0 = r0.f7134b
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r7 = 0
        L_0x0025:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x004e
            java.lang.Object r8 = r0.next()
            com.google.android.gms.internal.ads.qe r8 = (com.google.android.gms.internal.ads.qe) r8
            java.util.List<java.lang.String> r8 = r8.f7942a
            java.util.Iterator r8 = r8.iterator()
        L_0x0037:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0025
            java.lang.Object r7 = r8.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = "FirstPartyRenderer"
            boolean r7 = r7.contains(r9)
            if (r7 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r7 = 1
            goto L_0x0037
        L_0x004e:
            r2 = r7
        L_0x004f:
            if (r2 != 0) goto L_0x0056
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.h(r4)
            goto L_0x005e
        L_0x0056:
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.h(r6)
            e8.p50 r0 = r5.c(r0)
        L_0x005e:
            return r0
        L_0x005f:
            java.lang.Object r0 = r1.f15045b
            com.google.android.gms.internal.ads.ld r0 = (com.google.android.gms.internal.ads.ld) r0
            java.lang.Object r3 = r1.f15046c
            e8.cp[] r3 = (e8.cp[]) r3
            java.lang.Object r5 = r1.f15047d
            java.lang.String r5 = (java.lang.String) r5
            r6 = r18
            e8.cp r6 = (e8.cp) r6
            r0.getClass()
            r3[r2] = r6
            android.content.Context r2 = r0.f7369b
            com.google.android.gms.internal.ads.z4 r3 = r0.f7375h
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r3.f8670b
            android.view.View r3 = r3.f8669a
            org.json.JSONObject r2 = com.google.android.gms.ads.internal.util.k.e(r2, r7, r7, r3)
            android.content.Context r3 = r0.f7369b
            com.google.android.gms.internal.ads.z4 r7 = r0.f7375h
            android.view.View r7 = r7.f8669a
            org.json.JSONObject r3 = com.google.android.gms.ads.internal.util.k.d(r3, r7)
            com.google.android.gms.internal.ads.z4 r7 = r0.f7375h
            android.view.View r7 = r7.f8669a
            org.json.JSONObject r7 = com.google.android.gms.ads.internal.util.k.l(r7)
            android.content.Context r8 = r0.f7369b
            com.google.android.gms.internal.ads.z4 r9 = r0.f7375h
            android.view.View r9 = r9.f8669a
            org.json.JSONObject r8 = com.google.android.gms.ads.internal.util.k.h(r8, r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "asset_view_signal"
            r9.put(r10, r2)
            java.lang.String r2 = "ad_view_signal"
            r9.put(r2, r3)
            java.lang.String r2 = "scroll_view_signal"
            r9.put(r2, r7)
            java.lang.String r2 = "lock_screen_signal"
            r9.put(r2, r8)
            java.lang.String r2 = "google.afma.nativeAds.getPublisherCustomRenderedClickSignals"
            if (r5 != r2) goto L_0x00c8
            android.content.Context r2 = r0.f7369b
            android.graphics.Point r3 = r0.f7377r
            android.graphics.Point r0 = r0.f7376i
            org.json.JSONObject r0 = com.google.android.gms.ads.internal.util.k.f(r4, r2, r3, r0)
            java.lang.String r2 = "click_signal"
            r9.put(r2, r0)
        L_0x00c8:
            e8.p50 r0 = r6.e(r5, r9)
            return r0
        L_0x00cd:
            java.lang.Object r0 = r1.f15045b
            e8.hu r0 = (e8.hu) r0
            java.lang.Object r4 = r1.f15046c
            e8.t00 r4 = (e8.t00) r4
            java.lang.Object r5 = r1.f15047d
            com.google.android.gms.internal.ads.qe r5 = (com.google.android.gms.internal.ads.qe) r5
            r6 = r18
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            r0.getClass()
            com.google.android.gms.internal.ads.we r7 = com.google.android.gms.internal.ads.we.NO_FILL
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00f3
            e8.br r0 = new e8.br
            r0.<init>(r7)
            com.google.android.gms.internal.ads.ai$a r2 = new com.google.android.gms.internal.ads.ai$a
            r2.<init>(r0)
            goto L_0x015c
        L_0x00f3:
            com.google.android.gms.internal.ads.ri r8 = r4.f16700a
            com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT> r8 = r8.f8042b
            e8.w00 r8 = (e8.w00) r8
            int r8 = r8.f17197k
            if (r8 <= r3) goto L_0x014c
            int r3 = r6.length()
            com.google.android.gms.internal.ads.ve<e8.cp> r8 = r0.f14946d
            com.google.android.gms.internal.ads.ri r9 = r4.f16700a
            com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT> r9 = r9.f8042b
            e8.w00 r9 = (e8.w00) r9
            int r9 = r9.f17197k
            int r9 = java.lang.Math.min(r3, r9)
            r8.a(r9)
            java.util.ArrayList r8 = new java.util.ArrayList
            com.google.android.gms.internal.ads.ri r9 = r4.f16700a
            com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT> r9 = r9.f8042b
            e8.w00 r9 = (e8.w00) r9
            int r9 = r9.f17197k
            r8.<init>(r9)
        L_0x011f:
            com.google.android.gms.internal.ads.ri r9 = r4.f16700a
            com.google.android.gms.internal.ads.ti<KeyFormatProtoT, KeyProtoT> r9 = r9.f8042b
            e8.w00 r9 = (e8.w00) r9
            int r9 = r9.f17197k
            if (r2 >= r9) goto L_0x0147
            if (r2 >= r3) goto L_0x0137
            org.json.JSONObject r9 = r6.getJSONObject(r2)
            e8.p50 r9 = r0.c(r4, r5, r9)
            r8.add(r9)
            goto L_0x0144
        L_0x0137:
            e8.br r9 = new e8.br
            r9.<init>(r7)
            com.google.android.gms.internal.ads.ai$a r10 = new com.google.android.gms.internal.ads.ai$a
            r10.<init>(r9)
            r8.add(r10)
        L_0x0144:
            int r2 = r2 + 1
            goto L_0x011f
        L_0x0147:
            e8.p50 r2 = com.google.android.gms.internal.ads.yh.h(r8)
            goto L_0x015c
        L_0x014c:
            org.json.JSONObject r2 = r6.getJSONObject(r2)
            e8.p50 r2 = r0.c(r4, r5, r2)
            com.google.android.gms.internal.ads.mg r3 = e8.ju.f15195a
            e8.o50 r0 = r0.f14944b
            e8.p50 r2 = com.google.android.gms.internal.ads.yh.i(r2, r3, r0)
        L_0x015c:
            return r2
        L_0x015d:
            java.lang.Object r0 = r1.f15045b
            e8.xt r0 = (e8.xt) r0
            java.lang.Object r3 = r1.f15046c
            e8.t00 r3 = (e8.t00) r3
            java.lang.Object r5 = r1.f15047d
            com.google.android.gms.internal.ads.qe r5 = (com.google.android.gms.internal.ads.qe) r5
            android.content.Context r6 = r0.f17521b
            java.util.List<com.google.android.gms.internal.ads.pe> r7 = r5.f7967t
            e8.li0 r6 = com.google.android.gms.internal.ads.g7.n(r6, r7)
            com.google.android.gms.internal.ads.cb r7 = r0.f17522c
            com.google.android.gms.internal.ads.j8 r8 = r3.f16701b
            java.lang.Object r8 = r8.f7135c
            com.google.android.gms.internal.ads.re r8 = (com.google.android.gms.internal.ads.re) r8
            com.google.android.gms.internal.ads.t7 r7 = r7.a(r6, r5, r8)
            boolean r8 = r5.Q
            r7.z0(r8)
            e8.l<java.lang.Boolean> r8 = e8.t.f16589h4
            e8.ti0 r9 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r9 = r9.f16769f
            java.lang.Object r8 = r9.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01df
            boolean r8 = r5.f7945b0
            if (r8 == 0) goto L_0x01df
            android.content.Context r8 = r0.f17521b
            android.view.View r9 = r7.getView()
            e8.vg r10 = new e8.vg
            r10.<init>(r8)
            r10.f17132b = r9
            r10.addView(r9)
            d7.l r8 = d7.l.B
            e8.q9 r8 = r8.A
            e8.q9.b(r10, r10)
            d7.l r8 = d7.l.B
            e8.q9 r8 = r8.A
            e8.q9.a(r10, r10)
            org.json.JSONObject r8 = r5.f7947c0
            if (r8 == 0) goto L_0x01f2
            android.widget.RelativeLayout r9 = new android.widget.RelativeLayout
            android.content.Context r11 = r10.f17131a
            r9.<init>(r11)
            java.lang.String r11 = "header"
            org.json.JSONObject r11 = r8.optJSONObject(r11)
            if (r11 == 0) goto L_0x01ce
            r12 = 10
            r10.a(r11, r9, r12)
        L_0x01ce:
            java.lang.String r11 = "footer"
            org.json.JSONObject r8 = r8.optJSONObject(r11)
            if (r8 == 0) goto L_0x01db
            r11 = 12
            r10.a(r8, r9, r11)
        L_0x01db:
            r10.addView(r9)
            goto L_0x01f2
        L_0x01df:
            e8.up r10 = new e8.up
            android.content.Context r8 = r0.f17521b
            android.view.View r9 = r7.getView()
            com.google.android.gms.internal.ads.mg<com.google.android.gms.internal.ads.qe, f7.g> r11 = r0.f17525f
            java.lang.Object r11 = r11.apply(r5)
            f7.g r11 = (f7.g) r11
            r10.<init>(r8, r9, r11)
        L_0x01f2:
            e8.pg r8 = r0.f17520a
            com.google.android.gms.internal.ads.j8 r9 = new com.google.android.gms.internal.ads.j8
            r9.<init>((e8.t00) r3, (com.google.android.gms.internal.ads.qe) r5, (java.lang.String) r4)
            n2.g r3 = new n2.g
            e8.yt r4 = new e8.yt
            r4.<init>((com.google.android.gms.internal.ads.t7) r7)
            com.google.android.gms.internal.ads.pe r6 = com.google.android.gms.internal.ads.g7.s(r6)
            r3.<init>((android.view.View) r10, (com.google.android.gms.internal.ads.t7) r7, (com.google.android.gms.internal.ads.y8) r4, (com.google.android.gms.internal.ads.pe) r6)
            e8.cg r3 = r8.b(r9, r3)
            r4 = r3
            e8.be r4 = (e8.be) r4
            e8.ab0<e8.op> r4 = r4.V0
            java.lang.Object r4 = r4.get()
            e8.op r4 = (e8.op) r4
            r4.b(r7, r2)
            e8.yi r2 = r3.d()
            e8.tt r4 = new e8.tt
            r6 = 2
            r4.<init>(r7, r6)
            e8.o50 r8 = e8.h9.f14886f
            r2.J0(r4, r8)
            r2 = r3
            e8.be r2 = (e8.be) r2
            e8.ab0<e8.op> r2 = r2.V0
            java.lang.Object r2 = r2.get()
            e8.op r2 = (e8.op) r2
            com.google.android.gms.internal.ads.te r2 = r5.f7965r
            java.lang.String r4 = r2.f8194b
            java.lang.String r2 = r2.f8193a
            e8.p50 r2 = e8.op.a(r7, r4, r2)
            boolean r4 = r5.H
            if (r4 == 0) goto L_0x0250
            e8.im r4 = new e8.im
            r4.<init>(r7, r6)
            java.util.concurrent.Executor r5 = r0.f17524e
            r6 = r2
            com.google.android.gms.internal.ads.d7 r6 = (com.google.android.gms.internal.ads.d7) r6
            com.google.android.gms.internal.ads.fi<T> r6 = r6.f6188a
            r6.a(r4, r5)
        L_0x0250:
            r7.m r4 = new r7.m
            r4.<init>((e8.xt) r0, (com.google.android.gms.internal.ads.t7) r7)
            java.util.concurrent.Executor r0 = r0.f17524e
            r5 = r2
            com.google.android.gms.internal.ads.d7 r5 = (com.google.android.gms.internal.ads.d7) r5
            com.google.android.gms.internal.ads.fi<T> r5 = r5.f6188a
            r5.a(r4, r0)
            e8.bp r0 = new e8.bp
            r0.<init>((e8.cg) r3)
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.i(r2, r0, r8)
            return r0
        L_0x0269:
            java.lang.Object r0 = r1.f15045b
            e8.vt r0 = (e8.vt) r0
            java.lang.Object r5 = r1.f15046c
            e8.t00 r5 = (e8.t00) r5
            java.lang.Object r6 = r1.f15047d
            com.google.android.gms.internal.ads.qe r6 = (com.google.android.gms.internal.ads.qe) r6
            java.lang.Object r7 = r0.f17163c
            android.content.Context r7 = (android.content.Context) r7
            java.util.List<com.google.android.gms.internal.ads.pe> r8 = r6.f7967t
            e8.li0 r7 = com.google.android.gms.internal.ads.g7.n(r7, r8)
            java.lang.Object r8 = r0.f17164d
            com.google.android.gms.internal.ads.cb r8 = (com.google.android.gms.internal.ads.cb) r8
            com.google.android.gms.internal.ads.j8 r9 = r5.f16701b
            java.lang.Object r9 = r9.f7135c
            com.google.android.gms.internal.ads.re r9 = (com.google.android.gms.internal.ads.re) r9
            com.google.android.gms.internal.ads.t7 r8 = r8.a(r7, r6, r9)
            java.lang.Object r0 = r0.f17162b
            e8.mf r0 = (e8.mf) r0
            com.google.android.gms.internal.ads.j8 r9 = new com.google.android.gms.internal.ads.j8
            r9.<init>((e8.t00) r5, (com.google.android.gms.internal.ads.qe) r6, (java.lang.String) r4)
            e8.if r4 = new e8.if
            android.view.View r11 = r8.getView()
            com.google.android.gms.internal.ads.pe r13 = com.google.android.gms.internal.ads.g7.s(r7)
            int r14 = r6.U
            boolean r15 = r6.Y
            boolean r5 = r6.J
            r10 = r4
            r12 = r8
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            e8.jf r0 = r0.e(r9, r4)
            r4 = r0
            e8.vd r4 = (e8.vd) r4
            e8.ab0<e8.op> r4 = r4.C0
            java.lang.Object r4 = r4.get()
            e8.op r4 = (e8.op) r4
            r4.b(r8, r2)
            e8.yi r2 = r0.d()
            e8.tt r4 = new e8.tt
            r4.<init>(r8, r3)
            e8.o50 r3 = e8.h9.f14886f
            r2.J0(r4, r3)
            r2 = r0
            e8.vd r2 = (e8.vd) r2
            e8.ab0<e8.op> r2 = r2.C0
            java.lang.Object r2 = r2.get()
            e8.op r2 = (e8.op) r2
            com.google.android.gms.internal.ads.te r2 = r6.f7965r
            java.lang.String r4 = r2.f8194b
            java.lang.String r2 = r2.f8193a
            e8.p50 r2 = e8.op.a(r8, r4, r2)
            e8.bp r4 = new e8.bp
            r4.<init>((e8.jf) r0)
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.i(r2, r4, r3)
            return r0
        L_0x02ec:
            java.lang.Object r0 = r1.f15045b
            e8.cp r0 = (e8.cp) r0
            java.lang.Object r2 = r1.f15046c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f15047d
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r4 = r18
            com.google.android.gms.internal.ads.t7 r4 = (com.google.android.gms.internal.ads.t7) r4
            com.google.android.gms.internal.ads.q1 r0 = r0.f14175i
            r0.getClass()
            com.google.android.gms.internal.ads.d7 r5 = new com.google.android.gms.internal.ads.d7
            r5.<init>()
            d7.l r6 = d7.l.B
            com.google.android.gms.ads.internal.util.p r6 = r6.f13186c
            java.lang.String r6 = com.google.android.gms.ads.internal.util.p.K()
            e8.n3 r7 = new e8.n3
            r7.<init>(r5)
            r0.a(r6, r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0329 }
            r0.<init>()     // Catch:{ Exception -> 0x0329 }
            java.lang.String r7 = "id"
            r0.put(r7, r6)     // Catch:{ Exception -> 0x0329 }
            java.lang.String r6 = "args"
            r0.put(r6, r3)     // Catch:{ Exception -> 0x0329 }
            r4.m(r2, r0)     // Catch:{ Exception -> 0x0329 }
            goto L_0x032d
        L_0x0329:
            r0 = move-exception
            r5.c(r0)
        L_0x032d:
            return r5
        L_0x032e:
            java.lang.Object r0 = r1.f15045b
            e8.uo r0 = (e8.uo) r0
            java.lang.Object r3 = r1.f15046c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r1.f15047d
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.cb r6 = r0.f16979c
            e8.li0 r7 = e8.li0.j()
            com.google.android.gms.internal.ads.t7 r6 = r6.a(r7, r4, r4)
            e8.m9 r7 = new e8.m9
            r7.<init>(r6)
            r0.a(r6)
            e8.w00 r8 = r0.f16977a
            com.google.android.gms.internal.ads.z1 r8 = r8.f17189c
            if (r8 == 0) goto L_0x035c
            e8.wc r8 = new e8.wc
            r9 = 5
            r8.<init>(r9, r2, r2, r2)
            r6.c0(r8)
            goto L_0x0365
        L_0x035c:
            e8.wc r8 = new e8.wc
            r9 = 4
            r8.<init>(r9, r2, r2, r2)
            r6.c0(r8)
        L_0x0365:
            e8.uc r8 = r6.H()
            e8.wo r9 = new e8.wo
            r9.<init>(r0, r6, r7, r2)
            com.google.android.gms.internal.ads.s7 r8 = (com.google.android.gms.internal.ads.s7) r8
            r8.f8095g = r9
            r6.m0(r3, r5, r4)
            return r7
        L_0x0376:
            java.lang.Object r0 = r1.f15045b
            e8.gh r0 = (e8.gh) r0
            java.lang.Object r2 = r1.f15046c
            com.google.android.gms.internal.ads.zh r2 = (com.google.android.gms.internal.ads.zh) r2
            java.lang.Object r3 = r1.f15047d
            e8.p50 r3 = (e8.p50) r3
            r4 = r18
            e8.ah r4 = (e8.ah) r4
            r0.getClass()
            if (r4 == 0) goto L_0x038e
            r2.a(r4)
        L_0x038e:
            a6.b<java.lang.Long> r2 = e8.f1.f14525a
            java.lang.Object r2 = r2.b()
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r0 = r0.f14781b
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.e(r3, r4, r2, r0)
            return r0
        L_0x03a3:
            java.lang.Object r0 = r1.f15045b
            e8.uz r0 = (e8.uz) r0
            java.lang.Object r5 = r1.f15046c
            com.google.android.gms.internal.ads.je r5 = (com.google.android.gms.internal.ads.je) r5
            java.lang.Object r6 = r1.f15047d
            e8.a00 r6 = (e8.a00) r6
            r7 = r18
            com.google.android.gms.internal.ads.he r7 = (com.google.android.gms.internal.ads.he) r7
            r0.getClass()
            e8.r10 r8 = r7.f6854b
            com.google.android.gms.internal.ads.l5 r7 = r7.f6853a
            if (r8 == 0) goto L_0x03fc
            e8.l10 r9 = r0.f17006a
            com.google.android.gms.internal.ads.ye r9 = (com.google.android.gms.internal.ads.ye) r9
            monitor-enter(r9)
            java.util.concurrent.ConcurrentHashMap<e8.r10, e8.j10> r10 = r9.f8604a     // Catch:{ all -> 0x03f9 }
            java.lang.Object r10 = r10.get(r8)     // Catch:{ all -> 0x03f9 }
            e8.j10 r10 = (e8.j10) r10     // Catch:{ all -> 0x03f9 }
            if (r10 == 0) goto L_0x03ec
            e8.s10 r11 = r10.b()     // Catch:{ all -> 0x03f9 }
            if (r11 != 0) goto L_0x03d8
            e8.m10 r12 = r9.f8606c     // Catch:{ all -> 0x03f9 }
            int r13 = r12.f15449e     // Catch:{ all -> 0x03f9 }
            int r13 = r13 + r3
            r12.f15449e = r13     // Catch:{ all -> 0x03f9 }
        L_0x03d8:
            e8.b20 r10 = r10.f15088d     // Catch:{ all -> 0x03f9 }
            com.google.android.gms.internal.ads.ef r12 = r10.f13870b     // Catch:{ all -> 0x03f9 }
            java.lang.Object r12 = r12.clone()     // Catch:{ all -> 0x03f9 }
            com.google.android.gms.internal.ads.ef r12 = (com.google.android.gms.internal.ads.ef) r12     // Catch:{ all -> 0x03f9 }
            com.google.android.gms.internal.ads.ef r10 = r10.f13870b     // Catch:{ all -> 0x03f9 }
            r10.f6281a = r2     // Catch:{ all -> 0x03f9 }
            r10.f6282b = r2     // Catch:{ all -> 0x03f9 }
            r9.b(r11, r12)     // Catch:{ all -> 0x03f9 }
            goto L_0x03f7
        L_0x03ec:
            e8.m10 r2 = r9.f8606c     // Catch:{ all -> 0x03f9 }
            int r10 = r2.f15448d     // Catch:{ all -> 0x03f9 }
            int r10 = r10 + r3
            r2.f15448d = r10     // Catch:{ all -> 0x03f9 }
            r9.b(r4, r4)     // Catch:{ all -> 0x03f9 }
            r11 = r4
        L_0x03f7:
            monitor-exit(r9)
            goto L_0x03fd
        L_0x03f9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x03fc:
            r11 = r4
        L_0x03fd:
            if (r8 != 0) goto L_0x0404
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.h(r4)
            goto L_0x0471
        L_0x0404:
            if (r11 == 0) goto L_0x0468
            if (r7 == 0) goto L_0x0468
            e8.b00 r2 = r5.f7150b
            e8.ei r2 = r6.C(r2)
            java.lang.Object r2 = r2.b()
            e8.fi r2 = (e8.fi) r2
            e8.mh r2 = r2.a()
            e8.n20 r5 = r2.f15514c
            com.google.android.gms.internal.ads.if r6 = com.google.android.gms.internal.ads.Cif.NOTIFY_CACHE_HIT
            com.google.android.gms.internal.ads.j8 r9 = r2.f15519h
            r9.getClass()
            java.lang.String r10 = r7.f7323r
            boolean r10 = e8.lb0.b(r10)
            if (r10 == 0) goto L_0x0438
            e8.br r3 = new e8.br
            com.google.android.gms.internal.ads.we r4 = com.google.android.gms.internal.ads.we.INVALID_REQUEST
            java.lang.String r9 = "Pool key missing from removeUrl call."
            r3.<init>(r4, r9)
            com.google.android.gms.internal.ads.ai$a r4 = new com.google.android.gms.internal.ads.ai$a
            r4.<init>(r3)
            goto L_0x0448
        L_0x0438:
            com.google.android.gms.internal.ads.oh r10 = e8.as.f13746a
            e8.bs r12 = new e8.bs
            r12.<init>(r9, r3)
            com.google.android.gms.internal.ads.g2 r3 = new com.google.android.gms.internal.ads.g2
            r3.<init>((com.google.android.gms.internal.ads.j8) r9, (q.e) r4)
            e8.p50 r4 = r9.g(r7, r12, r3, r10)
        L_0x0448:
            e8.dv r3 = r5.b(r6, r4)
            com.google.android.gms.internal.ads.hf r3 = r3.e()
            e8.ph r4 = new e8.ph
            r4.<init>((e8.mh) r2)
            java.util.concurrent.Executor r2 = r2.f15521j
            f7.j0 r5 = new f7.j0
            r5.<init>((java.util.concurrent.Future) r3, (com.google.android.gms.internal.ads.zh) r4)
            e8.p50<V> r4 = r3.f6857c
            r4.a(r5, r2)
            com.google.android.gms.internal.ads.zh<java.lang.Void> r2 = r0.f17008c
            java.util.concurrent.Executor r0 = r0.f17007b
            com.google.android.gms.internal.ads.yh.g(r3, r2, r0)
        L_0x0468:
            e8.vz r0 = new e8.vz
            r0.<init>(r8, r7, r11)
            e8.p50 r0 = com.google.android.gms.internal.ads.yh.h(r0)
        L_0x0471:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ih.a(java.lang.Object):e8.p50");
    }

    public ih(gh ghVar, zh zhVar, p50 p50) {
        this.f15045b = ghVar;
        this.f15046c = zhVar;
        this.f15047d = p50;
    }

    public ih(uo uoVar, String str, String str2) {
        this.f15045b = uoVar;
        this.f15046c = str;
        this.f15047d = str2;
    }

    public ih(cp cpVar, String str, JSONObject jSONObject) {
        this.f15045b = cpVar;
        this.f15046c = str;
        this.f15047d = jSONObject;
    }

    public ih(vt vtVar, t00 t00, qe qeVar) {
        this.f15045b = vtVar;
        this.f15046c = t00;
        this.f15047d = qeVar;
    }

    public ih(xt xtVar, t00 t00, qe qeVar) {
        this.f15045b = xtVar;
        this.f15046c = t00;
        this.f15047d = qeVar;
    }

    public ih(hu huVar, t00 t00, qe qeVar) {
        this.f15045b = huVar;
        this.f15046c = t00;
        this.f15047d = qeVar;
    }

    public ih(tz tzVar, s10 s10, mh mhVar) {
        this.f15045b = tzVar;
        this.f15046c = s10;
        this.f15047d = mhVar;
    }

    public ih(uz uzVar, je jeVar, a00 a00) {
        this.f15045b = uzVar;
        this.f15046c = jeVar;
        this.f15047d = a00;
    }
}
