package r7;

import android.os.Bundle;
import android.view.Surface;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.f2;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l8;
import com.google.android.gms.internal.ads.lh;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.x1;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.p;
import e8.co;
import e8.dv;
import e8.e30;
import e8.gf0;
import e8.hf;
import e8.jc;
import e8.oa;
import e8.qh;
import e8.sq;
import e8.tn;
import e8.ug;
import e8.xt;
import e8.yc0;
import e8.yq;
import e8.zh0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o8.b;
import o8.g5;
import o8.i4;
import o8.r;
import o8.s4;
import o8.w5;
import org.json.JSONObject;
import q.e;
import s8.g;
import s8.h;
import s8.k;
import s8.q;
import s8.t;
import t1.c;
import u7.z;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24719a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f24720b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f24721c;

    public m(f2 f2Var, String str) {
        this.f24720b = f2Var;
        this.f24721c = str;
    }

    private final void a() {
        s4 s4Var = (s4) this.f24721c;
        Bundle bundle = (Bundle) this.f24720b;
        s4Var.h();
        s4Var.i();
        i.h(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        i.e(string);
        i.e(string2);
        i.h(bundle.get("value"));
        if (!s4Var.f8864a.g()) {
            s4Var.f8864a.d().f8805n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        w5 w5Var = new w5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            r s02 = s4Var.f8864a.A().s0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            r s03 = s4Var.f8864a.A().s0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            r s04 = s4Var.f8864a.A().s0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            s4Var.f8864a.y().m(new b(bundle.getString("app_id"), string2, w5Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), s03, bundle.getLong("trigger_timeout"), s02, bundle.getLong("time_to_live"), s04));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void b() {
        synchronized (((g5) this.f24721c)) {
            ((g5) this.f24721c).f23221a = false;
            if (!((g5) this.f24721c).f23223c.n()) {
                ((g5) this.f24721c).f23223c.f8864a.d().f8804m.a("Connected to remote service");
                p pVar = ((g5) this.f24721c).f23223c;
                d dVar = (d) this.f24720b;
                pVar.h();
                if (dVar != null) {
                    pVar.f8867d = dVar;
                    pVar.s();
                    pVar.r();
                } else {
                    throw new NullPointerException("null reference");
                }
            }
        }
    }

    private final void c() {
        synchronized (((t) this.f24721c).f25059b) {
            s8.d<TResult> dVar = ((t) this.f24721c).f25060c;
            if (dVar != null) {
                dVar.s((s8.i) this.f24720b);
            }
        }
    }

    private final void d() {
        try {
            s8.i f10 = ((h) ((q) this.f24721c).f25050c).f(((s8.i) this.f24720b).h());
            if (f10 == null) {
                ((q) this.f24721c).d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.f25037b;
            f10.d(executor, (q) this.f24721c);
            f10.c(executor, (q) this.f24721c);
            f10.a(executor, (q) this.f24721c);
        } catch (g e10) {
            if (e10.getCause() instanceof Exception) {
                ((q) this.f24721c).d((Exception) e10.getCause());
            } else {
                ((q) this.f24721c).d(e10);
            }
        } catch (CancellationException unused) {
            q qVar = (q) this.f24721c;
            switch (qVar.f25048a) {
                case 1:
                    qVar.f25051d.q();
                    return;
                default:
                    qVar.f25051d.q();
                    return;
            }
        } catch (Exception e11) {
            ((q) this.f24721c).d(e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x042a, code lost:
        if (android.text.TextUtils.isEmpty(r2.f8789l) == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d9, code lost:
        if (android.text.TextUtils.isEmpty(r2.f8789l) == false) goto L_0x02db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.f24719a
            r2 = 3
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0aa1;
                case 1: goto L_0x0a1a;
                case 2: goto L_0x0a0c;
                case 3: goto L_0x09f8;
                case 4: goto L_0x09d6;
                case 5: goto L_0x0887;
                case 6: goto L_0x0877;
                case 7: goto L_0x0857;
                case 8: goto L_0x069c;
                case 9: goto L_0x068e;
                case 10: goto L_0x0674;
                case 11: goto L_0x0531;
                case 12: goto L_0x0513;
                case 13: goto L_0x0501;
                case 14: goto L_0x04ef;
                case 15: goto L_0x04dd;
                case 16: goto L_0x04cf;
                case 17: goto L_0x04c3;
                case 18: goto L_0x04b3;
                case 19: goto L_0x04a3;
                case 20: goto L_0x002d;
                case 21: goto L_0x0029;
                case 22: goto L_0x0025;
                case 23: goto L_0x0013;
                case 24: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            r20.d()
            return
        L_0x000f:
            r20.c()
            return
        L_0x0013:
            java.lang.Object r0 = r1.f24721c
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8778a
            o8.s4 r0 = r0.v()
            java.lang.Object r2 = r1.f24720b
            t1.c r2 = (t1.c) r2
            r0.x(r2)
            return
        L_0x0025:
            r20.b()
            return
        L_0x0029:
            r20.a()
            return
        L_0x002d:
            java.lang.Object r0 = r1.f24721c
            com.google.android.gms.measurement.internal.l r0 = (com.google.android.gms.measurement.internal.l) r0
            java.lang.Object r2 = r1.f24720b
            o8.i4 r2 = (o8.i4) r2
            com.google.android.gms.measurement.internal.k r6 = r0.b()
            r6.h()
            o8.f r6 = r0.f8843g
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            r6.getClass()
            o8.l r6 = new o8.l
            r6.<init>(r0)
            r6.l()
            r0.f8858v = r6
            com.google.android.gms.measurement.internal.e r6 = new com.google.android.gms.measurement.internal.e
            long r7 = r2.f23267f
            r6.<init>(r0, r7)
            r6.j()
            r0.f8859w = r6
            com.google.android.gms.measurement.internal.g r2 = new com.google.android.gms.measurement.internal.g
            r2.<init>(r0)
            r2.j()
            r0.f8856t = r2
            com.google.android.gms.measurement.internal.p r2 = new com.google.android.gms.measurement.internal.p
            r2.<init>(r0)
            r2.j()
            r0.f8857u = r2
            com.google.android.gms.measurement.internal.r r2 = r0.f8848l
            r2.m()
            com.google.android.gms.measurement.internal.j r2 = r0.f8844h
            r2.m()
            com.google.android.gms.measurement.internal.e r2 = r0.f8859w
            boolean r7 = r2.f23305b
            if (r7 != 0) goto L_0x049b
            r2.l()
            com.google.android.gms.measurement.internal.l r7 = r2.f8864a
            java.util.concurrent.atomic.AtomicInteger r7 = r7.F
            r7.incrementAndGet()
            r2.f23305b = r3
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8803l
            o8.f r7 = r0.f8843g
            r7.q()
            r7 = 43042(0xa822, double:2.12656E-319)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "App measurement initialized, version"
            r2.b(r8, r7)
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8803l
            java.lang.String r7 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r2.a(r7)
            java.lang.String r2 = r6.m()
            java.lang.String r6 = r0.f8838b
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.r r6 = r0.A()
            boolean r6 = r6.R(r2)
            if (r6 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8803l
            java.lang.String r6 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r2.a(r6)
            goto L_0x00ec
        L_0x00cd:
            com.google.android.gms.measurement.internal.h r6 = r0.d()
            o8.a3 r6 = r6.f8803l
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r7 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            int r8 = r2.length()
            if (r8 == 0) goto L_0x00e4
            java.lang.String r2 = r7.concat(r2)
            goto L_0x00e9
        L_0x00e4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
        L_0x00e9:
            r6.a(r2)
        L_0x00ec:
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8804m
            java.lang.String r6 = "Debug-level message logging enabled"
            r2.a(r6)
            int r2 = r0.E
            java.util.concurrent.atomic.AtomicInteger r6 = r0.F
            int r6 = r6.get()
            if (r2 == r6) goto L_0x011c
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8797f
            int r6 = r0.E
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.concurrent.atomic.AtomicInteger r7 = r0.F
            int r7 = r7.get()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Not all components initialized"
            r2.c(r8, r6, r7)
        L_0x011c:
            r0.f8860x = r3
            java.lang.Object r0 = r1.f24721c
            com.google.android.gms.measurement.internal.l r0 = (com.google.android.gms.measurement.internal.l) r0
            java.lang.Object r2 = r1.f24720b
            o8.i4 r2 = (o8.i4) r2
            k8.a1 r2 = r2.f23268g
            com.google.android.gms.measurement.internal.k r6 = r0.b()
            r6.h()
            com.google.android.gms.measurement.internal.j r6 = r0.t()
            o8.g r6 = r6.p()
            com.google.android.gms.measurement.internal.j r7 = r0.t()
            com.google.android.gms.measurement.internal.l r8 = r7.f8864a
            r7.h()
            android.content.SharedPreferences r7 = r7.o()
            r8 = 100
            java.lang.String r9 = "consent_source"
            int r7 = r7.getInt(r9, r8)
            o8.f r9 = r0.f8843g
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            java.lang.String r10 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r9 = r9.t(r10)
            o8.f r10 = r0.f8843g
            com.google.android.gms.measurement.internal.l r11 = r10.f8864a
            java.lang.String r11 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r10 = r10.t(r11)
            r11 = 30
            r12 = -10
            if (r9 != 0) goto L_0x0168
            if (r10 == 0) goto L_0x017a
        L_0x0168:
            com.google.android.gms.measurement.internal.j r13 = r0.t()
            boolean r13 = r13.u(r12)
            if (r13 == 0) goto L_0x017a
            o8.g r2 = new o8.g
            r2.<init>(r9, r10)
            r8 = -10
            goto L_0x01e1
        L_0x017a:
            com.google.android.gms.measurement.internal.e r9 = r0.q()
            java.lang.String r9 = r9.n()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x01a4
            if (r7 == 0) goto L_0x0198
            if (r7 == r11) goto L_0x0198
            r9 = 10
            if (r7 == r9) goto L_0x0198
            if (r7 == r11) goto L_0x0198
            if (r7 == r11) goto L_0x0198
            r9 = 40
            if (r7 != r9) goto L_0x01a4
        L_0x0198:
            o8.s4 r2 = r0.v()
            o8.g r7 = o8.g.f23209c
            long r9 = r0.G
            r2.w(r7, r12, r9)
            goto L_0x01e0
        L_0x01a4:
            k8.ca.b()
            o8.f r7 = r0.f8843g
            o8.u2<java.lang.Boolean> r9 = o8.v2.f23532q0
            boolean r7 = r7.v(r5, r9)
            if (r7 == 0) goto L_0x01bf
            com.google.android.gms.measurement.internal.e r7 = r0.q()
            java.lang.String r7 = r7.n()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x01e0
        L_0x01bf:
            if (r2 == 0) goto L_0x01e0
            android.os.Bundle r7 = r2.f20059g
            if (r7 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.j r7 = r0.t()
            boolean r7 = r7.u(r11)
            if (r7 == 0) goto L_0x01e0
            android.os.Bundle r2 = r2.f20059g
            o8.g r2 = o8.g.a(r2)
            o8.g r7 = o8.g.f23209c
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x01e0
            r8 = 30
            goto L_0x01e1
        L_0x01e0:
            r2 = r5
        L_0x01e1:
            if (r2 == 0) goto L_0x01ed
            o8.s4 r6 = r0.v()
            long r9 = r0.G
            r6.w(r2, r8, r9)
            r6 = r2
        L_0x01ed:
            o8.s4 r2 = r0.v()
            r2.y(r6)
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.h3 r2 = r2.f8810e
            long r6 = r2.a()
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0220
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8805n
            long r6 = r0.G
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = "Persisting first open"
            r2.b(r7, r6)
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.h3 r2 = r2.f8810e
            long r6 = r0.G
            r2.b(r6)
        L_0x0220:
            o8.s4 r2 = r0.v()
            o8.d6 r2 = r2.f23439n
            boolean r6 = r2.b()
            if (r6 == 0) goto L_0x023d
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x023d
            com.google.android.gms.measurement.internal.l r2 = r2.f23169a
            com.google.android.gms.measurement.internal.j r2 = r2.t()
            o8.j3 r2 = r2.f8825t
            r2.b(r5)
        L_0x023d:
            boolean r2 = r0.i()
            if (r2 != 0) goto L_0x02be
            boolean r2 = r0.g()
            if (r2 == 0) goto L_0x0491
            com.google.android.gms.measurement.internal.r r2 = r0.A()
            java.lang.String r4 = "android.permission.INTERNET"
            boolean r2 = r2.Q(r4)
            if (r2 != 0) goto L_0x0260
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = "App is missing INTERNET permission"
            r2.a(r4)
        L_0x0260:
            com.google.android.gms.measurement.internal.r r2 = r0.A()
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = r2.Q(r4)
            if (r2 != 0) goto L_0x0277
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = "App is missing ACCESS_NETWORK_STATE permission"
            r2.a(r4)
        L_0x0277:
            android.content.Context r2 = r0.f8837a
            b8.b r2 = b8.c.a(r2)
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x02b1
            o8.f r2 = r0.f8843g
            boolean r2 = r2.z()
            if (r2 != 0) goto L_0x02b1
            android.content.Context r2 = r0.f8837a
            boolean r2 = com.google.android.gms.measurement.internal.r.W(r2)
            if (r2 != 0) goto L_0x029e
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = "AppMeasurementReceiver not registered/enabled"
            r2.a(r4)
        L_0x029e:
            android.content.Context r2 = r0.f8837a
            boolean r2 = com.google.android.gms.measurement.internal.r.X(r2)
            if (r2 != 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = "AppMeasurementService not registered/enabled"
            r2.a(r4)
        L_0x02b1:
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r4 = "Uploading is not possible. App measurement disabled"
            r2.a(r4)
            goto L_0x0491
        L_0x02be:
            com.google.android.gms.measurement.internal.e r2 = r0.q()
            java.lang.String r2 = r2.n()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x02db
            com.google.android.gms.measurement.internal.e r2 = r0.q()
            r2.i()
            java.lang.String r2 = r2.f8789l
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03a1
        L_0x02db:
            com.google.android.gms.measurement.internal.r r2 = r0.A()
            com.google.android.gms.measurement.internal.e r6 = r0.q()
            java.lang.String r6 = r6.n()
            com.google.android.gms.measurement.internal.j r7 = r0.t()
            r7.h()
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = "gmp_app_id"
            java.lang.String r7 = r7.getString(r8, r5)
            com.google.android.gms.measurement.internal.e r9 = r0.q()
            r9.i()
            java.lang.String r9 = r9.f8789l
            com.google.android.gms.measurement.internal.j r10 = r0.t()
            r10.h()
            android.content.SharedPreferences r10 = r10.o()
            java.lang.String r11 = "admob_app_id"
            java.lang.String r10 = r10.getString(r11, r5)
            boolean r2 = r2.Z(r6, r7, r9, r10)
            if (r2 == 0) goto L_0x0366
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8803l
            java.lang.String r6 = "Rechecking which service to use due to a GMP App Id change"
            r2.a(r6)
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            r2.h()
            java.lang.Boolean r6 = r2.q()
            android.content.SharedPreferences r7 = r2.o()
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r7.clear()
            r7.apply()
            if (r6 == 0) goto L_0x0341
            r2.r(r6)
        L_0x0341:
            com.google.android.gms.measurement.internal.g r2 = r0.r()
            r2.m()
            com.google.android.gms.measurement.internal.p r2 = r0.f8857u
            r2.x()
            com.google.android.gms.measurement.internal.p r2 = r0.f8857u
            r2.w()
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.h3 r2 = r2.f8810e
            long r6 = r0.G
            r2.b(r6)
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.j3 r2 = r2.f8811f
            r2.b(r5)
        L_0x0366:
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            com.google.android.gms.measurement.internal.e r6 = r0.q()
            java.lang.String r6 = r6.n()
            r2.h()
            android.content.SharedPreferences r2 = r2.o()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r8, r6)
            r2.apply()
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            com.google.android.gms.measurement.internal.e r6 = r0.q()
            r6.i()
            java.lang.String r6 = r6.f8789l
            r2.h()
            android.content.SharedPreferences r2 = r2.o()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r11, r6)
            r2.apply()
        L_0x03a1:
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.g r2 = r2.p()
            boolean r2 = r2.g()
            if (r2 != 0) goto L_0x03b8
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.j3 r2 = r2.f8811f
            r2.b(r5)
        L_0x03b8:
            o8.s4 r2 = r0.v()
            com.google.android.gms.measurement.internal.j r6 = r0.t()
            o8.j3 r6 = r6.f8811f
            java.lang.String r6 = r6.a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = r2.f23432g
            r2.set(r6)
            k8.z9.b()
            o8.f r2 = r0.f8843g
            o8.u2<java.lang.Boolean> r6 = o8.v2.f23516i0
            boolean r2 = r2.v(r5, r6)
            if (r2 == 0) goto L_0x040f
            com.google.android.gms.measurement.internal.r r2 = r0.A()
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ ClassNotFoundException -> 0x03ea }
            android.content.Context r2 = r2.f8837a     // Catch:{ ClassNotFoundException -> 0x03ea }
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x03ea }
            java.lang.String r6 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r2.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x03ea }
            goto L_0x040f
        L_0x03ea:
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.j3 r2 = r2.f8824s
            java.lang.String r2 = r2.a()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x040f
            com.google.android.gms.measurement.internal.h r2 = r0.d()
            o8.a3 r2 = r2.f8800i
            java.lang.String r6 = "Remote config removed with active feature rollouts"
            r2.a(r6)
            com.google.android.gms.measurement.internal.j r2 = r0.t()
            o8.j3 r2 = r2.f8824s
            r2.b(r5)
        L_0x040f:
            com.google.android.gms.measurement.internal.e r2 = r0.q()
            java.lang.String r2 = r2.n()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x042c
            com.google.android.gms.measurement.internal.e r2 = r0.q()
            r2.i()
            java.lang.String r2 = r2.f8789l
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0491
        L_0x042c:
            boolean r2 = r0.g()
            com.google.android.gms.measurement.internal.j r5 = r0.t()
            android.content.SharedPreferences r5 = r5.f8808c
            if (r5 != 0) goto L_0x043a
            r5 = 0
            goto L_0x0440
        L_0x043a:
            java.lang.String r6 = "deferred_analytics_collection"
            boolean r5 = r5.contains(r6)
        L_0x0440:
            if (r5 != 0) goto L_0x0453
            o8.f r5 = r0.f8843g
            boolean r5 = r5.x()
            if (r5 != 0) goto L_0x0453
            com.google.android.gms.measurement.internal.j r5 = r0.t()
            r6 = r2 ^ 1
            r5.s(r6)
        L_0x0453:
            if (r2 == 0) goto L_0x045c
            o8.s4 r2 = r0.v()
            r2.H()
        L_0x045c:
            o8.o5 r2 = r0.z()
            o8.n5 r2 = r2.f23379d
            r2.a()
            com.google.android.gms.measurement.internal.p r2 = r0.y()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            r2.y(r5)
            com.google.android.gms.measurement.internal.p r2 = r0.y()
            com.google.android.gms.measurement.internal.j r5 = r0.t()
            o8.g3 r5 = r5.f8827v
            android.os.Bundle r5 = r5.a()
            r2.h()
            r2.i()
            o8.b6 r4 = r2.q(r4)
            f7.f0 r6 = new f7.f0
            r6.<init>((com.google.android.gms.measurement.internal.p) r2, (o8.b6) r4, (android.os.Bundle) r5)
            r2.t(r6)
        L_0x0491:
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.f3 r0 = r0.f8818m
            r0.a(r3)
            return
        L_0x049b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Can't initialize twice"
            r0.<init>(r2)
            throw r0
        L_0x04a3:
            java.lang.Object r0 = r1.f24721c
            e8.gf0 r0 = (e8.gf0) r0
            java.lang.Object r0 = r0.f14777c
            e8.og0 r0 = (e8.og0) r0
            java.lang.Object r2 = r1.f24720b
            android.view.Surface r2 = (android.view.Surface) r2
            r0.getClass()
            return
        L_0x04b3:
            java.lang.Object r0 = r1.f24721c
            t1.c r0 = (t1.c) r0
            java.lang.Object r0 = r0.f25351c
            e8.mc0 r0 = (e8.mc0) r0
            java.lang.Object r2 = r1.f24720b
            e8.yc0 r2 = (e8.yc0) r2
            r0.getClass()
            return
        L_0x04c3:
            java.lang.Object r0 = r1.f24721c
            com.google.android.gms.internal.ads.lh r0 = (com.google.android.gms.internal.ads.lh) r0
            java.lang.Object r2 = r1.f24720b
            com.google.android.gms.internal.ads.sg r2 = (com.google.android.gms.internal.ads.sg) r2
            com.google.android.gms.internal.ads.lh.y(r0, r2)
            return
        L_0x04cf:
            java.lang.Object r0 = r1.f24720b
            e8.e30 r0 = (e8.e30) r0
            java.lang.Object r2 = r1.f24721c
            java.lang.String r2 = (java.lang.String) r2
            e8.c9 r0 = r0.f14360b
            r0.c(r2)
            return
        L_0x04dd:
            java.lang.Object r0 = r1.f24720b
            e8.dv r0 = (e8.dv) r0
            java.lang.Object r2 = r1.f24721c
            com.google.android.gms.internal.ads.hf r2 = (com.google.android.gms.internal.ads.hf) r2
            java.lang.Object r0 = r0.f14338f
            e8.k20 r0 = (e8.k20) r0
            e8.m20<E> r0 = r0.f15225c
            r0.P(r2)
            return
        L_0x04ef:
            java.lang.Object r0 = r1.f24720b
            com.google.android.gms.internal.ads.j8 r0 = (com.google.android.gms.internal.ads.j8) r0
            java.lang.Object r2 = r1.f24721c
            e8.zh0 r2 = (e8.zh0) r2
            java.lang.Object r0 = r0.f7136d
            com.google.android.gms.internal.ads.le r0 = (com.google.android.gms.internal.ads.le) r0
            e8.e00 r0 = r0.f7381d
            r0.j0(r2)
            return
        L_0x0501:
            java.lang.Object r0 = r1.f24720b
            com.google.android.gms.internal.ads.j8 r0 = (com.google.android.gms.internal.ads.j8) r0
            java.lang.Object r2 = r1.f24721c
            e8.zh0 r2 = (e8.zh0) r2
            java.lang.Object r0 = r0.f7136d
            com.google.android.gms.internal.ads.vd r0 = (com.google.android.gms.internal.ads.vd) r0
            e8.hz r0 = r0.f8355d
            r0.j0(r2)
            return
        L_0x0513:
            java.lang.Object r0 = r1.f24720b
            e8.xt r0 = (e8.xt) r0
            java.lang.Object r2 = r1.f24721c
            com.google.android.gms.internal.ads.t7 r2 = (com.google.android.gms.internal.ads.t7) r2
            r0.getClass()
            r2.p0()
            com.google.android.gms.internal.ads.w7 r2 = r2.o()
            e8.w00 r0 = r0.f17523d
            e8.h r0 = r0.f17188b
            if (r0 == 0) goto L_0x0530
            if (r2 == 0) goto L_0x0530
            r2.v6(r0)
        L_0x0530:
            return
        L_0x0531:
            java.lang.Object r0 = r1.f24720b
            e8.qh r0 = (e8.qh) r0
            java.lang.Object r3 = r1.f24721c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.f16172b
            r12 = r0
            e8.yq r12 = (e8.yq) r12
            r12.getClass()
            java.lang.String r13 = "data"
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ JSONException -> 0x066d }
            r14.<init>()     // Catch:{ JSONException -> 0x066d }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x066d }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x066d }
            java.lang.String r3 = "initializer_settings"
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x066d }
            java.lang.String r3 = "config"
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x066d }
            java.util.Iterator r15 = r3.keys()     // Catch:{ JSONException -> 0x066d }
        L_0x055d:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x066d }
            if (r0 == 0) goto L_0x065b
            java.lang.Object r0 = r15.next()     // Catch:{ JSONException -> 0x066d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x066d }
            java.lang.Object r16 = new java.lang.Object     // Catch:{ JSONException -> 0x066d }
            r16.<init>()     // Catch:{ JSONException -> 0x066d }
            com.google.android.gms.internal.ads.d7 r10 = new com.google.android.gms.internal.ads.d7     // Catch:{ JSONException -> 0x066d }
            r10.<init>()     // Catch:{ JSONException -> 0x066d }
            e8.l<java.lang.Long> r5 = e8.t.f16550b1     // Catch:{ JSONException -> 0x066d }
            e8.ti0 r6 = e8.ti0.f16763j     // Catch:{ JSONException -> 0x066d }
            com.google.android.gms.internal.ads.e r6 = r6.f16769f     // Catch:{ JSONException -> 0x066d }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ JSONException -> 0x066d }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ JSONException -> 0x066d }
            long r5 = r5.longValue()     // Catch:{ JSONException -> 0x066d }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ JSONException -> 0x066d }
            java.util.concurrent.ScheduledExecutorService r8 = r12.f17658j     // Catch:{ JSONException -> 0x066d }
            e8.p50 r11 = com.google.android.gms.internal.ads.yh.e(r10, r5, r7, r8)     // Catch:{ JSONException -> 0x066d }
            e8.uq r5 = r12.f17659k     // Catch:{ JSONException -> 0x066d }
            r5.c(r0)     // Catch:{ JSONException -> 0x066d }
            e8.fl r5 = r12.f17662n     // Catch:{ JSONException -> 0x066d }
            e8.k8 r6 = new e8.k8     // Catch:{ JSONException -> 0x066d }
            r6.<init>(r0, r2)     // Catch:{ JSONException -> 0x066d }
            r5.I0(r6)     // Catch:{ JSONException -> 0x066d }
            d7.l r5 = d7.l.B     // Catch:{ JSONException -> 0x066d }
            z7.b r5 = r5.f13193j     // Catch:{ JSONException -> 0x066d }
            long r17 = r5.a()     // Catch:{ JSONException -> 0x066d }
            e8.zq r9 = new e8.zq     // Catch:{ JSONException -> 0x066d }
            r5 = r9
            r6 = r12
            r7 = r16
            r8 = r10
            r2 = r9
            r9 = r0
            r19 = r10
            r4 = r11
            r10 = r17
            r5.<init>((e8.yq) r6, (java.lang.Object) r7, (com.google.android.gms.internal.ads.d7) r8, (java.lang.String) r9, (long) r10)     // Catch:{ JSONException -> 0x066d }
            java.util.concurrent.Executor r5 = r12.f17656h     // Catch:{ JSONException -> 0x066d }
            r4.a(r2, r5)     // Catch:{ JSONException -> 0x066d }
            r14.add(r4)     // Catch:{ JSONException -> 0x066d }
            e8.ar r2 = new e8.ar     // Catch:{ JSONException -> 0x066d }
            r5 = r2
            r6 = r12
            r7 = r16
            r8 = r0
            r9 = r17
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ JSONException -> 0x066d }
            org.json.JSONObject r4 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x066d }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ JSONException -> 0x066d }
            r9.<init>()     // Catch:{ JSONException -> 0x066d }
            java.lang.String r11 = ""
            if (r4 == 0) goto L_0x062b
            org.json.JSONArray r4 = r4.getJSONArray(r13)     // Catch:{ JSONException -> 0x062b }
            r5 = 0
        L_0x05db:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x062b }
            if (r5 >= r6) goto L_0x062b
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x062b }
            java.lang.String r7 = "format"
            java.lang.String r7 = r6.optString(r7, r11)     // Catch:{ JSONException -> 0x062b }
            org.json.JSONObject r6 = r6.optJSONObject(r13)     // Catch:{ JSONException -> 0x062b }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ JSONException -> 0x062b }
            r8.<init>()     // Catch:{ JSONException -> 0x062b }
            if (r6 == 0) goto L_0x0618
            java.util.Iterator r10 = r6.keys()     // Catch:{ JSONException -> 0x062b }
        L_0x05fa:
            boolean r16 = r10.hasNext()     // Catch:{ JSONException -> 0x062b }
            if (r16 == 0) goto L_0x0618
            java.lang.Object r16 = r10.next()     // Catch:{ JSONException -> 0x062b }
            r17 = r3
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x062d }
            r16 = r4
            java.lang.String r4 = r6.optString(r3, r11)     // Catch:{ JSONException -> 0x062d }
            r8.putString(r3, r4)     // Catch:{ JSONException -> 0x062d }
            r4 = r16
            r3 = r17
            goto L_0x05fa
        L_0x0618:
            r17 = r3
            r16 = r4
            e8.b4 r3 = new e8.b4     // Catch:{ JSONException -> 0x062d }
            r3.<init>(r7, r8)     // Catch:{ JSONException -> 0x062d }
            r9.add(r3)     // Catch:{ JSONException -> 0x062d }
            int r5 = r5 + 1
            r4 = r16
            r3 = r17
            goto L_0x05db
        L_0x062b:
            r17 = r3
        L_0x062d:
            r3 = 0
            r12.b(r0, r3, r11, r3)     // Catch:{ JSONException -> 0x066d }
            com.google.android.gms.internal.ads.gb r3 = r12.f17655g     // Catch:{ b10 -> 0x064b }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ b10 -> 0x064b }
            r4.<init>()     // Catch:{ b10 -> 0x064b }
            com.google.android.gms.internal.ads.ue r7 = r3.b(r0, r4)     // Catch:{ b10 -> 0x064b }
            java.util.concurrent.Executor r3 = r12.f17657i     // Catch:{ b10 -> 0x064b }
            e8.ib r4 = new e8.ib     // Catch:{ b10 -> 0x064b }
            r5 = r4
            r6 = r12
            r8 = r2
            r10 = r0
            r5.<init>((e8.yq) r6, (com.google.android.gms.internal.ads.ue) r7, (com.google.android.gms.internal.ads.v1) r8, (java.util.List) r9, (java.lang.String) r10)     // Catch:{ b10 -> 0x064b }
            r3.execute(r4)     // Catch:{ b10 -> 0x064b }
            goto L_0x0655
        L_0x064b:
            java.lang.String r0 = "Failed to create Adapter."
            r2.M3(r0)     // Catch:{ RemoteException -> 0x0651 }
            goto L_0x0655
        L_0x0651:
            r0 = move-exception
            l0.e.C(r11, r0)     // Catch:{ JSONException -> 0x066d }
        L_0x0655:
            r3 = r17
            r2 = 3
            r4 = 0
            goto L_0x055d
        L_0x065b:
            com.google.android.gms.internal.ads.ug r0 = com.google.android.gms.internal.ads.ug.A(r14)     // Catch:{ JSONException -> 0x066d }
            f7.h0 r2 = new f7.h0     // Catch:{ JSONException -> 0x066d }
            r2.<init>((e8.yq) r12)     // Catch:{ JSONException -> 0x066d }
            java.util.concurrent.Executor r3 = r12.f17656h     // Catch:{ JSONException -> 0x066d }
            com.google.android.gms.internal.ads.rh r4 = new com.google.android.gms.internal.ads.rh     // Catch:{ JSONException -> 0x066d }
            r5 = 0
            r4.<init>(r0, r5, r3, r2)     // Catch:{ JSONException -> 0x066d }
            goto L_0x0673
        L_0x066d:
            r0 = move-exception
            java.lang.String r2 = "Malformed CLD response"
            l0.e.v(r2, r0)
        L_0x0673:
            return
        L_0x0674:
            java.lang.Object r0 = r1.f24720b
            e8.yq r0 = (e8.yq) r0
            java.lang.Object r2 = r1.f24721c
            com.google.android.gms.internal.ads.x1 r2 = (com.google.android.gms.internal.ads.x1) r2
            r0.getClass()
            java.util.List r0 = r0.d()     // Catch:{ RemoteException -> 0x0687 }
            r2.E4(r0)     // Catch:{ RemoteException -> 0x0687 }
            goto L_0x068d
        L_0x0687:
            r0 = move-exception
            java.lang.String r2 = ""
            l0.e.C(r2, r0)
        L_0x068d:
            return
        L_0x068e:
            java.lang.Object r0 = r1.f24720b
            e8.sq r0 = (e8.sq) r0
            java.lang.Object r2 = r1.f24721c
            java.lang.String r2 = (java.lang.String) r2
            e8.c9 r0 = r0.f16510c
            r0.c(r2)
            return
        L_0x069c:
            java.lang.Object r0 = r1.f24720b
            e8.tn r0 = (e8.tn) r0
            java.lang.Object r2 = r1.f24721c
            e8.co r2 = (e8.co) r2
            e8.mn r4 = r0.f16777c
            boolean r4 = r4.e()
            if (r4 != 0) goto L_0x06b7
            e8.mn r4 = r0.f16777c
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x06b5
            goto L_0x06b7
        L_0x06b5:
            r4 = 0
            goto L_0x06b8
        L_0x06b7:
            r4 = 1
        L_0x06b8:
            if (r4 == 0) goto L_0x06db
            r4 = 2
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r7 = "1098"
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "3011"
            r6[r3] = r7
            r7 = 0
        L_0x06c7:
            if (r7 >= r4) goto L_0x06dc
            r9 = r6[r7]
            android.view.View r9 = r2.G3(r9)
            if (r9 == 0) goto L_0x06d8
            boolean r10 = r9 instanceof android.view.ViewGroup
            if (r10 == 0) goto L_0x06d8
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L_0x06dd
        L_0x06d8:
            int r7 = r7 + 1
            goto L_0x06c7
        L_0x06db:
            r8 = 0
        L_0x06dc:
            r9 = r5
        L_0x06dd:
            if (r9 == 0) goto L_0x06e1
            r4 = 1
            goto L_0x06e2
        L_0x06e1:
            r4 = 0
        L_0x06e2:
            android.view.View r6 = r2.E1()
            android.content.Context r6 = r6.getContext()
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r10 = -2
            r7.<init>(r10, r10)
            e8.jn r10 = r0.f16778d
            monitor-enter(r10)
            android.view.View r11 = r10.f15159d     // Catch:{ all -> 0x0853 }
            monitor-exit(r10)
            if (r11 == 0) goto L_0x0712
            e8.jn r6 = r0.f16778d
            monitor-enter(r6)
            android.view.View r10 = r6.f15159d     // Catch:{ all -> 0x070e }
            monitor-exit(r6)
            e8.n1 r6 = r0.f16783i
            if (r6 != 0) goto L_0x0703
            goto L_0x0742
        L_0x0703:
            if (r4 != 0) goto L_0x0742
            int r6 = r6.f15575e
            e8.tn.a(r7, r6)
            r10.setLayoutParams(r7)
            goto L_0x0742
        L_0x070e:
            r0 = move-exception
            r2 = r0
            monitor-exit(r6)
            throw r2
        L_0x0712:
            e8.jn r10 = r0.f16778d
            com.google.android.gms.internal.ads.u r10 = r10.v()
            boolean r10 = r10 instanceof e8.k1
            if (r10 != 0) goto L_0x071e
            r10 = r5
            goto L_0x0742
        L_0x071e:
            e8.jn r10 = r0.f16778d
            com.google.android.gms.internal.ads.u r10 = r10.v()
            e8.k1 r10 = (e8.k1) r10
            if (r4 != 0) goto L_0x072d
            int r11 = r10.f15219h
            e8.tn.a(r7, r11)
        L_0x072d:
            com.google.android.gms.internal.ads.s r11 = new com.google.android.gms.internal.ads.s
            r11.<init>(r6, r10, r7)
            e8.l<java.lang.String> r6 = e8.t.N1
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r6 = r7.a(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r11.setContentDescription(r6)
            r10 = r11
        L_0x0742:
            r6 = -1
            if (r10 == 0) goto L_0x0787
            android.view.ViewParent r7 = r10.getParent()
            boolean r7 = r7 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0756
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r10)
        L_0x0756:
            if (r4 == 0) goto L_0x075f
            r9.removeAllViews()
            r9.addView(r10)
            goto L_0x0780
        L_0x075f:
            a7.a r4 = new a7.a
            android.view.View r7 = r2.E1()
            android.content.Context r7 = r7.getContext()
            r4.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r6, r6)
            r4.setLayoutParams(r7)
            r4.addView(r10)
            android.widget.FrameLayout r7 = r2.u4()
            if (r7 == 0) goto L_0x0780
            r7.addView(r4)
        L_0x0780:
            java.lang.String r4 = r2.i3()
            r2.j2(r4, r10, r3)
        L_0x0787:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.ga.f6617v
            int r4 = r3.length
        L_0x078a:
            if (r8 >= r4) goto L_0x079c
            r7 = r3[r8]
            android.view.View r7 = r2.G3(r7)
            boolean r9 = r7 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x0799
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x079d
        L_0x0799:
            int r8 = r8 + 1
            goto L_0x078a
        L_0x079c:
            r7 = r5
        L_0x079d:
            java.util.concurrent.Executor r3 = r0.f16782h
            e7.i r4 = new e7.i
            r4.<init>((e8.tn) r0, (android.view.ViewGroup) r7)
            r3.execute(r4)
            if (r7 == 0) goto L_0x0852
            boolean r3 = r0.b(r7)
            if (r3 == 0) goto L_0x07c7
            e8.jn r3 = r0.f16778d
            com.google.android.gms.internal.ads.t7 r3 = r3.o()
            if (r3 == 0) goto L_0x0852
            e8.jn r3 = r0.f16778d
            com.google.android.gms.internal.ads.t7 r3 = r3.o()
            com.google.android.gms.internal.ads.j8 r4 = new com.google.android.gms.internal.ads.j8
            r4.<init>((e8.tn) r0, (e8.co) r2, (android.view.ViewGroup) r7)
            r3.A0(r4)
            goto L_0x0852
        L_0x07c7:
            r7.removeAllViews()
            android.view.View r3 = r2.E1()
            if (r3 == 0) goto L_0x07d4
            android.content.Context r5 = r3.getContext()
        L_0x07d4:
            if (r5 == 0) goto L_0x0852
            e8.l<java.lang.Boolean> r3 = e8.t.M1
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x07fb
            e8.in r0 = r0.f16784j
            com.google.android.gms.internal.ads.y r0 = r0.a()
            if (r0 == 0) goto L_0x0852
            c8.a r0 = r0.b3()     // Catch:{ RemoteException -> 0x07f5 }
            goto L_0x0807
        L_0x07f5:
            java.lang.String r0 = "Could not get main image drawable"
            l0.e.K(r0)
            goto L_0x0852
        L_0x07fb:
            e8.jn r0 = r0.f16778d
            com.google.android.gms.internal.ads.z r0 = r0.l()
            if (r0 == 0) goto L_0x0852
            c8.a r0 = r0.y3()     // Catch:{ RemoteException -> 0x084d }
        L_0x0807:
            if (r0 == 0) goto L_0x0852
            java.lang.Object r0 = c8.b.z0(r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L_0x0852
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r5)
            r3.setImageDrawable(r0)
            c8.a r0 = r2.b2()
            if (r0 == 0) goto L_0x083c
            e8.l<java.lang.Boolean> r2 = e8.t.f16684x3
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0832
            goto L_0x083c
        L_0x0832:
            java.lang.Object r0 = c8.b.z0(r0)
            android.widget.ImageView$ScaleType r0 = (android.widget.ImageView.ScaleType) r0
            r3.setScaleType(r0)
            goto L_0x0841
        L_0x083c:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r3.setScaleType(r0)
        L_0x0841:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r6, r6)
            r3.setLayoutParams(r0)
            r7.addView(r3)
            goto L_0x0852
        L_0x084d:
            java.lang.String r0 = "Could not get drawable from image"
            l0.e.K(r0)
        L_0x0852:
            return
        L_0x0853:
            r0 = move-exception
            r2 = r0
            monitor-exit(r10)
            throw r2
        L_0x0857:
            java.lang.Object r0 = r1.f24720b
            e8.ug r0 = (e8.ug) r0
            java.lang.Object r2 = r1.f24721c
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0.getClass()
            com.google.android.gms.internal.ads.g1 r0 = r0.f16955h     // Catch:{ RemoteException -> 0x0873 }
            c8.b r3 = new c8.b     // Catch:{ RemoteException -> 0x0873 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0873 }
            boolean r0 = r0.a5(r3)     // Catch:{ RemoteException -> 0x0873 }
            if (r0 != 0) goto L_0x0876
            r2.run()     // Catch:{ RemoteException -> 0x0873 }
            goto L_0x0876
        L_0x0873:
            r2.run()
        L_0x0876:
            return
        L_0x0877:
            java.lang.Object r0 = r1.f24720b
            e8.hf r0 = (e8.hf) r0
            java.lang.Object r2 = r1.f24721c
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.google.android.gms.internal.ads.t7 r0 = r0.f14898a
            java.lang.String r3 = "AFMA_updateActiveView"
            r0.m(r3, r2)
            return
        L_0x0887:
            r8 = 0
            java.lang.Object r0 = r1.f24720b
            r2 = r0
            com.google.android.gms.internal.ads.l8 r2 = (com.google.android.gms.internal.ads.l8) r2
            java.lang.Object r0 = r1.f24721c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.getClass()
            java.lang.String r4 = "Adapters must be initialized on the main thread."
            com.google.android.gms.common.internal.i.d(r4)
            d7.l r4 = d7.l.B
            com.google.android.gms.internal.ads.y6 r4 = r4.f13190g
            f7.d0 r4 = r4.f()
            com.google.android.gms.ads.internal.util.o r4 = (com.google.android.gms.ads.internal.util.o) r4
            e8.u8 r4 = r4.j()
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.r2> r4 = r4.f16858d
            if (r4 == 0) goto L_0x09d5
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x08b3
            goto L_0x09d5
        L_0x08b3:
            if (r0 == 0) goto L_0x08c2
            r0.run()     // Catch:{ all -> 0x08b9 }
            goto L_0x08c2
        L_0x08b9:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "Could not initialize rewarded ads."
            l0.e.D(r0, r2)
            goto L_0x09d5
        L_0x08c2:
            com.google.android.gms.internal.ads.gb r0 = r2.f7346c
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.s2> r0 = r0.f6632b
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x08cd
            goto L_0x08ce
        L_0x08cd:
            r3 = 0
        L_0x08ce:
            if (r3 == 0) goto L_0x09d5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collection r3 = r4.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x08dd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0929
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.ads.r2 r4 = (com.google.android.gms.internal.ads.r2) r4
            java.util.List<com.google.android.gms.internal.ads.p2> r4 = r4.f8004a
            java.util.Iterator r4 = r4.iterator()
        L_0x08ef:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x08dd
            java.lang.Object r5 = r4.next()
            com.google.android.gms.internal.ads.p2 r5 = (com.google.android.gms.internal.ads.p2) r5
            java.lang.String r6 = r5.f7799g
            java.util.List<java.lang.String> r5 = r5.f7793a
            java.util.Iterator r5 = r5.iterator()
        L_0x0903:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x08ef
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r0.containsKey(r7)
            if (r8 != 0) goto L_0x091d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.put(r7, r8)
        L_0x091d:
            if (r6 == 0) goto L_0x0903
            java.lang.Object r7 = r0.get(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r7.add(r6)
            goto L_0x0903
        L_0x0929:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0936:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09d5
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.ub<com.google.android.gms.internal.ads.ue, com.google.android.gms.internal.ads.ac> r6 = r2.f7347d     // Catch:{ b10 -> 0x09af }
            e8.mt r6 = r6.a(r5, r3)     // Catch:{ b10 -> 0x09af }
            if (r6 != 0) goto L_0x0951
            goto L_0x0936
        L_0x0951:
            AdapterT r7 = r6.f15550b     // Catch:{ b10 -> 0x09af }
            com.google.android.gms.internal.ads.ue r7 = (com.google.android.gms.internal.ads.ue) r7     // Catch:{ b10 -> 0x09af }
            r7.getClass()     // Catch:{ b10 -> 0x09af }
            com.google.android.gms.internal.ads.x2 r8 = r7.f8245a     // Catch:{ all -> 0x09a8 }
            boolean r8 = r8.isInitialized()     // Catch:{ all -> 0x09a8 }
            if (r8 != 0) goto L_0x0936
            com.google.android.gms.internal.ads.x2 r8 = r7.f8245a     // Catch:{ all -> 0x09a1 }
            boolean r8 = r8.l6()     // Catch:{ all -> 0x09a1 }
            if (r8 != 0) goto L_0x0969
            goto L_0x0936
        L_0x0969:
            ListenerT r6 = r6.f15551c     // Catch:{ b10 -> 0x09af }
            com.google.android.gms.internal.ads.ac r6 = (com.google.android.gms.internal.ads.ac) r6     // Catch:{ b10 -> 0x09af }
            java.lang.Object r0 = r0.getValue()     // Catch:{ b10 -> 0x09af }
            java.util.List r0 = (java.util.List) r0     // Catch:{ b10 -> 0x09af }
            android.content.Context r8 = r2.f7344a     // Catch:{ b10 -> 0x09af }
            com.google.android.gms.internal.ads.x2 r7 = r7.f8245a     // Catch:{ all -> 0x099a }
            c8.b r9 = new c8.b     // Catch:{ all -> 0x099a }
            r9.<init>(r8)     // Catch:{ all -> 0x099a }
            r7.i4(r9, r6, r0)     // Catch:{ all -> 0x099a }
            java.lang.String r0 = "Initialized rewarded video mediation adapter "
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ b10 -> 0x09af }
            int r7 = r6.length()     // Catch:{ b10 -> 0x09af }
            if (r7 == 0) goto L_0x0990
            java.lang.String r0 = r0.concat(r6)     // Catch:{ b10 -> 0x09af }
            goto L_0x0996
        L_0x0990:
            java.lang.String r6 = new java.lang.String     // Catch:{ b10 -> 0x09af }
            r6.<init>(r0)     // Catch:{ b10 -> 0x09af }
            r0 = r6
        L_0x0996:
            l0.e.E(r0)     // Catch:{ b10 -> 0x09af }
            goto L_0x0936
        L_0x099a:
            r0 = move-exception
            e8.b10 r6 = new e8.b10     // Catch:{ b10 -> 0x09af }
            r6.<init>(r0)     // Catch:{ b10 -> 0x09af }
            throw r6     // Catch:{ b10 -> 0x09af }
        L_0x09a1:
            r0 = move-exception
            e8.b10 r6 = new e8.b10     // Catch:{ b10 -> 0x09af }
            r6.<init>(r0)     // Catch:{ b10 -> 0x09af }
            throw r6     // Catch:{ b10 -> 0x09af }
        L_0x09a8:
            r0 = move-exception
            e8.b10 r6 = new e8.b10     // Catch:{ b10 -> 0x09af }
            r6.<init>(r0)     // Catch:{ b10 -> 0x09af }
            throw r6     // Catch:{ b10 -> 0x09af }
        L_0x09af:
            r0 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 56
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Failed to initialize rewarded video mediation adapter \""
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = "\""
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            l0.e.D(r5, r0)
            goto L_0x0936
        L_0x09d5:
            return
        L_0x09d6:
            java.lang.Object r0 = r1.f24720b
            e8.jc r0 = (e8.jc) r0
            java.lang.Object r2 = r1.f24721c
            java.lang.String r2 = (java.lang.String) r2
            e8.ic r0 = r0.f15133a
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.google.android.gms.internal.ads.t7 r0 = r0.f15014a
            e8.uc r0 = r0.H()
            if (r0 != 0) goto L_0x09f2
            java.lang.String r0 = "Unable to pass GMSG, no AdWebViewClient for AdWebView!"
            l0.e.I(r0)
            goto L_0x09f7
        L_0x09f2:
            com.google.android.gms.internal.ads.s7 r0 = (com.google.android.gms.internal.ads.s7) r0
            r0.Q(r2)
        L_0x09f7:
            return
        L_0x09f8:
            java.lang.Object r0 = r1.f24720b
            e8.oa r0 = (e8.oa) r0
            java.lang.Object r2 = r1.f24721c
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.f7 r0 = r0.f15752f
            if (r0 == 0) goto L_0x0a0b
            com.google.android.gms.internal.ads.i7 r0 = (com.google.android.gms.internal.ads.i7) r0
            java.lang.String r3 = "ExoPlayerAdapter error"
            r0.k(r3, r2)
        L_0x0a0b:
            return
        L_0x0a0c:
            java.lang.Object r0 = r1.f24720b
            com.google.android.gms.internal.ads.f2 r0 = (com.google.android.gms.internal.ads.f2) r0
            java.lang.Object r2 = r1.f24721c
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.t7 r0 = r0.f6346a
            r0.loadUrl(r2)
            return
        L_0x0a1a:
            java.lang.Object r0 = r1.f24721c
            u7.z r0 = (u7.z) r0
            java.lang.Object r2 = r1.f24720b
            q8.l r2 = (q8.l) r2
            t7.a$a<? extends p8.d, p8.a> r3 = u7.z.f26140h
            s7.a r3 = r2.f24227b
            boolean r4 = r3.j()
            if (r4 == 0) goto L_0x0a92
            com.google.android.gms.common.internal.n r2 = r2.f24228c
            com.google.android.gms.common.internal.i.h(r2)
            s7.a r3 = r2.f5879c
            boolean r4 = r3.j()
            if (r4 != 0) goto L_0x0a5c
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.Exception r4 = new java.lang.Exception
            r4.<init>()
            java.lang.String r5 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "SignInCoordinator"
            android.util.Log.wtf(r5, r2, r4)
            u7.y r2 = r0.f26147g
            u7.r r2 = (u7.r) r2
            r2.b(r3)
            p8.d r0 = r0.f26146f
            com.google.android.gms.common.internal.b r0 = (com.google.android.gms.common.internal.b) r0
            r0.p()
            goto L_0x0aa0
        L_0x0a5c:
            u7.y r3 = r0.f26147g
            com.google.android.gms.common.internal.f r2 = r2.i()
            java.util.Set<com.google.android.gms.common.api.Scope> r4 = r0.f26144d
            u7.r r3 = (u7.r) r3
            r3.getClass()
            if (r2 == 0) goto L_0x0a7c
            if (r4 != 0) goto L_0x0a6e
            goto L_0x0a7c
        L_0x0a6e:
            r3.f26127c = r2
            r3.f26128d = r4
            boolean r5 = r3.f26129e
            if (r5 == 0) goto L_0x0a99
            t7.a$f r3 = r3.f26125a
            r3.d(r2, r4)
            goto L_0x0a99
        L_0x0a7c:
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r4 = "GoogleApiManager"
            java.lang.String r5 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r4, r5, r2)
            s7.a r2 = new s7.a
            r4 = 4
            r2.<init>(r4)
            r3.b(r2)
            goto L_0x0a99
        L_0x0a92:
            u7.y r2 = r0.f26147g
            u7.r r2 = (u7.r) r2
            r2.b(r3)
        L_0x0a99:
            p8.d r0 = r0.f26146f
            com.google.android.gms.common.internal.b r0 = (com.google.android.gms.common.internal.b) r0
            r0.p()
        L_0x0aa0:
            return
        L_0x0aa1:
            java.lang.Object r0 = r1.f24720b
            r2 = r0
            r7.j r2 = (r7.j) r2
            java.lang.Object r0 = r1.f24721c
            r7.p r0 = (r7.p) r0
            int r0 = r0.f24724a
            monitor-enter(r2)
            android.util.SparseArray<r7.p<?>> r3 = r2.f24714e     // Catch:{ all -> 0x0ae4 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0ae4 }
            r7.p r3 = (r7.p) r3     // Catch:{ all -> 0x0ae4 }
            if (r3 == 0) goto L_0x0ae2
            java.lang.String r4 = "MessengerIpcClient"
            r5 = 31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ae4 }
            r6.<init>(r5)     // Catch:{ all -> 0x0ae4 }
            java.lang.String r5 = "Timing out request: "
            r6.append(r5)     // Catch:{ all -> 0x0ae4 }
            r6.append(r0)     // Catch:{ all -> 0x0ae4 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0ae4 }
            android.util.Log.w(r4, r5)     // Catch:{ all -> 0x0ae4 }
            android.util.SparseArray<r7.p<?>> r4 = r2.f24714e     // Catch:{ all -> 0x0ae4 }
            r4.remove(r0)     // Catch:{ all -> 0x0ae4 }
            x4.a0 r0 = new x4.a0     // Catch:{ all -> 0x0ae4 }
            java.lang.String r4 = "Timed out waiting for response"
            r5 = 3
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0ae4 }
            r3.c(r0)     // Catch:{ all -> 0x0ae4 }
            r2.c()     // Catch:{ all -> 0x0ae4 }
        L_0x0ae2:
            monitor-exit(r2)
            return
        L_0x0ae4:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0ae8
        L_0x0ae7:
            throw r0
        L_0x0ae8:
            goto L_0x0ae7
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.run():void");
    }

    public m(j8 j8Var, zh0 zh0) {
        this.f24720b = j8Var;
        this.f24721c = zh0;
    }

    public m(j8 j8Var, zh0 zh0, e eVar) {
        this.f24720b = j8Var;
        this.f24721c = zh0;
    }

    public m(l8 l8Var, Runnable runnable) {
        this.f24720b = l8Var;
        this.f24721c = runnable;
    }

    public m(AppMeasurementDynamiteService appMeasurementDynamiteService, c cVar) {
        this.f24721c = appMeasurementDynamiteService;
        this.f24720b = cVar;
    }

    public m(l lVar, i4 i4Var) {
        this.f24721c = lVar;
        this.f24720b = i4Var;
    }

    public m(oa oaVar, String str) {
        this.f24720b = oaVar;
        this.f24721c = str;
    }

    public m(jc jcVar, String str) {
        this.f24720b = jcVar;
        this.f24721c = str;
    }

    public m(hf hfVar, JSONObject jSONObject) {
        this.f24720b = hfVar;
        this.f24721c = jSONObject;
    }

    public m(ug ugVar, Runnable runnable) {
        this.f24720b = ugVar;
        this.f24721c = runnable;
    }

    public m(qh qhVar, String str) {
        this.f24720b = qhVar;
        this.f24721c = str;
    }

    public m(tn tnVar, co coVar) {
        this.f24720b = tnVar;
        this.f24721c = coVar;
    }

    public m(sq sqVar, String str) {
        this.f24720b = sqVar;
        this.f24721c = str;
    }

    public m(yq yqVar, x1 x1Var) {
        this.f24720b = yqVar;
        this.f24721c = x1Var;
    }

    public m(xt xtVar, t7 t7Var) {
        this.f24720b = xtVar;
        this.f24721c = t7Var;
    }

    public m(dv dvVar, com.google.android.gms.internal.ads.hf hfVar) {
        this.f24720b = dvVar;
        this.f24721c = hfVar;
    }

    public m(e30 e30, String str) {
        this.f24720b = e30;
        this.f24721c = str;
    }

    public m(s4 s4Var, Bundle bundle) {
        this.f24721c = s4Var;
        this.f24720b = bundle;
    }

    public m(g5 g5Var, d dVar) {
        this.f24721c = g5Var;
        this.f24720b = dVar;
    }

    public m(j jVar, p pVar) {
        this.f24720b = jVar;
        this.f24721c = pVar;
    }

    public m(q qVar, s8.i iVar) {
        this.f24721c = qVar;
        this.f24720b = iVar;
    }

    public m(t tVar, s8.i iVar) {
        this.f24721c = tVar;
        this.f24720b = iVar;
    }

    public m(z zVar, q8.l lVar) {
        this.f24721c = zVar;
        this.f24720b = lVar;
    }

    public m(lh lhVar, sg sgVar) {
        this.f24721c = lhVar;
        this.f24720b = sgVar;
    }

    public m(gf0 gf0, Surface surface) {
        this.f24721c = gf0;
        this.f24720b = surface;
    }

    public m(c cVar, yc0 yc0) {
        this.f24721c = cVar;
        this.f24720b = yc0;
    }
}
