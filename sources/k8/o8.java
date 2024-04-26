package k8;

import e8.ba0;
import e8.z90;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class o8 extends AbstractList<String> implements RandomAccess, x6 {

    /* renamed from: a  reason: collision with root package name */
    public final x6 f20393a;

    public o8(x6 x6Var) {
        this.f20393a = x6Var;
    }

    public final List<?> a() {
        return this.f20393a.a();
    }

    public final x6 b() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((w6) this.f20393a).get(i10);
    }

    public final Iterator<String> iterator() {
        return new ba0(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new z90(this, i10);
    }

    public final int size() {
        return this.f20393a.size();
    }

    public final Object u(int i10) {
        return this.f20393a.u(i10);
    }

    public final void v(p5 p5Var) {
        throw new UnsupportedOperationException();
    }
}
