package e8;

import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.ug;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class x40<E> extends ug<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final ug<Object> f17440e = new x40(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f17441c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f17442d;

    public x40(Object[] objArr, int i10) {
        this.f17441c = objArr;
        this.f17442d = i10;
    }

    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f17441c, 0, objArr, i10, this.f17442d);
        return i10 + this.f17442d;
    }

    public final E get(int i10) {
        pg.f(i10, this.f17442d);
        return this.f17441c[i10];
    }

    public final Object[] h() {
        return this.f17441c;
    }

    public final int i() {
        return 0;
    }

    public final int j() {
        return this.f17442d;
    }

    public final boolean q() {
        return false;
    }

    public final int size() {
        return this.f17442d;
    }
}
