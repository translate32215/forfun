package o8;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class i6 extends r5 {

    /* renamed from: d  reason: collision with root package name */
    public String f23272d;

    /* renamed from: e  reason: collision with root package name */
    public Set<Integer> f23273e;

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, e6> f23274f;

    /* renamed from: g  reason: collision with root package name */
    public Long f23275g;

    /* renamed from: h  reason: collision with root package name */
    public Long f23276h;

    public i6(u5 u5Var) {
        super(u5Var);
    }

    public final boolean k() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f6, code lost:
        if (r5 != null) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06fe, code lost:
        r65 = r2;
        r66 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0703, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0704, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0706, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0707, code lost:
        r65 = r2;
        r66 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0730, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x08c2, code lost:
        if (r10 == null) goto L_0x08c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x09cd, code lost:
        if (r8.B() == false) goto L_0x09d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x09cf, code lost:
        r8 = java.lang.Integer.valueOf(r8.s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x09d8, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09d9, code lost:
        r7.c("Invalid property filter ID. appId, id", r10, java.lang.String.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0171, code lost:
        if (r5 != null) goto L_0x0173;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0703 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:234:0x0660] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0725  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x07e4  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0a0b  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0aa3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b8 A[Catch:{ SQLiteException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c4 A[SYNTHETIC, Splitter:B:65:0x01c4] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<k8.u2> l(java.lang.String r65, java.util.List<k8.y2> r66, java.util.List<k8.r3> r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            r64 = this;
            r9 = r64
            java.lang.String r10 = "current_results"
            com.google.android.gms.common.internal.i.e(r65)
            com.google.android.gms.common.internal.i.h(r66)
            com.google.android.gms.common.internal.i.h(r67)
            r0 = r65
            r9.f23272d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.f23273e = r0
            s.a r0 = new s.a
            r0.<init>()
            r9.f23274f = r0
            r0 = r68
            r9.f23275g = r0
            r0 = r69
            r9.f23276h = r0
            java.util.Iterator r0 = r66.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            k8.y2 r1 = (k8.y2) r1
            java.lang.String r1 = r1.z()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            k8.fa.b()
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            o8.f r0 = r0.o()
            java.lang.String r2 = r9.f23272d
            o8.u2<java.lang.Boolean> r3 = o8.v2.Y
            boolean r13 = r0.v(r2, r3)
            k8.fa.b()
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            o8.f r0 = r0.o()
            java.lang.String r2 = r9.f23272d
            o8.u2<java.lang.Boolean> r3 = o8.v2.X
            boolean r14 = r0.v(r2, r3)
            if (r1 == 0) goto L_0x00af
            o8.u5 r0 = r9.f23413b
            o8.j r2 = r0.M()
            java.lang.String r3 = r9.f23272d
            r2.i()
            r2.h()
            com.google.android.gms.common.internal.i.e(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.C()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x009b }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.p()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r15 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r16 = "data"
            java.lang.String r7 = "audience_id"
            r6 = 2
            if (r14 == 0) goto L_0x017e
            if (r13 == 0) goto L_0x017e
            o8.u5 r0 = r9.f23413b
            o8.j r2 = r0.M()
            java.lang.String r3 = r9.f23272d
            com.google.android.gms.common.internal.i.e(r3)
            s.a r4 = new s.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r17 = r2.C()
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r0[r11] = r7     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r0[r12] = r16     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r5[r11] = r3     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String r18 = "event_filters"
            java.lang.String r20 = "app_id=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            r21 = r5
            android.database.Cursor r5 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 == 0) goto L_0x0150
        L_0x00f6:
            byte[] r0 = r5.getBlob(r12)     // Catch:{ SQLiteException -> 0x0155 }
            k8.v1 r12 = k8.w1.u()     // Catch:{ IOException -> 0x0130 }
            k8.f5 r0 = com.google.android.gms.measurement.internal.q.C(r12, r0)     // Catch:{ IOException -> 0x0130 }
            k8.v1 r0 = (k8.v1) r0     // Catch:{ IOException -> 0x0130 }
            k8.k6 r0 = r0.f()     // Catch:{ IOException -> 0x0130 }
            k8.w1 r0 = (k8.w1) r0     // Catch:{ IOException -> 0x0130 }
            boolean r12 = r0.F()     // Catch:{ SQLiteException -> 0x0155 }
            if (r12 != 0) goto L_0x0111
            goto L_0x0142
        L_0x0111:
            int r12 = r5.getInt(r11)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r17 = r4.get(r12)     // Catch:{ SQLiteException -> 0x0155 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x0155 }
            if (r17 != 0) goto L_0x012a
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0155 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0155 }
            r4.put(r12, r11)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x012c
        L_0x012a:
            r11 = r17
        L_0x012c:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0142
        L_0x0130:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r11 = r2.f8864a     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.h r11 = r11.d()     // Catch:{ SQLiteException -> 0x0155 }
            o8.a3 r11 = r11.p()     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.h.t(r3)     // Catch:{ SQLiteException -> 0x0155 }
            r11.c(r15, r12, r0)     // Catch:{ SQLiteException -> 0x0155 }
        L_0x0142:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 != 0) goto L_0x014d
            r5.close()
            r11 = r4
            goto L_0x017f
        L_0x014d:
            r11 = 0
            r12 = 1
            goto L_0x00f6
        L_0x0150:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0173
        L_0x0155:
            r0 = move-exception
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
            r5 = 0
            goto L_0x0178
        L_0x015a:
            r0 = move-exception
            r5 = 0
        L_0x015c:
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x0177 }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0177 }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0177 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r3)     // Catch:{ all -> 0x0177 }
            r2.c(r8, r3, r0)     // Catch:{ all -> 0x0177 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0177 }
            if (r5 == 0) goto L_0x017e
        L_0x0173:
            r5.close()
            goto L_0x017e
        L_0x0177:
            r0 = move-exception
        L_0x0178:
            if (r5 == 0) goto L_0x017d
            r5.close()
        L_0x017d:
            throw r0
        L_0x017e:
            r11 = r0
        L_0x017f:
            o8.u5 r0 = r9.f23413b
            o8.j r2 = r0.M()
            java.lang.String r3 = r9.f23272d
            r2.i()
            r2.h()
            com.google.android.gms.common.internal.i.e(r3)
            android.database.sqlite.SQLiteDatabase r17 = r2.C()
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r4 = 0
            r0[r4] = r7     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r5 = 1
            r0[r5] = r10     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            r12[r4] = r3     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            java.lang.String r18 = "audience_filter_values"
            java.lang.String r20 = "app_id=?"
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r0
            r21 = r12
            android.database.Cursor r4 = r17.query(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0227, all -> 0x0223 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x021f }
            if (r0 != 0) goto L_0x01c4
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x021f }
            r4.close()
            r12 = r0
            r20 = r7
            goto L_0x0248
        L_0x01c4:
            s.a r5 = new s.a     // Catch:{ SQLiteException -> 0x021f }
            r5.<init>()     // Catch:{ SQLiteException -> 0x021f }
        L_0x01c9:
            r12 = 0
            int r17 = r4.getInt(r12)     // Catch:{ SQLiteException -> 0x021f }
            r12 = 1
            byte[] r0 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x021f }
            k8.m3 r12 = k8.n3.x()     // Catch:{ IOException -> 0x01ef }
            k8.f5 r0 = com.google.android.gms.measurement.internal.q.C(r12, r0)     // Catch:{ IOException -> 0x01ef }
            k8.m3 r0 = (k8.m3) r0     // Catch:{ IOException -> 0x01ef }
            k8.k6 r0 = r0.f()     // Catch:{ IOException -> 0x01ef }
            k8.n3 r0 = (k8.n3) r0     // Catch:{ IOException -> 0x01ef }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x021f }
            r5.put(r12, r0)     // Catch:{ SQLiteException -> 0x021f }
            r19 = r5
            r20 = r7
            goto L_0x020b
        L_0x01ef:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r12 = r2.f8864a     // Catch:{ SQLiteException -> 0x021f }
            com.google.android.gms.measurement.internal.h r12 = r12.d()     // Catch:{ SQLiteException -> 0x021f }
            o8.a3 r12 = r12.p()     // Catch:{ SQLiteException -> 0x021f }
            java.lang.String r6 = "Failed to merge filter results. appId, audienceId, error"
            r19 = r5
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r3)     // Catch:{ SQLiteException -> 0x021f }
            r20 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x021d }
            r12.d(r6, r5, r7, r0)     // Catch:{ SQLiteException -> 0x021d }
        L_0x020b:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021d }
            if (r0 != 0) goto L_0x0217
            r4.close()
            r12 = r19
            goto L_0x0248
        L_0x0217:
            r5 = r19
            r7 = r20
            r6 = 2
            goto L_0x01c9
        L_0x021d:
            r0 = move-exception
            goto L_0x022b
        L_0x021f:
            r0 = move-exception
            r20 = r7
            goto L_0x022b
        L_0x0223:
            r0 = move-exception
            r5 = 0
            goto L_0x0aa1
        L_0x0227:
            r0 = move-exception
            r20 = r7
            r4 = 0
        L_0x022b:
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a     // Catch:{ all -> 0x0a9f }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x0a9f }
            o8.a3 r2 = r2.p()     // Catch:{ all -> 0x0a9f }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.h.t(r3)     // Catch:{ all -> 0x0a9f }
            r2.c(r5, r3, r0)     // Catch:{ all -> 0x0a9f }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0a9f }
            if (r4 == 0) goto L_0x0247
            r4.close()
        L_0x0247:
            r12 = r0
        L_0x0248:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0257
        L_0x024e:
            r29 = r8
            r23 = r10
            r28 = r20
            r11 = 2
            goto L_0x0574
        L_0x0257:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r12.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03cb
            java.lang.String r1 = r9.f23272d
            com.google.android.gms.common.internal.i.e(r1)
            com.google.android.gms.common.internal.i.h(r12)
            s.a r3 = new s.a
            r3.<init>()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0277
            goto L_0x03c2
        L_0x0277:
            o8.u5 r0 = r9.f23413b
            o8.j r4 = r0.M()
            r4.i()
            r4.h()
            com.google.android.gms.common.internal.i.e(r1)
            s.a r0 = new s.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.C()
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02dd, all -> 0x02d9 }
            r17 = 0
            r7[r17] = r1     // Catch:{ SQLiteException -> 0x02dd, all -> 0x02d9 }
            r17 = 1
            r7[r17] = r1     // Catch:{ SQLiteException -> 0x02dd, all -> 0x02d9 }
            java.lang.String r6 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch:{ SQLiteException -> 0x02dd, all -> 0x02d9 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02d7 }
            if (r6 == 0) goto L_0x02d2
        L_0x02a6:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02d7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02d7 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02d7 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02d7 }
            if (r7 != 0) goto L_0x02bf
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02d7 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02d7 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02d7 }
        L_0x02bf:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02d7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02d7 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02d7 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02d7 }
            if (r6 != 0) goto L_0x02a6
            goto L_0x02f8
        L_0x02d2:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02d7 }
            goto L_0x02f8
        L_0x02d7:
            r0 = move-exception
            goto L_0x02df
        L_0x02d9:
            r0 = move-exception
            r5 = 0
            goto L_0x03c5
        L_0x02dd:
            r0 = move-exception
            r5 = 0
        L_0x02df:
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a     // Catch:{ all -> 0x03c4 }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ all -> 0x03c4 }
            o8.a3 r4 = r4.p()     // Catch:{ all -> 0x03c4 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.h.t(r1)     // Catch:{ all -> 0x03c4 }
            r4.c(r6, r1, r0)     // Catch:{ all -> 0x03c4 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x03c4 }
            if (r5 == 0) goto L_0x02fb
        L_0x02f8:
            r5.close()
        L_0x02fb:
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0303:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03c2
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r12.get(r5)
            k8.n3 r6 = (k8.n3) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03b5
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x032d
            goto L_0x03b5
        L_0x032d:
            o8.u5 r5 = r9.f23413b
            com.google.android.gms.measurement.internal.q r5 = r5.P()
            r17 = r0
            java.util.List r0 = r6.C()
            java.util.List r0 = r5.G(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03b1
            k8.h6 r5 = r6.o()
            k8.m3 r5 = (k8.m3) r5
            r5.o()
            r5.m(r0)
            o8.u5 r0 = r9.f23413b
            com.google.android.gms.measurement.internal.q r0 = r0.P()
            r19 = r1
            java.util.List r1 = r6.E()
            java.util.List r0 = r0.G(r1, r7)
            r5.p()
            r5.n(r0)
            r0 = 0
        L_0x0366:
            int r1 = r6.s()
            if (r0 >= r1) goto L_0x0384
            k8.w2 r1 = r6.w(r0)
            int r1 = r1.s()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x0381
            r5.q(r0)
        L_0x0381:
            int r0 = r0 + 1
            goto L_0x0366
        L_0x0384:
            r0 = 0
        L_0x0385:
            int r1 = r6.u()
            if (r0 >= r1) goto L_0x03a3
            k8.p3 r1 = r6.A(r0)
            int r1 = r1.t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03a0
            r5.r(r0)
        L_0x03a0:
            int r0 = r0 + 1
            goto L_0x0385
        L_0x03a3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            k8.k6 r1 = r5.f()
            k8.n3 r1 = (k8.n3) r1
            r3.put(r0, r1)
            goto L_0x03bc
        L_0x03b1:
            r0 = r17
            goto L_0x0303
        L_0x03b5:
            r17 = r0
            r19 = r1
            r3.put(r5, r6)
        L_0x03bc:
            r0 = r17
            r1 = r19
            goto L_0x0303
        L_0x03c2:
            r0 = r3
            goto L_0x03cc
        L_0x03c4:
            r0 = move-exception
        L_0x03c5:
            if (r5 == 0) goto L_0x03ca
            r5.close()
        L_0x03ca:
            throw r0
        L_0x03cb:
            r0 = r12
        L_0x03cc:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d0:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x024e
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r19 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r0.get(r1)
            k8.n3 r1 = (k8.n3) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            s.a r7 = new s.a
            r7.<init>()
            if (r1 == 0) goto L_0x0438
            int r2 = r1.s()
            if (r2 != 0) goto L_0x0402
            goto L_0x0438
        L_0x0402:
            java.util.List r2 = r1.B()
            java.util.Iterator r2 = r2.iterator()
        L_0x040a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0438
            java.lang.Object r3 = r2.next()
            k8.w2 r3 = (k8.w2) r3
            boolean r4 = r3.z()
            if (r4 == 0) goto L_0x040a
            int r4 = r3.s()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.y()
            if (r21 == 0) goto L_0x0433
            long r21 = r3.t()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x0434
        L_0x0433:
            r3 = 0
        L_0x0434:
            r7.put(r4, r3)
            goto L_0x040a
        L_0x0438:
            s.a r4 = new s.a
            r4.<init>()
            if (r1 == 0) goto L_0x0488
            int r2 = r1.u()
            if (r2 != 0) goto L_0x0446
            goto L_0x0488
        L_0x0446:
            java.util.List r2 = r1.D()
            java.util.Iterator r2 = r2.iterator()
        L_0x044e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0488
            java.lang.Object r3 = r2.next()
            k8.p3 r3 = (k8.p3) r3
            boolean r21 = r3.A()
            if (r21 == 0) goto L_0x044e
            int r21 = r3.s()
            if (r21 <= 0) goto L_0x044e
            int r21 = r3.t()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.s()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.u(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x044e
        L_0x0488:
            r22 = r0
            if (r1 == 0) goto L_0x04dd
            r0 = 0
        L_0x048d:
            int r2 = r1.v()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04dd
            java.util.List r2 = r1.E()
            boolean r2 = com.google.android.gms.measurement.internal.q.L(r2, r0)
            if (r2 == 0) goto L_0x04cb
            com.google.android.gms.measurement.internal.l r2 = r9.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.q()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r10
            java.lang.String r10 = "Filter already evaluated. audience ID, filter ID"
            r2.c(r10, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.C()
            boolean r2 = com.google.android.gms.measurement.internal.q.L(r2, r0)
            if (r2 == 0) goto L_0x04cf
            r5.set(r0)
            goto L_0x04d6
        L_0x04cb:
            r21 = r8
            r23 = r10
        L_0x04cf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04d6:
            int r0 = r0 + 1
            r8 = r21
            r10 = r23
            goto L_0x048d
        L_0x04dd:
            r21 = r8
            r23 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            java.lang.Object r1 = r12.get(r0)
            r8 = r1
            k8.n3 r8 = (k8.n3) r8
            if (r14 == 0) goto L_0x054c
            if (r13 == 0) goto L_0x054c
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x054c
            java.lang.Long r1 = r9.f23276h
            if (r1 == 0) goto L_0x054c
            java.lang.Long r1 = r9.f23275g
            if (r1 != 0) goto L_0x0501
            goto L_0x054c
        L_0x0501:
            java.util.Iterator r0 = r0.iterator()
        L_0x0505:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x054c
            java.lang.Object r1 = r0.next()
            k8.w1 r1 = (k8.w1) r1
            int r2 = r1.t()
            java.lang.Long r3 = r9.f23276h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.D()
            if (r1 == 0) goto L_0x052d
            java.lang.Long r1 = r9.f23275g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x052d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x053e
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x053e:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x0505
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x0505
        L_0x054c:
            o8.e6 r0 = new o8.e6
            java.lang.String r3 = r9.f23272d
            r1 = r0
            r2 = r64
            r10 = r4
            r4 = r8
            r8 = 0
            r24 = r11
            r11 = 2
            r28 = r20
            r29 = r21
            r8 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Integer, o8.e6> r1 = r9.f23274f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r1.put(r2, r0)
            r0 = r22
            r10 = r23
            r11 = r24
            r8 = r29
            goto L_0x03d0
        L_0x0574:
            boolean r0 = r66.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0580
        L_0x057c:
            r12 = r29
            goto L_0x07dc
        L_0x0580:
            androidx.leanback.widget.t r2 = new androidx.leanback.widget.t
            r2.<init>((o8.i6) r9)
            s.a r3 = new s.a
            r3.<init>()
            java.util.Iterator r4 = r66.iterator()
        L_0x058e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x057c
            java.lang.Object r0 = r4.next()
            k8.y2 r0 = (k8.y2) r0
            java.lang.String r5 = r9.f23272d
            k8.y2 r5 = r2.e(r5, r0)
            if (r5 == 0) goto L_0x058e
            o8.u5 r6 = r9.f23413b
            o8.j r6 = r6.M()
            java.lang.String r7 = r9.f23272d
            java.lang.String r8 = r5.z()
            java.lang.String r10 = r0.z()
            o8.n r10 = r6.I(r7, r10)
            if (r10 != 0) goto L_0x05f7
            com.google.android.gms.measurement.internal.l r10 = r6.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.r()
            java.lang.Object r12 = com.google.android.gms.measurement.internal.h.t(r7)
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            o8.x2 r6 = r6.s()
            java.lang.String r6 = r6.d(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r10.c(r8, r12, r6)
            o8.n r6 = new o8.n
            r30 = r6
            java.lang.String r32 = r0.z()
            r33 = 1
            r35 = 1
            r37 = 1
            long r39 = r0.v()
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r31 = r7
            r30.<init>(r31, r32, r33, r35, r37, r39, r41, r43, r44, r45, r46)
            goto L_0x062c
        L_0x05f7:
            o8.n r6 = new o8.n
            r47 = r6
            java.lang.String r0 = r10.f23352a
            r48 = r0
            java.lang.String r0 = r10.f23353b
            r49 = r0
            long r7 = r10.f23354c
            r12 = 1
            long r50 = r7 + r12
            long r7 = r10.f23355d
            long r52 = r7 + r12
            long r7 = r10.f23356e
            long r54 = r7 + r12
            long r7 = r10.f23357f
            r56 = r7
            long r7 = r10.f23358g
            r58 = r7
            java.lang.Long r0 = r10.f23359h
            r60 = r0
            java.lang.Long r0 = r10.f23360i
            r61 = r0
            java.lang.Long r0 = r10.f23361j
            r62 = r0
            java.lang.Boolean r0 = r10.f23362k
            r63 = r0
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61, r62, r63)
        L_0x062c:
            o8.u5 r0 = r9.f23413b
            o8.j r0 = r0.M()
            r0.p(r6)
            long r7 = r6.f23354c
            java.lang.String r10 = r5.z()
            java.lang.Object r0 = r3.get(r10)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0734
            o8.u5 r0 = r9.f23413b
            o8.j r12 = r0.M()
            java.lang.String r13 = r9.f23272d
            r12.i()
            r12.h()
            com.google.android.gms.common.internal.i.e(r13)
            com.google.android.gms.common.internal.i.e(r10)
            s.a r14 = new s.a
            r14.<init>()
            android.database.sqlite.SQLiteDatabase r30 = r12.C()
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0706, all -> 0x0703 }
            r11 = r28
            r17 = 0
            r0[r17] = r11     // Catch:{ SQLiteException -> 0x06fd, all -> 0x0703 }
            r19 = 1
            r0[r19] = r16     // Catch:{ SQLiteException -> 0x06fd, all -> 0x0703 }
            r65 = r2
            r66 = r4
            r2 = 2
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x06f9, all -> 0x0703 }
            r4[r17] = r13     // Catch:{ SQLiteException -> 0x06f9, all -> 0x0703 }
            r4[r19] = r10     // Catch:{ SQLiteException -> 0x06f9, all -> 0x0703 }
            java.lang.String r31 = "event_filters"
            java.lang.String r33 = "app_id=? AND event_name=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r32 = r0
            r34 = r4
            android.database.Cursor r2 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x06f9, all -> 0x0703 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x06f5 }
            if (r0 == 0) goto L_0x06e6
        L_0x068f:
            r4 = 1
            byte[] r0 = r2.getBlob(r4)     // Catch:{ SQLiteException -> 0x06f5 }
            k8.v1 r4 = k8.w1.u()     // Catch:{ IOException -> 0x06c8 }
            k8.f5 r0 = com.google.android.gms.measurement.internal.q.C(r4, r0)     // Catch:{ IOException -> 0x06c8 }
            k8.v1 r0 = (k8.v1) r0     // Catch:{ IOException -> 0x06c8 }
            k8.k6 r0 = r0.f()     // Catch:{ IOException -> 0x06c8 }
            k8.w1 r0 = (k8.w1) r0     // Catch:{ IOException -> 0x06c8 }
            r4 = 0
            int r17 = r2.getInt(r4)     // Catch:{ SQLiteException -> 0x06f5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x06f5 }
            java.lang.Object r17 = r14.get(r4)     // Catch:{ SQLiteException -> 0x06f5 }
            java.util.List r17 = (java.util.List) r17     // Catch:{ SQLiteException -> 0x06f5 }
            if (r17 != 0) goto L_0x06c0
            r28 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x06f3 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x06f3 }
            r14.put(r4, r11)     // Catch:{ SQLiteException -> 0x06f3 }
            goto L_0x06c4
        L_0x06c0:
            r28 = r11
            r11 = r17
        L_0x06c4:
            r11.add(r0)     // Catch:{ SQLiteException -> 0x06f3 }
            goto L_0x06dc
        L_0x06c8:
            r0 = move-exception
            r28 = r11
            com.google.android.gms.measurement.internal.l r4 = r12.f8864a     // Catch:{ SQLiteException -> 0x06f3 }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ SQLiteException -> 0x06f3 }
            o8.a3 r4 = r4.p()     // Catch:{ SQLiteException -> 0x06f3 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.h.t(r13)     // Catch:{ SQLiteException -> 0x06f3 }
            r4.c(r15, r11, r0)     // Catch:{ SQLiteException -> 0x06f3 }
        L_0x06dc:
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x06f3 }
            if (r0 != 0) goto L_0x06e3
            goto L_0x06ec
        L_0x06e3:
            r11 = r28
            goto L_0x068f
        L_0x06e6:
            r28 = r11
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x06f3 }
        L_0x06ec:
            r2.close()
            r0 = r14
            r12 = r29
            goto L_0x0728
        L_0x06f3:
            r0 = move-exception
            goto L_0x070c
        L_0x06f5:
            r0 = move-exception
            r28 = r11
            goto L_0x070c
        L_0x06f9:
            r0 = move-exception
        L_0x06fa:
            r28 = r11
            goto L_0x070b
        L_0x06fd:
            r0 = move-exception
            r65 = r2
            r66 = r4
            goto L_0x06fa
        L_0x0703:
            r0 = move-exception
            r5 = 0
            goto L_0x072e
        L_0x0706:
            r0 = move-exception
            r65 = r2
            r66 = r4
        L_0x070b:
            r2 = 0
        L_0x070c:
            com.google.android.gms.measurement.internal.l r4 = r12.f8864a     // Catch:{ all -> 0x072c }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ all -> 0x072c }
            o8.a3 r4 = r4.p()     // Catch:{ all -> 0x072c }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.h.t(r13)     // Catch:{ all -> 0x072c }
            r12 = r29
            r4.c(r12, r11, r0)     // Catch:{ all -> 0x072c }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x072c }
            if (r2 == 0) goto L_0x0728
            r2.close()
        L_0x0728:
            r3.put(r10, r0)
            goto L_0x073a
        L_0x072c:
            r0 = move-exception
            r5 = r2
        L_0x072e:
            if (r5 == 0) goto L_0x0733
            r5.close()
        L_0x0733:
            throw r0
        L_0x0734:
            r65 = r2
            r66 = r4
            r12 = r29
        L_0x073a:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0742:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x07d3
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set<java.lang.Integer> r10 = r9.f23273e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x076c
            com.google.android.gms.measurement.internal.l r4 = r9.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.q()
            r4.b(r1, r11)
            goto L_0x0742
        L_0x076c:
            java.lang.Object r10 = r0.get(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 1
        L_0x0777:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x07c2
            java.lang.Object r11 = r10.next()
            k8.w1 r11 = (k8.w1) r11
            o8.f6 r13 = new o8.f6
            java.lang.String r14 = r9.f23272d
            r13.<init>(r9, r14, r4, r11)
            java.lang.Long r14 = r9.f23275g
            r17 = r0
            java.lang.Long r0 = r9.f23276h
            int r11 = r11.t()
            boolean r37 = r9.n(r4, r11)
            r30 = r13
            r31 = r14
            r32 = r0
            r33 = r5
            r34 = r7
            r36 = r6
            boolean r11 = r30.i(r31, r32, r33, r34, r36, r37)
            if (r11 == 0) goto L_0x07b8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            o8.e6 r0 = r9.m(r0)
            r0.b(r13)
            r0 = r17
            goto L_0x0777
        L_0x07b8:
            java.util.Set<java.lang.Integer> r0 = r9.f23273e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r0.add(r10)
            goto L_0x07c4
        L_0x07c2:
            r17 = r0
        L_0x07c4:
            if (r11 != 0) goto L_0x07cf
            java.util.Set<java.lang.Integer> r0 = r9.f23273e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
        L_0x07cf:
            r0 = r17
            goto L_0x0742
        L_0x07d3:
            r2 = r65
            r4 = r66
            r29 = r12
            r11 = 2
            goto L_0x058e
        L_0x07dc:
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L_0x07e4
            goto L_0x09f1
        L_0x07e4:
            s.a r2 = new s.a
            r2.<init>()
            java.util.Iterator r3 = r67.iterator()
        L_0x07ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x09f1
            java.lang.Object r0 = r3.next()
            r4 = r0
            k8.r3 r4 = (k8.r3) r4
            java.lang.String r5 = r4.x()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x08d3
            o8.u5 r0 = r9.f23413b
            o8.j r6 = r0.M()
            java.lang.String r7 = r9.f23272d
            r6.i()
            r6.h()
            com.google.android.gms.common.internal.i.e(r7)
            com.google.android.gms.common.internal.i.e(r5)
            s.a r8 = new s.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r30 = r6.C()
            r10 = 2
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            r11 = 0
            r0[r11] = r28     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            r13 = 1
            r0[r13] = r16     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            r14[r11] = r7     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            r14[r13] = r5     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            java.lang.String r31 = "property_filters"
            java.lang.String r33 = "app_id=? AND property_name=?"
            r35 = 0
            r36 = 0
            r37 = 0
            r32 = r0
            r34 = r14
            android.database.Cursor r10 = r30.query(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x08aa, all -> 0x08a7 }
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x08a4 }
            if (r0 == 0) goto L_0x089c
        L_0x084a:
            r11 = 1
            byte[] r0 = r10.getBlob(r11)     // Catch:{ SQLiteException -> 0x08a4 }
            k8.d2 r13 = k8.e2.u()     // Catch:{ IOException -> 0x087c }
            k8.f5 r0 = com.google.android.gms.measurement.internal.q.C(r13, r0)     // Catch:{ IOException -> 0x087c }
            k8.d2 r0 = (k8.d2) r0     // Catch:{ IOException -> 0x087c }
            k8.k6 r0 = r0.f()     // Catch:{ IOException -> 0x087c }
            k8.e2 r0 = (k8.e2) r0     // Catch:{ IOException -> 0x087c }
            r13 = 0
            int r14 = r10.getInt(r13)     // Catch:{ SQLiteException -> 0x08a2 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x08a2 }
            java.lang.Object r15 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08a2 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ SQLiteException -> 0x08a2 }
            if (r15 != 0) goto L_0x0878
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08a2 }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08a2 }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08a2 }
        L_0x0878:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08a2 }
            goto L_0x0891
        L_0x087c:
            r0 = move-exception
            r13 = 0
            com.google.android.gms.measurement.internal.l r14 = r6.f8864a     // Catch:{ SQLiteException -> 0x08a2 }
            com.google.android.gms.measurement.internal.h r14 = r14.d()     // Catch:{ SQLiteException -> 0x08a2 }
            o8.a3 r14 = r14.p()     // Catch:{ SQLiteException -> 0x08a2 }
            java.lang.String r15 = "Failed to merge filter"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.h.t(r7)     // Catch:{ SQLiteException -> 0x08a2 }
            r14.c(r15, r11, r0)     // Catch:{ SQLiteException -> 0x08a2 }
        L_0x0891:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x08a2 }
            if (r0 != 0) goto L_0x084a
            r10.close()
            r0 = r8
            goto L_0x08c7
        L_0x089c:
            r13 = 0
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08a2 }
            goto L_0x08c4
        L_0x08a2:
            r0 = move-exception
            goto L_0x08ad
        L_0x08a4:
            r0 = move-exception
            r13 = 0
            goto L_0x08ad
        L_0x08a7:
            r0 = move-exception
            r5 = 0
            goto L_0x08cd
        L_0x08aa:
            r0 = move-exception
            r13 = 0
            r10 = 0
        L_0x08ad:
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a     // Catch:{ all -> 0x08cb }
            com.google.android.gms.measurement.internal.h r6 = r6.d()     // Catch:{ all -> 0x08cb }
            o8.a3 r6 = r6.p()     // Catch:{ all -> 0x08cb }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.h.t(r7)     // Catch:{ all -> 0x08cb }
            r6.c(r12, r7, r0)     // Catch:{ all -> 0x08cb }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x08cb }
            if (r10 == 0) goto L_0x08c7
        L_0x08c4:
            r10.close()
        L_0x08c7:
            r2.put(r5, r0)
            goto L_0x08d4
        L_0x08cb:
            r0 = move-exception
            r5 = r10
        L_0x08cd:
            if (r5 == 0) goto L_0x08d2
            r5.close()
        L_0x08d2:
            throw r0
        L_0x08d3:
            r13 = 0
        L_0x08d4:
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x08dc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x07ed
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r9.f23273e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0907
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.q()
            r0.b(r1, r8)
            goto L_0x07ed
        L_0x0907:
            java.lang.Object r7 = r0.get(r8)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0912:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x09e3
            java.lang.Object r8 = r7.next()
            k8.e2 r8 = (k8.e2) r8
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            java.lang.String r10 = r10.w()
            r11 = 2
            boolean r10 = android.util.Log.isLoggable(r10, r11)
            if (r10 == 0) goto L_0x0979
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.q()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            boolean r15 = r8.B()
            if (r15 == 0) goto L_0x094c
            int r15 = r8.s()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x094d
        L_0x094c:
            r15 = 0
        L_0x094d:
            com.google.android.gms.measurement.internal.l r11 = r9.f8864a
            o8.x2 r11 = r11.s()
            java.lang.String r13 = r8.w()
            java.lang.String r11 = r11.f(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r10.d(r13, r14, r15, r11)
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.q()
            o8.u5 r11 = r9.f23413b
            com.google.android.gms.measurement.internal.q r11 = r11.P()
            java.lang.String r11 = r11.E(r8)
            java.lang.String r13 = "Filter definition"
            r10.b(r13, r11)
        L_0x0979:
            boolean r10 = r8.B()
            if (r10 == 0) goto L_0x09b9
            int r10 = r8.s()
            r11 = 256(0x100, float:3.59E-43)
            if (r10 <= r11) goto L_0x0988
            goto L_0x09b9
        L_0x0988:
            o8.h6 r10 = new o8.h6
            java.lang.String r11 = r9.f23272d
            r10.<init>(r9, r11, r6, r8)
            java.lang.Long r11 = r9.f23275g
            java.lang.Long r13 = r9.f23276h
            int r8 = r8.s()
            boolean r8 = r9.n(r6, r8)
            boolean r8 = r10.i(r11, r13, r4, r8)
            if (r8 == 0) goto L_0x09af
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            o8.e6 r11 = r9.m(r11)
            r11.b(r10)
            r13 = 0
            goto L_0x0912
        L_0x09af:
            java.util.Set<java.lang.Integer> r7 = r9.f23273e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r7.add(r10)
            goto L_0x09e3
        L_0x09b9:
            com.google.android.gms.measurement.internal.l r7 = r9.f8864a
            com.google.android.gms.measurement.internal.h r7 = r7.d()
            o8.a3 r7 = r7.r()
            java.lang.String r10 = r9.f23272d
            java.lang.Object r10 = com.google.android.gms.measurement.internal.h.t(r10)
            boolean r11 = r8.B()
            if (r11 == 0) goto L_0x09d8
            int r8 = r8.s()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x09d9
        L_0x09d8:
            r8 = 0
        L_0x09d9:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.c(r11, r10, r8)
            goto L_0x09e5
        L_0x09e3:
            if (r8 != 0) goto L_0x09ee
        L_0x09e5:
            java.util.Set<java.lang.Integer> r7 = r9.f23273e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
        L_0x09ee:
            r13 = 0
            goto L_0x08dc
        L_0x09f1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, o8.e6> r0 = r9.f23274f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r9.f23273e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a05:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a9e
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, o8.e6> r3 = r9.f23274f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            o8.e6 r3 = (o8.e6) r3
            com.google.android.gms.common.internal.i.h(r3)
            k8.u2 r0 = r3.a(r0)
            r1.add(r0)
            o8.u5 r3 = r9.f23413b
            o8.j r3 = r3.M()
            java.lang.String r5 = r9.f23272d
            k8.n3 r0 = r0.v()
            r3.i()
            r3.h()
            com.google.android.gms.common.internal.i.e(r5)
            com.google.android.gms.common.internal.i.h(r0)
            byte[] r0 = r0.i()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r7 = r28
            r6.put(r7, r4)
            r4 = r23
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.C()     // Catch:{ SQLiteException -> 0x0a83 }
            java.lang.String r8 = "audience_filter_values"
            r10 = 5
            r11 = 0
            long r12 = r0.insertWithOnConflict(r8, r11, r6, r10)     // Catch:{ SQLiteException -> 0x0a81 }
            r14 = -1
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0a98
            com.google.android.gms.measurement.internal.l r0 = r3.f8864a     // Catch:{ SQLiteException -> 0x0a81 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteException -> 0x0a81 }
            o8.a3 r0 = r0.p()     // Catch:{ SQLiteException -> 0x0a81 }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.h.t(r5)     // Catch:{ SQLiteException -> 0x0a81 }
            r0.b(r6, r8)     // Catch:{ SQLiteException -> 0x0a81 }
            goto L_0x0a98
        L_0x0a81:
            r0 = move-exception
            goto L_0x0a85
        L_0x0a83:
            r0 = move-exception
            r11 = 0
        L_0x0a85:
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.p()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.h.t(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.c(r6, r5, r0)
        L_0x0a98:
            r23 = r4
            r28 = r7
            goto L_0x0a05
        L_0x0a9e:
            return r1
        L_0x0a9f:
            r0 = move-exception
            r5 = r4
        L_0x0aa1:
            if (r5 == 0) goto L_0x0aa6
            r5.close()
        L_0x0aa6:
            goto L_0x0aa8
        L_0x0aa7:
            throw r0
        L_0x0aa8:
            goto L_0x0aa7
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.i6.l(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    public final e6 m(Integer num) {
        if (this.f23274f.containsKey(num)) {
            return this.f23274f.get(num);
        }
        e6 e6Var = new e6(this, this.f23272d);
        this.f23274f.put(num, e6Var);
        return e6Var;
    }

    public final boolean n(int i10, int i11) {
        e6 e6Var = this.f23274f.get(Integer.valueOf(i10));
        if (e6Var == null) {
            return false;
        }
        return e6Var.f23185d.get(i11);
    }
}
