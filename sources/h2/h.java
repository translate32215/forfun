package h2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import g2.a;
import g2.e;
import g2.i;
import java.util.List;
import o2.l;
import p2.d;
import p2.g;
import p2.j;
import r2.b;

/* compiled from: WorkManagerImpl */
public class h extends g2.h {

    /* renamed from: j  reason: collision with root package name */
    public static h f18825j;

    /* renamed from: k  reason: collision with root package name */
    public static h f18826k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f18827l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f18828a;

    /* renamed from: b  reason: collision with root package name */
    public a f18829b;

    /* renamed from: c  reason: collision with root package name */
    public WorkDatabase f18830c;

    /* renamed from: d  reason: collision with root package name */
    public r2.a f18831d;

    /* renamed from: e  reason: collision with root package name */
    public List<d> f18832e;

    /* renamed from: f  reason: collision with root package name */
    public c f18833f;

    /* renamed from: g  reason: collision with root package name */
    public g f18834g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18835h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f18836i;

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013a A[Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013c A[Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0165  */
    public h(android.content.Context r26, g2.a r27, r2.a r28) {
        /*
            r25 = this;
            r1 = r25
            r8 = r27
            r9 = r28
            android.content.res.Resources r0 = r26.getResources()
            r2 = 2131034117(0x7f050005, float:1.7678742E38)
            boolean r0 = r0.getBoolean(r2)
            r2 = 0
            r1.<init>(r2)
            android.content.Context r3 = r26.getApplicationContext()
            java.util.concurrent.Executor r4 = r8.f18388b
            int r5 = androidx.work.impl.WorkDatabase.f3256k
            java.lang.Class<androidx.work.impl.WorkDatabase> r5 = androidx.work.impl.WorkDatabase.class
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x002b
            t1.e$a r0 = new t1.e$a
            r0.<init>(r3, r5, r6)
            r0.f25389h = r7
            goto L_0x0034
        L_0x002b:
            t1.e$a r0 = new t1.e$a
            java.lang.String r6 = "androidx.work.workdb"
            r0.<init>(r3, r5, r6)
            r0.f25386e = r4
        L_0x0034:
            h2.g r4 = new h2.g
            r4.<init>()
            java.util.ArrayList<t1.e$b> r5 = r0.f25385d
            if (r5 != 0) goto L_0x0044
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.f25385d = r5
        L_0x0044:
            java.util.ArrayList<t1.e$b> r5 = r0.f25385d
            r5.add(r4)
            u1.a[] r4 = new u1.a[r7]
            u1.a r5 = androidx.work.impl.a.f3264a
            r4[r2] = r5
            r0.a(r4)
            u1.a[] r4 = new u1.a[r7]
            androidx.work.impl.a$d r5 = new androidx.work.impl.a$d
            r6 = 2
            r10 = 3
            r5.<init>(r3, r6, r10)
            r4[r2] = r5
            r0.a(r4)
            u1.a[] r4 = new u1.a[r7]
            u1.a r5 = androidx.work.impl.a.f3265b
            r4[r2] = r5
            r0.a(r4)
            u1.a[] r4 = new u1.a[r7]
            u1.a r5 = androidx.work.impl.a.f3266c
            r4[r2] = r5
            r0.a(r4)
            u1.a[] r4 = new u1.a[r7]
            androidx.work.impl.a$d r5 = new androidx.work.impl.a$d
            r6 = 5
            r10 = 6
            r5.<init>(r3, r6, r10)
            r4[r2] = r5
            r0.a(r4)
            r0.f25390i = r2
            r0.f25391j = r7
            android.content.Context r12 = r0.f25384c
            if (r12 == 0) goto L_0x02c3
            java.lang.Class<T> r2 = r0.f25382a
            if (r2 == 0) goto L_0x02ba
            java.util.concurrent.Executor r2 = r0.f25386e
            if (r2 != 0) goto L_0x009b
            java.util.concurrent.Executor r4 = r0.f25387f
            if (r4 != 0) goto L_0x009b
            java.util.concurrent.Executor r2 = l.a.f20959c
            r0.f25387f = r2
            r0.f25386e = r2
            goto L_0x00ac
        L_0x009b:
            if (r2 == 0) goto L_0x00a4
            java.util.concurrent.Executor r4 = r0.f25387f
            if (r4 != 0) goto L_0x00a4
            r0.f25387f = r2
            goto L_0x00ac
        L_0x00a4:
            if (r2 != 0) goto L_0x00ac
            java.util.concurrent.Executor r2 = r0.f25387f
            if (r2 == 0) goto L_0x00ac
            r0.f25386e = r2
        L_0x00ac:
            x1.b$b r2 = r0.f25388g
            if (r2 != 0) goto L_0x00b7
            y1.c r2 = new y1.c
            r2.<init>()
            r0.f25388g = r2
        L_0x00b7:
            t1.a r2 = new t1.a
            java.lang.String r13 = r0.f25383b
            x1.b$b r14 = r0.f25388g
            t1.e$c r15 = r0.f25392k
            java.util.ArrayList<t1.e$b> r4 = r0.f25385d
            boolean r5 = r0.f25389h
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = "activity"
            java.lang.Object r7 = r12.getSystemService(r7)
            android.app.ActivityManager r7 = (android.app.ActivityManager) r7
            if (r7 == 0) goto L_0x00dd
            r10 = 19
            if (r6 < r10) goto L_0x00d8
            boolean r7 = r7.isLowRamDevice()
            goto L_0x00d9
        L_0x00d8:
            r7 = 0
        L_0x00d9:
            if (r7 != 0) goto L_0x00dd
            r7 = 3
            goto L_0x00de
        L_0x00dd:
            r7 = 2
        L_0x00de:
            java.util.concurrent.Executor r10 = r0.f25386e
            java.util.concurrent.Executor r11 = r0.f25387f
            r21 = 0
            boolean r9 = r0.f25390i
            boolean r1 = r0.f25391j
            r24 = 0
            r20 = r11
            r11 = r2
            r16 = r4
            r17 = r5
            r18 = r7
            r19 = r10
            r22 = r9
            r23 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Class<T> r0 = r0.f25382a
            java.lang.Package r1 = r0.getPackage()
            java.lang.String r1 = r1.getName()
            java.lang.String r9 = r0.getCanonicalName()
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L_0x0111
            goto L_0x011b
        L_0x0111:
            int r11 = r1.length()
            int r11 = r11 + 1
            java.lang.String r9 = r9.substring(r11)
        L_0x011b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = 46
            r13 = 95
            java.lang.String r9 = r9.replace(r12, r13)
            r11.append(r9)
            java.lang.String r9 = "_Impl"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            boolean r11 = r1.isEmpty()     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            if (r11 == 0) goto L_0x013c
            r1 = r9
            goto L_0x0150
        L_0x013c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            r11.<init>()     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            r11.append(r1)     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            java.lang.String r1 = "."
            r11.append(r1)     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            r11.append(r9)     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            java.lang.String r1 = r11.toString()     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
        L_0x0150:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            java.lang.Object r0 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0294, IllegalAccessException -> 0x027b, InstantiationException -> 0x0262 }
            t1.e r0 = (t1.e) r0
            x1.b r1 = r0.f(r2)
            r0.f25375c = r1
            r2 = 3
            if (r7 != r2) goto L_0x0165
            r2 = 1
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            y1.b r1 = (y1.b) r1
            y1.b$a r1 = r1.f27983a
            r1.setWriteAheadLoggingEnabled(r2)
            r0.f25379g = r4
            r0.f25374b = r10
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f25377e = r5
            r0.f25378f = r2
            r1 = r0
            androidx.work.impl.WorkDatabase r1 = (androidx.work.impl.WorkDatabase) r1
            g2.e$a r0 = new g2.e$a
            int r2 = r8.f18390d
            r0.<init>(r2)
            java.lang.Class<g2.e> r2 = g2.e.class
            monitor-enter(r2)
            g2.e.f18408a = r0     // Catch:{ all -> 0x025c }
            monitor-exit(r2)
            r0 = 2
            h2.d[] r2 = new h2.d[r0]
            java.lang.String r0 = h2.e.f18814a
            r0 = 23
            if (r6 < r0) goto L_0x01b1
            k2.b r0 = new k2.b
            r10 = r25
            r0.<init>(r3, r10)
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r4 = androidx.work.impl.background.systemjob.SystemJobService.class
            r5 = 1
            p2.f.a(r3, r4, r5)
            g2.e r4 = g2.e.c()
            java.lang.String r5 = h2.e.f18814a
            r6 = 0
            java.lang.Throwable[] r6 = new java.lang.Throwable[r6]
            java.lang.String r7 = "Created SystemJobScheduler and enabled SystemJobService"
            r4.a(r5, r7, r6)
            r4 = 1
            r5 = 0
            goto L_0x0217
        L_0x01b1:
            r10 = r25
            java.lang.String r0 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01e9 }
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x01e9 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x01e9 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch:{ all -> 0x01e9 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e9 }
            r4[r7] = r3     // Catch:{ all -> 0x01e9 }
            java.lang.Object r0 = r0.newInstance(r4)     // Catch:{ all -> 0x01e9 }
            h2.d r0 = (h2.d) r0     // Catch:{ all -> 0x01e9 }
            g2.e r4 = g2.e.c()     // Catch:{ all -> 0x01e9 }
            java.lang.String r5 = h2.e.f18814a     // Catch:{ all -> 0x01e9 }
            java.lang.String r6 = "Created %s"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x01e9 }
            java.lang.String r9 = "androidx.work.impl.background.gcm.GcmScheduler"
            r11 = 0
            r7[r11] = r9     // Catch:{ all -> 0x01e9 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x01e9 }
            java.lang.Throwable[] r7 = new java.lang.Throwable[r11]     // Catch:{ all -> 0x01e9 }
            r4.a(r5, r6, r7)     // Catch:{ all -> 0x01e9 }
            goto L_0x01fc
        L_0x01e9:
            r0 = move-exception
            g2.e r4 = g2.e.c()
            java.lang.String r5 = h2.e.f18814a
            r6 = 1
            java.lang.Throwable[] r7 = new java.lang.Throwable[r6]
            r9 = 0
            r7[r9] = r0
            java.lang.String r0 = "Unable to create GCM Scheduler"
            r4.a(r5, r0, r7)
            r0 = 0
        L_0x01fc:
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0217
            j2.b r0 = new j2.b
            r0.<init>(r3)
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r6 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            p2.f.a(r3, r6, r4)
            g2.e r6 = g2.e.c()
            java.lang.String r7 = h2.e.f18814a
            java.lang.Throwable[] r9 = new java.lang.Throwable[r5]
            java.lang.String r11 = "Created SystemAlarmScheduler"
            r6.a(r7, r11, r9)
        L_0x0217:
            r2[r5] = r0
            i2.a r0 = new i2.a
            r9 = r28
            r0.<init>(r3, r9, r10)
            r2[r4] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            h2.c r11 = new h2.c
            r2 = r11
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r1
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            android.content.Context r2 = r26.getApplicationContext()
            r10.f18828a = r2
            r10.f18829b = r8
            r10.f18831d = r9
            r10.f18830c = r1
            r10.f18832e = r0
            r10.f18833f = r11
            p2.g r0 = new p2.g
            r0.<init>(r2)
            r10.f18834g = r0
            r0 = 0
            r10.f18835h = r0
            androidx.work.impl.utils.ForceStopRunnable r0 = new androidx.work.impl.utils.ForceStopRunnable
            r0.<init>(r2, r10)
            r1 = r9
            r2.b r1 = (r2.b) r1
            java.util.concurrent.Executor r1 = r1.f24500a
            r1.execute(r0)
            return
        L_0x025c:
            r0 = move-exception
            r10 = r25
            r1 = r0
            monitor-exit(r2)
            throw r1
        L_0x0262:
            r10 = r25
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to create an instance of "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x027b:
            r10 = r25
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Cannot access the constructor"
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0294:
            r10 = r25
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "cannot find implementation for "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.String r0 = r0.getCanonicalName()
            r2.append(r0)
            java.lang.String r0 = ". "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " does not exist"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x02ba:
            r10 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must provide an abstract class that extends RoomDatabase"
            r0.<init>(r1)
            throw r0
        L_0x02c3:
            r10 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot provide null context for the database."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h.<init>(android.content.Context, g2.a, r2.a):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static h2.h c(android.content.Context r2) {
        /*
            java.lang.Object r0 = f18827l
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0035 }
            h2.h r1 = f18825j     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            h2.h r1 = f18826k     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0035 }
            boolean r1 = r2 instanceof g2.a.b     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            g2.a$b r1 = (g2.a.b) r1     // Catch:{ all -> 0x0035 }
            g2.a r1 = r1.a()     // Catch:{ all -> 0x0035 }
            d(r2, r1)     // Catch:{ all -> 0x0035 }
            h2.h r1 = c(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r2
        L_0x0035:
            r2 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h.c(android.content.Context):h2.h");
    }

    public static void d(Context context, a aVar) {
        synchronized (f18827l) {
            h hVar = f18825j;
            if (hVar != null) {
                if (f18826k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (hVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f18826k == null) {
                    f18826k = new h(applicationContext, aVar, new b(aVar.f18388b));
                }
                f18825j = f18826k;
            }
        }
    }

    public g2.g b(List<? extends i> list) {
        if (!list.isEmpty()) {
            f fVar = new f(this, list);
            if (!fVar.f18823h) {
                d dVar = new d(fVar);
                ((b) this.f18831d).f24500a.execute(dVar);
                fVar.f18824i = dVar.f23784b;
            } else {
                e.c().f(f.f18815j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", fVar.f18820e)}), new Throwable[0]);
            }
            return fVar.f18824i;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public void e() {
        List<JobInfo> e10;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f18828a;
            String str = k2.b.f19881f;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (!(jobScheduler == null || (e10 = k2.b.e(context, jobScheduler)) == null || e10.isEmpty())) {
                for (JobInfo id2 : e10) {
                    k2.b.a(jobScheduler, id2.getId());
                }
            }
        }
        l lVar = (l) this.f18830c.n();
        lVar.f22882a.b();
        y1.e a10 = lVar.f22890i.a();
        lVar.f22882a.c();
        try {
            a10.a();
            lVar.f22882a.j();
            lVar.f22882a.g();
            t1.h hVar = lVar.f22890i;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
            e.a(this.f18829b, this.f18830c, this.f18832e);
        } catch (Throwable th) {
            lVar.f22882a.g();
            lVar.f22890i.c(a10);
            throw th;
        }
    }

    public void f(String str) {
        r2.a aVar = this.f18831d;
        ((b) aVar).f24500a.execute(new j(this, str));
    }
}
