package x1;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.appcompat.widget.z0;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper */
public interface b {

    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f27248a;

        public a(int i10) {
            this.f27248a = i10;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                z0.a("deleting the database file: ", str, "SupportSQLite");
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e10) {
                    Log.w("SupportSQLite", "delete failed: ", e10);
                }
            }
        }

        public abstract void b(a aVar, int i10, int i11);
    }

    /* renamed from: x1.b$b  reason: collision with other inner class name */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C0274b {
    }
}
