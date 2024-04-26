package p2;

import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import g2.e;
import g2.g;
import h2.b;
import h2.f;
import h2.h;
import java.util.HashSet;
import o2.j;

/* compiled from: EnqueueRunnable */
public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final String f23782c = e.e("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    public final f f23783a;

    /* renamed from: b  reason: collision with root package name */
    public final b f23784b = new b();

    public d(f fVar) {
        this.f23783a = fVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0276  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(h2.f r25) {
        /*
            r0 = r25
            java.util.List<h2.f> r1 = r0.f18822g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            h2.f r5 = (h2.f) r5
            boolean r6 = r5.f18823h
            if (r6 != 0) goto L_0x0023
            boolean r5 = a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            g2.e r6 = g2.e.c()
            java.lang.String r7 = f23782c
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.util.List<java.lang.String> r5 = r5.f18820e
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r2] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.f(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = 0
        L_0x0042:
            java.util.Set r1 = h2.f.g(r25)
            h2.h r5 = r0.f18816a
            java.util.List<? extends g2.i> r6 = r0.f18819d
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f18817b
            int r8 = r0.f18818c
            androidx.work.d r9 = androidx.work.d.ENQUEUED
            androidx.work.d r10 = androidx.work.d.SUCCEEDED
            androidx.work.d r11 = androidx.work.d.CANCELLED
            androidx.work.d r12 = androidx.work.d.FAILED
            long r13 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r15 = r5.f18830c
            if (r1 == 0) goto L_0x006b
            int r2 = r1.length
            if (r2 <= 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x00be
            int r3 = r1.length
            r16 = r4
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 1
        L_0x0078:
            if (r4 >= r3) goto L_0x00c6
            r20 = r3
            r3 = r1[r4]
            o2.k r21 = r15.n()
            r0 = r21
            o2.l r0 = (o2.l) r0
            o2.j r0 = r0.h(r3)
            if (r0 != 0) goto L_0x00a5
            g2.e r0 = g2.e.c()
            java.lang.String r1 = f23782c
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = 0
            r4[r2] = r3
            java.lang.String r3 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            r0.b(r1, r3, r4)
            goto L_0x01e9
        L_0x00a5:
            androidx.work.d r0 = r0.f22865b
            if (r0 != r10) goto L_0x00ab
            r3 = 1
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            r19 = r19 & r3
            if (r0 != r12) goto L_0x00b3
            r17 = 1
            goto L_0x00b7
        L_0x00b3:
            if (r0 != r11) goto L_0x00b7
            r18 = 1
        L_0x00b7:
            int r4 = r4 + 1
            r0 = r25
            r3 = r20
            goto L_0x0078
        L_0x00be:
            r16 = r4
            r17 = 0
            r18 = 0
            r19 = 1
        L_0x00c6:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00d2
            if (r2 != 0) goto L_0x00d2
            r3 = 1
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            if (r3 == 0) goto L_0x025e
            o2.k r3 = r15.n()
            o2.l r3 = (o2.l) r3
            r3.getClass()
            java.lang.String r4 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r20 = r2
            r2 = 1
            t1.g r4 = t1.g.i(r4, r2)
            if (r7 != 0) goto L_0x00ed
            r4.s(r2)
            goto L_0x00f0
        L_0x00ed:
            r4.t(r2, r7)
        L_0x00f0:
            t1.e r2 = r3.f22882a
            r2.b()
            t1.e r2 = r3.f22882a
            r3 = 0
            android.database.Cursor r2 = v1.a.a(r2, r4, r3)
            java.lang.String r3 = "id"
            int r3 = q.a.j(r2, r3)     // Catch:{ all -> 0x0256 }
            r21 = r0
            java.lang.String r0 = "state"
            int r0 = q.a.j(r2, r0)     // Catch:{ all -> 0x0256 }
            r22 = r13
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0256 }
            int r14 = r2.getCount()     // Catch:{ all -> 0x0256 }
            r13.<init>(r14)     // Catch:{ all -> 0x0256 }
        L_0x0115:
            boolean r14 = r2.moveToNext()     // Catch:{ all -> 0x0256 }
            if (r14 == 0) goto L_0x0138
            o2.j$a r14 = new o2.j$a     // Catch:{ all -> 0x0256 }
            r14.<init>()     // Catch:{ all -> 0x0256 }
            r24 = r6
            java.lang.String r6 = r2.getString(r3)     // Catch:{ all -> 0x0256 }
            r14.f22880a = r6     // Catch:{ all -> 0x0256 }
            int r6 = r2.getInt(r0)     // Catch:{ all -> 0x0256 }
            androidx.work.d r6 = o2.p.d(r6)     // Catch:{ all -> 0x0256 }
            r14.f22881b = r6     // Catch:{ all -> 0x0256 }
            r13.add(r14)     // Catch:{ all -> 0x0256 }
            r6 = r24
            goto L_0x0115
        L_0x0138:
            r24 = r6
            r2.close()
            r4.u()
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0266
            r0 = 3
            if (r8 != r0) goto L_0x01ce
            o2.b r0 = r15.k()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r13.iterator()
        L_0x0156:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01bd
            java.lang.Object r4 = r3.next()
            o2.j$a r4 = (o2.j.a) r4
            java.lang.String r6 = r4.f22880a
            r8 = r0
            o2.c r8 = (o2.c) r8
            r8.getClass()
            java.lang.String r13 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r14 = 1
            t1.g r13 = t1.g.i(r13, r14)
            if (r6 != 0) goto L_0x0177
            r13.s(r14)
            goto L_0x017a
        L_0x0177:
            r13.t(r14, r6)
        L_0x017a:
            t1.e r6 = r8.f22853a
            r6.b()
            t1.e r6 = r8.f22853a
            r8 = 0
            android.database.Cursor r6 = v1.a.a(r6, r13, r8)
            boolean r14 = r6.moveToFirst()     // Catch:{ all -> 0x01b5 }
            if (r14 == 0) goto L_0x0194
            int r14 = r6.getInt(r8)     // Catch:{ all -> 0x01b5 }
            if (r14 == 0) goto L_0x0194
            r8 = 1
            goto L_0x0195
        L_0x0194:
            r8 = 0
        L_0x0195:
            r6.close()
            r13.u()
            if (r8 != 0) goto L_0x0156
            androidx.work.d r6 = r4.f22881b
            if (r6 != r10) goto L_0x01a3
            r8 = 1
            goto L_0x01a4
        L_0x01a3:
            r8 = 0
        L_0x01a4:
            r19 = r19 & r8
            if (r6 != r12) goto L_0x01ab
            r17 = 1
            goto L_0x01af
        L_0x01ab:
            if (r6 != r11) goto L_0x01af
            r18 = 1
        L_0x01af:
            java.lang.String r4 = r4.f22880a
            r2.add(r4)
            goto L_0x0156
        L_0x01b5:
            r0 = move-exception
            r6.close()
            r13.u()
            throw r0
        L_0x01bd:
            java.lang.Object[] r0 = r2.toArray(r1)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L_0x01c9
            r0 = 1
            goto L_0x01ca
        L_0x01c9:
            r0 = 0
        L_0x01ca:
            r2 = r0
            r8 = 0
            goto L_0x0269
        L_0x01ce:
            r0 = 2
            if (r8 != r0) goto L_0x01ec
            java.util.Iterator r0 = r13.iterator()
        L_0x01d5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01ec
            java.lang.Object r2 = r0.next()
            o2.j$a r2 = (o2.j.a) r2
            androidx.work.d r2 = r2.f22881b
            if (r2 == r9) goto L_0x01e9
            androidx.work.d r3 = androidx.work.d.RUNNING
            if (r2 != r3) goto L_0x01d5
        L_0x01e9:
            r2 = 0
            goto L_0x03cc
        L_0x01ec:
            p2.b r0 = new p2.b
            r2 = 0
            r0.<init>(r5, r7, r2)
            r0.run()
            o2.k r0 = r15.n()
            java.util.Iterator r2 = r13.iterator()
        L_0x01fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0253
            java.lang.Object r3 = r2.next()
            o2.j$a r3 = (o2.j.a) r3
            java.lang.String r3 = r3.f22880a
            r4 = r0
            o2.l r4 = (o2.l) r4
            t1.e r6 = r4.f22882a
            r6.b()
            t1.h r6 = r4.f22884c
            y1.e r6 = r6.a()
            if (r3 != 0) goto L_0x0222
            android.database.sqlite.SQLiteProgram r3 = r6.f27989a
            r8 = 1
            r3.bindNull(r8)
            goto L_0x0228
        L_0x0222:
            r8 = 1
            android.database.sqlite.SQLiteProgram r10 = r6.f27989a
            r10.bindString(r8, r3)
        L_0x0228:
            t1.e r3 = r4.f22882a
            r3.c()
            r6.a()     // Catch:{ all -> 0x0247 }
            t1.e r3 = r4.f22882a     // Catch:{ all -> 0x0247 }
            r3.j()     // Catch:{ all -> 0x0247 }
            t1.e r3 = r4.f22882a
            r3.g()
            t1.h r3 = r4.f22884c
            y1.e r4 = r3.f25409c
            if (r6 != r4) goto L_0x01fd
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f25407a
            r8 = 0
            r3.set(r8)
            goto L_0x01fd
        L_0x0247:
            r0 = move-exception
            t1.e r1 = r4.f22882a
            r1.g()
            t1.h r1 = r4.f22884c
            r1.c(r6)
            throw r0
        L_0x0253:
            r8 = 0
            r2 = 1
            goto L_0x026c
        L_0x0256:
            r0 = move-exception
            r2.close()
            r4.u()
            throw r0
        L_0x025e:
            r21 = r0
            r20 = r2
            r24 = r6
            r22 = r13
        L_0x0266:
            r8 = 0
            r2 = r20
        L_0x0269:
            r20 = r2
            r2 = 0
        L_0x026c:
            java.util.Iterator r0 = r24.iterator()
        L_0x0270:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03cc
            java.lang.Object r3 = r0.next()
            g2.i r3 = (g2.i) r3
            o2.j r4 = r3.f18414b
            if (r20 == 0) goto L_0x0294
            if (r19 != 0) goto L_0x0294
            if (r17 == 0) goto L_0x0287
            r4.f22865b = r12
            goto L_0x0290
        L_0x0287:
            if (r18 == 0) goto L_0x028c
            r4.f22865b = r11
            goto L_0x0290
        L_0x028c:
            androidx.work.d r6 = androidx.work.d.BLOCKED
            r4.f22865b = r6
        L_0x0290:
            r6 = r9
            r13 = r22
            goto L_0x02a7
        L_0x0294:
            boolean r6 = r4.d()
            if (r6 != 0) goto L_0x02a0
            r13 = r22
            r4.f22877n = r13
            r6 = r9
            goto L_0x02a7
        L_0x02a0:
            r6 = r9
            r13 = r22
            r8 = 0
            r4.f22877n = r8
        L_0x02a7:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 < r9) goto L_0x02b5
            r9 = 25
            if (r8 > r9) goto L_0x02b5
            b(r4)
            goto L_0x02e3
        L_0x02b5:
            r9 = 22
            if (r8 > r9) goto L_0x02e3
            java.lang.String r8 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x02dd }
            java.util.List<h2.d> r9 = r5.f18832e     // Catch:{ ClassNotFoundException -> 0x02dd }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ ClassNotFoundException -> 0x02dd }
        L_0x02c5:
            boolean r10 = r9.hasNext()     // Catch:{ ClassNotFoundException -> 0x02dd }
            if (r10 == 0) goto L_0x02dd
            java.lang.Object r10 = r9.next()     // Catch:{ ClassNotFoundException -> 0x02dd }
            h2.d r10 = (h2.d) r10     // Catch:{ ClassNotFoundException -> 0x02dd }
            java.lang.Class r10 = r10.getClass()     // Catch:{ ClassNotFoundException -> 0x02dd }
            boolean r10 = r8.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x02dd }
            if (r10 == 0) goto L_0x02c5
            r8 = 1
            goto L_0x02de
        L_0x02dd:
            r8 = 0
        L_0x02de:
            if (r8 == 0) goto L_0x02e3
            b(r4)
        L_0x02e3:
            androidx.work.d r8 = r4.f22865b
            if (r8 != r6) goto L_0x02e8
            r2 = 1
        L_0x02e8:
            o2.k r8 = r15.n()
            o2.l r8 = (o2.l) r8
            t1.e r9 = r8.f22882a
            r9.b()
            t1.e r9 = r8.f22882a
            r9.c()
            t1.b r9 = r8.f22883b     // Catch:{ all -> 0x03c5 }
            r9.e(r4)     // Catch:{ all -> 0x03c5 }
            t1.e r4 = r8.f22882a     // Catch:{ all -> 0x03c5 }
            r4.j()     // Catch:{ all -> 0x03c5 }
            t1.e r4 = r8.f22882a
            r4.g()
            if (r20 == 0) goto L_0x0346
            int r4 = r1.length
            r8 = 0
        L_0x030b:
            if (r8 >= r4) goto L_0x0346
            r9 = r1[r8]
            o2.a r10 = new o2.a
            r22 = r0
            java.lang.String r0 = r3.a()
            r10.<init>(r0, r9)
            o2.b r0 = r15.k()
            r9 = r0
            o2.c r9 = (o2.c) r9
            t1.e r0 = r9.f22853a
            r0.b()
            t1.e r0 = r9.f22853a
            r0.c()
            t1.b r0 = r9.f22854b     // Catch:{ all -> 0x033f }
            r0.e(r10)     // Catch:{ all -> 0x033f }
            t1.e r0 = r9.f22853a     // Catch:{ all -> 0x033f }
            r0.j()     // Catch:{ all -> 0x033f }
            t1.e r0 = r9.f22853a
            r0.g()
            int r8 = r8 + 1
            r0 = r22
            goto L_0x030b
        L_0x033f:
            r0 = move-exception
            t1.e r1 = r9.f22853a
            r1.g()
            throw r0
        L_0x0346:
            r22 = r0
            java.util.Set<java.lang.String> r0 = r3.f18415c
            java.util.Iterator r0 = r0.iterator()
        L_0x034e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x038a
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            o2.n r8 = r15.o()
            o2.m r9 = new o2.m
            java.lang.String r10 = r3.a()
            r9.<init>(r4, r10)
            o2.o r8 = (o2.o) r8
            t1.e r4 = r8.f22893a
            r4.b()
            t1.e r4 = r8.f22893a
            r4.c()
            t1.b r4 = r8.f22894b     // Catch:{ all -> 0x0383 }
            r4.e(r9)     // Catch:{ all -> 0x0383 }
            t1.e r4 = r8.f22893a     // Catch:{ all -> 0x0383 }
            r4.j()     // Catch:{ all -> 0x0383 }
            t1.e r4 = r8.f22893a
            r4.g()
            goto L_0x034e
        L_0x0383:
            r0 = move-exception
            t1.e r1 = r8.f22893a
            r1.g()
            throw r0
        L_0x038a:
            if (r21 == 0) goto L_0x03bd
            o2.h r0 = r15.m()
            o2.g r4 = new o2.g
            java.lang.String r3 = r3.a()
            r4.<init>(r7, r3)
            r3 = r0
            o2.i r3 = (o2.i) r3
            t1.e r0 = r3.f22862a
            r0.b()
            t1.e r0 = r3.f22862a
            r0.c()
            t1.b r0 = r3.f22863b     // Catch:{ all -> 0x03b6 }
            r0.e(r4)     // Catch:{ all -> 0x03b6 }
            t1.e r0 = r3.f22862a     // Catch:{ all -> 0x03b6 }
            r0.j()     // Catch:{ all -> 0x03b6 }
            t1.e r0 = r3.f22862a
            r0.g()
            goto L_0x03bd
        L_0x03b6:
            r0 = move-exception
            t1.e r1 = r3.f22862a
            r1.g()
            throw r0
        L_0x03bd:
            r9 = r6
            r0 = r22
            r8 = 0
            r22 = r13
            goto L_0x0270
        L_0x03c5:
            r0 = move-exception
            t1.e r1 = r8.f22882a
            r1.g()
            throw r0
        L_0x03cc:
            r1 = 1
            r0 = r25
            r0.f18823h = r1
            r0 = r16 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.a(h2.f):boolean");
    }

    public static void b(j jVar) {
        g2.b bVar = jVar.f22873j;
        if (bVar.f18397d || bVar.f18398e) {
            String str = jVar.f22866c;
            b.a aVar = new b.a();
            aVar.b(jVar.f22868e.f3240a);
            aVar.f3241a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.f22866c = ConstraintTrackingWorker.class.getName();
            jVar.f22868e = aVar.a();
        }
    }

    public void run() {
        WorkDatabase workDatabase;
        try {
            f fVar = this.f23783a;
            fVar.getClass();
            if (!f.f(fVar, new HashSet())) {
                workDatabase = this.f23783a.f18816a.f18830c;
                workDatabase.c();
                boolean a10 = a(this.f23783a);
                workDatabase.j();
                workDatabase.g();
                if (a10) {
                    f.a(this.f23783a.f18816a.f18828a, RescheduleReceiver.class, true);
                    h hVar = this.f23783a.f18816a;
                    h2.e.a(hVar.f18829b, hVar.f18830c, hVar.f18832e);
                }
                this.f23784b.a(g.f18410a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f23783a}));
        } catch (Throwable th) {
            this.f23784b.a(new g.b.a(th));
        }
    }
}
