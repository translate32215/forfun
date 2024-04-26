package e8;

import android.view.View;
import com.google.android.gms.internal.ads.pe;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ig implements ta0<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15038a;

    /* renamed from: b  reason: collision with root package name */
    public final g f15039b;

    public ig(g gVar, int i10) {
        this.f15038a = i10;
        if (i10 != 1) {
            this.f15039b = gVar;
        } else {
            this.f15039b = gVar;
        }
    }

    public final Object get() {
        switch (this.f15038a) {
            case 0:
                View view = (View) this.f15039b.f21851b;
                jc0.b(view, "Cannot return null from a non-@Nullable @Provides method");
                return view;
            default:
                pe peVar = (pe) this.f15039b.f21852c;
                jc0.b(peVar, "Cannot return null from a non-@Nullable @Provides method");
                return peVar;
        }
    }
}
