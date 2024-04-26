package y1;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.appcompat.widget.m;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.List;
import t1.d;
import t1.e;
import t1.f;
import x1.b;

/* compiled from: FrameworkSQLiteOpenHelper */
public class b implements x1.b {

    /* renamed from: a  reason: collision with root package name */
    public final a f27983a;

    /* compiled from: FrameworkSQLiteOpenHelper */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        public final a[] f27984a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f27985b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f27986c;

        /* renamed from: y1.b$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        public class C0283a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b.a f27987a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a[] f27988b;

            public C0283a(b.a aVar, a[] aVarArr) {
                this.f27987a = aVar;
                this.f27988b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
                r4 = r1.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
                if (r4.hasNext() != false) goto L_0x0051;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
                r0.a((java.lang.String) r4.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
                r0.a(r4.a());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
                if (r1 != null) goto L_0x0047;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003f */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
            /* JADX WARNING: Removed duplicated region for block: B:6:0x003d A[ExcHandler: all (r2v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
              PHI: (r1v12 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:4:0x0036, B:7:0x003f, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0036] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    x1.b$a r0 = r3.f27987a
                    y1.a[] r1 = r3.f27988b
                    y1.a r4 = y1.b.a.d(r1, r4)
                    r0.getClass()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Corruption reported by sqlite on database: "
                    r1.append(r2)
                    java.lang.String r2 = r4.a()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "SupportSQLite"
                    android.util.Log.e(r2, r1)
                    android.database.sqlite.SQLiteDatabase r1 = r4.f27981a
                    boolean r1 = r1.isOpen()
                    if (r1 != 0) goto L_0x0035
                    java.lang.String r4 = r4.a()
                    r0.a(r4)
                    goto L_0x0089
                L_0x0035:
                    r1 = 0
                    android.database.sqlite.SQLiteDatabase r2 = r4.f27981a     // Catch:{ SQLiteException -> 0x003f, all -> 0x003d }
                    java.util.List r1 = r2.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003f, all -> 0x003d }
                    goto L_0x003f
                L_0x003d:
                    r2 = move-exception
                    goto L_0x0045
                L_0x003f:
                    android.database.sqlite.SQLiteDatabase r2 = r4.f27981a     // Catch:{ IOException -> 0x0067, all -> 0x003d }
                    r2.close()     // Catch:{ IOException -> 0x0067, all -> 0x003d }
                    goto L_0x0068
                L_0x0045:
                    if (r1 == 0) goto L_0x005f
                    java.util.Iterator r4 = r1.iterator()
                L_0x004b:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0066
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x004b
                L_0x005f:
                    java.lang.String r4 = r4.a()
                    r0.a(r4)
                L_0x0066:
                    throw r2
                L_0x0067:
                L_0x0068:
                    if (r1 == 0) goto L_0x0082
                    java.util.Iterator r4 = r1.iterator()
                L_0x006e:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L_0x0089
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x006e
                L_0x0082:
                    java.lang.String r4 = r4.a()
                    r0.a(r4)
                L_0x0089:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: y1.b.a.C0283a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, a[] aVarArr, b.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f27248a, new C0283a(aVar, aVarArr));
            this.f27985b = aVar;
            this.f27984a = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            if ((r1.f27981a == r3) == false) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static y1.a d(y1.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto L_0x000e
                android.database.sqlite.SQLiteDatabase r1 = r1.f27981a
                if (r1 != r3) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = 0
            L_0x000c:
                if (r1 != 0) goto L_0x0015
            L_0x000e:
                y1.a r1 = new y1.a
                r1.<init>(r3)
                r2[r0] = r1
            L_0x0015:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: y1.b.a.d(y1.a[], android.database.sqlite.SQLiteDatabase):y1.a");
        }

        public a a(SQLiteDatabase sQLiteDatabase) {
            return d(this.f27984a, sQLiteDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f27984a[0] = null;
        }

        public synchronized x1.a i() {
            this.f27986c = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f27986c) {
                close();
                return i();
            }
            return a(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            b.a aVar = this.f27985b;
            d(this.f27984a, sQLiteDatabase);
            aVar.getClass();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            b.a aVar = this.f27985b;
            a d10 = d(this.f27984a, sQLiteDatabase);
            f fVar = (f) aVar;
            fVar.c(d10);
            fVar.f25396c.a(d10);
            WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) fVar.f25396c;
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i10 = WorkDatabase_Impl.f3257q;
            List<e.b> list = workDatabase_Impl.f25379g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    WorkDatabase_Impl.this.f25379g.get(i11).getClass();
                }
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f27986c = true;
            ((f) this.f27985b).b(d(this.f27984a, sQLiteDatabase), i10, i11);
        }

        /* JADX INFO: finally extract failed */
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            String str;
            if (!this.f27986c) {
                b.a aVar = this.f27985b;
                a d10 = d(this.f27984a, sQLiteDatabase);
                f fVar = (f) aVar;
                fVar.getClass();
                Cursor i10 = d10.i(new m("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
                try {
                    boolean z10 = i10.moveToFirst() && i10.getInt(0) != 0;
                    i10.close();
                    if (z10) {
                        Cursor i11 = d10.i(new m("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            str = i11.moveToFirst() ? i11.getString(0) : null;
                        } finally {
                            i11.close();
                        }
                    } else {
                        str = null;
                    }
                    if ("c84d23ade98552f1cec71088c1f0794c".equals(str) || "1db8206f0da6aa81bbdd2d99a82d9e14".equals(str)) {
                        WorkDatabase_Impl.a aVar2 = (WorkDatabase_Impl.a) fVar.f25396c;
                        WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
                        int i12 = WorkDatabase_Impl.f3257q;
                        workDatabase_Impl.f25373a = d10;
                        d10.f27981a.execSQL("PRAGMA foreign_keys = ON");
                        d dVar = WorkDatabase_Impl.this.f25376d;
                        synchronized (dVar) {
                            if (dVar.f25358f) {
                                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                            } else {
                                d10.f27981a.execSQL("PRAGMA temp_store = MEMORY;");
                                d10.f27981a.execSQL("PRAGMA recursive_triggers='ON';");
                                d10.f27981a.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                dVar.d(d10);
                                dVar.f25359g = new e(d10.f27981a.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                                dVar.f25358f = true;
                            }
                        }
                        List<e.b> list = WorkDatabase_Impl.this.f25379g;
                        if (list != null) {
                            int size = list.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                WorkDatabase_Impl.this.f25379g.get(i13).a(d10);
                            }
                        }
                        fVar.f25395b = null;
                        return;
                    }
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                } catch (Throwable th) {
                    i10.close();
                    throw th;
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f27986c = true;
            this.f27985b.b(d(this.f27984a, sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, b.a aVar) {
        this.f27983a = new a(context, str, new a[1], aVar);
    }

    public x1.a a() {
        return this.f27983a.i();
    }
}
