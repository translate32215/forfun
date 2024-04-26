package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.i9;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.zb;
import java.util.Set;
import s9.e;
import y3.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dd implements ta0<ub<ue, zb>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14253a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14254b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<gb> f14255c;

    public dd(l2 l2Var, ab0 ab0) {
        this.f14254b = l2Var;
        this.f14255c = ab0;
    }

    public static Context a(h10 h10) {
        Context context = h10.f14841a;
        jc0.b(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public final Object get() {
        switch (this.f14253a) {
            case 0:
                return new ec(this.f14255c.get());
            case 1:
                return new ul((uh) this.f14255c.get(), h9.f14886f);
            case 2:
                return new ul((ci) this.f14255c.get(), h9.f14886f);
            case 3:
                b9 b9Var = (b9) this.f14254b;
                Context context = (Context) this.f14255c.get();
                if (b9Var.f6000d == null) {
                    context = b9Var.f5997a;
                }
                jc0.b(context, "Cannot return null from a non-@Nullable @Provides method");
                return context;
            case 4:
                i9 i9Var = (i9) this.f14254b;
                Set set = (Set) this.f14255c.get();
                if (i9Var.f7040n == null) {
                    i9Var.f7040n = new ni(set);
                }
                ni niVar = i9Var.f7040n;
                jc0.b(niVar, "Cannot return null from a non-@Nullable @Provides method");
                return niVar;
            case 5:
                return new ul((xe) this.f14255c.get(), h9.f14886f);
            default:
                l2 l2Var = (l2) this.f14254b;
                return a((h10) this.f14255c.get());
        }
    }

    public dd(c8 c8Var, ab0 ab0) {
        this.f14254b = c8Var;
        this.f14255c = ab0;
    }

    public dd(b9 b9Var, ab0 ab0) {
        this.f14254b = b9Var;
        this.f14255c = ab0;
    }

    public dd(i9 i9Var, ab0 ab0) {
        this.f14254b = i9Var;
        this.f14255c = ab0;
    }

    public dd(b5 b5Var, ab0 ab0) {
        this.f14254b = b5Var;
        this.f14255c = ab0;
    }

    public dd(e eVar, ab0 ab0) {
        this.f14254b = eVar;
        this.f14255c = ab0;
    }

    public dd(b bVar, ab0 ab0) {
        this.f14254b = bVar;
        this.f14255c = ab0;
    }
}
