package kf;

import gf.h;
import gf.l;
import gf.t;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jf.e;
import kd.o;
import ud.f;
import ud.k;

/* compiled from: KodeinContainerBuilderImpl.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f20907a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<l.e<?, ?, ?>, List<t<?, ?, ?>>> f20908b;

    /* renamed from: c  reason: collision with root package name */
    public final List<td.l<h, o>> f20909c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e<?, ?>> f20910d;

    /* compiled from: KodeinContainerBuilderImpl.kt */
    public enum a {
        ;

        /* renamed from: kf.d$a$a  reason: collision with other inner class name */
        /* compiled from: KodeinContainerBuilderImpl.kt */
        public static final class C0177a extends a {
            public C0177a(String str, int i10) {
                super(str, i10, (f) null);
            }

            public boolean a() {
                return true;
            }

            public Boolean b(Boolean bool) {
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        }

        /* compiled from: KodeinContainerBuilderImpl.kt */
        public static final class b extends a {
            public b(String str, int i10) {
                super(str, i10, (f) null);
            }

            public boolean a() {
                return true;
            }

            public Boolean b(Boolean bool) {
                return bool;
            }
        }

        /* compiled from: KodeinContainerBuilderImpl.kt */
        public static final class c extends a {
            public c(String str, int i10) {
                super(str, i10, (f) null);
            }

            public boolean a() {
                return false;
            }

            public Boolean b(Boolean bool) {
                if (bool == null || !bool.booleanValue()) {
                    return Boolean.FALSE;
                }
                throw new l.i("Overriding has been forbidden");
            }
        }

        /* access modifiers changed from: public */
        a(f fVar) {
        }

        public abstract boolean a();

        public abstract Boolean b(Boolean bool);
    }

    public d(boolean z10, boolean z11, Map<l.e<?, ?, ?>, List<t<?, ?, ?>>> map, List<td.l<h, o>> list, List<e<?, ?>> list2) {
        a aVar;
        k.g(map, "bindingsMap");
        k.g(list, "callbacks");
        k.g(list2, "translators");
        this.f20908b = map;
        this.f20909c = list;
        this.f20910d = list2;
        if (!z10) {
            aVar = a.f20913c;
        } else if (z11) {
            aVar = a.f20911a;
        } else {
            aVar = a.f20912b;
        }
        this.f20907a = aVar;
    }

    public <C, A, T> void a(l.e<? super C, ? super A, ? extends T> eVar, jf.h<? super C, ? super A, ? extends T> hVar, String str, Boolean bool) {
        eVar.f18676d.f(eVar);
        eVar.f18675c.f(eVar);
        Boolean b10 = this.f20907a.b(bool);
        if (b10 != null) {
            if (b10.booleanValue() && !this.f20908b.containsKey(eVar)) {
                throw new l.i("Binding " + eVar + " must override an existing binding.");
            } else if (!b10.booleanValue() && this.f20908b.containsKey(eVar)) {
                throw new l.i("Binding " + eVar + " must not override an existing binding.");
            }
        }
        Map<l.e<?, ?, ?>, List<t<?, ?, ?>>> map = this.f20908b;
        List<t<?, ?, ?>> list = map.get(eVar);
        if (list == null) {
            list = new LinkedList<>();
            map.put(eVar, list);
        }
        list.add(0, new t(hVar, str));
    }
}
