package e8;

import a7.b;
import a7.e;
import a7.k;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.ky;
import com.google.android.gms.internal.ads.z1;
import e.e;
import java.util.ArrayList;
import p.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w00 {

    /* renamed from: a  reason: collision with root package name */
    public final ui0 f17187a;

    /* renamed from: b  reason: collision with root package name */
    public final h f17188b;

    /* renamed from: c  reason: collision with root package name */
    public final z1 f17189c;

    /* renamed from: d  reason: collision with root package name */
    public final fi0 f17190d;

    /* renamed from: e  reason: collision with root package name */
    public final li0 f17191e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17192f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<String> f17193g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<String> f17194h;

    /* renamed from: i  reason: collision with root package name */
    public final n1 f17195i;

    /* renamed from: j  reason: collision with root package name */
    public final pi0 f17196j;

    /* renamed from: k  reason: collision with root package name */
    public final int f17197k;

    /* renamed from: l  reason: collision with root package name */
    public final b f17198l;

    /* renamed from: m  reason: collision with root package name */
    public final k f17199m;

    /* renamed from: n  reason: collision with root package name */
    public final ky f17200n;

    /* renamed from: o  reason: collision with root package name */
    public final uf f17201o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f17202p;

    public w00(y00 y00, e eVar) {
        n1 n1Var;
        y00 y002 = y00;
        this.f17191e = y002.f17546b;
        this.f17192f = y002.f17548d;
        this.f17187a = y002.f17547c;
        fi0 fi0 = y002.f17545a;
        this.f17190d = new fi0(fi0.f14631a, fi0.f14632b, fi0.f14633c, fi0.f14634d, fi0.f14635e, fi0.f14636f, fi0.f14637g, fi0.f14638h || y002.f17550f, fi0.f14639i, fi0.f14640r, fi0.f14641s, fi0.f14642t, fi0.f14643u, fi0.f14644v, fi0.f14645w, fi0.f14646x, fi0.f14647y, fi0.f14648z, fi0.A, fi0.B, fi0.C, fi0.D, p.y(fi0.E));
        y00 y003 = y00;
        h hVar = y003.f17549e;
        if (hVar == null) {
            n1 n1Var2 = y003.f17553i;
            hVar = n1Var2 != null ? n1Var2.f15576f : null;
        }
        this.f17188b = hVar;
        ArrayList<String> arrayList = y003.f17551g;
        this.f17193g = arrayList;
        this.f17194h = y003.f17552h;
        if (arrayList == null) {
            n1Var = null;
        } else {
            n1Var = y003.f17553i;
            if (n1Var == null) {
                n1Var = new n1(new a7.e(new e.a(), (a) null));
            }
        }
        this.f17195i = n1Var;
        this.f17196j = y003.f17554j;
        this.f17197k = y003.f17558n;
        this.f17198l = y003.f17555k;
        this.f17199m = y003.f17556l;
        this.f17200n = y003.f17557m;
        this.f17189c = y003.f17559o;
        this.f17201o = new uf(y003.f17560p, (e.b) null);
        this.f17202p = y003.f17561q;
    }

    public final g1 a() {
        k kVar = this.f17199m;
        if (kVar == null && this.f17198l == null) {
            return null;
        }
        if (kVar != null) {
            return b2.s6(kVar.f147c);
        }
        return b2.s6(this.f17198l.f127b);
    }
}
