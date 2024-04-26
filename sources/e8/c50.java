package e8;

import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class c50<E> extends vg<E> {

    /* renamed from: d  reason: collision with root package name */
    public final transient E f14084d;

    /* renamed from: e  reason: collision with root package name */
    public transient int f14085e;

    public c50(E e10) {
        e10.getClass();
        this.f14084d = e10;
    }

    public final int c(Object[] objArr, int i10) {
        objArr[i10] = this.f14084d;
        return i10 + 1;
    }

    public final boolean contains(Object obj) {
        return this.f14084d.equals(obj);
    }

    /* renamed from: f */
    public final d50<E> iterator() {
        return new s40(this.f14084d);
    }

    public final int hashCode() {
        int i10 = this.f14085e;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.f14084d.hashCode();
        this.f14085e = hashCode;
        return hashCode;
    }

    public final boolean q() {
        return false;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f14084d.toString();
        StringBuilder sb2 = new StringBuilder(o.a(obj, 2));
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean y() {
        return this.f14085e != 0;
    }

    public final ug<E> z() {
        return ug.s(this.f14084d);
    }

    public c50(E e10, int i10) {
        this.f14084d = e10;
        this.f14085e = i10;
    }
}
