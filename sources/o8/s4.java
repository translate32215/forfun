package o8;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import cb.d;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.p;
import com.google.android.gms.measurement.internal.r;
import e8.qz;
import e8.s30;
import e8.zq;
import f7.j0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k8.ca;
import k8.ia;
import r7.m;
import t1.c;
import u.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class s4 extends k3 {

    /* renamed from: c  reason: collision with root package name */
    public r4 f23428c;

    /* renamed from: d  reason: collision with root package name */
    public c f23429d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<h4> f23430e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f23431f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<String> f23432g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    public final Object f23433h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public g f23434i = new g((Boolean) null, (Boolean) null);

    /* renamed from: j  reason: collision with root package name */
    public int f23435j = 100;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicLong f23436k = new AtomicLong(0);

    /* renamed from: l  reason: collision with root package name */
    public long f23437l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f23438m = 100;

    /* renamed from: n  reason: collision with root package name */
    public final d6 f23439n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23440o = true;

    /* renamed from: p  reason: collision with root package name */
    public final z5 f23441p = new d(this);

    public s4(l lVar) {
        super(lVar);
        this.f23439n = new d6(lVar);
    }

    public static void G(s4 s4Var, g gVar, int i10, long j10, boolean z10, boolean z11) {
        s4Var.h();
        s4Var.i();
        if (j10 > s4Var.f23437l || !g.h(s4Var.f23438m, i10)) {
            j t10 = s4Var.f8864a.t();
            l lVar = t10.f8864a;
            t10.h();
            if (t10.u(i10)) {
                SharedPreferences.Editor edit = t10.o().edit();
                edit.putString("consent_settings", gVar.e());
                edit.putInt("consent_source", i10);
                edit.apply();
                s4Var.f23437l = j10;
                s4Var.f23438m = i10;
                p y10 = s4Var.f8864a.y();
                y10.h();
                y10.i();
                if (z10) {
                    y10.u();
                    y10.f8864a.r().m();
                }
                if (y10.o()) {
                    y10.t(new d5(y10, y10.q(false), 1));
                }
                if (z11) {
                    s4Var.f8864a.y().y(new AtomicReference());
                    return;
                }
                return;
            }
            s4Var.f8864a.d().f8803l.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
            return;
        }
        s4Var.f8864a.d().f8803l.b("Dropped out-of-date consent setting, proposed settings", gVar);
    }

    public final void A(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int i11;
        String str3 = str2;
        Object obj2 = obj;
        String str4 = str == null ? "app" : str;
        if (z10) {
            i10 = this.f8864a.A().k0(str3);
        } else {
            r A = this.f8864a.A();
            if (A.P("user property", str3)) {
                if (!A.L("user property", g4.f23219a, (String[]) null, str3)) {
                    i10 = 15;
                } else {
                    A.f8864a.getClass();
                    if (A.K("user property", 24, str3)) {
                        i10 = 0;
                    }
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            r A2 = this.f8864a.A();
            this.f8864a.getClass();
            this.f8864a.A().z(this.f23441p, (String) null, i10, "_ev", A2.q(str3, 24, true), str3 != null ? str2.length() : 0);
        } else if (obj2 != null) {
            int g02 = this.f8864a.A().g0(str3, obj2);
            if (g02 != 0) {
                r A3 = this.f8864a.A();
                this.f8864a.getClass();
                String q10 = A3.q(str3, 24, true);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    i11 = String.valueOf(obj).length();
                } else {
                    i11 = 0;
                }
                this.f8864a.A().z(this.f23441p, (String) null, g02, "_ev", q10, i11);
                return;
            }
            Object p10 = this.f8864a.A().p(str3, obj2);
            if (p10 != null) {
                t(str4, str2, j10, p10);
            }
        } else {
            t(str4, str2, j10, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i.e(r10)
            com.google.android.gms.common.internal.i.e(r11)
            r9.h()
            r9.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            r1 = 1
            java.lang.String r2 = "_npa"
            if (r0 == 0) goto L_0x0065
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0053
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r1 == r11) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.j3 r0 = r0.f8817l
            long r5 = r11.longValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x004e
            java.lang.String r12 = "true"
        L_0x004e:
            r0.b(r12)
            r7 = r11
            goto L_0x0063
        L_0x0053:
            if (r12 != 0) goto L_0x0065
            com.google.android.gms.measurement.internal.l r11 = r9.f8864a
            com.google.android.gms.measurement.internal.j r11 = r11.t()
            o8.j3 r11 = r11.f8817l
            java.lang.String r0 = "unset"
            r11.b(r0)
            r7 = r12
        L_0x0063:
            r4 = r2
            goto L_0x0067
        L_0x0065:
            r4 = r11
            r7 = r12
        L_0x0067:
            com.google.android.gms.measurement.internal.l r11 = r9.f8864a
            boolean r11 = r11.g()
            if (r11 != 0) goto L_0x007d
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.f8805n
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L_0x007d:
            com.google.android.gms.measurement.internal.l r11 = r9.f8864a
            boolean r11 = r11.i()
            if (r11 != 0) goto L_0x0086
            return
        L_0x0086:
            o8.w5 r11 = new o8.w5
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.p r10 = r10.y()
            r10.h()
            r10.i()
            r10.u()
            com.google.android.gms.measurement.internal.l r12 = r10.f8864a
            com.google.android.gms.measurement.internal.g r12 = r12.r()
            r12.getClass()
            android.os.Parcel r13 = android.os.Parcel.obtain()
            r14 = 0
            o8.x5.a(r11, r13, r14)
            byte[] r0 = r13.marshall()
            r13.recycle()
            int r13 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r2) goto L_0x00c8
            com.google.android.gms.measurement.internal.l r12 = r12.f8864a
            com.google.android.gms.measurement.internal.h r12 = r12.d()
            o8.a3 r12 = r12.f8798g
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.a(r13)
            goto L_0x00cc
        L_0x00c8:
            boolean r14 = r12.o(r1, r0)
        L_0x00cc:
            o8.b6 r12 = r10.q(r1)
            o8.b5 r13 = new o8.b5
            r13.<init>(r10, r12, r14, r11)
            r10.t(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.s4.B(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void C(Bundle bundle, long j10) {
        ca.b();
        if (!this.f8864a.f8843g.v((String) null, v2.f23532q0) || TextUtils.isEmpty(this.f8864a.q().n())) {
            v(bundle, 0, j10);
        } else {
            this.f8864a.d().f8802k.a("Using developer consent only; google app id found");
        }
    }

    public final void D(Boolean bool, boolean z10) {
        h();
        i();
        this.f8864a.d().f8804m.b("Setting app measurement enabled (FE)", bool);
        this.f8864a.t().r(bool);
        if (z10) {
            j t10 = this.f8864a.t();
            l lVar = t10.f8864a;
            t10.h();
            SharedPreferences.Editor edit = t10.o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        l lVar2 = this.f8864a;
        lVar2.b().h();
        if (lVar2.D || (bool != null && !bool.booleanValue())) {
            E();
        }
    }

    public final void E() {
        h();
        String a10 = this.f8864a.t().f8817l.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                B("app", "_npa", (Object) null, this.f8864a.f8850n.b());
            } else {
                B("app", "_npa", Long.valueOf(true != "true".equals(a10) ? 0 : 1), this.f8864a.f8850n.b());
            }
        }
        if (!this.f8864a.g() || !this.f23440o) {
            this.f8864a.d().f8804m.a("Updating Scion state (FE)");
            p y10 = this.f8864a.y();
            y10.h();
            y10.i();
            y10.t(new c5(y10, y10.q(true), 1));
            return;
        }
        this.f8864a.d().f8804m.a("Recording app launch after enabling measurement for the first time (FE)");
        H();
        ia.b();
        if (this.f8864a.f8843g.v((String) null, v2.f23518j0)) {
            this.f8864a.z().f23379d.a();
        }
        this.f8864a.b().r(new s30(this));
    }

    public final String F() {
        return this.f23432g.get();
    }

    public final void H() {
        h();
        i();
        if (this.f8864a.i()) {
            if (this.f8864a.f8843g.v((String) null, v2.Z)) {
                f fVar = this.f8864a.f8843g;
                fVar.f8864a.getClass();
                Boolean t10 = fVar.t("google_analytics_deferred_deep_link_enabled");
                if (t10 != null && t10.booleanValue()) {
                    this.f8864a.d().f8804m.a("Deferred Deep Link feature enabled.");
                    this.f8864a.b().r(new qz(this));
                }
            }
            p y10 = this.f8864a.y();
            y10.h();
            y10.i();
            b6 q10 = y10.q(true);
            y10.f8864a.r().o(3, new byte[0]);
            y10.t(new d5(y10, q10, 0));
            this.f23440o = false;
            j t11 = this.f8864a.t();
            t11.h();
            String string = t11.o().getString("previous_os_version", (String) null);
            t11.f8864a.p().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = t11.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f8864a.p().k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    o("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void I(String str, String str2, Bundle bundle) {
        long b10 = this.f8864a.f8850n.b();
        i.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", b10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f8864a.b().r(new j0(this, bundle2));
    }

    public final boolean k() {
        return false;
    }

    public final void l() {
        if ((this.f8864a.f8837a.getApplicationContext() instanceof Application) && this.f23428c != null) {
            ((Application) this.f8864a.f8837a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f23428c);
        }
    }

    public final void m(String str, String str2, Bundle bundle) {
        n(str, str2, bundle, true, true, this.f8864a.f8850n.b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r3 > 100) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r6 > 100) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r2 = r1.f8864a.d().f8805n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if (r13 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ed, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        if (r14 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f4, code lost:
        r2.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (r1.f23640c != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
        r2 = r1.f23641d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        r2 = r1.f23640c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0102, code lost:
        r12 = new o8.x4(r13, r14, r1.f8864a.A().n0(), true, r26);
        r1.f23640c = r12;
        r1.f23641d = r2;
        r1.f23646i = r12;
        r1.f8864a.b().r(new e8.zq(r1, r0, r12, r2, r1.f8864a.f8850n.a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r2 = r0
            goto L_0x000a
        L_0x0008:
            r2 = r21
        L_0x000a:
            if (r23 != 0) goto L_0x0012
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L_0x0014
        L_0x0012:
            r0 = r23
        L_0x0014:
            java.lang.String r1 = "screen_view"
            r3 = r22
            boolean r1 = com.google.android.gms.measurement.internal.r.Y(r3, r1)
            r4 = 0
            if (r1 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.l r1 = r11.f8864a
            o8.z4 r1 = r1.x()
            java.lang.Object r5 = r1.f23649l
            monitor-enter(r5)
            boolean r2 = r1.f23648k     // Catch:{ all -> 0x013f }
            if (r2 != 0) goto L_0x003c
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x013f }
            o8.a3 r0 = r0.f8802k     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.a(r1)     // Catch:{ all -> 0x013f }
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            goto L_0x013e
        L_0x003c:
            java.lang.String r2 = "screen_name"
            java.lang.String r13 = r0.getString(r2)     // Catch:{ all -> 0x013f }
            r2 = 100
            if (r13 == 0) goto L_0x006f
            int r3 = r13.length()     // Catch:{ all -> 0x013f }
            if (r3 <= 0) goto L_0x0057
            int r3 = r13.length()     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.l r6 = r1.f8864a     // Catch:{ all -> 0x013f }
            r6.getClass()     // Catch:{ all -> 0x013f }
            if (r3 <= r2) goto L_0x006f
        L_0x0057:
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x013f }
            o8.a3 r0 = r0.f8802k     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x013f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x013f }
            r0.b(r1, r2)     // Catch:{ all -> 0x013f }
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            goto L_0x013e
        L_0x006f:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x013f }
            if (r3 == 0) goto L_0x00a0
            int r6 = r3.length()     // Catch:{ all -> 0x013f }
            if (r6 <= 0) goto L_0x0088
            int r6 = r3.length()     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.l r7 = r1.f8864a     // Catch:{ all -> 0x013f }
            r7.getClass()     // Catch:{ all -> 0x013f }
            if (r6 <= r2) goto L_0x00a0
        L_0x0088:
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x013f }
            o8.a3 r0 = r0.f8802k     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r3.length()     // Catch:{ all -> 0x013f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x013f }
            r0.b(r1, r2)     // Catch:{ all -> 0x013f }
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            goto L_0x013e
        L_0x00a0:
            if (r3 != 0) goto L_0x00b5
            android.app.Activity r2 = r1.f23644g     // Catch:{ all -> 0x013f }
            if (r2 == 0) goto L_0x00b1
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "Activity"
            java.lang.String r2 = r1.p(r2, r3)     // Catch:{ all -> 0x013f }
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r2 = "Activity"
        L_0x00b3:
            r14 = r2
            goto L_0x00b6
        L_0x00b5:
            r14 = r3
        L_0x00b6:
            o8.x4 r2 = r1.f23640c     // Catch:{ all -> 0x013f }
            boolean r3 = r1.f23645h     // Catch:{ all -> 0x013f }
            if (r3 == 0) goto L_0x00df
            if (r2 == 0) goto L_0x00df
            r1.f23645h = r4     // Catch:{ all -> 0x013f }
            java.lang.String r3 = r2.f23602b     // Catch:{ all -> 0x013f }
            boolean r3 = com.google.android.gms.measurement.internal.r.Y(r3, r14)     // Catch:{ all -> 0x013f }
            java.lang.String r2 = r2.f23601a     // Catch:{ all -> 0x013f }
            boolean r2 = com.google.android.gms.measurement.internal.r.Y(r2, r13)     // Catch:{ all -> 0x013f }
            if (r3 == 0) goto L_0x00df
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x013f }
            o8.a3 r0 = r0.f8802k     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r1)     // Catch:{ all -> 0x013f }
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            goto L_0x013e
        L_0x00df:
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8805n
            if (r13 != 0) goto L_0x00ed
            java.lang.String r3 = "null"
            goto L_0x00ee
        L_0x00ed:
            r3 = r13
        L_0x00ee:
            if (r14 != 0) goto L_0x00f3
            java.lang.String r4 = "null"
            goto L_0x00f4
        L_0x00f3:
            r4 = r14
        L_0x00f4:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.c(r5, r3, r4)
            o8.x4 r2 = r1.f23640c
            if (r2 != 0) goto L_0x0100
            o8.x4 r2 = r1.f23641d
            goto L_0x0102
        L_0x0100:
            o8.x4 r2 = r1.f23640c
        L_0x0102:
            o8.x4 r3 = new o8.x4
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a
            com.google.android.gms.measurement.internal.r r4 = r4.A()
            long r15 = r4.n0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.f23640c = r3
            r1.f23641d = r2
            r1.f23646i = r3
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a
            z7.b r4 = r4.f8850n
            long r4 = r4.a()
            com.google.android.gms.measurement.internal.l r6 = r1.f8864a
            com.google.android.gms.measurement.internal.k r6 = r6.b()
            e8.zq r7 = new e8.zq
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>((o8.z4) r22, (android.os.Bundle) r23, (o8.x4) r24, (o8.x4) r25, (long) r26)
            r6.r(r7)
        L_0x013e:
            return
        L_0x013f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x013f }
            throw r0
        L_0x0142:
            r1 = 1
            if (r25 == 0) goto L_0x0152
            t1.c r5 = r11.f23429d
            if (r5 == 0) goto L_0x0152
            boolean r5 = com.google.android.gms.measurement.internal.r.U(r22)
            if (r5 == 0) goto L_0x0150
            goto L_0x0152
        L_0x0150:
            r8 = 0
            goto L_0x0153
        L_0x0152:
            r8 = 1
        L_0x0153:
            r10 = 0
            r1 = r20
            r3 = r22
            r4 = r26
            r6 = r0
            r7 = r25
            r9 = r24
            r1.s(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.s4.n(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void o(String str, String str2, Bundle bundle) {
        h();
        p(str, str2, this.f8864a.f8850n.b(), bundle);
    }

    public final void p(String str, String str2, long j10, Bundle bundle) {
        h();
        q(str, str2, j10, bundle, true, this.f23429d == null || r.U(str2), true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.lang.String r24, java.lang.String r25, long r26, android.os.Bundle r28, boolean r29, boolean r30, boolean r31, java.lang.String r32) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r12 = r28
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.i.e(r24)
            if (r12 == 0) goto L_0x056e
            r23.h()
            r23.i()
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x0560
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.e r1 = r1.q()
            java.util.List<java.lang.String> r1 = r1.f8786i
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.c(r1, r9, r8)
            return
        L_0x003e:
            boolean r1 = r7.f23431f
            r13 = 0
            r14 = 1
            r15 = 0
            if (r1 != 0) goto L_0x0090
            r7.f23431f = r14
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a     // Catch:{ ClassNotFoundException -> 0x0083 }
            boolean r2 = r1.f8841e     // Catch:{ ClassNotFoundException -> 0x0083 }
            if (r2 != 0) goto L_0x0058
            android.content.Context r1 = r1.f8837a     // Catch:{ ClassNotFoundException -> 0x0083 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0083 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r14, r1)     // Catch:{ ClassNotFoundException -> 0x0083 }
            goto L_0x005c
        L_0x0058:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0083 }
        L_0x005c:
            java.lang.Class[] r1 = new java.lang.Class[r14]     // Catch:{ Exception -> 0x0074 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r15] = r2     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0074 }
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a     // Catch:{ Exception -> 0x0074 }
            android.content.Context r2 = r2.f8837a     // Catch:{ Exception -> 0x0074 }
            r1[r15] = r2     // Catch:{ Exception -> 0x0074 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0090
        L_0x0074:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a     // Catch:{ ClassNotFoundException -> 0x0083 }
            com.google.android.gms.measurement.internal.h r1 = r1.d()     // Catch:{ ClassNotFoundException -> 0x0083 }
            o8.a3 r1 = r1.f8800i     // Catch:{ ClassNotFoundException -> 0x0083 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0083 }
            goto L_0x0090
        L_0x0083:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8803l
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.a(r1)
        L_0x0090:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00ba
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            r1.getClass()
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            z7.b r0 = r0.f8850n
            long r5 = r0.b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r23
            r1.B(r2, r3, r4, r5)
        L_0x00ba:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            r0.getClass()
            if (r29 == 0) goto L_0x00e1
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.r.f8874h
            r0 = r0[r15]
            boolean r0 = r0.equals(r9)
            r0 = r0 ^ r14
            if (r0 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.r r0 = r0.A()
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.g3 r1 = r1.f8827v
            android.os.Bundle r1 = r1.a()
            r0.x(r12, r1)
        L_0x00e1:
            r0 = 40
            r1 = 2
            if (r31 != 0) goto L_0x0166
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            r2.getClass()
            java.lang.String r2 = "_iap"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x0166
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            com.google.android.gms.measurement.internal.r r2 = r2.A()
            java.lang.String r3 = "event"
            boolean r4 = r2.P(r3, r9)
            if (r4 != 0) goto L_0x0102
            goto L_0x011a
        L_0x0102:
            java.lang.String[] r4 = o8.e4.f23176a
            java.lang.String[] r5 = o8.e4.f23177b
            boolean r4 = r2.L(r3, r4, r5, r9)
            if (r4 != 0) goto L_0x010f
            r2 = 13
            goto L_0x011d
        L_0x010f:
            com.google.android.gms.measurement.internal.l r4 = r2.f8864a
            r4.getClass()
            boolean r2 = r2.K(r3, r0, r9)
            if (r2 != 0) goto L_0x011c
        L_0x011a:
            r2 = 2
            goto L_0x011d
        L_0x011c:
            r2 = 0
        L_0x011d:
            if (r2 == 0) goto L_0x0166
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8799h
            com.google.android.gms.measurement.internal.l r3 = r7.f8864a
            o8.x2 r3 = r3.f8849m
            java.lang.String r3 = r3.d(r9)
            java.lang.String r4 = "Invalid public event name. Event will not be logged (FE)"
            r1.b(r4, r3)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            com.google.android.gms.measurement.internal.l r3 = r7.f8864a
            r3.getClass()
            java.lang.String r0 = r1.q(r9, r0, r14)
            if (r9 == 0) goto L_0x0149
            int r15 = r25.length()
        L_0x0149:
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            o8.z5 r3 = r7.f23441p
            r4 = 0
            java.lang.String r5 = "_ev"
            r24 = r1
            r25 = r3
            r26 = r4
            r27 = r2
            r28 = r5
            r29 = r0
            r30 = r15
            r24.z(r25, r26, r27, r28, r29, r30)
            return
        L_0x0166:
            k8.wb r2 = k8.wb.f20536b
            k8.xb r2 = r2.zza()
            r2.zza()
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            o8.f r2 = r2.f8843g
            o8.u2<java.lang.Boolean> r3 = o8.v2.f23542v0
            boolean r2 = r2.v(r13, r3)
            java.lang.String r3 = "_sc"
            if (r2 == 0) goto L_0x01a1
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            r2.getClass()
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            o8.z4 r2 = r2.x()
            o8.x4 r2 = r2.o(r15)
            if (r2 == 0) goto L_0x0196
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x0196
            r2.f23604d = r14
        L_0x0196:
            if (r29 == 0) goto L_0x019c
            if (r31 != 0) goto L_0x019c
            r4 = 1
            goto L_0x019d
        L_0x019c:
            r4 = 0
        L_0x019d:
            com.google.android.gms.measurement.internal.r.w(r2, r12, r4)
            goto L_0x01c4
        L_0x01a1:
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            r2.getClass()
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            o8.z4 r2 = r2.x()
            o8.x4 r2 = r2.o(r15)
            if (r2 == 0) goto L_0x01ba
            boolean r4 = r12.containsKey(r3)
            if (r4 != 0) goto L_0x01ba
            r2.f23604d = r14
        L_0x01ba:
            if (r29 == 0) goto L_0x01c0
            if (r31 != 0) goto L_0x01c0
            r4 = 1
            goto L_0x01c1
        L_0x01c0:
            r4 = 0
        L_0x01c1:
            com.google.android.gms.measurement.internal.r.w(r2, r12, r4)
        L_0x01c4:
            java.lang.String r2 = "am"
            boolean r2 = r2.equals(r8)
            boolean r4 = com.google.android.gms.measurement.internal.r.U(r25)
            if (r29 == 0) goto L_0x0228
            t1.c r5 = r7.f23429d
            if (r5 == 0) goto L_0x0228
            if (r4 != 0) goto L_0x0228
            if (r2 == 0) goto L_0x01db
            r16 = 1
            goto L_0x022a
        L_0x01db:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            o8.x2 r1 = r1.f8849m
            java.lang.String r1 = r1.d(r9)
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            o8.x2 r2 = r2.f8849m
            java.lang.String r2 = r2.b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.c(r3, r1, r2)
            t1.c r0 = r7.f23429d
            com.google.android.gms.common.internal.i.h(r0)
            t1.c r13 = r7.f23429d
            r13.getClass()
            java.util.Set<androidx.lifecycle.LiveData> r0 = r13.f25350b     // Catch:{ RemoteException -> 0x0213 }
            r1 = r0
            k8.x0 r1 = (k8.x0) r1     // Catch:{ RemoteException -> 0x0213 }
            r2 = r24
            r3 = r25
            r4 = r28
            r5 = r26
            r1.i1(r2, r3, r4, r5)     // Catch:{ RemoteException -> 0x0213 }
            goto L_0x0227
        L_0x0213:
            r0 = move-exception
            java.lang.Object r1 = r13.f25351c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r1 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r1
            com.google.android.gms.measurement.internal.l r1 = r1.f8778a
            if (r1 == 0) goto L_0x0227
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8800i
            java.lang.String r2 = "Event interceptor threw exception"
            r1.b(r2, r0)
        L_0x0227:
            return
        L_0x0228:
            r16 = r2
        L_0x022a:
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x055f
            com.google.android.gms.measurement.internal.l r2 = r7.f8864a
            com.google.android.gms.measurement.internal.r r2 = r2.A()
            int r2 = r2.h0(r9)
            if (r2 == 0) goto L_0x0284
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8799h
            com.google.android.gms.measurement.internal.l r3 = r7.f8864a
            o8.x2 r3 = r3.f8849m
            java.lang.String r3 = r3.d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.b(r4, r3)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            com.google.android.gms.measurement.internal.l r3 = r7.f8864a
            r3.getClass()
            java.lang.String r0 = r1.q(r9, r0, r14)
            if (r9 == 0) goto L_0x0268
            int r15 = r25.length()
        L_0x0268:
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            o8.z5 r3 = r7.f23441p
            java.lang.String r4 = "_ev"
            r24 = r1
            r25 = r3
            r26 = r32
            r27 = r2
            r28 = r4
            r29 = r0
            r30 = r15
            r24.z(r25, r26, r27, r28, r29, r30)
            return
        L_0x0284:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r6 = "_o"
            r0[r15] = r6
            java.lang.String r2 = "_sn"
            r0[r14] = r2
            r0[r1] = r3
            r1 = 3
            java.lang.String r2 = "_si"
            r0[r1] = r2
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r0.A()
            r2 = r32
            r3 = r25
            r4 = r28
            r0 = r6
            r6 = r31
            android.os.Bundle r12 = r1.r0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.i.h(r12)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            r1.getClass()
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            o8.z4 r1 = r1.x()
            o8.x4 r1 = r1.o(r15)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02f4
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02f4
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            o8.o5 r1 = r1.z()
            o8.m5 r1 = r1.f23380e
            o8.o5 r2 = r1.f23351d
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            z7.b r2 = r2.f8850n
            long r2 = r2.a()
            long r14 = r1.f23349b
            long r14 = r2 - r14
            r1.f23349b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02f4
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            r1.u(r12, r14)
        L_0x02f4:
            k8.z9.b()
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            o8.f r1 = r1.f8843g
            o8.u2<java.lang.Boolean> r2 = o8.v2.f23516i0
            boolean r1 = r1.v(r13, r2)
            if (r1 == 0) goto L_0x037a
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0359
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0359
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.e.a(r2)
            if (r3 == 0) goto L_0x0327
            r2 = r13
            goto L_0x032d
        L_0x0327:
            if (r2 == 0) goto L_0x032d
            java.lang.String r2 = r2.trim()
        L_0x032d:
            com.google.android.gms.measurement.internal.l r3 = r1.f8864a
            com.google.android.gms.measurement.internal.j r3 = r3.t()
            o8.j3 r3 = r3.f8824s
            java.lang.String r3 = r3.a()
            boolean r3 = com.google.android.gms.measurement.internal.r.Y(r2, r3)
            if (r3 != 0) goto L_0x034b
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.j3 r1 = r1.f8824s
            r1.b(r2)
            goto L_0x037a
        L_0x034b:
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.a(r1)
            return
        L_0x0359:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x037a
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.r r1 = r1.A()
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.j3 r1 = r1.f8824s
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x037a
            r12.putString(r2, r1)
        L_0x037a:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.h3 r1 = r1.f8819n
            long r1 = r1.a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            boolean r1 = r1.t(r10)
            if (r1 == 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.f3 r1 = r1.f8821p
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8805n
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.a(r2)
            r15 = 0
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            z7.b r1 = r1.f8850n
            long r17 = r1.b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r1 = r23
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.B(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            z7.b r1 = r1.f8850n
            long r5 = r1.b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r23
            r1.B(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            z7.b r1 = r1.f8850n
            long r5 = r1.b()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r23
            r1.B(r2, r3, r4, r5)
            goto L_0x03f6
        L_0x03f4:
            r13 = r4
            r8 = r5
        L_0x03f6:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x041b
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8805n
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.a(r2)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            o8.o5 r1 = r1.z()
            o8.n5 r1 = r1.f23379d
            r2 = 1
            r1.b(r10, r2)
        L_0x041b:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x042c:
            if (r3 >= r2) goto L_0x047a
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0477
            com.google.android.gms.measurement.internal.l r5 = r7.f8864a
            r5.A()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x044c
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x0472
        L_0x044c:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x045d
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0472
        L_0x045d:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0471
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0472
        L_0x0471:
            r8 = 0
        L_0x0472:
            if (r8 == 0) goto L_0x0477
            r12.putParcelableArray(r4, r8)
        L_0x0477:
            int r3 = r3 + 1
            goto L_0x042c
        L_0x047a:
            r8 = 0
        L_0x047b:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x0531
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x048e
            java.lang.String r2 = "_ep"
            r9 = r24
            goto L_0x0492
        L_0x048e:
            r9 = r24
            r2 = r25
        L_0x0492:
            r1.putString(r0, r9)
            if (r30 == 0) goto L_0x04a1
            com.google.android.gms.measurement.internal.l r3 = r7.f8864a
            com.google.android.gms.measurement.internal.r r3 = r3.A()
            android.os.Bundle r1 = r3.q0(r1)
        L_0x04a1:
            r12 = r1
            o8.r r15 = new o8.r
            o8.p r3 = new o8.p
            r3.<init>(r12)
            r1 = r15
            r4 = r24
            r5 = r26
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            com.google.android.gms.measurement.internal.p r1 = r1.y()
            r1.h()
            r1.i()
            r1.u()
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a
            com.google.android.gms.measurement.internal.g r2 = r2.r()
            r2.getClass()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            o8.s.a(r15, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x04ee
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8798g
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.a(r3)
            r2 = 1
            r20 = 0
            goto L_0x04f6
        L_0x04ee:
            r3 = 0
            boolean r6 = r2.o(r3, r4)
            r20 = r6
            r2 = 1
        L_0x04f6:
            o8.b6 r19 = r1.q(r2)
            r7.h r2 = new r7.h
            r17 = r2
            r18 = r1
            r21 = r15
            r22 = r32
            r17.<init>((com.google.android.gms.measurement.internal.p) r18, (o8.b6) r19, (boolean) r20, (o8.r) r21, (java.lang.String) r22)
            r1.t(r2)
            if (r16 != 0) goto L_0x052d
            java.util.Set<o8.h4> r1 = r7.f23430e
            java.util.Iterator r15 = r1.iterator()
        L_0x0512:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x052d
            java.lang.Object r1 = r15.next()
            o8.h4 r1 = (o8.h4) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r24
            r3 = r25
            r5 = r26
            r1.a(r2, r3, r4, r5)
            goto L_0x0512
        L_0x052d:
            int r8 = r8 + 1
            goto L_0x047b
        L_0x0531:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            r0.getClass()
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            o8.z4 r0 = r0.x()
            r1 = 0
            o8.x4 r0 = r0.o(r1)
            if (r0 == 0) goto L_0x055f
            r1 = r25
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x055f
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            o8.o5 r0 = r0.z()
            com.google.android.gms.measurement.internal.l r1 = r7.f8864a
            z7.b r1 = r1.f8850n
            long r1 = r1.a()
            o8.m5 r0 = r0.f23380e
            r3 = 1
            r0.a(r3, r3, r1)
        L_0x055f:
            return
        L_0x0560:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.a(r1)
            return
        L_0x056e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null reference"
            r0.<init>(r1)
            goto L_0x0577
        L_0x0576:
            throw r0
        L_0x0577:
            goto L_0x0576
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.s4.q(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void r(long j10, boolean z10) {
        h();
        i();
        this.f8864a.d().f8804m.a("Resetting analytics data (FE)");
        o5 z11 = this.f8864a.z();
        z11.h();
        m5 m5Var = z11.f23380e;
        m5Var.f23350c.a();
        m5Var.f23348a = 0;
        m5Var.f23349b = 0;
        boolean g10 = this.f8864a.g();
        j t10 = this.f8864a.t();
        t10.f8810e.b(j10);
        if (!TextUtils.isEmpty(t10.f8864a.t().f8824s.a())) {
            t10.f8824s.b((String) null);
        }
        ia.b();
        f fVar = t10.f8864a.f8843g;
        u2<Boolean> u2Var = v2.f23518j0;
        if (fVar.v((String) null, u2Var)) {
            t10.f8819n.b(0);
        }
        if (!t10.f8864a.f8843g.x()) {
            t10.s(!g10);
        }
        t10.f8825t.b((String) null);
        t10.f8826u.b(0);
        t10.f8827v.b((Bundle) null);
        if (z10) {
            p y10 = this.f8864a.y();
            y10.h();
            y10.i();
            b6 q10 = y10.q(false);
            y10.u();
            y10.f8864a.r().m();
            y10.t(new c5(y10, q10, 0));
        }
        ia.b();
        if (this.f8864a.f8843g.v((String) null, u2Var)) {
            this.f8864a.z().f23379d.a();
        }
        this.f23440o = !g10;
    }

    public final void s(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f8864a.b().r(new m4(this, str, str2, j10, bundle2, z10, z11, z12, (String) null));
    }

    public final void t(String str, String str2, long j10, Object obj) {
        this.f8864a.b().r(new zq(this, str, str2, obj, j10));
    }

    public final void u(Bundle bundle, long j10) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
                this.f8864a.d().f8800i.a("Package name should be null when calling setConditionalUserProperty");
            }
            bundle2.remove("app_id");
            b.g(bundle2, "app_id", cls2, null);
            b.g(bundle2, "origin", cls2, null);
            b.g(bundle2, "name", cls2, null);
            b.g(bundle2, "value", Object.class, null);
            b.g(bundle2, "trigger_event_name", cls2, null);
            b.g(bundle2, "trigger_timeout", cls, 0L);
            b.g(bundle2, "timed_out_event_name", cls2, null);
            b.g(bundle2, "timed_out_event_params", Bundle.class, null);
            b.g(bundle2, "triggered_event_name", cls2, null);
            b.g(bundle2, "triggered_event_params", Bundle.class, null);
            b.g(bundle2, "time_to_live", cls, 0L);
            b.g(bundle2, "expired_event_name", cls2, null);
            b.g(bundle2, "expired_event_params", Bundle.class, null);
            i.e(bundle2.getString("name"));
            i.e(bundle2.getString("origin"));
            i.h(bundle2.get("value"));
            bundle2.putLong("creation_timestamp", j10);
            String string = bundle2.getString("name");
            Object obj = bundle2.get("value");
            if (this.f8864a.A().k0(string) != 0) {
                this.f8864a.d().f8797f.b("Invalid conditional user property name", this.f8864a.f8849m.f(string));
            } else if (this.f8864a.A().g0(string, obj) == 0) {
                Object p10 = this.f8864a.A().p(string, obj);
                if (p10 == null) {
                    this.f8864a.d().f8797f.c("Unable to normalize conditional user property value", this.f8864a.f8849m.f(string), obj);
                    return;
                }
                b.h(bundle2, p10);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f8864a.getClass();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.f8864a.d().f8797f.c("Invalid conditional user property timeout", this.f8864a.f8849m.f(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                this.f8864a.getClass();
                if (j12 > 15552000000L || j12 < 1) {
                    this.f8864a.d().f8797f.c("Invalid conditional user property time to live", this.f8864a.f8849m.f(string), Long.valueOf(j12));
                } else {
                    this.f8864a.b().r(new m(this, bundle2));
                }
            } else {
                this.f8864a.d().f8797f.c("Invalid conditional user property value", this.f8864a.f8849m.f(string), obj);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void v(Bundle bundle, int i10, long j10) {
        i();
        String string = bundle.getString("ad_storage");
        if ((string == null || g.k(string) != null) && ((string = bundle.getString("analytics_storage")) == null || g.k(string) != null)) {
            string = null;
        }
        if (string != null) {
            this.f8864a.d().f8802k.b("Ignoring invalid consent setting", string);
            this.f8864a.d().f8802k.a("Valid consent values are 'granted', 'denied'");
        }
        w(g.a(bundle), i10, j10);
    }

    public final void w(g gVar, int i10, long j10) {
        boolean z10;
        boolean z11;
        g gVar2;
        boolean z12;
        g gVar3 = gVar;
        int i11 = i10;
        i();
        if (i11 != -10 && gVar3.f23210a == null && gVar3.f23211b == null) {
            this.f8864a.d().f8802k.a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f23433h) {
            z10 = false;
            if (g.h(i11, this.f23435j)) {
                boolean i12 = gVar.i(this.f23434i);
                if (gVar.g() && !this.f23434i.g()) {
                    z10 = true;
                }
                g gVar4 = this.f23434i;
                Boolean bool = gVar3.f23210a;
                if (bool == null) {
                    bool = gVar4.f23210a;
                }
                Boolean bool2 = gVar3.f23211b;
                if (bool2 == null) {
                    bool2 = gVar4.f23211b;
                }
                g gVar5 = new g(bool, bool2);
                this.f23434i = gVar5;
                this.f23435j = i11;
                z12 = i12;
                z11 = z10;
                gVar2 = gVar5;
                z10 = true;
            } else {
                gVar2 = gVar3;
                z12 = false;
                z11 = false;
            }
        }
        if (!z10) {
            this.f8864a.d().f8803l.b("Ignoring lower-priority consent settings, proposed settings", gVar2);
            return;
        }
        long andIncrement = this.f23436k.getAndIncrement();
        if (z12) {
            this.f23432g.set((Object) null);
            k b10 = this.f8864a.b();
            p4 p4Var = new p4(this, gVar2, j10, i10, andIncrement, z11);
            b10.k();
            b10.u(new t3(b10, p4Var, true, "Task exception on worker thread"));
        } else if (i11 == 30 || i11 == -10) {
            k b11 = this.f8864a.b();
            q4 q4Var = new q4(this, gVar2, i10, andIncrement, z11, 0);
            b11.k();
            b11.u(new t3(b11, q4Var, true, "Task exception on worker thread"));
        } else {
            this.f8864a.b().r(new q4(this, gVar2, i10, andIncrement, z11, 1));
        }
    }

    public final void x(c cVar) {
        c cVar2;
        h();
        i();
        if (!(cVar == null || cVar == (cVar2 = this.f23429d))) {
            i.k(cVar2 == null, "EventInterceptor already set.");
        }
        this.f23429d = cVar;
    }

    public final void y(g gVar) {
        h();
        boolean z10 = (gVar.g() && gVar.f()) || this.f8864a.y().o();
        l lVar = this.f8864a;
        lVar.b().h();
        if (z10 != lVar.D) {
            l lVar2 = this.f8864a;
            lVar2.b().h();
            lVar2.D = z10;
            j t10 = this.f8864a.t();
            l lVar3 = t10.f8864a;
            t10.h();
            Boolean valueOf = t10.o().contains("measurement_enabled_from_api") ? Boolean.valueOf(t10.o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                D(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void z(Object obj) {
        A("auto", "_ldl", obj, true, this.f8864a.f8850n.b());
    }
}
