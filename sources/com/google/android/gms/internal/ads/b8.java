package com.google.android.gms.internal.ads;

import android.content.Context;
import e8.cp;
import e8.de;
import e8.et;
import e8.mr;
import e8.o50;
import e8.od;
import e8.qd;
import e8.t20;
import e8.td;
import e8.ue;
import e8.yd;
import e8.zd;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class b8 implements ue {
    @GuardedBy("AppComponent.class")

    /* renamed from: a  reason: collision with root package name */
    public static b8 f5996a;

    public static b8 b(Context context, s2 s2Var, int i10) {
        b8 z10 = z(context, i10);
        z10.j().f6632b.compareAndSet((Object) null, s2Var);
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (f5996a != null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = new com.google.android.gms.internal.ads.c8.a();
        r2.f6075a = r2;
        r2.f6077c = new java.lang.ref.WeakReference<>(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r17.getApplicationContext() == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r3 = r17.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r2.f6076b = r3;
        f5996a = new e8.nd(new com.google.android.gms.internal.ads.c8(r2, (p.a) null), new com.google.android.gms.internal.ads.k8(r1), new com.google.android.gms.internal.ads.bp(1), new e8.b5(1), new x3.d(3), (u.b) null);
        e8.t.a(r17);
        d7.l.B.f13190g.d(r0, r2);
        d7.l.B.f13192i.b(r0);
        r2 = d7.l.B.f13186c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r2.f5708f == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r4 = new android.content.IntentFilter();
        r4.addAction("android.intent.action.USER_PRESENT");
        r4.addAction("android.intent.action.SCREEN_OFF");
        r17.getApplicationContext().registerReceiver(new f7.k0(r2, (p.a) null), r4);
        r2.f5708f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009d, code lost:
        r2 = d7.l.B.f13186c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        if (r2.f5709g == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        r4 = new android.content.IntentFilter();
        r4.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        r17.getApplicationContext().registerReceiver(new f7.l0(r2), r4);
        r2.f5709g = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        r2 = d7.l.B.f13186c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c6, code lost:
        if (z7.h.d() != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r2 = new android.app.NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
        r2.setShowBadge(false);
        ((android.app.NotificationManager) r0.getSystemService(android.app.NotificationManager.class)).createNotificationChannel(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        e.i.h(r17);
        d7.l.B.f13189f.c(r0);
        d7.l.B.f13208y.a(r0);
        r2 = d7.l.B.f13190g.f();
        ((com.google.android.gms.ads.internal.util.o) r2).r(r0, (java.lang.String) null, true);
        r1 = com.google.android.gms.internal.ads.o6.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0103, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0106, code lost:
        if (com.google.android.gms.internal.ads.o6.f7669c != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0108, code lost:
        com.google.android.gms.internal.ads.o6.f7669c = new com.google.android.gms.internal.ads.o6(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        if (((java.lang.Boolean) e8.ti0.f16763j.f16769f.a(e8.t.f16690y3)).booleanValue() == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0132, code lost:
        if (((java.lang.Boolean) e8.ti0.f16763j.f16769f.a(e8.t.f16585h0)).booleanValue() != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        r4 = new com.google.android.gms.internal.ads.nv(new e8.th0(r0));
        r11 = new e8.vs(new e8.us(r0), f5996a.h());
        r1 = d7.l.B.f13186c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r11.a(new com.google.android.gms.internal.ads.ri(new com.google.android.gms.internal.ads.sb(r17, r2, r4, r11, com.google.android.gms.ads.internal.util.p.K(), f5996a.d())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        if (r0.length() != 0) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0180, code lost:
        r0 = "Error in offline signals database startup: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0185, code lost:
        r0 = new java.lang.String("Error in offline signals database startup: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018a, code lost:
        l0.e.I(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        r2 = new e8.f9((int) com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, r18, true, false, false);
        r1 = new com.google.android.gms.internal.ads.e8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        monitor-enter(r8);
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.b8 z(android.content.Context r17, int r18) {
        /*
            r0 = r17
            java.lang.Class<com.google.android.gms.internal.ads.b8> r8 = com.google.android.gms.internal.ads.b8.class
            monitor-enter(r8)
            com.google.android.gms.internal.ads.b8 r1 = f5996a     // Catch:{ all -> 0x0198 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r8)     // Catch:{ all -> 0x0198 }
            return r1
        L_0x000b:
            monitor-exit(r8)     // Catch:{ all -> 0x0198 }
            e8.f9 r9 = new e8.f9
            r3 = 204102000(0xc2a5970, float:1.3123238E-31)
            r5 = 1
            r6 = 0
            r7 = 0
            r2 = r9
            r4 = r18
            r2.<init>((int) r3, (int) r4, (boolean) r5, (boolean) r6, (boolean) r7)
            com.google.android.gms.internal.ads.e8 r1 = new com.google.android.gms.internal.ads.e8
            r1.<init>()
            monitor-enter(r8)
            com.google.android.gms.internal.ads.b8 r2 = f5996a     // Catch:{ all -> 0x0195 }
            if (r2 != 0) goto L_0x0191
            com.google.android.gms.internal.ads.c8$a r2 = new com.google.android.gms.internal.ads.c8$a     // Catch:{ all -> 0x0195 }
            r2.<init>()     // Catch:{ all -> 0x0195 }
            r2.f6075a = r9     // Catch:{ all -> 0x0195 }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0195 }
            r3.<init>(r0)     // Catch:{ all -> 0x0195 }
            r2.f6077c = r3     // Catch:{ all -> 0x0195 }
            android.content.Context r3 = r17.getApplicationContext()     // Catch:{ all -> 0x0195 }
            if (r3 == 0) goto L_0x003d
            android.content.Context r3 = r17.getApplicationContext()     // Catch:{ all -> 0x0195 }
            goto L_0x003e
        L_0x003d:
            r3 = r0
        L_0x003e:
            r2.f6076b = r3     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.c8 r11 = new com.google.android.gms.internal.ads.c8     // Catch:{ all -> 0x0195 }
            r3 = 0
            r11.<init>(r2, r3)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.k8 r12 = new com.google.android.gms.internal.ads.k8     // Catch:{ all -> 0x0195 }
            r12.<init>(r1)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.bp r13 = new com.google.android.gms.internal.ads.bp     // Catch:{ all -> 0x0195 }
            r1 = 1
            r13.<init>(r1)     // Catch:{ all -> 0x0195 }
            e8.b5 r14 = new e8.b5     // Catch:{ all -> 0x0195 }
            r14.<init>(r1)     // Catch:{ all -> 0x0195 }
            x3.d r15 = new x3.d     // Catch:{ all -> 0x0195 }
            r2 = 3
            r15.<init>(r2)     // Catch:{ all -> 0x0195 }
            e8.nd r2 = new e8.nd     // Catch:{ all -> 0x0195 }
            r16 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0195 }
            f5996a = r2     // Catch:{ all -> 0x0195 }
            e8.t.a(r17)     // Catch:{ all -> 0x0195 }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g     // Catch:{ all -> 0x0195 }
            r2.d(r0, r9)     // Catch:{ all -> 0x0195 }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.gv r2 = r2.f13192i     // Catch:{ all -> 0x0195 }
            r2.b(r0)     // Catch:{ all -> 0x0195 }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c     // Catch:{ all -> 0x0195 }
            boolean r4 = r2.f5708f     // Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x0080
            goto L_0x009d
        L_0x0080:
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ all -> 0x0195 }
            r4.<init>()     // Catch:{ all -> 0x0195 }
            java.lang.String r5 = "android.intent.action.USER_PRESENT"
            r4.addAction(r5)     // Catch:{ all -> 0x0195 }
            java.lang.String r5 = "android.intent.action.SCREEN_OFF"
            r4.addAction(r5)     // Catch:{ all -> 0x0195 }
            android.content.Context r5 = r17.getApplicationContext()     // Catch:{ all -> 0x0195 }
            f7.k0 r6 = new f7.k0     // Catch:{ all -> 0x0195 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0195 }
            r5.registerReceiver(r6, r4)     // Catch:{ all -> 0x0195 }
            r2.f5708f = r1     // Catch:{ all -> 0x0195 }
        L_0x009d:
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c     // Catch:{ all -> 0x0195 }
            boolean r4 = r2.f5709g     // Catch:{ all -> 0x0195 }
            if (r4 == 0) goto L_0x00a6
            goto L_0x00be
        L_0x00a6:
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ all -> 0x0195 }
            r4.<init>()     // Catch:{ all -> 0x0195 }
            java.lang.String r5 = "com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED"
            r4.addAction(r5)     // Catch:{ all -> 0x0195 }
            android.content.Context r5 = r17.getApplicationContext()     // Catch:{ all -> 0x0195 }
            f7.l0 r6 = new f7.l0     // Catch:{ all -> 0x0195 }
            r6.<init>(r2)     // Catch:{ all -> 0x0195 }
            r5.registerReceiver(r6, r4)     // Catch:{ all -> 0x0195 }
            r2.f5709g = r1     // Catch:{ all -> 0x0195 }
        L_0x00be:
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c     // Catch:{ all -> 0x0195 }
            boolean r2 = z7.h.d()     // Catch:{ all -> 0x0195 }
            if (r2 != 0) goto L_0x00c9
            goto L_0x00e2
        L_0x00c9:
            android.app.NotificationChannel r2 = new android.app.NotificationChannel     // Catch:{ all -> 0x0195 }
            r4 = 2
            java.lang.String r5 = "offline_notification_channel"
            java.lang.String r6 = "AdMob Offline Notifications"
            r2.<init>(r5, r6, r4)     // Catch:{ all -> 0x0195 }
            r4 = 0
            r2.setShowBadge(r4)     // Catch:{ all -> 0x0195 }
            java.lang.Class<android.app.NotificationManager> r4 = android.app.NotificationManager.class
            java.lang.Object r4 = r0.getSystemService(r4)     // Catch:{ all -> 0x0195 }
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4     // Catch:{ all -> 0x0195 }
            r4.createNotificationChannel(r2)     // Catch:{ all -> 0x0195 }
        L_0x00e2:
            e.i.h(r17)     // Catch:{ all -> 0x0195 }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.pu r2 = r2.f13189f     // Catch:{ all -> 0x0195 }
            r2.c(r0)     // Catch:{ all -> 0x0195 }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.ads.internal.util.n r2 = r2.f13208y     // Catch:{ all -> 0x0195 }
            r2.a(r0)     // Catch:{ all -> 0x0195 }
            d7.l r2 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g     // Catch:{ all -> 0x0195 }
            f7.d0 r2 = r2.f()     // Catch:{ all -> 0x0195 }
            r4 = r2
            com.google.android.gms.ads.internal.util.o r4 = (com.google.android.gms.ads.internal.util.o) r4     // Catch:{ all -> 0x0195 }
            r4.r(r0, r3, r1)     // Catch:{ all -> 0x0195 }
            java.lang.Class<com.google.android.gms.internal.ads.o6> r1 = com.google.android.gms.internal.ads.o6.class
            monitor-enter(r1)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.o6 r3 = com.google.android.gms.internal.ads.o6.f7669c     // Catch:{ all -> 0x018e }
            if (r3 != 0) goto L_0x010f
            com.google.android.gms.internal.ads.o6 r3 = new com.google.android.gms.internal.ads.o6     // Catch:{ all -> 0x018e }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x018e }
            com.google.android.gms.internal.ads.o6.f7669c = r3     // Catch:{ all -> 0x018e }
        L_0x010f:
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            e8.l<java.lang.Boolean> r1 = e8.t.f16690y3     // Catch:{ all -> 0x0195 }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x0195 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x0195 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0195 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x0191
            e8.l<java.lang.Boolean> r1 = e8.t.f16585h0     // Catch:{ all -> 0x0195 }
            e8.ti0 r2 = e8.ti0.f16763j     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.e r2 = r2.f16769f     // Catch:{ all -> 0x0195 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x0195 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0195 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0195 }
            if (r1 != 0) goto L_0x0191
            com.google.android.gms.internal.ads.sb r10 = new com.google.android.gms.internal.ads.sb     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.nv r4 = new com.google.android.gms.internal.ads.nv     // Catch:{ all -> 0x0195 }
            e8.th0 r1 = new e8.th0     // Catch:{ all -> 0x0195 }
            r1.<init>(r0)     // Catch:{ all -> 0x0195 }
            r4.<init>(r1)     // Catch:{ all -> 0x0195 }
            e8.vs r11 = new e8.vs     // Catch:{ all -> 0x0195 }
            e8.us r1 = new e8.us     // Catch:{ all -> 0x0195 }
            r1.<init>(r0)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.b8 r2 = f5996a     // Catch:{ all -> 0x0195 }
            e8.o50 r2 = r2.h()     // Catch:{ all -> 0x0195 }
            r11.<init>(r1, r2)     // Catch:{ all -> 0x0195 }
            d7.l r1 = d7.l.B     // Catch:{ all -> 0x0195 }
            com.google.android.gms.ads.internal.util.p r1 = r1.f13186c     // Catch:{ all -> 0x0195 }
            java.lang.String r6 = com.google.android.gms.ads.internal.util.p.K()     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.b8 r1 = f5996a     // Catch:{ all -> 0x0195 }
            e8.t20 r7 = r1.d()     // Catch:{ all -> 0x0195 }
            r1 = r10
            r2 = r17
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0195 }
            com.google.android.gms.internal.ads.ri r0 = new com.google.android.gms.internal.ads.ri     // Catch:{ Exception -> 0x016f }
            r0.<init>((com.google.android.gms.internal.ads.sb) r10)     // Catch:{ Exception -> 0x016f }
            r11.a(r0)     // Catch:{ Exception -> 0x016f }
            goto L_0x0191
        L_0x016f:
            r0 = move-exception
            java.lang.String r1 = "Error in offline signals database startup: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0195 }
            int r2 = r0.length()     // Catch:{ all -> 0x0195 }
            if (r2 == 0) goto L_0x0185
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x018a
        L_0x0185:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0195 }
            r0.<init>(r1)     // Catch:{ all -> 0x0195 }
        L_0x018a:
            l0.e.I(r0)     // Catch:{ all -> 0x0195 }
            goto L_0x0191
        L_0x018e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x0191:
            com.google.android.gms.internal.ads.b8 r0 = f5996a     // Catch:{ all -> 0x0195 }
            monitor-exit(r8)     // Catch:{ all -> 0x0195 }
            return r0
        L_0x0195:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0195 }
            throw r0
        L_0x0198:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0198 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b8.z(android.content.Context, int):com.google.android.gms.internal.ads.b8");
    }

    public final qd a(l5 l5Var, int i10) {
        return c(new se(l5Var, i10));
    }

    public abstract qd c(se seVar);

    public abstract t20 d();

    public abstract Executor e();

    public abstract ScheduledExecutorService f();

    public abstract Executor g();

    public abstract o50 h();

    public abstract d9 i();

    public abstract gb j();

    public abstract l8 k();

    public abstract zd l();

    public abstract g m();

    public abstract td n();

    public abstract td o();

    public abstract yd p();

    public abstract de q();

    public abstract mr r();

    public abstract od s();

    public abstract td t();

    public abstract yd u();

    public abstract j8 v();

    public abstract ld w();

    public abstract et x();

    public abstract ve<cp> y();
}
