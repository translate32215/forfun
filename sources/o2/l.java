package o2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WorkSpecDao_Impl */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final t1.e f22882a;

    /* renamed from: b  reason: collision with root package name */
    public final t1.b f22883b;

    /* renamed from: c  reason: collision with root package name */
    public final t1.h f22884c;

    /* renamed from: d  reason: collision with root package name */
    public final t1.h f22885d;

    /* renamed from: e  reason: collision with root package name */
    public final t1.h f22886e;

    /* renamed from: f  reason: collision with root package name */
    public final t1.h f22887f;

    /* renamed from: g  reason: collision with root package name */
    public final t1.h f22888g;

    /* renamed from: h  reason: collision with root package name */
    public final t1.h f22889h;

    /* renamed from: i  reason: collision with root package name */
    public final t1.h f22890i;

    /* compiled from: WorkSpecDao_Impl */
    public class a extends t1.b<j> {
        public a(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v18 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01a7 A[SYNTHETIC, Splitter:B:62:0x01a7] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01c7  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01d3 A[SYNTHETIC, Splitter:B:76:0x01d3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(y1.e r17, java.lang.Object r18) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                o2.j r0 = (o2.j) r0
                java.lang.String r2 = r0.f22864a
                r3 = 1
                if (r2 != 0) goto L_0x0011
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r2.bindNull(r3)
                goto L_0x0016
            L_0x0011:
                android.database.sqlite.SQLiteProgram r4 = r1.f27989a
                r4.bindString(r3, r2)
            L_0x0016:
                androidx.work.d r2 = r0.f22865b
                int r2 = o2.p.e(r2)
                long r4 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r6 = 2
                r2.bindLong(r6, r4)
                java.lang.String r2 = r0.f22866c
                r4 = 3
                if (r2 != 0) goto L_0x002e
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r2.bindNull(r4)
                goto L_0x0033
            L_0x002e:
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindString(r4, r2)
            L_0x0033:
                java.lang.String r2 = r0.f22867d
                r5 = 4
                if (r2 != 0) goto L_0x003e
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r2.bindNull(r5)
                goto L_0x0043
            L_0x003e:
                android.database.sqlite.SQLiteProgram r7 = r1.f27989a
                r7.bindString(r5, r2)
            L_0x0043:
                androidx.work.b r2 = r0.f22868e
                byte[] r2 = androidx.work.b.c(r2)
                r7 = 5
                if (r2 != 0) goto L_0x0052
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r2.bindNull(r7)
                goto L_0x0057
            L_0x0052:
                android.database.sqlite.SQLiteProgram r8 = r1.f27989a
                r8.bindBlob(r7, r2)
            L_0x0057:
                androidx.work.b r2 = r0.f22869f
                byte[] r2 = androidx.work.b.c(r2)
                r7 = 6
                if (r2 != 0) goto L_0x0066
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r2.bindNull(r7)
                goto L_0x006b
            L_0x0066:
                android.database.sqlite.SQLiteProgram r8 = r1.f27989a
                r8.bindBlob(r7, r2)
            L_0x006b:
                r2 = 7
                long r7 = r0.f22870g
                android.database.sqlite.SQLiteProgram r9 = r1.f27989a
                r9.bindLong(r2, r7)
                r2 = 8
                long r7 = r0.f22871h
                android.database.sqlite.SQLiteProgram r9 = r1.f27989a
                r9.bindLong(r2, r7)
                r2 = 9
                long r7 = r0.f22872i
                android.database.sqlite.SQLiteProgram r9 = r1.f27989a
                r9.bindLong(r2, r7)
                r2 = 10
                int r7 = r0.f22874k
                long r7 = (long) r7
                android.database.sqlite.SQLiteProgram r9 = r1.f27989a
                r9.bindLong(r2, r7)
                androidx.work.a r2 = r0.f22875l
                int r7 = r2.ordinal()
                java.lang.String r8 = " to int"
                java.lang.String r9 = "Could not convert "
                if (r7 == 0) goto L_0x00b7
                if (r7 != r3) goto L_0x009f
                r2 = 1
                goto L_0x00b8
            L_0x009f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00b7:
                r2 = 0
            L_0x00b8:
                r7 = 11
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.f27989a
                r2.bindLong(r7, r11)
                r2 = 12
                long r11 = r0.f22876m
                android.database.sqlite.SQLiteProgram r7 = r1.f27989a
                r7.bindLong(r2, r11)
                r2 = 13
                long r11 = r0.f22877n
                android.database.sqlite.SQLiteProgram r7 = r1.f27989a
                r7.bindLong(r2, r11)
                r2 = 14
                long r11 = r0.f22878o
                android.database.sqlite.SQLiteProgram r7 = r1.f27989a
                r7.bindLong(r2, r11)
                r2 = 15
                long r11 = r0.f22879p
                android.database.sqlite.SQLiteProgram r7 = r1.f27989a
                r7.bindLong(r2, r11)
                g2.b r0 = r0.f22873j
                r2 = 21
                r7 = 20
                r11 = 19
                r12 = 18
                r13 = 17
                r14 = 16
                if (r0 == 0) goto L_0x01e6
                androidx.work.c r10 = r0.f18394a
                int r15 = r10.ordinal()
                if (r15 == 0) goto L_0x0122
                if (r15 == r3) goto L_0x0120
                if (r15 == r6) goto L_0x011f
                if (r15 == r4) goto L_0x011d
                if (r15 != r5) goto L_0x0105
                goto L_0x0123
            L_0x0105:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r10)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x011d:
                r3 = 3
                goto L_0x0120
            L_0x011f:
                r3 = 2
            L_0x0120:
                r5 = r3
                goto L_0x0123
            L_0x0122:
                r5 = 0
            L_0x0123:
                long r3 = (long) r5
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindLong(r14, r3)
                boolean r3 = r0.f18395b
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindLong(r13, r3)
                boolean r3 = r0.f18396c
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindLong(r12, r3)
                boolean r3 = r0.f18397d
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindLong(r11, r3)
                boolean r3 = r0.f18398e
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindLong(r7, r3)
                long r3 = r0.f18399f
                android.database.sqlite.SQLiteProgram r5 = r1.f27989a
                r5.bindLong(r2, r3)
                long r2 = r0.f18400g
                android.database.sqlite.SQLiteProgram r4 = r1.f27989a
                r5 = 22
                r4.bindLong(r5, r2)
                g2.c r0 = r0.f18401h
                int r2 = r0.a()
                r3 = 0
                if (r2 != 0) goto L_0x0163
                goto L_0x01bd
            L_0x0163:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01a1 }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01a1 }
                int r3 = r0.a()     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                java.util.Set<g2.c$a> r0 = r0.f18404a     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
            L_0x017a:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                if (r3 == 0) goto L_0x0195
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                g2.c$a r3 = (g2.c.a) r3     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                android.net.Uri r5 = r3.f18405a     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                boolean r3 = r3.f18406b     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x019c, all -> 0x0199 }
                goto L_0x017a
            L_0x0195:
                r4.close()     // Catch:{ IOException -> 0x01ab }
                goto L_0x01b0
            L_0x0199:
                r0 = move-exception
                r1 = r0
                goto L_0x01d1
            L_0x019c:
                r0 = move-exception
                r3 = r4
                goto L_0x01a2
            L_0x019f:
                r0 = move-exception
                goto L_0x01cf
            L_0x01a1:
                r0 = move-exception
            L_0x01a2:
                r0.printStackTrace()     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x01b0
                r3.close()     // Catch:{ IOException -> 0x01ab }
                goto L_0x01b0
            L_0x01ab:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01b0:
                r2.close()     // Catch:{ IOException -> 0x01b4 }
                goto L_0x01b9
            L_0x01b4:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01b9:
                byte[] r3 = r2.toByteArray()
            L_0x01bd:
                if (r3 != 0) goto L_0x01c7
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r2 = 23
                r0.bindNull(r2)
                goto L_0x0212
            L_0x01c7:
                r2 = 23
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindBlob(r2, r3)
                goto L_0x0212
            L_0x01cf:
                r1 = r0
                r4 = r3
            L_0x01d1:
                if (r4 == 0) goto L_0x01dc
                r4.close()     // Catch:{ IOException -> 0x01d7 }
                goto L_0x01dc
            L_0x01d7:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01dc:
                r2.close()     // Catch:{ IOException -> 0x01e0 }
                goto L_0x01e5
            L_0x01e0:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01e5:
                throw r1
            L_0x01e6:
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindNull(r14)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindNull(r13)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindNull(r12)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindNull(r11)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindNull(r7)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r2 = 22
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.f27989a
                r1 = 23
                r0.bindNull(r1)
            L_0x0212:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.l.a.d(y1.e, java.lang.Object):void");
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class b extends t1.h {
        public b(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class c extends t1.h {
        public c(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class d extends t1.h {
        public d(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class e extends t1.h {
        public e(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class f extends t1.h {
        public f(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class g extends t1.h {
        public g(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class h extends t1.h {
        public h(l lVar, t1.e eVar) {
            super(eVar);
        }

        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public l(t1.e eVar) {
        this.f22882a = eVar;
        this.f22883b = new a(this, eVar);
        this.f22884c = new b(this, eVar);
        this.f22885d = new c(this, eVar);
        this.f22886e = new d(this, eVar);
        this.f22887f = new e(this, eVar);
        this.f22888g = new f(this, eVar);
        this.f22889h = new g(this, eVar);
        this.f22890i = new h(this, eVar);
        new AtomicBoolean(false);
    }

    public List<String> a() {
        t1.g i10 = t1.g.i("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            ArrayList arrayList = new ArrayList(a10.getCount());
            while (a10.moveToNext()) {
                arrayList.add(a10.getString(0));
            }
            return arrayList;
        } finally {
            a10.close();
            i10.u();
        }
    }

    public List<j> b(int i10) {
        t1.g gVar;
        t1.g i11 = t1.g.i("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        i11.o(1, (long) i10);
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i11, false);
        try {
            int j10 = q.a.j(a10, "id");
            int j11 = q.a.j(a10, "state");
            int j12 = q.a.j(a10, "worker_class_name");
            int j13 = q.a.j(a10, "input_merger_class_name");
            int j14 = q.a.j(a10, "input");
            int j15 = q.a.j(a10, "output");
            int j16 = q.a.j(a10, "initial_delay");
            int j17 = q.a.j(a10, "interval_duration");
            int j18 = q.a.j(a10, "flex_duration");
            int j19 = q.a.j(a10, "run_attempt_count");
            int j20 = q.a.j(a10, "backoff_policy");
            int j21 = q.a.j(a10, "backoff_delay_duration");
            int j22 = q.a.j(a10, "period_start_time");
            int j23 = q.a.j(a10, "minimum_retention_duration");
            gVar = i11;
            try {
                int j24 = q.a.j(a10, "schedule_requested_at");
                int j25 = q.a.j(a10, "required_network_type");
                int i12 = j23;
                int j26 = q.a.j(a10, "requires_charging");
                int i13 = j22;
                int j27 = q.a.j(a10, "requires_device_idle");
                int i14 = j21;
                int j28 = q.a.j(a10, "requires_battery_not_low");
                int i15 = j20;
                int j29 = q.a.j(a10, "requires_storage_not_low");
                int i16 = j19;
                int j30 = q.a.j(a10, "trigger_content_update_delay");
                int i17 = j18;
                int j31 = q.a.j(a10, "trigger_max_content_delay");
                int i18 = j17;
                int j32 = q.a.j(a10, "content_uri_triggers");
                int i19 = j16;
                int i20 = j15;
                ArrayList arrayList = new ArrayList(a10.getCount());
                while (a10.moveToNext()) {
                    String string = a10.getString(j10);
                    int i21 = j10;
                    String string2 = a10.getString(j12);
                    int i22 = j12;
                    g2.b bVar = new g2.b();
                    int i23 = j25;
                    bVar.f18394a = p.c(a10.getInt(j25));
                    bVar.f18395b = a10.getInt(j26) != 0;
                    bVar.f18396c = a10.getInt(j27) != 0;
                    bVar.f18397d = a10.getInt(j28) != 0;
                    bVar.f18398e = a10.getInt(j29) != 0;
                    int i24 = j26;
                    int i25 = j28;
                    bVar.f18399f = a10.getLong(j30);
                    bVar.f18400g = a10.getLong(j31);
                    bVar.f18401h = p.a(a10.getBlob(j32));
                    j jVar = new j(string, string2);
                    jVar.f22865b = p.d(a10.getInt(j11));
                    jVar.f22867d = a10.getString(j13);
                    jVar.f22868e = androidx.work.b.a(a10.getBlob(j14));
                    int i26 = i20;
                    jVar.f22869f = androidx.work.b.a(a10.getBlob(i26));
                    int i27 = j27;
                    int i28 = i19;
                    int i29 = i24;
                    jVar.f22870g = a10.getLong(i28);
                    int i30 = j13;
                    int i31 = i18;
                    int i32 = j14;
                    jVar.f22871h = a10.getLong(i31);
                    int i33 = i28;
                    int i34 = i17;
                    int i35 = i31;
                    jVar.f22872i = a10.getLong(i34);
                    int i36 = i16;
                    jVar.f22874k = a10.getInt(i36);
                    int i37 = i15;
                    i20 = i26;
                    jVar.f22875l = p.b(a10.getInt(i37));
                    i16 = i36;
                    i15 = i37;
                    int i38 = i14;
                    jVar.f22876m = a10.getLong(i38);
                    int i39 = i13;
                    int i40 = i30;
                    jVar.f22877n = a10.getLong(i39);
                    int i41 = i34;
                    int i42 = i12;
                    int i43 = i33;
                    jVar.f22878o = a10.getLong(i42);
                    int i44 = i39;
                    int i45 = j24;
                    int i46 = i42;
                    jVar.f22879p = a10.getLong(i45);
                    jVar.f22873j = bVar;
                    arrayList.add(jVar);
                    i14 = i38;
                    j26 = i29;
                    j10 = i21;
                    j12 = i22;
                    j28 = i25;
                    j25 = i23;
                    i19 = i43;
                    i12 = i46;
                    j24 = i45;
                    j13 = i40;
                    i13 = i44;
                    j14 = i32;
                    i18 = i35;
                    i17 = i41;
                    j27 = i27;
                }
                a10.close();
                gVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a10.close();
                gVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = i11;
            a10.close();
            gVar.u();
            throw th;
        }
    }

    public List<j> c() {
        t1.g gVar;
        t1.g i10 = t1.g.i("SELECT * FROM workspec WHERE state=1", 0);
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            int j10 = q.a.j(a10, "id");
            int j11 = q.a.j(a10, "state");
            int j12 = q.a.j(a10, "worker_class_name");
            int j13 = q.a.j(a10, "input_merger_class_name");
            int j14 = q.a.j(a10, "input");
            int j15 = q.a.j(a10, "output");
            int j16 = q.a.j(a10, "initial_delay");
            int j17 = q.a.j(a10, "interval_duration");
            int j18 = q.a.j(a10, "flex_duration");
            int j19 = q.a.j(a10, "run_attempt_count");
            int j20 = q.a.j(a10, "backoff_policy");
            int j21 = q.a.j(a10, "backoff_delay_duration");
            int j22 = q.a.j(a10, "period_start_time");
            int j23 = q.a.j(a10, "minimum_retention_duration");
            gVar = i10;
            try {
                int j24 = q.a.j(a10, "schedule_requested_at");
                int j25 = q.a.j(a10, "required_network_type");
                int i11 = j23;
                int j26 = q.a.j(a10, "requires_charging");
                int i12 = j22;
                int j27 = q.a.j(a10, "requires_device_idle");
                int i13 = j21;
                int j28 = q.a.j(a10, "requires_battery_not_low");
                int i14 = j20;
                int j29 = q.a.j(a10, "requires_storage_not_low");
                int i15 = j19;
                int j30 = q.a.j(a10, "trigger_content_update_delay");
                int i16 = j18;
                int j31 = q.a.j(a10, "trigger_max_content_delay");
                int i17 = j17;
                int j32 = q.a.j(a10, "content_uri_triggers");
                int i18 = j16;
                int i19 = j15;
                ArrayList arrayList = new ArrayList(a10.getCount());
                while (a10.moveToNext()) {
                    String string = a10.getString(j10);
                    int i20 = j10;
                    String string2 = a10.getString(j12);
                    int i21 = j12;
                    g2.b bVar = new g2.b();
                    int i22 = j25;
                    bVar.f18394a = p.c(a10.getInt(j25));
                    bVar.f18395b = a10.getInt(j26) != 0;
                    bVar.f18396c = a10.getInt(j27) != 0;
                    bVar.f18397d = a10.getInt(j28) != 0;
                    bVar.f18398e = a10.getInt(j29) != 0;
                    int i23 = j26;
                    int i24 = j27;
                    bVar.f18399f = a10.getLong(j30);
                    bVar.f18400g = a10.getLong(j31);
                    bVar.f18401h = p.a(a10.getBlob(j32));
                    j jVar = new j(string, string2);
                    jVar.f22865b = p.d(a10.getInt(j11));
                    jVar.f22867d = a10.getString(j13);
                    jVar.f22868e = androidx.work.b.a(a10.getBlob(j14));
                    int i25 = i19;
                    jVar.f22869f = androidx.work.b.a(a10.getBlob(i25));
                    int i26 = j13;
                    int i27 = i18;
                    int i28 = j14;
                    jVar.f22870g = a10.getLong(i27);
                    int i29 = i23;
                    int i30 = i17;
                    int i31 = i27;
                    jVar.f22871h = a10.getLong(i30);
                    int i32 = i30;
                    int i33 = i16;
                    int i34 = i29;
                    jVar.f22872i = a10.getLong(i33);
                    int i35 = i15;
                    jVar.f22874k = a10.getInt(i35);
                    int i36 = i14;
                    i19 = i25;
                    jVar.f22875l = p.b(a10.getInt(i36));
                    int i37 = i32;
                    int i38 = i13;
                    int i39 = i33;
                    jVar.f22876m = a10.getLong(i38);
                    i15 = i35;
                    int i40 = i12;
                    jVar.f22877n = a10.getLong(i40);
                    i12 = i40;
                    int i41 = i11;
                    jVar.f22878o = a10.getLong(i41);
                    i11 = i41;
                    int i42 = i36;
                    int i43 = j24;
                    jVar.f22879p = a10.getLong(i43);
                    jVar.f22873j = bVar;
                    arrayList.add(jVar);
                    j24 = i43;
                    j13 = i26;
                    j26 = i34;
                    j14 = i28;
                    j12 = i21;
                    j27 = i24;
                    i16 = i39;
                    i18 = i31;
                    i13 = i38;
                    i17 = i37;
                    j10 = i20;
                    i14 = i42;
                    j25 = i22;
                }
                a10.close();
                gVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a10.close();
                gVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = i10;
            a10.close();
            gVar.u();
            throw th;
        }
    }

    public List<j> d() {
        t1.g gVar;
        t1.g i10 = t1.g.i("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            int j10 = q.a.j(a10, "id");
            int j11 = q.a.j(a10, "state");
            int j12 = q.a.j(a10, "worker_class_name");
            int j13 = q.a.j(a10, "input_merger_class_name");
            int j14 = q.a.j(a10, "input");
            int j15 = q.a.j(a10, "output");
            int j16 = q.a.j(a10, "initial_delay");
            int j17 = q.a.j(a10, "interval_duration");
            int j18 = q.a.j(a10, "flex_duration");
            int j19 = q.a.j(a10, "run_attempt_count");
            int j20 = q.a.j(a10, "backoff_policy");
            int j21 = q.a.j(a10, "backoff_delay_duration");
            int j22 = q.a.j(a10, "period_start_time");
            int j23 = q.a.j(a10, "minimum_retention_duration");
            gVar = i10;
            try {
                int j24 = q.a.j(a10, "schedule_requested_at");
                int j25 = q.a.j(a10, "required_network_type");
                int i11 = j23;
                int j26 = q.a.j(a10, "requires_charging");
                int i12 = j22;
                int j27 = q.a.j(a10, "requires_device_idle");
                int i13 = j21;
                int j28 = q.a.j(a10, "requires_battery_not_low");
                int i14 = j20;
                int j29 = q.a.j(a10, "requires_storage_not_low");
                int i15 = j19;
                int j30 = q.a.j(a10, "trigger_content_update_delay");
                int i16 = j18;
                int j31 = q.a.j(a10, "trigger_max_content_delay");
                int i17 = j17;
                int j32 = q.a.j(a10, "content_uri_triggers");
                int i18 = j16;
                int i19 = j15;
                ArrayList arrayList = new ArrayList(a10.getCount());
                while (a10.moveToNext()) {
                    String string = a10.getString(j10);
                    int i20 = j10;
                    String string2 = a10.getString(j12);
                    int i21 = j12;
                    g2.b bVar = new g2.b();
                    int i22 = j25;
                    bVar.f18394a = p.c(a10.getInt(j25));
                    bVar.f18395b = a10.getInt(j26) != 0;
                    bVar.f18396c = a10.getInt(j27) != 0;
                    bVar.f18397d = a10.getInt(j28) != 0;
                    bVar.f18398e = a10.getInt(j29) != 0;
                    int i23 = j26;
                    int i24 = j27;
                    bVar.f18399f = a10.getLong(j30);
                    bVar.f18400g = a10.getLong(j31);
                    bVar.f18401h = p.a(a10.getBlob(j32));
                    j jVar = new j(string, string2);
                    jVar.f22865b = p.d(a10.getInt(j11));
                    jVar.f22867d = a10.getString(j13);
                    jVar.f22868e = androidx.work.b.a(a10.getBlob(j14));
                    int i25 = i19;
                    jVar.f22869f = androidx.work.b.a(a10.getBlob(i25));
                    int i26 = j13;
                    int i27 = i18;
                    int i28 = j14;
                    jVar.f22870g = a10.getLong(i27);
                    int i29 = i23;
                    int i30 = i17;
                    int i31 = i27;
                    jVar.f22871h = a10.getLong(i30);
                    int i32 = i30;
                    int i33 = i16;
                    int i34 = i29;
                    jVar.f22872i = a10.getLong(i33);
                    int i35 = i15;
                    jVar.f22874k = a10.getInt(i35);
                    int i36 = i14;
                    i19 = i25;
                    jVar.f22875l = p.b(a10.getInt(i36));
                    int i37 = i32;
                    int i38 = i13;
                    int i39 = i33;
                    jVar.f22876m = a10.getLong(i38);
                    i15 = i35;
                    int i40 = i12;
                    jVar.f22877n = a10.getLong(i40);
                    i12 = i40;
                    int i41 = i11;
                    jVar.f22878o = a10.getLong(i41);
                    i11 = i41;
                    int i42 = i36;
                    int i43 = j24;
                    jVar.f22879p = a10.getLong(i43);
                    jVar.f22873j = bVar;
                    arrayList.add(jVar);
                    j24 = i43;
                    j13 = i26;
                    j26 = i34;
                    j14 = i28;
                    j12 = i21;
                    j27 = i24;
                    i16 = i39;
                    i18 = i31;
                    i13 = i38;
                    i17 = i37;
                    j10 = i20;
                    i14 = i42;
                    j25 = i22;
                }
                a10.close();
                gVar.u();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a10.close();
                gVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = i10;
            a10.close();
            gVar.u();
            throw th;
        }
    }

    public androidx.work.d e(String str) {
        t1.g i10 = t1.g.i("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            return a10.moveToFirst() ? p.d(a10.getInt(0)) : null;
        } finally {
            a10.close();
            i10.u();
        }
    }

    public List<String> f(String str) {
        t1.g i10 = t1.g.i("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            ArrayList arrayList = new ArrayList(a10.getCount());
            while (a10.moveToNext()) {
                arrayList.add(a10.getString(0));
            }
            return arrayList;
        } finally {
            a10.close();
            i10.u();
        }
    }

    public List<String> g(String str) {
        t1.g i10 = t1.g.i("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            i10.s(1);
        } else {
            i10.t(1, str);
        }
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            ArrayList arrayList = new ArrayList(a10.getCount());
            while (a10.moveToNext()) {
                arrayList.add(a10.getString(0));
            }
            return arrayList;
        } finally {
            a10.close();
            i10.u();
        }
    }

    public j h(String str) {
        t1.g gVar;
        j jVar;
        String str2 = str;
        t1.g i10 = t1.g.i("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            i10.s(1);
        } else {
            i10.t(1, str2);
        }
        this.f22882a.b();
        Cursor a10 = v1.a.a(this.f22882a, i10, false);
        try {
            int j10 = q.a.j(a10, "id");
            int j11 = q.a.j(a10, "state");
            int j12 = q.a.j(a10, "worker_class_name");
            int j13 = q.a.j(a10, "input_merger_class_name");
            int j14 = q.a.j(a10, "input");
            int j15 = q.a.j(a10, "output");
            int j16 = q.a.j(a10, "initial_delay");
            int j17 = q.a.j(a10, "interval_duration");
            int j18 = q.a.j(a10, "flex_duration");
            int j19 = q.a.j(a10, "run_attempt_count");
            int j20 = q.a.j(a10, "backoff_policy");
            int j21 = q.a.j(a10, "backoff_delay_duration");
            int j22 = q.a.j(a10, "period_start_time");
            int j23 = q.a.j(a10, "minimum_retention_duration");
            gVar = i10;
            try {
                int j24 = q.a.j(a10, "schedule_requested_at");
                int j25 = q.a.j(a10, "required_network_type");
                int i11 = j23;
                int j26 = q.a.j(a10, "requires_charging");
                int i12 = j22;
                int j27 = q.a.j(a10, "requires_device_idle");
                int i13 = j21;
                int j28 = q.a.j(a10, "requires_battery_not_low");
                int i14 = j20;
                int j29 = q.a.j(a10, "requires_storage_not_low");
                int i15 = j19;
                int j30 = q.a.j(a10, "trigger_content_update_delay");
                int i16 = j18;
                int j31 = q.a.j(a10, "trigger_max_content_delay");
                int i17 = j17;
                int j32 = q.a.j(a10, "content_uri_triggers");
                if (a10.moveToFirst()) {
                    String string = a10.getString(j10);
                    String string2 = a10.getString(j12);
                    int i18 = j16;
                    g2.b bVar = new g2.b();
                    bVar.f18394a = p.c(a10.getInt(j25));
                    bVar.f18395b = a10.getInt(j26) != 0;
                    bVar.f18396c = a10.getInt(j27) != 0;
                    bVar.f18397d = a10.getInt(j28) != 0;
                    bVar.f18398e = a10.getInt(j29) != 0;
                    bVar.f18399f = a10.getLong(j30);
                    bVar.f18400g = a10.getLong(j31);
                    bVar.f18401h = p.a(a10.getBlob(j32));
                    jVar = new j(string, string2);
                    jVar.f22865b = p.d(a10.getInt(j11));
                    jVar.f22867d = a10.getString(j13);
                    jVar.f22868e = androidx.work.b.a(a10.getBlob(j14));
                    jVar.f22869f = androidx.work.b.a(a10.getBlob(j15));
                    jVar.f22870g = a10.getLong(i18);
                    jVar.f22871h = a10.getLong(i17);
                    jVar.f22872i = a10.getLong(i16);
                    jVar.f22874k = a10.getInt(i15);
                    jVar.f22875l = p.b(a10.getInt(i14));
                    jVar.f22876m = a10.getLong(i13);
                    jVar.f22877n = a10.getLong(i12);
                    jVar.f22878o = a10.getLong(i11);
                    jVar.f22879p = a10.getLong(j24);
                    jVar.f22873j = bVar;
                } else {
                    jVar = null;
                }
                a10.close();
                gVar.u();
                return jVar;
            } catch (Throwable th) {
                th = th;
                a10.close();
                gVar.u();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = i10;
            a10.close();
            gVar.u();
            throw th;
        }
    }

    public int i(String str) {
        this.f22882a.b();
        y1.e a10 = this.f22887f.a();
        if (str == null) {
            a10.f27989a.bindNull(1);
        } else {
            a10.f27989a.bindString(1, str);
        }
        this.f22882a.c();
        try {
            int a11 = a10.a();
            this.f22882a.j();
            this.f22882a.g();
            t1.h hVar = this.f22887f;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
            return a11;
        } catch (Throwable th) {
            this.f22882a.g();
            this.f22887f.c(a10);
            throw th;
        }
    }

    public int j(String str, long j10) {
        this.f22882a.b();
        y1.e a10 = this.f22889h.a();
        a10.f27989a.bindLong(1, j10);
        if (str == null) {
            a10.f27989a.bindNull(2);
        } else {
            a10.f27989a.bindString(2, str);
        }
        this.f22882a.c();
        try {
            int a11 = a10.a();
            this.f22882a.j();
            return a11;
        } finally {
            this.f22882a.g();
            t1.h hVar = this.f22889h;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
        }
    }

    public int k(String str) {
        this.f22882a.b();
        y1.e a10 = this.f22888g.a();
        if (str == null) {
            a10.f27989a.bindNull(1);
        } else {
            a10.f27989a.bindString(1, str);
        }
        this.f22882a.c();
        try {
            int a11 = a10.a();
            this.f22882a.j();
            this.f22882a.g();
            t1.h hVar = this.f22888g;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
            return a11;
        } catch (Throwable th) {
            this.f22882a.g();
            this.f22888g.c(a10);
            throw th;
        }
    }

    public void l(String str, androidx.work.b bVar) {
        this.f22882a.b();
        y1.e a10 = this.f22885d.a();
        byte[] c10 = androidx.work.b.c(bVar);
        if (c10 == null) {
            a10.f27989a.bindNull(1);
        } else {
            a10.f27989a.bindBlob(1, c10);
        }
        if (str == null) {
            a10.f27989a.bindNull(2);
        } else {
            a10.f27989a.bindString(2, str);
        }
        this.f22882a.c();
        try {
            a10.a();
            this.f22882a.j();
            this.f22882a.g();
            t1.h hVar = this.f22885d;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
        } catch (Throwable th) {
            this.f22882a.g();
            this.f22885d.c(a10);
            throw th;
        }
    }

    public void m(String str, long j10) {
        this.f22882a.b();
        y1.e a10 = this.f22886e.a();
        a10.f27989a.bindLong(1, j10);
        if (str == null) {
            a10.f27989a.bindNull(2);
        } else {
            a10.f27989a.bindString(2, str);
        }
        this.f22882a.c();
        try {
            a10.a();
            this.f22882a.j();
        } finally {
            this.f22882a.g();
            t1.h hVar = this.f22886e;
            if (a10 == hVar.f25409c) {
                hVar.f25407a.set(false);
            }
        }
    }

    public int n(androidx.work.d dVar, String... strArr) {
        this.f22882a.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE workspec SET state=");
        sb2.append("?");
        sb2.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("?");
            if (i10 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        y1.e d10 = this.f22882a.d(sb2.toString());
        d10.f27989a.bindLong(1, (long) p.e(dVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.f27989a.bindNull(i11);
            } else {
                d10.f27989a.bindString(i11, str);
            }
            i11++;
        }
        this.f22882a.c();
        try {
            int a10 = d10.a();
            this.f22882a.j();
            return a10;
        } finally {
            this.f22882a.g();
        }
    }
}
