package e8;

import y3.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sh implements ta0<ul<li>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16487a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<uh> f16488b;

    public sh(b bVar, ab0 ab0, int i10) {
        this.f16487a = i10;
        if (i10 != 1) {
            this.f16488b = ab0;
        } else {
            this.f16488b = ab0;
        }
    }

    public static sh a(b bVar, ab0<uh> ab0) {
        return new sh(bVar, ab0, 0);
    }

    public static sh b(b bVar, ab0<uh> ab0) {
        return new sh(bVar, ab0, 1);
    }

    public final Object get() {
        switch (this.f16487a) {
            case 0:
                return new ul(this.f16488b.get(), h9.f14886f);
            default:
                return new ul(this.f16488b.get(), h9.f14886f);
        }
    }
}
