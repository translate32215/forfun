package kf;

import gf.b0;
import gf.d0;
import gf.g0;
import gf.l;
import gf.t;
import gf.u;
import gf.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kd.k;
import kf.q;
import ld.n;
import ld.r;
import ld.s;

/* compiled from: KodeinTreeImpl.kt */
public final class m implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Map<l.e<?, ?, ?>, k<l.e<?, ?, ?>, List<u<?, ?, ?>>, jf.e<?, ?>>> f20936a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<q, Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>>> f20937b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<l.e<?, ?, ?>, List<u<?, ?, ?>>> f20938c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<jf.e<?, ?>> f20939d;

    /* renamed from: e  reason: collision with root package name */
    public final List<jf.f> f20940e;

    /* renamed from: f  reason: collision with root package name */
    public final List<jf.e<?, ?>> f20941f;

    /* compiled from: KodeinTreeImpl.kt */
    public static final class a extends ud.l implements td.l<Map.Entry<? extends q, ? extends Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>>>, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g0 f20942b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g0 g0Var) {
            super(1);
            this.f20942b = g0Var;
        }

        public Object c(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            ud.k.g(entry, "<name for destructuring parameter 0>");
            return Boolean.valueOf(((q) entry.getKey()).a(this.f20942b));
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class b extends ud.l implements td.l<k<? extends q.a, ? extends Map<q.a, Map<Object, l.e<?, ?, ?>>>, ? extends jf.e<?, ?>>, k<? extends q.a, ? extends Map<q.a, Map<Object, l.e<?, ?, ?>>>, ? extends jf.e<?, ?>>> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ m f20943b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g0 f20944c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m mVar, g0 g0Var) {
            super(1);
            this.f20943b = mVar;
            this.f20944c = g0Var;
        }

        public Object c(Object obj) {
            T t10;
            boolean z10;
            k kVar = (k) obj;
            ud.k.g(kVar, "triple");
            q.a aVar = (q.a) kVar.f20623a;
            if (aVar.a(this.f20944c)) {
                return kVar;
            }
            Iterator<T> it = this.f20943b.f20939d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                jf.e eVar = (jf.e) t10;
                if (!eVar.a().g(this.f20944c) || !aVar.a(eVar.c())) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            jf.e eVar2 = (jf.e) t10;
            if (eVar2 != null) {
                return k.a(kVar, (Object) null, (Object) null, eVar2, 3);
            }
            return null;
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class c extends ud.l implements td.l<k<? extends q.a, ? extends Map<Object, l.e<?, ?, ?>>, ? extends jf.e<?, ?>>, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g0 f20945b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g0 g0Var) {
            super(1);
            this.f20945b = g0Var;
        }

        public Object c(Object obj) {
            k kVar = (k) obj;
            ud.k.g(kVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(((q.a) kVar.f20623a).a(this.f20945b));
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class d extends ud.l implements td.l<k<? extends Object, ? extends l.e<?, ?, ?>, ? extends jf.e<?, ?>>, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f20946b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Object obj) {
            super(1);
            this.f20946b = obj;
        }

        public Object c(Object obj) {
            k kVar = (k) obj;
            ud.k.g(kVar, "<name for destructuring parameter 0>");
            return Boolean.valueOf(ud.k.a(kVar.f20623a, this.f20946b));
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class e extends ud.l implements td.l<k<? extends q.a, ? extends Map<q.a, Map<Object, l.e<?, ?, ?>>>, ? extends jf.e<?, ?>>, be.f<? extends k<? extends q.a, ? extends Map<Object, l.e<?, ?, ?>>, ? extends jf.e<?, ?>>>> {

        /* renamed from: b  reason: collision with root package name */
        public static final e f20947b = new e();

        public e() {
            super(1);
        }

        public Object c(Object obj) {
            k kVar = (k) obj;
            ud.k.g(kVar, "<name for destructuring parameter 0>");
            return be.i.g(r.f((Map) kVar.f20624b), new n((jf.e) kVar.f20625c));
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class f extends ud.l implements td.l<Map.Entry<? extends q, ? extends Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>>>, be.f<? extends k>> {

        /* renamed from: b  reason: collision with root package name */
        public static final f f20948b = new f();

        public f() {
            super(1);
        }

        public Object c(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            ud.k.g(entry, "<name for destructuring parameter 0>");
            return be.i.g(r.f((Map) entry.getValue()), o.f20953b);
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class g extends ud.l implements td.l<k<? extends Object, ? extends l.e<?, ?, ?>, ? extends jf.e<?, ?>>, kd.g<? extends l.e<?, ?, ?>, ? extends jf.e<?, ?>>> {

        /* renamed from: b  reason: collision with root package name */
        public static final g f20949b = new g();

        public g() {
            super(1);
        }

        public Object c(Object obj) {
            k kVar = (k) obj;
            ud.k.g(kVar, "<name for destructuring parameter 0>");
            return new kd.g((l.e) kVar.f20624b, (jf.e) kVar.f20625c);
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class h extends ud.l implements td.l<k<? extends q.a, ? extends Map<Object, l.e<?, ?, ?>>, ? extends jf.e<?, ?>>, be.f<? extends k<? extends Object, ? extends l.e<?, ?, ?>, ? extends jf.e<?, ?>>>> {

        /* renamed from: b  reason: collision with root package name */
        public static final h f20950b = new h();

        public h() {
            super(1);
        }

        public Object c(Object obj) {
            k kVar = (k) obj;
            ud.k.g(kVar, "<name for destructuring parameter 0>");
            return be.i.g(r.f((Map) kVar.f20624b), new p((jf.e) kVar.f20625c));
        }
    }

    /* compiled from: KodeinTreeImpl.kt */
    public static final class i extends ud.l implements td.l<l.e<?, ?, ?>, String> {

        /* renamed from: b  reason: collision with root package name */
        public static final i f20951b = new i();

        public i() {
            super(1);
        }

        public Object c(Object obj) {
            l.e eVar = (l.e) obj;
            ud.k.g(eVar, "it");
            return eVar.e();
        }
    }

    public m(Map<l.e<?, ?, ?>, ? extends List<? extends t<?, ?, ?>>> map, List<? extends jf.f> list, List<? extends jf.e<?, ?>> list2) {
        ArrayList arrayList;
        boolean z10;
        Object obj;
        u uVar;
        ud.k.g(map, "map");
        ud.k.g(list2, "registeredTranslators");
        this.f20940e = list;
        this.f20941f = list2;
        this.f20939d = new ArrayList<>(list2);
        for (Map.Entry next : map.entrySet()) {
            l.e eVar = (l.e) next.getKey();
            List<t> list3 = (List) next.getValue();
            ArrayList arrayList2 = new ArrayList(ld.i.f(list3, 10));
            for (t tVar : list3) {
                if (tVar instanceof u) {
                    uVar = (u) tVar;
                } else {
                    uVar = new u(tVar.f18692a, tVar.f18693b, this);
                }
                arrayList2.add(uVar);
            }
            this.f20936a.put(eVar, new k(eVar, arrayList2, null));
            if (((t) ld.l.k(list3)).f18692a.e()) {
                obj = new q.a(eVar.f18676d);
            } else {
                obj = new q.b(eVar.f18676d);
            }
            Map<q, Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>>> map2 = this.f20937b;
            Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>> map3 = map2.get(obj);
            if (map3 == null) {
                map3 = new HashMap<>();
                map2.put(obj, map3);
            }
            Map map4 = map3;
            q.a aVar = new q.a(eVar.f18674b);
            Object obj2 = map4.get(aVar);
            if (obj2 == null) {
                obj2 = new HashMap();
                map4.put(aVar, obj2);
            }
            Map map5 = (Map) obj2;
            q.a aVar2 = new q.a(eVar.f18675c);
            Object obj3 = map5.get(aVar2);
            if (obj3 == null) {
                obj3 = new HashMap();
                map5.put(aVar2, obj3);
            }
            ((Map) obj3).put(eVar.f18677e, eVar);
        }
        Map<l.e<?, ?, ?>, k<l.e<?, ?, ?>, List<u<?, ?, ?>>, jf.e<?, ?>>> map6 = this.f20936a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.a(map6.size()));
        for (Map.Entry entry : map6.entrySet()) {
            linkedHashMap.put(entry.getKey(), (List) ((k) entry.getValue()).f20624b);
        }
        this.f20938c = new HashMap(linkedHashMap);
        do {
            arrayList = new ArrayList();
            Iterator<jf.e<?, ?>> it = this.f20939d.iterator();
            while (it.hasNext()) {
                jf.e next2 = it.next();
                Iterator<jf.e<?, ?>> it2 = this.f20939d.iterator();
                while (it2.hasNext()) {
                    jf.e next3 = it2.next();
                    if (next3.a().g(next2.c())) {
                        boolean z11 = true;
                        if (!ud.k.a(next2.a(), next3.c())) {
                            ArrayList<jf.e<?, ?>> arrayList3 = this.f20939d;
                            if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                                Iterator<T> it3 = arrayList3.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    jf.e eVar2 = (jf.e) it3.next();
                                    if (!ud.k.a(eVar2.a(), next2.a()) || !ud.k.a(eVar2.c(), next3.c())) {
                                        z10 = false;
                                        continue;
                                    } else {
                                        z10 = true;
                                        continue;
                                    }
                                    if (z10) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            if (z11) {
                                arrayList.add(new jf.d(next2, next3));
                            }
                        }
                    }
                }
            }
            ld.k.g(this.f20939d, arrayList);
        } while (!arrayList.isEmpty());
    }

    public <C, A, T> List<k<l.e<Object, A, T>, u<Object, A, T>, jf.e<C, Object>>> a(l.e<? super C, ? super A, ? extends T> eVar, int i10, boolean z10) {
        k kVar;
        ud.k.g(eVar, "key");
        if (!z10) {
            k kVar2 = this.f20936a.get(eVar);
            if (kVar2 != null) {
                l.e eVar2 = (l.e) kVar2.f20623a;
                jf.e eVar3 = (jf.e) kVar2.f20625c;
                u uVar = (u) ld.l.l((List) kVar2.f20624b, i10);
                if (uVar == null) {
                    return n.f21256a;
                }
                if (eVar2 != null) {
                    return ld.h.c(new k(eVar2, uVar, eVar3));
                }
                throw new kd.l("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
            }
            g0<? super C> g0Var = eVar.f18674b;
            d0 d0Var = d0.f18660c;
            g0<Object> g0Var2 = d0.f18659b;
            if (!ud.k.a(g0Var, g0Var2)) {
                g0<? super A> g0Var3 = eVar.f18675c;
                g0<? extends T> g0Var4 = eVar.f18676d;
                Object obj = eVar.f18677e;
                ud.k.g(g0Var2, "contextType");
                ud.k.g(g0Var3, "argType");
                ud.k.g(g0Var4, "type");
                k kVar3 = this.f20936a.get(new l.e(g0Var2, g0Var3, g0Var4, obj));
                if (kVar3 != null) {
                    l.e eVar4 = (l.e) kVar3.f20623a;
                    List list = (List) kVar3.f20624b;
                    jf.e eVar5 = (jf.e) kVar3.f20625c;
                    if (eVar5 == null || !(!ud.k.a(eVar5.a(), eVar.f18674b))) {
                        this.f20936a.put(eVar, kVar3);
                        u uVar2 = (u) ld.l.l(list, i10);
                        if (uVar2 == null) {
                            return n.f21256a;
                        }
                        if (eVar4 != null) {
                            return ld.h.c(new k(eVar4, uVar2, eVar5));
                        }
                        throw new kd.l("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                    }
                }
            }
            ArrayList<jf.e<?, ?>> arrayList = this.f20939d;
            ArrayList arrayList2 = new ArrayList();
            for (T next : arrayList) {
                if (ud.k.a(((jf.e) next).a(), eVar.f18674b)) {
                    arrayList2.add(next);
                }
            }
            ArrayList<jf.e<?, ?>> arrayList3 = this.f20939d;
            ArrayList arrayList4 = new ArrayList();
            for (T next2 : arrayList3) {
                g0 a10 = ((jf.e) next2).a();
                d0 d0Var2 = d0.f18660c;
                if (ud.k.a(a10, d0.f18659b)) {
                    arrayList4.add(next2);
                }
            }
            Iterator it = ((ArrayList) ld.l.q(arrayList2, arrayList4)).iterator();
            while (it.hasNext()) {
                jf.e eVar6 = (jf.e) it.next();
                k kVar4 = this.f20936a.get(new l.e(eVar6.c(), eVar.f18675c, eVar.f18676d, eVar.f18677e));
                if (kVar4 != null) {
                    if (!(kVar4.f20625c == null)) {
                        kVar4 = null;
                    }
                    if (kVar4 != null && kVar4.f20625c == null) {
                        this.f20936a.put(eVar, k.a(kVar4, (Object) null, (Object) null, eVar6, 3));
                        l.e eVar7 = (l.e) kVar4.f20623a;
                        u uVar3 = (u) ld.l.l((List) kVar4.f20624b, i10);
                        if (uVar3 == null) {
                            return n.f21256a;
                        }
                        if (eVar7 != null) {
                            return ld.h.c(new k(eVar7, uVar3, eVar6));
                        }
                        throw new kd.l("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                    }
                }
            }
        }
        g0<? super C> g0Var5 = eVar.f18674b;
        g0<? super A> g0Var6 = eVar.f18675c;
        g0<? extends T> g0Var7 = eVar.f18676d;
        Object obj2 = eVar.f18677e;
        be.f<Map.Entry<q, Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>>>> f10 = r.f(this.f20937b);
        if (g0Var7 != null) {
            d0 d0Var3 = d0.f18660c;
            if (!ud.k.a(g0Var7, d0.f18659b)) {
                f10 = be.i.e(f10, new a(g0Var7));
            }
        }
        be.f<R> f11 = be.i.f(f10, f.f20948b);
        if (g0Var5 != null) {
            f11 = be.i.h(f11, new b(this, g0Var5));
        }
        be.f<R> f12 = be.i.f(f11, e.f20947b);
        if (g0Var6 != null) {
            f12 = be.i.e(f12, new c(g0Var6));
        }
        be.f<R> f13 = be.i.f(f12, h.f20950b);
        if (!ud.k.a(obj2, b0.a.f18652a)) {
            f13 = be.i.e(f13, new d(obj2));
        }
        List<kd.g> i11 = be.i.i(new be.l(f13, g.f20949b));
        if (i11.size() == 1) {
            kd.g gVar = (kd.g) ld.l.k(i11);
            l.e eVar8 = (l.e) gVar.f20614a;
            jf.e eVar9 = (jf.e) gVar.f20615b;
            Map<l.e<?, ?, ?>, k<l.e<?, ?, ?>, List<u<?, ?, ?>>, jf.e<?, ?>>> map = this.f20936a;
            k kVar5 = map.get(eVar8);
            if (kVar5 != null) {
                map.put(eVar, k.a(kVar5, (Object) null, (Object) null, eVar9, 3));
            } else {
                throw g(eVar8, eVar);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (kd.g gVar2 : i11) {
            l.e eVar10 = (l.e) gVar2.f20614a;
            jf.e eVar11 = (jf.e) gVar2.f20615b;
            k kVar6 = this.f20936a.get(eVar10);
            if (kVar6 != null) {
                u uVar4 = (u) ld.l.l((List) kVar6.f20624b, i10);
                if (uVar4 == null) {
                    kVar = null;
                } else if (eVar10 != null) {
                    kVar = new k(eVar10, uVar4, eVar11);
                } else {
                    throw new kd.l("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                }
                if (kVar != null) {
                    arrayList5.add(kVar);
                }
            } else {
                throw g(eVar10, eVar);
            }
        }
        return arrayList5;
    }

    public List<k<l.e<?, ?, ?>, List<u<?, ?, ?>>, jf.e<?, ?>>> b(b0 b0Var) {
        List<kd.g<l.e<?, ?, ?>, jf.e<?, ?>>> f10 = f(b0Var);
        ArrayList arrayList = new ArrayList(ld.i.f(f10, 10));
        for (kd.g gVar : f10) {
            l.e eVar = (l.e) gVar.f20614a;
            jf.e eVar2 = (jf.e) gVar.f20615b;
            k<l.e<?, ?, ?>, List<u<?, ?, ?>>, jf.e<?, ?>> kVar = this.f20936a.get(eVar);
            if (kVar != null) {
                arrayList.add(new k(eVar, kVar.f20624b, eVar2));
            } else {
                ud.k.k();
                throw null;
            }
        }
        return arrayList;
    }

    public List<jf.f> c() {
        return this.f20940e;
    }

    public Map<l.e<?, ?, ?>, List<u<?, ?, ?>>> d() {
        return this.f20938c;
    }

    public <C, A, T> k<l.e<Object, A, T>, List<u<Object, A, T>>, jf.e<C, Object>> e(l.e<? super C, ? super A, ? extends T> eVar) {
        ud.k.g(eVar, "key");
        return this.f20936a.get(eVar);
    }

    public final List<kd.g<l.e<?, ?, ?>, jf.e<?, ?>>> f(b0 b0Var) {
        be.f<Map.Entry<q, Map<q.a, Map<q.a, Map<Object, l.e<?, ?, ?>>>>>> f10 = r.f(this.f20937b);
        g0<?> g0Var = b0Var.f18650c;
        if (g0Var != null) {
            d0 d0Var = d0.f18660c;
            if (!ud.k.a(g0Var, d0.f18659b)) {
                f10 = be.i.e(f10, new a(g0Var));
            }
        }
        be.f<R> f11 = be.i.f(f10, f.f20948b);
        g0<?> g0Var2 = b0Var.f18648a;
        if (g0Var2 != null) {
            f11 = be.i.h(f11, new b(this, g0Var2));
        }
        be.f<R> f12 = be.i.f(f11, e.f20947b);
        g0<?> g0Var3 = b0Var.f18649b;
        if (g0Var3 != null) {
            f12 = be.i.e(f12, new c(g0Var3));
        }
        be.f<R> f13 = be.i.f(f12, h.f20950b);
        Object obj = b0Var.f18651d;
        if (!ud.k.a(obj, b0.a.f18652a)) {
            f13 = be.i.e(f13, new d(obj));
        }
        return be.i.i(new be.l(f13, g.f20949b));
    }

    public final IllegalStateException g(l.e<?, ?, ?> eVar, l.e<?, ?, ?> eVar2) {
        StringBuilder a10 = android.support.v4.media.a.a("Tree returned key ");
        a10.append(eVar.e());
        a10.append(" that is not in cache when searching for ");
        a10.append(eVar2.e());
        a10.append(".\nKeys in cache:\n");
        a10.append(ld.l.m(this.f20936a.keySet(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, i.f20951b, 30));
        return new IllegalStateException(a10.toString());
    }
}
