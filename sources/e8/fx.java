package e8;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fx implements dy<hw> {

    /* renamed from: a  reason: collision with root package name */
    public final o50 f14690a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f14691b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f14692c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f14693d;

    public fx(o50 o50, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f14690a = o50;
        this.f14693d = set;
        this.f14691b = viewGroup;
        this.f14692c = context;
    }

    public final p50<hw> b() {
        return this.f14690a.i(new wy(this));
    }
}
