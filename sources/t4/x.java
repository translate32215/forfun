package t4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager */
public final class x extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final List<a> f25736c = Arrays.asList(new a[]{t.f25732a, u.f25733a, v.f25734a, w.f25735a});

    /* renamed from: a  reason: collision with root package name */
    public final int f25737a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25738b = false;

    /* compiled from: SchemaManager */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public x(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f25737a = i10;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f25736c;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f25736c.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f25738b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i10 = this.f25737a;
        if (!this.f25738b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i10);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f25738b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i11);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f25738b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f25738b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i10, i11);
    }
}
