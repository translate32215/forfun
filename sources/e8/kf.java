package e8;

import android.view.View;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.md;
import com.google.android.gms.internal.ads.se;
import java.util.HashSet;
import java.util.Locale;
import x3.d;
import z7.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kf implements ta0<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15277a = 4;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15278b;

    public kf(g2 g2Var) {
        this.f15278b = g2Var;
    }

    public static String a(se seVar) {
        String str = ((l5) seVar.f8122b).f7317d;
        jc0.b(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }

    public final Object get() {
        switch (this.f15277a) {
            case 0:
                View view = ((Cif) this.f15278b).f15032a;
                jc0.b(view, "Cannot return null from a non-@Nullable @Provides method");
                return view;
            case 1:
                Runnable runnable = (Runnable) ((p9) this.f15278b).f15881c;
                jc0.b(runnable, "Cannot return null from a non-@Nullable @Provides method");
                return runnable;
            case 2:
                d9 d9Var = ((xg) this.f15278b).f17489a;
                jc0.b(d9Var, "Cannot return null from a non-@Nullable @Provides method");
                return d9Var;
            case 3:
                cp cpVar = (cp) ((p9) this.f15278b).f15881c;
                jc0.b(cpVar, "Cannot return null from a non-@Nullable @Provides method");
                return cpVar;
            case 4:
                jn jnVar = (jn) ((g2) this.f15278b).f6511b;
                jc0.b(jnVar, "Cannot return null from a non-@Nullable @Provides method");
                return jnVar;
            case 5:
                return ((fv) this.f15278b).f14684a;
            case 6:
                md mdVar = (md) this.f15278b;
                mdVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(mdVar.f7477a.toLowerCase(Locale.ROOT));
                return hashSet;
            case 7:
                return a((se) this.f15278b);
            default:
                return e.f28726a;
        }
    }

    public kf(md mdVar) {
        this.f15278b = mdVar;
    }

    public kf(se seVar) {
        this.f15278b = seVar;
    }

    public kf(p9 p9Var) {
        this.f15278b = p9Var;
    }

    public kf(p9 p9Var, q.e eVar) {
        this.f15278b = p9Var;
    }

    public kf(Cif ifVar) {
        this.f15278b = ifVar;
    }

    public kf(xg xgVar) {
        this.f15278b = xgVar;
    }

    public kf(fv fvVar) {
        this.f15278b = fvVar;
    }

    public kf(d dVar) {
        this.f15278b = dVar;
    }
}
