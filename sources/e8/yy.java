package e8;

import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.se;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yy implements ta0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17676a;

    /* renamed from: b  reason: collision with root package name */
    public final se f17677b;

    public yy(se seVar, int i10) {
        this.f17676a = i10;
        if (i10 != 1) {
            this.f17677b = seVar;
        } else {
            this.f17677b = seVar;
        }
    }

    public final Object get() {
        switch (this.f17676a) {
            case 0:
                return Integer.valueOf(this.f17677b.f8121a);
            default:
                String str = ((l5) this.f17677b.f8122b).f7321h;
                jc0.b(str, "Cannot return null from a non-@Nullable @Provides method");
                return str;
        }
    }
}
