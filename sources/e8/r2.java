package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class r2 implements f3 {

    /* renamed from: a  reason: collision with root package name */
    public static final f3 f16224a = new r2();

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r18, java.util.Map r19) {
        /*
            r17 = this;
            r1 = r18
            e8.lc r1 = (e8.lc) r1
            e8.f3<com.google.android.gms.internal.ads.t7> r0 = e8.q2.f16061a
            java.lang.String r2 = "openableIntents"
            android.content.Context r0 = r1.getContext()
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            java.lang.String r0 = "data"
            r4 = r19
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0106 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0106 }
            java.lang.String r0 = "intents"
            org.json.JSONArray r4 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x00fb }
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x002c:
            int r0 = r4.length()
            if (r7 >= r0) goto L_0x00f5
            org.json.JSONObject r0 = r4.getJSONObject(r7)     // Catch:{ JSONException -> 0x00ea }
            java.lang.String r8 = "id"
            java.lang.String r8 = r0.optString(r8)
            java.lang.String r9 = "u"
            java.lang.String r9 = r0.optString(r9)
            java.lang.String r10 = "i"
            java.lang.String r10 = r0.optString(r10)
            java.lang.String r11 = "m"
            java.lang.String r11 = r0.optString(r11)
            java.lang.String r12 = "p"
            java.lang.String r12 = r0.optString(r12)
            java.lang.String r13 = "c"
            java.lang.String r13 = r0.optString(r13)
            java.lang.String r14 = "intent_url"
            java.lang.String r14 = r0.optString(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0087
            android.content.Intent r15 = android.content.Intent.parseUri(r14, r6)     // Catch:{ URISyntaxException -> 0x006b }
            goto L_0x0088
        L_0x006b:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = "Error parsing the url: "
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r16 = r14.length()
            if (r16 == 0) goto L_0x007e
            java.lang.String r0 = r0.concat(r14)
            goto L_0x0084
        L_0x007e:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r0)
            r0 = r14
        L_0x0084:
            l0.e.C(r0, r15)
        L_0x0087:
            r15 = 0
        L_0x0088:
            r0 = 1
            if (r15 != 0) goto L_0x00d4
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            boolean r14 = android.text.TextUtils.isEmpty(r9)
            if (r14 != 0) goto L_0x009d
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r15.setData(r9)
        L_0x009d:
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x00a6
            r15.setAction(r10)
        L_0x00a6:
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto L_0x00af
            r15.setType(r11)
        L_0x00af:
            boolean r9 = android.text.TextUtils.isEmpty(r12)
            if (r9 != 0) goto L_0x00b8
            r15.setPackage(r12)
        L_0x00b8:
            boolean r9 = android.text.TextUtils.isEmpty(r13)
            if (r9 != 0) goto L_0x00d4
            r9 = 2
            java.lang.String r10 = "/"
            java.lang.String[] r10 = r13.split(r10, r9)
            int r11 = r10.length
            if (r11 != r9) goto L_0x00d4
            android.content.ComponentName r9 = new android.content.ComponentName
            r11 = r10[r6]
            r10 = r10[r0]
            r9.<init>(r11, r10)
            r15.setComponent(r9)
        L_0x00d4:
            r9 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r9 = r3.resolveActivity(r15, r9)
            if (r9 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            r5.put(r8, r0)     // Catch:{ JSONException -> 0x00e2 }
            goto L_0x00f1
        L_0x00e2:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Error constructing openable urls response."
            l0.e.C(r0, r8)
            goto L_0x00f1
        L_0x00ea:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Error parsing the intent data."
            l0.e.C(r0, r8)
        L_0x00f1:
            int r7 = r7 + 1
            goto L_0x002c
        L_0x00f5:
            e8.f4 r1 = (e8.f4) r1
            r1.F(r2, r5)
            goto L_0x0110
        L_0x00fb:
            e8.f4 r1 = (e8.f4) r1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.F(r2, r0)
            goto L_0x0110
        L_0x0106:
            e8.f4 r1 = (e8.f4) r1
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.F(r2, r0)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.r2.f(java.lang.Object, java.util.Map):void");
    }
}
