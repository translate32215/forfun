package e8;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class mx implements kx {

    /* renamed from: a  reason: collision with root package name */
    public final jx f15559a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15560b;

    public mx(jx jxVar, ArrayList arrayList) {
        this.f15559a = jxVar;
        this.f15560b = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        if (r1 == 3) goto L_0x011f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r11) {
        /*
            r10 = this;
            e8.jx r0 = r10.f15559a
            java.util.ArrayList r1 = r10.f15560b
            android.os.Bundle r11 = (android.os.Bundle) r11
            r0.getClass()
            r2 = 3
            java.lang.String r3 = "native_version"
            r11.putInt(r3, r2)
            java.lang.String r3 = "native_templates"
            r11.putStringArrayList(r3, r1)
            e8.w00 r1 = r0.f15202b
            java.util.ArrayList<java.lang.String> r1 = r1.f17194h
            java.lang.String r3 = "native_custom_templates"
            r11.putStringArrayList(r3, r1)
            e8.l<java.lang.Boolean> r1 = e8.t.L1
            e8.ti0 r3 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r3 = r3.f16769f
            java.lang.Object r1 = r3.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r3 = "landscape"
            java.lang.String r4 = "portrait"
            java.lang.String r5 = "any"
            java.lang.String r6 = "unknown"
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x006a
            e8.w00 r1 = r0.f15202b
            e8.n1 r1 = r1.f17195i
            int r1 = r1.f15571a
            if (r1 <= r2) goto L_0x006a
            java.lang.String r1 = "enable_native_media_orientation"
            r11.putBoolean(r1, r8)
            e8.w00 r1 = r0.f15202b
            e8.n1 r1 = r1.f17195i
            int r1 = r1.f15578h
            if (r1 == r8) goto L_0x005e
            if (r1 == r7) goto L_0x005c
            if (r1 == r2) goto L_0x005a
            r9 = 4
            if (r1 == r9) goto L_0x0057
            r1 = r6
            goto L_0x005f
        L_0x0057:
            java.lang.String r1 = "square"
            goto L_0x005f
        L_0x005a:
            r1 = r4
            goto L_0x005f
        L_0x005c:
            r1 = r3
            goto L_0x005f
        L_0x005e:
            r1 = r5
        L_0x005f:
            boolean r9 = r6.equals(r1)
            if (r9 != 0) goto L_0x006a
            java.lang.String r9 = "native_media_orientation"
            r11.putString(r9, r1)
        L_0x006a:
            e8.w00 r1 = r0.f15202b
            e8.n1 r1 = r1.f17195i
            int r1 = r1.f15573c
            if (r1 == 0) goto L_0x007a
            if (r1 == r8) goto L_0x0078
            if (r1 == r7) goto L_0x007b
            r3 = r6
            goto L_0x007b
        L_0x0078:
            r3 = r4
            goto L_0x007b
        L_0x007a:
            r3 = r5
        L_0x007b:
            boolean r1 = r6.equals(r3)
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = "native_image_orientation"
            r11.putString(r1, r3)
        L_0x0086:
            e8.w00 r1 = r0.f15202b
            e8.n1 r1 = r1.f17195i
            boolean r1 = r1.f15574d
            java.lang.String r3 = "native_multiple_images"
            r11.putBoolean(r3, r1)
            e8.w00 r1 = r0.f15202b
            e8.n1 r1 = r1.f17195i
            boolean r1 = r1.f15577g
            java.lang.String r3 = "use_custom_mute"
            r11.putBoolean(r3, r1)
            android.content.pm.PackageInfo r1 = r0.f15203c
            if (r1 != 0) goto L_0x00a2
            r1 = 0
            goto L_0x00a4
        L_0x00a2:
            int r1 = r1.versionCode
        L_0x00a4:
            f7.d0 r3 = r0.f15204d
            int r3 = r3.m()
            if (r1 <= r3) goto L_0x00b6
            f7.d0 r3 = r0.f15204d
            r3.k()
            f7.d0 r3 = r0.f15204d
            r3.a(r1)
        L_0x00b6:
            f7.d0 r1 = r0.f15204d
            org.json.JSONObject r1 = r1.o()
            if (r1 == 0) goto L_0x00cd
            e8.w00 r3 = r0.f15202b
            java.lang.String r3 = r3.f17192f
            org.json.JSONArray r1 = r1.optJSONArray(r3)
            if (r1 == 0) goto L_0x00cd
            java.lang.String r1 = r1.toString()
            goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00d9
            java.lang.String r3 = "native_advanced_settings"
            r11.putString(r3, r1)
        L_0x00d9:
            e8.w00 r1 = r0.f15202b
            int r1 = r1.f17197k
            if (r1 <= r8) goto L_0x00e4
            java.lang.String r3 = "max_num_ads"
            r11.putInt(r3, r1)
        L_0x00e4:
            e8.w00 r1 = r0.f15202b
            com.google.android.gms.internal.ads.z1 r1 = r1.f17189c
            if (r1 == 0) goto L_0x0136
            java.lang.String r3 = r1.f8667c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x012a
            int r3 = r1.f8665a
            if (r3 < r7) goto L_0x00fd
            int r1 = r1.f8668d
            if (r1 == r7) goto L_0x0122
            if (r1 == r2) goto L_0x011f
            goto L_0x0122
        L_0x00fd:
            int r1 = r1.f8666b
            if (r1 == r8) goto L_0x0122
            if (r1 == r7) goto L_0x011f
            r2 = 52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Instream ad video aspect ratio "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " is wrong."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            l0.e.I(r1)
            goto L_0x0122
        L_0x011f:
            java.lang.String r1 = "p"
            goto L_0x0124
        L_0x0122:
            java.lang.String r1 = "l"
        L_0x0124:
            java.lang.String r2 = "ia_var"
            r11.putString(r2, r1)
            goto L_0x0131
        L_0x012a:
            java.lang.String r1 = r1.f8667c
            java.lang.String r2 = "ad_tag"
            r11.putString(r2, r1)
        L_0x0131:
            java.lang.String r1 = "instr"
            r11.putBoolean(r1, r8)
        L_0x0136:
            e8.w00 r0 = r0.f15202b
            com.google.android.gms.internal.ads.g1 r0 = r0.a()
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = "has_delayed_banner_listener"
            r11.putBoolean(r0, r8)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.mx.a(java.lang.Object):void");
    }
}
