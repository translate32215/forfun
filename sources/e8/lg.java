package e8;

import android.content.Context;
import androidx.databinding.a;
import com.google.android.gms.internal.ads.n6;
import com.google.android.gms.internal.ads.qe;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lg implements ta0<ul<pj>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15386a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15387b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<Context> f15388c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<f9> f15389d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<qe> f15390e;

    /* renamed from: f  reason: collision with root package name */
    public final ab0<w00> f15391f;

    public lg(a aVar, ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04) {
        this.f15387b = aVar;
        this.f15388c = ab0;
        this.f15389d = ab02;
        this.f15390e = ab03;
        this.f15391f = ab04;
    }

    public static lg a(a aVar, ab0<Context> ab0, ab0<f9> ab02, ab0<qe> ab03, ab0<i8> ab04) {
        return new lg(aVar, (ab0) ab0, (ab0) ab02, (ab0) ab03, (ab0) ab04);
    }

    public static lg b(gf0 gf0, ab0<Context> ab0, ab0<f9> ab02, ab0<qe> ab03, ab0<w00> ab04) {
        return new lg(gf0, (ab0) ab0, (ab0) ab02, (ab0) ab03, (ab0) ab04);
    }

    public static ul c(Context context, f9 f9Var, qe qeVar, w00 w00) {
        return new ul(new hg(context, f9Var, qeVar, w00, 0), h9.f14886f);
    }

    public final Object get() {
        switch (this.f15386a) {
            case 0:
                g gVar = (g) this.f15387b;
                return c(this.f15388c.get(), this.f15389d.get(), this.f15390e.get(), this.f15391f.get());
            case 1:
                Context context = this.f15388c.get();
                f9 f9Var = this.f15389d.get();
                qe qeVar = this.f15390e.get();
                i8 i8Var = (i8) this.f15391f.get();
                if (qeVar.f7973z != null) {
                    return new n6(context, f9Var, qeVar.f7973z, qeVar.f7965r.f8194b, i8Var);
                }
                return null;
            default:
                return new ul(new hg(this.f15388c.get(), this.f15389d.get(), this.f15390e.get(), this.f15391f.get(), 1), h9.f14886f);
        }
    }

    public lg(gf0 gf0, ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04) {
        this.f15387b = gf0;
        this.f15388c = ab0;
        this.f15389d = ab02;
        this.f15390e = ab03;
        this.f15391f = ab04;
    }

    public lg(g gVar, ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04) {
        this.f15387b = gVar;
        this.f15388c = ab0;
        this.f15389d = ab02;
        this.f15390e = ab03;
        this.f15391f = ab04;
    }
}
