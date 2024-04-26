package e8;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class iy implements ta0<gy> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15078a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<o50> f15079b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<Context> f15080c;

    public iy(ab0 ab0, ab0 ab02, int i10) {
        this.f15078a = i10;
        if (i10 != 1) {
            this.f15079b = ab0;
            this.f15080c = ab02;
            return;
        }
        this.f15079b = ab0;
        this.f15080c = ab02;
    }

    public static tw a(o50 o50, Context context) {
        return new tw(o50, context, 1);
    }

    public static iy b(ab0<o50> ab0, ab0<Context> ab02) {
        return new iy(ab0, ab02, 1);
    }

    public final /* synthetic */ Object get() {
        switch (this.f15078a) {
            case 0:
                return new gy(this.f15079b.get(), this.f15080c.get());
            default:
                return a(this.f15079b.get(), this.f15080c.get());
        }
    }
}
