package t1;

import x1.b;

/* compiled from: RoomOpenHelper */
public class f extends b.a {

    /* renamed from: b  reason: collision with root package name */
    public a f25395b;

    /* renamed from: c  reason: collision with root package name */
    public final a f25396c;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25397a;

        public a(int i10) {
            this.f25397a = i10;
        }

        public abstract void a(x1.a aVar);
    }

    public f(a aVar, a aVar2, String str, String str2) {
        super(aVar2.f25397a);
        this.f25395b = aVar;
        this.f25396c = aVar2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0469  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(x1.a r26, int r27, int r28) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            r3 = r28
            t1.a r4 = r1.f25395b
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0466
            t1.e$c r4 = r4.f25341d
            r4.getClass()
            if (r2 != r3) goto L_0x001b
            java.util.List r4 = java.util.Collections.emptyList()
            goto L_0x0078
        L_0x001b:
            if (r3 <= r2) goto L_0x001f
            r7 = 1
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r7 == 0) goto L_0x0029
            r9 = -1
            goto L_0x002a
        L_0x0029:
            r9 = 1
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r7 == 0) goto L_0x0030
            if (r10 >= r3) goto L_0x0077
            goto L_0x0032
        L_0x0030:
            if (r10 <= r3) goto L_0x0077
        L_0x0032:
            s.j<s.j<u1.a>> r11 = r4.f25394a
            java.lang.Object r11 = r11.d(r10)
            s.j r11 = (s.j) r11
            r12 = 0
            if (r11 != 0) goto L_0x003e
            goto L_0x0073
        L_0x003e:
            int r13 = r11.k()
            if (r7 == 0) goto L_0x0048
            int r13 = r13 + -1
            r14 = -1
            goto L_0x004b
        L_0x0048:
            r14 = 0
            r14 = r13
            r13 = 0
        L_0x004b:
            if (r13 == r14) goto L_0x006e
            int r15 = r11.g(r13)
            if (r7 == 0) goto L_0x0058
            if (r15 > r3) goto L_0x005f
            if (r15 <= r10) goto L_0x005f
            goto L_0x005c
        L_0x0058:
            if (r15 < r3) goto L_0x005f
            if (r15 >= r10) goto L_0x005f
        L_0x005c:
            r16 = 1
            goto L_0x0061
        L_0x005f:
            r16 = 0
        L_0x0061:
            if (r16 == 0) goto L_0x006c
            java.lang.Object r10 = r11.l(r13)
            r8.add(r10)
            r10 = 1
            goto L_0x0071
        L_0x006c:
            int r13 = r13 + r9
            goto L_0x004b
        L_0x006e:
            r11 = 0
            r15 = r10
            r10 = 0
        L_0x0071:
            if (r10 != 0) goto L_0x0075
        L_0x0073:
            r4 = r12
            goto L_0x0078
        L_0x0075:
            r10 = r15
            goto L_0x002b
        L_0x0077:
            r4 = r8
        L_0x0078:
            if (r4 == 0) goto L_0x0466
            t1.f$a r7 = r1.f25396c
            androidx.work.impl.WorkDatabase_Impl$a r7 = (androidx.work.impl.WorkDatabase_Impl.a) r7
            r7.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r0
            y1.a r8 = (y1.a) r8
            androidx.appcompat.widget.m r9 = new androidx.appcompat.widget.m
            java.lang.String r10 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            r9.<init>((java.lang.String) r10)
            android.database.Cursor r9 = r8.i(r9)
        L_0x0094:
            boolean r10 = r9.moveToNext()     // Catch:{ all -> 0x0461 }
            if (r10 == 0) goto L_0x00a2
            java.lang.String r10 = r9.getString(r6)     // Catch:{ all -> 0x0461 }
            r7.add(r10)     // Catch:{ all -> 0x0461 }
            goto L_0x0094
        L_0x00a2:
            r9.close()
            java.util.Iterator r7 = r7.iterator()
        L_0x00a9:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00c9
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "room_fts_content_sync_"
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto L_0x00a9
            java.lang.String r10 = "DROP TRIGGER IF EXISTS "
            java.lang.String r9 = j.f.a(r10, r9)
            android.database.sqlite.SQLiteDatabase r10 = r8.f27981a
            r10.execSQL(r9)
            goto L_0x00a9
        L_0x00c9:
            java.util.Iterator r4 = r4.iterator()
        L_0x00cd:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00dd
            java.lang.Object r7 = r4.next()
            u1.a r7 = (u1.a) r7
            r7.a(r0)
            goto L_0x00cd
        L_0x00dd:
            t1.f$a r4 = r1.f25396c
            androidx.work.impl.WorkDatabase_Impl$a r4 = (androidx.work.impl.WorkDatabase_Impl.a) r4
            r4.getClass()
            java.util.HashMap r4 = new java.util.HashMap
            r7 = 2
            r4.<init>(r7)
            v1.b$a r8 = new v1.b$a
            java.lang.String r9 = "work_spec_id"
            java.lang.String r10 = "TEXT"
            r8.<init>(r9, r10, r5, r5)
            r4.put(r9, r8)
            v1.b$a r8 = new v1.b$a
            java.lang.String r11 = "prerequisite_id"
            r8.<init>(r11, r10, r5, r7)
            r4.put(r11, r8)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r7)
            v1.b$b r7 = new v1.b$b
            java.lang.String[] r12 = new java.lang.String[r5]
            r12[r6] = r9
            java.util.List r16 = java.util.Arrays.asList(r12)
            java.lang.String[] r12 = new java.lang.String[r5]
            java.lang.String r15 = "id"
            r12[r6] = r15
            java.util.List r17 = java.util.Arrays.asList(r12)
            java.lang.String r13 = "WorkSpec"
            java.lang.String r14 = "CASCADE"
            java.lang.String r6 = "CASCADE"
            r12 = r7
            r18 = r15
            r15 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r8.add(r7)
            v1.b$b r6 = new v1.b$b
            java.lang.String[] r7 = new java.lang.String[r5]
            r12 = 0
            r7[r12] = r11
            java.util.List r23 = java.util.Arrays.asList(r7)
            java.lang.String[] r7 = new java.lang.String[r5]
            r13 = r18
            r7[r12] = r13
            java.util.List r24 = java.util.Arrays.asList(r7)
            java.lang.String r20 = "WorkSpec"
            java.lang.String r21 = "CASCADE"
            java.lang.String r22 = "CASCADE"
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24)
            r8.add(r6)
            java.util.HashSet r6 = new java.util.HashSet
            r7 = 2
            r6.<init>(r7)
            v1.b$d r7 = new v1.b$d
            java.lang.String[] r12 = new java.lang.String[r5]
            r14 = 0
            r12[r14] = r9
            java.util.List r12 = java.util.Arrays.asList(r12)
            java.lang.String r15 = "index_Dependency_work_spec_id"
            r7.<init>(r15, r14, r12)
            r6.add(r7)
            v1.b$d r7 = new v1.b$d
            java.lang.String[] r12 = new java.lang.String[r5]
            r12[r14] = r11
            java.util.List r11 = java.util.Arrays.asList(r12)
            java.lang.String r12 = "index_Dependency_prerequisite_id"
            r7.<init>(r12, r14, r11)
            r6.add(r7)
            v1.b r7 = new v1.b
            java.lang.String r11 = "Dependency"
            r7.<init>(r11, r4, r8, r6)
            v1.b r4 = v1.b.a(r0, r11)
            boolean r6 = r7.equals(r4)
            java.lang.String r8 = "\n Found:\n"
            if (r6 == 0) goto L_0x0444
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 23
            r4.<init>(r6)
            v1.b$a r6 = new v1.b$a
            r6.<init>(r13, r10, r5, r5)
            r4.put(r13, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "state"
            java.lang.String r11 = "INTEGER"
            r12 = 0
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "worker_class_name"
            r6.<init>(r7, r10, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "input_merger_class_name"
            r6.<init>(r7, r10, r12, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "input"
            java.lang.String r14 = "BLOB"
            r6.<init>(r7, r14, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "output"
            r6.<init>(r7, r14, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "initial_delay"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "interval_duration"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "flex_duration"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "run_attempt_count"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "backoff_policy"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "backoff_delay_duration"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "period_start_time"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "minimum_retention_duration"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "schedule_requested_at"
            r6.<init>(r7, r11, r5, r12)
            r4.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "required_network_type"
            r6.<init>(r15, r11, r12, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "requires_charging"
            r6.<init>(r15, r11, r5, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "requires_device_idle"
            r6.<init>(r15, r11, r5, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "requires_battery_not_low"
            r6.<init>(r15, r11, r5, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "requires_storage_not_low"
            r6.<init>(r15, r11, r5, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "trigger_content_update_delay"
            r6.<init>(r15, r11, r5, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "trigger_max_content_delay"
            r6.<init>(r15, r11, r5, r12)
            r4.put(r15, r6)
            v1.b$a r6 = new v1.b$a
            java.lang.String r15 = "content_uri_triggers"
            r6.<init>(r15, r14, r12, r12)
            r4.put(r15, r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r12)
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r5)
            v1.b$d r15 = new v1.b$d
            java.lang.String[] r2 = new java.lang.String[r5]
            r2[r12] = r7
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r7 = "index_WorkSpec_schedule_requested_at"
            r15.<init>(r7, r12, r2)
            r14.add(r15)
            v1.b r2 = new v1.b
            java.lang.String r7 = "WorkSpec"
            r2.<init>(r7, r4, r6, r14)
            v1.b r4 = v1.b.a(r0, r7)
            boolean r6 = r2.equals(r4)
            if (r6 == 0) goto L_0x0427
            java.util.HashMap r2 = new java.util.HashMap
            r4 = 2
            r2.<init>(r4)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "tag"
            r6.<init>(r7, r10, r5, r5)
            r2.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            r6.<init>(r9, r10, r5, r4)
            r2.put(r9, r6)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            v1.b$b r6 = new v1.b$b
            java.lang.String[] r7 = new java.lang.String[r5]
            r12 = 0
            r7[r12] = r9
            java.util.List r18 = java.util.Arrays.asList(r7)
            java.lang.String[] r7 = new java.lang.String[r5]
            r7[r12] = r13
            java.util.List r19 = java.util.Arrays.asList(r7)
            java.lang.String r15 = "WorkSpec"
            java.lang.String r16 = "CASCADE"
            java.lang.String r17 = "CASCADE"
            r14 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r4.add(r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r5)
            v1.b$d r7 = new v1.b$d
            java.lang.String[] r12 = new java.lang.String[r5]
            r14 = 0
            r12[r14] = r9
            java.util.List r12 = java.util.Arrays.asList(r12)
            java.lang.String r15 = "index_WorkTag_work_spec_id"
            r7.<init>(r15, r14, r12)
            r6.add(r7)
            v1.b r7 = new v1.b
            java.lang.String r12 = "WorkTag"
            r7.<init>(r12, r2, r4, r6)
            v1.b r2 = v1.b.a(r0, r12)
            boolean r4 = r7.equals(r2)
            if (r4 == 0) goto L_0x040a
            java.util.HashMap r2 = new java.util.HashMap
            r4 = 2
            r2.<init>(r4)
            v1.b$a r4 = new v1.b$a
            r4.<init>(r9, r10, r5, r5)
            r2.put(r9, r4)
            v1.b$a r4 = new v1.b$a
            java.lang.String r6 = "system_id"
            r7 = 0
            r4.<init>(r6, r11, r5, r7)
            r2.put(r6, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            v1.b$b r6 = new v1.b$b
            java.lang.String[] r11 = new java.lang.String[r5]
            r11[r7] = r9
            java.util.List r18 = java.util.Arrays.asList(r11)
            java.lang.String[] r11 = new java.lang.String[r5]
            r11[r7] = r13
            java.util.List r19 = java.util.Arrays.asList(r11)
            java.lang.String r15 = "WorkSpec"
            java.lang.String r16 = "CASCADE"
            java.lang.String r17 = "CASCADE"
            r14 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r4.add(r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r7)
            v1.b r7 = new v1.b
            java.lang.String r11 = "SystemIdInfo"
            r7.<init>(r11, r2, r4, r6)
            v1.b r2 = v1.b.a(r0, r11)
            boolean r4 = r7.equals(r2)
            if (r4 == 0) goto L_0x03ed
            java.util.HashMap r2 = new java.util.HashMap
            r4 = 2
            r2.<init>(r4)
            v1.b$a r6 = new v1.b$a
            java.lang.String r7 = "name"
            r6.<init>(r7, r10, r5, r5)
            r2.put(r7, r6)
            v1.b$a r6 = new v1.b$a
            r6.<init>(r9, r10, r5, r4)
            r2.put(r9, r6)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            v1.b$b r6 = new v1.b$b
            java.lang.String[] r7 = new java.lang.String[r5]
            r10 = 0
            r7[r10] = r9
            java.util.List r18 = java.util.Arrays.asList(r7)
            java.lang.String[] r7 = new java.lang.String[r5]
            r7[r10] = r13
            java.util.List r19 = java.util.Arrays.asList(r7)
            java.lang.String r15 = "WorkSpec"
            java.lang.String r16 = "CASCADE"
            java.lang.String r17 = "CASCADE"
            r14 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            r4.add(r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r5)
            v1.b$d r7 = new v1.b$d
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r10] = r9
            java.util.List r5 = java.util.Arrays.asList(r5)
            java.lang.String r9 = "index_WorkName_work_spec_id"
            r7.<init>(r9, r10, r5)
            r6.add(r7)
            v1.b r5 = new v1.b
            java.lang.String r7 = "WorkName"
            r5.<init>(r7, r2, r4, r6)
            v1.b r2 = v1.b.a(r0, r7)
            boolean r4 = r5.equals(r2)
            if (r4 == 0) goto L_0x03d0
            t1.f$a r2 = r1.f25396c
            r2.getClass()
            r25.c(r26)
            r2 = 1
            goto L_0x0467
        L_0x03d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"
            r3.append(r4)
            r3.append(r5)
            r3.append(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x03ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"
            r3.append(r4)
            r3.append(r7)
            r3.append(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x040a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"
            r3.append(r4)
            r3.append(r7)
            r3.append(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0427:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"
            r3.append(r5)
            r3.append(r2)
            r3.append(r8)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0444:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"
            r2.append(r3)
            r2.append(r7)
            r2.append(r8)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0461:
            r0 = move-exception
            r9.close()
            throw r0
        L_0x0466:
            r2 = 0
        L_0x0467:
            if (r2 != 0) goto L_0x04d7
            t1.a r2 = r1.f25395b
            r4 = r27
            if (r2 == 0) goto L_0x04b3
            if (r4 <= r3) goto L_0x0473
            r5 = 1
            goto L_0x0474
        L_0x0473:
            r5 = 0
        L_0x0474:
            if (r5 == 0) goto L_0x047c
            boolean r5 = r2.f25348k
            if (r5 == 0) goto L_0x047c
            r2 = 0
            goto L_0x047e
        L_0x047c:
            boolean r2 = r2.f25347j
        L_0x047e:
            if (r2 != 0) goto L_0x04b3
            t1.f$a r2 = r1.f25396c
            androidx.work.impl.WorkDatabase_Impl$a r2 = (androidx.work.impl.WorkDatabase_Impl.a) r2
            r2.getClass()
            r2 = r0
            y1.a r2 = (y1.a) r2
            android.database.sqlite.SQLiteDatabase r3 = r2.f27981a
            java.lang.String r4 = "DROP TABLE IF EXISTS `Dependency`"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r3 = r2.f27981a
            java.lang.String r4 = "DROP TABLE IF EXISTS `WorkSpec`"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r3 = r2.f27981a
            java.lang.String r4 = "DROP TABLE IF EXISTS `WorkTag`"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r3 = r2.f27981a
            java.lang.String r4 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            r3.execSQL(r4)
            android.database.sqlite.SQLiteDatabase r2 = r2.f27981a
            java.lang.String r3 = "DROP TABLE IF EXISTS `WorkName`"
            r2.execSQL(r3)
            t1.f$a r2 = r1.f25396c
            r2.a(r0)
            goto L_0x04d7
        L_0x04b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "A migration from "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = " to "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x04d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.f.b(x1.a, int, int):void");
    }

    public final void c(x1.a aVar) {
        y1.a aVar2 = (y1.a) aVar;
        aVar2.f27981a.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar2.f27981a.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
    }
}
