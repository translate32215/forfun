package k8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class g8 implements Iterator<Map.Entry> {

    /* renamed from: a  reason: collision with root package name */
    public int f20222a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20223b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator<Map.Entry> f20224c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i8 f20225d;

    public /* synthetic */ g8(i8 i8Var) {
        this.f20225d = i8Var;
    }

    public final Iterator<Map.Entry> a() {
        if (this.f20224c == null) {
            this.f20224c = this.f20225d.f20263c.entrySet().iterator();
        }
        return this.f20224c;
    }

    public final boolean hasNext() {
        if (this.f20222a + 1 < this.f20225d.f20262b.size()) {
            return true;
        }
        if (this.f20225d.f20263c.isEmpty() || !a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f20223b = true;
        int i10 = this.f20222a + 1;
        this.f20222a = i10;
        if (i10 < this.f20225d.f20262b.size()) {
            return this.f20225d.f20262b.get(this.f20222a);
        }
        return a().next();
    }

    public final void remove() {
        if (this.f20223b) {
            this.f20223b = false;
            i8 i8Var = this.f20225d;
            int i10 = i8.f20260g;
            i8Var.h();
            if (this.f20222a < this.f20225d.f20262b.size()) {
                i8 i8Var2 = this.f20225d;
                int i11 = this.f20222a;
                this.f20222a = i11 - 1;
                i8Var2.f(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
