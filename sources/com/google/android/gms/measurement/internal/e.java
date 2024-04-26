package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.i;
import java.util.List;
import k8.ca;
import o8.k3;
import o8.v2;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class e extends k3 {

    /* renamed from: c  reason: collision with root package name */
    public String f8780c;

    /* renamed from: d  reason: collision with root package name */
    public String f8781d;

    /* renamed from: e  reason: collision with root package name */
    public int f8782e;

    /* renamed from: f  reason: collision with root package name */
    public String f8783f;

    /* renamed from: g  reason: collision with root package name */
    public long f8784g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8785h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f8786i;

    /* renamed from: j  reason: collision with root package name */
    public int f8787j;

    /* renamed from: k  reason: collision with root package name */
    public String f8788k;

    /* renamed from: l  reason: collision with root package name */
    public String f8789l;

    /* renamed from: m  reason: collision with root package name */
    public String f8790m;

    public e(l lVar, long j10) {
        super(lVar);
        this.f8785h = j10;
    }

    public final boolean k() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0160 A[Catch:{ IllegalStateException -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0162 A[Catch:{ IllegalStateException -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0176 A[SYNTHETIC, Splitter:B:56:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b0 A[Catch:{ IllegalStateException -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d6 A[Catch:{ IllegalStateException -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x023e A[SYNTHETIC, Splitter:B:92:0x023e] */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r13 = this;
            com.google.android.gms.measurement.internal.l r0 = r13.f8864a
            android.content.Context r0 = r0.f8837a
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.l r1 = r13.f8864a
            android.content.Context r1 = r1.f8837a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "unknown"
            java.lang.String r3 = "Unknown"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8797f
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
            goto L_0x008c
        L_0x002d:
            java.lang.String r2 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8797f
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0043:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0051
            r2 = r6
        L_0x0051:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.Context r7 = r7.f8837a     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r3
        L_0x0071:
            java.lang.String r3 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r4 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r3
            r3 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r3
        L_0x007a:
            com.google.android.gms.measurement.internal.l r8 = r13.f8864a
            com.google.android.gms.measurement.internal.h r8 = r8.d()
            o8.a3 r8 = r8.f8797f
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r3)
            r3 = r7
        L_0x008c:
            r13.f8780c = r0
            r13.f8783f = r2
            r13.f8781d = r3
            r13.f8782e = r4
            r2 = 0
            r13.f8784g = r2
            com.google.android.gms.measurement.internal.l r2 = r13.f8864a
            java.lang.String r2 = r2.f8838b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00b1
            com.google.android.gms.measurement.internal.l r2 = r13.f8864a
            java.lang.String r2 = r2.f8839c
            java.lang.String r4 = "am"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00b1
            r2 = 1
            goto L_0x00b2
        L_0x00b1:
            r2 = 0
        L_0x00b2:
            com.google.android.gms.measurement.internal.l r4 = r13.f8864a
            int r4 = r4.m()
            switch(r4) {
                case 0: goto L_0x0125;
                case 1: goto L_0x0117;
                case 2: goto L_0x0109;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00df;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00c3;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            goto L_0x0133
        L_0x00c3:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8803l
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.a(r8)
            goto L_0x013a
        L_0x00d1:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8802k
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.a(r8)
            goto L_0x013a
        L_0x00df:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8805n
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.a(r8)
            goto L_0x013a
        L_0x00ed:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8803l
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.a(r8)
            goto L_0x013a
        L_0x00fb:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8803l
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.a(r8)
            goto L_0x013a
        L_0x0109:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8805n
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.a(r8)
            goto L_0x013a
        L_0x0117:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8803l
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.a(r8)
            goto L_0x013a
        L_0x0125:
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.f8805n
            java.lang.String r8 = "App measurement collection enabled"
            r7.a(r8)
            goto L_0x013a
        L_0x0133:
            o8.a3 r7 = r7.f8803l
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.a(r8)
        L_0x013a:
            r13.f8788k = r6
            r13.f8789l = r6
            r13.f8790m = r6
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a
            r7.getClass()
            if (r2 == 0) goto L_0x014d
            com.google.android.gms.measurement.internal.l r2 = r13.f8864a
            java.lang.String r2 = r2.f8838b
            r13.f8789l = r2
        L_0x014d:
            r2 = 0
            com.google.android.gms.measurement.internal.l r7 = r13.f8864a     // Catch:{ IllegalStateException -> 0x01f3 }
            android.content.Context r8 = r7.f8837a     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r7 = r7.f8855s     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r9 = "google_app_id"
            java.lang.String r7 = x.f.i(r8, r9, r7)     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r3 == r8) goto L_0x0162
            r8 = r7
            goto L_0x0163
        L_0x0162:
            r8 = r6
        L_0x0163:
            r13.f8788k = r8     // Catch:{ IllegalStateException -> 0x01f3 }
            k8.ra.b()     // Catch:{ IllegalStateException -> 0x01f3 }
            com.google.android.gms.measurement.internal.l r8 = r13.f8864a     // Catch:{ IllegalStateException -> 0x01f3 }
            o8.f r8 = r8.f8843g     // Catch:{ IllegalStateException -> 0x01f3 }
            o8.u2<java.lang.Boolean> r9 = o8.v2.f23506d0     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r8 = r8.v(r2, r9)     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r9 = "admob_app_id"
            if (r8 == 0) goto L_0x01b0
            com.google.android.gms.measurement.internal.l r8 = r13.f8864a     // Catch:{ IllegalStateException -> 0x01f3 }
            android.content.Context r10 = r8.f8837a     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r8 = r8.f8855s     // Catch:{ IllegalStateException -> 0x01f3 }
            com.google.android.gms.common.internal.i.h(r10)     // Catch:{ IllegalStateException -> 0x01f3 }
            android.content.res.Resources r11 = r10.getResources()     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r12 != 0) goto L_0x018a
            goto L_0x018e
        L_0x018a:
            java.lang.String r8 = o8.r3.a(r10)     // Catch:{ IllegalStateException -> 0x01f3 }
        L_0x018e:
            java.lang.String r10 = "ga_app_id"
            java.lang.String r10 = o8.r3.b(r10, r11, r8)     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r3 == r12) goto L_0x019b
            r6 = r10
        L_0x019b:
            r13.f8790m = r6     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r3 == 0) goto L_0x01a9
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r3 != 0) goto L_0x01d4
        L_0x01a9:
            java.lang.String r3 = o8.r3.b(r9, r11, r8)     // Catch:{ IllegalStateException -> 0x01f3 }
            r13.f8789l = r3     // Catch:{ IllegalStateException -> 0x01f3 }
            goto L_0x01d4
        L_0x01b0:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r3 != 0) goto L_0x01d4
            com.google.android.gms.measurement.internal.l r3 = r13.f8864a     // Catch:{ IllegalStateException -> 0x01f3 }
            android.content.Context r6 = r3.f8837a     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r3 = r3.f8855s     // Catch:{ IllegalStateException -> 0x01f3 }
            com.google.android.gms.common.internal.i.h(r6)     // Catch:{ IllegalStateException -> 0x01f3 }
            android.content.res.Resources r7 = r6.getResources()     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r8 != 0) goto L_0x01ca
            goto L_0x01ce
        L_0x01ca:
            java.lang.String r3 = o8.r3.a(r6)     // Catch:{ IllegalStateException -> 0x01f3 }
        L_0x01ce:
            java.lang.String r3 = o8.r3.b(r9, r7, r3)     // Catch:{ IllegalStateException -> 0x01f3 }
            r13.f8789l = r3     // Catch:{ IllegalStateException -> 0x01f3 }
        L_0x01d4:
            if (r4 != 0) goto L_0x0205
            com.google.android.gms.measurement.internal.l r3 = r13.f8864a     // Catch:{ IllegalStateException -> 0x01f3 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ IllegalStateException -> 0x01f3 }
            o8.a3 r3 = r3.f8805n     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r13.f8780c     // Catch:{ IllegalStateException -> 0x01f3 }
            java.lang.String r7 = r13.f8788k     // Catch:{ IllegalStateException -> 0x01f3 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01f3 }
            if (r7 == 0) goto L_0x01ed
            java.lang.String r7 = r13.f8789l     // Catch:{ IllegalStateException -> 0x01f3 }
            goto L_0x01ef
        L_0x01ed:
            java.lang.String r7 = r13.f8788k     // Catch:{ IllegalStateException -> 0x01f3 }
        L_0x01ef:
            r3.c(r4, r6, r7)     // Catch:{ IllegalStateException -> 0x01f3 }
            goto L_0x0205
        L_0x01f3:
            r3 = move-exception
            com.google.android.gms.measurement.internal.l r4 = r13.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8797f
            java.lang.Object r0 = com.google.android.gms.measurement.internal.h.t(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r4.c(r6, r0, r3)
        L_0x0205:
            r13.f8786i = r2
            com.google.android.gms.measurement.internal.l r0 = r13.f8864a
            r0.getClass()
            com.google.android.gms.measurement.internal.l r0 = r13.f8864a
            o8.f r0 = r0.f8843g
            r0.getClass()
            java.lang.String r3 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.i.e(r3)
            android.os.Bundle r4 = r0.s()
            if (r4 != 0) goto L_0x022c
            com.google.android.gms.measurement.internal.l r3 = r0.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8797f
            java.lang.String r4 = "Failed to load metadata: Metadata bundle is null"
            r3.a(r4)
            goto L_0x0232
        L_0x022c:
            boolean r6 = r4.containsKey(r3)
            if (r6 != 0) goto L_0x0234
        L_0x0232:
            r3 = r2
            goto L_0x023c
        L_0x0234:
            int r3 = r4.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x023c:
            if (r3 == 0) goto L_0x0264
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a     // Catch:{ NotFoundException -> 0x0256 }
            android.content.Context r4 = r4.f8837a     // Catch:{ NotFoundException -> 0x0256 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NotFoundException -> 0x0256 }
            int r3 = r3.intValue()     // Catch:{ NotFoundException -> 0x0256 }
            java.lang.String[] r3 = r4.getStringArray(r3)     // Catch:{ NotFoundException -> 0x0256 }
            if (r3 != 0) goto L_0x0251
            goto L_0x0264
        L_0x0251:
            java.util.List r2 = java.util.Arrays.asList(r3)     // Catch:{ NotFoundException -> 0x0256 }
            goto L_0x0264
        L_0x0256:
            r3 = move-exception
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r4 = "Failed to load string array from metadata: resource not found"
            r0.b(r4, r3)
        L_0x0264:
            if (r2 != 0) goto L_0x0267
            goto L_0x029a
        L_0x0267:
            int r0 = r2.size()
            if (r0 != 0) goto L_0x027b
            com.google.android.gms.measurement.internal.l r0 = r13.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8802k
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.a(r2)
            goto L_0x029c
        L_0x027b:
            java.util.Iterator r0 = r2.iterator()
        L_0x027f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x029a
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.l r4 = r13.f8864a
            com.google.android.gms.measurement.internal.r r4 = r4.A()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.O(r6, r3)
            if (r3 != 0) goto L_0x027f
            goto L_0x029c
        L_0x029a:
            r13.f8786i = r2
        L_0x029c:
            if (r1 == 0) goto L_0x02a9
            com.google.android.gms.measurement.internal.l r0 = r13.f8864a
            android.content.Context r0 = r0.f8837a
            boolean r0 = b8.a.e(r0)
            r13.f8787j = r0
            return
        L_0x02a9:
            r13.f8787j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.l():void");
    }

    public final String m() {
        i();
        i.h(this.f8780c);
        return this.f8780c;
    }

    public final String n() {
        ca.b();
        if (this.f8864a.f8843g.v((String) null, v2.f23534r0)) {
            h();
        }
        i();
        i.h(this.f8788k);
        return this.f8788k;
    }
}
