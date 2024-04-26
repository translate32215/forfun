package t4;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import t4.x;

public final /* synthetic */ class w implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ w f25735a = new w();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        List<x.a> list = x.f25736c;
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }
}
