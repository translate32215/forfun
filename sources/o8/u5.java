package o8;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.e;
import b2.t;
import b8.c;
import cb.d;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.i;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import f7.j0;
import f7.v;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k8.a1;
import k8.b3;
import k8.c3;
import k8.h3;
import k8.i3;
import k8.n2;
import k8.nb;
import k8.q3;
import k8.r3;
import k8.ra;
import k8.wb;
import k8.x2;
import k8.y2;
import k8.y8;
import s.a;
import z7.b;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class u5 implements d4 {
    public static volatile u5 C;
    public final Map<String, g> A;
    public final z5 B = new d(this);

    /* renamed from: a  reason: collision with root package name */
    public final q3 f23470a;

    /* renamed from: b  reason: collision with root package name */
    public final i f23471b;

    /* renamed from: c  reason: collision with root package name */
    public j f23472c;

    /* renamed from: d  reason: collision with root package name */
    public e3 f23473d;

    /* renamed from: e  reason: collision with root package name */
    public p5 f23474e;

    /* renamed from: f  reason: collision with root package name */
    public i6 f23475f;

    /* renamed from: g  reason: collision with root package name */
    public final q f23476g;

    /* renamed from: h  reason: collision with root package name */
    public w4 f23477h;

    /* renamed from: i  reason: collision with root package name */
    public h5 f23478i;

    /* renamed from: j  reason: collision with root package name */
    public final s5 f23479j;

    /* renamed from: k  reason: collision with root package name */
    public m3 f23480k;

    /* renamed from: l  reason: collision with root package name */
    public final l f23481l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23482m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23483n;

    /* renamed from: o  reason: collision with root package name */
    public long f23484o;

    /* renamed from: p  reason: collision with root package name */
    public List<Runnable> f23485p;

    /* renamed from: q  reason: collision with root package name */
    public int f23486q;

    /* renamed from: r  reason: collision with root package name */
    public int f23487r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f23488s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f23489t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f23490u;

    /* renamed from: v  reason: collision with root package name */
    public FileLock f23491v;

    /* renamed from: w  reason: collision with root package name */
    public FileChannel f23492w;

    /* renamed from: x  reason: collision with root package name */
    public List<Long> f23493x;

    /* renamed from: y  reason: collision with root package name */
    public List<Long> f23494y;

    /* renamed from: z  reason: collision with root package name */
    public long f23495z;

    public u5(v5 v5Var, l lVar) {
        this.f23481l = l.u(v5Var.f23552a, (a1) null, (Long) null);
        this.f23495z = -1;
        this.f23479j = new s5(this);
        q qVar = new q(this);
        qVar.j();
        this.f23476g = qVar;
        i iVar = new i(this);
        iVar.j();
        this.f23471b = iVar;
        q3 q3Var = new q3(this);
        q3Var.j();
        this.f23470a = q3Var;
        this.A = new HashMap();
        b().r(new j0(this, v5Var));
    }

    public static final r5 I(r5 r5Var) {
        if (r5Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (r5Var.f23422c) {
            return r5Var;
        } else {
            String valueOf = String.valueOf(r5Var.getClass());
            throw new IllegalStateException(e.a(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static u5 O(Context context) {
        if (context != null) {
            com.google.android.gms.common.internal.i.h(context.getApplicationContext());
            if (C == null) {
                synchronized (u5.class) {
                    if (C == null) {
                        C = new u5(new v5(context), (l) null);
                    }
                }
            }
            return C;
        }
        throw new NullPointerException("null reference");
    }

    public static final void v(x2 x2Var, int i10, String str) {
        List<c3> w10 = x2Var.w();
        int i11 = 0;
        while (i11 < w10.size()) {
            if (!"_err".equals(w10.get(i11).y())) {
                i11++;
            } else {
                return;
            }
        }
        b3 w11 = c3.w();
        w11.o("_err");
        w11.n(Long.valueOf((long) i10).longValue());
        c3 c3Var = (c3) w11.f();
        b3 w12 = c3.w();
        w12.o("_ev");
        w12.p(str);
        c3 c3Var2 = (c3) w12.f();
        if (x2Var.f20243c) {
            x2Var.h();
            x2Var.f20243c = false;
        }
        y2.C((y2) x2Var.f20242b, c3Var);
        if (x2Var.f20243c) {
            x2Var.h();
            x2Var.f20243c = false;
        }
        y2.C((y2) x2Var.f20242b, c3Var2);
    }

    public static final void w(x2 x2Var, String str) {
        List<c3> w10 = x2Var.w();
        for (int i10 = 0; i10 < w10.size(); i10++) {
            if (str.equals(w10.get(i10).y())) {
                x2Var.q(i10);
                return;
            }
        }
    }

    public final void A() {
        b().h();
        if (this.f23488s || this.f23489t || this.f23490u) {
            d().f8805n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f23488s), Boolean.valueOf(this.f23489t), Boolean.valueOf(this.f23490u));
            return;
        }
        d().f8805n.a("Stopping uploading service(s)");
        List<Runnable> list = this.f23485p;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            List<Runnable> list2 = this.f23485p;
            com.google.android.gms.common.internal.i.h(list2);
            list2.clear();
        }
    }

    public final void B(h3 h3Var, long j10, boolean z10) {
        y5 y5Var;
        String str = true != z10 ? "_lte" : "_se";
        j jVar = this.f23472c;
        I(jVar);
        y5 J = jVar.J(h3Var.b0(), str);
        if (J == null || J.f23626e == null) {
            y5Var = new y5(h3Var.b0(), "auto", str, e().b(), Long.valueOf(j10));
        } else {
            y5Var = new y5(h3Var.b0(), "auto", str, e().b(), Long.valueOf(((Long) J.f23626e).longValue() + j10));
        }
        q3 v10 = r3.v();
        v10.n(str);
        v10.o(e().b());
        v10.m(((Long) y5Var.f23626e).longValue());
        r3 r3Var = (r3) v10.f();
        int w10 = q.w(h3Var, str);
        if (w10 >= 0) {
            if (h3Var.f20243c) {
                h3Var.h();
                h3Var.f20243c = false;
            }
            i3.x0((i3) h3Var.f20242b, w10, r3Var);
        } else {
            if (h3Var.f20243c) {
                h3Var.h();
                h3Var.f20243c = false;
            }
            i3.y0((i3) h3Var.f20242b, r3Var);
        }
        if (j10 > 0) {
            j jVar2 = this.f23472c;
            I(jVar2);
            jVar2.u(y5Var);
            d().f8805n.c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", y5Var.f23626e);
        }
    }

    public final void C(x2 x2Var, x2 x2Var2) {
        com.google.android.gms.common.internal.i.a("_e".equals(x2Var.v()));
        I(this.f23476g);
        c3 n10 = q.n((y2) x2Var.f(), "_et");
        if (n10 != null && n10.N() && n10.v() > 0) {
            long v10 = n10.v();
            I(this.f23476g);
            c3 n11 = q.n((y2) x2Var2.f(), "_et");
            if (n11 != null && n11.v() > 0) {
                v10 += n11.v();
            }
            I(this.f23476g);
            q.l(x2Var2, "_et", Long.valueOf(v10));
            I(this.f23476g);
            q.l(x2Var, "_fr", 1L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0343  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D() {
        /*
            r19 = this;
            r1 = r19
            com.google.android.gms.measurement.internal.k r0 = r19.b()
            r0.h()
            r19.g()
            long r2 = r1.f23484o
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            z7.b r0 = r19.e()
            long r6 = r0.a()
            long r8 = r1.f23484o
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            com.google.android.gms.measurement.internal.h r0 = r19.d()
            o8.a3 r0 = r0.f8805n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.b(r3, r2)
            o8.e3 r0 = r19.N()
            r0.a()
            o8.p5 r0 = r1.f23474e
            I(r0)
            r0.l()
            return
        L_0x004a:
            r1.f23484o = r4
        L_0x004c:
            com.google.android.gms.measurement.internal.l r0 = r1.f23481l
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x040d
            boolean r0 = r19.G()
            if (r0 != 0) goto L_0x005c
            goto L_0x040d
        L_0x005c:
            z7.b r0 = r19.e()
            long r2 = r0.b()
            r19.K()
            o8.u2<java.lang.Long> r0 = o8.v2.A
            r6 = 0
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            long r7 = java.lang.Math.max(r4, r7)
            o8.j r0 = r1.f23472c
            I(r0)
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r0.y(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0089
            r0 = 1
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 != 0) goto L_0x00a3
            o8.j r0 = r1.f23472c
            I(r0)
            java.lang.String r9 = "select count(1) > 0 from queue where has_realtime = 1"
            long r9 = r0.y(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r0 = 0
            goto L_0x00a4
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            if (r0 == 0) goto L_0x00e8
            o8.f r9 = r19.K()
            java.lang.String r10 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.j(r10, r13)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00d4
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00d4
            r19.K()
            o8.u2<java.lang.Long> r9 = o8.v2.f23541v
            java.lang.Object r9 = r9.a(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r4, r9)
            goto L_0x00fb
        L_0x00d4:
            r19.K()
            o8.u2<java.lang.Long> r9 = o8.v2.f23539u
            java.lang.Object r9 = r9.a(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r4, r9)
            goto L_0x00fb
        L_0x00e8:
            r19.K()
            o8.u2<java.lang.Long> r9 = o8.v2.f23537t
            java.lang.Object r9 = r9.a(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r4, r9)
        L_0x00fb:
            o8.h5 r13 = r1.f23478i
            o8.h3 r13 = r13.f23248i
            long r13 = r13.a()
            o8.h5 r15 = r1.f23478i
            o8.h3 r15 = r15.f23249j
            long r15 = r15.a()
            o8.j r11 = r1.f23472c
            I(r11)
            java.lang.String r12 = "select max(bundle_end_timestamp) from queue"
            long r11 = r11.z(r12, r6, r4)
            o8.j r4 = r1.f23472c
            I(r4)
            java.lang.String r5 = "select max(timestamp) from raw_events"
            r17 = r9
            r9 = 0
            long r4 = r4.z(r5, r6, r9)
            long r4 = java.lang.Math.max(r11, r4)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x012f
            goto L_0x01af
        L_0x012f:
            long r4 = r4 - r2
            long r4 = java.lang.Math.abs(r4)
            long r4 = r2 - r4
            long r13 = r13 - r2
            long r9 = java.lang.Math.abs(r13)
            long r15 = r15 - r2
            long r11 = java.lang.Math.abs(r15)
            long r11 = r2 - r11
            long r2 = r2 - r9
            long r2 = java.lang.Math.max(r2, r11)
            long r7 = r7 + r4
            if (r0 == 0) goto L_0x0156
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0156
            long r7 = java.lang.Math.min(r4, r2)
            long r7 = r7 + r17
        L_0x0156:
            com.google.android.gms.measurement.internal.q r0 = r1.f23476g
            I(r0)
            r9 = r17
            boolean r0 = r0.M(r2, r9)
            if (r0 != 0) goto L_0x0165
            long r2 = r2 + r9
            goto L_0x0166
        L_0x0165:
            r2 = r7
        L_0x0166:
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01b1
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01b1
            r0 = 0
        L_0x0171:
            r19.K()
            r4 = 20
            o8.u2<java.lang.Integer> r5 = o8.v2.C
            java.lang.Object r5 = r5.a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            int r4 = java.lang.Math.min(r4, r5)
            if (r0 >= r4) goto L_0x01af
            r19.K()
            o8.u2<java.lang.Long> r4 = o8.v2.B
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = 1
            long r7 = r7 << r0
            long r4 = r4 * r7
            long r2 = r2 + r4
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x01b1
            int r0 = r0 + 1
            goto L_0x0171
        L_0x01af:
            r2 = 0
        L_0x01b1:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.i r0 = r1.f23471b
            I(r0)
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0394
            o8.h5 r0 = r1.f23478i
            o8.h3 r0 = r0.f23247h
            long r4 = r0.a()
            r19.K()
            o8.u2<java.lang.Long> r0 = o8.v2.f23533r
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)
            com.google.android.gms.measurement.internal.q r0 = r1.f23476g
            I(r0)
            boolean r0 = r0.M(r4, r7)
            if (r0 != 0) goto L_0x01ef
            long r4 = r4 + r7
            long r2 = java.lang.Math.max(r2, r4)
        L_0x01ef:
            o8.e3 r0 = r19.N()
            r0.a()
            z7.b r0 = r19.e()
            long r4 = r0.b()
            long r2 = r2 - r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0227
            r19.K()
            o8.u2<java.lang.Long> r0 = o8.v2.f23543w
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = java.lang.Math.max(r4, r2)
            o8.h5 r0 = r1.f23478i
            o8.h3 r0 = r0.f23248i
            z7.b r4 = r19.e()
            long r4 = r4.b()
            r0.b(r4)
        L_0x0227:
            com.google.android.gms.measurement.internal.h r0 = r19.d()
            o8.a3 r0 = r0.f8805n
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = "Upload scheduled in approximately ms"
            r0.b(r5, r4)
            o8.p5 r0 = r1.f23474e
            I(r0)
            r0.i()
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            r4.getClass()
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            android.content.Context r4 = r4.f8837a
            boolean r5 = com.google.android.gms.measurement.internal.r.W(r4)
            if (r5 != 0) goto L_0x025a
            com.google.android.gms.measurement.internal.l r5 = r0.f8864a
            com.google.android.gms.measurement.internal.h r5 = r5.d()
            o8.a3 r5 = r5.f8804m
            java.lang.String r7 = "Receiver not registered/enabled"
            r5.a(r7)
        L_0x025a:
            boolean r4 = com.google.android.gms.measurement.internal.r.X(r4)
            if (r4 != 0) goto L_0x026d
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8804m
            java.lang.String r5 = "Service not registered/enabled"
            r4.a(r5)
        L_0x026d:
            r0.l()
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8805n
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.String r7 = "Scheduling upload, millis"
            r4.b(r7, r5)
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            z7.b r4 = r4.f8850n
            long r4 = r4.a()
            long r9 = r4 + r2
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            r4.getClass()
            o8.u2<java.lang.Long> r4 = o8.v2.f23545x
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x02bc
            o8.k r4 = r0.o()
            long r4 = r4.f23301c
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x02b2
            r4 = 1
            goto L_0x02b3
        L_0x02b2:
            r4 = 0
        L_0x02b3:
            if (r4 != 0) goto L_0x02bc
            o8.k r4 = r0.o()
            r4.c(r2)
        L_0x02bc:
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            r4.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0372
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            android.content.Context r4 = r4.f8837a
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r6 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r5.<init>(r4, r6)
            int r0 = r0.m()
            android.os.PersistableBundle r6 = new android.os.PersistableBundle
            r6.<init>()
            java.lang.String r7 = "action"
            java.lang.String r8 = "com.google.android.gms.measurement.UPLOAD"
            r6.putString(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            r7.<init>(r0, r5)
            android.app.job.JobInfo$Builder r0 = r7.setMinimumLatency(r2)
            long r2 = r2 + r2
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r2)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r6)
            android.app.job.JobInfo r2 = r0.build()
            java.lang.reflect.Method r0 = k8.m0.f20313a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r4.getSystemService(r0)
            r3 = r0
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            r3.getClass()
            java.lang.reflect.Method r0 = k8.m0.f20313a
            if (r0 == 0) goto L_0x036e
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r4.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x0313
            goto L_0x036e
        L_0x0313:
            java.lang.reflect.Method r0 = k8.m0.f20314b
            if (r0 == 0) goto L_0x033a
            java.lang.Class<android.os.UserHandle> r4 = android.os.UserHandle.class
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x032b, InvocationTargetException -> 0x0329 }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ IllegalAccessException -> 0x032b, InvocationTargetException -> 0x0329 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x032b, InvocationTargetException -> 0x0329 }
            if (r0 == 0) goto L_0x033a
            int r7 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x032b, InvocationTargetException -> 0x0329 }
            goto L_0x033b
        L_0x0329:
            r0 = move-exception
            goto L_0x032c
        L_0x032b:
            r0 = move-exception
        L_0x032c:
            r4 = 6
            java.lang.String r5 = "JobSchedulerCompat"
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            if (r4 == 0) goto L_0x033a
            java.lang.String r4 = "myUserId invocation illegal"
            android.util.Log.e(r5, r4, r0)
        L_0x033a:
            r7 = 0
        L_0x033b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r4 = "UploadAlarm"
            java.lang.reflect.Method r5 = k8.m0.f20313a
            if (r5 == 0) goto L_0x036a
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            r8 = 0
            r6[r8] = r2     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            r8 = 1
            r6[r8] = r0     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            r0 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            r6[r0] = r7     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            r0 = 3
            r6[r0] = r4     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            java.lang.Object r0 = r5.invoke(r3, r6)     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            if (r0 == 0) goto L_0x0393
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x0364, InvocationTargetException -> 0x0362 }
            goto L_0x0393
        L_0x0362:
            r0 = move-exception
            goto L_0x0365
        L_0x0364:
            r0 = move-exception
        L_0x0365:
            java.lang.String r5 = "error calling scheduleAsPackage"
            android.util.Log.e(r4, r5, r0)
        L_0x036a:
            r3.schedule(r2)
            goto L_0x0393
        L_0x036e:
            r3.schedule(r2)
            goto L_0x0393
        L_0x0372:
            android.app.AlarmManager r7 = r0.f23393d
            if (r7 == 0) goto L_0x0393
            com.google.android.gms.measurement.internal.l r4 = r0.f8864a
            r4.getClass()
            r8 = 2
            o8.u2<java.lang.Long> r4 = o8.v2.f23535s
            java.lang.Object r4 = r4.a(r6)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r11 = java.lang.Math.max(r4, r2)
            android.app.PendingIntent r13 = r0.n()
            r7.setInexactRepeating(r8, r9, r11, r13)
        L_0x0393:
            return
        L_0x0394:
            com.google.android.gms.measurement.internal.h r0 = r19.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r2 = "No network"
            r0.a(r2)
            o8.e3 r0 = r19.N()
            o8.u5 r2 = r0.f23173a
            r2.g()
            o8.u5 r2 = r0.f23173a
            com.google.android.gms.measurement.internal.k r2 = r2.b()
            r2.h()
            boolean r2 = r0.f23174b
            if (r2 == 0) goto L_0x03b6
            goto L_0x03e9
        L_0x03b6:
            o8.u5 r2 = r0.f23173a
            com.google.android.gms.measurement.internal.l r2 = r2.f23481l
            android.content.Context r2 = r2.f8837a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r0, r3)
            o8.u5 r2 = r0.f23173a
            com.google.android.gms.measurement.internal.i r2 = r2.f23471b
            I(r2)
            boolean r2 = r2.m()
            r0.f23175c = r2
            o8.u5 r2 = r0.f23173a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8805n
            boolean r3 = r0.f23175c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.b(r4, r3)
            r2 = 1
            r0.f23174b = r2
        L_0x03e9:
            o8.p5 r0 = r1.f23474e
            I(r0)
            r0.l()
            return
        L_0x03f2:
            com.google.android.gms.measurement.internal.h r0 = r19.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r2 = "Next upload time is 0"
            r0.a(r2)
            o8.e3 r0 = r19.N()
            r0.a()
            o8.p5 r0 = r1.f23474e
            I(r0)
            r0.l()
            return
        L_0x040d:
            com.google.android.gms.measurement.internal.h r0 = r19.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r0.a(r2)
            o8.e3 r0 = r19.N()
            r0.a()
            o8.p5 r0 = r1.f23474e
            I(r0)
            r0.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.D():void");
    }

    public final boolean E(b6 b6Var) {
        ra.b();
        return K().v(b6Var.f23131a, v2.f23506d0) ? !TextUtils.isEmpty(b6Var.f23132b) || !TextUtils.isEmpty(b6Var.C) || !TextUtils.isEmpty(b6Var.f23147y) : !TextUtils.isEmpty(b6Var.f23132b) || !TextUtils.isEmpty(b6Var.f23147y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0d20, code lost:
        if (r10 > (o8.f.i() + r8)) goto L_0x0d22;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03de A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04a2 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04fb A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x065b A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0675 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x09aa A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09f5 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0a18 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a95 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0a97 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0a9f A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0ad2 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0d10 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0d97 A[Catch:{ NumberFormatException -> 0x096f, all -> 0x0e5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0db3 A[Catch:{ SQLiteException -> 0x0dcb }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:69:0x0218=Splitter:B:69:0x0218, B:453:0x0e49=Splitter:B:453:0x0e49} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(java.lang.String r47, long r48) {
        /*
            r46 = this;
            r1 = r46
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = "_ai"
            o8.j r7 = r1.f23472c
            I(r7)
            r7.Q()
            e8.pu r7 = new e8.pu     // Catch:{ all -> 0x0e5b }
            r7.<init>(r1)     // Catch:{ all -> 0x0e5b }
            o8.j r8 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r8)     // Catch:{ all -> 0x0e5b }
            r9 = 0
            long r12 = r1.f23495z     // Catch:{ all -> 0x0e5b }
            r10 = r48
            r14 = r7
            r8.v(r9, r10, r12, r14)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r8 = r7.f16026d     // Catch:{ all -> 0x0e5b }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0e5b }
            if (r8 == 0) goto L_0x0e49
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0e5b }
            if (r8 == 0) goto L_0x0035
            goto L_0x0e49
        L_0x0035:
            java.lang.Object r8 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r8 = (k8.i3) r8     // Catch:{ all -> 0x0e5b }
            k8.h6 r8 = r8.o()     // Catch:{ all -> 0x0e5b }
            k8.h3 r8 = (k8.h3) r8     // Catch:{ all -> 0x0e5b }
            r8.t0()     // Catch:{ all -> 0x0e5b }
            o8.f r10 = r46.K()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r11 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r11 = (k8.i3) r11     // Catch:{ all -> 0x0e5b }
            java.lang.String r11 = r11.D1()     // Catch:{ all -> 0x0e5b }
            o8.u2<java.lang.Boolean> r12 = o8.v2.U     // Catch:{ all -> 0x0e5b }
            boolean r10 = r10.v(r11, r12)     // Catch:{ all -> 0x0e5b }
            r9 = -1
            r11 = -1
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0061:
            java.lang.Object r12 = r7.f16026d     // Catch:{ all -> 0x0e5b }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0e5b }
            int r12 = r12.size()     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = "_fr"
            r21 = r5
            java.lang.String r5 = "_et"
            r22 = r15
            java.lang.String r15 = "_e"
            r16 = r10
            r24 = r11
            if (r14 >= r12) goto L_0x06d2
            java.lang.Object r11 = r7.f16026d     // Catch:{ all -> 0x0e5b }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0e5b }
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x0e5b }
            k8.y2 r11 = (k8.y2) r11     // Catch:{ all -> 0x0e5b }
            k8.h6 r11 = r11.o()     // Catch:{ all -> 0x0e5b }
            k8.x2 r11 = (k8.x2) r11     // Catch:{ all -> 0x0e5b }
            o8.q3 r12 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r12)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r10 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r10 = (k8.i3) r10     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = r10.D1()     // Catch:{ all -> 0x0e5b }
            r28 = r14
            java.lang.String r14 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r10 = r12.r(r10, r14)     // Catch:{ all -> 0x0e5b }
            java.lang.String r12 = "_err"
            if (r10 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.h r5 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r5 = r5.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "Dropping blocked raw event. appId"
            java.lang.Object r13 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r13 = (k8.i3) r13     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = r13.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.h.t(r13)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.l r14 = r1.f23481l     // Catch:{ all -> 0x0e5b }
            o8.x2 r14 = r14.s()     // Catch:{ all -> 0x0e5b }
            java.lang.String r15 = r11.v()     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = r14.d(r15)     // Catch:{ all -> 0x0e5b }
            r5.c(r10, r13, r14)     // Catch:{ all -> 0x0e5b }
            o8.q3 r5 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r10 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r10 = (k8.i3) r10     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = r10.D1()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r5.p(r10)     // Catch:{ all -> 0x0e5b }
            if (r5 != 0) goto L_0x0119
            o8.q3 r5 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r10 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r10 = (k8.i3) r10     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = r10.D1()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r5.s(r10)     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x00f2
            goto L_0x0119
        L_0x00f2:
            java.lang.String r5 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0e5b }
            if (r5 != 0) goto L_0x0119
            com.google.android.gms.measurement.internal.r r29 = r46.Q()     // Catch:{ all -> 0x0e5b }
            o8.z5 r5 = r1.B     // Catch:{ all -> 0x0e5b }
            java.lang.Object r10 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r10 = (k8.i3) r10     // Catch:{ all -> 0x0e5b }
            java.lang.String r31 = r10.D1()     // Catch:{ all -> 0x0e5b }
            r32 = 11
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r11.v()     // Catch:{ all -> 0x0e5b }
            r35 = 0
            r30 = r5
            r29.z(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0e5b }
        L_0x0119:
            r12 = r3
            r30 = r6
            r5 = r22
            r11 = r24
            r14 = r28
            r3 = r2
            r45 = r9
            r9 = r4
            r4 = r45
            goto L_0x06c0
        L_0x012a:
            java.lang.String r10 = r11.v()     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = o8.e4.a(r6)     // Catch:{ all -> 0x0e5b }
            boolean r10 = r10.equals(r14)     // Catch:{ all -> 0x0e5b }
            if (r10 == 0) goto L_0x01a0
            r11.r(r6)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r10 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r10 = r10.q()     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r10.a(r14)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r10 = r46.d()     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = r10.w()     // Catch:{ all -> 0x0e5b }
            r14 = 5
            boolean r10 = android.util.Log.isLoggable(r10, r14)     // Catch:{ all -> 0x0e5b }
            if (r10 == 0) goto L_0x01a0
            r10 = 0
        L_0x0158:
            int r14 = r11.m()     // Catch:{ all -> 0x0e5b }
            if (r10 >= r14) goto L_0x01a0
            java.lang.String r14 = "ad_platform"
            k8.c3 r29 = r11.u(r10)     // Catch:{ all -> 0x0e5b }
            r30 = r6
            java.lang.String r6 = r29.y()     // Catch:{ all -> 0x0e5b }
            boolean r6 = r14.equals(r6)     // Catch:{ all -> 0x0e5b }
            if (r6 == 0) goto L_0x019b
            k8.c3 r6 = r11.u(r10)     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r6.z()     // Catch:{ all -> 0x0e5b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0e5b }
            if (r6 != 0) goto L_0x019b
            java.lang.String r6 = "admob"
            k8.c3 r14 = r11.u(r10)     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = r14.z()     // Catch:{ all -> 0x0e5b }
            boolean r6 = r6.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0e5b }
            if (r6 == 0) goto L_0x019b
            com.google.android.gms.measurement.internal.h r6 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r6 = r6.s()     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r6.a(r14)     // Catch:{ all -> 0x0e5b }
        L_0x019b:
            int r10 = r10 + 1
            r6 = r30
            goto L_0x0158
        L_0x01a0:
            r30 = r6
            o8.q3 r6 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r6)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r10 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r10 = (k8.i3) r10     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = r10.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r6 = r6.q(r10, r14)     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "_c"
            if (r6 != 0) goto L_0x020f
            com.google.android.gms.measurement.internal.q r14 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r14)     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = r11.v()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.common.internal.i.e(r14)     // Catch:{ all -> 0x0e5b }
            r29 = r2
            int r2 = r14.hashCode()     // Catch:{ all -> 0x0e5b }
            r31 = r3
            r3 = 94660(0x171c4, float:1.32647E-40)
            if (r2 == r3) goto L_0x01f3
            r3 = 95025(0x17331, float:1.33158E-40)
            if (r2 == r3) goto L_0x01e9
            r3 = 95027(0x17333, float:1.33161E-40)
            if (r2 == r3) goto L_0x01df
            goto L_0x01fd
        L_0x01df:
            java.lang.String r2 = "_ui"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x01fd
            r2 = 1
            goto L_0x01fe
        L_0x01e9:
            java.lang.String r2 = "_ug"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x01fd
            r2 = 2
            goto L_0x01fe
        L_0x01f3:
            java.lang.String r2 = "_in"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x01fd
            r2 = 0
            goto L_0x01fe
        L_0x01fd:
            r2 = -1
        L_0x01fe:
            if (r2 == 0) goto L_0x0213
            r3 = 1
            if (r2 == r3) goto L_0x0213
            r3 = 2
            if (r2 == r3) goto L_0x0213
            r25 = r4
            r33 = r5
            r32 = r9
            r6 = 0
            goto L_0x03dc
        L_0x020f:
            r29 = r2
            r31 = r3
        L_0x0213:
            r25 = r4
            r2 = 0
            r3 = 0
            r14 = 0
        L_0x0218:
            int r4 = r11.m()     // Catch:{ all -> 0x0e5b }
            r32 = r9
            java.lang.String r9 = "_r"
            if (r2 >= r4) goto L_0x0281
            k8.c3 r4 = r11.u(r2)     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.y()     // Catch:{ all -> 0x0e5b }
            boolean r4 = r10.equals(r4)     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x024d
            k8.c3 r3 = r11.u(r2)     // Catch:{ all -> 0x0e5b }
            k8.h6 r3 = r3.o()     // Catch:{ all -> 0x0e5b }
            k8.b3 r3 = (k8.b3) r3     // Catch:{ all -> 0x0e5b }
            r33 = r5
            r4 = 1
            r3.n(r4)     // Catch:{ all -> 0x0e5b }
            k8.k6 r3 = r3.f()     // Catch:{ all -> 0x0e5b }
            k8.c3 r3 = (k8.c3) r3     // Catch:{ all -> 0x0e5b }
            r11.t(r2, r3)     // Catch:{ all -> 0x0e5b }
            r5 = r8
            r3 = 1
            goto L_0x0279
        L_0x024d:
            r33 = r5
            k8.c3 r4 = r11.u(r2)     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.y()     // Catch:{ all -> 0x0e5b }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x0278
            k8.c3 r4 = r11.u(r2)     // Catch:{ all -> 0x0e5b }
            k8.h6 r4 = r4.o()     // Catch:{ all -> 0x0e5b }
            k8.b3 r4 = (k8.b3) r4     // Catch:{ all -> 0x0e5b }
            r5 = r8
            r8 = 1
            r4.n(r8)     // Catch:{ all -> 0x0e5b }
            k8.k6 r4 = r4.f()     // Catch:{ all -> 0x0e5b }
            k8.c3 r4 = (k8.c3) r4     // Catch:{ all -> 0x0e5b }
            r11.t(r2, r4)     // Catch:{ all -> 0x0e5b }
            r14 = 1
            goto L_0x0279
        L_0x0278:
            r5 = r8
        L_0x0279:
            int r2 = r2 + 1
            r8 = r5
            r9 = r32
            r5 = r33
            goto L_0x0218
        L_0x0281:
            r33 = r5
            r5 = r8
            if (r3 != 0) goto L_0x02b2
            if (r6 == 0) goto L_0x02b2
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.q()     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.l r4 = r1.f23481l     // Catch:{ all -> 0x0e5b }
            o8.x2 r4 = r4.s()     // Catch:{ all -> 0x0e5b }
            java.lang.String r8 = r11.v()     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.d(r8)     // Catch:{ all -> 0x0e5b }
            r2.b(r3, r4)     // Catch:{ all -> 0x0e5b }
            k8.b3 r2 = k8.c3.w()     // Catch:{ all -> 0x0e5b }
            r2.o(r10)     // Catch:{ all -> 0x0e5b }
            r3 = 1
            r2.n(r3)     // Catch:{ all -> 0x0e5b }
            r11.p(r2)     // Catch:{ all -> 0x0e5b }
        L_0x02b2:
            if (r14 != 0) goto L_0x02de
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.q()     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.l r4 = r1.f23481l     // Catch:{ all -> 0x0e5b }
            o8.x2 r4 = r4.s()     // Catch:{ all -> 0x0e5b }
            java.lang.String r8 = r11.v()     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.d(r8)     // Catch:{ all -> 0x0e5b }
            r2.b(r3, r4)     // Catch:{ all -> 0x0e5b }
            k8.b3 r2 = k8.c3.w()     // Catch:{ all -> 0x0e5b }
            r2.o(r9)     // Catch:{ all -> 0x0e5b }
            r3 = 1
            r2.n(r3)     // Catch:{ all -> 0x0e5b }
            r11.p(r2)     // Catch:{ all -> 0x0e5b }
        L_0x02de:
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            long r35 = r46.x()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r3 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r3 = (k8.i3) r3     // Catch:{ all -> 0x0e5b }
            java.lang.String r37 = r3.D1()     // Catch:{ all -> 0x0e5b }
            r38 = 0
            r39 = 1
            r34 = r2
            o8.h r2 = r34.G(r35, r37, r38, r39)     // Catch:{ all -> 0x0e5b }
            long r2 = r2.f23234e     // Catch:{ all -> 0x0e5b }
            o8.f r4 = r46.K()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r8 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r8 = (k8.i3) r8     // Catch:{ all -> 0x0e5b }
            java.lang.String r8 = r8.D1()     // Catch:{ all -> 0x0e5b }
            o8.u2<java.lang.Integer> r14 = o8.v2.f23527o     // Catch:{ all -> 0x0e5b }
            int r4 = r4.o(r8, r14)     // Catch:{ all -> 0x0e5b }
            r8 = r5
            long r4 = (long) r4     // Catch:{ all -> 0x0e5b }
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x0317
            w(r11, r9)     // Catch:{ all -> 0x0e5b }
            goto L_0x0319
        L_0x0317:
            r20 = 1
        L_0x0319:
            java.lang.String r2 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r2 = com.google.android.gms.measurement.internal.r.V(r2)     // Catch:{ all -> 0x0e5b }
            if (r2 == 0) goto L_0x03dc
            if (r6 == 0) goto L_0x03dc
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            long r35 = r46.x()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r3 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r3 = (k8.i3) r3     // Catch:{ all -> 0x0e5b }
            java.lang.String r37 = r3.D1()     // Catch:{ all -> 0x0e5b }
            r38 = 1
            r39 = 0
            r34 = r2
            o8.h r2 = r34.G(r35, r37, r38, r39)     // Catch:{ all -> 0x0e5b }
            long r2 = r2.f23232c     // Catch:{ all -> 0x0e5b }
            o8.f r4 = r46.K()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r5 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r5 = (k8.i3) r5     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r5.D1()     // Catch:{ all -> 0x0e5b }
            o8.u2<java.lang.Integer> r9 = o8.v2.f23525n     // Catch:{ all -> 0x0e5b }
            int r4 = r4.o(r5, r9)     // Catch:{ all -> 0x0e5b }
            long r4 = (long) r4     // Catch:{ all -> 0x0e5b }
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x03dc
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            java.lang.Object r4 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)     // Catch:{ all -> 0x0e5b }
            r2.b(r3, r4)     // Catch:{ all -> 0x0e5b }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
        L_0x0376:
            int r9 = r11.m()     // Catch:{ all -> 0x0e5b }
            if (r3 >= r9) goto L_0x03a0
            k8.c3 r9 = r11.u(r3)     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = r9.y()     // Catch:{ all -> 0x0e5b }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x0e5b }
            if (r14 == 0) goto L_0x0392
            k8.h6 r2 = r9.o()     // Catch:{ all -> 0x0e5b }
            k8.b3 r2 = (k8.b3) r2     // Catch:{ all -> 0x0e5b }
            r5 = r3
            goto L_0x039d
        L_0x0392:
            java.lang.String r9 = r9.y()     // Catch:{ all -> 0x0e5b }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x039d
            r4 = 1
        L_0x039d:
            int r3 = r3 + 1
            goto L_0x0376
        L_0x03a0:
            if (r4 == 0) goto L_0x03a9
            if (r2 == 0) goto L_0x03a8
            r11.q(r5)     // Catch:{ all -> 0x0e5b }
            goto L_0x03dc
        L_0x03a8:
            r2 = 0
        L_0x03a9:
            if (r2 == 0) goto L_0x03c3
            k8.h6 r2 = r2.clone()     // Catch:{ all -> 0x0e5b }
            k8.b3 r2 = (k8.b3) r2     // Catch:{ all -> 0x0e5b }
            r2.o(r12)     // Catch:{ all -> 0x0e5b }
            r3 = 10
            r2.n(r3)     // Catch:{ all -> 0x0e5b }
            k8.k6 r2 = r2.f()     // Catch:{ all -> 0x0e5b }
            k8.c3 r2 = (k8.c3) r2     // Catch:{ all -> 0x0e5b }
            r11.t(r5, r2)     // Catch:{ all -> 0x0e5b }
            goto L_0x03dc
        L_0x03c3:
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            java.lang.Object r4 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)     // Catch:{ all -> 0x0e5b }
            r2.b(r3, r4)     // Catch:{ all -> 0x0e5b }
        L_0x03dc:
            if (r6 == 0) goto L_0x0495
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0e5b }
            java.util.List r3 = r11.w()     // Catch:{ all -> 0x0e5b }
            r2.<init>(r3)     // Catch:{ all -> 0x0e5b }
            r3 = 0
            r4 = -1
            r5 = -1
        L_0x03ea:
            int r6 = r2.size()     // Catch:{ all -> 0x0e5b }
            java.lang.String r9 = "currency"
            java.lang.String r12 = "value"
            if (r3 >= r6) goto L_0x041a
            java.lang.Object r6 = r2.get(r3)     // Catch:{ all -> 0x0e5b }
            k8.c3 r6 = (k8.c3) r6     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r6.y()     // Catch:{ all -> 0x0e5b }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0e5b }
            if (r6 == 0) goto L_0x0406
            r4 = r3
            goto L_0x0417
        L_0x0406:
            java.lang.Object r6 = r2.get(r3)     // Catch:{ all -> 0x0e5b }
            k8.c3 r6 = (k8.c3) r6     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r6.y()     // Catch:{ all -> 0x0e5b }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0e5b }
            if (r6 == 0) goto L_0x0417
            r5 = r3
        L_0x0417:
            int r3 = r3 + 1
            goto L_0x03ea
        L_0x041a:
            r3 = -1
            if (r4 != r3) goto L_0x041f
            goto L_0x0496
        L_0x041f:
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0e5b }
            k8.c3 r3 = (k8.c3) r3     // Catch:{ all -> 0x0e5b }
            boolean r3 = r3.N()     // Catch:{ all -> 0x0e5b }
            if (r3 != 0) goto L_0x0450
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0e5b }
            k8.c3 r3 = (k8.c3) r3     // Catch:{ all -> 0x0e5b }
            boolean r3 = r3.L()     // Catch:{ all -> 0x0e5b }
            if (r3 != 0) goto L_0x0450
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.s()     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x0e5b }
            r11.q(r4)     // Catch:{ all -> 0x0e5b }
            w(r11, r10)     // Catch:{ all -> 0x0e5b }
            r2 = 18
            v(r11, r2, r12)     // Catch:{ all -> 0x0e5b }
            goto L_0x0495
        L_0x0450:
            r3 = -1
            if (r5 != r3) goto L_0x0454
            goto L_0x047c
        L_0x0454:
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0e5b }
            k8.c3 r2 = (k8.c3) r2     // Catch:{ all -> 0x0e5b }
            java.lang.String r2 = r2.z()     // Catch:{ all -> 0x0e5b }
            int r5 = r2.length()     // Catch:{ all -> 0x0e5b }
            r6 = 3
            if (r5 != r6) goto L_0x047c
            r5 = 0
        L_0x0466:
            int r6 = r2.length()     // Catch:{ all -> 0x0e5b }
            if (r5 >= r6) goto L_0x0496
            int r6 = r2.codePointAt(r5)     // Catch:{ all -> 0x0e5b }
            boolean r12 = java.lang.Character.isLetter(r6)     // Catch:{ all -> 0x0e5b }
            if (r12 == 0) goto L_0x047c
            int r6 = java.lang.Character.charCount(r6)     // Catch:{ all -> 0x0e5b }
            int r5 = r5 + r6
            goto L_0x0466
        L_0x047c:
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.s()     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r5)     // Catch:{ all -> 0x0e5b }
            r11.q(r4)     // Catch:{ all -> 0x0e5b }
            w(r11, r10)     // Catch:{ all -> 0x0e5b }
            r2 = 19
            v(r11, r2, r9)     // Catch:{ all -> 0x0e5b }
            goto L_0x0496
        L_0x0495:
            r3 = -1
        L_0x0496:
            java.lang.String r2 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0e5b }
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04fb
            com.google.android.gms.measurement.internal.q r2 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            k8.k6 r2 = r11.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r2 = (k8.y2) r2     // Catch:{ all -> 0x0e5b }
            k8.c3 r2 = com.google.android.gms.measurement.internal.q.n(r2, r13)     // Catch:{ all -> 0x0e5b }
            if (r2 != 0) goto L_0x04ef
            if (r18 == 0) goto L_0x04dd
            long r9 = r18.o()     // Catch:{ all -> 0x0e5b }
            long r12 = r11.o()     // Catch:{ all -> 0x0e5b }
            long r9 = r9 - r12
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0e5b }
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x04dd
            k8.h6 r2 = r18.clone()     // Catch:{ all -> 0x0e5b }
            k8.x2 r2 = (k8.x2) r2     // Catch:{ all -> 0x0e5b }
            boolean r4 = r1.H(r11, r2)     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x04dd
            r13 = r24
            r8.B(r13, r2)     // Catch:{ all -> 0x0e5b }
            r9 = r32
            r2 = 0
            r18 = 0
            goto L_0x04e2
        L_0x04dd:
            r13 = r24
            r2 = r11
            r9 = r19
        L_0x04e2:
            r17 = r2
            r4 = r9
            r9 = r25
            r3 = r29
            r12 = r31
            r6 = r33
            goto L_0x0649
        L_0x04ef:
            r9 = r25
            r3 = r29
            r12 = r31
            r4 = r32
            r6 = r33
            goto L_0x0647
        L_0x04fb:
            r13 = r24
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0e5b }
            if (r2 == 0) goto L_0x055f
            com.google.android.gms.measurement.internal.q r2 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            k8.k6 r2 = r11.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r2 = (k8.y2) r2     // Catch:{ all -> 0x0e5b }
            r6 = r33
            k8.c3 r2 = com.google.android.gms.measurement.internal.q.n(r2, r6)     // Catch:{ all -> 0x0e5b }
            if (r2 != 0) goto L_0x055b
            if (r17 == 0) goto L_0x054d
            long r9 = r17.o()     // Catch:{ all -> 0x0e5b }
            long r26 = r11.o()     // Catch:{ all -> 0x0e5b }
            long r9 = r9 - r26
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0e5b }
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x054d
            k8.h6 r2 = r17.clone()     // Catch:{ all -> 0x0e5b }
            k8.x2 r2 = (k8.x2) r2     // Catch:{ all -> 0x0e5b }
            boolean r4 = r1.H(r2, r11)     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x0545
            r4 = r32
            r8.B(r4, r2)     // Catch:{ all -> 0x0e5b }
            r2 = 0
            r17 = 0
            goto L_0x054a
        L_0x0545:
            r4 = r32
            r2 = r11
            r13 = r19
        L_0x054a:
            r18 = r2
            goto L_0x0553
        L_0x054d:
            r4 = r32
            r18 = r11
            r13 = r19
        L_0x0553:
            r9 = r25
            r3 = r29
            r12 = r31
            goto L_0x0649
        L_0x055b:
            r4 = r32
            goto L_0x063f
        L_0x055f:
            r4 = r32
            r6 = r33
            o8.f r2 = r46.K()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r5 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r5 = (k8.i3) r5     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r5.D1()     // Catch:{ all -> 0x0e5b }
            o8.u2<java.lang.Boolean> r9 = o8.v2.f23512g0     // Catch:{ all -> 0x0e5b }
            boolean r2 = r2.v(r5, r9)     // Catch:{ all -> 0x0e5b }
            if (r2 == 0) goto L_0x063f
            java.lang.String r2 = "_ab"
            java.lang.String r5 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0e5b }
            if (r2 == 0) goto L_0x063f
            com.google.android.gms.measurement.internal.q r2 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            k8.k6 r2 = r11.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r2 = (k8.y2) r2     // Catch:{ all -> 0x0e5b }
            k8.c3 r2 = com.google.android.gms.measurement.internal.q.n(r2, r6)     // Catch:{ all -> 0x0e5b }
            if (r2 != 0) goto L_0x063f
            if (r17 == 0) goto L_0x063f
            long r9 = r17.o()     // Catch:{ all -> 0x0e5b }
            long r26 = r11.o()     // Catch:{ all -> 0x0e5b }
            long r9 = r9 - r26
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0e5b }
            r26 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r2 > 0) goto L_0x063f
            k8.h6 r2 = r17.clone()     // Catch:{ all -> 0x0e5b }
            k8.x2 r2 = (k8.x2) r2     // Catch:{ all -> 0x0e5b }
            r1.C(r2, r11)     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r2.v()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.common.internal.i.a(r5)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q r5 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            k8.k6 r5 = r2.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r5 = (k8.y2) r5     // Catch:{ all -> 0x0e5b }
            r9 = r25
            k8.c3 r5 = com.google.android.gms.measurement.internal.q.n(r5, r9)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q r10 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r10)     // Catch:{ all -> 0x0e5b }
            k8.k6 r10 = r2.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r10 = (k8.y2) r10     // Catch:{ all -> 0x0e5b }
            r12 = r31
            k8.c3 r10 = com.google.android.gms.measurement.internal.q.n(r10, r12)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q r14 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r14)     // Catch:{ all -> 0x0e5b }
            k8.k6 r14 = r2.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r14 = (k8.y2) r14     // Catch:{ all -> 0x0e5b }
            r3 = r29
            k8.c3 r14 = com.google.android.gms.measurement.internal.q.n(r14, r3)     // Catch:{ all -> 0x0e5b }
            java.lang.String r17 = ""
            if (r5 == 0) goto L_0x05fa
            java.lang.String r5 = r5.z()     // Catch:{ all -> 0x0e5b }
            goto L_0x05fc
        L_0x05fa:
            r5 = r17
        L_0x05fc:
            boolean r24 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0e5b }
            if (r24 != 0) goto L_0x060d
            r24 = r13
            com.google.android.gms.measurement.internal.q r13 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r13)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r11, r9, r5)     // Catch:{ all -> 0x0e5b }
            goto L_0x060f
        L_0x060d:
            r24 = r13
        L_0x060f:
            if (r10 == 0) goto L_0x0615
            java.lang.String r17 = r10.z()     // Catch:{ all -> 0x0e5b }
        L_0x0615:
            r5 = r17
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0e5b }
            if (r10 != 0) goto L_0x0625
            com.google.android.gms.measurement.internal.q r10 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r10)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r11, r12, r5)     // Catch:{ all -> 0x0e5b }
        L_0x0625:
            if (r14 == 0) goto L_0x0637
            com.google.android.gms.measurement.internal.q r5 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            long r13 = r14.v()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r11, r3, r5)     // Catch:{ all -> 0x0e5b }
        L_0x0637:
            r8.B(r4, r2)     // Catch:{ all -> 0x0e5b }
            r13 = r24
            r17 = 0
            goto L_0x0649
        L_0x063f:
            r24 = r13
            r9 = r25
            r3 = r29
            r12 = r31
        L_0x0647:
            r13 = r24
        L_0x0649:
            if (r16 != 0) goto L_0x06a9
            java.lang.String r2 = r11.v()     // Catch:{ all -> 0x0e5b }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0e5b }
            if (r2 == 0) goto L_0x06a9
            int r2 = r11.m()     // Catch:{ all -> 0x0e5b }
            if (r2 != 0) goto L_0x0675
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            java.lang.Object r6 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r6 = (k8.i3) r6     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r6.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ all -> 0x0e5b }
            r2.b(r5, r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x06a9
        L_0x0675:
            com.google.android.gms.measurement.internal.q r2 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            k8.k6 r2 = r11.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r2 = (k8.y2) r2     // Catch:{ all -> 0x0e5b }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.q.o(r2, r6)     // Catch:{ all -> 0x0e5b }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0e5b }
            if (r2 != 0) goto L_0x06a2
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = "Engagement event does not include duration. appId"
            java.lang.Object r6 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r6 = (k8.i3) r6     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r6.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ all -> 0x0e5b }
            r2.b(r5, r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x06a9
        L_0x06a2:
            long r5 = r2.longValue()     // Catch:{ all -> 0x0e5b }
            long r5 = r22 + r5
            goto L_0x06ab
        L_0x06a9:
            r5 = r22
        L_0x06ab:
            java.lang.Object r2 = r7.f16026d     // Catch:{ all -> 0x0e5b }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0e5b }
            k8.k6 r10 = r11.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r10 = (k8.y2) r10     // Catch:{ all -> 0x0e5b }
            r14 = r28
            r2.set(r14, r10)     // Catch:{ all -> 0x0e5b }
            int r19 = r19 + 1
            r8.n0(r11)     // Catch:{ all -> 0x0e5b }
            r11 = r13
        L_0x06c0:
            int r14 = r14 + 1
            r2 = r3
            r3 = r12
            r10 = r16
            r15 = r5
            r5 = r21
            r6 = r30
            r45 = r9
            r9 = r4
            r4 = r45
            goto L_0x0061
        L_0x06d2:
            r6 = r5
            if (r16 == 0) goto L_0x072b
            r3 = r19
            r2 = 0
        L_0x06d8:
            if (r2 >= r3) goto L_0x072b
            k8.y2 r4 = r8.j0(r2)     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r4.z()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x06fb
            com.google.android.gms.measurement.internal.q r5 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            k8.c3 r5 = com.google.android.gms.measurement.internal.q.n(r4, r13)     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x06fb
            r8.A0(r2)     // Catch:{ all -> 0x0e5b }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x0728
        L_0x06fb:
            com.google.android.gms.measurement.internal.q r5 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            k8.c3 r4 = com.google.android.gms.measurement.internal.q.n(r4, r6)     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x0728
            boolean r5 = r4.N()     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x0715
            long r4 = r4.v()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0e5b }
            goto L_0x0716
        L_0x0715:
            r4 = 0
        L_0x0716:
            if (r4 == 0) goto L_0x0728
            long r9 = r4.longValue()     // Catch:{ all -> 0x0e5b }
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0728
            long r4 = r4.longValue()     // Catch:{ all -> 0x0e5b }
            long r22 = r22 + r4
        L_0x0728:
            r4 = 1
            int r2 = r2 + r4
            goto L_0x06d8
        L_0x072b:
            r2 = r22
            r4 = 0
            r1.B(r8, r2, r4)     // Catch:{ all -> 0x0e5b }
            java.util.List r4 = r8.e0()     // Catch:{ all -> 0x0e5b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0e5b }
        L_0x0739:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = "_se"
            if (r5 == 0) goto L_0x075f
            java.lang.String r5 = "_s"
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            java.lang.String r9 = r9.z()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r5.equals(r9)     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x0739
            o8.j r4 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r4)     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r8.b0()     // Catch:{ all -> 0x0e5b }
            r4.m(r5, r6)     // Catch:{ all -> 0x0e5b }
        L_0x075f:
            java.lang.String r4 = "_sid"
            int r4 = com.google.android.gms.measurement.internal.q.w(r8, r4)     // Catch:{ all -> 0x0e5b }
            if (r4 < 0) goto L_0x076c
            r4 = 1
            r1.B(r8, r2, r4)     // Catch:{ all -> 0x0e5b }
            goto L_0x078e
        L_0x076c:
            int r2 = com.google.android.gms.measurement.internal.q.w(r8, r6)     // Catch:{ all -> 0x0e5b }
            if (r2 < 0) goto L_0x078e
            r8.B0(r2)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r2 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            java.lang.Object r4 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r4.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)     // Catch:{ all -> 0x0e5b }
            r2.b(r3, r4)     // Catch:{ all -> 0x0e5b }
        L_0x078e:
            com.google.android.gms.measurement.internal.q r2 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.l r3 = r2.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r3 = r3.q()     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.a(r4)     // Catch:{ all -> 0x0e5b }
            o8.u5 r3 = r2.f23413b     // Catch:{ all -> 0x0e5b }
            o8.q3 r3 = r3.f23470a     // Catch:{ all -> 0x0e5b }
            I(r3)     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r8.b0()     // Catch:{ all -> 0x0e5b }
            boolean r3 = r3.n(r4)     // Catch:{ all -> 0x0e5b }
            if (r3 == 0) goto L_0x0825
            o8.u5 r3 = r2.f23413b     // Catch:{ all -> 0x0e5b }
            o8.j r3 = r3.f23472c     // Catch:{ all -> 0x0e5b }
            I(r3)     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = r8.b0()     // Catch:{ all -> 0x0e5b }
            o8.x3 r3 = r3.E(r4)     // Catch:{ all -> 0x0e5b }
            if (r3 == 0) goto L_0x0825
            boolean r3 = r3.z()     // Catch:{ all -> 0x0e5b }
            if (r3 == 0) goto L_0x0825
            com.google.android.gms.measurement.internal.l r3 = r2.f8864a     // Catch:{ all -> 0x0e5b }
            o8.l r3 = r3.p()     // Catch:{ all -> 0x0e5b }
            boolean r3 = r3.r()     // Catch:{ all -> 0x0e5b }
            if (r3 == 0) goto L_0x0825
            com.google.android.gms.measurement.internal.l r3 = r2.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r3 = r3.o()     // Catch:{ all -> 0x0e5b }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.a(r4)     // Catch:{ all -> 0x0e5b }
            k8.q3 r3 = k8.r3.v()     // Catch:{ all -> 0x0e5b }
            r4 = r21
            r3.n(r4)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x0e5b }
            o8.l r2 = r2.p()     // Catch:{ all -> 0x0e5b }
            long r5 = r2.o()     // Catch:{ all -> 0x0e5b }
            r3.o(r5)     // Catch:{ all -> 0x0e5b }
            r5 = 1
            r3.m(r5)     // Catch:{ all -> 0x0e5b }
            k8.k6 r2 = r3.f()     // Catch:{ all -> 0x0e5b }
            k8.r3 r2 = (k8.r3) r2     // Catch:{ all -> 0x0e5b }
            r3 = 0
        L_0x0807:
            int r5 = r8.g0()     // Catch:{ all -> 0x0e5b }
            if (r3 >= r5) goto L_0x0822
            k8.r3 r5 = r8.a0(r3)     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r5.x()     // Catch:{ all -> 0x0e5b }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x081f
            r8.Y(r3, r2)     // Catch:{ all -> 0x0e5b }
            goto L_0x0825
        L_0x081f:
            int r3 = r3 + 1
            goto L_0x0807
        L_0x0822:
            r8.p0(r2)     // Catch:{ all -> 0x0e5b }
        L_0x0825:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.U(r2)     // Catch:{ all -> 0x0e5b }
            r2 = -9223372036854775808
            r8.A(r2)     // Catch:{ all -> 0x0e5b }
            r2 = 0
        L_0x0833:
            int r3 = r8.P()     // Catch:{ all -> 0x0e5b }
            if (r2 >= r3) goto L_0x0866
            k8.y2 r3 = r8.j0(r2)     // Catch:{ all -> 0x0e5b }
            long r4 = r3.v()     // Catch:{ all -> 0x0e5b }
            long r9 = r8.i0()     // Catch:{ all -> 0x0e5b }
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0850
            long r4 = r3.v()     // Catch:{ all -> 0x0e5b }
            r8.U(r4)     // Catch:{ all -> 0x0e5b }
        L_0x0850:
            long r4 = r3.v()     // Catch:{ all -> 0x0e5b }
            long r9 = r8.h0()     // Catch:{ all -> 0x0e5b }
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0863
            long r3 = r3.v()     // Catch:{ all -> 0x0e5b }
            r8.A(r3)     // Catch:{ all -> 0x0e5b }
        L_0x0863:
            int r2 = r2 + 1
            goto L_0x0833
        L_0x0866:
            r8.z0()     // Catch:{ all -> 0x0e5b }
            r8.r0()     // Catch:{ all -> 0x0e5b }
            o8.i6 r9 = r1.f23475f     // Catch:{ all -> 0x0e5b }
            I(r9)     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = r8.b0()     // Catch:{ all -> 0x0e5b }
            java.util.List r11 = r8.e0()     // Catch:{ all -> 0x0e5b }
            java.util.List r12 = r8.f0()     // Catch:{ all -> 0x0e5b }
            long r2 = r8.i0()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e5b }
            long r2 = r8.h0()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0e5b }
            java.util.List r2 = r9.l(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0e5b }
            r8.k0(r2)     // Catch:{ all -> 0x0e5b }
            o8.f r2 = r46.K()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r3 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r3 = (k8.i3) r3     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = r3.D1()     // Catch:{ all -> 0x0e5b }
            boolean r2 = r2.y(r3)     // Catch:{ all -> 0x0e5b }
            if (r2 == 0) goto L_0x0be6
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0e5b }
            r2.<init>()     // Catch:{ all -> 0x0e5b }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0e5b }
            r3.<init>()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.r r4 = r46.Q()     // Catch:{ all -> 0x0e5b }
            java.security.SecureRandom r4 = r4.s()     // Catch:{ all -> 0x0e5b }
            r5 = 0
        L_0x08b9:
            int r6 = r8.P()     // Catch:{ all -> 0x0e5b }
            if (r5 >= r6) goto L_0x0bb0
            k8.y2 r6 = r8.j0(r5)     // Catch:{ all -> 0x0e5b }
            k8.h6 r6 = r6.o()     // Catch:{ all -> 0x0e5b }
            k8.x2 r6 = (k8.x2) r6     // Catch:{ all -> 0x0e5b }
            java.lang.String r9 = r6.v()     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "_sr"
            java.lang.String r11 = "_efs"
            if (r9 == 0) goto L_0x0951
            com.google.android.gms.measurement.internal.q r9 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r9)     // Catch:{ all -> 0x0e5b }
            k8.k6 r9 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.q.o(r9, r12)     // Catch:{ all -> 0x0e5b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0e5b }
            java.lang.Object r12 = r2.get(r9)     // Catch:{ all -> 0x0e5b }
            o8.n r12 = (o8.n) r12     // Catch:{ all -> 0x0e5b }
            if (r12 != 0) goto L_0x090d
            o8.j r12 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r12)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r13 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r13 = (k8.i3) r13     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = r13.D1()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.common.internal.i.h(r9)     // Catch:{ all -> 0x0e5b }
            o8.n r12 = r12.I(r13, r9)     // Catch:{ all -> 0x0e5b }
            if (r12 == 0) goto L_0x090d
            r2.put(r9, r12)     // Catch:{ all -> 0x0e5b }
        L_0x090d:
            if (r12 == 0) goto L_0x094c
            java.lang.Long r9 = r12.f23360i     // Catch:{ all -> 0x0e5b }
            if (r9 != 0) goto L_0x094c
            java.lang.Long r9 = r12.f23361j     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x092b
            long r13 = r9.longValue()     // Catch:{ all -> 0x0e5b }
            r15 = 1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x092b
            com.google.android.gms.measurement.internal.q r9 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r9)     // Catch:{ all -> 0x0e5b }
            java.lang.Long r9 = r12.f23361j     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r6, r10, r9)     // Catch:{ all -> 0x0e5b }
        L_0x092b:
            java.lang.Boolean r9 = r12.f23362k     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x0943
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x0943
            com.google.android.gms.measurement.internal.q r9 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r9)     // Catch:{ all -> 0x0e5b }
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r6, r11, r12)     // Catch:{ all -> 0x0e5b }
        L_0x0943:
            k8.k6 r9 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            r3.add(r9)     // Catch:{ all -> 0x0e5b }
        L_0x094c:
            r8.B(r5, r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0ac9
        L_0x0951:
            o8.q3 r9 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r9)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r12 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r12 = (k8.i3) r12     // Catch:{ all -> 0x0e5b }
            java.lang.String r12 = r12.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r13 = r9.a(r12, r13)     // Catch:{ all -> 0x0e5b }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0e5b }
            if (r14 != 0) goto L_0x0984
            long r12 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x096f }
            goto L_0x0986
        L_0x096f:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.measurement.internal.l r9 = r9.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r9 = r9.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r9 = r9.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.h.t(r12)     // Catch:{ all -> 0x0e5b }
            r9.c(r14, r12, r13)     // Catch:{ all -> 0x0e5b }
        L_0x0984:
            r12 = 0
        L_0x0986:
            com.google.android.gms.measurement.internal.r r9 = r46.Q()     // Catch:{ all -> 0x0e5b }
            long r14 = r6.o()     // Catch:{ all -> 0x0e5b }
            long r14 = r9.o0(r14, r12)     // Catch:{ all -> 0x0e5b }
            k8.k6 r9 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            r49 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0e5b }
            r16 = r12
            java.lang.String r12 = "_dbg"
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0e5b }
            if (r13 != 0) goto L_0x09de
            java.util.List r9 = r9.A()     // Catch:{ all -> 0x0e5b }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0e5b }
        L_0x09b2:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x0e5b }
            if (r13 == 0) goto L_0x09de
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x0e5b }
            k8.c3 r13 = (k8.c3) r13     // Catch:{ all -> 0x0e5b }
            r18 = r9
            java.lang.String r9 = r13.y()     // Catch:{ all -> 0x0e5b }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x09db
            long r12 = r13.v()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0e5b }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0e5b }
            if (r9 != 0) goto L_0x09d9
            goto L_0x09de
        L_0x09d9:
            r9 = 1
            goto L_0x09f3
        L_0x09db:
            r9 = r18
            goto L_0x09b2
        L_0x09de:
            o8.q3 r9 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r9)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r11 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r11 = (k8.i3) r11     // Catch:{ all -> 0x0e5b }
            java.lang.String r11 = r11.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.String r12 = r6.v()     // Catch:{ all -> 0x0e5b }
            int r9 = r9.l(r11, r12)     // Catch:{ all -> 0x0e5b }
        L_0x09f3:
            if (r9 > 0) goto L_0x0a18
            com.google.android.gms.measurement.internal.h r10 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r10 = r10.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r6.v()     // Catch:{ all -> 0x0e5b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0e5b }
            r10.c(r11, r12, r9)     // Catch:{ all -> 0x0e5b }
            k8.k6 r9 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            r3.add(r9)     // Catch:{ all -> 0x0e5b }
            r8.B(r5, r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0ac9
        L_0x0a18:
            java.lang.String r11 = r6.v()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0e5b }
            o8.n r11 = (o8.n) r11     // Catch:{ all -> 0x0e5b }
            if (r11 != 0) goto L_0x0a7e
            o8.j r11 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r11)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r12 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r12 = (k8.i3) r12     // Catch:{ all -> 0x0e5b }
            java.lang.String r12 = r12.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = r6.v()     // Catch:{ all -> 0x0e5b }
            o8.n r11 = r11.I(r12, r13)     // Catch:{ all -> 0x0e5b }
            if (r11 != 0) goto L_0x0a7e
            com.google.android.gms.measurement.internal.h r11 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r11 = r11.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            java.lang.Object r13 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r13 = (k8.i3) r13     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = r13.D1()     // Catch:{ all -> 0x0e5b }
            r18 = r14
            java.lang.String r14 = r6.v()     // Catch:{ all -> 0x0e5b }
            r11.c(r12, r13, r14)     // Catch:{ all -> 0x0e5b }
            o8.n r11 = new o8.n     // Catch:{ all -> 0x0e5b }
            java.lang.Object r12 = r7.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r12 = (k8.i3) r12     // Catch:{ all -> 0x0e5b }
            java.lang.String r29 = r12.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.String r30 = r6.v()     // Catch:{ all -> 0x0e5b }
            r31 = 1
            r33 = 1
            r35 = 1
            long r37 = r6.o()     // Catch:{ all -> 0x0e5b }
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r11
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch:{ all -> 0x0e5b }
            goto L_0x0a80
        L_0x0a7e:
            r18 = r14
        L_0x0a80:
            com.google.android.gms.measurement.internal.q r12 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r12)     // Catch:{ all -> 0x0e5b }
            k8.k6 r12 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r12 = (k8.y2) r12     // Catch:{ all -> 0x0e5b }
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.q.o(r12, r13)     // Catch:{ all -> 0x0e5b }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0e5b }
            if (r12 == 0) goto L_0x0a97
            r13 = 1
            goto L_0x0a98
        L_0x0a97:
            r13 = 0
        L_0x0a98:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0e5b }
            r14 = 1
            if (r9 != r14) goto L_0x0ad2
            k8.k6 r9 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            r3.add(r9)     // Catch:{ all -> 0x0e5b }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x0ac6
            java.lang.Long r9 = r11.f23360i     // Catch:{ all -> 0x0e5b }
            if (r9 != 0) goto L_0x0aba
            java.lang.Long r9 = r11.f23361j     // Catch:{ all -> 0x0e5b }
            if (r9 != 0) goto L_0x0aba
            java.lang.Boolean r9 = r11.f23362k     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x0ac6
        L_0x0aba:
            r9 = 0
            o8.n r10 = r11.a(r9, r9, r9)     // Catch:{ all -> 0x0e5b }
            java.lang.String r9 = r6.v()     // Catch:{ all -> 0x0e5b }
            r2.put(r9, r10)     // Catch:{ all -> 0x0e5b }
        L_0x0ac6:
            r8.B(r5, r6)     // Catch:{ all -> 0x0e5b }
        L_0x0ac9:
            r18 = r4
            r19 = r7
            r4 = r8
            r7 = 1
            goto L_0x0ba7
        L_0x0ad2:
            int r14 = r4.nextInt(r9)     // Catch:{ all -> 0x0e5b }
            if (r14 != 0) goto L_0x0b13
            com.google.android.gms.measurement.internal.q r12 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r12)     // Catch:{ all -> 0x0e5b }
            long r14 = (long) r9     // Catch:{ all -> 0x0e5b }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r6, r10, r9)     // Catch:{ all -> 0x0e5b }
            k8.k6 r10 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r10 = (k8.y2) r10     // Catch:{ all -> 0x0e5b }
            r3.add(r10)     // Catch:{ all -> 0x0e5b }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0e5b }
            if (r10 == 0) goto L_0x0af9
            r10 = 0
            o8.n r11 = r11.a(r10, r9, r10)     // Catch:{ all -> 0x0e5b }
        L_0x0af9:
            java.lang.String r9 = r6.v()     // Catch:{ all -> 0x0e5b }
            long r12 = r6.o()     // Catch:{ all -> 0x0e5b }
            r14 = r18
            o8.n r10 = r11.b(r12, r14)     // Catch:{ all -> 0x0e5b }
            r2.put(r9, r10)     // Catch:{ all -> 0x0e5b }
            r18 = r4
            r19 = r7
            r4 = r8
            r7 = 1
            goto L_0x0ba4
        L_0x0b13:
            r14 = r18
            r18 = r4
            java.lang.Long r4 = r11.f23359h     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x0b28
            long r16 = r4.longValue()     // Catch:{ all -> 0x0e5b }
            r19 = r7
            r21 = r8
            r23 = r11
            r22 = r12
            goto L_0x0b3e
        L_0x0b28:
            com.google.android.gms.measurement.internal.r r4 = r46.Q()     // Catch:{ all -> 0x0e5b }
            r19 = r7
            r21 = r8
            long r7 = r6.n()     // Catch:{ all -> 0x0e5b }
            r23 = r11
            r22 = r12
            r11 = r16
            long r16 = r4.o0(r7, r11)     // Catch:{ all -> 0x0e5b }
        L_0x0b3e:
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0b8a
            com.google.android.gms.measurement.internal.q r4 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r4)     // Catch:{ all -> 0x0e5b }
            r7 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0e5b }
            r11 = r49
            com.google.android.gms.measurement.internal.q.l(r6, r11, r4)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q r4 = r1.f23476g     // Catch:{ all -> 0x0e5b }
            I(r4)     // Catch:{ all -> 0x0e5b }
            long r11 = (long) r9     // Catch:{ all -> 0x0e5b }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.q.l(r6, r10, r4)     // Catch:{ all -> 0x0e5b }
            k8.k6 r9 = r6.f()     // Catch:{ all -> 0x0e5b }
            k8.y2 r9 = (k8.y2) r9     // Catch:{ all -> 0x0e5b }
            r3.add(r9)     // Catch:{ all -> 0x0e5b }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0e5b }
            if (r9 == 0) goto L_0x0b78
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0e5b }
            r11 = r23
            r10 = 0
            o8.n r11 = r11.a(r10, r4, r9)     // Catch:{ all -> 0x0e5b }
            goto L_0x0b7a
        L_0x0b78:
            r11 = r23
        L_0x0b7a:
            java.lang.String r4 = r6.v()     // Catch:{ all -> 0x0e5b }
            long r9 = r6.o()     // Catch:{ all -> 0x0e5b }
            o8.n r9 = r11.b(r9, r14)     // Catch:{ all -> 0x0e5b }
            r2.put(r4, r9)     // Catch:{ all -> 0x0e5b }
            goto L_0x0ba2
        L_0x0b8a:
            r11 = r23
            r7 = 1
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x0e5b }
            if (r4 == 0) goto L_0x0ba2
            java.lang.String r4 = r6.v()     // Catch:{ all -> 0x0e5b }
            r12 = r22
            r9 = 0
            o8.n r10 = r11.a(r12, r9, r9)     // Catch:{ all -> 0x0e5b }
            r2.put(r4, r10)     // Catch:{ all -> 0x0e5b }
        L_0x0ba2:
            r4 = r21
        L_0x0ba4:
            r4.B(r5, r6)     // Catch:{ all -> 0x0e5b }
        L_0x0ba7:
            int r5 = r5 + 1
            r8 = r4
            r4 = r18
            r7 = r19
            goto L_0x08b9
        L_0x0bb0:
            r19 = r7
            r4 = r8
            int r5 = r3.size()     // Catch:{ all -> 0x0e5b }
            int r6 = r4.P()     // Catch:{ all -> 0x0e5b }
            if (r5 >= r6) goto L_0x0bc3
            r4.t0()     // Catch:{ all -> 0x0e5b }
            r4.l0(r3)     // Catch:{ all -> 0x0e5b }
        L_0x0bc3:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0e5b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0e5b }
        L_0x0bcb:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0e5b }
            if (r3 == 0) goto L_0x0be9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0e5b }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0e5b }
            o8.j r5 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0e5b }
            o8.n r3 = (o8.n) r3     // Catch:{ all -> 0x0e5b }
            r5.p(r3)     // Catch:{ all -> 0x0e5b }
            goto L_0x0bcb
        L_0x0be6:
            r19 = r7
            r4 = r8
        L_0x0be9:
            r2 = r19
            java.lang.Object r3 = r2.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r3 = (k8.i3) r3     // Catch:{ all -> 0x0e5b }
            java.lang.String r3 = r3.D1()     // Catch:{ all -> 0x0e5b }
            o8.j r5 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            o8.x3 r5 = r5.E(r3)     // Catch:{ all -> 0x0e5b }
            if (r5 != 0) goto L_0x0c18
            com.google.android.gms.measurement.internal.h r5 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r5 = r5.p()     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            java.lang.Object r7 = r2.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r7 = (k8.i3) r7     // Catch:{ all -> 0x0e5b }
            java.lang.String r7 = r7.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r7)     // Catch:{ all -> 0x0e5b }
            r5.b(r6, r7)     // Catch:{ all -> 0x0e5b }
            goto L_0x0c74
        L_0x0c18:
            int r6 = r4.P()     // Catch:{ all -> 0x0e5b }
            if (r6 <= 0) goto L_0x0c74
            long r6 = r5.H()     // Catch:{ all -> 0x0e5b }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0c2c
            r4.L(r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0c2f
        L_0x0c2c:
            r4.w0()     // Catch:{ all -> 0x0e5b }
        L_0x0c2f:
            long r8 = r5.J()     // Catch:{ all -> 0x0e5b }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c3a
            goto L_0x0c3b
        L_0x0c3a:
            r6 = r8
        L_0x0c3b:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c43
            r4.O(r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0c46
        L_0x0c43:
            r4.x0()     // Catch:{ all -> 0x0e5b }
        L_0x0c46:
            r5.b()     // Catch:{ all -> 0x0e5b }
            long r6 = r5.I()     // Catch:{ all -> 0x0e5b }
            int r7 = (int) r6     // Catch:{ all -> 0x0e5b }
            r4.r(r7)     // Catch:{ all -> 0x0e5b }
            long r6 = r4.i0()     // Catch:{ all -> 0x0e5b }
            r5.v(r6)     // Catch:{ all -> 0x0e5b }
            long r6 = r4.h0()     // Catch:{ all -> 0x0e5b }
            r5.t(r6)     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r5.L()     // Catch:{ all -> 0x0e5b }
            if (r6 == 0) goto L_0x0c69
            r4.G(r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0c6c
        L_0x0c69:
            r4.u0()     // Catch:{ all -> 0x0e5b }
        L_0x0c6c:
            o8.j r6 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r6)     // Catch:{ all -> 0x0e5b }
            r6.o(r5)     // Catch:{ all -> 0x0e5b }
        L_0x0c74:
            int r5 = r4.P()     // Catch:{ all -> 0x0e5b }
            if (r5 <= 0) goto L_0x0dfe
            com.google.android.gms.measurement.internal.l r5 = r1.f23481l     // Catch:{ all -> 0x0e5b }
            r5.getClass()     // Catch:{ all -> 0x0e5b }
            o8.q3 r5 = r1.f23470a     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r6 = r2.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r6 = (k8.i3) r6     // Catch:{ all -> 0x0e5b }
            java.lang.String r6 = r6.D1()     // Catch:{ all -> 0x0e5b }
            k8.n2 r5 = r5.m(r6)     // Catch:{ all -> 0x0e5b }
            r6 = -1
            if (r5 == 0) goto L_0x0ca3
            boolean r8 = r5.H()     // Catch:{ all -> 0x0e5b }
            if (r8 != 0) goto L_0x0c9b
            goto L_0x0ca3
        L_0x0c9b:
            long r8 = r5.u()     // Catch:{ all -> 0x0e5b }
            r4.u(r8)     // Catch:{ all -> 0x0e5b }
            goto L_0x0cce
        L_0x0ca3:
            java.lang.Object r5 = r2.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r5 = (k8.i3) r5     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = r5.z()     // Catch:{ all -> 0x0e5b }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0e5b }
            if (r5 == 0) goto L_0x0cb5
            r4.u(r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0cce
        L_0x0cb5:
            com.google.android.gms.measurement.internal.h r5 = r46.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r5 = r5.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            java.lang.Object r9 = r2.f16024b     // Catch:{ all -> 0x0e5b }
            k8.i3 r9 = (k8.i3) r9     // Catch:{ all -> 0x0e5b }
            java.lang.String r9 = r9.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r9)     // Catch:{ all -> 0x0e5b }
            r5.b(r8, r9)     // Catch:{ all -> 0x0e5b }
        L_0x0cce:
            o8.j r5 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r5)     // Catch:{ all -> 0x0e5b }
            k8.k6 r4 = r4.f()     // Catch:{ all -> 0x0e5b }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ all -> 0x0e5b }
            r5.h()     // Catch:{ all -> 0x0e5b }
            r5.i()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ all -> 0x0e5b }
            java.lang.String r8 = r4.D1()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.common.internal.i.e(r8)     // Catch:{ all -> 0x0e5b }
            boolean r8 = r4.W0()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.common.internal.i.j(r8)     // Catch:{ all -> 0x0e5b }
            r5.l()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.l r8 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            z7.b r8 = r8.e()     // Catch:{ all -> 0x0e5b }
            long r8 = r8.b()     // Catch:{ all -> 0x0e5b }
            long r10 = r4.r1()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.l r12 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            r12.getClass()     // Catch:{ all -> 0x0e5b }
            long r12 = o8.f.i()     // Catch:{ all -> 0x0e5b }
            long r12 = r8 - r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0d22
            long r10 = r4.r1()     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.l r12 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            r12.getClass()     // Catch:{ all -> 0x0e5b }
            long r12 = o8.f.i()     // Catch:{ all -> 0x0e5b }
            long r12 = r12 + r8
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0d45
        L_0x0d22:
            com.google.android.gms.measurement.internal.l r10 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r10 = r10.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r10 = r10.r()     // Catch:{ all -> 0x0e5b }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r4.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.h.t(r12)     // Catch:{ all -> 0x0e5b }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0e5b }
            long r13 = r4.r1()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0e5b }
            r10.d(r11, r12, r8, r9)     // Catch:{ all -> 0x0e5b }
        L_0x0d45:
            byte[] r8 = r4.i()     // Catch:{ all -> 0x0e5b }
            o8.u5 r9 = r5.f23413b     // Catch:{ IOException -> 0x0de5 }
            com.google.android.gms.measurement.internal.q r9 = r9.f23476g     // Catch:{ IOException -> 0x0de5 }
            I(r9)     // Catch:{ IOException -> 0x0de5 }
            byte[] r8 = r9.O(r8)     // Catch:{ IOException -> 0x0de5 }
            com.google.android.gms.measurement.internal.l r9 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r9 = r9.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r9 = r9.q()     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0e5b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0e5b }
            r9.b(r10, r11)     // Catch:{ all -> 0x0e5b }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0e5b }
            r9.<init>()     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r4.D1()     // Catch:{ all -> 0x0e5b }
            r9.put(r10, r11)     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r4.r1()     // Catch:{ all -> 0x0e5b }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e5b }
            r9.put(r10, r11)     // Catch:{ all -> 0x0e5b }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0e5b }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0e5b }
            r9.put(r8, r10)     // Catch:{ all -> 0x0e5b }
            boolean r8 = r4.c1()     // Catch:{ all -> 0x0e5b }
            if (r8 == 0) goto L_0x0da4
            java.lang.String r8 = "retry_count"
            int r10 = r4.k1()     // Catch:{ all -> 0x0e5b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0e5b }
            r9.put(r8, r10)     // Catch:{ all -> 0x0e5b }
        L_0x0da4:
            android.database.sqlite.SQLiteDatabase r8 = r5.C()     // Catch:{ SQLiteException -> 0x0dcb }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0dcb }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0dfe
            com.google.android.gms.measurement.internal.l r6 = r5.f8864a     // Catch:{ SQLiteException -> 0x0dcb }
            com.google.android.gms.measurement.internal.h r6 = r6.d()     // Catch:{ SQLiteException -> 0x0dcb }
            o8.a3 r6 = r6.p()     // Catch:{ SQLiteException -> 0x0dcb }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r4.D1()     // Catch:{ SQLiteException -> 0x0dcb }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r8)     // Catch:{ SQLiteException -> 0x0dcb }
            r6.b(r7, r8)     // Catch:{ SQLiteException -> 0x0dcb }
            goto L_0x0dfe
        L_0x0dcb:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r5 = r5.p()     // Catch:{ all -> 0x0e5b }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r4 = r4.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)     // Catch:{ all -> 0x0e5b }
            r5.c(r7, r4, r6)     // Catch:{ all -> 0x0e5b }
            goto L_0x0dfe
        L_0x0de5:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r5 = r5.p()     // Catch:{ all -> 0x0e5b }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r4 = r4.D1()     // Catch:{ all -> 0x0e5b }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)     // Catch:{ all -> 0x0e5b }
            r5.c(r7, r4, r6)     // Catch:{ all -> 0x0e5b }
        L_0x0dfe:
            o8.j r4 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r4)     // Catch:{ all -> 0x0e5b }
            java.lang.Object r2 = r2.f16025c     // Catch:{ all -> 0x0e5b }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0e5b }
            r4.R(r2)     // Catch:{ all -> 0x0e5b }
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            android.database.sqlite.SQLiteDatabase r4 = r2.C()     // Catch:{ all -> 0x0e5b }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0e22 }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0e22 }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0e22 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0e22 }
            goto L_0x0e37
        L_0x0e22:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x0e5b }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0e5b }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0e5b }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r3)     // Catch:{ all -> 0x0e5b }
            r2.c(r5, r3, r4)     // Catch:{ all -> 0x0e5b }
        L_0x0e37:
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            r2.n()     // Catch:{ all -> 0x0e5b }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            r2 = 1
            return r2
        L_0x0e49:
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0e5b }
            I(r2)     // Catch:{ all -> 0x0e5b }
            r2.n()     // Catch:{ all -> 0x0e5b }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            r2 = 0
            return r2
        L_0x0e5b:
            r0 = move-exception
            r2 = r0
            o8.j r3 = r1.f23472c
            I(r3)
            r3.S()
            goto L_0x0e67
        L_0x0e66:
            throw r2
        L_0x0e67:
            goto L_0x0e66
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.F(java.lang.String, long):boolean");
    }

    public final boolean G() {
        b().h();
        g();
        j jVar = this.f23472c;
        I(jVar);
        if (!(jVar.y("select count(1) > 0 from raw_events", (String[]) null) != 0)) {
            j jVar2 = this.f23472c;
            I(jVar2);
            return !TextUtils.isEmpty(jVar2.L());
        }
    }

    public final boolean H(x2 x2Var, x2 x2Var2) {
        String str;
        com.google.android.gms.common.internal.i.a("_e".equals(x2Var.v()));
        I(this.f23476g);
        c3 n10 = q.n((y2) x2Var.f(), "_sc");
        String str2 = null;
        if (n10 == null) {
            str = null;
        } else {
            str = n10.z();
        }
        I(this.f23476g);
        c3 n11 = q.n((y2) x2Var2.f(), "_pc");
        if (n11 != null) {
            str2 = n11.z();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        C(x2Var, x2Var2);
        return true;
    }

    public final x3 J(b6 b6Var) {
        b().h();
        g();
        if (b6Var != null) {
            com.google.android.gms.common.internal.i.e(b6Var.f23131a);
            j jVar = this.f23472c;
            I(jVar);
            x3 E = jVar.E(b6Var.f23131a);
            g c10 = L(b6Var.f23131a).c(g.b(b6Var.D));
            String n10 = c10.f() ? this.f23478i.n(b6Var.f23131a) : "";
            if (E == null) {
                E = new x3(this.f23481l, b6Var.f23131a);
                if (c10.g()) {
                    E.f(R(c10));
                }
                if (c10.f()) {
                    E.x(n10);
                }
            } else {
                if (c10.f() && n10 != null) {
                    E.f23575a.b().h();
                    if (!n10.equals(E.f23579e)) {
                        E.x(n10);
                        E.f(R(c10));
                        y8.b();
                        if (K().v((String) null, v2.f23538t0) && !"00000000-0000-0000-0000-000000000000".equals(this.f23478i.m(b6Var.f23131a, c10).first)) {
                            j jVar2 = this.f23472c;
                            I(jVar2);
                            if (jVar2.J(b6Var.f23131a, "_id") != null) {
                                j jVar3 = this.f23472c;
                                I(jVar3);
                                if (jVar3.J(b6Var.f23131a, "_lair") == null) {
                                    y5 y5Var = new y5(b6Var.f23131a, "auto", "_lair", e().b(), 1L);
                                    j jVar4 = this.f23472c;
                                    I(jVar4);
                                    jVar4.u(y5Var);
                                }
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(E.N()) && c10.g()) {
                    E.f(R(c10));
                }
            }
            E.p(b6Var.f23132b);
            E.c(b6Var.f23147y);
            ra.b();
            if (K().v(E.M(), v2.f23506d0)) {
                E.o(b6Var.C);
            }
            if (!TextUtils.isEmpty(b6Var.f23141s)) {
                E.n(b6Var.f23141s);
            }
            long j10 = b6Var.f23135e;
            if (j10 != 0) {
                E.q(j10);
            }
            if (!TextUtils.isEmpty(b6Var.f23133c)) {
                E.h(b6Var.f23133c);
            }
            E.i(b6Var.f23140r);
            String str = b6Var.f23134d;
            if (str != null) {
                E.g(str);
            }
            E.k(b6Var.f23136f);
            E.w(b6Var.f23138h);
            if (!TextUtils.isEmpty(b6Var.f23137g)) {
                E.s(b6Var.f23137g);
            }
            if (!K().v((String) null, v2.f23524m0)) {
                E.e(b6Var.f23142t);
            }
            E.d(b6Var.f23145w);
            Boolean bool = b6Var.f23148z;
            E.f23575a.b().h();
            boolean z10 = E.D;
            Boolean bool2 = E.f23593s;
            String[] strArr = r.f8873g;
            E.D = z10 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
            E.f23593s = bool;
            E.l(b6Var.A);
            E.f23575a.b().h();
            if (E.D) {
                j jVar5 = this.f23472c;
                I(jVar5);
                jVar5.o(E);
            }
            return E;
        }
        throw new NullPointerException("null reference");
    }

    public final f K() {
        l lVar = this.f23481l;
        com.google.android.gms.common.internal.i.h(lVar);
        return lVar.f8843g;
    }

    public final g L(String str) {
        String str2;
        b().h();
        g();
        g gVar = this.A.get(str);
        if (gVar != null) {
            return gVar;
        }
        j jVar = this.f23472c;
        I(jVar);
        if (str != null) {
            jVar.h();
            jVar.i();
            Cursor cursor = null;
            try {
                Cursor rawQuery = jVar.C().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (rawQuery.moveToFirst()) {
                    str2 = rawQuery.getString(0);
                    rawQuery.close();
                } else {
                    rawQuery.close();
                    str2 = "G1";
                }
                g b10 = g.b(str2);
                r(str, b10);
                return b10;
            } catch (SQLiteException e10) {
                jVar.f8864a.d().f8797f.c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
                throw e10;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final j M() {
        j jVar = this.f23472c;
        I(jVar);
        return jVar;
    }

    public final e3 N() {
        e3 e3Var = this.f23473d;
        if (e3Var != null) {
            return e3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final q P() {
        q qVar = this.f23476g;
        I(qVar);
        return qVar;
    }

    public final r Q() {
        l lVar = this.f23481l;
        com.google.android.gms.common.internal.i.h(lVar);
        return lVar.A();
    }

    public final String R(g gVar) {
        if (!gVar.g()) {
            return null;
        }
        byte[] bArr = new byte[16];
        Q().s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.k r0 = r10.b()
            r0.h()
            r10.g()
            boolean r0 = r10.f23483n
            if (r0 != 0) goto L_0x01bb
            r0 = 1
            r10.f23483n = r0
            com.google.android.gms.measurement.internal.k r1 = r10.b()
            r1.h()
            o8.f r1 = r10.K()
            o8.u2<java.lang.Boolean> r2 = o8.v2.f23504c0
            r3 = 0
            boolean r1 = r1.v(r3, r2)
            java.lang.String r2 = "Storage concurrent access okay"
            r4 = 0
            if (r1 == 0) goto L_0x003e
            java.nio.channels.FileLock r1 = r10.f23491v
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            com.google.android.gms.measurement.internal.h r1 = r10.d()
            o8.a3 r1 = r1.f8805n
            r1.a(r2)
        L_0x003c:
            r1 = 1
            goto L_0x00a6
        L_0x003e:
            o8.j r1 = r10.f23472c
            com.google.android.gms.measurement.internal.l r1 = r1.f8864a
            r1.getClass()
            com.google.android.gms.measurement.internal.l r1 = r10.f23481l
            android.content.Context r1 = r1.f8837a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "google_app_measurement.db"
            r5.<init>(r1, r6)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            java.lang.String r6 = "rw"
            r1.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            r10.f23492w = r1     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            r10.f23491v = r1     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.h r1 = r10.d()     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            o8.a3 r1 = r1.f8805n     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            goto L_0x003c
        L_0x0073:
            com.google.android.gms.measurement.internal.h r1 = r10.d()     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            o8.a3 r1 = r1.f8797f     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x008c, OverlappingFileLockException -> 0x007f }
            goto L_0x00a5
        L_0x007f:
            r1 = move-exception
            com.google.android.gms.measurement.internal.h r2 = r10.d()
            o8.a3 r2 = r2.f8800i
            java.lang.String r5 = "Storage lock already acquired"
            r2.b(r5, r1)
            goto L_0x00a5
        L_0x008c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.h r2 = r10.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r5 = "Failed to access storage lock file"
            r2.b(r5, r1)
            goto L_0x00a5
        L_0x0099:
            r1 = move-exception
            com.google.android.gms.measurement.internal.h r2 = r10.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r5 = "Failed to acquire storage lock"
            r2.b(r5, r1)
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            if (r1 == 0) goto L_0x01bb
            java.nio.channels.FileChannel r1 = r10.f23492w
            com.google.android.gms.measurement.internal.k r2 = r10.b()
            r2.h()
            java.lang.String r2 = "Bad channel to read from"
            r5 = 0
            r7 = 4
            if (r1 == 0) goto L_0x00f4
            boolean r8 = r1.isOpen()
            if (r8 != 0) goto L_0x00bf
            goto L_0x00f4
        L_0x00bf:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r1.position(r5)     // Catch:{ IOException -> 0x00e7 }
            int r1 = r1.read(r8)     // Catch:{ IOException -> 0x00e7 }
            if (r1 == r7) goto L_0x00df
            r8 = -1
            if (r1 == r8) goto L_0x00fd
            com.google.android.gms.measurement.internal.h r8 = r10.d()     // Catch:{ IOException -> 0x00e7 }
            o8.a3 r8 = r8.f8800i     // Catch:{ IOException -> 0x00e7 }
            java.lang.String r9 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00e7 }
            r8.b(r9, r1)     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00fd
        L_0x00df:
            r8.flip()     // Catch:{ IOException -> 0x00e7 }
            int r4 = r8.getInt()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00fd
        L_0x00e7:
            r1 = move-exception
            com.google.android.gms.measurement.internal.h r8 = r10.d()
            o8.a3 r8 = r8.f8797f
            java.lang.String r9 = "Failed to read from channel"
            r8.b(r9, r1)
            goto L_0x00fd
        L_0x00f4:
            com.google.android.gms.measurement.internal.h r1 = r10.d()
            o8.a3 r1 = r1.f8797f
            r1.a(r2)
        L_0x00fd:
            com.google.android.gms.measurement.internal.l r1 = r10.f23481l
            com.google.android.gms.measurement.internal.e r1 = r1.q()
            r1.i()
            int r1 = r1.f8782e
            com.google.android.gms.measurement.internal.k r8 = r10.b()
            r8.h()
            if (r4 <= r1) goto L_0x0125
            com.google.android.gms.measurement.internal.h r0 = r10.d()
            o8.a3 r0 = r0.f8797f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            r0.c(r3, r2, r1)
            return
        L_0x0125:
            if (r4 >= r1) goto L_0x01bb
            java.nio.channels.FileChannel r8 = r10.f23492w
            com.google.android.gms.measurement.internal.k r9 = r10.b()
            r9.h()
            if (r8 == 0) goto L_0x019f
            boolean r9 = r8.isOpen()
            if (r9 != 0) goto L_0x0139
            goto L_0x019f
        L_0x0139:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            r2.putInt(r1)
            r2.flip()
            r8.truncate(r5)     // Catch:{ IOException -> 0x0192 }
            o8.f r7 = r10.K()     // Catch:{ IOException -> 0x0192 }
            o8.u2<java.lang.Boolean> r9 = o8.v2.f23522l0     // Catch:{ IOException -> 0x0192 }
            boolean r3 = r7.v(r3, r9)     // Catch:{ IOException -> 0x0192 }
            if (r3 == 0) goto L_0x015b
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0192 }
            r7 = 19
            if (r3 > r7) goto L_0x015b
            r8.position(r5)     // Catch:{ IOException -> 0x0192 }
        L_0x015b:
            r8.write(r2)     // Catch:{ IOException -> 0x0192 }
            r8.force(r0)     // Catch:{ IOException -> 0x0192 }
            long r2 = r8.size()     // Catch:{ IOException -> 0x0192 }
            r5 = 4
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x017e
            com.google.android.gms.measurement.internal.h r0 = r10.d()     // Catch:{ IOException -> 0x0192 }
            o8.a3 r0 = r0.f8797f     // Catch:{ IOException -> 0x0192 }
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r5 = r8.size()     // Catch:{ IOException -> 0x0192 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x0192 }
            r0.b(r2, r3)     // Catch:{ IOException -> 0x0192 }
        L_0x017e:
            com.google.android.gms.measurement.internal.h r0 = r10.d()
            o8.a3 r0 = r0.f8805n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            r0.c(r3, r2, r1)
            return
        L_0x0192:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h r2 = r10.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r3 = "Failed to write to channel"
            r2.b(r3, r0)
            goto L_0x01a8
        L_0x019f:
            com.google.android.gms.measurement.internal.h r0 = r10.d()
            o8.a3 r0 = r0.f8797f
            r0.a(r2)
        L_0x01a8:
            com.google.android.gms.measurement.internal.h r0 = r10.d()
            o8.a3 r0 = r0.f8797f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            r0.c(r3, r2, r1)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.a():void");
    }

    public final k b() {
        l lVar = this.f23481l;
        com.google.android.gms.common.internal.i.h(lVar);
        return lVar.b();
    }

    public final Context c() {
        return this.f23481l.f8837a;
    }

    public final h d() {
        l lVar = this.f23481l;
        com.google.android.gms.common.internal.i.h(lVar);
        return lVar.d();
    }

    public final b e() {
        l lVar = this.f23481l;
        com.google.android.gms.common.internal.i.h(lVar);
        return lVar.f8850n;
    }

    public final v f() {
        throw null;
    }

    public final void g() {
        if (!this.f23482m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void h(x3 x3Var) {
        String str;
        b().h();
        ra.b();
        f K = K();
        String M = x3Var.M();
        u2<Boolean> u2Var = v2.f23506d0;
        if (K.v(M, u2Var)) {
            if (TextUtils.isEmpty(x3Var.S()) && TextUtils.isEmpty(x3Var.R()) && TextUtils.isEmpty(x3Var.K())) {
                String M2 = x3Var.M();
                com.google.android.gms.common.internal.i.h(M2);
                l(M2, 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(x3Var.S()) && TextUtils.isEmpty(x3Var.K())) {
            String M3 = x3Var.M();
            com.google.android.gms.common.internal.i.h(M3);
            l(M3, 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        s5 s5Var = this.f23479j;
        Uri.Builder builder = new Uri.Builder();
        String S = x3Var.S();
        if (TextUtils.isEmpty(S)) {
            ra.b();
            if (s5Var.f8864a.f8843g.v(x3Var.M(), u2Var)) {
                S = x3Var.R();
                if (TextUtils.isEmpty(S)) {
                    S = x3Var.K();
                }
            } else {
                S = x3Var.K();
            }
        }
        a aVar = null;
        Uri.Builder encodedAuthority = builder.scheme(v2.f23507e.a(null)).encodedAuthority(v2.f23509f.a(null));
        String valueOf = String.valueOf(S);
        if (valueOf.length() != 0) {
            str = "config/app/".concat(valueOf);
        } else {
            str = new String("config/app/");
        }
        Uri.Builder appendQueryParameter = encodedAuthority.path(str).appendQueryParameter("app_instance_id", x3Var.N()).appendQueryParameter("platform", "android");
        s5Var.f8864a.f8843g.q();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(43042));
        nb.b();
        if (s5Var.f8864a.f8843g.v(x3Var.M(), v2.f23536s0)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String uri = builder.build().toString();
        try {
            String M4 = x3Var.M();
            com.google.android.gms.common.internal.i.h(M4);
            URL url = new URL(uri);
            d().f8805n.b("Fetching remote configuration", M4);
            q3 q3Var = this.f23470a;
            I(q3Var);
            n2 m10 = q3Var.m(M4);
            q3 q3Var2 = this.f23470a;
            I(q3Var2);
            q3Var2.h();
            String str2 = q3Var2.f23406k.get(M4);
            if (m10 != null && !TextUtils.isEmpty(str2)) {
                aVar = new a();
                aVar.put("If-Modified-Since", str2);
            }
            this.f23488s = true;
            i iVar = this.f23471b;
            I(iVar);
            t tVar = new t(this);
            iVar.h();
            iVar.i();
            iVar.f8864a.b().q(new d3(iVar, M4, url, (byte[]) null, aVar, tVar));
        } catch (MalformedURLException unused) {
            d().f8797f.c("Failed to parse config URL. Not fetching. appId", h.t(x3Var.M()), uri);
        }
    }

    public final void i(r rVar, b6 b6Var) {
        r rVar2;
        List<b> list;
        List<b> list2;
        List<b> list3;
        b6 b6Var2 = b6Var;
        if (b6Var2 != null) {
            com.google.android.gms.common.internal.i.e(b6Var2.f23131a);
            b().h();
            g();
            String str = b6Var2.f23131a;
            r rVar3 = rVar;
            long j10 = rVar3.f23417d;
            wb.f20536b.zza().zza();
            if (K().v((String) null, v2.f23542v0)) {
                androidx.leanback.widget.t g10 = androidx.leanback.widget.t.g(rVar);
                b().h();
                r.w((x4) null, (Bundle) g10.f2528e, false);
                rVar3 = g10.f();
            }
            I(this.f23476g);
            if (q.m(rVar3, b6Var2)) {
                if (!b6Var2.f23138h) {
                    J(b6Var2);
                    return;
                }
                List<String> list4 = b6Var2.B;
                if (list4 == null) {
                    rVar2 = rVar3;
                } else if (list4.contains(rVar3.f23414a)) {
                    Bundle i10 = rVar3.f23415b.i();
                    i10.putLong("ga_safelisted", 1);
                    rVar2 = new r(rVar3.f23414a, new p(i10), rVar3.f23416c, rVar3.f23417d);
                } else {
                    d().f8804m.d("Dropping non-safelisted event. appId, event name, origin", str, rVar3.f23414a, rVar3.f23416c);
                    return;
                }
                j jVar = this.f23472c;
                I(jVar);
                jVar.Q();
                try {
                    j jVar2 = this.f23472c;
                    I(jVar2);
                    com.google.android.gms.common.internal.i.e(str);
                    jVar2.h();
                    jVar2.i();
                    if (j10 < 0) {
                        jVar2.f8864a.d().f8800i.c("Invalid time querying timed out conditional properties", h.t(str), Long.valueOf(j10));
                        list = Collections.emptyList();
                    } else {
                        list = jVar2.N("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j10)});
                    }
                    for (b next : list) {
                        if (next != null) {
                            d().f8805n.d("User property timed out", next.f23109a, this.f23481l.f8849m.f(next.f23111c.f23562b), next.f23111c.i());
                            r rVar4 = next.f23115g;
                            if (rVar4 != null) {
                                u(new r(rVar4, j10), b6Var2);
                            }
                            j jVar3 = this.f23472c;
                            I(jVar3);
                            jVar3.x(str, next.f23111c.f23562b);
                        }
                    }
                    j jVar4 = this.f23472c;
                    I(jVar4);
                    com.google.android.gms.common.internal.i.e(str);
                    jVar4.h();
                    jVar4.i();
                    if (j10 < 0) {
                        jVar4.f8864a.d().f8800i.c("Invalid time querying expired conditional properties", h.t(str), Long.valueOf(j10));
                        list2 = Collections.emptyList();
                    } else {
                        list2 = jVar4.N("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j10)});
                    }
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (b next2 : list2) {
                        if (next2 != null) {
                            d().f8805n.d("User property expired", next2.f23109a, this.f23481l.f8849m.f(next2.f23111c.f23562b), next2.f23111c.i());
                            j jVar5 = this.f23472c;
                            I(jVar5);
                            jVar5.m(str, next2.f23111c.f23562b);
                            r rVar5 = next2.f23119s;
                            if (rVar5 != null) {
                                arrayList.add(rVar5);
                            }
                            j jVar6 = this.f23472c;
                            I(jVar6);
                            jVar6.x(str, next2.f23111c.f23562b);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        u(new r((r) it.next(), j10), b6Var2);
                    }
                    j jVar7 = this.f23472c;
                    I(jVar7);
                    String str2 = rVar2.f23414a;
                    com.google.android.gms.common.internal.i.e(str);
                    com.google.android.gms.common.internal.i.e(str2);
                    jVar7.h();
                    jVar7.i();
                    if (j10 < 0) {
                        jVar7.f8864a.d().f8800i.d("Invalid time querying triggered conditional properties", h.t(str), jVar7.f8864a.f8849m.d(str2), Long.valueOf(j10));
                        list3 = Collections.emptyList();
                    } else {
                        list3 = jVar7.N("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j10)});
                    }
                    ArrayList arrayList2 = new ArrayList(list3.size());
                    for (b next3 : list3) {
                        if (next3 != null) {
                            w5 w5Var = next3.f23111c;
                            String str3 = next3.f23109a;
                            com.google.android.gms.common.internal.i.h(str3);
                            String str4 = next3.f23110b;
                            String str5 = w5Var.f23562b;
                            Object i11 = w5Var.i();
                            com.google.android.gms.common.internal.i.h(i11);
                            y5 y5Var = new y5(str3, str4, str5, j10, i11);
                            j jVar8 = this.f23472c;
                            I(jVar8);
                            if (jVar8.u(y5Var)) {
                                d().f8805n.d("User property triggered", next3.f23109a, this.f23481l.f8849m.f(y5Var.f23624c), y5Var.f23626e);
                            } else {
                                d().f8797f.d("Too many active user properties, ignoring", h.t(next3.f23109a), this.f23481l.f8849m.f(y5Var.f23624c), y5Var.f23626e);
                            }
                            r rVar6 = next3.f23117i;
                            if (rVar6 != null) {
                                arrayList2.add(rVar6);
                            }
                            next3.f23111c = new w5(y5Var);
                            next3.f23113e = true;
                            j jVar9 = this.f23472c;
                            I(jVar9);
                            jVar9.t(next3);
                        }
                    }
                    u(rVar2, b6Var2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        u(new r((r) it2.next(), j10), b6Var2);
                    }
                    j jVar10 = this.f23472c;
                    I(jVar10);
                    jVar10.n();
                } finally {
                    j jVar11 = this.f23472c;
                    I(jVar11);
                    jVar11.S();
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void j(r rVar, String str) {
        r rVar2 = rVar;
        String str2 = str;
        j jVar = this.f23472c;
        I(jVar);
        x3 E = jVar.E(str2);
        if (E == null || TextUtils.isEmpty(E.P())) {
            d().f8804m.b("No app data available; dropping event", str2);
            return;
        }
        Boolean z10 = z(E);
        if (z10 == null) {
            if (!"_ui".equals(rVar2.f23414a)) {
                d().f8800i.b("Could not find package. appId", h.t(str));
            }
        } else if (!z10.booleanValue()) {
            d().f8797f.b("App version does not match; dropping event. appId", h.t(str));
            return;
        }
        String S = E.S();
        String P = E.P();
        long B2 = E.B();
        String O = E.O();
        long G = E.G();
        long D = E.D();
        boolean A2 = E.A();
        String Q = E.Q();
        long r10 = E.r();
        boolean z11 = E.z();
        String K = E.K();
        E.f23575a.b().h();
        Boolean bool = E.f23593s;
        long E2 = E.E();
        List<String> a10 = E.a();
        ra.b();
        b6 b6Var = r2;
        b6 b6Var2 = new b6(str, S, P, B2, O, G, D, (String) null, A2, false, Q, r10, 0, 0, z11, false, K, bool, E2, a10, K().v(E.M(), v2.f23506d0) ? E.R() : null, L(str2).e());
        k(rVar, b6Var);
    }

    public final void k(r rVar, b6 b6Var) {
        com.google.android.gms.common.internal.i.e(b6Var.f23131a);
        androidx.leanback.widget.t g10 = androidx.leanback.widget.t.g(rVar);
        j jVar = this.f23472c;
        I(jVar);
        Q().x((Bundle) g10.f2528e, jVar.D(b6Var.f23131a));
        Q().y(g10, K().n(b6Var.f23131a));
        r f10 = g10.f();
        if ("_cmp".equals(f10.f23414a) && "referrer API v2".equals(f10.f23415b.f23382a.getString("_cis"))) {
            String string = f10.f23415b.f23382a.getString("gclid");
            if (!TextUtils.isEmpty(string)) {
                s(new w5("_lgclid", f10.f23417d, string, "auto"), b6Var);
            }
        }
        i(f10, b6Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x0059, all -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[Catch:{ all -> 0x0059, all -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110 A[Catch:{ all -> 0x0059, all -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011c A[Catch:{ all -> 0x0059, all -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013c A[Catch:{ all -> 0x0059, all -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140 A[Catch:{ all -> 0x0059, all -> 0x0162 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.k r0 = r7.b()
            r0.h()
            r7.g()
            com.google.android.gms.common.internal.i.e(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0012
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0162 }
        L_0x0012:
            com.google.android.gms.measurement.internal.h r1 = r7.d()     // Catch:{ all -> 0x0162 }
            o8.a3 r1 = r1.f8805n     // Catch:{ all -> 0x0162 }
            int r2 = r11.length     // Catch:{ all -> 0x0162 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.b(r3, r2)     // Catch:{ all -> 0x0162 }
            o8.j r1 = r7.f23472c     // Catch:{ all -> 0x0162 }
            I(r1)     // Catch:{ all -> 0x0162 }
            r1.Q()     // Catch:{ all -> 0x0162 }
            o8.j r1 = r7.f23472c     // Catch:{ all -> 0x0059 }
            I(r1)     // Catch:{ all -> 0x0059 }
            o8.x3 r1 = r1.E(r8)     // Catch:{ all -> 0x0059 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r3) goto L_0x0041
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 == r3) goto L_0x0041
            if (r9 != r4) goto L_0x0045
            r9 = 304(0x130, float:4.26E-43)
        L_0x0041:
            if (r10 != 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r1 != 0) goto L_0x005c
            com.google.android.gms.measurement.internal.h r9 = r7.d()     // Catch:{ all -> 0x0059 }
            o8.a3 r9 = r9.f8800i     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r8)     // Catch:{ all -> 0x0059 }
            r9.b(r10, r8)     // Catch:{ all -> 0x0059 }
            goto L_0x0143
        L_0x0059:
            r8 = move-exception
            goto L_0x0159
        L_0x005c:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r3 != 0) goto L_0x00be
            if (r9 != r5) goto L_0x0064
            goto L_0x00be
        L_0x0064:
            z7.b r11 = r7.e()     // Catch:{ all -> 0x0059 }
            long r11 = r11.b()     // Catch:{ all -> 0x0059 }
            r1.m(r11)     // Catch:{ all -> 0x0059 }
            o8.j r11 = r7.f23472c     // Catch:{ all -> 0x0059 }
            I(r11)     // Catch:{ all -> 0x0059 }
            r11.o(r1)     // Catch:{ all -> 0x0059 }
            com.google.android.gms.measurement.internal.h r11 = r7.d()     // Catch:{ all -> 0x0059 }
            o8.a3 r11 = r11.f8805n     // Catch:{ all -> 0x0059 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0059 }
            r11.c(r12, r1, r10)     // Catch:{ all -> 0x0059 }
            o8.q3 r10 = r7.f23470a     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            r10.h()     // Catch:{ all -> 0x0059 }
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f23406k     // Catch:{ all -> 0x0059 }
            r10.put(r8, r6)     // Catch:{ all -> 0x0059 }
            o8.h5 r8 = r7.f23478i     // Catch:{ all -> 0x0059 }
            o8.h3 r8 = r8.f23249j     // Catch:{ all -> 0x0059 }
            z7.b r10 = r7.e()     // Catch:{ all -> 0x0059 }
            long r10 = r10.b()     // Catch:{ all -> 0x0059 }
            r8.b(r10)     // Catch:{ all -> 0x0059 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00aa
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00b9
        L_0x00aa:
            o8.h5 r8 = r7.f23478i     // Catch:{ all -> 0x0059 }
            o8.h3 r8 = r8.f23247h     // Catch:{ all -> 0x0059 }
            z7.b r9 = r7.e()     // Catch:{ all -> 0x0059 }
            long r9 = r9.b()     // Catch:{ all -> 0x0059 }
            r8.b(r9)     // Catch:{ all -> 0x0059 }
        L_0x00b9:
            r7.D()     // Catch:{ all -> 0x0059 }
            goto L_0x0143
        L_0x00be:
            if (r12 == 0) goto L_0x00c9
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x0059 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0059 }
            goto L_0x00ca
        L_0x00c9:
            r10 = r6
        L_0x00ca:
            if (r10 == 0) goto L_0x00d9
            int r12 = r10.size()     // Catch:{ all -> 0x0059 }
            if (r12 <= 0) goto L_0x00d9
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0059 }
            goto L_0x00da
        L_0x00d9:
            r10 = r6
        L_0x00da:
            if (r9 == r5) goto L_0x00e8
            if (r9 != r4) goto L_0x00df
            goto L_0x00e8
        L_0x00df:
            o8.q3 r12 = r7.f23470a     // Catch:{ all -> 0x0059 }
            I(r12)     // Catch:{ all -> 0x0059 }
            r12.t(r8, r11, r10)     // Catch:{ all -> 0x0059 }
            goto L_0x00fb
        L_0x00e8:
            o8.q3 r10 = r7.f23470a     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            k8.n2 r10 = r10.m(r8)     // Catch:{ all -> 0x0059 }
            if (r10 != 0) goto L_0x00fb
            o8.q3 r10 = r7.f23470a     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            r10.t(r8, r6, r6)     // Catch:{ all -> 0x0059 }
        L_0x00fb:
            z7.b r10 = r7.e()     // Catch:{ all -> 0x0059 }
            long r10 = r10.b()     // Catch:{ all -> 0x0059 }
            r1.j(r10)     // Catch:{ all -> 0x0059 }
            o8.j r10 = r7.f23472c     // Catch:{ all -> 0x0059 }
            I(r10)     // Catch:{ all -> 0x0059 }
            r10.o(r1)     // Catch:{ all -> 0x0059 }
            if (r9 != r5) goto L_0x011c
            com.google.android.gms.measurement.internal.h r9 = r7.d()     // Catch:{ all -> 0x0059 }
            o8.a3 r9 = r9.f8802k     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.b(r10, r8)     // Catch:{ all -> 0x0059 }
            goto L_0x012b
        L_0x011c:
            com.google.android.gms.measurement.internal.h r8 = r7.d()     // Catch:{ all -> 0x0059 }
            o8.a3 r8 = r8.f8805n     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0059 }
            r8.c(r10, r9, r2)     // Catch:{ all -> 0x0059 }
        L_0x012b:
            com.google.android.gms.measurement.internal.i r8 = r7.f23471b     // Catch:{ all -> 0x0059 }
            I(r8)     // Catch:{ all -> 0x0059 }
            boolean r8 = r8.m()     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x0140
            boolean r8 = r7.G()     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x0140
            r7.t()     // Catch:{ all -> 0x0059 }
            goto L_0x0143
        L_0x0140:
            r7.D()     // Catch:{ all -> 0x0059 }
        L_0x0143:
            o8.j r8 = r7.f23472c     // Catch:{ all -> 0x0059 }
            I(r8)     // Catch:{ all -> 0x0059 }
            r8.n()     // Catch:{ all -> 0x0059 }
            o8.j r8 = r7.f23472c     // Catch:{ all -> 0x0162 }
            I(r8)     // Catch:{ all -> 0x0162 }
            r8.S()     // Catch:{ all -> 0x0162 }
            r7.f23488s = r0
            r7.A()
            return
        L_0x0159:
            o8.j r9 = r7.f23472c     // Catch:{ all -> 0x0162 }
            I(r9)     // Catch:{ all -> 0x0162 }
            r9.S()     // Catch:{ all -> 0x0162 }
            throw r8     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r8 = move-exception
            r7.f23488s = r0
            r7.A()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.l(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x03af A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03d8 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ed A[SYNTHETIC, Splitter:B:128:0x03ed] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0489 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04a5 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0540 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b3 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01da A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0234 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0243 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0253 A[Catch:{ SQLiteException -> 0x01c5, all -> 0x0570 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(o8.b6 r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.k r8 = r24.b()
            r8.h()
            r24.g()
            if (r2 == 0) goto L_0x057b
            java.lang.String r8 = r2.f23131a
            com.google.android.gms.common.internal.i.e(r8)
            boolean r8 = r24.E(r25)
            if (r8 == 0) goto L_0x057a
            o8.j r8 = r1.f23472c
            I(r8)
            java.lang.String r9 = r2.f23131a
            o8.x3 r8 = r8.E(r9)
            r9 = 0
            if (r8 == 0) goto L_0x0062
            java.lang.String r11 = r8.S()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0062
            java.lang.String r11 = r2.f23132b
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0062
            r8.j(r9)
            o8.j r11 = r1.f23472c
            I(r11)
            r11.o(r8)
            o8.q3 r8 = r1.f23470a
            I(r8)
            java.lang.String r11 = r2.f23131a
            r8.h()
            java.util.Map<java.lang.String, k8.n2> r8 = r8.f23402g
            r8.remove(r11)
        L_0x0062:
            boolean r8 = r2.f23138h
            if (r8 != 0) goto L_0x006a
            r24.J(r25)
            return
        L_0x006a:
            long r11 = r2.f23143u
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0078
            z7.b r8 = r24.e()
            long r11 = r8.b()
        L_0x0078:
            com.google.android.gms.measurement.internal.l r8 = r1.f23481l
            o8.l r8 = r8.p()
            r8.h()
            r15 = 0
            r8.f23316f = r15
            r8.f23317g = r9
            int r8 = r2.f23144v
            r14 = 1
            if (r8 == 0) goto L_0x00a3
            if (r8 == r14) goto L_0x00a3
            com.google.android.gms.measurement.internal.h r13 = r24.d()
            o8.a3 r13 = r13.f8800i
            java.lang.String r15 = r2.f23131a
            java.lang.Object r15 = com.google.android.gms.measurement.internal.h.t(r15)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.c(r9, r15, r8)
            r8 = 0
        L_0x00a3:
            o8.j r9 = r1.f23472c
            I(r9)
            r9.Q()
            o8.j r9 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r9)     // Catch:{ all -> 0x0570 }
            java.lang.String r10 = r2.f23131a     // Catch:{ all -> 0x0570 }
            java.lang.String r13 = "_npa"
            o8.y5 r9 = r9.J(r10, r13)     // Catch:{ all -> 0x0570 }
            if (r9 == 0) goto L_0x00c8
            java.lang.String r13 = "auto"
            java.lang.String r10 = r9.f23623b     // Catch:{ all -> 0x0570 }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x0570 }
            if (r10 == 0) goto L_0x00c5
            goto L_0x00c8
        L_0x00c5:
            r22 = r3
            goto L_0x0115
        L_0x00c8:
            java.lang.Boolean r10 = r2.f23148z     // Catch:{ all -> 0x0570 }
            if (r10 == 0) goto L_0x0101
            o8.w5 r13 = new o8.w5     // Catch:{ all -> 0x0570 }
            java.lang.String r19 = "_npa"
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0570 }
            r14 = 1
            if (r14 == r10) goto L_0x00da
            r22 = 0
            goto L_0x00dc
        L_0x00da:
            r22 = 1
        L_0x00dc:
            java.lang.Long r10 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0570 }
            java.lang.String r18 = "auto"
            r22 = r3
            r15 = r13
            r3 = 0
            r13 = r15
            r3 = 1
            r14 = r19
            r3 = r15
            r15 = r11
            r17 = r10
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0570 }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.f23626e     // Catch:{ all -> 0x0570 }
            java.lang.Long r10 = r3.f23564d     // Catch:{ all -> 0x0570 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0570 }
            if (r9 != 0) goto L_0x0115
        L_0x00fd:
            r1.s(r3, r2)     // Catch:{ all -> 0x0570 }
            goto L_0x0115
        L_0x0101:
            r22 = r3
            if (r9 == 0) goto L_0x0115
            o8.w5 r3 = new o8.w5     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r3
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0570 }
            r1.o(r3, r2)     // Catch:{ all -> 0x0570 }
        L_0x0115:
            o8.j r3 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r3)     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = r2.f23131a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.common.internal.i.h(r9)     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0570 }
            o8.x3 r15 = r3.E(r9)     // Catch:{ all -> 0x0570 }
            if (r15 == 0) goto L_0x01d8
            com.google.android.gms.measurement.internal.r r3 = r24.Q()     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = r2.f23132b     // Catch:{ all -> 0x0570 }
            java.lang.String r10 = r15.S()     // Catch:{ all -> 0x0570 }
            java.lang.String r13 = r2.f23147y     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = r15.K()     // Catch:{ all -> 0x0570 }
            boolean r3 = r3.Z(r9, r10, r13, r14)     // Catch:{ all -> 0x0570 }
            if (r3 == 0) goto L_0x01d8
            com.google.android.gms.measurement.internal.h r3 = r24.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r3 = r3.f8800i     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r10 = r15.M()     // Catch:{ all -> 0x0570 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0570 }
            r3.b(r9, r10)     // Catch:{ all -> 0x0570 }
            o8.j r3 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r3)     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = r15.M()     // Catch:{ all -> 0x0570 }
            r3.i()     // Catch:{ all -> 0x0570 }
            r3.h()     // Catch:{ all -> 0x0570 }
            com.google.android.gms.common.internal.i.e(r9)     // Catch:{ all -> 0x0570 }
            android.database.sqlite.SQLiteDatabase r10 = r3.C()     // Catch:{ SQLiteException -> 0x01c5 }
            r13 = 1
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01c5 }
            r13 = 0
            r14[r13] = r9     // Catch:{ SQLiteException -> 0x01c5 }
            java.lang.String r13 = "events"
            int r13 = r10.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c5 }
            int r13 = r13 + r0
            if (r13 <= 0) goto L_0x01d7
            com.google.android.gms.measurement.internal.l r0 = r3.f8864a     // Catch:{ SQLiteException -> 0x01c5 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x01c5 }
            o8.a3 r0 = r0.f8805n     // Catch:{ SQLiteException -> 0x01c5 }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x01c5 }
            r0.c(r10, r9, r13)     // Catch:{ SQLiteException -> 0x01c5 }
            goto L_0x01d7
        L_0x01c5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x0570 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.h.t(r9)     // Catch:{ all -> 0x0570 }
            r3.c(r10, r9, r0)     // Catch:{ all -> 0x0570 }
        L_0x01d7:
            r15 = 0
        L_0x01d8:
            if (r15 == 0) goto L_0x022f
            long r9 = r15.B()     // Catch:{ all -> 0x0570 }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01f1
            long r9 = r15.B()     // Catch:{ all -> 0x0570 }
            long r13 = r2.f23140r     // Catch:{ all -> 0x0570 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01f1
            r14 = 1
            goto L_0x01f2
        L_0x01f1:
            r14 = 0
        L_0x01f2:
            java.lang.String r0 = r15.P()     // Catch:{ all -> 0x0570 }
            long r9 = r15.B()     // Catch:{ all -> 0x0570 }
            r15 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x020d
            if (r0 == 0) goto L_0x020d
            java.lang.String r3 = r2.f23133c     // Catch:{ all -> 0x0570 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0570 }
            if (r3 != 0) goto L_0x020d
            r3 = 1
            goto L_0x020e
        L_0x020d:
            r3 = 0
        L_0x020e:
            r3 = r3 | r14
            if (r3 == 0) goto L_0x022f
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0570 }
            r3.<init>()     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = "_pv"
            r3.putString(r9, r0)     // Catch:{ all -> 0x0570 }
            o8.r r0 = new o8.r     // Catch:{ all -> 0x0570 }
            o8.p r15 = new o8.p     // Catch:{ all -> 0x0570 }
            r15.<init>(r3)     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0570 }
            r1.i(r0, r2)     // Catch:{ all -> 0x0570 }
        L_0x022f:
            r24.J(r25)     // Catch:{ all -> 0x0570 }
            if (r8 != 0) goto L_0x0243
            o8.j r0 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r0)     // Catch:{ all -> 0x0570 }
            java.lang.String r3 = r2.f23131a     // Catch:{ all -> 0x0570 }
            java.lang.String r8 = "_f"
            o8.n r0 = r0.I(r3, r8)     // Catch:{ all -> 0x0570 }
            r14 = 0
            goto L_0x0251
        L_0x0243:
            o8.j r0 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r0)     // Catch:{ all -> 0x0570 }
            java.lang.String r3 = r2.f23131a     // Catch:{ all -> 0x0570 }
            java.lang.String r8 = "_v"
            o8.n r0 = r0.I(r3, r8)     // Catch:{ all -> 0x0570 }
            r14 = 1
        L_0x0251:
            if (r0 != 0) goto L_0x0540
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            long r15 = r11 / r8
            r10 = r4
            r3 = 1
            long r15 = r15 + r3
            long r15 = r15 * r8
            java.lang.String r8 = "_dac"
            java.lang.String r9 = "_r"
            java.lang.String r13 = "_c"
            java.lang.String r3 = "_et"
            if (r14 != 0) goto L_0x04bf
            o8.w5 r0 = new o8.w5     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0570 }
            java.lang.String r18 = "auto"
            r4 = r13
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0570 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.k r0 = r24.b()     // Catch:{ all -> 0x0570 }
            r0.h()     // Catch:{ all -> 0x0570 }
            o8.m3 r0 = r1.f23480k     // Catch:{ all -> 0x0570 }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ all -> 0x0570 }
            r13 = r0
            o8.m3 r13 = (o8.m3) r13     // Catch:{ all -> 0x0570 }
            java.lang.String r0 = r2.f23131a     // Catch:{ all -> 0x0570 }
            if (r0 == 0) goto L_0x0370
            boolean r14 = r0.isEmpty()     // Catch:{ all -> 0x0570 }
            if (r14 == 0) goto L_0x0296
            goto L_0x0370
        L_0x0296:
            com.google.android.gms.measurement.internal.l r14 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.k r14 = r14.b()     // Catch:{ all -> 0x0570 }
            r14.h()     // Catch:{ all -> 0x0570 }
            boolean r14 = r13.a()     // Catch:{ all -> 0x0570 }
            if (r14 != 0) goto L_0x02b6
            com.google.android.gms.measurement.internal.l r0 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r0 = r0.f8803l     // Catch:{ all -> 0x0570 }
            java.lang.String r5 = "Install Referrer Reporter is not available"
            r0.a(r5)     // Catch:{ all -> 0x0570 }
            r20 = r11
            goto L_0x037f
        L_0x02b6:
            o8.l3 r14 = new o8.l3     // Catch:{ all -> 0x0570 }
            r14.<init>(r13, r0)     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.l r0 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.k r0 = r0.b()     // Catch:{ all -> 0x0570 }
            r0.h()     // Catch:{ all -> 0x0570 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0570 }
            java.lang.String r15 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r15)     // Catch:{ all -> 0x0570 }
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x0570 }
            r20 = r11
            java.lang.String r11 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15.<init>(r5, r11)     // Catch:{ all -> 0x0570 }
            r0.setComponent(r15)     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.l r11 = r13.f23338a     // Catch:{ all -> 0x0570 }
            android.content.Context r11 = r11.f8837a     // Catch:{ all -> 0x0570 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ all -> 0x0570 }
            if (r11 != 0) goto L_0x02f0
            com.google.android.gms.measurement.internal.l r0 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r0 = r0.f8801j     // Catch:{ all -> 0x0570 }
            java.lang.String r5 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.a(r5)     // Catch:{ all -> 0x0570 }
            goto L_0x037f
        L_0x02f0:
            r12 = 0
            java.util.List r11 = r11.queryIntentServices(r0, r12)     // Catch:{ all -> 0x0570 }
            if (r11 == 0) goto L_0x0362
            boolean r15 = r11.isEmpty()     // Catch:{ all -> 0x0570 }
            if (r15 != 0) goto L_0x0362
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x0570 }
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11     // Catch:{ all -> 0x0570 }
            android.content.pm.ServiceInfo r11 = r11.serviceInfo     // Catch:{ all -> 0x0570 }
            if (r11 == 0) goto L_0x037f
            java.lang.String r12 = r11.packageName     // Catch:{ all -> 0x0570 }
            java.lang.String r11 = r11.name     // Catch:{ all -> 0x0570 }
            if (r11 == 0) goto L_0x0354
            boolean r5 = r5.equals(r12)     // Catch:{ all -> 0x0570 }
            if (r5 == 0) goto L_0x0354
            boolean r5 = r13.a()     // Catch:{ all -> 0x0570 }
            if (r5 == 0) goto L_0x0354
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0570 }
            r5.<init>(r0)     // Catch:{ all -> 0x0570 }
            y7.a r0 = y7.a.b()     // Catch:{ RuntimeException -> 0x0341 }
            com.google.android.gms.measurement.internal.l r11 = r13.f23338a     // Catch:{ RuntimeException -> 0x0341 }
            android.content.Context r11 = r11.f8837a     // Catch:{ RuntimeException -> 0x0341 }
            r12 = 1
            boolean r0 = r0.a(r11, r5, r14, r12)     // Catch:{ RuntimeException -> 0x0341 }
            com.google.android.gms.measurement.internal.l r5 = r13.f23338a     // Catch:{ RuntimeException -> 0x0341 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ RuntimeException -> 0x0341 }
            o8.a3 r5 = r5.f8805n     // Catch:{ RuntimeException -> 0x0341 }
            java.lang.String r11 = "Install Referrer Service is"
            java.lang.String r12 = "available"
            java.lang.String r14 = "not available"
            r15 = 1
            if (r15 == r0) goto L_0x033d
            r12 = r14
        L_0x033d:
            r5.b(r11, r12)     // Catch:{ RuntimeException -> 0x0341 }
            goto L_0x037f
        L_0x0341:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r5 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r5 = r5.f8797f     // Catch:{ all -> 0x0570 }
            java.lang.String r11 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0570 }
            r5.b(r11, r0)     // Catch:{ all -> 0x0570 }
            goto L_0x037f
        L_0x0354:
            com.google.android.gms.measurement.internal.l r0 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x0570 }
            java.lang.String r5 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.a(r5)     // Catch:{ all -> 0x0570 }
            goto L_0x037f
        L_0x0362:
            com.google.android.gms.measurement.internal.l r0 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r0 = r0.f8803l     // Catch:{ all -> 0x0570 }
            java.lang.String r5 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.a(r5)     // Catch:{ all -> 0x0570 }
            goto L_0x037f
        L_0x0370:
            r20 = r11
            com.google.android.gms.measurement.internal.l r0 = r13.f23338a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r0 = r0.f8801j     // Catch:{ all -> 0x0570 }
            java.lang.String r5 = "Install Referrer Reporter was called with invalid app package name"
            r0.a(r5)     // Catch:{ all -> 0x0570 }
        L_0x037f:
            com.google.android.gms.measurement.internal.k r0 = r24.b()     // Catch:{ all -> 0x0570 }
            r0.h()     // Catch:{ all -> 0x0570 }
            r24.g()     // Catch:{ all -> 0x0570 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0570 }
            r5.<init>()     // Catch:{ all -> 0x0570 }
            r11 = 1
            r5.putLong(r4, r11)     // Catch:{ all -> 0x0570 }
            r5.putLong(r9, r11)     // Catch:{ all -> 0x0570 }
            r11 = 0
            r5.putLong(r7, r11)     // Catch:{ all -> 0x0570 }
            r5.putLong(r6, r11)     // Catch:{ all -> 0x0570 }
            r5.putLong(r10, r11)     // Catch:{ all -> 0x0570 }
            r4 = r22
            r5.putLong(r4, r11)     // Catch:{ all -> 0x0570 }
            r11 = 1
            r5.putLong(r3, r11)     // Catch:{ all -> 0x0570 }
            boolean r0 = r2.f23146x     // Catch:{ all -> 0x0570 }
            if (r0 == 0) goto L_0x03b2
            r5.putLong(r8, r11)     // Catch:{ all -> 0x0570 }
        L_0x03b2:
            java.lang.String r0 = r2.f23131a     // Catch:{ all -> 0x0570 }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ all -> 0x0570 }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0570 }
            o8.j r0 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r0)     // Catch:{ all -> 0x0570 }
            com.google.android.gms.common.internal.i.e(r8)     // Catch:{ all -> 0x0570 }
            r0.h()     // Catch:{ all -> 0x0570 }
            r0.i()     // Catch:{ all -> 0x0570 }
            java.lang.String r9 = "first_open_count"
            long r11 = r0.A(r8, r9)     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.l r0 = r1.f23481l     // Catch:{ all -> 0x0570 }
            android.content.Context r0 = r0.f8837a     // Catch:{ all -> 0x0570 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0570 }
            if (r0 != 0) goto L_0x03ed
            com.google.android.gms.measurement.internal.h r0 = r24.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r0 = r0.f8797f     // Catch:{ all -> 0x0570 }
            java.lang.String r4 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r8)     // Catch:{ all -> 0x0570 }
            r0.b(r4, r7)     // Catch:{ all -> 0x0570 }
            r22 = r3
        L_0x03e9:
            r3 = 0
            goto L_0x04a1
        L_0x03ed:
            com.google.android.gms.measurement.internal.l r0 = r1.f23481l     // Catch:{ NameNotFoundException -> 0x0401 }
            android.content.Context r0 = r0.f8837a     // Catch:{ NameNotFoundException -> 0x0401 }
            b8.b r0 = b8.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0401 }
            android.content.Context r0 = r0.f3657a     // Catch:{ NameNotFoundException -> 0x0401 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0401 }
            r9 = 0
            android.content.pm.PackageInfo r15 = r0.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x0401 }
            goto L_0x0412
        L_0x0401:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h r9 = r24.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r9 = r9.f8797f     // Catch:{ all -> 0x0570 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.h.t(r8)     // Catch:{ all -> 0x0570 }
            r9.c(r13, r14, r0)     // Catch:{ all -> 0x0570 }
            r15 = 0
        L_0x0412:
            if (r15 == 0) goto L_0x0464
            long r13 = r15.firstInstallTime     // Catch:{ all -> 0x0570 }
            r16 = 0
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0464
            r22 = r3
            r9 = r4
            long r3 = r15.lastUpdateTime     // Catch:{ all -> 0x0570 }
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0445
            o8.f r0 = r24.K()     // Catch:{ all -> 0x0570 }
            o8.u2<java.lang.Boolean> r3 = o8.v2.f23514h0     // Catch:{ all -> 0x0570 }
            r4 = 0
            boolean r0 = r0.v(r4, r3)     // Catch:{ all -> 0x0570 }
            if (r0 == 0) goto L_0x043f
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x043d
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x0570 }
        L_0x043d:
            r14 = 0
            goto L_0x0447
        L_0x043f:
            r13 = 1
            r5.putLong(r7, r13)     // Catch:{ all -> 0x0570 }
            goto L_0x043d
        L_0x0445:
            r4 = 0
            r14 = 1
        L_0x0447:
            o8.w5 r0 = new o8.w5     // Catch:{ all -> 0x0570 }
            java.lang.String r3 = "_fi"
            r7 = 1
            if (r7 == r14) goto L_0x0451
            r14 = 0
            goto L_0x0453
        L_0x0451:
            r14 = 1
        L_0x0453:
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0570 }
            java.lang.String r18 = "auto"
            r13 = r0
            r14 = r3
            r15 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0570 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0570 }
            goto L_0x0468
        L_0x0464:
            r22 = r3
            r9 = r4
            r4 = 0
        L_0x0468:
            com.google.android.gms.measurement.internal.l r0 = r1.f23481l     // Catch:{ NameNotFoundException -> 0x0476 }
            android.content.Context r0 = r0.f8837a     // Catch:{ NameNotFoundException -> 0x0476 }
            b8.b r0 = b8.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0476 }
            r3 = 0
            android.content.pm.ApplicationInfo r15 = r0.a(r8, r3)     // Catch:{ NameNotFoundException -> 0x0476 }
            goto L_0x0487
        L_0x0476:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h r3 = r24.d()     // Catch:{ all -> 0x0570 }
            o8.a3 r3 = r3.f8797f     // Catch:{ all -> 0x0570 }
            java.lang.String r7 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r8)     // Catch:{ all -> 0x0570 }
            r3.c(r7, r8, r0)     // Catch:{ all -> 0x0570 }
            r15 = r4
        L_0x0487:
            if (r15 == 0) goto L_0x03e9
            int r0 = r15.flags     // Catch:{ all -> 0x0570 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0494
            r3 = 1
            r5.putLong(r10, r3)     // Catch:{ all -> 0x0570 }
        L_0x0494:
            int r0 = r15.flags     // Catch:{ all -> 0x0570 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03e9
            r3 = 1
            r5.putLong(r9, r3)     // Catch:{ all -> 0x0570 }
            goto L_0x03e9
        L_0x04a1:
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04a8
            r5.putLong(r6, r11)     // Catch:{ all -> 0x0570 }
        L_0x04a8:
            o8.r r0 = new o8.r     // Catch:{ all -> 0x0570 }
            o8.p r15 = new o8.p     // Catch:{ all -> 0x0570 }
            r15.<init>(r5)     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r20
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0570 }
            r1.k(r0, r2)     // Catch:{ all -> 0x0570 }
            r3 = r22
            goto L_0x050e
        L_0x04bf:
            r22 = r3
            r20 = r11
            r4 = r13
            o8.w5 r0 = new o8.w5     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0570 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x0570 }
            r1.s(r0, r2)     // Catch:{ all -> 0x0570 }
            com.google.android.gms.measurement.internal.k r0 = r24.b()     // Catch:{ all -> 0x0570 }
            r0.h()     // Catch:{ all -> 0x0570 }
            r24.g()     // Catch:{ all -> 0x0570 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0570 }
            r0.<init>()     // Catch:{ all -> 0x0570 }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x0570 }
            r0.putLong(r9, r5)     // Catch:{ all -> 0x0570 }
            r3 = r22
            r0.putLong(r3, r5)     // Catch:{ all -> 0x0570 }
            boolean r4 = r2.f23146x     // Catch:{ all -> 0x0570 }
            if (r4 == 0) goto L_0x04fa
            r0.putLong(r8, r5)     // Catch:{ all -> 0x0570 }
        L_0x04fa:
            o8.r r4 = new o8.r     // Catch:{ all -> 0x0570 }
            o8.p r15 = new o8.p     // Catch:{ all -> 0x0570 }
            r15.<init>(r0)     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r4
            r17 = r20
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0570 }
            r1.k(r4, r2)     // Catch:{ all -> 0x0570 }
        L_0x050e:
            o8.f r0 = r24.K()     // Catch:{ all -> 0x0570 }
            java.lang.String r4 = r2.f23131a     // Catch:{ all -> 0x0570 }
            o8.u2<java.lang.Boolean> r5 = o8.v2.U     // Catch:{ all -> 0x0570 }
            boolean r0 = r0.v(r4, r5)     // Catch:{ all -> 0x0570 }
            if (r0 != 0) goto L_0x055f
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0570 }
            r0.<init>()     // Catch:{ all -> 0x0570 }
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0570 }
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r4)     // Catch:{ all -> 0x0570 }
            o8.r r3 = new o8.r     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_e"
            o8.p r15 = new o8.p     // Catch:{ all -> 0x0570 }
            r15.<init>(r0)     // Catch:{ all -> 0x0570 }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r20
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0570 }
            r1.k(r3, r2)     // Catch:{ all -> 0x0570 }
            goto L_0x055f
        L_0x0540:
            r20 = r11
            boolean r0 = r2.f23139i     // Catch:{ all -> 0x0570 }
            if (r0 == 0) goto L_0x055f
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0570 }
            r0.<init>()     // Catch:{ all -> 0x0570 }
            o8.r r3 = new o8.r     // Catch:{ all -> 0x0570 }
            o8.p r15 = new o8.p     // Catch:{ all -> 0x0570 }
            r15.<init>(r0)     // Catch:{ all -> 0x0570 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r20
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0570 }
            r1.k(r3, r2)     // Catch:{ all -> 0x0570 }
        L_0x055f:
            o8.j r0 = r1.f23472c     // Catch:{ all -> 0x0570 }
            I(r0)     // Catch:{ all -> 0x0570 }
            r0.n()     // Catch:{ all -> 0x0570 }
            o8.j r0 = r1.f23472c
            I(r0)
            r0.S()
            return
        L_0x0570:
            r0 = move-exception
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            throw r0
        L_0x057a:
            return
        L_0x057b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null reference"
            r0.<init>(r2)
            goto L_0x0584
        L_0x0583:
            throw r0
        L_0x0584:
            goto L_0x0583
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.m(o8.b6):void");
    }

    public final void n(b bVar, b6 b6Var) {
        if (bVar != null) {
            com.google.android.gms.common.internal.i.e(bVar.f23109a);
            com.google.android.gms.common.internal.i.h(bVar.f23111c);
            com.google.android.gms.common.internal.i.e(bVar.f23111c.f23562b);
            b().h();
            g();
            if (E(b6Var)) {
                if (b6Var.f23138h) {
                    j jVar = this.f23472c;
                    I(jVar);
                    jVar.Q();
                    try {
                        J(b6Var);
                        String str = bVar.f23109a;
                        com.google.android.gms.common.internal.i.h(str);
                        String str2 = str;
                        j jVar2 = this.f23472c;
                        I(jVar2);
                        b F = jVar2.F(str2, bVar.f23111c.f23562b);
                        if (F != null) {
                            d().f8804m.c("Removing conditional user property", bVar.f23109a, this.f23481l.f8849m.f(bVar.f23111c.f23562b));
                            j jVar3 = this.f23472c;
                            I(jVar3);
                            jVar3.x(str2, bVar.f23111c.f23562b);
                            if (F.f23113e) {
                                j jVar4 = this.f23472c;
                                I(jVar4);
                                jVar4.m(str2, bVar.f23111c.f23562b);
                            }
                            r rVar = bVar.f23119s;
                            if (rVar != null) {
                                p pVar = rVar.f23415b;
                                Bundle i10 = pVar != null ? pVar.i() : null;
                                r Q = Q();
                                r rVar2 = bVar.f23119s;
                                com.google.android.gms.common.internal.i.h(rVar2);
                                r s02 = Q.s0(str2, rVar2.f23414a, i10, F.f23110b, bVar.f23119s.f23417d, true, true);
                                com.google.android.gms.common.internal.i.h(s02);
                                u(s02, b6Var);
                            }
                        } else {
                            d().f8800i.c("Conditional user property doesn't exist", h.t(bVar.f23109a), this.f23481l.f8849m.f(bVar.f23111c.f23562b));
                        }
                        j jVar5 = this.f23472c;
                        I(jVar5);
                        jVar5.n();
                    } finally {
                        j jVar6 = this.f23472c;
                        I(jVar6);
                        jVar6.S();
                    }
                } else {
                    J(b6Var);
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void o(w5 w5Var, b6 b6Var) {
        b().h();
        g();
        if (E(b6Var)) {
            if (!b6Var.f23138h) {
                J(b6Var);
            } else if (!"_npa".equals(w5Var.f23562b) || b6Var.f23148z == null) {
                d().f8804m.b("Removing user property", this.f23481l.f8849m.f(w5Var.f23562b));
                j jVar = this.f23472c;
                I(jVar);
                jVar.Q();
                try {
                    J(b6Var);
                    j jVar2 = this.f23472c;
                    I(jVar2);
                    String str = b6Var.f23131a;
                    com.google.android.gms.common.internal.i.h(str);
                    jVar2.m(str, w5Var.f23562b);
                    j jVar3 = this.f23472c;
                    I(jVar3);
                    jVar3.n();
                    d().f8804m.b("User property removed", this.f23481l.f8849m.f(w5Var.f23562b));
                } finally {
                    j jVar4 = this.f23472c;
                    I(jVar4);
                    jVar4.S();
                }
            } else {
                d().f8804m.a("Falling back to manifest metadata value for ad personalization");
                s(new w5("_npa", e().b(), Long.valueOf(true != b6Var.f23148z.booleanValue() ? 0 : 1), "auto"), b6Var);
            }
        }
    }

    public final void p(b6 b6Var) {
        if (this.f23493x != null) {
            ArrayList arrayList = new ArrayList();
            this.f23494y = arrayList;
            arrayList.addAll(this.f23493x);
        }
        j jVar = this.f23472c;
        I(jVar);
        String str = b6Var.f23131a;
        com.google.android.gms.common.internal.i.h(str);
        String str2 = str;
        com.google.android.gms.common.internal.i.e(str2);
        jVar.h();
        jVar.i();
        try {
            SQLiteDatabase C2 = jVar.C();
            String[] strArr = {str2};
            int delete = C2.delete("apps", "app_id=?", strArr) + C2.delete("events", "app_id=?", strArr) + C2.delete("user_attributes", "app_id=?", strArr) + C2.delete("conditional_properties", "app_id=?", strArr) + C2.delete("raw_events", "app_id=?", strArr) + C2.delete("raw_events_metadata", "app_id=?", strArr) + C2.delete("queue", "app_id=?", strArr) + C2.delete("audience_filter_values", "app_id=?", strArr) + C2.delete("main_event_params", "app_id=?", strArr) + C2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                jVar.f8864a.d().f8805n.c("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            jVar.f8864a.d().f8797f.c("Error resetting analytics data. appId, error", h.t(str2), e10);
        }
        if (b6Var.f23138h) {
            m(b6Var);
        }
    }

    public final void q(b bVar, b6 b6Var) {
        r rVar;
        if (bVar != null) {
            com.google.android.gms.common.internal.i.e(bVar.f23109a);
            com.google.android.gms.common.internal.i.h(bVar.f23110b);
            com.google.android.gms.common.internal.i.h(bVar.f23111c);
            com.google.android.gms.common.internal.i.e(bVar.f23111c.f23562b);
            b().h();
            g();
            if (E(b6Var)) {
                if (!b6Var.f23138h) {
                    J(b6Var);
                    return;
                }
                b bVar2 = new b(bVar);
                boolean z10 = false;
                bVar2.f23113e = false;
                j jVar = this.f23472c;
                I(jVar);
                jVar.Q();
                try {
                    j jVar2 = this.f23472c;
                    I(jVar2);
                    String str = bVar2.f23109a;
                    com.google.android.gms.common.internal.i.h(str);
                    b F = jVar2.F(str, bVar2.f23111c.f23562b);
                    if (F != null && !F.f23110b.equals(bVar2.f23110b)) {
                        d().f8800i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f23481l.f8849m.f(bVar2.f23111c.f23562b), bVar2.f23110b, F.f23110b);
                    }
                    if (F != null && F.f23113e) {
                        bVar2.f23110b = F.f23110b;
                        bVar2.f23112d = F.f23112d;
                        bVar2.f23116h = F.f23116h;
                        bVar2.f23114f = F.f23114f;
                        bVar2.f23117i = F.f23117i;
                        bVar2.f23113e = true;
                        w5 w5Var = bVar2.f23111c;
                        bVar2.f23111c = new w5(w5Var.f23562b, F.f23111c.f23563c, w5Var.i(), F.f23111c.f23566f);
                    } else if (TextUtils.isEmpty(bVar2.f23114f)) {
                        w5 w5Var2 = bVar2.f23111c;
                        bVar2.f23111c = new w5(w5Var2.f23562b, bVar2.f23112d, w5Var2.i(), bVar2.f23111c.f23566f);
                        bVar2.f23113e = true;
                        z10 = true;
                    }
                    if (bVar2.f23113e) {
                        w5 w5Var3 = bVar2.f23111c;
                        String str2 = bVar2.f23109a;
                        com.google.android.gms.common.internal.i.h(str2);
                        String str3 = bVar2.f23110b;
                        String str4 = w5Var3.f23562b;
                        long j10 = w5Var3.f23563c;
                        Object i10 = w5Var3.i();
                        com.google.android.gms.common.internal.i.h(i10);
                        y5 y5Var = new y5(str2, str3, str4, j10, i10);
                        j jVar3 = this.f23472c;
                        I(jVar3);
                        if (jVar3.u(y5Var)) {
                            d().f8804m.d("User property updated immediately", bVar2.f23109a, this.f23481l.f8849m.f(y5Var.f23624c), y5Var.f23626e);
                        } else {
                            d().f8797f.d("(2)Too many active user properties, ignoring", h.t(bVar2.f23109a), this.f23481l.f8849m.f(y5Var.f23624c), y5Var.f23626e);
                        }
                        if (z10 && (rVar = bVar2.f23117i) != null) {
                            u(new r(rVar, bVar2.f23112d), b6Var);
                        }
                    }
                    j jVar4 = this.f23472c;
                    I(jVar4);
                    if (jVar4.t(bVar2)) {
                        d().f8804m.d("Conditional property added", bVar2.f23109a, this.f23481l.f8849m.f(bVar2.f23111c.f23562b), bVar2.f23111c.i());
                    } else {
                        d().f8797f.d("Too many conditional properties, ignoring", h.t(bVar2.f23109a), this.f23481l.f8849m.f(bVar2.f23111c.f23562b), bVar2.f23111c.i());
                    }
                    j jVar5 = this.f23472c;
                    I(jVar5);
                    jVar5.n();
                } finally {
                    j jVar6 = this.f23472c;
                    I(jVar6);
                    jVar6.S();
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void r(String str, g gVar) {
        b().h();
        g();
        this.A.put(str, gVar);
        j jVar = this.f23472c;
        I(jVar);
        if (str != null) {
            jVar.h();
            jVar.i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("consent_state", gVar.e());
            try {
                if (jVar.C().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                    jVar.f8864a.d().f8797f.b("Failed to insert/update consent setting (got -1). appId", h.t(str));
                }
            } catch (SQLiteException e10) {
                jVar.f8864a.d().f8797f.c("Error storing consent setting. appId, error", h.t(str), e10);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void s(w5 w5Var, b6 b6Var) {
        long j10;
        b().h();
        g();
        if (E(b6Var)) {
            if (!b6Var.f23138h) {
                J(b6Var);
                return;
            }
            int k02 = Q().k0(w5Var.f23562b);
            if (k02 != 0) {
                r Q = Q();
                String str = w5Var.f23562b;
                K();
                String q10 = Q.q(str, 24, true);
                String str2 = w5Var.f23562b;
                Q().z(this.B, b6Var.f23131a, k02, "_ev", q10, str2 != null ? str2.length() : 0);
                return;
            }
            int g02 = Q().g0(w5Var.f23562b, w5Var.i());
            if (g02 != 0) {
                r Q2 = Q();
                String str3 = w5Var.f23562b;
                K();
                String q11 = Q2.q(str3, 24, true);
                Object i10 = w5Var.i();
                Q().z(this.B, b6Var.f23131a, g02, "_ev", q11, (i10 == null || (!(i10 instanceof String) && !(i10 instanceof CharSequence))) ? 0 : String.valueOf(i10).length());
                return;
            }
            Object p10 = Q().p(w5Var.f23562b, w5Var.i());
            if (p10 != null) {
                if ("_sid".equals(w5Var.f23562b)) {
                    long j11 = w5Var.f23563c;
                    String str4 = w5Var.f23566f;
                    String str5 = b6Var.f23131a;
                    com.google.android.gms.common.internal.i.h(str5);
                    String str6 = str5;
                    j jVar = this.f23472c;
                    I(jVar);
                    y5 J = jVar.J(str6, "_sno");
                    if (J != null) {
                        Object obj = J.f23626e;
                        if (obj instanceof Long) {
                            j10 = ((Long) obj).longValue();
                            s(new w5("_sno", j11, Long.valueOf(j10 + 1), str4), b6Var);
                        }
                    }
                    if (J != null) {
                        d().f8800i.b("Retrieved last session number from database does not contain a valid (long) value", J.f23626e);
                    }
                    j jVar2 = this.f23472c;
                    I(jVar2);
                    n I = jVar2.I(str6, "_s");
                    if (I != null) {
                        j10 = I.f23354c;
                        d().f8805n.b("Backfill the session number. Last used session number", Long.valueOf(j10));
                    } else {
                        j10 = 0;
                    }
                    s(new w5("_sno", j11, Long.valueOf(j10 + 1), str4), b6Var);
                }
                String str7 = b6Var.f23131a;
                com.google.android.gms.common.internal.i.h(str7);
                String str8 = w5Var.f23566f;
                com.google.android.gms.common.internal.i.h(str8);
                y5 y5Var = new y5(str7, str8, w5Var.f23562b, w5Var.f23563c, p10);
                d().f8805n.c("Setting user property", this.f23481l.f8849m.f(y5Var.f23624c), p10);
                j jVar3 = this.f23472c;
                I(jVar3);
                jVar3.Q();
                try {
                    y8.b();
                    if (this.f23481l.f8843g.v((String) null, v2.f23538t0) && "_id".equals(y5Var.f23624c)) {
                        j jVar4 = this.f23472c;
                        I(jVar4);
                        jVar4.m(b6Var.f23131a, "_lair");
                    }
                    J(b6Var);
                    j jVar5 = this.f23472c;
                    I(jVar5);
                    boolean u10 = jVar5.u(y5Var);
                    j jVar6 = this.f23472c;
                    I(jVar6);
                    jVar6.n();
                    if (!u10) {
                        d().f8797f.c("Too many unique user properties are set. Ignoring user property", this.f23481l.f8849m.f(y5Var.f23624c), y5Var.f23626e);
                        Q().z(this.B, b6Var.f23131a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    j jVar7 = this.f23472c;
                    I(jVar7);
                    jVar7.S();
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:197|198) */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0269, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        d().f8797f.c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.h.t(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        if (r11 != null) goto L_0x0121;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x0462 */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x028e A[SYNTHETIC, Splitter:B:140:0x028e] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0297 A[Catch:{ all -> 0x0127, all -> 0x0509 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0477 A[Catch:{ all -> 0x0127, all -> 0x0509 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04e5 A[Catch:{ all -> 0x0127, all -> 0x0509 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04ec A[Catch:{ all -> 0x0127, all -> 0x0509 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0505 A[SYNTHETIC, Splitter:B:237:0x0505] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b A[Catch:{ all -> 0x0127, all -> 0x0509 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x0121=Splitter:B:54:0x0121, B:223:0x04e1=Splitter:B:223:0x04e1, B:51:0x0112=Splitter:B:51:0x0112, B:128:0x0266=Splitter:B:128:0x0266, B:137:0x0277=Splitter:B:137:0x0277, B:188:0x03e9=Splitter:B:188:0x03e9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.k r0 = r22.b()
            r0.h()
            r22.g()
            r2 = 1
            r1.f23490u = r2
            r3 = 0
            com.google.android.gms.measurement.internal.l r0 = r1.f23481l     // Catch:{ all -> 0x0509 }
            r0.getClass()     // Catch:{ all -> 0x0509 }
            com.google.android.gms.measurement.internal.l r0 = r1.f23481l     // Catch:{ all -> 0x0509 }
            com.google.android.gms.measurement.internal.p r0 = r0.y()     // Catch:{ all -> 0x0509 }
            java.lang.Boolean r0 = r0.f8868e     // Catch:{ all -> 0x0509 }
            if (r0 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            o8.a3 r0 = r0.f8800i     // Catch:{ all -> 0x0509 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.a(r2)     // Catch:{ all -> 0x0509 }
            r1.f23490u = r3
            goto L_0x04fd
        L_0x002e:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0509 }
            if (r0 == 0) goto L_0x0043
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            o8.a3 r0 = r0.f8797f     // Catch:{ all -> 0x0509 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.a(r2)     // Catch:{ all -> 0x0509 }
            r1.f23490u = r3
            goto L_0x04fd
        L_0x0043:
            long r4 = r1.f23484o     // Catch:{ all -> 0x0509 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            r22.D()     // Catch:{ all -> 0x0509 }
            r1.f23490u = r3
            goto L_0x04fd
        L_0x0052:
            com.google.android.gms.measurement.internal.k r0 = r22.b()     // Catch:{ all -> 0x0509 }
            r0.h()     // Catch:{ all -> 0x0509 }
            java.util.List<java.lang.Long> r0 = r1.f23493x     // Catch:{ all -> 0x0509 }
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            o8.a3 r0 = r0.f8805n     // Catch:{ all -> 0x0509 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.a(r2)     // Catch:{ all -> 0x0509 }
            r1.f23490u = r3
            goto L_0x04fd
        L_0x006c:
            com.google.android.gms.measurement.internal.i r0 = r1.f23471b     // Catch:{ all -> 0x0509 }
            I(r0)     // Catch:{ all -> 0x0509 }
            boolean r0 = r0.m()     // Catch:{ all -> 0x0509 }
            if (r0 != 0) goto L_0x0089
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            o8.a3 r0 = r0.f8805n     // Catch:{ all -> 0x0509 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.a(r2)     // Catch:{ all -> 0x0509 }
            r22.D()     // Catch:{ all -> 0x0509 }
            r1.f23490u = r3
            goto L_0x04fd
        L_0x0089:
            z7.b r0 = r22.e()     // Catch:{ all -> 0x0509 }
            long r4 = r0.b()     // Catch:{ all -> 0x0509 }
            o8.f r0 = r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.Integer> r8 = o8.v2.Q     // Catch:{ all -> 0x0509 }
            r9 = 0
            int r0 = r0.o(r9, r8)     // Catch:{ all -> 0x0509 }
            r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.Long> r8 = o8.v2.f23505d     // Catch:{ all -> 0x0509 }
            java.lang.Object r8 = r8.a(r9)     // Catch:{ all -> 0x0509 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0509 }
            long r10 = r8.longValue()     // Catch:{ all -> 0x0509 }
            long r10 = r4 - r10
            r8 = 0
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.F(r9, r10)     // Catch:{ all -> 0x0509 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            o8.h5 r0 = r1.f23478i     // Catch:{ all -> 0x0509 }
            o8.h3 r0 = r0.f23248i     // Catch:{ all -> 0x0509 }
            long r10 = r0.a()     // Catch:{ all -> 0x0509 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            o8.a3 r0 = r0.f8804m     // Catch:{ all -> 0x0509 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0509 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0509 }
            r0.b(r6, r7)     // Catch:{ all -> 0x0509 }
        L_0x00da:
            o8.j r0 = r1.f23472c     // Catch:{ all -> 0x0509 }
            I(r0)     // Catch:{ all -> 0x0509 }
            java.lang.String r6 = r0.L()     // Catch:{ all -> 0x0509 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0509 }
            r7 = -1
            if (r0 != 0) goto L_0x047b
            long r10 = r1.f23495z     // Catch:{ all -> 0x0509 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x012f
            o8.j r10 = r1.f23472c     // Catch:{ all -> 0x0509 }
            I(r10)     // Catch:{ all -> 0x0509 }
            android.database.sqlite.SQLiteDatabase r0 = r10.C()     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0110, all -> 0x010e }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x010c }
            if (r0 != 0) goto L_0x0107
            goto L_0x0121
        L_0x0107:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x010c }
            goto L_0x0121
        L_0x010c:
            r0 = move-exception
            goto L_0x0112
        L_0x010e:
            r0 = move-exception
            goto L_0x0129
        L_0x0110:
            r0 = move-exception
            r11 = r9
        L_0x0112:
            com.google.android.gms.measurement.internal.l r10 = r10.f8864a     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.h r10 = r10.d()     // Catch:{ all -> 0x0127 }
            o8.a3 r10 = r10.f8797f     // Catch:{ all -> 0x0127 }
            java.lang.String r12 = "Error querying raw events"
            r10.b(r12, r0)     // Catch:{ all -> 0x0127 }
            if (r11 == 0) goto L_0x0124
        L_0x0121:
            r11.close()     // Catch:{ all -> 0x0509 }
        L_0x0124:
            r1.f23495z = r7     // Catch:{ all -> 0x0509 }
            goto L_0x012f
        L_0x0127:
            r0 = move-exception
            r9 = r11
        L_0x0129:
            if (r9 == 0) goto L_0x012e
            r9.close()     // Catch:{ all -> 0x0509 }
        L_0x012e:
            throw r0     // Catch:{ all -> 0x0509 }
        L_0x012f:
            o8.f r0 = r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.Integer> r7 = o8.v2.f23511g     // Catch:{ all -> 0x0509 }
            int r0 = r0.o(r6, r7)     // Catch:{ all -> 0x0509 }
            o8.f r7 = r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.Integer> r8 = o8.v2.f23513h     // Catch:{ all -> 0x0509 }
            int r7 = r7.o(r6, r8)     // Catch:{ all -> 0x0509 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0509 }
            o8.j r8 = r1.f23472c     // Catch:{ all -> 0x0509 }
            I(r8)     // Catch:{ all -> 0x0509 }
            r8.h()     // Catch:{ all -> 0x0509 }
            r8.i()     // Catch:{ all -> 0x0509 }
            if (r0 <= 0) goto L_0x0156
            r10 = 1
            goto L_0x0157
        L_0x0156:
            r10 = 0
        L_0x0157:
            com.google.android.gms.common.internal.i.a(r10)     // Catch:{ all -> 0x0509 }
            if (r7 <= 0) goto L_0x015e
            r10 = 1
            goto L_0x015f
        L_0x015e:
            r10 = 0
        L_0x015f:
            com.google.android.gms.common.internal.i.a(r10)     // Catch:{ all -> 0x0509 }
            com.google.android.gms.common.internal.i.e(r6)     // Catch:{ all -> 0x0509 }
            r10 = 2
            android.database.sqlite.SQLiteDatabase r11 = r8.C()     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            r12 = 3
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            java.lang.String r12 = "rowid"
            r13[r3] = r12     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            java.lang.String r12 = "data"
            r13[r2] = r12     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            java.lang.String r12 = "retry_count"
            r13[r10] = r12     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0273, all -> 0x026f }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026b }
            if (r0 != 0) goto L_0x01a0
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026b }
            r11.close()     // Catch:{ all -> 0x0509 }
            r20 = r4
            goto L_0x0291
        L_0x01a0:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026b }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026b }
            r13 = 0
        L_0x01a6:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026b }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0241 }
            o8.u5 r2 = r8.f23413b     // Catch:{ IOException -> 0x0241 }
            com.google.android.gms.measurement.internal.q r2 = r2.f23476g     // Catch:{ IOException -> 0x0241 }
            I(r2)     // Catch:{ IOException -> 0x0241 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022e }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022e }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022e }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022e }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022e }
            r3.<init>()     // Catch:{ IOException -> 0x022e }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022e }
            r20 = r4
        L_0x01ca:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022c }
            if (r4 > 0) goto L_0x0227
            r0.close()     // Catch:{ IOException -> 0x022c }
            r9.close()     // Catch:{ IOException -> 0x022c }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022c }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0225 }
            if (r2 != 0) goto L_0x01e6
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x0225 }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01e6
            goto L_0x0266
        L_0x01e6:
            k8.h3 r2 = k8.i3.z1()     // Catch:{ IOException -> 0x0212 }
            k8.f5 r2 = com.google.android.gms.measurement.internal.q.C(r2, r0)     // Catch:{ IOException -> 0x0212 }
            k8.h3 r2 = (k8.h3) r2     // Catch:{ IOException -> 0x0212 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x0225 }
            if (r4 != 0) goto L_0x01fe
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x0225 }
            r2.S(r4)     // Catch:{ SQLiteException -> 0x0225 }
        L_0x01fe:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0225 }
            int r13 = r13 + r0
            k8.k6 r0 = r2.f()     // Catch:{ SQLiteException -> 0x0225 }
            k8.i3 r0 = (k8.i3) r0     // Catch:{ SQLiteException -> 0x0225 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0225 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0225 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0225 }
            goto L_0x0255
        L_0x0212:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r8.f8864a     // Catch:{ SQLiteException -> 0x0225 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ SQLiteException -> 0x0225 }
            o8.a3 r2 = r2.f8797f     // Catch:{ SQLiteException -> 0x0225 }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ SQLiteException -> 0x0225 }
            r2.c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0225 }
            goto L_0x0255
        L_0x0225:
            r0 = move-exception
            goto L_0x0277
        L_0x0227:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022c }
            goto L_0x01ca
        L_0x022c:
            r0 = move-exception
            goto L_0x0231
        L_0x022e:
            r0 = move-exception
            r20 = r4
        L_0x0231:
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ IOException -> 0x023f }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ IOException -> 0x023f }
            o8.a3 r2 = r2.f8797f     // Catch:{ IOException -> 0x023f }
            java.lang.String r3 = "Failed to ungzip content"
            r2.b(r3, r0)     // Catch:{ IOException -> 0x023f }
            throw r0     // Catch:{ IOException -> 0x023f }
        L_0x023f:
            r0 = move-exception
            goto L_0x0244
        L_0x0241:
            r0 = move-exception
            r20 = r4
        L_0x0244:
            com.google.android.gms.measurement.internal.l r2 = r8.f8864a     // Catch:{ SQLiteException -> 0x0225 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ SQLiteException -> 0x0225 }
            o8.a3 r2 = r2.f8797f     // Catch:{ SQLiteException -> 0x0225 }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ SQLiteException -> 0x0225 }
            r2.c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0225 }
        L_0x0255:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0225 }
            if (r0 == 0) goto L_0x0266
            if (r13 <= r7) goto L_0x025e
            goto L_0x0266
        L_0x025e:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            r10 = 2
            goto L_0x01a6
        L_0x0266:
            r11.close()     // Catch:{ all -> 0x0509 }
            r0 = r12
            goto L_0x0291
        L_0x026b:
            r0 = move-exception
            r20 = r4
            goto L_0x0277
        L_0x026f:
            r0 = move-exception
            r9 = 0
            goto L_0x0475
        L_0x0273:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x0277:
            com.google.android.gms.measurement.internal.l r2 = r8.f8864a     // Catch:{ all -> 0x0473 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0473 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0473 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ all -> 0x0473 }
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x0473 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0473 }
            if (r11 == 0) goto L_0x0291
            r11.close()     // Catch:{ all -> 0x0509 }
        L_0x0291:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0509 }
            if (r2 != 0) goto L_0x04fa
            o8.g r2 = r1.L(r6)     // Catch:{ all -> 0x0509 }
            boolean r2 = r2.f()     // Catch:{ all -> 0x0509 }
            if (r2 == 0) goto L_0x02f6
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0509 }
        L_0x02a5:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0509 }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0509 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0509 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0509 }
            k8.i3 r3 = (k8.i3) r3     // Catch:{ all -> 0x0509 }
            java.lang.String r4 = r3.D()     // Catch:{ all -> 0x0509 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0509 }
            if (r4 != 0) goto L_0x02a5
            java.lang.String r2 = r3.D()     // Catch:{ all -> 0x0509 }
            goto L_0x02c5
        L_0x02c4:
            r2 = 0
        L_0x02c5:
            if (r2 == 0) goto L_0x02f6
            r3 = 0
        L_0x02c8:
            int r4 = r0.size()     // Catch:{ all -> 0x0509 }
            if (r3 >= r4) goto L_0x02f6
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0509 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0509 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0509 }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ all -> 0x0509 }
            java.lang.String r5 = r4.D()     // Catch:{ all -> 0x0509 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0509 }
            if (r5 == 0) goto L_0x02e3
            goto L_0x02f3
        L_0x02e3:
            java.lang.String r4 = r4.D()     // Catch:{ all -> 0x0509 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0509 }
            if (r4 != 0) goto L_0x02f3
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0509 }
            goto L_0x02f6
        L_0x02f3:
            int r3 = r3 + 1
            goto L_0x02c8
        L_0x02f6:
            k8.f3 r2 = k8.g3.s()     // Catch:{ all -> 0x0509 }
            int r3 = r0.size()     // Catch:{ all -> 0x0509 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0509 }
            int r5 = r0.size()     // Catch:{ all -> 0x0509 }
            r4.<init>(r5)     // Catch:{ all -> 0x0509 }
            o8.f r5 = r22.K()     // Catch:{ all -> 0x0509 }
            o8.e r5 = r5.f23191c     // Catch:{ all -> 0x0509 }
            java.lang.String r7 = "gaia_collection_enabled"
            java.lang.String r5 = r5.a(r6, r7)     // Catch:{ all -> 0x0509 }
            java.lang.String r7 = "1"
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0509 }
            if (r5 == 0) goto L_0x0327
            o8.g r5 = r1.L(r6)     // Catch:{ all -> 0x0509 }
            boolean r5 = r5.f()     // Catch:{ all -> 0x0509 }
            if (r5 == 0) goto L_0x0327
            r5 = 1
            goto L_0x0328
        L_0x0327:
            r5 = 0
        L_0x0328:
            o8.g r7 = r1.L(r6)     // Catch:{ all -> 0x0509 }
            boolean r7 = r7.f()     // Catch:{ all -> 0x0509 }
            o8.g r8 = r1.L(r6)     // Catch:{ all -> 0x0509 }
            boolean r8 = r8.g()     // Catch:{ all -> 0x0509 }
            r9 = 0
        L_0x0339:
            if (r9 >= r3) goto L_0x03ac
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x0509 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0509 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0509 }
            k8.i3 r10 = (k8.i3) r10     // Catch:{ all -> 0x0509 }
            k8.h6 r10 = r10.o()     // Catch:{ all -> 0x0509 }
            k8.h3 r10 = (k8.h3) r10     // Catch:{ all -> 0x0509 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x0509 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0509 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0509 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0509 }
            r4.add(r11)     // Catch:{ all -> 0x0509 }
            o8.f r11 = r22.K()     // Catch:{ all -> 0x0509 }
            r11.q()     // Catch:{ all -> 0x0509 }
            r10.X()     // Catch:{ all -> 0x0509 }
            r11 = r20
            r10.W(r11)     // Catch:{ all -> 0x0509 }
            com.google.android.gms.measurement.internal.l r13 = r1.f23481l     // Catch:{ all -> 0x0509 }
            r13.getClass()     // Catch:{ all -> 0x0509 }
            r13 = 0
            r10.T(r13)     // Catch:{ all -> 0x0509 }
            if (r5 != 0) goto L_0x0375
            r10.s0()     // Catch:{ all -> 0x0509 }
        L_0x0375:
            if (r7 != 0) goto L_0x037d
            r10.y0()     // Catch:{ all -> 0x0509 }
            r10.v0()     // Catch:{ all -> 0x0509 }
        L_0x037d:
            if (r8 != 0) goto L_0x0382
            r10.q0()     // Catch:{ all -> 0x0509 }
        L_0x0382:
            o8.f r13 = r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.Boolean> r14 = o8.v2.V     // Catch:{ all -> 0x0509 }
            boolean r13 = r13.v(r6, r14)     // Catch:{ all -> 0x0509 }
            if (r13 == 0) goto L_0x03a4
            k8.k6 r13 = r10.f()     // Catch:{ all -> 0x0509 }
            k8.i3 r13 = (k8.i3) r13     // Catch:{ all -> 0x0509 }
            byte[] r13 = r13.i()     // Catch:{ all -> 0x0509 }
            com.google.android.gms.measurement.internal.q r14 = r1.f23476g     // Catch:{ all -> 0x0509 }
            I(r14)     // Catch:{ all -> 0x0509 }
            long r13 = r14.x(r13)     // Catch:{ all -> 0x0509 }
            r10.t(r13)     // Catch:{ all -> 0x0509 }
        L_0x03a4:
            r2.m(r10)     // Catch:{ all -> 0x0509 }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x0339
        L_0x03ac:
            r11 = r20
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            java.lang.String r0 = r0.w()     // Catch:{ all -> 0x0509 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0509 }
            if (r0 == 0) goto L_0x03cd
            com.google.android.gms.measurement.internal.q r0 = r1.f23476g     // Catch:{ all -> 0x0509 }
            I(r0)     // Catch:{ all -> 0x0509 }
            k8.k6 r5 = r2.f()     // Catch:{ all -> 0x0509 }
            k8.g3 r5 = (k8.g3) r5     // Catch:{ all -> 0x0509 }
            java.lang.String r0 = r0.D(r5)     // Catch:{ all -> 0x0509 }
            goto L_0x03ce
        L_0x03cd:
            r0 = 0
        L_0x03ce:
            com.google.android.gms.measurement.internal.q r5 = r1.f23476g     // Catch:{ all -> 0x0509 }
            I(r5)     // Catch:{ all -> 0x0509 }
            k8.k6 r5 = r2.f()     // Catch:{ all -> 0x0509 }
            k8.g3 r5 = (k8.g3) r5     // Catch:{ all -> 0x0509 }
            byte[] r14 = r5.i()     // Catch:{ all -> 0x0509 }
            r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.String> r5 = o8.v2.f23531q     // Catch:{ all -> 0x0509 }
            r7 = 0
            java.lang.Object r5 = r5.a(r7)     // Catch:{ all -> 0x0509 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0509 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0462 }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x0462 }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x0462 }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.i.a(r7)     // Catch:{ MalformedURLException -> 0x0462 }
            java.util.List<java.lang.Long> r7 = r1.f23493x     // Catch:{ MalformedURLException -> 0x0462 }
            if (r7 == 0) goto L_0x0407
            com.google.android.gms.measurement.internal.h r4 = r22.d()     // Catch:{ MalformedURLException -> 0x0462 }
            o8.a3 r4 = r4.f8797f     // Catch:{ MalformedURLException -> 0x0462 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.a(r7)     // Catch:{ MalformedURLException -> 0x0462 }
            goto L_0x040e
        L_0x0407:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0462 }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x0462 }
            r1.f23493x = r7     // Catch:{ MalformedURLException -> 0x0462 }
        L_0x040e:
            o8.h5 r4 = r1.f23478i     // Catch:{ MalformedURLException -> 0x0462 }
            o8.h3 r4 = r4.f23249j     // Catch:{ MalformedURLException -> 0x0462 }
            r4.b(r11)     // Catch:{ MalformedURLException -> 0x0462 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x0421
            k8.i3 r2 = r2.n()     // Catch:{ MalformedURLException -> 0x0462 }
            java.lang.String r4 = r2.D1()     // Catch:{ MalformedURLException -> 0x0462 }
        L_0x0421:
            com.google.android.gms.measurement.internal.h r2 = r22.d()     // Catch:{ MalformedURLException -> 0x0462 }
            o8.a3 r2 = r2.f8805n     // Catch:{ MalformedURLException -> 0x0462 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x0462 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x0462 }
            r2.d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x0462 }
            r2 = 1
            r1.f23489t = r2     // Catch:{ MalformedURLException -> 0x0462 }
            com.google.android.gms.measurement.internal.i r11 = r1.f23471b     // Catch:{ MalformedURLException -> 0x0462 }
            I(r11)     // Catch:{ MalformedURLException -> 0x0462 }
            t1.c r0 = new t1.c     // Catch:{ MalformedURLException -> 0x0462 }
            r0.<init>((o8.u5) r1, (java.lang.String) r6)     // Catch:{ MalformedURLException -> 0x0462 }
            r11.h()     // Catch:{ MalformedURLException -> 0x0462 }
            r11.i()     // Catch:{ MalformedURLException -> 0x0462 }
            com.google.android.gms.common.internal.i.h(r13)     // Catch:{ MalformedURLException -> 0x0462 }
            com.google.android.gms.common.internal.i.h(r14)     // Catch:{ MalformedURLException -> 0x0462 }
            com.google.android.gms.common.internal.i.h(r0)     // Catch:{ MalformedURLException -> 0x0462 }
            com.google.android.gms.measurement.internal.l r2 = r11.f8864a     // Catch:{ MalformedURLException -> 0x0462 }
            com.google.android.gms.measurement.internal.k r2 = r2.b()     // Catch:{ MalformedURLException -> 0x0462 }
            o8.d3 r3 = new o8.d3     // Catch:{ MalformedURLException -> 0x0462 }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0462 }
            r2.q(r3)     // Catch:{ MalformedURLException -> 0x0462 }
            goto L_0x04fa
        L_0x0462:
            com.google.android.gms.measurement.internal.h r0 = r22.d()     // Catch:{ all -> 0x0509 }
            o8.a3 r0 = r0.f8797f     // Catch:{ all -> 0x0509 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ all -> 0x0509 }
            r0.c(r2, r3, r5)     // Catch:{ all -> 0x0509 }
            goto L_0x04fa
        L_0x0473:
            r0 = move-exception
            r9 = r11
        L_0x0475:
            if (r9 == 0) goto L_0x047a
            r9.close()     // Catch:{ all -> 0x0509 }
        L_0x047a:
            throw r0     // Catch:{ all -> 0x0509 }
        L_0x047b:
            r11 = r4
            r1.f23495z = r7     // Catch:{ all -> 0x0509 }
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0509 }
            I(r2)     // Catch:{ all -> 0x0509 }
            r22.K()     // Catch:{ all -> 0x0509 }
            o8.u2<java.lang.Long> r0 = o8.v2.f23505d     // Catch:{ all -> 0x0509 }
            r7 = 0
            java.lang.Object r0 = r0.a(r7)     // Catch:{ all -> 0x0509 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0509 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0509 }
            long r3 = r11 - r3
            r2.h()     // Catch:{ all -> 0x0509 }
            r2.i()     // Catch:{ all -> 0x0509 }
            android.database.sqlite.SQLiteDatabase r0 = r2.C()     // Catch:{ SQLiteException -> 0x04cf, all -> 0x04cc }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x04cf, all -> 0x04cc }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x04cf, all -> 0x04cc }
            r4 = 0
            r5[r4] = r3     // Catch:{ SQLiteException -> 0x04cf, all -> 0x04cc }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r3, r5)     // Catch:{ SQLiteException -> 0x04cf, all -> 0x04cc }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04c3 }
            if (r0 != 0) goto L_0x04c5
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a     // Catch:{ SQLiteException -> 0x04c3 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x04c3 }
            o8.a3 r0 = r0.f8805n     // Catch:{ SQLiteException -> 0x04c3 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.a(r4)     // Catch:{ SQLiteException -> 0x04c3 }
            goto L_0x04e0
        L_0x04c3:
            r0 = move-exception
            goto L_0x04d1
        L_0x04c5:
            r4 = 0
            java.lang.String r0 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04c3 }
            r9 = r0
            goto L_0x04e1
        L_0x04cc:
            r0 = move-exception
            r9 = r7
            goto L_0x0503
        L_0x04cf:
            r0 = move-exception
            r3 = r7
        L_0x04d1:
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x0501 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0501 }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x0501 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.b(r4, r0)     // Catch:{ all -> 0x0501 }
            if (r3 == 0) goto L_0x04e5
        L_0x04e0:
            r9 = r7
        L_0x04e1:
            r3.close()     // Catch:{ all -> 0x0509 }
            goto L_0x04e6
        L_0x04e5:
            r9 = r7
        L_0x04e6:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0509 }
            if (r0 != 0) goto L_0x04fa
            o8.j r0 = r1.f23472c     // Catch:{ all -> 0x0509 }
            I(r0)     // Catch:{ all -> 0x0509 }
            o8.x3 r0 = r0.E(r9)     // Catch:{ all -> 0x0509 }
            if (r0 == 0) goto L_0x04fa
            r1.h(r0)     // Catch:{ all -> 0x0509 }
        L_0x04fa:
            r2 = 0
            r1.f23490u = r2
        L_0x04fd:
            r22.A()
            return
        L_0x0501:
            r0 = move-exception
            r9 = r3
        L_0x0503:
            if (r9 == 0) goto L_0x0508
            r9.close()     // Catch:{ all -> 0x0509 }
        L_0x0508:
            throw r0     // Catch:{ all -> 0x0509 }
        L_0x0509:
            r0 = move-exception
            r2 = 0
            r1.f23490u = r2
            r22.A()
            goto L_0x0512
        L_0x0511:
            throw r0
        L_0x0512:
            goto L_0x0511
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.t():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x078c, code lost:
        if (r14.size() == 0) goto L_0x078e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03a4 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0530 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x056a A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x05e3 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x062d A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x063a A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0647 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0655 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0666 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0696 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06cf A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x06ee A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0709 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0791 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x07ad A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x081b A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0828 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0844 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08d9 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08f5 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x098f A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0a33 A[Catch:{ SQLiteException -> 0x0a4e }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0a49  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x099c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018f A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0210 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ee A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0336 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0339 A[Catch:{ SQLiteException -> 0x02b3, all -> 0x0ad3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(o8.r r35, o8.b6 r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r36
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.i.h(r36)
            java.lang.String r8 = r3.f23131a
            com.google.android.gms.common.internal.i.e(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.k r10 = r34.b()
            r10.h()
            r34.g()
            java.lang.String r10 = r3.f23131a
            com.google.android.gms.measurement.internal.q r11 = r1.f23476g
            I(r11)
            boolean r11 = com.google.android.gms.measurement.internal.q.m(r35, r36)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f23138h
            if (r11 == 0) goto L_0x0ade
            o8.q3 r11 = r1.f23470a
            I(r11)
            java.lang.String r12 = r2.f23414a
            boolean r11 = r11.r(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.h r3 = r34.d()
            o8.a3 r3 = r3.r()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r10)
            com.google.android.gms.measurement.internal.l r5 = r1.f23481l
            o8.x2 r5 = r5.s()
            java.lang.String r6 = r2.f23414a
            java.lang.String r5 = r5.d(r6)
            java.lang.String r6 = "Dropping blocked event. appId"
            r3.c(r6, r4, r5)
            o8.q3 r3 = r1.f23470a
            I(r3)
            boolean r3 = r3.p(r10)
            if (r3 != 0) goto L_0x0097
            o8.q3 r3 = r1.f23470a
            I(r3)
            boolean r3 = r3.s(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x0097
        L_0x007a:
            java.lang.String r3 = r2.f23414a
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00de
            com.google.android.gms.measurement.internal.r r11 = r34.Q()
            o8.z5 r12 = r1.B
            r14 = 11
            java.lang.String r2 = r2.f23414a
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.z(r12, r13, r14, r15, r16, r17)
            return
        L_0x0097:
            o8.j r2 = r1.f23472c
            I(r2)
            o8.x3 r2 = r2.E(r10)
            if (r2 == 0) goto L_0x00de
            long r3 = r2.F()
            long r5 = r2.C()
            long r3 = java.lang.Math.max(r3, r5)
            z7.b r5 = r34.e()
            long r5 = r5.b()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r34.K()
            o8.u2<java.lang.Long> r5 = o8.v2.f23547z
            java.lang.Object r5 = r5.a(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            com.google.android.gms.measurement.internal.h r3 = r34.d()
            o8.a3 r3 = r3.o()
            java.lang.String r4 = "Fetching config for blocked app"
            r3.a(r4)
            r1.h(r2)
        L_0x00de:
            return
        L_0x00df:
            androidx.leanback.widget.t r2 = androidx.leanback.widget.t.g(r35)
            com.google.android.gms.measurement.internal.r r11 = r34.Q()
            o8.f r12 = r34.K()
            int r12 = r12.n(r10)
            r11.y(r2, r12)
            o8.r r2 = r2.f()
            com.google.android.gms.measurement.internal.h r11 = r34.d()
            java.lang.String r11 = r11.w()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.h r11 = r34.d()
            o8.a3 r11 = r11.q()
            com.google.android.gms.measurement.internal.l r12 = r1.f23481l
            o8.x2 r12 = r12.s()
            java.lang.String r12 = r12.c(r2)
            java.lang.String r13 = "Logging event"
            r11.b(r13, r12)
        L_0x011c:
            o8.j r11 = r1.f23472c
            I(r11)
            r11.Q()
            r1.J(r3)     // Catch:{ all -> 0x0ad3 }
            k8.y8.b()     // Catch:{ all -> 0x0ad3 }
            o8.f r11 = r34.K()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Boolean> r12 = o8.v2.f23538t0     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r11.v(r14, r12)     // Catch:{ all -> 0x0ad3 }
            if (r11 != 0) goto L_0x014e
            o8.f r11 = r34.K()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Boolean> r12 = o8.v2.f23540u0     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r11.v(r14, r12)     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x014e
            o8.j r11 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r11)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            java.lang.String r13 = "_lair"
            r11.m(r12, r13)     // Catch:{ all -> 0x0ad3 }
        L_0x014e:
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = "refund"
            r28 = 1
            if (r11 != 0) goto L_0x0171
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0ad3 }
            if (r11 != 0) goto L_0x0171
            java.lang.String r11 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r11 = 0
            goto L_0x0172
        L_0x0171:
            r11 = 1
        L_0x0172:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0ad3 }
            if (r13 != 0) goto L_0x0185
            if (r11 == 0) goto L_0x0180
            r11 = 1
            goto L_0x0185
        L_0x0180:
            r29 = r8
            r8 = r15
            goto L_0x0323
        L_0x0185:
            o8.p r13 = r2.f23415b     // Catch:{ all -> 0x0ad3 }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.x(r14)     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x01fe
            o8.p r11 = r2.f23415b     // Catch:{ all -> 0x0ad3 }
            java.lang.Double r11 = r11.j()     // Catch:{ all -> 0x0ad3 }
            double r18 = r11.doubleValue()     // Catch:{ all -> 0x0ad3 }
            r20 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r18 = r18 * r20
            r22 = 0
            int r11 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r11 != 0) goto L_0x01bc
            o8.p r11 = r2.f23415b     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r11 = r11.q()     // Catch:{ all -> 0x0ad3 }
            r22 = r15
            long r14 = r11.longValue()     // Catch:{ all -> 0x0ad3 }
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r14)
            double r18 = r14 * r20
            goto L_0x01be
        L_0x01bc:
            r22 = r15
        L_0x01be:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x01d8
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x01d8
            long r14 = java.lang.Math.round(r18)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x020a
            long r14 = -r14
            goto L_0x020a
        L_0x01d8:
            com.google.android.gms.measurement.internal.h r2 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r2 = r2.r()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.Double r5 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x0ad3 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            r2.n()     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            return
        L_0x01fe:
            r22 = r15
            o8.p r11 = r2.f23415b     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r11 = r11.q()     // Catch:{ all -> 0x0ad3 }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0ad3 }
        L_0x020a:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0ad3 }
            if (r11 != 0) goto L_0x031f
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0ad3 }
            if (r12 == 0) goto L_0x031f
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch:{ all -> 0x0ad3 }
            if (r13 == 0) goto L_0x022c
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0ad3 }
        L_0x022a:
            r13 = r11
            goto L_0x0232
        L_0x022c:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0ad3 }
            r11.<init>(r12)     // Catch:{ all -> 0x0ad3 }
            goto L_0x022a
        L_0x0232:
            o8.j r11 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r11)     // Catch:{ all -> 0x0ad3 }
            o8.y5 r11 = r11.J(r10, r13)     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x0277
            java.lang.Object r11 = r11.f23626e     // Catch:{ all -> 0x0ad3 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0ad3 }
            if (r12 != 0) goto L_0x0244
            goto L_0x0277
        L_0x0244:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0ad3 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0ad3 }
            o8.y5 r18 = new o8.y5     // Catch:{ all -> 0x0ad3 }
            r19 = r13
            java.lang.String r13 = r2.f23416c     // Catch:{ all -> 0x0ad3 }
            z7.b r20 = r34.e()     // Catch:{ all -> 0x0ad3 }
            long r20 = r20.b()     // Catch:{ all -> 0x0ad3 }
            long r11 = r11 + r14
            java.lang.Long r23 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0ad3 }
            r11 = r18
            r12 = r10
            r16 = r19
            r14 = 2
            r15 = 0
            r29 = r8
            r8 = 0
            r9 = 2
            r14 = r16
            r8 = r22
            r9 = 0
            r15 = r20
            r17 = r23
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0ad3 }
        L_0x0274:
            r9 = r18
            goto L_0x02e3
        L_0x0277:
            r29 = r8
            r16 = r13
            r8 = r22
            r9 = 0
            o8.j r11 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r11)     // Catch:{ all -> 0x0ad3 }
            o8.f r12 = r34.K()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Integer> r13 = o8.v2.E     // Catch:{ all -> 0x0ad3 }
            int r12 = r12.o(r10, r13)     // Catch:{ all -> 0x0ad3 }
            int r12 = r12 + -1
            com.google.android.gms.common.internal.i.e(r10)     // Catch:{ all -> 0x0ad3 }
            r11.h()     // Catch:{ all -> 0x0ad3 }
            r11.i()     // Catch:{ all -> 0x0ad3 }
            android.database.sqlite.SQLiteDatabase r13 = r11.C()     // Catch:{ SQLiteException -> 0x02b3 }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02b3 }
            r17 = 0
            r9[r17] = r10     // Catch:{ SQLiteException -> 0x02b3 }
            r9[r28] = r10     // Catch:{ SQLiteException -> 0x02b3 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x02b3 }
            r17 = 2
            r9[r17] = r12     // Catch:{ SQLiteException -> 0x02b3 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch:{ SQLiteException -> 0x02b3 }
            goto L_0x02c8
        L_0x02b3:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.measurement.internal.l r11 = r11.f8864a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.h r11 = r11.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r11 = r11.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            r11.c(r12, r13, r9)     // Catch:{ all -> 0x0ad3 }
        L_0x02c8:
            o8.y5 r18 = new o8.y5     // Catch:{ all -> 0x0ad3 }
            java.lang.String r13 = r2.f23416c     // Catch:{ all -> 0x0ad3 }
            z7.b r9 = r34.e()     // Catch:{ all -> 0x0ad3 }
            long r19 = r9.b()     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0ad3 }
            r11 = r18
            r12 = r10
            r14 = r16
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0274
        L_0x02e3:
            o8.j r11 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r11)     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r11.u(r9)     // Catch:{ all -> 0x0ad3 }
            if (r11 != 0) goto L_0x0323
            com.google.android.gms.measurement.internal.h r11 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r11 = r11.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r14 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            o8.x2 r14 = r14.s()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r15 = r9.f23624c     // Catch:{ all -> 0x0ad3 }
            java.lang.String r14 = r14.f(r15)     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r9 = r9.f23626e     // Catch:{ all -> 0x0ad3 }
            r11.d(r12, r13, r14, r9)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.r r11 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            o8.z5 r12 = r1.B     // Catch:{ all -> 0x0ad3 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0323
        L_0x031f:
            r29 = r8
            r8 = r22
        L_0x0323:
            java.lang.String r9 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r9 = com.google.android.gms.measurement.internal.r.V(r9)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r8 = r8.equals(r11)     // Catch:{ all -> 0x0ad3 }
            r34.Q()     // Catch:{ all -> 0x0ad3 }
            o8.p r11 = r2.f23415b     // Catch:{ all -> 0x0ad3 }
            if (r11 != 0) goto L_0x0339
            r16 = 0
            goto L_0x0360
        L_0x0339:
            android.os.Bundle r12 = r11.f23382a     // Catch:{ all -> 0x0ad3 }
            java.util.Set r12 = r12.keySet()     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0ad3 }
            r16 = 0
        L_0x0345:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r13 == 0) goto L_0x0360
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r13 = r11.s(r13)     // Catch:{ all -> 0x0ad3 }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0ad3 }
            if (r14 == 0) goto L_0x0345
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0ad3 }
            int r13 = r13.length     // Catch:{ all -> 0x0ad3 }
            long r13 = (long) r13     // Catch:{ all -> 0x0ad3 }
            long r16 = r16 + r13
            goto L_0x0345
        L_0x0360:
            r23 = 1
            long r16 = r16 + r23
            o8.j r11 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r11)     // Catch:{ all -> 0x0ad3 }
            long r12 = r34.x()     // Catch:{ all -> 0x0ad3 }
            r20 = 1
            r21 = 0
            r25 = 0
            r32 = r4
            r33 = r5
            r4 = 0
            r14 = r10
            r15 = r16
            r17 = r20
            r18 = r9
            r19 = r21
            r20 = r8
            r21 = r25
            o8.h r11 = r11.H(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0ad3 }
            long r12 = r11.f23231b     // Catch:{ all -> 0x0ad3 }
            r34.K()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Integer> r14 = o8.v2.f23519k     // Catch:{ all -> 0x0ad3 }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0ad3 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0ad3 }
            long r14 = (long) r14     // Catch:{ all -> 0x0ad3 }
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 <= 0) goto L_0x03d1
            long r12 = r12 % r14
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x03c0
            com.google.android.gms.measurement.internal.h r2 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            long r5 = r11.f23231b     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ad3 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0ad3 }
        L_0x03c0:
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            r2.n()     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            return
        L_0x03d1:
            if (r9 == 0) goto L_0x042e
            long r12 = r11.f23230a     // Catch:{ all -> 0x0ad3 }
            r34.K()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Integer> r14 = o8.v2.f23523m     // Catch:{ all -> 0x0ad3 }
            r15 = 0
            java.lang.Object r14 = r14.a(r15)     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0ad3 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0ad3 }
            long r14 = (long) r14     // Catch:{ all -> 0x0ad3 }
            long r12 = r12 - r14
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x042e
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x0409
            com.google.android.gms.measurement.internal.h r3 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r3 = r3.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            long r6 = r11.f23230a     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0ad3 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0ad3 }
        L_0x0409:
            com.google.android.gms.measurement.internal.r r11 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            o8.z5 r12 = r1.B     // Catch:{ all -> 0x0ad3 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            r2.n()     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            return
        L_0x042e:
            r12 = 1000000(0xf4240, float:1.401298E-39)
            if (r8 == 0) goto L_0x047e
            long r13 = r11.f23233d     // Catch:{ all -> 0x0ad3 }
            o8.f r8 = r34.K()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r15 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Integer> r4 = o8.v2.f23521l     // Catch:{ all -> 0x0ad3 }
            int r4 = r8.o(r15, r4)     // Catch:{ all -> 0x0ad3 }
            int r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0ad3 }
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch:{ all -> 0x0ad3 }
            long r4 = (long) r4     // Catch:{ all -> 0x0ad3 }
            long r13 = r13 - r4
            r4 = 0
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x047e
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x046d
            com.google.android.gms.measurement.internal.h r2 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            long r5 = r11.f23233d     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0ad3 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0ad3 }
        L_0x046d:
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            r2.n()     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            return
        L_0x047e:
            o8.p r4 = r2.f23415b     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r4 = r4.i()     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.r r5 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r8 = "_o"
            java.lang.String r11 = r2.f23416c     // Catch:{ all -> 0x0ad3 }
            r5.A(r4, r8, r11)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.r r5 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            boolean r5 = r5.R(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r8 = "_r"
            if (r5 == 0) goto L_0x04af
            com.google.android.gms.measurement.internal.r r5 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r13 = "_dbg"
            r5.A(r4, r13, r11)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.r r5 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            r5.A(r4, r8, r11)     // Catch:{ all -> 0x0ad3 }
        L_0x04af:
            java.lang.String r5 = "_s"
            java.lang.String r11 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x0ad3 }
            if (r5 == 0) goto L_0x04d5
            o8.j r5 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r5)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            o8.y5 r5 = r5.J(r11, r7)     // Catch:{ all -> 0x0ad3 }
            if (r5 == 0) goto L_0x04d5
            java.lang.Object r11 = r5.f23626e     // Catch:{ all -> 0x0ad3 }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x04d5
            com.google.android.gms.measurement.internal.r r11 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r5 = r5.f23626e     // Catch:{ all -> 0x0ad3 }
            r11.A(r4, r7, r5)     // Catch:{ all -> 0x0ad3 }
        L_0x04d5:
            o8.j r5 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r5)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.e(r10)     // Catch:{ all -> 0x0ad3 }
            r5.h()     // Catch:{ all -> 0x0ad3 }
            r5.i()     // Catch:{ all -> 0x0ad3 }
            android.database.sqlite.SQLiteDatabase r7 = r5.C()     // Catch:{ SQLiteException -> 0x0512 }
            com.google.android.gms.measurement.internal.l r11 = r5.f8864a     // Catch:{ SQLiteException -> 0x0512 }
            o8.f r11 = r11.o()     // Catch:{ SQLiteException -> 0x0512 }
            o8.u2<java.lang.Integer> r13 = o8.v2.f23529p     // Catch:{ SQLiteException -> 0x0512 }
            int r11 = r11.o(r10, r13)     // Catch:{ SQLiteException -> 0x0512 }
            int r11 = java.lang.Math.min(r12, r11)     // Catch:{ SQLiteException -> 0x0512 }
            r15 = 0
            int r11 = java.lang.Math.max(r15, r11)     // Catch:{ SQLiteException -> 0x050f }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x050f }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x050f }
            r12[r15] = r10     // Catch:{ SQLiteException -> 0x050f }
            r12[r28] = r11     // Catch:{ SQLiteException -> 0x050f }
            java.lang.String r11 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r5 = r7.delete(r6, r11, r12)     // Catch:{ SQLiteException -> 0x050f }
            long r11 = (long) r5
            goto L_0x052a
        L_0x050f:
            r0 = move-exception
        L_0x0510:
            r7 = r0
            goto L_0x0515
        L_0x0512:
            r0 = move-exception
            r15 = 0
            goto L_0x0510
        L_0x0515:
            com.google.android.gms.measurement.internal.l r5 = r5.f8864a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.h r5 = r5.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r5 = r5.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = "Error deleting over the limit events. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            r5.c(r11, r12, r7)     // Catch:{ all -> 0x0ad3 }
            r11 = 0
        L_0x052a:
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0545
            com.google.android.gms.measurement.internal.h r5 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r5 = r5.r()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0ad3 }
            r5.c(r7, r13, r11)     // Catch:{ all -> 0x0ad3 }
        L_0x0545:
            o8.m r5 = new o8.m     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r12 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            java.lang.String r13 = r2.f23416c     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r2.f23414a     // Catch:{ all -> 0x0ad3 }
            long r2 = r2.f23417d     // Catch:{ all -> 0x0ad3 }
            r18 = 0
            r11 = r5
            r14 = r10
            r31 = 0
            r15 = r7
            r16 = r2
            r20 = r4
            r11.<init>((com.google.android.gms.measurement.internal.l) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = r5.f23330b     // Catch:{ all -> 0x0ad3 }
            o8.n r2 = r2.I(r10, r3)     // Catch:{ all -> 0x0ad3 }
            if (r2 != 0) goto L_0x05e3
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            long r2 = r2.B(r10)     // Catch:{ all -> 0x0ad3 }
            o8.f r4 = r34.K()     // Catch:{ all -> 0x0ad3 }
            int r4 = r4.l(r10)     // Catch:{ all -> 0x0ad3 }
            long r11 = (long) r4     // Catch:{ all -> 0x0ad3 }
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x05c5
            if (r9 == 0) goto L_0x05c5
            com.google.android.gms.measurement.internal.h r2 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r10)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r6 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            o8.x2 r6 = r6.s()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r5 = r5.f23330b     // Catch:{ all -> 0x0ad3 }
            java.lang.String r5 = r6.d(r5)     // Catch:{ all -> 0x0ad3 }
            o8.f r6 = r34.K()     // Catch:{ all -> 0x0ad3 }
            int r6 = r6.l(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0ad3 }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.r r11 = r34.Q()     // Catch:{ all -> 0x0ad3 }
            o8.z5 r12 = r1.B     // Catch:{ all -> 0x0ad3 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.z(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            return
        L_0x05c5:
            o8.n r2 = new o8.n     // Catch:{ all -> 0x0ad3 }
            java.lang.String r13 = r5.f23330b     // Catch:{ all -> 0x0ad3 }
            long r3 = r5.f23332d     // Catch:{ all -> 0x0ad3 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r2
            r12 = r10
            r20 = r3
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0ad3 }
            goto L_0x05f1
        L_0x05e3:
            com.google.android.gms.measurement.internal.l r3 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            long r9 = r2.f23357f     // Catch:{ all -> 0x0ad3 }
            o8.m r5 = r5.a(r3, r9)     // Catch:{ all -> 0x0ad3 }
            long r3 = r5.f23332d     // Catch:{ all -> 0x0ad3 }
            o8.n r2 = r2.c(r3)     // Catch:{ all -> 0x0ad3 }
        L_0x05f1:
            o8.j r3 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r3)     // Catch:{ all -> 0x0ad3 }
            r3.p(r2)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.k r2 = r34.b()     // Catch:{ all -> 0x0ad3 }
            r2.h()     // Catch:{ all -> 0x0ad3 }
            r34.g()     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r5)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r36)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r2 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.e(r2)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r2 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            r3 = r36
            java.lang.String r4 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.a(r2)     // Catch:{ all -> 0x0ad3 }
            k8.h3 r2 = k8.i3.z1()     // Catch:{ all -> 0x0ad3 }
            r2.Q()     // Catch:{ all -> 0x0ad3 }
            r2.K()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x0632
            java.lang.String r4 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            r2.m(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x0632:
            java.lang.String r4 = r3.f23134d     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x063f
            java.lang.String r4 = r3.f23134d     // Catch:{ all -> 0x0ad3 }
            r2.o(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x063f:
            java.lang.String r4 = r3.f23133c     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x064c
            java.lang.String r4 = r3.f23133c     // Catch:{ all -> 0x0ad3 }
            r2.p(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x064c:
            long r9 = r3.f23140r     // Catch:{ all -> 0x0ad3 }
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0659
            int r4 = (int) r9     // Catch:{ all -> 0x0ad3 }
            r2.q(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x0659:
            long r9 = r3.f23135e     // Catch:{ all -> 0x0ad3 }
            r2.F(r9)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = r3.f23132b     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x066b
            java.lang.String r4 = r3.f23132b     // Catch:{ all -> 0x0ad3 }
            r2.E(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x066b:
            java.lang.String r4 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ all -> 0x0ad3 }
            o8.g r4 = r1.L(r4)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r3.D     // Catch:{ all -> 0x0ad3 }
            o8.g r7 = o8.g.b(r7)     // Catch:{ all -> 0x0ad3 }
            o8.g r4 = r4.c(r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = r4.e()     // Catch:{ all -> 0x0ad3 }
            r2.v(r4)     // Catch:{ all -> 0x0ad3 }
            k8.ra.b()     // Catch:{ all -> 0x0ad3 }
            o8.f r4 = r34.K()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Boolean> r9 = o8.v2.f23506d0     // Catch:{ all -> 0x0ad3 }
            boolean r4 = r4.v(r7, r9)     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x06cf
            java.lang.String r4 = r2.d0()     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x06ad
            java.lang.String r4 = r3.C     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x06ad
            java.lang.String r4 = r3.C     // Catch:{ all -> 0x0ad3 }
            r2.D(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x06ad:
            java.lang.String r4 = r2.d0()     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x06e6
            java.lang.String r4 = r2.c0()     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x06e6
            java.lang.String r4 = r3.f23147y     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x06e6
            java.lang.String r4 = r3.f23147y     // Catch:{ all -> 0x0ad3 }
            r2.C0(r4)     // Catch:{ all -> 0x0ad3 }
            goto L_0x06e6
        L_0x06cf:
            java.lang.String r4 = r2.d0()     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x06e6
            java.lang.String r4 = r3.f23147y     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x06e6
            java.lang.String r4 = r3.f23147y     // Catch:{ all -> 0x0ad3 }
            r2.C0(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x06e6:
            long r9 = r3.f23136f     // Catch:{ all -> 0x0ad3 }
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x06f1
            r2.w(r9)     // Catch:{ all -> 0x0ad3 }
        L_0x06f1:
            long r9 = r3.A     // Catch:{ all -> 0x0ad3 }
            r2.z(r9)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.q r4 = r1.f23476g     // Catch:{ all -> 0x0ad3 }
            I(r4)     // Catch:{ all -> 0x0ad3 }
            o8.u5 r7 = r4.f23413b     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r7 = r7.f23481l     // Catch:{ all -> 0x0ad3 }
            android.content.Context r7 = r7.c()     // Catch:{ all -> 0x0ad3 }
            java.util.Map r7 = o8.v2.b(r7)     // Catch:{ all -> 0x0ad3 }
            if (r7 == 0) goto L_0x078e
            int r9 = r7.size()     // Catch:{ all -> 0x0ad3 }
            if (r9 != 0) goto L_0x0711
            goto L_0x078e
        L_0x0711:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0ad3 }
            r14.<init>()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Integer> r9 = o8.v2.P     // Catch:{ all -> 0x0ad3 }
            r10 = 0
            java.lang.Object r9 = r9.a(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0ad3 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0ad3 }
            java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x072b:
            boolean r10 = r7.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r10 == 0) goto L_0x0788
            java.lang.Object r10 = r7.next()     // Catch:{ all -> 0x0ad3 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x0ad3 }
            if (r11 == 0) goto L_0x072b
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x0776 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0776 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0776 }
            if (r10 == 0) goto L_0x072b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0776 }
            r14.add(r10)     // Catch:{ NumberFormatException -> 0x0776 }
            int r10 = r14.size()     // Catch:{ NumberFormatException -> 0x0776 }
            if (r10 < r9) goto L_0x072b
            com.google.android.gms.measurement.internal.l r10 = r4.f8864a     // Catch:{ NumberFormatException -> 0x0776 }
            com.google.android.gms.measurement.internal.h r10 = r10.d()     // Catch:{ NumberFormatException -> 0x0776 }
            o8.a3 r10 = r10.r()     // Catch:{ NumberFormatException -> 0x0776 }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r14.size()     // Catch:{ NumberFormatException -> 0x0776 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x0776 }
            r10.b(r11, r12)     // Catch:{ NumberFormatException -> 0x0776 }
            goto L_0x0788
        L_0x0776:
            r0 = move-exception
            r10 = r0
            com.google.android.gms.measurement.internal.l r11 = r4.f8864a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.h r11 = r11.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r11 = r11.r()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.b(r12, r10)     // Catch:{ all -> 0x0ad3 }
            goto L_0x072b
        L_0x0788:
            int r4 = r14.size()     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x078f
        L_0x078e:
            r14 = 0
        L_0x078f:
            if (r14 == 0) goto L_0x0794
            r2.m0(r14)     // Catch:{ all -> 0x0ad3 }
        L_0x0794:
            java.lang.String r4 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ all -> 0x0ad3 }
            o8.g r4 = r1.L(r4)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r3.D     // Catch:{ all -> 0x0ad3 }
            o8.g r7 = o8.g.b(r7)     // Catch:{ all -> 0x0ad3 }
            o8.g r4 = r4.c(r7)     // Catch:{ all -> 0x0ad3 }
            boolean r7 = r4.f()     // Catch:{ all -> 0x0ad3 }
            if (r7 == 0) goto L_0x07d7
            o8.h5 r7 = r1.f23478i     // Catch:{ all -> 0x0ad3 }
            java.lang.String r9 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            android.util.Pair r7 = r7.m(r9, r4)     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r9 = r7.first     // Catch:{ all -> 0x0ad3 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0ad3 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0ad3 }
            if (r9 != 0) goto L_0x07d7
            boolean r9 = r3.f23145w     // Catch:{ all -> 0x0ad3 }
            if (r9 == 0) goto L_0x07d7
            java.lang.Object r9 = r7.first     // Catch:{ all -> 0x0ad3 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0ad3 }
            r2.R(r9)     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x0ad3 }
            if (r7 == 0) goto L_0x07d7
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0ad3 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0ad3 }
            r2.H(r7)     // Catch:{ all -> 0x0ad3 }
        L_0x07d7:
            com.google.android.gms.measurement.internal.l r7 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            o8.l r7 = r7.p()     // Catch:{ all -> 0x0ad3 }
            r7.k()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x0ad3 }
            r2.x(r7)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r7 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            o8.l r7 = r7.p()     // Catch:{ all -> 0x0ad3 }
            r7.k()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0ad3 }
            r2.I(r7)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r7 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            o8.l r7 = r7.p()     // Catch:{ all -> 0x0ad3 }
            long r9 = r7.p()     // Catch:{ all -> 0x0ad3 }
            int r7 = (int) r9     // Catch:{ all -> 0x0ad3 }
            r2.V(r7)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r7 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            o8.l r7 = r7.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r7.q()     // Catch:{ all -> 0x0ad3 }
            r2.Z(r7)     // Catch:{ all -> 0x0ad3 }
            o8.f r7 = r34.K()     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Boolean> r9 = o8.v2.f23524m0     // Catch:{ all -> 0x0ad3 }
            r10 = 0
            boolean r7 = r7.v(r10, r9)     // Catch:{ all -> 0x0ad3 }
            if (r7 != 0) goto L_0x0820
            long r10 = r3.f23142t     // Catch:{ all -> 0x0ad3 }
            r2.D0(r10)     // Catch:{ all -> 0x0ad3 }
        L_0x0820:
            com.google.android.gms.measurement.internal.l r7 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            boolean r7 = r7.g()     // Catch:{ all -> 0x0ad3 }
            if (r7 == 0) goto L_0x0837
            r2.b0()     // Catch:{ all -> 0x0ad3 }
            r7 = 0
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0ad3 }
            if (r10 == 0) goto L_0x0833
            goto L_0x0837
        L_0x0833:
            r2.y()     // Catch:{ all -> 0x0ad3 }
            throw r7     // Catch:{ all -> 0x0ad3 }
        L_0x0837:
            o8.j r7 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            o8.x3 r7 = r7.E(r10)     // Catch:{ all -> 0x0ad3 }
            if (r7 != 0) goto L_0x08b5
            o8.x3 r7 = new o8.x3     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.l r10 = r1.f23481l     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            r7.<init>(r10, r11)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r1.R(r4)     // Catch:{ all -> 0x0ad3 }
            r7.f(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r3.f23141s     // Catch:{ all -> 0x0ad3 }
            r7.n(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r3.f23132b     // Catch:{ all -> 0x0ad3 }
            r7.p(r10)     // Catch:{ all -> 0x0ad3 }
            boolean r10 = r4.f()     // Catch:{ all -> 0x0ad3 }
            if (r10 == 0) goto L_0x086f
            o8.h5 r10 = r1.f23478i     // Catch:{ all -> 0x0ad3 }
            java.lang.String r11 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r10.n(r11)     // Catch:{ all -> 0x0ad3 }
            r7.x(r10)     // Catch:{ all -> 0x0ad3 }
        L_0x086f:
            r10 = 0
            r7.u(r10)     // Catch:{ all -> 0x0ad3 }
            r7.v(r10)     // Catch:{ all -> 0x0ad3 }
            r7.t(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r3.f23133c     // Catch:{ all -> 0x0ad3 }
            r7.h(r10)     // Catch:{ all -> 0x0ad3 }
            long r10 = r3.f23140r     // Catch:{ all -> 0x0ad3 }
            r7.i(r10)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r10 = r3.f23134d     // Catch:{ all -> 0x0ad3 }
            r7.g(r10)     // Catch:{ all -> 0x0ad3 }
            long r10 = r3.f23135e     // Catch:{ all -> 0x0ad3 }
            r7.q(r10)     // Catch:{ all -> 0x0ad3 }
            long r10 = r3.f23136f     // Catch:{ all -> 0x0ad3 }
            r7.k(r10)     // Catch:{ all -> 0x0ad3 }
            boolean r10 = r3.f23138h     // Catch:{ all -> 0x0ad3 }
            r7.w(r10)     // Catch:{ all -> 0x0ad3 }
            o8.f r10 = r34.K()     // Catch:{ all -> 0x0ad3 }
            r11 = 0
            boolean r9 = r10.v(r11, r9)     // Catch:{ all -> 0x0ad3 }
            if (r9 != 0) goto L_0x08a8
            long r9 = r3.f23142t     // Catch:{ all -> 0x0ad3 }
            r7.e(r9)     // Catch:{ all -> 0x0ad3 }
        L_0x08a8:
            long r9 = r3.A     // Catch:{ all -> 0x0ad3 }
            r7.l(r9)     // Catch:{ all -> 0x0ad3 }
            o8.j r9 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r9)     // Catch:{ all -> 0x0ad3 }
            r9.o(r7)     // Catch:{ all -> 0x0ad3 }
        L_0x08b5:
            boolean r4 = r4.g()     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x08cf
            java.lang.String r4 = r7.N()     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x08cf
            java.lang.String r4 = r7.N()     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ all -> 0x0ad3 }
            r2.n(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x08cf:
            java.lang.String r4 = r7.Q()     // Catch:{ all -> 0x0ad3 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 != 0) goto L_0x08e3
            java.lang.String r4 = r7.Q()     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ all -> 0x0ad3 }
            r2.C(r4)     // Catch:{ all -> 0x0ad3 }
        L_0x08e3:
            o8.j r4 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r4)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = r3.f23131a     // Catch:{ all -> 0x0ad3 }
            java.util.List r3 = r4.O(r3)     // Catch:{ all -> 0x0ad3 }
            r13 = 0
        L_0x08ef:
            int r4 = r3.size()     // Catch:{ all -> 0x0ad3 }
            if (r13 >= r4) goto L_0x0925
            k8.q3 r4 = k8.r3.v()     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r7 = r3.get(r13)     // Catch:{ all -> 0x0ad3 }
            o8.y5 r7 = (o8.y5) r7     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r7.f23624c     // Catch:{ all -> 0x0ad3 }
            r4.n(r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r7 = r3.get(r13)     // Catch:{ all -> 0x0ad3 }
            o8.y5 r7 = (o8.y5) r7     // Catch:{ all -> 0x0ad3 }
            long r9 = r7.f23625d     // Catch:{ all -> 0x0ad3 }
            r4.o(r9)     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.q r7 = r1.f23476g     // Catch:{ all -> 0x0ad3 }
            I(r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r9 = r3.get(r13)     // Catch:{ all -> 0x0ad3 }
            o8.y5 r9 = (o8.y5) r9     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r9 = r9.f23626e     // Catch:{ all -> 0x0ad3 }
            r7.K(r4, r9)     // Catch:{ all -> 0x0ad3 }
            r2.o0(r4)     // Catch:{ all -> 0x0ad3 }
            int r13 = r13 + 1
            goto L_0x08ef
        L_0x0925:
            o8.j r3 = r1.f23472c     // Catch:{ IOException -> 0x0a87 }
            I(r3)     // Catch:{ IOException -> 0x0a87 }
            k8.k6 r4 = r2.f()     // Catch:{ IOException -> 0x0a87 }
            k8.i3 r4 = (k8.i3) r4     // Catch:{ IOException -> 0x0a87 }
            r3.h()     // Catch:{ IOException -> 0x0a87 }
            r3.i()     // Catch:{ IOException -> 0x0a87 }
            com.google.android.gms.common.internal.i.h(r4)     // Catch:{ IOException -> 0x0a87 }
            java.lang.String r7 = r4.D1()     // Catch:{ IOException -> 0x0a87 }
            com.google.android.gms.common.internal.i.e(r7)     // Catch:{ IOException -> 0x0a87 }
            byte[] r7 = r4.i()     // Catch:{ IOException -> 0x0a87 }
            o8.u5 r9 = r3.f23413b     // Catch:{ IOException -> 0x0a87 }
            com.google.android.gms.measurement.internal.q r9 = r9.f23476g     // Catch:{ IOException -> 0x0a87 }
            I(r9)     // Catch:{ IOException -> 0x0a87 }
            long r9 = r9.x(r7)     // Catch:{ IOException -> 0x0a87 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ IOException -> 0x0a87 }
            r11.<init>()     // Catch:{ IOException -> 0x0a87 }
            java.lang.String r12 = r4.D1()     // Catch:{ IOException -> 0x0a87 }
            r13 = r33
            r11.put(r13, r12)     // Catch:{ IOException -> 0x0a87 }
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x0a87 }
            r14 = r32
            r11.put(r14, r12)     // Catch:{ IOException -> 0x0a87 }
            java.lang.String r12 = "metadata"
            r11.put(r12, r7)     // Catch:{ IOException -> 0x0a87 }
            android.database.sqlite.SQLiteDatabase r7 = r3.C()     // Catch:{ SQLiteException -> 0x0a6b }
            java.lang.String r12 = "raw_events_metadata"
            r15 = 4
            r16 = r2
            r2 = 0
            r7.insertWithOnConflict(r12, r2, r11, r15)     // Catch:{ SQLiteException -> 0x0a69 }
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            o8.p r3 = r5.f23334f     // Catch:{ all -> 0x0ad3 }
            android.os.Bundle r3 = r3.f23382a     // Catch:{ all -> 0x0ad3 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x0ad3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0ad3 }
        L_0x0989:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x099c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0ad3 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0ad3 }
            if (r4 == 0) goto L_0x0989
            goto L_0x09d6
        L_0x099c:
            o8.q3 r3 = r1.f23470a     // Catch:{ all -> 0x0ad3 }
            I(r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r5.f23330b     // Catch:{ all -> 0x0ad3 }
            boolean r3 = r3.q(r4, r7)     // Catch:{ all -> 0x0ad3 }
            o8.j r15 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r15)     // Catch:{ all -> 0x0ad3 }
            long r16 = r34.x()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            r19 = 0
            r20 = 0
            r18 = r4
            o8.h r4 = r15.G(r16, r18, r19, r20)     // Catch:{ all -> 0x0ad3 }
            if (r3 == 0) goto L_0x09d4
            long r3 = r4.f23234e     // Catch:{ all -> 0x0ad3 }
            o8.f r7 = r34.K()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r8 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            o8.u2<java.lang.Integer> r11 = o8.v2.f23527o     // Catch:{ all -> 0x0ad3 }
            int r7 = r7.o(r8, r11)     // Catch:{ all -> 0x0ad3 }
            long r7 = (long) r7     // Catch:{ all -> 0x0ad3 }
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x09d4
            goto L_0x09d6
        L_0x09d4:
            r28 = 0
        L_0x09d6:
            r2.h()     // Catch:{ all -> 0x0ad3 }
            r2.i()     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.h(r5)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.common.internal.i.e(r3)     // Catch:{ all -> 0x0ad3 }
            o8.u5 r3 = r2.f23413b     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.q r3 = r3.f23476g     // Catch:{ all -> 0x0ad3 }
            I(r3)     // Catch:{ all -> 0x0ad3 }
            k8.y2 r3 = r3.B(r5)     // Catch:{ all -> 0x0ad3 }
            byte[] r3 = r3.i()     // Catch:{ all -> 0x0ad3 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0ad3 }
            r4.<init>()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            r4.put(r13, r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.f23330b     // Catch:{ all -> 0x0ad3 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = "timestamp"
            long r11 = r5.f23332d     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0ad3 }
            r4.put(r7, r8)     // Catch:{ all -> 0x0ad3 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0ad3 }
            r4.put(r14, r7)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r7 = "data"
            r4.put(r7, r3)     // Catch:{ all -> 0x0ad3 }
            java.lang.String r3 = "realtime"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0ad3 }
            r4.put(r3, r7)     // Catch:{ all -> 0x0ad3 }
            android.database.sqlite.SQLiteDatabase r3 = r2.C()     // Catch:{ SQLiteException -> 0x0a4e }
            r7 = 0
            long r3 = r3.insert(r6, r7, r4)     // Catch:{ SQLiteException -> 0x0a4e }
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0a49
            com.google.android.gms.measurement.internal.l r3 = r2.f8864a     // Catch:{ SQLiteException -> 0x0a4e }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ SQLiteException -> 0x0a4e }
            o8.a3 r3 = r3.p()     // Catch:{ SQLiteException -> 0x0a4e }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r6 = r5.f23329a     // Catch:{ SQLiteException -> 0x0a4e }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.h.t(r6)     // Catch:{ SQLiteException -> 0x0a4e }
            r3.b(r4, r6)     // Catch:{ SQLiteException -> 0x0a4e }
            goto L_0x0aa0
        L_0x0a49:
            r2 = 0
            r1.f23484o = r2     // Catch:{ all -> 0x0ad3 }
            goto L_0x0aa0
        L_0x0a4e:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x0ad3 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r5.f23329a     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r5)     // Catch:{ all -> 0x0ad3 }
            r2.c(r4, r5, r3)     // Catch:{ all -> 0x0ad3 }
            goto L_0x0aa0
        L_0x0a66:
            r0 = move-exception
        L_0x0a67:
            r2 = r0
            goto L_0x0a8b
        L_0x0a69:
            r0 = move-exception
            goto L_0x0a6e
        L_0x0a6b:
            r0 = move-exception
            r16 = r2
        L_0x0a6e:
            r2 = r0
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a     // Catch:{ IOException -> 0x0a66 }
            com.google.android.gms.measurement.internal.h r3 = r3.d()     // Catch:{ IOException -> 0x0a66 }
            o8.a3 r3 = r3.p()     // Catch:{ IOException -> 0x0a66 }
            java.lang.String r5 = "Error storing raw event metadata. appId"
            java.lang.String r4 = r4.D1()     // Catch:{ IOException -> 0x0a66 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.h.t(r4)     // Catch:{ IOException -> 0x0a66 }
            r3.c(r5, r4, r2)     // Catch:{ IOException -> 0x0a66 }
            throw r2     // Catch:{ IOException -> 0x0a66 }
        L_0x0a87:
            r0 = move-exception
            r16 = r2
            goto L_0x0a67
        L_0x0a8b:
            com.google.android.gms.measurement.internal.h r3 = r34.d()     // Catch:{ all -> 0x0ad3 }
            o8.a3 r3 = r3.p()     // Catch:{ all -> 0x0ad3 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r16.b0()     // Catch:{ all -> 0x0ad3 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r5)     // Catch:{ all -> 0x0ad3 }
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x0ad3 }
        L_0x0aa0:
            o8.j r2 = r1.f23472c     // Catch:{ all -> 0x0ad3 }
            I(r2)     // Catch:{ all -> 0x0ad3 }
            r2.n()     // Catch:{ all -> 0x0ad3 }
            o8.j r2 = r1.f23472c
            I(r2)
            r2.S()
            r34.D()
            com.google.android.gms.measurement.internal.h r2 = r34.d()
            o8.a3 r2 = r2.q()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0ad3:
            r0 = move-exception
            r2 = r0
            o8.j r3 = r1.f23472c
            I(r3)
            r3.S()
            throw r2
        L_0x0ade:
            r1.J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u5.u(o8.r, o8.b6):void");
    }

    public final long x() {
        long b10 = e().b();
        h5 h5Var = this.f23478i;
        h5Var.i();
        h5Var.h();
        long a10 = h5Var.f23250k.a();
        if (a10 == 0) {
            a10 = ((long) h5Var.f8864a.A().s().nextInt(86400000)) + 1;
            h5Var.f23250k.b(a10);
        }
        return ((((b10 + a10) / 1000) / 60) / 60) / 24;
    }

    public final b6 y(String str) {
        String str2 = str;
        j jVar = this.f23472c;
        I(jVar);
        x3 E = jVar.E(str2);
        if (E == null || TextUtils.isEmpty(E.P())) {
            d().f8804m.b("No app data available; dropping", str2);
            return null;
        }
        Boolean z10 = z(E);
        if (z10 == null || z10.booleanValue()) {
            String S = E.S();
            String P = E.P();
            long B2 = E.B();
            String O = E.O();
            long G = E.G();
            long D = E.D();
            boolean A2 = E.A();
            String Q = E.Q();
            long r10 = E.r();
            boolean z11 = E.z();
            String K = E.K();
            E.f23575a.b().h();
            Boolean bool = E.f23593s;
            long E2 = E.E();
            List<String> a10 = E.a();
            ra.b();
            return new b6(str, S, P, B2, O, G, D, (String) null, A2, false, Q, r10, 0, 0, z11, false, K, bool, E2, a10, K().v(str2, v2.f23506d0) ? E.R() : null, L(str).e());
        }
        d().f8797f.b("App version does not match; dropping. appId", h.t(str));
        return null;
    }

    public final Boolean z(x3 x3Var) {
        try {
            if (x3Var.B() != -2147483648L) {
                if (x3Var.B() == ((long) c.a(this.f23481l.f8837a).b(x3Var.M(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = c.a(this.f23481l.f8837a).b(x3Var.M(), 0).versionName;
                String P = x3Var.P();
                if (P != null && P.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
