package t4;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import t4.x;

public final /* synthetic */ class v implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ v f25734a = new v();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        List<x.a> list = x.f25736c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
