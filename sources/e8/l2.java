package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.v7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l2 implements f3<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15349a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15350b;

    public l2(ja jaVar) {
        this.f15350b = jaVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.gms.internal.ads.a6} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r7, java.util.Map r8) {
        /*
            r6 = this;
            int r0 = r6.f15349a
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L_0x013b;
                case 1: goto L_0x00b0;
                case 2: goto L_0x0051;
                case 3: goto L_0x0017;
                case 4: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0181
        L_0x0009:
            java.lang.Object r0 = r6.f15350b
            com.google.android.gms.internal.ads.ja r0 = (com.google.android.gms.internal.ads.ja) r0
            com.google.android.gms.internal.ads.t7 r7 = (com.google.android.gms.internal.ads.t7) r7
            e8.cp r7 = r0.f7138b
            java.lang.String r0 = "sendMessageToNativeJs"
            r7.b(r0, r8)
            return
        L_0x0017:
            com.google.android.gms.internal.ads.t7 r7 = (com.google.android.gms.internal.ads.t7) r7
            if (r8 == 0) goto L_0x0050
            java.lang.String r7 = "height"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0050
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x004a }
            java.lang.Object r8 = r6.f15350b     // Catch:{ Exception -> 0x004a }
            com.google.android.gms.internal.ads.v7 r8 = (com.google.android.gms.internal.ads.v7) r8     // Catch:{ Exception -> 0x004a }
            monitor-enter(r8)     // Catch:{ Exception -> 0x004a }
            java.lang.Object r0 = r6.f15350b     // Catch:{ all -> 0x0047 }
            r1 = r0
            com.google.android.gms.internal.ads.v7 r1 = (com.google.android.gms.internal.ads.v7) r1     // Catch:{ all -> 0x0047 }
            int r1 = r1.N     // Catch:{ all -> 0x0047 }
            if (r1 == r7) goto L_0x0045
            r1 = r0
            com.google.android.gms.internal.ads.v7 r1 = (com.google.android.gms.internal.ads.v7) r1     // Catch:{ all -> 0x0047 }
            r1.N = r7     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.v7 r0 = (com.google.android.gms.internal.ads.v7) r0     // Catch:{ all -> 0x0047 }
            r0.requestLayout()     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x0050
        L_0x0047:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            throw r7     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            r7 = move-exception
            java.lang.String r8 = "Exception occurred while getting webview content height"
            l0.e.D(r8, r7)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r7 = "action"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "grant"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0090
            java.lang.String r7 = "amount"
            java.lang.Object r7 = r8.get(r7)     // Catch:{ NumberFormatException -> 0x0082 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0082 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0082 }
            java.lang.String r0 = "type"
            java.lang.Object r8 = r8.get(r0)     // Catch:{ NumberFormatException -> 0x0082 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x0082 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NumberFormatException -> 0x0082 }
            if (r0 != 0) goto L_0x0088
            com.google.android.gms.internal.ads.a6 r0 = new com.google.android.gms.internal.ads.a6     // Catch:{ NumberFormatException -> 0x0082 }
            r0.<init>(r8, r7)     // Catch:{ NumberFormatException -> 0x0082 }
            r2 = r0
            goto L_0x0088
        L_0x0082:
            r7 = move-exception
            java.lang.String r8 = "Unable to parse reward amount."
            l0.e.D(r8, r7)
        L_0x0088:
            java.lang.Object r7 = r6.f15350b
            e8.o3 r7 = (e8.o3) r7
            r7.S(r2)
            goto L_0x00af
        L_0x0090:
            java.lang.String r8 = "video_start"
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x00a0
            java.lang.Object r7 = r6.f15350b
            e8.o3 r7 = (e8.o3) r7
            r7.T()
            goto L_0x00af
        L_0x00a0:
            java.lang.String r8 = "video_complete"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00af
            java.lang.Object r7 = r6.f15350b
            e8.o3 r7 = (e8.o3) r7
            r7.y()
        L_0x00af:
            return
        L_0x00b0:
            d7.l r7 = d7.l.B
            com.google.android.gms.internal.ads.p6 r7 = r7.f13207x
            java.lang.Object r0 = r6.f15350b
            android.content.Context r0 = (android.content.Context) r0
            boolean r7 = r7.p(r0)
            if (r7 != 0) goto L_0x00c0
            goto L_0x013a
        L_0x00c0:
            java.lang.String r7 = "eventName"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "eventId"
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            r7.getClass()
            java.lang.String r0 = "_aa"
            int r3 = r7.hashCode()
            r4 = 94399(0x170bf, float:1.32281E-40)
            r5 = 2
            if (r3 == r4) goto L_0x0100
            r4 = 94401(0x170c1, float:1.32284E-40)
            if (r3 == r4) goto L_0x00f5
            r4 = 94407(0x170c7, float:1.32292E-40)
            if (r3 == r4) goto L_0x00ea
            goto L_0x0108
        L_0x00ea:
            java.lang.String r3 = "_ai"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x00f3
            goto L_0x0108
        L_0x00f3:
            r7 = 2
            goto L_0x010b
        L_0x00f5:
            java.lang.String r3 = "_ac"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x00fe
            goto L_0x0108
        L_0x00fe:
            r7 = 1
            goto L_0x010b
        L_0x0100:
            java.lang.String r3 = "_aa"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x010a
        L_0x0108:
            r7 = -1
            goto L_0x010b
        L_0x010a:
            r7 = 0
        L_0x010b:
            if (r7 == 0) goto L_0x012f
            if (r7 == r1) goto L_0x0123
            if (r7 == r5) goto L_0x0117
            java.lang.String r7 = "logScionEvent gmsg contained unsupported eventName"
            l0.e.I(r7)
            goto L_0x013a
        L_0x0117:
            d7.l r7 = d7.l.B
            com.google.android.gms.internal.ads.p6 r7 = r7.f13207x
            java.lang.Object r0 = r6.f15350b
            android.content.Context r0 = (android.content.Context) r0
            r7.l(r0, r8)
            goto L_0x013a
        L_0x0123:
            d7.l r7 = d7.l.B
            com.google.android.gms.internal.ads.p6 r7 = r7.f13207x
            java.lang.Object r0 = r6.f15350b
            android.content.Context r0 = (android.content.Context) r0
            r7.k(r0, r8)
            goto L_0x013a
        L_0x012f:
            d7.l r7 = d7.l.B
            com.google.android.gms.internal.ads.p6 r7 = r7.f13207x
            java.lang.Object r1 = r6.f15350b
            android.content.Context r1 = (android.content.Context) r1
            r7.c(r1, r0, r8, r2)
        L_0x013a:
            return
        L_0x013b:
            java.lang.Object r7 = r6.f15350b
            com.google.android.gms.internal.ads.o1 r7 = (com.google.android.gms.internal.ads.o1) r7
            if (r7 != 0) goto L_0x0142
            goto L_0x0180
        L_0x0142:
            java.lang.String r7 = "name"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0153
            java.lang.String r7 = "Ad metadata with no name parameter."
            l0.e.J(r7)
            java.lang.String r7 = ""
        L_0x0153:
            java.lang.String r0 = "info"
            boolean r1 = r8.containsKey(r0)
            if (r1 == 0) goto L_0x0171
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x016b }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ JSONException -> 0x016b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x016b }
            r1.<init>(r8)     // Catch:{ JSONException -> 0x016b }
            android.os.Bundle r2 = com.google.android.gms.ads.internal.util.i.n(r1)     // Catch:{ JSONException -> 0x016b }
            goto L_0x0171
        L_0x016b:
            r8 = move-exception
            java.lang.String r0 = "Failed to convert ad metadata to JSON."
            l0.e.C(r0, r8)
        L_0x0171:
            if (r2 != 0) goto L_0x0179
            java.lang.String r7 = "Failed to convert ad metadata to Bundle."
            l0.e.I(r7)
            goto L_0x0180
        L_0x0179:
            java.lang.Object r8 = r6.f15350b
            com.google.android.gms.internal.ads.o1 r8 = (com.google.android.gms.internal.ads.o1) r8
            r8.C(r7, r2)
        L_0x0180:
            return
        L_0x0181:
            java.lang.Object r8 = r6.f15350b
            e8.xo r8 = (e8.xo) r8
            com.google.android.gms.internal.ads.t7 r7 = (com.google.android.gms.internal.ads.t7) r7
            e8.hf r7 = r8.f17504b
            r7.f14902e = r1
            r7.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.l2.f(java.lang.Object, java.util.Map):void");
    }

    public l2(xo xoVar) {
        this.f15350b = xoVar;
    }

    public l2(Context context) {
        this.f15350b = context;
    }

    public l2(o1 o1Var) {
        this.f15350b = o1Var;
    }

    public l2(v7 v7Var) {
        this.f15350b = v7Var;
    }

    public l2(o3 o3Var) {
        this.f15350b = o3Var;
    }
}
