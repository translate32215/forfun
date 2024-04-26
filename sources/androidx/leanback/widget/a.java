package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: ArrayObjectAdapter */
public class a extends h0 {

    /* renamed from: c  reason: collision with root package name */
    public final List f2283c = new ArrayList();

    public a(r0 r0Var) {
        super(r0Var);
        new ArrayList();
    }

    public Object a(int i10) {
        return this.f2283c.get(i10);
    }

    public int e() {
        return this.f2283c.size();
    }

    public void f(Object obj) {
        int size = this.f2283c.size();
        this.f2283c.add(size, obj);
        this.f2400a.c(size, 1);
    }

    public void g(int i10, Collection collection) {
        int size = collection.size();
        if (size != 0) {
            this.f2283c.addAll(i10, collection);
            this.f2400a.c(i10, size);
        }
    }

    public void h() {
        int size = this.f2283c.size();
        if (size != 0) {
            this.f2283c.clear();
            this.f2400a.d(0, size);
        }
    }
}
