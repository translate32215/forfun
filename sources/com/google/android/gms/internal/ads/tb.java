package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.iw;
import e8.f80;
import java.util.ArrayList;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tb {
    public static int a(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor d10 = d(sQLiteDatabase, i10);
        if (d10.getCount() > 0) {
            d10.moveToNext();
            i11 = 0 + d10.getInt(d10.getColumnIndexOrThrow("value"));
        }
        d10.close();
        return i11;
    }

    public static long b(SQLiteDatabase sQLiteDatabase) {
        Cursor d10 = d(sQLiteDatabase, 2);
        long j10 = 0;
        if (d10.getCount() > 0) {
            d10.moveToNext();
            j10 = 0 + d10.getLong(d10.getColumnIndexOrThrow("value"));
        }
        d10.close();
        return j10;
    }

    public static ArrayList<iw.a> c(SQLiteDatabase sQLiteDatabase) {
        ArrayList<iw.a> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(iw.a.L(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (f80 e10) {
                e.I("Unable to deserialize proto from offline signals database:");
                e.I(e10.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static Cursor d(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 == 2) {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }
}
