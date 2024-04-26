package t1;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.appcompat.widget.m;
import androidx.leanback.widget.s;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k0.g;
import y1.e;

/* compiled from: InvalidationTracker */
public class d {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f25352k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final s.a<String, Integer> f25353a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f25354b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Set<String>> f25355c;

    /* renamed from: d  reason: collision with root package name */
    public final e f25356d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f25357e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f25358f = false;

    /* renamed from: g  reason: collision with root package name */
    public volatile e f25359g;

    /* renamed from: h  reason: collision with root package name */
    public b f25360h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i  reason: collision with root package name */
    public final m.b<c, C0245d> f25361i = new m.b<>();

    /* renamed from: j  reason: collision with root package name */
    public Runnable f25362j = new a();

    /* compiled from: InvalidationTracker */
    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final Set<Integer> a() {
            s.c cVar = new s.c(0);
            e eVar = d.this.f25356d;
            m mVar = new m("SELECT * FROM room_table_modification_log WHERE invalidated = 1;");
            eVar.a();
            eVar.b();
            Cursor i10 = ((y1.a) ((y1.b) eVar.f25375c).a()).i(mVar);
            while (i10.moveToNext()) {
                try {
                    cVar.add(Integer.valueOf(i10.getInt(0)));
                } catch (Throwable th) {
                    i10.close();
                    throw th;
                }
            }
            i10.close();
            if (!cVar.isEmpty()) {
                d.this.f25359g.a();
            }
            return cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:79:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                t1.d r0 = t1.d.this
                t1.e r0 = r0.f25356d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f25380h
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 1
                r2 = 0
                r3 = 0
                r0.lock()     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                t1.d r4 = t1.d.this     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                boolean r4 = r4.a()     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                if (r4 != 0) goto L_0x001c
                r0.unlock()
                return
            L_0x001c:
                t1.d r4 = t1.d.this     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f25357e     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                if (r4 != 0) goto L_0x002a
                r0.unlock()
                return
            L_0x002a:
                t1.d r4 = t1.d.this     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                t1.e r4 = r4.f25356d     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                boolean r4 = r4.h()     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                if (r4 == 0) goto L_0x0038
                r0.unlock()
                return
            L_0x0038:
                t1.d r4 = t1.d.this     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                t1.e r4 = r4.f25356d     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                boolean r5 = r4.f25378f     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                if (r5 == 0) goto L_0x0074
                x1.b r4 = r4.f25375c     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                y1.b r4 = (y1.b) r4     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                x1.a r4 = r4.a()     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                r5 = r4
                y1.a r5 = (y1.a) r5     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                android.database.sqlite.SQLiteDatabase r5 = r5.f27981a     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                r5.beginTransaction()     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                java.util.Set r5 = r11.a()     // Catch:{ all -> 0x0066 }
                r6 = r4
                y1.a r6 = (y1.a) r6     // Catch:{ all -> 0x0064 }
                android.database.sqlite.SQLiteDatabase r6 = r6.f27981a     // Catch:{ all -> 0x0064 }
                r6.setTransactionSuccessful()     // Catch:{ all -> 0x0064 }
                y1.a r4 = (y1.a) r4     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
                android.database.sqlite.SQLiteDatabase r4 = r4.f27981a     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
                goto L_0x0087
            L_0x0064:
                r6 = move-exception
                goto L_0x0068
            L_0x0066:
                r6 = move-exception
                r5 = r3
            L_0x0068:
                y1.a r4 = (y1.a) r4     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
                android.database.sqlite.SQLiteDatabase r4 = r4.f27981a     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
                throw r6     // Catch:{ IllegalStateException -> 0x0072, SQLiteException -> 0x0070 }
            L_0x0070:
                r4 = move-exception
                goto L_0x0080
            L_0x0072:
                r4 = move-exception
                goto L_0x0080
            L_0x0074:
                java.util.Set r5 = r11.a()     // Catch:{ IllegalStateException -> 0x007e, SQLiteException -> 0x007c }
                goto L_0x0087
            L_0x0079:
                r1 = move-exception
                goto L_0x00ef
            L_0x007c:
                r4 = move-exception
                goto L_0x007f
            L_0x007e:
                r4 = move-exception
            L_0x007f:
                r5 = r3
            L_0x0080:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x0079 }
            L_0x0087:
                r0.unlock()
                if (r5 == 0) goto L_0x00ee
                s.c r5 = (s.c) r5
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00ee
                t1.d r0 = t1.d.this
                m.b<t1.d$c, t1.d$d> r0 = r0.f25361i
                monitor-enter(r0)
                t1.d r4 = t1.d.this     // Catch:{ all -> 0x00eb }
                m.b<t1.d$c, t1.d$d> r4 = r4.f25361i     // Catch:{ all -> 0x00eb }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00eb }
            L_0x00a1:
                r6 = r4
                m.b$e r6 = (m.b.e) r6     // Catch:{ all -> 0x00eb }
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00eb }
                if (r7 == 0) goto L_0x00e9
                java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x00eb }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00eb }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00eb }
                t1.d$d r6 = (t1.d.C0245d) r6     // Catch:{ all -> 0x00eb }
                int[] r7 = r6.f25369a     // Catch:{ all -> 0x00eb }
                int r7 = r7.length     // Catch:{ all -> 0x00eb }
                r9 = r3
                r8 = 0
            L_0x00bb:
                if (r8 >= r7) goto L_0x00e1
                int[] r10 = r6.f25369a     // Catch:{ all -> 0x00eb }
                r10 = r10[r8]     // Catch:{ all -> 0x00eb }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00eb }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00eb }
                if (r10 == 0) goto L_0x00de
                if (r7 != r1) goto L_0x00d0
                java.util.Set<java.lang.String> r9 = r6.f25372d     // Catch:{ all -> 0x00eb }
                goto L_0x00de
            L_0x00d0:
                if (r9 != 0) goto L_0x00d7
                s.c r9 = new s.c     // Catch:{ all -> 0x00eb }
                r9.<init>(r7)     // Catch:{ all -> 0x00eb }
            L_0x00d7:
                java.lang.String[] r10 = r6.f25370b     // Catch:{ all -> 0x00eb }
                r10 = r10[r8]     // Catch:{ all -> 0x00eb }
                r9.add(r10)     // Catch:{ all -> 0x00eb }
            L_0x00de:
                int r8 = r8 + 1
                goto L_0x00bb
            L_0x00e1:
                if (r9 == 0) goto L_0x00a1
                t1.d$c r6 = r6.f25371c     // Catch:{ all -> 0x00eb }
                r6.a(r9)     // Catch:{ all -> 0x00eb }
                goto L_0x00a1
            L_0x00e9:
                monitor-exit(r0)     // Catch:{ all -> 0x00eb }
                goto L_0x00ee
            L_0x00eb:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00eb }
                throw r1
            L_0x00ee:
                return
            L_0x00ef:
                r0.unlock()
                goto L_0x00f4
            L_0x00f3:
                throw r1
            L_0x00f4:
                goto L_0x00f3
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.d.a.run():void");
        }
    }

    /* compiled from: InvalidationTracker */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f25364a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f25365b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f25366c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f25367d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f25368e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f25364a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f25365b = zArr;
            this.f25366c = new int[i10];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.f25367d) {
                    if (!this.f25368e) {
                        int length = this.f25364a.length;
                        int i10 = 0;
                        while (true) {
                            int i11 = 1;
                            if (i10 < length) {
                                boolean z10 = this.f25364a[i10] > 0;
                                boolean[] zArr = this.f25365b;
                                if (z10 != zArr[i10]) {
                                    int[] iArr = this.f25366c;
                                    if (!z10) {
                                        i11 = 2;
                                    }
                                    iArr[i10] = i11;
                                } else {
                                    this.f25366c[i10] = 0;
                                }
                                zArr[i10] = z10;
                                i10++;
                            } else {
                                this.f25368e = true;
                                this.f25367d = false;
                                int[] iArr2 = this.f25366c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* renamed from: t1.d$d  reason: collision with other inner class name */
    /* compiled from: InvalidationTracker */
    public static class C0245d {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f25369a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f25370b;

        /* renamed from: c  reason: collision with root package name */
        public final c f25371c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f25372d;
    }

    public d(e eVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f25356d = eVar;
        this.f25360h = new b(strArr.length);
        this.f25353a = new s.a<>();
        this.f25355c = map2;
        new c(eVar);
        int length = strArr.length;
        this.f25354b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f25353a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f25354b[i10] = str2.toLowerCase(locale);
            } else {
                this.f25354b[i10] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f25353a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                s.a<String, Integer> aVar = this.f25353a;
                aVar.put(lowerCase3, aVar.get(lowerCase2));
            }
        }
    }

    public boolean a() {
        if (!this.f25356d.i()) {
            return false;
        }
        if (!this.f25358f) {
            ((y1.b) this.f25356d.f25375c).a();
        }
        if (this.f25358f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(x1.a aVar, int i10) {
        y1.a aVar2 = (y1.a) aVar;
        aVar2.f27981a.execSQL(g.a("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f25354b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f25352k) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            s.a(sb2, str, "_", str2, "`");
            s.a(sb2, " AFTER ", str2, " ON `", str);
            s.a(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            s.a(sb2, " = 1", " WHERE ", "table_id", " = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            aVar2.f27981a.execSQL(sb2.toString());
        }
    }

    public final void c(x1.a aVar, int i10) {
        String str = this.f25354b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String a10 : f25352k) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            ((y1.a) aVar).f27981a.execSQL(androidx.fragment.app.c.a(sb2, str, "_", a10, "`"));
        }
    }

    public void d(x1.a aVar) {
        if (!((y1.a) aVar).f27981a.inTransaction()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.f25356d.f25380h.readLock();
                    readLock.lock();
                    try {
                        int[] a10 = this.f25360h.a();
                        if (a10 == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a10.length;
                        ((y1.a) aVar).f27981a.beginTransaction();
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = a10[i10];
                            if (i11 == 1) {
                                b(aVar, i10);
                            } else if (i11 == 2) {
                                c(aVar, i10);
                            }
                        }
                        ((y1.a) aVar).f27981a.setTransactionSuccessful();
                        ((y1.a) aVar).f27981a.endTransaction();
                        b bVar = this.f25360h;
                        synchronized (bVar) {
                            bVar.f25368e = false;
                        }
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    return;
                }
            }
            while (true) {
            }
        }
    }
}
