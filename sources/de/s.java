package de;

import md.d;
import md.f;
import md.g;
import td.p;
import ud.l;
import ud.u;

/* compiled from: CoroutineContext.kt */
public final class s {

    /* compiled from: CoroutineContext.kt */
    public static final class a extends l implements p<f, f.b, f> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f13325b = new a();

        public a() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof r) {
                return fVar.plus(((r) bVar).s());
            }
            return fVar.plus(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public static final class b extends l implements p<f, f.b, f> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u<f> f13326b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f13327c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u<f> uVar, boolean z10) {
            super(2);
            this.f13326b = uVar;
            this.f13327c = z10;
        }

        public Object h(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof r)) {
                return fVar.plus(bVar);
            }
            f.b bVar2 = ((f) this.f13326b.f26197a).get(bVar.getKey());
            if (bVar2 == null) {
                r rVar = (r) bVar;
                if (this.f13327c) {
                    rVar = rVar.s();
                }
                return fVar.plus(rVar);
            }
            u<f> uVar = this.f13326b;
            uVar.f26197a = ((f) uVar.f26197a).minusKey(bVar.getKey());
            return fVar.plus(((r) bVar).u(bVar2));
        }
    }

    /* compiled from: CoroutineContext.kt */
    public static final class c extends l implements p<Boolean, f.b, Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f13328b = new c();

        public c() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            return Boolean.valueOf(((Boolean) obj).booleanValue() || (((f.b) obj2) instanceof r));
        }
    }

    public static final f a(f fVar, f fVar2, boolean z10) {
        boolean b10 = b(fVar);
        boolean b11 = b(fVar2);
        if (!b10 && !b11) {
            return fVar.plus(fVar2);
        }
        u uVar = new u();
        uVar.f26197a = fVar2;
        g gVar = g.f21797a;
        f fVar3 = (f) fVar.fold(gVar, new b(uVar, z10));
        if (b11) {
            uVar.f26197a = ((f) uVar.f26197a).fold(gVar, a.f13325b);
        }
        return fVar3.plus((f) uVar.f26197a);
    }

    public static final boolean b(f fVar) {
        return ((Boolean) fVar.fold(Boolean.FALSE, c.f13328b)).booleanValue();
    }

    public static final o1<?> c(d<?> dVar, f fVar, Object obj) {
        o1<?> o1Var = null;
        if (!(dVar instanceof od.d)) {
            return null;
        }
        if (!(fVar.get(p1.f13321a) != null)) {
            return null;
        }
        od.d dVar2 = (od.d) dVar;
        while (true) {
            if (!(dVar2 instanceof e0) && (dVar2 = dVar2.f()) != null) {
                if (dVar2 instanceof o1) {
                    o1Var = (o1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (o1Var != null) {
            o1Var.f13320d.set(new kd.g(fVar, obj));
        }
        return o1Var;
    }
}
