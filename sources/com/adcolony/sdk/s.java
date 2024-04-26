package com.adcolony.sdk;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.activity.e;
import com.adcolony.sdk.n;
import com.google.android.gms.common.internal.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f4768a;

    /* renamed from: b  reason: collision with root package name */
    public final n f4769b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f4770a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4771b;

        /* renamed from: c  reason: collision with root package name */
        public final String f4772c;

        public a(String[] strArr) {
            this.f4770a = strArr[1];
            this.f4771b = strArr[2];
            this.f4772c = strArr[4];
        }
    }

    public s(SQLiteDatabase sQLiteDatabase, n nVar) {
        this.f4768a = sQLiteDatabase;
        this.f4769b = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> a() {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.f4768a
            r1 = 0
            java.lang.String r2 = "SELECT name FROM sqlite_master  WHERE type='table' ORDER BY name"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x0024
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x0024
        L_0x0016:
            r2 = 0
            java.lang.String r2 = r0.getString(r2)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L_0x0016
        L_0x0024:
            r0.close()
            int r0 = r1.size()
            int r0 = r0 + -1
        L_0x002d:
            if (r0 < 0) goto L_0x004b
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "android_"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x0045
            java.lang.String r3 = "sqlite_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0048
        L_0x0045:
            r1.remove(r0)
        L_0x0048:
            int r0 = r0 + -1
            goto L_0x002d
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.s.a():java.util.ArrayList");
    }

    public final void b(n.a aVar) {
        for (n.c c10 : aVar.f4618g) {
            c(c10, aVar.f4613b);
        }
    }

    public final void c(n.c cVar, String str) {
        String join = TextUtils.join(", ", cVar.f4625b);
        StringBuilder a10 = android.support.v4.media.a.a("CREATE INDEX ");
        androidx.leanback.widget.s.a(a10, cVar.f4624a, " ON ", str, "(");
        this.f4768a.execSQL(e.a(a10, join, ")"));
    }

    public final void d(String str) {
        SQLiteDatabase sQLiteDatabase = this.f4768a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }

    public final void e(n.a aVar) {
        String str;
        StringBuilder a10 = android.support.v4.media.a.a("CREATE TABLE ");
        a10.append(aVar.f4613b);
        a10.append(" (");
        for (int i10 = 0; i10 < aVar.f4617f.size(); i10++) {
            n.b bVar = aVar.f4617f.get(i10);
            a10.append(bVar.f4621a);
            a10.append(" ");
            a10.append(bVar.f4622b);
            Object obj = bVar.f4623c;
            if (obj != null) {
                if (obj instanceof Boolean) {
                    str = ((Boolean) obj).booleanValue() ? "1" : "0";
                } else if (obj instanceof String) {
                    StringBuilder a11 = android.support.v4.media.a.a("'");
                    a11.append(bVar.f4623c);
                    a11.append("'");
                    str = a11.toString();
                } else {
                    str = obj.toString();
                }
                a10.append(" DEFAULT ");
                a10.append(str);
            }
            if (i10 < aVar.f4617f.size() - 1) {
                a10.append(", ");
            }
        }
        a10.append(")");
        this.f4768a.execSQL(a10.toString());
    }

    public ArrayList<String[]> f(String str) {
        Cursor rawQuery = this.f4768a.rawQuery(str, (String[]) null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i10 = 0; i10 < columnCount; i10++) {
                strArr[i10] = rawQuery.getString(i10);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    public final void g(n.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str = aVar.f4613b;
        ArrayList arrayList = new ArrayList();
        Iterator<String[]> it = f("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            a aVar2 = next.length >= 5 ? new a(next) : null;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z13 = false;
        for (n.b next2 : aVar.f4617f) {
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    z11 = false;
                    z12 = false;
                    break;
                }
                a aVar3 = (a) arrayList.get(size);
                if (h.a(aVar3.f4770a, next2.f4621a)) {
                    arrayList2.add(next2.f4621a);
                    z11 = h.a(aVar3.f4770a, next2.f4621a) && h.a(aVar3.f4771b, next2.f4622b) && h.a(aVar3.f4772c, next2.f4623c);
                    arrayList.remove(size);
                    z12 = true;
                } else {
                    size--;
                }
            }
            if (!z12 || !z11) {
                z13 = true;
            }
        }
        if (arrayList.size() > 0) {
            z13 = true;
        }
        if (z13) {
            String str2 = aVar.f4613b;
            this.f4768a.execSQL("ALTER TABLE " + str2 + " RENAME TO " + "manager_tmp_table");
            e(aVar);
            String str3 = aVar.f4613b;
            String join = TextUtils.join(", ", arrayList2);
            this.f4768a.execSQL("INSERT INTO " + str3 + " (" + join + ") SELECT " + join + " FROM " + "manager_tmp_table");
            this.f4768a.execSQL("DROP TABLE manager_tmp_table");
            b(aVar);
            return;
        }
        List<n.c> list = aVar.f4618g;
        ArrayList<String[]> f10 = f("PRAGMA index_list(" + aVar.f4613b + ")");
        ArrayList arrayList3 = new ArrayList();
        Iterator<String[]> it2 = f10.iterator();
        while (it2.hasNext()) {
            String[] next3 = it2.next();
            if (next3.length >= 3) {
                arrayList3.add(next3[1]);
            }
        }
        for (n.c next4 : list) {
            if (arrayList3.contains(next4.f4624a)) {
                String str4 = aVar.f4613b;
                ArrayList<String[]> f11 = f("PRAGMA index_info(" + next4.f4624a + ")");
                if (next4.f4625b.length == f11.size()) {
                    int i10 = 0;
                    z10 = false;
                    while (true) {
                        String[] strArr = next4.f4625b;
                        if (i10 >= strArr.length) {
                            break;
                        }
                        if (!h.a(strArr[i10], f11.get(i10)[2])) {
                            z10 = true;
                        }
                        i10++;
                    }
                } else {
                    z10 = true;
                }
                if (z10) {
                    String str5 = next4.f4624a;
                    this.f4768a.execSQL("DROP INDEX " + str5);
                    c(next4, str4);
                }
            } else {
                c(next4, aVar.f4613b);
            }
            arrayList3.remove(next4.f4624a);
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            this.f4768a.execSQL("DROP INDEX " + ((String) it3.next()));
        }
    }
}
