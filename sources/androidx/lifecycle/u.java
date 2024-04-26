package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m.b;

/* compiled from: LifecycleRegistry */
public class u extends o {

    /* renamed from: a  reason: collision with root package name */
    public m.a<s, a> f2725a = new m.a<>();

    /* renamed from: b  reason: collision with root package name */
    public o.c f2726b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<t> f2727c;

    /* renamed from: d  reason: collision with root package name */
    public int f2728d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2729e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2730f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<o.c> f2731g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2732h;

    /* compiled from: LifecycleRegistry */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public o.c f2733a;

        /* renamed from: b  reason: collision with root package name */
        public r f2734b;

        public a(s sVar, o.c cVar) {
            r rVar;
            Map<Class<?>, Integer> map = x.f2737a;
            boolean z10 = sVar instanceof r;
            boolean z11 = sVar instanceof l;
            if (z10 && z11) {
                rVar = new FullLifecycleObserverAdapter((l) sVar, (r) sVar);
            } else if (z11) {
                rVar = new FullLifecycleObserverAdapter((l) sVar, (r) null);
            } else if (z10) {
                rVar = (r) sVar;
            } else {
                Class<?> cls = sVar.getClass();
                if (x.c(cls) == 2) {
                    List list = (List) ((HashMap) x.f2738b).get(cls);
                    if (list.size() == 1) {
                        rVar = new SingleGeneratedAdapterObserver(x.a((Constructor) list.get(0), sVar));
                    } else {
                        m[] mVarArr = new m[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            mVarArr[i10] = x.a((Constructor) list.get(i10), sVar);
                        }
                        rVar = new CompositeGeneratedAdaptersObserver(mVarArr);
                    }
                } else {
                    rVar = new ReflectiveGenericLifecycleObserver(sVar);
                }
            }
            this.f2734b = rVar;
            this.f2733a = cVar;
        }

        public void a(t tVar, o.b bVar) {
            o.c a10 = bVar.a();
            this.f2733a = u.g(this.f2733a, a10);
            this.f2734b.d(tVar, bVar);
            this.f2733a = a10;
        }
    }

    public u(t tVar) {
        this.f2727c = new WeakReference<>(tVar);
        this.f2726b = o.c.INITIALIZED;
        this.f2732h = true;
    }

    public static o.c g(o.c cVar, o.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    public void a(s sVar) {
        t tVar;
        e("addObserver");
        o.c cVar = this.f2726b;
        o.c cVar2 = o.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = o.c.INITIALIZED;
        }
        a aVar = new a(sVar, cVar2);
        if (this.f2725a.i(sVar, aVar) == null && (tVar = (t) this.f2727c.get()) != null) {
            boolean z10 = this.f2728d != 0 || this.f2729e;
            o.c d10 = d(sVar);
            this.f2728d++;
            while (aVar.f2733a.compareTo(d10) < 0 && this.f2725a.f21450e.containsKey(sVar)) {
                this.f2731g.add(aVar.f2733a);
                o.b b10 = o.b.b(aVar.f2733a);
                if (b10 != null) {
                    aVar.a(tVar, b10);
                    i();
                    d10 = d(sVar);
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a("no event up from ");
                    a10.append(aVar.f2733a);
                    throw new IllegalStateException(a10.toString());
                }
            }
            if (!z10) {
                k();
            }
            this.f2728d--;
        }
    }

    public o.c b() {
        return this.f2726b;
    }

    public void c(s sVar) {
        e("removeObserver");
        this.f2725a.j(sVar);
    }

    public final o.c d(s sVar) {
        m.a<s, a> aVar = this.f2725a;
        o.c cVar = null;
        b.c<K, V> cVar2 = aVar.f21450e.containsKey(sVar) ? aVar.f21450e.get(sVar).f21458d : null;
        o.c cVar3 = cVar2 != null ? ((a) cVar2.f21456b).f2733a : null;
        if (!this.f2731g.isEmpty()) {
            ArrayList<o.c> arrayList = this.f2731g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return g(g(this.f2726b, cVar3), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.f2732h && !l.a.f().b()) {
            throw new IllegalStateException(q.b.a("Method ", str, " must be called on the main thread"));
        }
    }

    public void f(o.b bVar) {
        e("handleLifecycleEvent");
        h(bVar.a());
    }

    public final void h(o.c cVar) {
        o.c cVar2 = o.c.DESTROYED;
        o.c cVar3 = this.f2726b;
        if (cVar3 != cVar) {
            if (cVar3 == o.c.INITIALIZED && cVar == cVar2) {
                StringBuilder a10 = android.support.v4.media.a.a("no event down from ");
                a10.append(this.f2726b);
                throw new IllegalStateException(a10.toString());
            }
            this.f2726b = cVar;
            if (this.f2729e || this.f2728d != 0) {
                this.f2730f = true;
                return;
            }
            this.f2729e = true;
            k();
            this.f2729e = false;
            if (this.f2726b == cVar2) {
                this.f2725a = new m.a<>();
            }
        }
    }

    public final void i() {
        ArrayList<o.c> arrayList = this.f2731g;
        arrayList.remove(arrayList.size() - 1);
    }

    public void j(o.c cVar) {
        e("setCurrentState");
        h(cVar);
    }

    public final void k() {
        o.b bVar;
        o.c cVar;
        t tVar = (t) this.f2727c.get();
        if (tVar != null) {
            while (true) {
                m.a<s, a> aVar = this.f2725a;
                boolean z10 = true;
                if (!(aVar.f21454d == 0 || (((a) aVar.f21451a.f21456b).f2733a == (cVar = ((a) aVar.f21452b.f21456b).f2733a) && this.f2726b == cVar))) {
                    z10 = false;
                }
                if (!z10) {
                    this.f2730f = false;
                    if (this.f2726b.compareTo(((a) aVar.f21451a.f21456b).f2733a) < 0) {
                        m.a<s, a> aVar2 = this.f2725a;
                        b.C0188b bVar2 = new b.C0188b(aVar2.f21452b, aVar2.f21451a);
                        aVar2.f21453c.put(bVar2, Boolean.FALSE);
                        while (bVar2.hasNext() && !this.f2730f) {
                            Map.Entry entry = (Map.Entry) bVar2.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.f2733a.compareTo(this.f2726b) > 0 && !this.f2730f && this.f2725a.contains((s) entry.getKey())) {
                                int ordinal = aVar3.f2733a.ordinal();
                                if (ordinal == 2) {
                                    bVar = o.b.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    bVar = o.b.ON_STOP;
                                } else if (ordinal != 4) {
                                    bVar = null;
                                } else {
                                    bVar = o.b.ON_PAUSE;
                                }
                                if (bVar != null) {
                                    this.f2731g.add(bVar.a());
                                    aVar3.a(tVar, bVar);
                                    i();
                                } else {
                                    StringBuilder a10 = android.support.v4.media.a.a("no event down from ");
                                    a10.append(aVar3.f2733a);
                                    throw new IllegalStateException(a10.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar2 = this.f2725a.f21452b;
                    if (!this.f2730f && cVar2 != null && this.f2726b.compareTo(((a) cVar2.f21456b).f2733a) > 0) {
                        b<K, V>.d f10 = this.f2725a.f();
                        while (f10.hasNext() && !this.f2730f) {
                            Map.Entry entry2 = (Map.Entry) f10.next();
                            a aVar4 = (a) entry2.getValue();
                            while (aVar4.f2733a.compareTo(this.f2726b) < 0 && !this.f2730f && this.f2725a.contains((s) entry2.getKey())) {
                                this.f2731g.add(aVar4.f2733a);
                                o.b b10 = o.b.b(aVar4.f2733a);
                                if (b10 != null) {
                                    aVar4.a(tVar, b10);
                                    i();
                                } else {
                                    StringBuilder a11 = android.support.v4.media.a.a("no event up from ");
                                    a11.append(aVar4.f2733a);
                                    throw new IllegalStateException(a11.toString());
                                }
                            }
                        }
                    }
                } else {
                    this.f2730f = false;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
