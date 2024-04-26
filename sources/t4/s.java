package t4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l0.e;
import o4.f;
import o4.i;
import u4.b;

/* compiled from: SQLiteEventStore */
public class s implements c, u4.b {

    /* renamed from: e  reason: collision with root package name */
    public static final l4.b f25725e = new l4.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final x f25726a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.a f25727b;

    /* renamed from: c  reason: collision with root package name */
    public final v4.a f25728c;

    /* renamed from: d  reason: collision with root package name */
    public final d f25729d;

    /* compiled from: SQLiteEventStore */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f25730a;

        /* renamed from: b  reason: collision with root package name */
        public final String f25731b;

        public c(String str, String str2, a aVar) {
            this.f25730a = str;
            this.f25731b = str2;
        }
    }

    /* compiled from: SQLiteEventStore */
    public interface d<T> {
        T d();
    }

    public s(v4.a aVar, v4.a aVar2, d dVar, x xVar) {
        this.f25726a = xVar;
        this.f25727b = aVar;
        this.f25728c = aVar2;
        this.f25729d = dVar;
    }

    public static String s(Iterable<h> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T t(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public Iterable<i> E() {
        SQLiteDatabase d10 = d();
        d10.beginTransaction();
        try {
            List list = (List) t(d10.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), p.f25716a);
            d10.setTransactionSuccessful();
            return list;
        } finally {
            d10.endTransaction();
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean P(i iVar) {
        Boolean bool;
        SQLiteDatabase d10 = d();
        d10.beginTransaction();
        try {
            Long i10 = i(d10, iVar);
            if (i10 == null) {
                bool = Boolean.FALSE;
            } else {
                bool = (Boolean) t(d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i10.toString()}), q.f25720a);
            }
            d10.setTransactionSuccessful();
            d10.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            d10.endTransaction();
            throw th;
        }
    }

    public void Q(i iVar, long j10) {
        o(new m(j10, iVar));
    }

    public Iterable<h> S(i iVar) {
        return (Iterable) o(new i(this, iVar));
    }

    /* JADX INFO: finally extract failed */
    public long U(i iVar) {
        Long l10;
        Cursor rawQuery = d().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{iVar.b(), String.valueOf(w4.a.a(iVar.d()))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            return l10.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void W(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder a10 = android.support.v4.media.a.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            a10.append(s(iterable));
            o(new r1.c(a10.toString()));
        }
    }

    public <T> T a(b.a<T> aVar) {
        SQLiteDatabase d10 = d();
        long a10 = this.f25728c.a();
        while (true) {
            try {
                d10.beginTransaction();
                try {
                    T a11 = aVar.a();
                    d10.setTransactionSuccessful();
                    return a11;
                } finally {
                    d10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f25728c.a() < ((long) this.f25729d.a()) + a10) {
                    SystemClock.sleep(50);
                } else {
                    throw new u4.a("Timed out while trying to acquire the lock.", e10);
                }
            }
        }
    }

    public void close() {
        this.f25726a.close();
    }

    public SQLiteDatabase d() {
        x xVar = this.f25726a;
        xVar.getClass();
        r1.c cVar = new r1.c(xVar);
        long a10 = this.f25728c.a();
        while (true) {
            try {
                return (SQLiteDatabase) cVar.d();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f25728c.a() < ((long) this.f25729d.a()) + a10) {
                    SystemClock.sleep(50);
                } else {
                    throw new u4.a("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public int h() {
        long a10 = this.f25727b.a() - this.f25729d.b();
        SQLiteDatabase d10 = d();
        d10.beginTransaction();
        try {
            Integer valueOf = Integer.valueOf(d10.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a10)}));
            d10.setTransactionSuccessful();
            d10.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            d10.endTransaction();
            throw th;
        }
    }

    public final Long i(SQLiteDatabase sQLiteDatabase, i iVar) {
        Long l10;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{iVar.b(), String.valueOf(w4.a.a(iVar.d()))}));
        if (iVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(iVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l10 = null;
            } else {
                l10 = Long.valueOf(query.getLong(0));
            }
            return l10;
        } finally {
            query.close();
        }
    }

    public void j(Iterable<h> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder a10 = android.support.v4.media.a.a("DELETE FROM events WHERE _id in ");
            a10.append(s(iterable));
            d().compileStatement(a10.toString()).execute();
        }
    }

    public <T> T o(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase d10 = d();
        d10.beginTransaction();
        try {
            T apply = bVar.apply(d10);
            d10.setTransactionSuccessful();
            return apply;
        } finally {
            d10.endTransaction();
        }
    }

    public h z(i iVar, f fVar) {
        e.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", iVar.d(), fVar.g(), iVar.b());
        long longValue = ((Long) o(new r4.a(this, iVar, fVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, iVar, fVar);
    }
}
