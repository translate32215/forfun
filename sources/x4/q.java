package x4;

import android.view.Surface;
import java.util.List;
import r6.l;
import v6.o;
import x4.r0;
import y4.x;

public final /* synthetic */ class q implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27706a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27707b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f27708c;

    public /* synthetic */ q(n0 n0Var, l lVar) {
        this.f27707b = n0Var;
        this.f27708c = lVar;
    }

    public /* synthetic */ q(x.a aVar, Surface surface) {
        this.f27707b = aVar;
        this.f27708c = surface;
    }

    public /* synthetic */ q(x.a aVar, List list) {
        this.f27707b = aVar;
        this.f27708c = list;
    }

    public /* synthetic */ q(x.a aVar, m mVar) {
        this.f27707b = aVar;
        this.f27708c = mVar;
    }

    public /* synthetic */ q(x.a aVar, o0 o0Var) {
        this.f27707b = aVar;
        this.f27708c = o0Var;
    }

    public final void c(Object obj) {
        switch (this.f27706a) {
            case 0:
                ((r0.a) obj).Q(((n0) this.f27707b).f27685g, (l) this.f27708c);
                return;
            case 1:
                ((x) obj).x((x.a) this.f27707b, (List) this.f27708c);
                return;
            case 2:
                ((x) obj).j((x.a) this.f27707b, (Surface) this.f27708c);
                return;
            case 3:
                ((x) obj).t((x.a) this.f27707b, (o0) this.f27708c);
                return;
            default:
                ((x) obj).H((x.a) this.f27707b, (m) this.f27708c);
                return;
        }
    }
}
