package e8;

import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.ug;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class q40 extends ug<E> {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f16082c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f16083d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ug f16084e;

    public q40(ug ugVar, int i10, int i11) {
        this.f16084e = ugVar;
        this.f16082c = i10;
        this.f16083d = i11;
    }

    /* renamed from: B */
    public final ug<E> subList(int i10, int i11) {
        pg.e(i10, i11, this.f16083d);
        ug ugVar = this.f16084e;
        int i12 = this.f16082c;
        return (ug) ugVar.subList(i10 + i12, i11 + i12);
    }

    public final E get(int i10) {
        pg.f(i10, this.f16083d);
        return this.f16084e.get(i10 + this.f16082c);
    }

    public final Object[] h() {
        return this.f16084e.h();
    }

    public final int i() {
        return this.f16084e.i() + this.f16082c;
    }

    public final int j() {
        return this.f16084e.i() + this.f16082c + this.f16083d;
    }

    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f16083d;
    }
}
