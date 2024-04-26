package t4;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import t4.x;

public final /* synthetic */ class u implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ u f25733a = new u();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        List<x.a> list = x.f25736c;
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }
}
