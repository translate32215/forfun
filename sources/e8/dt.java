package e8;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.zh;
import f7.h0;
import f7.j0;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dt extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f14328c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14329a;

    /* renamed from: b  reason: collision with root package name */
    public final o50 f14330b;

    public dt(Context context, o50 o50) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) ti0.f16763j.f16769f.a(t.D4)).intValue());
        this.f14329a = context;
        this.f14330b = o50;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, c9 c9Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                c9Var.c(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public final void i(gf<SQLiteDatabase, Void> gfVar) {
        p50 i10 = this.f14330b.i(new h0(this));
        ri riVar = new ri((gf) gfVar);
        i10.a(new j0((Future) i10, (zh) riVar), this.f14330b);
    }

    public final void o(String str) {
        i(new gf0(this, str));
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
