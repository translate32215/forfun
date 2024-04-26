package ie;

import de.l1;
import kotlinx.coroutines.ThreadContextElement;
import md.f;
import td.p;
import ud.k;
import ud.l;

/* compiled from: ThreadContext.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final b2.t f19398a = new b2.t("NO_THREAD_ELEMENTS");

    /* compiled from: ThreadContext.kt */
    public static final class a extends l implements p<Object, f.b, Object> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f19399b = new a();

        public a() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof l1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            if (intValue == 0) {
                return bVar;
            }
            return Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class b extends l implements p<l1<?>, f.b, l1<?>> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f19400b = new b();

        public b() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            l1 l1Var = (l1) obj;
            f.b bVar = (f.b) obj2;
            if (l1Var != null) {
                return l1Var;
            }
            if (bVar instanceof l1) {
                return (l1) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class c extends l implements p<w, f.b, w> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f19401b = new c();

        public c() {
            super(2);
        }

        public Object h(Object obj, Object obj2) {
            w wVar = (w) obj;
            ThreadContextElement<Object> threadContextElement = (f.b) obj2;
            if (threadContextElement instanceof l1) {
                ThreadContextElement<Object> threadContextElement2 = (l1) threadContextElement;
                Object M = threadContextElement2.M(wVar.f19403a);
                Object[] objArr = wVar.f19404b;
                int i10 = wVar.f19406d;
                objArr[i10] = M;
                ThreadContextElement<Object>[] threadContextElementArr = wVar.f19405c;
                wVar.f19406d = i10 + 1;
                threadContextElementArr[i10] = threadContextElement2;
            }
            return wVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f19398a) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                int length = wVar.f19405c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        l1 l1Var = wVar.f19405c[length];
                        k.c(l1Var);
                        l1Var.v(fVar, wVar.f19404b[length]);
                        if (i10 >= 0) {
                            length = i10;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, b.f19400b);
                if (fold != null) {
                    ((l1) fold).v(fVar, obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }

    public static final Object b(f fVar) {
        Object fold = fVar.fold(0, a.f19399b);
        k.c(fold);
        return fold;
    }

    public static final Object c(f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f19398a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new w(fVar, ((Number) obj).intValue()), c.f19401b);
        }
        return ((l1) obj).M(fVar);
    }
}
