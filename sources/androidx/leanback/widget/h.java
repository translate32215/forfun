package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ClassPresenterSelector */
public final class h extends s0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<r0> f2398a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Class<?>, Object> f2399b = new HashMap<>();

    public r0 a(Object obj) {
        Object obj2;
        r0 a10;
        Class cls = obj.getClass();
        do {
            obj2 = this.f2399b.get(cls);
            if (!(obj2 instanceof s0) || (a10 = ((s0) obj2).a(obj)) == null) {
                cls = cls.getSuperclass();
                if (obj2 != null) {
                    break;
                }
            } else {
                return a10;
            }
        } while (cls != null);
        return (r0) obj2;
    }

    public r0[] b() {
        ArrayList<r0> arrayList = this.f2398a;
        return (r0[]) arrayList.toArray(new r0[arrayList.size()]);
    }

    public h c(Class<?> cls, r0 r0Var) {
        this.f2399b.put(cls, r0Var);
        if (!this.f2398a.contains(r0Var)) {
            this.f2398a.add(r0Var);
        }
        return this;
    }
}
