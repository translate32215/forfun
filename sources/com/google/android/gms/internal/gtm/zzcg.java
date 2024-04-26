package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.v;
import z7.g;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcg extends zzbu implements Closeable {
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    public static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    public final zzcf zzc;
    public final zzfq zzd = new zzfq(zzC());
    public final zzfq zze = new zzfq(zzC());

    public zzcg(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzcf(this, zzbx.zza(), zzad());
    }

    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e10) {
            zzJ("Sql error closing database", e10);
        } catch (IllegalStateException e11) {
            zzJ("Error closing database", e11);
        }
    }

    public final void zzY(List list) {
        if (list != null) {
            v.b();
            zzV();
            if (!list.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("hit_id");
                sb2.append(" in (");
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Long l10 = (Long) list.get(i10);
                    if (l10 == null || l10.longValue() == 0) {
                        throw new SQLiteException("Invalid hit id");
                    }
                    if (i10 > 0) {
                        sb2.append(",");
                    }
                    sb2.append(l10);
                }
                sb2.append(")");
                String sb3 = sb2.toString();
                try {
                    SQLiteDatabase zzf = zzf();
                    zzO("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                    int delete = zzf.delete("hits2", sb3, (String[]) null);
                    if (delete != list.size()) {
                        zzT("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb3);
                    }
                } catch (SQLiteException e10) {
                    zzJ("Error deleting hits", e10);
                    throw e10;
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void zzZ() {
        zzV();
        zzf().endTransaction();
    }

    public final int zza() {
        v.b();
        zzV();
        if (!this.zzd.zzc(86400000)) {
            return 0;
        }
        this.zzd.zzb();
        zzN("Deleting stale hits (if any)");
        int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().b() - 2592000000L)});
        zzO("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final void zzaa() {
        zzV();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzab() {
        return zzb() == 0;
    }

    public final long zzac(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzf().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e10) {
            zzK("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String zzad() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    public final long zzb() {
        v.b();
        zzV();
        Cursor cursor = null;
        try {
            cursor = zzf().rawQuery("SELECT COUNT(*) FROM hits2", (String[]) null);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            zzK("Database error", "SELECT COUNT(*) FROM hits2", e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        v.b();
        zzV();
        return zzac(zzb, (String[]) null, 0);
    }

    public final void zzd() {
    }

    public final long zze(long j10, String str, String str2) {
        i.e(str);
        i.e(str2);
        zzV();
        v.b();
        return zzac("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0);
    }

    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzR("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1 A[LOOP:0: B:10:0x005b->B:22:0x00a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[EDGE_INSN: B:46:0x00ae->B:26:0x00ae ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzj(long r19) {
        /*
            r18 = this;
            r11 = r18
            java.lang.String r0 = "hit_id"
            r12 = 0
            r13 = 1
            r1 = 0
            int r3 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            com.google.android.gms.common.internal.i.a(r1)
            n7.v.b()
            r18.zzV()
            android.database.sqlite.SQLiteDatabase r2 = r18.zzf()
            r1 = 5
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            r4[r12] = r0     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.String r1 = "hit_time"
            r4[r13] = r1     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.String r1 = "hit_string"
            r15 = 2
            r4[r15] = r1     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.String r1 = "hit_url"
            r10 = 3
            r4[r10] = r1     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.String r1 = "hit_app_id"
            r9 = 4
            r4[r9] = r1     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            r1[r12] = r0     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.String r3 = "hits2"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r0 = "%s ASC"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.lang.String r1 = java.lang.Long.toString(r19)     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            r14 = 4
            r9 = r0
            r0 = 3
            r10 = r1
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00c1, all -> 0x00be }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            boolean r1 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            if (r1 == 0) goto L_0x00ab
        L_0x005b:
            long r7 = r10.getLong(r12)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            long r4 = r10.getLong(r13)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            java.lang.String r1 = r10.getString(r15)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            java.lang.String r2 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            int r16 = r10.getInt(r14)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            java.util.Map r3 = r11.zzk(r1)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            if (r1 == 0) goto L_0x007b
        L_0x0079:
            r6 = 1
            goto L_0x0085
        L_0x007b:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            if (r1 != 0) goto L_0x0084
            goto L_0x0079
        L_0x0084:
            r6 = 0
        L_0x0085:
            com.google.android.gms.internal.gtm.zzez r2 = new com.google.android.gms.internal.gtm.zzez     // Catch:{ SQLiteException -> 0x00b8, all -> 0x00b2 }
            r17 = 0
            r1 = r2
            r0 = r2
            r2 = r18
            r12 = r9
            r9 = r16
            r16 = r10
            r10 = r17
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)     // Catch:{ SQLiteException -> 0x00a9, all -> 0x00a7 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x00a9, all -> 0x00a7 }
            boolean r0 = r16.moveToNext()     // Catch:{ SQLiteException -> 0x00a9, all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00ae
        L_0x00a1:
            r9 = r12
            r10 = r16
            r0 = 3
            r12 = 0
            goto L_0x005b
        L_0x00a7:
            r0 = move-exception
            goto L_0x00b5
        L_0x00a9:
            r0 = move-exception
            goto L_0x00bb
        L_0x00ab:
            r12 = r9
            r16 = r10
        L_0x00ae:
            r16.close()
            return r12
        L_0x00b2:
            r0 = move-exception
            r16 = r10
        L_0x00b5:
            r14 = r16
            goto L_0x00ca
        L_0x00b8:
            r0 = move-exception
            r16 = r10
        L_0x00bb:
            r14 = r16
            goto L_0x00c3
        L_0x00be:
            r0 = move-exception
            r14 = 0
            goto L_0x00ca
        L_0x00c1:
            r0 = move-exception
            r14 = 0
        L_0x00c3:
            java.lang.String r1 = "Error loading hits from the database"
            r11.zzJ(r1, r0)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
        L_0x00ca:
            if (r14 == 0) goto L_0x00cf
            r14.close()
        L_0x00cf:
            goto L_0x00d1
        L_0x00d0:
            throw r0
        L_0x00d1:
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcg.zzj(long):java.util.List");
    }

    public final Map zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            return g.a(new URI(str), "UTF-8");
        } catch (URISyntaxException e10) {
            zzJ("Error parsing hit parameters", e10);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzV();
        zzf().beginTransaction();
    }

    public final void zzn(long j10) {
        v.b();
        zzV();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j10);
        arrayList.add(valueOf);
        zzO("Deleting hit, id", valueOf);
        zzY(arrayList);
    }
}
