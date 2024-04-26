package e8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class v90 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public int f17036a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17037b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator<Map.Entry<K, V>> f17038c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p90 f17039d;

    public v90(p90 p90, o90 o90) {
        this.f17039d = p90;
    }

    public final Iterator<Map.Entry<K, V>> a() {
        if (this.f17038c == null) {
            this.f17038c = this.f17039d.f15885c.entrySet().iterator();
        }
        return this.f17038c;
    }

    public final boolean hasNext() {
        if (this.f17036a + 1 < this.f17039d.f15884b.size() || (!this.f17039d.f15885c.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f17037b = true;
        int i10 = this.f17036a + 1;
        this.f17036a = i10;
        if (i10 < this.f17039d.f15884b.size()) {
            return this.f17039d.f15884b.get(this.f17036a);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f17037b) {
            this.f17037b = false;
            p90 p90 = this.f17039d;
            int i10 = p90.f15882g;
            p90.f();
            if (this.f17036a < this.f17039d.f15884b.size()) {
                p90 p902 = this.f17039d;
                int i11 = this.f17036a;
                this.f17036a = i11 - 1;
                p902.i(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
