package e8;

import e7.k;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yh implements ta0<ul<k>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17629a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<lh> f17630b;

    public yh(b5 b5Var, ab0 ab0, int i10) {
        this.f17629a = i10;
        if (i10 != 1) {
            this.f17630b = ab0;
        } else {
            this.f17630b = ab0;
        }
    }

    public static yh a(b5 b5Var, ab0<lh> ab0) {
        return new yh(b5Var, ab0, 0);
    }

    public static yh b(b5 b5Var, ab0<ci> ab0) {
        return new yh(b5Var, ab0, 1);
    }

    public final Object get() {
        switch (this.f17629a) {
            case 0:
                return new ul(this.f17630b.get(), h9.f14886f);
            default:
                return new ul((ci) this.f17630b.get(), h9.f14886f);
        }
    }
}
