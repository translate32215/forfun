package md;

import java.io.Serializable;
import md.f;
import td.p;
import ud.k;
import ud.l;

/* compiled from: CoroutineContextImpl.kt */
public final class c implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f21792a;

    /* renamed from: b  reason: collision with root package name */
    public final f.b f21793b;

    /* compiled from: CoroutineContextImpl.kt */
    public static final class a extends l implements p<String, f.b, String> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f21794b = new a();

        public a() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            String str = (String) obj;
            f.b bVar = (f.b) obj2;
            k.f(str, "acc");
            k.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f fVar, f.b bVar) {
        k.f(fVar, "left");
        k.f(bVar, "element");
        this.f21792a = fVar;
        this.f21793b = bVar;
    }

    public final int b() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f21792a;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b() != b()) {
                return false;
            }
            cVar.getClass();
            c cVar2 = this;
            while (true) {
                f.b bVar = cVar2.f21793b;
                if (k.a(cVar.get(bVar.getKey()), bVar)) {
                    f fVar = cVar2.f21792a;
                    if (!(fVar instanceof c)) {
                        k.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.b bVar2 = (f.b) fVar;
                        z10 = k.a(cVar.get(bVar2.getKey()), bVar2);
                        break;
                    }
                    cVar2 = (c) fVar;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        k.f(pVar, "operation");
        return pVar.h(this.f21792a.fold(r10, pVar), this.f21793b);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        k.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = cVar2.f21793b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f21792a;
            if (!(fVar instanceof c)) {
                return fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public int hashCode() {
        return this.f21793b.hashCode() + this.f21792a.hashCode();
    }

    public f minusKey(f.c<?> cVar) {
        k.f(cVar, "key");
        if (this.f21793b.get(cVar) != null) {
            return this.f21792a;
        }
        f minusKey = this.f21792a.minusKey(cVar);
        if (minusKey == this.f21792a) {
            return this;
        }
        if (minusKey == g.f21797a) {
            return this.f21793b;
        }
        return new c(minusKey, this.f21793b);
    }

    public f plus(f fVar) {
        k.f(fVar, "context");
        if (fVar == g.f21797a) {
            return this;
        }
        return (f) fVar.fold(this, f.a.C0195a.f21796b);
    }

    public String toString() {
        StringBuilder a10 = q.c.a('[');
        a10.append((String) fold("", a.f21794b));
        a10.append(']');
        return a10.toString();
    }
}
