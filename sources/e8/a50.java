package e8;

import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.ug;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class a50 extends ug<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f13654c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f13655d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f13656e;

    public a50(Object[] objArr, int i10, int i11) {
        this.f13654c = objArr;
        this.f13655d = i10;
        this.f13656e = i11;
    }

    public final Object get(int i10) {
        pg.f(i10, this.f13656e);
        return this.f13654c[(i10 * 2) + this.f13655d];
    }

    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f13656e;
    }
}
