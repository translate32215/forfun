package ud;

import ae.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.a;
import ld.e;
import td.c;
import td.f;
import td.g;
import td.h;
import td.i;
import td.j;
import td.k;
import td.l;
import td.m;
import td.n;
import td.o;
import td.p;
import td.q;
import td.r;
import td.s;
import td.t;
import td.u;
import td.v;
import td.w;

/* compiled from: ClassReference.kt */
public final class d implements b<Object>, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends a<?>>, Integer> f26188b;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f26189a;

    static {
        int i10 = 0;
        List a10 = e.a(new Class[]{td.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, td.b.class, c.class, td.d.class, td.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class});
        ArrayList arrayList = new ArrayList(ld.i.f(a10, 10));
        for (Object next : a10) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new kd.g((Class) next, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                ld.h.e();
                throw null;
            }
        }
        f26188b = ld.t.c(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            k.e(str, "kotlinName");
            sb2.append(ce.k.s(str, '.', (String) null, 2));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            hashMap3.put(sb3, str + ".Companion");
        }
        for (Map.Entry next2 : f26188b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ld.s.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), ce.k.s((String) entry.getValue(), '.', (String) null, 2));
        }
    }

    public d(Class<?> cls) {
        k.f(cls, "jClass");
        this.f26189a = cls;
    }

    public Class<?> a() {
        return this.f26189a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && k.a(sd.a.b(this), sd.a.b((b) obj));
    }

    public int hashCode() {
        return sd.a.b(this).hashCode();
    }

    public String toString() {
        return this.f26189a.toString() + " (Kotlin reflection is not available)";
    }
}
