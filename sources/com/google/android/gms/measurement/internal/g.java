package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import o8.k3;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class g extends k3 {

    /* renamed from: c  reason: collision with root package name */
    public final f f8792c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8793d;

    public g(l lVar) {
        super(lVar);
        this.f8792c = new f(this, lVar.f8837a);
    }

    public final boolean k() {
        return false;
    }

    public final SQLiteDatabase l() throws SQLiteException {
        if (this.f8793d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8792c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f8793d = true;
        return null;
    }

    public final void m() {
        int delete;
        h();
        try {
            SQLiteDatabase l10 = l();
            if (l10 != null && (delete = l10.delete("messages", (String) null, (String[]) null)) > 0) {
                this.f8864a.d().f8805n.b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            this.f8864a.d().f8797f.b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean n() {
        h();
        if (!this.f8793d && this.f8864a.f8837a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 0;
            int i11 = 5;
            while (i10 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase l10 = l();
                    if (l10 == null) {
                        this.f8793d = true;
                        return false;
                    }
                    l10.beginTransaction();
                    l10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    l10.setTransactionSuccessful();
                    l10.endTransaction();
                    l10.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    this.f8864a.d().f8797f.b("Error deleting app launch break from local database", e10);
                    this.f8793d = true;
                    if (sQLiteDatabase == null) {
                        i10++;
                    }
                    sQLiteDatabase.close();
                    i10++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i11);
                    i11 += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i10++;
                    } else {
                        i10++;
                    }
                } catch (SQLiteException e11) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f8864a.d().f8797f.b("Error deleting app launch break from local database", e11);
                    this.f8793d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i10++;
                    } else {
                        i10++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f8864a.d().f8800i.a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7 A[SYNTHETIC, Splitter:B:47:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0119 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.h()
            boolean r0 = r1.f8793d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            r0.getClass()
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0028:
            if (r5 >= r4) goto L_0x012f
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.l()     // Catch:{ SQLiteFullException -> 0x00fc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00c3, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.f8793d = r8     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b9 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b9 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b9 }
            r11 = 0
            if (r10 == 0) goto L_0x0053
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            if (r0 == 0) goto L_0x0053
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r0 = move-exception
            goto L_0x00ad
        L_0x004f:
            r0 = move-exception
            goto L_0x00b0
        L_0x0051:
            r0 = move-exception
            goto L_0x00b4
        L_0x0053:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009a
            com.google.android.gms.measurement.internal.l r15 = r1.f8864a     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            com.google.android.gms.measurement.internal.h r15 = r15.d()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            o8.a3 r15 = r15.f8797f     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            o8.a3 r4 = r4.f8797f     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r4.d(r15, r2, r8, r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
        L_0x009a:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            r9.close()
            r2 = 1
            return r2
        L_0x00ad:
            r7 = r10
            goto L_0x0124
        L_0x00b0:
            r7 = r10
            goto L_0x00ba
        L_0x00b2:
            r7 = r10
            goto L_0x00eb
        L_0x00b4:
            r7 = r10
            goto L_0x00fe
        L_0x00b6:
            r0 = move-exception
            goto L_0x0124
        L_0x00b9:
            r0 = move-exception
        L_0x00ba:
            r2 = r7
            r7 = r9
            goto L_0x00c5
        L_0x00bd:
            r0 = move-exception
            goto L_0x00fe
        L_0x00bf:
            r0 = move-exception
            r9 = r7
            goto L_0x0124
        L_0x00c3:
            r0 = move-exception
            r2 = r7
        L_0x00c5:
            if (r7 == 0) goto L_0x00d0
            boolean r4 = r7.inTransaction()     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x00d0
            r7.endTransaction()     // Catch:{ all -> 0x00e8 }
        L_0x00d0:
            com.google.android.gms.measurement.internal.l r4 = r1.f8864a     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ all -> 0x00e8 }
            o8.a3 r4 = r4.f8797f     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "Error writing entry to local database"
            r4.b(r8, r0)     // Catch:{ all -> 0x00e8 }
            r4 = 1
            r1.f8793d = r4     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00e5
            r2.close()
        L_0x00e5:
            if (r7 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e8:
            r0 = move-exception
            goto L_0x0122
        L_0x00ea:
            r9 = r7
        L_0x00eb:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b6 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f6
            r7.close()
        L_0x00f6:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fc:
            r0 = move-exception
            r9 = r7
        L_0x00fe:
            com.google.android.gms.measurement.internal.l r2 = r1.f8864a     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.h r2 = r2.d()     // Catch:{ all -> 0x011f }
            o8.a3 r2 = r2.f8797f     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f8793d = r2     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x0113
            r7.close()
        L_0x0113:
            if (r9 == 0) goto L_0x0119
            r7 = r9
        L_0x0116:
            r7.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r2 = r7
            r7 = r9
        L_0x0122:
            r9 = r7
            r7 = r2
        L_0x0124:
            if (r7 == 0) goto L_0x0129
            r7.close()
        L_0x0129:
            if (r9 == 0) goto L_0x012e
            r9.close()
        L_0x012e:
            throw r0
        L_0x012f:
            com.google.android.gms.measurement.internal.l r0 = r1.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8805n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.o(int, byte[]):boolean");
    }
}
