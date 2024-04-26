package e8;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.fg;
import com.google.android.gms.internal.ads.gg;
import com.google.android.gms.internal.ads.hg;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.lf;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.ms;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.uf;
import f7.h0;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l0.e;
import s8.i;
import s8.l;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q10 implements c40 {

    /* renamed from: u  reason: collision with root package name */
    public static q10 f16048u;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16049a;

    /* renamed from: b  reason: collision with root package name */
    public final fg f16050b;

    /* renamed from: c  reason: collision with root package name */
    public final gg f16051c;

    /* renamed from: d  reason: collision with root package name */
    public final hg f16052d;

    /* renamed from: e  reason: collision with root package name */
    public final er f16053e;

    /* renamed from: f  reason: collision with root package name */
    public final mf f16054f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f16055g;

    /* renamed from: h  reason: collision with root package name */
    public final js f16056h;

    /* renamed from: i  reason: collision with root package name */
    public final y10 f16057i;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f16058r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final Object f16059s = new Object();

    /* renamed from: t  reason: collision with root package name */
    public volatile boolean f16060t;

    public q10(Context context, mf mfVar, fg fgVar, gg ggVar, hg hgVar, er erVar, Executor executor, lf lfVar, js jsVar) {
        this.f16049a = context;
        this.f16054f = mfVar;
        this.f16050b = fgVar;
        this.f16051c = ggVar;
        this.f16052d = hgVar;
        this.f16053e = erVar;
        this.f16055g = executor;
        this.f16056h = jsVar;
        this.f16057i = new y10(lfVar);
    }

    public static q10 h(Context context, mf mfVar, h30 h30, Executor executor) {
        js jsVar;
        m30 m30 = new m30(context, executor, mfVar, h30, new sf(), new rf());
        if (h30.b()) {
            i<ma> c10 = l.c((Executor) m30.f15452b, new l30(m30, 0));
            c10.c((Executor) m30.f15452b, new gz(m30));
            m30.f15457g = c10;
        } else {
            m30.f15457g = l.e(((uf) m30.f15455e).a());
        }
        i<ma> c11 = l.c((Executor) m30.f15452b, new l30(m30, 1));
        c11.c((Executor) m30.f15452b, new gz(m30));
        m30.f15458h = c11;
        fb0 fb0 = new fb0(context);
        er erVar = new er(h30, m30, new mb0(context, fb0), fb0);
        c cVar = new c(context, mfVar);
        js jsVar2 = js.UNSUPPORTED;
        js k10 = cVar.k();
        if (k10 == js.UNKNOWN) {
            String j10 = cVar.j();
            if (TextUtils.isEmpty(j10)) {
                cVar.r((byte[]) null, "Empty dev arch");
            } else if (j10.equalsIgnoreCase("i686") || j10.equalsIgnoreCase("x86")) {
                jsVar2 = js.X86;
            } else if (j10.equalsIgnoreCase("x86_64")) {
                jsVar2 = js.X86_64;
            } else if (j10.equalsIgnoreCase("arm64-v8a")) {
                jsVar2 = js.ARM64;
            } else if (j10.equalsIgnoreCase("armeabi-v7a") || j10.equalsIgnoreCase("armv71")) {
                jsVar2 = js.ARM7;
            } else {
                cVar.r((byte[]) null, j10);
            }
            jsVar = jsVar2;
        } else {
            jsVar = k10;
        }
        mf mfVar2 = (mf) cVar.f25351c;
        if (mfVar2 != null) {
            mfVar2.d(5018, jsVar.name());
        }
        lf lfVar = new lf();
        return new q10(context, mfVar, new fg(context, jsVar), new gg(context, jsVar, new y10(mfVar)), new hg(context, erVar, mfVar, lfVar), erVar, executor, lfVar, jsVar);
    }

    public static synchronized q10 i(String str, Context context, boolean z10) {
        q10 q10;
        synchronized (q10.class) {
            if (f16048u == null) {
                j8 j8Var = new j8();
                j8Var.l(false);
                j8Var.f7136d = Boolean.TRUE;
                if (str != null) {
                    j8Var.f7134b = str;
                    j8Var.f7135c = Boolean.valueOf(z10);
                    h30 h10 = j8Var.h();
                    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                    q10 h11 = h(context, new mf(context, newCachedThreadPool, l.c(newCachedThreadPool, new h0(context))), h10, newCachedThreadPool);
                    f16048u = h11;
                    h11.j();
                    f16048u.k();
                } else {
                    throw new NullPointerException("Null clientVersion");
                }
            }
            q10 = f16048u;
        }
        return q10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (r4.z().F().equals(r5.F()) != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a5 A[Catch:{ f80 -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[Catch:{ f80 -> 0x0114 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(e8.q10 r11) {
        /*
            r11.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            e8.wz r3 = r11.m(r2)
            r4 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.Object r4 = r3.f17418a
            com.google.android.gms.internal.ads.ms r4 = (com.google.android.gms.internal.ads.ms) r4
            java.lang.String r4 = r4.E()
            java.lang.Object r3 = r3.f17418a
            com.google.android.gms.internal.ads.ms r3 = (com.google.android.gms.internal.ads.ms) r3
            java.lang.String r3 = r3.F()
            r8 = r3
            r7 = r4
            goto L_0x0024
        L_0x0022:
            r7 = r4
            r8 = r7
        L_0x0024:
            android.content.Context r5 = r11.f16049a     // Catch:{ f80 -> 0x0114 }
            com.google.android.gms.internal.ads.js r6 = r11.f16056h     // Catch:{ f80 -> 0x0114 }
            java.lang.String r9 = "1"
            com.google.android.gms.internal.ads.mf r10 = r11.f16054f     // Catch:{ f80 -> 0x0114 }
            e8.y30 r3 = androidx.appcompat.widget.p.o(r5, r6, r7, r8, r9, r10)     // Catch:{ f80 -> 0x0114 }
            byte[] r4 = r3.f17574b     // Catch:{ f80 -> 0x0114 }
            if (r4 == 0) goto L_0x0107
            int r5 = r4.length     // Catch:{ f80 -> 0x0114 }
            if (r5 != 0) goto L_0x0039
            goto L_0x0107
        L_0x0039:
            com.google.android.gms.internal.ads.mp r4 = com.google.android.gms.internal.ads.mp.L(r4)     // Catch:{ f80 -> 0x0114 }
            com.google.android.gms.internal.ads.up r5 = com.google.android.gms.internal.ads.up.b()     // Catch:{ f80 -> 0x0114 }
            com.google.android.gms.internal.ads.ls r4 = com.google.android.gms.internal.ads.ls.y(r4, r5)     // Catch:{ f80 -> 0x0114 }
            com.google.android.gms.internal.ads.ms r5 = r4.z()     // Catch:{ f80 -> 0x0114 }
            java.lang.String r5 = r5.E()     // Catch:{ f80 -> 0x0114 }
            boolean r5 = r5.isEmpty()     // Catch:{ f80 -> 0x0114 }
            r6 = 0
            if (r5 != 0) goto L_0x00a2
            com.google.android.gms.internal.ads.ms r5 = r4.z()     // Catch:{ f80 -> 0x0114 }
            java.lang.String r5 = r5.F()     // Catch:{ f80 -> 0x0114 }
            boolean r5 = r5.isEmpty()     // Catch:{ f80 -> 0x0114 }
            if (r5 != 0) goto L_0x00a2
            com.google.android.gms.internal.ads.mp r5 = r4.B()     // Catch:{ f80 -> 0x0114 }
            byte[] r5 = r5.c()     // Catch:{ f80 -> 0x0114 }
            int r5 = r5.length     // Catch:{ f80 -> 0x0114 }
            if (r5 != 0) goto L_0x006e
            goto L_0x00a2
        L_0x006e:
            e8.wz r5 = r11.m(r2)     // Catch:{ f80 -> 0x0114 }
            if (r5 != 0) goto L_0x0075
            goto L_0x00a0
        L_0x0075:
            java.lang.Object r5 = r5.f17418a     // Catch:{ f80 -> 0x0114 }
            com.google.android.gms.internal.ads.ms r5 = (com.google.android.gms.internal.ads.ms) r5     // Catch:{ f80 -> 0x0114 }
            if (r5 != 0) goto L_0x007c
            goto L_0x00a0
        L_0x007c:
            com.google.android.gms.internal.ads.ms r7 = r4.z()     // Catch:{ f80 -> 0x0114 }
            java.lang.String r7 = r7.E()     // Catch:{ f80 -> 0x0114 }
            java.lang.String r8 = r5.E()     // Catch:{ f80 -> 0x0114 }
            boolean r7 = r7.equals(r8)     // Catch:{ f80 -> 0x0114 }
            if (r7 == 0) goto L_0x00a0
            com.google.android.gms.internal.ads.ms r7 = r4.z()     // Catch:{ f80 -> 0x0114 }
            java.lang.String r7 = r7.F()     // Catch:{ f80 -> 0x0114 }
            java.lang.String r5 = r5.F()     // Catch:{ f80 -> 0x0114 }
            boolean r5 = r7.equals(r5)     // Catch:{ f80 -> 0x0114 }
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            r5 = 1
            goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            if (r5 != 0) goto L_0x00b3
            com.google.android.gms.internal.ads.mf r2 = r11.f16054f     // Catch:{ f80 -> 0x0114 }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ f80 -> 0x0114 }
            long r4 = r4 - r0
            r2.e(r3, r4)     // Catch:{ f80 -> 0x0114 }
            goto L_0x0121
        L_0x00b3:
            e8.y10 r5 = r11.f16057i     // Catch:{ f80 -> 0x0114 }
            int r3 = r3.f17575c     // Catch:{ f80 -> 0x0114 }
            e8.l<java.lang.Boolean> r7 = e8.t.f16586h1     // Catch:{ f80 -> 0x0114 }
            e8.ti0 r8 = e8.ti0.f16763j     // Catch:{ f80 -> 0x0114 }
            com.google.android.gms.internal.ads.e r8 = r8.f16769f     // Catch:{ f80 -> 0x0114 }
            java.lang.Object r7 = r8.a(r7)     // Catch:{ f80 -> 0x0114 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ f80 -> 0x0114 }
            boolean r7 = r7.booleanValue()     // Catch:{ f80 -> 0x0114 }
            if (r7 == 0) goto L_0x00dd
            r7 = 3
            if (r3 != r7) goto L_0x00d3
            com.google.android.gms.internal.ads.gg r3 = r11.f16051c     // Catch:{ f80 -> 0x0114 }
            boolean r6 = r3.c(r4)     // Catch:{ f80 -> 0x0114 }
            goto L_0x00e3
        L_0x00d3:
            r7 = 4
            if (r3 != r7) goto L_0x00e3
            com.google.android.gms.internal.ads.gg r3 = r11.f16051c     // Catch:{ f80 -> 0x0114 }
            boolean r6 = r3.d(r4, r5)     // Catch:{ f80 -> 0x0114 }
            goto L_0x00e3
        L_0x00dd:
            com.google.android.gms.internal.ads.fg r3 = r11.f16050b     // Catch:{ f80 -> 0x0114 }
            boolean r6 = r3.a(r4, r5)     // Catch:{ f80 -> 0x0114 }
        L_0x00e3:
            if (r6 != 0) goto L_0x00f2
            com.google.android.gms.internal.ads.mf r2 = r11.f16054f     // Catch:{ f80 -> 0x0114 }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ f80 -> 0x0114 }
            long r4 = r4 - r0
            r2.e(r3, r4)     // Catch:{ f80 -> 0x0114 }
            goto L_0x0121
        L_0x00f2:
            e8.wz r2 = r11.m(r2)     // Catch:{ f80 -> 0x0114 }
            if (r2 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.hg r3 = r11.f16052d     // Catch:{ f80 -> 0x0114 }
            r3.d(r2)     // Catch:{ f80 -> 0x0114 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ f80 -> 0x0114 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r11.f16058r = r2     // Catch:{ f80 -> 0x0114 }
            goto L_0x0121
        L_0x0107:
            com.google.android.gms.internal.ads.mf r2 = r11.f16054f     // Catch:{ f80 -> 0x0114 }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ f80 -> 0x0114 }
            long r4 = r4 - r0
            r2.e(r3, r4)     // Catch:{ f80 -> 0x0114 }
            goto L_0x0121
        L_0x0114:
            r2 = move-exception
            com.google.android.gms.internal.ads.mf r11 = r11.f16054f
            r3 = 4002(0xfa2, float:5.608E-42)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            r11.a(r3, r4, r2)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.q10.l(e8.q10):void");
    }

    public final void a(View view) {
        this.f16053e.f6316c.e(view);
    }

    public final void b(int i10, int i11, int i12) {
    }

    public final String c(Context context) {
        String f10;
        k();
        j30 c10 = this.f16052d.c();
        if (c10 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eg egVar = (eg) c10;
        synchronized (egVar) {
            Map<String, Object> b10 = ((er) egVar.f6285c).b();
            HashMap hashMap = (HashMap) b10;
            hashMap.put("f", "q");
            hashMap.put("ctx", context);
            hashMap.put("aid", (Object) null);
            f10 = eg.f(egVar.e(b10));
        }
        this.f16054f.c(5001, System.currentTimeMillis() - currentTimeMillis, f10);
        return f10;
    }

    public final String d(Context context, View view, Activity activity) {
        String f10;
        k();
        j30 c10 = this.f16052d.c();
        if (c10 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eg egVar = (eg) c10;
        synchronized (egVar) {
            Map<String, Object> a10 = ((er) egVar.f6285c).a();
            HashMap hashMap = (HashMap) a10;
            hashMap.put("f", "v");
            hashMap.put("ctx", context);
            hashMap.put("aid", (Object) null);
            hashMap.put("view", view);
            hashMap.put("act", activity);
            f10 = eg.f(egVar.e(a10));
        }
        this.f16054f.c(5002, System.currentTimeMillis() - currentTimeMillis, f10);
        return f10;
    }

    public final String e(Context context, String str, View view) {
        return g(context, str, view, (Activity) null);
    }

    public final void f(MotionEvent motionEvent) {
        j30 c10 = this.f16052d.c();
        if (c10 != null) {
            try {
                ((eg) c10).b((String) null, motionEvent);
            } catch (z30 e10) {
                this.f16054f.a(e10.f17687a, -1, e10);
            }
        }
    }

    public final String g(Context context, String str, View view, Activity activity) {
        String f10;
        k();
        j30 c10 = this.f16052d.c();
        if (c10 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eg egVar = (eg) c10;
        synchronized (egVar) {
            er erVar = (er) egVar.f6285c;
            Map<String, Object> a10 = erVar.a();
            ((HashMap) a10).put("lts", Long.valueOf(erVar.f6316c.c()));
            HashMap hashMap = (HashMap) a10;
            hashMap.put("f", "c");
            hashMap.put("ctx", context);
            hashMap.put("cs", str);
            hashMap.put("aid", (Object) null);
            hashMap.put("view", view);
            hashMap.put("act", activity);
            f10 = eg.f(egVar.e(a10));
        }
        this.f16054f.c(5000, System.currentTimeMillis() - currentTimeMillis, f10);
        return f10;
    }

    public final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        wz m10 = m(1);
        if (m10 != null) {
            this.f16052d.d(m10);
        } else {
            this.f16054f.e(4013, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if ((((com.google.android.gms.internal.ads.ms) r1.f17418a).G() - (java.lang.System.currentTimeMillis() / 1000) < 3600) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r9 = this;
            boolean r0 = r9.f16060t
            if (r0 != 0) goto L_0x0061
            java.lang.Object r0 = r9.f16059s
            monitor-enter(r0)
            boolean r1 = r9.f16060t     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005e }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r5 = r9.f16058r     // Catch:{ all -> 0x005e }
            long r1 = r1 - r5
            r5 = 3600(0xe10, double:1.7786E-320)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.hg r1 = r9.f16052d     // Catch:{ all -> 0x005e }
            java.lang.Object r2 = r1.f6864f     // Catch:{ all -> 0x005e }
            monitor-enter(r2)     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.eg r1 = r1.f6863e     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x002a
            e8.wz r1 = r1.f6284b     // Catch:{ all -> 0x0059 }
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            goto L_0x002c
        L_0x002a:
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r1.f17418a     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.ms r1 = (com.google.android.gms.internal.ads.ms) r1     // Catch:{ all -> 0x005e }
            long r1 = r1.G()     // Catch:{ all -> 0x005e }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005e }
            long r7 = r7 / r3
            long r1 = r1 - r7
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0042
            r1 = 1
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            if (r1 == 0) goto L_0x005c
        L_0x0045:
            com.google.android.gms.internal.ads.js r1 = r9.f16056h     // Catch:{ all -> 0x005e }
            boolean r1 = t1.c.i(r1)     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x004e
            goto L_0x005c
        L_0x004e:
            java.util.concurrent.Executor r1 = r9.f16055g     // Catch:{ all -> 0x005e }
            e8.s30 r2 = new e8.s30     // Catch:{ all -> 0x005e }
            r2.<init>((e8.q10) r9)     // Catch:{ all -> 0x005e }
            r1.execute(r2)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0059:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r1
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.q10.k():void");
    }

    public final wz m(int i10) {
        wz wzVar = null;
        if (!c.i(this.f16056h)) {
            return null;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16586h1)).booleanValue()) {
            gg ggVar = this.f16051c;
            ggVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (gg.f6639e) {
                ms h10 = ggVar.h(i10);
                if (h10 == null) {
                    ggVar.a(4022, currentTimeMillis);
                } else {
                    File i11 = ggVar.i(h10.E());
                    File file = new File(i11, "pcam.jar");
                    if (!file.exists()) {
                        file = new File(i11, "pcam");
                    }
                    File file2 = new File(i11, "pcbc");
                    File file3 = new File(i11, "pcopt");
                    ggVar.a(5016, currentTimeMillis);
                    wzVar = new wz(h10, file, file2, file3);
                }
            }
            return wzVar;
        }
        fg fgVar = this.f16050b;
        ms e10 = fgVar.e(i10);
        if (e10 == null) {
            return null;
        }
        String E = e10.E();
        File t10 = e.t(E, "pcam.jar", fgVar.b());
        if (!t10.exists()) {
            t10 = e.t(E, "pcam", fgVar.b());
        }
        return new wz(e10, t10, e.t(E, "pcbc", fgVar.b()), e.t(E, "pcopt", fgVar.b()));
    }
}
