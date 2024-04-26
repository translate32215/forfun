package e8;

import com.google.android.gms.internal.ads.mp;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class aa0 extends AbstractList<String> implements k80, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final k80 f13670a;

    public aa0(k80 k80) {
        this.f13670a = k80;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.f13670a.get(i10);
    }

    public final Iterator<String> iterator() {
        return new ba0(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new z90(this, i10);
    }

    public final k80 m() {
        return this;
    }

    public final void n(mp mpVar) {
        throw new UnsupportedOperationException();
    }

    public final Object p(int i10) {
        return this.f13670a.p(i10);
    }

    public final int size() {
        return this.f13670a.size();
    }

    public final List<?> w() {
        return this.f13670a.w();
    }
}
