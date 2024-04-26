package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcf extends SQLiteOpenHelper {
    public final /* synthetic */ zzcg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcg, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzcg;
    }

    public static final Set zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.zza.zze.zzc(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.zza.zze.zzb();
                this.zza.zzI("Opening the database failed, dropping the table and recreating it");
                this.zza.zzo().getDatabasePath(this.zza.zzad()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.zza.zze.zza();
                    return writableDatabase;
                } catch (SQLiteException e10) {
                    this.zza.zzJ("Failed to open freshly created database", e10);
                    throw e10;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            zzfc.zzb("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i10 = 0;
        if (!zza(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(zzcg.zza);
        } else {
            Set zzb = zzb(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            int i11 = 0;
            while (i11 < 4) {
                String str = strArr[i11];
                if (zzb.remove(str)) {
                    i11++;
                } else {
                    throw new SQLiteException("Database hits2 is missing required column: ".concat(String.valueOf(str)));
                }
            }
            boolean z10 = !zzb.remove("hit_app_id");
            if (!zzb.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z10) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (zza(sQLiteDatabase, "properties")) {
            Set zzb2 = zzb(sQLiteDatabase, "properties");
            String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            while (i10 < 6) {
                String str2 = strArr2[i10];
                if (zzb2.remove(str2)) {
                    i10++;
                } else {
                    throw new SQLiteException("Database properties is missing required column: ".concat(String.valueOf(str2)));
                }
            }
            if (!zzb2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException e10) {
            this.zza.zzS("Error querying for table", str, e10);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
