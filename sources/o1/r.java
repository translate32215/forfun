package o1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import be.g;
import j.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ld.c;
import ld.i;
import ld.t;
import o1.n;
import s.j;
import s.k;
import ud.k;
import ud.l;
import ud.x;

/* compiled from: NavDestination.kt */
public class r {

    /* renamed from: r  reason: collision with root package name */
    public static final r f22798r = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f22799a;

    /* renamed from: b  reason: collision with root package name */
    public t f22800b;

    /* renamed from: c  reason: collision with root package name */
    public String f22801c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f22802d;

    /* renamed from: e  reason: collision with root package name */
    public final List<n> f22803e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final j<c> f22804f = new j<>();

    /* renamed from: g  reason: collision with root package name */
    public Map<String, g> f22805g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public int f22806h;

    /* renamed from: i  reason: collision with root package name */
    public String f22807i;

    /* compiled from: NavDestination.kt */
    public static final class a extends l implements td.l<r, r> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f22808b = new a();

        public a() {
            super(1);
        }

        public Object c(Object obj) {
            r rVar = (r) obj;
            k.f(rVar, "it");
            return rVar.f22800b;
        }
    }

    /* compiled from: NavDestination.kt */
    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public final r f22809a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f22810b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f22811c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f22812d;

        /* renamed from: e  reason: collision with root package name */
        public final int f22813e;

        public b(r rVar, Bundle bundle, boolean z10, boolean z11, int i10) {
            this.f22809a = rVar;
            this.f22810b = bundle;
            this.f22811c = z10;
            this.f22812d = z11;
            this.f22813e = i10;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            k.f(bVar, "other");
            boolean z10 = this.f22811c;
            if (z10 && !bVar.f22811c) {
                return 1;
            }
            if (!z10 && bVar.f22811c) {
                return -1;
            }
            Bundle bundle = this.f22810b;
            if (bundle != null && bVar.f22810b == null) {
                return 1;
            }
            if (bundle == null && bVar.f22810b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = bVar.f22810b;
                k.c(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f22812d;
            if (z11 && !bVar.f22812d) {
                return 1;
            }
            if (z11 || !bVar.f22812d) {
                return this.f22813e - bVar.f22813e;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public r(d0<? extends r> d0Var) {
        e0 e0Var = e0.f22676b;
        this.f22799a = e0.b(d0Var.getClass());
    }

    public static final String i(String str) {
        return str != null ? f.a("android-app://androidx.navigation/", str) : "";
    }

    public static final String q(Context context, int i10) {
        String str;
        k.f(context, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            str = context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            str = String.valueOf(i10);
        }
        k.e(str, "try {\n                co….toString()\n            }");
        return str;
    }

    public static final be.f<r> s(r rVar) {
        k.f(rVar, "<this>");
        return g.c(rVar, a.f22808b);
    }

    public final void c(n nVar) {
        Map<String, g> o10 = o();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, g>> it = o10.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            g gVar = (g) next.getValue();
            if (gVar.f22688b || gVar.f22689c) {
                z10 = false;
            }
            if (z10) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next2 : keySet) {
            String str = (String) next2;
            List<String> list = nVar.f22775d;
            Collection<n.a> values = nVar.f22776e.values();
            ArrayList arrayList2 = new ArrayList();
            for (n.a aVar : values) {
                ld.k.g(arrayList2, aVar.f22785b);
            }
            if (!((ArrayList) ld.l.q(list, arrayList2)).contains(str)) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            this.f22803e.add(nVar);
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Deep link ");
        a10.append(nVar.f22772a);
        a10.append(" can't be used to open destination ");
        a10.append(this);
        a10.append(".\nFollowing required arguments are missing: ");
        a10.append(arrayList);
        throw new IllegalArgumentException(a10.toString().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x0156
            boolean r2 = r9 instanceof o1.r
            if (r2 != 0) goto L_0x000a
            goto L_0x0156
        L_0x000a:
            java.util.List<o1.n> r2 = r8.f22803e
            o1.r r9 = (o1.r) r9
            java.util.List<o1.n> r3 = r9.f22803e
            java.lang.String r4 = "<this>"
            ud.k.f(r2, r4)
            java.lang.String r4 = "other"
            ud.k.f(r3, r4)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>(r2)
            ld.k.i(r4, r3)
            int r2 = r4.size()
            java.util.List<o1.n> r3 = r8.f22803e
            int r3 = r3.size()
            if (r2 != r3) goto L_0x0030
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            s.j<o1.c> r3 = r8.f22804f
            int r3 = r3.k()
            s.j<o1.c> r4 = r9.f22804f
            int r4 = r4.k()
            if (r3 != r4) goto L_0x0099
            s.j<o1.c> r3 = r8.f22804f
            java.util.Iterator r3 = s.k.a(r3)
            be.f r3 = be.g.b(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x004d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r3.next()
            o1.c r4 = (o1.c) r4
            s.j<o1.c> r5 = r9.f22804f
            int r4 = r5.f(r4)
            if (r4 < 0) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            if (r4 != 0) goto L_0x004d
            r3 = 0
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            if (r3 == 0) goto L_0x0099
            s.j<o1.c> r3 = r9.f22804f
            java.util.Iterator r3 = s.k.a(r3)
            be.f r3 = be.g.b(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0079:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0094
            java.lang.Object r4 = r3.next()
            o1.c r4 = (o1.c) r4
            s.j<o1.c> r5 = r8.f22804f
            int r4 = r5.f(r4)
            if (r4 < 0) goto L_0x008f
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            if (r4 != 0) goto L_0x0079
            r3 = 0
            goto L_0x0095
        L_0x0094:
            r3 = 1
        L_0x0095:
            if (r3 == 0) goto L_0x0099
            r3 = 1
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            java.util.Map r4 = r8.o()
            int r4 = r4.size()
            java.util.Map r5 = r9.o()
            int r5 = r5.size()
            if (r4 != r5) goto L_0x013e
            java.util.Map r4 = r8.o()
            be.f r4 = ld.r.f(r4)
            ld.l$a r4 = (ld.l.a) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00ba:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f1
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.o()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00ec
            java.util.Map r6 = r9.o()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = ud.k.a(r6, r5)
            if (r5 == 0) goto L_0x00ec
            r5 = 1
            goto L_0x00ed
        L_0x00ec:
            r5 = 0
        L_0x00ed:
            if (r5 != 0) goto L_0x00ba
            r4 = 0
            goto L_0x00f2
        L_0x00f1:
            r4 = 1
        L_0x00f2:
            if (r4 == 0) goto L_0x013e
            java.util.Map r4 = r9.o()
            be.f r4 = ld.r.f(r4)
            ld.l$a r4 = (ld.l.a) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0102:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r8.o()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x0134
            java.util.Map r6 = r8.o()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = ud.k.a(r6, r5)
            if (r5 == 0) goto L_0x0134
            r5 = 1
            goto L_0x0135
        L_0x0134:
            r5 = 0
        L_0x0135:
            if (r5 != 0) goto L_0x0102
            r4 = 0
            goto L_0x013a
        L_0x0139:
            r4 = 1
        L_0x013a:
            if (r4 == 0) goto L_0x013e
            r4 = 1
            goto L_0x013f
        L_0x013e:
            r4 = 0
        L_0x013f:
            int r5 = r8.f22806h
            int r6 = r9.f22806h
            if (r5 != r6) goto L_0x0156
            java.lang.String r5 = r8.f22807i
            java.lang.String r9 = r9.f22807i
            boolean r9 = ud.k.a(r5, r9)
            if (r9 == 0) goto L_0x0156
            if (r2 == 0) goto L_0x0156
            if (r3 == 0) goto L_0x0156
            if (r4 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle f(android.os.Bundle r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0014
            java.util.Map<java.lang.String, o1.g> r0 = r5.f22805g
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x0014
            r6 = 0
            return r6
        L_0x0014:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Map<java.lang.String, o1.g> r1 = r5.f22805g
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "name"
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            o1.g r2 = (o1.g) r2
            r2.getClass()
            ud.k.f(r4, r3)
            boolean r3 = r2.f22689c
            if (r3 == 0) goto L_0x0023
            o1.a0<java.lang.Object> r3 = r2.f22687a
            java.lang.Object r2 = r2.f22690d
            r3.d(r0, r4, r2)
            goto L_0x0023
        L_0x004f:
            if (r6 == 0) goto L_0x00bc
            r0.putAll(r6)
            java.util.Map<java.lang.String, o1.g> r6 = r5.f22805g
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x005e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            o1.g r1 = (o1.g) r1
            r1.getClass()
            ud.k.f(r2, r3)
            boolean r4 = r1.f22688b
            if (r4 != 0) goto L_0x008d
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r0.get(r2)
            if (r4 != 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            o1.a0<java.lang.Object> r4 = r1.f22687a     // Catch:{ ClassCastException -> 0x0094 }
            r4.a(r0, r2)     // Catch:{ ClassCastException -> 0x0094 }
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            if (r4 == 0) goto L_0x0098
            goto L_0x005e
        L_0x0098:
            java.lang.String r6 = "Wrong argument type for '"
            java.lang.String r0 = "' in argument bundle. "
            java.lang.StringBuilder r6 = androidx.activity.result.d.a(r6, r2, r0)
            o1.a0<java.lang.Object> r0 = r1.f22687a
            java.lang.String r0 = r0.b()
            r6.append(r0)
            java.lang.String r0 = " expected."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.f(android.os.Bundle):android.os.Bundle");
    }

    public final int[] h(r rVar) {
        c cVar = new c();
        t tVar = this;
        while (true) {
            t tVar2 = tVar.f22800b;
            if ((rVar != null ? rVar.f22800b : null) != null) {
                t tVar3 = rVar.f22800b;
                k.c(tVar3);
                if (tVar3.B(tVar.f22806h) == tVar) {
                    cVar.c(tVar);
                    break;
                }
            }
            if (tVar2 == null || tVar2.f22815t != tVar.f22806h) {
                cVar.c(tVar);
            }
            if (k.a(tVar2, rVar) || tVar2 == null) {
                break;
            }
            tVar = tVar2;
        }
        List<r> w10 = ld.l.w(cVar);
        ArrayList arrayList = new ArrayList(i.f(w10, 10));
        for (r rVar2 : w10) {
            arrayList.add(Integer.valueOf(rVar2.f22806h));
        }
        return ld.l.v(arrayList);
    }

    public int hashCode() {
        int i10;
        Set<String> keySet;
        int i11 = this.f22806h * 31;
        String str = this.f22807i;
        int hashCode = i11 + (str != null ? str.hashCode() : 0);
        for (n nVar : this.f22803e) {
            int i12 = i10 * 31;
            String str2 = nVar.f22772a;
            int hashCode2 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = nVar.f22773b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = nVar.f22774c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        Iterator<T> a10 = s.k.a(this.f22804f);
        while (true) {
            k.a aVar = (k.a) a10;
            if (!aVar.hasNext()) {
                break;
            }
            c cVar = (c) aVar.next();
            int i13 = ((i10 * 31) + cVar.f22661a) * 31;
            x xVar = cVar.f22662b;
            i10 = i13 + (xVar != null ? xVar.hashCode() : 0);
            Bundle bundle = cVar.f22663c;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                for (String str5 : keySet) {
                    int i14 = i10 * 31;
                    Bundle bundle2 = cVar.f22663c;
                    ud.k.c(bundle2);
                    Object obj = bundle2.get(str5);
                    i10 = i14 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str6 : o().keySet()) {
            int a11 = q.a(str6, i10 * 31, 31);
            g gVar = o().get(str6);
            i10 = a11 + (gVar != null ? gVar.hashCode() : 0);
        }
        return i10;
    }

    public final c j(int i10) {
        c cVar;
        if (this.f22804f.k() == 0) {
            cVar = null;
        } else {
            cVar = this.f22804f.e(i10, null);
        }
        if (cVar != null) {
            return cVar;
        }
        t tVar = this.f22800b;
        if (tVar != null) {
            return tVar.j(i10);
        }
        return null;
    }

    public final Map<String, g> o() {
        return t.e(this.f22805g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f22801c;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f22806h));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f22807i;
        if (!(str2 == null || ce.i.d(str2))) {
            sb2.append(" route=");
            sb2.append(this.f22807i);
        }
        if (this.f22802d != null) {
            sb2.append(" label=");
            sb2.append(this.f22802d);
        }
        String sb3 = sb2.toString();
        ud.k.e(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.util.regex.Matcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o1.r.b x(o1.p r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            java.util.List<o1.n> r0 = r6.f22803e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List<o1.n> r0 = r6.f22803e
            java.util.Iterator r8 = r0.iterator()
            r9 = r1
        L_0x0015:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03d6
            java.lang.Object r0 = r8.next()
            o1.n r0 = (o1.n) r0
            java.lang.Object r2 = r7.f22795b
            android.net.Uri r2 = (android.net.Uri) r2
            r3 = 0
            if (r2 == 0) goto L_0x019a
            java.util.Map r4 = r19.o()
            r0.getClass()
            kd.d r5 = r0.f22778g
            java.lang.Object r5 = r5.getValue()
            java.util.regex.Pattern r5 = (java.util.regex.Pattern) r5
            if (r5 == 0) goto L_0x0042
            java.lang.String r10 = r2.toString()
            java.util.regex.Matcher r5 = r5.matcher(r10)
            goto L_0x0043
        L_0x0042:
            r5 = r1
        L_0x0043:
            if (r5 != 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            boolean r10 = r5.matches()
            if (r10 != 0) goto L_0x004e
        L_0x004c:
            goto L_0x019b
        L_0x004e:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.List<java.lang.String> r10 = r0.f22775d
            int r10 = r10.size()
            r11 = 0
        L_0x005a:
            if (r11 >= r10) goto L_0x007d
            java.util.List<java.lang.String> r12 = r0.f22775d
            java.lang.Object r12 = r12.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            int r11 = r11 + 1
            java.lang.String r13 = r5.group(r11)
            java.lang.String r13 = android.net.Uri.decode(r13)
            java.lang.Object r14 = r4.get(r12)
            o1.g r14 = (o1.g) r14
            java.lang.String r15 = "value"
            ud.k.e(r13, r15)     // Catch:{ IllegalArgumentException -> 0x019a }
            r0.b(r1, r12, r13, r14)     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x005a
        L_0x007d:
            boolean r5 = r0.f22779h
            if (r5 == 0) goto L_0x0165
            java.util.Map<java.lang.String, o1.n$a> r5 = r0.f22776e
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x008b:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0165
            java.lang.Object r10 = r5.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Map<java.lang.String, o1.n$a> r11 = r0.f22776e
            java.lang.Object r11 = r11.get(r10)
            o1.n$a r11 = (o1.n.a) r11
            java.lang.String r10 = r2.getQueryParameter(r10)
            boolean r12 = r0.f22780i
            if (r12 == 0) goto L_0x00d2
            java.lang.String r12 = r2.toString()
            java.lang.String r13 = "deepLink.toString()"
            ud.k.e(r12, r13)
            r13 = 63
            r14 = 6
            int r3 = ce.k.o(r12, r13, r3, r3, r14)
            r13 = -1
            if (r3 != r13) goto L_0x00bc
            r3 = r12
            goto L_0x00cb
        L_0x00bc:
            int r3 = r3 + 1
            int r13 = r12.length()
            java.lang.String r3 = r12.substring(r3, r13)
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            ud.k.e(r3, r13)
        L_0x00cb:
            boolean r12 = ud.k.a(r3, r12)
            if (r12 != 0) goto L_0x00d2
            r10 = r3
        L_0x00d2:
            if (r10 == 0) goto L_0x00eb
            ud.k.c(r11)
            java.lang.String r3 = r11.f22784a
            r12 = 32
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r12)
            java.util.regex.Matcher r3 = r3.matcher(r10)
            boolean r10 = r3.matches()
            if (r10 != 0) goto L_0x00ec
            goto L_0x019a
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            ud.k.c(r11)     // Catch:{ IllegalArgumentException -> 0x015b }
            java.util.List<java.lang.String> r12 = r11.f22785b     // Catch:{ IllegalArgumentException -> 0x015b }
            int r12 = r12.size()     // Catch:{ IllegalArgumentException -> 0x015b }
            r13 = 0
        L_0x00fb:
            if (r13 >= r12) goto L_0x0153
            if (r3 == 0) goto L_0x010a
            int r14 = r13 + 1
            java.lang.String r14 = r3.group(r14)     // Catch:{ IllegalArgumentException -> 0x015b }
            if (r14 != 0) goto L_0x010b
            java.lang.String r14 = ""
            goto L_0x010b
        L_0x010a:
            r14 = 0
        L_0x010b:
            java.util.List<java.lang.String> r15 = r11.f22785b     // Catch:{ IllegalArgumentException -> 0x015b }
            java.lang.Object r15 = r15.get(r13)     // Catch:{ IllegalArgumentException -> 0x015b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IllegalArgumentException -> 0x015b }
            java.lang.Object r16 = r4.get(r15)     // Catch:{ IllegalArgumentException -> 0x015b }
            r17 = r2
            r2 = r16
            o1.g r2 = (o1.g) r2     // Catch:{ IllegalArgumentException -> 0x0143 }
            if (r14 == 0) goto L_0x0146
            r16 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0143 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0143 }
            r18 = r5
            r5 = 123(0x7b, float:1.72E-43)
            r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x015e }
            r3.append(r15)     // Catch:{ IllegalArgumentException -> 0x015e }
            r5 = 125(0x7d, float:1.75E-43)
            r3.append(r5)     // Catch:{ IllegalArgumentException -> 0x015e }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x015e }
            boolean r3 = ud.k.a(r14, r3)     // Catch:{ IllegalArgumentException -> 0x015e }
            if (r3 != 0) goto L_0x014a
            r0.b(r10, r15, r14, r2)     // Catch:{ IllegalArgumentException -> 0x015e }
            goto L_0x014a
        L_0x0143:
            r18 = r5
            goto L_0x015e
        L_0x0146:
            r16 = r3
            r18 = r5
        L_0x014a:
            int r13 = r13 + 1
            r3 = r16
            r2 = r17
            r5 = r18
            goto L_0x00fb
        L_0x0153:
            r17 = r2
            r18 = r5
            r1.putAll(r10)     // Catch:{ IllegalArgumentException -> 0x015e }
            goto L_0x015e
        L_0x015b:
            r17 = r2
            goto L_0x0143
        L_0x015e:
            r3 = 0
            r2 = r17
            r5 = r18
            goto L_0x008b
        L_0x0165:
            java.util.Set r2 = r4.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x016d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            o1.g r3 = (o1.g) r3
            if (r3 == 0) goto L_0x0191
            boolean r5 = r3.f22688b
            if (r5 != 0) goto L_0x0191
            boolean r3 = r3.f22689c
            if (r3 != 0) goto L_0x0191
            r3 = 1
            goto L_0x0192
        L_0x0191:
            r3 = 0
        L_0x0192:
            if (r3 == 0) goto L_0x016d
            boolean r3 = r1.containsKey(r4)
            if (r3 != 0) goto L_0x016d
        L_0x019a:
            r1 = 0
        L_0x019b:
            r2 = r1
            java.lang.Object r1 = r7.f22796c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x01ad
            java.lang.String r3 = r0.f22773b
            boolean r1 = ud.k.a(r1, r3)
            if (r1 == 0) goto L_0x01ad
            r1 = 1
            r4 = 1
            goto L_0x01af
        L_0x01ad:
            r1 = 0
            r4 = 0
        L_0x01af:
            java.lang.Object r1 = r7.f22797d
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x03b5
            r0.getClass()
            java.lang.String r3 = r0.f22774c
            if (r3 == 0) goto L_0x03b6
            kd.d r3 = r0.f22782k
            java.lang.Object r3 = r3.getValue()
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3
            ud.k.c(r3)
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x01d3
            goto L_0x03b6
        L_0x01d3:
            java.lang.String r3 = r0.f22774c
            java.lang.String r5 = "mimeType"
            ud.k.f(r3, r5)
            java.lang.String r5 = "/"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r5)
            java.lang.String r11 = "compile(pattern)"
            ud.k.e(r10, r11)
            r12 = 0
            ce.k.r(r12)
            java.util.regex.Matcher r10 = r10.matcher(r3)
            boolean r12 = r10.find()
            r13 = 10
            if (r12 != 0) goto L_0x01fe
            java.lang.String r3 = r3.toString()
            java.util.List r3 = ld.h.c(r3)
            goto L_0x022d
        L_0x01fe:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r13)
            r13 = 0
        L_0x0204:
            int r14 = r10.start()
            java.lang.CharSequence r13 = r3.subSequence(r13, r14)
            java.lang.String r13 = r13.toString()
            r12.add(r13)
            int r13 = r10.end()
            boolean r14 = r10.find()
            if (r14 != 0) goto L_0x03b1
            int r10 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r13, r10)
            java.lang.String r3 = r3.toString()
            r12.add(r3)
            r3 = r12
        L_0x022d:
            boolean r10 = r3.isEmpty()
            java.lang.String r14 = " is less than zero."
            java.lang.String r15 = "Requested element count "
            if (r10 != 0) goto L_0x02b4
            int r10 = r3.size()
            java.util.ListIterator r10 = r3.listIterator(r10)
        L_0x023f:
            boolean r12 = r10.hasPrevious()
            if (r12 == 0) goto L_0x02b4
            java.lang.Object r12 = r10.previous()
            java.lang.String r12 = (java.lang.String) r12
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0253
            r12 = 1
            goto L_0x0254
        L_0x0253:
            r12 = 0
        L_0x0254:
            if (r12 != 0) goto L_0x02b1
            int r10 = r10.nextIndex()
            int r10 = r10 + 1
            if (r10 < 0) goto L_0x0260
            r12 = 1
            goto L_0x0261
        L_0x0260:
            r12 = 0
        L_0x0261:
            if (r12 == 0) goto L_0x02a3
            if (r10 != 0) goto L_0x0268
            ld.n r3 = ld.n.f21256a
            goto L_0x02b6
        L_0x0268:
            int r12 = r3.size()
            if (r10 < r12) goto L_0x0273
            java.util.List r3 = ld.l.w(r3)
            goto L_0x02b6
        L_0x0273:
            r12 = 1
            if (r10 != r12) goto L_0x027f
            java.lang.Object r3 = ld.l.k(r3)
            java.util.List r3 = ld.h.c(r3)
            goto L_0x02b6
        L_0x027f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r10)
            java.util.Iterator r3 = r3.iterator()
            r13 = 0
        L_0x0289:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x029e
            java.lang.Object r6 = r3.next()
            r12.add(r6)
            int r13 = r13 + 1
            if (r13 != r10) goto L_0x029b
            goto L_0x029e
        L_0x029b:
            r6 = r19
            goto L_0x0289
        L_0x029e:
            java.util.List r3 = ld.h.d(r12)
            goto L_0x02b6
        L_0x02a3:
            java.lang.String r0 = k0.g.a(r15, r10, r14)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02b1:
            r6 = r19
            goto L_0x023f
        L_0x02b4:
            ld.n r3 = ld.n.f21256a
        L_0x02b6:
            r6 = 0
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r10 = 1
            java.lang.Object r3 = r3.get(r10)
            java.lang.String r3 = (java.lang.String) r3
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            ud.k.e(r5, r11)
            r10 = 0
            ce.k.r(r10)
            java.util.regex.Matcher r16 = r5.matcher(r1)
            boolean r5 = r16.find()
            if (r5 != 0) goto L_0x02e2
            java.lang.String r1 = r1.toString()
            java.util.List r1 = ld.h.c(r1)
            goto L_0x0313
        L_0x02e2:
            java.util.ArrayList r5 = new java.util.ArrayList
            r10 = 10
            r5.<init>(r10)
            r10 = 0
        L_0x02ea:
            int r11 = r16.start()
            java.lang.CharSequence r10 = r1.subSequence(r10, r11)
            java.lang.String r10 = r10.toString()
            r5.add(r10)
            int r10 = r16.end()
            boolean r11 = r16.find()
            if (r11 != 0) goto L_0x02ea
            int r11 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r10, r11)
            java.lang.String r1 = r1.toString()
            r5.add(r1)
            r1 = r5
        L_0x0313:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x038f
            int r5 = r1.size()
            java.util.ListIterator r5 = r1.listIterator(r5)
        L_0x0321:
            boolean r10 = r5.hasPrevious()
            if (r10 == 0) goto L_0x038f
            java.lang.Object r10 = r5.previous()
            java.lang.String r10 = (java.lang.String) r10
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0335
            r10 = 1
            goto L_0x0336
        L_0x0335:
            r10 = 0
        L_0x0336:
            if (r10 != 0) goto L_0x0321
            int r5 = r5.nextIndex()
            int r5 = r5 + 1
            if (r5 < 0) goto L_0x0342
            r10 = 1
            goto L_0x0343
        L_0x0342:
            r10 = 0
        L_0x0343:
            if (r10 == 0) goto L_0x0381
            if (r5 != 0) goto L_0x034a
            ld.n r1 = ld.n.f21256a
            goto L_0x0391
        L_0x034a:
            int r10 = r1.size()
            if (r5 < r10) goto L_0x0355
            java.util.List r1 = ld.l.w(r1)
            goto L_0x0391
        L_0x0355:
            r10 = 1
            if (r5 != r10) goto L_0x0361
            java.lang.Object r1 = ld.l.k(r1)
            java.util.List r1 = ld.h.c(r1)
            goto L_0x0391
        L_0x0361:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
            r11 = 0
        L_0x036b:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x037c
            java.lang.Object r12 = r1.next()
            r10.add(r12)
            int r11 = r11 + 1
            if (r11 != r5) goto L_0x036b
        L_0x037c:
            java.util.List r1 = ld.h.d(r10)
            goto L_0x0391
        L_0x0381:
            java.lang.String r0 = k0.g.a(r15, r5, r14)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x038f:
            ld.n r1 = ld.n.f21256a
        L_0x0391:
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r10 = 1
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            boolean r5 = ud.k.a(r6, r5)
            if (r5 == 0) goto L_0x03a7
            r5 = 2
            goto L_0x03a8
        L_0x03a7:
            r5 = 0
        L_0x03a8:
            boolean r1 = ud.k.a(r3, r1)
            if (r1 == 0) goto L_0x03b7
            int r5 = r5 + 1
            goto L_0x03b7
        L_0x03b1:
            r6 = r19
            goto L_0x0204
        L_0x03b5:
            r1 = -1
        L_0x03b6:
            r5 = -1
        L_0x03b7:
            if (r2 != 0) goto L_0x03be
            if (r4 != 0) goto L_0x03be
            r1 = -1
            if (r5 <= r1) goto L_0x03d1
        L_0x03be:
            o1.r$b r6 = new o1.r$b
            boolean r3 = r0.f22783l
            r0 = r6
            r1 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L_0x03d0
            int r0 = r6.compareTo(r9)
            if (r0 <= 0) goto L_0x03d1
        L_0x03d0:
            r9 = r6
        L_0x03d1:
            r1 = 0
            r6 = r19
            goto L_0x0015
        L_0x03d6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.x(o1.p):o1.r$b");
    }

    public void y(Context context, AttributeSet attributeSet) {
        ud.k.f(context, "context");
        ud.k.f(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, p1.a.f23775e);
        ud.k.e(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        T t10 = null;
        if (string == null) {
            z(0);
        } else if (!ce.i.d(string)) {
            String i10 = i(string);
            z(i10.hashCode());
            ud.k.f(i10, "uriPattern");
            ud.k.f(i10, "uriPattern");
            c(new n(i10, (String) null, (String) null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List<n> list = this.f22803e;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (ud.k.a(((n) next).f22772a, i(this.f22807i))) {
                t10 = next;
                break;
            }
        }
        x.a(list).remove(t10);
        this.f22807i = string;
        if (obtainAttributes.hasValue(1)) {
            z(obtainAttributes.getResourceId(1, 0));
            this.f22801c = q(context, this.f22806h);
        }
        this.f22802d = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public final void z(int i10) {
        this.f22806h = i10;
        this.f22801c = null;
    }
}
