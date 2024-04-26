package m2;

import g2.e;
import java.util.ArrayList;
import java.util.List;
import n2.d;
import o2.j;

/* compiled from: ConstraintController */
public abstract class c<T> implements l2.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f21489a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f21490b;

    /* renamed from: c  reason: collision with root package name */
    public d<T> f21491c;

    /* renamed from: d  reason: collision with root package name */
    public a f21492d;

    /* compiled from: ConstraintController */
    public interface a {
    }

    public c(d<T> dVar) {
        this.f21491c = dVar;
    }

    public void a(T t10) {
        this.f21490b = t10;
        e();
    }

    public abstract boolean b(j jVar);

    public abstract boolean c(T t10);

    public void d(List<j> list) {
        this.f21489a.clear();
        for (j next : list) {
            if (b(next)) {
                this.f21489a.add(next.f22864a);
            }
        }
        if (this.f21489a.isEmpty()) {
            this.f21491c.b(this);
        } else {
            d<T> dVar = this.f21491c;
            synchronized (dVar.f21837c) {
                if (dVar.f21838d.add(this)) {
                    if (dVar.f21838d.size() == 1) {
                        dVar.f21839e = dVar.a();
                        e.c().a(d.f21834f, String.format("%s: initial state = %s", new Object[]{dVar.getClass().getSimpleName(), dVar.f21839e}), new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f21839e);
                }
            }
        }
        e();
    }

    public final void e() {
        if (!this.f21489a.isEmpty() && this.f21492d != null) {
            T t10 = this.f21490b;
            if (t10 == null || c(t10)) {
                a aVar = this.f21492d;
                List<String> list = this.f21489a;
                l2.d dVar = (l2.d) aVar;
                synchronized (dVar.f21020c) {
                    l2.c cVar = dVar.f21018a;
                    if (cVar != null) {
                        cVar.c(list);
                    }
                }
                return;
            }
            a aVar2 = this.f21492d;
            List<String> list2 = this.f21489a;
            l2.d dVar2 = (l2.d) aVar2;
            synchronized (dVar2.f21020c) {
                ArrayList arrayList = new ArrayList();
                for (String next : list2) {
                    if (dVar2.a(next)) {
                        e.c().a(l2.d.f21017d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                        arrayList.add(next);
                    }
                }
                l2.c cVar2 = dVar2.f21018a;
                if (cVar2 != null) {
                    cVar2.e(arrayList);
                }
            }
        }
    }
}
