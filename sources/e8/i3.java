package e8;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.d;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import e8.gc;
import e8.lc;
import e8.pb;
import e8.pc;
import e8.qc;
import e8.rc;
import e8.wh0;
import java.util.HashMap;
import java.util.Map;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i3<T extends wh0 & pb & t7 & gc & lc & pc & qc & rc> implements f3<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a f14972a;

    /* renamed from: b  reason: collision with root package name */
    public final oq f14973b;

    /* renamed from: c  reason: collision with root package name */
    public final t20 f14974c;

    /* renamed from: d  reason: collision with root package name */
    public final c9 f14975d = new c9();

    /* renamed from: e  reason: collision with root package name */
    public final b6 f14976e;

    /* renamed from: f  reason: collision with root package name */
    public final dt f14977f;

    public i3(a aVar, b6 b6Var, dt dtVar, oq oqVar, t20 t20) {
        this.f14972a = aVar;
        this.f14976e = b6Var;
        this.f14977f = dtVar;
        this.f14973b = oqVar;
        this.f14974c = t20;
    }

    public static Uri a(Context context, tm tmVar, Uri uri, View view, Activity activity) {
        if (tmVar == null) {
            return uri;
        }
        try {
            boolean z10 = false;
            if (tmVar.c(uri)) {
                String[] strArr = tm.f8205c;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (uri.getPath().endsWith(strArr[i10])) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (z10) {
                return tmVar.a(uri, context, view, activity);
            }
            return uri;
        } catch (o60 unused) {
            return uri;
        } catch (Exception e10) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static int d(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return l.B.f13188e.n();
        }
        return -1;
    }

    public static Uri g(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            String valueOf = String.valueOf(uri.toString());
            e.C(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e10);
        }
        return uri;
    }

    public final boolean b(T t10, Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        p pVar = l.B.f13186c;
        boolean t11 = p.t(context);
        p pVar2 = l.B.f13186c;
        f u10 = p.u(context);
        oq oqVar = this.f14973b;
        if (oqVar != null) {
            et.t6(context, oqVar, this.f14974c, this.f14977f, str2, "offline_open");
        }
        t7 t7Var = (t7) t10;
        boolean z10 = t7Var.j().b() && !(t7Var.b() instanceof Activity);
        if (t11) {
            dt dtVar = this.f14977f;
            dtVar.i(new j8(dtVar, this.f14975d, str3));
            return false;
        }
        p pVar3 = l.B.f13186c;
        if (new d(context2).a() && u10 != null && !z10) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.E4)).booleanValue()) {
                if (t7Var.j().b()) {
                    String str4 = str3;
                    et.s6(t7Var.b(), (com.google.android.gms.ads.internal.overlay.a) null, u10, this.f14977f, this.f14973b, this.f14974c, str2, str);
                } else {
                    String str5 = str3;
                    ((pc) t10).g(u10, this.f14977f, this.f14973b, this.f14974c, str2, str, l.B.f13188e.n());
                }
                oq oqVar2 = this.f14973b;
                if (oqVar2 != null) {
                    et.t6(context, oqVar2, this.f14974c, this.f14977f, str2, "dialog_impression");
                }
                t10.n();
                return true;
            }
        }
        dt dtVar2 = this.f14977f;
        dtVar2.i(new gf0(dtVar2, str3));
        if (this.f14973b != null) {
            HashMap hashMap = new HashMap();
            p pVar4 = l.B.f13186c;
            if (!new d(context2).a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (u10 == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) ti0.f16763j.f16769f.a(t.E4)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z10) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            et.u6(context, this.f14973b, this.f14974c, this.f14977f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    public final void c(boolean z10) {
        b6 b6Var = this.f14976e;
        if (b6Var != null) {
            b6Var.u(z10);
        }
    }

    public final void e(int i10) {
        if (this.f14973b != null) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
                t20 t20 = this.f14974c;
                u20 c10 = u20.c("cct_action");
                c10.f16842a.put("cct_open_status", f0.f14523a[i10 - 1]);
                t20.a(c10);
                return;
            }
            p9 a10 = this.f14973b.a();
            ((Map) a10.f15880b).put("action", "cct_action");
            ((Map) a10.f15880b).put("cct_open_status", f0.f14523a[i10 - 1]);
            a10.l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0241, code lost:
        if (r4.b(r12, new java.util.ArrayList()) != null) goto L_0x0292;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r19, java.util.Map r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            r3 = r19
            e8.wh0 r3 = (e8.wh0) r3
            java.lang.String r0 = "u"
            java.lang.Object r4 = r2.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            r5 = r3
            com.google.android.gms.internal.ads.t7 r5 = (com.google.android.gms.internal.ads.t7) r5
            android.content.Context r6 = r5.getContext()
            r7 = 1
            java.lang.String r4 = e8.n8.c(r4, r6, r7)
            java.lang.String r6 = "a"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x002c
            java.lang.String r0 = "Action missing from an open GMSG."
            l0.e.K(r0)
            return
        L_0x002c:
            com.google.android.gms.ads.internal.a r8 = r1.f14972a
            if (r8 == 0) goto L_0x003c
            boolean r8 = r8.c()
            if (r8 != 0) goto L_0x003c
            com.google.android.gms.ads.internal.a r0 = r1.f14972a
            r0.a(r4)
            return
        L_0x003c:
            com.google.android.gms.internal.ads.qe r8 = r5.k()
            com.google.android.gms.internal.ads.re r9 = r5.p()
            r10 = 0
            if (r8 == 0) goto L_0x004e
            if (r9 == 0) goto L_0x004e
            boolean r8 = r8.f7949d0
            java.lang.String r9 = r9.f8030b
            goto L_0x0051
        L_0x004e:
            java.lang.String r9 = ""
            r8 = 0
        L_0x0051:
            java.lang.String r11 = "expand"
            boolean r11 = r11.equalsIgnoreCase(r6)
            java.lang.String r12 = "1"
            java.lang.String r13 = "custom_close"
            if (r11 == 0) goto L_0x007e
            boolean r0 = r5.u()
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "Cannot expand WebView that is already expanded."
            l0.e.K(r0)
            return
        L_0x0069:
            r1.c(r10)
            e8.pc r3 = (e8.pc) r3
            java.lang.Object r0 = r2.get(r13)
            boolean r0 = r12.equals(r0)
            int r2 = d(r20)
            r3.B(r0, r2)
            return
        L_0x007e:
            java.lang.String r11 = "webapp"
            boolean r11 = r11.equalsIgnoreCase(r6)
            if (r11 == 0) goto L_0x00bf
            r1.c(r10)
            if (r4 == 0) goto L_0x009d
            e8.pc r3 = (e8.pc) r3
            java.lang.Object r0 = r2.get(r13)
            boolean r0 = r12.equals(r0)
            int r2 = d(r20)
            r3.Q(r0, r2, r4)
            return
        L_0x009d:
            e8.pc r3 = (e8.pc) r3
            java.lang.Object r0 = r2.get(r13)
            boolean r0 = r12.equals(r0)
            int r4 = d(r20)
            java.lang.String r5 = "html"
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "baseurl"
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            r3.k0(r0, r4, r5, r2)
            return
        L_0x00bf:
            java.lang.String r11 = "chrome_custom_tab"
            boolean r11 = r11.equalsIgnoreCase(r6)
            if (r11 == 0) goto L_0x0142
            e8.l<java.lang.Boolean> r11 = e8.t.f16617m2
            e8.ti0 r12 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r12 = r12.f16769f
            java.lang.Object r11 = r12.a(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0142
            r1.c(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "Cannot open browser with null or empty url"
            l0.e.K(r0)
            r0 = 6
            r1.e(r0)
            return
        L_0x00ec:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            android.content.Context r2 = r5.getContext()
            com.google.android.gms.internal.ads.tm r4 = r5.s()
            android.view.View r6 = r5.getView()
            android.app.Activity r7 = r5.b()
            android.net.Uri r0 = a(r2, r4, r0, r6, r7)
            android.net.Uri r0 = g(r0)
            if (r8 == 0) goto L_0x011c
            e8.dt r2 = r1.f14977f
            if (r2 == 0) goto L_0x011c
            android.content.Context r2 = r5.getContext()
            java.lang.String r4 = r0.toString()
            boolean r2 = r1.b(r3, r2, r4, r9)
            if (r2 != 0) goto L_0x0442
        L_0x011c:
            d7.l r2 = d7.l.B     // Catch:{ ActivityNotFoundException -> 0x0130 }
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c     // Catch:{ ActivityNotFoundException -> 0x0130 }
            com.google.android.gms.internal.ads.t7 r3 = (com.google.android.gms.internal.ads.t7) r3     // Catch:{ ActivityNotFoundException -> 0x0130 }
            android.app.Activity r3 = r3.b()     // Catch:{ ActivityNotFoundException -> 0x0130 }
            int r0 = r2.b(r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0130 }
            r1.e(r0)
            return
        L_0x012e:
            r0 = move-exception
            goto L_0x013d
        L_0x0130:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x012e }
            l0.e.K(r0)     // Catch:{ all -> 0x012e }
            r0 = 5
            r1.e(r0)
            return
        L_0x013d:
            r2 = 7
            r1.e(r2)
            throw r0
        L_0x0142:
            java.lang.String r11 = "app"
            boolean r11 = r11.equalsIgnoreCase(r6)
            r12 = 0
            if (r11 == 0) goto L_0x02c0
            java.lang.String r11 = "system_browser"
            java.lang.Object r11 = r2.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r13 = "true"
            boolean r11 = r13.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x02c0
            r1.c(r7)
            e8.l3 r4 = new e8.l3
            android.content.Context r6 = r5.getContext()
            com.google.android.gms.internal.ads.tm r11 = r5.s()
            android.view.View r13 = r5.getView()
            r4.<init>(r6, r11, r13)
            java.lang.String r14 = "activity"
            java.lang.Object r14 = r6.getSystemService(r14)
            android.app.ActivityManager r14 = (android.app.ActivityManager) r14
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x0185
            goto L_0x0292
        L_0x0185:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri r0 = a(r6, r11, r0, r13, r12)
            android.net.Uri r0 = g(r0)
            java.lang.String r11 = "use_first_package"
            java.lang.Object r11 = r2.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            java.lang.String r13 = "use_running_process"
            java.lang.Object r13 = r2.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = java.lang.Boolean.parseBoolean(r13)
            java.lang.String r15 = "use_custom_tabs"
            java.lang.Object r2 = r2.get(r15)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x01cb
            e8.l<java.lang.Boolean> r2 = e8.t.f16605k2
            e8.ti0 r15 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r15 = r15.f16769f
            java.lang.Object r2 = r15.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r7 = 0
        L_0x01cb:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r15 = "http"
            boolean r2 = r15.equalsIgnoreCase(r2)
            java.lang.String r12 = "https"
            if (r2 == 0) goto L_0x01e6
            android.net.Uri$Builder r2 = r0.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r12)
            android.net.Uri r12 = r2.build()
            goto L_0x01fe
        L_0x01e6:
            java.lang.String r2 = r0.getScheme()
            boolean r2 = r12.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01fd
            android.net.Uri$Builder r2 = r0.buildUpon()
            android.net.Uri$Builder r2 = r2.scheme(r15)
            android.net.Uri r12 = r2.build()
            goto L_0x01fe
        L_0x01fd:
            r12 = 0
        L_0x01fe:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r0 = e8.l3.c(r0)
            android.content.Intent r12 = e8.l3.c(r12)
            if (r7 == 0) goto L_0x021b
            d7.l r7 = d7.l.B
            com.google.android.gms.ads.internal.util.p r7 = r7.f13186c
            com.google.android.gms.ads.internal.util.p.p(r6, r0)
            d7.l r7 = d7.l.B
            com.google.android.gms.ads.internal.util.p r7 = r7.f13186c
            com.google.android.gms.ads.internal.util.p.p(r6, r12)
        L_0x021b:
            android.content.pm.ResolveInfo r6 = r4.b(r0, r2)
            if (r6 == 0) goto L_0x0227
            android.content.Intent r12 = e8.l3.a(r0, r6)
            goto L_0x0292
        L_0x0227:
            if (r12 == 0) goto L_0x0244
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.pm.ResolveInfo r6 = r4.b(r12, r6)
            if (r6 == 0) goto L_0x0244
            android.content.Intent r12 = e8.l3.a(r0, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.pm.ResolveInfo r4 = r4.b(r12, r6)
            if (r4 == 0) goto L_0x0244
            goto L_0x0292
        L_0x0244:
            int r4 = r2.size()
            if (r4 != 0) goto L_0x024c
        L_0x024a:
            r12 = r0
            goto L_0x0292
        L_0x024c:
            if (r13 == 0) goto L_0x0286
            if (r14 == 0) goto L_0x0286
            java.util.List r4 = r14.getRunningAppProcesses()
            if (r4 == 0) goto L_0x0286
            int r6 = r2.size()
            r7 = 0
        L_0x025b:
            if (r7 >= r6) goto L_0x0286
            java.lang.Object r12 = r2.get(r7)
            int r7 = r7 + 1
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            java.util.Iterator r13 = r4.iterator()
        L_0x0269:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x025b
            java.lang.Object r14 = r13.next()
            android.app.ActivityManager$RunningAppProcessInfo r14 = (android.app.ActivityManager.RunningAppProcessInfo) r14
            java.lang.String r14 = r14.processName
            android.content.pm.ActivityInfo r15 = r12.activityInfo
            java.lang.String r15 = r15.packageName
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0269
            android.content.Intent r12 = e8.l3.a(r0, r12)
            goto L_0x0292
        L_0x0286:
            if (r11 == 0) goto L_0x024a
            java.lang.Object r2 = r2.get(r10)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.Intent r12 = e8.l3.a(r0, r2)
        L_0x0292:
            if (r8 == 0) goto L_0x02ac
            e8.dt r0 = r1.f14977f
            if (r0 == 0) goto L_0x02ac
            if (r12 == 0) goto L_0x02ac
            android.content.Context r0 = r5.getContext()
            android.net.Uri r2 = r12.getData()
            java.lang.String r2 = r2.toString()
            boolean r0 = r1.b(r3, r0, r2, r9)
            if (r0 != 0) goto L_0x0442
        L_0x02ac:
            e8.pc r3 = (e8.pc) r3     // Catch:{ ActivityNotFoundException -> 0x02b7 }
            e7.c r0 = new e7.c     // Catch:{ ActivityNotFoundException -> 0x02b7 }
            r0.<init>(r12)     // Catch:{ ActivityNotFoundException -> 0x02b7 }
            r3.U(r0)     // Catch:{ ActivityNotFoundException -> 0x02b7 }
            return
        L_0x02b7:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            l0.e.K(r0)
            return
        L_0x02c0:
            java.lang.String r0 = "open_app"
            boolean r0 = r0.equalsIgnoreCase(r6)
            java.lang.String r6 = "p"
            if (r0 == 0) goto L_0x031e
            e8.l<java.lang.Boolean> r0 = e8.t.f16679w4
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r0 = r4.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0442
            r1.c(r7)
            java.lang.Object r0 = r2.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x02ed
            java.lang.String r0 = "Package name missing from open app action."
            l0.e.K(r0)
            return
        L_0x02ed:
            if (r8 == 0) goto L_0x02fd
            e8.dt r2 = r1.f14977f
            if (r2 == 0) goto L_0x02fd
            android.content.Context r2 = r5.getContext()
            boolean r2 = r1.b(r3, r2, r0, r9)
            if (r2 != 0) goto L_0x0442
        L_0x02fd:
            android.content.Context r2 = r5.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 != 0) goto L_0x030d
            java.lang.String r0 = "Cannot get package manager from open app action."
            l0.e.K(r0)
            return
        L_0x030d:
            android.content.Intent r0 = r2.getLaunchIntentForPackage(r0)
            if (r0 == 0) goto L_0x031d
            e8.pc r3 = (e8.pc) r3
            e7.c r2 = new e7.c
            r2.<init>(r0)
            r3.U(r2)
        L_0x031d:
            return
        L_0x031e:
            r1.c(r7)
            java.lang.String r0 = "intent_url"
            java.lang.Object r0 = r2.get(r0)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0351
            android.content.Intent r12 = android.content.Intent.parseUri(r7, r10)     // Catch:{ URISyntaxException -> 0x0335 }
            goto L_0x0352
        L_0x0335:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = "Error parsing the url: "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r11 = r7.length()
            if (r11 == 0) goto L_0x0348
            java.lang.String r0 = r0.concat(r7)
            goto L_0x034e
        L_0x0348:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
            r0 = r7
        L_0x034e:
            l0.e.C(r0, r10)
        L_0x0351:
            r12 = 0
        L_0x0352:
            if (r12 == 0) goto L_0x03a5
            android.net.Uri r0 = r12.getData()
            if (r0 == 0) goto L_0x03a5
            android.net.Uri r0 = r12.getData()
            android.net.Uri r7 = android.net.Uri.EMPTY
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x03a5
            android.content.Context r7 = r5.getContext()
            com.google.android.gms.internal.ads.tm r10 = r5.s()
            android.view.View r11 = r5.getView()
            android.app.Activity r13 = r5.b()
            android.net.Uri r0 = a(r7, r10, r0, r11, r13)
            android.net.Uri r0 = g(r0)
            java.lang.String r7 = r12.getType()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x03a2
            e8.l<java.lang.Boolean> r7 = e8.t.f16685x4
            e8.ti0 r10 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r10 = r10.f16769f
            java.lang.Object r7 = r10.a(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x03a2
            java.lang.String r7 = r12.getType()
            r12.setDataAndType(r0, r7)
            goto L_0x03a5
        L_0x03a2:
            r12.setData(r0)
        L_0x03a5:
            if (r12 == 0) goto L_0x03ca
            if (r8 == 0) goto L_0x03bf
            e8.dt r0 = r1.f14977f
            if (r0 == 0) goto L_0x03bf
            android.content.Context r0 = r5.getContext()
            android.net.Uri r2 = r12.getData()
            java.lang.String r2 = r2.toString()
            boolean r0 = r1.b(r3, r0, r2, r9)
            if (r0 != 0) goto L_0x0442
        L_0x03bf:
            e8.pc r3 = (e8.pc) r3
            e7.c r0 = new e7.c
            r0.<init>(r12)
            r3.U(r0)
            return
        L_0x03ca:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x03f0
            android.net.Uri r0 = android.net.Uri.parse(r4)
            android.content.Context r4 = r5.getContext()
            com.google.android.gms.internal.ads.tm r7 = r5.s()
            android.view.View r10 = r5.getView()
            android.app.Activity r11 = r5.b()
            android.net.Uri r0 = a(r4, r7, r0, r10, r11)
            android.net.Uri r0 = g(r0)
            java.lang.String r4 = r0.toString()
        L_0x03f0:
            r12 = r4
            if (r8 == 0) goto L_0x0401
            e8.dt r0 = r1.f14977f
            if (r0 == 0) goto L_0x0401
            android.content.Context r0 = r5.getContext()
            boolean r0 = r1.b(r3, r0, r12, r9)
            if (r0 != 0) goto L_0x0442
        L_0x0401:
            e8.pc r3 = (e8.pc) r3
            e7.c r0 = new e7.c
            java.lang.String r4 = "i"
            java.lang.Object r4 = r2.get(r4)
            r11 = r4
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r4 = "m"
            java.lang.Object r4 = r2.get(r4)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r4 = r2.get(r6)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r4 = "c"
            java.lang.Object r4 = r2.get(r4)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r4 = "f"
            java.lang.Object r4 = r2.get(r4)
            r16 = r4
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r4 = "e"
            java.lang.Object r2 = r2.get(r4)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r3.U(r0)
        L_0x0442:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i3.f(java.lang.Object, java.util.Map):void");
    }
}
