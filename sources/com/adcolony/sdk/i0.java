package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import p.f;

public class i0 {

    /* renamed from: f  reason: collision with root package name */
    public static i0 f4553f;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f4554a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    public SQLiteDatabase f4555b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4556c = false;

    /* renamed from: d  reason: collision with root package name */
    public b f4557d;

    /* renamed from: e  reason: collision with root package name */
    public Set<String> f4558e = new HashSet();

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4559a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ContentValues f4560b;

        public a(String str, ContentValues contentValues) {
            this.f4559a = str;
            this.f4560b = contentValues;
        }

        public void run() {
            i0 i0Var = i0.this;
            String str = this.f4559a;
            ContentValues contentValues = this.f4560b;
            synchronized (i0Var) {
                v.a(str, contentValues, i0Var.f4555b);
            }
        }
    }

    public interface b {
    }

    public static i0 d() {
        if (f4553f == null) {
            synchronized (i0.class) {
                if (f4553f == null) {
                    f4553f = new i0();
                }
            }
        }
        return f4553f;
    }

    public void a(n.a aVar, ContentValues contentValues) {
        String str;
        long j10;
        if (!this.f4558e.contains(aVar.f4613b)) {
            this.f4558e.add(aVar.f4613b);
            int i10 = aVar.f4614c;
            n.d dVar = aVar.f4619h;
            long j11 = -1;
            if (dVar != null) {
                j10 = contentValues.getAsLong(dVar.f4627b).longValue() - dVar.f4626a;
                str = dVar.f4627b;
            } else {
                str = null;
                j10 = -1;
            }
            String str2 = aVar.f4613b;
            SQLiteDatabase sQLiteDatabase = this.f4555b;
            try {
                sQLiteDatabase.beginTransaction();
                if (str == null) {
                    str = "rowid";
                } else {
                    j11 = j10;
                }
                if (i10 >= 0) {
                    Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i10, (String[]) null);
                    if (rawQuery.moveToFirst()) {
                        j11 = Math.max(j11, rawQuery.getLong(0));
                    }
                    rawQuery.close();
                }
                if (j11 >= 0) {
                    sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j11);
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e10) {
                f.d().l().e(0, 1, "Exception on deleting excessive rows:" + e10.toString(), true);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
            sQLiteDatabase.endTransaction();
        }
    }

    public void b(String str, ContentValues contentValues) {
        if (this.f4556c) {
            try {
                this.f4554a.execute(new a(str, contentValues));
            } catch (RejectedExecutionException e10) {
                StringBuilder sb2 = new StringBuilder();
                StringBuilder a10 = android.support.v4.media.a.a("ADCEventsRepository.saveEvent failed with: ");
                a10.append(e10.toString());
                sb2.append(a10.toString());
                f.a(0, 0, sb2.toString(), true);
            }
        }
    }

    public final boolean c(n nVar) {
        boolean z10;
        SQLiteDatabase sQLiteDatabase = this.f4555b;
        s sVar = new s(sQLiteDatabase, nVar);
        int version = sQLiteDatabase.getVersion();
        sQLiteDatabase.beginTransaction();
        boolean z11 = true;
        try {
            List<n.a> list = nVar.f4611b;
            ArrayList<String> a10 = sVar.a();
            for (n.a next : list) {
                if (a10.contains(next.f4613b)) {
                    sVar.g(next);
                } else {
                    sVar.e(next);
                    sVar.b(next);
                }
                a10.remove(next.f4613b);
            }
            Iterator<String> it = a10.iterator();
            while (it.hasNext()) {
                sVar.d(it.next());
            }
            sVar.f4768a.setVersion(sVar.f4769b.f4610a);
            sVar.f4768a.setTransactionSuccessful();
            try {
                f.d().l().e(0, 2, "Success upgrading database from " + version + " to " + sVar.f4769b.f4610a, true);
            } catch (SQLException e10) {
                e = e10;
                z10 = true;
            }
        } catch (SQLException e11) {
            e = e11;
            z10 = false;
            try {
                f.d().l().e(0, 1, "Upgrading database from " + version + " to " + sVar.f4769b.f4610a + "caused: " + e.toString(), true);
                z11 = z10;
                sVar.f4768a.endTransaction();
                return z11;
            } catch (Throwable th) {
                sVar.f4768a.endTransaction();
                throw th;
            }
        }
        sVar.f4768a.endTransaction();
        return z11;
    }
}
