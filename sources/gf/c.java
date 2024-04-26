package gf;

import ce.i;
import gf.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.h;
import kd.o;
import ld.e;
import td.q;
import ud.k;
import ud.l;

/* compiled from: BindingsMap.kt */
public final class c {

    /* compiled from: BindingsMap.kt */
    public static final class a extends l implements q<StringBuilder, Integer, List<? extends Map.Entry<? extends l.e<?, ?, ?>, ? extends List<? extends u<?, ?, ?>>>>, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ td.l f18653b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ td.l f18654c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f18655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(td.l lVar, td.l lVar2, boolean z10) {
            super(3);
            this.f18653b = lVar;
            this.f18654c = lVar2;
            this.f18655d = z10;
        }

        public final void a(StringBuilder sb2, int i10, List<? extends Map.Entry<? extends l.e<?, ?, ?>, ? extends List<? extends u<?, ?, ?>>>> list) {
            k.g(list, "entries");
            for (Map.Entry entry : list) {
                String str = (String) this.f18653b.c(entry.getKey());
                sb2.append(i.f(" ", i10) + str + " with " + ((String) this.f18654c.c(((u) ld.l.k((List) entry.getValue())).f18692a)));
                if (this.f18655d) {
                    int length = str.length() - 4;
                    for (u uVar : ((List) entry.getValue()).subList(1, ((List) entry.getValue()).size())) {
                        sb2.append(i.f(" ", length) + "overrides " + ((String) this.f18654c.c(uVar.f18692a)));
                    }
                }
                sb2.append("\n");
            }
        }
    }

    public static final String a(Map<l.e<?, ?, ?>, ? extends List<? extends u<?, ?, ?>>> map, boolean z10, int i10, td.l<? super l.e<?, ?, ?>, String> lVar, td.l<? super h<?, ?, ?>, String> lVar2) {
        List<String> list;
        a aVar = new a(lVar, lVar2, z10);
        Set<Map.Entry<l.e<?, ?, ?>, ? extends List<? extends u<?, ?, ?>>>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : entrySet) {
            String str = ((u) ld.l.k((List) ((Map.Entry) next).getValue())).f18693b;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(next);
        }
        Set keySet = linkedHashMap.keySet();
        k.f(keySet, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next2 : keySet) {
            if (next2 != null) {
                arrayList.add(next2);
            }
        }
        if (arrayList.size() <= 1) {
            list = ld.l.w(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Comparable[0]);
            k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Comparable[] comparableArr = (Comparable[]) array;
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            list = e.a(comparableArr);
        }
        StringBuilder sb2 = new StringBuilder();
        List list2 = (List) linkedHashMap.get((Object) null);
        if (list2 != null) {
            aVar.a(sb2, i10, list2);
        }
        for (String str2 : list) {
            sb2.append(i.f(" ", i10) + "module " + str2 + " {\n");
            int i11 = i10 + 4;
            Object obj2 = linkedHashMap.get(str2);
            if (obj2 != null) {
                aVar.a(sb2, i11, (List) obj2);
                sb2.append(i.f(" ", i10) + "}\n");
            } else {
                k.k();
                throw null;
            }
        }
        String sb3 = sb2.toString();
        k.b(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
