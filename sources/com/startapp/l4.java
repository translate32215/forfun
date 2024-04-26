package com.startapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* compiled from: Sta */
public class l4 extends m2 {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f10810d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", "details", "detailsJson", "dParam", "service", "tag"};

    /* renamed from: c  reason: collision with root package name */
    public final List<d3<Void>> f10811c = new LinkedList();

    public l4(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final boolean a(i4 i4Var, m4 m4Var, SQLiteDatabase sQLiteDatabase, Map<String, String> map, long j10) {
        i4 i4Var2 = i4Var;
        m4 m4Var2 = m4Var;
        Map<String, String> map2 = map;
        if (m4Var2.f10866a.size() > 0 && !m4Var2.f10866a.contains(i4Var2.f10537d)) {
            return false;
        }
        if (m4Var2.f10867b.size() > 0 && m4Var2.f10867b.contains(i4Var2.f10537d)) {
            return false;
        }
        if (m4Var2.f10868c.size() > 0 && !m4Var2.f10868c.contains(i4Var2.f10542i)) {
            return false;
        }
        if (m4Var2.f10869d.size() > 0 && m4Var2.f10869d.contains(i4Var2.f10542i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", map2.get("sdkVersion"));
        }
        if (map2.containsKey("category")) {
            linkedHashMap.put("category", map2.get("category"));
        }
        for (String next : m4Var2.f10870e) {
            if (map2.containsKey(next)) {
                linkedHashMap.put(next, map2.get(next));
            }
        }
        int size = linkedHashMap.size();
        if (size >= 1) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList(size);
            String str = "";
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                sb2.append(str);
                sb2.append((String) entry.getKey());
                if (entry.getValue() == null) {
                    sb2.append(" IS NULL");
                } else {
                    sb2.append(" = ?");
                    arrayList.add(entry.getValue());
                }
                str = " AND ";
            }
            Pair pair = new Pair(sb2.toString(), arrayList.toArray(new String[0]));
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                cursor = sQLiteDatabase2.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, (String) null, (String) null, "sendSuccess DESC");
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    if (j11 <= 0) {
                        return true;
                    }
                    long j12 = j10 - j11;
                    long j13 = m4Var2.f10871f;
                    if (j13 > 0 && j12 < j13) {
                        a(cursor);
                        return true;
                    }
                }
                a(cursor);
                return false;
            } finally {
                a(cursor);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void b() {
        for (d3<Void> call : this.f10811c) {
            call.call();
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public static i4 b(Cursor cursor) {
        boolean z10 = false;
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        a(j10, j11);
        String string = cursor.getString(2);
        j4 a10 = j4.a(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        if (cursor.getInt(9) == 1) {
            z10 = true;
        }
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        } else if (a10 != null) {
            Object obj = null;
            if (string5 != null) {
                try {
                    obj = new JSONTokener(string5).nextValue();
                } catch (JSONException unused) {
                }
            }
            i4 i4Var = new i4(a10, j10);
            i4Var.f10541h = Long.valueOf(j11);
            i4Var.f10536c = string;
            i4Var.f10542i = string2;
            i4Var.f10537d = string3;
            i4Var.f10538e = string4;
            i4Var.f10539f = obj;
            i4Var.f10540g = string6;
            i4Var.f10543j = z10;
            i4Var.f10544k = string7;
            return i4Var;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(b3<i4, Void> b3Var, int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("attempt < ");
        sb2.append(i10);
        sb2.append(" AND ");
        sb2.append("validTill");
        sb2.append(" >= ");
        sb2.append(currentTimeMillis);
        sb2.append(" AND ");
        sb2.append("sendSuccess");
        Cursor cursor = null;
        try {
            cursor = a().query("events", f10810d, c.a(sb2, " = 0  AND ", "send", " <= ", "sendFailure"), (String[]) null, (String) null, (String) null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i11)));
            while (cursor.moveToNext()) {
                b3<i4, Void> b3Var2 = b3Var;
                b3Var.a(b(cursor));
            }
        } finally {
            a(cursor);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.lang.String[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v4 */
    public boolean a(i4 i4Var, k4 k4Var) {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ? r14;
        String str7;
        String str8;
        i4 i4Var2 = i4Var;
        k4 k4Var2 = k4Var;
        SQLiteDatabase a10 = a();
        a10.beginTransaction();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis + k4Var2.f10785e;
            Long l10 = i4Var2.f10541h;
            if (l10 != null) {
                j10 = l10.longValue();
            } else {
                i4Var2.f10541h = Long.valueOf(currentTimeMillis);
                j10 = currentTimeMillis;
            }
            Object obj = i4Var2.f10539f;
            String obj2 = obj != null ? obj.toString() : null;
            String str9 = i4Var2.f10536c;
            if (str9 == null) {
                str9 = "4.10.5";
            }
            String str10 = str9;
            List<m4> list = k4Var2.f10787g;
            String str11 = "service";
            String str12 = "dParam";
            String str13 = "detailsJson";
            long j12 = j11;
            String str14 = "details";
            String str15 = "value";
            long j13 = j10;
            String str16 = "events";
            String str17 = "sdkVersion";
            if (list.size() > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put(str17, str10);
                String str18 = str10;
                hashMap.put("category", i4Var2.f10534a.f10602a);
                hashMap.put("appActivity", i4Var2.f10542i);
                hashMap.put(str15, i4Var2.f10537d);
                hashMap.put(str14, i4Var2.f10538e);
                hashMap.put(str13, obj2);
                hashMap.put(str12, i4Var2.f10540g);
                hashMap.put(str11, i4Var2.f10543j ? "1" : "0");
                for (m4 a11 : list) {
                    HashMap hashMap2 = hashMap;
                    String str19 = str12;
                    String str20 = str11;
                    String str21 = str13;
                    String str22 = str18;
                    String str23 = obj2;
                    String str24 = str14;
                    String str25 = str15;
                    String str26 = str17;
                    if (a(i4Var, a11, a10, hashMap2, currentTimeMillis)) {
                        a10.endTransaction();
                        return false;
                    }
                    str17 = str26;
                    str14 = str24;
                    str15 = str25;
                    hashMap = hashMap2;
                    str12 = str19;
                    str11 = str20;
                    obj2 = str23;
                    str18 = str22;
                    str13 = str21;
                }
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str8 = str18;
                str7 = str17;
                str5 = str15;
                r14 = 0;
            } else {
                str4 = str12;
                str2 = str11;
                str = obj2;
                str3 = str13;
                str6 = str14;
                str5 = str15;
                r14 = 0;
                str8 = str10;
                str7 = str17;
            }
            String str27 = str16;
            a10.delete(str27, "validTill < " + currentTimeMillis, r14);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(j13));
            contentValues.put("validTill", Long.valueOf(j12));
            contentValues.put(str7, str8);
            contentValues.put("category", i4Var2.f10534a.f10602a);
            contentValues.put("appActivity", i4Var2.f10542i);
            contentValues.put(str5, i4Var2.f10537d);
            contentValues.put(str6, i4Var2.f10538e);
            contentValues.put(str3, str);
            contentValues.put(str4, i4Var2.f10540g);
            contentValues.put(str2, Integer.valueOf(i4Var2.f10543j ? 1 : 0));
            contentValues.put("tag", i4Var2.f10544k);
            contentValues.put("priority", Integer.valueOf(k4Var.f10783c));
            a10.insertOrThrow(str27, r14, contentValues);
            a10.setTransactionSuccessful();
            a10.endTransaction();
            b();
            return true;
        } catch (Throwable th) {
            a10.endTransaction();
            throw th;
        }
    }

    public static void a(long j10, long j11) {
        if (j10 <= 0) {
            throw new IllegalArgumentException();
        } else if (j11 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j10) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, (String) null);
            if (cursor.moveToFirst()) {
                return cursor.getInt(0);
            }
            throw new IllegalStateException();
        } finally {
            a(cursor);
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
