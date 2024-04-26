package t1;

import y1.e;

/* compiled from: EntityInsertionAdapter */
public abstract class b<T> extends h {
    public b(e eVar) {
        super(eVar);
    }

    public abstract void d(e eVar, T t10);

    public final void e(T t10) {
        e a10 = a();
        try {
            d(a10, t10);
            a10.f27990b.executeInsert();
            if (a10 == this.f25409c) {
                this.f25407a.set(false);
            }
        } catch (Throwable th) {
            c(a10);
            throw th;
        }
    }
}
