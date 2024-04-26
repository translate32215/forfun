package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import g2.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler */
public class a implements h2.a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f3277d = e.e("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f3278a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, h2.a> f3279b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Object f3280c = new Object();

    public a(Context context) {
        this.f3278a = context;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f3280c) {
            h2.a remove = this.f3279b.remove(str);
            if (remove != null) {
                remove.a(str, z10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.content.Intent r11, int r12, androidx.work.impl.background.systemalarm.d r13) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x011c
            g2.e r0 = g2.e.c()
            java.lang.String r1 = f3277d
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r11
            java.lang.String r11 = "Handling constraints changed %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.a(r1, r11, r4)
            androidx.work.impl.background.systemalarm.b r11 = new androidx.work.impl.background.systemalarm.b
            android.content.Context r0 = r10.f3278a
            r11.<init>(r0, r12, r13)
            h2.h r12 = r13.f3301e
            androidx.work.impl.WorkDatabase r12 = r12.f18830c
            o2.k r12 = r12.n()
            o2.l r12 = (o2.l) r12
            java.util.List r12 = r12.d()
            java.lang.String r13 = androidx.work.impl.background.systemalarm.ConstraintProxy.f3268a
            r13 = r12
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r1 = r13.iterator()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0045:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r1.next()
            o2.j r8 = (o2.j) r8
            g2.b r8 = r8.f22873j
            boolean r9 = r8.f18397d
            r4 = r4 | r9
            boolean r9 = r8.f18395b
            r5 = r5 | r9
            boolean r9 = r8.f18398e
            r6 = r6 | r9
            androidx.work.c r8 = r8.f18394a
            androidx.work.c r9 = androidx.work.c.NOT_REQUIRED
            if (r8 == r9) goto L_0x0064
            r8 = 1
            goto L_0x0065
        L_0x0064:
            r8 = 0
        L_0x0065:
            r7 = r7 | r8
            if (r4 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0045
        L_0x006e:
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.f3269a
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r8 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            r1.<init>(r8)
            android.content.ComponentName r8 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver> r9 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class
            r8.<init>(r0, r9)
            r1.setComponent(r8)
            java.lang.String r8 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r1.putExtra(r8, r4)
            java.lang.String r8 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r8, r5)
            java.lang.String r5 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r5, r6)
            java.lang.String r5 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            r4.putExtra(r5, r7)
            r0.sendBroadcast(r1)
            l2.d r0 = r11.f3285d
            r0.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r13.size()
            r12.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r13 = r13.iterator()
        L_0x00b1:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r13.next()
            o2.j r4 = (o2.j) r4
            java.lang.String r5 = r4.f22864a
            long r6 = r4.a()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00b1
            boolean r6 = r4.b()
            if (r6 == 0) goto L_0x00d5
            l2.d r6 = r11.f3285d
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto L_0x00b1
        L_0x00d5:
            r12.add(r4)
            goto L_0x00b1
        L_0x00d9:
            java.util.Iterator r12 = r12.iterator()
        L_0x00dd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0115
            java.lang.Object r13 = r12.next()
            o2.j r13 = (o2.j) r13
            java.lang.String r13 = r13.f22864a
            android.content.Context r0 = r11.f3282a
            android.content.Intent r0 = c(r0, r13)
            g2.e r1 = g2.e.c()
            java.lang.String r4 = androidx.work.impl.background.systemalarm.b.f3281e
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r13
            java.lang.String r13 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String r13 = java.lang.String.format(r13, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]
            r1.a(r4, r13, r5)
            androidx.work.impl.background.systemalarm.d r13 = r11.f3284c
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b
            int r4 = r11.f3283b
            r1.<init>(r13, r0, r4)
            android.os.Handler r13 = r13.f3303g
            r13.post(r1)
            goto L_0x00dd
        L_0x0115:
            l2.d r11 = r11.f3285d
            r11.c()
            goto L_0x037a
        L_0x011c:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            r4 = 2
            if (r1 == 0) goto L_0x0147
            g2.e r0 = g2.e.c()
            java.lang.String r1 = f3277d
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r2] = r11
            java.lang.String r11 = "Handling reschedule %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r0.a(r1, r11, r12)
            h2.h r11 = r13.f3301e
            r11.e()
            goto L_0x037a
        L_0x0147:
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r6 = "KEY_WORKSPEC_ID"
            r5[r3] = r6
            if (r1 == 0) goto L_0x016b
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x015a
            goto L_0x016b
        L_0x015a:
            r6 = 0
        L_0x015b:
            if (r6 >= r2) goto L_0x0169
            r7 = r5[r6]
            java.lang.Object r7 = r1.get(r7)
            if (r7 != 0) goto L_0x0166
            goto L_0x016b
        L_0x0166:
            int r6 = r6 + 1
            goto L_0x015b
        L_0x0169:
            r1 = 1
            goto L_0x016c
        L_0x016b:
            r1 = 0
        L_0x016c:
            if (r1 != 0) goto L_0x0189
            g2.e r11 = g2.e.c()
            java.lang.String r12 = f3277d
            java.lang.String r13 = "Invalid request for %s, requires %s."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r1[r2] = r0
            java.lang.String r13 = java.lang.String.format(r13, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r11.b(r12, r13, r0)
            goto L_0x037a
        L_0x0189:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0272
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)
            g2.e r0 = g2.e.c()
            java.lang.String r1 = f3277d
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r11
            java.lang.String r6 = "Handling schedule work for %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r0.a(r1, r5, r6)
            h2.h r0 = r13.f3301e
            androidx.work.impl.WorkDatabase r0 = r0.f18830c
            r0.c()
            o2.k r5 = r0.n()     // Catch:{ all -> 0x026d }
            o2.l r5 = (o2.l) r5     // Catch:{ all -> 0x026d }
            o2.j r5 = r5.h(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r6 = "Skipping scheduling "
            if (r5 != 0) goto L_0x01e7
            g2.e r12 = g2.e.c()     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r13.<init>()     // Catch:{ all -> 0x026d }
            r13.append(r6)     // Catch:{ all -> 0x026d }
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = " because it's no longer in the DB"
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x026d }
            r12.f(r1, r11, r13)     // Catch:{ all -> 0x026d }
        L_0x01e2:
            r0.g()
            goto L_0x037a
        L_0x01e7:
            androidx.work.d r7 = r5.f22865b     // Catch:{ all -> 0x026d }
            boolean r7 = r7.a()     // Catch:{ all -> 0x026d }
            if (r7 == 0) goto L_0x020d
            g2.e r12 = g2.e.c()     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r13.<init>()     // Catch:{ all -> 0x026d }
            r13.append(r6)     // Catch:{ all -> 0x026d }
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = "because it is finished."
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x026d }
            r12.f(r1, r11, r13)     // Catch:{ all -> 0x026d }
            goto L_0x01e2
        L_0x020d:
            long r6 = r5.a()     // Catch:{ all -> 0x026d }
            boolean r5 = r5.b()     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x0238
            g2.e r12 = g2.e.c()     // Catch:{ all -> 0x026d }
            java.lang.String r5 = "Setting up Alarms for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x026d }
            r4[r3] = r11     // Catch:{ all -> 0x026d }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x026d }
            r4[r2] = r8     // Catch:{ all -> 0x026d }
            java.lang.String r2 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x026d }
            r12.a(r1, r2, r3)     // Catch:{ all -> 0x026d }
            android.content.Context r12 = r10.f3278a     // Catch:{ all -> 0x026d }
            h2.h r13 = r13.f3301e     // Catch:{ all -> 0x026d }
            j2.a.b(r12, r13, r11, r6)     // Catch:{ all -> 0x026d }
            goto L_0x0268
        L_0x0238:
            g2.e r5 = g2.e.c()     // Catch:{ all -> 0x026d }
            java.lang.String r8 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x026d }
            r4[r3] = r11     // Catch:{ all -> 0x026d }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x026d }
            r4[r2] = r9     // Catch:{ all -> 0x026d }
            java.lang.String r2 = java.lang.String.format(r8, r4)     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x026d }
            r5.a(r1, r2, r3)     // Catch:{ all -> 0x026d }
            android.content.Context r1 = r10.f3278a     // Catch:{ all -> 0x026d }
            h2.h r2 = r13.f3301e     // Catch:{ all -> 0x026d }
            j2.a.b(r1, r2, r11, r6)     // Catch:{ all -> 0x026d }
            android.content.Context r11 = r10.f3278a     // Catch:{ all -> 0x026d }
            android.content.Intent r11 = b(r11)     // Catch:{ all -> 0x026d }
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b     // Catch:{ all -> 0x026d }
            r1.<init>(r13, r11, r12)     // Catch:{ all -> 0x026d }
            android.os.Handler r11 = r13.f3303g     // Catch:{ all -> 0x026d }
            r11.post(r1)     // Catch:{ all -> 0x026d }
        L_0x0268:
            r0.j()     // Catch:{ all -> 0x026d }
            goto L_0x01e2
        L_0x026d:
            r11 = move-exception
            r0.g()
            throw r11
        L_0x0272:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02cd
            android.os.Bundle r11 = r11.getExtras()
            java.lang.Object r1 = r10.f3280c
            monitor-enter(r1)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)     // Catch:{ all -> 0x02ca }
            g2.e r0 = g2.e.c()     // Catch:{ all -> 0x02ca }
            java.lang.String r4 = f3277d     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = "Handing delay met for %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x02ca }
            r6[r3] = r11     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x02ca }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x02ca }
            r0.a(r4, r5, r6)     // Catch:{ all -> 0x02ca }
            java.util.Map<java.lang.String, h2.a> r0 = r10.f3279b     // Catch:{ all -> 0x02ca }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x02b4
            androidx.work.impl.background.systemalarm.c r0 = new androidx.work.impl.background.systemalarm.c     // Catch:{ all -> 0x02ca }
            android.content.Context r2 = r10.f3278a     // Catch:{ all -> 0x02ca }
            r0.<init>(r2, r12, r11, r13)     // Catch:{ all -> 0x02ca }
            java.util.Map<java.lang.String, h2.a> r12 = r10.f3279b     // Catch:{ all -> 0x02ca }
            r12.put(r11, r0)     // Catch:{ all -> 0x02ca }
            r0.f()     // Catch:{ all -> 0x02ca }
            goto L_0x02c7
        L_0x02b4:
            g2.e r12 = g2.e.c()     // Catch:{ all -> 0x02ca }
            java.lang.String r13 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x02ca }
            r0[r3] = r11     // Catch:{ all -> 0x02ca }
            java.lang.String r11 = java.lang.String.format(r13, r0)     // Catch:{ all -> 0x02ca }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x02ca }
            r12.a(r4, r11, r13)     // Catch:{ all -> 0x02ca }
        L_0x02c7:
            monitor-exit(r1)     // Catch:{ all -> 0x02ca }
            goto L_0x037a
        L_0x02ca:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ca }
            throw r11
        L_0x02cd:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x032e
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r12 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r12)
            g2.e r12 = g2.e.c()
            java.lang.String r0 = f3277d
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r4 = "Handing stopWork work for %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.a(r0, r1, r4)
            h2.h r12 = r13.f3301e
            r12.f(r11)
            android.content.Context r12 = r10.f3278a
            h2.h r0 = r13.f3301e
            java.lang.String r1 = j2.a.f19482a
            androidx.work.impl.WorkDatabase r0 = r0.f18830c
            o2.e r0 = r0.l()
            o2.f r0 = (o2.f) r0
            o2.d r1 = r0.a(r11)
            if (r1 == 0) goto L_0x032a
            int r1 = r1.f22856b
            j2.a.a(r12, r11, r1)
            g2.e r12 = g2.e.c()
            java.lang.String r1 = j2.a.f19482a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r11
            java.lang.String r4 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.a(r1, r2, r4)
            r0.c(r11)
        L_0x032a:
            r13.a(r11, r3)
            goto L_0x037a
        L_0x032e:
            java.lang.String r13 = "ACTION_EXECUTION_COMPLETED"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0365
            android.os.Bundle r13 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "KEY_NEEDS_RESCHEDULE"
            boolean r13 = r13.getBoolean(r1)
            g2.e r1 = g2.e.c()
            java.lang.String r5 = f3277d
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r2] = r11
            java.lang.String r11 = "Handling onExecutionCompleted %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r1.a(r5, r11, r12)
            r10.a(r0, r13)
            goto L_0x037a
        L_0x0365:
            g2.e r12 = g2.e.c()
            java.lang.String r13 = f3277d
            java.lang.String r0 = "Ignoring intent %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r11 = java.lang.String.format(r0, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r12.f(r13, r11, r0)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.a.e(android.content.Intent, int, androidx.work.impl.background.systemalarm.d):void");
    }
}
