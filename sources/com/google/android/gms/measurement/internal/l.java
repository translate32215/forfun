package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.p;
import cb.d;
import com.google.android.gms.common.internal.i;
import f7.v;
import java.util.concurrent.atomic.AtomicInteger;
import k8.a1;
import k8.f4;
import k8.h4;
import k8.m4;
import k8.v4;
import k8.w4;
import k8.x4;
import o.a;
import o8.c4;
import o8.d4;
import o8.f;
import o8.i4;
import o8.k3;
import o8.o5;
import o8.r4;
import o8.s4;
import o8.v2;
import o8.v3;
import o8.x2;
import o8.y1;
import o8.z4;
import org.checkerframework.dataflow.qual.Pure;
import r7.m;
import z7.b;
import z7.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class l implements d4 {
    public static volatile l H;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public final AtomicInteger F = new AtomicInteger(0);
    public final long G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8837a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8838b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8839c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8840d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8841e;

    /* renamed from: f  reason: collision with root package name */
    public final v f8842f;

    /* renamed from: g  reason: collision with root package name */
    public final f f8843g;

    /* renamed from: h  reason: collision with root package name */
    public final j f8844h;

    /* renamed from: i  reason: collision with root package name */
    public final h f8845i;

    /* renamed from: j  reason: collision with root package name */
    public final k f8846j;

    /* renamed from: k  reason: collision with root package name */
    public final o5 f8847k;

    /* renamed from: l  reason: collision with root package name */
    public final r f8848l;

    /* renamed from: m  reason: collision with root package name */
    public final x2 f8849m;

    /* renamed from: n  reason: collision with root package name */
    public final b f8850n;

    /* renamed from: o  reason: collision with root package name */
    public final z4 f8851o;

    /* renamed from: p  reason: collision with root package name */
    public final s4 f8852p;

    /* renamed from: q  reason: collision with root package name */
    public final y1 f8853q;

    /* renamed from: r  reason: collision with root package name */
    public final o f8854r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8855s;

    /* renamed from: t  reason: collision with root package name */
    public g f8856t;

    /* renamed from: u  reason: collision with root package name */
    public p f8857u;

    /* renamed from: v  reason: collision with root package name */
    public o8.l f8858v;

    /* renamed from: w  reason: collision with root package name */
    public e f8859w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8860x = false;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f8861y;

    /* renamed from: z  reason: collision with root package name */
    public long f8862z;

    public l(i4 i4Var) {
        long j10;
        Context context;
        Bundle bundle;
        boolean z10 = false;
        Context context2 = i4Var.f23262a;
        v vVar = new v(2);
        this.f8842f = vVar;
        a.f22534a = vVar;
        this.f8837a = context2;
        this.f8838b = i4Var.f23263b;
        this.f8839c = i4Var.f23264c;
        this.f8840d = i4Var.f23265d;
        this.f8841e = i4Var.f23269h;
        this.A = i4Var.f23266e;
        this.f8855s = i4Var.f23271j;
        this.D = true;
        a1 a1Var = i4Var.f23268g;
        if (!(a1Var == null || (bundle = a1Var.f20059g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = a1Var.f20059g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        synchronized (w4.f20514f) {
            v4 v4Var = w4.f20515g;
            Context applicationContext = context2.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            if (v4Var == null || v4Var.a() != applicationContext) {
                h4.d();
                x4.c();
                synchronized (m4.class) {
                    m4 m4Var = m4.f20322c;
                    if (!(m4Var == null || (context = m4Var.f20323a) == null || m4Var.f20324b == null)) {
                        context.getContentResolver().unregisterContentObserver(m4.f20322c.f20324b);
                    }
                    m4.f20322c = null;
                }
                w4.f20515g = new f4(applicationContext, p.p(new d(applicationContext)));
                w4.f20516h.incrementAndGet();
            }
        }
        this.f8850n = e.f28726a;
        Long l10 = i4Var.f23270i;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = System.currentTimeMillis();
        }
        this.G = j10;
        this.f8843g = new f(this);
        j jVar = new j(this);
        jVar.l();
        this.f8844h = jVar;
        h hVar = new h(this);
        hVar.l();
        this.f8845i = hVar;
        r rVar = new r(this);
        rVar.l();
        this.f8848l = rVar;
        this.f8849m = new x2(new v3(this, 1));
        this.f8853q = new y1(this);
        z4 z4Var = new z4(this);
        z4Var.j();
        this.f8851o = z4Var;
        s4 s4Var = new s4(this);
        s4Var.j();
        this.f8852p = s4Var;
        o5 o5Var = new o5(this);
        o5Var.j();
        this.f8847k = o5Var;
        o oVar = new o(this);
        oVar.l();
        this.f8854r = oVar;
        k kVar = new k(this);
        kVar.l();
        this.f8846j = kVar;
        a1 a1Var2 = i4Var.f23268g;
        z10 = (a1Var2 == null || a1Var2.f20054b == 0) ? true : z10;
        if (context2.getApplicationContext() instanceof Application) {
            s4 v10 = v();
            if (v10.f8864a.f8837a.getApplicationContext() instanceof Application) {
                Application application = (Application) v10.f8864a.f8837a.getApplicationContext();
                if (v10.f23428c == null) {
                    v10.f23428c = new r4(v10);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(v10.f23428c);
                    application.registerActivityLifecycleCallbacks(v10.f23428c);
                    v10.f8864a.d().f8805n.a("Registered activity lifecycle callback");
                }
            }
        } else {
            d().f8800i.a("Application context is not an Application");
        }
        kVar.r(new m(this, i4Var));
    }

    public static final void j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void k(k3 k3Var) {
        if (k3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!k3Var.f23305b) {
            String valueOf = String.valueOf(k3Var.getClass());
            throw new IllegalStateException(androidx.activity.e.a(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static final void l(c4 c4Var) {
        if (c4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!c4Var.n()) {
            String valueOf = String.valueOf(c4Var.getClass());
            throw new IllegalStateException(androidx.activity.e.a(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static l u(Context context, a1 a1Var, Long l10) {
        Bundle bundle;
        if (a1Var != null && (a1Var.f20057e == null || a1Var.f20058f == null)) {
            a1Var = new a1(a1Var.f20053a, a1Var.f20054b, a1Var.f20055c, a1Var.f20056d, (String) null, (String) null, a1Var.f20059g, (String) null);
        }
        if (context != null) {
            i.h(context.getApplicationContext());
            if (H == null) {
                synchronized (l.class) {
                    if (H == null) {
                        H = new l(new i4(context, a1Var, l10));
                    }
                }
            } else if (!(a1Var == null || (bundle = a1Var.f20059g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
                i.h(H);
                H.A = Boolean.valueOf(a1Var.f20059g.getBoolean("dataCollectionDefaultEnabled"));
            }
            i.h(H);
            return H;
        }
        throw new NullPointerException("null reference");
    }

    @Pure
    public final r A() {
        r rVar = this.f8848l;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean a() {
        return this.A != null && this.A.booleanValue();
    }

    @Pure
    public final k b() {
        l(this.f8846j);
        return this.f8846j;
    }

    @Pure
    public final Context c() {
        return this.f8837a;
    }

    @Pure
    public final h d() {
        l(this.f8845i);
        return this.f8845i;
    }

    @Pure
    public final b e() {
        return this.f8850n;
    }

    @Pure
    public final v f() {
        return this.f8842f;
    }

    public final boolean g() {
        return m() == 0;
    }

    @Pure
    public final boolean h() {
        return TextUtils.isEmpty(this.f8838b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (android.text.TextUtils.isEmpty(r0.f8789l) == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
            r7 = this;
            boolean r0 = r7.f8860x
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.measurement.internal.k r0 = r7.b()
            r0.h()
            java.lang.Boolean r0 = r7.f8861y
            if (r0 == 0) goto L_0x0030
            long r1 = r7.f8862z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0030
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c4
            z7.b r0 = r7.f8850n
            long r0 = r0.a()
            long r2 = r7.f8862z
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c4
        L_0x0030:
            z7.b r0 = r7.f8850n
            long r0 = r0.a()
            r7.f8862z = r0
            com.google.android.gms.measurement.internal.r r0 = r7.A()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.Q(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0078
            com.google.android.gms.measurement.internal.r r0 = r7.A()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.Q(r3)
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = r7.f8837a
            b8.b r0 = b8.c.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0076
            o8.f r0 = r7.f8843g
            boolean r0 = r0.z()
            if (r0 != 0) goto L_0x0076
            android.content.Context r0 = r7.f8837a
            boolean r0 = com.google.android.gms.measurement.internal.r.W(r0)
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = r7.f8837a
            boolean r0 = com.google.android.gms.measurement.internal.r.X(r0)
            if (r0 == 0) goto L_0x0078
        L_0x0076:
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.f8861y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c4
            com.google.android.gms.measurement.internal.r r0 = r7.A()
            com.google.android.gms.measurement.internal.e r3 = r7.q()
            java.lang.String r3 = r3.n()
            com.google.android.gms.measurement.internal.e r4 = r7.q()
            r4.i()
            java.lang.String r4 = r4.f8789l
            com.google.android.gms.measurement.internal.e r5 = r7.q()
            r5.i()
            java.lang.String r6 = r5.f8790m
            com.google.android.gms.common.internal.i.h(r6)
            java.lang.String r5 = r5.f8790m
            boolean r0 = r0.J(r3, r4, r5)
            if (r0 != 0) goto L_0x00bd
            com.google.android.gms.measurement.internal.e r0 = r7.q()
            r0.i()
            java.lang.String r0 = r0.f8789l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f8861y = r0
        L_0x00c4:
            java.lang.Boolean r0 = r7.f8861y
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.i():boolean");
    }

    public final int m() {
        b().h();
        if (this.f8843g.x()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        b().h();
        if (!this.D) {
            return 8;
        }
        Boolean q10 = t().q();
        if (q10 == null) {
            f fVar = this.f8843g;
            v vVar = fVar.f8864a.f8842f;
            Boolean t10 = fVar.t("firebase_analytics_collection_enabled");
            if (t10 == null) {
                Boolean bool2 = this.B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (!this.f8843g.v((String) null, v2.T) || this.A == null || this.A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (t10.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (q10.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    @Pure
    public final y1 n() {
        y1 y1Var = this.f8853q;
        if (y1Var != null) {
            return y1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final f o() {
        return this.f8843g;
    }

    @Pure
    public final o8.l p() {
        l(this.f8858v);
        return this.f8858v;
    }

    @Pure
    public final e q() {
        k(this.f8859w);
        return this.f8859w;
    }

    @Pure
    public final g r() {
        k(this.f8856t);
        return this.f8856t;
    }

    @Pure
    public final x2 s() {
        return this.f8849m;
    }

    @Pure
    public final j t() {
        j jVar = this.f8844h;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final s4 v() {
        k(this.f8852p);
        return this.f8852p;
    }

    @Pure
    public final o w() {
        l(this.f8854r);
        return this.f8854r;
    }

    @Pure
    public final z4 x() {
        k(this.f8851o);
        return this.f8851o;
    }

    @Pure
    public final p y() {
        k(this.f8857u);
        return this.f8857u;
    }

    @Pure
    public final o5 z() {
        k(this.f8847k);
        return this.f8847k;
    }
}
