package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import c6.d;
import com.google.android.gms.common.internal.i;
import f7.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o8.b;
import o8.d4;
import o8.e5;
import o8.f5;
import o8.g5;
import o8.k;
import o8.k3;
import o8.v2;
import o8.y2;
import r7.h;
import y7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class p extends k3 {

    /* renamed from: c  reason: collision with root package name */
    public final g5 f8866c;

    /* renamed from: d  reason: collision with root package name */
    public d f8867d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f8868e;

    /* renamed from: f  reason: collision with root package name */
    public final k f8869f;

    /* renamed from: g  reason: collision with root package name */
    public final d f8870g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Runnable> f8871h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final k f8872i;

    public p(l lVar) {
        super(lVar);
        this.f8870g = new d(lVar.f8850n);
        this.f8866c = new g5(this);
        this.f8869f = new e5(this, (d4) lVar);
        this.f8872i = new f5(this, (d4) lVar);
    }

    public static void v(p pVar, ComponentName componentName) {
        pVar.h();
        if (pVar.f8867d != null) {
            pVar.f8867d = null;
            pVar.f8864a.d().f8805n.b("Disconnected from device MeasurementService", componentName);
            pVar.h();
            pVar.w();
        }
    }

    public final boolean k() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:84|85|86|87) */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0211, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r9.f8864a.d().f8797f.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r9.f8864a.d().f8797f.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r6.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0175, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r9.f8864a.d().f8797f.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r6.recycle();
        r7 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0108 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x013a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x017d */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0227 A[SYNTHETIC, Splitter:B:130:0x0227] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x022f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0255 A[SYNTHETIC, Splitter:B:157:0x0255] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x022a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x02ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x02ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x02ab A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(com.google.android.gms.measurement.internal.d r29, w7.a r30, o8.b6 r31) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r28.h()
            r28.i()
            r28.u()
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            r0.getClass()
            r5 = 100
            r6 = 0
            r0 = 100
            r7 = 0
        L_0x001c:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L_0x0369
            if (r0 != r5) goto L_0x0369
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            com.google.android.gms.measurement.internal.g r9 = r0.r()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.h()
            boolean r0 = r9.f8793d
            if (r0 == 0) goto L_0x0039
            goto L_0x005c
        L_0x0039:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            android.content.Context r0 = r0.f8837a
            java.lang.String r14 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r14)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x02d9
            r14 = 5
            r12 = 5
            r15 = 0
        L_0x0051:
            if (r15 >= r14) goto L_0x02c7
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.l()     // Catch:{ SQLiteFullException -> 0x028b, SQLiteDatabaseLockedException -> 0x0275, SQLiteException -> 0x024b, all -> 0x0246 }
            if (r5 != 0) goto L_0x0061
            r9.f8793d = r14     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0237, SQLiteException -> 0x0231, all -> 0x022f }
        L_0x005c:
            r25 = r7
            r6 = r8
            goto L_0x02d7
        L_0x0061:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x023f, SQLiteDatabaseLockedException -> 0x0237, SQLiteException -> 0x0231, all -> 0x022f }
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            r25 = r7
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ all -> 0x021b }
            r7[r6] = r10     // Catch:{ all -> 0x021b }
            java.lang.String r19 = "type=?"
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ all -> 0x021b }
            r1[r6] = r0     // Catch:{ all -> 0x021b }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            r18 = r7
            r20 = r1
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x021b }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0216 }
            r26 = -1
            if (r0 == 0) goto L_0x0096
            long r16 = r1.getLong(r6)     // Catch:{ all -> 0x0216 }
            r1.close()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            goto L_0x009b
        L_0x0096:
            r1.close()     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            r16 = r26
        L_0x009b:
            int r0 = (r16 > r26 ? 1 : (r16 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r1 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            java.lang.String r7 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            r1[r6] = r7     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            r19 = r0
            r20 = r1
            goto L_0x00b2
        L_0x00ae:
            r19 = 0
            r20 = 0
        L_0x00b2:
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            r1[r6] = r10     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            java.lang.String r7 = "type"
            r1[r14] = r7     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            java.lang.String r7 = "entry"
            r0 = 2
            r1[r0] = r7     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            java.lang.String r17 = "messages"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r7 = 100
            java.lang.String r24 = java.lang.Integer.toString(r7)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
            r16 = r5
            r18 = r1
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x0211, SQLiteDatabaseLockedException -> 0x0239, SQLiteException -> 0x020c, all -> 0x022f }
        L_0x00d6:
            boolean r7 = r1.moveToNext()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            if (r7 == 0) goto L_0x01bf
            long r26 = r1.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            int r7 = r1.getInt(r14)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            byte[] r14 = r1.getBlob(r0)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            if (r7 != 0) goto L_0x011d
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            int r0 = r14.length     // Catch:{ a -> 0x0108 }
            r7.unmarshall(r14, r6, r0)     // Catch:{ a -> 0x0108 }
            r7.setDataPosition(r6)     // Catch:{ a -> 0x0108 }
            android.os.Parcelable$Creator<o8.r> r0 = o8.r.CREATOR     // Catch:{ a -> 0x0108 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ a -> 0x0108 }
            o8.r r0 = (o8.r) r0     // Catch:{ a -> 0x0108 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x0150
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            goto L_0x0150
        L_0x0106:
            r0 = move-exception
            goto L_0x0119
        L_0x0108:
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a     // Catch:{ all -> 0x0106 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0106 }
            o8.a3 r0 = r0.f8797f     // Catch:{ all -> 0x0106 }
            java.lang.String r14 = "Failed to load event from local database"
            r0.a(r14)     // Catch:{ all -> 0x0106 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            goto L_0x0150
        L_0x0119:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
        L_0x011d:
            r6 = 1
            if (r7 != r6) goto L_0x0158
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            int r0 = r14.length     // Catch:{ a -> 0x013a }
            r7 = 0
            r6.unmarshall(r14, r7, r0)     // Catch:{ a -> 0x013a }
            r6.setDataPosition(r7)     // Catch:{ a -> 0x013a }
            android.os.Parcelable$Creator<o8.w5> r0 = o8.w5.CREATOR     // Catch:{ a -> 0x013a }
            java.lang.Object r0 = r0.createFromParcel(r6)     // Catch:{ a -> 0x013a }
            o8.w5 r0 = (o8.w5) r0     // Catch:{ a -> 0x013a }
            r6.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            goto L_0x014b
        L_0x0138:
            r0 = move-exception
            goto L_0x0154
        L_0x013a:
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ all -> 0x0138 }
            o8.a3 r0 = r0.f8797f     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = "Failed to load user property from local database"
            r0.a(r7)     // Catch:{ all -> 0x0138 }
            r6.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            r0 = 0
        L_0x014b:
            if (r0 == 0) goto L_0x0150
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
        L_0x0150:
            r17 = r10
            r0 = 2
            goto L_0x0193
        L_0x0154:
            r6.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
        L_0x0158:
            r0 = 2
            if (r7 != r0) goto L_0x0199
            android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x0204, SQLiteException -> 0x0200 }
            int r7 = r14.length     // Catch:{ a -> 0x017b, all -> 0x0177 }
            r17 = r10
            r10 = 0
            r6.unmarshall(r14, r10, r7)     // Catch:{ a -> 0x017d }
            r6.setDataPosition(r10)     // Catch:{ a -> 0x017d }
            android.os.Parcelable$Creator<o8.b> r7 = o8.b.CREATOR     // Catch:{ a -> 0x017d }
            java.lang.Object r7 = r7.createFromParcel(r6)     // Catch:{ a -> 0x017d }
            o8.b r7 = (o8.b) r7     // Catch:{ a -> 0x017d }
            r6.recycle()     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            goto L_0x018e
        L_0x0175:
            r0 = move-exception
            goto L_0x0195
        L_0x0177:
            r0 = move-exception
            r17 = r10
            goto L_0x0195
        L_0x017b:
            r17 = r10
        L_0x017d:
            com.google.android.gms.measurement.internal.l r7 = r9.f8864a     // Catch:{ all -> 0x0175 }
            com.google.android.gms.measurement.internal.h r7 = r7.d()     // Catch:{ all -> 0x0175 }
            o8.a3 r7 = r7.f8797f     // Catch:{ all -> 0x0175 }
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r7.a(r10)     // Catch:{ all -> 0x0175 }
            r6.recycle()     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            r7 = 0
        L_0x018e:
            if (r7 == 0) goto L_0x0193
            r13.add(r7)     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
        L_0x0193:
            r6 = 3
            goto L_0x01b9
        L_0x0195:
            r6.recycle()     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            throw r0     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
        L_0x0199:
            r17 = r10
            r6 = 3
            if (r7 != r6) goto L_0x01ac
            com.google.android.gms.measurement.internal.l r7 = r9.f8864a     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            com.google.android.gms.measurement.internal.h r7 = r7.d()     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            o8.a3 r7 = r7.f8800i     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            java.lang.String r10 = "Skipping app launch break"
            r7.a(r10)     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            goto L_0x01b9
        L_0x01ac:
            com.google.android.gms.measurement.internal.l r7 = r9.f8864a     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            com.google.android.gms.measurement.internal.h r7 = r7.d()     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            o8.a3 r7 = r7.f8797f     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            java.lang.String r10 = "Unknown record type in local database"
            r7.a(r10)     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
        L_0x01b9:
            r10 = r17
            r6 = 0
            r14 = 1
            goto L_0x00d6
        L_0x01bf:
            r17 = r10
            r6 = 1
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            java.lang.String r6 = java.lang.Long.toString(r26)     // Catch:{ SQLiteFullException -> 0x01fd, SQLiteDatabaseLockedException -> 0x0206, SQLiteException -> 0x01f9 }
            r7 = 0
            r0[r7] = r6     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            java.lang.String r6 = "messages"
            java.lang.String r10 = "rowid <= ?"
            int r0 = r5.delete(r6, r10, r0)     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            int r6 = r13.size()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            if (r0 >= r6) goto L_0x01e6
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            o8.a3 r0 = r0.f8797f     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            java.lang.String r6 = "Fewer entries removed from local database than expected"
            r0.a(r6)     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
        L_0x01e6:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x01f7, SQLiteDatabaseLockedException -> 0x023d, SQLiteException -> 0x01f4 }
            r1.close()
            r5.close()
            goto L_0x02db
        L_0x01f4:
            r0 = move-exception
            goto L_0x0253
        L_0x01f7:
            r0 = move-exception
            goto L_0x0244
        L_0x01f9:
            r0 = move-exception
        L_0x01fa:
            r7 = 0
            goto L_0x0253
        L_0x01fd:
            r0 = move-exception
        L_0x01fe:
            r7 = 0
            goto L_0x0244
        L_0x0200:
            r0 = move-exception
            r17 = r10
            goto L_0x01fa
        L_0x0204:
            r17 = r10
        L_0x0206:
            r7 = 0
            goto L_0x023d
        L_0x0208:
            r0 = move-exception
            r17 = r10
            goto L_0x01fe
        L_0x020c:
            r0 = move-exception
        L_0x020d:
            r17 = r10
            r7 = 0
            goto L_0x0235
        L_0x0211:
            r0 = move-exception
        L_0x0212:
            r17 = r10
            r7 = 0
            goto L_0x0243
        L_0x0216:
            r0 = move-exception
            r17 = r10
            r7 = 0
            goto L_0x0225
        L_0x021b:
            r0 = move-exception
        L_0x021c:
            r17 = r10
            r7 = 0
            goto L_0x0224
        L_0x0220:
            r0 = move-exception
            r25 = r7
            goto L_0x021c
        L_0x0224:
            r1 = 0
        L_0x0225:
            if (r1 == 0) goto L_0x022a
            r1.close()     // Catch:{ SQLiteFullException -> 0x022d, SQLiteDatabaseLockedException -> 0x023c, SQLiteException -> 0x022b, all -> 0x022f }
        L_0x022a:
            throw r0     // Catch:{ SQLiteFullException -> 0x022d, SQLiteDatabaseLockedException -> 0x023c, SQLiteException -> 0x022b, all -> 0x022f }
        L_0x022b:
            r0 = move-exception
            goto L_0x0235
        L_0x022d:
            r0 = move-exception
            goto L_0x0243
        L_0x022f:
            r0 = move-exception
            goto L_0x0248
        L_0x0231:
            r0 = move-exception
            r25 = r7
            goto L_0x020d
        L_0x0235:
            r1 = 0
            goto L_0x0253
        L_0x0237:
            r25 = r7
        L_0x0239:
            r17 = r10
            r7 = 0
        L_0x023c:
            r1 = 0
        L_0x023d:
            r6 = r8
            goto L_0x027d
        L_0x023f:
            r0 = move-exception
            r25 = r7
            goto L_0x0212
        L_0x0243:
            r1 = 0
        L_0x0244:
            r6 = r8
            goto L_0x0293
        L_0x0246:
            r0 = move-exception
            r5 = 0
        L_0x0248:
            r12 = 0
            goto L_0x02bc
        L_0x024b:
            r0 = move-exception
            r25 = r7
            r17 = r10
            r7 = 0
            r1 = 0
            r5 = 0
        L_0x0253:
            if (r5 == 0) goto L_0x025e
            boolean r6 = r5.inTransaction()     // Catch:{ all -> 0x02ba }
            if (r6 == 0) goto L_0x025e
            r5.endTransaction()     // Catch:{ all -> 0x02ba }
        L_0x025e:
            com.google.android.gms.measurement.internal.l r6 = r9.f8864a     // Catch:{ all -> 0x02ba }
            com.google.android.gms.measurement.internal.h r6 = r6.d()     // Catch:{ all -> 0x02ba }
            o8.a3 r6 = r6.f8797f     // Catch:{ all -> 0x02ba }
            r6.b(r11, r0)     // Catch:{ all -> 0x02ba }
            r6 = 1
            r9.f8793d = r6     // Catch:{ all -> 0x02ba }
            if (r1 == 0) goto L_0x0271
            r1.close()
        L_0x0271:
            r6 = r8
            if (r5 == 0) goto L_0x02ab
            goto L_0x02a8
        L_0x0275:
            r25 = r7
            r17 = r10
            r7 = 0
            r6 = r8
            r1 = 0
            r5 = 0
        L_0x027d:
            long r7 = (long) r12
            android.os.SystemClock.sleep(r7)     // Catch:{ all -> 0x02ba }
            int r12 = r12 + 20
            if (r1 == 0) goto L_0x0288
            r1.close()
        L_0x0288:
            if (r5 == 0) goto L_0x02ab
            goto L_0x02a8
        L_0x028b:
            r0 = move-exception
            r25 = r7
            r6 = r8
            r17 = r10
            r1 = 0
            r5 = 0
        L_0x0293:
            com.google.android.gms.measurement.internal.l r7 = r9.f8864a     // Catch:{ all -> 0x02ba }
            com.google.android.gms.measurement.internal.h r7 = r7.d()     // Catch:{ all -> 0x02ba }
            o8.a3 r7 = r7.f8797f     // Catch:{ all -> 0x02ba }
            r7.b(r11, r0)     // Catch:{ all -> 0x02ba }
            r7 = 1
            r9.f8793d = r7     // Catch:{ all -> 0x02ba }
            if (r1 == 0) goto L_0x02a6
            r1.close()
        L_0x02a6:
            if (r5 == 0) goto L_0x02ab
        L_0x02a8:
            r5.close()
        L_0x02ab:
            int r15 = r15 + 1
            r1 = r28
            r8 = r6
            r10 = r17
            r7 = r25
            r5 = 100
            r6 = 0
            r14 = 5
            goto L_0x0051
        L_0x02ba:
            r0 = move-exception
            r12 = r1
        L_0x02bc:
            if (r12 == 0) goto L_0x02c1
            r12.close()
        L_0x02c1:
            if (r5 == 0) goto L_0x02c6
            r5.close()
        L_0x02c6:
            throw r0
        L_0x02c7:
            r25 = r7
            r6 = r8
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8800i
            java.lang.String r1 = "Failed to read events from database in reasonable time"
            r0.a(r1)
        L_0x02d7:
            r12 = 0
            goto L_0x02dd
        L_0x02d9:
            r25 = r7
        L_0x02db:
            r6 = r8
            r12 = r13
        L_0x02dd:
            if (r12 == 0) goto L_0x02e8
            r6.addAll(r12)
            int r0 = r12.size()
            r1 = r0
            goto L_0x02e9
        L_0x02e8:
            r1 = 0
        L_0x02e9:
            r5 = 100
            if (r3 == 0) goto L_0x02f2
            if (r1 >= r5) goto L_0x02f2
            r6.add(r3)
        L_0x02f2:
            int r7 = r6.size()
            r8 = 0
        L_0x02f7:
            if (r8 >= r7) goto L_0x0360
            java.lang.Object r0 = r6.get(r8)
            w7.a r0 = (w7.a) r0
            boolean r9 = r0 instanceof o8.r
            if (r9 == 0) goto L_0x031c
            o8.r r0 = (o8.r) r0     // Catch:{ RemoteException -> 0x030b }
            r2.T2(r0, r4)     // Catch:{ RemoteException -> 0x030b }
            r9 = r28
            goto L_0x035d
        L_0x030b:
            r0 = move-exception
            r9 = r28
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.f8797f
            java.lang.String r11 = "Failed to send event to the service"
            r10.b(r11, r0)
            goto L_0x035d
        L_0x031c:
            r9 = r28
            boolean r10 = r0 instanceof o8.w5
            if (r10 == 0) goto L_0x0337
            o8.w5 r0 = (o8.w5) r0     // Catch:{ RemoteException -> 0x0328 }
            r2.H3(r0, r4)     // Catch:{ RemoteException -> 0x0328 }
            goto L_0x035d
        L_0x0328:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.f8797f
            java.lang.String r11 = "Failed to send user property to the service"
            r10.b(r11, r0)
            goto L_0x035d
        L_0x0337:
            boolean r10 = r0 instanceof o8.b
            if (r10 == 0) goto L_0x0350
            o8.b r0 = (o8.b) r0     // Catch:{ RemoteException -> 0x0341 }
            r2.N0(r0, r4)     // Catch:{ RemoteException -> 0x0341 }
            goto L_0x035d
        L_0x0341:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r10 = r9.f8864a
            com.google.android.gms.measurement.internal.h r10 = r10.d()
            o8.a3 r10 = r10.f8797f
            java.lang.String r11 = "Failed to send conditional user property to the service"
            r10.b(r11, r0)
            goto L_0x035d
        L_0x0350:
            com.google.android.gms.measurement.internal.l r0 = r9.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.a(r10)
        L_0x035d:
            int r8 = r8 + 1
            goto L_0x02f7
        L_0x0360:
            r9 = r28
            int r7 = r25 + 1
            r0 = r1
            r1 = r9
            r6 = 0
            goto L_0x001c
        L_0x0369:
            r9 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.l(com.google.android.gms.measurement.internal.d, w7.a, o8.b6):void");
    }

    public final void m(b bVar) {
        boolean z10;
        h();
        i();
        this.f8864a.getClass();
        g r10 = this.f8864a.r();
        byte[] a02 = r10.f8864a.A().a0(bVar);
        if (a02.length > 131072) {
            r10.f8864a.d().f8798g.a("Conditional user property too long for local database. Sending directly to service");
            z10 = false;
        } else {
            z10 = r10.o(2, a02);
        }
        t(new h(this, q(true), z10, new b(bVar), bVar));
    }

    public final boolean n() {
        h();
        i();
        return this.f8867d != null;
    }

    public final boolean o() {
        h();
        i();
        if (!p() || this.f8864a.A().l0() >= v2.f23526n0.a(null).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e1, code lost:
        if (r0 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r7 = this;
            r7.h()
            r7.i()
            java.lang.Boolean r0 = r7.f8868e
            if (r0 != 0) goto L_0x013c
            r7.h()
            r7.i()
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            r0.h()
            android.content.SharedPreferences r1 = r0.o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0136
        L_0x003f:
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            r4.getClass()
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            com.google.android.gms.measurement.internal.e r4 = r4.q()
            r4.i()
            int r4 = r4.f8787j
            if (r4 != r1) goto L_0x0053
            goto L_0x0101
        L_0x0053:
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8805n
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            com.google.android.gms.measurement.internal.r r4 = r4.A()
            r4.getClass()
            s7.e r5 = s7.e.f25013b
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a
            android.content.Context r4 = r4.f8837a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.d(r4, r6)
            if (r4 == 0) goto L_0x00f4
            if (r4 == r1) goto L_0x00e6
            r5 = 2
            if (r4 == r5) goto L_0x00c5
            r0 = 3
            if (r4 == r0) goto L_0x00b6
            r0 = 9
            if (r4 == r0) goto L_0x00a8
            r0 = 18
            if (r4 == r0) goto L_0x009a
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8800i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.b(r4, r1)
            goto L_0x00c3
        L_0x009a:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8800i
            java.lang.String r3 = "Service updating"
            r0.a(r3)
            goto L_0x0101
        L_0x00a8:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8800i
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x00c3
        L_0x00b6:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8800i
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
        L_0x00c3:
            r1 = 0
            goto L_0x00e3
        L_0x00c5:
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8804m
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            com.google.android.gms.measurement.internal.r r4 = r4.A()
            int r4 = r4.l0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e1
            goto L_0x0102
        L_0x00e1:
            if (r0 != 0) goto L_0x00c3
        L_0x00e3:
            r3 = r1
            r1 = 0
            goto L_0x0102
        L_0x00e6:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x0102
        L_0x00f4:
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r3 = "Service available"
            r0.a(r3)
        L_0x0101:
            r3 = 1
        L_0x0102:
            if (r3 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            o8.f r0 = r0.f8843g
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x0135
        L_0x011c:
            if (r1 == 0) goto L_0x0135
            com.google.android.gms.measurement.internal.l r0 = r7.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            r0.h()
            android.content.SharedPreferences r0 = r0.o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0135:
            r1 = r3
        L_0x0136:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f8868e = r0
        L_0x013c:
            java.lang.Boolean r0 = r7.f8868e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.p():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o8.b6 q(boolean r38) {
        /*
            r37 = this;
            r1 = r37
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            r0.getClass()
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            com.google.android.gms.measurement.internal.e r2 = r0.q()
            r3 = 0
            r5 = 1
            r6 = 0
            if (r38 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            com.google.android.gms.measurement.internal.l r7 = r0.f8864a
            com.google.android.gms.measurement.internal.j r7 = r7.t()
            o8.i3 r7 = r7.f8809d
            if (r7 != 0) goto L_0x0025
            goto L_0x00c7
        L_0x0025:
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.i3 r0 = r0.f8809d
            com.google.android.gms.measurement.internal.j r7 = r0.f23261e
            r7.h()
            com.google.android.gms.measurement.internal.j r7 = r0.f23261e
            r7.h()
            com.google.android.gms.measurement.internal.j r7 = r0.f23261e
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = r0.f23257a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x004c
            r0.a()
            r7 = r3
            goto L_0x005b
        L_0x004c:
            com.google.android.gms.measurement.internal.j r9 = r0.f23261e
            com.google.android.gms.measurement.internal.l r9 = r9.f8864a
            z7.b r9 = r9.f8850n
            long r9 = r9.b()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x005b:
            long r9 = r0.f23260d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            long r9 = r9 + r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x006c
            r0.a()
        L_0x006a:
            r0 = r6
            goto L_0x009a
        L_0x006c:
            com.google.android.gms.measurement.internal.j r7 = r0.f23261e
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = r0.f23259c
            java.lang.String r7 = r7.getString(r8, r6)
            com.google.android.gms.measurement.internal.j r8 = r0.f23261e
            android.content.SharedPreferences r8 = r8.o()
            java.lang.String r9 = r0.f23258b
            long r8 = r8.getLong(r9, r3)
            r0.a()
            if (r7 == 0) goto L_0x0098
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.<init>(r7, r8)
            goto L_0x009a
        L_0x0098:
            android.util.Pair<java.lang.String, java.lang.Long> r0 = com.google.android.gms.measurement.internal.j.f8807w
        L_0x009a:
            if (r0 == 0) goto L_0x00c7
            android.util.Pair<java.lang.String, java.lang.Long> r7 = com.google.android.gms.measurement.internal.j.f8807w
            if (r0 != r7) goto L_0x00a1
            goto L_0x00c7
        L_0x00a1:
            java.lang.Object r7 = r0.second
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            int r8 = r7.length()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + r5
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = ":"
            java.lang.String r0 = androidx.fragment.app.a.a(r10, r7, r8, r0)
            r18 = r0
            goto L_0x00c9
        L_0x00c7:
            r18 = r6
        L_0x00c9:
            r2.h()
            o8.b6 r36 = new o8.b6
            java.lang.String r8 = r2.m()
            java.lang.String r9 = r2.n()
            r2.i()
            java.lang.String r10 = r2.f8781d
            r2.i()
            int r0 = r2.f8782e
            long r11 = (long) r0
            r2.i()
            java.lang.String r0 = r2.f8783f
            com.google.android.gms.common.internal.i.h(r0)
            java.lang.String r13 = r2.f8783f
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            o8.f r0 = r0.f8843g
            r0.q()
            r2.i()
            r2.h()
            long r14 = r2.f8784g
            r7 = 0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0187
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.r r3 = r0.A()
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            android.content.Context r0 = r0.f8837a
            java.lang.String r4 = r0.getPackageName()
            r3.h()
            com.google.android.gms.common.internal.i.h(r0)
            com.google.android.gms.common.internal.i.e(r4)
            android.content.pm.PackageManager r14 = r0.getPackageManager()
            java.lang.String r15 = "MD5"
            java.security.MessageDigest r15 = com.google.android.gms.measurement.internal.r.r(r15)
            r16 = -1
            if (r15 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.l r0 = r3.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r3 = "Could not get MD5 instance"
            r0.a(r3)
            goto L_0x0180
        L_0x0132:
            if (r14 == 0) goto L_0x017e
            boolean r4 = r3.T(r0, r4)     // Catch:{ NameNotFoundException -> 0x0170 }
            if (r4 != 0) goto L_0x017e
            b8.b r0 = b8.c.a(r0)     // Catch:{ NameNotFoundException -> 0x0170 }
            com.google.android.gms.measurement.internal.l r4 = r3.f8864a     // Catch:{ NameNotFoundException -> 0x0170 }
            android.content.Context r4 = r4.f8837a     // Catch:{ NameNotFoundException -> 0x0170 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0170 }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.b(r4, r14)     // Catch:{ NameNotFoundException -> 0x0170 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0170 }
            if (r0 == 0) goto L_0x0162
            int r4 = r0.length     // Catch:{ NameNotFoundException -> 0x0170 }
            if (r4 <= 0) goto L_0x0162
            r0 = r0[r7]     // Catch:{ NameNotFoundException -> 0x0170 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x0170 }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x0170 }
            long r16 = com.google.android.gms.measurement.internal.r.m0(r0)     // Catch:{ NameNotFoundException -> 0x0170 }
            goto L_0x0180
        L_0x0162:
            com.google.android.gms.measurement.internal.l r0 = r3.f8864a     // Catch:{ NameNotFoundException -> 0x0170 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ NameNotFoundException -> 0x0170 }
            o8.a3 r0 = r0.f8800i     // Catch:{ NameNotFoundException -> 0x0170 }
            java.lang.String r4 = "Could not get signatures"
            r0.a(r4)     // Catch:{ NameNotFoundException -> 0x0170 }
            goto L_0x0180
        L_0x0170:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l r3 = r3.f8864a
            com.google.android.gms.measurement.internal.h r3 = r3.d()
            o8.a3 r3 = r3.f8797f
            java.lang.String r4 = "Package name not found"
            r3.b(r4, r0)
        L_0x017e:
            r16 = 0
        L_0x0180:
            r3 = r16
            r2.f8784g = r3
            r16 = r3
            goto L_0x0189
        L_0x0187:
            r16 = r14
        L_0x0189:
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            boolean r19 = r0.g()
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            boolean r0 = r0.f8820o
            r20 = r0 ^ 1
            r2.h()
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x01a6
            goto L_0x0223
        L_0x01a6:
            k8.dc r0 = k8.dc.f20132b
            k8.ec r0 = r0.zza()
            r0.zza()
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            o8.f r0 = r0.f8843g
            o8.u2<java.lang.Boolean> r3 = o8.v2.f23510f0
            boolean r0 = r0.v(r6, r3)
            if (r0 == 0) goto L_0x01c9
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r3 = "Disabled IID for tests."
            r0.a(r3)
            goto L_0x0223
        L_0x01c9:
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a     // Catch:{ ClassNotFoundException -> 0x0223 }
            android.content.Context r0 = r0.f8837a     // Catch:{ ClassNotFoundException -> 0x0223 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0223 }
            java.lang.String r3 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x0223 }
            if (r0 != 0) goto L_0x01da
            goto L_0x0223
        L_0x01da:
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0216 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r7] = r4     // Catch:{ Exception -> 0x0216 }
            java.lang.String r4 = "getInstance"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch:{ Exception -> 0x0216 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0216 }
            com.google.android.gms.measurement.internal.l r5 = r2.f8864a     // Catch:{ Exception -> 0x0216 }
            android.content.Context r5 = r5.f8837a     // Catch:{ Exception -> 0x0216 }
            r4[r7] = r5     // Catch:{ Exception -> 0x0216 }
            java.lang.Object r3 = r3.invoke(r6, r4)     // Catch:{ Exception -> 0x0216 }
            if (r3 != 0) goto L_0x01f5
            goto L_0x0223
        L_0x01f5:
            java.lang.String r4 = "getFirebaseInstanceId"
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0208 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0208 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0208 }
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0208 }
            r21 = r0
            goto L_0x0225
        L_0x0208:
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8802k
            java.lang.String r3 = "Failed to retrieve Firebase Instance Id"
            r0.a(r3)
            goto L_0x0223
        L_0x0216:
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8801j
            java.lang.String r3 = "Failed to obtain Firebase Analytics instance"
            r0.a(r3)
        L_0x0223:
            r21 = r6
        L_0x0225:
            com.google.android.gms.measurement.internal.l r0 = r2.f8864a
            com.google.android.gms.measurement.internal.j r3 = r0.t()
            o8.h3 r3 = r3.f8810e
            long r3 = r3.a()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x023a
            long r3 = r0.G
            goto L_0x0240
        L_0x023a:
            long r5 = r0.G
            long r3 = java.lang.Math.min(r5, r3)
        L_0x0240:
            r24 = r3
            r2.i()
            int r0 = r2.f8787j
            com.google.android.gms.measurement.internal.l r3 = r2.f8864a
            o8.f r3 = r3.f8843g
            boolean r27 = r3.u()
            com.google.android.gms.measurement.internal.l r3 = r2.f8864a
            com.google.android.gms.measurement.internal.j r3 = r3.t()
            r3.h()
            android.content.SharedPreferences r3 = r3.o()
            java.lang.String r4 = "deferred_analytics_collection"
            r5 = 0
            boolean r28 = r3.getBoolean(r4, r5)
            r2.i()
            java.lang.String r3 = r2.f8789l
            com.google.android.gms.measurement.internal.l r4 = r2.f8864a
            o8.f r4 = r4.f8843g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.t(r5)
            if (r4 != 0) goto L_0x0276
            r4 = 0
            goto L_0x0280
        L_0x0276:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0280:
            r30 = r4
            long r4 = r2.f8785h
            java.util.List<java.lang.String> r6 = r2.f8786i
            k8.ra.b()
            com.google.android.gms.measurement.internal.l r7 = r2.f8864a
            o8.f r7 = r7.f8843g
            o8.u2<java.lang.Boolean> r14 = o8.v2.f23506d0
            r15 = 0
            boolean r7 = r7.v(r15, r14)
            if (r7 == 0) goto L_0x02a3
            r2.i()
            java.lang.String r7 = r2.f8790m
            com.google.android.gms.common.internal.i.h(r7)
            java.lang.String r7 = r2.f8790m
            r34 = r7
            goto L_0x02a5
        L_0x02a3:
            r34 = r15
        L_0x02a5:
            r14 = 43042(0xa822, double:2.12656E-319)
            r22 = 0
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.j r2 = r2.t()
            o8.g r2 = r2.p()
            java.lang.String r35 = r2.e()
            r7 = r36
            r26 = r0
            r29 = r3
            r31 = r4
            r33 = r6
            r7.<init>((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (long) r11, (java.lang.String) r13, (long) r14, (long) r16, (java.lang.String) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (long) r22, (long) r24, (int) r26, (boolean) r27, (boolean) r28, (java.lang.String) r29, (java.lang.Boolean) r30, (long) r31, (java.util.List<java.lang.String>) r33, (java.lang.String) r34, (java.lang.String) r35)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p.q(boolean):o8.b6");
    }

    public final void r() {
        h();
        this.f8864a.d().f8805n.b("Processing queued up service tasks", Integer.valueOf(this.f8871h.size()));
        for (Runnable run : this.f8871h) {
            try {
                run.run();
            } catch (RuntimeException e10) {
                this.f8864a.d().f8797f.b("Task exception while flushing queue", e10);
            }
        }
        this.f8871h.clear();
        this.f8872i.a();
    }

    public final void s() {
        h();
        d dVar = this.f8870g;
        dVar.f4358b = ((z7.b) dVar.f4357a).a();
        k kVar = this.f8869f;
        this.f8864a.getClass();
        kVar.c(v2.J.a(null).longValue());
    }

    public final void t(Runnable runnable) throws IllegalStateException {
        h();
        if (n()) {
            runnable.run();
            return;
        }
        int size = this.f8871h.size();
        this.f8864a.getClass();
        if (((long) size) >= 1000) {
            this.f8864a.d().f8797f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f8871h.add(runnable);
        this.f8872i.c(60000);
        w();
    }

    public final boolean u() {
        this.f8864a.getClass();
        return true;
    }

    public final void w() {
        h();
        i();
        if (!n()) {
            if (p()) {
                g5 g5Var = this.f8866c;
                g5Var.f23223c.h();
                Context context = g5Var.f23223c.f8864a.f8837a;
                synchronized (g5Var) {
                    if (g5Var.f23221a) {
                        g5Var.f23223c.f8864a.d().f8805n.a("Connection attempt already in progress");
                    } else if (g5Var.f23222b == null || (!g5Var.f23222b.h() && !g5Var.f23222b.b())) {
                        g5Var.f23222b = new y2(context, Looper.getMainLooper(), g5Var, g5Var);
                        g5Var.f23223c.f8864a.d().f8805n.a("Connecting to remote service");
                        g5Var.f23221a = true;
                        i.h(g5Var.f23222b);
                        g5Var.f23222b.n();
                    } else {
                        g5Var.f23223c.f8864a.d().f8805n.a("Already awaiting connection attempt");
                    }
                }
            } else if (!this.f8864a.f8843g.z()) {
                this.f8864a.getClass();
                List<ResolveInfo> queryIntentServices = this.f8864a.f8837a.getPackageManager().queryIntentServices(new Intent().setClassName(this.f8864a.f8837a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.f8864a.d().f8797f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                l lVar = this.f8864a;
                Context context2 = lVar.f8837a;
                lVar.getClass();
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                g5 g5Var2 = this.f8866c;
                g5Var2.f23223c.h();
                Context context3 = g5Var2.f23223c.f8864a.f8837a;
                a b10 = a.b();
                synchronized (g5Var2) {
                    if (g5Var2.f23221a) {
                        g5Var2.f23223c.f8864a.d().f8805n.a("Connection attempt already in progress");
                        return;
                    }
                    g5Var2.f23223c.f8864a.d().f8805n.a("Using local app measurement service");
                    g5Var2.f23221a = true;
                    b10.a(context3, intent, g5Var2.f23223c.f8866c, 129);
                }
            }
        }
    }

    public final void x() {
        h();
        i();
        g5 g5Var = this.f8866c;
        if (g5Var.f23222b != null && (g5Var.f23222b.b() || g5Var.f23222b.h())) {
            g5Var.f23222b.p();
        }
        g5Var.f23222b = null;
        try {
            a.b().c(this.f8864a.f8837a, this.f8866c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8867d = null;
    }

    public final void y(AtomicReference<String> atomicReference) {
        h();
        i();
        t(new f0(this, (AtomicReference) atomicReference, q(false)));
    }
}
