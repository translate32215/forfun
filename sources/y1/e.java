package y1;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement */
public class e extends d {

    /* renamed from: b  reason: collision with root package name */
    public final SQLiteStatement f27990b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f27990b = sQLiteStatement;
    }

    public int a() {
        return this.f27990b.executeUpdateDelete();
    }
}
