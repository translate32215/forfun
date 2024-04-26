package v1;

import android.database.Cursor;
import android.os.Build;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o1.q;

/* compiled from: TableInfo */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26351a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f26352b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<C0264b> f26353c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f26354d;

    /* compiled from: TableInfo */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f26355a;

        /* renamed from: b  reason: collision with root package name */
        public final String f26356b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26357c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f26358d;

        /* renamed from: e  reason: collision with root package name */
        public final int f26359e;

        public a(String str, String str2, boolean z10, int i10) {
            this.f26355a = str;
            this.f26356b = str2;
            this.f26358d = z10;
            this.f26359e = i10;
            int i11 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i11 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains(AdPreferences.TYPE_TEXT)) {
                    i11 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i11 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f26357c = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT < 20) {
                if ((this.f26359e > 0) != (aVar.f26359e > 0)) {
                    return false;
                }
            } else if (this.f26359e != aVar.f26359e) {
                return false;
            }
            if (this.f26355a.equals(aVar.f26355a) && this.f26358d == aVar.f26358d && this.f26357c == aVar.f26357c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f26355a.hashCode() * 31) + this.f26357c) * 31) + (this.f26358d ? 1231 : 1237)) * 31) + this.f26359e;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Column{name='");
            a10.append(this.f26355a);
            a10.append('\'');
            a10.append(", type='");
            a10.append(this.f26356b);
            a10.append('\'');
            a10.append(", affinity='");
            a10.append(this.f26357c);
            a10.append('\'');
            a10.append(", notNull=");
            a10.append(this.f26358d);
            a10.append(", primaryKeyPosition=");
            a10.append(this.f26359e);
            a10.append('}');
            return a10.toString();
        }
    }

    /* renamed from: v1.b$b  reason: collision with other inner class name */
    /* compiled from: TableInfo */
    public static class C0264b {

        /* renamed from: a  reason: collision with root package name */
        public final String f26360a;

        /* renamed from: b  reason: collision with root package name */
        public final String f26361b;

        /* renamed from: c  reason: collision with root package name */
        public final String f26362c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f26363d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f26364e;

        public C0264b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f26360a = str;
            this.f26361b = str2;
            this.f26362c = str3;
            this.f26363d = Collections.unmodifiableList(list);
            this.f26364e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0264b.class != obj.getClass()) {
                return false;
            }
            C0264b bVar = (C0264b) obj;
            if (this.f26360a.equals(bVar.f26360a) && this.f26361b.equals(bVar.f26361b) && this.f26362c.equals(bVar.f26362c) && this.f26363d.equals(bVar.f26363d)) {
                return this.f26364e.equals(bVar.f26364e);
            }
            return false;
        }

        public int hashCode() {
            int a10 = q.a(this.f26362c, q.a(this.f26361b, this.f26360a.hashCode() * 31, 31), 31);
            return this.f26364e.hashCode() + ((this.f26363d.hashCode() + a10) * 31);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("ForeignKey{referenceTable='");
            a10.append(this.f26360a);
            a10.append('\'');
            a10.append(", onDelete='");
            a10.append(this.f26361b);
            a10.append('\'');
            a10.append(", onUpdate='");
            a10.append(this.f26362c);
            a10.append('\'');
            a10.append(", columnNames=");
            a10.append(this.f26363d);
            a10.append(", referenceColumnNames=");
            a10.append(this.f26364e);
            a10.append('}');
            return a10.toString();
        }
    }

    /* compiled from: TableInfo */
    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final int f26365a;

        /* renamed from: b  reason: collision with root package name */
        public final int f26366b;

        /* renamed from: c  reason: collision with root package name */
        public final String f26367c;

        /* renamed from: d  reason: collision with root package name */
        public final String f26368d;

        public c(int i10, int i11, String str, String str2) {
            this.f26365a = i10;
            this.f26366b = i11;
            this.f26367c = str;
            this.f26368d = str2;
        }

        public int compareTo(Object obj) {
            c cVar = (c) obj;
            int i10 = this.f26365a - cVar.f26365a;
            return i10 == 0 ? this.f26366b - cVar.f26366b : i10;
        }
    }

    /* compiled from: TableInfo */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f26369a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f26370b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f26371c;

        public d(String str, boolean z10, List<String> list) {
            this.f26369a = str;
            this.f26370b = z10;
            this.f26371c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f26370b != dVar.f26370b || !this.f26371c.equals(dVar.f26371c)) {
                return false;
            }
            if (this.f26369a.startsWith("index_")) {
                return dVar.f26369a.startsWith("index_");
            }
            return this.f26369a.equals(dVar.f26369a);
        }

        public int hashCode() {
            int i10;
            if (this.f26369a.startsWith("index_")) {
                i10 = -1184239155;
            } else {
                i10 = this.f26369a.hashCode();
            }
            return this.f26371c.hashCode() + (((i10 * 31) + (this.f26370b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Index{name='");
            a10.append(this.f26369a);
            a10.append('\'');
            a10.append(", unique=");
            a10.append(this.f26370b);
            a10.append(", columns=");
            a10.append(this.f26371c);
            a10.append('}');
            return a10.toString();
        }
    }

    public b(String str, Map<String, a> map, Set<C0264b> set, Set<d> set2) {
        Set<d> set3;
        this.f26351a = str;
        this.f26352b = Collections.unmodifiableMap(map);
        this.f26353c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f26354d = set3;
    }

    /* JADX INFO: finally extract failed */
    public static b a(x1.a aVar, String str) {
        int i10;
        int i11;
        List<c> list;
        int i12;
        String str2 = str;
        y1.a aVar2 = (y1.a) aVar;
        Cursor d10 = aVar2.d(q.b.a("PRAGMA table_info(`", str2, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (d10.getColumnCount() > 0) {
                int columnIndex = d10.getColumnIndex("name");
                int columnIndex2 = d10.getColumnIndex("type");
                int columnIndex3 = d10.getColumnIndex("notnull");
                int columnIndex4 = d10.getColumnIndex("pk");
                while (d10.moveToNext()) {
                    String string = d10.getString(columnIndex);
                    hashMap.put(string, new a(string, d10.getString(columnIndex2), d10.getInt(columnIndex3) != 0, d10.getInt(columnIndex4)));
                }
            }
            d10.close();
            HashSet hashSet = new HashSet();
            Cursor d11 = aVar2.d("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex5 = d11.getColumnIndex("id");
                int columnIndex6 = d11.getColumnIndex("seq");
                int columnIndex7 = d11.getColumnIndex("table");
                int columnIndex8 = d11.getColumnIndex("on_delete");
                int columnIndex9 = d11.getColumnIndex("on_update");
                List<c> b10 = b(d11);
                int count = d11.getCount();
                int i13 = 0;
                while (i13 < count) {
                    d11.moveToPosition(i13);
                    if (d11.getInt(columnIndex6) != 0) {
                        i10 = columnIndex5;
                        i12 = columnIndex6;
                        list = b10;
                        i11 = count;
                    } else {
                        int i14 = d11.getInt(columnIndex5);
                        i10 = columnIndex5;
                        ArrayList arrayList = new ArrayList();
                        i12 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b10).iterator();
                        while (it.hasNext()) {
                            List<c> list2 = b10;
                            c cVar = (c) it.next();
                            int i15 = count;
                            if (cVar.f26365a == i14) {
                                arrayList.add(cVar.f26367c);
                                arrayList2.add(cVar.f26368d);
                            }
                            b10 = list2;
                            count = i15;
                        }
                        list = b10;
                        i11 = count;
                        hashSet.add(new C0264b(d11.getString(columnIndex7), d11.getString(columnIndex8), d11.getString(columnIndex9), arrayList, arrayList2));
                    }
                    i13++;
                    columnIndex5 = i10;
                    columnIndex6 = i12;
                    b10 = list;
                    count = i11;
                }
                d11.close();
                Cursor d12 = aVar2.d("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex10 = d12.getColumnIndex("name");
                    int columnIndex11 = d12.getColumnIndex("origin");
                    int columnIndex12 = d12.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex10 != -1 && columnIndex11 != -1) {
                        if (columnIndex12 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (d12.moveToNext()) {
                                if ("c".equals(d12.getString(columnIndex11))) {
                                    d c10 = c(aVar2, d12.getString(columnIndex10), d12.getInt(columnIndex12) == 1);
                                    if (c10 != null) {
                                        hashSet3.add(c10);
                                    }
                                }
                            }
                            d12.close();
                            hashSet2 = hashSet3;
                            return new b(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new b(str2, hashMap, hashSet, hashSet2);
                } finally {
                    d12.close();
                }
            } catch (Throwable th) {
                d11.close();
                throw th;
            }
        } catch (Throwable th2) {
            d10.close();
            throw th2;
        }
    }

    public static List<c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(x1.a aVar, String str, boolean z10) {
        Cursor d10 = ((y1.a) aVar).d(q.b.a("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = d10.getColumnIndex("seqno");
            int columnIndex2 = d10.getColumnIndex("cid");
            int columnIndex3 = d10.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (d10.moveToNext()) {
                        if (d10.getInt(columnIndex2) >= 0) {
                            int i10 = d10.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i10), d10.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z10, arrayList);
                    d10.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            d10.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f26351a;
        if (str == null ? bVar.f26351a != null : !str.equals(bVar.f26351a)) {
            return false;
        }
        Map<String, a> map = this.f26352b;
        if (map == null ? bVar.f26352b != null : !map.equals(bVar.f26352b)) {
            return false;
        }
        Set<C0264b> set2 = this.f26353c;
        if (set2 == null ? bVar.f26353c != null : !set2.equals(bVar.f26353c)) {
            return false;
        }
        Set<d> set3 = this.f26354d;
        if (set3 == null || (set = bVar.f26354d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f26351a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f26352b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0264b> set = this.f26353c;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("TableInfo{name='");
        a10.append(this.f26351a);
        a10.append('\'');
        a10.append(", columns=");
        a10.append(this.f26352b);
        a10.append(", foreignKeys=");
        a10.append(this.f26353c);
        a10.append(", indices=");
        a10.append(this.f26354d);
        a10.append('}');
        return a10.toString();
    }
}
