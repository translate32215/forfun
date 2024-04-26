package t2;

import android.content.ContentValues;
import android.database.Cursor;
import com.adcolony.sdk.t;
import java.util.ArrayList;
import java.util.List;

public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f25547a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<ContentValues> f25548b = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25549a;

        /* renamed from: b  reason: collision with root package name */
        public final String f25550b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25551c;

        public a(int i10, String str, int i11, t tVar) {
            this.f25549a = i10;
            this.f25550b = str;
            this.f25551c = i11;
        }
    }

    public static void b(p0 p0Var, Cursor cursor) {
        ContentValues contentValues = new ContentValues();
        for (a next : p0Var.f25547a) {
            int i10 = next.f25551c;
            if (i10 == 1) {
                contentValues.put(next.f25550b, Long.valueOf(cursor.getLong(next.f25549a)));
            } else if (i10 == 2) {
                contentValues.put(next.f25550b, Double.valueOf(cursor.getDouble(next.f25549a)));
            } else if (i10 != 4) {
                contentValues.put(next.f25550b, cursor.getString(next.f25549a));
            } else {
                contentValues.put(next.f25550b, cursor.getBlob(next.f25549a));
            }
        }
        p0Var.f25548b.add(contentValues);
    }

    public String a(int i10) {
        if (i10 < 0 || i10 >= this.f25547a.size()) {
            return null;
        }
        return this.f25547a.get(i10).f25550b;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            str = "\n";
            if (i10 >= this.f25547a.size()) {
                break;
            }
            sb2.append(this.f25547a.get(i10).f25550b);
            if (i10 != this.f25547a.size() - 1) {
                str = " | ";
            }
            sb2.append(str);
            i10++;
        }
        for (ContentValues next : this.f25548b) {
            for (int i11 = 0; i11 < this.f25547a.size(); i11++) {
                sb2.append(next.getAsString(a(i11)));
                if (i11 == this.f25547a.size() - 1) {
                    str2 = str;
                } else {
                    str2 = " | ";
                }
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }
}
