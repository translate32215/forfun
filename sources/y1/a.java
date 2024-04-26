package y1;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.appcompat.widget.m;
import java.io.IOException;
import x1.d;

/* compiled from: FrameworkSQLiteDatabase */
public class a implements x1.a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f27980b = new String[0];

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f27981a;

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    public class C0282a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f27982a;

        public C0282a(a aVar, d dVar) {
            this.f27982a = dVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f27982a.d(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f27981a = sQLiteDatabase;
    }

    public String a() {
        return this.f27981a.getPath();
    }

    public void close() throws IOException {
        this.f27981a.close();
    }

    public Cursor d(String str) {
        return i(new m(str));
    }

    public Cursor i(d dVar) {
        return this.f27981a.rawQueryWithFactory(new C0282a(this, dVar), dVar.a(), f27980b, (String) null);
    }
}
