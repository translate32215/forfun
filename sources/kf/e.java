package kf;

import ce.i;
import gf.b0;
import gf.g;
import gf.g0;
import gf.l;
import gf.q;
import gf.r;
import gf.s;
import gf.u;
import gf.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.f;
import kd.o;
import ld.h;
import ld.n;
import td.p;
import ud.k;
import ud.l;
import ud.x;

/* compiled from: KodeinContainerImpl.kt */
public final class e implements q {

    /* renamed from: a  reason: collision with root package name */
    public volatile td.a<o> f20915a;

    /* renamed from: b  reason: collision with root package name */
    public final w f20916b;

    /* renamed from: c  reason: collision with root package name */
    public final b f20917c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f20918d;

    /* compiled from: KodeinContainerImpl.kt */
    public static final class a extends l implements td.a<o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f20919b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f20920c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ td.a f20921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, Object obj, td.a aVar) {
            super(0);
            this.f20919b = eVar;
            this.f20920c = obj;
            this.f20921d = aVar;
        }

        public Object d() {
            Object obj = this.f20920c;
            e eVar = this.f20919b;
            if (eVar.f20915a != null) {
                if (obj != null) {
                    synchronized (obj) {
                        if (eVar.f20915a != null) {
                            this.f20919b.f20915a = null;
                            this.f20921d.d();
                        }
                    }
                } else if (eVar.f20915a != null) {
                    this.f20919b.f20915a = null;
                    this.f20921d.d();
                }
            }
            return o.f20627a;
        }
    }

    /* compiled from: KodeinContainerImpl.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final l.e<?, ?, ?> f20922a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20923b;

        /* renamed from: c  reason: collision with root package name */
        public final b f20924c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20925d;

        public b(l.e<?, ?, ?> eVar, int i10, b bVar, boolean z10) {
            k.g(eVar, "key");
            this.f20922a = eVar;
            this.f20923b = i10;
            this.f20924c = bVar;
            this.f20925d = z10;
        }

        public final void a(l.e<?, ?, ?> eVar, int i10) {
            int i11;
            boolean z10;
            b bVar = this;
            while (true) {
                i11 = 0;
                if (k.a(bVar.f20922a, eVar) && bVar.f20923b == i10) {
                    z10 = false;
                    break;
                }
                bVar = bVar.f20924c;
                if (bVar == null) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                Iterable iterable = n.f21256a;
                b bVar2 = this;
                while (bVar2.f20924c != null && (!k.a(eVar, bVar2.f20922a) || i10 != bVar2.f20923b)) {
                    b bVar3 = bVar2.f20924c;
                    iterable = ld.l.q(h.c(b(bVar2.f20922a, bVar2.f20923b)), iterable);
                    bVar2 = bVar3;
                }
                List r10 = ld.l.r(ld.l.q(h.c(b(bVar2.f20922a, bVar2.f20923b)), iterable), b(eVar, this.f20923b));
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) r10;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        String str = (String) next;
                        sb2.append("  ");
                        if (i11 == 0) {
                            sb2.append("   ");
                        } else if (i11 != 1) {
                            sb2.append("  ║");
                            sb2.append(i.f("  ", i11 - 1));
                            sb2.append("╚>");
                        } else {
                            sb2.append("  ╔╩>");
                        }
                        sb2.append(str);
                        sb2.append("\n");
                        i11 = i12;
                    } else {
                        h.e();
                        throw null;
                    }
                }
                sb2.append("    ╚");
                sb2.append(i.f("══", arrayList.size() - 1));
                sb2.append("╝");
                throw new l.d("Dependency recursion:\n" + sb2);
            }
        }

        public final String b(l.e<?, ?, ?> eVar, int i10) {
            ae.e fVar = this.f20925d ? new f(eVar) : new g(eVar);
            if (i10 == 0) {
                return (String) fVar.get();
            }
            StringBuilder a10 = android.support.v4.media.a.a("overridden ");
            a10.append((String) fVar.get());
            return a10.toString();
        }
    }

    /* compiled from: KodeinContainerImpl.kt */
    public static final class c extends ud.l implements p<Map<l.e<?, ?, ?>, ? extends List<? extends u<?, ?, ?>>>, Boolean, String> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f20926b = new c();

        public c() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            Map map = (Map) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            k.g(map, "$receiver");
            k.g(map, "$this$fullDescription");
            return gf.c.a(map, booleanValue, 8, gf.d.f18657g, gf.e.f18661g);
        }
    }

    /* compiled from: KodeinContainerImpl.kt */
    public static final class d extends ud.l implements p<Map<l.e<?, ?, ?>, ? extends List<? extends u<?, ?, ?>>>, Boolean, String> {

        /* renamed from: b  reason: collision with root package name */
        public static final d f20927b = new d();

        public d() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            Map map = (Map) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            k.g(map, "$receiver");
            k.g(map, "$this$description");
            return gf.c.a(map, booleanValue, 8, gf.a.f18643g, gf.b.f18647g);
        }
    }

    /* renamed from: kf.e$e  reason: collision with other inner class name */
    /* compiled from: KodeinContainerImpl.kt */
    public static final class C0178e extends ud.l implements td.a<o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f20928b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f20929c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0178e(e eVar, d dVar) {
            super(0);
            this.f20928b = eVar;
            this.f20929c = dVar;
        }

        public Object d() {
            e eVar = this.f20928b;
            g gVar = g.f18665b;
            b bVar = new b(eVar, g.f18664a);
            for (td.l c10 : this.f20929c.f20909c) {
                c10.c(bVar);
            }
            return o.f20627a;
        }
    }

    public e(w wVar, b bVar, boolean z10) {
        this.f20916b = wVar;
        this.f20917c = bVar;
        this.f20918d = z10;
    }

    public <C, T> td.a<T> a(l.e<? super C, ? super o, ? extends T> eVar, C c10, int i10) {
        k.g(eVar, "key");
        k.g(eVar, "key");
        return new r(c(eVar, c10, 0));
    }

    public final <C, A, T> jf.c<C> b(l.e<? super C, ? super A, ? extends T> eVar, s<C> sVar, w wVar, int i10) {
        return new a(new b(new e(wVar, new b(eVar, i10, this.f20917c, this.f20918d), this.f20918d), sVar), eVar, ((s.a) sVar).f18691b, i10);
    }

    public <C, A, T> td.l<A, T> c(l.e<? super C, ? super A, ? extends T> eVar, C c10, int i10) {
        s.a aVar;
        k.g(eVar, "key");
        boolean z10 = false;
        List<kd.k<l.e<Object, ? super A, ? extends T>, u<Object, ? super A, ? extends T>, jf.e<? super C, Object>>> a10 = this.f20916b.a(eVar, i10, false);
        if (a10.size() == 1) {
            kd.k kVar = a10.get(0);
            u uVar = (u) kVar.f20624b;
            jf.e eVar2 = (jf.e) kVar.f20625c;
            b bVar = this.f20917c;
            if (bVar != null) {
                bVar.a(eVar, i10);
            }
            if (eVar2 != null) {
                g0 c11 = eVar2.c();
                Object b10 = eVar2.b(c10);
                k.g(c11, "type");
                aVar = new s.a(c11, b10);
            } else {
                g0<? super C> g0Var = eVar.f18674b;
                k.g(g0Var, "type");
                aVar = new s.a(g0Var, c10);
            }
            return uVar.f18692a.c(b(eVar, aVar, uVar.f18694c, i10), eVar);
        }
        g0<? super C> g0Var2 = eVar.f18674b;
        k.g(g0Var2, "type");
        jf.c<? super C> b11 = b(eVar, new s.a(g0Var2, c10), this.f20916b, i10);
        for (f c12 : this.f20916b.c()) {
            td.l<Object, Object> c13 = c12.c(b11, eVar);
            if (c13 != null) {
                b bVar2 = this.f20917c;
                if (bVar2 != null) {
                    bVar2.a(eVar, i10);
                }
                x.b(c13, 1);
                return c13;
            }
        }
        if (i10 != 0) {
            z10 = true;
        }
        ae.e hVar = this.f20918d ? new h(eVar) : new i(eVar);
        p pVar = this.f20918d ? c.f20926b : d.f20927b;
        int i11 = 16;
        if (a10.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder a11 = android.support.v4.media.a.a("No binding found for ");
            a11.append((String) hVar.get());
            a11.append(10);
            sb2.append(a11.toString());
            List<kd.k<l.e<?, ?, ?>, List<u<?, ?, ?>>, jf.e<?, ?>>> b12 = this.f20916b.b(new b0((g0) null, (g0) null, eVar.f18676d, (Object) null, 11));
            if (!b12.isEmpty()) {
                StringBuilder a12 = android.support.v4.media.a.a("Available bindings for this type:\n");
                int a13 = ld.s.a(ld.i.f(b12, 10));
                if (a13 >= 16) {
                    i11 = a13;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (kd.k kVar2 : b12) {
                    linkedHashMap.put(kVar2.f20623a, kVar2.f20624b);
                }
                a12.append((String) pVar.h(linkedHashMap, Boolean.valueOf(z10)));
                sb2.append(a12.toString());
            }
            StringBuilder a14 = android.support.v4.media.a.a("Registered in this Kodein container:\n");
            a14.append((String) pVar.h(this.f20916b.d(), Boolean.valueOf(z10)));
            sb2.append(a14.toString());
            String sb3 = sb2.toString();
            k.b(sb3, "StringBuilder().apply(builderAction).toString()");
            throw new l.h(eVar, sb3);
        }
        int a15 = ld.s.a(ld.i.f(a10, 10));
        if (a15 >= 16) {
            i11 = a15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
        for (kd.k kVar3 : a10) {
            A a16 = kVar3.f20623a;
            kd.k e10 = this.f20916b.e((l.e) a16);
            if (e10 != null) {
                linkedHashMap2.put(a16, e10.f20624b);
            } else {
                k.k();
                throw null;
            }
        }
        Map<l.e<?, ?, ?>, List<u<?, ?, ?>>> d10 = this.f20916b.d();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry next : d10.entrySet()) {
            if (!linkedHashMap2.keySet().contains((l.e) next.getKey())) {
                linkedHashMap3.put(next.getKey(), next.getValue());
            }
        }
        throw new l.h(eVar, linkedHashMap2.size() + " bindings found that match " + eVar + ":\n" + ((String) pVar.h(linkedHashMap2, Boolean.valueOf(z10))) + "Other bindings registered in Kodein:\n" + ((String) pVar.h(linkedHashMap3, Boolean.valueOf(z10))));
    }

    public e(d dVar, List<? extends f> list, boolean z10, boolean z11) {
        k.g(dVar, "builder");
        k.g(list, "externalSources");
        this.f20916b = new m(dVar.f20908b, list, dVar.f20910d);
        this.f20917c = null;
        this.f20918d = z10;
        C0178e eVar = new C0178e(this, dVar);
        if (z11) {
            eVar.d();
        } else {
            this.f20915a = new a(this, new Object(), eVar);
        }
    }
}
